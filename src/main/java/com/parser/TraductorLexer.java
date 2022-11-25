// Generated from Traductor.g4 by ANTLR 4.7.2
package com.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraductorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IF=3, ELSE=4, FOR=5, FLOAT=6, VOID=7, MAIN=8, PRINT=9, 
		TRUE=10, FALSE=11, OR=12, AND=13, IGUALACION=14, DIFERENTE=15, MAYOR=16, 
		MENOR=17, MAYORIGUAL=18, MENORIGUAL=19, IGUAL=20, POW=21, SQRT=22, SUM=23, 
		RES=24, MUL=25, DIV=26, PA=27, PC=28, LA=29, LC=30, COMMENT=31, COMMENTLINEA=32, 
		ID=33, NUMERO=34, STRING=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IF", "ELSE", "FOR", "FLOAT", "VOID", "MAIN", "PRINT", 
			"TRUE", "FALSE", "OR", "AND", "IGUALACION", "DIFERENTE", "MAYOR", "MENOR", 
			"MAYORIGUAL", "MENORIGUAL", "IGUAL", "POW", "SQRT", "SUM", "RES", "MUL", 
			"DIV", "PA", "PC", "LA", "LC", "COMMENT", "COMMENTLINEA", "ID", "NUMERO", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'!'", "'if'", "'else'", "'for'", "'float'", "'void'", "'main'", 
			"'printf'", "'True'", "'False'", "'||'", "'&&'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'='", "'**'", "'*/'", "'+'", "'-'", "'*'", "'/'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IF", "ELSE", "FOR", "FLOAT", "VOID", "MAIN", "PRINT", 
			"TRUE", "FALSE", "OR", "AND", "IGUALACION", "DIFERENTE", "MAYOR", "MENOR", 
			"MAYORIGUAL", "MENORIGUAL", "IGUAL", "POW", "SQRT", "SUM", "RES", "MUL", 
			"DIV", "PA", "PC", "LA", "LC", "COMMENT", "COMMENTLINEA", "ID", "NUMERO", 
			"STRING", "WS"
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


	public TraductorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Traductor.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \7 \u00b0\n \f \16"+
		" \u00b3\13 \3 \3 \3 \3 \3 \3!\3!\3!\3!\7!\u00be\n!\f!\16!\u00c1\13!\3"+
		"!\3!\3\"\3\"\7\"\u00c7\n\"\f\"\16\"\u00ca\13\"\3#\7#\u00cd\n#\f#\16#\u00d0"+
		"\13#\3#\5#\u00d3\n#\3#\6#\u00d6\n#\r#\16#\u00d7\3$\3$\3$\3$\7$\u00de\n"+
		"$\f$\16$\u00e1\13$\3$\3$\3%\6%\u00e6\n%\r%\16%\u00e7\3%\3%\4\u00b1\u00df"+
		"\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&\3\2\b\4\2\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\3\2\62;"+
		"\3\2\60\60\5\2\13\f\17\17\"\"\2\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2"+
		"\2\7O\3\2\2\2\tR\3\2\2\2\13W\3\2\2\2\r[\3\2\2\2\17a\3\2\2\2\21f\3\2\2"+
		"\2\23k\3\2\2\2\25r\3\2\2\2\27w\3\2\2\2\31}\3\2\2\2\33\u0080\3\2\2\2\35"+
		"\u0083\3\2\2\2\37\u0086\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3"+
		"\2\2\2\'\u0090\3\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009b"+
		"\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3"+
		"\2\2\29\u00a5\3\2\2\2;\u00a7\3\2\2\2=\u00a9\3\2\2\2?\u00ab\3\2\2\2A\u00b9"+
		"\3\2\2\2C\u00c4\3\2\2\2E\u00d2\3\2\2\2G\u00d9\3\2\2\2I\u00e5\3\2\2\2K"+
		"L\7=\2\2L\4\3\2\2\2MN\7#\2\2N\6\3\2\2\2OP\7k\2\2PQ\7h\2\2Q\b\3\2\2\2R"+
		"S\7g\2\2ST\7n\2\2TU\7u\2\2UV\7g\2\2V\n\3\2\2\2WX\7h\2\2XY\7q\2\2YZ\7t"+
		"\2\2Z\f\3\2\2\2[\\\7h\2\2\\]\7n\2\2]^\7q\2\2^_\7c\2\2_`\7v\2\2`\16\3\2"+
		"\2\2ab\7x\2\2bc\7q\2\2cd\7k\2\2de\7f\2\2e\20\3\2\2\2fg\7o\2\2gh\7c\2\2"+
		"hi\7k\2\2ij\7p\2\2j\22\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7k\2\2no\7p\2\2op\7"+
		"v\2\2pq\7h\2\2q\24\3\2\2\2rs\7V\2\2st\7t\2\2tu\7w\2\2uv\7g\2\2v\26\3\2"+
		"\2\2wx\7H\2\2xy\7c\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|\30\3\2\2\2}~\7~\2\2"+
		"~\177\7~\2\2\177\32\3\2\2\2\u0080\u0081\7(\2\2\u0081\u0082\7(\2\2\u0082"+
		"\34\3\2\2\2\u0083\u0084\7?\2\2\u0084\u0085\7?\2\2\u0085\36\3\2\2\2\u0086"+
		"\u0087\7#\2\2\u0087\u0088\7?\2\2\u0088 \3\2\2\2\u0089\u008a\7@\2\2\u008a"+
		"\"\3\2\2\2\u008b\u008c\7>\2\2\u008c$\3\2\2\2\u008d\u008e\7@\2\2\u008e"+
		"\u008f\7?\2\2\u008f&\3\2\2\2\u0090\u0091\7>\2\2\u0091\u0092\7?\2\2\u0092"+
		"(\3\2\2\2\u0093\u0094\7?\2\2\u0094*\3\2\2\2\u0095\u0096\7,\2\2\u0096\u0097"+
		"\7,\2\2\u0097,\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\7\61\2\2\u009a."+
		"\3\2\2\2\u009b\u009c\7-\2\2\u009c\60\3\2\2\2\u009d\u009e\7/\2\2\u009e"+
		"\62\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2"+
		"\66\3\2\2\2\u00a3\u00a4\7*\2\2\u00a48\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6"+
		":\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8<\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa"+
		">\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00ad\7,\2\2\u00ad\u00b1\3\2\2\2"+
		"\u00ae\u00b0\13\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7,\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b "+
		"\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bf"+
		"\3\2\2\2\u00bc\u00be\n\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c3\b!\2\2\u00c3B\3\2\2\2\u00c4\u00c8\t\3\2\2\u00c5\u00c7"+
		"\t\4\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9D\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\t\5\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\t\6\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\t\5"+
		"\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8F\3\2\2\2\u00d9\u00df\7$\2\2\u00da\u00db\7^\2\2\u00db"+
		"\u00de\7$\2\2\u00dc\u00de\13\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7$\2\2\u00e3H\3\2\2\2\u00e4"+
		"\u00e6\t\7\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b%\2\2\u00ea"+
		"J\3\2\2\2\f\2\u00b1\u00bf\u00c8\u00ce\u00d2\u00d7\u00dd\u00df\u00e7\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}