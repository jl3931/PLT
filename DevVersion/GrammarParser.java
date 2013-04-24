// Generated from Grammar.g by ANTLR 4.0
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
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, Unary_operator=15, Forward=16, 
		Back=17, Left=18, Right=19, Setx=20, Sety=21, Setxy=22, Speed=23, Print=24, 
		Clearscreen=25, Origin=26, Wrap=27, Fence=28, Getx=29, Gety=30, Getxy=31, 
		Penup=32, Pendown=33, Hideturtle=34, Showturtle=35, Set=36, If=37, Else=38, 
		LPAREN=39, RPAREN=40, LBRACKET=41, RBRACKET=42, While=43, For=44, Repeat=45, 
		Function=46, Challenge=47, Match=48, Quit=49, Number=50, Identifier=51, 
		String=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'^'", "','", "'+'", "'*'", "':'", "'<'", "'='", "'!='", 
		"'<='", "'&&'", "'||'", "'>'", "'/'", "'>='", "'-'", "Forward", "Back", 
		"Left", "Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", 
		"Origin", "Wrap", "Fence", "Getx", "Gety", "Getxy", "Penup", "Pendown", 
		"Hideturtle", "Showturtle", "Set", "'if'", "'else'", "'('", "')'", "'['", 
		"']'", "'while'", "'for'", "Repeat", "Function", "Challenge", "Match", 
		"Quit", "Number", "Identifier", "String", "WS"
	};
	public static final int
		RULE_line = 0, RULE_statement_list = 1, RULE_statement = 2, RULE_commands = 3, 
		RULE_command_noarg = 4, RULE_command_expr = 5, RULE_command = 6, RULE_expression = 7, 
		RULE_or_expression = 8, RULE_and_expression = 9, RULE_equality_expression = 10, 
		RULE_relational_expression = 11, RULE_additive_expression = 12, RULE_multiplicative_expression = 13, 
		RULE_unary_expression = 14, RULE_postfix_expression = 15, RULE_expression_list = 16, 
		RULE_primary_expression = 17, RULE_id = 18, RULE_assignment_expression = 19, 
		RULE_conditional_statement = 20, RULE_iteration_statement = 21, RULE_for_expression = 22, 
		RULE_function_definition = 23, RULE_identifier_list = 24, RULE_funcall = 25, 
		RULE_challenge = 26;
	public static final String[] ruleNames = {
		"line", "statement_list", "statement", "commands", "command_noarg", "command_expr", 
		"command", "expression", "or_expression", "and_expression", "equality_expression", 
		"relational_expression", "additive_expression", "multiplicative_expression", 
		"unary_expression", "postfix_expression", "expression_list", "primary_expression", 
		"id", "assignment_expression", "conditional_statement", "iteration_statement", 
		"for_expression", "function_definition", "identifier_list", "funcall", 
		"challenge"
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
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(54); ((LineContext)_localctx).statement_list = statement_list(0);
			setState(55); match(EOF);
			((LineContext)_localctx).node =  ((LineContext)_localctx).statement_list.node; LOGOPP.io.debug("line->stmt_list");
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
		public ChallengeContext challenge;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ChallengeContext challenge() {
			return getRuleContext(ChallengeContext.class,0);
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
			setState(65);
			switch (_input.LA(1)) {
			case Unary_operator:
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
			case Wrap:
			case Fence:
			case Getx:
			case Gety:
			case Getxy:
			case Penup:
			case Pendown:
			case Hideturtle:
			case Showturtle:
			case Set:
			case If:
			case LPAREN:
			case While:
			case For:
			case Repeat:
			case Function:
			case Number:
			case Identifier:
				{
				setState(59); ((Statement_listContext)_localctx).statement = statement();
				((Statement_listContext)_localctx).node =  ((Statement_listContext)_localctx).statement.node; LOGOPP.io.debug("stmt_list->stmt");
				}
				break;
			case Challenge:
			case Match:
			case Quit:
				{
				setState(62); ((Statement_listContext)_localctx).challenge = challenge();
				((Statement_listContext)_localctx).node =  ((Statement_listContext)_localctx).challenge.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
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
					setState(67);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(68); ((Statement_listContext)_localctx).statement = statement();
					((Statement_listContext)_localctx).n.node.children.add(((Statement_listContext)_localctx).statement.node); ((Statement_listContext)_localctx).node =  ((Statement_listContext)_localctx).n.node; LOGOPP.io.debug("stmt_list->stmt_list");
					}
					} 
				}
				setState(75);
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
			setState(91);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); ((StatementContext)_localctx).function_definition = function_definition();
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
			case Wrap:
			case Fence:
			case Getx:
			case Gety:
			case Getxy:
			case Penup:
			case Pendown:
			case Hideturtle:
			case Showturtle:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); ((StatementContext)_localctx).commands = commands();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).commands.node); LOGOPP.io.debug("stmt->cmd_list");
				}
				break;
			case Unary_operator:
			case Set:
			case LPAREN:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(82); ((StatementContext)_localctx).expression = expression();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).expression.node); LOGOPP.io.debug("stmt->expr");
				}
				break;
			case If:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); ((StatementContext)_localctx).conditional_statement = conditional_statement();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).conditional_statement.node); LOGOPP.io.debug("stmt->cond");
				}
				break;
			case While:
			case For:
			case Repeat:
				enterOuterAlt(_localctx, 5);
				{
				setState(88); ((StatementContext)_localctx).iteration_statement = iteration_statement();
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
			setState(99);
			switch (_input.LA(1)) {
			case Clearscreen:
			case Origin:
			case Wrap:
			case Fence:
			case Getx:
			case Gety:
			case Getxy:
			case Penup:
			case Pendown:
			case Hideturtle:
			case Showturtle:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); ((CommandsContext)_localctx).command_noarg = command_noarg();
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
				enterOuterAlt(_localctx, 2);
				{
				setState(96); ((CommandsContext)_localctx).command_expr = command_expr();
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
		public TerminalNode Showturtle() { return getToken(GrammarParser.Showturtle, 0); }
		public TerminalNode Hideturtle() { return getToken(GrammarParser.Hideturtle, 0); }
		public TerminalNode Pendown() { return getToken(GrammarParser.Pendown, 0); }
		public TerminalNode Getx() { return getToken(GrammarParser.Getx, 0); }
		public TerminalNode Gety() { return getToken(GrammarParser.Gety, 0); }
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
			setState(123);
			switch (_input.LA(1)) {
			case Getx:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); match(Getx);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETX");
				}
				break;
			case Gety:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); match(Gety);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETY");
				}
				break;
			case Getxy:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); match(Getxy);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETXY");
				}
				break;
			case Clearscreen:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); match(Clearscreen);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("CLEARSCREEN");
				}
				break;
			case Origin:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); match(Origin);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("ORIGIN");
				}
				break;
			case Wrap:
				enterOuterAlt(_localctx, 6);
				{
				setState(111); match(Wrap);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("WRAP");
				}
				break;
			case Fence:
				enterOuterAlt(_localctx, 7);
				{
				setState(113); match(Fence);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("FENCE");
				}
				break;
			case Penup:
				enterOuterAlt(_localctx, 8);
				{
				setState(115); match(Penup);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENUP");
				}
				break;
			case Pendown:
				enterOuterAlt(_localctx, 9);
				{
				setState(117); match(Pendown);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENDOWN");
				}
				break;
			case Showturtle:
				enterOuterAlt(_localctx, 10);
				{
				setState(119); match(Showturtle);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("SHOWTURTLE");
				}
				break;
			case Hideturtle:
				enterOuterAlt(_localctx, 11);
				{
				setState(121); match(Hideturtle);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
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
			setState(137);
			switch (_input.LA(1)) {
			case Forward:
			case Back:
			case Left:
			case Right:
			case Setx:
			case Sety:
			case Speed:
			case Print:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); ((Command_exprContext)_localctx).command = command();
				setState(126); ((Command_exprContext)_localctx).expression = expression();
				((Command_exprContext)_localctx).node =  new LOGOCommandNode(((Command_exprContext)_localctx).command.text, ((Command_exprContext)_localctx).expression.node);
				}
				break;
			case Setxy:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(Setxy);
				setState(130); match(LPAREN);
				setState(131); ((Command_exprContext)_localctx).a = expression();
				setState(132); match(2);
				setState(133); ((Command_exprContext)_localctx).b = expression();
				setState(134); match(RPAREN);
				((Command_exprContext)_localctx).node =  new LOGOCommandNode("SETXY", ((Command_exprContext)_localctx).a.node, ((Command_exprContext)_localctx).b.node);
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

	public static class CommandContext extends ParserRuleContext {
		public String text;
		public TerminalNode Right() { return getToken(GrammarParser.Right, 0); }
		public TerminalNode Speed() { return getToken(GrammarParser.Speed, 0); }
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
			setState(155);
			switch (_input.LA(1)) {
			case Forward:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(Forward);
				((CommandContext)_localctx).text =  new String("FORWARD");
				}
				break;
			case Back:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(Back);
				((CommandContext)_localctx).text =  new String("BACK");
				}
				break;
			case Left:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); match(Left);
				((CommandContext)_localctx).text =  new String("LEFT");
				}
				break;
			case Right:
				enterOuterAlt(_localctx, 4);
				{
				setState(145); match(Right);
				((CommandContext)_localctx).text =  new String("RIGHT");
				}
				break;
			case Setx:
				enterOuterAlt(_localctx, 5);
				{
				setState(147); match(Setx);
				((CommandContext)_localctx).text =  new String("SETX");
				}
				break;
			case Sety:
				enterOuterAlt(_localctx, 6);
				{
				setState(149); match(Sety);
				((CommandContext)_localctx).text =  new String("SETY");
				}
				break;
			case Speed:
				enterOuterAlt(_localctx, 7);
				{
				setState(151); match(Speed);
				((CommandContext)_localctx).text =  new String("SPEED");
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 8);
				{
				setState(153); match(Print);
				((CommandContext)_localctx).text =  new String("PRINT");
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
			setState(157); ((ExpressionContext)_localctx).or_expression = or_expression(0);
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
			setState(161); ((Or_expressionContext)_localctx).and_expression = and_expression(0);
			((Or_expressionContext)_localctx).node =  ((Or_expressionContext)_localctx).and_expression.node; LOGOPP.io.debug("or->and " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
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
					setState(164);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(165); match(11);
					setState(166); ((Or_expressionContext)_localctx).and_expression = and_expression(0);
					((Or_expressionContext)_localctx).node =  new LOGOOperatorNode("||", ((Or_expressionContext)_localctx).n.node, ((Or_expressionContext)_localctx).and_expression.node); LOGOPP.io.debug("or -> or || and " + _localctx.node.id);
					}
					} 
				}
				setState(173);
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
			setState(175); ((And_expressionContext)_localctx).equality_expression = equality_expression(0);
			((And_expressionContext)_localctx).node =  ((And_expressionContext)_localctx).equality_expression.node; LOGOPP.io.debug("and->eq " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
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
					setState(178);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(179); match(10);
					setState(180); ((And_expressionContext)_localctx).equality_expression = equality_expression(0);
					((And_expressionContext)_localctx).node =  new LOGOOperatorNode("&&", ((And_expressionContext)_localctx).n.node, ((And_expressionContext)_localctx).equality_expression.node); LOGOPP.io.debug("and-> and && eq " + _localctx.node.id);
					}
					} 
				}
				setState(187);
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
			setState(189); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
			((Equality_expressionContext)_localctx).node =  ((Equality_expressionContext)_localctx).relational_expression.node; LOGOPP.io.debug("eq->rel " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(192);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(193); match(7);
						setState(194); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
						((Equality_expressionContext)_localctx).node =  new LOGOOperatorNode("=", ((Equality_expressionContext)_localctx).n.node, ((Equality_expressionContext)_localctx).relational_expression.node); LOGOPP.io.debug("eq-> eq = rel " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(197);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(198); match(8);
						setState(199); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
						((Equality_expressionContext)_localctx).node =  new LOGOOperatorNode("!=", ((Equality_expressionContext)_localctx).n.node, ((Equality_expressionContext)_localctx).relational_expression.node); LOGOPP.io.debug("eq-> eq != rel " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(206);
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
			setState(208); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
			((Relational_expressionContext)_localctx).node =  ((Relational_expressionContext)_localctx).additive_expression.node; LOGOPP.io.debug("rel->add " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(211);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(212); match(6);
						setState(213); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode("<", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel<add " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(216);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(217); match(12);
						setState(218); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode(">", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel>add " + _localctx.node.id);
						}
						break;

					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(221);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(222); match(14);
						setState(223); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode(">=", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel>=add " + _localctx.node.id);
						}
						break;

					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(226);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(227); match(9);
						setState(228); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode("<=", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel<=add " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(235);
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
			setState(237); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
			((Additive_expressionContext)_localctx).node =  ((Additive_expressionContext)_localctx).multiplicative_expression.node; LOGOPP.io.debug("add->mul " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(240);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(241); match(3);
						setState(242); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("+", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add+mul " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(245);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(246); match(Unary_operator);
						setState(247); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("-", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add-mul " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(254);
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
			setState(256); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
			((Multiplicative_expressionContext)_localctx).node =  ((Multiplicative_expressionContext)_localctx).unary_expression.node; LOGOPP.io.debug("mul->unary " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(259);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(260); match(4);
						setState(261); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("*", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul*unary " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(264);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(265); match(13);
						setState(266); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("/", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul/unary " + _localctx.node.id);
						}
						break;

					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(269);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(270); match(1);
						setState(271); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("^", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul^unary " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(278);
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
		public Primary_expressionContext primary_expression;
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode Unary_operator() { return getToken(GrammarParser.Unary_operator, 0); }
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
			setState(286);
			switch (_input.LA(1)) {
			case Set:
			case LPAREN:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); ((Unary_expressionContext)_localctx).postfix_expression = postfix_expression(0);
				((Unary_expressionContext)_localctx).node =  ((Unary_expressionContext)_localctx).postfix_expression.node; LOGOPP.io.debug("unary->postfix " + _localctx.node.id);
				}
				break;
			case Unary_operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(Unary_operator);
				setState(283); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
				((Unary_expressionContext)_localctx).node =  new LOGOOperatorNode("u-", ((Unary_expressionContext)_localctx).primary_expression.node); LOGOPP.io.debug("unary->primary " + _localctx.node.id);
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
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
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
		int _startState = 30;
		enterRecursionRule(_localctx, RULE_postfix_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289); ((Postfix_expressionContext)_localctx).primary_expression = primary_expression();
			((Postfix_expressionContext)_localctx).node =  ((Postfix_expressionContext)_localctx).primary_expression.node; LOGOPP.io.debug("postfix->primary " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
					setState(292);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(293); match(LPAREN);
					setState(294); ((Postfix_expressionContext)_localctx).expression_list = expression_list(0);
					setState(295); match(RPAREN);
					((Postfix_expressionContext)_localctx).node =  new LOGOFunctionNode(((Postfix_expressionContext)_localctx).n.node, "execute", ((Postfix_expressionContext)_localctx).expression_list.node); LOGOPP.io.debug("funcall test");
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(304); ((Expression_listContext)_localctx).expression = expression();
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
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState, _p);
					_localctx.n = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(310);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(311); match(2);
					setState(312); ((Expression_listContext)_localctx).expression = expression();
					((Expression_listContext)_localctx).n.node.children.add(((Expression_listContext)_localctx).expression.node); ((Expression_listContext)_localctx).node =  ((Expression_listContext)_localctx).n.node; LOGOPP.io.debug("expression_list");
					}
					} 
				}
				setState(319);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public LOGONode node;
		public Token Number;
		public Expression_listContext expression_list;
		public Assignment_expressionContext assignment_expression;
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
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
		enterRule(_localctx, 34, RULE_primary_expression);
		try {
			setState(333);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); ((Primary_expressionContext)_localctx).Number = match(Number);
				((Primary_expressionContext)_localctx).node =  new LOGOLeaf((((Primary_expressionContext)_localctx).Number!=null?((Primary_expressionContext)_localctx).Number.getText():null)); LOGOPP.io.debug("Number " + _localctx.node.id);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); match(LPAREN);
				setState(323); ((Primary_expressionContext)_localctx).expression_list = expression_list(0);
				setState(324); match(RPAREN);
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).expression_list.node; LOGOPP.io.debug("parentheses");
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 3);
				{
				setState(327); ((Primary_expressionContext)_localctx).assignment_expression = assignment_expression();
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).assignment_expression.node; LOGOPP.io.debug("SET");
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(330); ((Primary_expressionContext)_localctx).id = id();
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
		enterRule(_localctx, 36, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); ((IdContext)_localctx).Identifier = match(Identifier);
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
		enterRule(_localctx, 38, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(Set);
			setState(339); ((Assignment_expressionContext)_localctx).id = id();
			setState(340); ((Assignment_expressionContext)_localctx).expression = expression();
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
		public List<TerminalNode> LBRACKET() { return getTokens(GrammarParser.LBRACKET); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GrammarParser.RBRACKET); }
		public TerminalNode Else() { return getToken(GrammarParser.Else, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GrammarParser.RBRACKET, i);
		}
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public TerminalNode If() { return getToken(GrammarParser.If, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GrammarParser.LBRACKET, i);
		}
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
		enterRule(_localctx, 40, RULE_conditional_statement);
		try {
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343); match(If);
				setState(344); match(LPAREN);
				setState(345); ((Conditional_statementContext)_localctx).expression = expression();
				setState(346); match(RPAREN);
				setState(347); match(LBRACKET);
				setState(348); ((Conditional_statementContext)_localctx).statement_list = statement_list(0);
				setState(349); match(RBRACKET);
				((Conditional_statementContext)_localctx).node =  new LOGOConditionalNode("if", ((Conditional_statementContext)_localctx).expression.node, ((Conditional_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("if" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352); match(If);
				setState(353); match(LPAREN);
				setState(354); ((Conditional_statementContext)_localctx).expression = expression();
				setState(355); match(RPAREN);
				setState(356); match(LBRACKET);
				setState(357); ((Conditional_statementContext)_localctx).n = statement_list(0);
				setState(358); match(RBRACKET);
				setState(359); match(Else);
				setState(360); match(LBRACKET);
				setState(361); ((Conditional_statementContext)_localctx).m = statement_list(0);
				setState(362); match(RBRACKET);
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
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
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
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public TerminalNode For() { return getToken(GrammarParser.For, 0); }
		public TerminalNode Repeat() { return getToken(GrammarParser.Repeat, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
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
		enterRule(_localctx, 42, RULE_iteration_statement);
		try {
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); match(While);
				setState(368); match(LPAREN);
				setState(369); ((Iteration_statementContext)_localctx).expression = expression();
				setState(370); match(RPAREN);
				setState(371); match(LBRACKET);
				setState(372); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(373); match(RBRACKET);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("while", ((Iteration_statementContext)_localctx).expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("while" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); match(For);
				setState(377); ((Iteration_statementContext)_localctx).id = id();
				setState(378); match(7);
				setState(379); ((Iteration_statementContext)_localctx).for_expression = for_expression();
				setState(380); match(LBRACKET);
				setState(381); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(382); match(RBRACKET);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("for", ((Iteration_statementContext)_localctx).id.node, ((Iteration_statementContext)_localctx).for_expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("for" + _localctx.node.id);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385); match(For);
				setState(386); match(LPAREN);
				setState(387); ((Iteration_statementContext)_localctx).id = id();
				setState(388); match(7);
				setState(389); ((Iteration_statementContext)_localctx).for_expression = for_expression();
				setState(390); match(RPAREN);
				setState(391); match(LBRACKET);
				setState(392); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(393); match(RBRACKET);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("for", ((Iteration_statementContext)_localctx).id.node, ((Iteration_statementContext)_localctx).for_expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("for" + _localctx.node.id);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396); match(Repeat);
				setState(397); ((Iteration_statementContext)_localctx).expression = expression();
				setState(398); match(LBRACKET);
				setState(399); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(400); match(RBRACKET);
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
		enterRule(_localctx, 44, RULE_for_expression);
		try {
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); ((For_expressionContext)_localctx).o = expression();
				setState(406); match(5);
				setState(407); ((For_expressionContext)_localctx).q = expression();
				((For_expressionContext)_localctx).node =  new LOGOIterationNode("for_expr1", ((For_expressionContext)_localctx).o.node, ((For_expressionContext)_localctx).q.node); LOGOPP.io.debug("for_expr1" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410); ((For_expressionContext)_localctx).o = expression();
				setState(411); match(5);
				setState(412); ((For_expressionContext)_localctx).p = expression();
				setState(413); match(5);
				setState(414); ((For_expressionContext)_localctx).q = expression();
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
		public TerminalNode LBRACKET() { return getToken(GrammarParser.LBRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(GrammarParser.RBRACKET, 0); }
		public TerminalNode Function() { return getToken(GrammarParser.Function, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
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
		enterRule(_localctx, 46, RULE_function_definition);
		try {
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419); match(Function);
				setState(420); ((Function_definitionContext)_localctx).id = id();
				setState(421); match(LPAREN);
				setState(422); match(RPAREN);
				setState(423); match(LBRACKET);
				setState(424); ((Function_definitionContext)_localctx).statement_list = statement_list(0);
				setState(425); match(RBRACKET);
				((Function_definitionContext)_localctx).node =  new LOGOFunctionNode(((Function_definitionContext)_localctx).id.node, "define",  null, ((Function_definitionContext)_localctx).statement_list.node);LOGOPP.io.debug("func_noarg");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428); match(Function);
				setState(429); ((Function_definitionContext)_localctx).id = id();
				setState(430); match(LPAREN);
				setState(431); ((Function_definitionContext)_localctx).identifier_list = identifier_list();
				setState(432); match(RPAREN);
				setState(433); match(LBRACKET);
				setState(434); ((Function_definitionContext)_localctx).statement_list = statement_list(0);
				setState(435); match(RBRACKET);
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
		enterRule(_localctx, 48, RULE_identifier_list);
		try {
			setState(447);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); ((Identifier_listContext)_localctx).Identifier = match(Identifier);
				setState(441); match(2);
				setState(442); ((Identifier_listContext)_localctx).n = identifier_list();
				((Identifier_listContext)_localctx).list =  new LOGOIdList((((Identifier_listContext)_localctx).Identifier!=null?((Identifier_listContext)_localctx).Identifier.getText():null), ((Identifier_listContext)_localctx).n.list); LOGOPP.io.debug("ID_list");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445); ((Identifier_listContext)_localctx).Identifier = match(Identifier);
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
		enterRule(_localctx, 50, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); ((FuncallContext)_localctx).id = id();
			setState(450); match(LPAREN);
			setState(451); ((FuncallContext)_localctx).expression_list = expression_list(0);
			setState(452); match(RPAREN);
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
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Match() { return getToken(GrammarParser.Match, 0); }
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
		enterRule(_localctx, 52, RULE_challenge);
		try {
			setState(462);
			switch (_input.LA(1)) {
			case Challenge:
				enterOuterAlt(_localctx, 1);
				{
				setState(455); match(Challenge);
				setState(456); ((ChallengeContext)_localctx).String = match(String);
				 LOGONode temp = new LOGOLeaf((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null)); ((ChallengeContext)_localctx).node =  new LOGOChallengeNode("CHALLENGE", temp); System.out.println((((ChallengeContext)_localctx).String!=null?((ChallengeContext)_localctx).String.getText():null));
				}
				break;
			case Match:
				enterOuterAlt(_localctx, 2);
				{
				setState(458); match(Match);
				((ChallengeContext)_localctx).node =  new LOGOChallengeNode("MATCH"); System.out.println("Match");
				}
				break;
			case Quit:
				enterOuterAlt(_localctx, 3);
				{
				setState(460); match(Quit);
				((ChallengeContext)_localctx).node =  new LOGOChallengeNode("QUIT"); System.out.println("quit");
				}
				break;
			default:
				throw new NoViableAltException(this);
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

		case 15: return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);

		case 16: return expression_list_sempred((Expression_listContext)_localctx, predIndex);
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
		case 14: return 2 >= _localctx._p;
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
		case 0: return 3 >= _localctx._p;
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
		"\2\3\67\u01d3\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16"+
		"\3M\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4^\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008c\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n\n\f\n\16\n"+
		"\u00af\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ba\n"+
		"\13\f\13\16\13\u00bd\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00ea\n\r\f\r\16\r\u00ed\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00fd\n\16\f\16\16\16\u0100\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u0115\n\17\f\17\16\17\u0118\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0121\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u012d\n\21\f\21\16\21\u0130\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0137\n\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u013e\n\22\f\22\16\22\u0141\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0150\n\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0170\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0196\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01a4\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u01b9\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u01c2\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u01d1\n\34\3\34\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\2\u01ed\28\3\2\2\2\4C\3\2\2\2\6]\3\2\2\2\be\3"+
		"\2\2\2\n}\3\2\2\2\f\u008b\3\2\2\2\16\u009d\3\2\2\2\20\u009f\3\2\2\2\22"+
		"\u00a2\3\2\2\2\24\u00b0\3\2\2\2\26\u00be\3\2\2\2\30\u00d1\3\2\2\2\32\u00ee"+
		"\3\2\2\2\34\u0101\3\2\2\2\36\u0120\3\2\2\2 \u0122\3\2\2\2\"\u0136\3\2"+
		"\2\2$\u014f\3\2\2\2&\u0151\3\2\2\2(\u0154\3\2\2\2*\u016f\3\2\2\2,\u0195"+
		"\3\2\2\2.\u01a3\3\2\2\2\60\u01b8\3\2\2\2\62\u01c1\3\2\2\2\64\u01c3\3\2"+
		"\2\2\66\u01d0\3\2\2\289\5\4\3\29:\7\1\2\2:;\b\2\1\2;\3\3\2\2\2<=\b\3\1"+
		"\2=>\5\6\4\2>?\b\3\1\2?D\3\2\2\2@A\5\66\34\2AB\b\3\1\2BD\3\2\2\2C<\3\2"+
		"\2\2C@\3\2\2\2DK\3\2\2\2EF\6\3\2\3FG\5\6\4\2GH\b\3\1\2HJ\3\2\2\2IE\3\2"+
		"\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MK\3\2\2\2NO\5\60\31\2OP"+
		"\b\4\1\2P^\3\2\2\2QR\5\b\5\2RS\b\4\1\2S^\3\2\2\2TU\5\20\t\2UV\b\4\1\2"+
		"V^\3\2\2\2WX\5*\26\2XY\b\4\1\2Y^\3\2\2\2Z[\5,\27\2[\\\b\4\1\2\\^\3\2\2"+
		"\2]N\3\2\2\2]Q\3\2\2\2]T\3\2\2\2]W\3\2\2\2]Z\3\2\2\2^\7\3\2\2\2_`\5\n"+
		"\6\2`a\b\5\1\2af\3\2\2\2bc\5\f\7\2cd\b\5\1\2df\3\2\2\2e_\3\2\2\2eb\3\2"+
		"\2\2f\t\3\2\2\2gh\7\37\2\2h~\b\6\1\2ij\7 \2\2j~\b\6\1\2kl\7!\2\2l~\b\6"+
		"\1\2mn\7\33\2\2n~\b\6\1\2op\7\34\2\2p~\b\6\1\2qr\7\35\2\2r~\b\6\1\2st"+
		"\7\36\2\2t~\b\6\1\2uv\7\"\2\2v~\b\6\1\2wx\7#\2\2x~\b\6\1\2yz\7%\2\2z~"+
		"\b\6\1\2{|\7$\2\2|~\b\6\1\2}g\3\2\2\2}i\3\2\2\2}k\3\2\2\2}m\3\2\2\2}o"+
		"\3\2\2\2}q\3\2\2\2}s\3\2\2\2}u\3\2\2\2}w\3\2\2\2}y\3\2\2\2}{\3\2\2\2~"+
		"\13\3\2\2\2\177\u0080\5\16\b\2\u0080\u0081\5\20\t\2\u0081\u0082\b\7\1"+
		"\2\u0082\u008c\3\2\2\2\u0083\u0084\7\30\2\2\u0084\u0085\7)\2\2\u0085\u0086"+
		"\5\20\t\2\u0086\u0087\7\4\2\2\u0087\u0088\5\20\t\2\u0088\u0089\7*\2\2"+
		"\u0089\u008a\b\7\1\2\u008a\u008c\3\2\2\2\u008b\177\3\2\2\2\u008b\u0083"+
		"\3\2\2\2\u008c\r\3\2\2\2\u008d\u008e\7\22\2\2\u008e\u009e\b\b\1\2\u008f"+
		"\u0090\7\23\2\2\u0090\u009e\b\b\1\2\u0091\u0092\7\24\2\2\u0092\u009e\b"+
		"\b\1\2\u0093\u0094\7\25\2\2\u0094\u009e\b\b\1\2\u0095\u0096\7\26\2\2\u0096"+
		"\u009e\b\b\1\2\u0097\u0098\7\27\2\2\u0098\u009e\b\b\1\2\u0099\u009a\7"+
		"\31\2\2\u009a\u009e\b\b\1\2\u009b\u009c\7\32\2\2\u009c\u009e\b\b\1\2\u009d"+
		"\u008d\3\2\2\2\u009d\u008f\3\2\2\2\u009d\u0091\3\2\2\2\u009d\u0093\3\2"+
		"\2\2\u009d\u0095\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0099\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\b\t\1"+
		"\2\u00a1\21\3\2\2\2\u00a2\u00a3\b\n\1\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5"+
		"\b\n\1\2\u00a5\u00ad\3\2\2\2\u00a6\u00a7\6\n\3\3\u00a7\u00a8\7\r\2\2\u00a8"+
		"\u00a9\5\24\13\2\u00a9\u00aa\b\n\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a6\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\23\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\13\1\2\u00b1\u00b2\5\26"+
		"\f\2\u00b2\u00b3\b\13\1\2\u00b3\u00bb\3\2\2\2\u00b4\u00b5\6\13\4\3\u00b5"+
		"\u00b6\7\f\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\b\13\1\2\u00b8\u00ba\3"+
		"\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\25\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\f\1"+
		"\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\b\f\1\2\u00c1\u00ce\3\2\2\2\u00c2"+
		"\u00c3\6\f\5\3\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\b"+
		"\f\1\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\6\f\6\3\u00c8\u00c9\7\n\2\2\u00c9"+
		"\u00ca\5\30\r\2\u00ca\u00cb\b\f\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c2\3"+
		"\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\r\1"+
		"\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\b\r\1\2\u00d4\u00eb\3\2\2\2\u00d5"+
		"\u00d6\6\r\7\3\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\b"+
		"\r\1\2\u00d9\u00ea\3\2\2\2\u00da\u00db\6\r\b\3\u00db\u00dc\7\16\2\2\u00dc"+
		"\u00dd\5\32\16\2\u00dd\u00de\b\r\1\2\u00de\u00ea\3\2\2\2\u00df\u00e0\6"+
		"\r\t\3\u00e0\u00e1\7\20\2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\b\r\1\2"+
		"\u00e3\u00ea\3\2\2\2\u00e4\u00e5\6\r\n\3\u00e5\u00e6\7\13\2\2\u00e6\u00e7"+
		"\5\32\16\2\u00e7\u00e8\b\r\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00d5\3\2\2\2"+
		"\u00e9\u00da\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\31\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\b\16\1\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1"+
		"\b\16\1\2\u00f1\u00fe\3\2\2\2\u00f2\u00f3\6\16\13\3\u00f3\u00f4\7\5\2"+
		"\2\u00f4\u00f5\5\34\17\2\u00f5\u00f6\b\16\1\2\u00f6\u00fd\3\2\2\2\u00f7"+
		"\u00f8\6\16\f\3\u00f8\u00f9\7\21\2\2\u00f9\u00fa\5\34\17\2\u00fa\u00fb"+
		"\b\16\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f7\3\2\2\2"+
		"\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\33"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\b\17\1\2\u0102\u0103\5\36\20"+
		"\2\u0103\u0104\b\17\1\2\u0104\u0116\3\2\2\2\u0105\u0106\6\17\r\3\u0106"+
		"\u0107\7\6\2\2\u0107\u0108\5\36\20\2\u0108\u0109\b\17\1\2\u0109\u0115"+
		"\3\2\2\2\u010a\u010b\6\17\16\3\u010b\u010c\7\17\2\2\u010c\u010d\5\36\20"+
		"\2\u010d\u010e\b\17\1\2\u010e\u0115\3\2\2\2\u010f\u0110\6\17\17\3\u0110"+
		"\u0111\7\3\2\2\u0111\u0112\5\36\20\2\u0112\u0113\b\17\1\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0105\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010f\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\35\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011a\5 \21\2\u011a\u011b\b\20\1\2\u011b"+
		"\u0121\3\2\2\2\u011c\u011d\7\21\2\2\u011d\u011e\5$\23\2\u011e\u011f\b"+
		"\20\1\2\u011f\u0121\3\2\2\2\u0120\u0119\3\2\2\2\u0120\u011c\3\2\2\2\u0121"+
		"\37\3\2\2\2\u0122\u0123\b\21\1\2\u0123\u0124\5$\23\2\u0124\u0125\b\21"+
		"\1\2\u0125\u012e\3\2\2\2\u0126\u0127\6\21\20\3\u0127\u0128\7)\2\2\u0128"+
		"\u0129\5\"\22\2\u0129\u012a\7*\2\2\u012a\u012b\b\21\1\2\u012b\u012d\3"+
		"\2\2\2\u012c\u0126\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f!\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\b\22\1\2"+
		"\u0132\u0133\5\20\t\2\u0133\u0134\b\22\1\2\u0134\u0137\3\2\2\2\u0135\u0137"+
		"\b\22\1\2\u0136\u0131\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013f\3\2\2\2"+
		"\u0138\u0139\6\22\21\3\u0139\u013a\7\4\2\2\u013a\u013b\5\20\t\2\u013b"+
		"\u013c\b\22\1\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013e\u0141\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140#\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0143\7\64\2\2\u0143\u0150\b\23\1\2\u0144\u0145\7)\2\2"+
		"\u0145\u0146\5\"\22\2\u0146\u0147\7*\2\2\u0147\u0148\b\23\1\2\u0148\u0150"+
		"\3\2\2\2\u0149\u014a\5(\25\2\u014a\u014b\b\23\1\2\u014b\u0150\3\2\2\2"+
		"\u014c\u014d\5&\24\2\u014d\u014e\b\23\1\2\u014e\u0150\3\2\2\2\u014f\u0142"+
		"\3\2\2\2\u014f\u0144\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014c\3\2\2\2\u0150"+
		"%\3\2\2\2\u0151\u0152\7\65\2\2\u0152\u0153\b\24\1\2\u0153\'\3\2\2\2\u0154"+
		"\u0155\7&\2\2\u0155\u0156\5&\24\2\u0156\u0157\5\20\t\2\u0157\u0158\b\25"+
		"\1\2\u0158)\3\2\2\2\u0159\u015a\7\'\2\2\u015a\u015b\7)\2\2\u015b\u015c"+
		"\5\20\t\2\u015c\u015d\7*\2\2\u015d\u015e\7+\2\2\u015e\u015f\5\4\3\2\u015f"+
		"\u0160\7,\2\2\u0160\u0161\b\26\1\2\u0161\u0170\3\2\2\2\u0162\u0163\7\'"+
		"\2\2\u0163\u0164\7)\2\2\u0164\u0165\5\20\t\2\u0165\u0166\7*\2\2\u0166"+
		"\u0167\7+\2\2\u0167\u0168\5\4\3\2\u0168\u0169\7,\2\2\u0169\u016a\7(\2"+
		"\2\u016a\u016b\7+\2\2\u016b\u016c\5\4\3\2\u016c\u016d\7,\2\2\u016d\u016e"+
		"\b\26\1\2\u016e\u0170\3\2\2\2\u016f\u0159\3\2\2\2\u016f\u0162\3\2\2\2"+
		"\u0170+\3\2\2\2\u0171\u0172\7-\2\2\u0172\u0173\7)\2\2\u0173\u0174\5\20"+
		"\t\2\u0174\u0175\7*\2\2\u0175\u0176\7+\2\2\u0176\u0177\5\4\3\2\u0177\u0178"+
		"\7,\2\2\u0178\u0179\b\27\1\2\u0179\u0196\3\2\2\2\u017a\u017b\7.\2\2\u017b"+
		"\u017c\5&\24\2\u017c\u017d\7\t\2\2\u017d\u017e\5.\30\2\u017e\u017f\7+"+
		"\2\2\u017f\u0180\5\4\3\2\u0180\u0181\7,\2\2\u0181\u0182\b\27\1\2\u0182"+
		"\u0196\3\2\2\2\u0183\u0184\7.\2\2\u0184\u0185\7)\2\2\u0185\u0186\5&\24"+
		"\2\u0186\u0187\7\t\2\2\u0187\u0188\5.\30\2\u0188\u0189\7*\2\2\u0189\u018a"+
		"\7+\2\2\u018a\u018b\5\4\3\2\u018b\u018c\7,\2\2\u018c\u018d\b\27\1\2\u018d"+
		"\u0196\3\2\2\2\u018e\u018f\7/\2\2\u018f\u0190\5\20\t\2\u0190\u0191\7+"+
		"\2\2\u0191\u0192\5\4\3\2\u0192\u0193\7,\2\2\u0193\u0194\b\27\1\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0171\3\2\2\2\u0195\u017a\3\2\2\2\u0195\u0183\3\2"+
		"\2\2\u0195\u018e\3\2\2\2\u0196-\3\2\2\2\u0197\u0198\5\20\t\2\u0198\u0199"+
		"\7\7\2\2\u0199\u019a\5\20\t\2\u019a\u019b\b\30\1\2\u019b\u01a4\3\2\2\2"+
		"\u019c\u019d\5\20\t\2\u019d\u019e\7\7\2\2\u019e\u019f\5\20\t\2\u019f\u01a0"+
		"\7\7\2\2\u01a0\u01a1\5\20\t\2\u01a1\u01a2\b\30\1\2\u01a2\u01a4\3\2\2\2"+
		"\u01a3\u0197\3\2\2\2\u01a3\u019c\3\2\2\2\u01a4/\3\2\2\2\u01a5\u01a6\7"+
		"\60\2\2\u01a6\u01a7\5&\24\2\u01a7\u01a8\7)\2\2\u01a8\u01a9\7*\2\2\u01a9"+
		"\u01aa\7+\2\2\u01aa\u01ab\5\4\3\2\u01ab\u01ac\7,\2\2\u01ac\u01ad\b\31"+
		"\1\2\u01ad\u01b9\3\2\2\2\u01ae\u01af\7\60\2\2\u01af\u01b0\5&\24\2\u01b0"+
		"\u01b1\7)\2\2\u01b1\u01b2\5\62\32\2\u01b2\u01b3\7*\2\2\u01b3\u01b4\7+"+
		"\2\2\u01b4\u01b5\5\4\3\2\u01b5\u01b6\7,\2\2\u01b6\u01b7\b\31\1\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01a5\3\2\2\2\u01b8\u01ae\3\2\2\2\u01b9\61\3\2\2"+
		"\2\u01ba\u01bb\7\65\2\2\u01bb\u01bc\7\4\2\2\u01bc\u01bd\5\62\32\2\u01bd"+
		"\u01be\b\32\1\2\u01be\u01c2\3\2\2\2\u01bf\u01c0\7\65\2\2\u01c0\u01c2\b"+
		"\32\1\2\u01c1\u01ba\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\63\3\2\2\2\u01c3"+
		"\u01c4\5&\24\2\u01c4\u01c5\7)\2\2\u01c5\u01c6\5\"\22\2\u01c6\u01c7\7*"+
		"\2\2\u01c7\u01c8\b\33\1\2\u01c8\65\3\2\2\2\u01c9\u01ca\7\61\2\2\u01ca"+
		"\u01cb\7\66\2\2\u01cb\u01d1\b\34\1\2\u01cc\u01cd\7\62\2\2\u01cd\u01d1"+
		"\b\34\1\2\u01ce\u01cf\7\63\2\2\u01cf\u01d1\b\34\1\2\u01d0\u01c9\3\2\2"+
		"\2\u01d0\u01cc\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\67\3\2\2\2\36CK]e}\u008b"+
		"\u009d\u00ad\u00bb\u00cc\u00ce\u00e9\u00eb\u00fc\u00fe\u0114\u0116\u0120"+
		"\u012e\u0136\u013f\u014f\u016f\u0195\u01a3\u01b8\u01c1\u01d0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}