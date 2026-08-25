package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Map;

import io.github.fiftieshousewife.codesemantics.reference.PooledWordShares;

/**
 * How much more often this repository declares a word than working Java does, as the weight one occurrence
 * of it is worth.
 *
 * <p>{@link CorpusSpecificity} answers the same question about the corpus alone, and cannot tell two
 * repositories apart: it gives {@code x} one weight everywhere. But {@code x} is 2,034 occurrences in a
 * derivatives library, far above the rate working Java writes it, and 98 in a build tool, below that rate.
 * One is the repository's word and the other is noise, and only a comparison against this repository's own
 * shares says which.
 *
 * <p>The weight is {@code r / (1 + r)} over the ratio of the two shares. It is bounded in {@code (0, 1]} by
 * its own algebra rather than by a bound anybody chose: a word written at the corpus's own rate is worth a
 * half, one the corpus never wrote is worth a whole, and one the corpus writes more densely than this
 * repository tends towards nothing without reaching it. <b>Never reaching it is the point.</b>
 * {@link PhraseTopics} takes a geometric mean over a phrase's words, so a weight of zero takes the phrase's
 * whole reading to nothing — a word that narrows almost nothing must still vote.
 */
public final class WrittenAboveTheCorpus implements WordNarrowing {

    private static final double NEVER_WRITTEN_BY_THE_CORPUS = 1.0;

    private final Map<String, Double> here;
    private final Map<String, Double> corpus;

    public WrittenAboveTheCorpus(final Map<String, Double> here, final Map<String, Double> corpus) {
        this.here = Map.copyOf(here);
        this.corpus = Map.copyOf(corpus);
    }

    /** Against the corpus this library bundles, over one repository's own declared-name shares. */
    public static WrittenAboveTheCorpus over(final Map<String, Double> here) {
        return new WrittenAboveTheCorpus(here, PooledWordShares.fromClasspath().shareByWord());
    }

    @Override
    public double of(final String word) {
        final double there = corpus.getOrDefault(word, 0.0);
        if (there <= 0.0) {
            return NEVER_WRITTEN_BY_THE_CORPUS;
        }
        final double ratio = here.getOrDefault(word, 0.0) / there;
        return ratio / (1.0 + ratio);
    }
}
