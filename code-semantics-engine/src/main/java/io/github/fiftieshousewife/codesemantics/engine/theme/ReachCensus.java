package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * How much of a subject scheme a repository could reach at all, counted into the buckets that name the
 * repair each one needs.
 *
 * <p>A ranking says which topics were reached and cannot say why the rest were not. The buckets are
 * different answers with different prices: a run written exactly as published that no rung matched is a
 * matcher defect, a run whose every word is written but never adjacent is a naming convention, and a run no
 * word of which appears is a subject the code has nothing to do with. Reporting them as one number is what
 * makes an expensive repair look as promising as a cheap one.
 *
 * <p>Every share is over the keywords the census read, so it bounds at 1 by its own definition.
 */
public record ReachCensus(Map<FurthestWritten.Reach, Long> inDeclarations,
                          Map<FurthestWritten.Reach, Long> inProse, long keywords, long onlyInProse) {

    public ReachCensus {
        inDeclarations = Map.copyOf(inDeclarations);
        inProse = Map.copyOf(inProse);
    }

    public static ReachCensus over(final List<KeywordReach> reached) {
        return new ReachCensus(counted(reached, KeywordReach::inDeclarations),
                counted(reached, KeywordReach::inProse), reached.size(),
                reached.stream().filter(KeywordReach::writtenOnlyInProse).count());
    }

    private static Map<FurthestWritten.Reach, Long> counted(final List<KeywordReach> reached,
            final java.util.function.Function<KeywordReach, FurthestWritten.Reach> population) {
        return reached.stream().collect(Collectors.groupingBy(population, Collectors.counting()));
    }

    /** How many keywords a repository's declared names got this far towards, and no further. */
    public long declared(final FurthestWritten.Reach reach) {
        return inDeclarations.getOrDefault(reach, 0L);
    }

    /** That count as a share of what the census read, which cannot exceed 1. */
    public double shareDeclared(final FurthestWritten.Reach reach) {
        return keywords == 0 ? 0.0 : declared(reach) / (double) keywords;
    }

    /** The share a prose arm would add, which is the size of the decision about reading sentences. */
    public double shareOnlyInProse() {
        return keywords == 0 ? 0.0 : onlyInProse / (double) keywords;
    }
}
