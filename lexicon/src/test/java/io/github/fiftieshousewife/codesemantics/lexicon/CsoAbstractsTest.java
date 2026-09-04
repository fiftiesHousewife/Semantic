package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CsoAbstractsTest {

    private final CsoAbstracts bundled = CsoAbstracts.fromClasspath();

    @Test
    void statesWhatWikipediaSaysATopicIsForTheTopicsCsoLinksToAnArticle() {
        assertAll(
                () -> assertThat(bundled.of("machine_learning")).isPresent(),
                () -> assertThat(bundled.of("machine_learning").orElseThrow())
                        .containsIgnoringCase("machine learning"));
    }

    @Test
    void statesNothingForATopicCsoLinksNoArticleFor() {
        assertThat(bundled.of("a_topic_cso_does_not_publish")).isEmpty();
    }

    @Test
    void treatsAnArticleThatStatedNoSummaryAsAbsentRatherThanAsEmptyProse() {
        final CsoAbstracts silent = new CsoAbstracts(Map.of("looked_up", "", "answered", "prose"));
        assertAll(
                () -> assertThat(silent.of("looked_up")).isEmpty(),
                () -> assertThat(silent.of("answered")).contains("prose"),
                () -> assertThat(silent.described()).isEqualTo(2));
    }

    @Test
    void coversAShareOfTheTopicsCsoPublishes() {
        assertThat(bundled.described()).isBetween(5000, 5400);
    }
}
