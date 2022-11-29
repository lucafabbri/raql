<?php

/*
 * Generated from c:\Users\lfabbri\projects\api-query-language\raql-php\RAQL.PHP\RAQL.g4 by ANTLR 4.9.2
 */

namespace RAQL\PHP\Grammar {
	use Antlr\Antlr4\Runtime\Atn\ATN;
	use Antlr\Antlr4\Runtime\Atn\ATNDeserializer;
	use Antlr\Antlr4\Runtime\Atn\ParserATNSimulator;
	use Antlr\Antlr4\Runtime\Dfa\DFA;
	use Antlr\Antlr4\Runtime\Error\Exceptions\FailedPredicateException;
	use Antlr\Antlr4\Runtime\Error\Exceptions\NoViableAltException;
	use Antlr\Antlr4\Runtime\PredictionContexts\PredictionContextCache;
	use Antlr\Antlr4\Runtime\Error\Exceptions\RecognitionException;
	use Antlr\Antlr4\Runtime\RuleContext;
	use Antlr\Antlr4\Runtime\Token;
	use Antlr\Antlr4\Runtime\TokenStream;
	use Antlr\Antlr4\Runtime\Vocabulary;
	use Antlr\Antlr4\Runtime\VocabularyImpl;
	use Antlr\Antlr4\Runtime\RuntimeMetaData;
	use Antlr\Antlr4\Runtime\Parser;

	final class RAQLParser extends Parser
	{
		public const T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, 
               IN = 7, BASE_OPERATOR = 8, STRING_OPERATOR = 9, NUMBER_OPERATOR = 10, 
               CONJUNCTIONS = 11, NUMBER = 12, WORD = 13, STRING = 14, BOOLEAN = 15, 
               NULL = 16;

		public const RULE_raql = 0, RULE_clause = 1, RULE_conjunction = 2, RULE_operation = 3, 
               RULE_string_array_operation = 4, RULE_number_array_operation = 5, 
               RULE_bool_array_operation = 6, RULE_array_operator = 7, RULE_string_operation = 8, 
               RULE_string_operator = 9, RULE_number_operation = 10, RULE_number_operator = 11, 
               RULE_bool_operation = 12, RULE_bool_operator = 13, RULE_field = 14, 
               RULE_nullstring = 15, RULE_string = 16, RULE_string_array = 17, 
               RULE_number = 18, RULE_number_array = 19, RULE_bool = 20, 
               RULE_bool_array = 21;

		/**
		 * @var array<string>
		 */
		public const RULE_NAMES = [
			'raql', 'clause', 'conjunction', 'operation', 'string_array_operation', 
			'number_array_operation', 'bool_array_operation', 'array_operator', 'string_operation', 
			'string_operator', 'number_operation', 'number_operator', 'bool_operation', 
			'bool_operator', 'field', 'nullstring', 'string', 'string_array', 'number', 
			'number_array', 'bool', 'bool_array'
		];

		/**
		 * @var array<string|null>
		 */
		private const LITERAL_NAMES = [
		    null, "'('", "' '", "')'", "'['", "','", "']'", null, null, null, 
		    null, null, null, null, null, null, "'null'"
		];

		/**
		 * @var array<string>
		 */
		private const SYMBOLIC_NAMES = [
		    null, null, null, null, null, null, null, "IN", "BASE_OPERATOR", "STRING_OPERATOR", 
		    "NUMBER_OPERATOR", "CONJUNCTIONS", "NUMBER", "WORD", "STRING", "BOOLEAN", 
		    "NULL"
		];

		/**
		 * @var string
		 */
		private const SERIALIZED_ATN =
			"\u{3}\u{608B}\u{A72A}\u{8133}\u{B9ED}\u{417C}\u{3BE7}\u{7786}\u{5964}" .
		    "\u{3}\u{12}\u{B0}\u{4}\u{2}\u{9}\u{2}\u{4}\u{3}\u{9}\u{3}\u{4}\u{4}" .
		    "\u{9}\u{4}\u{4}\u{5}\u{9}\u{5}\u{4}\u{6}\u{9}\u{6}\u{4}\u{7}\u{9}" .
		    "\u{7}\u{4}\u{8}\u{9}\u{8}\u{4}\u{9}\u{9}\u{9}\u{4}\u{A}\u{9}\u{A}" .
		    "\u{4}\u{B}\u{9}\u{B}\u{4}\u{C}\u{9}\u{C}\u{4}\u{D}\u{9}\u{D}\u{4}" .
		    "\u{E}\u{9}\u{E}\u{4}\u{F}\u{9}\u{F}\u{4}\u{10}\u{9}\u{10}\u{4}\u{11}" .
		    "\u{9}\u{11}\u{4}\u{12}\u{9}\u{12}\u{4}\u{13}\u{9}\u{13}\u{4}\u{14}" .
		    "\u{9}\u{14}\u{4}\u{15}\u{9}\u{15}\u{4}\u{16}\u{9}\u{16}\u{4}\u{17}" .
		    "\u{9}\u{17}\u{3}\u{2}\u{3}\u{2}\u{3}\u{2}\u{3}\u{3}\u{3}\u{3}\u{3}" .
		    "\u{3}\u{3}\u{3}\u{5}\u{3}\u{36}\u{A}\u{3}\u{3}\u{3}\u{3}\u{3}\u{5}" .
		    "\u{3}\u{3A}\u{A}\u{3}\u{3}\u{3}\u{3}\u{3}\u{5}\u{3}\u{3E}\u{A}\u{3}" .
		    "\u{3}\u{3}\u{3}\u{3}\u{3}\u{3}\u{3}\u{3}\u{7}\u{3}\u{44}\u{A}\u{3}" .
		    "\u{C}\u{3}\u{E}\u{3}\u{47}\u{B}\u{3}\u{3}\u{4}\u{3}\u{4}\u{3}\u{5}" .
		    "\u{3}\u{5}\u{3}\u{5}\u{3}\u{5}\u{3}\u{5}\u{3}\u{5}\u{5}\u{5}\u{51}" .
		    "\u{A}\u{5}\u{3}\u{6}\u{3}\u{6}\u{3}\u{6}\u{3}\u{6}\u{3}\u{7}\u{3}" .
		    "\u{7}\u{3}\u{7}\u{3}\u{7}\u{3}\u{8}\u{3}\u{8}\u{3}\u{8}\u{3}\u{8}" .
		    "\u{3}\u{9}\u{3}\u{9}\u{3}\u{A}\u{3}\u{A}\u{3}\u{A}\u{3}\u{A}\u{5}" .
		    "\u{A}\u{65}\u{A}\u{A}\u{3}\u{B}\u{3}\u{B}\u{3}\u{C}\u{3}\u{C}\u{3}" .
		    "\u{C}\u{3}\u{C}\u{3}\u{D}\u{3}\u{D}\u{3}\u{E}\u{3}\u{E}\u{3}\u{E}" .
		    "\u{3}\u{E}\u{3}\u{F}\u{3}\u{F}\u{3}\u{10}\u{7}\u{10}\u{76}\u{A}\u{10}" .
		    "\u{C}\u{10}\u{E}\u{10}\u{79}\u{B}\u{10}\u{3}\u{11}\u{3}\u{11}\u{3}" .
		    "\u{12}\u{3}\u{12}\u{3}\u{13}\u{3}\u{13}\u{3}\u{13}\u{3}\u{13}\u{7}" .
		    "\u{13}\u{83}\u{A}\u{13}\u{C}\u{13}\u{E}\u{13}\u{86}\u{B}\u{13}\u{3}" .
		    "\u{13}\u{3}\u{13}\u{3}\u{13}\u{3}\u{13}\u{5}\u{13}\u{8C}\u{A}\u{13}" .
		    "\u{3}\u{14}\u{3}\u{14}\u{3}\u{15}\u{3}\u{15}\u{3}\u{15}\u{3}\u{15}" .
		    "\u{7}\u{15}\u{94}\u{A}\u{15}\u{C}\u{15}\u{E}\u{15}\u{97}\u{B}\u{15}" .
		    "\u{3}\u{15}\u{3}\u{15}\u{3}\u{15}\u{3}\u{15}\u{5}\u{15}\u{9D}\u{A}" .
		    "\u{15}\u{3}\u{16}\u{3}\u{16}\u{3}\u{17}\u{3}\u{17}\u{3}\u{17}\u{3}" .
		    "\u{17}\u{7}\u{17}\u{A5}\u{A}\u{17}\u{C}\u{17}\u{E}\u{17}\u{A8}\u{B}" .
		    "\u{17}\u{3}\u{17}\u{3}\u{17}\u{3}\u{17}\u{3}\u{17}\u{5}\u{17}\u{AE}" .
		    "\u{A}\u{17}\u{3}\u{17}\u{2}\u{3}\u{4}\u{18}\u{2}\u{4}\u{6}\u{8}\u{A}" .
		    "\u{C}\u{E}\u{10}\u{12}\u{14}\u{16}\u{18}\u{1A}\u{1C}\u{1E}\u{20}\u{22}" .
		    "\u{24}\u{26}\u{28}\u{2A}\u{2C}\u{2}\u{4}\u{3}\u{2}\u{A}\u{B}\u{4}" .
		    "\u{2}\u{A}\u{A}\u{C}\u{C}\u{2}\u{AA}\u{2}\u{2E}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{4}\u{3D}\u{3}\u{2}\u{2}\u{2}\u{6}\u{48}\u{3}\u{2}\u{2}\u{2}\u{8}" .
		    "\u{50}\u{3}\u{2}\u{2}\u{2}\u{A}\u{52}\u{3}\u{2}\u{2}\u{2}\u{C}\u{56}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{E}\u{5A}\u{3}\u{2}\u{2}\u{2}\u{10}\u{5E}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{12}\u{60}\u{3}\u{2}\u{2}\u{2}\u{14}\u{66}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{16}\u{68}\u{3}\u{2}\u{2}\u{2}\u{18}\u{6C}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{1A}\u{6E}\u{3}\u{2}\u{2}\u{2}\u{1C}\u{72}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{1E}\u{77}\u{3}\u{2}\u{2}\u{2}\u{20}\u{7A}\u{3}\u{2}\u{2}\u{2}\u{22}" .
		    "\u{7C}\u{3}\u{2}\u{2}\u{2}\u{24}\u{8B}\u{3}\u{2}\u{2}\u{2}\u{26}\u{8D}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{28}\u{9C}\u{3}\u{2}\u{2}\u{2}\u{2A}\u{9E}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{2C}\u{AD}\u{3}\u{2}\u{2}\u{2}\u{2E}\u{2F}\u{5}\u{4}" .
		    "\u{3}\u{2}\u{2F}\u{30}\u{7}\u{2}\u{2}\u{3}\u{30}\u{3}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{31}\u{32}\u{8}\u{3}\u{1}\u{2}\u{32}\u{3E}\u{5}\u{8}\u{5}\u{2}" .
		    "\u{33}\u{35}\u{7}\u{3}\u{2}\u{2}\u{34}\u{36}\u{7}\u{4}\u{2}\u{2}\u{35}" .
		    "\u{34}\u{3}\u{2}\u{2}\u{2}\u{35}\u{36}\u{3}\u{2}\u{2}\u{2}\u{36}\u{37}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{37}\u{39}\u{5}\u{4}\u{3}\u{2}\u{38}\u{3A}\u{7}" .
		    "\u{4}\u{2}\u{2}\u{39}\u{38}\u{3}\u{2}\u{2}\u{2}\u{39}\u{3A}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{3A}\u{3B}\u{3}\u{2}\u{2}\u{2}\u{3B}\u{3C}\u{7}\u{5}\u{2}" .
		    "\u{2}\u{3C}\u{3E}\u{3}\u{2}\u{2}\u{2}\u{3D}\u{31}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{3D}\u{33}\u{3}\u{2}\u{2}\u{2}\u{3E}\u{45}\u{3}\u{2}\u{2}\u{2}\u{3F}" .
		    "\u{40}\u{C}\u{3}\u{2}\u{2}\u{40}\u{41}\u{5}\u{6}\u{4}\u{2}\u{41}\u{42}" .
		    "\u{5}\u{4}\u{3}\u{4}\u{42}\u{44}\u{3}\u{2}\u{2}\u{2}\u{43}\u{3F}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{44}\u{47}\u{3}\u{2}\u{2}\u{2}\u{45}\u{43}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{45}\u{46}\u{3}\u{2}\u{2}\u{2}\u{46}\u{5}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{47}\u{45}\u{3}\u{2}\u{2}\u{2}\u{48}\u{49}\u{7}\u{D}\u{2}\u{2}" .
		    "\u{49}\u{7}\u{3}\u{2}\u{2}\u{2}\u{4A}\u{51}\u{5}\u{E}\u{8}\u{2}\u{4B}" .
		    "\u{51}\u{5}\u{C}\u{7}\u{2}\u{4C}\u{51}\u{5}\u{A}\u{6}\u{2}\u{4D}\u{51}" .
		    "\u{5}\u{1A}\u{E}\u{2}\u{4E}\u{51}\u{5}\u{16}\u{C}\u{2}\u{4F}\u{51}" .
		    "\u{5}\u{12}\u{A}\u{2}\u{50}\u{4A}\u{3}\u{2}\u{2}\u{2}\u{50}\u{4B}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{50}\u{4C}\u{3}\u{2}\u{2}\u{2}\u{50}\u{4D}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{50}\u{4E}\u{3}\u{2}\u{2}\u{2}\u{50}\u{4F}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{51}\u{9}\u{3}\u{2}\u{2}\u{2}\u{52}\u{53}\u{5}\u{1E}\u{10}" .
		    "\u{2}\u{53}\u{54}\u{5}\u{10}\u{9}\u{2}\u{54}\u{55}\u{5}\u{24}\u{13}" .
		    "\u{2}\u{55}\u{B}\u{3}\u{2}\u{2}\u{2}\u{56}\u{57}\u{5}\u{1E}\u{10}" .
		    "\u{2}\u{57}\u{58}\u{5}\u{10}\u{9}\u{2}\u{58}\u{59}\u{5}\u{28}\u{15}" .
		    "\u{2}\u{59}\u{D}\u{3}\u{2}\u{2}\u{2}\u{5A}\u{5B}\u{5}\u{1E}\u{10}" .
		    "\u{2}\u{5B}\u{5C}\u{5}\u{10}\u{9}\u{2}\u{5C}\u{5D}\u{5}\u{2C}\u{17}" .
		    "\u{2}\u{5D}\u{F}\u{3}\u{2}\u{2}\u{2}\u{5E}\u{5F}\u{7}\u{9}\u{2}\u{2}" .
		    "\u{5F}\u{11}\u{3}\u{2}\u{2}\u{2}\u{60}\u{61}\u{5}\u{1E}\u{10}\u{2}" .
		    "\u{61}\u{64}\u{5}\u{14}\u{B}\u{2}\u{62}\u{65}\u{5}\u{22}\u{12}\u{2}" .
		    "\u{63}\u{65}\u{5}\u{20}\u{11}\u{2}\u{64}\u{62}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{64}\u{63}\u{3}\u{2}\u{2}\u{2}\u{65}\u{13}\u{3}\u{2}\u{2}\u{2}\u{66}" .
		    "\u{67}\u{9}\u{2}\u{2}\u{2}\u{67}\u{15}\u{3}\u{2}\u{2}\u{2}\u{68}\u{69}" .
		    "\u{5}\u{1E}\u{10}\u{2}\u{69}\u{6A}\u{5}\u{18}\u{D}\u{2}\u{6A}\u{6B}" .
		    "\u{5}\u{26}\u{14}\u{2}\u{6B}\u{17}\u{3}\u{2}\u{2}\u{2}\u{6C}\u{6D}" .
		    "\u{9}\u{3}\u{2}\u{2}\u{6D}\u{19}\u{3}\u{2}\u{2}\u{2}\u{6E}\u{6F}\u{5}" .
		    "\u{1E}\u{10}\u{2}\u{6F}\u{70}\u{5}\u{1C}\u{F}\u{2}\u{70}\u{71}\u{5}" .
		    "\u{2A}\u{16}\u{2}\u{71}\u{1B}\u{3}\u{2}\u{2}\u{2}\u{72}\u{73}\u{7}" .
		    "\u{A}\u{2}\u{2}\u{73}\u{1D}\u{3}\u{2}\u{2}\u{2}\u{74}\u{76}\u{7}\u{F}" .
		    "\u{2}\u{2}\u{75}\u{74}\u{3}\u{2}\u{2}\u{2}\u{76}\u{79}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{77}\u{75}\u{3}\u{2}\u{2}\u{2}\u{77}\u{78}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{78}\u{1F}\u{3}\u{2}\u{2}\u{2}\u{79}\u{77}\u{3}\u{2}\u{2}\u{2}\u{7A}" .
		    "\u{7B}\u{7}\u{12}\u{2}\u{2}\u{7B}\u{21}\u{3}\u{2}\u{2}\u{2}\u{7C}" .
		    "\u{7D}\u{7}\u{10}\u{2}\u{2}\u{7D}\u{23}\u{3}\u{2}\u{2}\u{2}\u{7E}" .
		    "\u{7F}\u{7}\u{6}\u{2}\u{2}\u{7F}\u{84}\u{5}\u{22}\u{12}\u{2}\u{80}" .
		    "\u{81}\u{7}\u{7}\u{2}\u{2}\u{81}\u{83}\u{5}\u{22}\u{12}\u{2}\u{82}" .
		    "\u{80}\u{3}\u{2}\u{2}\u{2}\u{83}\u{86}\u{3}\u{2}\u{2}\u{2}\u{84}\u{82}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{84}\u{85}\u{3}\u{2}\u{2}\u{2}\u{85}\u{87}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{86}\u{84}\u{3}\u{2}\u{2}\u{2}\u{87}\u{88}\u{7}\u{8}" .
		    "\u{2}\u{2}\u{88}\u{8C}\u{3}\u{2}\u{2}\u{2}\u{89}\u{8A}\u{7}\u{6}\u{2}" .
		    "\u{2}\u{8A}\u{8C}\u{7}\u{8}\u{2}\u{2}\u{8B}\u{7E}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{8B}\u{89}\u{3}\u{2}\u{2}\u{2}\u{8C}\u{25}\u{3}\u{2}\u{2}\u{2}\u{8D}" .
		    "\u{8E}\u{7}\u{E}\u{2}\u{2}\u{8E}\u{27}\u{3}\u{2}\u{2}\u{2}\u{8F}\u{90}" .
		    "\u{7}\u{6}\u{2}\u{2}\u{90}\u{95}\u{5}\u{26}\u{14}\u{2}\u{91}\u{92}" .
		    "\u{7}\u{7}\u{2}\u{2}\u{92}\u{94}\u{5}\u{26}\u{14}\u{2}\u{93}\u{91}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{94}\u{97}\u{3}\u{2}\u{2}\u{2}\u{95}\u{93}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{95}\u{96}\u{3}\u{2}\u{2}\u{2}\u{96}\u{98}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{97}\u{95}\u{3}\u{2}\u{2}\u{2}\u{98}\u{99}\u{7}\u{8}\u{2}" .
		    "\u{2}\u{99}\u{9D}\u{3}\u{2}\u{2}\u{2}\u{9A}\u{9B}\u{7}\u{6}\u{2}\u{2}" .
		    "\u{9B}\u{9D}\u{7}\u{8}\u{2}\u{2}\u{9C}\u{8F}\u{3}\u{2}\u{2}\u{2}\u{9C}" .
		    "\u{9A}\u{3}\u{2}\u{2}\u{2}\u{9D}\u{29}\u{3}\u{2}\u{2}\u{2}\u{9E}\u{9F}" .
		    "\u{7}\u{11}\u{2}\u{2}\u{9F}\u{2B}\u{3}\u{2}\u{2}\u{2}\u{A0}\u{A1}" .
		    "\u{7}\u{6}\u{2}\u{2}\u{A1}\u{A6}\u{5}\u{2A}\u{16}\u{2}\u{A2}\u{A3}" .
		    "\u{7}\u{7}\u{2}\u{2}\u{A3}\u{A5}\u{5}\u{2A}\u{16}\u{2}\u{A4}\u{A2}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{A5}\u{A8}\u{3}\u{2}\u{2}\u{2}\u{A6}\u{A4}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{A6}\u{A7}\u{3}\u{2}\u{2}\u{2}\u{A7}\u{A9}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{A8}\u{A6}\u{3}\u{2}\u{2}\u{2}\u{A9}\u{AA}\u{7}\u{8}\u{2}" .
		    "\u{2}\u{AA}\u{AE}\u{3}\u{2}\u{2}\u{2}\u{AB}\u{AC}\u{7}\u{6}\u{2}\u{2}" .
		    "\u{AC}\u{AE}\u{7}\u{8}\u{2}\u{2}\u{AD}\u{A0}\u{3}\u{2}\u{2}\u{2}\u{AD}" .
		    "\u{AB}\u{3}\u{2}\u{2}\u{2}\u{AE}\u{2D}\u{3}\u{2}\u{2}\u{2}\u{F}\u{35}" .
		    "\u{39}\u{3D}\u{45}\u{50}\u{64}\u{77}\u{84}\u{8B}\u{95}\u{9C}\u{A6}" .
		    "\u{AD}";

		protected static $atn;
		protected static $decisionToDFA;
		protected static $sharedContextCache;

		public function __construct(TokenStream $input)
		{
			parent::__construct($input);

			self::initialize();

			$this->interp = new ParserATNSimulator($this, self::$atn, self::$decisionToDFA, self::$sharedContextCache);
		}

		private static function initialize() : void
		{
			if (self::$atn !== null) {
				return;
			}

			RuntimeMetaData::checkVersion('4.9.2', RuntimeMetaData::VERSION);

			$atn = (new ATNDeserializer())->deserialize(self::SERIALIZED_ATN);

			$decisionToDFA = [];
			for ($i = 0, $count = $atn->getNumberOfDecisions(); $i < $count; $i++) {
				$decisionToDFA[] = new DFA($atn->getDecisionState($i), $i);
			}

			self::$atn = $atn;
			self::$decisionToDFA = $decisionToDFA;
			self::$sharedContextCache = new PredictionContextCache();
		}

		public function getGrammarFileName() : string
		{
			return "RAQL.g4";
		}

		public function getRuleNames() : array
		{
			return self::RULE_NAMES;
		}

		public function getSerializedATN() : string
		{
			return self::SERIALIZED_ATN;
		}

		public function getATN() : ATN
		{
			return self::$atn;
		}

		public function getVocabulary() : Vocabulary
        {
            static $vocabulary;

			return $vocabulary = $vocabulary ?? new VocabularyImpl(self::LITERAL_NAMES, self::SYMBOLIC_NAMES);
        }

		/**
		 * @throws RecognitionException
		 */
		public function raql() : Context\RaqlContext
		{
		    $localContext = new Context\RaqlContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 0, self::RULE_raql);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(44);
		        $this->recursiveClause(0);
		        $this->setState(45);
		        $this->match(self::EOF);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function clause() : Context\ClauseContext
		{
			return $this->recursiveClause(0);
		}

		/**
		 * @throws RecognitionException
		 */
		private function recursiveClause(int $precedence) : Context\ClauseContext
		{
			$parentContext = $this->ctx;
			$parentState = $this->getState();
			$localContext = new Context\ClauseContext($this->ctx, $parentState);
			$previousContext = $localContext;
			$startState = 2;
			$this->enterRecursionRule($localContext, 2, self::RULE_clause, $precedence);

			try {
				$this->enterOuterAlt($localContext, 1);
				$this->setState(59);
				$this->errorHandler->sync($this);

				switch ($this->input->LA(1)) {
				    case self::IN:
				    case self::BASE_OPERATOR:
				    case self::STRING_OPERATOR:
				    case self::NUMBER_OPERATOR:
				    case self::WORD:
				    	$this->setState(48);
				    	$this->operation();
				    	break;

				    case self::T__0:
				    	$this->setState(49);
				    	$this->match(self::T__0);
				    	$this->setState(51);
				    	$this->errorHandler->sync($this);
				    	$_la = $this->input->LA(1);

				    	if ($_la === self::T__1) {
				    		$this->setState(50);
				    		$this->match(self::T__1);
				    	}
				    	$this->setState(53);
				    	$this->recursiveClause(0);
				    	$this->setState(55);
				    	$this->errorHandler->sync($this);
				    	$_la = $this->input->LA(1);

				    	if ($_la === self::T__1) {
				    		$this->setState(54);
				    		$this->match(self::T__1);
				    	}
				    	$this->setState(57);
				    	$this->match(self::T__2);
				    	break;

				default:
					throw new NoViableAltException($this);
				}
				$this->ctx->stop = $this->input->LT(-1);
				$this->setState(67);
				$this->errorHandler->sync($this);

				$alt = $this->getInterpreter()->adaptivePredict($this->input, 3, $this->ctx);

				while ($alt !== 2 && $alt !== ATN::INVALID_ALT_NUMBER) {
					if ($alt === 1) {
						if ($this->getParseListeners() !== null) {
						    $this->triggerExitRuleEvent();
						}

						$previousContext = $localContext;
						$localContext = new Context\ClauseContext($parentContext, $parentState);
						$this->pushNewRecursionContext($localContext, $startState, self::RULE_clause);
						$this->setState(61);

						if (!($this->precpred($this->ctx, 1))) {
						    throw new FailedPredicateException($this, "\\\$this->precpred(\\\$this->ctx, 1)");
						}
						$this->setState(62);
						$this->conjunction();
						$this->setState(63);
						$this->recursiveClause(2); 
					}

					$this->setState(69);
					$this->errorHandler->sync($this);

					$alt = $this->getInterpreter()->adaptivePredict($this->input, 3, $this->ctx);
				}
			} catch (RecognitionException $exception) {
				$localContext->exception = $exception;
				$this->errorHandler->reportError($this, $exception);
				$this->errorHandler->recover($this, $exception);
			} finally {
				$this->unrollRecursionContexts($parentContext);
			}

			return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function conjunction() : Context\ConjunctionContext
		{
		    $localContext = new Context\ConjunctionContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 4, self::RULE_conjunction);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(70);
		        $this->match(self::CONJUNCTIONS);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function operation() : Context\OperationContext
		{
		    $localContext = new Context\OperationContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 6, self::RULE_operation);

		    try {
		        $this->setState(78);
		        $this->errorHandler->sync($this);

		        switch ($this->getInterpreter()->adaptivePredict($this->input, 4, $this->ctx)) {
		        	case 1:
		        	    $this->enterOuterAlt($localContext, 1);
		        	    $this->setState(72);
		        	    $this->bool_array_operation();
		        	break;

		        	case 2:
		        	    $this->enterOuterAlt($localContext, 2);
		        	    $this->setState(73);
		        	    $this->number_array_operation();
		        	break;

		        	case 3:
		        	    $this->enterOuterAlt($localContext, 3);
		        	    $this->setState(74);
		        	    $this->string_array_operation();
		        	break;

		        	case 4:
		        	    $this->enterOuterAlt($localContext, 4);
		        	    $this->setState(75);
		        	    $this->bool_operation();
		        	break;

		        	case 5:
		        	    $this->enterOuterAlt($localContext, 5);
		        	    $this->setState(76);
		        	    $this->number_operation();
		        	break;

		        	case 6:
		        	    $this->enterOuterAlt($localContext, 6);
		        	    $this->setState(77);
		        	    $this->string_operation();
		        	break;
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function string_array_operation() : Context\String_array_operationContext
		{
		    $localContext = new Context\String_array_operationContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 8, self::RULE_string_array_operation);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(80);
		        $this->field();
		        $this->setState(81);
		        $this->array_operator();
		        $this->setState(82);
		        $this->string_array();
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function number_array_operation() : Context\Number_array_operationContext
		{
		    $localContext = new Context\Number_array_operationContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 10, self::RULE_number_array_operation);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(84);
		        $this->field();
		        $this->setState(85);
		        $this->array_operator();
		        $this->setState(86);
		        $this->number_array();
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function bool_array_operation() : Context\Bool_array_operationContext
		{
		    $localContext = new Context\Bool_array_operationContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 12, self::RULE_bool_array_operation);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(88);
		        $this->field();
		        $this->setState(89);
		        $this->array_operator();
		        $this->setState(90);
		        $this->bool_array();
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function array_operator() : Context\Array_operatorContext
		{
		    $localContext = new Context\Array_operatorContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 14, self::RULE_array_operator);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(92);
		        $this->match(self::IN);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function string_operation() : Context\String_operationContext
		{
		    $localContext = new Context\String_operationContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 16, self::RULE_string_operation);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(94);
		        $this->field();
		        $this->setState(95);
		        $this->string_operator();
		        $this->setState(98);
		        $this->errorHandler->sync($this);

		        switch ($this->input->LA(1)) {
		            case self::STRING:
		            	$this->setState(96);
		            	$this->string();
		            	break;

		            case self::NULL:
		            	$this->setState(97);
		            	$this->nullstring();
		            	break;

		        default:
		        	throw new NoViableAltException($this);
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function string_operator() : Context\String_operatorContext
		{
		    $localContext = new Context\String_operatorContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 18, self::RULE_string_operator);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(100);

		        $_la = $this->input->LA(1);

		        if (!($_la === self::BASE_OPERATOR || $_la === self::STRING_OPERATOR)) {
		        $this->errorHandler->recoverInline($this);
		        } else {
		        	if ($this->input->LA(1) === Token::EOF) {
		        	    $this->matchedEOF = true;
		            }

		        	$this->errorHandler->reportMatch($this);
		        	$this->consume();
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function number_operation() : Context\Number_operationContext
		{
		    $localContext = new Context\Number_operationContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 20, self::RULE_number_operation);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(102);
		        $this->field();
		        $this->setState(103);
		        $this->number_operator();
		        $this->setState(104);
		        $this->number();
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function number_operator() : Context\Number_operatorContext
		{
		    $localContext = new Context\Number_operatorContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 22, self::RULE_number_operator);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(106);

		        $_la = $this->input->LA(1);

		        if (!($_la === self::BASE_OPERATOR || $_la === self::NUMBER_OPERATOR)) {
		        $this->errorHandler->recoverInline($this);
		        } else {
		        	if ($this->input->LA(1) === Token::EOF) {
		        	    $this->matchedEOF = true;
		            }

		        	$this->errorHandler->reportMatch($this);
		        	$this->consume();
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function bool_operation() : Context\Bool_operationContext
		{
		    $localContext = new Context\Bool_operationContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 24, self::RULE_bool_operation);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(108);
		        $this->field();
		        $this->setState(109);
		        $this->bool_operator();
		        $this->setState(110);
		        $this->bool();
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function bool_operator() : Context\Bool_operatorContext
		{
		    $localContext = new Context\Bool_operatorContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 26, self::RULE_bool_operator);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(112);
		        $this->match(self::BASE_OPERATOR);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function field() : Context\FieldContext
		{
		    $localContext = new Context\FieldContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 28, self::RULE_field);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(117);
		        $this->errorHandler->sync($this);

		        $_la = $this->input->LA(1);
		        while ($_la === self::WORD) {
		        	$this->setState(114);
		        	$this->match(self::WORD);
		        	$this->setState(119);
		        	$this->errorHandler->sync($this);
		        	$_la = $this->input->LA(1);
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function nullstring() : Context\NullstringContext
		{
		    $localContext = new Context\NullstringContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 30, self::RULE_nullstring);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(120);
		        $this->match(self::NULL);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function string() : Context\StringContext
		{
		    $localContext = new Context\StringContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 32, self::RULE_string);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(122);
		        $this->match(self::STRING);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function string_array() : Context\String_arrayContext
		{
		    $localContext = new Context\String_arrayContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 34, self::RULE_string_array);

		    try {
		        $this->setState(137);
		        $this->errorHandler->sync($this);

		        switch ($this->getInterpreter()->adaptivePredict($this->input, 8, $this->ctx)) {
		        	case 1:
		        	    $this->enterOuterAlt($localContext, 1);
		        	    $this->setState(124);
		        	    $this->match(self::T__3);
		        	    $this->setState(125);
		        	    $this->string();
		        	    $this->setState(130);
		        	    $this->errorHandler->sync($this);

		        	    $_la = $this->input->LA(1);
		        	    while ($_la === self::T__4) {
		        	    	$this->setState(126);
		        	    	$this->match(self::T__4);
		        	    	$this->setState(127);
		        	    	$this->string();
		        	    	$this->setState(132);
		        	    	$this->errorHandler->sync($this);
		        	    	$_la = $this->input->LA(1);
		        	    }
		        	    $this->setState(133);
		        	    $this->match(self::T__5);
		        	break;

		        	case 2:
		        	    $this->enterOuterAlt($localContext, 2);
		        	    $this->setState(135);
		        	    $this->match(self::T__3);
		        	    $this->setState(136);
		        	    $this->match(self::T__5);
		        	break;
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function number() : Context\NumberContext
		{
		    $localContext = new Context\NumberContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 36, self::RULE_number);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(139);
		        $this->match(self::NUMBER);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function number_array() : Context\Number_arrayContext
		{
		    $localContext = new Context\Number_arrayContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 38, self::RULE_number_array);

		    try {
		        $this->setState(154);
		        $this->errorHandler->sync($this);

		        switch ($this->getInterpreter()->adaptivePredict($this->input, 10, $this->ctx)) {
		        	case 1:
		        	    $this->enterOuterAlt($localContext, 1);
		        	    $this->setState(141);
		        	    $this->match(self::T__3);
		        	    $this->setState(142);
		        	    $this->number();
		        	    $this->setState(147);
		        	    $this->errorHandler->sync($this);

		        	    $_la = $this->input->LA(1);
		        	    while ($_la === self::T__4) {
		        	    	$this->setState(143);
		        	    	$this->match(self::T__4);
		        	    	$this->setState(144);
		        	    	$this->number();
		        	    	$this->setState(149);
		        	    	$this->errorHandler->sync($this);
		        	    	$_la = $this->input->LA(1);
		        	    }
		        	    $this->setState(150);
		        	    $this->match(self::T__5);
		        	break;

		        	case 2:
		        	    $this->enterOuterAlt($localContext, 2);
		        	    $this->setState(152);
		        	    $this->match(self::T__3);
		        	    $this->setState(153);
		        	    $this->match(self::T__5);
		        	break;
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function bool() : Context\BoolContext
		{
		    $localContext = new Context\BoolContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 40, self::RULE_bool);

		    try {
		        $this->enterOuterAlt($localContext, 1);
		        $this->setState(156);
		        $this->match(self::BOOLEAN);
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		/**
		 * @throws RecognitionException
		 */
		public function bool_array() : Context\Bool_arrayContext
		{
		    $localContext = new Context\Bool_arrayContext($this->ctx, $this->getState());

		    $this->enterRule($localContext, 42, self::RULE_bool_array);

		    try {
		        $this->setState(171);
		        $this->errorHandler->sync($this);

		        switch ($this->getInterpreter()->adaptivePredict($this->input, 12, $this->ctx)) {
		        	case 1:
		        	    $this->enterOuterAlt($localContext, 1);
		        	    $this->setState(158);
		        	    $this->match(self::T__3);
		        	    $this->setState(159);
		        	    $this->bool();
		        	    $this->setState(164);
		        	    $this->errorHandler->sync($this);

		        	    $_la = $this->input->LA(1);
		        	    while ($_la === self::T__4) {
		        	    	$this->setState(160);
		        	    	$this->match(self::T__4);
		        	    	$this->setState(161);
		        	    	$this->bool();
		        	    	$this->setState(166);
		        	    	$this->errorHandler->sync($this);
		        	    	$_la = $this->input->LA(1);
		        	    }
		        	    $this->setState(167);
		        	    $this->match(self::T__5);
		        	break;

		        	case 2:
		        	    $this->enterOuterAlt($localContext, 2);
		        	    $this->setState(169);
		        	    $this->match(self::T__3);
		        	    $this->setState(170);
		        	    $this->match(self::T__5);
		        	break;
		        }
		    } catch (RecognitionException $exception) {
		        $localContext->exception = $exception;
		        $this->errorHandler->reportError($this, $exception);
		        $this->errorHandler->recover($this, $exception);
		    } finally {
		        $this->exitRule();
		    }

		    return $localContext;
		}

		public function sempred(?RuleContext $localContext, int $ruleIndex, int $predicateIndex) : bool
		{
			switch ($ruleIndex) {
					case 1:
						return $this->sempredClause($localContext, $predicateIndex);

				default:
					return true;
				}
		}

		private function sempredClause(?Context\ClauseContext $localContext, int $predicateIndex) : bool
		{
			switch ($predicateIndex) {
			    case 0:
			        return $this->precpred($this->ctx, 1);
			}

			return true;
		}
	}
}

namespace RAQL\PHP\Grammar\Context {
	use Antlr\Antlr4\Runtime\ParserRuleContext;
	use Antlr\Antlr4\Runtime\Token;
	use Antlr\Antlr4\Runtime\Tree\ParseTreeVisitor;
	use Antlr\Antlr4\Runtime\Tree\TerminalNode;
	use Antlr\Antlr4\Runtime\Tree\ParseTreeListener;
	use RAQL\PHP\Grammar\RAQLParser;
	use RAQL\PHP\Grammar\RAQLVisitor;

	class RaqlContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_raql;
	    }

	    public function clause() : ?ClauseContext
	    {
	    	return $this->getTypedRuleContext(ClauseContext::class, 0);
	    }

	    public function EOF() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::EOF, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitRaql($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class ClauseContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_clause;
	    }

	    public function operation() : ?OperationContext
	    {
	    	return $this->getTypedRuleContext(OperationContext::class, 0);
	    }

	    /**
	     * @return array<ClauseContext>|ClauseContext|null
	     */
	    public function clause(?int $index = null)
	    {
	    	if ($index === null) {
	    		return $this->getTypedRuleContexts(ClauseContext::class);
	    	}

	        return $this->getTypedRuleContext(ClauseContext::class, $index);
	    }

	    public function conjunction() : ?ConjunctionContext
	    {
	    	return $this->getTypedRuleContext(ConjunctionContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitClause($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class ConjunctionContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_conjunction;
	    }

	    public function CONJUNCTIONS() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::CONJUNCTIONS, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitConjunction($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class OperationContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_operation;
	    }

	    public function bool_array_operation() : ?Bool_array_operationContext
	    {
	    	return $this->getTypedRuleContext(Bool_array_operationContext::class, 0);
	    }

	    public function number_array_operation() : ?Number_array_operationContext
	    {
	    	return $this->getTypedRuleContext(Number_array_operationContext::class, 0);
	    }

	    public function string_array_operation() : ?String_array_operationContext
	    {
	    	return $this->getTypedRuleContext(String_array_operationContext::class, 0);
	    }

	    public function bool_operation() : ?Bool_operationContext
	    {
	    	return $this->getTypedRuleContext(Bool_operationContext::class, 0);
	    }

	    public function number_operation() : ?Number_operationContext
	    {
	    	return $this->getTypedRuleContext(Number_operationContext::class, 0);
	    }

	    public function string_operation() : ?String_operationContext
	    {
	    	return $this->getTypedRuleContext(String_operationContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitOperation($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class String_array_operationContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_string_array_operation;
	    }

	    public function field() : ?FieldContext
	    {
	    	return $this->getTypedRuleContext(FieldContext::class, 0);
	    }

	    public function array_operator() : ?Array_operatorContext
	    {
	    	return $this->getTypedRuleContext(Array_operatorContext::class, 0);
	    }

	    public function string_array() : ?String_arrayContext
	    {
	    	return $this->getTypedRuleContext(String_arrayContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitString_array_operation($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Number_array_operationContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_number_array_operation;
	    }

	    public function field() : ?FieldContext
	    {
	    	return $this->getTypedRuleContext(FieldContext::class, 0);
	    }

	    public function array_operator() : ?Array_operatorContext
	    {
	    	return $this->getTypedRuleContext(Array_operatorContext::class, 0);
	    }

	    public function number_array() : ?Number_arrayContext
	    {
	    	return $this->getTypedRuleContext(Number_arrayContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitNumber_array_operation($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Bool_array_operationContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_bool_array_operation;
	    }

	    public function field() : ?FieldContext
	    {
	    	return $this->getTypedRuleContext(FieldContext::class, 0);
	    }

	    public function array_operator() : ?Array_operatorContext
	    {
	    	return $this->getTypedRuleContext(Array_operatorContext::class, 0);
	    }

	    public function bool_array() : ?Bool_arrayContext
	    {
	    	return $this->getTypedRuleContext(Bool_arrayContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitBool_array_operation($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Array_operatorContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_array_operator;
	    }

	    public function IN() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::IN, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitArray_operator($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class String_operationContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_string_operation;
	    }

	    public function field() : ?FieldContext
	    {
	    	return $this->getTypedRuleContext(FieldContext::class, 0);
	    }

	    public function string_operator() : ?String_operatorContext
	    {
	    	return $this->getTypedRuleContext(String_operatorContext::class, 0);
	    }

	    public function string() : ?StringContext
	    {
	    	return $this->getTypedRuleContext(StringContext::class, 0);
	    }

	    public function nullstring() : ?NullstringContext
	    {
	    	return $this->getTypedRuleContext(NullstringContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitString_operation($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class String_operatorContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_string_operator;
	    }

	    public function BASE_OPERATOR() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::BASE_OPERATOR, 0);
	    }

	    public function STRING_OPERATOR() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::STRING_OPERATOR, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitString_operator($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Number_operationContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_number_operation;
	    }

	    public function field() : ?FieldContext
	    {
	    	return $this->getTypedRuleContext(FieldContext::class, 0);
	    }

	    public function number_operator() : ?Number_operatorContext
	    {
	    	return $this->getTypedRuleContext(Number_operatorContext::class, 0);
	    }

	    public function number() : ?NumberContext
	    {
	    	return $this->getTypedRuleContext(NumberContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitNumber_operation($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Number_operatorContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_number_operator;
	    }

	    public function BASE_OPERATOR() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::BASE_OPERATOR, 0);
	    }

	    public function NUMBER_OPERATOR() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::NUMBER_OPERATOR, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitNumber_operator($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Bool_operationContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_bool_operation;
	    }

	    public function field() : ?FieldContext
	    {
	    	return $this->getTypedRuleContext(FieldContext::class, 0);
	    }

	    public function bool_operator() : ?Bool_operatorContext
	    {
	    	return $this->getTypedRuleContext(Bool_operatorContext::class, 0);
	    }

	    public function bool() : ?BoolContext
	    {
	    	return $this->getTypedRuleContext(BoolContext::class, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitBool_operation($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Bool_operatorContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_bool_operator;
	    }

	    public function BASE_OPERATOR() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::BASE_OPERATOR, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitBool_operator($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class FieldContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_field;
	    }

	    /**
	     * @return array<TerminalNode>|TerminalNode|null
	     */
	    public function WORD(?int $index = null)
	    {
	    	if ($index === null) {
	    		return $this->getTokens(RAQLParser::WORD);
	    	}

	        return $this->getToken(RAQLParser::WORD, $index);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitField($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class NullstringContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_nullstring;
	    }

	    public function NULL() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::NULL, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitNullstring($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class StringContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_string;
	    }

	    public function STRING() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::STRING, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitString($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class String_arrayContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_string_array;
	    }

	    /**
	     * @return array<StringContext>|StringContext|null
	     */
	    public function string(?int $index = null)
	    {
	    	if ($index === null) {
	    		return $this->getTypedRuleContexts(StringContext::class);
	    	}

	        return $this->getTypedRuleContext(StringContext::class, $index);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitString_array($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class NumberContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_number;
	    }

	    public function NUMBER() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::NUMBER, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitNumber($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Number_arrayContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_number_array;
	    }

	    /**
	     * @return array<NumberContext>|NumberContext|null
	     */
	    public function number(?int $index = null)
	    {
	    	if ($index === null) {
	    		return $this->getTypedRuleContexts(NumberContext::class);
	    	}

	        return $this->getTypedRuleContext(NumberContext::class, $index);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitNumber_array($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class BoolContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_bool;
	    }

	    public function BOOLEAN() : ?TerminalNode
	    {
	        return $this->getToken(RAQLParser::BOOLEAN, 0);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitBool($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 

	class Bool_arrayContext extends ParserRuleContext
	{
		public function __construct(?ParserRuleContext $parent, ?int $invokingState = null)
		{
			parent::__construct($parent, $invokingState);
		}

		public function getRuleIndex() : int
		{
		    return RAQLParser::RULE_bool_array;
	    }

	    /**
	     * @return array<BoolContext>|BoolContext|null
	     */
	    public function bool(?int $index = null)
	    {
	    	if ($index === null) {
	    		return $this->getTypedRuleContexts(BoolContext::class);
	    	}

	        return $this->getTypedRuleContext(BoolContext::class, $index);
	    }

		public function accept(ParseTreeVisitor $visitor)
		{
			if ($visitor instanceof RAQLVisitor) {
			    return $visitor->visitBool_array($this);
		    }

			return $visitor->visitChildren($this);
		}
	} 
}