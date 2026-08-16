package org.fifties.housewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * One taxonomy evaluated against the repository: the concepts it writes, how the match was reached, and where
 * the same reading places it among published subjects.
 *
 * <p>The placement travels with the evaluation because neither settles anything alone. A nearest subject
 * states nothing without the nearest a taxonomy of chance offers, and a list of matched concepts is a word
 * list hit until a reader can see what field the whole reading landed in.
 *
 * @param vocabulary              the published vocabulary the concepts come from
 * @param concepts                what the repository writes, most-carried first
 * @param matchesByNormalisation  how many spans each level accounted for, never summed across levels
 * @param placement               where the repository stands among published subjects
 */
public record ExportedTaxonomy(String vocabulary, List<Concept> concepts,
                               Map<String, Integer> matchesByNormalisation, Placement placement) {

    /**
     * One published concept as the repository wrote it.
     *
     * @param concept        the label the publisher states
     * @param placedUnder    the concept the publisher places it under, empty at a root of the taxonomy
     * @param occurrences    how often the repository wrote it
     * @param specificity    how much writing the term narrows, bounded in {@code [0, 1]} by the frequency
     *                       list's own length
     * @param wordsInTerm    how many words the term is written in; a one-word term cleared the branch rule
     * @param firstWrittenAt the file and line it was first written at
     */
    public record Concept(String concept, String placedUnder, int occurrences, double specificity,
                          int wordsInTerm, SightingSite firstWrittenAt) {
    }

    /**
     * The nearest published subject, and the nearest a taxonomy of chance offered.
     *
     * <p>Whether it stands apart is a field rather than a comparison left to the reader, because it is the
     * whole test and a consumer that skipped it would be reading a horoscope. It is checked against the two
     * figures it summarises, so a document cannot state one thing and mean another.
     *
     * @param scheme                 the subject scheme the placement is against
     * @param subject                the nearest subject's own label
     * @param divergenceBits         how far the repository stands from it
     * @param nearestByChanceBits    how far the nearest subject of a taxonomy of chance stood
     * @param standsApartFromChance  whether the real placement is nearer than the chance one
     */
    public record Placement(String scheme, String subject, double divergenceBits, double nearestByChanceBits,
                            boolean standsApartFromChance) {

        public Placement {
            if (standsApartFromChance != divergenceBits < nearestByChanceBits) {
                throw new IllegalArgumentException(
                        "a placement at " + divergenceBits + " against chance at " + nearestByChanceBits
                                + " cannot state standsApartFromChance=" + standsApartFromChance);
            }
        }

        /** The placement, with whether it stands apart read off the two figures rather than asserted. */
        public static Placement of(final String scheme, final String subject, final double divergenceBits,
                                   final double nearestByChanceBits) {
            return new Placement(scheme, subject, divergenceBits, nearestByChanceBits,
                    divergenceBits < nearestByChanceBits);
        }
    }

    public ExportedTaxonomy {
        Objects.requireNonNull(vocabulary, "vocabulary");
        concepts = List.copyOf(concepts);
        matchesByNormalisation = Map.copyOf(matchesByNormalisation);
        Objects.requireNonNull(placement, "placement");
    }
}
