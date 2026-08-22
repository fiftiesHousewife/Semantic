package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.DrawnVocabulary;

/**
 * How few declared names a repository can write and still say something about what working Java is written
 * in — derived from sampling noise, never chosen.
 *
 * <p>A repository writing a hundred names states a distribution estimated from a hundred draws, and most of
 * what that distribution says is the accident of which hundred. The test is the same shape as the one the
 * word ranking already uses: measure how far the repository's own shares sit from the corpus it is joining,
 * then measure how far a random draw of exactly its size sits from that same corpus. A repository whose own
 * distance is no further than the draw's has told the reference nothing a resample would not have.
 *
 * <p>It is derived from the multinomial and not from which repositories turned out to look awkward, which
 * matters: a predicate adjusted once its rejections are visible is a choice about which repositories end up
 * in the corpus, and the frame this corpus was drawn under says so in its own header.
 */
public final class OccurrenceFloor {

    /** Enough draws that the mean distance of a sample of a given size is steady. */
    public static final int RESAMPLES = 99;

    /** One repository against the corpus it joins: how far its own words sit, and how far chance sits. */
    public record Judged(String name, int occurrences, double own, double drawn) {

        /** Whether it differs from the corpus by more than a draw of its size differs by. */
        public boolean saysMoreThanChance() {
            return own > drawn;
        }
    }

    private final ShareDivergence divergence;
    private final int resamples;
    private final long seed;

    public OccurrenceFloor(final ShareDivergence divergence, final int resamples, final long seed) {
        this.divergence = divergence;
        this.resamples = resamples;
        this.seed = seed;
    }

    public static OccurrenceFloor seeded(final long seed) {
        return new OccurrenceFloor(new ShareDivergence(), RESAMPLES, seed);
    }

    /** Every repository judged against the rest of the draw, smallest first. */
    public List<Judged> over(final List<CountedRepository> drawn, final CorpusPooling pooling) {
        return IntStream.range(0, drawn.size())
                .mapToObj(at -> judged(drawn, at, pooling))
                .sorted(Comparator.comparingInt(Judged::occurrences))
                .toList();
    }

    /**
     * The occurrence count the answer changes at: the largest repository that says no more than chance.
     * Nothing at all where every repository clears its own draw, which is the corpus needing no floor.
     */
    public int at(final List<Judged> judged) {
        return judged.stream()
                .filter(repository -> !repository.saysMoreThanChance())
                .mapToInt(Judged::occurrences)
                .max()
                .orElse(0);
    }

    private Judged judged(final List<CountedRepository> drawn, final int at, final CorpusPooling pooling) {
        final CountedRepository repository = drawn.get(at);
        final Map<String, Double> rest = pooling.shareByWord(without(drawn, at));
        final int occurrences = repository.declared().totalOccurrences();
        return new Judged(repository.name(), occurrences,
                divergence.between(repository.declared().shareByWord(), rest),
                meanOfDraws(rest, occurrences));
    }

    /** How far a repository of exactly this size, drawn from the corpus itself, lands from it. */
    private double meanOfDraws(final Map<String, Double> rest, final int occurrences) {
        final DrawnVocabulary drawing = new DrawnVocabulary(rest);
        final Random draws = new Random(seed);
        return IntStream.range(0, resamples)
                .mapToDouble(draw -> divergence.between(drawing.of(occurrences, draws), rest))
                .average()
                .orElseThrow();
    }

    private static CorpusWords without(final List<CountedRepository> drawn, final int left) {
        final CorpusWords pooled = new CorpusWords();
        IntStream.range(0, drawn.size())
                .filter(at -> at != left)
                .forEach(at -> pooled.add(drawn.get(at).declared()));
        return pooled;
    }
}
