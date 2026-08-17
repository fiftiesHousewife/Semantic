package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * What moved between two readings, as a person reads it: the figures side by side, then the names that
 * entered or left.
 *
 * <p>Nothing is called an improvement. The reading covers this repository's own documentation, so writing a
 * figure down moves it, and a report that graded its own movement would be marking its own homework. What it
 * states is which figures differ and which stated tests changed their answer.
 */
public final class ChangeReport {

    public String render(final ReadingChanges changes) {
        return heading(changes) + figures(changes) + crossings(changes);
    }

    private static String heading(final ReadingChanges changes) {
        return String.format("# What moved since the last reading%n%n"
                        + "Read at `%s`, against the reading committed at `%s`.%n%n"
                        + "Every figure here moves whenever a source file or a markdown file does, because "
                        + "the reading covers this repository's own documentation. So the figures are stated "
                        + "before and after and nothing is called large. What is worth acting on is the "
                        + "second table: each of those names cleared a stated bar in one reading and not in "
                        + "the other.%n",
                shortened(changes.commit()), shortened(changes.previousCommit()));
    }

    /** A commit is quoted at the length a person compares by, and in full nowhere a report is read. */
    private static String shortened(final String commit) {
        return commit.length() > SHA_SHOWN ? commit.substring(0, SHA_SHOWN) : commit;
    }

    private static final int SHA_SHOWN = 8;

    private static String figures(final ReadingChanges changes) {
        final StringBuilder table = new StringBuilder(String.format(
                "%n## The figures%n%n| Figure | Before | After | |%n|---|--:|--:|---|%n"));
        changes.moved().forEach(moved -> table.append(String.format("| %s | %s | %s | %s |%n",
                moved.figure(), moved.before(), moved.after(), moved.changed() ? "moved" : "")));
        return table.toString();
    }

    private static String crossings(final ReadingChanges changes) {
        if (changes.crossings().isEmpty()) {
            return String.format("%n## What entered and left%n%n"
                    + "Nothing entered or left. Every topic, word and concept the previous reading "
                    + "reported is reported by this one.%n");
        }
        return String.format("%n## What entered and left%n%n"
                + "| Population | Entered | Left |%n|---|---|---|%n")
                + Arrays.stream(ReadingPopulation.values())
                        .map(population -> row(population, changes))
                        .collect(Collectors.joining());
    }

    private static String row(final ReadingPopulation population, final ReadingChanges changes) {
        return String.format("| %s | %s | %s |%n", population.label(),
                named(changes, population, true), named(changes, population, false));
    }

    private static String named(final ReadingChanges changes, final ReadingPopulation population,
                                final boolean entered) {
        final List<String> names = changes.crossings().stream()
                .filter(crossing -> crossing.population() == population && crossing.entered() == entered)
                .map(crossing -> "`%s`".formatted(crossing.name()))
                .toList();
        return names.isEmpty() ? "—" : String.join(" ", names);
    }
}
