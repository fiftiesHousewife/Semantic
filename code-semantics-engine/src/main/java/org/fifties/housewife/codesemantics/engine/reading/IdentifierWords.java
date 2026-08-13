package org.fifties.housewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.fifties.housewife.codesemantics.name.Tokeniser;
import org.fifties.housewife.codesemantics.name.WordSegmenter;

/**
 * The words a name is written in: the explicit separators first, then the tokeniser's own boundaries, then
 * the segmenter on any run they left glued. A run the segmenter refuses stays whole and goes forward as one
 * word, because a run nothing can read is still something the repository wrote and the reading records it as
 * seen rather than dropping it.
 *
 * <p>The dot and the dollar are separators here where {@link Tokeniser} does not treat them as such. They are
 * the plan's first splitting rule and they matter for exactly one form: a dependency an author named in full,
 * where {@code net.sf.extjwnl.data} is four words and not one unreadable token.
 */
public final class IdentifierWords {

    private static final Pattern QUALIFIER = Pattern.compile("[.$]");

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
        for (final String qualified : QUALIFIER.split(identifier, -1)) {
            for (final String token : Tokeniser.tokenise(qualified)) {
                final List<String> pieces = segmenter.segment(token).orElse(List.of());
                if (pieces.isEmpty()) {
                    words.add(token);
                } else {
                    words.addAll(pieces);
                    gluedRunsRead++;
                }
            }
        }
        return new IdentifierReading(words, gluedRunsRead);
    }
}
