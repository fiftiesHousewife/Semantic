package io.github.fiftieshousewife.codesemantics.engine.reading;

/**
 * The ordered stages a repository's words pass through before anything is weighed, each naming what it takes
 * out and what states the rule.
 *
 * <p>They are an order rather than a set. Every stage runs on what the one before it left, so a word removed
 * at {@link #CHOSEN} is never offered to {@link #SHORTHAND}, and a reader can say which stage a word left at
 * instead of finding it absent from the end.
 *
 * <p><b>Nothing here is a gate.</b> Every stage's population and every stage's removals are kept, so a
 * consumer reads the stage its question needs — what a repository wrote, or what it chose — and the
 * removals stay citable either way.
 */
public enum WordStage {

    /** Every token the splitter produced, filtered by nothing. */
    EVERY_WORD("Every word in the source"),

    /**
     * The words this repository picked, leaving the ones it quoted from somebody else.
     *
     * <p>{@link io.github.fiftieshousewife.codesemantics.engine.parse.NameForm} states which is which, and
     * the removals are not only prose. An override's name was chosen once, in the supertype that required
     * it; {@code parseContext} on a {@code ParseContext} names nothing the type did not already; a catch
     * clause binds what the language put there; a dependency's coordinates are somebody else's artefact. A
     * licence header is the commonest of them — {@code license}, {@code apache} and {@code distribute} are
     * what the file says about itself, not what its author called anything.
     */
    CHOSEN("Words this repository chose rather than quoted",
            "comment prose, an override's inherited name, a dependency's coordinates, and a name standing "
            + "for the type beside it"),

    /**
     * Forms too short for a dictionary entry about them to be about more than a symbol — {@code x},
     * {@code id}, {@code ns}.
     */
    SYMBOL("Words longer than a symbol", "one- and two-letter runs such as x, i and id"),

    /**
     * Forms the dictionaries cite for more different things than they mean as a word — {@code buf},
     * {@code ref}, {@code pom}, {@code uri}. The letters do not determine a word.
     */
    SHORTHAND("Words that are not abbreviations", "forms the dictionaries cite for several different things, such as buf, ref and pom"),

    /**
     * Words English supplied rather than the author — {@code the}, {@code a}, {@code of}, {@code by}.
     *
     * <p>WordNet's open classes are what says so, not a list: a word the dictionary places as a noun, verb
     * or adjective names something, and one it places as none of them holds a sentence together.
     */
    LANGUAGE("Words English did not supply", "words English requires, such as the, a, of and by"),

    /** Inflections merged into the form the dictionary spells: {@code curves} and {@code curve} are one. */
    LEMMA("Words in their dictionary form", "nothing — inflections are merged into their singulars");

    private final String keeps;
    private final String removes;

    WordStage(final String keeps) {
        this(keeps, "");
    }

    WordStage(final String keeps, final String removes) {
        this.keeps = keeps;
        this.removes = removes;
    }

    /** The words this stage leaves, said plainly enough to head a report. */
    public String keeps() {
        return keeps;
    }

    /** What this stage takes out, for a report to say why the count fell. */
    public String removes() {
        return removes;
    }
}
