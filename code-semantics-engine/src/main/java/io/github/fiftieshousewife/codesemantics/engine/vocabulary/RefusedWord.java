package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;

/**
 * One word this repository wrote that the vocabulary reading does not report, with the references that
 * refused it and what each of them said.
 *
 * <p>A word clears each reference's bar in turn or it clears none, so a refusal names every reference that
 * turned it down rather than the first. {@code claimBits} is that reference's claim signed by which side
 * writes the word more densely, and {@code barBits} is what a repository of this size would have attained
 * against that reference by chance — both in bits, and the comparison between them is the whole rule.
 *
 * @param word        the surface the repository wrote
 * @param occurrences how often it wrote it
 * @param share       the share of every word occurrence in the repository this word holds
 * @param site        one place to go and look at it
 * @param refusedBy   every reference whose bar the word did not clear
 */
public record RefusedWord(String word, int occurrences, double share, String site,
                          List<Refusal> refusedBy) {

    /** What one reference said about a word it refused. */
    public record Refusal(String reference, double claimBits, double barBits) {
    }

    public RefusedWord {
        refusedBy = List.copyOf(refusedBy);
    }
}
