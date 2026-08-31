package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.name.WordRanks;

/**
 * A name for a published subject that a reader can read, asked of the publisher's own file and of grammar,
 * and never written here.
 *
 * <p>Seven of the bundled standards label in ordinary English and four label with identifiers.
 * {@code public key cryptography} needs nothing; {@code SingleGeneralOrderHandling},
 * {@code QuantitativeValue} and {@code InflectionTypeFeature} say nothing to a reader until they are
 * split, and {@code MsgSeqNum} says nothing even then because the publisher abbreviated it.
 *
 * <p>The sources are asked in this order, cheapest first, and each is either the publisher's own words or
 * grammar:
 *
 * <ol>
 *   <li>the label as it stands, where the publisher wrote a phrase;
 *   <li>the label as it stands, lowercased, where it is one word with nothing in it to split on;
 *   <li>the label split into its words otherwise.
 * </ol>
 *
 * <p><b>A publisher's sentence is not used as a name.</b> It was, and OLiA documents
 * {@code InflectionTypeFeature} with a paragraph on English tagsets, so a description read <em>noun,
 * layout element, Strong inflection is a characteristic of lexemes, not individual tokens</em>. Bounding
 * the sentence by length needs a bound, and none follows from the data: the publishers' own phrase
 * labels run from 2 words at the median to 14 at the longest, so the longest admits the paragraph and
 * the median refuses every real name. The sentence is the concept's <em>meaning</em> and it is stated
 * where meanings are stated, beneath the reading, rather than where a name goes.
 *
 * <p><b>Nothing is invented and nothing is listed.</b> The split is the identifier grammar this library
 * already runs on declared names; the test of whether a word is ordinary English is a rank in a bundled
 * frequency list; the sentence is the publisher's. A label written here would be this project stating
 * what somebody else's standard means.
 */
final class ReadableName {

    private static final String SPACE = " ";

    private static final java.util.regex.Pattern SEPARATED =
            java.util.regex.Pattern.compile("[._$-]");

    private static final java.util.regex.Pattern CAPITAL_INSIDE_A_WORD =
            java.util.regex.Pattern.compile("\\w[A-Z]");

    private final IdentifierWords identifiers;

    private final WordRanks ranks;

    ReadableName(final IdentifierWords identifiers, final WordRanks ranks) {
        this.identifiers = identifiers;
        this.ranks = ranks;
    }

    static ReadableName fromClasspath() {
        return new ReadableName(IdentifierWords.fromClasspath(), WordRanks.fromClasspath());
    }

    /** The best name the publisher and the grammar between them can state for this subject. */
    String of(final String label) {
        if (LabelForm.of(label) == LabelForm.PHRASE) {
            return label;
        }
        if (isOneWord(label)) {
            return label.toLowerCase(Locale.ROOT);
        }
        final String split = splitOf(label);
        return split.isBlank() ? label : split;
    }

    /**
     * Whether the label is one word with nothing in it to split on.
     *
     * <p><b>Splitting one runs it into pieces that read worse than it did.</b> {@code multicasts} became
     * <em>multi casts</em> and {@code Session} became <em>session</em> only by luck — the word segmenter
     * runs on frequency alone and will divide any run it can. A capital inside the word or a separator is
     * the publisher saying where the parts are; without one there is nothing to say it, so the label
     * stands as the publisher wrote it.
     */
    private static boolean isOneWord(final String label) {
        final String written = label.strip();
        return !written.contains(SPACE) && !SEPARATED.matcher(written).find()
                && !CAPITAL_INSIDE_A_WORD.matcher(written).find();
    }

    /**
     * Whether every word the label splits into is one an English frequency list ranks.
     *
     * <p>This is what tells {@code ExecutionReport} and {@code QuoteRequest} from {@code MsgSeqNum} and
     * {@code ClOrdID}: the first two split into words English states, the last two into shorthand it does
     * not. A label that splits into nothing does not anglicise.
     */
    boolean anglicises(final String label) {
        final List<String> words = identifiers.of(label).words();
        return !words.isEmpty() && words.stream()
                .allMatch(word -> ranks.knows(word.toLowerCase(Locale.ROOT)));
    }

    private String splitOf(final String label) {
        return String.join(SPACE, identifiers.of(label).words()).toLowerCase(Locale.ROOT);
    }
}
