package org.fifties.housewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * A published taxonomy keyed by what a {@link TermNormalisation} makes of its terms rather than by how it
 * spelled them, so a repository writing {@code phrases} or {@code nominalPhrase} meets a publisher writing
 * {@code Phrase} or {@code NounPhrase}.
 *
 * <p>Both sides go through one normalisation, which is the whole of the design: the source's own runs are put
 * through it when the index is built and a repository's runs are put through it when they are asked about, so
 * neither side is privileged and nothing was decided about either. Where two of the source's terms read as one
 * normal form both concepts are held under it, exactly as two terms spelled the same way are.
 *
 * <p><b>It generalises, and generalising is the risk.</b> The dictionary reads {@code topic}, {@code theme}
 * and {@code subject} as one entry, so a repository writing about topics meets a taxonomy stating subjects
 * whether or not either meant the other. That is why the rung is recorded on every span and reported apart: a
 * match made here is a weaker claim than a match made on the words, and a reading that added the two together
 * would be unable to say which kind it had found.
 *
 * <p>Everything else it delegates. What the source states above a term, how long its longest term is and what
 * it is called are facts about the publication and are not changed by being read through a dictionary.
 *
 * @param <K> the normal form this index is keyed by
 */
public final class NormalisedTerms<K> implements TermIndex {

    private final TermIndex published;
    private final TermNormalisation<K> normalisation;
    private final Map<K, List<SkosConcept>> byNormalForm;

    private NormalisedTerms(final TermIndex published, final TermNormalisation<K> normalisation,
                            final Map<K, List<SkosConcept>> byNormalForm) {
        this.published = published;
        this.normalisation = normalisation;
        this.byNormalForm = Map.copyOf(byNormalForm);
    }

    public static <K> NormalisedTerms<K> over(final TermIndex published,
                                              final TermNormalisation<K> normalisation) {
        final Map<K, List<SkosConcept>> byNormalForm = new HashMap<>();
        published.terms().forEach(term -> normalisation.of(term).ifPresent(normal ->
                byNormalForm.computeIfAbsent(normal, key -> new ArrayList<>())
                        .addAll(published.conceptsOf(term))));
        return new NormalisedTerms<>(published, normalisation, byNormalForm);
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return normalisation.of(words)
                .map(normal -> byNormalForm.getOrDefault(normal, List.<SkosConcept>of()))
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
        return normalisation.rung();
    }

    /** How many distinct normal forms the source's terms read as, which is fewer than the runs it publishes. */
    public int normalForms() {
        return byNormalForm.size();
    }
}
