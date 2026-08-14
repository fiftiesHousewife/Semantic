package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;
import org.fifties.housewife.codesemantics.engine.theme.PermutationNull.Chance;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class QualifiedTopicsTest {

    private final TopicWitnesses witnesses = new TopicWitnesses();

    private static final TopicDistribution INTENSITY = TopicDistribution.of(
            java.util.Map.of("grammar", 0.5, "geology", 0.3, "music", 0.2));

    private final QualifiedTopics topics = new QualifiedTopics(witnesses);

    /** Two words and two resources, which is what a topic has to have before any of these bars apply. */
    private void corroborated(final String... topics) {
        for (final String topic : topics) {
            witnesses.record(topic, "first", "a phrase", "File.java:1", EvidenceSource.WORDNET_DOMAIN, 1.0);
            witnesses.record(topic, "second", "a phrase", "File.java:2", EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        }
    }


    /** Shares of a divergence sum to one across the topics contributing to it, and a fixture says so. */
    private static Contribution held(final String topic, final double shareOfDivergence,
                                     final double inScope, final double inRepository) {
        return new Contribution(topic, shareOfDivergence, shareOfDivergence, inScope, inRepository);
    }

    private static ScopeDivergence scope(final String name, final Contribution... contributions) {
        return new ScopeDivergence(name, 1.0, List.of(contributions),
                new Chance(0.5, 0.1, 0.4, 0.2, 0, 999));
    }

    @Test
    void takesOnlyWhatAScopeWritesMoreDenselyThanTheRepository() {
        corroborated("grammar", "music");
        final ScopeDivergence scope = scope("lexicon",
                held("grammar", 0.7, 0.30, 0.05), held("music", 0.3, 0.01, 0.20));

        assertThat(topics.concentratedIn(scope, 5)).containsExactly("grammar");
    }

    @Test
    void holdsAScopeToTheNumberAskedFor() {
        corroborated("grammar", "semantics", "networking");
        final ScopeDivergence scope = scope("lexicon",
                held("grammar", 0.40, 0.30, 0.05), held("semantics", 0.35, 0.20, 0.05),
                held("networking", 0.25, 0.10, 0.05));

        assertThat(topics.concentratedIn(scope, 1)).containsExactly("grammar");
    }

    @Test
    void ranksATopicDistinguishingSeveralScopesAboveOneDistinguishingASingleScopeMoreSharply() {
        corroborated("grammar", "geology");
        final List<ScopeDivergence> qualified = List.of(
                scope("one", held("grammar", 0.35, 0.30, 0.05), held("geology", 0.45, 0.30, 0.05),
                        held("music", 0.20, 0.01, 0.30)),
                scope("two", held("grammar", 0.60, 0.30, 0.05), held("music", 0.40, 0.01, 0.30)));

        assertThat(topics.across(qualified, INTENSITY)).containsExactly("grammar", "geology");
    }

    @Test
    void refusesATopicOneWordCarriesAMajorityOf() {
        corroborated("grammar");
        witnesses.record("dentistry", "crown", "a phrase", "F.java:1", EvidenceSource.WORDNET_DOMAIN, 9.0);
        witnesses.record("dentistry", "root", "a phrase", "F.java:2", EvidenceSource.WORDNET_DOMAIN, 1.0);
        final ScopeDivergence scope = scope("lexicon",
                held("dentistry", 0.50, 0.40, 0.01), held("grammar", 0.40, 0.30, 0.05),
                held("music", 0.10, 0.01, 0.30));

        assertAll(
                () -> assertThat(topics.concentratedIn(scope, 5))
                        .as("a topic nine tenths of which is one word is that word's opinion")
                        .containsExactly("grammar"),
                () -> assertThat(topics.across(List.of(scope), INTENSITY)).containsExactly("grammar"));
    }

    @Test
    void refusesATopicHoldingNoMoreOfADivergenceThanAnEvenSpreadWould() {
        corroborated("grammar", "geology", "music");
        final ScopeDivergence scope = scope("lexicon",
                held("grammar", 0.40, 0.30, 0.05), held("geology", 0.32, 0.20, 0.05),
                held("music", 0.28, 0.10, 0.05));

        assertThat(topics.concentratedIn(scope, 5))
                .as("a third each would say nothing about why the scope differs; only grammar says more")
                .containsExactly("grammar");
    }


    @Test
    void refusesATopicNoWordWasEverRecordedFor() {
        final ScopeDivergence scope = scope("lexicon", held("astrology", 0.9, 0.40, 0.01));

        assertThat(topics.concentratedIn(scope, 5)).isEmpty();
    }

    @Test
    void namesNoTopicFromAScopeNothingQualified() {
        assertAll(
                () -> assertThat(topics.across(List.of(), INTENSITY)).isEmpty(),
                () -> assertThat(topics.concentratedIn(scope("empty"), 5)).isEmpty());
    }
}
