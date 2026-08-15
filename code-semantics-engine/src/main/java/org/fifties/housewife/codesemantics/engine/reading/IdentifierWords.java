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
 * <p>Two rules live here that {@link Tokeniser} does not carry, and both are grammar rather than vocabulary.
 * The dot and the dollar are separators, which matters for a dependency an author named in full, where
 * {@code net.sf.extjwnl.data} is four words and not one unreadable token. And a run of capitals ends one word
 * before the last of them, which is the rule whose absence the self-reading kept finding in its own tail:
 * {@code carriesAPrefix} was reading as carries / aprefix and {@code JWNLException} as jwnlexception.
 *
 * <p>They are added alongside the ported tokeniser and not inside it. That class is shared with the project
 * this library's evidence machinery came from, where it reads schema identifiers, and a widening measured
 * against code is not automatically a widening that project wants.
 *
 * <p><b>A letter beside a digit is not a boundary, and that is a citation rather than an omission.</b>
 * Unicode's own word-segmentation grammar states it: UAX #29 rules WB9 and WB10 — {@code AHLetter × Numeric}
 * and {@code Numeric × AHLetter}, where {@code ×} is defined as "do not allow break here" — under the prose
 * "do not break within sequences of digits, or digits adjacent to letters ('3a', or 'A3')". So
 * {@code utf8Decode} reads as utf8 and decode by a boundary rule a standards body published, which is the
 * same kind of thing as the acronym run above and not a list of tokens. A catalogue of cited tokens is what
 * would be needed to <em>override</em> that default for a particular run, never to obey it.
 */
public final class IdentifierWords {

    private static final Pattern QUALIFIER = Pattern.compile("[.$]");

    /**
     * The boundary at the end of a run of capitals: the last capital of the run begins the next word.
     * {@code XMLHttpRequest} divides into XML and HttpRequest, {@code JWNLException} into JWNL and Exception,
     * and — the case that matters most for reading a name as a sentence — {@code refusesALineRange} into
     * refusesA and LineRange, so the article is a word of its own instead of gluing itself to the noun.
     */
    private static final Pattern ACRONYM_RUN = Pattern.compile("(?<=[A-Z])(?=[A-Z][a-z])");

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
            for (final String run : ACRONYM_RUN.split(qualified, -1)) {
                for (final String token : Tokeniser.tokenise(run)) {
                    final List<String> pieces = segmenter.segment(token).orElse(List.of());
                    if (pieces.isEmpty()) {
                        words.add(token);
                    } else {
                        words.addAll(pieces);
                        gluedRunsRead++;
                    }
                }
            }
        }
        return new IdentifierReading(words, gluedRunsRead);
    }
}
