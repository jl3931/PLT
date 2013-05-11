// Generated from workspace\Logo++\src\Grammar.g by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GrammarBaseListener implements GrammarListener {
	@Override public void enterExpression(GrammarParser.ExpressionContext ctx) { }
	@Override public void exitExpression(GrammarParser.ExpressionContext ctx) { }

	@Override public void enterExpression_list(GrammarParser.Expression_listContext ctx) { }
	@Override public void exitExpression_list(GrammarParser.Expression_listContext ctx) { }

	@Override public void enterFuncall(GrammarParser.FuncallContext ctx) { }
	@Override public void exitFuncall(GrammarParser.FuncallContext ctx) { }

	@Override public void enterCommands(GrammarParser.CommandsContext ctx) { }
	@Override public void exitCommands(GrammarParser.CommandsContext ctx) { }

	@Override public void enterAssignment_expression(GrammarParser.Assignment_expressionContext ctx) { }
	@Override public void exitAssignment_expression(GrammarParser.Assignment_expressionContext ctx) { }

	@Override public void enterLine(GrammarParser.LineContext ctx) { }
	@Override public void exitLine(GrammarParser.LineContext ctx) { }

	@Override public void enterMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx) { }
	@Override public void exitMultiplicative_expression(GrammarParser.Multiplicative_expressionContext ctx) { }

	@Override public void enterRelational_expression(GrammarParser.Relational_expressionContext ctx) { }
	@Override public void exitRelational_expression(GrammarParser.Relational_expressionContext ctx) { }

	@Override public void enterId(GrammarParser.IdContext ctx) { }
	@Override public void exitId(GrammarParser.IdContext ctx) { }

	@Override public void enterPostfix_expression(GrammarParser.Postfix_expressionContext ctx) { }
	@Override public void exitPostfix_expression(GrammarParser.Postfix_expressionContext ctx) { }

	@Override public void enterEquality_expression(GrammarParser.Equality_expressionContext ctx) { }
	@Override public void exitEquality_expression(GrammarParser.Equality_expressionContext ctx) { }

	@Override public void enterPower_expression(GrammarParser.Power_expressionContext ctx) { }
	@Override public void exitPower_expression(GrammarParser.Power_expressionContext ctx) { }

	@Override public void enterUnary_expression(GrammarParser.Unary_expressionContext ctx) { }
	@Override public void exitUnary_expression(GrammarParser.Unary_expressionContext ctx) { }

	@Override public void enterPlay_challenge(GrammarParser.Play_challengeContext ctx) { }
	@Override public void exitPlay_challenge(GrammarParser.Play_challengeContext ctx) { }

	@Override public void enterCommand(GrammarParser.CommandContext ctx) { }
	@Override public void exitCommand(GrammarParser.CommandContext ctx) { }

	@Override public void enterConditional_statement(GrammarParser.Conditional_statementContext ctx) { }
	@Override public void exitConditional_statement(GrammarParser.Conditional_statementContext ctx) { }

	@Override public void enterFunction_definition(GrammarParser.Function_definitionContext ctx) { }
	@Override public void exitFunction_definition(GrammarParser.Function_definitionContext ctx) { }

	@Override public void enterCommand_expr(GrammarParser.Command_exprContext ctx) { }
	@Override public void exitCommand_expr(GrammarParser.Command_exprContext ctx) { }

	@Override public void enterCommand_noarg(GrammarParser.Command_noargContext ctx) { }
	@Override public void exitCommand_noarg(GrammarParser.Command_noargContext ctx) { }

	@Override public void enterOr_expression(GrammarParser.Or_expressionContext ctx) { }
	@Override public void exitOr_expression(GrammarParser.Or_expressionContext ctx) { }

	@Override public void enterStatement_list(GrammarParser.Statement_listContext ctx) { }
	@Override public void exitStatement_list(GrammarParser.Statement_listContext ctx) { }

	@Override public void enterIdentifier_list(GrammarParser.Identifier_listContext ctx) { }
	@Override public void exitIdentifier_list(GrammarParser.Identifier_listContext ctx) { }

	@Override public void enterStatement(GrammarParser.StatementContext ctx) { }
	@Override public void exitStatement(GrammarParser.StatementContext ctx) { }

	@Override public void enterFor_expression(GrammarParser.For_expressionContext ctx) { }
	@Override public void exitFor_expression(GrammarParser.For_expressionContext ctx) { }

	@Override public void enterAdditive_expression(GrammarParser.Additive_expressionContext ctx) { }
	@Override public void exitAdditive_expression(GrammarParser.Additive_expressionContext ctx) { }

	@Override public void enterUnary_operator(GrammarParser.Unary_operatorContext ctx) { }
	@Override public void exitUnary_operator(GrammarParser.Unary_operatorContext ctx) { }

	@Override public void enterAnd_expression(GrammarParser.And_expressionContext ctx) { }
	@Override public void exitAnd_expression(GrammarParser.And_expressionContext ctx) { }

	@Override public void enterPrimary_expression(GrammarParser.Primary_expressionContext ctx) { }
	@Override public void exitPrimary_expression(GrammarParser.Primary_expressionContext ctx) { }

	@Override public void enterIteration_statement(GrammarParser.Iteration_statementContext ctx) { }
	@Override public void exitIteration_statement(GrammarParser.Iteration_statementContext ctx) { }

	@Override public void enterRecord_challenge(GrammarParser.Record_challengeContext ctx) { }
	@Override public void exitRecord_challenge(GrammarParser.Record_challengeContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}