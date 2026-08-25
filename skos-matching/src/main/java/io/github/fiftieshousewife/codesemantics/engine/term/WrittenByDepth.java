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
public record WrittenByDepth(Map<Integer, Rung> byRung) {

    /** What was written at one rung: how many distinct concepts, and how many times between them. */
    public record Rung(int concepts, int spans) {

        static final Rung NOTHING = new Rung(0, 0);

        static Rung oneConcept(final int written) {
            return new Rung(1, written);
        }

        Rung and(final Rung another) {
            return new Rung(concepts + another.concepts, spans + another.spans);
        }
    }

    public WrittenByDepth {
        byRung = Map.copyOf(byRung);
    }

    public static WrittenByDepth of(final List<TaxonomyTree.Node> written, final StatedDepth depth) {
        final Map<Integer, Rung> byRung = new LinkedHashMap<>();
        written.forEach(node -> byRung.merge(depth.below(node.label()),
                Rung.oneConcept(node.written()), Rung::and));
        return new WrittenByDepth(byRung);
    }

    /** What was written at one rung, which is nothing where the repository wrote nothing there. */
    public Rung at(final int rung) {
        return byRung.getOrDefault(rung, Rung.NOTHING);
    }

    public int concepts() {
        return byRung.values().stream().mapToInt(Rung::concepts).sum();
    }

    public int spans() {
        return byRung.values().stream().mapToInt(Rung::spans).sum();
    }

    /** The deepest rung anything reached, so a table stops where the reading did. */
    public int deepestWritten() {
        return byRung.keySet().stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    /** How deep the repository's vocabulary sits, counting each concept once. */
    public double meanRungPerConcept() {
        return concepts() == 0 ? 0.0
                : weighted(Rung::concepts) / concepts();
    }

    /** How deep the writing went, counting each occurrence. */
    public double meanRungPerSpan() {
        return spans() == 0 ? 0.0 : weighted(Rung::spans) / spans();
    }

    private double weighted(final ToIntFunction<Rung> of) {
        return byRung.entrySet().stream()
                .mapToDouble(rung -> rung.getKey() * (double) of.applyAsInt(rung.getValue()))
                .sum();
    }
}
