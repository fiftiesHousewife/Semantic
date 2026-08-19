package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * How far a repository got towards writing a run of words somebody else published.
 *
 * <p>A ranking says which subjects were reached and cannot say why an expected one was not. The answers are
 * different repairs: a run nobody wrote is a subject the code has nothing to do with, a run whose words are
 * all written but never adjacent is a naming convention rather than an absence, and a run written exactly as
 * published that still did not match is a defect in the matcher. Reporting them apart is what keeps the
 * three from being read as one.
 *
 * <p>Between the first two sits the run a declaration writes and no single name does — a type called one
 * thing with a member called another. It is counted on its own because it is the one bucket a reading can be
 * changed to reach, and pooling it with the words scattered over a whole repository reports a bound where an
 * estimate is available.
 */
public final class FurthestWritten {

    /** The longest published run worth looking for inside one declared name. */
    private static final int LONGEST_RUN = 6;

    /** How far the repository got, narrowest first. */
    public enum Reach {

        /** Written as this run of adjacent words, inside some declared name. */
        AS_THIS_RUN("written as this run"),

        /** Written as this run across one declaration, outermost name first, and inside no single name. */
        ACROSS_ONE_DECLARATION("written as this run across one declaration"),

        /** Every word written somewhere, and never next to the others in this order. */
        EVERY_WORD_NEVER_ADJACENT("every word written, never adjacent"),

        /** Some of its words written and some never written at all. */
        PARTLY_WRITTEN("some words written, some never"),

        /** No word of it written anywhere. */
        NOT_WRITTEN("no word of it written");

        private final String describes;

        Reach(final String describes) {
            this.describes = describes;
        }

        /** How far this is, in words a table can print. */
        public String describes() {
            return describes;
        }
    }

    /** What was reached, and the words the repository never wrote at all. */
    public record Reached(Reach reach, List<String> missing) {

        public Reached {
            missing = List.copyOf(missing);
        }
    }

    private final Set<List<String>> adjacent;
    private final Set<List<String>> acrossADeclaration;
    private final Set<String> words;

    private FurthestWritten(final Set<List<String>> adjacent, final Set<List<String>> acrossADeclaration,
                            final Set<String> words) {
        this.adjacent = adjacent;
        this.acrossADeclaration = acrossADeclaration;
        this.words = words;
    }

    /** Read from the declared names of one repository, each already split into its words. */
    public static FurthestWritten in(final List<List<String>> declaredNames) {
        return in(declaredNames, List.of());
    }

    /**
     * The same, with the words each declaration writes as a whole — its enclosing names and then its own.
     * A run adjacent there and in no single name is what a reading assembling across a declaration would
     * reach, and counting it needs the declarations rather than the names alone.
     */
    public static FurthestWritten in(final List<List<String>> declaredNames,
                                     final List<List<String>> declarations) {
        return new FurthestWritten(adjacentRuns(declaredNames), adjacentRuns(declarations),
                declaredNames.stream().flatMap(List::stream).collect(Collectors.toUnmodifiableSet()));
    }

    /** The furthest this run got, and no further. */
    public Reached of(final List<String> run) {
        if (adjacent.contains(run)) {
            return new Reached(Reach.AS_THIS_RUN, List.of());
        }
        if (acrossADeclaration.contains(run)) {
            return new Reached(Reach.ACROSS_ONE_DECLARATION, List.of());
        }
        final List<String> missing = run.stream().filter(word -> !words.contains(word)).toList();
        if (missing.size() == run.size()) {
            return new Reached(Reach.NOT_WRITTEN, missing);
        }
        return missing.isEmpty() ? new Reached(Reach.EVERY_WORD_NEVER_ADJACENT, List.of())
                : new Reached(Reach.PARTLY_WRITTEN, missing);
    }

    /** Every contiguous run of words inside a declared name, which is what a published run could meet. */
    private static Set<List<String>> adjacentRuns(final List<List<String>> declaredNames) {
        final Set<List<String>> runs = new HashSet<>();
        declaredNames.forEach(name -> IntStream.range(0, name.size()).forEach(start ->
                IntStream.rangeClosed(start + 1, Math.min(name.size(), start + LONGEST_RUN))
                        .forEach(end -> runs.add(name.subList(start, end)))));
        return runs;
    }
}
