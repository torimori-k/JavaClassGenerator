// Generated from /Users/torimori/personal_project/java/JavaClassGenerator/src/parser/ClassGenLexer.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassGenLexer extends Lexer {
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
		TEXT_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TEXT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS_START", "ATTR_START", "CONST_START", "METHOD_START", "START_BRACE", 
			"END_BRACE", "START_SQRE_BRACE", "END_SQRE_BRACE", "START_CURL_BRACE", 
			"END_CURL_BRACE", "START_DOUBLE_QUOTE", "COLON_SEPARATOR", "COMMA_SEPARTOR", 
			"PUBLIC_VISIBILITY", "PRIVATE_VISIBILITY", "PROTECTED_VISIBILITY", "VOID_TYPE", 
			"BYTE_TYPE", "SHORT_TYPE", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", 
			"BOOLEAN_TYPE", "CHAR_TYPE", "STRING_TYPE", "ARRAY_TYPE", "GETTER_OPTION", 
			"SETTER_OPTION", "WS", "TEXT_VALUE", "END_DOUBLE_QUOTE", "WS_TEXT"
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


	public ClassGenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ClassGenLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00de\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00c7\n\37\r\37\16"+
		"\37\u00c8\3\37\3\37\3 \3 \7 \u00cf\n \f \16 \u00d2\13 \3!\3!\3!\3!\3\""+
		"\6\"\u00d9\n\"\r\"\16\"\u00da\3\"\3\"\2\2#\4\3\6\4\b\5\n\6\f\7\16\b\20"+
		"\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27"+
		".\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D#\4\2\3\5\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\6\2\62;C\\aac|\2\u00df\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3"+
		"\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2"+
		"\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36"+
		"\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3"+
		"\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2"+
		"\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\3@\3\2\2\2\3B"+
		"\3\2\2\2\3D\3\2\2\2\4F\3\2\2\2\6L\3\2\2\2\bV\3\2\2\2\nb\3\2\2\2\fi\3\2"+
		"\2\2\16k\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30u\3"+
		"\2\2\2\32y\3\2\2\2\34{\3\2\2\2\36}\3\2\2\2 \177\3\2\2\2\"\u0081\3\2\2"+
		"\2$\u0083\3\2\2\2&\u0088\3\2\2\2(\u008d\3\2\2\2*\u0093\3\2\2\2,\u0097"+
		"\3\2\2\2.\u009c\3\2\2\2\60\u00a2\3\2\2\2\62\u00a9\3\2\2\2\64\u00b1\3\2"+
		"\2\2\66\u00b6\3\2\2\28\u00bd\3\2\2\2:\u00c1\3\2\2\2<\u00c3\3\2\2\2>\u00c6"+
		"\3\2\2\2@\u00cc\3\2\2\2B\u00d3\3\2\2\2D\u00d8\3\2\2\2FG\7e\2\2GH\7n\2"+
		"\2HI\7c\2\2IJ\7u\2\2JK\7u\2\2K\5\3\2\2\2LM\7c\2\2MN\7v\2\2NO\7v\2\2OP"+
		"\7t\2\2PQ\7k\2\2QR\7d\2\2RS\7w\2\2ST\7v\2\2TU\7g\2\2U\7\3\2\2\2VW\7e\2"+
		"\2WX\7q\2\2XY\7p\2\2YZ\7u\2\2Z[\7v\2\2[\\\7t\2\2\\]\7w\2\2]^\7e\2\2^_"+
		"\7v\2\2_`\7q\2\2`a\7t\2\2a\t\3\2\2\2bc\7o\2\2cd\7g\2\2de\7v\2\2ef\7j\2"+
		"\2fg\7q\2\2gh\7f\2\2h\13\3\2\2\2ij\7*\2\2j\r\3\2\2\2kl\7+\2\2l\17\3\2"+
		"\2\2mn\7]\2\2n\21\3\2\2\2op\7_\2\2p\23\3\2\2\2qr\7}\2\2r\25\3\2\2\2st"+
		"\7\177\2\2t\27\3\2\2\2uv\7$\2\2vw\3\2\2\2wx\b\f\2\2x\31\3\2\2\2yz\7<\2"+
		"\2z\33\3\2\2\2{|\7.\2\2|\35\3\2\2\2}~\7-\2\2~\37\3\2\2\2\177\u0080\7/"+
		"\2\2\u0080!\3\2\2\2\u0081\u0082\7%\2\2\u0082#\3\2\2\2\u0083\u0084\7x\2"+
		"\2\u0084\u0085\7q\2\2\u0085\u0086\7k\2\2\u0086\u0087\7f\2\2\u0087%\3\2"+
		"\2\2\u0088\u0089\7d\2\2\u0089\u008a\7{\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7g\2\2\u008c\'\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7j\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092\7v\2\2\u0092)\3\2\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096+\3\2\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b\7i\2\2\u009b"+
		"-\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7n\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1/\3\2\2\2\u00a2\u00a3\7f\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7n\2\2"+
		"\u00a7\u00a8\7g\2\2\u00a8\61\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7"+
		"q\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\u00b0\7p\2\2\u00b0\63\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3"+
		"\7j\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\65\3\2\2\2\u00b6\u00b7"+
		"\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7p\2\2\u00bb\u00bc\7i\2\2\u00bc\67\3\2\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\u00c0\7t\2\2\u00c09\3\2\2\2\u00c1\u00c2\7i\2\2\u00c2"+
		";\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4=\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\37\3\2\u00cb?\3\2\2\2\u00cc\u00d0"+
		"\t\3\2\2\u00cd\u00cf\t\4\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1A\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d3\u00d4\7$\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b!\4\2\u00d6C\3\2"+
		"\2\2\u00d7\u00d9\t\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\""+
		"\3\2\u00ddE\3\2\2\2\7\2\3\u00c8\u00d0\u00da\5\4\3\2\2\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}