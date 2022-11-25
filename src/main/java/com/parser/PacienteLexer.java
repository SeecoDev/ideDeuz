// Generated from Paciente.g4 by ANTLR 4.7.2
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
public class PacienteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MASCULINO=3, FEMENINO=4, ACTIVO=5, VIGOROSO=6, MODERADO=7, 
		LIGERO=8, SEDENTARIO=9, METROS=10, CENTIMETROS=11, ID=12, NUMERO=13, BASURA=14, 
		PUNTUACION=15, ESPACIOS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "MASCULINO", "FEMENINO", "ACTIVO", "VIGOROSO", "MODERADO", 
			"LIGERO", "SEDENTARIO", "METROS", "CENTIMETROS", "ID", "NUMERO", "BASURA", 
			"PUNTUACION", "ESPACIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'kg'", "' a\u00F1os'", null, null, null, null, null, null, null, 
			"'m'", "'cm'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MASCULINO", "FEMENINO", "ACTIVO", "VIGOROSO", "MODERADO", 
			"LIGERO", "SEDENTARIO", "METROS", "CENTIMETROS", "ID", "NUMERO", "BASURA", 
			"PUNTUACION", "ESPACIOS"
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


	public PacienteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Paciente.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\6\r\u00b0\n\r\r\r\16\r\u00b1\3\16\7\16\u00b5\n"+
		"\16\f\16\16\16\u00b8\13\16\3\16\5\16\u00bb\n\16\3\16\6\16\u00be\n\16\r"+
		"\16\16\16\u00bf\3\17\6\17\u00c3\n\17\r\17\16\17\u00c4\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\6\21\u00ce\n\21\r\21\16\21\u00cf\3\21\3\21\2\2\22\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22\3\2\b\3\2C\\\3\2c|\3\2\62;\4\2C\\c|\5\2..\60\60<<\5\2\13\f\17"+
		"\17\"\"\2\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7>\3\2\2\2\tP\3\2\2\2\13^\3\2\2\2\rp\3\2"+
		"\2\2\17\u0082\3\2\2\2\21\u0090\3\2\2\2\23\u00a6\3\2\2\2\25\u00a8\3\2\2"+
		"\2\27\u00aa\3\2\2\2\31\u00ad\3\2\2\2\33\u00ba\3\2\2\2\35\u00c2\3\2\2\2"+
		"\37\u00c8\3\2\2\2!\u00cd\3\2\2\2#$\7m\2\2$%\7i\2\2%\4\3\2\2\2&\'\7\"\2"+
		"\2\'(\7c\2\2()\7\u00f3\2\2)*\7q\2\2*+\7u\2\2+\6\3\2\2\2,-\7O\2\2-.\7c"+
		"\2\2./\7u\2\2/\60\7e\2\2\60\61\7w\2\2\61\62\7n\2\2\62\63\7k\2\2\63\64"+
		"\7p\2\2\64?\7q\2\2\65\66\7o\2\2\66\67\7c\2\2\678\7u\2\289\7e\2\29:\7w"+
		"\2\2:;\7n\2\2;<\7k\2\2<=\7p\2\2=?\7q\2\2>,\3\2\2\2>\65\3\2\2\2?\b\3\2"+
		"\2\2@A\7H\2\2AB\7g\2\2BC\7o\2\2CD\7g\2\2DE\7p\2\2EF\7k\2\2FG\7p\2\2GQ"+
		"\7q\2\2HI\7h\2\2IJ\7g\2\2JK\7o\2\2KL\7g\2\2LM\7p\2\2MN\7k\2\2NO\7p\2\2"+
		"OQ\7q\2\2P@\3\2\2\2PH\3\2\2\2Q\n\3\2\2\2RS\7C\2\2ST\7e\2\2TU\7v\2\2UV"+
		"\7k\2\2VW\7x\2\2W_\7q\2\2XY\7c\2\2YZ\7e\2\2Z[\7v\2\2[\\\7k\2\2\\]\7x\2"+
		"\2]_\7q\2\2^R\3\2\2\2^X\3\2\2\2_\f\3\2\2\2`a\7X\2\2ab\7k\2\2bc\7i\2\2"+
		"cd\7q\2\2de\7t\2\2ef\7q\2\2fg\7u\2\2gq\7q\2\2hi\7x\2\2ij\7k\2\2jk\7i\2"+
		"\2kl\7q\2\2lm\7t\2\2mn\7q\2\2no\7u\2\2oq\7q\2\2p`\3\2\2\2ph\3\2\2\2q\16"+
		"\3\2\2\2rs\7O\2\2st\7q\2\2tu\7f\2\2uv\7g\2\2vw\7t\2\2wx\7c\2\2xy\7f\2"+
		"\2y\u0083\7q\2\2z{\7o\2\2{|\7q\2\2|}\7f\2\2}~\7g\2\2~\177\7t\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7f\2\2\u0081\u0083\7q\2\2\u0082r\3\2\2\2\u0082z\3"+
		"\2\2\2\u0083\20\3\2\2\2\u0084\u0085\7N\2\2\u0085\u0086\7k\2\2\u0086\u0087"+
		"\7i\2\2\u0087\u0088\7g\2\2\u0088\u0089\7t\2\2\u0089\u0091\7q\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7k\2\2\u008c\u008d\7i\2\2\u008d\u008e\7g\2\2"+
		"\u008e\u008f\7t\2\2\u008f\u0091\7q\2\2\u0090\u0084\3\2\2\2\u0090\u008a"+
		"\3\2\2\2\u0091\22\3\2\2\2\u0092\u0093\7U\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7f\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2"+
		"\u0098\u0099\7c\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b\u00a7"+
		"\7q\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\u009f\7f\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7c\2\2"+
		"\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a7\7q\2\2\u00a6\u0092"+
		"\3\2\2\2\u00a6\u009c\3\2\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\26\3\2\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7o\2\2\u00ac\30\3\2\2\2\u00ad"+
		"\u00af\t\2\2\2\u00ae\u00b0\t\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\32\3\2\2\2\u00b3\u00b5"+
		"\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\60"+
		"\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\34\3\2\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\b\17\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\t\6\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\20\2\2\u00cb \3\2\2\2\u00cc\u00ce"+
		"\t\7\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\21\2\2\u00d2\"\3\2\2"+
		"\2\20\2>P^p\u0082\u0090\u00a6\u00b1\u00b6\u00ba\u00bf\u00c4\u00cf\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}