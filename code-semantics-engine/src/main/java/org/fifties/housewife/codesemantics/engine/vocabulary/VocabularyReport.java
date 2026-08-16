package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.reading.WrittenWords;

/**
 * Renders a ranking of chosen words as the markdown a reader can argue with: every claim beside the shares
 * it was computed from, the place the same word would have held on a count alone, and the words the language
 * supplied rather than the author choosing them.
 *
 * <p>The three tables are one ranking read three ways. Nothing is removed from it: a word English put inside
 * a name is shown in its own table with the place it would otherwise have held, which is also why the first
 * table's numbering has gaps.
 */
public final class VocabularyReport {

    private static final int COUNTED = 20;

    private static final String COUNT_HEADER = """
            | Written most | Occurrences | Its place once the references are asked |
            |---|--:|--:|""";

    private final List<VocabularyNull.Bar> bars;

    public VocabularyReport(final List<VocabularyNull.Bar> bars) {
        this.bars = List.copyOf(bars);
    }

    public String render(final String heading, final List<ChosenWord> ranked, final WrittenWords written) {
        final RankedWordTable table = new RankedWordTable(ranked);
        final Map<String, Double> barByReference = VocabularyNull.byReference(bars);
        final List<ChosenWord> chose = chose(ranked)
                .filter(word -> word.clears(barByReference))
                .toList();
        final List<String> lines = new ArrayList<>();
        lines.add("## " + heading);
        lines.add("");
        lines.add(summary(table, ranked, chose, written));
        lines.add("");
        lines.add(bar(table));
        lines.add("");
        lines.add(table.of(chose));
        lines.add("");
        lines.add("### What the language supplied");
        lines.add("");
        lines.add(supplied(table, ranked));
        lines.add("");
        lines.add("### What a count on its own would have said");
        lines.add("");
        lines.add(COUNT_HEADER);
        counted(table, ranked).forEach(lines::add);
        return String.join("\n", lines) + "\n";
    }

    private String summary(final RankedWordTable table, final List<ChosenWord> ranked,
                           final List<ChosenWord> chose, final WrittenWords written) {
        return ("**%s occurrences of %s distinct words**, read against %s. The %s that clear the bar hold %s "
                + "of what was written and %s of the divergence, and %s of their occurrences are names. %s "
                + "words in the ranking are ones a reference writes more densely than this repository does, "
                + "and %s are ones English supplied rather than the author choosing them; both are shown "
                + "below rather than removed.").formatted(
                table.count(written.totalOccurrences()), table.count(ranked.size()), references(ranked),
                table.count(chose.size()), table.percentage(chose.stream().mapToDouble(ChosenWord::share).sum()),
                table.percentage(claimShare(ranked, chose)), table.percentage(nameShare(chose)),
                table.count(ranked.stream().filter(word -> word.claim() < 0.0).count()),
                table.count(ranked.stream().filter(ChosenWord::theLanguages).count()));
    }

    /**
     * What the cutoff is, said in the terms it was derived in. A reader who wants to argue with the number
     * of rows has to argue with the null rather than with a preference.
     */
    private String bar(final RankedWordTable table) {
        return bars.stream()
                .map(bar -> ("A word is here where it beats **%s bits** against %s — the claim a word of a "
                        + "repository this size reaches by chance in the best of a field of %s, over %s "
                        + "draws yielding %s scored words from that reference's own distribution.")
                        .formatted(table.bits(bar.bits()), bar.reference(), table.count(bar.field()),
                                table.count(bar.resamples()), table.count(bar.drawn())))
                .collect(Collectors.joining(" "));
    }

    /** The share of the ranking's positive divergence the rows above the bar hold, bounded at one. */
    private static double claimShare(final List<ChosenWord> ranked, final List<ChosenWord> chose) {
        final double positive = ranked.stream().mapToDouble(ChosenWord::claim).filter(bits -> bits > 0.0).sum();
        return positive == 0.0 ? 0.0 : chose.stream().mapToDouble(ChosenWord::claim).sum() / positive;
    }

    /**
     * The words English put inside a name, in the order the ranking put them — the top of this table is what
     * the top of the other one would have been.
     */
    private String supplied(final RankedWordTable table, final List<ChosenWord> ranked) {
        return table.of(ranked.stream().filter(ChosenWord::theLanguages).limit(COUNTED).toList());
    }

    /** The commonest words beside where the references put them, which is the whole argument in one table. */
    private List<String> counted(final RankedWordTable table, final List<ChosenWord> ranked) {
        return ranked.stream()
                .sorted(Comparator.comparingInt(ChosenWord::occurrences).reversed()
                        .thenComparing(ChosenWord::word))
                .limit(COUNTED)
                .map(word -> "| `%s` | %s | %s |".formatted(word.word(), table.count(word.occurrences()),
                        table.count(table.placeOf(word))))
                .toList();
    }

    private static Stream<ChosenWord> chose(final List<ChosenWord> ranked) {
        return ranked.stream().filter(word -> !word.theLanguages());
    }

    private static double nameShare(final List<ChosenWord> chose) {
        final double occurrences = chose.stream().mapToInt(ChosenWord::occurrences).sum();
        return occurrences == 0.0 ? 0.0 : chose.stream().mapToInt(ChosenWord::inNames).sum() / occurrences;
    }

    private static String references(final List<ChosenWord> ranked) {
        return ranked.stream().findFirst().map(ChosenWord::against).orElse(List.of()).stream()
                .map(ChosenWord.ReferenceClaim::reference)
                .collect(Collectors.joining(" and "));
    }
}
