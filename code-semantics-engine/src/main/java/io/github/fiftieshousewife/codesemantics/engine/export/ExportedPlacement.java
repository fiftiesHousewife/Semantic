package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

/**
 * Where the reading places the repository in one published subject scheme, at both levels the scheme states.
 *
 * <p>An archive pools every category's description under it, so its divergence rests on enough prose to be
 * stable — and it is broad enough that {@code Computer Science} says little about a Java library. A category
 * is compared against the few dozen words the scheme states for it alone: the weaker measurement, and the
 * sharper answer. A consumer that wants one figure wants {@code category}; a consumer that wants the one
 * least likely to move wants {@code archive}.
 *
 * <p>One of these per scheme. No scheme is picked, and a scheme whose nearest subject is no nearer than
 * chance says so in {@code standsApartFromChance} rather than being left out.
 *
 * @param scheme   the published subject scheme both levels come from
 * @param archive  the nearest of the scheme's top-level groupings
 * @param category the nearest single subject the scheme publishes
 */
public record ExportedPlacement(String scheme, Level archive, Level category) {

    /**
     * One subject, how far the repository stands from it, how near a scheme of chance came, what the two
     * meet on, and every other subject the same chance figure cannot separate from it.
     *
     * <p>Whether it stands apart is a field rather than a comparison left to the reader, because it is the
     * whole test. It is checked against the two figures it summarises.
     *
     * @param subject               the subject's own label
     * @param divergenceBits        how far the repository stands from it
     * @param nearestByChanceBits   how near the nearest subject of a scheme of chance stood
     * @param standsApartFromChance whether the real placement is the nearer of the two
     * @param carriedBy             the topics the repository's reading and this subject's own description
     *                              both put mass in, each with the shares it met on and the words that
     *                              produced it — which is what the placement rests on, and all a reader
     *                              needs to check it without joining against another section
     * @param nearerThanChance      every subject standing nearer than chance did, this one first. Naming one
     *                              subject out of them states a precision the instrument does not have: the
     *                              bound is the chance figure beside it and nothing here chooses a margin
     */
    public record Level(String subject, double divergenceBits, double nearestByChanceBits,
                        boolean standsApartFromChance, List<CarryingTopic> carriedBy,
                        List<Contender> nearerThanChance) {

        public Level {
            if (standsApartFromChance != divergenceBits < nearestByChanceBits) {
                throw new IllegalArgumentException("a placement at " + divergenceBits + " against chance at "
                        + nearestByChanceBits + " cannot state standsApartFromChance="
                        + standsApartFromChance);
            }
            carriedBy = List.copyOf(carriedBy);
            nearerThanChance = List.copyOf(nearerThanChance);
        }

        /** The level, with whether it stands apart read off the two figures rather than asserted. */
        public static Level of(final String subject, final double divergenceBits,
                               final double nearestByChanceBits, final List<CarryingTopic> carriedBy,
                               final List<Contender> nearerThanChance) {
            return new Level(subject, divergenceBits, nearestByChanceBits,
                    divergenceBits < nearestByChanceBits, carriedBy, nearerThanChance);
        }
    }

    /**
     * One topic a placement rests on: how much of the repository sat there, how much of the subject's own
     * description did, and the words that put the repository's mass there.
     *
     * <p>The words are stated here rather than left to a join. A label carries the same words wherever it
     * appears, so this repeats them across levels; a reader following one placement gets the whole answer
     * in one place, which is what the section is for.
     *
     * @param topic             the dictionary label the two met on
     * @param shareOfRepository the topic's share of everything the repository placed
     * @param shareOfSubject    the topic's share of the subject's own description
     * @param carriedBy         the words that put the repository's mass there, most first
     */
    public record CarryingTopic(String topic, double shareOfRepository, double shareOfSubject,
                                List<ExportedWitness> carriedBy) {

        public CarryingTopic {
            Objects.requireNonNull(topic, "topic");
            carriedBy = List.copyOf(carriedBy);
        }
    }

    /**
     * One subject the placement cannot be told apart from the leader, with what it rests on.
     *
     * @param subject        the subject's own label
     * @param divergenceBits how far the repository stands from it
     * @param carriedBy      the topics it and the repository both put mass in
     */
    public record Contender(String subject, double divergenceBits, List<String> carriedBy) {

        public Contender {
            carriedBy = List.copyOf(carriedBy);
        }
    }

    public ExportedPlacement {
        Objects.requireNonNull(scheme, "scheme");
        Objects.requireNonNull(archive, "archive");
        Objects.requireNonNull(category, "category");
    }
}
