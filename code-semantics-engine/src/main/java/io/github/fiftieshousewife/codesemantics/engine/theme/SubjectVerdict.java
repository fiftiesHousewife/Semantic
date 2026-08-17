package io.github.fiftieshousewife.codesemantics.engine.theme;

/**
 * Whether a row of the subject table is the placement the reading reports, and why it is or is not.
 *
 * <p>A ranking on its own is a horoscope, because something is always nearest. Two questions separate the
 * one row that is a result from the rows that are context: is this the nearest subject read, and does it
 * stand nearer than the best of a whole taxonomy of chance draws. Only a subject answering both is kept.
 */
public enum SubjectVerdict {

    /** The nearest subject read, standing nearer than chance reaches. This is the placement. */
    PLACEMENT("keep", "the nearest subject read, and nearer than chance reaches"),

    /** Nearer than chance reaches, but another subject was nearer still. */
    RUNNER_UP("discard", "nearer than chance reaches, but a nearer subject was read"),

    /** Inside what a taxonomy of chance offers, so its nearness says only that the taxonomy is large. */
    WITHIN_CHANCE("discard", "a taxonomy of chance reaches this far");

    private final String decision;
    private final String reason;

    SubjectVerdict(final String decision, final String reason) {
        this.decision = decision;
        this.reason = reason;
    }

    /**
     * The verdict on one row: the nearest is kept where it clears the bar, and where it does not, no row
     * clears it and the whole table is context.
     */
    public static SubjectVerdict on(final double bits, final double chanceNearest, final boolean nearest) {
        if (bits >= chanceNearest) {
            return WITHIN_CHANCE;
        }
        return nearest ? PLACEMENT : RUNNER_UP;
    }

    public String decision() {
        return decision;
    }

    public String reason() {
        return reason;
    }
}
