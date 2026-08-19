package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import lombok.Builder;

/**
 * One taxonomy evaluated against the repository: the concepts it writes and how each match was reached.
 *
 * <p><b>No subject placement.</b> The only placement this reading computes is the vocabulary reading's, over
 * the dictionary topics of the words a repository declares, and it is stated once under
 * {@link ExportedSummary#placedIn()}. Repeating it here put a figure under a taxonomy that the taxonomy's own
 * matches contributed nothing to, and a consumer had no way to tell. A taxonomy carries a placement again
 * when the concepts it matched are what produced one.
 *
 * @param vocabulary              the published vocabulary the concepts come from
 * @param concepts                what the repository writes, most-carried first
 * @param matchesByNormalisation  how many spans each level accounted for, never summed across levels
 */
public record ExportedTaxonomy(String vocabulary, List<Concept> concepts,
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

    public ExportedTaxonomy {
        Objects.requireNonNull(vocabulary, "vocabulary");
        concepts = List.copyOf(concepts);
        matchesByNormalisation = Map.copyOf(matchesByNormalisation);
    }
}
