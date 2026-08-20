package io.github.fiftieshousewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RefusedTopicsTest {

    private final RefusedTopics refused = new RefusedTopics();

    @Test
    void countsOneRuleRemovingOneTopicAsOneRowHoweverOftenItHappened() {
        refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "cryptography", "signature value",
                "Signature.java:12");
        refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "cryptography", "signature input",
                "Signature.java:31");

        assertAll(
                () -> assertThat(refused.all()).singleElement()
                        .extracting(RefusedTopics.Refusal::occurrences).isEqualTo(2),
                () -> assertThat(refused.removedBy(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO)).isEqualTo(2),
                () -> assertThat(refused.topicsRemovedBy(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO))
                        .isEqualTo(1));
    }

    @Test
    void countsOneRowPerTopicARuleRemoved() {
        refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "law", "cite", "Citation.java:4");
        refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "music", "cite", "Citation.java:4");

        assertAll(
                () -> assertThat(refused.all()).hasSize(2),
                () -> assertThat(refused.topicsRemovedBy(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO))
                        .isEqualTo(2),
                () -> assertThat(refused.removedBy(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO))
                        .isEqualTo(2));
    }

    @Test
    void quotesTheDistinctPhrasesUpToTheHandfulItKeeps() {
        for (int line = 1; line <= 9; line++) {
            refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "law", "phrase " + line,
                    "Citation.java:" + line);
        }

        assertAll(
                () -> assertThat(refused.all().getFirst().quotations()).hasSize(4),
                () -> assertThat(refused.all().getFirst().quotations())
                        .extracting(TopicWitnesses.Quotation::phrase)
                        .containsExactly("phrase 1", "phrase 2", "phrase 3", "phrase 4"),
                () -> assertThat(refused.all().getFirst().occurrences()).isEqualTo(9));
    }

    @Test
    void ordersTheRemovalThatHappenedMostFirst() {
        refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "music", "string", "Text.java:2");
        refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "law", "cite", "Citation.java:4");
        refused.record(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO, "law", "cited", "Citation.java:9");

        assertThat(refused.all()).extracting(RefusedTopics.Refusal::topic).containsExactly("law", "music");
    }

    @Test
    void reportsNothingForARuleThatRemovedNothing() {
        assertAll(
                () -> assertThat(refused.all()).isEmpty(),
                () -> assertThat(refused.removedBy(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO))
                        .isEqualTo(0),
                () -> assertThat(refused.topicsRemovedBy(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO))
                        .isEqualTo(0));
    }
}
