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
		Fill=39, Setspeed=40, Hideturtle=41, Showturtle=42, Load=43, Turtle=44, 
		Set=45, Reset=46, If=47, Else=48, LPAREN=49, RPAREN=50, LBRACE=51, RBRACE=52, 
		While=53, For=54, Repeat=55, Function=56, Import=57, Challenge=58, Match=59, 
		Quit=60, Recordchallenge=61, Addhint=62, Hint=63, Removehint=64, Savechallenge=65, 
		Number=66, Identifier=67, String=68, Comment=69, WS=70;
	public static final String[] tokenNames = {
		"<INVALID>", "'^'", "','", "'+'", "'*'", "':'", "'<'", "'='", "'!='", 
		"'<='", "'&&'", "'||'", "'>'", "'/'", "'>='", "'-'", "'!'", "Forward", 
		"Back", "Left", "Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", 
		"Origin", "Front", "Wrap", "Fence", "Getx", "Gety", "Getspeed", "Getxy", 
		"Penup", "Pendown", "Save", "Color", "Fill", "Setspeed", "Hideturtle", 
		"Showturtle", "Load", "Turtle", "Set", "Reset", "'if'", "'else'", "'('", 
		"')'", "'{'", "'}'", "'while'", "'for'", "Repeat", "Function", "Import", 
		"Challenge", "Match", "Quit", "Recordchallenge", "Addhint", "Hint", "Removehint", 
		"Savechallenge", "Number", "Identifier", "String", "Comment", "WS"
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
		RULE_funcall = 26, RULE_record_challenge = 27, RULE_play_challenge = 28;
	public static final String[] ruleNames = {
		"line", "statement_list", "statement", "commands", "command_noarg", "command_expr", 
		"command", "expression", "or_expression", "and_expression", "equality_expression", 
		"relational_expression", "additive_expression", "multiplicative_expression", 
		"unary_expression", "unary_operator", "postfix_expression", "expression_list", 
		"primary_expression", "id", "assignment_expression", "conditional_statement", 
		"iteration_statement", "for_expression", "function_definition", "identifier_list", 
		"funcall", "record_challenge", "play_challenge"
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
		public Play_challengeContext play_challenge;
		public Statement_listContext statement_list;
		public TerminalNode Import() { return getToken(GrammarParser.Import, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public Play_challengeContext play_challenge() {
			return getRuleContext(Play_challengeContext.class,0);
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
			setState(69);
			switch (_input.LA(1)) {
			case Challenge:
			case Match:
			case Hint:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); ((LineContext)_localctx).play_challenge = play_challenge();
				setState(59); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).play_challenge.node;
				}
				break;
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
			case Fill:
			case Hideturtle:
			case Showturtle:
			case Load:
			case Turtle:
			case Set:
			case Reset:
			case If:
			case LPAREN:
			case While:
			case For:
			case Repeat:
			case Function:
			case Quit:
			case Recordchallenge:
			case Addhint:
			case Removehint:
			case Savechallenge:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); ((LineContext)_localctx).statement_list = statement_list(0);
				setState(63); match(EOF);
				((LineContext)_localctx).node =  ((LineContext)_localctx).statement_list.node; LOGOPP.io.debug("line->stmt_list");
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); match(Import);
				setState(67); match(String);
				setState(68); match(EOF);
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
			setState(72); ((Statement_listContext)_localctx).statement = statement();
			((Statement_listContext)_localctx).node =  ((Statement_listContext)_localctx).statement.node; LOGOPP.io.debug("stmt_list->stmt");
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
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
					setState(75);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(76); ((Statement_listContext)_localctx).statement = statement();
					((Statement_listContext)_localctx).n.node.children.add(((Statement_listContext)_localctx).statement.node); ((Statement_listContext)_localctx).node =  ((Statement_listContext)_localctx).n.node; LOGOPP.io.debug("stmt_list->stmt_list");
					}
					} 
				}
				setState(83);
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
			setState(99);
			switch (_input.LA(1)) {
			case Function:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); ((StatementContext)_localctx).function_definition = function_definition();
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
			case Fill:
			case Hideturtle:
			case Showturtle:
			case Load:
			case Turtle:
			case Reset:
			case Quit:
			case Recordchallenge:
			case Addhint:
			case Removehint:
			case Savechallenge:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); ((StatementContext)_localctx).commands = commands();
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
				setState(90); ((StatementContext)_localctx).expression = expression();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).expression.node); LOGOPP.io.debug("stmt->expr");
				}
				break;
			case If:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); ((StatementContext)_localctx).conditional_statement = conditional_statement();
				((StatementContext)_localctx).node =  new LOGOStatementNode("statement_list",((StatementContext)_localctx).conditional_statement.node); LOGOPP.io.debug("stmt->cond");
				}
				break;
			case While:
			case For:
			case Repeat:
				enterOuterAlt(_localctx, 5);
				{
				setState(96); ((StatementContext)_localctx).iteration_statement = iteration_statement();
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
		public Record_challengeContext record_challenge;
		public Record_challengeContext record_challenge() {
			return getRuleContext(Record_challengeContext.class,0);
		}
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
			setState(110);
			switch (_input.LA(1)) {
			case Clearscreen:
			case Origin:
			case Front:
			case Wrap:
			case Fence:
			case Getxy:
			case Penup:
			case Pendown:
			case Fill:
			case Hideturtle:
			case Showturtle:
			case Reset:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); ((CommandsContext)_localctx).command_noarg = command_noarg();
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
			case Load:
			case Turtle:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); ((CommandsContext)_localctx).command_expr = command_expr();
				((CommandsContext)_localctx).node =  ((CommandsContext)_localctx).command_expr.node;
				}
				break;
			case Quit:
			case Recordchallenge:
			case Addhint:
			case Removehint:
			case Savechallenge:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); ((CommandsContext)_localctx).record_challenge = record_challenge();
				((CommandsContext)_localctx).node =  ((CommandsContext)_localctx).record_challenge.node;
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
		public TerminalNode Fill() { return getToken(GrammarParser.Fill, 0); }
		public TerminalNode Origin() { return getToken(GrammarParser.Origin, 0); }
		public TerminalNode Penup() { return getToken(GrammarParser.Penup, 0); }
		public TerminalNode Wrap() { return getToken(GrammarParser.Wrap, 0); }
		public TerminalNode Reset() { return getToken(GrammarParser.Reset, 0); }
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
			setState(135);
			switch (_input.LA(1)) {
			case Getxy:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(Getxy);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("GETXY");
				}
				break;
			case Clearscreen:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); match(Clearscreen);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("CLEARSCREEN");
				}
				break;
			case Origin:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); match(Origin);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("ORIGIN");
				}
				break;
			case Front:
				enterOuterAlt(_localctx, 4);
				{
				setState(118); match(Front);
				((Command_noargContext)_localctx).node =  new LOGOCommandNode("FRONT");
				}
				break;
			case Wrap:
				enterOuterAlt(_localctx, 5);
				{
				setState(120); match(Wrap);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("WRAP");
				}
				break;
			case Fence:
				enterOuterAlt(_localctx, 6);
				{
				setState(122); match(Fence);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("FENCE");
				}
				break;
			case Penup:
				enterOuterAlt(_localctx, 7);
				{
				setState(124); match(Penup);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENUP");
				}
				break;
			case Pendown:
				enterOuterAlt(_localctx, 8);
				{
				setState(126); match(Pendown);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("PENDOWN");
				}
				break;
			case Showturtle:
				enterOuterAlt(_localctx, 9);
				{
				setState(128); match(Showturtle);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("SHOWTURTLE");
				}
				break;
			case Hideturtle:
				enterOuterAlt(_localctx, 10);
				{
				setState(130); match(Hideturtle);
				((Command_noargContext)_localctx).node =   new LOGOCommandNode("HIDETURTLE");
				}
				break;
			case Fill:
				enterOuterAlt(_localctx, 11);
				{
				setState(132); match(Fill);
				((Command_noargContext)_localctx).node =  new LOGOCommandNode("FILL");
				}
				break;
			case Reset:
				enterOuterAlt(_localctx, 12);
				{
				setState(134); match(Reset);
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
		public Expression_listContext expression_list;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
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
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); ((Command_exprContext)_localctx).command = command();
				setState(138); ((Command_exprContext)_localctx).expression = expression();
				((Command_exprContext)_localctx).node =  new LOGOCommandNode(((Command_exprContext)_localctx).command.text, ((Command_exprContext)_localctx).expression.node);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(Setxy);
				setState(142); match(LPAREN);
				setState(143); ((Command_exprContext)_localctx).a = expression();
				setState(144); match(2);
				setState(145); ((Command_exprContext)_localctx).b = expression();
				setState(146); match(RPAREN);
				((Command_exprContext)_localctx).node =  new LOGOCommandNode("SETXY", ((Command_exprContext)_localctx).a.node, ((Command_exprContext)_localctx).b.node);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); match(Color);
				setState(150); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("CHANGECOLOR", temp);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); match(Color);
				setState(153); match(LPAREN);
				setState(154); ((Command_exprContext)_localctx).expression_list = expression_list(0);
				setState(155); match(RPAREN);
				((Command_exprContext)_localctx).node =  new LOGOCommandNode("CHANGECOLORS", ((Command_exprContext)_localctx).expression_list.node);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158); match(Save);
				setState(159); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("SAVEIMAGE", temp);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); match(Print);
				setState(162); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("PRINT", temp);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164); match(Load);
				setState(165); ((Command_exprContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Command_exprContext)_localctx).String!=null?((Command_exprContext)_localctx).String.getText():null)); ((Command_exprContext)_localctx).node =  new LOGOCommandNode("LOAD", temp);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167); match(Turtle);
				setState(168); ((Command_exprContext)_localctx).String = match(String);
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
			setState(188);
			switch (_input.LA(1)) {
			case Forward:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(Forward);
				((CommandContext)_localctx).text =  new String("FORWARD");
				}
				break;
			case Back:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); match(Back);
				((CommandContext)_localctx).text =  new String("BACK");
				}
				break;
			case Left:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(Left);
				((CommandContext)_localctx).text =  new String("LEFT");
				}
				break;
			case Right:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); match(Right);
				((CommandContext)_localctx).text =  new String("RIGHT");
				}
				break;
			case Setx:
				enterOuterAlt(_localctx, 5);
				{
				setState(180); match(Setx);
				((CommandContext)_localctx).text =  new String("SETX");
				}
				break;
			case Sety:
				enterOuterAlt(_localctx, 6);
				{
				setState(182); match(Sety);
				((CommandContext)_localctx).text =  new String("SETY");
				}
				break;
			case Speed:
				enterOuterAlt(_localctx, 7);
				{
				setState(184); match(Speed);
				((CommandContext)_localctx).text =  new String("SETSPEED");
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 8);
				{
				setState(186); match(Print);
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
			setState(190); ((ExpressionContext)_localctx).or_expression = or_expression(0);
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
			setState(194); ((Or_expressionContext)_localctx).and_expression = and_expression(0);
			((Or_expressionContext)_localctx).node =  ((Or_expressionContext)_localctx).and_expression.node; LOGOPP.io.debug("or->and " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
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
					setState(197);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(198); match(11);
					setState(199); ((Or_expressionContext)_localctx).and_expression = and_expression(0);
					((Or_expressionContext)_localctx).node =  new LOGOOperatorNode("||", ((Or_expressionContext)_localctx).n.node, ((Or_expressionContext)_localctx).and_expression.node); LOGOPP.io.debug("or -> or || and " + _localctx.node.id);
					}
					} 
				}
				setState(206);
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
			setState(208); ((And_expressionContext)_localctx).equality_expression = equality_expression(0);
			((And_expressionContext)_localctx).node =  ((And_expressionContext)_localctx).equality_expression.node; LOGOPP.io.debug("and->eq " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
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
					setState(211);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(212); match(10);
					setState(213); ((And_expressionContext)_localctx).equality_expression = equality_expression(0);
					((And_expressionContext)_localctx).node =  new LOGOOperatorNode("&&", ((And_expressionContext)_localctx).n.node, ((And_expressionContext)_localctx).equality_expression.node); LOGOPP.io.debug("and-> and && eq " + _localctx.node.id);
					}
					} 
				}
				setState(220);
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
			setState(222); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
			((Equality_expressionContext)_localctx).node =  ((Equality_expressionContext)_localctx).relational_expression.node; LOGOPP.io.debug("eq->rel " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(225);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(226); match(7);
						setState(227); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
						((Equality_expressionContext)_localctx).node =  new LOGOOperatorNode("=", ((Equality_expressionContext)_localctx).n.node, ((Equality_expressionContext)_localctx).relational_expression.node); LOGOPP.io.debug("eq-> eq = rel " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Equality_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(230);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(231); match(8);
						setState(232); ((Equality_expressionContext)_localctx).relational_expression = relational_expression(0);
						((Equality_expressionContext)_localctx).node =  new LOGOOperatorNode("!=", ((Equality_expressionContext)_localctx).n.node, ((Equality_expressionContext)_localctx).relational_expression.node); LOGOPP.io.debug("eq-> eq != rel " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(239);
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
			setState(241); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
			((Relational_expressionContext)_localctx).node =  ((Relational_expressionContext)_localctx).additive_expression.node; LOGOPP.io.debug("rel->add " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(244);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(245); match(6);
						setState(246); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode("<", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel<add " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(249);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(250); match(12);
						setState(251); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode(">", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel>add " + _localctx.node.id);
						}
						break;

					case 3:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(254);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(255); match(14);
						setState(256); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode(">=", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel>=add " + _localctx.node.id);
						}
						break;

					case 4:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(259);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(260); match(9);
						setState(261); ((Relational_expressionContext)_localctx).additive_expression = additive_expression(0);
						((Relational_expressionContext)_localctx).node =  new LOGOOperatorNode("<=", ((Relational_expressionContext)_localctx).n.node, ((Relational_expressionContext)_localctx).additive_expression.node); LOGOPP.io.debug("rel->rel<=add " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(268);
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
			setState(270); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
			((Additive_expressionContext)_localctx).node =  ((Additive_expressionContext)_localctx).multiplicative_expression.node; LOGOPP.io.debug("add->mul " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(273);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(274); match(3);
						setState(275); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("+", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add+mul " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Additive_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(278);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(279); match(Unary_minus);
						setState(280); ((Additive_expressionContext)_localctx).multiplicative_expression = multiplicative_expression(0);
						((Additive_expressionContext)_localctx).node =  new LOGOOperatorNode("-", ((Additive_expressionContext)_localctx).n.node, ((Additive_expressionContext)_localctx).multiplicative_expression.node); LOGOPP.io.debug("add->add-mul " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(287);
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
			setState(289); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
			((Multiplicative_expressionContext)_localctx).node =  ((Multiplicative_expressionContext)_localctx).unary_expression.node; LOGOPP.io.debug("mul->unary " + _localctx.node.id);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(292);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(293); match(4);
						setState(294); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("*", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul*unary " + _localctx.node.id);
						}
						break;

					case 2:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(297);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(298); match(13);
						setState(299); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("/", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul/unary " + _localctx.node.id);
						}
						break;

					case 3:
						{
						_localctx = new Multiplicative_expressionContext(_parentctx, _parentState, _p);
						_localctx.n = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(302);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(303); match(1);
						setState(304); ((Multiplicative_expressionContext)_localctx).unary_expression = unary_expression();
						((Multiplicative_expressionContext)_localctx).node =  new LOGOOperatorNode("^", ((Multiplicative_expressionContext)_localctx).n.node, ((Multiplicative_expressionContext)_localctx).unary_expression.node); LOGOPP.io.debug("mul->mul^unary " + _localctx.node.id);
						}
						break;
					}
					} 
				}
				setState(311);
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
			setState(319);
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
				setState(312); ((Unary_expressionContext)_localctx).postfix_expression = postfix_expression(0);
				((Unary_expressionContext)_localctx).node =  ((Unary_expressionContext)_localctx).postfix_expression.node; LOGOPP.io.debug("unary->postfix " + _localctx.node.id);
				}
				break;
			case Unary_minus:
			case Unary_not:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); ((Unary_expressionContext)_localctx).unary_operator = unary_operator();
				setState(316); ((Unary_expressionContext)_localctx).primary_expression = primary_expression();
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
			setState(325);
			switch (_input.LA(1)) {
			case Unary_minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); match(Unary_minus);
				((Unary_operatorContext)_localctx).text =  "u-";
				}
				break;
			case Unary_not:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); match(Unary_not);
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
			setState(337);
			switch (_input.LA(1)) {
			case Getx:
				{
				setState(328); match(Getx);
				((Postfix_expressionContext)_localctx).node =  new LOGOCommandNode("GETX");
				}
				break;
			case Gety:
				{
				setState(330); match(Gety);
				((Postfix_expressionContext)_localctx).node =  new LOGOCommandNode("GETY");
				}
				break;
			case Getspeed:
				{
				setState(332); match(Getspeed);
				((Postfix_expressionContext)_localctx).node =  new LOGOCommandNode("GETSPEED");
				}
				break;
			case Set:
			case LPAREN:
			case Number:
			case Identifier:
				{
				setState(334); ((Postfix_expressionContext)_localctx).primary_expression = primary_expression();
				((Postfix_expressionContext)_localctx).node =  ((Postfix_expressionContext)_localctx).primary_expression.node; LOGOPP.io.debug("postfix->primary " + _localctx.node.id);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
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
					setState(339);
					if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
					setState(340); match(LPAREN);
					setState(341); ((Postfix_expressionContext)_localctx).expression_list = expression_list(0);
					setState(342); match(RPAREN);
					((Postfix_expressionContext)_localctx).node =  new LOGOFunctionNode(((Postfix_expressionContext)_localctx).n.node, "execute", ((Postfix_expressionContext)_localctx).expression_list.node); LOGOPP.io.debug("funcall test");
					}
					} 
				}
				setState(349);
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
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(351); ((Expression_listContext)_localctx).expression = expression();
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
			setState(364);
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
					setState(357);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(358); match(2);
					setState(359); ((Expression_listContext)_localctx).expression = expression();
					((Expression_listContext)_localctx).n.node.children.add(((Expression_listContext)_localctx).expression.node); ((Expression_listContext)_localctx).node =  ((Expression_listContext)_localctx).n.node; LOGOPP.io.debug("expression_list");
					}
					} 
				}
				setState(366);
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
			setState(380);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); ((Primary_expressionContext)_localctx).Number = match(Number);
				((Primary_expressionContext)_localctx).node =  new LOGOLeaf((((Primary_expressionContext)_localctx).Number!=null?((Primary_expressionContext)_localctx).Number.getText():null)); LOGOPP.io.debug("Number " + _localctx.node.id);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(369); match(LPAREN);
				setState(370); ((Primary_expressionContext)_localctx).expression = expression();
				setState(371); match(RPAREN);
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).expression.node; LOGOPP.io.debug("parentheses");
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 3);
				{
				setState(374); ((Primary_expressionContext)_localctx).assignment_expression = assignment_expression();
				((Primary_expressionContext)_localctx).node =  ((Primary_expressionContext)_localctx).assignment_expression.node; LOGOPP.io.debug("SET");
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(377); ((Primary_expressionContext)_localctx).id = id();
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
			setState(382); ((IdContext)_localctx).Identifier = match(Identifier);
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
			setState(385); match(Set);
			setState(386); ((Assignment_expressionContext)_localctx).id = id();
			setState(387); ((Assignment_expressionContext)_localctx).expression = expression();
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
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390); match(If);
				setState(391); match(LPAREN);
				setState(392); ((Conditional_statementContext)_localctx).expression = expression();
				setState(393); match(RPAREN);
				setState(394); match(LBRACE);
				setState(395); ((Conditional_statementContext)_localctx).statement_list = statement_list(0);
				setState(396); match(RBRACE);
				((Conditional_statementContext)_localctx).node =  new LOGOConditionalNode("if", ((Conditional_statementContext)_localctx).expression.node, ((Conditional_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("if" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); match(If);
				setState(400); match(LPAREN);
				setState(401); ((Conditional_statementContext)_localctx).expression = expression();
				setState(402); match(RPAREN);
				setState(403); match(LBRACE);
				setState(404); ((Conditional_statementContext)_localctx).n = statement_list(0);
				setState(405); match(RBRACE);
				setState(406); match(Else);
				setState(407); match(LBRACE);
				setState(408); ((Conditional_statementContext)_localctx).m = statement_list(0);
				setState(409); match(RBRACE);
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
			setState(450);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414); match(While);
				setState(415); match(LPAREN);
				setState(416); ((Iteration_statementContext)_localctx).expression = expression();
				setState(417); match(RPAREN);
				setState(418); match(LBRACE);
				setState(419); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(420); match(RBRACE);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("while", ((Iteration_statementContext)_localctx).expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("while" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423); match(For);
				setState(424); ((Iteration_statementContext)_localctx).id = id();
				setState(425); match(7);
				setState(426); ((Iteration_statementContext)_localctx).for_expression = for_expression();
				setState(427); match(LBRACE);
				setState(428); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(429); match(RBRACE);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("for", ((Iteration_statementContext)_localctx).id.node, ((Iteration_statementContext)_localctx).for_expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("for" + _localctx.node.id);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432); match(For);
				setState(433); match(LPAREN);
				setState(434); ((Iteration_statementContext)_localctx).id = id();
				setState(435); match(7);
				setState(436); ((Iteration_statementContext)_localctx).for_expression = for_expression();
				setState(437); match(RPAREN);
				setState(438); match(LBRACE);
				setState(439); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(440); match(RBRACE);
				((Iteration_statementContext)_localctx).node =  new LOGOIterationNode("for", ((Iteration_statementContext)_localctx).id.node, ((Iteration_statementContext)_localctx).for_expression.node, ((Iteration_statementContext)_localctx).statement_list.node); LOGOPP.io.debug("for" + _localctx.node.id);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(443); match(Repeat);
				setState(444); ((Iteration_statementContext)_localctx).expression = expression();
				setState(445); match(LBRACE);
				setState(446); ((Iteration_statementContext)_localctx).statement_list = statement_list(0);
				setState(447); match(RBRACE);
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
			setState(464);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452); ((For_expressionContext)_localctx).o = expression();
				setState(453); match(5);
				setState(454); ((For_expressionContext)_localctx).q = expression();
				((For_expressionContext)_localctx).node =  new LOGOIterationNode("for_expr1", ((For_expressionContext)_localctx).o.node, ((For_expressionContext)_localctx).q.node); LOGOPP.io.debug("for_expr1" + _localctx.node.id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457); ((For_expressionContext)_localctx).o = expression();
				setState(458); match(5);
				setState(459); ((For_expressionContext)_localctx).p = expression();
				setState(460); match(5);
				setState(461); ((For_expressionContext)_localctx).q = expression();
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
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466); match(Function);
				setState(467); ((Function_definitionContext)_localctx).id = id();
				setState(468); match(LPAREN);
				setState(469); match(RPAREN);
				setState(470); match(LBRACE);
				setState(471); ((Function_definitionContext)_localctx).statement_list = statement_list(0);
				setState(472); match(RBRACE);
				((Function_definitionContext)_localctx).node =  new LOGOFunctionNode(((Function_definitionContext)_localctx).id.node, "define",  null, ((Function_definitionContext)_localctx).statement_list.node);LOGOPP.io.debug("func_noarg");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475); match(Function);
				setState(476); ((Function_definitionContext)_localctx).id = id();
				setState(477); match(LPAREN);
				setState(478); ((Function_definitionContext)_localctx).identifier_list = identifier_list();
				setState(479); match(RPAREN);
				setState(480); match(LBRACE);
				setState(481); ((Function_definitionContext)_localctx).statement_list = statement_list(0);
				setState(482); match(RBRACE);
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
			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487); ((Identifier_listContext)_localctx).Identifier = match(Identifier);
				setState(488); match(2);
				setState(489); ((Identifier_listContext)_localctx).n = identifier_list();
				((Identifier_listContext)_localctx).list =  new LOGOIdList((((Identifier_listContext)_localctx).Identifier!=null?((Identifier_listContext)_localctx).Identifier.getText():null), ((Identifier_listContext)_localctx).n.list); LOGOPP.io.debug("ID_list");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492); ((Identifier_listContext)_localctx).Identifier = match(Identifier);
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
			setState(496); ((FuncallContext)_localctx).id = id();
			setState(497); match(LPAREN);
			setState(498); ((FuncallContext)_localctx).expression_list = expression_list(0);
			setState(499); match(RPAREN);
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

	public static class Record_challengeContext extends ParserRuleContext {
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
		public TerminalNode Addhint() { return getToken(GrammarParser.Addhint, 0); }
		public TerminalNode Number() { return getToken(GrammarParser.Number, 0); }
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Recordchallenge() { return getToken(GrammarParser.Recordchallenge, 0); }
		public TerminalNode Quit() { return getToken(GrammarParser.Quit, 0); }
		public Record_challengeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_challenge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRecord_challenge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRecord_challenge(this);
		}
	}

	public final Record_challengeContext record_challenge() throws RecognitionException {
		Record_challengeContext _localctx = new Record_challengeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_record_challenge);
		try {
			setState(530);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502); match(Quit);
				((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("QUIT");
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504); match(Recordchallenge);
				((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("RECORD");
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506); match(Recordchallenge);
				setState(507); ((Record_challengeContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Record_challengeContext)_localctx).String!=null?((Record_challengeContext)_localctx).String.getText():null)); ((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("RECORD", temp);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(509); match(Addhint);
				setState(510); match(LPAREN);
				setState(511); ((Record_challengeContext)_localctx).String = match(String);
				setState(512); match(2);
				setState(513); ((Record_challengeContext)_localctx).e1 = expression();
				setState(514); match(2);
				setState(515); ((Record_challengeContext)_localctx).e2 = expression();
				setState(516); match(RPAREN);
				LOGONode temp = new LOGOLeaf((((Record_challengeContext)_localctx).String!=null?((Record_challengeContext)_localctx).String.getText():null)); ((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("WRITEHINT", temp, ((Record_challengeContext)_localctx).e1.node, ((Record_challengeContext)_localctx).e2.node);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(519); match(Addhint);
				setState(520); ((Record_challengeContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Record_challengeContext)_localctx).String!=null?((Record_challengeContext)_localctx).String.getText():null)); ((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("WRITEHINT", temp);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(522); match(Removehint);
				setState(523); ((Record_challengeContext)_localctx).Number = match(Number);
				LOGONode temp = new LOGOLeaf((((Record_challengeContext)_localctx).Number!=null?((Record_challengeContext)_localctx).Number.getText():null)); ((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("REMOVEHINT", temp);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(525); match(Removehint);
				((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("REMOVEALLHINT");
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(527); match(Savechallenge);
				setState(528); ((Record_challengeContext)_localctx).String = match(String);
				LOGONode temp = new LOGOLeaf((((Record_challengeContext)_localctx).String!=null?((Record_challengeContext)_localctx).String.getText():null)); ((Record_challengeContext)_localctx).node =  new LOGOChallengeNode("SAVE", temp);
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

	public static class Play_challengeContext extends ParserRuleContext {
		public LOGONode node;
		public Token String;
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Match() { return getToken(GrammarParser.Match, 0); }
		public TerminalNode Hint() { return getToken(GrammarParser.Hint, 0); }
		public TerminalNode Challenge() { return getToken(GrammarParser.Challenge, 0); }
		public Play_challengeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play_challenge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlay_challenge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlay_challenge(this);
		}
	}

	public final Play_challengeContext play_challenge() throws RecognitionException {
		Play_challengeContext _localctx = new Play_challengeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_play_challenge);
		try {
			setState(539);
			switch (_input.LA(1)) {
			case Challenge:
				enterOuterAlt(_localctx, 1);
				{
				setState(532); match(Challenge);
				setState(533); ((Play_challengeContext)_localctx).String = match(String);
				 LOGONode temp = new LOGOLeaf((((Play_challengeContext)_localctx).String!=null?((Play_challengeContext)_localctx).String.getText():null)); ((Play_challengeContext)_localctx).node =  new LOGOChallengeNode("CHALLENGE", temp);
				}
				break;
			case Match:
				enterOuterAlt(_localctx, 2);
				{
				setState(535); match(Match);
				((Play_challengeContext)_localctx).node =  new LOGOChallengeNode("MATCH");
				}
				break;
			case Hint:
				enterOuterAlt(_localctx, 3);
				{
				setState(537); match(Hint);
				((Play_challengeContext)_localctx).node =  new LOGOChallengeNode("SHOWHINT");
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
		"\2\3H\u0220\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2H\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3R\n\3\f\3\16\3U\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4f\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5q\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ad\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bf\n\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cd\n\n\f\n\16\n\u00d0"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00db\n\13\f\13"+
		"\16\13\u00de\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00ee\n\f\f\f\16\f\u00f1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010b"+
		"\n\r\f\r\16\r\u010e\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u011e\n\16\f\16\16\16\u0121\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0136\n\17\f\17\16\17\u0139\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0142\n\20\3\21\3\21\3\21\3\21\5\21\u0148"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0154\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u015c\n\22\f\22\16\22\u015f\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0166\n\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u016d\n\23\f\23\16\23\u0170\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u017f\n\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u019f\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01c5\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01d3\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u01e8\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01f1\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0215\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u021e\n\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\2\u024c\2G\3\2\2\2\4I\3\2\2\2"+
		"\6e\3\2\2\2\bp\3\2\2\2\n\u0089\3\2\2\2\f\u00ac\3\2\2\2\16\u00be\3\2\2"+
		"\2\20\u00c0\3\2\2\2\22\u00c3\3\2\2\2\24\u00d1\3\2\2\2\26\u00df\3\2\2\2"+
		"\30\u00f2\3\2\2\2\32\u010f\3\2\2\2\34\u0122\3\2\2\2\36\u0141\3\2\2\2 "+
		"\u0147\3\2\2\2\"\u0153\3\2\2\2$\u0165\3\2\2\2&\u017e\3\2\2\2(\u0180\3"+
		"\2\2\2*\u0183\3\2\2\2,\u019e\3\2\2\2.\u01c4\3\2\2\2\60\u01d2\3\2\2\2\62"+
		"\u01e7\3\2\2\2\64\u01f0\3\2\2\2\66\u01f2\3\2\2\28\u0214\3\2\2\2:\u021d"+
		"\3\2\2\2<=\5:\36\2=>\7\1\2\2>?\b\2\1\2?H\3\2\2\2@A\5\4\3\2AB\7\1\2\2B"+
		"C\b\2\1\2CH\3\2\2\2DE\7;\2\2EF\7F\2\2FH\7\1\2\2G<\3\2\2\2G@\3\2\2\2GD"+
		"\3\2\2\2H\3\3\2\2\2IJ\b\3\1\2JK\5\6\4\2KL\b\3\1\2LS\3\2\2\2MN\6\3\2\3"+
		"NO\5\6\4\2OP\b\3\1\2PR\3\2\2\2QM\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"T\5\3\2\2\2US\3\2\2\2VW\5\62\32\2WX\b\4\1\2Xf\3\2\2\2YZ\5\b\5\2Z[\b\4"+
		"\1\2[f\3\2\2\2\\]\5\20\t\2]^\b\4\1\2^f\3\2\2\2_`\5,\27\2`a\b\4\1\2af\3"+
		"\2\2\2bc\5.\30\2cd\b\4\1\2df\3\2\2\2eV\3\2\2\2eY\3\2\2\2e\\\3\2\2\2e_"+
		"\3\2\2\2eb\3\2\2\2f\7\3\2\2\2gh\5\n\6\2hi\b\5\1\2iq\3\2\2\2jk\5\f\7\2"+
		"kl\b\5\1\2lq\3\2\2\2mn\58\35\2no\b\5\1\2oq\3\2\2\2pg\3\2\2\2pj\3\2\2\2"+
		"pm\3\2\2\2q\t\3\2\2\2rs\7$\2\2s\u008a\b\6\1\2tu\7\34\2\2u\u008a\b\6\1"+
		"\2vw\7\35\2\2w\u008a\b\6\1\2xy\7\36\2\2y\u008a\b\6\1\2z{\7\37\2\2{\u008a"+
		"\b\6\1\2|}\7 \2\2}\u008a\b\6\1\2~\177\7%\2\2\177\u008a\b\6\1\2\u0080\u0081"+
		"\7&\2\2\u0081\u008a\b\6\1\2\u0082\u0083\7,\2\2\u0083\u008a\b\6\1\2\u0084"+
		"\u0085\7+\2\2\u0085\u008a\b\6\1\2\u0086\u0087\7)\2\2\u0087\u008a\b\6\1"+
		"\2\u0088\u008a\7\60\2\2\u0089r\3\2\2\2\u0089t\3\2\2\2\u0089v\3\2\2\2\u0089"+
		"x\3\2\2\2\u0089z\3\2\2\2\u0089|\3\2\2\2\u0089~\3\2\2\2\u0089\u0080\3\2"+
		"\2\2\u0089\u0082\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0086\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\13\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u008d\5\20"+
		"\t\2\u008d\u008e\b\7\1\2\u008e\u00ad\3\2\2\2\u008f\u0090\7\31\2\2\u0090"+
		"\u0091\7\63\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\4\2\2\u0093\u0094\5"+
		"\20\t\2\u0094\u0095\7\64\2\2\u0095\u0096\b\7\1\2\u0096\u00ad\3\2\2\2\u0097"+
		"\u0098\7(\2\2\u0098\u0099\7F\2\2\u0099\u00ad\b\7\1\2\u009a\u009b\7(\2"+
		"\2\u009b\u009c\7\63\2\2\u009c\u009d\5$\23\2\u009d\u009e\7\64\2\2\u009e"+
		"\u009f\b\7\1\2\u009f\u00ad\3\2\2\2\u00a0\u00a1\7\'\2\2\u00a1\u00a2\7F"+
		"\2\2\u00a2\u00ad\b\7\1\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\7F\2\2\u00a5"+
		"\u00ad\b\7\1\2\u00a6\u00a7\7-\2\2\u00a7\u00a8\7F\2\2\u00a8\u00ad\b\7\1"+
		"\2\u00a9\u00aa\7.\2\2\u00aa\u00ab\7F\2\2\u00ab\u00ad\b\7\1\2\u00ac\u008b"+
		"\3\2\2\2\u00ac\u008f\3\2\2\2\u00ac\u0097\3\2\2\2\u00ac\u009a\3\2\2\2\u00ac"+
		"\u00a0\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a9\3\2"+
		"\2\2\u00ad\r\3\2\2\2\u00ae\u00af\7\23\2\2\u00af\u00bf\b\b\1\2\u00b0\u00b1"+
		"\7\24\2\2\u00b1\u00bf\b\b\1\2\u00b2\u00b3\7\25\2\2\u00b3\u00bf\b\b\1\2"+
		"\u00b4\u00b5\7\26\2\2\u00b5\u00bf\b\b\1\2\u00b6\u00b7\7\27\2\2\u00b7\u00bf"+
		"\b\b\1\2\u00b8\u00b9\7\30\2\2\u00b9\u00bf\b\b\1\2\u00ba\u00bb\7\32\2\2"+
		"\u00bb\u00bf\b\b\1\2\u00bc\u00bd\7\33\2\2\u00bd\u00bf\b\b\1\2\u00be\u00ae"+
		"\3\2\2\2\u00be\u00b0\3\2\2\2\u00be\u00b2\3\2\2\2\u00be\u00b4\3\2\2\2\u00be"+
		"\u00b6\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\17\3\2\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\b\t\1\2\u00c2\21"+
		"\3\2\2\2\u00c3\u00c4\b\n\1\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\b\n\1\2"+
		"\u00c6\u00ce\3\2\2\2\u00c7\u00c8\6\n\3\3\u00c8\u00c9\7\r\2\2\u00c9\u00ca"+
		"\5\24\13\2\u00ca\u00cb\b\n\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2"+
		"\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\23"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\13\1\2\u00d2\u00d3\5\26\f\2"+
		"\u00d3\u00d4\b\13\1\2\u00d4\u00dc\3\2\2\2\u00d5\u00d6\6\13\4\3\u00d6\u00d7"+
		"\7\f\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\b\13\1\2\u00d9\u00db\3\2\2\2"+
		"\u00da\u00d5\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\f\1\2\u00e0"+
		"\u00e1\5\30\r\2\u00e1\u00e2\b\f\1\2\u00e2\u00ef\3\2\2\2\u00e3\u00e4\6"+
		"\f\5\3\u00e4\u00e5\7\t\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\b\f\1\2\u00e7"+
		"\u00ee\3\2\2\2\u00e8\u00e9\6\f\6\3\u00e9\u00ea\7\n\2\2\u00ea\u00eb\5\30"+
		"\r\2\u00eb\u00ec\b\f\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e3\3\2\2\2\u00ed"+
		"\u00e8\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\27\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\r\1\2\u00f3\u00f4"+
		"\5\32\16\2\u00f4\u00f5\b\r\1\2\u00f5\u010c\3\2\2\2\u00f6\u00f7\6\r\7\3"+
		"\u00f7\u00f8\7\b\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fa\b\r\1\2\u00fa\u010b"+
		"\3\2\2\2\u00fb\u00fc\6\r\b\3\u00fc\u00fd\7\16\2\2\u00fd\u00fe\5\32\16"+
		"\2\u00fe\u00ff\b\r\1\2\u00ff\u010b\3\2\2\2\u0100\u0101\6\r\t\3\u0101\u0102"+
		"\7\20\2\2\u0102\u0103\5\32\16\2\u0103\u0104\b\r\1\2\u0104\u010b\3\2\2"+
		"\2\u0105\u0106\6\r\n\3\u0106\u0107\7\13\2\2\u0107\u0108\5\32\16\2\u0108"+
		"\u0109\b\r\1\2\u0109\u010b\3\2\2\2\u010a\u00f6\3\2\2\2\u010a\u00fb\3\2"+
		"\2\2\u010a\u0100\3\2\2\2\u010a\u0105\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\31\3\2\2\2\u010e\u010c\3\2\2"+
		"\2\u010f\u0110\b\16\1\2\u0110\u0111\5\34\17\2\u0111\u0112\b\16\1\2\u0112"+
		"\u011f\3\2\2\2\u0113\u0114\6\16\13\3\u0114\u0115\7\5\2\2\u0115\u0116\5"+
		"\34\17\2\u0116\u0117\b\16\1\2\u0117\u011e\3\2\2\2\u0118\u0119\6\16\f\3"+
		"\u0119\u011a\7\21\2\2\u011a\u011b\5\34\17\2\u011b\u011c\b\16\1\2\u011c"+
		"\u011e\3\2\2\2\u011d\u0113\3\2\2\2\u011d\u0118\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\33\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\b\17\1\2\u0123\u0124\5\36\20\2\u0124\u0125\b\17\1"+
		"\2\u0125\u0137\3\2\2\2\u0126\u0127\6\17\r\3\u0127\u0128\7\6\2\2\u0128"+
		"\u0129\5\36\20\2\u0129\u012a\b\17\1\2\u012a\u0136\3\2\2\2\u012b\u012c"+
		"\6\17\16\3\u012c\u012d\7\17\2\2\u012d\u012e\5\36\20\2\u012e\u012f\b\17"+
		"\1\2\u012f\u0136\3\2\2\2\u0130\u0131\6\17\17\3\u0131\u0132\7\3\2\2\u0132"+
		"\u0133\5\36\20\2\u0133\u0134\b\17\1\2\u0134\u0136\3\2\2\2\u0135\u0126"+
		"\3\2\2\2\u0135\u012b\3\2\2\2\u0135\u0130\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\35\3\2\2\2\u0139\u0137\3\2\2"+
		"\2\u013a\u013b\5\"\22\2\u013b\u013c\b\20\1\2\u013c\u0142\3\2\2\2\u013d"+
		"\u013e\5 \21\2\u013e\u013f\5&\24\2\u013f\u0140\b\20\1\2\u0140\u0142\3"+
		"\2\2\2\u0141\u013a\3\2\2\2\u0141\u013d\3\2\2\2\u0142\37\3\2\2\2\u0143"+
		"\u0144\7\21\2\2\u0144\u0148\b\21\1\2\u0145\u0146\7\22\2\2\u0146\u0148"+
		"\b\21\1\2\u0147\u0143\3\2\2\2\u0147\u0145\3\2\2\2\u0148!\3\2\2\2\u0149"+
		"\u014a\b\22\1\2\u014a\u014b\7!\2\2\u014b\u0154\b\22\1\2\u014c\u014d\7"+
		"\"\2\2\u014d\u0154\b\22\1\2\u014e\u014f\7#\2\2\u014f\u0154\b\22\1\2\u0150"+
		"\u0151\5&\24\2\u0151\u0152\b\22\1\2\u0152\u0154\3\2\2\2\u0153\u0149\3"+
		"\2\2\2\u0153\u014c\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u0150\3\2\2\2\u0154"+
		"\u015d\3\2\2\2\u0155\u0156\6\22\20\3\u0156\u0157\7\63\2\2\u0157\u0158"+
		"\5$\23\2\u0158\u0159\7\64\2\2\u0159\u015a\b\22\1\2\u015a\u015c\3\2\2\2"+
		"\u015b\u0155\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e#\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\b\23\1\2\u0161"+
		"\u0162\5\20\t\2\u0162\u0163\b\23\1\2\u0163\u0166\3\2\2\2\u0164\u0166\b"+
		"\23\1\2\u0165\u0160\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u016e\3\2\2\2\u0167"+
		"\u0168\6\23\21\3\u0168\u0169\7\4\2\2\u0169\u016a\5\20\t\2\u016a\u016b"+
		"\b\23\1\2\u016b\u016d\3\2\2\2\u016c\u0167\3\2\2\2\u016d\u0170\3\2\2\2"+
		"\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f%\3\2\2\2\u0170\u016e\3"+
		"\2\2\2\u0171\u0172\7D\2\2\u0172\u017f\b\24\1\2\u0173\u0174\7\63\2\2\u0174"+
		"\u0175\5\20\t\2\u0175\u0176\7\64\2\2\u0176\u0177\b\24\1\2\u0177\u017f"+
		"\3\2\2\2\u0178\u0179\5*\26\2\u0179\u017a\b\24\1\2\u017a\u017f\3\2\2\2"+
		"\u017b\u017c\5(\25\2\u017c\u017d\b\24\1\2\u017d\u017f\3\2\2\2\u017e\u0171"+
		"\3\2\2\2\u017e\u0173\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u017b\3\2\2\2\u017f"+
		"\'\3\2\2\2\u0180\u0181\7E\2\2\u0181\u0182\b\25\1\2\u0182)\3\2\2\2\u0183"+
		"\u0184\7/\2\2\u0184\u0185\5(\25\2\u0185\u0186\5\20\t\2\u0186\u0187\b\26"+
		"\1\2\u0187+\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u018a\7\63\2\2\u018a\u018b"+
		"\5\20\t\2\u018b\u018c\7\64\2\2\u018c\u018d\7\65\2\2\u018d\u018e\5\4\3"+
		"\2\u018e\u018f\7\66\2\2\u018f\u0190\b\27\1\2\u0190\u019f\3\2\2\2\u0191"+
		"\u0192\7\61\2\2\u0192\u0193\7\63\2\2\u0193\u0194\5\20\t\2\u0194\u0195"+
		"\7\64\2\2\u0195\u0196\7\65\2\2\u0196\u0197\5\4\3\2\u0197\u0198\7\66\2"+
		"\2\u0198\u0199\7\62\2\2\u0199\u019a\7\65\2\2\u019a\u019b\5\4\3\2\u019b"+
		"\u019c\7\66\2\2\u019c\u019d\b\27\1\2\u019d\u019f\3\2\2\2\u019e\u0188\3"+
		"\2\2\2\u019e\u0191\3\2\2\2\u019f-\3\2\2\2\u01a0\u01a1\7\67\2\2\u01a1\u01a2"+
		"\7\63\2\2\u01a2\u01a3\5\20\t\2\u01a3\u01a4\7\64\2\2\u01a4\u01a5\7\65\2"+
		"\2\u01a5\u01a6\5\4\3\2\u01a6\u01a7\7\66\2\2\u01a7\u01a8\b\30\1\2\u01a8"+
		"\u01c5\3\2\2\2\u01a9\u01aa\78\2\2\u01aa\u01ab\5(\25\2\u01ab\u01ac\7\t"+
		"\2\2\u01ac\u01ad\5\60\31\2\u01ad\u01ae\7\65\2\2\u01ae\u01af\5\4\3\2\u01af"+
		"\u01b0\7\66\2\2\u01b0\u01b1\b\30\1\2\u01b1\u01c5\3\2\2\2\u01b2\u01b3\7"+
		"8\2\2\u01b3\u01b4\7\63\2\2\u01b4\u01b5\5(\25\2\u01b5\u01b6\7\t\2\2\u01b6"+
		"\u01b7\5\60\31\2\u01b7\u01b8\7\64\2\2\u01b8\u01b9\7\65\2\2\u01b9\u01ba"+
		"\5\4\3\2\u01ba\u01bb\7\66\2\2\u01bb\u01bc\b\30\1\2\u01bc\u01c5\3\2\2\2"+
		"\u01bd\u01be\79\2\2\u01be\u01bf\5\20\t\2\u01bf\u01c0\7\65\2\2\u01c0\u01c1"+
		"\5\4\3\2\u01c1\u01c2\7\66\2\2\u01c2\u01c3\b\30\1\2\u01c3\u01c5\3\2\2\2"+
		"\u01c4\u01a0\3\2\2\2\u01c4\u01a9\3\2\2\2\u01c4\u01b2\3\2\2\2\u01c4\u01bd"+
		"\3\2\2\2\u01c5/\3\2\2\2\u01c6\u01c7\5\20\t\2\u01c7\u01c8\7\7\2\2\u01c8"+
		"\u01c9\5\20\t\2\u01c9\u01ca\b\31\1\2\u01ca\u01d3\3\2\2\2\u01cb\u01cc\5"+
		"\20\t\2\u01cc\u01cd\7\7\2\2\u01cd\u01ce\5\20\t\2\u01ce\u01cf\7\7\2\2\u01cf"+
		"\u01d0\5\20\t\2\u01d0\u01d1\b\31\1\2\u01d1\u01d3\3\2\2\2\u01d2\u01c6\3"+
		"\2\2\2\u01d2\u01cb\3\2\2\2\u01d3\61\3\2\2\2\u01d4\u01d5\7:\2\2\u01d5\u01d6"+
		"\5(\25\2\u01d6\u01d7\7\63\2\2\u01d7\u01d8\7\64\2\2\u01d8\u01d9\7\65\2"+
		"\2\u01d9\u01da\5\4\3\2\u01da\u01db\7\66\2\2\u01db\u01dc\b\32\1\2\u01dc"+
		"\u01e8\3\2\2\2\u01dd\u01de\7:\2\2\u01de\u01df\5(\25\2\u01df\u01e0\7\63"+
		"\2\2\u01e0\u01e1\5\64\33\2\u01e1\u01e2\7\64\2\2\u01e2\u01e3\7\65\2\2\u01e3"+
		"\u01e4\5\4\3\2\u01e4\u01e5\7\66\2\2\u01e5\u01e6\b\32\1\2\u01e6\u01e8\3"+
		"\2\2\2\u01e7\u01d4\3\2\2\2\u01e7\u01dd\3\2\2\2\u01e8\63\3\2\2\2\u01e9"+
		"\u01ea\7E\2\2\u01ea\u01eb\7\4\2\2\u01eb\u01ec\5\64\33\2\u01ec\u01ed\b"+
		"\33\1\2\u01ed\u01f1\3\2\2\2\u01ee\u01ef\7E\2\2\u01ef\u01f1\b\33\1\2\u01f0"+
		"\u01e9\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\65\3\2\2\2\u01f2\u01f3\5(\25"+
		"\2\u01f3\u01f4\7\63\2\2\u01f4\u01f5\5$\23\2\u01f5\u01f6\7\64\2\2\u01f6"+
		"\u01f7\b\34\1\2\u01f7\67\3\2\2\2\u01f8\u01f9\7>\2\2\u01f9\u0215\b\35\1"+
		"\2\u01fa\u01fb\7?\2\2\u01fb\u0215\b\35\1\2\u01fc\u01fd\7?\2\2\u01fd\u01fe"+
		"\7F\2\2\u01fe\u0215\b\35\1\2\u01ff\u0200\7@\2\2\u0200\u0201\7\63\2\2\u0201"+
		"\u0202\7F\2\2\u0202\u0203\7\4\2\2\u0203\u0204\5\20\t\2\u0204\u0205\7\4"+
		"\2\2\u0205\u0206\5\20\t\2\u0206\u0207\7\64\2\2\u0207\u0208\b\35\1\2\u0208"+
		"\u0215\3\2\2\2\u0209\u020a\7@\2\2\u020a\u020b\7F\2\2\u020b\u0215\b\35"+
		"\1\2\u020c\u020d\7B\2\2\u020d\u020e\7D\2\2\u020e\u0215\b\35\1\2\u020f"+
		"\u0210\7B\2\2\u0210\u0215\b\35\1\2\u0211\u0212\7C\2\2\u0212\u0213\7F\2"+
		"\2\u0213\u0215\b\35\1\2\u0214\u01f8\3\2\2\2\u0214\u01fa\3\2\2\2\u0214"+
		"\u01fc\3\2\2\2\u0214\u01ff\3\2\2\2\u0214\u0209\3\2\2\2\u0214\u020c\3\2"+
		"\2\2\u0214\u020f\3\2\2\2\u0214\u0211\3\2\2\2\u02159\3\2\2\2\u0216\u0217"+
		"\7<\2\2\u0217\u0218\7F\2\2\u0218\u021e\b\36\1\2\u0219\u021a\7=\2\2\u021a"+
		"\u021e\b\36\1\2\u021b\u021c\7A\2\2\u021c\u021e\b\36\1\2\u021d\u0216\3"+
		"\2\2\2\u021d\u0219\3\2\2\2\u021d\u021b\3\2\2\2\u021e;\3\2\2\2!GSep\u0089"+
		"\u00ac\u00be\u00ce\u00dc\u00ed\u00ef\u010a\u010c\u011d\u011f\u0135\u0137"+
		"\u0141\u0147\u0153\u015d\u0165\u016e\u017e\u019e\u01c4\u01d2\u01e7\u01f0"+
		"\u0214\u021d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}