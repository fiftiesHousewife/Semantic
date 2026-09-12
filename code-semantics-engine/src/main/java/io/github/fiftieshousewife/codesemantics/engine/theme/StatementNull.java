package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

/**
 * What divergence a statement of this size would show from a reading <em>by chance</em>. A forty-word
 * statement stands away from a reading of thousands of names simply because forty words are a small sample,
 * and a divergence reported without this field is measuring the statement's length.
 *
 * <p>The chance statement keeps everything about the observed one except what it says: the same number of
 * sentences, each the same number of words, filled by drawing from every word the reading's own tree wrote
 * — each occurrence one ticket — and read through the same prose pipeline. A fixed threshold would be a
 * chosen bound; this one follows from the statement's size and the tree's own writing.
 *
 * <p>The bar is {@link ChanceExpectedBest} over the field of statements judged together, because a reader
 * scanning several takes the furthest. The draw is seeded, so a report reproduces.
 *
 * <p>A null none of whose draws could be read prices nothing, and the answer is empty rather than a bar of
 * zero: a bar of zero would call every statement a finding.
 */
public final class StatementNull {

    /** Enough draws that the rank of the observed value is readable to a thousandth. */
    public static final int RESAMPLES = 999;

    private static final String CHANCE = "chance";

    private static final String SPACE = " ";

    private static final String LINE = "\n";

    private final ProseReading prose;
    private final JensenShannon divergence;
    private final int resamples;
    private final Random draws;

    public StatementNull(final ProseReading prose, final JensenShannon divergence, final int resamples,
                         final Random draws) {
        this.prose = prose;
        this.divergence = divergence;
        this.resamples = resamples;
        this.draws = draws;
    }

    public static StatementNull seeded(final long seed) {
        return new StatementNull(ProseReading.fromClasspath(), new JensenShannon(), RESAMPLES,
                new Random(seed));
    }

    /**
     * The field of chance divergences a statement of this shape draws from the written words, and where the
     * observed value sits in it.
     *
     * @param observed        the statement's own divergence from the reference
     * @param sentenceLengths the statement's shape — how many sentences, each of how many words
     * @param field           how many statements are judged together, which is the field this one
     *                        competes in
     * @param written         every word the tree wrote, each occurrence one ticket in the draw
     * @param reference       the composition the observed divergence was taken against
     */
    public Optional<PermutationNull.Chance> of(final double observed, final List<Integer> sentenceLengths,
                                               final int field, final WrittenWords written,
                                               final TopicDistribution reference) {
        final List<String> pool = pooled(written);
        if (pool.isEmpty()) {
            return Optional.empty();
        }
        final List<Double> chance = new ArrayList<>();
        for (int draw = 0; draw < resamples; draw++) {
            final TopicDistribution drawn = prose.of(CHANCE, statement(pool, sentenceLengths))
                    .distribution();
            if (!drawn.isEmpty()) {
                chance.add(divergence.divergence(drawn, reference));
            }
        }
        if (chance.isEmpty()) {
            return Optional.empty();
        }
        Collections.sort(chance);
        final int atLeastAsExtreme = (int) chance.stream().filter(drawn -> drawn >= observed).count();
        final double median = chance.get(chance.size() / 2);
        final double best = chance.get(ChanceExpectedBest.furthestIn(field, chance.size()));
        return Optional.of(new PermutationNull.Chance(observed, median, observed - median, best,
                atLeastAsExtreme, chance.size()));
    }

    /** The words sorted before the tickets are laid out, so a seed draws the same statement every run. */
    private static List<String> pooled(final WrittenWords written) {
        return written.words().stream()
                .sorted()
                .flatMap(word -> Collections.nCopies(written.occurrencesOf(word), word).stream())
                .toList();
    }

    private String statement(final List<String> pool, final List<Integer> sentenceLengths) {
        return sentenceLengths.stream()
                .map(length -> sentence(pool, length))
                .collect(Collectors.joining(LINE));
    }

    private String sentence(final List<String> pool, final int length) {
        return IntStream.range(0, length)
                .mapToObj(word -> pool.get(draws.nextInt(pool.size())))
                .collect(Collectors.joining(SPACE));
    }
}
