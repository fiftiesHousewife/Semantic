package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Objects;

import lombok.Builder;

/**
 * One word or published phrase this repository writes more of than every reference it is read against.
 *
 * @param readFrom               where it was read from
 * @param word                   the word as the splitter produced it; a run of words a topical resource
 *                               publishes as one entry is one word, underscore-joined as the resources
 *                               write it
 * @param occurrences            how often it was written
 * @param occurrencesInNames     how many of those were the name of something rather than prose about it
 * @param divergenceBits         its term of the Jensen–Shannon divergence between what this repository
 *                               writes and what the reference writes, bounded at 1 bit
 * @param marginBits             the same term with the reference's own sampling error held against the
 *                               word. The verdict rests on it: every signal's margin exceeds every
 *                               reference's chance threshold
 * @param closestReference       the reference scoring this word lowest, which is the score reported
 * @param firstWrittenAt         the file and line it was first written at
 */
@Builder
public record ExportedSignal(ReadingSource readFrom, String word, int occurrences, int occurrencesInNames,
                             double divergenceBits, double marginBits, String closestReference,
                             SightingSite firstWrittenAt) {

    public ExportedSignal {
        Objects.requireNonNull(readFrom, "readFrom");
        Objects.requireNonNull(word, "word");
        Objects.requireNonNull(closestReference, "closestReference");
        Objects.requireNonNull(firstWrittenAt, "firstWrittenAt");
    }
}
