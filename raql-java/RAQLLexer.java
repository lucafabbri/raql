// Generated from RAQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RAQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IN=6, BASE_OPERATOR=7, STRING_OPERATOR=8, 
		NUMBER_OPERATOR=9, CONJUNCTIONS=10, NUMBER=11, WORD=12, STRING=13, BOOLEAN=14, 
		NULL=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "N", "O", "T", "E", "Q", 
			"U", "A", "L", "S", "I", "K", "G", "R", "H", "W", "D", "ESC", "UNICODE", 
			"HEX", "INT", "EXP", "AND", "OR", "SAFECODEPOINT", "NOT", "EQUALS_SYMBOLS", 
			"EQUALS", "NOT_EQUALS_SYMBOLS", "NOT_EQUALS", "MAJOR_SYMBOLS", "MAJOR", 
			"MINOR_SYMBOLS", "MINOR", "MAJOR_EQUALS", "MAJOR_EQUALS_SYMBOLS", "MINOR_EQUALS", 
			"MINOR_EQUALS_SYMBOLS", "LIKE", "IN", "BASE_OPERATOR", "STRING_OPERATOR", 
			"NUMBER_OPERATOR", "CONJUNCTIONS", "NUMBER", "WORD", "STRING", "BOOLEAN", 
			"NULL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "','", "']'", null, null, null, null, null, 
			null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IN", "BASE_OPERATOR", "STRING_OPERATOR", 
			"NUMBER_OPERATOR", "CONJUNCTIONS", "NUMBER", "WORD", "STRING", "BOOLEAN", 
			"NULL"
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


	public RAQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RAQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0183\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u009f\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u00ac\n\33\f\33\16\33\u00af"+
		"\13\33\5\33\u00b1\n\33\3\34\3\34\5\34\u00b5\n\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \5"+
		" \u00cb\n \3!\3!\3!\3!\3!\3!\3!\3!\5!\u00d5\n!\3\"\5\"\u00d8\n\"\3\"\3"+
		"\"\5\"\u00dc\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00eb\n#\3"+
		"$\5$\u00ee\n$\3$\3$\5$\u00f2\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u0102\n%\3&\5&\u0105\n&\3&\3&\5&\u0109\n&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0117\n\'\3(\5(\u011a\n(\3(\3(\5(\u011e"+
		"\n(\3)\5)\u0121\n)\3)\3)\5)\u0125\n)\3*\3*\3*\3+\5+\u012b\n+\3+\3+\5+"+
		"\u012f\n+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\5/\u0140\n/\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\5\61\u0148\n\61\3\62\3\62\5\62\u014c\n\62\3"+
		"\63\5\63\u014f\n\63\3\63\3\63\3\63\6\63\u0154\n\63\r\63\16\63\u0155\3"+
		"\63\5\63\u0159\n\63\3\63\5\63\u015c\n\63\3\63\3\63\3\63\3\63\5\63\u0162"+
		"\n\63\3\63\5\63\u0165\n\63\3\64\3\64\5\64\u0169\n\64\3\65\3\65\7\65\u016d"+
		"\n\65\f\65\16\65\u0170\13\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\5\66\u017d\n\66\3\67\3\67\3\67\3\67\3\67\2\28\3\3\5\4\7"+
		"\5\t\6\13\7\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2"+
		"\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2"+
		"O\2Q\2S\2U\2W\2Y\2[\b]\t_\na\13c\fe\rg\16i\17k\20m\21\3\2\31\5\2\13\f"+
		"\17\17\"\"\4\2PPpp\4\2QQqq\4\2VVvv\4\2GGgg\4\2SSss\4\2WWww\4\2CCcc\4\2"+
		"NNnn\4\2UUuu\4\2KKkk\4\2MMmm\4\2IIii\4\2TTtt\4\2JJjj\4\2YYjj\4\2FFff\n"+
		"\2))\61\61^^ddhhppttvv\5\2\62;CHch\3\2\63;\3\2\62;\4\2--//\5\2\2!))^^"+
		"\2\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g"+
		"\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2"+
		"\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177"+
		"\3\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3"+
		"\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2"+
		"%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u0099\3"+
		"\2\2\2/\u009b\3\2\2\2\61\u00a0\3\2\2\2\63\u00a6\3\2\2\2\65\u00b0\3\2\2"+
		"\2\67\u00b2\3\2\2\29\u00b8\3\2\2\2;\u00be\3\2\2\2=\u00c3\3\2\2\2?\u00ca"+
		"\3\2\2\2A\u00d4\3\2\2\2C\u00d7\3\2\2\2E\u00ea\3\2\2\2G\u00ed\3\2\2\2I"+
		"\u0101\3\2\2\2K\u0104\3\2\2\2M\u0116\3\2\2\2O\u0119\3\2\2\2Q\u0120\3\2"+
		"\2\2S\u0126\3\2\2\2U\u012a\3\2\2\2W\u0130\3\2\2\2Y\u0133\3\2\2\2[\u013a"+
		"\3\2\2\2]\u013f\3\2\2\2_\u0141\3\2\2\2a\u0147\3\2\2\2c\u014b\3\2\2\2e"+
		"\u0164\3\2\2\2g\u0168\3\2\2\2i\u016a\3\2\2\2k\u017c\3\2\2\2m\u017e\3\2"+
		"\2\2op\7*\2\2p\4\3\2\2\2qr\7+\2\2r\6\3\2\2\2st\7]\2\2t\b\3\2\2\2uv\7."+
		"\2\2v\n\3\2\2\2wx\7_\2\2x\f\3\2\2\2yz\t\2\2\2z\16\3\2\2\2{|\t\3\2\2|\20"+
		"\3\2\2\2}~\t\4\2\2~\22\3\2\2\2\177\u0080\t\5\2\2\u0080\24\3\2\2\2\u0081"+
		"\u0082\t\6\2\2\u0082\26\3\2\2\2\u0083\u0084\t\7\2\2\u0084\30\3\2\2\2\u0085"+
		"\u0086\t\b\2\2\u0086\32\3\2\2\2\u0087\u0088\t\t\2\2\u0088\34\3\2\2\2\u0089"+
		"\u008a\t\n\2\2\u008a\36\3\2\2\2\u008b\u008c\t\13\2\2\u008c \3\2\2\2\u008d"+
		"\u008e\t\f\2\2\u008e\"\3\2\2\2\u008f\u0090\t\r\2\2\u0090$\3\2\2\2\u0091"+
		"\u0092\t\16\2\2\u0092&\3\2\2\2\u0093\u0094\t\17\2\2\u0094(\3\2\2\2\u0095"+
		"\u0096\t\20\2\2\u0096*\3\2\2\2\u0097\u0098\t\21\2\2\u0098,\3\2\2\2\u0099"+
		"\u009a\t\22\2\2\u009a.\3\2\2\2\u009b\u009e\7^\2\2\u009c\u009f\t\23\2\2"+
		"\u009d\u009f\5\61\31\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\60"+
		"\3\2\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\5\63\32\2\u00a2\u00a3\5\63\32"+
		"\2\u00a3\u00a4\5\63\32\2\u00a4\u00a5\5\63\32\2\u00a5\62\3\2\2\2\u00a6"+
		"\u00a7\t\24\2\2\u00a7\64\3\2\2\2\u00a8\u00b1\7\62\2\2\u00a9\u00ad\t\25"+
		"\2\2\u00aa\u00ac\t\26\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\66\3\2\2\2\u00b2\u00b4"+
		"\t\6\2\2\u00b3\u00b5\t\27\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5\65\33\2\u00b78\3\2\2\2\u00b8\u00b9"+
		"\5\r\7\2\u00b9\u00ba\5\33\16\2\u00ba\u00bb\5\17\b\2\u00bb\u00bc\5-\27"+
		"\2\u00bc\u00bd\5\r\7\2\u00bd:\3\2\2\2\u00be\u00bf\5\r\7\2\u00bf\u00c0"+
		"\5\21\t\2\u00c0\u00c1\5\'\24\2\u00c1\u00c2\5\r\7\2\u00c2<\3\2\2\2\u00c3"+
		"\u00c4\n\30\2\2\u00c4>\3\2\2\2\u00c5\u00cb\7#\2\2\u00c6\u00c7\5\17\b\2"+
		"\u00c7\u00c8\5\21\t\2\u00c8\u00c9\5\23\n\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5"+
		"\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb@\3\2\2\2\u00cc\u00d5\7?\2\2\u00cd\u00ce"+
		"\5\25\13\2\u00ce\u00cf\5\27\f\2\u00cf\u00d0\5\31\r\2\u00d0\u00d1\5\33"+
		"\16\2\u00d1\u00d2\5\35\17\2\u00d2\u00d3\5\37\20\2\u00d3\u00d5\3\2\2\2"+
		"\u00d4\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d5B\3\2\2\2\u00d6\u00d8\5"+
		"\r\7\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\5A!\2\u00da\u00dc\5\r\7\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2"+
		"\2\u00dcD\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00eb\7?\2\2\u00df\u00e0\5"+
		"\17\b\2\u00e0\u00e1\5\21\t\2\u00e1\u00e2\5\23\n\2\u00e2\u00e3\5\r\7\2"+
		"\u00e3\u00e4\5\25\13\2\u00e4\u00e5\5\27\f\2\u00e5\u00e6\5\31\r\2\u00e6"+
		"\u00e7\5\33\16\2\u00e7\u00e8\5\35\17\2\u00e8\u00e9\5\37\20\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00dd\3\2\2\2\u00ea\u00df\3\2\2\2\u00ebF\3\2\2\2\u00ec"+
		"\u00ee\5\r\7\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\5E#\2\u00f0\u00f2\5\r\7\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2H\3\2\2\2\u00f3\u0102\7@\2\2\u00f4\u00f5\5%\23\2\u00f5\u00f6"+
		"\5\'\24\2\u00f6\u00f7\5\25\13\2\u00f7\u00f8\5\33\16\2\u00f8\u00f9\5\23"+
		"\n\2\u00f9\u00fa\5\25\13\2\u00fa\u00fb\5\'\24\2\u00fb\u00fc\5\r\7\2\u00fc"+
		"\u00fd\5\23\n\2\u00fd\u00fe\5)\25\2\u00fe\u00ff\5\33\16\2\u00ff\u0100"+
		"\5\17\b\2\u0100\u0102\3\2\2\2\u0101\u00f3\3\2\2\2\u0101\u00f4\3\2\2\2"+
		"\u0102J\3\2\2\2\u0103\u0105\5\r\7\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5I%\2\u0107\u0109\5\r\7\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109L\3\2\2\2\u010a\u0117\7@\2\2\u010b"+
		"\u010c\5\35\17\2\u010c\u010d\5\21\t\2\u010d\u010e\5+\26\2\u010e\u010f"+
		"\5\25\13\2\u010f\u0110\5\'\24\2\u0110\u0111\5\r\7\2\u0111\u0112\5\23\n"+
		"\2\u0112\u0113\5)\25\2\u0113\u0114\5\33\16\2\u0114\u0115\5\17\b\2\u0115"+
		"\u0117\3\2\2\2\u0116\u010a\3\2\2\2\u0116\u010b\3\2\2\2\u0117N\3\2\2\2"+
		"\u0118\u011a\5\r\7\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011d\5M\'\2\u011c\u011e\5\r\7\2\u011d\u011c\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011eP\3\2\2\2\u011f\u0121\5\r\7\2\u0120\u011f\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\5S*\2\u0123\u0125"+
		"\5\r\7\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125R\3\2\2\2\u0126"+
		"\u0127\7@\2\2\u0127\u0128\7?\2\2\u0128T\3\2\2\2\u0129\u012b\5\r\7\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\5W"+
		",\2\u012d\u012f\5\r\7\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"V\3\2\2\2\u0130\u0131\7>\2\2\u0131\u0132\7?\2\2\u0132X\3\2\2\2\u0133\u0134"+
		"\5\r\7\2\u0134\u0135\5\35\17\2\u0135\u0136\5!\21\2\u0136\u0137\5#\22\2"+
		"\u0137\u0138\5\25\13\2\u0138\u0139\5\r\7\2\u0139Z\3\2\2\2\u013a\u013b"+
		"\5!\21\2\u013b\u013c\5\17\b\2\u013c\\\3\2\2\2\u013d\u0140\5C\"\2\u013e"+
		"\u0140\5G$\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140^\3\2\2\2\u0141"+
		"\u0142\5Y-\2\u0142`\3\2\2\2\u0143\u0148\5K&\2\u0144\u0148\5Q)\2\u0145"+
		"\u0148\5O(\2\u0146\u0148\5U+\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2"+
		"\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148b\3\2\2\2\u0149\u014c\5"+
		"9\35\2\u014a\u014c\5;\36\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"d\3\2\2\2\u014d\u014f\7/\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\5\65\33\2\u0151\u0153\7\60\2\2\u0152\u0154"+
		"\t\26\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5\67\34\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0165\3\2\2\2\u015a\u015c\7/\2\2\u015b"+
		"\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5\65"+
		"\33\2\u015e\u015f\5\67\34\2\u015f\u0165\3\2\2\2\u0160\u0162\7/\2\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\5\65"+
		"\33\2\u0164\u014e\3\2\2\2\u0164\u015b\3\2\2\2\u0164\u0161\3\2\2\2\u0165"+
		"f\3\2\2\2\u0166\u0169\5/\30\2\u0167\u0169\5=\37\2\u0168\u0166\3\2\2\2"+
		"\u0168\u0167\3\2\2\2\u0169h\3\2\2\2\u016a\u016e\7)\2\2\u016b\u016d\5g"+
		"\64\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7)"+
		"\2\2\u0172j\3\2\2\2\u0173\u0174\7v\2\2\u0174\u0175\7t\2\2\u0175\u0176"+
		"\7w\2\2\u0176\u017d\7g\2\2\u0177\u0178\7h\2\2\u0178\u0179\7c\2\2\u0179"+
		"\u017a\7n\2\2\u017a\u017b\7u\2\2\u017b\u017d\7g\2\2\u017c\u0173\3\2\2"+
		"\2\u017c\u0177\3\2\2\2\u017dl\3\2\2\2\u017e\u017f\7p\2\2\u017f\u0180\7"+
		"w\2\2\u0180\u0181\7n\2\2\u0181\u0182\7n\2\2\u0182n\3\2\2\2$\2\u009e\u00ad"+
		"\u00b0\u00b4\u00ca\u00d4\u00d7\u00db\u00ea\u00ed\u00f1\u0101\u0104\u0108"+
		"\u0116\u0119\u011d\u0120\u0124\u012a\u012e\u013f\u0147\u014b\u014e\u0155"+
		"\u0158\u015b\u0161\u0164\u0168\u016e\u017c\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}