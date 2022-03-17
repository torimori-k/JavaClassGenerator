// Generated from /Users/torimori/personal_project/java/JavaClassGenerator/src/parser/ClassGenParser.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassGenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS_START=1, ATTR_START=2, CONST_START=3, METHOD_START=4, START_BRACE=5, 
		END_BRACE=6, START_SQRE_BRACE=7, END_SQRE_BRACE=8, START_CURL_BRACE=9, 
		END_CURL_BRACE=10, START_DOUBLE_QUOTE=11, COLON_SEPARATOR=12, COMMA_SEPARTOR=13, 
		PUBLIC_VISIBILITY=14, PRIVATE_VISIBILITY=15, PROTECTED_VISIBILITY=16, 
		VOID_TYPE=17, BYTE_TYPE=18, SHORT_TYPE=19, INT_TYPE=20, LONG_TYPE=21, 
		FLOAT_TYPE=22, DOUBLE_TYPE=23, BOOLEAN_TYPE=24, CHAR_TYPE=25, STRING_TYPE=26, 
		ARRAY_TYPE=27, GETTER_OPTION=28, SETTER_OPTION=29, WS=30, TEXT_VALUE=31, 
		END_DOUBLE_QUOTE=32, WS_TEXT=33;
	public static final int
		RULE_program = 0, RULE_class_stmt = 1, RULE_class_def = 2, RULE_attr_stmt = 3, 
		RULE_attr_defs = 4, RULE_opt_attr_def = 5, RULE_attr_def = 6, RULE_getter_setter_options = 7, 
		RULE_const_stmt = 8, RULE_const_defs = 9, RULE_opt_const_def = 10, RULE_const_def = 11, 
		RULE_method_stmt = 12, RULE_method_defs = 13, RULE_opt_method_def = 14, 
		RULE_method_def = 15, RULE_name_exp = 16, RULE_class_visibility_mod = 17, 
		RULE_visibility_mod = 18, RULE_arr_type = 19, RULE_attr_type = 20, RULE_method_type = 21, 
		RULE_return_basic_type = 22, RULE_var_basic_type = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_stmt", "class_def", "attr_stmt", "attr_defs", "opt_attr_def", 
			"attr_def", "getter_setter_options", "const_stmt", "const_defs", "opt_const_def", 
			"const_def", "method_stmt", "method_defs", "opt_method_def", "method_def", 
			"name_exp", "class_visibility_mod", "visibility_mod", "arr_type", "attr_type", 
			"method_type", "return_basic_type", "var_basic_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'attribute'", "'constructor'", "'method'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", null, "':'", "','", "'+'", "'-'", "'#'", 
			"'void'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", 
			"'boolean'", "'char'", "'string'", "'arr'", "'g'", "'s'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS_START", "ATTR_START", "CONST_START", "METHOD_START", "START_BRACE", 
			"END_BRACE", "START_SQRE_BRACE", "END_SQRE_BRACE", "START_CURL_BRACE", 
			"END_CURL_BRACE", "START_DOUBLE_QUOTE", "COLON_SEPARATOR", "COMMA_SEPARTOR", 
			"PUBLIC_VISIBILITY", "PRIVATE_VISIBILITY", "PROTECTED_VISIBILITY", "VOID_TYPE", 
			"BYTE_TYPE", "SHORT_TYPE", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", 
			"BOOLEAN_TYPE", "CHAR_TYPE", "STRING_TYPE", "ARRAY_TYPE", "GETTER_OPTION", 
			"SETTER_OPTION", "WS", "TEXT_VALUE", "END_DOUBLE_QUOTE", "WS_TEXT"
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
	public String getGrammarFileName() { return "ClassGenParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClassGenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Class_stmtContext class_stmt() {
			return getRuleContext(Class_stmtContext.class,0);
		}
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public Const_stmtContext const_stmt() {
			return getRuleContext(Const_stmtContext.class,0);
		}
		public Method_stmtContext method_stmt() {
			return getRuleContext(Method_stmtContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			class_stmt();
			setState(49);
			attr_stmt();
			setState(50);
			const_stmt();
			setState(51);
			method_stmt();
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

	public static class Class_stmtContext extends ParserRuleContext {
		public TerminalNode CLASS_START() { return getToken(ClassGenParser.CLASS_START, 0); }
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Class_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterClass_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitClass_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitClass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_stmtContext class_stmt() throws RecognitionException {
		Class_stmtContext _localctx = new Class_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(CLASS_START);
			setState(54);
			match(COLON_SEPARATOR);
			setState(55);
			class_def();
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

	public static class Class_defContext extends ParserRuleContext {
		public Name_expContext name_exp() {
			return getRuleContext(Name_expContext.class,0);
		}
		public Class_visibility_modContext class_visibility_mod() {
			return getRuleContext(Class_visibility_modContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC_VISIBILITY || _la==PRIVATE_VISIBILITY) {
				{
				setState(57);
				class_visibility_mod();
				}
			}

			setState(60);
			name_exp();
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

	public static class Attr_stmtContext extends ParserRuleContext {
		public TerminalNode ATTR_START() { return getToken(ClassGenParser.ATTR_START, 0); }
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public TerminalNode START_SQRE_BRACE() { return getToken(ClassGenParser.START_SQRE_BRACE, 0); }
		public TerminalNode END_SQRE_BRACE() { return getToken(ClassGenParser.END_SQRE_BRACE, 0); }
		public Attr_defsContext attr_defs() {
			return getRuleContext(Attr_defsContext.class,0);
		}
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterAttr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitAttr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitAttr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ATTR_START);
			setState(63);
			match(COLON_SEPARATOR);
			setState(64);
			match(START_SQRE_BRACE);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_DOUBLE_QUOTE) | (1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(65);
				attr_defs();
				}
			}

			setState(68);
			match(END_SQRE_BRACE);
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

	public static class Attr_defsContext extends ParserRuleContext {
		public Attr_defContext attr_def() {
			return getRuleContext(Attr_defContext.class,0);
		}
		public List<Opt_attr_defContext> opt_attr_def() {
			return getRuleContexts(Opt_attr_defContext.class);
		}
		public Opt_attr_defContext opt_attr_def(int i) {
			return getRuleContext(Opt_attr_defContext.class,i);
		}
		public Attr_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterAttr_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitAttr_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitAttr_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_defsContext attr_defs() throws RecognitionException {
		Attr_defsContext _localctx = new Attr_defsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			attr_def();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(71);
				opt_attr_def();
				}
				}
				setState(76);
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

	public static class Opt_attr_defContext extends ParserRuleContext {
		public TerminalNode COMMA_SEPARTOR() { return getToken(ClassGenParser.COMMA_SEPARTOR, 0); }
		public Attr_defContext attr_def() {
			return getRuleContext(Attr_defContext.class,0);
		}
		public Opt_attr_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_attr_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterOpt_attr_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitOpt_attr_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitOpt_attr_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_attr_defContext opt_attr_def() throws RecognitionException {
		Opt_attr_defContext _localctx = new Opt_attr_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opt_attr_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(COMMA_SEPARTOR);
			setState(78);
			attr_def();
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

	public static class Attr_defContext extends ParserRuleContext {
		public Name_expContext name_exp() {
			return getRuleContext(Name_expContext.class,0);
		}
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public Attr_typeContext attr_type() {
			return getRuleContext(Attr_typeContext.class,0);
		}
		public Getter_setter_optionsContext getter_setter_options() {
			return getRuleContext(Getter_setter_optionsContext.class,0);
		}
		public Visibility_modContext visibility_mod() {
			return getRuleContext(Visibility_modContext.class,0);
		}
		public Attr_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterAttr_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitAttr_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitAttr_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_defContext attr_def() throws RecognitionException {
		Attr_defContext _localctx = new Attr_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attr_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(80);
				visibility_mod();
				}
			}

			setState(83);
			name_exp();
			setState(84);
			match(COLON_SEPARATOR);
			setState(85);
			attr_type();
			setState(86);
			getter_setter_options();
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

	public static class Getter_setter_optionsContext extends ParserRuleContext {
		public TerminalNode START_BRACE() { return getToken(ClassGenParser.START_BRACE, 0); }
		public TerminalNode END_BRACE() { return getToken(ClassGenParser.END_BRACE, 0); }
		public TerminalNode GETTER_OPTION() { return getToken(ClassGenParser.GETTER_OPTION, 0); }
		public TerminalNode SETTER_OPTION() { return getToken(ClassGenParser.SETTER_OPTION, 0); }
		public Getter_setter_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterGetter_setter_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitGetter_setter_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitGetter_setter_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_optionsContext getter_setter_options() throws RecognitionException {
		Getter_setter_optionsContext _localctx = new Getter_setter_optionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getter_setter_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(START_BRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GETTER_OPTION) {
				{
				setState(89);
				match(GETTER_OPTION);
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTER_OPTION) {
				{
				setState(92);
				match(SETTER_OPTION);
				}
			}

			setState(95);
			match(END_BRACE);
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

	public static class Const_stmtContext extends ParserRuleContext {
		public TerminalNode CONST_START() { return getToken(ClassGenParser.CONST_START, 0); }
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public TerminalNode START_SQRE_BRACE() { return getToken(ClassGenParser.START_SQRE_BRACE, 0); }
		public TerminalNode END_SQRE_BRACE() { return getToken(ClassGenParser.END_SQRE_BRACE, 0); }
		public Const_defsContext const_defs() {
			return getRuleContext(Const_defsContext.class,0);
		}
		public Const_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterConst_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitConst_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitConst_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_stmtContext const_stmt() throws RecognitionException {
		Const_stmtContext _localctx = new Const_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_const_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(CONST_START);
			setState(98);
			match(COLON_SEPARATOR);
			setState(99);
			match(START_SQRE_BRACE);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_DOUBLE_QUOTE) {
				{
				setState(100);
				const_defs();
				}
			}

			setState(103);
			match(END_SQRE_BRACE);
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

	public static class Const_defsContext extends ParserRuleContext {
		public Const_defContext const_def() {
			return getRuleContext(Const_defContext.class,0);
		}
		public List<Opt_const_defContext> opt_const_def() {
			return getRuleContexts(Opt_const_defContext.class);
		}
		public Opt_const_defContext opt_const_def(int i) {
			return getRuleContext(Opt_const_defContext.class,i);
		}
		public Const_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterConst_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitConst_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitConst_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_defsContext const_defs() throws RecognitionException {
		Const_defsContext _localctx = new Const_defsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_const_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			const_def();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(106);
				opt_const_def();
				}
				}
				setState(111);
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

	public static class Opt_const_defContext extends ParserRuleContext {
		public TerminalNode COMMA_SEPARTOR() { return getToken(ClassGenParser.COMMA_SEPARTOR, 0); }
		public Const_defContext const_def() {
			return getRuleContext(Const_defContext.class,0);
		}
		public Opt_const_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_const_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterOpt_const_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitOpt_const_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitOpt_const_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_const_defContext opt_const_def() throws RecognitionException {
		Opt_const_defContext _localctx = new Opt_const_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opt_const_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(COMMA_SEPARTOR);
			setState(113);
			const_def();
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

	public static class Const_defContext extends ParserRuleContext {
		public Name_expContext name_exp() {
			return getRuleContext(Name_expContext.class,0);
		}
		public Const_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterConst_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitConst_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitConst_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_defContext const_def() throws RecognitionException {
		Const_defContext _localctx = new Const_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_const_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			name_exp();
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

	public static class Method_stmtContext extends ParserRuleContext {
		public TerminalNode METHOD_START() { return getToken(ClassGenParser.METHOD_START, 0); }
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public TerminalNode START_SQRE_BRACE() { return getToken(ClassGenParser.START_SQRE_BRACE, 0); }
		public TerminalNode END_SQRE_BRACE() { return getToken(ClassGenParser.END_SQRE_BRACE, 0); }
		public Method_defsContext method_defs() {
			return getRuleContext(Method_defsContext.class,0);
		}
		public Method_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterMethod_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitMethod_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitMethod_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_stmtContext method_stmt() throws RecognitionException {
		Method_stmtContext _localctx = new Method_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(METHOD_START);
			setState(118);
			match(COLON_SEPARATOR);
			setState(119);
			match(START_SQRE_BRACE);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_DOUBLE_QUOTE) | (1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(120);
				method_defs();
				}
			}

			setState(123);
			match(END_SQRE_BRACE);
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

	public static class Method_defsContext extends ParserRuleContext {
		public Method_defContext method_def() {
			return getRuleContext(Method_defContext.class,0);
		}
		public List<Opt_method_defContext> opt_method_def() {
			return getRuleContexts(Opt_method_defContext.class);
		}
		public Opt_method_defContext opt_method_def(int i) {
			return getRuleContext(Opt_method_defContext.class,i);
		}
		public Method_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterMethod_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitMethod_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitMethod_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_defsContext method_defs() throws RecognitionException {
		Method_defsContext _localctx = new Method_defsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			method_def();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(126);
				opt_method_def();
				}
				}
				setState(131);
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

	public static class Opt_method_defContext extends ParserRuleContext {
		public TerminalNode COMMA_SEPARTOR() { return getToken(ClassGenParser.COMMA_SEPARTOR, 0); }
		public Method_defContext method_def() {
			return getRuleContext(Method_defContext.class,0);
		}
		public Opt_method_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_method_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterOpt_method_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitOpt_method_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitOpt_method_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_method_defContext opt_method_def() throws RecognitionException {
		Opt_method_defContext _localctx = new Opt_method_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opt_method_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(COMMA_SEPARTOR);
			setState(133);
			method_def();
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

	public static class Method_defContext extends ParserRuleContext {
		public Name_expContext name_exp() {
			return getRuleContext(Name_expContext.class,0);
		}
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Visibility_modContext visibility_mod() {
			return getRuleContext(Visibility_modContext.class,0);
		}
		public Method_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterMethod_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitMethod_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitMethod_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_defContext method_def() throws RecognitionException {
		Method_defContext _localctx = new Method_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_method_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(135);
				visibility_mod();
				}
			}

			setState(138);
			name_exp();
			setState(139);
			match(COLON_SEPARATOR);
			setState(140);
			method_type();
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

	public static class Name_expContext extends ParserRuleContext {
		public TerminalNode START_DOUBLE_QUOTE() { return getToken(ClassGenParser.START_DOUBLE_QUOTE, 0); }
		public TerminalNode TEXT_VALUE() { return getToken(ClassGenParser.TEXT_VALUE, 0); }
		public TerminalNode END_DOUBLE_QUOTE() { return getToken(ClassGenParser.END_DOUBLE_QUOTE, 0); }
		public Name_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterName_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitName_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitName_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_expContext name_exp() throws RecognitionException {
		Name_expContext _localctx = new Name_expContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(START_DOUBLE_QUOTE);
			setState(143);
			match(TEXT_VALUE);
			setState(144);
			match(END_DOUBLE_QUOTE);
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

	public static class Class_visibility_modContext extends ParserRuleContext {
		public TerminalNode PUBLIC_VISIBILITY() { return getToken(ClassGenParser.PUBLIC_VISIBILITY, 0); }
		public TerminalNode PRIVATE_VISIBILITY() { return getToken(ClassGenParser.PRIVATE_VISIBILITY, 0); }
		public Class_visibility_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_visibility_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterClass_visibility_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitClass_visibility_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitClass_visibility_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_visibility_modContext class_visibility_mod() throws RecognitionException {
		Class_visibility_modContext _localctx = new Class_visibility_modContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_visibility_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==PUBLIC_VISIBILITY || _la==PRIVATE_VISIBILITY) ) {
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

	public static class Visibility_modContext extends ParserRuleContext {
		public TerminalNode PUBLIC_VISIBILITY() { return getToken(ClassGenParser.PUBLIC_VISIBILITY, 0); }
		public TerminalNode PRIVATE_VISIBILITY() { return getToken(ClassGenParser.PRIVATE_VISIBILITY, 0); }
		public TerminalNode PROTECTED_VISIBILITY() { return getToken(ClassGenParser.PROTECTED_VISIBILITY, 0); }
		public Visibility_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterVisibility_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitVisibility_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitVisibility_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Visibility_modContext visibility_mod() throws RecognitionException {
		Visibility_modContext _localctx = new Visibility_modContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_visibility_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) ) {
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

	public static class Arr_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY_TYPE() { return getToken(ClassGenParser.ARRAY_TYPE, 0); }
		public TerminalNode START_CURL_BRACE() { return getToken(ClassGenParser.START_CURL_BRACE, 0); }
		public Var_basic_typeContext var_basic_type() {
			return getRuleContext(Var_basic_typeContext.class,0);
		}
		public TerminalNode END_CURL_BRACE() { return getToken(ClassGenParser.END_CURL_BRACE, 0); }
		public Arr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterArr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitArr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitArr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_typeContext arr_type() throws RecognitionException {
		Arr_typeContext _localctx = new Arr_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ARRAY_TYPE);
			setState(151);
			match(START_CURL_BRACE);
			setState(152);
			var_basic_type();
			setState(153);
			match(END_CURL_BRACE);
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

	public static class Attr_typeContext extends ParserRuleContext {
		public Var_basic_typeContext var_basic_type() {
			return getRuleContext(Var_basic_typeContext.class,0);
		}
		public Arr_typeContext arr_type() {
			return getRuleContext(Arr_typeContext.class,0);
		}
		public Attr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterAttr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitAttr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitAttr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_typeContext attr_type() throws RecognitionException {
		Attr_typeContext _localctx = new Attr_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attr_type);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE_TYPE:
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case BOOLEAN_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				var_basic_type();
				}
				break;
			case ARRAY_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				arr_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Method_typeContext extends ParserRuleContext {
		public Return_basic_typeContext return_basic_type() {
			return getRuleContext(Return_basic_typeContext.class,0);
		}
		public Arr_typeContext arr_type() {
			return getRuleContext(Arr_typeContext.class,0);
		}
		public Method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterMethod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitMethod_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitMethod_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_typeContext method_type() throws RecognitionException {
		Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method_type);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_TYPE:
			case BYTE_TYPE:
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case BOOLEAN_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				return_basic_type();
				}
				break;
			case ARRAY_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				arr_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Return_basic_typeContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(ClassGenParser.VOID_TYPE, 0); }
		public Var_basic_typeContext var_basic_type() {
			return getRuleContext(Var_basic_typeContext.class,0);
		}
		public Return_basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterReturn_basic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitReturn_basic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitReturn_basic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_basic_typeContext return_basic_type() throws RecognitionException {
		Return_basic_typeContext _localctx = new Return_basic_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_basic_type);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(VOID_TYPE);
				}
				break;
			case BYTE_TYPE:
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case BOOLEAN_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				var_basic_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Var_basic_typeContext extends ParserRuleContext {
		public TerminalNode BYTE_TYPE() { return getToken(ClassGenParser.BYTE_TYPE, 0); }
		public TerminalNode SHORT_TYPE() { return getToken(ClassGenParser.SHORT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(ClassGenParser.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(ClassGenParser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ClassGenParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(ClassGenParser.DOUBLE_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(ClassGenParser.BOOLEAN_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ClassGenParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ClassGenParser.STRING_TYPE, 0); }
		public Var_basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterVar_basic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitVar_basic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitVar_basic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_basic_typeContext var_basic_type() throws RecognitionException {
		Var_basic_typeContext _localctx = new Var_basic_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE_TYPE) | (1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5E\n\5\3\5\3\5\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\7\3\b"+
		"\5\bT\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t]\n\t\3\t\5\t`\n\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\5\nh\n\n\3\n\3\n\3\13\3\13\7\13n\n\13\f\13\16\13q\13\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16|\n\16\3\16\3\16\3\17\3\17"+
		"\7\17\u0082\n\17\f\17\16\17\u0085\13\17\3\20\3\20\3\20\3\21\5\21\u008b"+
		"\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00a0\n\26\3\27\3\27\5\27\u00a4\n"+
		"\27\3\30\3\30\5\30\u00a8\n\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\3\2\20\21\3\2\20\22\3\2\24\34\2"+
		"\u00a1\2\62\3\2\2\2\4\67\3\2\2\2\6<\3\2\2\2\b@\3\2\2\2\nH\3\2\2\2\fO\3"+
		"\2\2\2\16S\3\2\2\2\20Z\3\2\2\2\22c\3\2\2\2\24k\3\2\2\2\26r\3\2\2\2\30"+
		"u\3\2\2\2\32w\3\2\2\2\34\177\3\2\2\2\36\u0086\3\2\2\2 \u008a\3\2\2\2\""+
		"\u0090\3\2\2\2$\u0094\3\2\2\2&\u0096\3\2\2\2(\u0098\3\2\2\2*\u009f\3\2"+
		"\2\2,\u00a3\3\2\2\2.\u00a7\3\2\2\2\60\u00a9\3\2\2\2\62\63\5\4\3\2\63\64"+
		"\5\b\5\2\64\65\5\22\n\2\65\66\5\32\16\2\66\3\3\2\2\2\678\7\3\2\289\7\16"+
		"\2\29:\5\6\4\2:\5\3\2\2\2;=\5$\23\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5"+
		"\"\22\2?\7\3\2\2\2@A\7\4\2\2AB\7\16\2\2BD\7\t\2\2CE\5\n\6\2DC\3\2\2\2"+
		"DE\3\2\2\2EF\3\2\2\2FG\7\n\2\2G\t\3\2\2\2HL\5\16\b\2IK\5\f\7\2JI\3\2\2"+
		"\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NL\3\2\2\2OP\7\17\2\2PQ\5"+
		"\16\b\2Q\r\3\2\2\2RT\5&\24\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\5\"\22\2"+
		"VW\7\16\2\2WX\5*\26\2XY\5\20\t\2Y\17\3\2\2\2Z\\\7\7\2\2[]\7\36\2\2\\["+
		"\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\7\37\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2"+
		"ab\7\b\2\2b\21\3\2\2\2cd\7\5\2\2de\7\16\2\2eg\7\t\2\2fh\5\24\13\2gf\3"+
		"\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\n\2\2j\23\3\2\2\2ko\5\30\r\2ln\5\26\f\2"+
		"ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\25\3\2\2\2qo\3\2\2\2rs\7\17"+
		"\2\2st\5\30\r\2t\27\3\2\2\2uv\5\"\22\2v\31\3\2\2\2wx\7\6\2\2xy\7\16\2"+
		"\2y{\7\t\2\2z|\5\34\17\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\n\2\2~\33\3"+
		"\2\2\2\177\u0083\5 \21\2\u0080\u0082\5\36\20\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\35\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0086\u0087\7\17\2\2\u0087\u0088\5 \21\2\u0088"+
		"\37\3\2\2\2\u0089\u008b\5&\24\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u008c\3\2\2\2\u008c\u008d\5\"\22\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\5,\27\2\u008f!\3\2\2\2\u0090\u0091\7\r\2\2\u0091\u0092\7!\2\2\u0092"+
		"\u0093\7\"\2\2\u0093#\3\2\2\2\u0094\u0095\t\2\2\2\u0095%\3\2\2\2\u0096"+
		"\u0097\t\3\2\2\u0097\'\3\2\2\2\u0098\u0099\7\35\2\2\u0099\u009a\7\13\2"+
		"\2\u009a\u009b\5\60\31\2\u009b\u009c\7\f\2\2\u009c)\3\2\2\2\u009d\u00a0"+
		"\5\60\31\2\u009e\u00a0\5(\25\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2"+
		"\u00a0+\3\2\2\2\u00a1\u00a4\5.\30\2\u00a2\u00a4\5(\25\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a2\3\2\2\2\u00a4-\3\2\2\2\u00a5\u00a8\7\23\2\2\u00a6\u00a8"+
		"\5\60\31\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8/\3\2\2\2\u00a9"+
		"\u00aa\t\4\2\2\u00aa\61\3\2\2\2\20<DLS\\_go{\u0083\u008a\u009f\u00a3\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}