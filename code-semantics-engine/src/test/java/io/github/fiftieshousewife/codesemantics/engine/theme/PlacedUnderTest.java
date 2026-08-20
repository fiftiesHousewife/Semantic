package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlacedUnderTest {

    private final OpenAlexTopics topics = OpenAlexTopics.fromClasspath();

    private final PlacedUnder computerScience = PlacedUnder.in(topics, "Computer Science");

    @Test
    void marksATopicTheSchemeStatesBeneathTheNamedField() {
        assertThat(computerScience.of(topics.conceptOf("T10028")))
                .isEqualTo(ProbabilityOfSuperiority.Expectation.MEETS_IT);
    }

    @Test
    void marksNothingOutsideTheNamedFieldHoweverItsProseReads() {
        final SkosConcept elsewhere = topics.described().stream()
                .filter(topic -> computerScience.of(topic)
                        == ProbabilityOfSuperiority.Expectation.DOES_NOT)
                .findFirst().orElseThrow();
        assertThat(computerScience.of(elsewhere))
                .isEqualTo(ProbabilityOfSuperiority.Expectation.DOES_NOT);
    }

    @Test
    void marksFewerTopicsThanAWordSearchDoesAndNoneOfTheWrongSense() {
        final long marked = topics.described().stream()
                .filter(topic -> computerScience.of(topic)
                        == ProbabilityOfSuperiority.Expectation.MEETS_IT).count();
        final long saysSecurity = topics.described().stream()
                .filter(topic -> topic.definition().toLowerCase(java.util.Locale.ROOT)
                        .matches("(?s).*\\bsecurity\\b.*")).count();
        assertAll(
                () -> assertThat(marked).isPositive(),
                () -> assertThat(marked).isLessThan(topics.described().size()),
                () -> assertThat(saysSecurity).isPositive());
    }

    @Test
    void refusesAnAreaTheSchemeDoesNotStateRatherThanMarkingNothing() {
        assertThatThrownBy(() -> PlacedUnder.in(topics, "Back Office Operations"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Back Office Operations");
    }

    @Test
    void marksASubfieldAsReadilyAsAField() {
        assertThat(PlacedUnder.in(topics, "Finance").of(topics.conceptOf("T10028")))
                .isEqualTo(ProbabilityOfSuperiority.Expectation.DOES_NOT);
    }
}
