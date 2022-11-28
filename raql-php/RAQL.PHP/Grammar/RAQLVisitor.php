<?php

/*
 * Generated from c:\Users\lfabbri\projects\api-query-language\raql-php\RAQL.g4 by ANTLR 4.9.2
 */

namespace RAQL\PHP;

use Antlr\Antlr4\Runtime\Tree\ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@see RAQLParser}.
 */
interface RAQLVisitor extends ParseTreeVisitor
{
	/**
	 * Visit a parse tree produced by {@see RAQLParser::raql()}.
	 *
	 * @param Context\RaqlContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitRaql(Context\RaqlContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::clause()}.
	 *
	 * @param Context\ClauseContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitClause(Context\ClauseContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::conjunction()}.
	 *
	 * @param Context\ConjunctionContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitConjunction(Context\ConjunctionContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::operation()}.
	 *
	 * @param Context\OperationContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitOperation(Context\OperationContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::string_array_operation()}.
	 *
	 * @param Context\String_array_operationContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitString_array_operation(Context\String_array_operationContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::number_array_operation()}.
	 *
	 * @param Context\Number_array_operationContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitNumber_array_operation(Context\Number_array_operationContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::bool_array_operation()}.
	 *
	 * @param Context\Bool_array_operationContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitBool_array_operation(Context\Bool_array_operationContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::array_operator()}.
	 *
	 * @param Context\Array_operatorContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitArray_operator(Context\Array_operatorContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::string_operation()}.
	 *
	 * @param Context\String_operationContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitString_operation(Context\String_operationContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::string_operator()}.
	 *
	 * @param Context\String_operatorContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitString_operator(Context\String_operatorContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::number_operation()}.
	 *
	 * @param Context\Number_operationContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitNumber_operation(Context\Number_operationContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::number_operator()}.
	 *
	 * @param Context\Number_operatorContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitNumber_operator(Context\Number_operatorContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::bool_operation()}.
	 *
	 * @param Context\Bool_operationContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitBool_operation(Context\Bool_operationContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::bool_operator()}.
	 *
	 * @param Context\Bool_operatorContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitBool_operator(Context\Bool_operatorContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::field()}.
	 *
	 * @param Context\FieldContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitField(Context\FieldContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::nullstring()}.
	 *
	 * @param Context\NullstringContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitNullstring(Context\NullstringContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::string()}.
	 *
	 * @param Context\StringContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitString(Context\StringContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::string_array()}.
	 *
	 * @param Context\String_arrayContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitString_array(Context\String_arrayContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::number()}.
	 *
	 * @param Context\NumberContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitNumber(Context\NumberContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::number_array()}.
	 *
	 * @param Context\Number_arrayContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitNumber_array(Context\Number_arrayContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::bool()}.
	 *
	 * @param Context\BoolContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitBool(Context\BoolContext $context);

	/**
	 * Visit a parse tree produced by {@see RAQLParser::bool_array()}.
	 *
	 * @param Context\Bool_arrayContext $context The parse tree.
	 *
	 * @return mixed The visitor result.
	 */
	public function visitBool_array(Context\Bool_arrayContext $context);
}