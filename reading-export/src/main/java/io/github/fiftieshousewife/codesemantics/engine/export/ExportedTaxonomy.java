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
public record ExportedTaxonomy(String vocabulary, List<Concept> concepts, List<Branch> branches,
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
     *                           writes, counted once each however often it wrote them
     * @param chanceExpectedBest the count the best of a field this size reaches by chance alone
     * @param median             the middle of the deals, for a reader comparing the two bars
     * @param timesTheBar        the observed count divided by that bar
     * @param field              how many vocabularies competed, which is what sets the quantile
     * @param resamples          how many deals were taken
     */
    public record Bar(int phrases, int chanceExpectedBest, int median, double timesTheBar, int field,
                      int resamples) {

        /** Whether the repository wrote more of this vocabulary's phrases than the field reaches by chance. */
        public boolean exceedsChance() {
            return phrases > chanceExpectedBest;
        }
    }

    /**
     * One published concept as the repository wrote it.
     *
     * @param concept        the label the publisher states
     * @param term           the run of words the repository wrote to reach it, which is not the label: a
     *                       two-word term reaches a concept CSO labels {@code capital}, and a reading
     *                       carrying only the label cannot say which phrase was written
     * @param definition     what the publisher says the concept means, empty where it states nothing. It
     *                       is the whole reason a taxonomy is matched rather than a word list: the node
     *                       carries the meaning, and a reading that reaches a node and drops its
     *                       definition has matched a name
     * @param placedUnder    the concept the publisher places it directly under, empty at a root of the
     *                       taxonomy
     * @param atTheTopOfItsBranch the last concept the publisher's chain reaches — the walk up its own
     *                       {@code broader} column, stopping where the file carries no row for the next
     *                       parent. It is the concept itself where the publisher states none above it.
     *                       <b>The two differ by how deep a publisher's tree is</b>: OLiA states
     *                       {@code BaseForm} beneath {@code InflectionTypeFeature} and nothing above that,
     *                       so both read the same; FIBO states {@code PresentValue} beneath
     *                       {@code QuantitativeValue} beneath {@code Value}, so the direct parent says far
     *                       less about which part of FIBO the concept belongs to than the top does
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
    public record Concept(String concept, String term, String definition, String placedUnder,
                          String atTheTopOfItsBranch, int occurrences, double specificity,
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
        Objects.requireNonNull(bar, "bar");
        concepts = List.copyOf(concepts);
        branches = List.copyOf(branches);
        matchesByNormalisation = Collections.unmodifiableSortedMap(new TreeMap<>(matchesByNormalisation));
    }
}
