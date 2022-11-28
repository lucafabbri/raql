<?php

use RAQL\PHP\RAQLBaseVisitor;

class EloquentVisitor extends RAQLBaseVisitor
{
  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitClause(RAQL\PHP\Context\ClauseContext $context)
  {
    return $this->visitChildren($context);
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitOperation(RAQL\PHP\Context\OperationContext $context)
  {
    return $this->visitChildren($context);
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitString_array_operation(RAQL\PHP\Context\String_array_operationContext $context)
  {
    return $this->visitChildren($context);
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitNumber_array_operation(RAQL\PHP\Context\Number_array_operationContext $context)
  {
    return $this->visitChildren($context);
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitBool_array_operation(RAQL\PHP\Context\Bool_array_operationContext $context)
  {
    return $this->visitChildren($context);
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitString_operation(RAQL\PHP\Context\String_operationContext $context)
  {
    return $this->visitChildren($context);
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitNumber_operation(RAQL\PHP\Context\Number_operationContext $context)
  {
    return $this->visitChildren($context);
  }

  /**
   * {@inheritdoc}
   *
   * The default implementation returns the result of calling
   * {@see self::visitChildren()} on `context`.
   */
  public function visitBool_operation(RAQL\PHP\Context\Bool_operationContext $context)
  {
    return $this->visitChildren($context);
  }
}