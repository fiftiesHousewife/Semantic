package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * The concepts a repository writes, read as a distribution over the same topics a body of code is read as —
 * in the publisher's words rather than the repository's.
 *
 * <p><b>The definition is what makes this a second arm and not the first one again.</b> A concept's label is
 * a word the repository itself wrote, so reading labels would re-read the vocabulary the words arm already
 * read. The publisher's own prose about the concept is text this repository had no hand in, and it goes
 * through the reading a subject description goes through, so what comes back is comparable with both.
 *
 * <p><b>A publisher stating no prose contributes nothing, and that is a correct outcome.</b> CSO states a
 * definition for none of its 14,636 rows, so it is silent here whatever the repository matched. Reading its
 * labels instead would be this arm voting with the other arm's evidence.
 *
 * <p>A term two concepts read as divides its mass between them. The evidence is that the repository wrote
 * something the publisher states under both, and handing each the whole of it would count the writing twice.
 */
public final class ConceptTopics {

    private final SubjectAreas areas;

    public ConceptTopics(final SubjectAreas areas) {
        this.areas = areas;
    }

    public static ConceptTopics fromClasspath() {
        return new ConceptTopics(SubjectAreas.fromClasspath());
    }

    /** How many of the matched concepts state prose, which is what the distribution below rests on. */
    public long describedAmong(final MatchedTerms matched) {
        return matched.sightings().stream()
                .flatMap(sighting -> sighting.concepts().stream())
                .filter(ConceptTopics::describes)
                .count();
    }

    /**
     * The distribution over dictionary topics, each concept's prose weighted by what the repository's writing
     * of that concept is worth — its occurrences weighed by how much the term narrows.
     */
    public TopicDistribution of(final MatchedTerms matched) {
        final Map<String, Double> massByTopic = new HashMap<>();
        matched.sightings().forEach(sighting -> described(sighting).forEach(concept ->
                add(massByTopic, concept, sighting.mass() / described(sighting).size())));
        return TopicDistribution.ofCitedMass(massByTopic);
    }

    private void add(final Map<String, Double> massByTopic, final SkosConcept concept, final double mass) {
        final TopicDistribution read = areas.topicsIn(concept.concept(), concept.definition())
                .distribution()
                .amongWhatWasPlaced();
        read.shareByTopic().forEach((topic, share) -> massByTopic.merge(topic, share * mass, Double::sum));
    }

    private static List<SkosConcept> described(final TermSighting sighting) {
        return sighting.concepts().stream().filter(ConceptTopics::describes).toList();
    }

    private static boolean describes(final SkosConcept concept) {
        return !concept.definition().isBlank();
    }
}
