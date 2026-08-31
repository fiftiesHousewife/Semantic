package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * The seeds a null is drawn at, from {@code -Dcs.seeds} or the one every reading in this library uses.
 *
 * <p>A bar is an order statistic of the deals, and the survey records that the quantile the field sets is
 * read from few of them — for a field of seven at 999 draws it is the 125th smallest, and the count below
 * it is Binomial, so the bar itself carries sampling noise. Drawing the same question at several seeds is
 * what says whether a verdict rests on that noise.
 */
public final class DrawnSeeds {

    private static final String PROPERTY = "cs.seeds";

    private static final String SEPARATOR = ",";

    private final List<Long> seeds;

    DrawnSeeds(final List<Long> seeds) {
        this.seeds = List.copyOf(seeds);
    }

    /** What the caller named, or the single seed every published reading is drawn at. */
    public static DrawnSeeds stated() {
        return new DrawnSeeds(Arrays.stream(System.getProperty(PROPERTY, "").split(SEPARATOR))
                .map(String::trim)
                .filter(seed -> !seed.isEmpty())
                .map(Long::valueOf)
                .toList());
    }

    public List<Long> seeds() {
        return seeds.isEmpty() ? List.of(TreeReading.SEED) : seeds;
    }
}
