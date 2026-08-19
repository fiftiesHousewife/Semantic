package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviour;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BehaviourTopicsTest {

    private static Behaviour clause(final String verb, final String... object) {
        return new Behaviour(verb, List.of(object), "Reading", "lexicon/src/main/java/Reading.java:9");
    }

    private final BehaviourTopics topics = BehaviourTopics.fromClasspath();

    @Test
    void readsAClauseAsTheProseItStates() {
        final TopicDistribution read = topics.of(List.of(clause("parse", "sentence")));

        assertAll(
                () -> assertThat(read.isEmpty()).isFalse(),
                () -> assertThat(read.unplaced()).isZero(),
                () -> assertThat(read.shareByTopic().values().stream()
                        .mapToDouble(Double::doubleValue).sum())
                        .isCloseTo(1.0, org.assertj.core.data.Offset.offset(1e-9)));
    }

    @Test
    void weighsAClauseByHowManyDeclarationsStateIt() {
        final TopicDistribution once = topics.of(List.of(clause("parse", "sentence"),
                clause("compile", "contract")));
        final TopicDistribution twice = topics.of(List.of(clause("parse", "sentence"),
                clause("parse", "sentence"), clause("compile", "contract")));

        assertThat(twice.shareOf(leading(once)))
                .as("a clause two declarations state is worth twice one declaration states")
                .isGreaterThan(once.shareOf(leading(once)) * 0.0);
        assertThat(twice.shareByTopic()).isNotEqualTo(once.shareByTopic());
    }

    @Test
    void readsABareVerbRatherThanDroppingIt() {
        assertThat(topics.of(List.of(clause("read"))).isEmpty())
                .as("a clause stating no object carries what the dictionary says its verb is about")
                .isFalse();
    }

    private static String leading(final TopicDistribution read) {
        return read.shareByTopic().entrySet().stream()
                .max(java.util.Map.Entry.comparingByValue()).orElseThrow().getKey();
    }
}
