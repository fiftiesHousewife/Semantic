package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;

/**
 * How much of a word a sense-labelled resource actually speaks for: the share of its senses that were given
 * a subject at all.
 *
 * <p>This exists because the bundled domain resource omits domain-less senses by construction — its own
 * header says so — and the consequence is not a small one. The everyday sense of a word is usually the
 * domain-less one, so what survives to vote is whatever specialist meaning the word also happens to have.
 * {@code cite} is labelled <em>law</em> and nothing else, because a court cites a defendant; the
 * bibliographic sense, the only one this repository ever means, carries no label and therefore no vote. Read
 * without the denominator, the rarest thing a word can mean becomes the whole of what it says.
 *
 * <p>So a label is worth the share of the word it covers. {@code cite} has six senses and one of them
 * labelled: the label speaks for a sixth of the word. {@code divergence} has three and one labelled: a
 * third. Neither figure is chosen — both come from the dictionary, and the second is the one already being
 * read.
 *
 * <p><b>A word the sense-labelled resource says nothing about is not fully covered — it is uncovered.</b>
 * Reporting full coverage there is complete confidence on no evidence at all, and it amplifies every
 * reading that rests on a headword label alone.
 *
 * <p>A headword resource still speaks, and what it speaks for is measurable at its floor. A topic attached
 * to a headword is a claim about <em>some</em> sense of the word without saying which, so it covers at least
 * one — the least a claim can concern, which is a consequence of a claim existing rather than a number
 * chosen here. So a word WordNet labels no sense of and Wiktionary names a topic for is covered
 * {@code 1/senses}: quiet, and not silent.
 *
 * <p>Where the dictionary does not know the word at all there is no sense structure to discount against,
 * nothing is being passed over, and the answer is one.
 */
public final class SenseCoverage {

    private final Lexicon lexicon;
    private final HeadwordTopics headwordTopics;

    public SenseCoverage(final Lexicon lexicon, final HeadwordTopics headwordTopics) {
        this.lexicon = lexicon;
        this.headwordTopics = headwordTopics;
    }

    public static SenseCoverage fromClasspath() {
        return new SenseCoverage(WordNetLexicon.fromClasspath(), StatedTopics.fromClasspath());
    }

    /** The share of the word's senses some resource put a subject on, in {@code (0, 1]}. */
    public double of(final String word) {
        final int senses = lexicon.senseCount(word);
        if (senses == 0) {
            return 1.0;
        }
        return Math.min(1.0, Math.max(sensesLabelled(word), headwordClaims(word)) / (double) senses);
    }

    private int sensesLabelled(final String word) {
        return (int) lexicon.senseDomainsOf(word).stream().filter(labels -> !labels.isEmpty()).count();
    }

    /** A topic on a headword names no sense, so it speaks for the fewest a claim can — one. */
    private int headwordClaims(final String word) {
        return headwordTopics.of(word).isEmpty() ? 0 : 1;
    }
}
