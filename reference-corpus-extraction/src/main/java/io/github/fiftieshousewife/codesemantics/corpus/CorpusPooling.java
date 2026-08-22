package io.github.fiftieshousewife.codesemantics.corpus;

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
    POOLED_OCCURRENCES("reference-corpus-pooled-occurrences.tsv",
            "every occurrence weighs the same, so a repository of a million words sets a thousand times "
                    + "as much of this table as one of a thousand words") {
        @Override
        public double shareOf(final String word, final CorpusWords corpus) {
            return (double) corpus.occurrencesOf(word) / corpus.totalOccurrences();
        }
    },

    /** Every repository weighs the same, whatever its size. */
    MEAN_OF_SHARES("reference-corpus-mean-of-shares.tsv",
            "every repository weighs the same whatever its size, which is the population the frame drew "
                    + "from: the sample is uniform over repositories rather than over bytes") {
        @Override
        public double shareOf(final String word, final CorpusWords corpus) {
            return corpus.summedShareOf(word) / corpus.repositories();
        }
    };

    private final String fileName;
    private final String weighs;

    CorpusPooling(final String fileName, final String weighs) {
        this.fileName = fileName;
        this.weighs = weighs;
    }

    /** What the table this pooling produces is called, so one run writes both without naming either. */
    public String fileName() {
        return fileName;
    }

    /** What it weighs equally, for the table's own header to say. */
    public String weighs() {
        return weighs;
    }

    /** The word's share of the corpus under this weighting. */
    public abstract double shareOf(String word, CorpusWords corpus);
}
