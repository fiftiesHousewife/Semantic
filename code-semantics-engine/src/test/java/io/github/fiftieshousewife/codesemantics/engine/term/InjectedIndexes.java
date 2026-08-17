package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.github.fiftieshousewife.codesemantics.engine.theme.InjectedTaxonomy;

/**
 * One term index per injected taxonomy, built once per JVM and shared, for the same reason
 * {@link io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading} shares the reading: a taxonomy
 * file cannot change under a running program, and keying its topics by word costs seconds per caller.
 */
public final class InjectedIndexes {

    private static final Map<String, TermIndex> INDEXES = new ConcurrentHashMap<>();

    private InjectedIndexes() {
    }

    /** The taxonomy's topics keyed by the words of their labels, computed once per source. */
    public static TermIndex of(final InjectedTaxonomy taxonomy) {
        return INDEXES.computeIfAbsent(taxonomy.source(),
                source -> InjectedTerms.of(taxonomy, source));
    }
}
