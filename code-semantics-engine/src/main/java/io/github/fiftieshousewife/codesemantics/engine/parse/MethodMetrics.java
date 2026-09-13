package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.ConditionalExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.CatchClause;
import com.github.javaparser.ast.stmt.DoStmt;
import com.github.javaparser.ast.stmt.ForEachStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.SwitchEntry;
import com.github.javaparser.ast.stmt.WhileStmt;

/**
 * The size and complexity of one method or constructor, measured the way the published definitions state
 * them.
 *
 * <p>The complexity is McCabe's: one, plus one for each point at which control can branch — an
 * {@code if}, a loop, a {@code catch}, a {@code switch} entry, each {@code &&} or {@code ||}, and each
 * conditional expression. The nesting depth counts the blocks a statement sits inside, and the parameter
 * count is the declaration's own.
 *
 * <p>Size is counted in statements and never in lines. A line count moves with the formatter, with the
 * javadoc above the code and with where the braces sit, none of which is a fact about what the
 * method does; the statements it carries are the same however it is laid out. A block is not counted,
 * because a block is punctuation around statements rather than one of them.
 *
 * @param statements how many statements the method carries, blocks excluded
 * @param complexity McCabe's cyclomatic complexity
 * @param nesting    how deep the deepest block inside it sits
 * @param parameters how many parameters it declares
 */
public record MethodMetrics(int statements, int complexity, int nesting, int parameters) {

    private static final List<Class<? extends Node>> BRANCHES = List.of(IfStmt.class, ForStmt.class,
            ForEachStmt.class, WhileStmt.class, DoStmt.class, CatchClause.class, SwitchEntry.class,
            ConditionalExpr.class);

    /**
     * One method or constructor, measured.
     *
     * <p>Nothing here measures a type. A type declares members and carries no statements of its own, so
     * a member count and a statement count are different figures about different things and are not
     * held in one component.
     */
    public static MethodMetrics of(final CallableDeclaration<?> declaration) {
        return new MethodMetrics(statementsIn(declaration), complexityOf(declaration),
                nestingIn(declaration), declaration.getParameters().size());
    }

    /** The statements a method carries. A block holds statements and is not one. */
    private static int statementsIn(final Node node) {
        return (int) node.findAll(Statement.class).stream()
                .filter(statement -> !(statement instanceof BlockStmt))
                .count();
    }

    private static int complexityOf(final Node node) {
        final int branches = BRANCHES.stream()
                .mapToInt(kind -> node.findAll(kind).size())
                .sum();
        final int conditions = (int) node.findAll(BinaryExpr.class).stream()
                .filter(MethodMetrics::isCondition)
                .count();
        return 1 + branches + conditions;
    }

    private static boolean isCondition(final BinaryExpr expression) {
        return expression.getOperator() == BinaryExpr.Operator.AND
                || expression.getOperator() == BinaryExpr.Operator.OR;
    }

    /** How deep the deepest block inside this declaration sits, counting from its own body as one. */
    private static int nestingIn(final Node node) {
        return node.findAll(BlockStmt.class).stream()
                .mapToInt(block -> depthOf(block, node))
                .max()
                .orElse(0);
    }

    private static int depthOf(final Node block, final Node within) {
        return 1 + (int) Stream.iterate(block.getParentNode(),
                        parent -> parent.isPresent() && !parent.get().equals(within),
                        parent -> parent.orElseThrow().getParentNode())
                .map(Optional::orElseThrow)
                .filter(BlockStmt.class::isInstance)
                .count();
    }
}
