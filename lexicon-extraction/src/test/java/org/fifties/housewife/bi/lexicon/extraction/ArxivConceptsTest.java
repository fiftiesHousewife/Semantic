package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArxivConceptsTest {

    private static final ArxivEntry GROUP = new ArxivEntry("grp_cs", "group", "Computer Science", "", "",
            "", true, false);

    private static final ArxivEntry ARCHIVE = new ArxivEntry("cs", "archive", "Computer Science", "",
            "grp_cs", "", true, false);

    private static final ArxivEntry CATEGORY = new ArxivEntry("cs.CL", "category",
            "Computation and Language", "cmp-lg", "cs", "Covers natural language processing", true, false);

    private static final ArxivEntry SUBSUMED = new ArxivEntry("cmp-lg", "archive",
            "Computation and Language", "cs.CL", "grp_cs", "", false, false);

    private static final ArxivEntry TEST_GROUP = new ArxivEntry("grp_test", "group", "Test", "", "", "",
            true, true);

    private final List<SkosConcept> concepts =
            new ArxivConcepts().in(List.of(GROUP, ARCHIVE, CATEGORY, SUBSUMED, TEST_GROUP));

    @Test
    void readsASubjectAsArxivIdentifiesNamesAndDescribesIt() {
        assertThat(concepts).contains(new SkosConcept("cs.CL", "Computation and Language", "cmp-lg", "cs",
                "category", "grp_cs", "Covers natural language processing"));
    }

    @Test
    void rollsASubjectUpToTheGroupTheModuleNestsItIn() {
        assertThat(concepts).extracting(SkosConcept::module).containsOnly("grp_cs");
    }

    @Test
    void dropsWhatArxivDoesNotStateAsLive() {
        assertThat(concepts).extracting(SkosConcept::concept)
                .containsExactly("grp_cs", "cs", "cs.CL")
                .doesNotContain("cmp-lg", "grp_test");
    }
}
