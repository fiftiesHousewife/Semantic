package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.regex.Pattern;

/**
 * Whether a publisher writes its labels as ordinary English phrases or as identifiers.
 *
 * <p>It decides nothing about what a label means and states no vocabulary. It reads how the label is
 * written, which is grammar and is the same rule the identifier splitter runs on: a run with no space, or
 * a word carrying a capital inside it, is an identifier. That is what tells CSO's
 * {@code public key cryptography} from FIX's {@code MsgSeqNum} without either being listed anywhere.
 *
 * <p><b>Why it is worth telling apart.</b> A reader asking what a repository is about can read
 * <em>public key cryptography</em> and <em>hash functions</em>; {@code MsgSeqNum}, {@code RawData} and
 * {@code QuantitativeValue} say nothing to them, and ranking by how often the repository wrote a thing
 * puts the identifiers first — quickfixj writes {@code MsgSeqNum} 800 times. So a phrase is shown before
 * an identifier of the same reading, and the identifier keeps its place beneath.
 *
 * <p><b>Some publishers have no phrase to state.</b> FIX, FpML, FIBO and OLiA label every concept with an
 * identifier, so a reading that only they answered has no English subject at all — which is a fact about
 * those publishers rather than something a page can arrange around.
 */
enum LabelForm {

    /** Written as English: words separated by spaces, none of them carrying a capital inside it. */
    PHRASE,

    /** Written as a name a program declares: one run, or a word with a capital inside it. */
    IDENTIFIER;

    private static final Pattern CAPITAL_INSIDE_A_WORD = Pattern.compile("\\w[A-Z]");

    private static final String SPACE = " ";

    /** How the label is written. A blank label is an identifier: there is no phrase in it to read. */
    static LabelForm of(final String label) {
        final String written = label.strip();
        if (!written.contains(SPACE)) {
            return IDENTIFIER;
        }
        return CAPITAL_INSIDE_A_WORD.matcher(written).find() ? IDENTIFIER : PHRASE;
    }
}
