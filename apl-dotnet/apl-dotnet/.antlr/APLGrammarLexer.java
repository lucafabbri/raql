// Generated from /Users/rchdeveloper/Documents/GitHub/api-query-language/apl-dotnet/apl-dotnet/APLGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class APLGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IN=7, BASE_OPERATOR=8, 
		STRING_OPERATOR=9, NUMBER_OPERATOR=10, CONJUNCTIONS=11, NUMBER=12, WORD=13, 
		STRING=14, BOOLEAN=15, NULL=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "SPACE_OPTIONAL", "ESC", 
			"UNICODE", "HEX", "INT", "EXP", "AND", "OR", "SAFECODEPOINT", "EQUALS", 
			"NOT_EQUALS", "MAJOR", "MINOR", "MAJOR_EQUALS", "MINOR_EQUALS", "LIKE", 
			"IN", "BASE_OPERATOR", "STRING_OPERATOR", "NUMBER_OPERATOR", "CONJUNCTIONS", 
			"NUMBER", "WORD", "STRING", "BOOLEAN", "NULL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "' '", "')'", "'['", "','", "']'", null, null, null, null, 
			null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IN", "BASE_OPERATOR", "STRING_OPERATOR", 
			"NUMBER_OPERATOR", "CONJUNCTIONS", "NUMBER", "WORD", "STRING", "BOOLEAN", 
			"NULL", "WS"
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


	public APLGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "APLGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u010c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\5"+
		"\bS\n\b\3\t\3\t\3\t\5\tX\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\7\fe\n\f\f\f\16\fh\13\f\5\fj\n\f\3\r\3\r\5\rn\n\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16|\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00b4\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00be\n\30\3\31\3\31\5\31\u00c2"+
		"\n\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00ca\n\33\3\34\3\34\5\34\u00ce"+
		"\n\34\3\35\5\35\u00d1\n\35\3\35\3\35\3\35\6\35\u00d6\n\35\r\35\16\35\u00d7"+
		"\3\35\5\35\u00db\n\35\3\35\5\35\u00de\n\35\3\35\3\35\3\35\3\35\5\35\u00e4"+
		"\n\35\3\35\5\35\u00e7\n\35\3\36\3\36\5\36\u00eb\n\36\3\37\3\37\7\37\u00ef"+
		"\n\37\f\37\16\37\u00f2\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00ff"+
		"\n \3!\3!\3!\3!\3!\3\"\6\"\u0107\n\"\r\"\16\"\u0108\3\"\3\"\2\2#\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2"+
		"%\2\'\2)\2+\2-\2/\t\61\n\63\13\65\f\67\r9\16;\17=\20?\21A\22C\23\3\2\n"+
		"\n\2))\61\61^^ddhhppttvv\5\2\62;CHch\3\2\63;\3\2\62;\4\2GGgg\4\2--//\5"+
		"\2\2!))^^\5\2\13\f\17\17\"\"\2\u0114\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2"+
		"\2\13M\3\2\2\2\rO\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23Y\3\2\2\2\25_\3\2"+
		"\2\2\27i\3\2\2\2\31k\3\2\2\2\33{\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2"+
		"\2\2!\u0089\3\2\2\2#\u008d\3\2\2\2%\u0093\3\2\2\2\'\u0097\3\2\2\2)\u009b"+
		"\3\2\2\2+\u00a1\3\2\2\2-\u00b3\3\2\2\2/\u00bd\3\2\2\2\61\u00c1\3\2\2\2"+
		"\63\u00c3\3\2\2\2\65\u00c9\3\2\2\2\67\u00cd\3\2\2\29\u00e6\3\2\2\2;\u00ea"+
		"\3\2\2\2=\u00ec\3\2\2\2?\u00fe\3\2\2\2A\u0100\3\2\2\2C\u0106\3\2\2\2E"+
		"F\7*\2\2F\4\3\2\2\2GH\7\"\2\2H\6\3\2\2\2IJ\7+\2\2J\b\3\2\2\2KL\7]\2\2"+
		"L\n\3\2\2\2MN\7.\2\2N\f\3\2\2\2OP\7_\2\2P\16\3\2\2\2QS\7\"\2\2RQ\3\2\2"+
		"\2RS\3\2\2\2S\20\3\2\2\2TW\7^\2\2UX\t\2\2\2VX\5\23\n\2WU\3\2\2\2WV\3\2"+
		"\2\2X\22\3\2\2\2YZ\7w\2\2Z[\5\25\13\2[\\\5\25\13\2\\]\5\25\13\2]^\5\25"+
		"\13\2^\24\3\2\2\2_`\t\3\2\2`\26\3\2\2\2aj\7\62\2\2bf\t\4\2\2ce\t\5\2\2"+
		"dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia\3\2\2\2"+
		"ib\3\2\2\2j\30\3\2\2\2km\t\6\2\2ln\t\7\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2"+
		"\2op\5\27\f\2p\32\3\2\2\2qr\7\"\2\2rs\7c\2\2st\7p\2\2tu\7f\2\2u|\7\"\2"+
		"\2vw\7\"\2\2wx\7C\2\2xy\7P\2\2yz\7F\2\2z|\7\"\2\2{q\3\2\2\2{v\3\2\2\2"+
		"|\34\3\2\2\2}~\7\"\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\u0086\7\"\2"+
		"\2\u0081\u0082\7\"\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7T\2\2\u0084\u0086"+
		"\7\"\2\2\u0085}\3\2\2\2\u0085\u0081\3\2\2\2\u0086\36\3\2\2\2\u0087\u0088"+
		"\n\b\2\2\u0088 \3\2\2\2\u0089\u008a\5\17\b\2\u008a\u008b\7?\2\2\u008b"+
		"\u008c\5\17\b\2\u008c\"\3\2\2\2\u008d\u008e\5\17\b\2\u008e\u008f\7#\2"+
		"\2\u008f\u0090\7?\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\17\b\2\u0092$"+
		"\3\2\2\2\u0093\u0094\5\17\b\2\u0094\u0095\7@\2\2\u0095\u0096\5\17\b\2"+
		"\u0096&\3\2\2\2\u0097\u0098\5\17\b\2\u0098\u0099\7>\2\2\u0099\u009a\5"+
		"\17\b\2\u009a(\3\2\2\2\u009b\u009c\5\17\b\2\u009c\u009d\7@\2\2\u009d\u009e"+
		"\7?\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5\17\b\2\u00a0*\3\2\2\2\u00a1"+
		"\u00a2\5\17\b\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\5\17\b\2\u00a6,\3\2\2\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9"+
		"\7n\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7m\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00b4\7\"\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7N\2\2\u00af\u00b0\7K\2"+
		"\2\u00b0\u00b1\7M\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b4\7\"\2\2\u00b3\u00a7"+
		"\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7\"\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00be\7\"\2\2\u00b9\u00ba\7\"\2"+
		"\2\u00ba\u00bb\7K\2\2\u00bb\u00bc\7P\2\2\u00bc\u00be\7\"\2\2\u00bd\u00b5"+
		"\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\60\3\2\2\2\u00bf\u00c2\5!\21\2\u00c0"+
		"\u00c2\5#\22\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\62\3\2\2"+
		"\2\u00c3\u00c4\5-\27\2\u00c4\64\3\2\2\2\u00c5\u00ca\5%\23\2\u00c6\u00ca"+
		"\5)\25\2\u00c7\u00ca\5\'\24\2\u00c8\u00ca\5+\26\2\u00c9\u00c5\3\2\2\2"+
		"\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\66"+
		"\3\2\2\2\u00cb\u00ce\5\33\16\2\u00cc\u00ce\5\35\17\2\u00cd\u00cb\3\2\2"+
		"\2\u00cd\u00cc\3\2\2\2\u00ce8\3\2\2\2\u00cf\u00d1\7/\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5\27\f\2\u00d3"+
		"\u00d5\7\60\2\2\u00d4\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00db\5\31\r\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e7\3"+
		"\2\2\2\u00dc\u00de\7/\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\5\27\f\2\u00e0\u00e1\5\31\r\2\u00e1\u00e7\3"+
		"\2\2\2\u00e2\u00e4\7/\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\5\27\f\2\u00e6\u00d0\3\2\2\2\u00e6\u00dd\3"+
		"\2\2\2\u00e6\u00e3\3\2\2\2\u00e7:\3\2\2\2\u00e8\u00eb\5\21\t\2\u00e9\u00eb"+
		"\5\37\20\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb<\3\2\2\2\u00ec"+
		"\u00f0\7)\2\2\u00ed\u00ef\5;\36\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f8\7w\2\2\u00f8\u00ff\7g\2\2\u00f9\u00fa\7h\2\2"+
		"\u00fa\u00fb\7c\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00ff"+
		"\7g\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff@\3\2\2\2\u0100\u0101"+
		"\7p\2\2\u0101\u0102\7w\2\2\u0102\u0103\7n\2\2\u0103\u0104\7n\2\2\u0104"+
		"B\3\2\2\2\u0105\u0107\t\t\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\b\"\2\2\u010bD\3\2\2\2\31\2RWfim{\u0085\u00b3\u00bd\u00c1\u00c9\u00cd"+
		"\u00d0\u00d7\u00da\u00dd\u00e3\u00e6\u00ea\u00f0\u00fe\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}