package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ArxivSubjectsTest {

    private final ArxivSubjects subjects = ArxivSubjects.fromClasspath();

    @Test
    void carriesOnlyTheSubjectsArxivStatesAsLive() {
        assertAll(
                () -> assertThat(subjects.concepts()).hasSize(174),
                () -> assertThat(subjects.concepts()).extracting(SkosConcept::concept)
                        .doesNotContain("cmp-lg", "grp_test"));
    }

    @Test
    void offersOnlyTheSubjectsArxivDescribesAsSomethingToCompareAgainst() {
        assertAll(
                () -> assertThat(subjects.described()).hasSize(152),
                () -> assertThat(subjects.described()).allMatch(subject -> "category".equals(subject.kind())),
                () -> assertThat(subjects.described()).allMatch(subject -> !subject.definition().isBlank()));
    }

    /**
     * A reading that pools several of these joins their descriptions, so the order they arrive in is part of
     * the text it reads. An immutable map randomises its iteration order once per JVM, which made the
     * repository's own archive-level placement differ between two runs over one unchanged tree — Mathematics
     * at 0.3660 in one and 0.5306 in the next, changing which field the reading reported.
     */
    @Test
    void statesItsSubjectsInTheOrderThePublisherStatesThem() {
        assertThat(subjects.described()).extracting(SkosConcept::concept)
                .containsExactlyElementsOf(SkosRows.in("arxiv-taxonomy.tsv").stream()
                        .filter(row -> "category".equals(row.kind()))
                        .filter(row -> !row.definition().isBlank())
                        .map(SkosConcept::concept)
                        .toList());
    }

    @Test
    void describesTheSubjectThisLibraryIsAbout() {
        assertAll(
                () -> assertThat(subjects.conceptOf("cs.IR").prefLabel()).isEqualTo("Information Retrieval"),
                () -> assertThat(subjects.conceptOf("cs.IR").definition())
                        .contains("indexing, dictionaries, retrieval"),
                () -> assertThat(subjects.conceptOf("cs.CL").definition())
                        .contains("natural language processing"));
    }

    @Test
    void takesTheAliasArxivPublishesAsTheOtherLabelRatherThanGroupingByHand() {
        assertAll(
                () -> assertThat(subjects.conceptOf("cs.CL").altLabel()).isEqualTo("cmp-lg"),
                () -> assertThat(subjects.conceptOf("math.IT").altLabel()).isEqualTo("cs.IT"));
    }

    @Test
    void nestsASubjectInItsArchiveAndRollsItUpToItsGroup() {
        assertAll(
                () -> assertThat(subjects.conceptOf("math.ST").broader()).isEqualTo("math"),
                () -> assertThat(subjects.conceptOf("math.ST").module()).isEqualTo("grp_math"),
                () -> assertThat(subjects.groups()).contains("grp_cs", "grp_math", "grp_stat"));
    }

    @Test
    void statesEverySubjectItNamesAsBroaderThanAnother() {
        assertThat(subjects.concepts().stream().map(SkosConcept::concept).toList())
                .containsAll(subjects.concepts().stream().map(SkosConcept::broader)
                        .filter(broader -> !broader.isEmpty()).toList());
    }

    @Test
    void refusesASubjectTheTaxonomyDoesNotStateRatherThanAnsweringEmptily() {
        assertThatThrownBy(() -> subjects.conceptOf("cs.QQ"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("cs.QQ");
    }
}
