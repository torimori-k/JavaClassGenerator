parser grammar ClassGenParser;
options { tokenVocab=ClassGenLexer; }

program: class_stmt attr_stmt const_stmt method_stmt;

class_stmt: CLASS_START COLON_SEPARATOR class_def;

class_def: class_visibility_mod? name_exp;

attr_stmt: ATTR_START COLON_SEPARATOR START_SQRE_BRACE attr_defs? END_SQRE_BRACE;

attr_defs: attr_def opt_attr_def*;
opt_attr_def: COMMA_SEPARTOR attr_def;

attr_def: visibility_mod? name_exp COLON_SEPARATOR attr_type getter_setter_options;
getter_setter_options: START_BRACE GETTER_OPTION? SETTER_OPTION? END_BRACE;

const_stmt: CONST_START COLON_SEPARATOR START_SQRE_BRACE const_defs? END_SQRE_BRACE;

const_defs: const_def opt_const_def*;
opt_const_def: COMMA_SEPARTOR const_def;
const_def: name_exp; // leave in this format for extendibility

method_stmt: METHOD_START COLON_SEPARATOR START_SQRE_BRACE method_defs? END_SQRE_BRACE;

method_defs: method_def opt_method_def*;
opt_method_def: COMMA_SEPARTOR method_def;
method_def: visibility_mod? name_exp COLON_SEPARATOR method_type;

name_exp: START_DOUBLE_QUOTE TEXT_VALUE END_DOUBLE_QUOTE;

class_visibility_mod: PUBLIC_VISIBILITY | PRIVATE_VISIBILITY;
visibility_mod: PUBLIC_VISIBILITY | PRIVATE_VISIBILITY | PROTECTED_VISIBILITY;

arr_type: ARRAY_TYPE START_CURL_BRACE var_basic_type END_CURL_BRACE;

attr_type: var_basic_type | arr_type;
method_type: return_basic_type | arr_type;

return_basic_type: VOID_TYPE | var_basic_type;
var_basic_type: BYTE_TYPE | SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | BOOLEAN_TYPE | CHAR_TYPE | STRING_TYPE;


