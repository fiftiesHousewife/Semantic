package org.fifties.housewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;

import org.fifties.housewife.codesemantics.name.Tokeniser;
import org.fifties.housewife.codesemantics.name.WordSegmenter;

/**
 * The words an identifier is written in: the tokeniser's boundaries first, then the segmenter on any run the
 * boundaries left glued. A run the segmenter refuses stays whole and goes forward as one word, because a run
 * nothing can read is still something the repository wrote and the reading records it as seen rather than
 * dropping it.
 */
public final class IdentifierWords {

    private final WordSegmenter segmenter;

    public IdentifierWords(final WordSegmenter segmenter) {
        this.segmenter = segmenter;
    }

    public static IdentifierWords fromClasspath() {
        return new IdentifierWords(WordSegmenter.fromClasspath());
    }

    public IdentifierReading of(final String identifier) {
        final List<String> words = new ArrayList<>();
        int gluedRunsRead = 0;
        for (final String token : Tokeniser.tokenise(identifier)) {
            final List<String> pieces = segmenter.segment(token).orElse(List.of());
            if (pieces.isEmpty()) {
                words.add(token);
            } else {
                words.addAll(pieces);
                gluedRunsRead++;
            }
        }
        return new IdentifierReading(words, gluedRunsRead);
    }
}
