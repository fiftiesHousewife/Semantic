package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

/**
 * What a repository wrote of a taxonomy, arranged by how far below its own root the publisher states each
 * concept.
 *
 * <p>The two means answer different questions and both are reported. Per concept says where in the field's
 * hierarchy the repository's vocabulary sits; per span says where the writing went, so one ordinary word the
 * taxonomy happens to claim, written eight hundred times, moves the second and barely moves the first.
 */
public record WrittenByDepth(Map<Integer, Normalisation> byNormalisation) {

    /** What was written at one normalisation: how many distinct concepts, and how many times between them. */
    public record Normalisation(int concepts, int spans) {

        static final Normalisation NOTHING = new Normalisation(0, 0);

        static Normalisation oneConcept(final int written) {
            return new Normalisation(1, written);
        }

        Normalisation and(final Normalisation another) {
            return new Normalisation(concepts + another.concepts, spans + another.spans);
        }
    }

    public WrittenByDepth {
        byNormalisation = Map.copyOf(byNormalisation);
    }

    public static WrittenByDepth of(final List<TaxonomyTree.Node> written, final StatedDepth depth) {
        final Map<Integer, Normalisation> byNormalisation = new LinkedHashMap<>();
        written.forEach(node -> byNormalisation.merge(depth.below(node.label()),
                Normalisation.oneConcept(node.written()), Normalisation::and));
        return new WrittenByDepth(byNormalisation);
    }

    /** What was written at one normalisation, which is nothing where the repository wrote nothing there. */
    public Normalisation at(final int normalisation) {
        return byNormalisation.getOrDefault(normalisation, Normalisation.NOTHING);
    }

    public int concepts() {
        return byNormalisation.values().stream().mapToInt(Normalisation::concepts).sum();
    }

    public int spans() {
        return byNormalisation.values().stream().mapToInt(Normalisation::spans).sum();
    }

    /** The deepest normalisation anything reached, so a table stops where the reading did. */
    public int deepestWritten() {
        return byNormalisation.keySet().stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    /** How deep the repository's vocabulary sits, counting each concept once. */
    public double meanLevelPerConcept() {
        return concepts() == 0 ? 0.0
                : weighted(Normalisation::concepts) / concepts();
    }

    /** How deep the writing went, counting each occurrence. */
    public double meanLevelPerSpan() {
        return spans() == 0 ? 0.0 : weighted(Normalisation::spans) / spans();
    }

    private double weighted(final ToIntFunction<Normalisation> of) {
        return byNormalisation.entrySet().stream()
                .mapToDouble(normalisation -> normalisation.getKey() * (double) of.applyAsInt(normalisation.getValue()))
                .sum();
    }
}
