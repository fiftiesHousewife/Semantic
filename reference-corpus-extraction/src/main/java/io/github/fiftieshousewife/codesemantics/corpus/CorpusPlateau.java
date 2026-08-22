package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;

/**
 * Whether a corpus has stopped moving: how far the reference travels as each drawn repository joins it, and
 * how far it would travel if any one of them left.
 *
 * <p>Both are Jensen–Shannon divergences in bits, bounded at 1 by the statistic's own definition, so a flat
 * curve is flat against a ceiling nobody chose. A draw whose steps are still large at its last row has not
 * converged and the sample extends; a draw whose steps have gone quiet has answered how many is enough.
 *
 * <p>The order is the drawn order and never a sorted one. A prefix of a seeded stream is a smaller sample
 * from the same frame; a prefix of a re-sorted list is a sample from something else.
 */
public final class CorpusPlateau {

    /** One repository joining the pool: what it moved the reference, and what remains to the whole draw. */
    public record Step(int repositories, String joined, int words, double fromPrevious, double fromWhole) {
    }

    /** One repository leaving the whole pool: how far the reference moves without it. */
    public record Absence(String left, double moves) {
    }

    private final ShareDivergence divergence;

    public CorpusPlateau(final ShareDivergence divergence) {
        this.divergence = divergence;
    }

    public static CorpusPlateau newInstance() {
        return new CorpusPlateau(new ShareDivergence());
    }

    /** The curve: one row per repository, in the drawn order. The first row has no step before it. */
    public List<Step> over(final List<CountedRepository> drawn, final CorpusPooling pooling) {
        final Map<String, Double> whole = pooling.shareByWord(taking(drawn, drawn.size()));
        final List<Step> steps = new ArrayList<>();
        Map<String, Double> previous = Map.of();
        for (int taken = 1; taken <= drawn.size(); taken++) {
            final CorpusWords pooled = taking(drawn, taken);
            final Map<String, Double> current = pooling.shareByWord(pooled);
            steps.add(new Step(taken, drawn.get(taken - 1).name(), pooled.words().size(),
                    taken == 1 ? Double.NaN : divergence.between(previous, current),
                    divergence.between(current, whole)));
            previous = current;
        }
        return List.copyOf(steps);
    }

    /** What the reference loses with each repository taken out of the whole draw, heaviest first. */
    public List<Absence> leavingEachOut(final List<CountedRepository> drawn, final CorpusPooling pooling) {
        final Map<String, Double> whole = pooling.shareByWord(taking(drawn, drawn.size()));
        return IntStream.range(0, drawn.size())
                .mapToObj(left -> new Absence(drawn.get(left).name(),
                        divergence.between(pooling.shareByWord(without(drawn, left)), whole)))
                .sorted(Comparator.comparingDouble(Absence::moves).reversed())
                .toList();
    }

    private static CorpusWords taking(final List<CountedRepository> drawn, final int taken) {
        final CorpusWords pooled = new CorpusWords();
        drawn.subList(0, taken).forEach(repository -> pooled.add(repository.declared()));
        return pooled;
    }

    private static CorpusWords without(final List<CountedRepository> drawn, final int left) {
        final CorpusWords pooled = new CorpusWords();
        IntStream.range(0, drawn.size())
                .filter(at -> at != left)
                .forEach(at -> pooled.add(drawn.get(at).declared()));
        return pooled;
    }
}
