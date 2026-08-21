package io.github.fiftieshousewife.codesemantics.engine.reading;

/**
 * The ordered stages a repository's words pass through before anything is weighed, each naming what it takes
 * out and what states the rule.
 *
 * <p>They are an order rather than a set. Every stage runs on what the one before it left, so a word removed
 * at {@link #NAMES} is never offered to {@link #SHORTHAND}, and a reader can say which stage a word left at
 * instead of finding it absent from the end.
 *
 * <p><b>Nothing here is a gate.</b> Every stage's population and every stage's removals are kept, so a
 * consumer reads the stage its question needs — what a repository wrote, or what it chose — and the
 * removals stay citable either way.
 */
public enum WordStage {

    /** Every token the splitter produced, filtered by nothing. */
    WRITTEN("Every word in the source"),

    /**
     * The words the repository <em>declared</em> something with, leaving what it wrote sentences about.
     *
     * <p>A licence header is the commonest prose in most repositories and names nothing: {@code license},
     * {@code apache} and {@code distribute} are what the file says about itself, not what its author called
     * anything.
     */
    NAMES("Words used to name something", "text written only in comments, such as the licence header"),

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
    LANGUAGE("Words the author chose", "words English requires, such as the, a, of and by"),

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
