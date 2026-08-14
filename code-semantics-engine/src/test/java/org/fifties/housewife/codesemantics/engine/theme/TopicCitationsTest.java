package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.Weights;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicCitationsTest {

    private static final HeadwordTopics NO_TOPICS = word -> Set.of();

    private static TopicCitations reading(final SenseDomains senses, final HeadwordTopics topics) {
        return new TopicCitations(senses, topics, Weights.defaults());
    }

    private static double massOf(final List<TopicVote> votes, final String topic) {
        return votes.stream().filter(vote -> topic.equals(vote.topic())).mapToDouble(TopicVote::mass).sum();
    }

    @Test
    void countsEachLabelledSenseAsAnObservationOfItsOwn() {
        final List<TopicVote> votes = reading(word -> List.of(Set.of("food"), Set.of("food", "chemistry")),
                NO_TOPICS).of("food");

        assertAll(
                () -> assertThat(massOf(votes, "food"))
                        .as("food observed in both senses, chemistry in one")
                        .isCloseTo(1.5, offset(1e-12)),
                () -> assertThat(massOf(votes, "chemistry")).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(votes.stream().mapToDouble(TopicVote::mass).sum())
                        .as("a word the resource read two senses of has said twice as much as one it read "
                                + "a single sense of, and the total is what carries that")
                        .isCloseTo(2.0, offset(1e-12)));
    }

    @Test
    void refusesToLetOneHeadwordLabelOutweighEverySenseTheDictionaryRead() {
        final List<TopicVote> votes = reading(
                word -> List.of(Set.of("baseball"), Set.of("university"), Set.of("mathematics"),
                        Set.of("number"), Set.of("music")),
                word -> Set.of("baseball")).of("first");
        final double total = votes.stream().mapToDouble(TopicVote::mass).sum();

        assertThat(massOf(votes, "baseball") / total)
                .as("this is `first` as the bundled resources actually read it. While each resource was "
                        + "normalised to one unit, Wiktionary's single label took the whole of that unit "
                        + "and baseball held 81% of a word written 116 times. One label is one observation")
                .isCloseTo(2.0 / 6.0, offset(1e-12));
    }

    @Test
    void dividesAHeadwordsOneObservationEvenlyWhereThereIsNoSenseStructureToRead() {
        final List<TopicVote> votes =
                reading(word -> List.of(), word -> Set.of("computing", "typography")).of("cursor");

        assertAll(
                () -> assertThat(massOf(votes, "computing")).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(massOf(votes, "typography")).isCloseTo(0.5, offset(1e-12)));
    }

    @Test
    void letsTwoAgreeingResourcesCorroborateOneAnother() {
        final List<TopicVote> votes =
                reading(word -> List.of(Set.of("computing")), word -> Set.of("computing")).of("cursor");

        assertAll(
                () -> assertThat(massOf(votes, "computing")).isCloseTo(2.0, offset(1e-12)),
                () -> assertThat(votes).extracting(TopicVote::source)
                        .containsExactlyInAnyOrder(EvidenceSource.WORDNET_DOMAIN,
                                EvidenceSource.WIKTIONARY_TOPIC));
    }

    @Test
    void ignoresASenseTheResourceLeftUnlabelled() {
        assertThat(massOf(reading(word -> List.of(Set.of(), Set.of("computing")), NO_TOPICS).of("cursor"),
                "computing"))
                .as("an unlabelled sense is not a label, and must not take a share of the unit")
                .isCloseTo(1.0, offset(1e-12));
    }

    @Test
    void abstainsForAWordNeitherResourceClaims() {
        assertThat(reading(word -> List.of(), NO_TOPICS).of("qzxfgh")).isEmpty();
    }

    @Test
    void scalesAResourcesWholeContributionByItsDeclaredWeight() {
        final TopicCitations halved = new TopicCitations(word -> List.of(Set.of("computing")), NO_TOPICS,
                Weights.builder().wordNetDomain(0.5).build());

        assertThat(massOf(halved.of("cursor"), "computing")).isCloseTo(0.5, offset(1e-12));
    }

    @Test
    void refusesAReadingThatWouldArgueAgainstATopic() {
        assertThatThrownBy(() -> new TopicVote("music", -0.5, EvidenceSource.WORDNET_DOMAIN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("commits mass");
    }

    @Test
    void readsTheBundledResourcesWhenAskedForThem() {
        assertThat(TopicCitations.fromClasspath().of("cursor"))
                .as("the wiring the diagnostic runs on is the wiring a test checks")
                .isNotEmpty();
    }
}
