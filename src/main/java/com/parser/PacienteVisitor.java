// Generated from Paciente.g4 by ANTLR 4.7.2
package com.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PacienteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PacienteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PacienteParser#calculadora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculadora(PacienteParser.CalculadoraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(PacienteParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#paciente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaciente(PacienteParser.PacienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre(PacienteParser.NombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#genero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenero(PacienteParser.GeneroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#talla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTalla(PacienteParser.TallaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#peso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeso(PacienteParser.PesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#edad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdad(PacienteParser.EdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PacienteParser#fa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFa(PacienteParser.FaContext ctx);
}