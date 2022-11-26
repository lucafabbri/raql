<?php

/*
 * Generated from c:\Users\lfabbri\projects\api-query-language\raql-php\RAQL.g4 by ANTLR 4.9.2
 */

namespace RAQL\PHP {
	use Antlr\Antlr4\Runtime\Atn\ATNDeserializer;
	use Antlr\Antlr4\Runtime\Atn\LexerATNSimulator;
	use Antlr\Antlr4\Runtime\Lexer;
	use Antlr\Antlr4\Runtime\CharStream;
	use Antlr\Antlr4\Runtime\PredictionContexts\PredictionContextCache;
	use Antlr\Antlr4\Runtime\RuleContext;
	use Antlr\Antlr4\Runtime\Atn\ATN;
	use Antlr\Antlr4\Runtime\Dfa\DFA;
	use Antlr\Antlr4\Runtime\Vocabulary;
	use Antlr\Antlr4\Runtime\RuntimeMetaData;
	use Antlr\Antlr4\Runtime\VocabularyImpl;

	final class RAQLLexer extends Lexer
	{
		public const T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, 
               IN = 7, BASE_OPERATOR = 8, STRING_OPERATOR = 9, NUMBER_OPERATOR = 10, 
               CONJUNCTIONS = 11, NUMBER = 12, WORD = 13, STRING = 14, BOOLEAN = 15, 
               NULL = 16;

		/**
		 * @var array<string>
		 */
		public const CHANNEL_NAMES = [
			'DEFAULT_TOKEN_CHANNEL', 'HIDDEN'
		];

		/**
		 * @var array<string>
		 */
		public const MODE_NAMES = [
			'DEFAULT_MODE'
		];

		/**
		 * @var array<string>
		 */
		public const RULE_NAMES = [
			'T__0', 'T__1', 'T__2', 'T__3', 'T__4', 'T__5', 'WS', 'N', 'O', 'T', 
			'E', 'Q', 'U', 'A', 'L', 'S', 'I', 'K', 'G', 'R', 'H', 'W', 'D', 'ESC', 
			'UNICODE', 'HEX', 'INT', 'EXP', 'AND', 'OR', 'SAFECODEPOINT', 'NOT', 
			'EQUALS_SYMBOLS', 'EQUALS', 'NOT_EQUALS_SYMBOLS', 'NOT_EQUALS', 'MAJOR_SYMBOLS', 
			'MAJOR', 'MINOR_SYMBOLS', 'MINOR', 'MAJOR_EQUALS', 'MAJOR_EQUALS_SYMBOLS', 
			'MINOR_EQUALS', 'MINOR_EQUALS_SYMBOLS', 'LIKE', 'IN', 'BASE_OPERATOR', 
			'STRING_OPERATOR', 'NUMBER_OPERATOR', 'CONJUNCTIONS', 'NUMBER', 'WORD', 
			'STRING', 'BOOLEAN', 'NULL'
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
		    "\u{2}\u{12}\u{189}\u{8}\u{1}\u{4}\u{2}\u{9}\u{2}\u{4}\u{3}\u{9}\u{3}" .
		    "\u{4}\u{4}\u{9}\u{4}\u{4}\u{5}\u{9}\u{5}\u{4}\u{6}\u{9}\u{6}\u{4}" .
		    "\u{7}\u{9}\u{7}\u{4}\u{8}\u{9}\u{8}\u{4}\u{9}\u{9}\u{9}\u{4}\u{A}" .
		    "\u{9}\u{A}\u{4}\u{B}\u{9}\u{B}\u{4}\u{C}\u{9}\u{C}\u{4}\u{D}\u{9}" .
		    "\u{D}\u{4}\u{E}\u{9}\u{E}\u{4}\u{F}\u{9}\u{F}\u{4}\u{10}\u{9}\u{10}" .
		    "\u{4}\u{11}\u{9}\u{11}\u{4}\u{12}\u{9}\u{12}\u{4}\u{13}\u{9}\u{13}" .
		    "\u{4}\u{14}\u{9}\u{14}\u{4}\u{15}\u{9}\u{15}\u{4}\u{16}\u{9}\u{16}" .
		    "\u{4}\u{17}\u{9}\u{17}\u{4}\u{18}\u{9}\u{18}\u{4}\u{19}\u{9}\u{19}" .
		    "\u{4}\u{1A}\u{9}\u{1A}\u{4}\u{1B}\u{9}\u{1B}\u{4}\u{1C}\u{9}\u{1C}" .
		    "\u{4}\u{1D}\u{9}\u{1D}\u{4}\u{1E}\u{9}\u{1E}\u{4}\u{1F}\u{9}\u{1F}" .
		    "\u{4}\u{20}\u{9}\u{20}\u{4}\u{21}\u{9}\u{21}\u{4}\u{22}\u{9}\u{22}" .
		    "\u{4}\u{23}\u{9}\u{23}\u{4}\u{24}\u{9}\u{24}\u{4}\u{25}\u{9}\u{25}" .
		    "\u{4}\u{26}\u{9}\u{26}\u{4}\u{27}\u{9}\u{27}\u{4}\u{28}\u{9}\u{28}" .
		    "\u{4}\u{29}\u{9}\u{29}\u{4}\u{2A}\u{9}\u{2A}\u{4}\u{2B}\u{9}\u{2B}" .
		    "\u{4}\u{2C}\u{9}\u{2C}\u{4}\u{2D}\u{9}\u{2D}\u{4}\u{2E}\u{9}\u{2E}" .
		    "\u{4}\u{2F}\u{9}\u{2F}\u{4}\u{30}\u{9}\u{30}\u{4}\u{31}\u{9}\u{31}" .
		    "\u{4}\u{32}\u{9}\u{32}\u{4}\u{33}\u{9}\u{33}\u{4}\u{34}\u{9}\u{34}" .
		    "\u{4}\u{35}\u{9}\u{35}\u{4}\u{36}\u{9}\u{36}\u{4}\u{37}\u{9}\u{37}" .
		    "\u{4}\u{38}\u{9}\u{38}\u{3}\u{2}\u{3}\u{2}\u{3}\u{3}\u{3}\u{3}\u{3}" .
		    "\u{4}\u{3}\u{4}\u{3}\u{5}\u{3}\u{5}\u{3}\u{6}\u{3}\u{6}\u{3}\u{7}" .
		    "\u{3}\u{7}\u{3}\u{8}\u{3}\u{8}\u{3}\u{9}\u{3}\u{9}\u{3}\u{A}\u{3}" .
		    "\u{A}\u{3}\u{B}\u{3}\u{B}\u{3}\u{C}\u{3}\u{C}\u{3}\u{D}\u{3}\u{D}" .
		    "\u{3}\u{E}\u{3}\u{E}\u{3}\u{F}\u{3}\u{F}\u{3}\u{10}\u{3}\u{10}\u{3}" .
		    "\u{11}\u{3}\u{11}\u{3}\u{12}\u{3}\u{12}\u{3}\u{13}\u{3}\u{13}\u{3}" .
		    "\u{14}\u{3}\u{14}\u{3}\u{15}\u{3}\u{15}\u{3}\u{16}\u{3}\u{16}\u{3}" .
		    "\u{17}\u{3}\u{17}\u{3}\u{18}\u{3}\u{18}\u{3}\u{19}\u{3}\u{19}\u{3}" .
		    "\u{19}\u{5}\u{19}\u{A3}\u{A}\u{19}\u{3}\u{1A}\u{3}\u{1A}\u{3}\u{1A}" .
		    "\u{3}\u{1A}\u{3}\u{1A}\u{3}\u{1A}\u{3}\u{1B}\u{3}\u{1B}\u{3}\u{1C}" .
		    "\u{3}\u{1C}\u{3}\u{1C}\u{7}\u{1C}\u{B0}\u{A}\u{1C}\u{C}\u{1C}\u{E}" .
		    "\u{1C}\u{B3}\u{B}\u{1C}\u{5}\u{1C}\u{B5}\u{A}\u{1C}\u{3}\u{1D}\u{3}" .
		    "\u{1D}\u{5}\u{1D}\u{B9}\u{A}\u{1D}\u{3}\u{1D}\u{3}\u{1D}\u{3}\u{1E}" .
		    "\u{3}\u{1E}\u{3}\u{1E}\u{3}\u{1E}\u{3}\u{1E}\u{3}\u{1E}\u{3}\u{1F}" .
		    "\u{3}\u{1F}\u{3}\u{1F}\u{3}\u{1F}\u{3}\u{1F}\u{3}\u{20}\u{3}\u{20}" .
		    "\u{3}\u{21}\u{3}\u{21}\u{3}\u{21}\u{3}\u{21}\u{3}\u{21}\u{5}\u{21}" .
		    "\u{CF}\u{A}\u{21}\u{3}\u{22}\u{3}\u{22}\u{3}\u{22}\u{3}\u{22}\u{3}" .
		    "\u{22}\u{3}\u{22}\u{3}\u{22}\u{3}\u{22}\u{5}\u{22}\u{D9}\u{A}\u{22}" .
		    "\u{3}\u{23}\u{5}\u{23}\u{DC}\u{A}\u{23}\u{3}\u{23}\u{3}\u{23}\u{5}" .
		    "\u{23}\u{E0}\u{A}\u{23}\u{3}\u{24}\u{3}\u{24}\u{3}\u{24}\u{3}\u{24}" .
		    "\u{3}\u{24}\u{3}\u{24}\u{3}\u{24}\u{3}\u{24}\u{3}\u{24}\u{3}\u{24}" .
		    "\u{3}\u{24}\u{3}\u{24}\u{3}\u{24}\u{5}\u{24}\u{EF}\u{A}\u{24}\u{3}" .
		    "\u{25}\u{5}\u{25}\u{F2}\u{A}\u{25}\u{3}\u{25}\u{3}\u{25}\u{5}\u{25}" .
		    "\u{F6}\u{A}\u{25}\u{3}\u{26}\u{3}\u{26}\u{3}\u{26}\u{3}\u{26}\u{3}" .
		    "\u{26}\u{3}\u{26}\u{3}\u{26}\u{3}\u{26}\u{3}\u{26}\u{3}\u{26}\u{3}" .
		    "\u{26}\u{3}\u{26}\u{3}\u{26}\u{3}\u{26}\u{5}\u{26}\u{106}\u{A}\u{26}" .
		    "\u{3}\u{27}\u{5}\u{27}\u{109}\u{A}\u{27}\u{3}\u{27}\u{3}\u{27}\u{5}" .
		    "\u{27}\u{10D}\u{A}\u{27}\u{3}\u{28}\u{3}\u{28}\u{3}\u{28}\u{3}\u{28}" .
		    "\u{3}\u{28}\u{3}\u{28}\u{3}\u{28}\u{3}\u{28}\u{3}\u{28}\u{3}\u{28}" .
		    "\u{3}\u{28}\u{3}\u{28}\u{5}\u{28}\u{11B}\u{A}\u{28}\u{3}\u{29}\u{5}" .
		    "\u{29}\u{11E}\u{A}\u{29}\u{3}\u{29}\u{3}\u{29}\u{5}\u{29}\u{122}\u{A}" .
		    "\u{29}\u{3}\u{2A}\u{5}\u{2A}\u{125}\u{A}\u{2A}\u{3}\u{2A}\u{3}\u{2A}" .
		    "\u{5}\u{2A}\u{129}\u{A}\u{2A}\u{3}\u{2B}\u{3}\u{2B}\u{3}\u{2B}\u{3}" .
		    "\u{2C}\u{5}\u{2C}\u{12F}\u{A}\u{2C}\u{3}\u{2C}\u{3}\u{2C}\u{5}\u{2C}" .
		    "\u{133}\u{A}\u{2C}\u{3}\u{2D}\u{3}\u{2D}\u{3}\u{2D}\u{3}\u{2E}\u{3}" .
		    "\u{2E}\u{3}\u{2E}\u{3}\u{2E}\u{3}\u{2E}\u{3}\u{2E}\u{3}\u{2E}\u{3}" .
		    "\u{2F}\u{3}\u{2F}\u{3}\u{2F}\u{3}\u{2F}\u{3}\u{2F}\u{3}\u{30}\u{3}" .
		    "\u{30}\u{5}\u{30}\u{146}\u{A}\u{30}\u{3}\u{31}\u{3}\u{31}\u{3}\u{32}" .
		    "\u{3}\u{32}\u{3}\u{32}\u{3}\u{32}\u{5}\u{32}\u{14E}\u{A}\u{32}\u{3}" .
		    "\u{33}\u{3}\u{33}\u{5}\u{33}\u{152}\u{A}\u{33}\u{3}\u{34}\u{5}\u{34}" .
		    "\u{155}\u{A}\u{34}\u{3}\u{34}\u{3}\u{34}\u{3}\u{34}\u{6}\u{34}\u{15A}" .
		    "\u{A}\u{34}\u{D}\u{34}\u{E}\u{34}\u{15B}\u{3}\u{34}\u{5}\u{34}\u{15F}" .
		    "\u{A}\u{34}\u{3}\u{34}\u{5}\u{34}\u{162}\u{A}\u{34}\u{3}\u{34}\u{3}" .
		    "\u{34}\u{3}\u{34}\u{3}\u{34}\u{5}\u{34}\u{168}\u{A}\u{34}\u{3}\u{34}" .
		    "\u{5}\u{34}\u{16B}\u{A}\u{34}\u{3}\u{35}\u{3}\u{35}\u{5}\u{35}\u{16F}" .
		    "\u{A}\u{35}\u{3}\u{36}\u{3}\u{36}\u{7}\u{36}\u{173}\u{A}\u{36}\u{C}" .
		    "\u{36}\u{E}\u{36}\u{176}\u{B}\u{36}\u{3}\u{36}\u{3}\u{36}\u{3}\u{37}" .
		    "\u{3}\u{37}\u{3}\u{37}\u{3}\u{37}\u{3}\u{37}\u{3}\u{37}\u{3}\u{37}" .
		    "\u{3}\u{37}\u{3}\u{37}\u{5}\u{37}\u{183}\u{A}\u{37}\u{3}\u{38}\u{3}" .
		    "\u{38}\u{3}\u{38}\u{3}\u{38}\u{3}\u{38}\u{2}\u{2}\u{39}\u{3}\u{3}" .
		    "\u{5}\u{4}\u{7}\u{5}\u{9}\u{6}\u{B}\u{7}\u{D}\u{8}\u{F}\u{2}\u{11}" .
		    "\u{2}\u{13}\u{2}\u{15}\u{2}\u{17}\u{2}\u{19}\u{2}\u{1B}\u{2}\u{1D}" .
		    "\u{2}\u{1F}\u{2}\u{21}\u{2}\u{23}\u{2}\u{25}\u{2}\u{27}\u{2}\u{29}" .
		    "\u{2}\u{2B}\u{2}\u{2D}\u{2}\u{2F}\u{2}\u{31}\u{2}\u{33}\u{2}\u{35}" .
		    "\u{2}\u{37}\u{2}\u{39}\u{2}\u{3B}\u{2}\u{3D}\u{2}\u{3F}\u{2}\u{41}" .
		    "\u{2}\u{43}\u{2}\u{45}\u{2}\u{47}\u{2}\u{49}\u{2}\u{4B}\u{2}\u{4D}" .
		    "\u{2}\u{4F}\u{2}\u{51}\u{2}\u{53}\u{2}\u{55}\u{2}\u{57}\u{2}\u{59}" .
		    "\u{2}\u{5B}\u{2}\u{5D}\u{9}\u{5F}\u{A}\u{61}\u{B}\u{63}\u{C}\u{65}" .
		    "\u{D}\u{67}\u{E}\u{69}\u{F}\u{6B}\u{10}\u{6D}\u{11}\u{6F}\u{12}\u{3}" .
		    "\u{2}\u{19}\u{5}\u{2}\u{B}\u{C}\u{F}\u{F}\u{22}\u{22}\u{4}\u{2}\u{50}" .
		    "\u{50}\u{70}\u{70}\u{4}\u{2}\u{51}\u{51}\u{71}\u{71}\u{4}\u{2}\u{56}" .
		    "\u{56}\u{76}\u{76}\u{4}\u{2}\u{47}\u{47}\u{67}\u{67}\u{4}\u{2}\u{53}" .
		    "\u{53}\u{73}\u{73}\u{4}\u{2}\u{57}\u{57}\u{77}\u{77}\u{4}\u{2}\u{43}" .
		    "\u{43}\u{63}\u{63}\u{4}\u{2}\u{4E}\u{4E}\u{6E}\u{6E}\u{4}\u{2}\u{55}" .
		    "\u{55}\u{75}\u{75}\u{4}\u{2}\u{4B}\u{4B}\u{6B}\u{6B}\u{4}\u{2}\u{4D}" .
		    "\u{4D}\u{6D}\u{6D}\u{4}\u{2}\u{49}\u{49}\u{69}\u{69}\u{4}\u{2}\u{54}" .
		    "\u{54}\u{74}\u{74}\u{4}\u{2}\u{4A}\u{4A}\u{6A}\u{6A}\u{4}\u{2}\u{59}" .
		    "\u{59}\u{6A}\u{6A}\u{4}\u{2}\u{46}\u{46}\u{66}\u{66}\u{A}\u{2}\u{29}" .
		    "\u{29}\u{31}\u{31}\u{5E}\u{5E}\u{64}\u{64}\u{68}\u{68}\u{70}\u{70}" .
		    "\u{74}\u{74}\u{76}\u{76}\u{5}\u{2}\u{32}\u{3B}\u{43}\u{48}\u{63}\u{68}" .
		    "\u{3}\u{2}\u{33}\u{3B}\u{3}\u{2}\u{32}\u{3B}\u{4}\u{2}\u{2D}\u{2D}" .
		    "\u{2F}\u{2F}\u{5}\u{2}\u{2}\u{21}\u{29}\u{29}\u{5E}\u{5E}\u{2}\u{185}" .
		    "\u{2}\u{3}\u{3}\u{2}\u{2}\u{2}\u{2}\u{5}\u{3}\u{2}\u{2}\u{2}\u{2}" .
		    "\u{7}\u{3}\u{2}\u{2}\u{2}\u{2}\u{9}\u{3}\u{2}\u{2}\u{2}\u{2}\u{B}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{2}\u{D}\u{3}\u{2}\u{2}\u{2}\u{2}\u{5D}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{2}\u{5F}\u{3}\u{2}\u{2}\u{2}\u{2}\u{61}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{2}\u{63}\u{3}\u{2}\u{2}\u{2}\u{2}\u{65}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{2}\u{67}\u{3}\u{2}\u{2}\u{2}\u{2}\u{69}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{2}\u{6B}\u{3}\u{2}\u{2}\u{2}\u{2}\u{6D}\u{3}\u{2}\u{2}\u{2}\u{2}" .
		    "\u{6F}\u{3}\u{2}\u{2}\u{2}\u{3}\u{71}\u{3}\u{2}\u{2}\u{2}\u{5}\u{73}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{7}\u{75}\u{3}\u{2}\u{2}\u{2}\u{9}\u{77}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{B}\u{79}\u{3}\u{2}\u{2}\u{2}\u{D}\u{7B}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{F}\u{7D}\u{3}\u{2}\u{2}\u{2}\u{11}\u{7F}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{13}\u{81}\u{3}\u{2}\u{2}\u{2}\u{15}\u{83}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{17}\u{85}\u{3}\u{2}\u{2}\u{2}\u{19}\u{87}\u{3}\u{2}\u{2}\u{2}\u{1B}" .
		    "\u{89}\u{3}\u{2}\u{2}\u{2}\u{1D}\u{8B}\u{3}\u{2}\u{2}\u{2}\u{1F}\u{8D}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{21}\u{8F}\u{3}\u{2}\u{2}\u{2}\u{23}\u{91}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{25}\u{93}\u{3}\u{2}\u{2}\u{2}\u{27}\u{95}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{29}\u{97}\u{3}\u{2}\u{2}\u{2}\u{2B}\u{99}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{2D}\u{9B}\u{3}\u{2}\u{2}\u{2}\u{2F}\u{9D}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{31}\u{9F}\u{3}\u{2}\u{2}\u{2}\u{33}\u{A4}\u{3}\u{2}\u{2}\u{2}\u{35}" .
		    "\u{AA}\u{3}\u{2}\u{2}\u{2}\u{37}\u{B4}\u{3}\u{2}\u{2}\u{2}\u{39}\u{B6}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{3B}\u{BC}\u{3}\u{2}\u{2}\u{2}\u{3D}\u{C2}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{3F}\u{C7}\u{3}\u{2}\u{2}\u{2}\u{41}\u{CE}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{43}\u{D8}\u{3}\u{2}\u{2}\u{2}\u{45}\u{DB}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{47}\u{EE}\u{3}\u{2}\u{2}\u{2}\u{49}\u{F1}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{4B}\u{105}\u{3}\u{2}\u{2}\u{2}\u{4D}\u{108}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{4F}\u{11A}\u{3}\u{2}\u{2}\u{2}\u{51}\u{11D}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{53}\u{124}\u{3}\u{2}\u{2}\u{2}\u{55}\u{12A}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{57}\u{12E}\u{3}\u{2}\u{2}\u{2}\u{59}\u{134}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{5B}\u{137}\u{3}\u{2}\u{2}\u{2}\u{5D}\u{13E}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{5F}\u{145}\u{3}\u{2}\u{2}\u{2}\u{61}\u{147}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{63}\u{14D}\u{3}\u{2}\u{2}\u{2}\u{65}\u{151}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{67}\u{16A}\u{3}\u{2}\u{2}\u{2}\u{69}\u{16E}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{6B}\u{170}\u{3}\u{2}\u{2}\u{2}\u{6D}\u{182}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{6F}\u{184}\u{3}\u{2}\u{2}\u{2}\u{71}\u{72}\u{7}\u{2A}\u{2}\u{2}" .
		    "\u{72}\u{4}\u{3}\u{2}\u{2}\u{2}\u{73}\u{74}\u{7}\u{22}\u{2}\u{2}\u{74}" .
		    "\u{6}\u{3}\u{2}\u{2}\u{2}\u{75}\u{76}\u{7}\u{2B}\u{2}\u{2}\u{76}\u{8}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{77}\u{78}\u{7}\u{5D}\u{2}\u{2}\u{78}\u{A}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{79}\u{7A}\u{7}\u{2E}\u{2}\u{2}\u{7A}\u{C}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{7B}\u{7C}\u{7}\u{5F}\u{2}\u{2}\u{7C}\u{E}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{7D}\u{7E}\u{9}\u{2}\u{2}\u{2}\u{7E}\u{10}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{7F}\u{80}\u{9}\u{3}\u{2}\u{2}\u{80}\u{12}\u{3}\u{2}\u{2}\u{2}\u{81}" .
		    "\u{82}\u{9}\u{4}\u{2}\u{2}\u{82}\u{14}\u{3}\u{2}\u{2}\u{2}\u{83}\u{84}" .
		    "\u{9}\u{5}\u{2}\u{2}\u{84}\u{16}\u{3}\u{2}\u{2}\u{2}\u{85}\u{86}\u{9}" .
		    "\u{6}\u{2}\u{2}\u{86}\u{18}\u{3}\u{2}\u{2}\u{2}\u{87}\u{88}\u{9}\u{7}" .
		    "\u{2}\u{2}\u{88}\u{1A}\u{3}\u{2}\u{2}\u{2}\u{89}\u{8A}\u{9}\u{8}\u{2}" .
		    "\u{2}\u{8A}\u{1C}\u{3}\u{2}\u{2}\u{2}\u{8B}\u{8C}\u{9}\u{9}\u{2}\u{2}" .
		    "\u{8C}\u{1E}\u{3}\u{2}\u{2}\u{2}\u{8D}\u{8E}\u{9}\u{A}\u{2}\u{2}\u{8E}" .
		    "\u{20}\u{3}\u{2}\u{2}\u{2}\u{8F}\u{90}\u{9}\u{B}\u{2}\u{2}\u{90}\u{22}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{91}\u{92}\u{9}\u{C}\u{2}\u{2}\u{92}\u{24}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{93}\u{94}\u{9}\u{D}\u{2}\u{2}\u{94}\u{26}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{95}\u{96}\u{9}\u{E}\u{2}\u{2}\u{96}\u{28}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{97}\u{98}\u{9}\u{F}\u{2}\u{2}\u{98}\u{2A}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{99}\u{9A}\u{9}\u{10}\u{2}\u{2}\u{9A}\u{2C}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{9B}\u{9C}\u{9}\u{11}\u{2}\u{2}\u{9C}\u{2E}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{9D}\u{9E}\u{9}\u{12}\u{2}\u{2}\u{9E}\u{30}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{9F}\u{A2}\u{7}\u{5E}\u{2}\u{2}\u{A0}\u{A3}\u{9}\u{13}\u{2}\u{2}" .
		    "\u{A1}\u{A3}\u{5}\u{33}\u{1A}\u{2}\u{A2}\u{A0}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{A2}\u{A1}\u{3}\u{2}\u{2}\u{2}\u{A3}\u{32}\u{3}\u{2}\u{2}\u{2}\u{A4}" .
		    "\u{A5}\u{7}\u{77}\u{2}\u{2}\u{A5}\u{A6}\u{5}\u{35}\u{1B}\u{2}\u{A6}" .
		    "\u{A7}\u{5}\u{35}\u{1B}\u{2}\u{A7}\u{A8}\u{5}\u{35}\u{1B}\u{2}\u{A8}" .
		    "\u{A9}\u{5}\u{35}\u{1B}\u{2}\u{A9}\u{34}\u{3}\u{2}\u{2}\u{2}\u{AA}" .
		    "\u{AB}\u{9}\u{14}\u{2}\u{2}\u{AB}\u{36}\u{3}\u{2}\u{2}\u{2}\u{AC}" .
		    "\u{B5}\u{7}\u{32}\u{2}\u{2}\u{AD}\u{B1}\u{9}\u{15}\u{2}\u{2}\u{AE}" .
		    "\u{B0}\u{9}\u{16}\u{2}\u{2}\u{AF}\u{AE}\u{3}\u{2}\u{2}\u{2}\u{B0}" .
		    "\u{B3}\u{3}\u{2}\u{2}\u{2}\u{B1}\u{AF}\u{3}\u{2}\u{2}\u{2}\u{B1}\u{B2}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{B2}\u{B5}\u{3}\u{2}\u{2}\u{2}\u{B3}\u{B1}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{B4}\u{AC}\u{3}\u{2}\u{2}\u{2}\u{B4}\u{AD}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{B5}\u{38}\u{3}\u{2}\u{2}\u{2}\u{B6}\u{B8}\u{9}\u{6}\u{2}" .
		    "\u{2}\u{B7}\u{B9}\u{9}\u{17}\u{2}\u{2}\u{B8}\u{B7}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{B8}\u{B9}\u{3}\u{2}\u{2}\u{2}\u{B9}\u{BA}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{BA}\u{BB}\u{5}\u{37}\u{1C}\u{2}\u{BB}\u{3A}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{BC}\u{BD}\u{5}\u{F}\u{8}\u{2}\u{BD}\u{BE}\u{5}\u{1D}\u{F}\u{2}" .
		    "\u{BE}\u{BF}\u{5}\u{11}\u{9}\u{2}\u{BF}\u{C0}\u{5}\u{2F}\u{18}\u{2}" .
		    "\u{C0}\u{C1}\u{5}\u{F}\u{8}\u{2}\u{C1}\u{3C}\u{3}\u{2}\u{2}\u{2}\u{C2}" .
		    "\u{C3}\u{5}\u{F}\u{8}\u{2}\u{C3}\u{C4}\u{5}\u{13}\u{A}\u{2}\u{C4}" .
		    "\u{C5}\u{5}\u{29}\u{15}\u{2}\u{C5}\u{C6}\u{5}\u{F}\u{8}\u{2}\u{C6}" .
		    "\u{3E}\u{3}\u{2}\u{2}\u{2}\u{C7}\u{C8}\u{A}\u{18}\u{2}\u{2}\u{C8}" .
		    "\u{40}\u{3}\u{2}\u{2}\u{2}\u{C9}\u{CF}\u{7}\u{23}\u{2}\u{2}\u{CA}" .
		    "\u{CB}\u{5}\u{11}\u{9}\u{2}\u{CB}\u{CC}\u{5}\u{13}\u{A}\u{2}\u{CC}" .
		    "\u{CD}\u{5}\u{15}\u{B}\u{2}\u{CD}\u{CF}\u{3}\u{2}\u{2}\u{2}\u{CE}" .
		    "\u{C9}\u{3}\u{2}\u{2}\u{2}\u{CE}\u{CA}\u{3}\u{2}\u{2}\u{2}\u{CF}\u{42}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{D0}\u{D9}\u{7}\u{3F}\u{2}\u{2}\u{D1}\u{D2}" .
		    "\u{5}\u{17}\u{C}\u{2}\u{D2}\u{D3}\u{5}\u{19}\u{D}\u{2}\u{D3}\u{D4}" .
		    "\u{5}\u{1B}\u{E}\u{2}\u{D4}\u{D5}\u{5}\u{1D}\u{F}\u{2}\u{D5}\u{D6}" .
		    "\u{5}\u{1F}\u{10}\u{2}\u{D6}\u{D7}\u{5}\u{21}\u{11}\u{2}\u{D7}\u{D9}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{D8}\u{D0}\u{3}\u{2}\u{2}\u{2}\u{D8}\u{D1}\u{3}" .
		    "\u{2}\u{2}\u{2}\u{D9}\u{44}\u{3}\u{2}\u{2}\u{2}\u{DA}\u{DC}\u{5}\u{F}" .
		    "\u{8}\u{2}\u{DB}\u{DA}\u{3}\u{2}\u{2}\u{2}\u{DB}\u{DC}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{DC}\u{DD}\u{3}\u{2}\u{2}\u{2}\u{DD}\u{DF}\u{5}\u{43}\u{22}" .
		    "\u{2}\u{DE}\u{E0}\u{5}\u{F}\u{8}\u{2}\u{DF}\u{DE}\u{3}\u{2}\u{2}\u{2}" .
		    "\u{DF}\u{E0}\u{3}\u{2}\u{2}\u{2}\u{E0}\u{46}\u{3}\u{2}\u{2}\u{2}\u{E1}" .
		    "\u{E2}\u{7}\u{23}\u{2}\u{2}\u{E2}\u{EF}\u{7}\u{3F}\u{2}\u{2}\u{E3}" .
		    "\u{E4}\u{5}\u{11}\u{9}\u{2}\u{E4}\u{E5}\u{5}\u{13}\u{A}\u{2}\u{E5}" .
		    "\u{E6}\u{5}\u{15}\u{B}\u{2}\u{E6}\u{E7}\u{5}\u{F}\u{8}\u{2}\u{E7}" .
		    "\u{E8}\u{5}\u{17}\u{C}\u{2}\u{E8}\u{E9}\u{5}\u{19}\u{D}\u{2}\u{E9}" .
		    "\u{EA}\u{5}\u{1B}\u{E}\u{2}\u{EA}\u{EB}\u{5}\u{1D}\u{F}\u{2}\u{EB}" .
		    "\u{EC}\u{5}\u{1F}\u{10}\u{2}\u{EC}\u{ED}\u{5}\u{21}\u{11}\u{2}\u{ED}" .
		    "\u{EF}\u{3}\u{2}\u{2}\u{2}\u{EE}\u{E1}\u{3}\u{2}\u{2}\u{2}\u{EE}\u{E3}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{EF}\u{48}\u{3}\u{2}\u{2}\u{2}\u{F0}\u{F2}\u{5}" .
		    "\u{F}\u{8}\u{2}\u{F1}\u{F0}\u{3}\u{2}\u{2}\u{2}\u{F1}\u{F2}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{F2}\u{F3}\u{3}\u{2}\u{2}\u{2}\u{F3}\u{F5}\u{5}\u{47}" .
		    "\u{24}\u{2}\u{F4}\u{F6}\u{5}\u{F}\u{8}\u{2}\u{F5}\u{F4}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{F5}\u{F6}\u{3}\u{2}\u{2}\u{2}\u{F6}\u{4A}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{F7}\u{106}\u{7}\u{40}\u{2}\u{2}\u{F8}\u{F9}\u{5}\u{27}\u{14}" .
		    "\u{2}\u{F9}\u{FA}\u{5}\u{29}\u{15}\u{2}\u{FA}\u{FB}\u{5}\u{17}\u{C}" .
		    "\u{2}\u{FB}\u{FC}\u{5}\u{1D}\u{F}\u{2}\u{FC}\u{FD}\u{5}\u{15}\u{B}" .
		    "\u{2}\u{FD}\u{FE}\u{5}\u{17}\u{C}\u{2}\u{FE}\u{FF}\u{5}\u{29}\u{15}" .
		    "\u{2}\u{FF}\u{100}\u{5}\u{F}\u{8}\u{2}\u{100}\u{101}\u{5}\u{15}\u{B}" .
		    "\u{2}\u{101}\u{102}\u{5}\u{2B}\u{16}\u{2}\u{102}\u{103}\u{5}\u{1D}" .
		    "\u{F}\u{2}\u{103}\u{104}\u{5}\u{11}\u{9}\u{2}\u{104}\u{106}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{105}\u{F7}\u{3}\u{2}\u{2}\u{2}\u{105}\u{F8}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{106}\u{4C}\u{3}\u{2}\u{2}\u{2}\u{107}\u{109}\u{5}\u{F}" .
		    "\u{8}\u{2}\u{108}\u{107}\u{3}\u{2}\u{2}\u{2}\u{108}\u{109}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{109}\u{10A}\u{3}\u{2}\u{2}\u{2}\u{10A}\u{10C}\u{5}\u{4B}" .
		    "\u{26}\u{2}\u{10B}\u{10D}\u{5}\u{F}\u{8}\u{2}\u{10C}\u{10B}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{10C}\u{10D}\u{3}\u{2}\u{2}\u{2}\u{10D}\u{4E}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{10E}\u{11B}\u{7}\u{3E}\u{2}\u{2}\u{10F}\u{110}\u{5}\u{1F}" .
		    "\u{10}\u{2}\u{110}\u{111}\u{5}\u{13}\u{A}\u{2}\u{111}\u{112}\u{5}" .
		    "\u{2D}\u{17}\u{2}\u{112}\u{113}\u{5}\u{17}\u{C}\u{2}\u{113}\u{114}" .
		    "\u{5}\u{29}\u{15}\u{2}\u{114}\u{115}\u{5}\u{F}\u{8}\u{2}\u{115}\u{116}" .
		    "\u{5}\u{15}\u{B}\u{2}\u{116}\u{117}\u{5}\u{2B}\u{16}\u{2}\u{117}\u{118}" .
		    "\u{5}\u{1D}\u{F}\u{2}\u{118}\u{119}\u{5}\u{11}\u{9}\u{2}\u{119}\u{11B}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{11A}\u{10E}\u{3}\u{2}\u{2}\u{2}\u{11A}\u{10F}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{11B}\u{50}\u{3}\u{2}\u{2}\u{2}\u{11C}\u{11E}" .
		    "\u{5}\u{F}\u{8}\u{2}\u{11D}\u{11C}\u{3}\u{2}\u{2}\u{2}\u{11D}\u{11E}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{11E}\u{11F}\u{3}\u{2}\u{2}\u{2}\u{11F}\u{121}" .
		    "\u{5}\u{4F}\u{28}\u{2}\u{120}\u{122}\u{5}\u{F}\u{8}\u{2}\u{121}\u{120}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{121}\u{122}\u{3}\u{2}\u{2}\u{2}\u{122}\u{52}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{123}\u{125}\u{5}\u{F}\u{8}\u{2}\u{124}\u{123}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{124}\u{125}\u{3}\u{2}\u{2}\u{2}\u{125}\u{126}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{126}\u{128}\u{5}\u{55}\u{2B}\u{2}\u{127}\u{129}" .
		    "\u{5}\u{F}\u{8}\u{2}\u{128}\u{127}\u{3}\u{2}\u{2}\u{2}\u{128}\u{129}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{129}\u{54}\u{3}\u{2}\u{2}\u{2}\u{12A}\u{12B}" .
		    "\u{7}\u{40}\u{2}\u{2}\u{12B}\u{12C}\u{7}\u{3F}\u{2}\u{2}\u{12C}\u{56}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{12D}\u{12F}\u{5}\u{F}\u{8}\u{2}\u{12E}\u{12D}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{12E}\u{12F}\u{3}\u{2}\u{2}\u{2}\u{12F}\u{130}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{130}\u{132}\u{5}\u{59}\u{2D}\u{2}\u{131}\u{133}" .
		    "\u{5}\u{F}\u{8}\u{2}\u{132}\u{131}\u{3}\u{2}\u{2}\u{2}\u{132}\u{133}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{133}\u{58}\u{3}\u{2}\u{2}\u{2}\u{134}\u{135}" .
		    "\u{7}\u{3E}\u{2}\u{2}\u{135}\u{136}\u{7}\u{3F}\u{2}\u{2}\u{136}\u{5A}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{137}\u{138}\u{5}\u{F}\u{8}\u{2}\u{138}\u{139}" .
		    "\u{5}\u{1F}\u{10}\u{2}\u{139}\u{13A}\u{5}\u{23}\u{12}\u{2}\u{13A}" .
		    "\u{13B}\u{5}\u{25}\u{13}\u{2}\u{13B}\u{13C}\u{5}\u{17}\u{C}\u{2}\u{13C}" .
		    "\u{13D}\u{5}\u{F}\u{8}\u{2}\u{13D}\u{5C}\u{3}\u{2}\u{2}\u{2}\u{13E}" .
		    "\u{13F}\u{5}\u{F}\u{8}\u{2}\u{13F}\u{140}\u{5}\u{23}\u{12}\u{2}\u{140}" .
		    "\u{141}\u{5}\u{11}\u{9}\u{2}\u{141}\u{142}\u{5}\u{F}\u{8}\u{2}\u{142}" .
		    "\u{5E}\u{3}\u{2}\u{2}\u{2}\u{143}\u{146}\u{5}\u{45}\u{23}\u{2}\u{144}" .
		    "\u{146}\u{5}\u{49}\u{25}\u{2}\u{145}\u{143}\u{3}\u{2}\u{2}\u{2}\u{145}" .
		    "\u{144}\u{3}\u{2}\u{2}\u{2}\u{146}\u{60}\u{3}\u{2}\u{2}\u{2}\u{147}" .
		    "\u{148}\u{5}\u{5B}\u{2E}\u{2}\u{148}\u{62}\u{3}\u{2}\u{2}\u{2}\u{149}" .
		    "\u{14E}\u{5}\u{4D}\u{27}\u{2}\u{14A}\u{14E}\u{5}\u{53}\u{2A}\u{2}" .
		    "\u{14B}\u{14E}\u{5}\u{51}\u{29}\u{2}\u{14C}\u{14E}\u{5}\u{57}\u{2C}" .
		    "\u{2}\u{14D}\u{149}\u{3}\u{2}\u{2}\u{2}\u{14D}\u{14A}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{14D}\u{14B}\u{3}\u{2}\u{2}\u{2}\u{14D}\u{14C}\u{3}\u{2}\u{2}" .
		    "\u{2}\u{14E}\u{64}\u{3}\u{2}\u{2}\u{2}\u{14F}\u{152}\u{5}\u{3B}\u{1E}" .
		    "\u{2}\u{150}\u{152}\u{5}\u{3D}\u{1F}\u{2}\u{151}\u{14F}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{151}\u{150}\u{3}\u{2}\u{2}\u{2}\u{152}\u{66}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{153}\u{155}\u{7}\u{2F}\u{2}\u{2}\u{154}\u{153}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{154}\u{155}\u{3}\u{2}\u{2}\u{2}\u{155}\u{156}\u{3}\u{2}" .
		    "\u{2}\u{2}\u{156}\u{157}\u{5}\u{37}\u{1C}\u{2}\u{157}\u{159}\u{7}" .
		    "\u{30}\u{2}\u{2}\u{158}\u{15A}\u{9}\u{16}\u{2}\u{2}\u{159}\u{158}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{15A}\u{15B}\u{3}\u{2}\u{2}\u{2}\u{15B}\u{159}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{15B}\u{15C}\u{3}\u{2}\u{2}\u{2}\u{15C}\u{15E}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{15D}\u{15F}\u{5}\u{39}\u{1D}\u{2}\u{15E}\u{15D}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{15E}\u{15F}\u{3}\u{2}\u{2}\u{2}\u{15F}\u{16B}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{160}\u{162}\u{7}\u{2F}\u{2}\u{2}\u{161}\u{160}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{161}\u{162}\u{3}\u{2}\u{2}\u{2}\u{162}\u{163}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{163}\u{164}\u{5}\u{37}\u{1C}\u{2}\u{164}\u{165}" .
		    "\u{5}\u{39}\u{1D}\u{2}\u{165}\u{16B}\u{3}\u{2}\u{2}\u{2}\u{166}\u{168}" .
		    "\u{7}\u{2F}\u{2}\u{2}\u{167}\u{166}\u{3}\u{2}\u{2}\u{2}\u{167}\u{168}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{168}\u{169}\u{3}\u{2}\u{2}\u{2}\u{169}\u{16B}" .
		    "\u{5}\u{37}\u{1C}\u{2}\u{16A}\u{154}\u{3}\u{2}\u{2}\u{2}\u{16A}\u{161}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{16A}\u{167}\u{3}\u{2}\u{2}\u{2}\u{16B}\u{68}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{16C}\u{16F}\u{5}\u{31}\u{19}\u{2}\u{16D}\u{16F}" .
		    "\u{5}\u{3F}\u{20}\u{2}\u{16E}\u{16C}\u{3}\u{2}\u{2}\u{2}\u{16E}\u{16D}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{16F}\u{6A}\u{3}\u{2}\u{2}\u{2}\u{170}\u{174}" .
		    "\u{7}\u{29}\u{2}\u{2}\u{171}\u{173}\u{5}\u{69}\u{35}\u{2}\u{172}\u{171}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{173}\u{176}\u{3}\u{2}\u{2}\u{2}\u{174}\u{172}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{174}\u{175}\u{3}\u{2}\u{2}\u{2}\u{175}\u{177}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{176}\u{174}\u{3}\u{2}\u{2}\u{2}\u{177}\u{178}" .
		    "\u{7}\u{29}\u{2}\u{2}\u{178}\u{6C}\u{3}\u{2}\u{2}\u{2}\u{179}\u{17A}" .
		    "\u{7}\u{76}\u{2}\u{2}\u{17A}\u{17B}\u{7}\u{74}\u{2}\u{2}\u{17B}\u{17C}" .
		    "\u{7}\u{77}\u{2}\u{2}\u{17C}\u{183}\u{7}\u{67}\u{2}\u{2}\u{17D}\u{17E}" .
		    "\u{7}\u{68}\u{2}\u{2}\u{17E}\u{17F}\u{7}\u{63}\u{2}\u{2}\u{17F}\u{180}" .
		    "\u{7}\u{6E}\u{2}\u{2}\u{180}\u{181}\u{7}\u{75}\u{2}\u{2}\u{181}\u{183}" .
		    "\u{7}\u{67}\u{2}\u{2}\u{182}\u{179}\u{3}\u{2}\u{2}\u{2}\u{182}\u{17D}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{183}\u{6E}\u{3}\u{2}\u{2}\u{2}\u{184}\u{185}" .
		    "\u{7}\u{70}\u{2}\u{2}\u{185}\u{186}\u{7}\u{77}\u{2}\u{2}\u{186}\u{187}" .
		    "\u{7}\u{6E}\u{2}\u{2}\u{187}\u{188}\u{7}\u{6E}\u{2}\u{2}\u{188}\u{70}" .
		    "\u{3}\u{2}\u{2}\u{2}\u{24}\u{2}\u{A2}\u{B1}\u{B4}\u{B8}\u{CE}\u{D8}" .
		    "\u{DB}\u{DF}\u{EE}\u{F1}\u{F5}\u{105}\u{108}\u{10C}\u{11A}\u{11D}" .
		    "\u{121}\u{124}\u{128}\u{12E}\u{132}\u{145}\u{14D}\u{151}\u{154}\u{15B}" .
		    "\u{15E}\u{161}\u{167}\u{16A}\u{16E}\u{174}\u{182}\u{2}";

		protected static $atn;
		protected static $decisionToDFA;
		protected static $sharedContextCache;
		public function __construct(CharStream $input)
		{
			parent::__construct($input);

			self::initialize();

			$this->interp = new LexerATNSimulator($this, self::$atn, self::$decisionToDFA, self::$sharedContextCache);
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

		public static function vocabulary() : Vocabulary
		{
			static $vocabulary;

			return $vocabulary = $vocabulary ?? new VocabularyImpl(self::LITERAL_NAMES, self::SYMBOLIC_NAMES);
		}

		public function getGrammarFileName() : string
		{
			return 'RAQL.g4';
		}

		public function getRuleNames() : array
		{
			return self::RULE_NAMES;
		}

		public function getSerializedATN() : string
		{
			return self::SERIALIZED_ATN;
		}

		/**
		 * @return array<string>
		 */
		public function getChannelNames() : array
		{
			return self::CHANNEL_NAMES;
		}

		/**
		 * @return array<string>
		 */
		public function getModeNames() : array
		{
			return self::MODE_NAMES;
		}

		public function getATN() : ATN
		{
			return self::$atn;
		}

		public function getVocabulary() : Vocabulary
		{
			return self::vocabulary();
		}
	}
}