package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.summary.ReadingSummary.Distinctive;
import org.fifties.housewife.codesemantics.engine.summary.ReadingSummary.Field;
import org.fifties.housewife.codesemantics.engine.summary.ReadingSummary.Legibility;
import org.fifties.housewife.codesemantics.engine.summary.ReadingSummary.Withheld;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SummaryReportTest {

    private final String rendered = new SummaryReport().render(new ReadingSummary("CodeSemantics",
            new Legibility(0.979, 54_839, 300, 0.724),
            new Field("cs Computer Science", 0.2504, 0.3423, "nlin Nonlinear Sciences", 0.3810),
            List.of(new Distinctive("lexicon/src/main/java", 0.1751, List.of("networking", "geology")),
                    new Distinctive("engine/src/main/java", 0.0628, List.of("semantics", "grammar"))),
            List.of("semantics", "grammar", "networking"),
            List.of(new Withheld("documentation", "0.1641 bits, and 993 of 999 chance draws stood as far"))));

    @Test
    void statesTheDenominatorBeforeAnythingRestingOnIt() {
        assertThat(rendered).contains("λ = 0.979", "54,839 word occurrences", "300 files", "72% of them prose");
    }

    @Test
    void placesTheRepositoryAgainstItsFieldWithTheBarItHadToBeat() {
        assertThat(rendered).contains("**cs Computer Science**, 0.2504 bits away",
                "chance placed its nearest subject at 0.3423", "stands apart from chance",
                "runner-up is nlin Nonlinear Sciences at 0.3810");
    }

    @Test
    void saysAPlacementDoesNotStandApartWhereItDidNot() {
        final String weak = new SummaryReport().render(new ReadingSummary("R",
                new Legibility(0.9, 10, 1, 0.5),
                new Field("cs", 0.40, 0.30, "math", 0.42), List.of(), List.of(), List.of()));

        assertThat(weak).contains("does **not** stand apart from chance");
    }

    @Test
    void namesOnlyTheTopicsThatMakeSomePartUnlikeTheRest() {
        assertAll(
                () -> assertThat(rendered).contains("`semantics`, `grammar`, `networking`"),
                () -> assertThat(rendered)
                        .as("a ranking of the whole has nothing to be compared against")
                        .contains("no ranking of the repository as a whole"));
    }

    @Test
    void carriesEachQualifiedScopeWithWhatItWritesMoreOf() {
        assertAll(
                () -> assertThat(rendered).contains("| `lexicon/src/main/java` | 0.1751 | "
                        + "`networking`, `geology` |"),
                () -> assertThat(rendered).contains("| `engine/src/main/java` | 0.0628 | "
                        + "`semantics`, `grammar` |"));
    }

    @Test
    void namesWhatItWithheldAndTheBarThatFailed() {
        assertThat(rendered).contains("## Withheld",
                "`documentation` — 0.1641 bits, and 993 of 999 chance draws stood as far");
    }

    @Test
    void carriesNoneOfTheMaterialASummaryExistsToLeaveOut() {
        assertThat(rendered)
                .doesNotContain("Verb", "metaphor", "per thousand declared names", "Lines led");
    }
}
