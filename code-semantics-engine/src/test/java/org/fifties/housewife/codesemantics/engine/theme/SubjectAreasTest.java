package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SubjectAreasTest {

    private static final SkosConcept RETRIEVAL = new SkosConcept("cs.IR", "Information Retrieval", "", "cs",
            "category", "grp_cs", "Covers indexing, dictionaries, retrieval, content and analysis.");

    private static final SkosConcept UNREADABLE = new SkosConcept("zz.QQ", "Nothing", "", "cs", "category",
            "grp_cs", "");

    private final SubjectAreas areas = SubjectAreas.fromClasspath();

    @Test
    void readsASubjectsDescriptionIntoADistributionOverTheSameTopicsCodeIsReadAs() {
        final SubjectTopics read = areas.read(RETRIEVAL);
        assertAll(
                () -> assertThat(read.concept()).isEqualTo("cs.IR"),
                () -> assertThat(read.label()).isEqualTo("Information Retrieval"),
                () -> assertThat(read.group()).isEqualTo("grp_cs"),
                () -> assertThat(read.distribution().isEmpty()).isFalse(),
                () -> assertThat(read.distribution().shareByTopic().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, org.assertj.core.data
                        .Offset.offset(1e-9)));
    }

    @Test
    void placesASubjectUnderTopicsItsOwnDescriptionStates() {
        assertThat(areas.read(RETRIEVAL).distribution().topics())
                .as("a description of retrieval and dictionaries is read as something to do with them")
                .isNotEmpty();
    }

    @Test
    void leavesOutASubjectNothingCouldBeReadOutOfRatherThanCarryingAnEmptyDistribution() {
        assertThat(areas.of(List.of(RETRIEVAL, UNREADABLE))).extracting(SubjectTopics::concept)
                .containsExactly("cs.IR");
    }

    @Test
    void readsTheBundledTaxonomyItself() {
        assertThat(areas.published())
                .as("the bundled taxonomy is readable by the reading that has to place things against it")
                .hasSizeGreaterThan(100);
    }
}
