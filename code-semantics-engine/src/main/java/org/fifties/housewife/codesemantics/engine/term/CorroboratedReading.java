package org.fifties.housewife.codesemantics.engine.term;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

/**
 * A repository read against a term vocabulary twice: once admitting every match, and once admitting a
 * one-word term only where the publisher's own branch holds another concept the repository wrote.
 *
 * <p>Both are kept because a rule that removes matches can only be judged as a comparison. The corroborated
 * reading is the one that gets reported; the difference between the two is what the branch rule cost.
 *
 * <p>The branch is read off the tree of the <em>uncorroborated</em> reading. Asking which siblings were
 * written of a reading that has already dropped the uncorroborated ones would be the rule judging itself.
 */
public record CorroboratedReading(MatchedTerms every, MatchedTerms matched, TaxonomyTree everyTree,
                                  TaxonomyTree tree, StatedSiblings siblings) {

    /** How many distinct terms the branch rule refused, which is the count a header carries. */
    public int refusedByBranch() {
        return every.distinctTerms() - matched.distinctTerms();
    }

    public static CorroboratedReading of(final TermIndex terms, final List<SkosConcept> published,
                                         final ParsedRepository parsed) {
        final IdentifierWords words = IdentifierWords.fromClasspath();
        final MatchedTerms every = TermReading.over(terms).of(parsed);
        final TaxonomyTree everyTree = treeOf(published, every, words);
        final StatedSiblings siblings = StatedSiblings.of(everyTree);
        final MatchedTerms matched = TermReading.corroboratedBy(terms, siblings).of(parsed);
        return new CorroboratedReading(every, matched, everyTree, treeOf(published, matched, words),
                siblings);
    }

    private static TaxonomyTree treeOf(final List<SkosConcept> published, final MatchedTerms matched,
                                       final IdentifierWords words) {
        return TaxonomyTree.of(published, writtenByConcept(matched),
                label -> String.join(" ", words.of(label).words()));
    }

    /** How often the repository wrote each concept, by the label the taxonomy states it under. */
    private static Map<String, Integer> writtenByConcept(final MatchedTerms matched) {
        final Map<String, Integer> written = new HashMap<>();
        matched.sightings().forEach(sighting -> sighting.concepts().forEach(concept ->
                written.merge(concept.prefLabel(), sighting.occurrences(), Integer::sum)));
        return written;
    }
}
