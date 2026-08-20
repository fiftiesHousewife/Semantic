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

    private static final List<String> AMBIGUOUS = List.of("signature");

    private static final Map<String, Double> ONE_WORD = Map.of("signature", 1.0);

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
    void promotesTheTopicTheFileIsAboutAndKeepsEveryOtherOneTheWordsNamed() {
        final PhraseTopics.Reading unconditioned = topics.of(AMBIGUOUS, ONE_WORD, NameForm.TYPE);
        final String read = unconditioned.shareByTopic().keySet().stream().sorted().findFirst().orElseThrow();

        final PhraseTopics.Reading conditioned = topics
                .under(TopicDistribution.of(Map.of(read, 1.0), 0.0), Set.of(), "")
                .of(AMBIGUOUS, ONE_WORD, NameForm.TYPE);

        assertAll(
                () -> assertThat(unconditioned.shareByTopic()).as("the word is read as several subjects")
                        .hasSizeGreaterThan(1),
                () -> assertThat(conditioned.shareByTopic().keySet())
                        .as("context promotes and never removes")
                        .isEqualTo(unconditioned.shareByTopic().keySet()),
                () -> assertThat(conditioned.shareByTopic().get(read))
                        .isGreaterThan(unconditioned.shareByTopic().get(read)),
                () -> assertThat(conditioned.refused()).isEmpty());
    }

    @Test
    void refusesNothingWhereNoRuleTookATopicOut() {
        assertThat(topics.of(AMBIGUOUS, ONE_WORD, NameForm.TYPE).refused()).isEmpty();
    }

    @Test
    void theSameWordVotesWhereItDoesNotSpellTheSourceSet() {
        final PhraseTopics.Reading unscoped =
                topics.of(List.of("test", "parser"), FULL_WEIGHT, NameForm.TYPE);

        assertThat(unscoped.agreementByTopic().values().stream().flatMap(Set::stream))
                .contains("test");
    }
}
