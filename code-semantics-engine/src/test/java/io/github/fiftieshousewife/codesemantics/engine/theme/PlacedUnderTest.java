package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlacedUnderTest {

    private final ArxivSubjects subjects = ArxivSubjects.fromClasspath();

    private final PlacedUnder computerScience = PlacedUnder.in(subjects, "Computer Science");

    @Test
    void marksASubjectTheSchemeStatesBeneathTheNamedArea() {
        assertThat(computerScience.of(subjects.conceptOf("cs.AI")))
                .isEqualTo(ProbabilityOfSuperiority.Expectation.MEETS_IT);
    }

    @Test
    void marksNothingOutsideTheNamedAreaHoweverItsProseReads() {
        final SkosConcept elsewhere = subjects.described().stream()
                .filter(subject -> computerScience.of(subject)
                        == ProbabilityOfSuperiority.Expectation.DOES_NOT)
                .findFirst().orElseThrow();
        assertThat(computerScience.of(elsewhere))
                .isEqualTo(ProbabilityOfSuperiority.Expectation.DOES_NOT);
    }

    @Test
    void marksFewerSubjectsThanAWordSearchDoesAndNoneOfTheWrongSense() {
        final long marked = subjects.described().stream()
                .filter(subject -> computerScience.of(subject)
                        == ProbabilityOfSuperiority.Expectation.MEETS_IT).count();
        final long saysSecurity = subjects.described().stream()
                .filter(subject -> subject.definition().toLowerCase(Locale.ROOT)
                        .matches("(?s).*\\bsecurity\\b.*")).count();
        assertAll(
                () -> assertThat(marked).isPositive(),
                () -> assertThat(marked).isLessThan(subjects.described().size()),
                () -> assertThat(saysSecurity).isPositive());
    }

    @Test
    void refusesAnAreaTheSchemeDoesNotStateRatherThanMarkingNothing() {
        assertThatThrownBy(() -> PlacedUnder.in(subjects, "Back Office Operations"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Back Office Operations");
    }

    @Test
    void marksAnArchiveAsReadilyAsACategory() {
        assertThat(PlacedUnder.in(subjects, "Mathematics").of(subjects.conceptOf("cs.AI")))
                .isEqualTo(ProbabilityOfSuperiority.Expectation.DOES_NOT);
    }
}
