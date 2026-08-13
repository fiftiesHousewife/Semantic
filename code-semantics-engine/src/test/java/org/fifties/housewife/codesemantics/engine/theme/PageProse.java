package org.fifties.housewife.codesemantics.engine.theme;

/**
 * The page's own sentences, kept apart from the tags that carry them so that changing what the page
 * <em>says</em> is never a change to how it is built.
 *
 * <p>Every figure the page prints comes from the reading's export; every sentence here explains what one of
 * those figures is and what it is not. Where a sentence names a number, it names one the report also names,
 * so the two cannot drift apart without one of them being wrong.
 */
final class PageProse {

    static final String HEADING = "What this repository is about, and the words that say so";

    static final String LEDE = "A parse of every file, read for the names this repository declared, the "
            + "prose it wrote, and the dependencies it chose — then each word offered to two published "
            + "resources that place a word in a subject. Nothing here is asserted: every theme carries the "
            + "words that earned it, and a theme carried by one word says so on its own row.";

    static final String READS = "What a Java file mostly contains is somebody else's vocabulary quoted: "
            + "String, List and assertThat are uses of declarations the platform and the test framework "
            + "made, and a use is not a word this codebase chose. Only a parse can tell a declaration from "
            + "a use, so that is what runs. Prose is read for its content words alone — the dictionary is "
            + "an open-class one, so the words English uses to hold a sentence together are simply not in "
            + "it — and every word is read as its dictionary form, so words and word are one subject. A "
            + "word nothing chose is weighted by how much it narrows a subject, which the frequency list "
            + "states and nothing here decides. Still not done: no git read, so nothing is pinned to a "
            + "commit and no permalink is rendered, and no votes, because a vote needs an anchor and an "
            + "anchor needs a revision.";

    static final String GRAPH_HEADING = "What share each theme holds";

    static final String GRAPH = "Every theme holds a wedge as wide as its share of all topical mass, so "
            + "the ring closes exactly once and the topics too small to draw hold what is left rather than "
            + "being dropped. The inner ring is the broad subject the topic resource generalises each label "
            + "to, and the outer ring is the label the resource actually stated — the same published "
            + "hierarchy the reading folds a derived label back through, so the grouping is a citation and "
            + "not something arranged here. A label that generalises to nothing sits alone in its own "
            + "sector, which is what the resource says about it.";

    static final String RANKING_HEADING = "Which themes dominate";

    static final String RANKING = "Three different questions, three different answers, and their "
            + "disagreement is the reading. ι is the theme's share of the tree's topical mass. References "
            + "counts word occurrences. Lines led counts only the files where the theme beats every other, "
            + "which is the measure closest to \"how much of this codebase is that\".";

    static final String RANKING_CAPTION = "The eighteen strongest themes, by intensity. Words behind is "
            + "the count of distinct surfaces; the last column names the three most written of them.";

    static final String BEHAVIOUR_HEADING = "What this repository does";

    static final String BEHAVIOUR = "A method name is a clause and a test name is a sentence, so the suite "
            + "is a specification wherever that convention holds. The leading word is a verb where the "
            + "dictionary carries a verb entry for it; where it does not, the name yields no behaviour "
            + "rather than a guessed one. Every clause names the line it was read from.";

    static final String BEHAVIOUR_CAPTION = "The verbs this repository performs most, with what each acts "
            + "on.";

    static final String FOREIGN_HEADING = "Words carried in from somewhere else";

    static final String FOREIGN = "Each of these is written at least three times, and the dictionary places "
            + "it in a subject this repository is not about — measured as the divergence of the word's own "
            + "reading from the repository's, in bits. That is what a metaphor looks like from the outside. "
            + "It is also what an ordinary technical term looks like when the resources are too coarse for "
            + "it, which is why these are candidates and the evidence is printed beside them.";

    static final String LINES_HEADING = "Lines of code, by the theme that leads them";

    static final String SCOPES_HEADING = "What distinguishes each scope";

    static final String SCOPES = "A ranking over one scope is a weak reading — the commonest words in Java "
            + "source are also the most ambiguous, and they are everywhere. A comparison is the strong one: "
            + "a theme written at the same density everywhere contributes nothing to it. Each scope is "
            + "measured against the whole repository, and then against the field of divergences a scope of "
            + "its own size draws by chance.";

    static final String STRANGE_HEADING = "Read the strange results, not around them";

    static final String STRANGE_LAW = "Law is cite, evidence, claim and licence. Every one of those is a "
            + "word this library really is about, and every one of them the dictionary also places "
            + "somewhere else. The cause is not polysemy but its opposite: the domain resource omits "
            + "domain-less senses by its own header's admission, so the everyday sense of cite — the "
            + "bibliographic one, the only sense this repository ever means — carries no label and casts no "
            + "vote, while the legal sense is the whole of what the resources say. Discounting a label by "
            + "the share of the word it speaks for took law from first to third, and it is still third.";

    static final String STRANGE_HIERARCHY = "Sciences was first until the hierarchy was read. It, "
            + "natural-sciences, physical-sciences, engineering, computing and human-sciences fired on the "
            + "same words and led almost no files between them, because the topic resource publishes its "
            + "labels as a closure over its own hierarchy: a word labelled computing arrives carrying all "
            + "five of the others. Folding a derived label back into the label it came from — by the same "
            + "published map that derived it — took the vocabulary from 519 distinct topics to 479 and put "
            + "computing at the top. What that exposed is the next defect: concentrating the mass took the "
            + "files with no leader at all from 54 to 17, so more files now have a leader holding almost "
            + "none of them.";

    static final String STRANGE_REST = "Mythology was jupiter — a real theme of one source set, whose "
            + "witness is the JUnit Jupiter dependency that set imports. The dictionary knows Jupiter as a "
            + "Roman god and it is not wrong. That one is sense disambiguation, and the backlog carries it "
            + "with the measurement that settles it: a disambiguation that does not remove that reading has "
            + "not helped. None of these is a defect in the evidence. They are what reading a word against "
            + "two vocabularies that do not know about each other actually produces.";

    static final String FOOT = "Generated by ./gradlew selfRead from this repository's own sources; every "
            + "figure here is copied unchanged from the reading's export, so this page and the report "
            + "behind it cannot disagree. The permutation null is seeded, so two runs of one tree agree.";

    private PageProse() {
    }

    static String linesLed(final String lines) {
        return "Every file resolves to at most one leading theme, weighed against everything in it that no "
                + "resource could read. The bar is all %s lines of the tree.".formatted(lines);
    }

}
