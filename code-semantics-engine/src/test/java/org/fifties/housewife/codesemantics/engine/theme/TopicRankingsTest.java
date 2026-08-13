package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicRankingsTest {

    private static final FileTopics BIG = new FileTopics("Big.java", 400,
            Map.of("linguistics", 9.0, "music", 1.0), Map.of("linguistics", 9.0, "music", 0.5),
            Map.of("linguistics", 90, "music", 10), 0, 100);

    private static final FileTopics SMALL = new FileTopics("Small.java", 20,
            Map.of("music", 5.0), Map.of("music", 2.5), Map.of("music", 5), 0, 5);

    private final TopicWitnesses witnesses = new TopicWitnesses();

    private List<TopicRanking> rankings() {
        witnesses.record("linguistics", "word", "Big.java:1", EvidenceSource.WORDNET_DOMAIN, 1.0);
        return new TopicRankings(List.of(BIG, SMALL),
                Map.of("Big.java", new ValueShare<>("linguistics", 0.9, 9.0),
                        "Small.java", new ValueShare<>("music", 1.0, 5.0)), witnesses)
                .of(TopicDistribution.meanOf(List.of(BIG.distribution(), SMALL.distribution())));
    }

    private static TopicRanking of(final List<TopicRanking> rankings, final String topic) {
        return rankings.stream().filter(ranking -> topic.equals(ranking.topic())).findFirst().orElseThrow();
    }

    @Test
    void countsTheFilesATopicAppearsInAndTheFilesItLeads() {
        final List<TopicRanking> rankings = rankings();

        assertAll(
                () -> assertThat(of(rankings, "music").files()).isEqualTo(2),
                () -> assertThat(of(rankings, "music").dominantFiles()).isOne(),
                () -> assertThat(of(rankings, "linguistics").files()).isOne(),
                () -> assertThat(of(rankings, "linguistics").dominantFiles()).isOne());
    }

    @Test
    void countsTheLinesOfTheFilesATopicLeadsAndNotTheLinesItMerelyAppearsIn() {
        final List<TopicRanking> rankings = rankings();

        assertAll(
                () -> assertThat(of(rankings, "linguistics").linesDominated()).isEqualTo(400),
                () -> assertThat(of(rankings, "music").linesDominated()).isEqualTo(20),
                () -> assertThat(of(rankings, "music").lineShare(420)).isEqualTo(20.0 / 420.0));
    }

    @Test
    void addsUpEveryReferenceMadeToATopicAcrossTheFiles() {
        assertThat(of(rankings(), "music").references()).isEqualTo(15);
    }

    @Test
    void ranksTheTopicsByIntensityAndLetsAReaderReorderThemByAnyOtherMeasure() {
        final List<TopicRanking> rankings = rankings();

        assertAll(
                () -> assertThat(rankings).first().extracting(TopicRanking::topic)
                        .as("music holds half of one file and all of the other")
                        .isEqualTo("music"),
                () -> assertThat(TopicRanking.by(rankings,
                        Comparator.comparingInt(TopicRanking::linesDominated)))
                        .first().extracting(TopicRanking::topic)
                        .isEqualTo("linguistics"));
    }

    @Test
    void namesHowManyDistinctWordsCarriedATopic() {
        assertThat(of(rankings(), "linguistics").wordsBehind()).isOne();
    }

    @Test
    void readsNoLineShareFromARepositoryWithNoLines() {
        assertThat(of(rankings(), "music").lineShare(0)).isZero();
    }
}
