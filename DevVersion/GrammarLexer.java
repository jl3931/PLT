// Generated from Grammar.g by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
		Set=45, If=46, Else=47, LPAREN=48, RPAREN=49, LBRACE=50, RBRACE=51, While=52, 
		For=53, Repeat=54, Function=55, Import=56, Challenge=57, Match=58, Quit=59, 
		Recordchallenge=60, Addhint=61, Hint=62, Removehint=63, Savechallenge=64, 
		Number=65, Identifier=66, String=67, Comment=68, WS=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'^'", "','", "'+'", "'*'", "':'", "'<'", "'='", "'!='", "'<='", "'&&'", 
		"'||'", "'>'", "'/'", "'>='", "'-'", "'!'", "Forward", "Back", "Left", 
		"Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", "Origin", 
		"Front", "Wrap", "Fence", "Getx", "Gety", "Getspeed", "Getxy", "Penup", 
		"Pendown", "Save", "Color", "Fill", "Setspeed", "Hideturtle", "Showturtle", 
		"Load", "Turtle", "Set", "'if'", "'else'", "'('", "')'", "'{'", "'}'", 
		"'while'", "'for'", "Repeat", "Function", "Import", "Challenge", "Match", 
		"Quit", "Recordchallenge", "Addhint", "Hint", "Removehint", "Savechallenge", 
		"Number", "Identifier", "String", "Comment", "WS"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "Unary_minus", "Unary_not", "Forward", 
		"Back", "Left", "Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", 
		"Origin", "Front", "Wrap", "Fence", "Getx", "Gety", "Getspeed", "Getxy", 
		"Penup", "Pendown", "Save", "Color", "Fill", "Setspeed", "Hideturtle", 
		"Showturtle", "Load", "Turtle", "Set", "If", "Else", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "While", "For", "Repeat", "Function", "Import", "Challenge", 
		"Match", "Quit", "Recordchallenge", "Addhint", "Hint", "Removehint", "Savechallenge", 
		"Number", "Identifier", "String", "Comment", "WS"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 67: Comment_action((RuleContext)_localctx, actionIndex); break;

		case 68: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void Comment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4G\u04a0\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00cf\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00db\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e9\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00f3\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00fd\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0119\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0125\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0131\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u014b\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0161\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0198\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u01a2\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01ae\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u01b8"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\5!\u01c2\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e6\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\5#\u01f5\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5"+
		"$\u0203\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0215\n"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0223\n&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0234\n\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\5(\u0242\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)"+
		"\u0266\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\5*\u027e\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u0296\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02a4"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02b8\n-"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02c3\n.\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02f1\n\67\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\58\u0303\n8\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\59\u0317\n9\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0334\n"+
		":\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0345\n;\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0389\n<\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03db\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u03fb\n"+
		">\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0409\n?\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0435\n@\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\5A\u046d\nA\3B\6B\u0470\nB\rB\16B\u0471\3B\3B\6B\u0476\nB\rB\16B"+
		"\u0477\5B\u047a\nB\3C\3C\7C\u047e\nC\fC\16C\u0481\13C\3D\3D\7D\u0485\n"+
		"D\fD\16D\u0488\13D\3D\3D\3E\3E\7E\u048e\nE\fE\16E\u0491\13E\3E\5E\u0494"+
		"\nE\3E\3E\3E\3E\3F\6F\u049b\nF\rF\16F\u049c\3F\3F\3\u0486G\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%"+
		"\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64"+
		"\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081"+
		"B\1\u0083C\1\u0085D\1\u0087E\1\u0089F\2\u008bG\3\3\2\6\5C\\aac|\4\62;"+
		"C|\4\f\f\17\17\5\13\f\17\17\"\"\u0509\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2"+
		"\2\t\u0093\3\2\2\2\13\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21"+
		"\u009b\3\2\2\2\23\u009e\3\2\2\2\25\u00a1\3\2\2\2\27\u00a4\3\2\2\2\31\u00a7"+
		"\3\2\2\2\33\u00a9\3\2\2\2\35\u00ab\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2"+
		"\2\2#\u00c2\3\2\2\2%\u00ce\3\2\2\2\'\u00da\3\2\2\2)\u00e8\3\2\2\2+\u00f2"+
		"\3\2\2\2-\u00fc\3\2\2\2/\u0118\3\2\2\2\61\u0124\3\2\2\2\63\u0130\3\2\2"+
		"\2\65\u014a\3\2\2\2\67\u0160\3\2\2\29\u0197\3\2\2\2;\u01a1\3\2\2\2=\u01ad"+
		"\3\2\2\2?\u01b7\3\2\2\2A\u01c1\3\2\2\2C\u01e5\3\2\2\2E\u01f4\3\2\2\2G"+
		"\u0202\3\2\2\2I\u0214\3\2\2\2K\u0222\3\2\2\2M\u0233\3\2\2\2O\u0241\3\2"+
		"\2\2Q\u0265\3\2\2\2S\u027d\3\2\2\2U\u0295\3\2\2\2W\u02a3\3\2\2\2Y\u02b7"+
		"\3\2\2\2[\u02c2\3\2\2\2]\u02c4\3\2\2\2_\u02c7\3\2\2\2a\u02cc\3\2\2\2c"+
		"\u02ce\3\2\2\2e\u02d0\3\2\2\2g\u02d2\3\2\2\2i\u02d4\3\2\2\2k\u02da\3\2"+
		"\2\2m\u02f0\3\2\2\2o\u0302\3\2\2\2q\u0316\3\2\2\2s\u0333\3\2\2\2u\u0344"+
		"\3\2\2\2w\u0388\3\2\2\2y\u03da\3\2\2\2{\u03fa\3\2\2\2}\u0408\3\2\2\2\177"+
		"\u0434\3\2\2\2\u0081\u046c\3\2\2\2\u0083\u046f\3\2\2\2\u0085\u047b\3\2"+
		"\2\2\u0087\u0482\3\2\2\2\u0089\u048b\3\2\2\2\u008b\u049a\3\2\2\2\u008d"+
		"\u008e\7`\2\2\u008e\4\3\2\2\2\u008f\u0090\7.\2\2\u0090\6\3\2\2\2\u0091"+
		"\u0092\7-\2\2\u0092\b\3\2\2\2\u0093\u0094\7,\2\2\u0094\n\3\2\2\2\u0095"+
		"\u0096\7<\2\2\u0096\f\3\2\2\2\u0097\u0098\7>\2\2\u0098\16\3\2\2\2\u0099"+
		"\u009a\7?\2\2\u009a\20\3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d\7?\2\2\u009d"+
		"\22\3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a0\7?\2\2\u00a0\24\3\2\2\2\u00a1"+
		"\u00a2\7(\2\2\u00a2\u00a3\7(\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7~\2\2\u00a5"+
		"\u00a6\7~\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\32\3\2\2\2\u00a9"+
		"\u00aa\7\61\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\u00ad\7?\2\2"+
		"\u00ad\36\3\2\2\2\u00ae\u00af\7/\2\2\u00af \3\2\2\2\u00b0\u00b1\7#\2\2"+
		"\u00b1\"\3\2\2\2\u00b2\u00b3\7H\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t"+
		"\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\u00c3"+
		"\7f\2\2\u00b9\u00ba\7H\2\2\u00ba\u00bb\7Q\2\2\u00bb\u00bc\7T\2\2\u00bc"+
		"\u00bd\7Y\2\2\u00bd\u00be\7C\2\2\u00be\u00bf\7T\2\2\u00bf\u00c3\7F\2\2"+
		"\u00c0\u00c1\7H\2\2\u00c1\u00c3\7F\2\2\u00c2\u00b2\3\2\2\2\u00c2\u00b9"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7D\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7e\2\2\u00c7\u00cf\7m\2\2\u00c8\u00c9\7D\2\2\u00c9"+
		"\u00ca\7C\2\2\u00ca\u00cb\7E\2\2\u00cb\u00cf\7M\2\2\u00cc\u00cd\7D\2\2"+
		"\u00cd\u00cf\7M\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
		"\7h\2\2\u00d3\u00db\7v\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d6\7G\2\2\u00d6"+
		"\u00d7\7H\2\2\u00d7\u00db\7V\2\2\u00d8\u00d9\7N\2\2\u00d9\u00db\7V\2\2"+
		"\u00da\u00d0\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d8\3\2\2\2\u00db(\3"+
		"\2\2\2\u00dc\u00dd\7T\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7i\2\2\u00df"+
		"\u00e0\7j\2\2\u00e0\u00e9\7v\2\2\u00e1\u00e2\7T\2\2\u00e2\u00e3\7K\2\2"+
		"\u00e3\u00e4\7I\2\2\u00e4\u00e5\7J\2\2\u00e5\u00e9\7V\2\2\u00e6\u00e7"+
		"\7T\2\2\u00e7\u00e9\7V\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9*\3\2\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed\u00f3\7Z\2\2\u00ee\u00ef\7U\2\2\u00ef\u00f0\7G\2\2"+
		"\u00f0\u00f1\7V\2\2\u00f1\u00f3\7Z\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ee"+
		"\3\2\2\2\u00f3,\3\2\2\2\u00f4\u00f5\7U\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7"+
		"\7v\2\2\u00f7\u00fd\7[\2\2\u00f8\u00f9\7U\2\2\u00f9\u00fa\7G\2\2\u00fa"+
		"\u00fb\7V\2\2\u00fb\u00fd\7[\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f8\3\2\2"+
		"\2\u00fd.\3\2\2\2\u00fe\u00ff\7U\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7"+
		"v\2\2\u0101\u0102\7Z\2\2\u0102\u0119\7[\2\2\u0103\u0104\7U\2\2\u0104\u0105"+
		"\7G\2\2\u0105\u0106\7V\2\2\u0106\u0107\7Z\2\2\u0107\u0119\7[\2\2\u0108"+
		"\u0109\7V\2\2\u0109\u010a\7g\2\2\u010a\u010b\7n\2\2\u010b\u010c\7g\2\2"+
		"\u010c\u010d\7r\2\2\u010d\u010e\7q\2\2\u010e\u010f\7t\2\2\u010f\u0119"+
		"\7v\2\2\u0110\u0111\7V\2\2\u0111\u0112\7G\2\2\u0112\u0113\7N\2\2\u0113"+
		"\u0114\7G\2\2\u0114\u0115\7R\2\2\u0115\u0116\7Q\2\2\u0116\u0117\7T\2\2"+
		"\u0117\u0119\7V\2\2\u0118\u00fe\3\2\2\2\u0118\u0103\3\2\2\2\u0118\u0108"+
		"\3\2\2\2\u0118\u0110\3\2\2\2\u0119\60\3\2\2\2\u011a\u011b\7U\2\2\u011b"+
		"\u011c\7r\2\2\u011c\u011d\7g\2\2\u011d\u011e\7g\2\2\u011e\u0125\7f\2\2"+
		"\u011f\u0120\7U\2\2\u0120\u0121\7R\2\2\u0121\u0122\7G\2\2\u0122\u0123"+
		"\7G\2\2\u0123\u0125\7F\2\2\u0124\u011a\3\2\2\2\u0124\u011f\3\2\2\2\u0125"+
		"\62\3\2\2\2\u0126\u0127\7R\2\2\u0127\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129"+
		"\u012a\7p\2\2\u012a\u0131\7v\2\2\u012b\u012c\7R\2\2\u012c\u012d\7T\2\2"+
		"\u012d\u012e\7K\2\2\u012e\u012f\7P\2\2\u012f\u0131\7V\2\2\u0130\u0126"+
		"\3\2\2\2\u0130\u012b\3\2\2\2\u0131\64\3\2\2\2\u0132\u0133\7E\2\2\u0133"+
		"\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135\u0136\7c\2\2\u0136\u0137\7t\2\2"+
		"\u0137\u0138\7u\2\2\u0138\u0139\7e\2\2\u0139\u013a\7t\2\2\u013a\u013b"+
		"\7g\2\2\u013b\u013c\7g\2\2\u013c\u014b\7p\2\2\u013d\u013e\7E\2\2\u013e"+
		"\u013f\7N\2\2\u013f\u0140\7G\2\2\u0140\u0141\7C\2\2\u0141\u0142\7T\2\2"+
		"\u0142\u0143\7U\2\2\u0143\u0144\7E\2\2\u0144\u0145\7T\2\2\u0145\u0146"+
		"\7G\2\2\u0146\u0147\7G\2\2\u0147\u014b\7P\2\2\u0148\u0149\7E\2\2\u0149"+
		"\u014b\7U\2\2\u014a\u0132\3\2\2\2\u014a\u013d\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\66\3\2\2\2\u014c\u014d\7Q\2\2\u014d\u014e\7t\2\2\u014e\u014f"+
		"\7k\2\2\u014f\u0150\7i\2\2\u0150\u0151\7k\2\2\u0151\u0161\7p\2\2\u0152"+
		"\u0153\7Q\2\2\u0153\u0154\7T\2\2\u0154\u0155\7K\2\2\u0155\u0156\7I\2\2"+
		"\u0156\u0157\7K\2\2\u0157\u0161\7P\2\2\u0158\u0159\7J\2\2\u0159\u015a"+
		"\7q\2\2\u015a\u015b\7o\2\2\u015b\u0161\7g\2\2\u015c\u015d\7J\2\2\u015d"+
		"\u015e\7Q\2\2\u015e\u015f\7O\2\2\u015f\u0161\7G\2\2\u0160\u014c\3\2\2"+
		"\2\u0160\u0152\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u015c\3\2\2\2\u01618"+
		"\3\2\2\2\u0162\u0163\7H\2\2\u0163\u0164\7t\2\2\u0164\u0165\7q\2\2\u0165"+
		"\u0166\7p\2\2\u0166\u0198\7v\2\2\u0167\u0168\7H\2\2\u0168\u0169\7T\2\2"+
		"\u0169\u016a\7Q\2\2\u016a\u016b\7P\2\2\u016b\u0198\7V\2\2\u016c\u016d"+
		"\7h\2\2\u016d\u016e\7t\2\2\u016e\u016f\7q\2\2\u016f\u0170\7p\2\2\u0170"+
		"\u0198\7v\2\2\u0171\u0172\7H\2\2\u0172\u0173\7c\2\2\u0173\u0174\7e\2\2"+
		"\u0174\u0175\7g\2\2\u0175\u0176\7H\2\2\u0176\u0177\7t\2\2\u0177\u0178"+
		"\7q\2\2\u0178\u0179\7p\2\2\u0179\u0198\7v\2\2\u017a\u017b\7H\2\2\u017b"+
		"\u017c\7C\2\2\u017c\u017d\7E\2\2\u017d\u017e\7G\2\2\u017e\u017f\7H\2\2"+
		"\u017f\u0180\7T\2\2\u0180\u0181\7Q\2\2\u0181\u0182\7P\2\2\u0182\u0198"+
		"\7V\2\2\u0183\u0184\7h\2\2\u0184\u0185\7c\2\2\u0185\u0186\7e\2\2\u0186"+
		"\u0187\7g\2\2\u0187\u0188\7h\2\2\u0188\u0189\7t\2\2\u0189\u018a\7q\2\2"+
		"\u018a\u018b\7p\2\2\u018b\u0198\7v\2\2\u018c\u018d\7H\2\2\u018d\u018e"+
		"\7c\2\2\u018e\u018f\7e\2\2\u018f\u0190\7g\2\2\u0190\u0191\7h\2\2\u0191"+
		"\u0192\7t\2\2\u0192\u0193\7q\2\2\u0193\u0194\7p\2\2\u0194\u0198\7v\2\2"+
		"\u0195\u0196\7H\2\2\u0196\u0198\7H\2\2\u0197\u0162\3\2\2\2\u0197\u0167"+
		"\3\2\2\2\u0197\u016c\3\2\2\2\u0197\u0171\3\2\2\2\u0197\u017a\3\2\2\2\u0197"+
		"\u0183\3\2\2\2\u0197\u018c\3\2\2\2\u0197\u0195\3\2\2\2\u0198:\3\2\2\2"+
		"\u0199\u019a\7Y\2\2\u019a\u019b\7t\2\2\u019b\u019c\7c\2\2\u019c\u01a2"+
		"\7r\2\2\u019d\u019e\7Y\2\2\u019e\u019f\7T\2\2\u019f\u01a0\7C\2\2\u01a0"+
		"\u01a2\7R\2\2\u01a1\u0199\3\2\2\2\u01a1\u019d\3\2\2\2\u01a2<\3\2\2\2\u01a3"+
		"\u01a4\7H\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7e\2\2"+
		"\u01a7\u01ae\7g\2\2\u01a8\u01a9\7H\2\2\u01a9\u01aa\7G\2\2\u01aa\u01ab"+
		"\7P\2\2\u01ab\u01ac\7E\2\2\u01ac\u01ae\7G\2\2\u01ad\u01a3\3\2\2\2\u01ad"+
		"\u01a8\3\2\2\2\u01ae>\3\2\2\2\u01af\u01b0\7I\2\2\u01b0\u01b1\7g\2\2\u01b1"+
		"\u01b2\7v\2\2\u01b2\u01b8\7z\2\2\u01b3\u01b4\7I\2\2\u01b4\u01b5\7G\2\2"+
		"\u01b5\u01b6\7V\2\2\u01b6\u01b8\7Z\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b3"+
		"\3\2\2\2\u01b8@\3\2\2\2\u01b9\u01ba\7I\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc"+
		"\7v\2\2\u01bc\u01c2\7{\2\2\u01bd\u01be\7I\2\2\u01be\u01bf\7G\2\2\u01bf"+
		"\u01c0\7V\2\2\u01c0\u01c2\7[\2\2\u01c1\u01b9\3\2\2\2\u01c1\u01bd\3\2\2"+
		"\2\u01c2B\3\2\2\2\u01c3\u01c4\7I\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7"+
		"v\2\2\u01c6\u01c7\7U\2\2\u01c7\u01c8\7r\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca"+
		"\7g\2\2\u01ca\u01e6\7f\2\2\u01cb\u01cc\7I\2\2\u01cc\u01e6\7U\2\2\u01cd"+
		"\u01ce\7I\2\2\u01ce\u01cf\7G\2\2\u01cf\u01d0\7V\2\2\u01d0\u01d1\7U\2\2"+
		"\u01d1\u01d2\7R\2\2\u01d2\u01d3\7G\2\2\u01d3\u01d4\7G\2\2\u01d4\u01e6"+
		"\7F\2\2\u01d5\u01d6\7i\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7v\2\2\u01d8"+
		"\u01d9\7u\2\2\u01d9\u01da\7r\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7g\2\2"+
		"\u01dc\u01e6\7f\2\2\u01dd\u01de\7I\2\2\u01de\u01df\7g\2\2\u01df\u01e0"+
		"\7v\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7r\2\2\u01e2\u01e3\7g\2\2\u01e3"+
		"\u01e4\7g\2\2\u01e4\u01e6\7f\2\2\u01e5\u01c3\3\2\2\2\u01e5\u01cb\3\2\2"+
		"\2\u01e5\u01cd\3\2\2\2\u01e5\u01d5\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e6D"+
		"\3\2\2\2\u01e7\u01e8\7I\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7v\2\2\u01ea"+
		"\u01eb\7z\2\2\u01eb\u01f5\7{\2\2\u01ec\u01ed\7I\2\2\u01ed\u01ee\7G\2\2"+
		"\u01ee\u01ef\7V\2\2\u01ef\u01f0\7Z\2\2\u01f0\u01f5\7[\2\2\u01f1\u01f2"+
		"\7I\2\2\u01f2\u01f3\7R\2\2\u01f3\u01f5\7U\2\2\u01f4\u01e7\3\2\2\2\u01f4"+
		"\u01ec\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5F\3\2\2\2\u01f6\u01f7\7R\2\2\u01f7"+
		"\u01f8\7g\2\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7w\2\2\u01fa\u0203\7r\2\2"+
		"\u01fb\u01fc\7R\2\2\u01fc\u01fd\7G\2\2\u01fd\u01fe\7P\2\2\u01fe\u01ff"+
		"\7W\2\2\u01ff\u0203\7R\2\2\u0200\u0201\7R\2\2\u0201\u0203\7W\2\2\u0202"+
		"\u01f6\3\2\2\2\u0202\u01fb\3\2\2\2\u0202\u0200\3\2\2\2\u0203H\3\2\2\2"+
		"\u0204\u0205\7R\2\2\u0205\u0206\7g\2\2\u0206\u0207\7p\2\2\u0207\u0208"+
		"\7f\2\2\u0208\u0209\7q\2\2\u0209\u020a\7y\2\2\u020a\u0215\7p\2\2\u020b"+
		"\u020c\7R\2\2\u020c\u020d\7G\2\2\u020d\u020e\7P\2\2\u020e\u020f\7F\2\2"+
		"\u020f\u0210\7Q\2\2\u0210\u0211\7Y\2\2\u0211\u0215\7P\2\2\u0212\u0213"+
		"\7R\2\2\u0213\u0215\7F\2\2\u0214\u0204\3\2\2\2\u0214\u020b\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215J\3\2\2\2\u0216\u0217\7U\2\2\u0217\u0218\7c\2\2\u0218"+
		"\u0219\7x\2\2\u0219\u0223\7g\2\2\u021a\u021b\7u\2\2\u021b\u021c\7c\2\2"+
		"\u021c\u021d\7x\2\2\u021d\u0223\7g\2\2\u021e\u021f\7U\2\2\u021f\u0220"+
		"\7C\2\2\u0220\u0221\7X\2\2\u0221\u0223\7G\2\2\u0222\u0216\3\2\2\2\u0222"+
		"\u021a\3\2\2\2\u0222\u021e\3\2\2\2\u0223L\3\2\2\2\u0224\u0225\7E\2\2\u0225"+
		"\u0226\7q\2\2\u0226\u0227\7n\2\2\u0227\u0228\7q\2\2\u0228\u0234\7t\2\2"+
		"\u0229\u022a\7e\2\2\u022a\u022b\7q\2\2\u022b\u022c\7n\2\2\u022c\u022d"+
		"\7q\2\2\u022d\u0234\7t\2\2\u022e\u022f\7E\2\2\u022f\u0230\7Q\2\2\u0230"+
		"\u0231\7N\2\2\u0231\u0232\7Q\2\2\u0232\u0234\7T\2\2\u0233\u0224\3\2\2"+
		"\2\u0233\u0229\3\2\2\2\u0233\u022e\3\2\2\2\u0234N\3\2\2\2\u0235\u0236"+
		"\7H\2\2\u0236\u0237\7k\2\2\u0237\u0238\7n\2\2\u0238\u0242\7n\2\2\u0239"+
		"\u023a\7h\2\2\u023a\u023b\7k\2\2\u023b\u023c\7n\2\2\u023c\u0242\7n\2\2"+
		"\u023d\u023e\7H\2\2\u023e\u023f\7K\2\2\u023f\u0240\7N\2\2\u0240\u0242"+
		"\7N\2\2\u0241\u0235\3\2\2\2\u0241\u0239\3\2\2\2\u0241\u023d\3\2\2\2\u0242"+
		"P\3\2\2\2\u0243\u0244\7U\2\2\u0244\u0245\7g\2\2\u0245\u0246\7v\2\2\u0246"+
		"\u0247\7U\2\2\u0247\u0248\7r\2\2\u0248\u0249\7g\2\2\u0249\u024a\7g\2\2"+
		"\u024a\u0266\7f\2\2\u024b\u024c\7U\2\2\u024c\u024d\7G\2\2\u024d\u024e"+
		"\7V\2\2\u024e\u024f\7U\2\2\u024f\u0250\7R\2\2\u0250\u0251\7G\2\2\u0251"+
		"\u0252\7G\2\2\u0252\u0266\7F\2\2\u0253\u0254\7u\2\2\u0254\u0255\7g\2\2"+
		"\u0255\u0256\7v\2\2\u0256\u0257\7u\2\2\u0257\u0258\7r\2\2\u0258\u0259"+
		"\7g\2\2\u0259\u025a\7g\2\2\u025a\u0266\7f\2\2\u025b\u025c\7U\2\2\u025c"+
		"\u025d\7g\2\2\u025d\u025e\7v\2\2\u025e\u025f\7u\2\2\u025f\u0260\7r\2\2"+
		"\u0260\u0261\7g\2\2\u0261\u0262\7g\2\2\u0262\u0266\7f\2\2\u0263\u0264"+
		"\7U\2\2\u0264\u0266\7U\2\2\u0265\u0243\3\2\2\2\u0265\u024b\3\2\2\2\u0265"+
		"\u0253\3\2\2\2\u0265\u025b\3\2\2\2\u0265\u0263\3\2\2\2\u0266R\3\2\2\2"+
		"\u0267\u0268\7J\2\2\u0268\u0269\7k\2\2\u0269\u026a\7f\2\2\u026a\u026b"+
		"\7g\2\2\u026b\u026c\7v\2\2\u026c\u026d\7w\2\2\u026d\u026e\7t\2\2\u026e"+
		"\u026f\7v\2\2\u026f\u0270\7n\2\2\u0270\u027e\7g\2\2\u0271\u0272\7J\2\2"+
		"\u0272\u0273\7K\2\2\u0273\u0274\7F\2\2\u0274\u0275\7G\2\2\u0275\u0276"+
		"\7V\2\2\u0276\u0277\7W\2\2\u0277\u0278\7T\2\2\u0278\u0279\7V\2\2\u0279"+
		"\u027a\7N\2\2\u027a\u027e\7G\2\2\u027b\u027c\7J\2\2\u027c\u027e\7V\2\2"+
		"\u027d\u0267\3\2\2\2\u027d\u0271\3\2\2\2\u027d\u027b\3\2\2\2\u027eT\3"+
		"\2\2\2\u027f\u0280\7U\2\2\u0280\u0281\7j\2\2\u0281\u0282\7q\2\2\u0282"+
		"\u0283\7y\2\2\u0283\u0284\7v\2\2\u0284\u0285\7w\2\2\u0285\u0286\7t\2\2"+
		"\u0286\u0287\7v\2\2\u0287\u0288\7n\2\2\u0288\u0296\7g\2\2\u0289\u028a"+
		"\7U\2\2\u028a\u028b\7J\2\2\u028b\u028c\7Q\2\2\u028c\u028d\7Y\2\2\u028d"+
		"\u028e\7V\2\2\u028e\u028f\7W\2\2\u028f\u0290\7T\2\2\u0290\u0291\7V\2\2"+
		"\u0291\u0292\7N\2\2\u0292\u0296\7G\2\2\u0293\u0294\7U\2\2\u0294\u0296"+
		"\7V\2\2\u0295\u027f\3\2\2\2\u0295\u0289\3\2\2\2\u0295\u0293\3\2\2\2\u0296"+
		"V\3\2\2\2\u0297\u0298\7N\2\2\u0298\u0299\7q\2\2\u0299\u029a\7c\2\2\u029a"+
		"\u02a4\7f\2\2\u029b\u029c\7N\2\2\u029c\u029d\7Q\2\2\u029d\u029e\7C\2\2"+
		"\u029e\u02a4\7F\2\2\u029f\u02a0\7n\2\2\u02a0\u02a1\7q\2\2\u02a1\u02a2"+
		"\7c\2\2\u02a2\u02a4\7f\2\2\u02a3\u0297\3\2\2\2\u02a3\u029b\3\2\2\2\u02a3"+
		"\u029f\3\2\2\2\u02a4X\3\2\2\2\u02a5\u02a6\7V\2\2\u02a6\u02a7\7w\2\2\u02a7"+
		"\u02a8\7t\2\2\u02a8\u02a9\7v\2\2\u02a9\u02aa\7n\2\2\u02aa\u02b8\7g\2\2"+
		"\u02ab\u02ac\7V\2\2\u02ac\u02ad\7W\2\2\u02ad\u02ae\7T\2\2\u02ae\u02af"+
		"\7V\2\2\u02af\u02b0\7N\2\2\u02b0\u02b8\7G\2\2\u02b1\u02b2\7v\2\2\u02b2"+
		"\u02b3\7w\2\2\u02b3\u02b4\7t\2\2\u02b4\u02b5\7v\2\2\u02b5\u02b6\7n\2\2"+
		"\u02b6\u02b8\7g\2\2\u02b7\u02a5\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b7\u02b1"+
		"\3\2\2\2\u02b8Z\3\2\2\2\u02b9\u02ba\7U\2\2\u02ba\u02bb\7g\2\2\u02bb\u02c3"+
		"\7v\2\2\u02bc\u02bd\7U\2\2\u02bd\u02be\7G\2\2\u02be\u02c3\7V\2\2\u02bf"+
		"\u02c0\7u\2\2\u02c0\u02c1\7g\2\2\u02c1\u02c3\7v\2\2\u02c2\u02b9\3\2\2"+
		"\2\u02c2\u02bc\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c3\\\3\2\2\2\u02c4\u02c5"+
		"\7k\2\2\u02c5\u02c6\7h\2\2\u02c6^\3\2\2\2\u02c7\u02c8\7g\2\2\u02c8\u02c9"+
		"\7n\2\2\u02c9\u02ca\7u\2\2\u02ca\u02cb\7g\2\2\u02cb`\3\2\2\2\u02cc\u02cd"+
		"\7*\2\2\u02cdb\3\2\2\2\u02ce\u02cf\7+\2\2\u02cfd\3\2\2\2\u02d0\u02d1\7"+
		"}\2\2\u02d1f\3\2\2\2\u02d2\u02d3\7\177\2\2\u02d3h\3\2\2\2\u02d4\u02d5"+
		"\7y\2\2\u02d5\u02d6\7j\2\2\u02d6\u02d7\7k\2\2\u02d7\u02d8\7n\2\2\u02d8"+
		"\u02d9\7g\2\2\u02d9j\3\2\2\2\u02da\u02db\7h\2\2\u02db\u02dc\7q\2\2\u02dc"+
		"\u02dd\7t\2\2\u02ddl\3\2\2\2\u02de\u02df\7T\2\2\u02df\u02e0\7g\2\2\u02e0"+
		"\u02e1\7r\2\2\u02e1\u02e2\7g\2\2\u02e2\u02e3\7c\2\2\u02e3\u02f1\7v\2\2"+
		"\u02e4\u02e5\7t\2\2\u02e5\u02e6\7g\2\2\u02e6\u02e7\7r\2\2\u02e7\u02e8"+
		"\7g\2\2\u02e8\u02e9\7c\2\2\u02e9\u02f1\7v\2\2\u02ea\u02eb\7T\2\2\u02eb"+
		"\u02ec\7G\2\2\u02ec\u02ed\7R\2\2\u02ed\u02ee\7G\2\2\u02ee\u02ef\7C\2\2"+
		"\u02ef\u02f1\7V\2\2\u02f0\u02de\3\2\2\2\u02f0\u02e4\3\2\2\2\u02f0\u02ea"+
		"\3\2\2\2\u02f1n\3\2\2\2\u02f2\u02f3\7H\2\2\u02f3\u02f4\7W\2\2\u02f4\u02f5"+
		"\7P\2\2\u02f5\u02f6\7E\2\2\u02f6\u02f7\7V\2\2\u02f7\u02f8\7K\2\2\u02f8"+
		"\u02f9\7Q\2\2\u02f9\u0303\7P\2\2\u02fa\u02fb\7h\2\2\u02fb\u02fc\7w\2\2"+
		"\u02fc\u02fd\7p\2\2\u02fd\u02fe\7e\2\2\u02fe\u02ff\7v\2\2\u02ff\u0300"+
		"\7k\2\2\u0300\u0301\7q\2\2\u0301\u0303\7p\2\2\u0302\u02f2\3\2\2\2\u0302"+
		"\u02fa\3\2\2\2\u0303p\3\2\2\2\u0304\u0305\7K\2\2\u0305\u0306\7O\2\2\u0306"+
		"\u0307\7R\2\2\u0307\u0308\7Q\2\2\u0308\u0309\7T\2\2\u0309\u0317\7V\2\2"+
		"\u030a\u030b\7K\2\2\u030b\u030c\7o\2\2\u030c\u030d\7r\2\2\u030d\u030e"+
		"\7q\2\2\u030e\u030f\7t\2\2\u030f\u0317\7v\2\2\u0310\u0311\7k\2\2\u0311"+
		"\u0312\7o\2\2\u0312\u0313\7r\2\2\u0313\u0314\7q\2\2\u0314\u0315\7t\2\2"+
		"\u0315\u0317\7v\2\2\u0316\u0304\3\2\2\2\u0316\u030a\3\2\2\2\u0316\u0310"+
		"\3\2\2\2\u0317r\3\2\2\2\u0318\u0319\7E\2\2\u0319\u031a\7j\2\2\u031a\u031b"+
		"\7c\2\2\u031b\u031c\7n\2\2\u031c\u031d\7n\2\2\u031d\u031e\7g\2\2\u031e"+
		"\u031f\7p\2\2\u031f\u0320\7i\2\2\u0320\u0334\7g\2\2\u0321\u0322\7E\2\2"+
		"\u0322\u0323\7J\2\2\u0323\u0324\7C\2\2\u0324\u0325\7N\2\2\u0325\u0326"+
		"\7N\2\2\u0326\u0327\7G\2\2\u0327\u0328\7P\2\2\u0328\u0329\7I\2\2\u0329"+
		"\u0334\7G\2\2\u032a\u032b\7e\2\2\u032b\u032c\7j\2\2\u032c\u032d\7c\2\2"+
		"\u032d\u032e\7n\2\2\u032e\u032f\7n\2\2\u032f\u0330\7g\2\2\u0330\u0331"+
		"\7p\2\2\u0331\u0332\7i\2\2\u0332\u0334\7g\2\2\u0333\u0318\3\2\2\2\u0333"+
		"\u0321\3\2\2\2\u0333\u032a\3\2\2\2\u0334t\3\2\2\2\u0335\u0336\7O\2\2\u0336"+
		"\u0337\7c\2\2\u0337\u0338\7v\2\2\u0338\u0339\7e\2\2\u0339\u0345\7j\2\2"+
		"\u033a\u033b\7O\2\2\u033b\u033c\7C\2\2\u033c\u033d\7V\2\2\u033d\u033e"+
		"\7E\2\2\u033e\u0345\7J\2\2\u033f\u0340\7o\2\2\u0340\u0341\7c\2\2\u0341"+
		"\u0342\7v\2\2\u0342\u0343\7e\2\2\u0343\u0345\7j\2\2\u0344\u0335\3\2\2"+
		"\2\u0344\u033a\3\2\2\2\u0344\u033f\3\2\2\2\u0345v\3\2\2\2\u0346\u0347"+
		"\7S\2\2\u0347\u0348\7w\2\2\u0348\u0349\7k\2\2\u0349\u034a\7v\2\2\u034a"+
		"\u034b\7e\2\2\u034b\u034c\7j\2\2\u034c\u034d\7c\2\2\u034d\u034e\7n\2\2"+
		"\u034e\u034f\7n\2\2\u034f\u0350\7g\2\2\u0350\u0351\7p\2\2\u0351\u0352"+
		"\7i\2\2\u0352\u0389\7g\2\2\u0353\u0354\7S\2\2\u0354\u0355\7W\2\2\u0355"+
		"\u0356\7K\2\2\u0356\u0357\7V\2\2\u0357\u0358\7E\2\2\u0358\u0359\7J\2\2"+
		"\u0359\u035a\7C\2\2\u035a\u035b\7N\2\2\u035b\u035c\7N\2\2\u035c\u035d"+
		"\7G\2\2\u035d\u035e\7P\2\2\u035e\u035f\7I\2\2\u035f\u0389\7G\2\2\u0360"+
		"\u0361\7s\2\2\u0361\u0362\7w\2\2\u0362\u0363\7k\2\2\u0363\u0364\7v\2\2"+
		"\u0364\u0365\7e\2\2\u0365\u0366\7j\2\2\u0366\u0367\7c\2\2\u0367\u0368"+
		"\7n\2\2\u0368\u0369\7n\2\2\u0369\u036a\7g\2\2\u036a\u036b\7p\2\2\u036b"+
		"\u036c\7i\2\2\u036c\u0389\7g\2\2\u036d\u036e\7S\2\2\u036e\u036f\7w\2\2"+
		"\u036f\u0370\7k\2\2\u0370\u0371\7v\2\2\u0371\u0372\7E\2\2\u0372\u0373"+
		"\7j\2\2\u0373\u0374\7c\2\2\u0374\u0375\7n\2\2\u0375\u0376\7n\2\2\u0376"+
		"\u0377\7g\2\2\u0377\u0378\7p\2\2\u0378\u0379\7i\2\2\u0379\u0389\7g\2\2"+
		"\u037a\u037b\7S\2\2\u037b\u0389\7E\2\2\u037c\u037d\7S\2\2\u037d\u037e"+
		"\7w\2\2\u037e\u037f\7k\2\2\u037f\u0389\7v\2\2\u0380\u0381\7s\2\2\u0381"+
		"\u0382\7w\2\2\u0382\u0383\7k\2\2\u0383\u0389\7v\2\2\u0384\u0385\7S\2\2"+
		"\u0385\u0386\7W\2\2\u0386\u0387\7K\2\2\u0387\u0389\7V\2\2\u0388\u0346"+
		"\3\2\2\2\u0388\u0353\3\2\2\2\u0388\u0360\3\2\2\2\u0388\u036d\3\2\2\2\u0388"+
		"\u037a\3\2\2\2\u0388\u037c\3\2\2\2\u0388\u0380\3\2\2\2\u0388\u0384\3\2"+
		"\2\2\u0389x\3\2\2\2\u038a\u038b\7T\2\2\u038b\u038c\7g\2\2\u038c\u038d"+
		"\7e\2\2\u038d\u038e\7q\2\2\u038e\u038f\7t\2\2\u038f\u0390\7f\2\2\u0390"+
		"\u0391\7e\2\2\u0391\u0392\7j\2\2\u0392\u0393\7c\2\2\u0393\u0394\7n\2\2"+
		"\u0394\u0395\7n\2\2\u0395\u0396\7g\2\2\u0396\u0397\7p\2\2\u0397\u0398"+
		"\7i\2\2\u0398\u03db\7g\2\2\u0399\u039a\7T\2\2\u039a\u039b\7G\2\2\u039b"+
		"\u039c\7E\2\2\u039c\u039d\7Q\2\2\u039d\u039e\7T\2\2\u039e\u039f\7F\2\2"+
		"\u039f\u03a0\7E\2\2\u03a0\u03a1\7J\2\2\u03a1\u03a2\7C\2\2\u03a2\u03a3"+
		"\7N\2\2\u03a3\u03a4\7N\2\2\u03a4\u03a5\7G\2\2\u03a5\u03a6\7P\2\2\u03a6"+
		"\u03a7\7I\2\2\u03a7\u03db\7G\2\2\u03a8\u03a9\7t\2\2\u03a9\u03aa\7g\2\2"+
		"\u03aa\u03ab\7e\2\2\u03ab\u03ac\7q\2\2\u03ac\u03ad\7t\2\2\u03ad\u03ae"+
		"\7f\2\2\u03ae\u03af\7e\2\2\u03af\u03b0\7j\2\2\u03b0\u03b1\7c\2\2\u03b1"+
		"\u03b2\7n\2\2\u03b2\u03b3\7n\2\2\u03b3\u03b4\7g\2\2\u03b4\u03b5\7p\2\2"+
		"\u03b5\u03b6\7i\2\2\u03b6\u03db\7g\2\2\u03b7\u03b8\7T\2\2\u03b8\u03b9"+
		"\7g\2\2\u03b9\u03ba\7e\2\2\u03ba\u03bb\7q\2\2\u03bb\u03bc\7t\2\2\u03bc"+
		"\u03bd\7f\2\2\u03bd\u03be\7E\2\2\u03be\u03bf\7j\2\2\u03bf\u03c0\7c\2\2"+
		"\u03c0\u03c1\7n\2\2\u03c1\u03c2\7n\2\2\u03c2\u03c3\7g\2\2\u03c3\u03c4"+
		"\7p\2\2\u03c4\u03c5\7i\2\2\u03c5\u03db\7g\2\2\u03c6\u03c7\7T\2\2\u03c7"+
		"\u03db\7E\2\2\u03c8\u03c9\7T\2\2\u03c9\u03ca\7g\2\2\u03ca\u03cb\7e\2\2"+
		"\u03cb\u03cc\7q\2\2\u03cc\u03cd\7t\2\2\u03cd\u03db\7f\2\2\u03ce\u03cf"+
		"\7T\2\2\u03cf\u03d0\7G\2\2\u03d0\u03d1\7E\2\2\u03d1\u03d2\7Q\2\2\u03d2"+
		"\u03d3\7T\2\2\u03d3\u03db\7F\2\2\u03d4\u03d5\7t\2\2\u03d5\u03d6\7g\2\2"+
		"\u03d6\u03d7\7e\2\2\u03d7\u03d8\7q\2\2\u03d8\u03d9\7t\2\2\u03d9\u03db"+
		"\7f\2\2\u03da\u038a\3\2\2\2\u03da\u0399\3\2\2\2\u03da\u03a8\3\2\2\2\u03da"+
		"\u03b7\3\2\2\2\u03da\u03c6\3\2\2\2\u03da\u03c8\3\2\2\2\u03da\u03ce\3\2"+
		"\2\2\u03da\u03d4\3\2\2\2\u03dbz\3\2\2\2\u03dc\u03dd\7C\2\2\u03dd\u03de"+
		"\7f\2\2\u03de\u03df\7f\2\2\u03df\u03e0\7j\2\2\u03e0\u03e1\7k\2\2\u03e1"+
		"\u03e2\7p\2\2\u03e2\u03fb\7v\2\2\u03e3\u03e4\7C\2\2\u03e4\u03e5\7F\2\2"+
		"\u03e5\u03e6\7F\2\2\u03e6\u03e7\7J\2\2\u03e7\u03e8\7K\2\2\u03e8\u03e9"+
		"\7P\2\2\u03e9\u03fb\7V\2\2\u03ea\u03eb\7C\2\2\u03eb\u03ec\7f\2\2\u03ec"+
		"\u03ed\7f\2\2\u03ed\u03ee\7J\2\2\u03ee\u03ef\7k\2\2\u03ef\u03f0\7p\2\2"+
		"\u03f0\u03fb\7v\2\2\u03f1\u03f2\7c\2\2\u03f2\u03f3\7f\2\2\u03f3\u03f4"+
		"\7f\2\2\u03f4\u03f5\7j\2\2\u03f5\u03f6\7k\2\2\u03f6\u03f7\7p\2\2\u03f7"+
		"\u03fb\7v\2\2\u03f8\u03f9\7C\2\2\u03f9\u03fb\7J\2\2\u03fa\u03dc\3\2\2"+
		"\2\u03fa\u03e3\3\2\2\2\u03fa\u03ea\3\2\2\2\u03fa\u03f1\3\2\2\2\u03fa\u03f8"+
		"\3\2\2\2\u03fb|\3\2\2\2\u03fc\u03fd\7J\2\2\u03fd\u03fe\7k\2\2\u03fe\u03ff"+
		"\7p\2\2\u03ff\u0409\7v\2\2\u0400\u0401\7J\2\2\u0401\u0402\7K\2\2\u0402"+
		"\u0403\7P\2\2\u0403\u0409\7V\2\2\u0404\u0405\7j\2\2\u0405\u0406\7k\2\2"+
		"\u0406\u0407\7p\2\2\u0407\u0409\7v\2\2\u0408\u03fc\3\2\2\2\u0408\u0400"+
		"\3\2\2\2\u0408\u0404\3\2\2\2\u0409~\3\2\2\2\u040a\u040b\7T\2\2\u040b\u040c"+
		"\7g\2\2\u040c\u040d\7o\2\2\u040d\u040e\7q\2\2\u040e\u040f\7x\2\2\u040f"+
		"\u0410\7g\2\2\u0410\u0411\7j\2\2\u0411\u0412\7k\2\2\u0412\u0413\7p\2\2"+
		"\u0413\u0435\7v\2\2\u0414\u0415\7T\2\2\u0415\u0416\7G\2\2\u0416\u0417"+
		"\7O\2\2\u0417\u0418\7Q\2\2\u0418\u0419\7X\2\2\u0419\u041a\7G\2\2\u041a"+
		"\u041b\7J\2\2\u041b\u041c\7K\2\2\u041c\u041d\7P\2\2\u041d\u0435\7V\2\2"+
		"\u041e\u041f\7t\2\2\u041f\u0420\7g\2\2\u0420\u0421\7o\2\2\u0421\u0422"+
		"\7q\2\2\u0422\u0423\7x\2\2\u0423\u0424\7g\2\2\u0424\u0425\7j\2\2\u0425"+
		"\u0426\7k\2\2\u0426\u0427\7p\2\2\u0427\u0435\7v\2\2\u0428\u0429\7T\2\2"+
		"\u0429\u042a\7g\2\2\u042a\u042b\7o\2\2\u042b\u042c\7q\2\2\u042c\u042d"+
		"\7x\2\2\u042d\u042e\7g\2\2\u042e\u042f\7J\2\2\u042f\u0430\7k\2\2\u0430"+
		"\u0431\7p\2\2\u0431\u0435\7v\2\2\u0432\u0433\7T\2\2\u0433\u0435\7J\2\2"+
		"\u0434\u040a\3\2\2\2\u0434\u0414\3\2\2\2\u0434\u041e\3\2\2\2\u0434\u0428"+
		"\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0080\3\2\2\2\u0436\u0437\7U\2\2\u0437"+
		"\u0438\7c\2\2\u0438\u0439\7x\2\2\u0439\u043a\7g\2\2\u043a\u043b\7e\2\2"+
		"\u043b\u043c\7j\2\2\u043c\u043d\7c\2\2\u043d\u043e\7n\2\2\u043e\u043f"+
		"\7n\2\2\u043f\u0440\7g\2\2\u0440\u0441\7p\2\2\u0441\u0442\7i\2\2\u0442"+
		"\u046d\7g\2\2\u0443\u0444\7U\2\2\u0444\u0445\7C\2\2\u0445\u0446\7X\2\2"+
		"\u0446\u0447\7G\2\2\u0447\u0448\7E\2\2\u0448\u0449\7J\2\2\u0449\u044a"+
		"\7C\2\2\u044a\u044b\7N\2\2\u044b\u044c\7N\2\2\u044c\u044d\7G\2\2\u044d"+
		"\u044e\7P\2\2\u044e\u044f\7I\2\2\u044f\u046d\7G\2\2\u0450\u0451\7u\2\2"+
		"\u0451\u0452\7c\2\2\u0452\u0453\7x\2\2\u0453\u0454\7g\2\2\u0454\u0455"+
		"\7e\2\2\u0455\u0456\7j\2\2\u0456\u0457\7c\2\2\u0457\u0458\7n\2\2\u0458"+
		"\u0459\7n\2\2\u0459\u045a\7g\2\2\u045a\u045b\7p\2\2\u045b\u045c\7i\2\2"+
		"\u045c\u046d\7g\2\2\u045d\u045e\7U\2\2\u045e\u045f\7c\2\2\u045f\u0460"+
		"\7x\2\2\u0460\u0461\7g\2\2\u0461\u0462\7E\2\2\u0462\u0463\7j\2\2\u0463"+
		"\u0464\7c\2\2\u0464\u0465\7n\2\2\u0465\u0466\7n\2\2\u0466\u0467\7g\2\2"+
		"\u0467\u0468\7p\2\2\u0468\u0469\7i\2\2\u0469\u046d\7g\2\2\u046a\u046b"+
		"\7U\2\2\u046b\u046d\7E\2\2\u046c\u0436\3\2\2\2\u046c\u0443\3\2\2\2\u046c"+
		"\u0450\3\2\2\2\u046c\u045d\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u0082\3\2"+
		"\2\2\u046e\u0470\4\62;\2\u046f\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0479\3\2\2\2\u0473\u0475\7\60"+
		"\2\2\u0474\u0476\4\62;\2\u0475\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047a\3\2\2\2\u0479\u0473\3\2"+
		"\2\2\u0479\u047a\3\2\2\2\u047a\u0084\3\2\2\2\u047b\u047f\t\2\2\2\u047c"+
		"\u047e\t\3\2\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2"+
		"\2\2\u047f\u0480\3\2\2\2\u0480\u0086\3\2\2\2\u0481\u047f\3\2\2\2\u0482"+
		"\u0486\7$\2\2\u0483\u0485\13\2\2\2\u0484\u0483\3\2\2\2\u0485\u0488\3\2"+
		"\2\2\u0486\u0487\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0489\3\2\2\2\u0488"+
		"\u0486\3\2\2\2\u0489\u048a\7$\2\2\u048a\u0088\3\2\2\2\u048b\u048f\7%\2"+
		"\2\u048c\u048e\n\4\2\2\u048d\u048c\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0493\3\2\2\2\u0491\u048f\3\2\2\2\u0492"+
		"\u0494\7\17\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3"+
		"\2\2\2\u0495\u0496\7\f\2\2\u0496\u0497\3\2\2\2\u0497\u0498\bE\2\2\u0498"+
		"\u008a\3\2\2\2\u0499\u049b\t\5\2\2\u049a\u0499\3\2\2\2\u049b\u049c\3\2"+
		"\2\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\u049f\bF\3\2\u049f\u008c\3\2\2\2\63\2\u00c2\u00ce\u00da\u00e8\u00f2\u00fc"+
		"\u0118\u0124\u0130\u014a\u0160\u0197\u01a1\u01ad\u01b7\u01c1\u01e5\u01f4"+
		"\u0202\u0214\u0222\u0233\u0241\u0265\u027d\u0295\u02a3\u02b7\u02c2\u02f0"+
		"\u0302\u0316\u0333\u0344\u0388\u03da\u03fa\u0408\u0434\u046c\u0471\u0477"+
		"\u0479\u047f\u0486\u048f\u0493\u049c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}