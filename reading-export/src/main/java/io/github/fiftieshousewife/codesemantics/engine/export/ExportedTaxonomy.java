package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;
import java.util.Objects;

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
 */
public record ExportedTaxonomy(String vocabulary, List<Concept> concepts, List<Branch> branches,
                               Map<String, Integer> matchesByNormalisation) {

    /**
     * One published concept as the repository wrote it.
     *
     * @param concept        the label the publisher states
     * @param placedUnder    the concept the publisher places it under, empty at a root of the taxonomy
     * @param occurrences    how often the repository wrote it
     * @param specificity    how much writing the term narrows, bounded in {@code [0, 1]} by the frequency
     *                       list's own length
     * @param wordsInTerm    how many words the term is written in; a one-word term cleared the branch rule
     * @param shareOfEachName the mean share of what each declared name narrows that this term accounted for.
     *                       It votes on nothing: weighting the mass by it was measured on the evaluation set
     *                       and lowered the ranking on Santuario, so it is reported and not applied
     * @param firstWrittenAt the file and line it was first written at
     */
    @Builder
    public record Concept(String concept, String placedUnder, int occurrences, double specificity,
                          int wordsInTerm, double shareOfEachName, SightingSite firstWrittenAt) {
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
        concepts = List.copyOf(concepts);
        branches = List.copyOf(branches);
        matchesByNormalisation = Map.copyOf(matchesByNormalisation);
    }
}
