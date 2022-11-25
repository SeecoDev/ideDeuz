// Generated from Paciente.g4 by ANTLR 4.7.2
package com.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PacienteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MASCULINO=3, FEMENINO=4, ACTIVO=5, VIGOROSO=6, MODERADO=7, 
		LIGERO=8, SEDENTARIO=9, METROS=10, CENTIMETROS=11, ID=12, NUMERO=13, BASURA=14, 
		PUNTUACION=15, ESPACIOS=16;
	public static final int
		RULE_calculadora = 0, RULE_texto = 1, RULE_paciente = 2, RULE_nombre = 3, 
		RULE_genero = 4, RULE_talla = 5, RULE_peso = 6, RULE_edad = 7, RULE_fa = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculadora", "texto", "paciente", "nombre", "genero", "talla", "peso", 
			"edad", "fa"
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

	@Override
	public String getGrammarFileName() { return "Paciente.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PacienteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CalculadoraContext extends ParserRuleContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public CalculadoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculadora; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitCalculadora(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculadoraContext calculadora() throws RecognitionException {
		CalculadoraContext _localctx = new CalculadoraContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculadora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			texto();
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

	public static class TextoContext extends ParserRuleContext {
		public List<PacienteContext> paciente() {
			return getRuleContexts(PacienteContext.class);
		}
		public PacienteContext paciente(int i) {
			return getRuleContext(PacienteContext.class,i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(20);
				paciente();
				}
				}
				setState(25);
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

	public static class PacienteContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public GeneroContext genero() {
			return getRuleContext(GeneroContext.class,0);
		}
		public TallaContext talla() {
			return getRuleContext(TallaContext.class,0);
		}
		public PesoContext peso() {
			return getRuleContext(PesoContext.class,0);
		}
		public EdadContext edad() {
			return getRuleContext(EdadContext.class,0);
		}
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
		}
		public PacienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paciente; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitPaciente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacienteContext paciente() throws RecognitionException {
		PacienteContext _localctx = new PacienteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paciente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			nombre();
			setState(27);
			genero();
			setState(28);
			talla();
			setState(29);
			peso();
			setState(30);
			edad();
			setState(31);
			fa();
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

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PacienteParser.ID, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
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

	public static class GeneroContext extends ParserRuleContext {
		public Token sexo;
		public TerminalNode MASCULINO() { return getToken(PacienteParser.MASCULINO, 0); }
		public TerminalNode FEMENINO() { return getToken(PacienteParser.FEMENINO, 0); }
		public GeneroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitGenero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneroContext genero() throws RecognitionException {
		GeneroContext _localctx = new GeneroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((GeneroContext)_localctx).sexo = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MASCULINO || _la==FEMENINO) ) {
				((GeneroContext)_localctx).sexo = (Token)_errHandler.recoverInline(this);
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

	public static class TallaContext extends ParserRuleContext {
		public Token medida;
		public TerminalNode NUMERO() { return getToken(PacienteParser.NUMERO, 0); }
		public TerminalNode METROS() { return getToken(PacienteParser.METROS, 0); }
		public TerminalNode CENTIMETROS() { return getToken(PacienteParser.CENTIMETROS, 0); }
		public TallaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_talla; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitTalla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TallaContext talla() throws RecognitionException {
		TallaContext _localctx = new TallaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_talla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(NUMERO);
			setState(38);
			((TallaContext)_localctx).medida = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==METROS || _la==CENTIMETROS) ) {
				((TallaContext)_localctx).medida = (Token)_errHandler.recoverInline(this);
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

	public static class PesoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(PacienteParser.NUMERO, 0); }
		public PesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitPeso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PesoContext peso() throws RecognitionException {
		PesoContext _localctx = new PesoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_peso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NUMERO);
			setState(41);
			match(T__0);
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

	public static class EdadContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(PacienteParser.NUMERO, 0); }
		public EdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edad; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitEdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdadContext edad() throws RecognitionException {
		EdadContext _localctx = new EdadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(NUMERO);
			setState(44);
			match(T__1);
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

	public static class FaContext extends ParserRuleContext {
		public Token factor;
		public TerminalNode ACTIVO() { return getToken(PacienteParser.ACTIVO, 0); }
		public TerminalNode VIGOROSO() { return getToken(PacienteParser.VIGOROSO, 0); }
		public TerminalNode MODERADO() { return getToken(PacienteParser.MODERADO, 0); }
		public TerminalNode LIGERO() { return getToken(PacienteParser.LIGERO, 0); }
		public TerminalNode SEDENTARIO() { return getToken(PacienteParser.SEDENTARIO, 0); }
		public FaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PacienteVisitor ) return ((PacienteVisitor<? extends T>)visitor).visitFa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaContext fa() throws RecognitionException {
		FaContext _localctx = new FaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((FaContext)_localctx).factor = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTIVO) | (1L << VIGOROSO) | (1L << MODERADO) | (1L << LIGERO) | (1L << SEDENTARIO))) != 0)) ) {
				((FaContext)_localctx).factor = (Token)_errHandler.recoverInline(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3"+
		"\3\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n"+
		"\f\16\20\22\2\5\3\2\5\6\3\2\f\r\3\2\7\13\2*\2\24\3\2\2\2\4\31\3\2\2\2"+
		"\6\34\3\2\2\2\b#\3\2\2\2\n%\3\2\2\2\f\'\3\2\2\2\16*\3\2\2\2\20-\3\2\2"+
		"\2\22\60\3\2\2\2\24\25\5\4\3\2\25\3\3\2\2\2\26\30\5\6\4\2\27\26\3\2\2"+
		"\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2\2"+
		"\2\34\35\5\b\5\2\35\36\5\n\6\2\36\37\5\f\7\2\37 \5\16\b\2 !\5\20\t\2!"+
		"\"\5\22\n\2\"\7\3\2\2\2#$\7\16\2\2$\t\3\2\2\2%&\t\2\2\2&\13\3\2\2\2\'"+
		"(\7\17\2\2()\t\3\2\2)\r\3\2\2\2*+\7\17\2\2+,\7\3\2\2,\17\3\2\2\2-.\7\17"+
		"\2\2./\7\4\2\2/\21\3\2\2\2\60\61\t\4\2\2\61\23\3\2\2\2\3\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}