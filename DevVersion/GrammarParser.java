// Generated from workspace\Logo++\src\Grammar.g by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, Unary_minus=15, Unary_not=16, 
		Forward=17, Back=18, Left=19, Right=20, Setx=21, Sety=22, Setxy=23, Speed=24, 
		Print=25, Clearscreen=26, Origin=27, Front=28, Wrap=29, Fence=30, Getx=31, 
		Gety=32, Getspeed=33, Getxy=34, Penup=35, Pendown=36, Save=37, Color=38, 
		Setspeed=39, Hideturtle=40, Showturtle=41, Load=42, Turtle=43, Set=44, 
		If=45, Else=46, LPAREN=47, RPAREN=48, LBRACE=49, RBRACE=50, While=51, 
		For=52, Repeat=53, Function=54, Import=55, Challenge=56, Match=57, Quit=58, 
		Recordchallenge=59, Hint=60, Removehint=61, Savechallenge=62, Number=63, 
		Identifier=64, String=65, WS=66;
	public static final String[] tokenNames = {
		"<INVALID>", "'^'", "','", "'+'", "'*'", "':'", "'<'", "'='", "'!='", 
		"'<='", "'&&'", "'||'", "'>'", "'/'", "'>='", "'-'", "'!'", "Forward", 
		"Back", "Left", "Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", 
		"Origin", "Front", "Wrap", "Fence", "Getx", "Gety", "Getspeed", "Getxy", 
		"Penup", "Pendown", "Save", "Color", "Setspeed", "Hideturtle", "Showturtle", 
		"Load", "Turtle", "Set", "'if'", "'else'", "'('", "')'", "'{'", "'}'", 
		"'while'", "'for'", "Repeat", "Function", "Import", "Challenge", "Match", 
		"Quit", "Recordchallenge", "Hint", "Removehint", "Savechallenge", "Number", 
		"Identifier", "String", "WS"
	};
	public static final int
		RULE_line = 0, RULE_statement_list = 1, RULE_statement = 2, RULE_commands = 3, 
		RULE_command_noarg = 4, RULE_command_expr = 5, RULE_command = 6, RULE_expression = 7, 
		RULE_or_expression = 8, RULE_and_expression = 9, RULE_equality_expression = 10, 
		RULE_relational_expression = 11, RULE_additive_expression = 12, RULE_multiplicative_expression = 13, 
		RULE_unary_expression = 14, RULE_unary_operator = 15, RULE_postfix_expression = 16, 
		RULE_expression_list = 17, RULE_primary_expression = 18, RULE_id = 19, 
		RULE_assignment_expression = 20, RULE_conditional_statement = 21, RULE_iteration_statement = 22, 
		RULE_for_expression = 23, RULE_function_definition = 24, RULE_identifier_list = 25, 
		RULE_funcall = 26, RULE_challenge = 27;
	public static final String[] ruleNames = {
		"line", "statement_list", "statement", "commands", "command_noarg", "command_expr", 
		"command", "expression", "or_expression", "and_expression", "equality_expression", 
		"relational_expression", "additive_expression", "multiplicative_expression", 
		"unary_expression", "unary_operator", "postfix_expression", "expression_list", 
		"primary_expression", "id", "assignment_expression", "conditional_statement", 
		"iteration_statement", "for_expression", "function_definition", "identifier_list", 
		"funcall", "challenge"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public LOGONode node;
		public Statement_listContext statement_list;
		public ChallengeContext challenge;
		public TerminalNode Import() { return getToken(GrammarParser.Import, 0); }
		public ChallengeContext challenge() {
			return getRuleContext(ChallengeContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case Unary_minus:
			case Unary_not:
			case Forward:
			case Back:
			case Left:
			case Right:
			case Setx:
			case Sety:
			case Setxy:
			case Speed:
			case Print:
			case Clearscreen:
			case Origin:
			case Front:
			case Wrap:
			case Fence:
			case Getx:
			case Gety:
			case Getspeed:
			case Getxy:
			case Penup:
			case Pendown:
			case Save:
			case Color:
			case Setspeed:
			case Hideturtle:
			case Showturtle:
			case Load:
			case Turtle:
			case Set:
			case If:
			case LPAREN:
			case While:
			case For:
			case Repeat:
			case Function:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); ((LineContext)_localctx).statement_list = statement_list(0);
				setState(57); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).statement_list.node; LOGOPP.io.debug("line->stmt_list");
				}
				break;
			case Challenge:
			case Match:
			case Quit:
			case Recordchallenge:
			case Hint:
			case Removehint:
			case Savechallenge:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); ((LineContext)_localctx).challenge = challenge();
				setState(61); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).challenge.node;
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 3);
				{
				setState(64); match(Import);
				setState(65); match(String);
				setState(66); match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Statement_listContext n;
		public StatementContext statement;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statement_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState, _p);
		Statement_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70); ((Statement_listContext)_localctx).statement = statement();
			((Statement_listContext)_localctx).node =  ((Statement_listContext)_localctx).statement.node; LOGOPP.io.debug("stmt_list->stmt");
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_listContext(_parentctx, _parentState, _p);
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
					setState(73);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(74); ((Statement_listContext)_localctx).statement = statement();
					((Statement_listContext)_localctx).n.node.children.add(((Statement_listContext)_localctx).statement.node); ((Statement_listContext)_localctx).node =  ((Statement_listContext)_localctx).n.node; LOGOPP.io.debug("stmt_list->stmt_list");
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LOGONode node;
		public Function_definitionContext function_definition;
		public CommandsContext commands;
		public ExpressionContext expression;
		public Conditional_statementContext conditional_statement;
		public Iteration_statementContext iteration_statement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); ((StatementContext)_localctx).function_definition = function_definition();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).function_definition.node); LOGOPP.io.debug("stmt->func");
				}
				break;
			case Forward:
			case Back:
			case Left:
			case Right:
			case Setx:
			case Sety:
			case Setxy:
			case Speed:
			case Print:
			case Clearscreen:
			case Origin:
			case Front:
			case Wrap:
			case Fence:
			case Getxy:
			case Penup:
			case Pendown:
			case Save:
			case Color:
			case Setspeed:
			case Hideturtle:
			case Showturtle:
			case Load:
			case Turtle:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); ((StatementContext)_localctx).commands = commands();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).commands.node); LOGOPP.io.debug("stmt->cmd_list");
				}
				break;
			case Unary_minus:
			case Unary_not:
			case Getx:
			case Gety:
			case Getspeed:
			case Set:
			case LPAREN:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); ((StatementContext)_localctx).expression = expression();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).expression.node); LOGOPP.io.debug("stmt->expr");
				}
				break;
			case If:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); ((StatementContext)_localctx).conditional_statement = conditional_statement();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).conditional_statement.node); LOGOPP.io.debug("stmt->cond");
				}
				break;
			case While:
			case For:
			case Repeat:
				enterOuterAlt(_localctx, 5);
				{
				setState(94); ((StatementContext)_localctx).iteration_statement = iteration_statement();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).iteration_statement.node); LOGOPP.io.debug("stmt->iter");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public LOGONode node;
		public Command_noargContext command_noarg;
		public Command_exprContext command_expr;
		public Command_exprContext command_expr() {
			return getRuleContext(Command_exprContext.class,0);
		}
		public Command_noargContext command_noarg() {
			return getRuleContext(Command_noargContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commands);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case Clearscreen:
			case Origin:
			case Front:
			case Wrap:
			case Fence:
			case Getxy:
			case Penup:
			case Pendown:
			case Hideturtle:
			case Showturtle:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); ((CommandsContext)_localctx).command_noarg = command_noarg();
				((CommandsContext)_localctx).node =  ((CommandsContext)_localctx).command_noarg.node;
				}
				break;
			case Forward:
			case Back:
			case Left:
			case Right:
			case Setx:
			case Sety:
			case Setxy:
			case Speed:
			case Print:
			case Save:
			case Color:
			case Setspeed:
			case Load:
			case Turtle:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); ((CommandsContext)_localctx).command_expr = command_expr();
				((CommandsContext)_localctx).node =  ((CommandsContext)_localctx).command_expr.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_noargContext extends ParserRuleContext {
		public LOGONode node;
		public TerminalNode Clearscreen() { return getToken(GrammarParser.Clearscreen, 0); }
		public TerminalNode Getxy() { return getToken(GrammarParser.Getxy, 0); }
		public TerminalNode Front() { return getToken(GrammarParser.Front, 0); }
		public TerminalNode Showturtle() { return getToken(GrammarParser.Showturtle, 0); }
		public TerminalNode Hideturtle() { return getToken(GrammarParser.Hideturtle, 0); }
		public TerminalNode Pendown() { return getToken(GrammarParser.Pendown, 0); }
		public TerminalNode Origin() { return getToken(GrammarParser.Origin, 0); }
		public TerminalNode Penup() { return getToken(GrammarParser.Penup, 0); }
		public TerminalNode Wrap() { return getToken(GrammarParser.Wrap, 0); }
		public TerminalNode Fence() { return getToken(GrammarParser.Fence, 0); }
		public Command_noargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_noarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand_noarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand_noarg(this);
		}
	}

	public final Command_noargContext command_noarg() throws RecognitionException {
		Command_noargContext _localctx = new Command_noargContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command_noarg);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case Getxy:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(Getxy);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETXY");
				}
				break;
			case Clearscreen:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); match(Clearscreen);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("CLEARSCREEN");
				}
				break;
			case Origin:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); match(Origin);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("ORIGIN");
				}
				break;
			case Front:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); match(Front);
				}
				break;
			case Wrap:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); match(Wrap);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("WRAP");
				}
				break;
			case Fence:
				enterOuterAlt(_localctx, 6);
				{
				setState(116); match(Fence);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("FENCE");
				}
				break;
			case Penup:
				enterOuterAlt(_localctx, 7);
				{
				setState(118); match(Penup);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENUP");
				}
				break;
			case Pendown:
				enterOuterAlt(_localctx, 8);
				{
				setState(120); match(Pendown);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENDOWN");
				}
				break;
			case Showturtle:
				enterOuterAlt(_localctx, 9);
				{
				setState(122); match(Showturtle);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("SHOWTURTLE");
				}
				break;
			case Hideturtle:
				enterOuterAlt(_localctx, 10);
				{
				setState(124); match(Hideturtle);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("HIDETURTLE");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_exprContext extends ParserRuleContext {
		public LOGONode node;
		public CommandContext command;
		public ExpressionContext expression;
		public ExpressionContext a;
		public ExpressionContext b;
		public Token String;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Load() { return getToken(GrammarParser.Load, 0); }
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode Save() { return getToken(GrammarParser.Save, 0); }
		public TerminalNode Print() { return getToken(GrammarParser.Print, 0); }
		public TerminalNode Turtle() { return getToken(GrammarParser.Turtle, 0); }
		public TerminalNode Color() { return getToken(GrammarParser.Color, 0); }
		public TerminalNode Setxy() { return getToken(GrammarParser.Setxy, 0); }
		public Command_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand_expr(this);
		}
	}

	public final Command_exprContext command_expr() throws RecognitionException {
		Command_exprContext _localctx = new Command_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command_expr);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); ((Command_exprContext)_localctx).command = command();
				setState(129); ((Command_exprContext)_localctx).expression = expression();
				((Command_exprContext)_localctx).node =  new LOGOCommandNode(((Command_exprContext)_localctx).command.text, ((Command_exprContext)_localctx).expression.node);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(Setxy);
				setState(133); match(LPAREN);
				setState(134); ((Command_exprContext)_localctx).a = expression();
				setState(135); match(2);
				setState(136); ((Command_exprContext)_localctx).b = expression();
				setState(137); match(RPAREN);
				((Command_exprContext)_localctx).node =  new LOGOCommandNode("SETXY", ((Command_exprContext)_localctx).a.node, ((Command_exprContext)_localctx).b.node);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); match(Color);
				setState(141); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("CHANGECOLOR", temp);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); match(Save);
				setState(144); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("SAVEIMAGE", temp);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146); match(Print);
				setState(147); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("PRINT", temp);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149); match(Load);
				setState(150); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("LOAD", temp);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152); match(Turtle);
				setState(153); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("CHANGETURTLE", temp);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public String text;
		public TerminalNode Right() { return getToken(GrammarParser.Right, 0); }
		public TerminalNode Speed() { return getToken(GrammarParser.Speed, 0); }
		public TerminalNode Setspeed() { return getToken(GrammarParser.Setspeed, 0); }
		public TerminalNode Setx() { return getToken(GrammarParser.Setx, 0); }
		public TerminalNode Sety() { return getToken(GrammarParser.Sety, 0); }
		public TerminalNode Print() { return getToken(GrammarParser.Print, 0); }
		public TerminalNode Left() { return getToken(GrammarParser.Left, 0); }
		public TerminalNode Back() { return getToken(GrammarParser.Back, 0); }
		public TerminalNode Forward() { return getToken(GrammarParser.Forward, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case Forward:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); match(Forward);
				((CommandContext)_localctx).text =  new String("FORWARD");
				}
				break;
			case Back:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); match(Back);
				((CommandContext)_localctx).text =  new String("BACK");
				}
				break;
			case Left:
				enterOuterAlt(_localctx, 3);
				{
				setState(161); match(Left);
				((CommandContext)_localctx).text =  new String("LEFT");
				}
				break;
			case Right:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); match(Right);
				((CommandContext)_localctx).text =  new String("RIGHT");
				}
				break;
			case Setx:
				enterOuterAlt(_localctx, 5);
				{
				setState(165); match(Setx);
				((CommandContext)_localctx).text =  new String("SETX");
				}
				break;
			case Sety:
				enterOuterAlt(_localctx, 6);
				{
				setState(167); match(Sety);
				((CommandContext)_localctx).text =  new String("SETY");
				}
				break;
			case Speed:
				enterOuterAlt(_localctx, 7);
				{
				setState(169); match(Speed);
				((CommandContext)_localctx).text =  new String("SPEED");
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 8);
				{
				setState(171); match(Print);
				((CommandContext)_localctx).text =  new String("PRINT");
				}
				break;
			case Setspeed:
				enterOuterAlt(_localctx, 9);
				{
				setState(173); match(Setspeed);
				((CommandContext)_localctx).text =  new String("SETSPEED");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LOGONode node;
		public Or_expressionContext or_expression;
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((ExpressionContext)_localctx).or_expression = or_expression(0);
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).or_expression.node; LOGOPP.io.debug("expr->or");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Or_expressionContext n;
		public And_expressionContext and_expression;
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Or_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, _parentState, _p);
		Or_expressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181); ((Or_expressionContext)_localctx).and_expression = and_expression(0);
			((Or_expressionContext)_localctx).node =  ((Or_expressionContext)_localctx).and_expression.node; LOGOPP.io.debug("or->and " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_expressionContext(_parentctx, _parentState, _p);
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_or_expression);
					setState(184);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(185); match(11);
					setState(186); ((Or_expressionContext)_localctx).and_expression = and_expression(0);
					((Or_expressionContext)_localctx).node =  new LOGOOperatorNode("||", ((Or_expressionContext)_localctx).n.node, ((Or_expressionContext)_localctx).and_expression.node); LOGOPP.io.debug("or -> or || and " + _localctx.node.id);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public And_expressionContext n;
		public Equality_expressionContext equality_expression;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public And_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState, _p);
		And_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195); ((And_expressionContext)_localctx).equality_expression = equality_expression(0);
			((And_expressionContext)_localctx).node =  ((And_expressionContext)_localctx).equality_expression.node; LOGOPP.io.debug("and->eq " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_expressionContext(_parentctx, _parentState, _p);
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(198);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(199); match(10);
					setState(200); ((And_expressionContext)_localctx).equality_expression = equality_expression(0);
					((And_expressionContext)_localctx).node =  new LOGOOperatorNode("&&", ((And_expressionContext)_localctx).n.node, ((And_expressionContext)_localctx).equality_expression.node); LOGOPP.io.debug("and-> and && eq " + _localctx.node.id);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Equality_expressionContext n;
		public Relational_expressionContext relational_expression;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Equality_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState, _p);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_equality_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
			((Equality_expressionContext)_localctx).node =  ((Equality_expressionContext)_localctx).relational_expression.node; LOGOPP.io.debug("eq->rel " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(212);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(213); match(7);
						setState(214); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
						((Equality_expressionContext)_localctx).node =  new LOGOOperatorNode("=", ((Equality_expressionContext)_localctx).n.node, ((Equality_expressionContext)_localctx).relational_expression.node); LOGOPP.io.debug("eq-> eq = rel " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(217);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(218); match(8);
						setState(219); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
						((Equality_expressionContext)_localctx).node =  new LOGOOperatorNode("!=", ((Equality_expressionContext)_localctx).n.node, ((Equality_expressionContext)_localctx).relational_expression.node); LOGOPP.io.debug("eq-> eq != rel " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Relational_expressionContext n;
		public Additive_expressionContext additive_expression;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState, _p);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_relational_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
			((Relational_expressionContext)_localctx).node =  ((Relational_expressionContext)_localctx).additive_expression.node; LOGOPP.io.debug("rel->add " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(231);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(232); match(6);
						setState(233); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode("<", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel<add " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(236);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(237); match(12);
						setState(238); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode(">", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel>add " + _localctx.node.id);
						}
						break;

					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(241);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(242); match(14);
						setState(243); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode(">=", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel>=add " + _localctx.node.id);
						}
						break;

					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(246);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(247); match(9);
						setState(248); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode("<=", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel<=add " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Additive_expressionContext n;
		public Multiplicative_expressionContext multiplicative_expression;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Additive_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState, _p);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_additive_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
			((Additive_expressionContext)_localctx).node =  ((Additive_expressionContext)_localctx).multiplicative_expression.node; LOGOPP.io.debug("add->mul " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(260);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(261); match(3);
						setState(262); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("+", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add+mul " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(265);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(266); match(Unary_minus);
						setState(267); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("-", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add-mul " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Multiplicative_expressionContext n;
		public Unary_expressionContext unary_expression;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState, _p);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_multiplicative_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
			((Multiplicative_expressionContext)_localctx).node =  ((Multiplicative_expressionContext)_localctx).unary_expression.node; LOGOPP.io.debug("mul->unary " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(279);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(280); match(4);
						setState(281); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("*", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul*unary " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(284);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(285); match(13);
						setState(286); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("/", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul/unary " + _localctx.node.id);
						}
						break;

					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(289);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(290); match(1);
						setState(291); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("^", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul^unary " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public Postfix_expressionContext postfix_expression;
		public Unary_operatorContext unary_operator;
		public Primary_expressionContext primary_expression;
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_expression);
		try {
			setState(306);
			switch (_input.LA(1)) {
			case Getx:
			case Gety:
			case Getspeed:
			case Set:
			case LPAREN:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(299); ((Unary_expressionContext)_localctx).postfix_expression = postfix_expression(0);
				((Unary_expressionContext)_localctx).node =  ((Unary_expressionContext)_localctx).postfix_expression.node; LOGOPP.io.debug("unary->postfix " + _localctx.node.id);
				}
				break;
			case Unary_minus:
			case Unary_not:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); ((Unary_expressionContext)_localctx).unary_operator = unary_operator();
				setState(303); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
				((Unary_expressionContext)_localctx).node =  new LOGOOperatorNode(((Unary_expressionContext)_localctx).unary_operator.text, ((Unary_expressionContext)_localctx).primary_expression.node); LOGOPP.io.debug("unary->primary " + _localctx.node.id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public String text;
		public TerminalNode Unary_minus() { return getToken(GrammarParser.Unary_minus, 0); }
		public TerminalNode Unary_not() { return getToken(GrammarParser.Unary_not, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_operator);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case Unary_minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); match(Unary_minus);
				((Unary_operatorContext)_localctx).text =  "u-";
				}
				break;
			case Unary_not:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); match(Unary_not);
				((Unary_operatorContext)_localctx).text =  "u!";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Postfix_expressionContext n;
		public Primary_expressionContext primary_expression;
		public Expression_listContext expression_list;
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode Getspeed() { return getToken(GrammarParser.Getspeed, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode Getx() { return getToken(GrammarParser.Getx, 0); }
		public TerminalNode Gety() { return getToken(GrammarParser.Gety, 0); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState, _p);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_postfix_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			switch (_input.LA(1)) {
			case Getx:
				{
				setState(315); match(Getx);
				}
				break;
			case Gety:
				{
				setState(316); match(Gety);
				}
				break;
			case Getspeed:
				{
				setState(317); match(Getspeed);
				}
				break;
			case Set:
			case LPAREN:
			case Number:
			case Identifier:
				{
				setState(318); ((Postfix_expressionContext)_localctx).primary_expression = primary_expression();
				((Postfix_expressionContext)_localctx).node =  ((Postfix_expressionContext)_localctx).primary_expression.node; LOGOPP.io.debug("postfix->primary " + _localctx.node.id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
					setState(323);
					if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
					setState(324); match(LPAREN);
					setState(325); ((Postfix_expressionContext)_localctx).expression_list = expression_list(0);
					setState(326); match(RPAREN);
					((Postfix_expressionContext)_localctx).node =  new LOGOFunctionNode(((Postfix_expressionContext)_localctx).n.node, "execute", ((Postfix_expressionContext)_localctx).expression_list.node); LOGOPP.io.debug("funcall test");
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public int _p;
		public LOGONode node;
		public Expression_listContext n;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expression_listContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState, _p);
		Expression_listContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, RULE_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(335); ((Expression_listContext)_localctx).expression = expression();
				((Expression_listContext)_localctx).node =  new LOGOExprListNode(((Expression_listContext)_localctx).expression.node); LOGOPP.io.debug("expression_list tail");
				}
				break;

			case 2:
				{
				((Expression_listContext)_localctx).node =  null;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState, _p);
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(341);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(342); match(2);
					setState(343); ((Expression_listContext)_localctx).expression = expression();
					((Expression_listContext)_localctx).n.node.children.add(((Expression_listContext)_localctx).expression.node); ((Expression_listContext)_localctx).node =  ((Expression_listContext)_localctx).n.node; LOGOPP.io.debug("expression_list");
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public Token Number;
		public ExpressionContext expression;
		public Assignment_expressionContext assignment_expression;
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Number() { return getToken(GrammarParser.Number, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary_expression);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(351); ((Primary_expressionContext)_localctx).Number = match(Number);
				((Primary_expressionContext)_localctx).node =  new LOGOLeaf((((Primary_expressionContext)_localctx).Number!=null?((Primary_expressionContext)_localctx).Number.getText():null)); LOGOPP.io.debug("Number " + _localctx.node.id);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); match(LPAREN);
				setState(354); ((Primary_expressionContext)_localctx).expression = expression();
				setState(355); match(RPAREN);
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).expression.node; LOGOPP.io.debug("parentheses");
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 3);
				{
				setState(358); ((Primary_expressionContext)_localctx).assignment_expression = assignment_expression();
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).assignment_expression.node; LOGOPP.io.debug("SET");
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(361); ((Primary_expressionContext)_localctx).id = id();
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).id.node; LOGOPP.io.debug("ID");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public LOGONode node;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); ((IdContext)_localctx).Identifier = match(Identifier);
			((IdContext)_localctx).node =  new LOGOLeaf((((IdContext)_localctx).Identifier!=null?((IdContext)_localctx).Identifier.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public IdContext id;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Set() { return getToken(GrammarParser.Set, 0); }
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(Set);
			setState(370); ((Assignment_expressionContext)_localctx).id = id();
			setState(371); ((Assignment_expressionContext)_localctx).expression = expression();
			((Assignment_expressionContext)_localctx).node =  new LOGOSetNode(((Assignment_expressionContext)_localctx).id.node.id, ((Assignment_expressionContext)_localctx).expression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_statementContext extends ParserRuleContext {
		public LOGONode node;
		public ExpressionContext expression;
		public Statement_listContext statement_list;
		public Statement_listContext n;
		public Statement_listContext m;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE(int i) {
			return getToken(GrammarParser.LBRACE, i);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public TerminalNode RBRACE(int i) {
			return getToken(GrammarParser.RBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GrammarParser.RBRACE); }
		public TerminalNode Else() { return getToken(GrammarParser.Else, 0); }
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public TerminalNode If() { return getToken(GrammarParser.If, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(GrammarParser.LBRACE); }
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional_statement);
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); match(If);
				setState(375); match(LPAREN);
				setState(376); ((Conditional_statementContext)_localctx).expression = expression();
				setState(377); match(RPAREN);
				setState(378); match(LBRACE);
				setState(379); ((Conditional_statementContext)_localctx).statement_list = statement_list(0);
				setState(380); match(RBRACE);
				((Conditional_statementContext)_localctx).node =  new LOGOConditionalNode("if", ((Conditional_statementContext)_localctx).expression.node, ((Conditional_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("if" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383); match(If);
				setState(384); match(LPAREN);
				setState(385); ((Conditional_statementContext)_localctx).expression = expression();
				setState(386); match(RPAREN);
				setState(387); match(LBRACE);
				setState(388); ((Conditional_statementContext)_localctx).n = statement_list(0);
				setState(389); match(RBRACE);
				setState(390); match(Else);
				setState(391); match(LBRACE);
				setState(392); ((Conditional_statementContext)_localctx).m = statement_list(0);
				setState(393); match(RBRACE);
				((Conditional_statementContext)_localctx).node =  new LOGOConditionalNode("if_else", ((Conditional_statementContext)_localctx).expression.node, ((Conditional_statementContext)_localctx).n.node, ((Conditional_statementContext)_localctx).m.node); LOGOPP.io.debug("if_else" + _localctx.node.id);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_statementContext extends ParserRuleContext {
		public LOGONode node;
		public ExpressionContext expression;
		public Statement_listContext statement_list;
		public IdContext id;
		public For_expressionContext for_expression;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_expressionContext for_expression() {
			return getRuleContext(For_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode While() { return getToken(GrammarParser.While, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode For() { return getToken(GrammarParser.For, 0); }
		public TerminalNode Repeat() { return getToken(GrammarParser.Repeat, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iteration_statement);
		try {
			setState(434);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); match(While);
				setState(399); match(LPAREN);
				setState(400); ((Iteration_statementContext)_localctx).expression = expression();
				setState(401); match(RPAREN);
				setState(402); match(LBRACE);
				setState(403); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(404); match(RBRACE);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("while", ((Iteration_statementContext)_localctx).expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("while" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); match(For);
				setState(408); ((Iteration_statementContext)_localctx).id = id();
				setState(409); match(7);
				setState(410); ((Iteration_statementContext)_localctx).for_expression = for_expression();
				setState(411); match(LBRACE);
				setState(412); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(413); match(RBRACE);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("for", ((Iteration_statementContext)_localctx).id.node, ((Iteration_statementContext)_localctx).for_expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("for" + _localctx.node.id);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416); match(For);
				setState(417); match(LPAREN);
				setState(418); ((Iteration_statementContext)_localctx).id = id();
				setState(419); match(7);
				setState(420); ((Iteration_statementContext)_localctx).for_expression = for_expression();
				setState(421); match(RPAREN);
				setState(422); match(LBRACE);
				setState(423); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(424); match(RBRACE);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("for", ((Iteration_statementContext)_localctx).id.node, ((Iteration_statementContext)_localctx).for_expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("for" + _localctx.node.id);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427); match(Repeat);
				setState(428); ((Iteration_statementContext)_localctx).expression = expression();
				setState(429); match(LBRACE);
				setState(430); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(431); match(RBRACE);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("repeat", ((Iteration_statementContext)_localctx).expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("repeat" + _localctx.node.id);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public ExpressionContext o;
		public ExpressionContext q;
		public ExpressionContext p;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_expression(this);
		}
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_expression);
		try {
			setState(448);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436); ((For_expressionContext)_localctx).o = expression();
				setState(437); match(5);
				setState(438); ((For_expressionContext)_localctx).q = expression();
				((For_expressionContext)_localctx).node =  new LOGOIterationNode("for_expr1", ((For_expressionContext)_localctx).o.node, ((For_expressionContext)_localctx).q.node); LOGOPP.io.debug("for_expr1" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441); ((For_expressionContext)_localctx).o = expression();
				setState(442); match(5);
				setState(443); ((For_expressionContext)_localctx).p = expression();
				setState(444); match(5);
				setState(445); ((For_expressionContext)_localctx).q = expression();
				((For_expressionContext)_localctx).node =  new LOGOIterationNode("for_expr2", ((For_expressionContext)_localctx).o.node, ((For_expressionContext)_localctx).p.node, ((For_expressionContext)_localctx).q.node); LOGOPP.io.debug("for_expr2" + _localctx.node.id);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public LOGONode node;
		public IdContext id;
		public Statement_listContext statement_list;
		public Identifier_listContext identifier_list;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public TerminalNode Function() { return getToken(GrammarParser.Function, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_definition);
		try {
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450); match(Function);
				setState(451); ((Function_definitionContext)_localctx).id = id();
				setState(452); match(LPAREN);
				setState(453); match(RPAREN);
				setState(454); match(LBRACE);
				setState(455); ((Function_definitionContext)_localctx).statement_list = statement_list(0);
				setState(456); match(RBRACE);
				((Function_definitionContext)_localctx).node =  new LOGOFunctionNode(((Function_definitionContext)_localctx).id.node, "define",  null, ((Function_definitionContext)_localctx).statement_list.node);LOGOPP.io.debug("func_noarg");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459); match(Function);
				setState(460); ((Function_definitionContext)_localctx).id = id();
				setState(461); match(LPAREN);
				setState(462); ((Function_definitionContext)_localctx).identifier_list = identifier_list();
				setState(463); match(RPAREN);
				setState(464); match(LBRACE);
				setState(465); ((Function_definitionContext)_localctx).statement_list = statement_list(0);
				setState(466); match(RBRACE);
				((Function_definitionContext)_localctx).node =  new LOGOFunctionNode(((Function_definitionContext)_localctx).id.node, "define", ((Function_definitionContext)_localctx).identifier_list.list, ((Function_definitionContext)_localctx).statement_list.node);LOGOPP.io.debug("func_arg");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public LOGOIdList list;
		public Token Identifier;
		public Identifier_listContext n;
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(GrammarParser.Identifier, 0); }
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_identifier_list);
		try {
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471); ((Identifier_listContext)_localctx).Identifier = match(Identifier);
				setState(472); match(2);
				setState(473); ((Identifier_listContext)_localctx).n = identifier_list();
				((Identifier_listContext)_localctx).list =  new LOGOIdList((((Identifier_listContext)_localctx).Identifier!=null?((Identifier_listContext)_localctx).Identifier.getText():null), ((Identifier_listContext)_localctx).n.list); LOGOPP.io.debug("ID_list");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476); ((Identifier_listContext)_localctx).Identifier = match(Identifier);
				((Identifier_listContext)_localctx).list =  new LOGOIdList((((Identifier_listContext)_localctx).Identifier!=null?((Identifier_listContext)_localctx).Identifier.getText():null)); LOGOPP.io.debug("ID_list tail");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncallContext extends ParserRuleContext {
		public LOGONode node;
		public IdContext id;
		public Expression_listContext expression_list;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFuncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFuncall(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); ((FuncallContext)_localctx).id = id();
			setState(481); match(LPAREN);
			setState(482); ((FuncallContext)_localctx).expression_list = expression_list(0);
			setState(483); match(RPAREN);
			((FuncallContext)_localctx).node =  new LOGOFunctionNode(((FuncallContext)_localctx).id.node, "execute", ((FuncallContext)_localctx).expression_list.node); LOGOPP.io.debug("funcall test");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChallengeContext extends ParserRuleContext {
		public LOGONode node;
		public Token String;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token Number;
		public TerminalNode Savechallenge() { return getToken(GrammarParser.Savechallenge, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Removehint() { return getToken(GrammarParser.Removehint, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Number() { return getToken(GrammarParser.Number, 0); }
		public TerminalNode Recordchallenge() { return getToken(GrammarParser.Recordchallenge, 0); }
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Match() { return getToken(GrammarParser.Match, 0); }
		public TerminalNode Hint() { return getToken(GrammarParser.Hint, 0); }
		public TerminalNode Challenge() { return getToken(GrammarParser.Challenge, 0); }
		public TerminalNode Quit() { return getToken(GrammarParser.Quit, 0); }
		public ChallengeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_challenge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChallenge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChallenge(this);
		}
	}

	public final ChallengeContext challenge() throws RecognitionException {
		ChallengeContext _localctx = new ChallengeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_challenge);
		try {
			setState(521);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486); match(Challenge);
				setState(487); ((ChallengeContext)_localctx).String = match(String);
				 LOGONode temp = new LOGOLeaf((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null)); ((ChallengeContext)_localctx).node =  new LOGOChallengeNode("CHALLENGE", temp); System.out.println((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489); match(Match);
				((ChallengeContext)_localctx).node =  new LOGOChallengeNode("MATCH"); System.out.println("Match");
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(491); match(Quit);
				((ChallengeContext)_localctx).node =  new LOGOChallengeNode("QUIT"); System.out.println("quit");
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493); match(Recordchallenge);
				((ChallengeContext)_localctx).node =  new LOGOChallengeNode("RECORD");
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(495); match(Recordchallenge);
				setState(496); ((ChallengeContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null)); ((ChallengeContext)_localctx).node =  new LOGOChallengeNode("RECORD", temp);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(498); match(Hint);
				((ChallengeContext)_localctx).node =  new LOGOChallengeNode("SHOWHINT");
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(500); match(Hint);
				setState(501); match(LPAREN);
				setState(502); ((ChallengeContext)_localctx).String = match(String);
				setState(503); match(2);
				setState(504); ((ChallengeContext)_localctx).e1 = expression();
				setState(505); match(2);
				setState(506); ((ChallengeContext)_localctx).e2 = expression();
				setState(507); match(RPAREN);
				LOGONode temp = new LOGOLeaf((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null)); ((ChallengeContext)_localctx).node =  new LOGOChallengeNode("WRITEHINT", temp, ((ChallengeContext)_localctx).e1.node, ((ChallengeContext)_localctx).e2.node);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(510); match(Hint);
				setState(511); ((ChallengeContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null)); ((ChallengeContext)_localctx).node =  new LOGOChallengeNode("WRITEHINT", temp);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(513); match(Removehint);
				setState(514); ((ChallengeContext)_localctx).Number = match(Number);
				LOGONode temp = new LOGOLeaf((((ChallengeContext)_localctx).Number!=null?((ChallengeContext)_localctx).Number.getText():null)); ((ChallengeContext)_localctx).node =  new LOGOChallengeNode("REMOVEHINT", temp);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(516); match(Removehint);
				((ChallengeContext)_localctx).node =  new LOGOChallengeNode("REMOVEALLHINT");
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(518); match(Savechallenge);
				setState(519); ((ChallengeContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null)); ((ChallengeContext)_localctx).node =  new LOGOChallengeNode("SAVE", temp);
				}
				break;
			}
		}
		catch (RecognitionException e) {
			throw e;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return statement_list_sempred((Statement_listContext)_localctx, predIndex);

		case 8: return or_expression_sempred((Or_expressionContext)_localctx, predIndex);

		case 9: return and_expression_sempred((And_expressionContext)_localctx, predIndex);

		case 10: return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);

		case 11: return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);

		case 12: return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);

		case 13: return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);

		case 16: return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);

		case 17: return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return 3 >= _localctx._p;

		case 10: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: return 5 >= _localctx._p;
		}
		return true;
	}
	private boolean or_expression_sempred(Or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 3 >= _localctx._p;

		case 4: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return 4 >= _localctx._p;

		case 12: return 3 >= _localctx._p;

		case 13: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return 5 >= _localctx._p;

		case 6: return 4 >= _localctx._p;

		case 7: return 3 >= _localctx._p;

		case 8: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3D\u020e\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3P\n\3\f\3\16\3S\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0081\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00b2\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c0\n"+
		"\n\f\n\16\n\u00c3\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u00ce\n\13\f\13\16\13\u00d1\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e1\n\f\f\f\16\f\u00e4\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00fe\n\r\f\r\16\r\u0101\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0111\n\16\f\16"+
		"\16\16\u0114\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0129\n\17\f\17\16\17"+
		"\u012c\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0135\n\20\3\21\3"+
		"\21\3\21\3\21\5\21\u013b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0144\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u014c\n\22\f\22\16\22\u014f"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u0156\n\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u015d\n\23\f\23\16\23\u0160\13\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u016f\n\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u018f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01b5\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01c3\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u01d8\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u01e1\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u020c\n\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668\2\2\u0239\2E\3\2\2\2\4G\3\2\2\2\6c\3\2"+
		"\2\2\bk\3\2\2\2\n\u0080\3\2\2\2\f\u009d\3\2\2\2\16\u00b1\3\2\2\2\20\u00b3"+
		"\3\2\2\2\22\u00b6\3\2\2\2\24\u00c4\3\2\2\2\26\u00d2\3\2\2\2\30\u00e5\3"+
		"\2\2\2\32\u0102\3\2\2\2\34\u0115\3\2\2\2\36\u0134\3\2\2\2 \u013a\3\2\2"+
		"\2\"\u0143\3\2\2\2$\u0155\3\2\2\2&\u016e\3\2\2\2(\u0170\3\2\2\2*\u0173"+
		"\3\2\2\2,\u018e\3\2\2\2.\u01b4\3\2\2\2\60\u01c2\3\2\2\2\62\u01d7\3\2\2"+
		"\2\64\u01e0\3\2\2\2\66\u01e2\3\2\2\28\u020b\3\2\2\2:;\5\4\3\2;<\7\1\2"+
		"\2<=\b\2\1\2=F\3\2\2\2>?\58\35\2?@\7\1\2\2@A\b\2\1\2AF\3\2\2\2BC\79\2"+
		"\2CD\7C\2\2DF\7\1\2\2E:\3\2\2\2E>\3\2\2\2EB\3\2\2\2F\3\3\2\2\2GH\b\3\1"+
		"\2HI\5\6\4\2IJ\b\3\1\2JQ\3\2\2\2KL\6\3\2\3LM\5\6\4\2MN\b\3\1\2NP\3\2\2"+
		"\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\5\3\2\2\2SQ\3\2\2\2TU\5\62"+
		"\32\2UV\b\4\1\2Vd\3\2\2\2WX\5\b\5\2XY\b\4\1\2Yd\3\2\2\2Z[\5\20\t\2[\\"+
		"\b\4\1\2\\d\3\2\2\2]^\5,\27\2^_\b\4\1\2_d\3\2\2\2`a\5.\30\2ab\b\4\1\2"+
		"bd\3\2\2\2cT\3\2\2\2cW\3\2\2\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2d\7\3\2\2"+
		"\2ef\5\n\6\2fg\b\5\1\2gl\3\2\2\2hi\5\f\7\2ij\b\5\1\2jl\3\2\2\2ke\3\2\2"+
		"\2kh\3\2\2\2l\t\3\2\2\2mn\7$\2\2n\u0081\b\6\1\2op\7\34\2\2p\u0081\b\6"+
		"\1\2qr\7\35\2\2r\u0081\b\6\1\2s\u0081\7\36\2\2tu\7\37\2\2u\u0081\b\6\1"+
		"\2vw\7 \2\2w\u0081\b\6\1\2xy\7%\2\2y\u0081\b\6\1\2z{\7&\2\2{\u0081\b\6"+
		"\1\2|}\7+\2\2}\u0081\b\6\1\2~\177\7*\2\2\177\u0081\b\6\1\2\u0080m\3\2"+
		"\2\2\u0080o\3\2\2\2\u0080q\3\2\2\2\u0080s\3\2\2\2\u0080t\3\2\2\2\u0080"+
		"v\3\2\2\2\u0080x\3\2\2\2\u0080z\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2"+
		"\u0081\13\3\2\2\2\u0082\u0083\5\16\b\2\u0083\u0084\5\20\t\2\u0084\u0085"+
		"\b\7\1\2\u0085\u009e\3\2\2\2\u0086\u0087\7\31\2\2\u0087\u0088\7\61\2\2"+
		"\u0088\u0089\5\20\t\2\u0089\u008a\7\4\2\2\u008a\u008b\5\20\t\2\u008b\u008c"+
		"\7\62\2\2\u008c\u008d\b\7\1\2\u008d\u009e\3\2\2\2\u008e\u008f\7(\2\2\u008f"+
		"\u0090\7C\2\2\u0090\u009e\b\7\1\2\u0091\u0092\7\'\2\2\u0092\u0093\7C\2"+
		"\2\u0093\u009e\b\7\1\2\u0094\u0095\7\33\2\2\u0095\u0096\7C\2\2\u0096\u009e"+
		"\b\7\1\2\u0097\u0098\7,\2\2\u0098\u0099\7C\2\2\u0099\u009e\b\7\1\2\u009a"+
		"\u009b\7-\2\2\u009b\u009c\7C\2\2\u009c\u009e\b\7\1\2\u009d\u0082\3\2\2"+
		"\2\u009d\u0086\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0091\3\2\2\2\u009d\u0094"+
		"\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e\r\3\2\2\2\u009f"+
		"\u00a0\7\23\2\2\u00a0\u00b2\b\b\1\2\u00a1\u00a2\7\24\2\2\u00a2\u00b2\b"+
		"\b\1\2\u00a3\u00a4\7\25\2\2\u00a4\u00b2\b\b\1\2\u00a5\u00a6\7\26\2\2\u00a6"+
		"\u00b2\b\b\1\2\u00a7\u00a8\7\27\2\2\u00a8\u00b2\b\b\1\2\u00a9\u00aa\7"+
		"\30\2\2\u00aa\u00b2\b\b\1\2\u00ab\u00ac\7\32\2\2\u00ac\u00b2\b\b\1\2\u00ad"+
		"\u00ae\7\33\2\2\u00ae\u00b2\b\b\1\2\u00af\u00b0\7)\2\2\u00b0\u00b2\b\b"+
		"\1\2\u00b1\u009f\3\2\2\2\u00b1\u00a1\3\2\2\2\u00b1\u00a3\3\2\2\2\u00b1"+
		"\u00a5\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b4"+
		"\5\22\n\2\u00b4\u00b5\b\t\1\2\u00b5\21\3\2\2\2\u00b6\u00b7\b\n\1\2\u00b7"+
		"\u00b8\5\24\13\2\u00b8\u00b9\b\n\1\2\u00b9\u00c1\3\2\2\2\u00ba\u00bb\6"+
		"\n\3\3\u00bb\u00bc\7\r\2\2\u00bc\u00bd\5\24\13\2\u00bd\u00be\b\n\1\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\b\13\1\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\b\13\1\2\u00c7\u00cf\3\2\2"+
		"\2\u00c8\u00c9\6\13\4\3\u00c9\u00ca\7\f\2\2\u00ca\u00cb\5\26\f\2\u00cb"+
		"\u00cc\b\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\u00d1\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\25\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\b\f\1\2\u00d3\u00d4\5\30\r\2\u00d4\u00d5\b"+
		"\f\1\2\u00d5\u00e2\3\2\2\2\u00d6\u00d7\6\f\5\3\u00d7\u00d8\7\t\2\2\u00d8"+
		"\u00d9\5\30\r\2\u00d9\u00da\b\f\1\2\u00da\u00e1\3\2\2\2\u00db\u00dc\6"+
		"\f\6\3\u00dc\u00dd\7\n\2\2\u00dd\u00de\5\30\r\2\u00de\u00df\b\f\1\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\27\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\b\r\1\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8\b\r\1\2"+
		"\u00e8\u00ff\3\2\2\2\u00e9\u00ea\6\r\7\3\u00ea\u00eb\7\b\2\2\u00eb\u00ec"+
		"\5\32\16\2\u00ec\u00ed\b\r\1\2\u00ed\u00fe\3\2\2\2\u00ee\u00ef\6\r\b\3"+
		"\u00ef\u00f0\7\16\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2\b\r\1\2\u00f2"+
		"\u00fe\3\2\2\2\u00f3\u00f4\6\r\t\3\u00f4\u00f5\7\20\2\2\u00f5\u00f6\5"+
		"\32\16\2\u00f6\u00f7\b\r\1\2\u00f7\u00fe\3\2\2\2\u00f8\u00f9\6\r\n\3\u00f9"+
		"\u00fa\7\13\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\b\r\1\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fd\u00ee\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd"+
		"\u00f8\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\31\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\b\16\1\2\u0103\u0104"+
		"\5\34\17\2\u0104\u0105\b\16\1\2\u0105\u0112\3\2\2\2\u0106\u0107\6\16\13"+
		"\3\u0107\u0108\7\5\2\2\u0108\u0109\5\34\17\2\u0109\u010a\b\16\1\2\u010a"+
		"\u0111\3\2\2\2\u010b\u010c\6\16\f\3\u010c\u010d\7\21\2\2\u010d\u010e\5"+
		"\34\17\2\u010e\u010f\b\16\1\2\u010f\u0111\3\2\2\2\u0110\u0106\3\2\2\2"+
		"\u0110\u010b\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\33\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\b\17\1\2\u0116"+
		"\u0117\5\36\20\2\u0117\u0118\b\17\1\2\u0118\u012a\3\2\2\2\u0119\u011a"+
		"\6\17\r\3\u011a\u011b\7\6\2\2\u011b\u011c\5\36\20\2\u011c\u011d\b\17\1"+
		"\2\u011d\u0129\3\2\2\2\u011e\u011f\6\17\16\3\u011f\u0120\7\17\2\2\u0120"+
		"\u0121\5\36\20\2\u0121\u0122\b\17\1\2\u0122\u0129\3\2\2\2\u0123\u0124"+
		"\6\17\17\3\u0124\u0125\7\3\2\2\u0125\u0126\5\36\20\2\u0126\u0127\b\17"+
		"\1\2\u0127\u0129\3\2\2\2\u0128\u0119\3\2\2\2\u0128\u011e\3\2\2\2\u0128"+
		"\u0123\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\35\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\5\"\22\2\u012e\u012f"+
		"\b\20\1\2\u012f\u0135\3\2\2\2\u0130\u0131\5 \21\2\u0131\u0132\5&\24\2"+
		"\u0132\u0133\b\20\1\2\u0133\u0135\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u0130"+
		"\3\2\2\2\u0135\37\3\2\2\2\u0136\u0137\7\21\2\2\u0137\u013b\b\21\1\2\u0138"+
		"\u0139\7\22\2\2\u0139\u013b\b\21\1\2\u013a\u0136\3\2\2\2\u013a\u0138\3"+
		"\2\2\2\u013b!\3\2\2\2\u013c\u013d\b\22\1\2\u013d\u0144\7!\2\2\u013e\u0144"+
		"\7\"\2\2\u013f\u0144\7#\2\2\u0140\u0141\5&\24\2\u0141\u0142\b\22\1\2\u0142"+
		"\u0144\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u013f\3\2"+
		"\2\2\u0143\u0140\3\2\2\2\u0144\u014d\3\2\2\2\u0145\u0146\6\22\20\3\u0146"+
		"\u0147\7\61\2\2\u0147\u0148\5$\23\2\u0148\u0149\7\62\2\2\u0149\u014a\b"+
		"\22\1\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e#\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u0150\u0151\b\23\1\2\u0151\u0152\5\20\t\2\u0152\u0153\b\23\1\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0156\b\23\1\2\u0155\u0150\3\2\2\2\u0155\u0154\3"+
		"\2\2\2\u0156\u015e\3\2\2\2\u0157\u0158\6\23\21\3\u0158\u0159\7\4\2\2\u0159"+
		"\u015a\5\20\t\2\u015a\u015b\b\23\1\2\u015b\u015d\3\2\2\2\u015c\u0157\3"+
		"\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"%\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7A\2\2\u0162\u016f\b\24\1\2"+
		"\u0163\u0164\7\61\2\2\u0164\u0165\5\20\t\2\u0165\u0166\7\62\2\2\u0166"+
		"\u0167\b\24\1\2\u0167\u016f\3\2\2\2\u0168\u0169\5*\26\2\u0169\u016a\b"+
		"\24\1\2\u016a\u016f\3\2\2\2\u016b\u016c\5(\25\2\u016c\u016d\b\24\1\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0161\3\2\2\2\u016e\u0163\3\2\2\2\u016e\u0168\3\2"+
		"\2\2\u016e\u016b\3\2\2\2\u016f\'\3\2\2\2\u0170\u0171\7B\2\2\u0171\u0172"+
		"\b\25\1\2\u0172)\3\2\2\2\u0173\u0174\7.\2\2\u0174\u0175\5(\25\2\u0175"+
		"\u0176\5\20\t\2\u0176\u0177\b\26\1\2\u0177+\3\2\2\2\u0178\u0179\7/\2\2"+
		"\u0179\u017a\7\61\2\2\u017a\u017b\5\20\t\2\u017b\u017c\7\62\2\2\u017c"+
		"\u017d\7\63\2\2\u017d\u017e\5\4\3\2\u017e\u017f\7\64\2\2\u017f\u0180\b"+
		"\27\1\2\u0180\u018f\3\2\2\2\u0181\u0182\7/\2\2\u0182\u0183\7\61\2\2\u0183"+
		"\u0184\5\20\t\2\u0184\u0185\7\62\2\2\u0185\u0186\7\63\2\2\u0186\u0187"+
		"\5\4\3\2\u0187\u0188\7\64\2\2\u0188\u0189\7\60\2\2\u0189\u018a\7\63\2"+
		"\2\u018a\u018b\5\4\3\2\u018b\u018c\7\64\2\2\u018c\u018d\b\27\1\2\u018d"+
		"\u018f\3\2\2\2\u018e\u0178\3\2\2\2\u018e\u0181\3\2\2\2\u018f-\3\2\2\2"+
		"\u0190\u0191\7\65\2\2\u0191\u0192\7\61\2\2\u0192\u0193\5\20\t\2\u0193"+
		"\u0194\7\62\2\2\u0194\u0195\7\63\2\2\u0195\u0196\5\4\3\2\u0196\u0197\7"+
		"\64\2\2\u0197\u0198\b\30\1\2\u0198\u01b5\3\2\2\2\u0199\u019a\7\66\2\2"+
		"\u019a\u019b\5(\25\2\u019b\u019c\7\t\2\2\u019c\u019d\5\60\31\2\u019d\u019e"+
		"\7\63\2\2\u019e\u019f\5\4\3\2\u019f\u01a0\7\64\2\2\u01a0\u01a1\b\30\1"+
		"\2\u01a1\u01b5\3\2\2\2\u01a2\u01a3\7\66\2\2\u01a3\u01a4\7\61\2\2\u01a4"+
		"\u01a5\5(\25\2\u01a5\u01a6\7\t\2\2\u01a6\u01a7\5\60\31\2\u01a7\u01a8\7"+
		"\62\2\2\u01a8\u01a9\7\63\2\2\u01a9\u01aa\5\4\3\2\u01aa\u01ab\7\64\2\2"+
		"\u01ab\u01ac\b\30\1\2\u01ac\u01b5\3\2\2\2\u01ad\u01ae\7\67\2\2\u01ae\u01af"+
		"\5\20\t\2\u01af\u01b0\7\63\2\2\u01b0\u01b1\5\4\3\2\u01b1\u01b2\7\64\2"+
		"\2\u01b2\u01b3\b\30\1\2\u01b3\u01b5\3\2\2\2\u01b4\u0190\3\2\2\2\u01b4"+
		"\u0199\3\2\2\2\u01b4\u01a2\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b5/\3\2\2\2"+
		"\u01b6\u01b7\5\20\t\2\u01b7\u01b8\7\7\2\2\u01b8\u01b9\5\20\t\2\u01b9\u01ba"+
		"\b\31\1\2\u01ba\u01c3\3\2\2\2\u01bb\u01bc\5\20\t\2\u01bc\u01bd\7\7\2\2"+
		"\u01bd\u01be\5\20\t\2\u01be\u01bf\7\7\2\2\u01bf\u01c0\5\20\t\2\u01c0\u01c1"+
		"\b\31\1\2\u01c1\u01c3\3\2\2\2\u01c2\u01b6\3\2\2\2\u01c2\u01bb\3\2\2\2"+
		"\u01c3\61\3\2\2\2\u01c4\u01c5\78\2\2\u01c5\u01c6\5(\25\2\u01c6\u01c7\7"+
		"\61\2\2\u01c7\u01c8\7\62\2\2\u01c8\u01c9\7\63\2\2\u01c9\u01ca\5\4\3\2"+
		"\u01ca\u01cb\7\64\2\2\u01cb\u01cc\b\32\1\2\u01cc\u01d8\3\2\2\2\u01cd\u01ce"+
		"\78\2\2\u01ce\u01cf\5(\25\2\u01cf\u01d0\7\61\2\2\u01d0\u01d1\5\64\33\2"+
		"\u01d1\u01d2\7\62\2\2\u01d2\u01d3\7\63\2\2\u01d3\u01d4\5\4\3\2\u01d4\u01d5"+
		"\7\64\2\2\u01d5\u01d6\b\32\1\2\u01d6\u01d8\3\2\2\2\u01d7\u01c4\3\2\2\2"+
		"\u01d7\u01cd\3\2\2\2\u01d8\63\3\2\2\2\u01d9\u01da\7B\2\2\u01da\u01db\7"+
		"\4\2\2\u01db\u01dc\5\64\33\2\u01dc\u01dd\b\33\1\2\u01dd\u01e1\3\2\2\2"+
		"\u01de\u01df\7B\2\2\u01df\u01e1\b\33\1\2\u01e0\u01d9\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\65\3\2\2\2\u01e2\u01e3\5(\25\2\u01e3\u01e4\7\61\2\2\u01e4"+
		"\u01e5\5$\23\2\u01e5\u01e6\7\62\2\2\u01e6\u01e7\b\34\1\2\u01e7\67\3\2"+
		"\2\2\u01e8\u01e9\7:\2\2\u01e9\u01ea\7C\2\2\u01ea\u020c\b\35\1\2\u01eb"+
		"\u01ec\7;\2\2\u01ec\u020c\b\35\1\2\u01ed\u01ee\7<\2\2\u01ee\u020c\b\35"+
		"\1\2\u01ef\u01f0\7=\2\2\u01f0\u020c\b\35\1\2\u01f1\u01f2\7=\2\2\u01f2"+
		"\u01f3\7C\2\2\u01f3\u020c\b\35\1\2\u01f4\u01f5\7>\2\2\u01f5\u020c\b\35"+
		"\1\2\u01f6\u01f7\7>\2\2\u01f7\u01f8\7\61\2\2\u01f8\u01f9\7C\2\2\u01f9"+
		"\u01fa\7\4\2\2\u01fa\u01fb\5\20\t\2\u01fb\u01fc\7\4\2\2\u01fc\u01fd\5"+
		"\20\t\2\u01fd\u01fe\7\62\2\2\u01fe\u01ff\b\35\1\2\u01ff\u020c\3\2\2\2"+
		"\u0200\u0201\7>\2\2\u0201\u0202\7C\2\2\u0202\u020c\b\35\1\2\u0203\u0204"+
		"\7?\2\2\u0204\u0205\7A\2\2\u0205\u020c\b\35\1\2\u0206\u0207\7?\2\2\u0207"+
		"\u020c\b\35\1\2\u0208\u0209\7@\2\2\u0209\u020a\7C\2\2\u020a\u020c\b\35"+
		"\1\2\u020b\u01e8\3\2\2\2\u020b\u01eb\3\2\2\2\u020b\u01ed\3\2\2\2\u020b"+
		"\u01ef\3\2\2\2\u020b\u01f1\3\2\2\2\u020b\u01f4\3\2\2\2\u020b\u01f6\3\2"+
		"\2\2\u020b\u0200\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u0206\3\2\2\2\u020b"+
		"\u0208\3\2\2\2\u020c9\3\2\2\2 EQck\u0080\u009d\u00b1\u00c1\u00cf\u00e0"+
		"\u00e2\u00fd\u00ff\u0110\u0112\u0128\u012a\u0134\u013a\u0143\u014d\u0155"+
		"\u015e\u016e\u018e\u01b4\u01c2\u01d7\u01e0\u020b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}