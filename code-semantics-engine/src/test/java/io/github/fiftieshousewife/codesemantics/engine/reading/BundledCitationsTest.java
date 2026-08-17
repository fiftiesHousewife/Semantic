package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSourceType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BundledCitationsTest {

    private final List<WordCitation> citations = BundledCitations.fromClasspath();

    private final CitedWords cited = new CitedWords(citations);

    @Test
    void citesEveryBundledResourceUnderItsOwnEvidenceSource() {
        assertAll(
                () -> assertThat(citations).extracting(WordCitation::source).doesNotHaveDuplicates(),
                () -> assertThat(citations).extracting(citation -> citation.source().type())
                        .containsOnly(EvidenceSourceType.LEXICON, EvidenceSourceType.CATALOGUE));
    }

    @Test
    void readsAnOrdinaryEnglishWordThroughSeveralResourcesAtOnce() {
        assertThat(cited.citing("evidence"))
                .contains(EvidenceSource.WORD_FREQUENCY, EvidenceSource.WORDNET_SENSE);
    }

    @Test
    void abstainsForATokenNoResourceCarries() {
        assertThat(cited.citing("qzxfgh")).isEmpty();
    }

    @Test
    void readsAQueryLanguageFunctionNameThroughTheCatalogueThatPublishesIt() {
        assertThat(cited.citing("argmax")).contains(EvidenceSource.QUERY_LANGUAGE_FUNCTION);
    }

    @Test
    void readsASurnameThroughTheRegistryThatRecordsItHoweverOrdinaryItReads() {
        assertThat(cited.citing("ray"))
                .as("the registry's ambiguity is preserved, which is why the report names the resource")
                .contains(EvidenceSource.WIKIDATA_NAME);
    }
}
