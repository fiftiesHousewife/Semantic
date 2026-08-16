package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PermutedAssignmentTest {

    private static final Map<String, List<String>> STATED = Map.of(
            "GV", List.of("govern one", "govern two", "govern three"),
            "ID", List.of("identify one", "identify two"),
            "PR", List.of("protect one"));

    private final PermutedAssignment permuted = new PermutedAssignment();

    @Test
    void keepsEveryFunctionAndTheNumberOfStatementsEachWasGiven() {
        final Map<String, List<String>> drawn = permuted.of(STATED, new Random(1L));

        assertAll(
                () -> assertThat(drawn).containsOnlyKeys("GV", "ID", "PR"),
                () -> assertThat(drawn.get("GV")).hasSize(3),
                () -> assertThat(drawn.get("ID")).hasSize(2),
                () -> assertThat(drawn.get("PR")).hasSize(1));
    }

    @Test
    void keepsEveryStatementTheFrameworkStatesAndInventsNone() {
        assertThat(permuted.of(STATED, new Random(7L)).values().stream().flatMap(List::stream).toList())
                .containsExactlyInAnyOrderElementsOf(
                        STATED.values().stream().flatMap(List::stream).toList());
    }

    @Test
    void movesStatementsBetweenFunctionsSoTheAssignmentIsWhatChance() {
        assertThat(permuted.of(STATED, new Random(3L))).isNotEqualTo(STATED);
    }

    @Test
    void drawsTheSameAssignmentFromTheSameSeedSoARunReproduces() {
        assertThat(permuted.of(STATED, new Random(11L))).isEqualTo(permuted.of(STATED, new Random(11L)));
    }
}
