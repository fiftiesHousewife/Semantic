package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.engine.pipeline.ShareDivergence;
import org.fifties.housewife.codesemantics.engine.reading.WrittenWords;
import org.fifties.housewife.codesemantics.engine.theme.ChanceExpectedBest;

/**
 * What claim a word of a repository this size would attain against a reference <em>by chance</em>, and
 * therefore where the vocabulary's cutoff is.
 *
 * <p>The report used to print a fixed number of rows. The number was chosen, and a chosen bound is the one
 * thing the doctrine refuses outright. A count is not comparable either: 250 of one repository's words is a
 * different slice from 250 of another's, so no figure taken at such a cutoff means the same thing twice.
 *
 * <p>So the bar is derived the way this library derives every other bar. Draw a repository of this one's
 * size from the reference's own distribution — the null that this repository writes what the reference
 * writes — score each drawn word by the same term of the same divergence the ranking uses, and read the
 * quantile {@link ChanceExpectedBest} gives for a field of this many words. Every word is tested at once, so
 * the bar follows from how many of them there are. A word above it is vocabulary; a word below it is what a
 * repository of this size and shape would have produced against this reference anyway.
 *
 * <p><b>One bar per reference, and a word must clear each.</b> That is the ranking's own weakest-claim rule
 * applied to the bound: pooling the references would need a weight nothing states, and clearing each in turn
 * needs none.
 *
 * <p>The draw is seeded, so two runs of one tree cut it in the same place.
 */
public final class VocabularyNull {

    /** Enough draws that the quantile a field of a few hundred words asks for is populated. */
    public static final int RESAMPLES = 999;

    /** Room above the quantile for the draws to vary in how many distinct words they turn up. */
    private static final double HEADROOM = 1.5;

    /** One reference's bar, in bits, with what it was derived from beside it. */
    public record Bar(String reference, double bits, int field, int resamples, int drawn) {
    }

    private final ShareDivergence divergence;
    private final int resamples;
    private final long seed;

    public VocabularyNull(final ShareDivergence divergence, final int resamples, final long seed) {
        this.divergence = divergence;
        this.resamples = resamples;
        this.seed = seed;
    }

    public static VocabularyNull seeded(final long seed) {
        return new VocabularyNull(new ShareDivergence(), RESAMPLES, seed);
    }

    /** The bar each reference sets against a repository that wrote this much. */
    public List<Bar> over(final WrittenWords written, final List<ReferenceVocabulary> references) {
        return references.stream().map(reference -> barFor(written, reference)).toList();
    }

    /** The bars keyed the way a {@link ChosenWord}'s claims name their references. */
    public static Map<String, Double> byReference(final List<Bar> bars) {
        return bars.stream().collect(Collectors.toUnmodifiableMap(Bar::reference, Bar::bits));
    }

    /**
     * The claims of every word of every draw, of which only the highest are kept — the bar sits inside the
     * top {@code drawn / (field + 1) + 1} of them and the rest can never be it, so a thousand draws of a
     * large repository costs a few thousand doubles rather than tens of millions.
     */
    private Bar barFor(final WrittenWords written, final ReferenceVocabulary reference) {
        final Map<String, Double> there = reference.shareByWord();
        final DrawnVocabulary drawing = new DrawnVocabulary(there);
        final Random draws = new Random(seed);
        final int field = written.words().size();
        final PriorityQueue<Double> highest = new PriorityQueue<>();
        int drawn = 0;
        int kept = Integer.MAX_VALUE;
        for (int draw = 0; draw < resamples; draw++) {
            final Map<String, Double> here = drawing.of(written.totalOccurrences(), draws);
            here.keySet().forEach(word -> highest.add(divergence.at(word, here, there)));
            drawn += here.size();
            kept = Math.min(kept, headroomFor(field, here.size()));
            trimTo(highest, kept);
        }
        trimTo(highest, quantileFrom(field, drawn));
        return new Bar(reference.name(), highest.element(), field, resamples, drawn);
    }

    /** How many of the highest claims the quantile will need, with room for the draws to vary. */
    private int headroomFor(final int field, final int drawnPerResample) {
        return (int) (quantileFrom(field, resamples * drawnPerResample) * HEADROOM) + 1;
    }

    /** How many claims stand at or above the bar: the complement of the rank a field of this size reaches. */
    private static int quantileFrom(final int field, final int drawn) {
        return drawn - ChanceExpectedBest.furthestIn(field, drawn);
    }

    private static void trimTo(final PriorityQueue<Double> highest, final int kept) {
        while (highest.size() > kept) {
            highest.remove();
        }
    }
}
