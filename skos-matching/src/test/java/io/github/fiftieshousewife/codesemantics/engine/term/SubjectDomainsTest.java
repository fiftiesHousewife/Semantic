package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SubjectDomainsTest {

    private static final SubjectDomains ARXIV_CATEGORIES =
            new SubjectDomains(ArxivSubjects.fromClasspath(), WordNetLexicon.fromClasspath(), "category");

    private static final SubjectDomains OPENALEX_SUBFIELDS =
            new SubjectDomains(OpenAlexTopics.fromClasspath(), WordNetLexicon.fromClasspath(), "subfield");

    @Test
    void placesAWordUnderTheCategoryWhoseDescriptionCarriesIt() {
        final List<CountedSenseDomains> senses = ARXIV_CATEGORIES.countedSenseDomainsOf("linguistics");

        assertAll(
                () -> assertThat(senses).isNotEmpty(),
                () -> assertThat(senses)
                        .flatExtracting(CountedSenseDomains::domains)
                        .contains("Computation and Language"));
    }

    @Test
    void meetsAPluralInThePublishersProseAtItsDictionaryBaseForm() {
        assertThat(ARXIV_CATEGORIES.countedSenseDomainsOf("comet"))
                .flatExtracting(CountedSenseDomains::domains)
                .contains("Earth and Planetary Astrophysics");
    }

    @Test
    void placesAWordUnderTheSubfieldWhoseTopicKeywordsCarryIt() {
        assertThat(OPENALEX_SUBFIELDS.countedSenseDomainsOf("innovation"))
                .flatExtracting(CountedSenseDomains::domains)
                .contains("Strategy and Management");
    }

    @Test
    void statesEachMatchedSubjectAsOneUncountedSense() {
        assertThat(OPENALEX_SUBFIELDS.countedSenseDomainsOf("innovation"))
                .allSatisfy(sense -> assertAll(
                        () -> assertThat(sense.uses()).isZero(),
                        () -> assertThat(sense.domains()).isNotEmpty()));
    }

    @Test
    void namesThePlacingSubjectsOwnLabelOnEachSense() {
        assertThat(OPENALEX_SUBFIELDS.countedSenseDomainsOf("innovation"))
                .isNotEmpty()
                .allSatisfy(sense -> assertThat(sense.placingLabels())
                        .hasSize(1)
                        .allSatisfy(label -> assertThat(label).isNotBlank()));
    }

    @Test
    void yieldsNothingForAWordNoAccountCarries() {
        assertThat(ARXIV_CATEGORIES.countedSenseDomainsOf("qwertyuiop")).isEmpty();
    }
}
