package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedDescriptionsTest {

    private static SkosConcept concept(final String label, final String broader, final String definition) {
        return new SkosConcept("urn:" + label, label, "", broader, "topic", "cso", definition, "");
    }

    private static StatedDescriptions over(final List<SkosConcept> published) {
        return StatedDescriptions.over(published, StatedAncestry.over(published));
    }

    @Test
    void takesThePublishersOwnProseWhereItStatesAnyForTheConcept() {
        final StatedDescriptions described = over(List.of(
                concept("unicast", "networking", "sending a message to a single recipient"),
                concept("networking", "", "the practice of connecting computers")));

        assertThat(described.of("unicast"))
                .contains(new StatedDescription("sending a message to a single recipient", "unicast"));
    }

    @Test
    void climbsToTheNearestNodeThePublisherDescribesWhereTheConceptItselfIsBare() {
        final StatedDescriptions described = over(List.of(
                concept("public keys", "public key cryptography", ""),
                concept("public key cryptography", "authentication", "a cryptosystem of key pairs"),
                concept("authentication", "", "the act of proving an assertion")));

        assertAll(
                () -> assertThat(described.of("public keys").orElseThrow().prose())
                        .isEqualTo("a cryptosystem of key pairs"),
                () -> assertThat(described.of("public keys").orElseThrow().statedFor())
                        .as("a summary of the branch is not a definition of what sits in it")
                        .isEqualTo("public key cryptography"));
    }

    @Test
    void refusesALevelAnOutrightMajorityOfTheVocabularySitsBeneath() {
        final List<SkosConcept> published = Stream.concat(
                Stream.of(concept("computer science", "", "the study of computation")),
                IntStream.range(0, 9).mapToObj(at -> concept("topic " + at, "computer science", "")))
                .toList();

        assertThat(over(published).of("topic 0"))
                .as("80% of CSO sits under computer science, so naming it says only which vocabulary matched")
                .isEmpty();
    }

    @Test
    void statesNothingWhereNoLevelAtOrAboveTheConceptCarriesProse() {
        final StatedDescriptions described = over(List.of(
                concept("session types", "type systems", ""),
                concept("type systems", "", "")));

        assertThat(described.of("session types")).isEmpty();
    }
}
