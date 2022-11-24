// Generated from RAQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RAQLParser}.
 */
public interface RAQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RAQLParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(RAQLParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(RAQLParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(RAQLParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(RAQLParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(RAQLParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(RAQLParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#string_array_operation}.
	 * @param ctx the parse tree
	 */
	void enterString_array_operation(RAQLParser.String_array_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#string_array_operation}.
	 * @param ctx the parse tree
	 */
	void exitString_array_operation(RAQLParser.String_array_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#number_array_operation}.
	 * @param ctx the parse tree
	 */
	void enterNumber_array_operation(RAQLParser.Number_array_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#number_array_operation}.
	 * @param ctx the parse tree
	 */
	void exitNumber_array_operation(RAQLParser.Number_array_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#bool_array_operation}.
	 * @param ctx the parse tree
	 */
	void enterBool_array_operation(RAQLParser.Bool_array_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#bool_array_operation}.
	 * @param ctx the parse tree
	 */
	void exitBool_array_operation(RAQLParser.Bool_array_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#array_operator}.
	 * @param ctx the parse tree
	 */
	void enterArray_operator(RAQLParser.Array_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#array_operator}.
	 * @param ctx the parse tree
	 */
	void exitArray_operator(RAQLParser.Array_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#string_operation}.
	 * @param ctx the parse tree
	 */
	void enterString_operation(RAQLParser.String_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#string_operation}.
	 * @param ctx the parse tree
	 */
	void exitString_operation(RAQLParser.String_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#string_operator}.
	 * @param ctx the parse tree
	 */
	void enterString_operator(RAQLParser.String_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#string_operator}.
	 * @param ctx the parse tree
	 */
	void exitString_operator(RAQLParser.String_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterNumber_operation(RAQLParser.Number_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitNumber_operation(RAQLParser.Number_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#number_operator}.
	 * @param ctx the parse tree
	 */
	void enterNumber_operator(RAQLParser.Number_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#number_operator}.
	 * @param ctx the parse tree
	 */
	void exitNumber_operator(RAQLParser.Number_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#bool_operation}.
	 * @param ctx the parse tree
	 */
	void enterBool_operation(RAQLParser.Bool_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#bool_operation}.
	 * @param ctx the parse tree
	 */
	void exitBool_operation(RAQLParser.Bool_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#bool_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_operator(RAQLParser.Bool_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#bool_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_operator(RAQLParser.Bool_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(RAQLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(RAQLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#nullstring}.
	 * @param ctx the parse tree
	 */
	void enterNullstring(RAQLParser.NullstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#nullstring}.
	 * @param ctx the parse tree
	 */
	void exitNullstring(RAQLParser.NullstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(RAQLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(RAQLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#string_array}.
	 * @param ctx the parse tree
	 */
	void enterString_array(RAQLParser.String_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#string_array}.
	 * @param ctx the parse tree
	 */
	void exitString_array(RAQLParser.String_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(RAQLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(RAQLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#number_array}.
	 * @param ctx the parse tree
	 */
	void enterNumber_array(RAQLParser.Number_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#number_array}.
	 * @param ctx the parse tree
	 */
	void exitNumber_array(RAQLParser.Number_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(RAQLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(RAQLParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link RAQLParser#bool_array}.
	 * @param ctx the parse tree
	 */
	void enterBool_array(RAQLParser.Bool_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RAQLParser#bool_array}.
	 * @param ctx the parse tree
	 */
	void exitBool_array(RAQLParser.Bool_arrayContext ctx);
}