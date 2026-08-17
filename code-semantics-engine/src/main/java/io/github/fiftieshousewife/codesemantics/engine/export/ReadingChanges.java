package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.DivergenceShare;

/**
 * What moved between one reading of a repository and the next.
 *
 * <p>Two kinds of movement, and they are reported apart because only one of them is a result. A
 * {@link Moved} figure is a number that changed, stated before and after with nothing called large or small:
 * every figure here shifts whenever a source file or a markdown file does, so a threshold on it would be a
 * number somebody chose. A {@link Crossing} is a name that entered or left the reading, and every population
 * a name can be in has a bar of its own that it had to clear — so a crossing is a stated test changing its
 * answer, which needs no threshold at all.
 *
 * <p>It compares two exports and nothing else. The export is the reading; the reports are a rendering of it,
 * so a comparison built on the reports would be comparing the rendering.
 */
public record ReadingChanges(String previousCommit, String commit, List<Moved> moved,
                             List<Crossing> crossings) {

    /** One figure, as each reading stated it. Both sides are already formatted, so neither is re-rounded. */
    public record Moved(String figure, String before, String after) {

        public boolean changed() {
            return !before.equals(after);
        }
    }

    /** A name that entered or left a population between the two readings. */
    public record Crossing(ReadingPopulation population, String name, boolean entered) {
    }

    public ReadingChanges {
        moved = List.copyOf(moved);
        crossings = List.copyOf(crossings);
    }

    public static ReadingChanges between(final ReadingExport before, final ReadingExport after) {
        return new ReadingChanges(before.summary().commit(), after.summary().commit(),
                movedBetween(before, after), crossingsBetween(before, after));
    }

    /** Whether anything at all moved, which is what decides whether a report is worth writing. */
    public boolean anyChange() {
        return !crossings.isEmpty() || moved.stream().anyMatch(Moved::changed);
    }

    private static List<Moved> movedBetween(final ReadingExport before, final ReadingExport after) {
        final DivergenceShare divergence = new DivergenceShare();
        final List<Moved> moved = new ArrayList<>();
        moved.add(share("λ — words a resource can be cited for", before.summary().shareOfWordsWithACitation(),
                after.summary().shareOfWordsWithACitation()));
        moved.add(share("Mass settled on no subject", before.summary().shareOfMassOnNoSubject(),
                after.summary().shareOfMassOnNoSubject()));
        moved.addAll(placement(divergence, "Archive", before.summary().placedIn().archive(),
                after.summary().placedIn().archive()));
        moved.addAll(placement(divergence, "Category", before.summary().placedIn().category(),
                after.summary().placedIn().category()));
        moved.add(tally("Words above the bar", before.summary().counts().signals(),
                after.summary().counts().signals()));
        moved.add(tally("Topics reported", before.summary().counts().themes(),
                after.summary().counts().themes()));
        moved.add(tally("Concepts written", before.summary().counts().concepts(),
                after.summary().counts().concepts()));
        return List.copyOf(moved);
    }

    /**
     * A placement is three statements and each can move on its own: which subject came nearest, how far it
     * stood, and whether that beat what a taxonomy of chance reaches. A reading that moved nearer a subject
     * and stopped standing apart from chance has got worse, and one figure would hide it.
     */
    private static List<Moved> placement(final DivergenceShare divergence, final String level,
                                         final ExportedPlacement.Level before,
                                         final ExportedPlacement.Level after) {
        return List.of(
                new Moved(level + " — nearest subject", before.subject(), after.subject()),
                new Moved(level + " — divergence", divergence.of(before.divergenceBits()),
                        divergence.of(after.divergenceBits())),
                new Moved(level + " — chance reaches", divergence.of(before.nearestByChanceBits()),
                        divergence.of(after.nearestByChanceBits())),
                new Moved(level + " — stands apart from chance", stated(before.standsApartFromChance()),
                        stated(after.standsApartFromChance())));
    }

    private static List<Crossing> crossingsBetween(final ReadingExport before, final ReadingExport after) {
        return Arrays.stream(ReadingPopulation.values())
                .flatMap(population -> crossingsIn(population, population.in(before), population.in(after))
                        .stream())
                .toList();
    }

    private static List<Crossing> crossingsIn(final ReadingPopulation population, final Set<String> before,
                                              final Set<String> after) {
        final List<Crossing> crossings = new ArrayList<>();
        after.stream().filter(name -> !before.contains(name)).sorted()
                .forEach(name -> crossings.add(new Crossing(population, name, true)));
        before.stream().filter(name -> !after.contains(name)).sorted()
                .forEach(name -> crossings.add(new Crossing(population, name, false)));
        return crossings;
    }

    private static Moved share(final String figure, final double before, final double after) {
        return new Moved(figure, percentage(before), percentage(after));
    }

    private static Moved tally(final String figure, final int before, final int after) {
        return new Moved(figure, String.format(Locale.ROOT, "%,d", before),
                String.format(Locale.ROOT, "%,d", after));
    }

    private static String percentage(final double value) {
        return String.format(Locale.ROOT, "%.1f%%", 100.0 * value);
    }

    private static String stated(final boolean apart) {
        return apart ? "yes" : "no";
    }
}
