package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class JoinedStatementsTest {

    private final JoinedStatements statements = new JoinedStatements();

    @Test
    void statesNothingWhereTheSourceStatesNothing() {
        assertThat(statements.of(List.of())).isEmpty();
    }

    @Test
    void carriesASingleStatementUnchanged() {
        assertThat(statements.of(List.of("A word that names a thing."))).isEqualTo("A word that names a thing.");
    }

    @Test
    void keepsEveryStatementTheSourceMadeInTheOrderItMadeThem() {
        assertThat(statements.of(List.of("EAGLES", "Santorini 1991"))).isEqualTo("EAGLES | Santorini 1991");
    }

    @Test
    void collapsesTheWhitespaceASourceLaysItsProseOutWith() {
        assertThat(statements.of(List.of("A word\n\t\t\tthat names\n a thing.")))
                .isEqualTo("A word that names a thing.");
    }

    @Test
    void countsAnExactRepeatOnceBecauseTheSourceStatedItOnce() {
        assertThat(statements.of(List.of("EAGLES", "EAGLES"))).isEqualTo("EAGLES");
    }

    @Test
    void countsARepeatOnceEvenWhereOnlyItsLayoutDiffered() {
        assertThat(statements.of(List.of("A  word", "A word"))).isEqualTo("A word");
    }

    @Test
    void passesOverAStatementWithNothingInIt() {
        assertThat(statements.of(List.of("EAGLES", "   ", "TuBa-D/Z"))).isEqualTo("EAGLES | TuBa-D/Z");
    }

    @Test
    void refusesAStatementThatWouldBeReadBackAsTwoTheSourceNeverMade() {
        assertThatThrownBy(() -> statements.of(List.of("EAGLES | Santorini 1991")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("EAGLES");
    }
}
