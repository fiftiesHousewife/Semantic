package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * How a corpus's repositories are combined into the one distribution a reading is read against.
 *
 * <p>The two answer different questions and neither is obviously right, so both are written and the choice
 * is made against the criteria the plan states rather than argued. Summing counts estimates the density of
 * Java text, where a repository of a million words says a thousand times what one of a thousand words says.
 * Averaging shares estimates the density of a Java repository, which is what the frame drew: the sample is
 * uniform over repositories, not over bytes.
 *
 * <p>Both sum to one over the words the corpus holds.
 */
public enum CorpusPooling {

    /** Every occurrence weighs the same, so a large repository weighs more than a small one. */
    POOLED_OCCURRENCES("pooled-occurrences",
            "every occurrence weighs the same, so a repository of a million words sets a thousand times "
                    + "as much of this table as one of a thousand words") {
        @Override
        public double shareOf(final String word, final CorpusWords corpus) {
            return (double) corpus.occurrencesOf(word) / corpus.totalOccurrences();
        }

        @Override
        public double errorOf(final String word, final CorpusWords corpus) {
            final double share = shareOf(word, corpus);
            return Math.sqrt(share * (1 - share) / corpus.totalOccurrences());
        }
    },

    /** Every repository weighs the same, whatever its size. */
    MEAN_OF_SHARES("mean-of-shares",
            "every repository weighs the same whatever its size, which is the population the frame drew "
                    + "from: the sample is uniform over repositories rather than over bytes") {
        @Override
        public double shareOf(final String word, final CorpusWords corpus) {
            return corpus.summedShareOf(word) / corpus.repositories();
        }

        @Override
        public double errorOf(final String word, final CorpusWords corpus) {
            final int n = corpus.repositories();
            if (n < 2) {
                return 0.0;
            }
            final double mean = shareOf(word, corpus);
            final double variance = (corpus.summedSquaredShareOf(word) - n * mean * mean) / (n - 1);
            return Math.sqrt(Math.max(0.0, variance) / n);
        }
    };

    private static final String WORD_TABLE = "reference-corpus-";
    private static final String RUN_TABLE = "reference-corpus-run-";
    private static final String TSV = ".tsv";

    private final String weighting;
    private final String weighs;

    CorpusPooling(final String weighting, final String weighs) {
        this.weighting = weighting;
        this.weighs = weighs;
    }

    /** What the table this pooling produces is called, so one run writes both without naming either. */
    public String fileName() {
        return WORD_TABLE + weighting + TSV;
    }

    /**
     * What the same pooling's table over runs is called. It is a second table read only by the term path:
     * the word table states every unit a reading produces, runs included, because that is the denominator a
     * word is ranked against, and a run needs a denominator of runs.
     */
    public String runFileName() {
        return RUN_TABLE + weighting + TSV;
    }

    /** What it weighs equally, for the table's own header to say. */
    public String weighs() {
        return weighs;
    }

    /**
     * The standard error of this pooling's share for one word, from the pooling's own sampling model.
     *
     * <p>The mean of shares is a mean over repositories, so its error is the between-repository standard
     * error of that mean — the split-half disagreement measured word by word. Pooled occurrences is a
     * multinomial over occurrences, so its error is the binomial standard error of the proportion. Neither
     * is a chosen margin: each follows from what its weighting states the table estimates.
     */
    public abstract double errorOf(String word, CorpusWords corpus);

    /** The whole corpus as a distribution over its words, which is what a divergence is taken between. */
    public Map<String, Double> shareByWord(final CorpusWords corpus) {
        return corpus.words().stream()
                .collect(Collectors.toUnmodifiableMap(word -> word, word -> shareOf(word, corpus)));
    }

    /** The word's share of the corpus under this weighting. */
    public abstract double shareOf(String word, CorpusWords corpus);
}
