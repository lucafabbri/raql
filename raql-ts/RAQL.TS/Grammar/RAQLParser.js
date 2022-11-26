// Generated from c:\Users\lfabbri\projects\api-query-language\raql-ts\RAQL.TS\RAQL.g4 by ANTLR 4.9.2
// jshint ignore: start
import antlr4 from 'antlr4';
import RAQLVisitor from './RAQLVisitor.js';


const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003\u0012\u00b0\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004",
    "\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t",
    "\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004",
    "\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010",
    "\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013",
    "\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017",
    "\t\u0017\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0005\u00036\n\u0003\u0003\u0003\u0003\u0003",
    "\u0005\u0003:\n\u0003\u0003\u0003\u0003\u0003\u0005\u0003>\n\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003D\n\u0003\f\u0003",
    "\u000e\u0003G\u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003",
    "\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005Q",
    "\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007",
    "\u0003\u0007\u0003\u0007\u0003\u0007\u0003\b\u0003\b\u0003\b\u0003\b",
    "\u0003\t\u0003\t\u0003\n\u0003\n\u0003\n\u0003\n\u0005\ne\n\n\u0003",
    "\u000b\u0003\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\r\u0003\r\u0003",
    "\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003",
    "\u0010\u0007\u0010v\n\u0010\f\u0010\u000e\u0010y\u000b\u0010\u0003\u0011",
    "\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013",
    "\u0003\u0013\u0007\u0013\u0083\n\u0013\f\u0013\u000e\u0013\u0086\u000b",
    "\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u008c",
    "\n\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015",
    "\u0003\u0015\u0007\u0015\u0094\n\u0015\f\u0015\u000e\u0015\u0097\u000b",
    "\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u009d",
    "\n\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017",
    "\u0003\u0017\u0007\u0017\u00a5\n\u0017\f\u0017\u000e\u0017\u00a8\u000b",
    "\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u00ae",
    "\n\u0017\u0003\u0017\u0002\u0003\u0004\u0018\u0002\u0004\u0006\b\n\f",
    "\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0002",
    "\u0004\u0003\u0002\n\u000b\u0004\u0002\n\n\f\f\u0002\u00aa\u0002.\u0003",
    "\u0002\u0002\u0002\u0004=\u0003\u0002\u0002\u0002\u0006H\u0003\u0002",
    "\u0002\u0002\bP\u0003\u0002\u0002\u0002\nR\u0003\u0002\u0002\u0002\f",
    "V\u0003\u0002\u0002\u0002\u000eZ\u0003\u0002\u0002\u0002\u0010^\u0003",
    "\u0002\u0002\u0002\u0012`\u0003\u0002\u0002\u0002\u0014f\u0003\u0002",
    "\u0002\u0002\u0016h\u0003\u0002\u0002\u0002\u0018l\u0003\u0002\u0002",
    "\u0002\u001an\u0003\u0002\u0002\u0002\u001cr\u0003\u0002\u0002\u0002",
    "\u001ew\u0003\u0002\u0002\u0002 z\u0003\u0002\u0002\u0002\"|\u0003\u0002",
    "\u0002\u0002$\u008b\u0003\u0002\u0002\u0002&\u008d\u0003\u0002\u0002",
    "\u0002(\u009c\u0003\u0002\u0002\u0002*\u009e\u0003\u0002\u0002\u0002",
    ",\u00ad\u0003\u0002\u0002\u0002./\u0005\u0004\u0003\u0002/0\u0007\u0002",
    "\u0002\u00030\u0003\u0003\u0002\u0002\u000212\b\u0003\u0001\u00022>",
    "\u0005\b\u0005\u000235\u0007\u0003\u0002\u000246\u0007\u0004\u0002\u0002",
    "54\u0003\u0002\u0002\u000256\u0003\u0002\u0002\u000267\u0003\u0002\u0002",
    "\u000279\u0005\u0004\u0003\u00028:\u0007\u0004\u0002\u000298\u0003\u0002",
    "\u0002\u00029:\u0003\u0002\u0002\u0002:;\u0003\u0002\u0002\u0002;<\u0007",
    "\u0005\u0002\u0002<>\u0003\u0002\u0002\u0002=1\u0003\u0002\u0002\u0002",
    "=3\u0003\u0002\u0002\u0002>E\u0003\u0002\u0002\u0002?@\f\u0003\u0002",
    "\u0002@A\u0005\u0006\u0004\u0002AB\u0005\u0004\u0003\u0004BD\u0003\u0002",
    "\u0002\u0002C?\u0003\u0002\u0002\u0002DG\u0003\u0002\u0002\u0002EC\u0003",
    "\u0002\u0002\u0002EF\u0003\u0002\u0002\u0002F\u0005\u0003\u0002\u0002",
    "\u0002GE\u0003\u0002\u0002\u0002HI\u0007\r\u0002\u0002I\u0007\u0003",
    "\u0002\u0002\u0002JQ\u0005\u000e\b\u0002KQ\u0005\f\u0007\u0002LQ\u0005",
    "\n\u0006\u0002MQ\u0005\u001a\u000e\u0002NQ\u0005\u0016\f\u0002OQ\u0005",
    "\u0012\n\u0002PJ\u0003\u0002\u0002\u0002PK\u0003\u0002\u0002\u0002P",
    "L\u0003\u0002\u0002\u0002PM\u0003\u0002\u0002\u0002PN\u0003\u0002\u0002",
    "\u0002PO\u0003\u0002\u0002\u0002Q\t\u0003\u0002\u0002\u0002RS\u0005",
    "\u001e\u0010\u0002ST\u0005\u0010\t\u0002TU\u0005$\u0013\u0002U\u000b",
    "\u0003\u0002\u0002\u0002VW\u0005\u001e\u0010\u0002WX\u0005\u0010\t\u0002",
    "XY\u0005(\u0015\u0002Y\r\u0003\u0002\u0002\u0002Z[\u0005\u001e\u0010",
    "\u0002[\\\u0005\u0010\t\u0002\\]\u0005,\u0017\u0002]\u000f\u0003\u0002",
    "\u0002\u0002^_\u0007\t\u0002\u0002_\u0011\u0003\u0002\u0002\u0002`a",
    "\u0005\u001e\u0010\u0002ad\u0005\u0014\u000b\u0002be\u0005\"\u0012\u0002",
    "ce\u0005 \u0011\u0002db\u0003\u0002\u0002\u0002dc\u0003\u0002\u0002",
    "\u0002e\u0013\u0003\u0002\u0002\u0002fg\t\u0002\u0002\u0002g\u0015\u0003",
    "\u0002\u0002\u0002hi\u0005\u001e\u0010\u0002ij\u0005\u0018\r\u0002j",
    "k\u0005&\u0014\u0002k\u0017\u0003\u0002\u0002\u0002lm\t\u0003\u0002",
    "\u0002m\u0019\u0003\u0002\u0002\u0002no\u0005\u001e\u0010\u0002op\u0005",
    "\u001c\u000f\u0002pq\u0005*\u0016\u0002q\u001b\u0003\u0002\u0002\u0002",
    "rs\u0007\n\u0002\u0002s\u001d\u0003\u0002\u0002\u0002tv\u0007\u000f",
    "\u0002\u0002ut\u0003\u0002\u0002\u0002vy\u0003\u0002\u0002\u0002wu\u0003",
    "\u0002\u0002\u0002wx\u0003\u0002\u0002\u0002x\u001f\u0003\u0002\u0002",
    "\u0002yw\u0003\u0002\u0002\u0002z{\u0007\u0012\u0002\u0002{!\u0003\u0002",
    "\u0002\u0002|}\u0007\u0010\u0002\u0002}#\u0003\u0002\u0002\u0002~\u007f",
    "\u0007\u0006\u0002\u0002\u007f\u0084\u0005\"\u0012\u0002\u0080\u0081",
    "\u0007\u0007\u0002\u0002\u0081\u0083\u0005\"\u0012\u0002\u0082\u0080",
    "\u0003\u0002\u0002\u0002\u0083\u0086\u0003\u0002\u0002\u0002\u0084\u0082",
    "\u0003\u0002\u0002\u0002\u0084\u0085\u0003\u0002\u0002\u0002\u0085\u0087",
    "\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002\u0002\u0087\u0088",
    "\u0007\b\u0002\u0002\u0088\u008c\u0003\u0002\u0002\u0002\u0089\u008a",
    "\u0007\u0006\u0002\u0002\u008a\u008c\u0007\b\u0002\u0002\u008b~\u0003",
    "\u0002\u0002\u0002\u008b\u0089\u0003\u0002\u0002\u0002\u008c%\u0003",
    "\u0002\u0002\u0002\u008d\u008e\u0007\u000e\u0002\u0002\u008e\'\u0003",
    "\u0002\u0002\u0002\u008f\u0090\u0007\u0006\u0002\u0002\u0090\u0095\u0005",
    "&\u0014\u0002\u0091\u0092\u0007\u0007\u0002\u0002\u0092\u0094\u0005",
    "&\u0014\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0094\u0097\u0003",
    "\u0002\u0002\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0095\u0096\u0003",
    "\u0002\u0002\u0002\u0096\u0098\u0003\u0002\u0002\u0002\u0097\u0095\u0003",
    "\u0002\u0002\u0002\u0098\u0099\u0007\b\u0002\u0002\u0099\u009d\u0003",
    "\u0002\u0002\u0002\u009a\u009b\u0007\u0006\u0002\u0002\u009b\u009d\u0007",
    "\b\u0002\u0002\u009c\u008f\u0003\u0002\u0002\u0002\u009c\u009a\u0003",
    "\u0002\u0002\u0002\u009d)\u0003\u0002\u0002\u0002\u009e\u009f\u0007",
    "\u0011\u0002\u0002\u009f+\u0003\u0002\u0002\u0002\u00a0\u00a1\u0007",
    "\u0006\u0002\u0002\u00a1\u00a6\u0005*\u0016\u0002\u00a2\u00a3\u0007",
    "\u0007\u0002\u0002\u00a3\u00a5\u0005*\u0016\u0002\u00a4\u00a2\u0003",
    "\u0002\u0002\u0002\u00a5\u00a8\u0003\u0002\u0002\u0002\u00a6\u00a4\u0003",
    "\u0002\u0002\u0002\u00a6\u00a7\u0003\u0002\u0002\u0002\u00a7\u00a9\u0003",
    "\u0002\u0002\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a9\u00aa\u0007",
    "\b\u0002\u0002\u00aa\u00ae\u0003\u0002\u0002\u0002\u00ab\u00ac\u0007",
    "\u0006\u0002\u0002\u00ac\u00ae\u0007\b\u0002\u0002\u00ad\u00a0\u0003",
    "\u0002\u0002\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ae-\u0003",
    "\u0002\u0002\u0002\u000f59=EPdw\u0084\u008b\u0095\u009c\u00a6\u00ad"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class RAQLParser extends antlr4.Parser {

    static grammarFileName = "RAQL.g4";
    static literalNames = [ null, "'('", "' '", "')'", "'['", "','", "']'", 
                            null, null, null, null, null, null, null, null, 
                            null, "'null'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, "IN", 
                             "BASE_OPERATOR", "STRING_OPERATOR", "NUMBER_OPERATOR", 
                             "CONJUNCTIONS", "NUMBER", "WORD", "STRING", 
                             "BOOLEAN", "NULL" ];
    static ruleNames = [ "raql", "clause", "conjunction", "operation", "string_array_operation", 
                         "number_array_operation", "bool_array_operation", 
                         "array_operator", "string_operation", "string_operator", 
                         "number_operation", "number_operator", "bool_operation", 
                         "bool_operator", "field", "nullstring", "string", 
                         "string_array", "number", "number_array", "bool", 
                         "bool_array" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = RAQLParser.ruleNames;
        this.literalNames = RAQLParser.literalNames;
        this.symbolicNames = RAQLParser.symbolicNames;
    }

    get atn() {
        return atn;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 1:
    	    		return this.clause_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    clause_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 1);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	raql() {
	    let localctx = new RaqlContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, RAQLParser.RULE_raql);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 44;
	        this.clause(0);
	        this.state = 45;
	        this.match(RAQLParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	clause(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ClauseContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 2;
	    this.enterRecursionRule(localctx, 2, RAQLParser.RULE_clause, _p);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 59;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case RAQLParser.IN:
	        case RAQLParser.BASE_OPERATOR:
	        case RAQLParser.STRING_OPERATOR:
	        case RAQLParser.NUMBER_OPERATOR:
	        case RAQLParser.WORD:
	            this.state = 48;
	            this.operation();
	            break;
	        case RAQLParser.T__0:
	            this.state = 49;
	            this.match(RAQLParser.T__0);
	            this.state = 51;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===RAQLParser.T__1) {
	                this.state = 50;
	                this.match(RAQLParser.T__1);
	            }

	            this.state = 53;
	            this.clause(0);
	            this.state = 55;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===RAQLParser.T__1) {
	                this.state = 54;
	                this.match(RAQLParser.T__1);
	            }

	            this.state = 57;
	            this.match(RAQLParser.T__2);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 67;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,3,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                localctx = new ClauseContext(this, _parentctx, _parentState);
	                this.pushNewRecursionContext(localctx, _startState, RAQLParser.RULE_clause);
	                this.state = 61;
	                if (!( this.precpred(this._ctx, 1))) {
	                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
	                }
	                this.state = 62;
	                this.conjunction();
	                this.state = 63;
	                this.clause(2); 
	            }
	            this.state = 69;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,3,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	conjunction() {
	    let localctx = new ConjunctionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, RAQLParser.RULE_conjunction);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 70;
	        this.match(RAQLParser.CONJUNCTIONS);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	operation() {
	    let localctx = new OperationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, RAQLParser.RULE_operation);
	    try {
	        this.state = 78;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,4,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 72;
	            this.bool_array_operation();
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 73;
	            this.number_array_operation();
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 74;
	            this.string_array_operation();
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 75;
	            this.bool_operation();
	            break;

	        case 5:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 76;
	            this.number_operation();
	            break;

	        case 6:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 77;
	            this.string_operation();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	string_array_operation() {
	    let localctx = new String_array_operationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, RAQLParser.RULE_string_array_operation);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 80;
	        this.field();
	        this.state = 81;
	        this.array_operator();
	        this.state = 82;
	        this.string_array();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	number_array_operation() {
	    let localctx = new Number_array_operationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, RAQLParser.RULE_number_array_operation);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 84;
	        this.field();
	        this.state = 85;
	        this.array_operator();
	        this.state = 86;
	        this.number_array();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	bool_array_operation() {
	    let localctx = new Bool_array_operationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, RAQLParser.RULE_bool_array_operation);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 88;
	        this.field();
	        this.state = 89;
	        this.array_operator();
	        this.state = 90;
	        this.bool_array();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	array_operator() {
	    let localctx = new Array_operatorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, RAQLParser.RULE_array_operator);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 92;
	        this.match(RAQLParser.IN);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	string_operation() {
	    let localctx = new String_operationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, RAQLParser.RULE_string_operation);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 94;
	        this.field();
	        this.state = 95;
	        this.string_operator();
	        this.state = 98;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case RAQLParser.STRING:
	            this.state = 96;
	            this.string();
	            break;
	        case RAQLParser.NULL:
	            this.state = 97;
	            this.nullstring();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	string_operator() {
	    let localctx = new String_operatorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, RAQLParser.RULE_string_operator);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 100;
	        _la = this._input.LA(1);
	        if(!(_la===RAQLParser.BASE_OPERATOR || _la===RAQLParser.STRING_OPERATOR)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	number_operation() {
	    let localctx = new Number_operationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, RAQLParser.RULE_number_operation);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 102;
	        this.field();
	        this.state = 103;
	        this.number_operator();
	        this.state = 104;
	        this.number();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	number_operator() {
	    let localctx = new Number_operatorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, RAQLParser.RULE_number_operator);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 106;
	        _la = this._input.LA(1);
	        if(!(_la===RAQLParser.BASE_OPERATOR || _la===RAQLParser.NUMBER_OPERATOR)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	bool_operation() {
	    let localctx = new Bool_operationContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, RAQLParser.RULE_bool_operation);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 108;
	        this.field();
	        this.state = 109;
	        this.bool_operator();
	        this.state = 110;
	        this.bool();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	bool_operator() {
	    let localctx = new Bool_operatorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, RAQLParser.RULE_bool_operator);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 112;
	        this.match(RAQLParser.BASE_OPERATOR);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	field() {
	    let localctx = new FieldContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 28, RAQLParser.RULE_field);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 117;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===RAQLParser.WORD) {
	            this.state = 114;
	            this.match(RAQLParser.WORD);
	            this.state = 119;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nullstring() {
	    let localctx = new NullstringContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, RAQLParser.RULE_nullstring);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 120;
	        this.match(RAQLParser.NULL);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	string() {
	    let localctx = new StringContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 32, RAQLParser.RULE_string);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 122;
	        this.match(RAQLParser.STRING);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	string_array() {
	    let localctx = new String_arrayContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, RAQLParser.RULE_string_array);
	    var _la = 0; // Token type
	    try {
	        this.state = 137;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 124;
	            this.match(RAQLParser.T__3);
	            this.state = 125;
	            this.string();
	            this.state = 130;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===RAQLParser.T__4) {
	                this.state = 126;
	                this.match(RAQLParser.T__4);
	                this.state = 127;
	                this.string();
	                this.state = 132;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 133;
	            this.match(RAQLParser.T__5);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 135;
	            this.match(RAQLParser.T__3);
	            this.state = 136;
	            this.match(RAQLParser.T__5);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	number() {
	    let localctx = new NumberContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, RAQLParser.RULE_number);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 139;
	        this.match(RAQLParser.NUMBER);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	number_array() {
	    let localctx = new Number_arrayContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, RAQLParser.RULE_number_array);
	    var _la = 0; // Token type
	    try {
	        this.state = 154;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,10,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 141;
	            this.match(RAQLParser.T__3);
	            this.state = 142;
	            this.number();
	            this.state = 147;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===RAQLParser.T__4) {
	                this.state = 143;
	                this.match(RAQLParser.T__4);
	                this.state = 144;
	                this.number();
	                this.state = 149;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 150;
	            this.match(RAQLParser.T__5);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 152;
	            this.match(RAQLParser.T__3);
	            this.state = 153;
	            this.match(RAQLParser.T__5);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	bool() {
	    let localctx = new BoolContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, RAQLParser.RULE_bool);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 156;
	        this.match(RAQLParser.BOOLEAN);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	bool_array() {
	    let localctx = new Bool_arrayContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, RAQLParser.RULE_bool_array);
	    var _la = 0; // Token type
	    try {
	        this.state = 171;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,12,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 158;
	            this.match(RAQLParser.T__3);
	            this.state = 159;
	            this.bool();
	            this.state = 164;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===RAQLParser.T__4) {
	                this.state = 160;
	                this.match(RAQLParser.T__4);
	                this.state = 161;
	                this.bool();
	                this.state = 166;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            this.state = 167;
	            this.match(RAQLParser.T__5);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 169;
	            this.match(RAQLParser.T__3);
	            this.state = 170;
	            this.match(RAQLParser.T__5);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

RAQLParser.EOF = antlr4.Token.EOF;
RAQLParser.T__0 = 1;
RAQLParser.T__1 = 2;
RAQLParser.T__2 = 3;
RAQLParser.T__3 = 4;
RAQLParser.T__4 = 5;
RAQLParser.T__5 = 6;
RAQLParser.IN = 7;
RAQLParser.BASE_OPERATOR = 8;
RAQLParser.STRING_OPERATOR = 9;
RAQLParser.NUMBER_OPERATOR = 10;
RAQLParser.CONJUNCTIONS = 11;
RAQLParser.NUMBER = 12;
RAQLParser.WORD = 13;
RAQLParser.STRING = 14;
RAQLParser.BOOLEAN = 15;
RAQLParser.NULL = 16;

RAQLParser.RULE_raql = 0;
RAQLParser.RULE_clause = 1;
RAQLParser.RULE_conjunction = 2;
RAQLParser.RULE_operation = 3;
RAQLParser.RULE_string_array_operation = 4;
RAQLParser.RULE_number_array_operation = 5;
RAQLParser.RULE_bool_array_operation = 6;
RAQLParser.RULE_array_operator = 7;
RAQLParser.RULE_string_operation = 8;
RAQLParser.RULE_string_operator = 9;
RAQLParser.RULE_number_operation = 10;
RAQLParser.RULE_number_operator = 11;
RAQLParser.RULE_bool_operation = 12;
RAQLParser.RULE_bool_operator = 13;
RAQLParser.RULE_field = 14;
RAQLParser.RULE_nullstring = 15;
RAQLParser.RULE_string = 16;
RAQLParser.RULE_string_array = 17;
RAQLParser.RULE_number = 18;
RAQLParser.RULE_number_array = 19;
RAQLParser.RULE_bool = 20;
RAQLParser.RULE_bool_array = 21;

class RaqlContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_raql;
    }

	clause() {
	    return this.getTypedRuleContext(ClauseContext,0);
	};

	EOF() {
	    return this.getToken(RAQLParser.EOF, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitRaql(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ClauseContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_clause;
    }

	operation() {
	    return this.getTypedRuleContext(OperationContext,0);
	};

	clause = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ClauseContext);
	    } else {
	        return this.getTypedRuleContext(ClauseContext,i);
	    }
	};

	conjunction() {
	    return this.getTypedRuleContext(ConjunctionContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitClause(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConjunctionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_conjunction;
    }

	CONJUNCTIONS() {
	    return this.getToken(RAQLParser.CONJUNCTIONS, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitConjunction(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class OperationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_operation;
    }

	bool_array_operation() {
	    return this.getTypedRuleContext(Bool_array_operationContext,0);
	};

	number_array_operation() {
	    return this.getTypedRuleContext(Number_array_operationContext,0);
	};

	string_array_operation() {
	    return this.getTypedRuleContext(String_array_operationContext,0);
	};

	bool_operation() {
	    return this.getTypedRuleContext(Bool_operationContext,0);
	};

	number_operation() {
	    return this.getTypedRuleContext(Number_operationContext,0);
	};

	string_operation() {
	    return this.getTypedRuleContext(String_operationContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitOperation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class String_array_operationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_string_array_operation;
    }

	field() {
	    return this.getTypedRuleContext(FieldContext,0);
	};

	array_operator() {
	    return this.getTypedRuleContext(Array_operatorContext,0);
	};

	string_array() {
	    return this.getTypedRuleContext(String_arrayContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitString_array_operation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Number_array_operationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_number_array_operation;
    }

	field() {
	    return this.getTypedRuleContext(FieldContext,0);
	};

	array_operator() {
	    return this.getTypedRuleContext(Array_operatorContext,0);
	};

	number_array() {
	    return this.getTypedRuleContext(Number_arrayContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitNumber_array_operation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Bool_array_operationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_bool_array_operation;
    }

	field() {
	    return this.getTypedRuleContext(FieldContext,0);
	};

	array_operator() {
	    return this.getTypedRuleContext(Array_operatorContext,0);
	};

	bool_array() {
	    return this.getTypedRuleContext(Bool_arrayContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitBool_array_operation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Array_operatorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_array_operator;
    }

	IN() {
	    return this.getToken(RAQLParser.IN, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitArray_operator(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class String_operationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_string_operation;
    }

	field() {
	    return this.getTypedRuleContext(FieldContext,0);
	};

	string_operator() {
	    return this.getTypedRuleContext(String_operatorContext,0);
	};

	string() {
	    return this.getTypedRuleContext(StringContext,0);
	};

	nullstring() {
	    return this.getTypedRuleContext(NullstringContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitString_operation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class String_operatorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_string_operator;
    }

	BASE_OPERATOR() {
	    return this.getToken(RAQLParser.BASE_OPERATOR, 0);
	};

	STRING_OPERATOR() {
	    return this.getToken(RAQLParser.STRING_OPERATOR, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitString_operator(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Number_operationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_number_operation;
    }

	field() {
	    return this.getTypedRuleContext(FieldContext,0);
	};

	number_operator() {
	    return this.getTypedRuleContext(Number_operatorContext,0);
	};

	number() {
	    return this.getTypedRuleContext(NumberContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitNumber_operation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Number_operatorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_number_operator;
    }

	BASE_OPERATOR() {
	    return this.getToken(RAQLParser.BASE_OPERATOR, 0);
	};

	NUMBER_OPERATOR() {
	    return this.getToken(RAQLParser.NUMBER_OPERATOR, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitNumber_operator(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Bool_operationContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_bool_operation;
    }

	field() {
	    return this.getTypedRuleContext(FieldContext,0);
	};

	bool_operator() {
	    return this.getTypedRuleContext(Bool_operatorContext,0);
	};

	bool() {
	    return this.getTypedRuleContext(BoolContext,0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitBool_operation(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Bool_operatorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_bool_operator;
    }

	BASE_OPERATOR() {
	    return this.getToken(RAQLParser.BASE_OPERATOR, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitBool_operator(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class FieldContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_field;
    }

	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RAQLParser.WORD);
	    } else {
	        return this.getToken(RAQLParser.WORD, i);
	    }
	};


	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitField(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NullstringContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_nullstring;
    }

	NULL() {
	    return this.getToken(RAQLParser.NULL, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitNullstring(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StringContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_string;
    }

	STRING() {
	    return this.getToken(RAQLParser.STRING, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitString(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class String_arrayContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_string_array;
    }

	string = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StringContext);
	    } else {
	        return this.getTypedRuleContext(StringContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitString_array(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NumberContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_number;
    }

	NUMBER() {
	    return this.getToken(RAQLParser.NUMBER, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitNumber(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Number_arrayContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_number_array;
    }

	number = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NumberContext);
	    } else {
	        return this.getTypedRuleContext(NumberContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitNumber_array(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class BoolContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_bool;
    }

	BOOLEAN() {
	    return this.getToken(RAQLParser.BOOLEAN, 0);
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitBool(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class Bool_arrayContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RAQLParser.RULE_bool_array;
    }

	bool = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(BoolContext);
	    } else {
	        return this.getTypedRuleContext(BoolContext,i);
	    }
	};

	accept(visitor) {
	    if ( visitor instanceof RAQLVisitor ) {
	        return visitor.visitBool_array(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




RAQLParser.RaqlContext = RaqlContext; 
RAQLParser.ClauseContext = ClauseContext; 
RAQLParser.ConjunctionContext = ConjunctionContext; 
RAQLParser.OperationContext = OperationContext; 
RAQLParser.String_array_operationContext = String_array_operationContext; 
RAQLParser.Number_array_operationContext = Number_array_operationContext; 
RAQLParser.Bool_array_operationContext = Bool_array_operationContext; 
RAQLParser.Array_operatorContext = Array_operatorContext; 
RAQLParser.String_operationContext = String_operationContext; 
RAQLParser.String_operatorContext = String_operatorContext; 
RAQLParser.Number_operationContext = Number_operationContext; 
RAQLParser.Number_operatorContext = Number_operatorContext; 
RAQLParser.Bool_operationContext = Bool_operationContext; 
RAQLParser.Bool_operatorContext = Bool_operatorContext; 
RAQLParser.FieldContext = FieldContext; 
RAQLParser.NullstringContext = NullstringContext; 
RAQLParser.StringContext = StringContext; 
RAQLParser.String_arrayContext = String_arrayContext; 
RAQLParser.NumberContext = NumberContext; 
RAQLParser.Number_arrayContext = Number_arrayContext; 
RAQLParser.BoolContext = BoolContext; 
RAQLParser.Bool_arrayContext = Bool_arrayContext; 
