// Generated from Minion.g4 by ANTLR 4.7.2
package com.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MinionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MinionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MinionParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MinionParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code encabechad}
	 * labeled alternative in {@link MinionParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabechad(MinionParser.EncabechadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinionParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(MinionParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionSimple}
	 * labeled alternative in {@link MinionParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionSimple(MinionParser.DeclaracionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionAsignacion}
	 * labeled alternative in {@link MinionParser#declaracion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionAsignacion(MinionParser.DeclaracionAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresionString}
	 * labeled alternative in {@link MinionParser#impresion2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresionString(MinionParser.ImpresionStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresionExpr}
	 * labeled alternative in {@link MinionParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresionExpr(MinionParser.ImpresionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacionChad}
	 * labeled alternative in {@link MinionParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionChad(MinionParser.AsignacionChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifChad}
	 * labeled alternative in {@link MinionParser#ifBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfChad(MinionParser.IfChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseChad}
	 * labeled alternative in {@link MinionParser#elseBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseChad(MinionParser.ElseChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifChad}
	 * labeled alternative in {@link MinionParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifChad(MinionParser.ElseifChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forChad}
	 * labeled alternative in {@link MinionParser#forBasico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForChad(MinionParser.ForChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idCondicion}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCondicion(MinionParser.IdCondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueChad}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueChad(MinionParser.TrueChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(MinionParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(MinionParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorIgual}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorIgual(MinionParser.MayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseChad}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseChad(MinionParser.FalseChadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negacion}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(MinionParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualacion}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualacion(MinionParser.IgualacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorMenor}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorMenor(MinionParser.MayorMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesisCondicion}
	 * labeled alternative in {@link MinionParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisCondicion(MinionParser.ParentesisCondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link MinionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(MinionParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potenciaRaiz}
	 * labeled alternative in {@link MinionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciaRaiz(MinionParser.PotenciaRaizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link MinionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(MinionParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativo}
	 * labeled alternative in {@link MinionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativo(MinionParser.NegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MinionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MinionParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MinionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MinionParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link MinionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(MinionParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinionParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(MinionParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementoChad}
	 * labeled alternative in {@link MinionParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementoChad(MinionParser.IncrementoChadContext ctx);
}