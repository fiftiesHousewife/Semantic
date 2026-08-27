package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorroboratedSensesTest {

    private static CorroboratedSenses corroborated;

    @BeforeAll
    static void readTheCommittedEvidence(@TempDir final Path folder) throws IOException {
        corroborated = CorroboratedSenses.fromCommittedEvidence(PublishedReadingFixture.wrote(folder));
    }

    private static CountedSenseDomains uncounted(final String label, final String... domains) {
        return new CountedSenseDomains(Set.of(domains), 0, List.of(label));
    }

    @Test
    void givesAnUncountedSenseTheCountOfItsWrittenPlacingLabel() {
        final List<CountedSenseDomains> weighed = corroborated.of(List.of(
                uncounted("Interest Rate", "finance"),
                uncounted("Monetary Policy", "economics")));

        assertAll(
                () -> assertThat(weighed.getFirst().uses())
                        .as("the fixture's evidence records interest rate written 6 times")
                        .isEqualTo(6),
                () -> assertThat(weighed.getLast().uses())
                        .as("a sense whose label the repository never wrote keeps the uncounted weight")
                        .isZero());
    }

    @Test
    void readsACollocatedDictionaryUnitAsAWrittenRun() {
        assertThat(corroborated.of(List.of(uncounted("part of speech", "linguistics"))))
                .singleElement()
                .satisfies(sense -> assertThat(sense.uses()).isEqualTo(21));
    }

    @Test
    void leavesAMatchAtASpellingRungOutOfTheEvidence() {
        assertThat(corroborated.of(List.of(uncounted("Credit Risk", "finance"))))
                .singleElement()
                .satisfies(sense -> assertThat(sense.uses()).isZero());
    }

    @Test
    void leavesAnArmWithACountedSenseUntouched() {
        final List<CountedSenseDomains> counted = List.of(
                new CountedSenseDomains(Set.of("commerce"), 3, List.of("bank")),
                uncounted("Interest Rate", "finance"));

        assertThat(corroborated.of(counted)).isSameAs(counted);
    }

    @Test
    void neverCreatesASenseWhereTheArmStatesNone() {
        assertThat(corroborated.of(List.of())).isEmpty();
    }

    @Test
    void keepsTheSensesDomainsStrengthAndLabelsBesideTheNewCount() {
        final CountedSenseDomains before = new CountedSenseDomains(Set.of("finance"), 0, 0.25,
                List.of("Interest Rate"));

        assertThat(corroborated.of(List.of(before)))
                .singleElement()
                .satisfies(sense -> assertAll(
                        () -> assertThat(sense.domains()).isEqualTo(before.domains()),
                        () -> assertThat(sense.labelStrength()).isEqualTo(0.25),
                        () -> assertThat(sense.placingLabels()).isEqualTo(before.placingLabels())));
    }
}
