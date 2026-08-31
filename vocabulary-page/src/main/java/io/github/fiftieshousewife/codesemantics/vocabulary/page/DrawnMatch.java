package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

/**
 * One term a repository wrote that a bundled vocabulary publishes, as the matched-phrase page draws it.
 *
 * <p>It carries what the reading decided and how, so a reader can check a match rather than take it. The
 * standing beside it belongs to the <b>vocabulary</b> and not to this phrase: the bar is a count of terms
 * a deal of that publisher's own words reaches across the whole vocabulary, so a single phrase has no
 * figure against chance of its own and stating one would invent it.
 *
 * @param repository  the tree that wrote it
 * @param vocabulary  the publisher whose term it matched
 * @param term        the words the repository wrote
 * @param concepts    what the publisher calls them
 * @param occurrences how often the repository wrote them
 * @param matchedOn   what both sides were reduced to before being compared, in the words the reading
 *                    states it in — the words exactly as written, their dictionary form, an expansion
 *                    Wiktionary cites, or a WordNet sense
 * @param outcome     what the reading did with it: published, or the rule that set it aside
 * @param phrases     how many terms of more than one word the repository writes of this vocabulary
 * @param byChance    how many the best of the field reaches by dealing that publisher's own words
 */
public record DrawnMatch(String repository, String vocabulary, String term, List<String> concepts,
                         int occurrences, String matchedOn, String outcome, int phrases, int byChance) {

    public DrawnMatch {
        concepts = List.copyOf(concepts);
    }

    /** How many more terms than chance reaches this vocabulary found, which is the evidence's own unit. */
    public int beyondChance() {
        return phrases - byChance;
    }
}
