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
		CLASS=1, ATTR=2, CONST=3, METHOD=4, START_BRACE=5, END_BRACE=6, START_SQRE_BRACE=7, 
		END_SQRE_BRACE=8, START_CURL_BRACE=9, END_CURL_BRACE=10, COLON_SEPARATOR=11, 
		COMMA_SEPARTOR=12, PUBLIC_VISIBILITY=13, PRIVATE_VISIBILITY=14, PROTECTED_VISIBILITY=15, 
		VOID_TYPE=16, BYTE_TYPE=17, SHORT_TYPE=18, INT_TYPE=19, LONG_TYPE=20, 
		FLOAT_TYPE=21, DOUBLE_TYPE=22, BOOLEAN_TYPE=23, CHAR_TYPE=24, STRING_TYPE=25, 
		ARRAY_TYPE=26, GETTER_OPTION=27, SETTER_OPTION=28, WS=29, TEXT_VALUE=30, 
		WS_TEXT=31;
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
			"CLASS", "ATTR", "CONST", "METHOD", "START_BRACE", "END_BRACE", "START_SQRE_BRACE", 
			"END_SQRE_BRACE", "START_CURL_BRACE", "END_CURL_BRACE", "COLON_SEPARATOR", 
			"COMMA_SEPARTOR", "PUBLIC_VISIBILITY", "PRIVATE_VISIBILITY", "PROTECTED_VISIBILITY", 
			"VOID_TYPE", "BYTE_TYPE", "SHORT_TYPE", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", 
			"DOUBLE_TYPE", "BOOLEAN_TYPE", "CHAR_TYPE", "STRING_TYPE", "ARRAY_TYPE", 
			"GETTER_OPTION", "SETTER_OPTION", "WS", "TEXT_VALUE", "WS_TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'attribute'", "'constructor'", "'method'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "':'", "','", "'+'", "'-'", "'#'", "'void'", 
			"'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'boolean'", 
			"'char'", "'string'", "'arr'", "'g'", "'s'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ATTR", "CONST", "METHOD", "START_BRACE", "END_BRACE", 
			"START_SQRE_BRACE", "END_SQRE_BRACE", "START_CURL_BRACE", "END_CURL_BRACE", 
			"COLON_SEPARATOR", "COMMA_SEPARTOR", "PUBLIC_VISIBILITY", "PRIVATE_VISIBILITY", 
			"PROTECTED_VISIBILITY", "VOID_TYPE", "BYTE_TYPE", "SHORT_TYPE", "INT_TYPE", 
			"LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "BOOLEAN_TYPE", "CHAR_TYPE", 
			"STRING_TYPE", "ARRAY_TYPE", "GETTER_OPTION", "SETTER_OPTION", "WS", 
			"TEXT_VALUE", "WS_TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d2\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\6\36\u00bf\n\36\r\36\16\36\u00c0\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \6 \u00cd\n \r \16 \u00ce\3 \3 \2\2!\4\3\6\4\b"+
		"\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$"+
		"\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!\4\2\3"+
		"\5\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\2\u00d2\2\4\3\2\2\2\2\6"+
		"\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2"+
		"\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34"+
		"\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2("+
		"\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2"+
		"\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\3>\3\2\2\2\3"+
		"@\3\2\2\2\4B\3\2\2\2\6H\3\2\2\2\bR\3\2\2\2\n^\3\2\2\2\fe\3\2\2\2\16g\3"+
		"\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32"+
		"s\3\2\2\2\34u\3\2\2\2\36w\3\2\2\2 y\3\2\2\2\"{\3\2\2\2$\u0080\3\2\2\2"+
		"&\u0085\3\2\2\2(\u008b\3\2\2\2*\u008f\3\2\2\2,\u0094\3\2\2\2.\u009a\3"+
		"\2\2\2\60\u00a1\3\2\2\2\62\u00a9\3\2\2\2\64\u00ae\3\2\2\2\66\u00b5\3\2"+
		"\2\28\u00b9\3\2\2\2:\u00bb\3\2\2\2<\u00be\3\2\2\2>\u00c4\3\2\2\2@\u00cc"+
		"\3\2\2\2BC\7e\2\2CD\7n\2\2DE\7c\2\2EF\7u\2\2FG\7u\2\2G\5\3\2\2\2HI\7c"+
		"\2\2IJ\7v\2\2JK\7v\2\2KL\7t\2\2LM\7k\2\2MN\7d\2\2NO\7w\2\2OP\7v\2\2PQ"+
		"\7g\2\2Q\7\3\2\2\2RS\7e\2\2ST\7q\2\2TU\7p\2\2UV\7u\2\2VW\7v\2\2WX\7t\2"+
		"\2XY\7w\2\2YZ\7e\2\2Z[\7v\2\2[\\\7q\2\2\\]\7t\2\2]\t\3\2\2\2^_\7o\2\2"+
		"_`\7g\2\2`a\7v\2\2ab\7j\2\2bc\7q\2\2cd\7f\2\2d\13\3\2\2\2ef\7*\2\2f\r"+
		"\3\2\2\2gh\7+\2\2h\17\3\2\2\2ij\7]\2\2j\21\3\2\2\2kl\7_\2\2l\23\3\2\2"+
		"\2mn\7}\2\2n\25\3\2\2\2op\7\177\2\2p\27\3\2\2\2qr\7<\2\2r\31\3\2\2\2s"+
		"t\7.\2\2t\33\3\2\2\2uv\7-\2\2v\35\3\2\2\2wx\7/\2\2x\37\3\2\2\2yz\7%\2"+
		"\2z!\3\2\2\2{|\7x\2\2|}\7q\2\2}~\7k\2\2~\177\7f\2\2\177#\3\2\2\2\u0080"+
		"\u0081\7d\2\2\u0081\u0082\7{\2\2\u0082\u0083\7v\2\2\u0083\u0084\7g\2\2"+
		"\u0084%\3\2\2\2\u0085\u0086\7u\2\2\u0086\u0087\7j\2\2\u0087\u0088\7q\2"+
		"\2\u0088\u0089\7t\2\2\u0089\u008a\7v\2\2\u008a\'\3\2\2\2\u008b\u008c\7"+
		"k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e)\3\2\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7q\2\2\u0091\u0092\7p\2\2\u0092\u0093\7i\2\2\u0093"+
		"+\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099-\3\2\2\2\u009a\u009b\7f\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7w\2\2\u009d\u009e\7d\2\2\u009e\u009f\7n\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0/\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7q\2"+
		"\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\61\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab"+
		"\7j\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7t\2\2\u00ad\63\3\2\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7i\2\2\u00b4\65\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7t\2\2\u00b8\67\3\2\2\2\u00b9\u00ba\7i\2\2\u00ba"+
		"9\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc;\3\2\2\2\u00bd\u00bf\t\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\36\2\2\u00c3=\3\2\2\2\u00c4\u00c5"+
		"\7$\2\2\u00c5\u00c6\t\3\2\2\u00c6\u00c7\t\4\2\2\u00c7\u00c8\7$\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\b\37\3\2\u00ca?\3\2\2\2\u00cb\u00cd\t\2\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b \2\2\u00d1A\3\2\2\2\6\2\3\u00c0"+
		"\u00ce\4\2\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}