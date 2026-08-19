package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class PublishedKeywordsTest {

    private final PublishedKeywords keywords = new PublishedKeywords();

    private static SkosConcept topic(final String concept, final String definition) {
        return new SkosConcept(concept, "A Topic", "", "subfields/1", "topic", "domains/3", definition, "");
    }

    @Test
    void statesOneConceptPerKeywordBeneathTheTopicThatPublishesIt() {
        final List<SkosConcept> read = keywords.in(List.of(
                topic("T1", "prose about the cluster | Word Sense Disambiguation, Text Mining")));
        assertThat(read).extracting(SkosConcept::prefLabel, SkosConcept::broader)
                .containsExactly(tuple("Word Sense Disambiguation", "T1"), tuple("Text Mining", "T1"));
    }

    @Test
    void keepsTheKeywordsOfEveryTopicThatStatesTheSameRun() {
        final List<SkosConcept> read = keywords.in(List.of(
                topic("T1", "prose | Text Mining"), topic("T2", "prose | Text Mining")));
        assertAll(
                () -> assertThat(read).hasSize(2),
                () -> assertThat(read).extracting(SkosConcept::broader).containsExactly("T1", "T2"),
                () -> assertThat(read).extracting(SkosConcept::concept).doesNotHaveDuplicates());
    }

    @Test
    void readsNoKeywordFromATopicStatingOnlyProse() {
        assertThat(keywords.in(List.of(topic("T1", "prose about the cluster and nothing else")))).isEmpty();
    }

    @Test
    void readsNoKeywordFromALevelThePublisherDescribesNotAtAll() {
        assertThat(keywords.in(List.of(topic("fields/17", "")))).isEmpty();
    }

    @Test
    void carriesTheDomainTheTopicRollsUpToSoAMatchCanBeReportedAtEitherLevel() {
        assertThat(keywords.in(List.of(topic("T1", "prose | Text Mining"))))
                .extracting(SkosConcept::module).containsExactly("domains/3");
    }
}
