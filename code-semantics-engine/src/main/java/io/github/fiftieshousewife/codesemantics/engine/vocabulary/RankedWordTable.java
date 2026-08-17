package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.DivergenceShare;
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

    private static final DivergenceShare DIVERGENCE = new DivergenceShare();

    private final List<ChosenWord> ranked;

    RankedWordTable(final List<ChosenWord> ranked) {
        this.ranked = List.copyOf(ranked);
    }

    String of(final List<ChosenWord> rows) {
        return rows.stream().map(this::row).collect(Collectors.joining("\n", header() + "\n", ""));
    }

    /**
     * The first rows open, the rest behind one fold. Three hundred rows of a four-column table is a document
     * nobody scrolls to the end of, and the rows below the first fifty are the tail the ranking exists to
     * show — so they are folded rather than cut, and the fold says how many it holds.
     */
    String folded(final List<ChosenWord> rows, final int shown, final String what) {
        if (rows.size() <= shown) {
            return of(rows);
        }
        return "%s%n%n<details>%n<summary>%d more %s</summary>%n%n%s%n</details>".formatted(
                of(rows.subList(0, shown)), rows.size() - shown, what, of(rows.subList(shown, rows.size())));
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
                claim(word.claim()), count(word.occurrences()), percentage(word.nameShare()),
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

    /**
     * One word's term of the divergence, as the share of the statistic's own maximum it holds. The terms sum
     * to the whole, so a single one is a small share of a bound that is one bit by definition.
     */
    String claim(final double value) {
        return DIVERGENCE.ofOneTerm(value);
    }

    String share(final double value) {
        return String.format(Locale.ROOT, "%.4f%%", value * 100.0);
    }

    String percentage(final double value) {
        return String.format(Locale.ROOT, "%.1f%%", value * 100.0);
    }
}
