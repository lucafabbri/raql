// Generated from RAQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RAQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IN=7, BASE_OPERATOR=8, 
		STRING_OPERATOR=9, NUMBER_OPERATOR=10, CONJUNCTIONS=11, NUMBER=12, WORD=13, 
		STRING=14, BOOLEAN=15, NULL=16;
	public static final int
		RULE_raql = 0, RULE_clause = 1, RULE_conjunction = 2, RULE_operation = 3, 
		RULE_string_array_operation = 4, RULE_number_array_operation = 5, RULE_bool_array_operation = 6, 
		RULE_array_operator = 7, RULE_string_operation = 8, RULE_string_operator = 9, 
		RULE_number_operation = 10, RULE_number_operator = 11, RULE_bool_operation = 12, 
		RULE_bool_operator = 13, RULE_field = 14, RULE_nullstring = 15, RULE_string = 16, 
		RULE_string_array = 17, RULE_number = 18, RULE_number_array = 19, RULE_bool = 20, 
		RULE_bool_array = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"raql", "clause", "conjunction", "operation", "string_array_operation", 
			"number_array_operation", "bool_array_operation", "array_operator", "string_operation", 
			"string_operator", "number_operation", "number_operator", "bool_operation", 
			"bool_operator", "field", "nullstring", "string", "string_array", "number", 
			"number_array", "bool", "bool_array"
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

	@Override
	public String getGrammarFileName() { return "RAQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RAQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RaqlContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RAQLParser.EOF, 0); }
		public RaqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterRaql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitRaql(this);
		}
	}

	public final RaqlContext raql() throws RecognitionException {
		RaqlContext _localctx = new RaqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_raql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			clause(0);
			setState(45);
			match(EOF);
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

	public static class ClauseContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		return clause(0);
	}

	private ClauseContext clause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClauseContext _localctx = new ClauseContext(_ctx, _parentState);
		ClauseContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_clause, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
			case BASE_OPERATOR:
			case STRING_OPERATOR:
			case NUMBER_OPERATOR:
			case WORD:
				{
				setState(48);
				operation();
				}
				break;
			case T__0:
				{
				setState(49);
				match(T__0);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(50);
					match(T__1);
					}
				}

				setState(53);
				clause(0);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(54);
					match(T__1);
					}
				}

				setState(57);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClauseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_clause);
					setState(61);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(62);
					conjunction();
					setState(63);
					clause(2);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public TerminalNode CONJUNCTIONS() { return getToken(RAQLParser.CONJUNCTIONS, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				bool_array_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				number_array_operation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				string_array_operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				bool_operation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				number_operation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterString_array_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitString_array_operation(this);
		}
	}

	public final String_array_operationContext string_array_operation() throws RecognitionException {
		String_array_operationContext _localctx = new String_array_operationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_array_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			field();
			setState(81);
			array_operator();
			setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterNumber_array_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitNumber_array_operation(this);
		}
	}

	public final Number_array_operationContext number_array_operation() throws RecognitionException {
		Number_array_operationContext _localctx = new Number_array_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_number_array_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			field();
			setState(85);
			array_operator();
			setState(86);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterBool_array_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitBool_array_operation(this);
		}
	}

	public final Bool_array_operationContext bool_array_operation() throws RecognitionException {
		Bool_array_operationContext _localctx = new Bool_array_operationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool_array_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			field();
			setState(89);
			array_operator();
			setState(90);
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
		public TerminalNode IN() { return getToken(RAQLParser.IN, 0); }
		public Array_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterArray_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitArray_operator(this);
		}
	}

	public final Array_operatorContext array_operator() throws RecognitionException {
		Array_operatorContext _localctx = new Array_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterString_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitString_operation(this);
		}
	}

	public final String_operationContext string_operation() throws RecognitionException {
		String_operationContext _localctx = new String_operationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			field();
			setState(95);
			string_operator();
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(96);
				string();
				}
				break;
			case NULL:
				{
				setState(97);
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
		public TerminalNode BASE_OPERATOR() { return getToken(RAQLParser.BASE_OPERATOR, 0); }
		public TerminalNode STRING_OPERATOR() { return getToken(RAQLParser.STRING_OPERATOR, 0); }
		public String_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterString_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitString_operator(this);
		}
	}

	public final String_operatorContext string_operator() throws RecognitionException {
		String_operatorContext _localctx = new String_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterNumber_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitNumber_operation(this);
		}
	}

	public final Number_operationContext number_operation() throws RecognitionException {
		Number_operationContext _localctx = new Number_operationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			field();
			setState(103);
			number_operator();
			setState(104);
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
		public TerminalNode BASE_OPERATOR() { return getToken(RAQLParser.BASE_OPERATOR, 0); }
		public TerminalNode NUMBER_OPERATOR() { return getToken(RAQLParser.NUMBER_OPERATOR, 0); }
		public Number_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterNumber_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitNumber_operator(this);
		}
	}

	public final Number_operatorContext number_operator() throws RecognitionException {
		Number_operatorContext _localctx = new Number_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterBool_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitBool_operation(this);
		}
	}

	public final Bool_operationContext bool_operation() throws RecognitionException {
		Bool_operationContext _localctx = new Bool_operationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			field();
			setState(109);
			bool_operator();
			setState(110);
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
		public TerminalNode BASE_OPERATOR() { return getToken(RAQLParser.BASE_OPERATOR, 0); }
		public Bool_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterBool_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitBool_operator(this);
		}
	}

	public final Bool_operatorContext bool_operator() throws RecognitionException {
		Bool_operatorContext _localctx = new Bool_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		public List<TerminalNode> WORD() { return getTokens(RAQLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(RAQLParser.WORD, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(114);
				match(WORD);
				}
				}
				setState(119);
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
		public TerminalNode NULL() { return getToken(RAQLParser.NULL, 0); }
		public NullstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterNullstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitNullstring(this);
		}
	}

	public final NullstringContext nullstring() throws RecognitionException {
		NullstringContext _localctx = new NullstringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nullstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		public TerminalNode STRING() { return getToken(RAQLParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterString_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitString_array(this);
		}
	}

	public final String_arrayContext string_array() throws RecognitionException {
		String_arrayContext _localctx = new String_arrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string_array);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__3);
				setState(125);
				string();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(126);
					match(T__4);
					setState(127);
					string();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__3);
				setState(136);
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
		public TerminalNode NUMBER() { return getToken(RAQLParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterNumber_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitNumber_array(this);
		}
	}

	public final Number_arrayContext number_array() throws RecognitionException {
		Number_arrayContext _localctx = new Number_arrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number_array);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__3);
				setState(142);
				number();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(143);
					match(T__4);
					setState(144);
					number();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__3);
				setState(153);
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
		public TerminalNode BOOLEAN() { return getToken(RAQLParser.BOOLEAN, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).enterBool_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RAQLListener ) ((RAQLListener)listener).exitBool_array(this);
		}
	}

	public final Bool_arrayContext bool_array() throws RecognitionException {
		Bool_arrayContext _localctx = new Bool_arrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bool_array);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__3);
				setState(159);
				bool();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(160);
					match(T__4);
					setState(161);
					bool();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__3);
				setState(170);
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
		case 1:
			return clause_sempred((ClauseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean clause_sempred(ClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\3\3\3\5\3:\n\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3"+
		"\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5"+
		"\ne\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\7\20v\n\20\f\20\16\20y\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\7\23\u0083\n\23\f\23\16\23\u0086\13\23\3\23\3\23\3\23\3\23\5\23"+
		"\u008c\n\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0094\n\25\f\25\16\25\u0097"+
		"\13\25\3\25\3\25\3\25\3\25\5\25\u009d\n\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\7\27\u00a5\n\27\f\27\16\27\u00a8\13\27\3\27\3\27\3\27\3\27\5\27\u00ae"+
		"\n\27\3\27\2\3\4\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4"+
		"\3\2\n\13\4\2\n\n\f\f\2\u00aa\2.\3\2\2\2\4=\3\2\2\2\6H\3\2\2\2\bP\3\2"+
		"\2\2\nR\3\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24f\3\2"+
		"\2\2\26h\3\2\2\2\30l\3\2\2\2\32n\3\2\2\2\34r\3\2\2\2\36w\3\2\2\2 z\3\2"+
		"\2\2\"|\3\2\2\2$\u008b\3\2\2\2&\u008d\3\2\2\2(\u009c\3\2\2\2*\u009e\3"+
		"\2\2\2,\u00ad\3\2\2\2./\5\4\3\2/\60\7\2\2\3\60\3\3\2\2\2\61\62\b\3\1\2"+
		"\62>\5\b\5\2\63\65\7\3\2\2\64\66\7\4\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\679\5\4\3\28:\7\4\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\5"+
		"\2\2<>\3\2\2\2=\61\3\2\2\2=\63\3\2\2\2>E\3\2\2\2?@\f\3\2\2@A\5\6\4\2A"+
		"B\5\4\3\4BD\3\2\2\2C?\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2"+
		"GE\3\2\2\2HI\7\r\2\2I\7\3\2\2\2JQ\5\16\b\2KQ\5\f\7\2LQ\5\n\6\2MQ\5\32"+
		"\16\2NQ\5\26\f\2OQ\5\22\n\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN"+
		"\3\2\2\2PO\3\2\2\2Q\t\3\2\2\2RS\5\36\20\2ST\5\20\t\2TU\5$\23\2U\13\3\2"+
		"\2\2VW\5\36\20\2WX\5\20\t\2XY\5(\25\2Y\r\3\2\2\2Z[\5\36\20\2[\\\5\20\t"+
		"\2\\]\5,\27\2]\17\3\2\2\2^_\7\t\2\2_\21\3\2\2\2`a\5\36\20\2ad\5\24\13"+
		"\2be\5\"\22\2ce\5 \21\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fg\t\2\2\2g\25"+
		"\3\2\2\2hi\5\36\20\2ij\5\30\r\2jk\5&\24\2k\27\3\2\2\2lm\t\3\2\2m\31\3"+
		"\2\2\2no\5\36\20\2op\5\34\17\2pq\5*\26\2q\33\3\2\2\2rs\7\n\2\2s\35\3\2"+
		"\2\2tv\7\17\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\37\3\2\2\2yw"+
		"\3\2\2\2z{\7\22\2\2{!\3\2\2\2|}\7\20\2\2}#\3\2\2\2~\177\7\6\2\2\177\u0084"+
		"\5\"\22\2\u0080\u0081\7\7\2\2\u0081\u0083\5\"\22\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u008c\3\2\2\2\u0089"+
		"\u008a\7\6\2\2\u008a\u008c\7\b\2\2\u008b~\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008c%\3\2\2\2\u008d\u008e\7\16\2\2\u008e\'\3\2\2\2\u008f\u0090\7\6\2"+
		"\2\u0090\u0095\5&\24\2\u0091\u0092\7\7\2\2\u0092\u0094\5&\24\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009d\3\2"+
		"\2\2\u009a\u009b\7\6\2\2\u009b\u009d\7\b\2\2\u009c\u008f\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d)\3\2\2\2\u009e\u009f\7\21\2\2\u009f+\3\2\2\2\u00a0"+
		"\u00a1\7\6\2\2\u00a1\u00a6\5*\26\2\u00a2\u00a3\7\7\2\2\u00a3\u00a5\5*"+
		"\26\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\b"+
		"\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00ae\7\b\2\2\u00ad"+
		"\u00a0\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae-\3\2\2\2\17\659=EPdw\u0084\u008b"+
		"\u0095\u009c\u00a6\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}