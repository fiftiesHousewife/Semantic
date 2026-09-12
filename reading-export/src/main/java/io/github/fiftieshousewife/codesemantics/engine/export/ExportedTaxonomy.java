package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import lombok.Builder;

/**
 * One taxonomy evaluated against the repository: the concepts it writes and how each match was reached.
 *
 * <p><b>No subject placement.</b> The placements this reading computes are the vocabulary reading's, over
 * the dictionary topics of the words a repository declares, and they are stated once each under
 * {@link ExportedSummary#placedIn()}. Repeating one here put a figure under a taxonomy that the taxonomy's own
 * matches contributed nothing to, and a consumer had no way to tell. A taxonomy carries a placement again
 * when the concepts it matched are what produced one.
 *
 * @param vocabulary              the published vocabulary the concepts come from
 * @param concepts                what the repository writes, most-carried first
 * @param branches                what each branch carrying a match is worth against this repository's own
 *                                reading, most-carried first. Empty where the publisher states no prose, so
 *                                a taxonomy that cannot be weighed is not reported as one that weighs zero
 * @param matchesByNormalisation  how many spans each level accounted for, never summed across levels
 * @param bar                     what a deal of this vocabulary's own words reaches on this repository, and
 *                                how far its real count stands above that
 */
public record ExportedTaxonomy(String vocabulary, List<ExportedConcept> concepts, List<Branch> branches,
                               Map<String, Integer> matchesByNormalisation, Bar bar) {

    /**
     * One vocabulary's phrase count against a field of chance counts.
     *
     * <p>The reference holds the repository still and deals the <em>vocabulary</em>: it keeps how many terms
     * the publisher states, how long each is and its whole list of words, and destroys only which of its
     * words it published beside which. A vocabulary whose word list is what reached the repository scores
     * the same either way; one whose published orders reached it loses them.
     *
     * <p>Dealing the repository instead answers a different question. Declared names are compositional, so
     * a deal of them puts a vocabulary's words together in orders nobody wrote, and every vocabulary whose
     * words a repository writes at all stands above such a bar.
     *
     * @param phrases            how many of the vocabulary's terms of more than one word the repository
     *                           writes at the {@code words} level, counted once each however often it wrote
     *                           them. The deals are taken at that level too. {@link #concepts()} lists
     *                           matches at all four levels and states {@link ExportedConcept#normalisation()} on
     *                           each, so the rows at {@code words} are the ones this count tested
     * @param chanceExpectedBest the count the best of a field this size reaches by chance alone
     * @param median             the middle of the deals, for a reader comparing the two bars
     * @param timesTheBar        the observed count divided by that bar. <b>It is not comparable between two
     *                           vocabularies</b>: it scales with the bar, and the bar scales with how many
     *                           terms the publisher states
     * @param occurrences        how often the repository writes those terms in total, the second counting
     *                           unit, judged from the same deals. Measured at ten thousand deals on the
     *                           eleven evaluation members, each unit alone admits what the other refuses,
     *                           so the verdict requires both
     * @param occurrencesChanceExpectedBest the occurrence count the best of a field this size reaches by
     *                           chance alone
     * @param occurrencesTimesTheBar the observed occurrences divided by their own bar, with the same
     *                           caveat as {@code timesTheBar}
     * @param atLeastAsExtreme   how many of the deals reached the observed term count or beat it
     * @param chanceRate         how often chance alone produced a count this large, which is
     *                           {@code (atLeastAsExtreme + 1) / (resamples + 1)} and is bounded in
     *                           {@code [1/1000, 1]} by the estimator's own definition. <b>It is the one
     *                           figure here that compares two vocabularies of different sizes</b>, because
     *                           it is a probability rather than a count: BIAN states 319 terms and CSO
     *                           14,259, so a count favours CSO on any repository and a ratio favours
     *                           whichever has the lower bar
     * @param field              how many vocabularies competed, which is what sets the quantile
     * @param fieldMembers       the vocabularies that competed, in the order they were judged. Adding a
     *                           vocabulary moves every other vocabulary's bar, so a moved bar is read
     *                           against a changed membership rather than a bare count
     * @param resamples          how many deals were taken
     */
    public record Bar(int phrases, int chanceExpectedBest, int median, double timesTheBar,
                      int occurrences, int occurrencesChanceExpectedBest,
                      double occurrencesTimesTheBar, int atLeastAsExtreme, double chanceRate, int field,
                      List<String> fieldMembers, int resamples) {

        public Bar {
            fieldMembers = List.copyOf(fieldMembers);
            if (field != fieldMembers.size()) {
                throw new IllegalArgumentException(
                        "the field's size is %d but %d members are named".formatted(field,
                                fieldMembers.size()));
            }
        }

        /**
         * Whether the repository stands outside chance in both counting units at once: more distinct
         * terms than the field's best deal reaches, and more total occurrences than its best deal
         * reaches. Either alone admits what the other refuses.
         */
        public boolean exceedsChance() {
            return phrases > chanceExpectedBest && occurrences > occurrencesChanceExpectedBest;
        }

        /** The smaller of the two multiples — the unit that nearly refused this vocabulary. */
        public double bindingMultiple() {
            return Math.min(timesTheBar, occurrencesTimesTheBar);
        }
    }

    /**
     * One branch the repository wrote in, and how much of what that branch is about it is also about.
     *
     * <p>The weight is the mass the two readings put in the same dictionary topics, bounded in
     * {@code [0, 1]} by that statistic's own definition. It is reported and applied to nothing: the concepts
     * above are ordered by the mass the repository wrote, unconditioned, and {@code kept} states what
     * conditioning on this weight would leave. A reader who disagrees with the weight still has the reading.
     *
     * @param branch          the concept the publisher places these under
     * @param agreesWithTheRepository how much of what the branch is about the repository is also about
     * @param mass            what the repository wrote in this branch, unconditioned
     * @param kept            that mass at this branch's weight
     * @param terms           the terms matched in it, most-carried first
     */
    @Builder
    public record Branch(String branch, double agreesWithTheRepository, double mass, double kept,
                         List<String> terms) {

        public Branch {
            Objects.requireNonNull(branch, "branch");
            terms = List.copyOf(terms);
        }
    }

    public ExportedTaxonomy {
        Objects.requireNonNull(vocabulary, "vocabulary");
        Objects.requireNonNull(bar, "bar");
        concepts = List.copyOf(concepts);
        branches = List.copyOf(branches);
        matchesByNormalisation = Collections.unmodifiableSortedMap(new TreeMap<>(matchesByNormalisation));
    }
}
