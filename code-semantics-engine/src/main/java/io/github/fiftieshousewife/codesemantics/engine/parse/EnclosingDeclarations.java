package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;

/**
 * The names of the types and methods a node was written inside, outermost first.
 *
 * <p>A published run of words is often split across a declaration rather than written into one name: a type
 * called {@code SourceCode} with a member called {@code analysis} writes the three words of
 * {@code Source Code Analysis} and never puts them next to each other. The walk knows where each name stood
 * and drops it at the tally, so the run is unreachable. This keeps it.
 *
 * <p>Only types and methods are read, because they are the declarations that enclose other declarations. A
 * field encloses nothing, and a block, a lambda or an initialiser names nothing.
 */
public final class EnclosingDeclarations {

    /** The declaration kinds that enclose other declarations, which is what makes them a run's context. */
    private static final List<Class<? extends Node>> ENCLOSING =
            List.of(TypeDeclaration.class, MethodDeclaration.class);

    /** The names this node sits inside, outermost first; empty for a top-level type, an import or a comment. */
    public List<String> around(final Node node) {
        return Stream.iterate(node.getParentNode(), Optional::isPresent,
                        parent -> parent.orElseThrow().getParentNode())
                .map(Optional::orElseThrow)
                .filter(EnclosingDeclarations::declares)
                .map(EnclosingDeclarations::nameOf)
                .toList()
                .reversed();
    }

    private static boolean declares(final Node node) {
        return ENCLOSING.stream().anyMatch(kind -> kind.isInstance(node));
    }

    private static String nameOf(final Node declaration) {
        return ((NodeWithSimpleName<?>) declaration).getNameAsString();
    }
}
