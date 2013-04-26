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
		Print=25, Clearscreen=26, Origin=27, Wrap=28, Fence=29, Getx=30, Gety=31, 
		Getxy=32, Penup=33, Pendown=34, Hideturtle=35, Showturtle=36, Set=37, 
		If=38, Else=39, LPAREN=40, RPAREN=41, LBRACKET=42, RBRACKET=43, While=44, 
		For=45, Repeat=46, Function=47, Challenge=48, Match=49, Quit=50, Number=51, 
		Identifier=52, String=53, WS=54;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'^'", "','", "'+'", "'*'", "':'", "'<'", "'='", "'!='", "'<='", "'&&'", 
		"'||'", "'>'", "'/'", "'>='", "'-'", "'!'", "Forward", "Back", "Left", 
		"Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", "Origin", 
		"Wrap", "Fence", "Getx", "Gety", "Getxy", "Penup", "Pendown", "Hideturtle", 
		"Showturtle", "Set", "'if'", "'else'", "'('", "')'", "'{'", "'}'", "'while'", 
		"'for'", "Repeat", "Function", "Challenge", "Match", "Quit", "Number", 
		"Identifier", "String", "WS"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "Unary_minus", "Unary_not", "Forward", 
		"Back", "Left", "Right", "Setx", "Sety", "Setxy", "Speed", "Print", "Clearscreen", 
		"Origin", "Wrap", "Fence", "Getx", "Gety", "Getxy", "Penup", "Pendown", 
		"Hideturtle", "Showturtle", "Set", "If", "Else", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "While", "For", "Repeat", "Function", "Challenge", "Match", 
		"Quit", "Number", "Identifier", "String", "WS"
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
		case 53: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\48\u02a1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00a5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00b1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00bd\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00cb\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00d5\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00df\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fb"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0107\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0113\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u012d\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0143\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u014d\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0159\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0163\n"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u016d\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\5!\u017c\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u018a\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u019c"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\5$\u01b4\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\5%\u01cc\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01d7\n&\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0205\n/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u0217\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u0234\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0245\n\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u027c\n\63\3\64\6\64\u027f"+
		"\n\64\r\64\16\64\u0280\3\64\3\64\6\64\u0285\n\64\r\64\16\64\u0286\5\64"+
		"\u0289\n\64\3\65\3\65\7\65\u028d\n\65\f\65\16\65\u0290\13\65\3\66\3\66"+
		"\7\66\u0294\n\66\f\66\16\66\u0297\13\66\3\66\3\66\3\67\6\67\u029c\n\67"+
		"\r\67\16\67\u029d\3\67\3\67\3\u02958\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*"+
		"\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1"+
		"m8\2\3\2\5\5C\\aac|\4\62;C|\5\13\f\17\17\"\"\u02d7\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2"+
		"\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2"+
		"\2\23\u0080\3\2\2\2\25\u0083\3\2\2\2\27\u0086\3\2\2\2\31\u0089\3\2\2\2"+
		"\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u00a4"+
		"\3\2\2\2%\u00b0\3\2\2\2\'\u00bc\3\2\2\2)\u00ca\3\2\2\2+\u00d4\3\2\2\2"+
		"-\u00de\3\2\2\2/\u00fa\3\2\2\2\61\u0106\3\2\2\2\63\u0112\3\2\2\2\65\u012c"+
		"\3\2\2\2\67\u0142\3\2\2\29\u014c\3\2\2\2;\u0158\3\2\2\2=\u0162\3\2\2\2"+
		"?\u016c\3\2\2\2A\u017b\3\2\2\2C\u0189\3\2\2\2E\u019b\3\2\2\2G\u01b3\3"+
		"\2\2\2I\u01cb\3\2\2\2K\u01d6\3\2\2\2M\u01d8\3\2\2\2O\u01db\3\2\2\2Q\u01e0"+
		"\3\2\2\2S\u01e2\3\2\2\2U\u01e4\3\2\2\2W\u01e6\3\2\2\2Y\u01e8\3\2\2\2["+
		"\u01ee\3\2\2\2]\u0204\3\2\2\2_\u0216\3\2\2\2a\u0233\3\2\2\2c\u0244\3\2"+
		"\2\2e\u027b\3\2\2\2g\u027e\3\2\2\2i\u028a\3\2\2\2k\u0291\3\2\2\2m\u029b"+
		"\3\2\2\2op\7`\2\2p\4\3\2\2\2qr\7.\2\2r\6\3\2\2\2st\7-\2\2t\b\3\2\2\2u"+
		"v\7,\2\2v\n\3\2\2\2wx\7<\2\2x\f\3\2\2\2yz\7>\2\2z\16\3\2\2\2{|\7?\2\2"+
		"|\20\3\2\2\2}~\7#\2\2~\177\7?\2\2\177\22\3\2\2\2\u0080\u0081\7>\2\2\u0081"+
		"\u0082\7?\2\2\u0082\24\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085\7(\2\2\u0085"+
		"\26\3\2\2\2\u0086\u0087\7~\2\2\u0087\u0088\7~\2\2\u0088\30\3\2\2\2\u0089"+
		"\u008a\7@\2\2\u008a\32\3\2\2\2\u008b\u008c\7\61\2\2\u008c\34\3\2\2\2\u008d"+
		"\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f\36\3\2\2\2\u0090\u0091\7/\2\2\u0091"+
		" \3\2\2\2\u0092\u0093\7#\2\2\u0093\"\3\2\2\2\u0094\u0095\7H\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7y\2\2\u0098\u0099\7c\2\2"+
		"\u0099\u009a\7t\2\2\u009a\u00a5\7f\2\2\u009b\u009c\7H\2\2\u009c\u009d"+
		"\7Q\2\2\u009d\u009e\7T\2\2\u009e\u009f\7Y\2\2\u009f\u00a0\7C\2\2\u00a0"+
		"\u00a1\7T\2\2\u00a1\u00a5\7F\2\2\u00a2\u00a3\7H\2\2\u00a3\u00a5\7F\2\2"+
		"\u00a4\u0094\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5$\3"+
		"\2\2\2\u00a6\u00a7\7D\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7e\2\2\u00a9"+
		"\u00b1\7m\2\2\u00aa\u00ab\7D\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\7E\2\2"+
		"\u00ad\u00b1\7M\2\2\u00ae\u00af\7D\2\2\u00af\u00b1\7M\2\2\u00b0\u00a6"+
		"\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1&\3\2\2\2\u00b2"+
		"\u00b3\7N\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7h\2\2\u00b5\u00bd\7v\2\2"+
		"\u00b6\u00b7\7N\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7H\2\2\u00b9\u00bd"+
		"\7V\2\2\u00ba\u00bb\7N\2\2\u00bb\u00bd\7V\2\2\u00bc\u00b2\3\2\2\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd(\3\2\2\2\u00be\u00bf\7T\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7j\2\2\u00c2\u00cb\7v\2\2"+
		"\u00c3\u00c4\7T\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7I\2\2\u00c6\u00c7"+
		"\7J\2\2\u00c7\u00cb\7V\2\2\u00c8\u00c9\7T\2\2\u00c9\u00cb\7V\2\2\u00ca"+
		"\u00be\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb*\3\2\2\2"+
		"\u00cc\u00cd\7U\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d5"+
		"\7Z\2\2\u00d0\u00d1\7U\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d3\7V\2\2\u00d3"+
		"\u00d5\7Z\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5,\3\2\2\2\u00d6"+
		"\u00d7\7U\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00df\7[\2\2"+
		"\u00da\u00db\7U\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7V\2\2\u00dd\u00df"+
		"\7[\2\2\u00de\u00d6\3\2\2\2\u00de\u00da\3\2\2\2\u00df.\3\2\2\2\u00e0\u00e1"+
		"\7U\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7Z\2\2\u00e4"+
		"\u00fb\7[\2\2\u00e5\u00e6\7U\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7V\2\2"+
		"\u00e8\u00e9\7Z\2\2\u00e9\u00fb\7[\2\2\u00ea\u00eb\7V\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7r\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1\u00fb\7v\2\2\u00f2\u00f3\7V\2\2"+
		"\u00f3\u00f4\7G\2\2\u00f4\u00f5\7N\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7"+
		"\7R\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7T\2\2\u00f9\u00fb\7V\2\2\u00fa"+
		"\u00e0\3\2\2\2\u00fa\u00e5\3\2\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00f2\3\2"+
		"\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7U\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff"+
		"\7g\2\2\u00ff\u0100\7g\2\2\u0100\u0107\7f\2\2\u0101\u0102\7U\2\2\u0102"+
		"\u0103\7R\2\2\u0103\u0104\7G\2\2\u0104\u0105\7G\2\2\u0105\u0107\7F\2\2"+
		"\u0106\u00fc\3\2\2\2\u0106\u0101\3\2\2\2\u0107\62\3\2\2\2\u0108\u0109"+
		"\7R\2\2\u0109\u010a\7t\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c"+
		"\u0113\7v\2\2\u010d\u010e\7R\2\2\u010e\u010f\7T\2\2\u010f\u0110\7K\2\2"+
		"\u0110\u0111\7P\2\2\u0111\u0113\7V\2\2\u0112\u0108\3\2\2\2\u0112\u010d"+
		"\3\2\2\2\u0113\64\3\2\2\2\u0114\u0115\7E\2\2\u0115\u0116\7n\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7c\2\2\u0118\u0119\7t\2\2\u0119\u011a\7u\2\2"+
		"\u011a\u011b\7e\2\2\u011b\u011c\7t\2\2\u011c\u011d\7g\2\2\u011d\u011e"+
		"\7g\2\2\u011e\u012d\7p\2\2\u011f\u0120\7E\2\2\u0120\u0121\7N\2\2\u0121"+
		"\u0122\7G\2\2\u0122\u0123\7C\2\2\u0123\u0124\7T\2\2\u0124\u0125\7U\2\2"+
		"\u0125\u0126\7E\2\2\u0126\u0127\7T\2\2\u0127\u0128\7G\2\2\u0128\u0129"+
		"\7G\2\2\u0129\u012d\7P\2\2\u012a\u012b\7E\2\2\u012b\u012d\7U\2\2\u012c"+
		"\u0114\3\2\2\2\u012c\u011f\3\2\2\2\u012c\u012a\3\2\2\2\u012d\66\3\2\2"+
		"\2\u012e\u012f\7Q\2\2\u012f\u0130\7t\2\2\u0130\u0131\7k\2\2\u0131\u0132"+
		"\7i\2\2\u0132\u0133\7k\2\2\u0133\u0143\7p\2\2\u0134\u0135\7Q\2\2\u0135"+
		"\u0136\7T\2\2\u0136\u0137\7K\2\2\u0137\u0138\7I\2\2\u0138\u0139\7K\2\2"+
		"\u0139\u0143\7P\2\2\u013a\u013b\7J\2\2\u013b\u013c\7q\2\2\u013c\u013d"+
		"\7o\2\2\u013d\u0143\7g\2\2\u013e\u013f\7J\2\2\u013f\u0140\7Q\2\2\u0140"+
		"\u0141\7O\2\2\u0141\u0143\7G\2\2\u0142\u012e\3\2\2\2\u0142\u0134\3\2\2"+
		"\2\u0142\u013a\3\2\2\2\u0142\u013e\3\2\2\2\u01438\3\2\2\2\u0144\u0145"+
		"\7Y\2\2\u0145\u0146\7t\2\2\u0146\u0147\7c\2\2\u0147\u014d\7r\2\2\u0148"+
		"\u0149\7Y\2\2\u0149\u014a\7T\2\2\u014a\u014b\7C\2\2\u014b\u014d\7R\2\2"+
		"\u014c\u0144\3\2\2\2\u014c\u0148\3\2\2\2\u014d:\3\2\2\2\u014e\u014f\7"+
		"H\2\2\u014f\u0150\7g\2\2\u0150\u0151\7p\2\2\u0151\u0152\7e\2\2\u0152\u0159"+
		"\7g\2\2\u0153\u0154\7H\2\2\u0154\u0155\7G\2\2\u0155\u0156\7P\2\2\u0156"+
		"\u0157\7E\2\2\u0157\u0159\7G\2\2\u0158\u014e\3\2\2\2\u0158\u0153\3\2\2"+
		"\2\u0159<\3\2\2\2\u015a\u015b\7I\2\2\u015b\u015c\7g\2\2\u015c\u015d\7"+
		"v\2\2\u015d\u0163\7z\2\2\u015e\u015f\7I\2\2\u015f\u0160\7G\2\2\u0160\u0161"+
		"\7V\2\2\u0161\u0163\7Z\2\2\u0162\u015a\3\2\2\2\u0162\u015e\3\2\2\2\u0163"+
		">\3\2\2\2\u0164\u0165\7I\2\2\u0165\u0166\7g\2\2\u0166\u0167\7v\2\2\u0167"+
		"\u016d\7{\2\2\u0168\u0169\7I\2\2\u0169\u016a\7G\2\2\u016a\u016b\7V\2\2"+
		"\u016b\u016d\7[\2\2\u016c\u0164\3\2\2\2\u016c\u0168\3\2\2\2\u016d@\3\2"+
		"\2\2\u016e\u016f\7I\2\2\u016f\u0170\7g\2\2\u0170\u0171\7v\2\2\u0171\u0172"+
		"\7z\2\2\u0172\u017c\7{\2\2\u0173\u0174\7I\2\2\u0174\u0175\7G\2\2\u0175"+
		"\u0176\7V\2\2\u0176\u0177\7Z\2\2\u0177\u017c\7[\2\2\u0178\u0179\7I\2\2"+
		"\u0179\u017a\7R\2\2\u017a\u017c\7U\2\2\u017b\u016e\3\2\2\2\u017b\u0173"+
		"\3\2\2\2\u017b\u0178\3\2\2\2\u017cB\3\2\2\2\u017d\u017e\7R\2\2\u017e\u017f"+
		"\7g\2\2\u017f\u0180\7p\2\2\u0180\u0181\7w\2\2\u0181\u018a\7r\2\2\u0182"+
		"\u0183\7R\2\2\u0183\u0184\7G\2\2\u0184\u0185\7P\2\2\u0185\u0186\7W\2\2"+
		"\u0186\u018a\7R\2\2\u0187\u0188\7R\2\2\u0188\u018a\7W\2\2\u0189\u017d"+
		"\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0187\3\2\2\2\u018aD\3\2\2\2\u018b"+
		"\u018c\7R\2\2\u018c\u018d\7g\2\2\u018d\u018e\7p\2\2\u018e\u018f\7f\2\2"+
		"\u018f\u0190\7q\2\2\u0190\u0191\7y\2\2\u0191\u019c\7p\2\2\u0192\u0193"+
		"\7R\2\2\u0193\u0194\7G\2\2\u0194\u0195\7P\2\2\u0195\u0196\7F\2\2\u0196"+
		"\u0197\7Q\2\2\u0197\u0198\7Y\2\2\u0198\u019c\7P\2\2\u0199\u019a\7R\2\2"+
		"\u019a\u019c\7F\2\2\u019b\u018b\3\2\2\2\u019b\u0192\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019cF\3\2\2\2\u019d\u019e\7J\2\2\u019e\u019f\7k\2\2\u019f\u01a0"+
		"\7f\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7w\2\2\u01a3"+
		"\u01a4\7t\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7n\2\2\u01a6\u01b4\7g\2\2"+
		"\u01a7\u01a8\7J\2\2\u01a8\u01a9\7K\2\2\u01a9\u01aa\7F\2\2\u01aa\u01ab"+
		"\7G\2\2\u01ab\u01ac\7V\2\2\u01ac\u01ad\7W\2\2\u01ad\u01ae\7T\2\2\u01ae"+
		"\u01af\7V\2\2\u01af\u01b0\7N\2\2\u01b0\u01b4\7G\2\2\u01b1\u01b2\7J\2\2"+
		"\u01b2\u01b4\7V\2\2\u01b3\u019d\3\2\2\2\u01b3\u01a7\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4H\3\2\2\2\u01b5\u01b6\7U\2\2\u01b6\u01b7\7j\2\2\u01b7\u01b8"+
		"\7q\2\2\u01b8\u01b9\7y\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7w\2\2\u01bb"+
		"\u01bc\7t\2\2\u01bc\u01bd\7v\2\2\u01bd\u01be\7n\2\2\u01be\u01cc\7g\2\2"+
		"\u01bf\u01c0\7U\2\2\u01c0\u01c1\7J\2\2\u01c1\u01c2\7Q\2\2\u01c2\u01c3"+
		"\7Y\2\2\u01c3\u01c4\7V\2\2\u01c4\u01c5\7W\2\2\u01c5\u01c6\7T\2\2\u01c6"+
		"\u01c7\7V\2\2\u01c7\u01c8\7N\2\2\u01c8\u01cc\7G\2\2\u01c9\u01ca\7U\2\2"+
		"\u01ca\u01cc\7V\2\2\u01cb\u01b5\3\2\2\2\u01cb\u01bf\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01ccJ\3\2\2\2\u01cd\u01ce\7U\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d7"+
		"\7v\2\2\u01d0\u01d1\7U\2\2\u01d1\u01d2\7G\2\2\u01d2\u01d7\7V\2\2\u01d3"+
		"\u01d4\7u\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d7\7v\2\2\u01d6\u01cd\3\2\2"+
		"\2\u01d6\u01d0\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d7L\3\2\2\2\u01d8\u01d9"+
		"\7k\2\2\u01d9\u01da\7h\2\2\u01daN\3\2\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd"+
		"\7n\2\2\u01dd\u01de\7u\2\2\u01de\u01df\7g\2\2\u01dfP\3\2\2\2\u01e0\u01e1"+
		"\7*\2\2\u01e1R\3\2\2\2\u01e2\u01e3\7+\2\2\u01e3T\3\2\2\2\u01e4\u01e5\7"+
		"}\2\2\u01e5V\3\2\2\2\u01e6\u01e7\7\177\2\2\u01e7X\3\2\2\2\u01e8\u01e9"+
		"\7y\2\2\u01e9\u01ea\7j\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7n\2\2\u01ec"+
		"\u01ed\7g\2\2\u01edZ\3\2\2\2\u01ee\u01ef\7h\2\2\u01ef\u01f0\7q\2\2\u01f0"+
		"\u01f1\7t\2\2\u01f1\\\3\2\2\2\u01f2\u01f3\7T\2\2\u01f3\u01f4\7g\2\2\u01f4"+
		"\u01f5\7r\2\2\u01f5\u01f6\7g\2\2\u01f6\u01f7\7c\2\2\u01f7\u0205\7v\2\2"+
		"\u01f8\u01f9\7t\2\2\u01f9\u01fa\7g\2\2\u01fa\u01fb\7r\2\2\u01fb\u01fc"+
		"\7g\2\2\u01fc\u01fd\7c\2\2\u01fd\u0205\7v\2\2\u01fe\u01ff\7T\2\2\u01ff"+
		"\u0200\7G\2\2\u0200\u0201\7R\2\2\u0201\u0202\7G\2\2\u0202\u0203\7C\2\2"+
		"\u0203\u0205\7V\2\2\u0204\u01f2\3\2\2\2\u0204\u01f8\3\2\2\2\u0204\u01fe"+
		"\3\2\2\2\u0205^\3\2\2\2\u0206\u0207\7H\2\2\u0207\u0208\7W\2\2\u0208\u0209"+
		"\7P\2\2\u0209\u020a\7E\2\2\u020a\u020b\7V\2\2\u020b\u020c\7K\2\2\u020c"+
		"\u020d\7Q\2\2\u020d\u0217\7P\2\2\u020e\u020f\7h\2\2\u020f\u0210\7w\2\2"+
		"\u0210\u0211\7p\2\2\u0211\u0212\7e\2\2\u0212\u0213\7v\2\2\u0213\u0214"+
		"\7k\2\2\u0214\u0215\7q\2\2\u0215\u0217\7p\2\2\u0216\u0206\3\2\2\2\u0216"+
		"\u020e\3\2\2\2\u0217`\3\2\2\2\u0218\u0219\7E\2\2\u0219\u021a\7j\2\2\u021a"+
		"\u021b\7c\2\2\u021b\u021c\7n\2\2\u021c\u021d\7n\2\2\u021d\u021e\7g\2\2"+
		"\u021e\u021f\7p\2\2\u021f\u0220\7i\2\2\u0220\u0234\7g\2\2\u0221\u0222"+
		"\7E\2\2\u0222\u0223\7J\2\2\u0223\u0224\7C\2\2\u0224\u0225\7N\2\2\u0225"+
		"\u0226\7N\2\2\u0226\u0227\7G\2\2\u0227\u0228\7P\2\2\u0228\u0229\7I\2\2"+
		"\u0229\u0234\7G\2\2\u022a\u022b\7e\2\2\u022b\u022c\7j\2\2\u022c\u022d"+
		"\7c\2\2\u022d\u022e\7n\2\2\u022e\u022f\7n\2\2\u022f\u0230\7g\2\2\u0230"+
		"\u0231\7p\2\2\u0231\u0232\7i\2\2\u0232\u0234\7g\2\2\u0233\u0218\3\2\2"+
		"\2\u0233\u0221\3\2\2\2\u0233\u022a\3\2\2\2\u0234b\3\2\2\2\u0235\u0236"+
		"\7O\2\2\u0236\u0237\7c\2\2\u0237\u0238\7v\2\2\u0238\u0239\7e\2\2\u0239"+
		"\u0245\7j\2\2\u023a\u023b\7O\2\2\u023b\u023c\7C\2\2\u023c\u023d\7V\2\2"+
		"\u023d\u023e\7E\2\2\u023e\u0245\7J\2\2\u023f\u0240\7o\2\2\u0240\u0241"+
		"\7c\2\2\u0241\u0242\7v\2\2\u0242\u0243\7e\2\2\u0243\u0245\7j\2\2\u0244"+
		"\u0235\3\2\2\2\u0244\u023a\3\2\2\2\u0244\u023f\3\2\2\2\u0245d\3\2\2\2"+
		"\u0246\u0247\7E\2\2\u0247\u0248\7j\2\2\u0248\u0249\7c\2\2\u0249\u024a"+
		"\7n\2\2\u024a\u024b\7n\2\2\u024b\u024c\7g\2\2\u024c\u024d\7p\2\2\u024d"+
		"\u024e\7i\2\2\u024e\u024f\7g\2\2\u024f\u0250\7s\2\2\u0250\u0251\7w\2\2"+
		"\u0251\u0252\7k\2\2\u0252\u027c\7v\2\2\u0253\u0254\7E\2\2\u0254\u0255"+
		"\7J\2\2\u0255\u0256\7C\2\2\u0256\u0257\7N\2\2\u0257\u0258\7N\2\2\u0258"+
		"\u0259\7G\2\2\u0259\u025a\7P\2\2\u025a\u025b\7I\2\2\u025b\u025c\7G\2\2"+
		"\u025c\u025d\7S\2\2\u025d\u025e\7W\2\2\u025e\u025f\7K\2\2\u025f\u027c"+
		"\7V\2\2\u0260\u0261\7e\2\2\u0261\u0262\7j\2\2\u0262\u0263\7c\2\2\u0263"+
		"\u0264\7n\2\2\u0264\u0265\7n\2\2\u0265\u0266\7g\2\2\u0266\u0267\7p\2\2"+
		"\u0267\u0268\7i\2\2\u0268\u0269\7g\2\2\u0269\u026a\7s\2\2\u026a\u026b"+
		"\7w\2\2\u026b\u026c\7k\2\2\u026c\u027c\7v\2\2\u026d\u026e\7E\2\2\u026e"+
		"\u027c\7S\2\2\u026f\u0270\7S\2\2\u0270\u0271\7w\2\2\u0271\u0272\7k\2\2"+
		"\u0272\u027c\7v\2\2\u0273\u0274\7s\2\2\u0274\u0275\7w\2\2\u0275\u0276"+
		"\7k\2\2\u0276\u027c\7v\2\2\u0277\u0278\7S\2\2\u0278\u0279\7W\2\2\u0279"+
		"\u027a\7K\2\2\u027a\u027c\7V\2\2\u027b\u0246\3\2\2\2\u027b\u0253\3\2\2"+
		"\2\u027b\u0260\3\2\2\2\u027b\u026d\3\2\2\2\u027b\u026f\3\2\2\2\u027b\u0273"+
		"\3\2\2\2\u027b\u0277\3\2\2\2\u027cf\3\2\2\2\u027d\u027f\4\62;\2\u027e"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0288\3\2\2\2\u0282\u0284\7\60\2\2\u0283\u0285\4\62;\2\u0284"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0289\3\2\2\2\u0288\u0282\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"h\3\2\2\2\u028a\u028e\t\2\2\2\u028b\u028d\t\3\2\2\u028c\u028b\3\2\2\2"+
		"\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028fj\3"+
		"\2\2\2\u0290\u028e\3\2\2\2\u0291\u0295\7$\2\2\u0292\u0294\13\2\2\2\u0293"+
		"\u0292\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0296\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0299\7$\2\2\u0299"+
		"l\3\2\2\2\u029a\u029c\t\4\2\2\u029b\u029a\3\2\2\2\u029c\u029d\3\2\2\2"+
		"\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0"+
		"\b\67\2\2\u02a0n\3\2\2\2#\2\u00a4\u00b0\u00bc\u00ca\u00d4\u00de\u00fa"+
		"\u0106\u0112\u012c\u0142\u014c\u0158\u0162\u016c\u017b\u0189\u019b\u01b3"+
		"\u01cb\u01d6\u0204\u0216\u0233\u0244\u027b\u0280\u0286\u0288\u028e\u0295"+
		"\u029d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}