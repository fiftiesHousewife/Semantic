package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TopicHierarchyExtractionTest {

    private final TopicHierarchyExtraction extraction = new TopicHierarchyExtraction();

    @Test
    void refusesAModuleThatIsNotTheRevisionTheHeaderWouldCite() {
        assertThatThrownBy(() -> extraction.source().pinned("topic_generalize_map = {}\n"
                .getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("872fc7bfc15c388eca84591268d6f35759c42290");
    }
}
