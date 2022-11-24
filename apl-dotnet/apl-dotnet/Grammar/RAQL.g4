/*
 * Lexer Rules
 */
grammar AQL;

clause:
	| '(' ' '? clause ' '? ')'
	| clause conjunction clause
	| operation;
conjunction: CONJUNCTIONS;
operation:
	bool_array_operation
	| number_array_operation
	| string_array_operation
	| bool_operation
	| number_operation
	| string_operation;
string_array_operation: field array_operator string_array;
number_array_operation: field array_operator number_array;
bool_array_operation: field array_operator bool_array;
array_operator: IN;
string_operation: field string_operator (string | nullstring);
string_operator: BASE_OPERATOR | STRING_OPERATOR;
number_operation: field number_operator number;
number_operator: BASE_OPERATOR | NUMBER_OPERATOR;
bool_operation: field bool_operator bool;
bool_operator: BASE_OPERATOR;
field: (WORD)*;
nullstring: NULL;
string: STRING;
string_array: '[' string (',' string)* ']' | '[' ']';
number: NUMBER;
number_array: '[' number (',' number)* ']' | '[' ']';
bool: BOOLEAN;
bool_array: '[' bool (',' bool)* ']' | '[' ']';

fragment SPACE_OPTIONAL: ' '?;
fragment ESC: '\\' (['\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];
fragment INT: '0' | [1-9] [0-9]*; // no leading zeros
fragment EXP:
	[Ee] [+\-]? INT; // \- since - means "range" inside [...]
fragment AND: ' and ' | ' AND ';
fragment OR: ' or ' | ' OR ';
fragment SAFECODEPOINT: ~ ['\\\u0000-\u001F];
fragment EQUALS: SPACE_OPTIONAL '=' SPACE_OPTIONAL;
fragment NOT_EQUALS: SPACE_OPTIONAL '!=' SPACE_OPTIONAL;
fragment MAJOR: SPACE_OPTIONAL '>' SPACE_OPTIONAL;
fragment MINOR: SPACE_OPTIONAL '<' SPACE_OPTIONAL;
fragment MAJOR_EQUALS: SPACE_OPTIONAL '>=' SPACE_OPTIONAL;
fragment MINOR_EQUALS: SPACE_OPTIONAL '<=' SPACE_OPTIONAL;
fragment LIKE: ' like ' | ' LIKE ';
IN: ' in ' | ' IN ';
BASE_OPERATOR: EQUALS | NOT_EQUALS;
STRING_OPERATOR: LIKE;
NUMBER_OPERATOR: MAJOR | MAJOR_EQUALS | MINOR | MINOR_EQUALS;
CONJUNCTIONS: AND | OR;
NUMBER:
	'-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
	| '-'? INT EXP // 1e10 -3e4
	| '-'? INT; // -3, 45
WORD: ESC | SAFECODEPOINT;
STRING: '\'' (WORD)* '\'';
BOOLEAN: 'true' | 'false';
NULL: 'null';
WS: [ \t\n\r]+ -> skip;