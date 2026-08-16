package org.fifties.housewife.codesemantics.engine.export;

import java.util.Objects;

/**
 * Where the reading places the repository in a published subject scheme, at both levels the scheme states.
 *
 * <p>An archive pools every category's description under it, so its divergence rests on enough prose to be
 * stable — and it is broad enough that {@code Computer Science} says little about a Java library. A category
 * is compared against the few dozen words the scheme states for it alone: the weaker measurement, and the
 * sharper answer. A consumer that wants one figure wants {@code category}; a consumer that wants the one
 * least likely to move wants {@code archive}.
 *
 * @param scheme   the published subject scheme both levels come from
 * @param archive  the nearest of the scheme's top-level groupings
 * @param category the nearest single subject the scheme publishes
 */
public record ExportedPlacement(String scheme, Level archive, Level category) {

    /**
     * One subject, how far the repository stands from it, and how near a scheme of chance came.
     *
     * <p>Whether it stands apart is a field rather than a comparison left to the reader, because it is the
     * whole test. It is checked against the two figures it summarises.
     *
     * @param subject               the subject's own label
     * @param divergenceBits        how far the repository stands from it
     * @param nearestByChanceBits   how near the nearest subject of a scheme of chance stood
     * @param standsApartFromChance whether the real placement is the nearer of the two
     */
    public record Level(String subject, double divergenceBits, double nearestByChanceBits,
                        boolean standsApartFromChance) {

        public Level {
            if (standsApartFromChance != divergenceBits < nearestByChanceBits) {
                throw new IllegalArgumentException("a placement at " + divergenceBits + " against chance at "
                        + nearestByChanceBits + " cannot state standsApartFromChance="
                        + standsApartFromChance);
            }
        }

        /** The level, with whether it stands apart read off the two figures rather than asserted. */
        public static Level of(final String subject, final double divergenceBits,
                               final double nearestByChanceBits) {
            return new Level(subject, divergenceBits, nearestByChanceBits,
                    divergenceBits < nearestByChanceBits);
        }
    }

    public ExportedPlacement {
        Objects.requireNonNull(scheme, "scheme");
        Objects.requireNonNull(archive, "archive");
        Objects.requireNonNull(category, "category");
    }
}
