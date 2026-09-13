package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedStatement;

/**
 * How well a pull request's own description fits the code it ships with, banded from the permutation rate
 * the reading publishes: how often a description of the same shape, built from the pull request's own code
 * at random, sits at least as far from that code as the real one does.
 *
 * <p>The bands are the two conventional significance levels, 5% and 10%, applied to that rate. Nothing
 * here is a threshold this library chose: the rate is the measurement, and the levels are the ones
 * published practice states.
 */
enum StatementFit {

    /** Fewer than 5 in 100 random descriptions sit closer to the code than this one. */
    HIGH("high", 0.95),

    /** Fewer than 10 in 100 do. */
    MEDIUM("medium", 0.90),

    /** More than that do, so the fit is not separable from chance. */
    UNCERTAIN("uncertain", 0.0);

    private final String shown;

    private final double atLeast;

    StatementFit(final String shown, final double atLeast) {
        this.shown = shown;
        this.atLeast = atLeast;
    }

    String shown() {
        return shown;
    }

    /** The band this statement's rate falls in, and nothing where no statement was fetched. */
    static Optional<StatementFit> of(final ExportedStatement statement) {
        return Optional.ofNullable(statement)
                .map(fetched -> java.util.Arrays.stream(values())
                        .filter(band -> fetched.chanceRate() >= band.atLeast)
                        .findFirst()
                        .orElse(UNCERTAIN));
    }
}
