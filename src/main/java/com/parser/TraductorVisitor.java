// Generated from Traductor.g4 by ANTLR 4.7.2
package com.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraductorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraductorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TraductorParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TraductorParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code encabechad}
	 * labeled alternative in {@link TraductorParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabechad(TraductorParser.EncabechadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(TraductorParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarachad}
	 * labeled alternative in {@link TraductorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarachad(TraductorParser.DeclarachadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarachad2}
	 * labeled alternative in {@link TraductorParser#declaracion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarachad2(TraductorParser.Declarachad2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code imprechad2}
	 * labeled alternative in {@link TraductorParser#impresion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprechad2(TraductorParser.Imprechad2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code imprechad}
	 * labeled alternative in {@link TraductorParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprechad(TraductorParser.ImprechadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignachad}
	 * labeled alternative in {@link TraductorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignachad(TraductorParser.AsignachadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifChad}
	 * labeled alternative in {@link TraductorParser#ifBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfChad(TraductorParser.IfChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseChad}
	 * labeled alternative in {@link TraductorParser#elseBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseChad(TraductorParser.ElseChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifChad}
	 * labeled alternative in {@link TraductorParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifChad(TraductorParser.ElseifChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forChad}
	 * labeled alternative in {@link TraductorParser#forBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForChad(TraductorParser.ForChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idCondicion}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCondicion(TraductorParser.IdCondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueChad}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueChad(TraductorParser.TrueChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(TraductorParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(TraductorParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorIgual}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorIgual(TraductorParser.MayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseChad}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseChad(TraductorParser.FalseChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negacion}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(TraductorParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualacion}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualacion(TraductorParser.IgualacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorMenor}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorMenor(TraductorParser.MayorMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(TraductorParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potenciaRaiz}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciaRaiz(TraductorParser.PotenciaRaizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(TraductorParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativo}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativo(TraductorParser.NegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TraductorParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TraductorParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TraductorParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(TraductorParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementoChad}
	 * labeled alternative in {@link TraductorParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementoChad(TraductorParser.IncrementoChadContext ctx);
}