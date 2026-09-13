package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * What one tree declares that another does not: the declarations standing at the head and not at the base,
 * the declarations standing at the base and not at the head, and how many stood at both.
 *
 * <p>Declarations are matched as a multiset, so two overloads of one name are two declarations and a third
 * added is one added. Nothing is matched across a rename or across a file: a declaration is the one it is
 * only where the same file writes the same name in the same enclosing declarations, and the alternative
 * would be a similarity heuristic asserting an intention the text does not state.
 */
public final class DeclarationDiff {

    private final List<Declaration> added;

    private final List<Declaration> removed;

    private final int kept;

    private DeclarationDiff(final List<Declaration> added, final List<Declaration> removed,
                            final int kept) {
        this.added = List.copyOf(added);
        this.removed = List.copyOf(removed);
        this.kept = kept;
    }

    /** The head read against the base: what it adds, what it removes, and what stood at both. */
    public static DeclarationDiff between(final List<Declaration> base, final List<Declaration> head) {
        final Map<Declaration, Integer> standing = counted(base);
        final List<Declaration> added = new ArrayList<>();
        head.forEach(declaration -> {
            if (standing.merge(declaration, -1, Integer::sum) < 0) {
                added.add(declaration);
            }
        });
        return new DeclarationDiff(added, remaining(standing), head.size() - added.size());
    }

    public List<Declaration> added() {
        return added;
    }

    public List<Declaration> removed() {
        return removed;
    }

    /** How many of the head's declarations stood at the base under the same name and the same enclosing. */
    public int kept() {
        return kept;
    }

    public Map<DeclarationKind, Integer> addedByKind() {
        return byKind(added);
    }

    public Map<DeclarationKind, Integer> removedByKind() {
        return byKind(removed);
    }

    /** Every kind with its count, including the kinds this change does not touch: a zero is a fact here. */
    private static Map<DeclarationKind, Integer> byKind(final List<Declaration> declarations) {
        final Map<DeclarationKind, Integer> counts = new EnumMap<>(DeclarationKind.class);
        List.of(DeclarationKind.values()).forEach(kind -> counts.put(kind, 0));
        declarations.forEach(declaration -> counts.merge(declaration.kind(), 1, Integer::sum));
        return Map.copyOf(counts);
    }

    private static Map<Declaration, Integer> counted(final List<Declaration> declarations) {
        final Map<Declaration, Integer> counts = new LinkedHashMap<>();
        declarations.forEach(declaration -> counts.merge(declaration, 1, Integer::sum));
        return counts;
    }

    private static List<Declaration> remaining(final Map<Declaration, Integer> standing) {
        return standing.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .flatMap(entry -> Collections.nCopies(entry.getValue(), entry.getKey()).stream())
                .toList();
    }
}
