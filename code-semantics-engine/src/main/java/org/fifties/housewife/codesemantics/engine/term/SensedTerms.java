package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.bi.lexicon.WordSense;

/**
 * A published taxonomy keyed by what its terms <em>mean</em> rather than by how it spelled them, so a
 * repository writing {@code nominalPhrase} meets a publisher writing {@code NounPhrase}.
 *
 * <p>Both sides go through one normalisation, which is the whole of the design: the source's own runs are put
 * through {@link SenseRuns} when the index is built and a repository's runs are put through it when they are
 * asked about, so neither side is privileged and nothing was decided about either. Where two of the source's
 * terms read as one meaning both concepts are held under it, exactly as two terms spelled the same way are.
 *
 * <p><b>It generalises, and generalising is the risk.</b> The dictionary reads {@code topic}, {@code theme}
 * and {@code subject} as one entry, so a repository writing about topics meets a taxonomy stating subjects
 * whether or not either meant the other. That is why the rung is recorded on every span and reported apart: a
 * match made here is a weaker claim than a match made on the words, and a reading that added the two together
 * would be unable to say which kind it had found.
 *
 * <p>Everything else it delegates. What the source states above a term, how long its longest term is and what
 * it is called are facts about the publication and are not changed by being read through a dictionary.
 */
public final class SensedTerms implements TermIndex {

    private final TermIndex published;
    private final SenseRuns senses;
    private final Map<List<WordSense>, List<SkosConcept>> byMeaning;

    private SensedTerms(final TermIndex published, final SenseRuns senses,
                        final Map<List<WordSense>, List<SkosConcept>> byMeaning) {
        this.published = published;
        this.senses = senses;
        this.byMeaning = Map.copyOf(byMeaning);
    }

    public static SensedTerms over(final TermIndex published, final SenseRuns senses) {
        final Map<List<WordSense>, List<SkosConcept>> byMeaning = new HashMap<>();
        published.terms().forEach(term -> senses.of(term).ifPresent(meaning ->
                byMeaning.computeIfAbsent(meaning, key -> new ArrayList<>())
                        .addAll(published.conceptsOf(term))));
        return new SensedTerms(published, senses, byMeaning);
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return senses.of(words).map(meaning -> byMeaning.getOrDefault(meaning, List.<SkosConcept>of()))
                .orElseGet(List::of);
    }

    @Override
    public Set<List<String>> terms() {
        return published.terms();
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return published.broaderOf(prefLabel);
    }

    @Override
    public int longestTerm() {
        return published.longestTerm();
    }

    @Override
    public String source() {
        return published.source();
    }

    @Override
    public TermRung rung() {
        return TermRung.SENSES;
    }

    /** How many distinct meanings the source's terms read as, which is fewer than the runs it publishes. */
    public int meanings() {
        return byMeaning.size();
    }
}
