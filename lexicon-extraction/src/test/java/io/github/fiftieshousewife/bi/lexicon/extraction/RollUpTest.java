package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RollUpTest {

    private record Concept(String id, String broader) implements Nested {
    }

    private static final Concept TOP = new Concept("grp_cs", "");

    private static final Concept MIDDLE = new Concept("cs", "grp_cs");

    private static final Concept LEAF = new Concept("cs.CL", "cs");

    private static final Map<String, Concept> BY_ID =
            Map.of(TOP.id(), TOP, MIDDLE.id(), MIDDLE, LEAF.id(), LEAF);

    private final RollUp rollUp = new RollUp();

    @Test
    void followsTheSourcesOwnNestingAllTheWayUp() {
        assertThat(rollUp.topOf(LEAF, BY_ID)).isEqualTo(TOP);
    }

    @Test
    void leavesSomethingStatedAtTheTopWhereItIs() {
        assertThat(rollUp.topOf(TOP, BY_ID)).isEqualTo(TOP);
    }

    @Test
    void refusesAConceptNestedInsideOneTheSourceNeverStates() {
        assertThatThrownBy(() -> rollUp.topOf(new Concept("cs.AI", "missing"), BY_ID))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("missing");
    }
}
