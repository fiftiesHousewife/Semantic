package io.github.fiftieshousewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicScoreTest {

    @Test
    void namesNoRuleWhereEveryFactorStands() {
        final TopicScore score = new TopicScore(0.5, 2, 4, 0.25);

        assertAll(
                () -> assertThat(score.stands()).isTrue(),
                () -> assertThat(score.value()).isCloseTo(0.0625, offset(1e-12)),
                () -> assertThat(score.shareOfPhrase()).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(score.refusals()).isEmpty());
    }

    @Test
    void namesTheWeightRuleWhereTheAgreeingWordsWereWorthNothing() {
        final TopicScore score = new TopicScore(0.0, 1, 2, 0.5);

        assertAll(
                () -> assertThat(score.stands()).isFalse(),
                () -> assertThat(score.refusals())
                        .containsExactly(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO));
    }

    @Test
    void standsWhereTheFileHasNotReadTheTopicBecauseTheFactorIsOneAndNeverZero() {
        assertAll(
                () -> assertThat(new TopicScore(0.5, 1, 2, 1.0).stands()).isTrue(),
                () -> assertThat(new TopicScore(0.5, 1, 2, 1.0).refusals()).isEmpty());
    }

    @Test
    void statesWhatEachRuleDoesInWords() {
        assertThat(RefusalRule.EVERY_AGREEING_WORD_WEIGHED_ZERO.stated())
                .contains("agreed")
                .contains("zero");
    }
}
