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
            new Legibility(0.979, 54_839, 300, 0.724, 0.952),
            new Field(new Field.Nearest("cs Computer Science", 0.2504, 0.3423),
                    new Field.Nearest("cs.CL Computation and Language", 0.3950, 0.4455),
                    "nlin Nonlinear Sciences", 0.3810),
            List.of(new Distinctive("lexicon/src/main/java", 0.1751, List.of("networking", "geology")),
                    new Distinctive("engine/src/main/java", 0.0628, List.of("semantics", "grammar"))),
            List.of("semantics", "grammar", "networking"),
            List.of(new Withheld("documentation", "0.1641 bits, and 993 of 999 chance draws stood as far"))));

    @Test
    void statesTheDenominatorBeforeAnythingRestingOnIt() {
        assertThat(rendered).contains("| **λ** — share a bundled resource has an entry for | **0.979** |",
                "| Word occurrences read | 54,839 |", "| Files | 300 |",
                "| Prose share of those occurrences | 72% |");
    }

    @Test
    void statesTheOtherDenominatorBesideIt() {
        assertThat(rendered)
                .as("a reader meets λ and ι on one page and has to be told they count different things")
                .contains("| Evidence resolving to no subject | 95.2% |");
    }

    @Test
    void placesTheRepositoryAgainstItsFieldWithTheBarItHadToBeat() {
        assertAll(
                () -> assertThat(rendered)
                        .as("the archive is the level whose null is strongest")
                        .contains("| Archive | **cs Computer Science** | 25.0% | 34.2% | apart from chance |"),
                () -> assertThat(rendered)
                        .as("and the category is the level that answers what it is about")
                        .contains("| Category | **cs.CL Computation and Language** | 39.5% | 44.6% "
                                + "| apart from chance |"),
                () -> assertThat(rendered).contains("behind the leading one is nlin Nonlinear Sciences at "
                        + "38.1%"));
    }

    @Test
    void saysAPlacementDoesNotStandApartWhereItDidNot() {
        final String weak = new SummaryReport().render(new ReadingSummary("R",
                new Legibility(0.9, 10, 1, 0.5, 0.5),
                new Field(new Field.Nearest("cs", 0.40, 0.30), new Field.Nearest("cs.CL", 0.44, 0.41),
                        "math", 0.42), List.of(), List.of(), List.of()));

        assertThat(weak)
                .as("a placement no nearer than chance is named as such rather than printed plainly")
                .contains("**within chance**");
    }

    @Test
    void namesOnlyTheTopicsThatMakeSomePartUnlikeTheRest() {
        assertAll(
                () -> assertThat(rendered).contains("`semantics`, `grammar`, `networking`"),
                () -> assertThat(rendered)
                        .as("a ranking of the whole has nothing to be compared against")
                        .contains("ranks nothing about the repository as a whole"));
    }

    @Test
    void carriesEachQualifiedScopeWithWhatItWritesMoreOf() {
        assertAll(
                () -> assertThat(rendered).contains("| `lexicon/src/main/java` | 17.5% | "
                        + "`networking`, `geology` |"),
                () -> assertThat(rendered).contains("| `engine/src/main/java` | 6.3% | "
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
