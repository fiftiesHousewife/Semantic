package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;
import org.fifties.housewife.codesemantics.engine.theme.PermutationNull.Chance;
import org.fifties.housewife.codesemantics.engine.theme.ScopeDivergence;
import org.fifties.housewife.codesemantics.engine.theme.TopicWitnesses;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class QualifiedTopicsTest {

    private final TopicWitnesses witnesses = new TopicWitnesses();

    private final QualifiedTopics topics = new QualifiedTopics(witnesses);

    private void carriedByTwoWords(final String... topics) {
        for (final String topic : topics) {
            witnesses.record(topic, "first", "a phrase", "File.java:1", EvidenceSource.WORDNET_DOMAIN, 1.0);
            witnesses.record(topic, "second", "a phrase", "File.java:2", EvidenceSource.WORDNET_DOMAIN, 1.0);
        }
    }

    private static Contribution held(final String topic, final double bits, final double inScope,
                                     final double inRepository) {
        return new Contribution(topic, bits, bits, inScope, inRepository);
    }

    private static ScopeDivergence scope(final String name, final Contribution... contributions) {
        return new ScopeDivergence(name, 1.0, List.of(contributions),
                new Chance(0.5, 0.1, 0.4, 0.2, 0, 999));
    }

    @Test
    void takesOnlyWhatAScopeWritesMoreDenselyThanTheRepository() {
        carriedByTwoWords("grammar", "music");
        final ScopeDivergence scope = scope("lexicon",
                held("grammar", 0.4, 0.30, 0.05), held("music", 0.3, 0.01, 0.20));

        assertThat(topics.concentratedIn(scope, 5)).containsExactly("grammar");
    }

    @Test
    void holdsAScopeToTheNumberAskedFor() {
        carriedByTwoWords("grammar", "semantics", "networking");
        final ScopeDivergence scope = scope("lexicon",
                held("grammar", 0.4, 0.30, 0.05), held("semantics", 0.3, 0.20, 0.05),
                held("networking", 0.2, 0.10, 0.05));

        assertThat(topics.concentratedIn(scope, 2)).containsExactly("grammar", "semantics");
    }

    @Test
    void ranksATopicDistinguishingSeveralScopesAboveOneDistinguishingASingleScopeMoreSharply() {
        carriedByTwoWords("grammar", "geology");
        final List<ScopeDivergence> qualified = List.of(
                scope("one", held("grammar", 0.3, 0.30, 0.05), held("geology", 0.5, 0.30, 0.05)),
                scope("two", held("grammar", 0.3, 0.30, 0.05)));

        assertThat(topics.across(qualified)).containsExactly("grammar", "geology");
    }

    @Test
    void refusesATopicOneWordCarriesAMajorityOf() {
        carriedByTwoWords("grammar");
        witnesses.record("dentistry", "crown", "a phrase", "F.java:1", EvidenceSource.WORDNET_DOMAIN, 9.0);
        witnesses.record("dentistry", "root", "a phrase", "F.java:2", EvidenceSource.WORDNET_DOMAIN, 1.0);
        final ScopeDivergence scope = scope("lexicon",
                held("dentistry", 0.9, 0.40, 0.01), held("grammar", 0.1, 0.30, 0.05));

        assertAll(
                () -> assertThat(topics.concentratedIn(scope, 5))
                        .as("a topic nine tenths of which is one word is that word's opinion")
                        .containsExactly("grammar"),
                () -> assertThat(topics.across(List.of(scope))).containsExactly("grammar"));
    }

    @Test
    void refusesATopicNoWordWasEverRecordedFor() {
        final ScopeDivergence scope = scope("lexicon", held("astrology", 0.9, 0.40, 0.01));

        assertThat(topics.concentratedIn(scope, 5)).isEmpty();
    }

    @Test
    void namesNoTopicFromAScopeNothingQualified() {
        assertAll(
                () -> assertThat(topics.across(List.of())).isEmpty(),
                () -> assertThat(topics.concentratedIn(scope("empty"), 5)).isEmpty());
    }
}
