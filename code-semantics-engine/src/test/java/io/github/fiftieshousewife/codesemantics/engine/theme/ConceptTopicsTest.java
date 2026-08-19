package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ConceptTopicsTest {

    private static SkosConcept concept(final String label, final String definition) {
        return new SkosConcept("http://purl.org/olia/olia.owl#" + label, label, "", "WordClass", "class",
                "olia", definition, "");
    }

    private static TermSighting sighting(final String term, final double specificity, final int occurrences,
                                         final SkosConcept... concepts) {
        return new TermSighting(List.of(term), List.of(concepts), TermRung.WORDS, specificity, occurrences,
                List.of("lexicon/src/main/java/Reading.java:9"));
    }

    private static MatchedTerms matched(final TermSighting... sightings) {
        return new MatchedTerms(List.of(sightings), 900, 40, 12, Map.of(TermRung.WORDS, 12), Map.of());
    }

    private final ConceptTopics topics = ConceptTopics.fromClasspath();

    @Test
    void readsThePublishersProseRatherThanTheLabelTheRepositoryWrote() {
        final MatchedTerms verb = matched(sighting("verb", 0.8, 20,
                concept("Verb", "A verb is a word denoting an action, occurrence or state of being in a "
                        + "sentence, inflected for tense and person in the grammar of a language.")));

        final TopicDistribution read = topics.of(verb);

        assertAll(
                () -> assertThat(read.isEmpty()).isFalse(),
                () -> assertThat(read.unplaced()).isZero(),
                () -> assertThat(read.shareByTopic().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, within(1e-9)));
    }

    @Test
    void staysSilentWhereThePublisherStatesNoProse() {
        final MatchedTerms unstated = matched(sighting("ontology", 0.9, 37, concept("ontology", "")));

        assertAll(
                () -> assertThat(topics.of(unstated)).isEqualTo(TopicDistribution.NOTHING),
                () -> assertThat(topics.describedAmong(unstated)).isZero());
    }

    @Test
    void countsOnlyTheMatchedConceptsThatStateProse() {
        final MatchedTerms mixed = matched(
                sighting("verb", 0.8, 20, concept("Verb", "a word denoting an action in a sentence")),
                sighting("ontology", 0.9, 37, concept("ontology", "")));

        assertThat(topics.describedAmong(mixed)).isEqualTo(1);
    }

    @Test
    void dividesATermsMassBetweenTheConceptsItsPublisherStatesItUnder() {
        final MatchedTerms shared = matched(sighting("feature", 0.7, 10,
                concept("SemanticFeature", "a semantic feature of a word in a sentence"),
                concept("MorphosyntacticFeature", "a semantic feature of a word in a sentence")));
        final MatchedTerms alone = matched(sighting("feature", 0.7, 10,
                concept("SemanticFeature", "a semantic feature of a word in a sentence")));

        assertThat(topics.of(shared).shareByTopic())
                .as("one writing of one term is one piece of evidence however many concepts state it")
                .isEqualTo(topics.of(alone).shareByTopic());
    }

    private static org.assertj.core.data.Offset<Double> within(final double tolerance) {
        return org.assertj.core.data.Offset.offset(tolerance);
    }
}
