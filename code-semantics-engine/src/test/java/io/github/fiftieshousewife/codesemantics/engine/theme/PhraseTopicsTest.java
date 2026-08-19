package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PhraseTopicsTest {

    private final PhraseTopics topics = new PhraseTopics(TopicCitations.fromClasspath(),
            new TopicCommitment(), SenseCoverage.fromClasspath());

    private static final Map<String, Double> FULL_WEIGHT = Map.of("test", 1.0, "parser", 1.0);

    @Test
    void aWordSpellingTheSourceSetVotesNothing() {
        final PhraseTopics.Reading scoped = topics.under(TopicDistribution.NOTHING, Set.of(), "test")
                .of(List.of("test", "parser"), FULL_WEIGHT, NameForm.TYPE);

        assertAll(
                () -> assertThat(scoped.agreementByTopic().values())
                        .allSatisfy(agreed -> assertThat(agreed).doesNotContain("test")),
                () -> assertThat(scoped.agreementByTopic().values().stream().flatMap(Set::stream))
                        .as("the other words of the phrase still vote")
                        .contains("parser"));
    }

    @Test
    void theSameWordVotesWhereItDoesNotSpellTheSourceSet() {
        final PhraseTopics.Reading unscoped =
                topics.of(List.of("test", "parser"), FULL_WEIGHT, NameForm.TYPE);

        assertThat(unscoped.agreementByTopic().values().stream().flatMap(Set::stream))
                .contains("test");
    }
}
