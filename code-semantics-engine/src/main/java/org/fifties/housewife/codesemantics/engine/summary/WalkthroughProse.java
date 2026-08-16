package org.fifties.housewife.codesemantics.engine.summary;

/**
 * What each step of the analysis does, in words, held apart from the figures it produced.
 *
 * <p>The prose is the same whatever repository was read, and the figures beside it are not. Keeping them in
 * separate files is what stops a sentence describing the method from being edited to fit one result.
 */
final class WalkthroughProse {

    static final String LEDE = "The analysis in the order it runs. Each step says what it does, what it "
            + "found in this repository, and which report holds the whole of it.";

    static final String PARSED = "A scope is one source-set directory or the repository's documentation. "
            + "Every Java file in one is parsed into an abstract syntax tree — the compiler's own model of "
            + "the file, in which every name has a position in the grammar — and only the names its author "
            + "declared are taken from it: a type, method, field, parameter, local, record component, enum "
            + "constant, type parameter, label or package rung. A name used here but declared elsewhere — "
            + "String, List, assertThat — belongs to whoever declared it, and nothing but a parse can tell "
            + "the two apart, which is why that single rule removes the platform and the test framework "
            + "from the reading without naming either. Two names the syntax binds rather than the author "
            + "choosing are read apart: a dependency's package path, and the name a catch clause gives a "
            + "caught exception, which stands for the type the language requires beside it. Comments are "
            + "taken as the author's prose, and a javadoc through the parser's model of the javadoc — a "
            + "block tag's name is Javadoc's own word and not a subject, a @param tag names a parameter "
            + "already read where it was declared, and what an inline {@link} or {@code} points at is a use "
            + "of something declared elsewhere. Files the parser cannot read are counted and named.";

    static final String SPLIT = "A grammar splits on case transitions, separators and runs of capitals, so "
            + "citationSource yields citation and source and XMLHttpRequest yields XML and HttpRequest. A "
            + "letter beside a digit is not a boundary and a letter either side of an apostrophe is not "
            + "one either, which is Unicode's own word-segmentation standard rather than a choice made "
            + "here. Where a compound carries no boundary at all, candidate splits are priced against a "
            + "published word-frequency list and the cheapest reading wins: userid reads as user and id "
            + "rather than use and rid. That list is twenty thousand words long, so a run it does not carry "
            + "would be taken apart into pieces it does — abstains as ab and stains — and the dictionary is "
            + "asked first: a run it carries as one word is one word, whatever the list says. Finally the "
            + "words are read back in the order they were written, and a run of adjacent words a topical "
            + "resource publishes as one entry becomes one word: part of speech is one term and not three.";

    static final String LOOKED_UP = "WordNet holds nouns, verbs, adjectives and adverbs. A word with no "
            + "entry there — of, and, which — carries grammar rather than subject matter and is dropped, and "
            + "the same query returns the dictionary form, so citations and citation count together. Two "
            + "resources then say what a word is about: WordNet Domains labels each sense of a word, and "
            + "Wiktionary's topic vocabulary labels the headword. A word neither resource lists produces no "
            + "vote. That is not a vote of zero, which would pull the result towards nothing; the word "
            + "contributes nothing at all, and is counted in λ below.";

    private static final String WEIGHTS = "Three weights multiply, and each is read off a published resource "
            + "rather than chosen. Sense coverage is the share of a word's senses the resource labelled. "
            + "Specificity is log(rank) / log(size) against the frequency list, so a rare word narrows a "
            + "subject further than a common one. Phrase agreement is the geometric mean over the words of a "
            + "name that agree on a subject, times the share of the name that agrees: cite alone is law, "
            + "linguistics and publishing, and beside source it is one of them.";

    /**
     * What a frequency table is and why the reading needs two. It is stated before the weights rather than
     * after them, because every weight below is read off one and a reader meeting log(rank) has to know
     * what rank is a rank in.
     */
    private static final String REFERENCES = "A frequency table is a published count of how often each word is "
            + "written in some body of text, given as an ordering: the commonest word first, and a word's "
            + "rank standing in for its rate. The reading needs one because a count taken on its own cannot "
            + "answer the question it is asked. The words a Java program contains most of are the words "
            + "every Java program contains most of, and the words a body of prose contains most of are the "
            + "ones English requires whatever it is about, so a raw ranking of any repository returns the "
            + "language rather than the subject. A word is therefore scored against what it would be if the "
            + "repository were unremarkable, and there are two references because each covers a hole the "
            + "other leaves. The bundled frequency list states what ordinary English is written in, so the, "
            + "of and that say nothing about a repository whose reading is three quarters prose. The type "
            + "names the running platform declares in the packages it exports — read from "
            + "ModuleFinder.ofSystem(), not from any list bundled here — state what ordinary Java is "
            + "written in, so set, value, map and object say nothing either. A word rises only where both "
            + "agree this repository writes it more densely than they do, and a reference that writes it "
            + "more densely carries that as a claim against it rather than removing it.";

    static final String WEIGHTED = REFERENCES + " " + WEIGHTS;

    static final String POOLED = "One declared name is one unit of evidence and one sentence of prose is "
            + "another, whatever their length, so a long sentence cannot outweigh a short name by containing "
            + "more words. The result is a distribution over subjects for each scope and for the repository "
            + "as a whole, taken over everything that was observed rather than over what was placed: a "
            + "phrase no resource could place keeps its whole unit, and a phrase whose words named so many "
            + "subjects that none of them was settled keeps whatever they could not settle. Both stay in "
            + "the denominator, because a reading that divided only by what it managed to place would report "
            + "the same shares for a file it read and a file it did not. The chart draws the topics that "
            + "earned a place: the inner ring is the topic "
            + "resource's own hierarchy, the outer ring the labels the reading resolved, and a wedge is the "
            + "share of the divergence that topic accounts for rather than how often it was written.";

    static final String COMPARED = "A topic written at the same density everywhere distinguishes nothing, "
            + "so a scope is judged by how far its distribution departs from the repository's, measured in "
            + "bits by Jensen–Shannon divergence. That distance is compared against 999 resamples of a scope "
            + "the same size drawn from the same repository. A scope that does not beat its own field of "
            + "chance draws is reported nowhere.";

    static final String PLACED = "The same distribution is compared against one built from each subject "
            + "description a published scheme publishes. The nearest subject is reported only if it is "
            + "nearer than the nearest a scheme of chance would have offered over 999 draws.";

    static final String MATCHED = "A term taxonomy publishes the names practitioners of a field use, "
            + "already formatted as identifiers. Both sides go through the same splitting rules and the "
            + "longest published term at each position is taken, with no two matches overlapping. A "
            + "single-word match counts only where the repository writes another concept from the same "
            + "branch of the taxonomy. No match contributes to the distribution above: the matcher has been "
            + "run on this repository only, which is one tree and therefore not a measurement.";

    static final String WITHHELD = "Everything that failed a bar above is named here and printed nowhere "
            + "else. A reading that showed only its survivors would read as a reading with nothing wrong "
            + "with it.";

    static final String FOOT = "Regenerate all of it with ./gradlew selfRead. Every figure is a reading of "
            + "one commit of one working tree, and the corpus includes these reports.";

    private WalkthroughProse() {
    }
}
