package org.fifties.housewife.codesemantics.engine.export;

import java.util.Objects;

/**
 * One word or published phrase this repository writes more of than every reference it is read against.
 *
 * @param readFrom               where it was read from
 * @param word                   the word as the splitter produced it; a published run of words keeps its
 *                               spaces and is one entry
 * @param occurrences            how often it was written
 * @param occurrencesInNames     how many of those were the name of something rather than prose about it
 * @param divergenceBits         its term of the Jensen–Shannon divergence between what this repository
 *                               writes and what the reference writes, bounded at 1 bit
 * @param closestReference       the reference scoring this word lowest, which is the score reported
 * @param firstWrittenAt         the file and line it was first written at
 */
public record ExportedSignal(ReadingSource readFrom, String word, int occurrences, int occurrencesInNames,
                             double divergenceBits, String closestReference,
                             SightingSite firstWrittenAt) {

    public ExportedSignal {
        Objects.requireNonNull(readFrom, "readFrom");
        Objects.requireNonNull(word, "word");
        Objects.requireNonNull(closestReference, "closestReference");
        Objects.requireNonNull(firstWrittenAt, "firstWrittenAt");
    }
}
