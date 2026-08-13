package org.fifties.housewife.codesemantics.engine.parse;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.reading.IdentifierReading;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.name.Tokeniser;

/**
 * The two ways a piece of source text turns into words, and the reason they cannot be one way. An identifier
 * carries its own boundaries and no others — case changes, underscores, and a glued run for the segmenter to
 * arbitrate. A sentence carries the spaces and punctuation a human wrote, which an identifier splitter would
 * swallow into one unreadable token.
 */
public enum Vocabulary {

    /** A name the author declared: split at its own boundaries, then segment what is left glued. */
    IDENTIFIER {
        @Override
        public IdentifierReading read(final String text, final IdentifierWords words) {
            return words.of(text);
        }
    },

    /** A sentence the author wrote: split at whitespace and punctuation first, then at name boundaries. */
    PROSE {
        @Override
        public IdentifierReading read(final String text, final IdentifierWords words) {
            return new IdentifierReading(Tokeniser.words(text), 0);
        }
    };

    public abstract IdentifierReading read(String text, IdentifierWords words);
}
