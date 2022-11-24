// Generated from c:\Users\lfabbri\projects\api-query-language\apl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OPERATOR=7, CONJUNCTIONS=8, 
		NUMBER=9, STRING=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ESC", "UNICODE", "HEX", 
			"BOOLEAN", "AND", "OR", "INT", "EXP", "OPERATOR", "CONJUNCTIONS", "NUMBER", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'true'", "'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "OPERATOR", "CONJUNCTIONS", 
			"NUMBER", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public aplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "apl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u009a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bC\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16V"+
		"\n\16\f\16\16\16Y\13\16\5\16[\n\16\3\17\3\17\5\17_\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20k\n\20\3\21\3\21\5\21o\n\21\3"+
		"\22\5\22r\n\22\3\22\3\22\3\22\6\22w\n\22\r\22\16\22x\3\22\5\22|\n\22\3"+
		"\22\5\22\177\n\22\3\22\3\22\3\22\3\22\5\22\u0085\n\22\3\22\5\22\u0088"+
		"\n\22\3\23\3\23\3\23\7\23\u008d\n\23\f\23\16\23\u0090\13\23\3\23\3\23"+
		"\3\24\6\24\u0095\n\24\r\24\16\24\u0096\3\24\3\24\2\2\25\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\t!\n#\13%\f\'\r"+
		"\3\2\17\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\b\2))ccghnntw~~\n\2))..CC"+
		"FFPPccffpp\b\2))..QQTTqqtt\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2##??\4\2"+
		">>@@\4\2$$^^\5\2\13\f\17\17\"\"\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3"+
		"\2\2\2\13\64\3\2\2\2\r:\3\2\2\2\17?\3\2\2\2\21D\3\2\2\2\23J\3\2\2\2\25"+
		"L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37j\3\2\2\2"+
		"!n\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u0094\3\2\2\2)*\7]\2\2*\4\3"+
		"\2\2\2+,\7.\2\2,\6\3\2\2\2-.\7_\2\2.\b\3\2\2\2/\60\7v\2\2\60\61\7t\2\2"+
		"\61\62\7w\2\2\62\63\7g\2\2\63\n\3\2\2\2\64\65\7h\2\2\65\66\7c\2\2\66\67"+
		"\7n\2\2\678\7u\2\289\7g\2\29\f\3\2\2\2:;\7p\2\2;<\7w\2\2<=\7n\2\2=>\7"+
		"n\2\2>\16\3\2\2\2?B\7^\2\2@C\t\2\2\2AC\5\21\t\2B@\3\2\2\2BA\3\2\2\2C\20"+
		"\3\2\2\2DE\7w\2\2EF\5\23\n\2FG\5\23\n\2GH\5\23\n\2HI\5\23\n\2I\22\3\2"+
		"\2\2JK\t\3\2\2K\24\3\2\2\2LM\t\4\2\2M\26\3\2\2\2NO\t\5\2\2O\30\3\2\2\2"+
		"PQ\t\6\2\2Q\32\3\2\2\2R[\7\62\2\2SW\t\7\2\2TV\t\b\2\2UT\3\2\2\2VY\3\2"+
		"\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2[\34\3"+
		"\2\2\2\\^\t\t\2\2]_\t\n\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5\33\16\2"+
		"a\36\3\2\2\2bk\t\13\2\2cd\7#\2\2dk\7?\2\2ek\t\f\2\2fg\7@\2\2gk\7?\2\2"+
		"hi\7>\2\2ik\7?\2\2jb\3\2\2\2jc\3\2\2\2je\3\2\2\2jf\3\2\2\2jh\3\2\2\2k"+
		" \3\2\2\2lo\5\27\f\2mo\5\31\r\2nl\3\2\2\2nm\3\2\2\2o\"\3\2\2\2pr\7/\2"+
		"\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\5\33\16\2tv\7\60\2\2uw\t\b\2\2vu\3"+
		"\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\35\17\2{z\3\2\2\2{"+
		"|\3\2\2\2|\u0088\3\2\2\2}\177\7/\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\5\33\16\2\u0081\u0082\5\35\17\2\u0082\u0088\3\2\2"+
		"\2\u0083\u0085\7/\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\5\33\16\2\u0087q\3\2\2\2\u0087~\3\2\2\2\u0087\u0084"+
		"\3\2\2\2\u0088$\3\2\2\2\u0089\u008e\7)\2\2\u008a\u008d\5\17\b\2\u008b"+
		"\u008d\n\r\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7)\2\2\u0092&\3\2\2\2\u0093\u0095\t\16\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\24\2\2\u0099(\3\2\2\2\22\2"+
		"BWZ^jnqx{~\u0084\u0087\u008c\u008e\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}