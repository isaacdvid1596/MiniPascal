// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalGrammarParser}.
 */
public interface MiniPascalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniPascalGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniPascalGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#program_end_marker}.
	 * @param ctx the parse tree
	 */
	void enterProgram_end_marker(MiniPascalGrammarParser.Program_end_markerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#program_end_marker}.
	 * @param ctx the parse tree
	 */
	void exitProgram_end_marker(MiniPascalGrammarParser.Program_end_markerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniPascalGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniPascalGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(MiniPascalGrammarParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(MiniPascalGrammarParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_specifier(MiniPascalGrammarParser.Array_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_specifier(MiniPascalGrammarParser.Array_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#index_range}.
	 * @param ctx the parse tree
	 */
	void enterIndex_range(MiniPascalGrammarParser.Index_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#index_range}.
	 * @param ctx the parse tree
	 */
	void exitIndex_range(MiniPascalGrammarParser.Index_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(MiniPascalGrammarParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(MiniPascalGrammarParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniPascalGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniPascalGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(MiniPascalGrammarParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(MiniPascalGrammarParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(MiniPascalGrammarParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(MiniPascalGrammarParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniPascalGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniPascalGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MiniPascalGrammarParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MiniPascalGrammarParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MiniPascalGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MiniPascalGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MiniPascalGrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MiniPascalGrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MiniPascalGrammarParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MiniPascalGrammarParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_statement(MiniPascalGrammarParser.Repeat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_statement(MiniPascalGrammarParser.Repeat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(MiniPascalGrammarParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(MiniPascalGrammarParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(MiniPascalGrammarParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(MiniPascalGrammarParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniPascalGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniPascalGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(MiniPascalGrammarParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(MiniPascalGrammarParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniPascalGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniPascalGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniPascalGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniPascalGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiniPascalGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiniPascalGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#index_access}.
	 * @param ctx the parse tree
	 */
	void enterIndex_access(MiniPascalGrammarParser.Index_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#index_access}.
	 * @param ctx the parse tree
	 */
	void exitIndex_access(MiniPascalGrammarParser.Index_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MiniPascalGrammarParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MiniPascalGrammarParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(MiniPascalGrammarParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(MiniPascalGrammarParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(MiniPascalGrammarParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(MiniPascalGrammarParser.MulopContext ctx);
}