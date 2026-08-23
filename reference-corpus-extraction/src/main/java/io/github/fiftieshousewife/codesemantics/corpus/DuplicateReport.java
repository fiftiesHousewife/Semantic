package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Renders every pair of the draw, nearest first, and the repositories a re-draw refuses.
 *
 * <p>Every pair is printed rather than only the ones that fail, so the pairs just above the cutoff can be
 * read: how near the nearest pair that is not one corpus sits is what says whether the cutoff is arguable.
 */
public final class DuplicateReport {

    private static final String ROW = "\n";

    public String of(final List<NearDuplicates.Judged> judged, final List<String> drawnTwice) {
        return Stream.concat(
                        Stream.of(String.format(Locale.ROOT,
                                "how far each pair of the draw sits, and how far two draws of their sizes "
                                        + "sit%n  %-42s %-42s %10s %10s %10s %10s %s",
                                "drawn first", "drawn second", "first", "second", "between", "chance",
                                "one corpus")),
                        judged.stream().map(DuplicateReport::row))
                .collect(Collectors.joining(ROW, "", ROW))
                + refusals(drawnTwice);
    }

    private String refusals(final List<String> drawnTwice) {
        if (drawnTwice.isEmpty()) {
            return String.format(Locale.ROOT,
                    "  no pair is nearer than chance — every drawn repository is its own corpus%n");
        }
        return String.format(Locale.ROOT, "  drawn twice, so a re-draw refuses: %s%n",
                String.join(", ", drawnTwice));
    }

    private static String row(final NearDuplicates.Judged judged) {
        return String.format(Locale.ROOT, "  %-42s %-42s %10d %10d %10.6f %10.6f %s",
                judged.left(), judged.right(), judged.leftOccurrences(), judged.rightOccurrences(),
                judged.between(), judged.chance(), judged.isOneCorpus() ? "yes" : "no");
    }
}
