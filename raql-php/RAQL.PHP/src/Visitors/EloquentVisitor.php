<?php

namespace RAQL\PHP\Visitors;

use RAQL\PHP\Grammar\Context\ClauseContext;
use RAQL\PHP\Grammar\Context\OperationContext;
use RAQL\PHP\Grammar\Context\String_array_operationContext;
use RAQL\PHP\Grammar\Context\String_operationContext;
use RAQL\PHP\Grammar\Context\Bool_array_operationContext;
use RAQL\PHP\Grammar\Context\Bool_operationContext;
use RAQL\PHP\Grammar\Context\Number_array_operationContext;
use RAQL\PHP\Grammar\Context\Number_operationContext;
use RAQL\PHP\Eloquent\RAQLBuilder;

class EloquentVisitor
{
  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitClause(ClauseContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $conjunction = $context->conjunction();
    $clauses = $context->clause();
    $operation = $context->operation();

    if ($conjunction != null && count($clauses) == 2) {
      $isOr = strtolower(trim($conjunction->getText())) === "or";
      if ($or) {
        $builder->orWhere(fn ($q): RAQLBuilder => $this->visitClause($clauses[count($clauses) - 1], $this->visitClause($clauses[0], $q, false), $isOr));
      } else {
        $builder->where(fn ($q): RAQLBuilder => $this->visitClause($clauses[count($clauses) - 1], $this->visitClause($clauses[0], $q, false), $isOr));
      }
    } else if ($conjunction == null && count($clauses) == 1) {
      $this->visitClause($clauses[0], $builder, $or);
    } else if ($conjunction == null && $operation != null) {
      $this->visitOperation($operation, $builder, $or);
    }

    return $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitOperation(OperationContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $stringOperation = $context->string_operation();
    $stringArrayOperation = $context->string_array_operation();
    $numberOperation = $context->number_operation();
    $numberArrayOperation = $context->number_array_operation();
    $boolOperation = $context->bool_operation();
    $boolArrayOperation = $context->bool_array_operation();

    $isStringOperation = $stringOperation != null;
    $isStringArrayOperation = $stringArrayOperation != null;
    $isNumberOperation = $numberOperation != null;
    $isNumberArrayOperation = $numberArrayOperation != null;
    $isBoolOperation = $boolOperation != null;
    $isBoolArrayOperation = $boolArrayOperation != null;

    if ($isStringOperation) {
      $this->visitString_operation($stringOperation, $builder, $or);
    } else if ($isStringArrayOperation) {
      $this->visitString_array_operation($stringArrayOperation, $builder, $or);
    } else if ($isNumberOperation) {
      $this->visitNumber_operation($numberOperation, $builder, $or);
    } else if ($isNumberArrayOperation) {
      $this->visitNumber_array_operation($numberArrayOperation, $builder, $or);
    } else if ($isBoolOperation) {
      $this->visitBool_operation($boolOperation, $builder, $or);
    } else if ($isBoolArrayOperation) {
      $this->visitBool_array_operation($boolArrayOperation, $builder, $or);
    }

    return $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitString_array_operation(String_array_operationContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $field = $context->field()->getText();
    $value = array_map($context->string_array()->string(), fn ($value): string => trim($value->getText(), "'"));

    if ($field != null && $value != null) {
      if ($or) {
        $builder->orWhereIn($field, $value);
      } else {
        $builder->hereIn($field, $value);
      }
    }

    return $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitNumber_array_operation(Number_array_operationContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $field = $context->field()->getText();
    $numbers = $context->number_array()->number();

    if ($field != null && $numbers != null) {
      if ($or) {
        $builder->orWhereIn($field, $numbers);
      } else {
        $builder->whereIn($field, $numbers);
      }
    }

    return $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitBool_array_operation(Bool_array_operationContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $field = $context->field()->getText();
    $value = array_map($context->bool_array()->bool(), fn ($value): bool => strtolower($value->getText()) === "true");

    if ($field != null && $value != null) {
      if ($or) {
        $builder->orWhereIn($field, $value);
      } else {
        $builder->whereIn($field, $value);
      }
    }

    return $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitString_operation(String_operationContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $field = $context->field()->getText();
    $operator = $this->operatorToStandard(strtolower(trim($context->string_operator()->getText())));
    $value = trim($context->string()->getText(), "'");

    if ($field != null && $value != null) {
      if ($or) {
        $builder->orWhere($field, $operator, $value);
      } else {
        $builder->where($field, $operator, $value);
      }
    }

    return $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitNumber_operation(Number_operationContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $field = $context->field()->getText();
    $operator = $this->operatorToStandard(strtolower(trim($context->number_operator()->getText())));
    $number = $context->number()->getText();

    if ($field != null && $operator != null && $number != null) {
      if ($or) {
        $builder->orWhere($field, $operator, $number);
      } else {
        $builder->where($field, $operator, $number);
      }
    }

    return $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitBool_operation(Bool_operationContext $context, RAQLBuilder $builder, bool $or = false): RAQLBuilder
  {
    $field = $context->field()->getText();
    $operator = $this->operatorToStandard(strtolower(trim($context->bool_operator()->getText())));
    $value = $context->bool()->getText() === "true";

    if ($field != null && $operator != null) {
      if ($or) {
        $builder->orWhere($field, $operator, $value);
      } else {
        $builder->where($field, $operator, $value);
      }
    }

    return $builder;
  }

  private function operatorToStandard(string $operator)
  {
    switch ($operator) {
      case 'greater than':
        return '>';
      case 'lower than':
        return '<';
      case 'not equals':
        return '!=';
      case 'equals':
        return '=';
      default:
        return $operator;
    }
  }
}
