package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicWitnessesTest {

    private final TopicWitnesses witnesses = new TopicWitnesses();

    @Test
    void quotesThePhraseTheWordWasReadInRatherThanTheWordAlone() {
        witnesses.record("law", "cite", "citation source", "Citations.java:12",
                EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        assertThat(witnesses.forTopic("law", 1).getFirst().quotations())
                .containsExactly(new TopicWitnesses.Quotation("citation source", "Citations.java:12"));
    }

    @Test
    void keepsTheSameWordReadInTwoPhrasesAsTwoQuotations() {
        witnesses.record("law", "cite", "citation source", "Citations.java:12",
                EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        witnesses.record("law", "cite", "cited reading", "Readings.java:7",
                EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        final TopicWitnesses.Witness witness = witnesses.forTopic("law", 1).getFirst();
        assertAll(
                () -> assertThat(witness.quotations())
                        .as("what a reader most wants to see is the same word settling differently")
                        .hasSize(2),
                () -> assertThat(witness.occurrences()).isEqualTo(2),
                () -> assertThat(witness.mass()).isEqualTo(2.0));
    }

    @Test
    void countsOnePhraseReadTwiceOnceInTheEvidenceAndTwiceInTheFigures() {
        witnesses.record("law", "cite", "citation source", "Citations.java:12",
                EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        witnesses.record("law", "cite", "citation source", "Citations.java:12",
                EvidenceSource.WORDNET_DOMAIN, 0.5);
        final TopicWitnesses.Witness witness = witnesses.forTopic("law", 1).getFirst();
        assertAll(
                () -> assertThat(witness.quotations()).hasSize(1),
                () -> assertThat(witness.occurrences()).isEqualTo(2),
                () -> assertThat(witness.mass()).isEqualTo(1.5),
                () -> assertThat(witness.sources()).containsExactlyInAnyOrder(
                        EvidenceSource.WIKTIONARY_TOPIC, EvidenceSource.WORDNET_DOMAIN));
    }

    @Test
    void namesOnePlaceToStartLookingAndAbstainsWhereThereIsNone() {
        witnesses.record("law", "cite", "citation source", "Citations.java:12",
                EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        assertAll(
                () -> assertThat(witnesses.forTopic("law", 1).getFirst().site())
                        .isEqualTo("Citations.java:12"),
                () -> assertThat(new TopicWitnesses.Witness("cite", 0, 0.0, List.of(), Set.of()).site())
                        .as("a witness with nowhere to point says so rather than pointing anywhere")
                        .isEmpty());
    }

    @Test
    void ordersTheWordsByTheMassEachCarriedRatherThanByHowOftenItWasWritten() {
        witnesses.record("law", "the", "the claim", "A.java:1", EvidenceSource.WIKTIONARY_TOPIC, 0.1);
        witnesses.record("law", "the", "the evidence", "A.java:2", EvidenceSource.WIKTIONARY_TOPIC, 0.1);
        witnesses.record("law", "attribution", "attribution rule", "B.java:3",
                EvidenceSource.WIKTIONARY_TOPIC, 0.9);
        assertThat(witnesses.forTopic("law", 2))
                .extracting(TopicWitnesses.Witness::word)
                .containsExactly("attribution", "the");
    }
}
