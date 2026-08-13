package org.fifties.housewife.codesemantics.symbol;

import java.util.List;
import java.util.Objects;

import org.fifties.housewife.codesemantics.repository.SourceAnchor;

/**
 * Everything a stage is given about one declaration. The shape is deliberately the same as the column
 * context a table pipeline reads — an immutable record consumed by a side-effect-free stage — but the
 * contents are entirely different, because code has no value distribution to profile. What it has instead is
 * a kind, a span, the declarations enclosing it, and the identifiers visible from it.
 *
 * <p>{@code enclosingNames} runs nearest first, so a stage that decays a vote with scope distance reads the
 * list in order rather than computing a depth.
 */
public record SymbolContext(SymbolKind kind, String name, String language, SourceAnchor anchor,
                            List<String> enclosingNames, List<String> identifiersInScope) {

    public SymbolContext {
        Objects.requireNonNull(kind, "kind");
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(anchor, "anchor");
        enclosingNames = List.copyOf(enclosingNames);
        identifiersInScope = List.copyOf(identifiersInScope);
    }
}
