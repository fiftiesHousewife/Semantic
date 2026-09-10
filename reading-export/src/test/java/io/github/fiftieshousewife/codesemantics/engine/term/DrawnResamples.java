package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Optional;

/**
 * How many deals a null is drawn from, from {@code -Dcs.resamples} or the count every reading in this
 * library takes.
 *
 * <p>A bar is an order statistic of the deals and carries sampling noise of its own, which more deals
 * narrow. Drawing the same question at more deals is what says whether a verdict at the default count
 * rests on that noise.
 */
public final class DrawnResamples {

    private static final String PROPERTY = "cs.resamples";

    private final Optional<Integer> stated;

    DrawnResamples(final Optional<Integer> stated) {
        this.stated = stated;
    }

    /** What the caller named, or the count every published reading is drawn at. */
    public static DrawnResamples stated() {
        return new DrawnResamples(Optional.ofNullable(System.getProperty(PROPERTY))
                .map(String::trim)
                .filter(count -> !count.isEmpty())
                .map(Integer::valueOf));
    }

    public int count() {
        return stated.orElse(TermOrderNull.RESAMPLES);
    }
}
