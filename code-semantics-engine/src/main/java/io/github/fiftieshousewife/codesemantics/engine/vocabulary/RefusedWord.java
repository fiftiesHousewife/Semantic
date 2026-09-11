package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;

/**
 * One word this repository wrote that the vocabulary reading does not report, with the rule that removed it,
 * the references that refused it and what each of them said.
 *
 * <p>A word clears each reference's bar in turn or it clears none, so a refusal names every reference that
 * turned it down rather than the first. The verdict rests on the margin: {@code claimBits} is a reference's
 * claim signed by which side writes the word more densely, {@code marginBits} is the same claim at the
 * reference's own sampling error, and {@code barBits} is what a repository of this size would have attained
 * against that reference by chance — all in bits, and the margin against the bar is the whole rule.
 *
 * @param word        the surface the repository wrote
 * @param occurrences how often it wrote it
 * @param share       the share of every word occurrence in the repository this word holds
 * @param site        one place to go and look at it
 * @param verdict     the one rule that removed the word — {@link WordVerdict#BELOW_A_THRESHOLD} or
 *                    {@link WordVerdict#WITHIN_THE_REFERENCES_ERROR}
 * @param refusedBy   every reference whose bar the word's margin did not clear
 */
public record RefusedWord(String word, int occurrences, double share, String site, WordVerdict verdict,
                          List<Refusal> refusedBy) {

    /** What one reference said about a word it refused. */
    public record Refusal(String reference, double claimBits, double marginBits, double barBits) {
    }

    public RefusedWord {
        refusedBy = List.copyOf(refusedBy);
    }
}
