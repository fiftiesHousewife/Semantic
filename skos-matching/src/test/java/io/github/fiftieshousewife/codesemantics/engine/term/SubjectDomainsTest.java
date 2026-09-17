package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SubjectDomainsTest {

    private static final SubjectDomains ARXIV_CATEGORIES =
            new SubjectDomains(ArxivSubjects.fromClasspath(), WordNetLexicon.fromClasspath(), "category");

    /** The level above a category, which is where a scheme's coarsest statement sits. */
    private static final SubjectDomains ARXIV_ARCHIVES =
            new SubjectDomains(ArxivSubjects.fromClasspath(), WordNetLexicon.fromClasspath(), "archive");

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
    void placesAWordUnderTheArchiveWhoseCategoryProseCarriesIt() {
        assertThat(ARXIV_ARCHIVES.countedSenseDomainsOf("linguistics"))
                .flatExtracting(CountedSenseDomains::domains)
                .contains("Computer Science");
    }

    @Test
    void statesEachMatchedSubjectAsOneUncountedSense() {
        assertThat(ARXIV_ARCHIVES.countedSenseDomainsOf("linguistics"))
                .allSatisfy(sense -> assertAll(
                        () -> assertThat(sense.uses()).isZero(),
                        () -> assertThat(sense.domains()).isNotEmpty()));
    }

    @Test
    void namesThePlacingSubjectsOwnLabelOnEachSense() {
        assertThat(ARXIV_ARCHIVES.countedSenseDomainsOf("linguistics"))
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
