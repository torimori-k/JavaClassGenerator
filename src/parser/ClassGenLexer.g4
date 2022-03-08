lexer grammar ClassGenLexer;

CLASS_START: 'class';
ATTR_START: 'attribute';
CONST_START: 'constructor';
METHOD_START: 'method';

// different type of braces to be used
START_BRACE: '(';
END_BRACE: ')';
START_SQRE_BRACE: '[';
END_SQRE_BRACE: ']';
START_CURL_BRACE: '{';
END_CURL_BRACE: '}';
START_DOUBLE_QUOTE:'"' -> mode(TEXT_MODE);

COLON_SEPARATOR: ':';
COMMA_SEPARTOR: ',';

// visiblity modifier
PUBLIC_VISIBILITY: '+';
PRIVATE_VISIBILITY: '-';
PROTECTED_VISIBILITY: '#';

// type
VOID_TYPE: 'void';
BYTE_TYPE: 'byte';
SHORT_TYPE: 'short';
INT_TYPE: 'int';
LONG_TYPE: 'long';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
BOOLEAN_TYPE: 'boolean';
CHAR_TYPE: 'char';
STRING_TYPE: 'string';
ARRAY_TYPE: 'arr';

// getter and setter option flag
GETTER_OPTION: 'g';
SETTER_OPTION: 's';

WS: [\r\n\t ]+ -> channel(HIDDEN);


mode TEXT_MODE;
// The names of class members have to start from an alphabetic character.
// The naming convention issue for classes (i.e. A starting character needs to be capitalized.) may be checked later.
TEXT_VALUE: [a-zA-Z] [a-zA-Z0-9_];
END_DOUBLE_QUOTE: '"'  -> mode(DEFAULT_MODE);
WS_TEXT: [\r\n\t ]+ -> channel(HIDDEN) ;
