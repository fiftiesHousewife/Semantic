package io.github.fiftieshousewife.codesemantics.engine.term;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.CsoTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;

import static org.assertj.core.api.Assertions.assertThat;

class TopicLabelDomainsTest {

    private static final TopicLabelDomains CSO_TOPICS = new TopicLabelDomains(
            CsoTopics.fromClasspath().concepts(), WordNetLexicon.fromClasspath());

    @Test
    void placesAWordUnderTheAreaWhoseTopicLabelCarriesIt() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("cryptography"))
                .flatExtracting(CountedSenseDomains::domains)
                .contains("computer security");
    }

    @Test
    void labelsATopicSittingDirectlyUnderARootWithItself() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("intelligence"))
                .flatExtracting(CountedSenseDomains::domains)
                .contains("artificial intelligence");
    }

    @Test
    void meetsAPluralInTheLabelAtItsDictionaryBaseForm() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("aberration")).isNotEmpty();
    }

    @Test
    void statesEachMatchedTopicAsOneUncountedSense() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("cryptography"))
                .isNotEmpty()
                .allSatisfy(sense -> assertThat(sense.uses()).isZero());
    }

    @Test
    void namesThePlacingTopicsOwnLabelOnEachSense() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("owl"))
                .flatExtracting(CountedSenseDomains::placingLabels)
                .containsExactlyInAnyOrder("web ontology language", "owl-s");
    }

    @Test
    void aRootHoldingTheMajorityOfTheSchemeLabelsNoArea() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("computer"))
                .flatExtracting(CountedSenseDomains::domains)
                .isNotEmpty()
                .doesNotContain("computer science");
    }

    @Test
    void aMinorityRootStillLabelsItselfAsAnArea() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("economics"))
                .flatExtracting(CountedSenseDomains::domains)
                .contains("economics");
    }

    @Test
    void yieldsNothingForAWordNoLabelCarries() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("qwertyuiop")).isEmpty();
    }
}
