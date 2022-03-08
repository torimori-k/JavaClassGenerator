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
		RULE_attr_defs = 4, RULE_attr_def = 5, RULE_getter_setter_options = 6, 
		RULE_const_stmt = 7, RULE_const_defs = 8, RULE_const_def = 9, RULE_method_stmt = 10, 
		RULE_method_defs = 11, RULE_method_def = 12, RULE_class_visibility_mod = 13, 
		RULE_visibility_mod = 14, RULE_default_type = 15, RULE_arr_type = 16, 
		RULE_type = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_stmt", "class_def", "attr_stmt", "attr_defs", "attr_def", 
			"getter_setter_options", "const_stmt", "const_defs", "const_def", "method_stmt", 
			"method_defs", "method_def", "class_visibility_mod", "visibility_mod", 
			"default_type", "arr_type", "type"
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
			setState(36);
			class_stmt();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR_START) {
				{
				setState(37);
				attr_stmt();
				}
			}

			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST_START) {
				{
				setState(40);
				const_stmt();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==METHOD_START) {
				{
				setState(43);
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
			setState(46);
			match(CLASS_START);
			setState(47);
			match(COLON_SEPARATOR);
			setState(48);
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
		public TerminalNode START_DOUBLE_QUOTE() { return getToken(ClassGenParser.START_DOUBLE_QUOTE, 0); }
		public TerminalNode TEXT_VALUE() { return getToken(ClassGenParser.TEXT_VALUE, 0); }
		public TerminalNode END_DOUBLE_QUOTE() { return getToken(ClassGenParser.END_DOUBLE_QUOTE, 0); }
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC_VISIBILITY || _la==PRIVATE_VISIBILITY) {
				{
				setState(50);
				class_visibility_mod();
				}
			}

			setState(53);
			match(START_DOUBLE_QUOTE);
			setState(54);
			match(TEXT_VALUE);
			setState(55);
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
			setState(57);
			match(ATTR_START);
			setState(58);
			match(COLON_SEPARATOR);
			setState(59);
			match(START_SQRE_BRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_DOUBLE_QUOTE) | (1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(60);
				attr_defs();
				}
			}

			setState(63);
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
		public List<Attr_defContext> attr_def() {
			return getRuleContexts(Attr_defContext.class);
		}
		public Attr_defContext attr_def(int i) {
			return getRuleContext(Attr_defContext.class,i);
		}
		public List<TerminalNode> COMMA_SEPARTOR() { return getTokens(ClassGenParser.COMMA_SEPARTOR); }
		public TerminalNode COMMA_SEPARTOR(int i) {
			return getToken(ClassGenParser.COMMA_SEPARTOR, i);
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
			setState(65);
			attr_def();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(66);
				match(COMMA_SEPARTOR);
				setState(67);
				attr_def();
				}
				}
				setState(72);
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

	public static class Attr_defContext extends ParserRuleContext {
		public TerminalNode START_DOUBLE_QUOTE() { return getToken(ClassGenParser.START_DOUBLE_QUOTE, 0); }
		public TerminalNode TEXT_VALUE() { return getToken(ClassGenParser.TEXT_VALUE, 0); }
		public TerminalNode END_DOUBLE_QUOTE() { return getToken(ClassGenParser.END_DOUBLE_QUOTE, 0); }
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode START_BRACE() { return getToken(ClassGenParser.START_BRACE, 0); }
		public Getter_setter_optionsContext getter_setter_options() {
			return getRuleContext(Getter_setter_optionsContext.class,0);
		}
		public TerminalNode END_BRACE() { return getToken(ClassGenParser.END_BRACE, 0); }
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
		enterRule(_localctx, 10, RULE_attr_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(73);
				visibility_mod();
				}
			}

			setState(76);
			match(START_DOUBLE_QUOTE);
			setState(77);
			match(TEXT_VALUE);
			setState(78);
			match(END_DOUBLE_QUOTE);
			setState(79);
			match(COLON_SEPARATOR);
			setState(80);
			type();
			setState(81);
			match(START_BRACE);
			setState(82);
			getter_setter_options();
			setState(83);
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

	public static class Getter_setter_optionsContext extends ParserRuleContext {
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
		enterRule(_localctx, 12, RULE_getter_setter_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GETTER_OPTION) {
				{
				setState(85);
				match(GETTER_OPTION);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETTER_OPTION) {
				{
				setState(88);
				match(SETTER_OPTION);
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
		enterRule(_localctx, 14, RULE_const_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CONST_START);
			setState(92);
			match(COLON_SEPARATOR);
			setState(93);
			match(START_SQRE_BRACE);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_DOUBLE_QUOTE) {
				{
				setState(94);
				const_defs();
				}
			}

			setState(97);
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
		public List<Const_defContext> const_def() {
			return getRuleContexts(Const_defContext.class);
		}
		public Const_defContext const_def(int i) {
			return getRuleContext(Const_defContext.class,i);
		}
		public List<TerminalNode> COMMA_SEPARTOR() { return getTokens(ClassGenParser.COMMA_SEPARTOR); }
		public TerminalNode COMMA_SEPARTOR(int i) {
			return getToken(ClassGenParser.COMMA_SEPARTOR, i);
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
		enterRule(_localctx, 16, RULE_const_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			const_def();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(100);
				match(COMMA_SEPARTOR);
				setState(101);
				const_def();
				}
				}
				setState(106);
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

	public static class Const_defContext extends ParserRuleContext {
		public TerminalNode START_DOUBLE_QUOTE() { return getToken(ClassGenParser.START_DOUBLE_QUOTE, 0); }
		public TerminalNode TEXT_VALUE() { return getToken(ClassGenParser.TEXT_VALUE, 0); }
		public TerminalNode END_DOUBLE_QUOTE() { return getToken(ClassGenParser.END_DOUBLE_QUOTE, 0); }
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
		enterRule(_localctx, 18, RULE_const_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(START_DOUBLE_QUOTE);
			setState(108);
			match(TEXT_VALUE);
			setState(109);
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
		enterRule(_localctx, 20, RULE_method_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(METHOD_START);
			setState(112);
			match(COLON_SEPARATOR);
			setState(113);
			match(START_SQRE_BRACE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_DOUBLE_QUOTE) | (1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(114);
				method_defs();
				}
			}

			setState(117);
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
		public List<Method_defContext> method_def() {
			return getRuleContexts(Method_defContext.class);
		}
		public Method_defContext method_def(int i) {
			return getRuleContext(Method_defContext.class,i);
		}
		public List<TerminalNode> COMMA_SEPARTOR() { return getTokens(ClassGenParser.COMMA_SEPARTOR); }
		public TerminalNode COMMA_SEPARTOR(int i) {
			return getToken(ClassGenParser.COMMA_SEPARTOR, i);
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
		enterRule(_localctx, 22, RULE_method_defs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			method_def();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SEPARTOR) {
				{
				{
				setState(120);
				match(COMMA_SEPARTOR);
				setState(121);
				method_def();
				}
				}
				setState(126);
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

	public static class Method_defContext extends ParserRuleContext {
		public TerminalNode START_DOUBLE_QUOTE() { return getToken(ClassGenParser.START_DOUBLE_QUOTE, 0); }
		public TerminalNode TEXT_VALUE() { return getToken(ClassGenParser.TEXT_VALUE, 0); }
		public TerminalNode END_DOUBLE_QUOTE() { return getToken(ClassGenParser.END_DOUBLE_QUOTE, 0); }
		public TerminalNode COLON_SEPARATOR() { return getToken(ClassGenParser.COLON_SEPARATOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 24, RULE_method_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_VISIBILITY) | (1L << PRIVATE_VISIBILITY) | (1L << PROTECTED_VISIBILITY))) != 0)) {
				{
				setState(127);
				visibility_mod();
				}
			}

			setState(130);
			match(START_DOUBLE_QUOTE);
			setState(131);
			match(TEXT_VALUE);
			setState(132);
			match(END_DOUBLE_QUOTE);
			setState(133);
			match(COLON_SEPARATOR);
			setState(134);
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
		enterRule(_localctx, 26, RULE_class_visibility_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 28, RULE_visibility_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 30, RULE_default_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		enterRule(_localctx, 32, RULE_arr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ARRAY_TYPE);
			setState(143);
			match(START_CURL_BRACE);
			setState(144);
			default_type();
			setState(145);
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
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(149);
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
				setState(147);
				default_type();
				}
				break;
			case ARRAY_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u009a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\5\2,\n\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3"+
		"\3\4\5\4\66\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\5\7M\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\5\bY\n\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\5\tb\n\t\3\t\3\t"+
		"\3\n\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\5\fv\n\f\3\f\3\f\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\16\5\16"+
		"\u0083\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u0098\n\23\3\23\2\2\24\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\20\21\3\2\20\22\3\2\23\34"+
		"\2\u0096\2&\3\2\2\2\4\60\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\nC\3\2\2\2\f"+
		"L\3\2\2\2\16X\3\2\2\2\20]\3\2\2\2\22e\3\2\2\2\24m\3\2\2\2\26q\3\2\2\2"+
		"\30y\3\2\2\2\32\u0082\3\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u008e"+
		"\3\2\2\2\"\u0090\3\2\2\2$\u0097\3\2\2\2&(\5\4\3\2\')\5\b\5\2(\'\3\2\2"+
		"\2()\3\2\2\2)+\3\2\2\2*,\5\20\t\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\5\26"+
		"\f\2.-\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60\61\7\3\2\2\61\62\7\16\2\2\62\63"+
		"\5\6\4\2\63\5\3\2\2\2\64\66\5\34\17\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67"+
		"\3\2\2\2\678\7\r\2\289\7!\2\29:\7\"\2\2:\7\3\2\2\2;<\7\4\2\2<=\7\16\2"+
		"\2=?\7\t\2\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\n\2\2B\t\3\2"+
		"\2\2CH\5\f\7\2DE\7\17\2\2EG\5\f\7\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2I\13\3\2\2\2JH\3\2\2\2KM\5\36\20\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2"+
		"NO\7\r\2\2OP\7!\2\2PQ\7\"\2\2QR\7\16\2\2RS\5$\23\2ST\7\7\2\2TU\5\16\b"+
		"\2UV\7\b\2\2V\r\3\2\2\2WY\7\36\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7"+
		"\37\2\2[Z\3\2\2\2[\\\3\2\2\2\\\17\3\2\2\2]^\7\5\2\2^_\7\16\2\2_a\7\t\2"+
		"\2`b\5\22\n\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\n\2\2d\21\3\2\2\2ej\5"+
		"\24\13\2fg\7\17\2\2gi\5\24\13\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2k\23\3\2\2\2lj\3\2\2\2mn\7\r\2\2no\7!\2\2op\7\"\2\2p\25\3\2\2\2qr\7"+
		"\6\2\2rs\7\16\2\2su\7\t\2\2tv\5\30\r\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2w"+
		"x\7\n\2\2x\27\3\2\2\2y~\5\32\16\2z{\7\17\2\2{}\5\32\16\2|z\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\5\36\20\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\7\r\2\2\u0085\u0086\7!\2\2\u0086\u0087\7\"\2\2\u0087\u0088"+
		"\7\16\2\2\u0088\u0089\5$\23\2\u0089\33\3\2\2\2\u008a\u008b\t\2\2\2\u008b"+
		"\35\3\2\2\2\u008c\u008d\t\3\2\2\u008d\37\3\2\2\2\u008e\u008f\t\4\2\2\u008f"+
		"!\3\2\2\2\u0090\u0091\7\35\2\2\u0091\u0092\7\13\2\2\u0092\u0093\5 \21"+
		"\2\u0093\u0094\7\f\2\2\u0094#\3\2\2\2\u0095\u0098\5 \21\2\u0096\u0098"+
		"\5\"\22\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098%\3\2\2\2\21(+"+
		".\65?HLX[aju~\u0082\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}