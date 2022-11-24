/*
 * Lexer Rules
 */
grammar apl;

apl: operation | apl (CONJUNCTIONS (operation | apl))?;
operation: STRING OPERATOR value;
array: '[' value (',' value)* ']' | '[' ']'; // empty array
value:
	STRING
	| NUMBER
	| array
	| 'true' // keywords
	| 'false'
	| 'null';

fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE: 'u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];
fragment BOOLEAN: ['true'|'false'];
fragment AND: ['and','AND'];
fragment OR: ['or','OR'];
fragment INT: '0' | [1-9] [0-9]*; // no leading zeros
fragment EXP:
	[Ee] [+\-]? INT; // \- since - means "range" inside [...]

OPERATOR: '!' | '=' | '!=' | '>' | '<' | '>=' | '<=';
CONJUNCTIONS: AND | OR;
NUMBER:
	'-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
	| '-'? INT EXP // 1e10 -3e4
	| '-'? INT; // -3, 45
STRING: '\'' (ESC | ~["\\])* '\'';
WS: [ \t\n\r]+ -> skip;