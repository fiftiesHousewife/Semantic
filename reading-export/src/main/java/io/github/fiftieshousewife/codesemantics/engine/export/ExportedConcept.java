package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

import lombok.Builder;

/**
 * One published concept as the repository wrote it.
 *
 * @param concept        the label the publisher states
 * @param term           the run of words the repository wrote to reach it, which is not the label: a
 *                       two-word term reaches a concept CSO labels {@code capital}, and a reading
 *                       carrying only the label cannot say which phrase was written
 * @param normalisation  what both sides were normalised to before they were compared, which is the
 *                       level {@link ExportedTaxonomy#matchesByNormalisation()} keys its counts by.
 *                       {@link ExportedTaxonomy.Bar#phrases()} counts the rows at {@code words} only,
 *                       so without this a reader cannot tell the rows the bar tested from the ones a
 *                       dictionary reached
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
public record ExportedConcept(String concept, String term, String normalisation, String definition,
                              String description, String descriptionStatedFor, String placedUnder,
                              List<String> statedPath, int occurrences, double specificity,
                              int wordsInTerm, double shareOfEachName, SightingSite firstWrittenAt) {

    public ExportedConcept {
        statedPath = List.copyOf(statedPath);
    }
}
