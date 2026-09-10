package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

/**
 * Which of a source's terms a walk reports: only its phrases, or every term it states including those of
 * one word.
 *
 * <p>{@link MatchedPhrases} states why the published reading counts phrases alone. The every-term walk is
 * what asks whether that refusal costs anything: a term of one word has no published order for a deal to
 * destroy — a deal of a vocabulary of single words states the same single words — so {@link ScrambledTerms}
 * prices a single word at exactly what its presence in the word list is worth, and the comparison stays the
 * same function of the same input on both sides.
 */
public enum ReportedSpans {

    /** Only terms of more than one word, which is what the published reading counts. */
    PHRASES {
        @Override
        List<TermSpan> in(final TermSpans spans, final List<String> words) {
            return spans.phrasesIn(words);
        }

        @Override
        PhraseStarts startsOf(final TermIndex index) {
            return PhraseStarts.of(index);
        }
    },

    /** Every term the source states, of any length. */
    EVERY_TERM {
        @Override
        List<TermSpan> in(final TermSpans spans, final List<String> words) {
            return spans.in(words);
        }

        @Override
        PhraseStarts startsOf(final TermIndex index) {
            return PhraseStarts.ofEveryTerm(index);
        }
    };

    /** The spans this walk reports within one phrase. */
    abstract List<TermSpan> in(TermSpans spans, List<String> words);

    /** The words a run must hold for this walk to look inside it. */
    abstract PhraseStarts startsOf(TermIndex index);
}
