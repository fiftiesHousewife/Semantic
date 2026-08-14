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
            + "Every Java file in one is parsed, and only the names its author declared are taken. A name "
            + "used here but declared elsewhere — String, List, assertThat — belongs to whoever declared it, "
            + "and the parse is what tells the two apart. Files the parser cannot read are counted and named.";

    static final String SPLIT = "A rule set splits on case transitions, digit boundaries and separators, so "
            + "citationSource yields citation and source. Where a compound has no such boundary, candidate "
            + "splits are scored against a published word-frequency list and the commonest reading wins: "
            + "userid reads as user and id rather than use and rid.";

    static final String LOOKED_UP = "WordNet holds nouns, verbs, adjectives and adverbs. A word with no "
            + "entry there — of, and, which — carries grammar rather than subject matter and is dropped, and "
            + "the same query returns the dictionary form, so citations and citation count together. Two "
            + "resources then say what a word is about: WordNet Domains labels each sense of a word, and "
            + "Wiktionary's topic vocabulary labels the headword. A word neither resource lists produces no "
            + "vote. That is not a vote of zero, which would pull the result towards nothing; the word "
            + "contributes nothing at all, and is counted in λ below.";

    static final String WEIGHTED = "Three weights multiply, and each is read off a published resource "
            + "rather than chosen. Sense coverage is the share of a word's senses the resource labelled. "
            + "Specificity is log(rank) / log(size) against the frequency list, so a rare word narrows a "
            + "subject further than a common one. Phrase agreement is the geometric mean over the words of a "
            + "name that agree on a subject, times the share of the name that agrees: cite alone is law, "
            + "linguistics and publishing, and beside source it is one of them.";

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
