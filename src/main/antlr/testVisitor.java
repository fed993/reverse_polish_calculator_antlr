// Generated from test.g4 by ANTLR 4.5.3

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(testParser.RContext ctx);
}