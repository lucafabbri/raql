<?php

namespace RAQL\PHP\Visitors;

use RAQL\PHP\Grammar\RAQLBaseVisitor;
use RAQL\PHP\Grammar\Context\ClauseContext;
use RAQL\PHP\Grammar\Context\OperationContext;
use RAQL\PHP\Grammar\Context\String_array_operationContext;
use RAQL\PHP\Grammar\Context\String_operationContext;
use RAQL\PHP\Grammar\Context\Bool_array_operationContext;
use RAQL\PHP\Grammar\Context\Bool_operationContext;
use RAQL\PHP\Grammar\Context\Number_array_operationContext;
use RAQL\PHP\Grammar\Context\Number_operationContext;
use RAQL\PHP\Eloquent\RAQLBuilder;

class EloquentVisitor extends RAQLBaseVisitor
{
  /**
   * The Model Builder in Eloquent
   * 
   * @var RAQLBuilder $builder
   */
  protected $builder;

  public function __construct(RAQLBuilder $builder)
  {
    $this->builder = $builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitClause(ClauseContext $context)
  {
    $conjunction = $context->conjunction();
    $clauses = $context->clause();
    $operation = $context->operation();

    if ($conjunction != null && count($clauses) == 2) {
      $isAnd = strtolower(trim($conjunction->getText())) === "and";
      $clause1 = $this->visitClause($clauses[0]);
      $clause2 = $this->visitClause($clauses[count($clauses) - 1]);
      return $isAnd ? $clause1->andWhere($clause2) : $clause1->orWhere($clause2);
    } else if ($conjunction == null && count($clauses) == 1) {
      return $this->visitClause($clauses[0]);
    } else if ($conjunction == null && $operation != null) {
      return $this->visitOperation($operation);
    }

    return $this->builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitOperation(OperationContext $context)
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
      return $this->visitString_operation($stringOperation);
    } else if ($isStringArrayOperation) {
      return $this->visitString_array_operation($stringArrayOperation);
    } else if ($isNumberOperation) {
      return $this->visitNumber_operation($numberOperation);
    } else if ($isNumberArrayOperation) {
      return $this->visitNumber_array_operation($numberArrayOperation);
    } else if ($isBoolOperation) {
      return $this->visitBool_operation($boolOperation);
    } else if ($isBoolArrayOperation) {
      return $this->visitBool_array_operation($boolArrayOperation);
    }
    return $this->builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitString_array_operation(String_array_operationContext $context)
  {
    $field = $context->field()->getText();
    $value = array_map($context->string_array()->string(), fn ($value): string => trim($value->getText(), "'"));

    if ($field != null && $value != null) {
      return $this->builder->whereIn($field, $value);
    }

    return $this->builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitNumber_array_operation(Number_array_operationContext $context)
  {
    $field = $context->field()->getText();
    $numbers = $context->number_array()->number();

    if ($field != null && $numbers != null) {
      return $this->builder->whereIn($field, $numbers);
    }

    return $this->builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitBool_array_operation(Bool_array_operationContext $context)
  {
    $field = $context->field()->getText();
    $value = array_map($context->bool_array()->bool(), fn ($value): bool => strtolower($value->getText()) === "true");

    if ($field != null && $value != null) {
      return $this->builder->whereIn($field, $value);
    }

    return $this->builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitString_operation(String_operationContext $context)
  {
    $field = $context->field()->getText();
    $operator = $this->operatorToStandard(strtolower(trim($context->string_operator()->getText())));
    $value = trim($context->string()->getText(), "'");

    if ($field != null && $value != null) {
      $this->builder->where($field, $operator, $value);
    }
    return $this->builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitNumber_operation(Number_operationContext $context)
  {
    $field = $context->field()->getText();
    $operator = $this->operatorToStandard(strtolower(trim($context->number_operator()->getText())));
    $number = $context->number()->getText();

    if ($field != null && $operator != null && $number != null) {
      return $this->builder->where($field, $operator, $number);
    }

    return $this->builder;
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitBool_operation(Bool_operationContext $context)
  {
    $field = $context->field()->getText();
    $operator = $this->operatorToStandard(strtolower(trim($context->bool_operator()->getText())));
    $value = $context->bool()->getText() === "true";

    if ($field != null && $operator != null) {
      return $this->builder->where($field, $operator, $value);
    }

    return $this->builder;
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
