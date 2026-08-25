package io.github.fiftieshousewife.codesemantics.engine.term;

/**
 * What both sides of a match were normalised to before they were compared, narrowest first.
 *
 * <p>A term index answers on one rung and says which, because a match found on the words themselves and a
 * match found on what the dictionary says those words mean are not the same evidence and pooling them into one
 * figure would hide the whole question. The first rung cites nothing — it is a string comparison, and its
 * strength is that it invents nothing either. The last cites WordNet's own sense entries, and buys the
 * matches a string comparison cannot see at the cost of everything the dictionary reads too generously.
 *
 * <p>The middle rung is there because without it the last one takes the credit for its work. A taxonomy
 * publishes {@code Phrase} and a repository writes {@code phrases}, and a reading that reported that as a
 * match of meanings would be claiming a dictionary of synonymy for what is one word and its plural. Separating
 * them is what says how much of the generalisation was free and how much was a risk.
 *
 * <p>The order is the order they are tried in: the narrowest rung that answers is the one that answers, and a
 * broader one is asked only where the narrower said nothing.
 */
public enum TermRung {

    /** The run of words as both sides wrote it. */
    WORDS("the words themselves"),

    /** The dictionary form of each word, which is one word's inflections and not a second word. */
    LEMMAS("the dictionary form of each word"),

    /** The sense the dictionary carries each word in, which two different spellings can share. */
    SENSES("the sense the dictionary carries each word in");

    private final String normalisation;

    TermRung(final String normalisation) {
        this.normalisation = normalisation;
    }

    /** What both sides became, in words a report can print. */
    public String normalisation() {
        return normalisation;
    }
}
