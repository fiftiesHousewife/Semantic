package io.github.fiftieshousewife.codesemantics.engine.parse;

/**
 * What a piece of text is in the syntax, and therefore whether this repository chose it. The words a
 * repository chose are the names it declared and the prose it wrote around them; a use — {@code String},
 * {@code assertThat} — is somebody else's vocabulary, and only a parse tells the two apart. Each form
 * carries that verdict as its {@link Authorship}.
 */
public enum NameForm {

    /** A type this repository declares — class, interface, enum, record or annotation. */
    TYPE(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A method this repository declares; in a test source set, its sentences about behaviour. */
    METHOD(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A field this repository declares. */
    FIELD(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A parameter of a method, constructor or lambda. */
    PARAMETER(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** The name a catch clause binds. It stands for the type the language requires beside it, so nothing is named. */
    CAUGHT(Vocabulary.IDENTIFIER, Authorship.QUOTED),
    /**
     * A name that is the initials of its own type — {@code StringBuilder sb}. {@link #CAUGHT}'s rule for the
     * declarations that write their type out; {@link TypeInitials} states which they are.
     */
    ABBREVIATED_TYPE(Vocabulary.IDENTIFIER, Authorship.QUOTED),
    /** A local variable, including a loop variable and a pattern binding. */
    LOCAL(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** An enum constant or a record component — declared names that are neither field nor method. */
    CONSTANT(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /** A type parameter. Usually one letter, and usually an abstention, which is the honest outcome. */
    TYPE_PARAMETER(Vocabulary.IDENTIFIER, Authorship.CHOSEN),
    /**
     * The part of a file's package that distinguishes it from its neighbours — {@code theme}, {@code parse}.
     * The coordinate every file shares is the organisation's, and it is not read.
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

    /** Whether a form's words were picked by this repository to name a thing, or stand for something somebody else declared. */
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
     * Whether every word of it was chosen by this repository as the name of something. A sentence was not —
     * English requires its function words — and neither was a name standing for the type beside it, nor a
     * dependency's coordinates.
     */
    public boolean isChosenName() {
        return authorship == Authorship.CHOSEN;
    }
}
