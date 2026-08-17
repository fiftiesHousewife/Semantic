package io.github.fiftieshousewife.codesemantics.engine.parse;

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
    TYPE(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A method this repository declares. In a test source set these are its sentences about behaviour. */
    METHOD(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A field this repository declares. */
    FIELD(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A parameter of a method, constructor or lambda. */
    PARAMETER(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /**
     * The name a catch clause binds a caught exception to.
     *
     * <p>It is a declaration, so the parse hands it over, and it is not a word about a subject: the language
     * requires the type to be written immediately beside it, and what the name stands for is that type —
     * already read wherever it was declared.
     */
    CAUGHT(Vocabulary.IDENTIFIER, Authorship.QUOTED),
    /**
     * A declaration whose name is the initials of the words of its own type — {@code TikaInputStream tis},
     * {@code StringBuilder sb}, {@code InputStream is}.
     *
     * <p>Nothing is named here: the letters stand for the type written beside them, and a type is a use,
     * read wherever it was declared. It is {@link #CAUGHT}'s rule reaching the declarations that write their
     * type out. {@link TypeInitials} states which they are, from the parse and without a length rule.
     */
    ABBREVIATED_TYPE(Vocabulary.IDENTIFIER, Authorship.QUOTED),
    /** A local variable, including a loop variable and a pattern binding. */
    LOCAL(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** An enum constant or a record component — declared names that are neither field nor method. */
    CONSTANT(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A type parameter. Usually one letter, and usually an abstention, which is the honest outcome. */
    TYPE_PARAMETER(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /**
     * The part of a file's package that distinguishes it from its neighbours — {@code theme}, {@code parse},
     * {@code term}. The coordinate every file shares is not read: it is the organisation's, chosen once, and
     * counting it once per file would say this repository is about its own domain name.
     */
    PACKAGE(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A label on a statement. Rare, and a name its author chose as deliberately as any other. */
    LABEL(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A dependency this file names — kept only where it is neither the platform's nor this tree's own. */
    IMPORT(Vocabulary.IDENTIFIER, Authorship.QUOTED),
    /** Documentation the author wrote against a declaration. */
    JAVADOC(Vocabulary.PROSE, Authorship.QUOTED),
    /** Any other comment. */
    COMMENT(Vocabulary.PROSE, Authorship.QUOTED),
    /** A line of the repository's own documentation — a README, a plan, a backlog. */
    DOCUMENTATION(Vocabulary.PROSE, Authorship.QUOTED);

    /** Whether every word of a form was picked by this repository to name a thing, or stands for something
     * somebody else declared. */
    private enum Authorship {
        CHOSEN, QUOTED
    }

    private final Vocabulary vocabulary;
    private final Authorship authorship;

    NameForm(final Vocabulary vocabulary, final Authorship authorship) {
        this.vocabulary = vocabulary;
        this.authorship = authorship;
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
     * are somebody else's coordinates, nor a name that stands for the type written beside it. A reading
     * weights the two differently, and this is where it asks.
     */
    public boolean isChosenName() {
        return authorship == Authorship.CHOSEN;
    }
}
