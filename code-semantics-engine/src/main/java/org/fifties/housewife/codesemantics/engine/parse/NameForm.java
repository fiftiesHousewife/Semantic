package org.fifties.housewife.codesemantics.engine.parse;

/**
 * What a piece of text <em>is</em> in the syntax — and therefore whether this repository chose it.
 *
 * <p>The distinction the whole reading turns on is declaration against use. {@code String}, {@code assertThat}
 * and {@code List} are written everywhere in a Java file, and not one of those occurrences is a word this
 * codebase picked: they are the platform's and the test framework's vocabulary, invoked. What this codebase
 * picked is the name it <em>declared</em> — the field it called {@code massByTopic}, the method it called
 * {@code refusesAReadingThatWouldArgueAgainstATopic} — and the prose it wrote around them.
 *
 * <p>A lexical scan cannot tell the two apart, which is why the reading needs a parse. Nothing here is a list
 * of names to ignore; it is a rule about the position a name holds in the grammar, and grammar is permitted
 * where vocabulary is not.
 */
public enum NameForm {

    /** A type this repository declares — class, interface, enum, record or annotation. */
    TYPE(Vocabulary.IDENTIFIER),
    /** A method this repository declares. In a test source set these are its sentences about behaviour. */
    METHOD(Vocabulary.IDENTIFIER),
    /** A field this repository declares. */
    FIELD(Vocabulary.IDENTIFIER),
    /** A parameter of a method, constructor, lambda or catch clause. */
    PARAMETER(Vocabulary.IDENTIFIER),
    /** A local variable, including a loop variable and a pattern binding. */
    LOCAL(Vocabulary.IDENTIFIER),
    /** An enum constant or a record component — declared names that are neither field nor method. */
    CONSTANT(Vocabulary.IDENTIFIER),
    /** A type parameter. Usually one letter, and usually an abstention, which is the honest outcome. */
    TYPE_PARAMETER(Vocabulary.IDENTIFIER),
    /** A dependency this file names — kept only where it is neither the platform's nor this tree's own. */
    IMPORT(Vocabulary.IDENTIFIER),
    /** Documentation the author wrote against a declaration. */
    JAVADOC(Vocabulary.PROSE),
    /** Any other comment. */
    COMMENT(Vocabulary.PROSE);

    private final Vocabulary vocabulary;

    NameForm(final Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    public Vocabulary vocabulary() {
        return vocabulary;
    }

    /** Whether the form is prose rather than a name, which is what decides how it is split into words. */
    public boolean isProse() {
        return vocabulary == Vocabulary.PROSE;
    }

    /**
     * Whether every word of it was chosen by this repository as the name of something. A declared name was:
     * nothing forced {@code cursor} on its author. A sentence was not — English requires articles and
     * conjunctions whatever it is about — and neither was a dependency's package path, whose leading segments
     * are somebody else's coordinates. A reading weights the two differently, and this is where it asks.
     */
    public boolean isChosenName() {
        return vocabulary == Vocabulary.IDENTIFIER && this != IMPORT;
    }
}
