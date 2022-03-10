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
		RULE_attr_defs = 4, RULE_opt_attr_defs = 5, RULE_attr_def = 6, RULE_getter_setter_options = 7, 
		RULE_const_stmt = 8, RULE_const_defs = 9, RULE_opt_const_defs = 10, RULE_const_def = 11, 
		RULE_method_stmt = 12, RULE_method_defs = 13, RULE_opt_method_defs = 14, 
		RULE_method_def = 15, RULE_name_exp = 16, RULE_common_def = 17, RULE_class_visibility_mod = 18, 
		RULE_visibility_mod = 19, RULE_default_type = 20, RULE_arr_type = 21, 
		RULE_type = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_stmt", "class_def", "attr_stmt", "attr_defs", "opt_attr_defs", 
			"attr_def", "getter_setter_options", "const_stmt", "const_defs", "opt_const_defs", 
			"const_def", "method_stmt", "method_defs", "opt_method_defs", "method_def", 
			"name_exp", "common_def", "class_visibility_mod", "visibility_mod", "default_type", 
			"arr_type", "type"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			class_stmt();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR_START) {
				{
				setState(47);
				attr_stmt();
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_START) {
				{
				setState(50);
				const_stmt();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==METHOD_START) {
				{
				setState(53);
				method_stmt();
				}
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
			setState(56);
			match(CLASS_START);
			setState(57);
			match(COLON_SEPARATOR);
			setState(58);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC_VISIBILITY || _la==PRIVATE_VISIBILITY) {
				{
				setState(60);
				class_visibility_mod();
				}
			}

			setState(63);
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
			setState(65);
			match(ATTR_START);
			setState(66);
			match(COLON_SEPARATOR);
			setState(67);
			match(START_SQRE_BRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_DOUBLE_QUOTE) | (1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(68);
				attr_defs();
				}
			}

			setState(71);
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
		public List<Opt_attr_defsContext> opt_attr_defs() {
			return getRuleContexts(Opt_attr_defsContext.class);
		}
		public Opt_attr_defsContext opt_attr_defs(int i) {
			return getRuleContext(Opt_attr_defsContext.class,i);
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
			setState(73);
			attr_def();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(74);
				opt_attr_defs();
				}
				}
				setState(79);
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

	public static class Opt_attr_defsContext extends ParserRuleContext {
		public TerminalNode COMMA_SEPARTOR() { return getToken(ClassGenParser.COMMA_SEPARTOR, 0); }
		public Attr_defContext attr_def() {
			return getRuleContext(Attr_defContext.class,0);
		}
		public Opt_attr_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_attr_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterOpt_attr_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitOpt_attr_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitOpt_attr_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_attr_defsContext opt_attr_defs() throws RecognitionException {
		Opt_attr_defsContext _localctx = new Opt_attr_defsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opt_attr_defs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(COMMA_SEPARTOR);
			setState(81);
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
		public Common_defContext common_def() {
			return getRuleContext(Common_defContext.class,0);
		}
		public Getter_setter_optionsContext getter_setter_options() {
			return getRuleContext(Getter_setter_optionsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			common_def();
			setState(84);
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
			setState(86);
			match(START_BRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GETTER_OPTION) {
				{
				setState(87);
				match(GETTER_OPTION);
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTER_OPTION) {
				{
				setState(90);
				match(SETTER_OPTION);
				}
			}

			setState(93);
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
			setState(95);
			match(CONST_START);
			setState(96);
			match(COLON_SEPARATOR);
			setState(97);
			match(START_SQRE_BRACE);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_DOUBLE_QUOTE) {
				{
				setState(98);
				const_defs();
				}
			}

			setState(101);
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
		public List<Opt_const_defsContext> opt_const_defs() {
			return getRuleContexts(Opt_const_defsContext.class);
		}
		public Opt_const_defsContext opt_const_defs(int i) {
			return getRuleContext(Opt_const_defsContext.class,i);
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
			setState(103);
			const_def();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(104);
				opt_const_defs();
				}
				}
				setState(109);
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

	public static class Opt_const_defsContext extends ParserRuleContext {
		public TerminalNode COMMA_SEPARTOR() { return getToken(ClassGenParser.COMMA_SEPARTOR, 0); }
		public Const_defContext const_def() {
			return getRuleContext(Const_defContext.class,0);
		}
		public Opt_const_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_const_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterOpt_const_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitOpt_const_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitOpt_const_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_const_defsContext opt_const_defs() throws RecognitionException {
		Opt_const_defsContext _localctx = new Opt_const_defsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opt_const_defs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(COMMA_SEPARTOR);
			setState(111);
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
			setState(113);
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
			setState(115);
			match(METHOD_START);
			setState(116);
			match(COLON_SEPARATOR);
			setState(117);
			match(START_SQRE_BRACE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_DOUBLE_QUOTE) | (1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(118);
				method_defs();
				}
			}

			setState(121);
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
		public List<Opt_method_defsContext> opt_method_defs() {
			return getRuleContexts(Opt_method_defsContext.class);
		}
		public Opt_method_defsContext opt_method_defs(int i) {
			return getRuleContext(Opt_method_defsContext.class,i);
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
			setState(123);
			method_def();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(124);
				opt_method_defs();
				}
				}
				setState(129);
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

	public static class Opt_method_defsContext extends ParserRuleContext {
		public TerminalNode COMMA_SEPARTOR() { return getToken(ClassGenParser.COMMA_SEPARTOR, 0); }
		public Method_defContext method_def() {
			return getRuleContext(Method_defContext.class,0);
		}
		public Opt_method_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_method_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterOpt_method_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitOpt_method_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitOpt_method_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_method_defsContext opt_method_defs() throws RecognitionException {
		Opt_method_defsContext _localctx = new Opt_method_defsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opt_method_defs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(COMMA_SEPARTOR);
			setState(131);
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
		public Common_defContext common_def() {
			return getRuleContext(Common_defContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			common_def();
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
			setState(135);
			match(START_DOUBLE_QUOTE);
			setState(136);
			match(TEXT_VALUE);
			setState(137);
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

	public static class Common_defContext extends ParserRuleContext {
		public Name_expContext name_exp() {
			return getRuleContext(Name_expContext.class,0);
		}
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Visibility_modContext visibility_mod() {
			return getRuleContext(Visibility_modContext.class,0);
		}
		public Common_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterCommon_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitCommon_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitCommon_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_defContext common_def() throws RecognitionException {
		Common_defContext _localctx = new Common_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_common_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(139);
				visibility_mod();
				}
			}

			setState(142);
			name_exp();
			setState(143);
			match(COLON_SEPARATOR);
			setState(144);
			type();
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
		enterRule(_localctx, 36, RULE_class_visibility_mod);
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
		enterRule(_localctx, 38, RULE_visibility_mod);
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

	public static class Default_typeContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(ClassGenParser.VOID_TYPE, 0); }
		public TerminalNode BYTE_TYPE() { return getToken(ClassGenParser.BYTE_TYPE, 0); }
		public TerminalNode SHORT_TYPE() { return getToken(ClassGenParser.SHORT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(ClassGenParser.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(ClassGenParser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ClassGenParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(ClassGenParser.DOUBLE_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(ClassGenParser.BOOLEAN_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ClassGenParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ClassGenParser.STRING_TYPE, 0); }
		public Default_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterDefault_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitDefault_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitDefault_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_typeContext default_type() throws RecognitionException {
		Default_typeContext _localctx = new Default_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_default_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_TYPE) | (1L << BYTE_TYPE) | (1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << BOOLEAN_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
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
		public Default_typeContext default_type() {
			return getRuleContext(Default_typeContext.class,0);
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
		enterRule(_localctx, 42, RULE_arr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ARRAY_TYPE);
			setState(153);
			match(START_CURL_BRACE);
			setState(154);
			default_type();
			setState(155);
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

	public static class TypeContext extends ParserRuleContext {
		public Default_typeContext default_type() {
			return getRuleContext(Default_typeContext.class,0);
		}
		public Arr_typeContext arr_type() {
			return getRuleContext(Arr_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassGenParserListener ) ((ClassGenParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassGenParserVisitor ) return ((ClassGenParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(159);
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
				setState(157);
				default_type();
				}
				break;
			case ARRAY_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\2\5\2\66\n\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\3\4\5\4@\n\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t[\n\t\3\t\5\t^\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\5\nf\n\n\3\n\3\n\3\13\3\13\7\13l\n\13\f\13\16\13o\13\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16z\n\16\3\16\3\16\3\17\3\17\7\17"+
		"\u0080\n\17\f\17\16\17\u0083\13\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\5\23\u008f\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00a2\n\30\3\30\2\2"+
		"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\20\21\3\2"+
		"\20\22\3\2\23\34\2\u009a\2\60\3\2\2\2\4:\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2"+
		"\nK\3\2\2\2\fR\3\2\2\2\16U\3\2\2\2\20X\3\2\2\2\22a\3\2\2\2\24i\3\2\2\2"+
		"\26p\3\2\2\2\30s\3\2\2\2\32u\3\2\2\2\34}\3\2\2\2\36\u0084\3\2\2\2 \u0087"+
		"\3\2\2\2\"\u0089\3\2\2\2$\u008e\3\2\2\2&\u0094\3\2\2\2(\u0096\3\2\2\2"+
		"*\u0098\3\2\2\2,\u009a\3\2\2\2.\u00a1\3\2\2\2\60\62\5\4\3\2\61\63\5\b"+
		"\5\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\22\n\2\65\64\3"+
		"\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\32\16\28\67\3\2\2\289\3\2\2\29"+
		"\3\3\2\2\2:;\7\3\2\2;<\7\16\2\2<=\5\6\4\2=\5\3\2\2\2>@\5&\24\2?>\3\2\2"+
		"\2?@\3\2\2\2@A\3\2\2\2AB\5\"\22\2B\7\3\2\2\2CD\7\4\2\2DE\7\16\2\2EG\7"+
		"\t\2\2FH\5\n\6\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\n\2\2J\t\3\2\2\2KO"+
		"\5\16\b\2LN\5\f\7\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\13\3\2\2"+
		"\2QO\3\2\2\2RS\7\17\2\2ST\5\16\b\2T\r\3\2\2\2UV\5$\23\2VW\5\20\t\2W\17"+
		"\3\2\2\2XZ\7\7\2\2Y[\7\36\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\7\37\2"+
		"\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\b\2\2`\21\3\2\2\2ab\7\5\2\2bc\7"+
		"\16\2\2ce\7\t\2\2df\5\24\13\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\n\2\2"+
		"h\23\3\2\2\2im\5\30\r\2jl\5\26\f\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2n\25\3\2\2\2om\3\2\2\2pq\7\17\2\2qr\5\30\r\2r\27\3\2\2\2st\5\"\22"+
		"\2t\31\3\2\2\2uv\7\6\2\2vw\7\16\2\2wy\7\t\2\2xz\5\34\17\2yx\3\2\2\2yz"+
		"\3\2\2\2z{\3\2\2\2{|\7\n\2\2|\33\3\2\2\2}\u0081\5 \21\2~\u0080\5\36\20"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\35\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\17\2\2\u0085\u0086"+
		"\5 \21\2\u0086\37\3\2\2\2\u0087\u0088\5$\23\2\u0088!\3\2\2\2\u0089\u008a"+
		"\7\r\2\2\u008a\u008b\7!\2\2\u008b\u008c\7\"\2\2\u008c#\3\2\2\2\u008d\u008f"+
		"\5(\25\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\5\"\22\2\u0091\u0092\7\16\2\2\u0092\u0093\5.\30\2\u0093%\3\2\2"+
		"\2\u0094\u0095\t\2\2\2\u0095\'\3\2\2\2\u0096\u0097\t\3\2\2\u0097)\3\2"+
		"\2\2\u0098\u0099\t\4\2\2\u0099+\3\2\2\2\u009a\u009b\7\35\2\2\u009b\u009c"+
		"\7\13\2\2\u009c\u009d\5*\26\2\u009d\u009e\7\f\2\2\u009e-\3\2\2\2\u009f"+
		"\u00a2\5*\26\2\u00a0\u00a2\5,\27\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2/\3\2\2\2\20\62\658?GOZ]emy\u0081\u008e\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}