package org.fifties.housewife.codesemantics.engine.reading;

import java.util.List;

/**
 * The words one identifier reads as, and how many of its runs the segmenter had to unglue to get them. The
 * second figure is reported rather than discarded because it says how much of a reading rests on the
 * segmenter's frequency arithmetic rather than on a boundary the author wrote.
 */
public record IdentifierReading(List<String> words, int gluedRunsRead) {

    public IdentifierReading {
        words = List.copyOf(words);
    }
}
