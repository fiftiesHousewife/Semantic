package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DrawnSeedsTest {

    @Test
    void drawsAtTheReadingsOwnSeedWhereTheCallerNamesNone() {
        assertThat(new DrawnSeeds(List.of()).seeds()).containsExactly(TreeReading.SEED);
    }

    @Test
    void drawsAtEverySeedTheCallerNames() {
        assertThat(new DrawnSeeds(List.of(3L, 11L, 20260813L)).seeds())
                .containsExactly(3L, 11L, 20260813L);
    }
}
