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
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, Unary_operator=15, Forward=16, 
		Back=17, Left=18, Right=19, Setx=20, Sety=21, Setxy=22, Speed=23, Print=24, 
		Clearscreen=25, Origin=26, Wrap=27, Fence=28, Getx=29, Gety=30, Getxy=31, 
		Penup=32, Pendown=33, Hideturtle=34, Showturtle=35, Set=36, If=37, Else=38, 
		LPAREN=39, RPAREN=40, LBRACKET=41, RBRACKET=42, While=43, For=44, Function=45, 
		Number=46, Identifier=47, WS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'^'", "','", "'+'", "'*'", "':'", "'<'", "'='", "'!='", "'<='", "'&&'", 
		"'||'", "'>'", "'/'", "'>='", "'-'", "Forward", "Back", "Left", "Right", 
		"Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", "Origin", "Wrap", 
		"Fence", "Getx", "Gety", "Getxy", "Penup", "Pendown", "Hideturtle", "Showturtle", 
		"Set", "'if'", "'else'", "'('", "')'", "'['", "']'", "'while'", "'for'", 
		"Function", "Number", "Identifier", "WS"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "Unary_operator", "Forward", "Back", 
		"Left", "Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", 
		"Origin", "Wrap", "Fence", "Getx", "Gety", "Getxy", "Penup", "Pendown", 
		"Hideturtle", "Showturtle", "Set", "If", "Else", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "While", "For", "Function", "Number", "Identifier", "WS"
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
		case 47: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\62\u0211\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0097\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00a3\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00af\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00bd\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00c7\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d1\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ed"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f9\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0105\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u011f\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0135\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u013f\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u014b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0155\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015f\n\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u016e\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\5!\u017c\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u018e\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a6\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01be\n$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u01c9\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u01f5\n.\3/\6/\u01f8\n/\r/\16/\u01f9\3/\3/\6/\u01fe\n/\r"+
		"/\16/\u01ff\5/\u0202\n/\3\60\3\60\7\60\u0206\n\60\f\60\16\60\u0209\13"+
		"\60\3\61\6\61\u020c\n\61\r\61\16\61\u020d\3\61\3\61\2\62\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33"+
		"\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1"+
		"\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1"+
		"I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\2\3\2\5\5C\\"+
		"aac|\4\62;C|\5\13\f\17\17\"\"\u023a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2"+
		"\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23t\3\2"+
		"\2\2\25w\3\2\2\2\27z\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0081\3\2\2"+
		"\2\37\u0084\3\2\2\2!\u0096\3\2\2\2#\u00a2\3\2\2\2%\u00ae\3\2\2\2\'\u00bc"+
		"\3\2\2\2)\u00c6\3\2\2\2+\u00d0\3\2\2\2-\u00ec\3\2\2\2/\u00f8\3\2\2\2\61"+
		"\u0104\3\2\2\2\63\u011e\3\2\2\2\65\u0134\3\2\2\2\67\u013e\3\2\2\29\u014a"+
		"\3\2\2\2;\u0154\3\2\2\2=\u015e\3\2\2\2?\u016d\3\2\2\2A\u017b\3\2\2\2C"+
		"\u018d\3\2\2\2E\u01a5\3\2\2\2G\u01bd\3\2\2\2I\u01c8\3\2\2\2K\u01ca\3\2"+
		"\2\2M\u01cd\3\2\2\2O\u01d2\3\2\2\2Q\u01d4\3\2\2\2S\u01d6\3\2\2\2U\u01d8"+
		"\3\2\2\2W\u01da\3\2\2\2Y\u01e0\3\2\2\2[\u01f4\3\2\2\2]\u01f7\3\2\2\2_"+
		"\u0203\3\2\2\2a\u020b\3\2\2\2cd\7`\2\2d\4\3\2\2\2ef\7.\2\2f\6\3\2\2\2"+
		"gh\7-\2\2h\b\3\2\2\2ij\7,\2\2j\n\3\2\2\2kl\7<\2\2l\f\3\2\2\2mn\7>\2\2"+
		"n\16\3\2\2\2op\7?\2\2p\20\3\2\2\2qr\7#\2\2rs\7?\2\2s\22\3\2\2\2tu\7>\2"+
		"\2uv\7?\2\2v\24\3\2\2\2wx\7(\2\2xy\7(\2\2y\26\3\2\2\2z{\7~\2\2{|\7~\2"+
		"\2|\30\3\2\2\2}~\7@\2\2~\32\3\2\2\2\177\u0080\7\61\2\2\u0080\34\3\2\2"+
		"\2\u0081\u0082\7@\2\2\u0082\u0083\7?\2\2\u0083\36\3\2\2\2\u0084\u0085"+
		"\7/\2\2\u0085 \3\2\2\2\u0086\u0087\7H\2\2\u0087\u0088\7q\2\2\u0088\u0089"+
		"\7t\2\2\u0089\u008a\7y\2\2\u008a\u008b\7c\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u0097\7f\2\2\u008d\u008e\7H\2\2\u008e\u008f\7Q\2\2\u008f\u0090\7T\2\2"+
		"\u0090\u0091\7Y\2\2\u0091\u0092\7C\2\2\u0092\u0093\7T\2\2\u0093\u0097"+
		"\7F\2\2\u0094\u0095\7H\2\2\u0095\u0097\7F\2\2\u0096\u0086\3\2\2\2\u0096"+
		"\u008d\3\2\2\2\u0096\u0094\3\2\2\2\u0097\"\3\2\2\2\u0098\u0099\7D\2\2"+
		"\u0099\u009a\7c\2\2\u009a\u009b\7e\2\2\u009b\u00a3\7m\2\2\u009c\u009d"+
		"\7D\2\2\u009d\u009e\7C\2\2\u009e\u009f\7E\2\2\u009f\u00a3\7M\2\2\u00a0"+
		"\u00a1\7D\2\2\u00a1\u00a3\7M\2\2\u00a2\u0098\3\2\2\2\u00a2\u009c\3\2\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a6\7"+
		"g\2\2\u00a6\u00a7\7h\2\2\u00a7\u00af\7v\2\2\u00a8\u00a9\7N\2\2\u00a9\u00aa"+
		"\7G\2\2\u00aa\u00ab\7H\2\2\u00ab\u00af\7V\2\2\u00ac\u00ad\7N\2\2\u00ad"+
		"\u00af\7V\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af&\3\2\2\2\u00b0\u00b1\7T\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7i\2\2\u00b3\u00b4\7j\2\2\u00b4\u00bd\7v\2\2\u00b5\u00b6\7T\2\2\u00b6"+
		"\u00b7\7K\2\2\u00b7\u00b8\7I\2\2\u00b8\u00b9\7J\2\2\u00b9\u00bd\7V\2\2"+
		"\u00ba\u00bb\7T\2\2\u00bb\u00bd\7V\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b5"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd(\3\2\2\2\u00be\u00bf\7U\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c7\7Z\2\2\u00c2\u00c3\7U\2\2\u00c3"+
		"\u00c4\7G\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c7\7Z\2\2\u00c6\u00be\3\2\2"+
		"\2\u00c6\u00c2\3\2\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7U\2\2\u00c9\u00ca\7"+
		"g\2\2\u00ca\u00cb\7v\2\2\u00cb\u00d1\7[\2\2\u00cc\u00cd\7U\2\2\u00cd\u00ce"+
		"\7G\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d1\7[\2\2\u00d0\u00c8\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7U\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5\u00d6\7Z\2\2\u00d6\u00ed\7[\2\2\u00d7\u00d8\7U\2\2"+
		"\u00d8\u00d9\7G\2\2\u00d9\u00da\7V\2\2\u00da\u00db\7Z\2\2\u00db\u00ed"+
		"\7[\2\2\u00dc\u00dd\7V\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7n\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7t\2\2"+
		"\u00e3\u00ed\7v\2\2\u00e4\u00e5\7V\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7"+
		"\7N\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7R\2\2\u00e9\u00ea\7Q\2\2\u00ea"+
		"\u00eb\7T\2\2\u00eb\u00ed\7V\2\2\u00ec\u00d2\3\2\2\2\u00ec\u00d7\3\2\2"+
		"\2\u00ec\u00dc\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ed.\3\2\2\2\u00ee\u00ef"+
		"\7U\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f9\7f\2\2\u00f3\u00f4\7U\2\2\u00f4\u00f5\7R\2\2\u00f5\u00f6\7G\2\2"+
		"\u00f6\u00f7\7G\2\2\u00f7\u00f9\7F\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00f3"+
		"\3\2\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7R\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u0105\7v\2\2\u00ff\u0100\7R\2\2"+
		"\u0100\u0101\7T\2\2\u0101\u0102\7K\2\2\u0102\u0103\7P\2\2\u0103\u0105"+
		"\7V\2\2\u0104\u00fa\3\2\2\2\u0104\u00ff\3\2\2\2\u0105\62\3\2\2\2\u0106"+
		"\u0107\7E\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109\u010a\7c\2\2"+
		"\u010a\u010b\7t\2\2\u010b\u010c\7u\2\2\u010c\u010d\7e\2\2\u010d\u010e"+
		"\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110\7g\2\2\u0110\u011f\7p\2\2\u0111"+
		"\u0112\7E\2\2\u0112\u0113\7N\2\2\u0113\u0114\7G\2\2\u0114\u0115\7C\2\2"+
		"\u0115\u0116\7T\2\2\u0116\u0117\7U\2\2\u0117\u0118\7E\2\2\u0118\u0119"+
		"\7T\2\2\u0119\u011a\7G\2\2\u011a\u011b\7G\2\2\u011b\u011f\7P\2\2\u011c"+
		"\u011d\7E\2\2\u011d\u011f\7U\2\2\u011e\u0106\3\2\2\2\u011e\u0111\3\2\2"+
		"\2\u011e\u011c\3\2\2\2\u011f\64\3\2\2\2\u0120\u0121\7Q\2\2\u0121\u0122"+
		"\7t\2\2\u0122\u0123\7k\2\2\u0123\u0124\7i\2\2\u0124\u0125\7k\2\2\u0125"+
		"\u0135\7p\2\2\u0126\u0127\7Q\2\2\u0127\u0128\7T\2\2\u0128\u0129\7K\2\2"+
		"\u0129\u012a\7I\2\2\u012a\u012b\7K\2\2\u012b\u0135\7P\2\2\u012c\u012d"+
		"\7J\2\2\u012d\u012e\7q\2\2\u012e\u012f\7o\2\2\u012f\u0135\7g\2\2\u0130"+
		"\u0131\7J\2\2\u0131\u0132\7Q\2\2\u0132\u0133\7O\2\2\u0133\u0135\7G\2\2"+
		"\u0134\u0120\3\2\2\2\u0134\u0126\3\2\2\2\u0134\u012c\3\2\2\2\u0134\u0130"+
		"\3\2\2\2\u0135\66\3\2\2\2\u0136\u0137\7Y\2\2\u0137\u0138\7t\2\2\u0138"+
		"\u0139\7c\2\2\u0139\u013f\7r\2\2\u013a\u013b\7Y\2\2\u013b\u013c\7T\2\2"+
		"\u013c\u013d\7C\2\2\u013d\u013f\7R\2\2\u013e\u0136\3\2\2\2\u013e\u013a"+
		"\3\2\2\2\u013f8\3\2\2\2\u0140\u0141\7H\2\2\u0141\u0142\7g\2\2\u0142\u0143"+
		"\7p\2\2\u0143\u0144\7e\2\2\u0144\u014b\7g\2\2\u0145\u0146\7H\2\2\u0146"+
		"\u0147\7G\2\2\u0147\u0148\7P\2\2\u0148\u0149\7E\2\2\u0149\u014b\7G\2\2"+
		"\u014a\u0140\3\2\2\2\u014a\u0145\3\2\2\2\u014b:\3\2\2\2\u014c\u014d\7"+
		"I\2\2\u014d\u014e\7g\2\2\u014e\u014f\7v\2\2\u014f\u0155\7z\2\2\u0150\u0151"+
		"\7I\2\2\u0151\u0152\7G\2\2\u0152\u0153\7V\2\2\u0153\u0155\7Z\2\2\u0154"+
		"\u014c\3\2\2\2\u0154\u0150\3\2\2\2\u0155<\3\2\2\2\u0156\u0157\7I\2\2\u0157"+
		"\u0158\7g\2\2\u0158\u0159\7v\2\2\u0159\u015f\7{\2\2\u015a\u015b\7I\2\2"+
		"\u015b\u015c\7G\2\2\u015c\u015d\7V\2\2\u015d\u015f\7[\2\2\u015e\u0156"+
		"\3\2\2\2\u015e\u015a\3\2\2\2\u015f>\3\2\2\2\u0160\u0161\7I\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7v\2\2\u0163\u0164\7z\2\2\u0164\u016e\7{\2\2\u0165"+
		"\u0166\7I\2\2\u0166\u0167\7G\2\2\u0167\u0168\7V\2\2\u0168\u0169\7Z\2\2"+
		"\u0169\u016e\7[\2\2\u016a\u016b\7I\2\2\u016b\u016c\7R\2\2\u016c\u016e"+
		"\7U\2\2\u016d\u0160\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u016a\3\2\2\2\u016e"+
		"@\3\2\2\2\u016f\u0170\7R\2\2\u0170\u0171\7g\2\2\u0171\u0172\7p\2\2\u0172"+
		"\u0173\7w\2\2\u0173\u017c\7r\2\2\u0174\u0175\7R\2\2\u0175\u0176\7G\2\2"+
		"\u0176\u0177\7P\2\2\u0177\u0178\7W\2\2\u0178\u017c\7R\2\2\u0179\u017a"+
		"\7R\2\2\u017a\u017c\7W\2\2\u017b\u016f\3\2\2\2\u017b\u0174\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017cB\3\2\2\2\u017d\u017e\7R\2\2\u017e\u017f\7g\2\2\u017f"+
		"\u0180\7p\2\2\u0180\u0181\7f\2\2\u0181\u0182\7q\2\2\u0182\u0183\7y\2\2"+
		"\u0183\u018e\7p\2\2\u0184\u0185\7R\2\2\u0185\u0186\7G\2\2\u0186\u0187"+
		"\7P\2\2\u0187\u0188\7F\2\2\u0188\u0189\7Q\2\2\u0189\u018a\7Y\2\2\u018a"+
		"\u018e\7P\2\2\u018b\u018c\7R\2\2\u018c\u018e\7F\2\2\u018d\u017d\3\2\2"+
		"\2\u018d\u0184\3\2\2\2\u018d\u018b\3\2\2\2\u018eD\3\2\2\2\u018f\u0190"+
		"\7J\2\2\u0190\u0191\7k\2\2\u0191\u0192\7f\2\2\u0192\u0193\7g\2\2\u0193"+
		"\u0194\7v\2\2\u0194\u0195\7w\2\2\u0195\u0196\7t\2\2\u0196\u0197\7v\2\2"+
		"\u0197\u0198\7n\2\2\u0198\u01a6\7g\2\2\u0199\u019a\7J\2\2\u019a\u019b"+
		"\7K\2\2\u019b\u019c\7F\2\2\u019c\u019d\7G\2\2\u019d\u019e\7V\2\2\u019e"+
		"\u019f\7W\2\2\u019f\u01a0\7T\2\2\u01a0\u01a1\7V\2\2\u01a1\u01a2\7N\2\2"+
		"\u01a2\u01a6\7G\2\2\u01a3\u01a4\7J\2\2\u01a4\u01a6\7V\2\2\u01a5\u018f"+
		"\3\2\2\2\u01a5\u0199\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6F\3\2\2\2\u01a7"+
		"\u01a8\7U\2\2\u01a8\u01a9\7j\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab\7y\2\2"+
		"\u01ab\u01ac\7v\2\2\u01ac\u01ad\7w\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af"+
		"\7v\2\2\u01af\u01b0\7n\2\2\u01b0\u01be\7g\2\2\u01b1\u01b2\7U\2\2\u01b2"+
		"\u01b3\7J\2\2\u01b3\u01b4\7Q\2\2\u01b4\u01b5\7Y\2\2\u01b5\u01b6\7V\2\2"+
		"\u01b6\u01b7\7W\2\2\u01b7\u01b8\7T\2\2\u01b8\u01b9\7V\2\2\u01b9\u01ba"+
		"\7N\2\2\u01ba\u01be\7G\2\2\u01bb\u01bc\7U\2\2\u01bc\u01be\7V\2\2\u01bd"+
		"\u01a7\3\2\2\2\u01bd\u01b1\3\2\2\2\u01bd\u01bb\3\2\2\2\u01beH\3\2\2\2"+
		"\u01bf\u01c0\7U\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c9\7v\2\2\u01c2\u01c3"+
		"\7U\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c9\7v\2\2\u01c5\u01c6\7u\2\2\u01c6"+
		"\u01c7\7g\2\2\u01c7\u01c9\7v\2\2\u01c8\u01bf\3\2\2\2\u01c8\u01c2\3\2\2"+
		"\2\u01c8\u01c5\3\2\2\2\u01c9J\3\2\2\2\u01ca\u01cb\7k\2\2\u01cb\u01cc\7"+
		"h\2\2\u01ccL\3\2\2\2\u01cd\u01ce\7g\2\2\u01ce\u01cf\7n\2\2\u01cf\u01d0"+
		"\7u\2\2\u01d0\u01d1\7g\2\2\u01d1N\3\2\2\2\u01d2\u01d3\7*\2\2\u01d3P\3"+
		"\2\2\2\u01d4\u01d5\7+\2\2\u01d5R\3\2\2\2\u01d6\u01d7\7]\2\2\u01d7T\3\2"+
		"\2\2\u01d8\u01d9\7_\2\2\u01d9V\3\2\2\2\u01da\u01db\7y\2\2\u01db\u01dc"+
		"\7j\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7n\2\2\u01de\u01df\7g\2\2\u01df"+
		"X\3\2\2\2\u01e0\u01e1\7h\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7t\2\2\u01e3"+
		"Z\3\2\2\2\u01e4\u01e5\7H\2\2\u01e5\u01e6\7W\2\2\u01e6\u01e7\7P\2\2\u01e7"+
		"\u01e8\7E\2\2\u01e8\u01e9\7V\2\2\u01e9\u01ea\7K\2\2\u01ea\u01eb\7Q\2\2"+
		"\u01eb\u01f5\7P\2\2\u01ec\u01ed\7h\2\2\u01ed\u01ee\7w\2\2\u01ee\u01ef"+
		"\7p\2\2\u01ef\u01f0\7e\2\2\u01f0\u01f1\7v\2\2\u01f1\u01f2\7k\2\2\u01f2"+
		"\u01f3\7q\2\2\u01f3\u01f5\7p\2\2\u01f4\u01e4\3\2\2\2\u01f4\u01ec\3\2\2"+
		"\2\u01f5\\\3\2\2\2\u01f6\u01f8\4\62;\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0201\3\2\2\2\u01fb"+
		"\u01fd\7\60\2\2\u01fc\u01fe\4\62;\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3"+
		"\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01fb\3\2\2\2\u0201\u0202\3\2\2\2\u0202^\3\2\2\2\u0203\u0207\t\2\2\2"+
		"\u0204\u0206\t\3\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208`\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020c\t\4\2\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\b\61\2\2\u0210"+
		"b\3\2\2\2\36\2\u0096\u00a2\u00ae\u00bc\u00c6\u00d0\u00ec\u00f8\u0104\u011e"+
		"\u0134\u013e\u014a\u0154\u015e\u016d\u017b\u018d\u01a5\u01bd\u01c8\u01f4"+
		"\u01f9\u01ff\u0201\u0207\u020d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}