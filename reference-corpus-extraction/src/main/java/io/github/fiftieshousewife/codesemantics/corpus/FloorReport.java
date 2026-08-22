package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Renders what each repository says beyond chance, smallest first, and the occurrence count the answer
 * changes at.
 */
public final class FloorReport {

    private static final String ROW = "\n";

    public String of(final CorpusPooling pooling, final List<OccurrenceFloor.Judged> judged, final int floor) {
        return Stream.concat(
                        Stream.of(String.format(Locale.ROOT,
                                "%s: what each repository says that a draw of its size would not%n"
                                        + "  %-44s %12s %10s %10s %s",
                                pooling, "repository", "occurrences", "its bits", "chance", "says more")),
                        judged.stream().map(FloorReport::row))
                .collect(Collectors.joining(ROW, "", ROW))
                + String.format(Locale.ROOT,
                        "  the floor: %,d occurrences — the largest repository saying no more than chance%n",
                        floor);
    }

    private static String row(final OccurrenceFloor.Judged judged) {
        return String.format(Locale.ROOT, "  %-44s %12d %10.6f %10.6f %s",
                judged.name(), judged.occurrences(), judged.own(), judged.drawn(),
                judged.saysMoreThanChance() ? "yes" : "no");
    }
}
