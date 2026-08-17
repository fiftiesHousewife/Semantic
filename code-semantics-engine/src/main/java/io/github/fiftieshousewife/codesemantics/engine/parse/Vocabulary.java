package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.name.Tokeniser;

/**
 * The two ways a piece of source text turns into <em>phrases</em> of words, and the reason they cannot be one
 * way. An identifier carries its own boundaries and no others, and the whole of it is one phrase — its words
 * were chosen together and mean each other. A comment carries the spaces and punctuation a human wrote, and
 * is as many phrases as it has sentences, because a paragraph is not one statement about one subject.
 *
 * <p>The phrase is the unit a topical reading counts, so what counts as one is load-bearing: it is why a
 * twenty-word sentence and a two-word field name each commit one unit, and why the words inside either can
 * be read as context for one another.
 */
public enum Vocabulary {

    /** A name the author declared: one phrase, split at its own boundaries. */
    IDENTIFIER {
        @Override
        public List<IdentifierReading> phrasesOf(final String text, final IdentifierWords words) {
            return List.of(words.of(text));
        }
    },

    /** A passage the author wrote: one phrase per sentence, each split into the words a reader sees. */
    PROSE {
        @Override
        public List<IdentifierReading> phrasesOf(final String text, final IdentifierWords words) {
            return Arrays.stream(SENTENCE_END.split(text, -1))
                    .map(sentence -> new IdentifierReading(Tokeniser.words(sentence), 0))
                    .filter(sentence -> !sentence.words().isEmpty())
                    .toList();
        }
    };

    /**
     * Where one statement ends and the next begins. A full stop, a semicolon, a colon or a blank line — the
     * marks a writer uses to end a thought, and nothing subtler, because a reading that guessed at sentence
     * boundaries would be inventing the very structure it claims to find.
     */
    private static final Pattern SENTENCE_END = Pattern.compile("[.;:!?]+\\s|\\n\\s*\\n|[.;:!?]+$");

    public abstract List<IdentifierReading> phrasesOf(String text, IdentifierWords words);
}
