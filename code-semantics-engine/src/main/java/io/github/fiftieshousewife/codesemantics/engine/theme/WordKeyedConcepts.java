package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.lexicon.PublishedTerms;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

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
public final class WordKeyedConcepts {

    private final Map<List<String>, List<SkosConcept>> byWords;
    private final Map<String, List<String>> broaderByLabel;

    private WordKeyedConcepts(final Map<List<String>, List<SkosConcept>> byWords,
                              final Map<String, List<String>> broaderByLabel) {
        this.byWords = Collections.unmodifiableMap(byWords);
        this.broaderByLabel = Map.copyOf(broaderByLabel);
    }

    /**
     * The index, keyed by a term's words and held in those words' own order.
     *
     * <p>The order is stated because callers walk it. A term the same words normalise to is appended to
     * whatever is already under that key, and the parent a concept states is written under its label with
     * the last writer winning — so an index whose iteration order the JVM chooses named a match's concepts
     * differently and kept a different parent on every run.
     */
    public static WordKeyedConcepts of(final PublishedTerms published, final IdentifierWords words) {
        final Map<List<String>, List<SkosConcept>> byWords = new TreeMap<>(BY_WORDS);
        published.terms().stream().distinct()
                .forEach(term -> byWords.computeIfAbsent(words.of(term).words(), key -> new ArrayList<>())
                        .addAll(published.conceptsOf(term)));
        byWords.remove(List.of());
        return new WordKeyedConcepts(byWords, broaderIn(byWords));
    }

    /** A term's place in the index: its words, spelled as one run, in that run's own order. */
    static final Comparator<List<String>> BY_WORDS = Comparator.comparing(term -> String.join(" ", term));

    /**
     * A term the source states no parent for ends its chain, which is a fact about the resource.
     *
     * <p>Where a source states several, all of them are kept. {@link #broaderOf} answers with the first
     * because a chain walk follows one line, and {@link #broadersOf} answers with every one because
     * corroboration asks what a concept was written beside and a poly-hierarchical concept sits beside the
     * siblings of each of its parents.
     */
    private static Map<String, List<String>> broaderIn(final Map<List<String>, List<SkosConcept>> byWords) {
        final Map<String, List<String>> broaderByLabel = new LinkedHashMap<>();
        byWords.values().stream().flatMap(List::stream)
                .filter(concept -> !concept.broaderConcepts().isEmpty())
                .forEach(concept -> broaderByLabel.put(key(concept.prefLabel()), concept.broaderConcepts()));
        return broaderByLabel;
    }

    public List<SkosConcept> conceptsOf(final List<String> words) {
        return byWords.getOrDefault(words, List.of());
    }

    public String broaderOf(final String prefLabel) {
        final List<String> stated = broadersOf(prefLabel);
        return stated.isEmpty() ? "" : stated.getFirst();
    }

    /** Every concept this one is stated beneath, which for most sources is one and for CSO is up to 33. */
    public List<String> broadersOf(final String prefLabel) {
        return broaderByLabel.getOrDefault(key(prefLabel), List.of());
    }

    public Set<List<String>> terms() {
        return byWords.keySet();
    }

    public int longestTerm() {
        return byWords.keySet().stream().mapToInt(List::size).max().orElse(0);
    }

    /** A label is keyed in lower case, because the publisher's own capitalisation is not part of the name. */
    private static String key(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }
}
