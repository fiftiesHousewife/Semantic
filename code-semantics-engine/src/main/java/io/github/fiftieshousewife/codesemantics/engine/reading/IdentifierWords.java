package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import io.github.fiftieshousewife.codesemantics.name.Tokeniser;
import io.github.fiftieshousewife.codesemantics.name.WordSegmenter;

/**
 * The words a name is written in: the explicit separators first, then the tokeniser's own boundaries, then
 * the segmenter on any run they left glued. A run the segmenter refuses stays whole and goes forward as one
 * word, because a run nothing can read is still something the repository wrote and the reading records it as
 * seen rather than dropping it.
 *
 * <p>The segmenter is given the bundled dictionary through {@link DictionaryWords}, so a run the dictionary
 * carries as one word is never divided into pieces the frequency list happens to be shorter than.
 *
 * <p>Three rules live here that {@link Tokeniser} does not carry, and all are grammar rather than vocabulary.
 * The dot and the dollar are separators, which matters for a dependency an author named in full, where
 * {@code net.sf.extjwnl.data} is four words and not one unreadable token. And a run of capitals ends one word
 * before the last of them, which is the rule whose absence the self-reading kept finding in its own tail:
 * {@code carriesAPrefix} was reading as carries / aprefix and {@code JWNLException} as jwnlexception.
 *
 * <p><b>A space is a separator.</b> A declared name cannot hold one, but a published taxonomy's label is
 * written in English and most of them do — the Computer Science Ontology states
 * {@code natural language processing}. Split at its spaces that label is three words, which is what
 * {@code naturalLanguageProcessing} reads as, so the two sides meet. Held whole it is one token no declared
 * name can equal.
 *
 * <p>They are added alongside the ported tokeniser and not inside it. That class is shared with the project
 * this library's evidence machinery came from, where it reads schema identifiers, and a widening measured
 * against code is not automatically a widening that project wants.
 *
 * <p><b>A letter beside a digit is not a boundary, and that is a citation rather than an omission.</b>
 * Unicode's own word-segmentation grammar states it: UAX #29 rules WB9 and WB10 — {@code AHLetter × Numeric}
 * and {@code Numeric × AHLetter}, where {@code ×} is defined as "do not allow break here" — under the prose
 * "do not break within sequences of digits, or digits adjacent to letters ('3a', or 'A3')". So utf8 and
 * base64 hold together, which is the same kind of thing as the acronym run above and not a list of tokens.
 * A catalogue of cited tokens is what would be needed to <em>override</em> that default for a particular
 * run, never to obey it. A <em>capital</em> after a digit is another matter: it is the same case signal
 * the camelCase boundary reads, which a digit in front of it does not erase, so {@code utf8Decode} reads
 * as utf8 and decode and {@code mp3VariableBitRate} as mp3, variable, bit and rate.
 */
public final class IdentifierWords {

    private static final Pattern SEPARATOR = Pattern.compile("[.$\\s]+");

    /**
     * The boundary at the end of a run of capitals: the last capital of the run begins the next word.
     * {@code XMLHttpRequest} divides into XML and HttpRequest, {@code JWNLException} into JWNL and Exception,
     * and — the case that matters most for reading a name as a sentence — {@code refusesALineRange} into
     * refusesA and LineRange, so the article is a word of its own instead of gluing itself to the noun.
     */
    private static final Pattern ACRONYM_RUN = Pattern.compile("(?<=[A-Z])(?=[A-Z][a-z])");

    /**
     * The boundary in front of a capital written after a digit: the camelCase case signal, which the
     * digit's presence does not erase. {@code JBIG2Image} divides into JBIG2 and Image, {@code utf8Decode}
     * into utf8 and Decode — while the letter–digit joins themselves hold, as UAX #29's WB9 and WB10 state.
     */
    private static final Pattern CAPITAL_AFTER_DIGIT = Pattern.compile("(?<=\\p{N})(?=\\p{Lu})");

    private final WordSegmenter segmenter;

    public IdentifierWords(final WordSegmenter segmenter) {
        this.segmenter = segmenter;
    }

    public static IdentifierWords fromClasspath() {
        return new IdentifierWords(WordSegmenter.reading(DictionaryWords.fromClasspath()));
    }

    public IdentifierReading of(final String identifier) {
        final List<String> words = new ArrayList<>();
        int gluedRunsRead = 0;
        for (final String qualified : SEPARATOR.split(identifier, -1)) {
            for (final String run : capitalBoundedRuns(qualified)) {
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

    /** The runs the two capital boundaries divide: the end of an acronym run, and a capital after a digit. */
    private static List<String> capitalBoundedRuns(final String qualified) {
        return ACRONYM_RUN.splitAsStream(qualified)
                .flatMap(CAPITAL_AFTER_DIGIT::splitAsStream)
                .toList();
    }
}
