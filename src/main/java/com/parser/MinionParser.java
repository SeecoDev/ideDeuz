// Generated from Minion.g4 by ANTLR 4.7.2
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
public class MinionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FLOAT=3, VOID=4, MAIN=5, PRINT=6, IF=7, FOR=8, ELSE=9, 
		TRUE=10, FALSE=11, OR=12, AND=13, IGUALACION=14, DIFERENTE=15, MAYOR=16, 
		MENOR=17, MAYORIGUAL=18, MENORIGUAL=19, IGUAL=20, POW=21, SQRT=22, SUM=23, 
		RES=24, MUL=25, DIV=26, PA=27, PC=28, LA=29, LC=30, COMMENT=31, COMMENTLINEA=32, 
		ID=33, NUMERO=34, STRING=35, WS=36;
	public static final int
		RULE_programa = 0, RULE_encabezado = 1, RULE_instrucciones = 2, RULE_declaracion = 3, 
		RULE_declaracion2 = 4, RULE_impresion2 = 5, RULE_impresion = 6, RULE_asignacion = 7, 
		RULE_ifBasico = 8, RULE_elseBasico = 9, RULE_elseif = 10, RULE_forBasico = 11, 
		RULE_condicion = 12, RULE_expr = 13, RULE_tipo_dato = 14, RULE_incremento = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "encabezado", "instrucciones", "declaracion", "declaracion2", 
			"impresion2", "impresion", "asignacion", "ifBasico", "elseBasico", "elseif", 
			"forBasico", "condicion", "expr", "tipo_dato", "incremento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'!'", "'dul'", "'papoi'", "'banana'", "'poopaye'", "'hana'", 
			"'chasy'", "'sae'", "'True'", "'False'", "'||'", "'&&'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'='", "'**'", "'*/'", "'+'", "'-'", "'*'", 
			"'/'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FLOAT", "VOID", "MAIN", "PRINT", "IF", "FOR", "ELSE", 
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

	@Override
	public String getGrammarFileName() { return "Minion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public TerminalNode LA() { return getToken(MinionParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(MinionParser.LC, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			encabezado();
			setState(33);
			match(LA);
			setState(34);
			instrucciones();
			setState(35);
			match(LC);
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

	public static class EncabezadoContext extends ParserRuleContext {
		public EncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
	 
		public EncabezadoContext() { }
		public void copyFrom(EncabezadoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EncabechadContext extends EncabezadoContext {
		public TerminalNode VOID() { return getToken(MinionParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(MinionParser.MAIN, 0); }
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public EncabechadContext(EncabezadoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitEncabechad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_encabezado);
		try {
			_localctx = new EncabechadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(VOID);
			setState(38);
			match(MAIN);
			setState(39);
			match(PA);
			setState(40);
			match(PC);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<Declaracion2Context> declaracion2() {
			return getRuleContexts(Declaracion2Context.class);
		}
		public Declaracion2Context declaracion2(int i) {
			return getRuleContext(Declaracion2Context.class,i);
		}
		public List<ImpresionContext> impresion() {
			return getRuleContexts(ImpresionContext.class);
		}
		public ImpresionContext impresion(int i) {
			return getRuleContext(ImpresionContext.class,i);
		}
		public List<Impresion2Context> impresion2() {
			return getRuleContexts(Impresion2Context.class);
		}
		public Impresion2Context impresion2(int i) {
			return getRuleContext(Impresion2Context.class,i);
		}
		public List<IfBasicoContext> ifBasico() {
			return getRuleContexts(IfBasicoContext.class);
		}
		public IfBasicoContext ifBasico(int i) {
			return getRuleContext(IfBasicoContext.class,i);
		}
		public List<ForBasicoContext> forBasico() {
			return getRuleContexts(ForBasicoContext.class);
		}
		public ForBasicoContext forBasico(int i) {
			return getRuleContext(ForBasicoContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << PRINT) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42);
					asignacion();
					}
					break;
				case 2:
					{
					setState(43);
					declaracion();
					}
					break;
				case 3:
					{
					setState(44);
					declaracion2();
					}
					break;
				case 4:
					{
					setState(45);
					impresion();
					}
					break;
				case 5:
					{
					setState(46);
					impresion2();
					}
					break;
				case 6:
					{
					setState(47);
					ifBasico();
					}
					break;
				case 7:
					{
					setState(48);
					forBasico();
					}
					break;
				}
				}
				setState(53);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	 
		public DeclaracionContext() { }
		public void copyFrom(DeclaracionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracionSimpleContext extends DeclaracionContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MinionParser.ID, 0); }
		public DeclaracionSimpleContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitDeclaracionSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			_localctx = new DeclaracionSimpleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			tipo_dato();
			setState(55);
			match(ID);
			setState(56);
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

	public static class Declaracion2Context extends ParserRuleContext {
		public Declaracion2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion2; }
	 
		public Declaracion2Context() { }
		public void copyFrom(Declaracion2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracionAsignacionContext extends Declaracion2Context {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MinionParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MinionParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionAsignacionContext(Declaracion2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitDeclaracionAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion2Context declaracion2() throws RecognitionException {
		Declaracion2Context _localctx = new Declaracion2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion2);
		try {
			_localctx = new DeclaracionAsignacionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			tipo_dato();
			setState(59);
			match(ID);
			setState(60);
			match(IGUAL);
			setState(61);
			expr(0);
			setState(62);
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

	public static class Impresion2Context extends ParserRuleContext {
		public Impresion2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion2; }
	 
		public Impresion2Context() { }
		public void copyFrom(Impresion2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpresionStringContext extends Impresion2Context {
		public TerminalNode PRINT() { return getToken(MinionParser.PRINT, 0); }
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public TerminalNode STRING() { return getToken(MinionParser.STRING, 0); }
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public ImpresionStringContext(Impresion2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitImpresionString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Impresion2Context impresion2() throws RecognitionException {
		Impresion2Context _localctx = new Impresion2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_impresion2);
		try {
			_localctx = new ImpresionStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PRINT);
			setState(65);
			match(PA);
			setState(66);
			match(STRING);
			setState(67);
			match(PC);
			setState(68);
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

	public static class ImpresionContext extends ParserRuleContext {
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	 
		public ImpresionContext() { }
		public void copyFrom(ImpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpresionExprContext extends ImpresionContext {
		public TerminalNode PRINT() { return getToken(MinionParser.PRINT, 0); }
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public ImpresionExprContext(ImpresionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitImpresionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_impresion);
		try {
			_localctx = new ImpresionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PRINT);
			setState(71);
			match(PA);
			setState(72);
			expr(0);
			setState(73);
			match(PC);
			setState(74);
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionChadContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(MinionParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MinionParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionChadContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitAsignacionChad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			_localctx = new AsignacionChadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(IGUAL);
			setState(78);
			expr(0);
			setState(79);
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

	public static class IfBasicoContext extends ParserRuleContext {
		public IfBasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBasico; }
	 
		public IfBasicoContext() { }
		public void copyFrom(IfBasicoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfChadContext extends IfBasicoContext {
		public TerminalNode IF() { return getToken(MinionParser.IF, 0); }
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public TerminalNode LA() { return getToken(MinionParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(MinionParser.LC, 0); }
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public ElseBasicoContext elseBasico() {
			return getRuleContext(ElseBasicoContext.class,0);
		}
		public IfChadContext(IfBasicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitIfChad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBasicoContext ifBasico() throws RecognitionException {
		IfBasicoContext _localctx = new IfBasicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifBasico);
		int _la;
		try {
			int _alt;
			_localctx = new IfChadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IF);
			setState(82);
			match(PA);
			setState(83);
			condicion(0);
			setState(84);
			match(PC);
			setState(85);
			match(LA);
			setState(86);
			instrucciones();
			setState(87);
			match(LC);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					elseif();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(94);
				elseBasico();
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

	public static class ElseBasicoContext extends ParserRuleContext {
		public ElseBasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBasico; }
	 
		public ElseBasicoContext() { }
		public void copyFrom(ElseBasicoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseChadContext extends ElseBasicoContext {
		public TerminalNode ELSE() { return getToken(MinionParser.ELSE, 0); }
		public TerminalNode LA() { return getToken(MinionParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(MinionParser.LC, 0); }
		public ElseChadContext(ElseBasicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitElseChad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBasicoContext elseBasico() throws RecognitionException {
		ElseBasicoContext _localctx = new ElseBasicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseBasico);
		try {
			_localctx = new ElseChadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ELSE);
			setState(98);
			match(LA);
			setState(99);
			instrucciones();
			setState(100);
			match(LC);
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

	public static class ElseifContext extends ParserRuleContext {
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
	 
		public ElseifContext() { }
		public void copyFrom(ElseifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseifChadContext extends ElseifContext {
		public TerminalNode ELSE() { return getToken(MinionParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MinionParser.IF, 0); }
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public TerminalNode LA() { return getToken(MinionParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(MinionParser.LC, 0); }
		public ElseifChadContext(ElseifContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitElseifChad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseif);
		try {
			_localctx = new ElseifChadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ELSE);
			setState(103);
			match(IF);
			setState(104);
			match(PA);
			setState(105);
			condicion(0);
			setState(106);
			match(PC);
			setState(107);
			match(LA);
			setState(108);
			instrucciones();
			setState(109);
			match(LC);
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

	public static class ForBasicoContext extends ParserRuleContext {
		public ForBasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBasico; }
	 
		public ForBasicoContext() { }
		public void copyFrom(ForBasicoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForChadContext extends ForBasicoContext {
		public TerminalNode FOR() { return getToken(MinionParser.FOR, 0); }
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public Declaracion2Context declaracion2() {
			return getRuleContext(Declaracion2Context.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public TerminalNode LA() { return getToken(MinionParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(MinionParser.LC, 0); }
		public ForChadContext(ForBasicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitForChad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBasicoContext forBasico() throws RecognitionException {
		ForBasicoContext _localctx = new ForBasicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forBasico);
		try {
			_localctx = new ForChadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FOR);
			setState(112);
			match(PA);
			setState(113);
			declaracion2();
			setState(114);
			condicion(0);
			setState(115);
			match(T__0);
			setState(116);
			incremento();
			setState(117);
			match(PC);
			setState(118);
			match(LA);
			setState(119);
			instrucciones();
			setState(120);
			match(LC);
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

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdCondicionContext extends CondicionContext {
		public TerminalNode ID() { return getToken(MinionParser.ID, 0); }
		public IdCondicionContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitIdCondicion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueChadContext extends CondicionContext {
		public TerminalNode TRUE() { return getToken(MinionParser.TRUE, 0); }
		public TrueChadContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitTrueChad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends CondicionContext {
		public Token op;
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MinionParser.OR, 0); }
		public OrContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends CondicionContext {
		public Token op;
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MinionParser.AND, 0); }
		public AndContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorIgualContext extends CondicionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYORIGUAL() { return getToken(MinionParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(MinionParser.MENORIGUAL, 0); }
		public MayorIgualContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseChadContext extends CondicionContext {
		public TerminalNode FALSE() { return getToken(MinionParser.FALSE, 0); }
		public FalseChadContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitFalseChad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegacionContext extends CondicionContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public NegacionContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualacionContext extends CondicionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUALACION() { return getToken(MinionParser.IGUALACION, 0); }
		public TerminalNode DIFERENTE() { return getToken(MinionParser.DIFERENTE, 0); }
		public IgualacionContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitIgualacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorMenorContext extends CondicionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(MinionParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(MinionParser.MENOR, 0); }
		public MayorMenorContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitMayorMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisCondicionContext extends CondicionContext {
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public ParentesisCondicionContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitParentesisCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ParentesisCondicionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(PA);
				setState(124);
				condicion(0);
				setState(125);
				match(PC);
				}
				break;
			case 2:
				{
				_localctx = new IgualacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				expr(0);
				setState(128);
				((IgualacionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IGUALACION || _la==DIFERENTE) ) {
					((IgualacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new MayorMenorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				expr(0);
				setState(132);
				((MayorMenorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAYOR || _la==MENOR) ) {
					((MayorMenorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new MayorIgualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				expr(0);
				setState(136);
				((MayorIgualContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAYORIGUAL || _la==MENORIGUAL) ) {
					((MayorIgualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new NegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(T__1);
				setState(140);
				condicion(4);
				}
				break;
			case 6:
				{
				_localctx = new TrueChadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new FalseChadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new IdCondicionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(146);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(147);
						((AndContext)_localctx).op = match(AND);
						setState(148);
						condicion(10);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(149);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(150);
						((OrContext)_localctx).op = match(OR);
						setState(151);
						condicion(9);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PA() { return getToken(MinionParser.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(MinionParser.PC, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotenciaRaizContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MinionParser.POW, 0); }
		public TerminalNode SQRT() { return getToken(MinionParser.SQRT, 0); }
		public PotenciaRaizContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitPotenciaRaiz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(MinionParser.SUM, 0); }
		public TerminalNode RES() { return getToken(MinionParser.RES, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativoContext extends ExprContext {
		public TerminalNode RES() { return getToken(MinionParser.RES, 0); }
		public TerminalNode NUMERO() { return getToken(MinionParser.NUMERO, 0); }
		public NegativoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitNegativo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(MinionParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode NUMERO() { return getToken(MinionParser.NUMERO, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MinionParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MinionParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				match(PA);
				setState(159);
				expr(0);
				setState(160);
				match(PC);
				}
				break;
			case NUMERO:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(NUMERO);
				}
				break;
			case RES:
				{
				_localctx = new NegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(RES);
				setState(164);
				match(NUMERO);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaRaizContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(169);
						((PotenciaRaizContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POW || _la==SQRT) ) {
							((PotenciaRaizContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(172);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==RES) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(MinionParser.FLOAT, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_dato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(FLOAT);
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

	public static class IncrementoContext extends ParserRuleContext {
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
	 
		public IncrementoContext() { }
		public void copyFrom(IncrementoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementoChadContext extends IncrementoContext {
		public TerminalNode ID() { return getToken(MinionParser.ID, 0); }
		public List<TerminalNode> SUM() { return getTokens(MinionParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(MinionParser.SUM, i);
		}
		public IncrementoChadContext(IncrementoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinionVisitor ) return ((MinionVisitor<? extends T>)visitor).visitIncrementoChad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_incremento);
		try {
			_localctx = new IncrementoChadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(185);
			match(SUM);
			setState(186);
			match(SUM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4"+
		"\f\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\n\5\nb\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0093"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009b\n\16\f\16\16\16\u009e\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a9\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7"+
		"\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\2\4\32\34\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\b\3\2\20\21\3\2\22\23\3\2\24\25\3\2\27\30"+
		"\3\2\33\34\3\2\31\32\2\u00c6\2\"\3\2\2\2\4\'\3\2\2\2\6\65\3\2\2\2\b8\3"+
		"\2\2\2\n<\3\2\2\2\fB\3\2\2\2\16H\3\2\2\2\20N\3\2\2\2\22S\3\2\2\2\24c\3"+
		"\2\2\2\26h\3\2\2\2\30q\3\2\2\2\32\u0092\3\2\2\2\34\u00a8\3\2\2\2\36\u00b8"+
		"\3\2\2\2 \u00ba\3\2\2\2\"#\5\4\3\2#$\7\37\2\2$%\5\6\4\2%&\7 \2\2&\3\3"+
		"\2\2\2\'(\7\6\2\2()\7\7\2\2)*\7\35\2\2*+\7\36\2\2+\5\3\2\2\2,\64\5\20"+
		"\t\2-\64\5\b\5\2.\64\5\n\6\2/\64\5\16\b\2\60\64\5\f\7\2\61\64\5\22\n\2"+
		"\62\64\5\30\r\2\63,\3\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60"+
		"\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\289\5\36\20\29:\7#\2\2:;\7\3\2\2;\t"+
		"\3\2\2\2<=\5\36\20\2=>\7#\2\2>?\7\26\2\2?@\5\34\17\2@A\7\3\2\2A\13\3\2"+
		"\2\2BC\7\b\2\2CD\7\35\2\2DE\7%\2\2EF\7\36\2\2FG\7\3\2\2G\r\3\2\2\2HI\7"+
		"\b\2\2IJ\7\35\2\2JK\5\34\17\2KL\7\36\2\2LM\7\3\2\2M\17\3\2\2\2NO\7#\2"+
		"\2OP\7\26\2\2PQ\5\34\17\2QR\7\3\2\2R\21\3\2\2\2ST\7\t\2\2TU\7\35\2\2U"+
		"V\5\32\16\2VW\7\36\2\2WX\7\37\2\2XY\5\6\4\2Y]\7 \2\2Z\\\5\26\f\2[Z\3\2"+
		"\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\5\24\13\2a`"+
		"\3\2\2\2ab\3\2\2\2b\23\3\2\2\2cd\7\13\2\2de\7\37\2\2ef\5\6\4\2fg\7 \2"+
		"\2g\25\3\2\2\2hi\7\13\2\2ij\7\t\2\2jk\7\35\2\2kl\5\32\16\2lm\7\36\2\2"+
		"mn\7\37\2\2no\5\6\4\2op\7 \2\2p\27\3\2\2\2qr\7\n\2\2rs\7\35\2\2st\5\n"+
		"\6\2tu\5\32\16\2uv\7\3\2\2vw\5 \21\2wx\7\36\2\2xy\7\37\2\2yz\5\6\4\2z"+
		"{\7 \2\2{\31\3\2\2\2|}\b\16\1\2}~\7\35\2\2~\177\5\32\16\2\177\u0080\7"+
		"\36\2\2\u0080\u0093\3\2\2\2\u0081\u0082\5\34\17\2\u0082\u0083\t\2\2\2"+
		"\u0083\u0084\5\34\17\2\u0084\u0093\3\2\2\2\u0085\u0086\5\34\17\2\u0086"+
		"\u0087\t\3\2\2\u0087\u0088\5\34\17\2\u0088\u0093\3\2\2\2\u0089\u008a\5"+
		"\34\17\2\u008a\u008b\t\4\2\2\u008b\u008c\5\34\17\2\u008c\u0093\3\2\2\2"+
		"\u008d\u008e\7\4\2\2\u008e\u0093\5\32\16\6\u008f\u0093\7\f\2\2\u0090\u0093"+
		"\7\r\2\2\u0091\u0093\7#\2\2\u0092|\3\2\2\2\u0092\u0081\3\2\2\2\u0092\u0085"+
		"\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u009c\3\2\2\2\u0094\u0095\f\13"+
		"\2\2\u0095\u0096\7\17\2\2\u0096\u009b\5\32\16\f\u0097\u0098\f\n\2\2\u0098"+
		"\u0099\7\16\2\2\u0099\u009b\5\32\16\13\u009a\u0094\3\2\2\2\u009a\u0097"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\33\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\b\17\1\2\u00a0\u00a1\7\35"+
		"\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3\7\36\2\2\u00a3\u00a9\3\2\2\2\u00a4"+
		"\u00a9\7$\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a9\7$\2\2\u00a7\u00a9\7#\2"+
		"\2\u00a8\u009f\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00b5\3\2\2\2\u00aa\u00ab\f\b\2\2\u00ab\u00ac\t\5\2\2\u00ac"+
		"\u00b4\5\34\17\t\u00ad\u00ae\f\7\2\2\u00ae\u00af\t\6\2\2\u00af\u00b4\5"+
		"\34\17\b\u00b0\u00b1\f\6\2\2\u00b1\u00b2\t\7\2\2\u00b2\u00b4\5\34\17\7"+
		"\u00b3\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\35\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7#\2\2"+
		"\u00bb\u00bc\7\31\2\2\u00bc\u00bd\7\31\2\2\u00bd!\3\2\2\2\f\63\65]a\u0092"+
		"\u009a\u009c\u00a8\u00b3\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}