package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * One table of a vocabulary ranking: the header the references name, and a row per word.
 *
 * <p>A place is where the word stands in the whole ranking rather than where it sits in the rows printed, so
 * a table that leaves words out numbers 1, 2, 3, 5 and the gap is the reader's cue to look for the word that
 * held it. The same numbering serves the table of what the language supplied, which has to say where each of
 * its words would otherwise have stood.
 */
final class RankedWordTable {

    private final List<ChosenWord> ranked;

    RankedWordTable(final List<ChosenWord> ranked) {
        this.ranked = List.copyOf(ranked);
    }

    String of(final List<ChosenWord> rows) {
        return rows.stream().map(this::row).collect(Collectors.joining("\n", header() + "\n", ""));
    }

    private String header() {
        final String columns = claims().stream()
                .map(claim -> "In %s | ".formatted(claim.reference()))
                .collect(Collectors.joining());
        return "| # | Word | Claim | Occurrences | In names | Here | %sFirst seen |%n|--:|---|--:|--:|--:|--:|%s---|"
                .formatted(columns, "--:|".repeat(claims().size()));
    }

    private String row(final ChosenWord word) {
        final String references = word.against().stream()
                .map(claim -> share(claim.share()) + " | ")
                .collect(Collectors.joining());
        return "| %s | `%s` | %s | %s | %s | %s | %s`%s` |".formatted(count(placeOf(word)), word.word(),
                bits(word.claim()), count(word.occurrences()), percentage(word.nameShare()),
                share(word.share()), references, word.site());
    }

    /** Where the word stands in the ranking it was taken from, counting from one. */
    int placeOf(final ChosenWord word) {
        return ranked.indexOf(word) + 1;
    }

    private List<ChosenWord.ReferenceClaim> claims() {
        return ranked.stream().findFirst().map(ChosenWord::against).orElse(List.of());
    }

    String count(final long value) {
        return String.format(Locale.ROOT, "%,d", value);
    }

    String bits(final double value) {
        return String.format(Locale.ROOT, "%.6f", value);
    }

    String share(final double value) {
        return String.format(Locale.ROOT, "%.4f%%", value * 100.0);
    }

    String percentage(final double value) {
        return String.format(Locale.ROOT, "%.1f%%", value * 100.0);
    }
}
