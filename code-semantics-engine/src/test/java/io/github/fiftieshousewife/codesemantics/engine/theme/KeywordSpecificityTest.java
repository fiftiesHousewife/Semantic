package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class KeywordSpecificityTest {

    private final KeywordSpecificity specificity = KeywordSpecificity.fromClasspath();

    private static SkosConcept keyword(final String label, final String topic) {
        return new SkosConcept(topic + "#" + label, label, "", topic, "keyword", "domains/3", "", "");
    }

    @Test
    void weighsAPublishedRunTheSameWayItWeighsTheWordsARepositoryDeclares() {
        assertThat(specificity.of(keyword("Word Sense Disambiguation", "T1")))
                .isGreaterThan(specificity.of(keyword("Language", "T1")));
    }

    @Test
    void boundsWhatOneKeywordNarrowsAtOne() {
        assertThat(specificity.of(keyword("Word Sense Disambiguation", "T1"))).isBetween(0.0, 1.0);
    }

    @Test
    void sumsWhatEveryKeywordOfATopicNarrowsSoAShareCanBeTakenOverIt() {
        final Map<String, Double> byTopic = specificity.byTopic(List.of(
                keyword("Dictionaries", "T1"), keyword("Corpus", "T1"), keyword("Ontology", "T2")));
        assertAll(
                () -> assertThat(byTopic).containsOnlyKeys("T1", "T2"),
                () -> assertThat(byTopic.get("T1")).isCloseTo(
                        specificity.of(keyword("Dictionaries", "T1"))
                                + specificity.of(keyword("Corpus", "T1")), within(1.0e-9)));
    }

    @Test
    void weighsATopicPublishingMoreKeywordsAtMoreThanOnePublishingFewer() {
        final Map<String, Double> byTopic = specificity.byTopic(List.of(
                keyword("Dictionaries", "T1"), keyword("Corpus", "T1"), keyword("Meaning", "T1"),
                keyword("Dictionaries", "T2")));
        assertThat(byTopic.get("T1")).isGreaterThan(byTopic.get("T2"));
    }
}
