// Generated from workspace\Logo++\src\Grammar.g by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GrammarBaseListener implements GrammarListener {
	@Override public void enterExpression(GrammarParser.ExpressionContext ctx) { }
	@Override public void exitExpression(GrammarParser.ExpressionContext ctx) { }

	@Override public void enterOr_expression(GrammarParser.Or_expressionContext ctx) { }
	@Override public void exitOr_expression(GrammarParser.Or_expressionContext ctx) { }

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

	@Override public void enterCommand_list(GrammarParser.Command_listContext ctx) { }
	@Override public void exitCommand_list(GrammarParser.Command_listContext ctx) { }

	@Override public void enterAdditive_expression(GrammarParser.Additive_expressionContext ctx) { }
	@Override public void exitAdditive_expression(GrammarParser.Additive_expressionContext ctx) { }

	@Override public void enterEquality_expression(GrammarParser.Equality_expressionContext ctx) { }
	@Override public void exitEquality_expression(GrammarParser.Equality_expressionContext ctx) { }

	@Override public void enterPrimary_expression(GrammarParser.Primary_expressionContext ctx) { }
	@Override public void exitPrimary_expression(GrammarParser.Primary_expressionContext ctx) { }

	@Override public void enterAnd_expression(GrammarParser.And_expressionContext ctx) { }
	@Override public void exitAnd_expression(GrammarParser.And_expressionContext ctx) { }

	@Override public void enterUnary_expression(GrammarParser.Unary_expressionContext ctx) { }
	@Override public void exitUnary_expression(GrammarParser.Unary_expressionContext ctx) { }

	@Override public void enterConditional_statement(GrammarParser.Conditional_statementContext ctx) { }
	@Override public void exitConditional_statement(GrammarParser.Conditional_statementContext ctx) { }

	@Override public void enterCommand(GrammarParser.CommandContext ctx) { }
	@Override public void exitCommand(GrammarParser.CommandContext ctx) { }

	@Override public void enterCommand_noarg(GrammarParser.Command_noargContext ctx) { }
	@Override public void exitCommand_noarg(GrammarParser.Command_noargContext ctx) { }

	@Override public void enterCommand_expr(GrammarParser.Command_exprContext ctx) { }
	@Override public void exitCommand_expr(GrammarParser.Command_exprContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}