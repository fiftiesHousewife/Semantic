package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.PublishedTerms;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

/**
 * A published vocabulary keyed by the words its own identifiers read as, which is the one thing every source
 * needs done to it before a declared name can meet it.
 *
 * <p>The keying uses the grammar the reading already uses. {@code AdjectivePhrase} and
 * {@code InterestRateSwap} go through {@link IdentifierWords} exactly as a declared name does, so they are
 * held as <em>adjective phrase</em> and <em>interest rate swap</em> and meet {@code adjectivePhrase},
 * {@code ADJECTIVE_PHRASE} and {@code interest_rate_swap} without any spelling being anticipated. No word of
 * a key was chosen here: the publisher wrote the term and the splitter wrote the boundaries.
 *
 * <p>Two terms may read as the same words, and both concepts are held under that one key rather than one of
 * them being preferred. Which of them a match means is the consuming reading's question.
 */
final class WordKeyedConcepts {

    private final Map<List<String>, List<SkosConcept>> byWords;
    private final Map<String, List<String>> broaderByLabel;

    private WordKeyedConcepts(final Map<List<String>, List<SkosConcept>> byWords,
                              final Map<String, List<String>> broaderByLabel) {
        this.byWords = Map.copyOf(byWords);
        this.broaderByLabel = Map.copyOf(broaderByLabel);
    }

    static WordKeyedConcepts of(final PublishedTerms published, final IdentifierWords words) {
        final Map<List<String>, List<SkosConcept>> byWords = new HashMap<>();
        published.terms().stream().distinct()
                .forEach(term -> byWords.computeIfAbsent(words.of(term).words(), key -> new ArrayList<>())
                        .addAll(published.conceptsOf(term)));
        byWords.remove(List.of());
        return new WordKeyedConcepts(byWords, broaderIn(byWords));
    }

    /**
     * A term the source states no parent for ends its chain, which is a fact about the resource.
     *
     * <p>Where a source states several, all of them are kept. {@link #broaderOf} answers with the first
     * because a chain walk follows one line, and {@link #broadersOf} answers with every one because
     * corroboration asks what a concept was written beside and a poly-hierarchical concept sits beside the
     * siblings of each of its parents.
     */
    private static Map<String, List<String>> broaderIn(final Map<List<String>, List<SkosConcept>> byWords) {
        final Map<String, List<String>> broaderByLabel = new HashMap<>();
        byWords.values().stream().flatMap(List::stream)
                .filter(concept -> !concept.broaderConcepts().isEmpty())
                .forEach(concept -> broaderByLabel.put(key(concept.prefLabel()), concept.broaderConcepts()));
        return broaderByLabel;
    }

    List<SkosConcept> conceptsOf(final List<String> words) {
        return byWords.getOrDefault(words, List.of());
    }

    String broaderOf(final String prefLabel) {
        final List<String> stated = broadersOf(prefLabel);
        return stated.isEmpty() ? "" : stated.getFirst();
    }

    /** Every concept this one is stated beneath, which for most sources is one and for CSO is up to 33. */
    List<String> broadersOf(final String prefLabel) {
        return broaderByLabel.getOrDefault(key(prefLabel), List.of());
    }

    java.util.Set<List<String>> terms() {
        return byWords.keySet();
    }

    int longestTerm() {
        return byWords.keySet().stream().mapToInt(List::size).max().orElse(0);
    }

    /** A label is keyed in lower case, because the publisher's own capitalisation is not part of the name. */
    private static String key(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }
}
