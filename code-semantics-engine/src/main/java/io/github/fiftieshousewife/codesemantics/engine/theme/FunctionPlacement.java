package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Where a body of code stands against each function of a published framework, and how near a chance
 * partition of the same statements would have stood.
 *
 * <p>A function is read from every statement filed under it, pooled — its own overview and each outcome
 * beneath it — because no single outcome is long enough to be a stable distribution and the function is what
 * the framework reports at. The pooling is the framework's own: the statements under a function are the ones
 * it says are under it. Each statement is read once and remembered, and a function's distribution is the sum
 * of what its statements committed, normalised once — so a sentence never runs across two statements, and a
 * permutation repools sums rather than re-reading text.
 *
 * <p>The null is {@link PermutedAssignment} and not a resampled vocabulary, so a function clears it only
 * where the framework's own partition of its statements carries something a chance partition does not.
 */
public final class FunctionPlacement {

    private static final String STATEMENT = "statement";

    private final SubjectAreas areas;
    private final TopicComparison comparison;
    private final PermutedAssignment permuted;
    private final int resamples;

    private final Map<String, FileTopics> readByStatement = new HashMap<>();

    public FunctionPlacement(final SubjectAreas areas, final TopicComparison comparison,
                             final PermutedAssignment permuted, final int resamples) {
        this.areas = areas;
        this.comparison = comparison;
        this.permuted = permuted;
        this.resamples = resamples;
    }

    public static FunctionPlacement fromClasspath() {
        return new FunctionPlacement(SubjectAreas.fromClasspath(), new JensenShannon()::divergence,
                new PermutedAssignment(), SubjectNull.RESAMPLES);
    }

    /** How far a scope stands from one function, nearest first. */
    public List<SubjectPlacement.Placement> of(final TopicDistribution scope,
                                               final Map<String, List<String>> statedByFunction) {
        return statedByFunction.entrySet().stream()
                .map(stated -> placed(scope, stated.getKey(), stated.getValue()))
                .sorted(Comparator.comparingDouble(SubjectPlacement.Placement::bits)
                        .thenComparing(SubjectPlacement.Placement::concept))
                .toList();
    }

    /** The nearest a chance partition of the same statements reaches, over the same field size. */
    public SubjectNull.Chance chance(final double nearest, final TopicDistribution scope,
                                     final Map<String, List<String>> statedByFunction,
                                     final Random draws) {
        final List<Double> drawn = new ArrayList<>();
        for (int draw = 0; draw < resamples; draw++) {
            of(scope, permuted.of(statedByFunction, draws)).stream().findFirst()
                    .ifPresent(placement -> drawn.add(placement.bits()));
        }
        Collections.sort(drawn);
        return new SubjectNull.Chance(nearest,
                drawn.get(SubjectNull.bestOf(statedByFunction.size(), drawn.size())),
                statedByFunction.size(), drawn.size());
    }

    private SubjectPlacement.Placement placed(final TopicDistribution scope, final String function,
                                              final List<String> statements) {
        final TopicDistribution pooled = pooled(statements);
        return new SubjectPlacement.Placement(function, function, function,
                pooled.isEmpty() ? 1.0 : comparison.between(scope, pooled), List.of());
    }

    private TopicDistribution pooled(final List<String> statements) {
        final List<FileTopics> readings = statements.stream().map(this::reading).toList();
        return TopicDistribution.of(readings.stream()
                        .flatMap(reading -> reading.massByTopic().entrySet().stream())
                        .collect(Collectors.groupingBy(Map.Entry::getKey,
                                Collectors.summingDouble(Map.Entry::getValue))),
                readings.stream().mapToDouble(FileTopics::unplacedMass).sum());
    }

    private FileTopics reading(final String statement) {
        return readByStatement.computeIfAbsent(statement,
                text -> areas.topicsIn(STATEMENT, text));
    }
}
