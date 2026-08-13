package org.fifties.housewife.codesemantics.engine.theme;

import org.fifties.housewife.bi.lexicon.Lexicon;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;

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
 * <p>Where the dictionary does not know the word at all, nothing is being passed over and the answer is one.
 * The asymmetry is deliberate and worth stating: this measures the sense-labelled resource, and a resource
 * that labels headwords rather than senses — Wiktionary's topics — makes no claim about sense coverage that
 * could be checked this way. It is not discounted here, and that is a gap rather than a judgement.
 */
public final class SenseCoverage {

    private final Lexicon lexicon;

    public SenseCoverage(final Lexicon lexicon) {
        this.lexicon = lexicon;
    }

    public static SenseCoverage fromClasspath() {
        return new SenseCoverage(WordNetLexicon.fromClasspath());
    }

    /** The share of the word's senses that carry a subject label, in {@code (0, 1]}. */
    public double of(final String word) {
        final int labelled = lexicon.senseDomainsOf(word).size();
        final int senses = lexicon.senseCount(word);
        if (labelled == 0 || senses == 0) {
            return 1.0;
        }
        return Math.min(1.0, (double) labelled / senses);
    }
}
