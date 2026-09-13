package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Objects;

/**
 * One declaration a tree states, identified by where it stands: the file, the declarations it was written
 * inside, its kind and its name. Two trees state the same declaration when all four agree.
 *
 * <p>There is no matching heuristic here and none is wanted. A renamed method reads as one declaration
 * removed and one added, and a diff claiming otherwise would assert an intention nothing in the text states.
 *
 * @param path      the file, relative to the tree's own root, so two trees of the same changed files compare
 * @param enclosing the declarations it was written inside, outermost first
 * @param kind      what it is in the syntax
 * @param name      the name as it is written
 */
public record Declaration(String path, List<String> enclosing, DeclarationKind kind, String name) {

    public Declaration {
        Objects.requireNonNull(path, "path");
        Objects.requireNonNull(kind, "kind");
        Objects.requireNonNull(name, "name");
        enclosing = List.copyOf(enclosing);
    }

    /** The name under the declarations it sits inside, as a reader would write the way to it. */
    public String written() {
        return enclosing.isEmpty() ? name : String.join(".", enclosing) + "." + name;
    }
}
