package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * The data rows of a pooled table: one unit per line, densest first, with its occurrences, its share under
 * the table's weighting and the standard error of that share.
 *
 * <p>Two units of exactly equal share are ordered by their own spelling, so the file a run reads a rank off
 * is the same file on every machine and a re-pool moves a rank only where a count moved.
 */
final class PooledRows {

    private static final String COLUMN = "\t";
    private static final String ROW = "\n";
    private static final String SHARE = "%.3e";

    private PooledRows() {
    }

    /** Every unit the corpus pooled that the table states, ordered and formatted. */
    static String of(final CorpusWords corpus, final CorpusPooling pooling) {
        if (corpus.totalOccurrences() == 0) {
            throw new IllegalStateException("The corpus pooled no words at all, and an empty denominator "
                    + "demotes nothing — which is indistinguishable from a reference that found nothing to "
                    + "demote. Check that the clones are where the run was pointed.");
        }
        final Comparator<String> byShare = Comparator.comparingDouble(word -> pooling.shareOf(word, corpus));
        return corpus.words().stream()
                .sorted(byShare.reversed().thenComparing(Comparator.naturalOrder()))
                .map(word -> row(word, corpus, pooling))
                .collect(Collectors.joining(ROW, "", ROW));
    }

    private static String row(final String word, final CorpusWords corpus, final CorpusPooling pooling) {
        return String.join(COLUMN, word, String.valueOf(corpus.occurrencesOf(word)),
                String.format(Locale.ROOT, SHARE, pooling.shareOf(word, corpus)),
                String.format(Locale.ROOT, SHARE, pooling.errorOf(word, corpus)));
    }
}
