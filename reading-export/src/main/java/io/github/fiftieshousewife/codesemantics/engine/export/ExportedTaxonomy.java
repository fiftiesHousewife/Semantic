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
     *                           writes at the {@code words} level, counted once each however often it wrote
     *                           them. The deals are taken at that level too. {@link #concepts()} lists
     *                           matches at all four levels and states {@link Concept#normalisation()} on
     *                           each, so the rows at {@code words} are the ones this count tested
     * @param chanceExpectedBest the count the best of a field this size reaches by chance alone
     * @param median             the middle of the deals, for a reader comparing the two bars
     * @param timesTheBar        the observed count divided by that bar. <b>It is not comparable between two
     *                           vocabularies</b>: it scales with the bar, and the bar scales with how many
     *                           terms the publisher states
     * @param atLeastAsExtreme   how many of the deals reached the observed count or beat it
     * @param chanceRate         how often chance alone produced a count this large, which is
     *                           {@code (atLeastAsExtreme + 1) / (resamples + 1)} and is bounded in
     *                           {@code [1/1000, 1]} by the estimator's own definition. <b>It is the one
     *                           figure here that compares two vocabularies of different sizes</b>, because
     *                           it is a probability rather than a count: BIAN states 319 terms and CSO
     *                           14,259, so a count favours CSO on any repository and a ratio favours
     *                           whichever has the lower bar
     * @param field              how many vocabularies competed, which is what sets the quantile
     * @param resamples          how many deals were taken
     */
    public record Bar(int phrases, int chanceExpectedBest, int median, double timesTheBar,
                      int atLeastAsExtreme, double chanceRate, int field, int resamples) {

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
     * @param normalisation  what both sides were normalised to before they were compared, which is the
     *                       level {@link ExportedTaxonomy#matchesByNormalisation()} keys its counts by.
     *                       {@link Bar#phrases()} counts only the rows at {@code words}, so without this a
     *                       reader cannot tell the rows the bar tested from the ones a dictionary reached
     * @param definition     what the publisher says the concept means, empty where it states nothing. It
     *                       is the whole reason a taxonomy is matched rather than a word list: the node
     *                       carries the meaning, and a reading that reaches a node and drops its
     *                       definition has matched a name
     * @param placedUnder    the concept the publisher places it directly under, empty at a root of the
     *                       taxonomy
     * @param statedPath     every level the publisher states above it, broadest first, with the levels
     *                       naming the publisher's own field stepped over. {@code placedUnder} is the raw
     *                       {@code broader} cell and this is the whole walk: a concept FIX places directly
     *                       under {@code Common} reads {@code placedUnder=Common} and an empty path,
     *                       because {@code Common} holds 68% of FIX and names only the vocabulary that
     *                       matched. FIBO states {@code Aspect → Value → QuantitativeValue → PresentValue}
     *                       and the whole of it is here
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
    public record Concept(String concept, String term, String normalisation, String definition,
                          String placedUnder, List<String> statedPath, int occurrences, double specificity,
                          int wordsInTerm, double shareOfEachName, SightingSite firstWrittenAt) {

        public Concept {
            statedPath = List.copyOf(statedPath);
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
