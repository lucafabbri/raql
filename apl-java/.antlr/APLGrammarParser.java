// Generated from /Users/rchdeveloper/Documents/GitHub/api-query-language/apl-java/APLGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class APLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IN=7, BASE_OPERATOR=8, 
		STRING_OPERATOR=9, NUMBER_OPERATOR=10, CONJUNCTIONS=11, NUMBER=12, WORD=13, 
		STRING=14, BOOLEAN=15, NULL=16, WS=17;
	public static final int
		RULE_clause = 0, RULE_conjunction = 1, RULE_operation = 2, RULE_string_array_operation = 3, 
		RULE_number_array_operation = 4, RULE_bool_array_operation = 5, RULE_array_operator = 6, 
		RULE_string_operation = 7, RULE_string_operator = 8, RULE_number_operation = 9, 
		RULE_number_operator = 10, RULE_bool_operation = 11, RULE_bool_operator = 12, 
		RULE_field = 13, RULE_nullstring = 14, RULE_string = 15, RULE_string_array = 16, 
		RULE_number = 17, RULE_number_array = 18, RULE_bool = 19, RULE_bool_array = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"clause", "conjunction", "operation", "string_array_operation", "number_array_operation", 
			"bool_array_operation", "array_operator", "string_operation", "string_operator", 
			"number_operation", "number_operator", "bool_operation", "bool_operator", 
			"field", "nullstring", "string", "string_array", "number", "number_array", 
			"bool", "bool_array"
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

	@Override
	public String getGrammarFileName() { return "APLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public APLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClauseContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	}

	public final ClauseContext clause() throws RecognitionException {
		return clause(0);
	}

	private ClauseContext clause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClauseContext _localctx = new ClauseContext(_ctx, _parentState);
		ClauseContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_clause, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(43);
				match(T__0);
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					match(T__1);
					}
					break;
				}
				setState(47);
				clause(0);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(48);
					match(T__1);
					}
				}

				setState(51);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(53);
				operation();
				setState(54);
				conjunction();
				setState(55);
				clause(3);
				}
				break;
			case 4:
				{
				setState(57);
				operation();
				setState(58);
				conjunction();
				setState(59);
				operation();
				}
				break;
			case 5:
				{
				setState(61);
				operation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ClauseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_clause);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65);
						conjunction();
						setState(66);
						clause(6);
						}
						break;
					case 2:
						{
						_localctx = new ClauseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_clause);
						setState(68);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(69);
						conjunction();
						setState(70);
						operation();
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public TerminalNode CONJUNCTIONS() { return getToken(APLGrammarParser.CONJUNCTIONS, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CONJUNCTIONS);
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

	public static class OperationContext extends ParserRuleContext {
		public Bool_array_operationContext bool_array_operation() {
			return getRuleContext(Bool_array_operationContext.class,0);
		}
		public Number_array_operationContext number_array_operation() {
			return getRuleContext(Number_array_operationContext.class,0);
		}
		public String_array_operationContext string_array_operation() {
			return getRuleContext(String_array_operationContext.class,0);
		}
		public Bool_operationContext bool_operation() {
			return getRuleContext(Bool_operationContext.class,0);
		}
		public Number_operationContext number_operation() {
			return getRuleContext(Number_operationContext.class,0);
		}
		public String_operationContext string_operation() {
			return getRuleContext(String_operationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				bool_array_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				number_array_operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				string_array_operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				bool_operation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				number_operation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				string_operation();
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

	public static class String_array_operationContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Array_operatorContext array_operator() {
			return getRuleContext(Array_operatorContext.class,0);
		}
		public String_arrayContext string_array() {
			return getRuleContext(String_arrayContext.class,0);
		}
		public String_array_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_array_operation; }
	}

	public final String_array_operationContext string_array_operation() throws RecognitionException {
		String_array_operationContext _localctx = new String_array_operationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string_array_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			field();
			setState(88);
			array_operator();
			setState(89);
			string_array();
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

	public static class Number_array_operationContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Array_operatorContext array_operator() {
			return getRuleContext(Array_operatorContext.class,0);
		}
		public Number_arrayContext number_array() {
			return getRuleContext(Number_arrayContext.class,0);
		}
		public Number_array_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_array_operation; }
	}

	public final Number_array_operationContext number_array_operation() throws RecognitionException {
		Number_array_operationContext _localctx = new Number_array_operationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number_array_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			field();
			setState(92);
			array_operator();
			setState(93);
			number_array();
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

	public static class Bool_array_operationContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Array_operatorContext array_operator() {
			return getRuleContext(Array_operatorContext.class,0);
		}
		public Bool_arrayContext bool_array() {
			return getRuleContext(Bool_arrayContext.class,0);
		}
		public Bool_array_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_array_operation; }
	}

	public final Bool_array_operationContext bool_array_operation() throws RecognitionException {
		Bool_array_operationContext _localctx = new Bool_array_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool_array_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			field();
			setState(96);
			array_operator();
			setState(97);
			bool_array();
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

	public static class Array_operatorContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(APLGrammarParser.IN, 0); }
		public Array_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_operator; }
	}

	public final Array_operatorContext array_operator() throws RecognitionException {
		Array_operatorContext _localctx = new Array_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IN);
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

	public static class String_operationContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public String_operatorContext string_operator() {
			return getRuleContext(String_operatorContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NullstringContext nullstring() {
			return getRuleContext(NullstringContext.class,0);
		}
		public String_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_operation; }
	}

	public final String_operationContext string_operation() throws RecognitionException {
		String_operationContext _localctx = new String_operationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			field();
			setState(102);
			string_operator();
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(103);
				string();
				}
				break;
			case NULL:
				{
				setState(104);
				nullstring();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class String_operatorContext extends ParserRuleContext {
		public TerminalNode BASE_OPERATOR() { return getToken(APLGrammarParser.BASE_OPERATOR, 0); }
		public TerminalNode STRING_OPERATOR() { return getToken(APLGrammarParser.STRING_OPERATOR, 0); }
		public String_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_operator; }
	}

	public final String_operatorContext string_operator() throws RecognitionException {
		String_operatorContext _localctx = new String_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==BASE_OPERATOR || _la==STRING_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Number_operationContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Number_operatorContext number_operator() {
			return getRuleContext(Number_operatorContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Number_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_operation; }
	}

	public final Number_operationContext number_operation() throws RecognitionException {
		Number_operationContext _localctx = new Number_operationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			field();
			setState(110);
			number_operator();
			setState(111);
			number();
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

	public static class Number_operatorContext extends ParserRuleContext {
		public TerminalNode BASE_OPERATOR() { return getToken(APLGrammarParser.BASE_OPERATOR, 0); }
		public TerminalNode NUMBER_OPERATOR() { return getToken(APLGrammarParser.NUMBER_OPERATOR, 0); }
		public Number_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_operator; }
	}

	public final Number_operatorContext number_operator() throws RecognitionException {
		Number_operatorContext _localctx = new Number_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==BASE_OPERATOR || _la==NUMBER_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Bool_operationContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Bool_operatorContext bool_operator() {
			return getRuleContext(Bool_operatorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Bool_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operation; }
	}

	public final Bool_operationContext bool_operation() throws RecognitionException {
		Bool_operationContext _localctx = new Bool_operationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			field();
			setState(116);
			bool_operator();
			setState(117);
			bool();
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

	public static class Bool_operatorContext extends ParserRuleContext {
		public TerminalNode BASE_OPERATOR() { return getToken(APLGrammarParser.BASE_OPERATOR, 0); }
		public Bool_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operator; }
	}

	public final Bool_operatorContext bool_operator() throws RecognitionException {
		Bool_operatorContext _localctx = new Bool_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(BASE_OPERATOR);
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

	public static class FieldContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(APLGrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(APLGrammarParser.WORD, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(121);
				match(WORD);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class NullstringContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(APLGrammarParser.NULL, 0); }
		public NullstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullstring; }
	}

	public final NullstringContext nullstring() throws RecognitionException {
		NullstringContext _localctx = new NullstringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nullstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NULL);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(APLGrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(STRING);
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

	public static class String_arrayContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public String_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_array; }
	}

	public final String_arrayContext string_array() throws RecognitionException {
		String_arrayContext _localctx = new String_arrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string_array);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__3);
				setState(132);
				string();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(133);
					match(T__4);
					setState(134);
					string();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__3);
				setState(143);
				match(T__5);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(APLGrammarParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(NUMBER);
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

	public static class Number_arrayContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Number_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_array; }
	}

	public final Number_arrayContext number_array() throws RecognitionException {
		Number_arrayContext _localctx = new Number_arrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number_array);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__3);
				setState(149);
				number();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(150);
					match(T__4);
					setState(151);
					number();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__3);
				setState(160);
				match(T__5);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(APLGrammarParser.BOOLEAN, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(BOOLEAN);
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

	public static class Bool_arrayContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public Bool_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_array; }
	}

	public final Bool_arrayContext bool_array() throws RecognitionException {
		Bool_arrayContext _localctx = new Bool_arrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool_array);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__3);
				setState(166);
				bool();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(167);
					match(T__4);
					setState(168);
					bool();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__3);
				setState(177);
				match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return clause_sempred((ClauseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean clause_sempred(ClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\5\2\60\n\2\3\2\3"+
		"\2\5\2\64\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2A\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\7\17}\n\17\f\17\16\17\u0080\13\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u008a\n\22\f\22\16\22\u008d"+
		"\13\22\3\22\3\22\3\22\3\22\5\22\u0093\n\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\7\24\u009b\n\24\f\24\16\24\u009e\13\24\3\24\3\24\3\24\3\24\5\24\u00a4"+
		"\n\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00ac\n\26\f\26\16\26\u00af\13"+
		"\26\3\26\3\26\3\26\3\26\5\26\u00b5\n\26\3\26\2\3\2\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\4\3\2\n\13\4\2\n\n\f\f\2\u00b6\2@\3\2\2"+
		"\2\4O\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\n]\3\2\2\2\fa\3\2\2\2\16e\3\2\2\2"+
		"\20g\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2\32y\3\2\2"+
		"\2\34~\3\2\2\2\36\u0081\3\2\2\2 \u0083\3\2\2\2\"\u0092\3\2\2\2$\u0094"+
		"\3\2\2\2&\u00a3\3\2\2\2(\u00a5\3\2\2\2*\u00b4\3\2\2\2,A\b\2\1\2-/\7\3"+
		"\2\2.\60\7\4\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\63\5\2\2\2\62"+
		"\64\7\4\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\5\2\2\66"+
		"A\3\2\2\2\678\5\6\4\289\5\4\3\29:\5\2\2\5:A\3\2\2\2;<\5\6\4\2<=\5\4\3"+
		"\2=>\5\6\4\2>A\3\2\2\2?A\5\6\4\2@,\3\2\2\2@-\3\2\2\2@\67\3\2\2\2@;\3\2"+
		"\2\2@?\3\2\2\2AL\3\2\2\2BC\f\7\2\2CD\5\4\3\2DE\5\2\2\bEK\3\2\2\2FG\f\6"+
		"\2\2GH\5\4\3\2HI\5\6\4\2IK\3\2\2\2JB\3\2\2\2JF\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2M\3\3\2\2\2NL\3\2\2\2OP\7\r\2\2P\5\3\2\2\2QX\5\f\7\2RX\5"+
		"\n\6\2SX\5\b\5\2TX\5\30\r\2UX\5\24\13\2VX\5\20\t\2WQ\3\2\2\2WR\3\2\2\2"+
		"WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ\5\34\17\2Z[\5\16"+
		"\b\2[\\\5\"\22\2\\\t\3\2\2\2]^\5\34\17\2^_\5\16\b\2_`\5&\24\2`\13\3\2"+
		"\2\2ab\5\34\17\2bc\5\16\b\2cd\5*\26\2d\r\3\2\2\2ef\7\t\2\2f\17\3\2\2\2"+
		"gh\5\34\17\2hk\5\22\n\2il\5 \21\2jl\5\36\20\2ki\3\2\2\2kj\3\2\2\2l\21"+
		"\3\2\2\2mn\t\2\2\2n\23\3\2\2\2op\5\34\17\2pq\5\26\f\2qr\5$\23\2r\25\3"+
		"\2\2\2st\t\3\2\2t\27\3\2\2\2uv\5\34\17\2vw\5\32\16\2wx\5(\25\2x\31\3\2"+
		"\2\2yz\7\n\2\2z\33\3\2\2\2{}\7\17\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\35\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\22\2\2\u0082"+
		"\37\3\2\2\2\u0083\u0084\7\20\2\2\u0084!\3\2\2\2\u0085\u0086\7\6\2\2\u0086"+
		"\u008b\5 \21\2\u0087\u0088\7\7\2\2\u0088\u008a\5 \21\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0093\3\2"+
		"\2\2\u0090\u0091\7\6\2\2\u0091\u0093\7\b\2\2\u0092\u0085\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093#\3\2\2\2\u0094\u0095\7\16\2\2\u0095%\3\2\2\2\u0096"+
		"\u0097\7\6\2\2\u0097\u009c\5$\23\2\u0098\u0099\7\7\2\2\u0099\u009b\5$"+
		"\23\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\b"+
		"\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4\7\b\2\2\u00a3"+
		"\u0096\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7\21\2"+
		"\2\u00a6)\3\2\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00ad\5(\25\2\u00a9\u00aa"+
		"\7\7\2\2\u00aa\u00ac\5(\25\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b1\7\b\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\u00b5\7\b\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5+\3\2\2\2"+
		"\20/\63@JLWk~\u008b\u0092\u009c\u00a3\u00ad\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}