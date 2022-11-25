// Generated from TraductorC.g4 by ANTLR 4.7.2
package com.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraductorCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraductorCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TraductorCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TraductorCParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code encabechad}
	 * labeled alternative in {@link TraductorCParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabechad(TraductorCParser.EncabechadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorCParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(TraductorCParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarachad}
	 * labeled alternative in {@link TraductorCParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarachad(TraductorCParser.DeclarachadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarachad2}
	 * labeled alternative in {@link TraductorCParser#declaracion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarachad2(TraductorCParser.Declarachad2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code imprechad2}
	 * labeled alternative in {@link TraductorCParser#impresion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprechad2(TraductorCParser.Imprechad2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code imprechad}
	 * labeled alternative in {@link TraductorCParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprechad(TraductorCParser.ImprechadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignachad}
	 * labeled alternative in {@link TraductorCParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignachad(TraductorCParser.AsignachadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifChad}
	 * labeled alternative in {@link TraductorCParser#ifCuck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfChad(TraductorCParser.IfChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elsechad}
	 * labeled alternative in {@link TraductorCParser#elseCuck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsechad(TraductorCParser.ElsechadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifChad}
	 * labeled alternative in {@link TraductorCParser#elseifCuck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifChad(TraductorCParser.ElseifChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forChad}
	 * labeled alternative in {@link TraductorCParser#forBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForChad(TraductorCParser.ForChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idCondicion}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCondicion(TraductorCParser.IdCondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueChad}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueChad(TraductorCParser.TrueChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(TraductorCParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(TraductorCParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorIgual}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorIgual(TraductorCParser.MayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseChad}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseChad(TraductorCParser.FalseChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negacion}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(TraductorCParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualacion}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualacion(TraductorCParser.IgualacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorMenor}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorMenor(TraductorCParser.MayorMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesisCondicion}
	 * labeled alternative in {@link TraductorCParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisCondicion(TraductorCParser.ParentesisCondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link TraductorCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(TraductorCParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potenciaRaiz}
	 * labeled alternative in {@link TraductorCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciaRaiz(TraductorCParser.PotenciaRaizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link TraductorCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(TraductorCParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativo}
	 * labeled alternative in {@link TraductorCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativo(TraductorCParser.NegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TraductorCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TraductorCParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link TraductorCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TraductorCParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TraductorCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TraductorCParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorCParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(TraductorCParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementoChad}
	 * labeled alternative in {@link TraductorCParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementoChad(TraductorCParser.IncrementoChadContext ctx);
}