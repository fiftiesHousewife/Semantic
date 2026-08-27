package io.github.fiftieshousewife.codesemantics.engine.term;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.bi.lexicon.CsoTopics;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;

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
    void yieldsNothingForAWordNoLabelCarries() {
        assertThat(CSO_TOPICS.countedSenseDomainsOf("qwertyuiop")).isEmpty();
    }
}
