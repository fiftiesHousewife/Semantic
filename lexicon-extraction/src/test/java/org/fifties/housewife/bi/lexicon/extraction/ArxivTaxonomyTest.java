package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ArxivTaxonomyTest {

    private static final String MODULE = """
            ARCHIVES: Dict[str, Archive] = {
                "grp_cs":Group(
                        id="grp_cs",
                        full_name="Computer Science",
                        is_active=True,
                        start_year=1993,
                        default_archive="cs",
                        ),
                "grp_test":Group(
                        id="grp_test",
                        full_name="Test",
                        is_active=True,
                        is_test=True
                        ),
                "cs":Archive(
                        id="cs",
                        full_name="Computer Science",
                        is_active=True,
                        in_group="grp_cs",
                        start_date=date(1998, 1, 1),
                        ),
                "cmp-lg":Archive(
                        id="cmp-lg",
                        full_name="Computation and Language",
                        is_active=False,
                        alt_name="cs.CL",
                        in_group="grp_cs",
                        ),
                "cs.CL": Category(
                        id="cs.CL",
                        full_name="Computation and Language",
                        is_active=True,
                        alt_name="cmp-lg",
                        in_archive="cs",
                        is_general=False,
                        description="Covers natural language processing (broadly construed).",
                        ),
                "cs.SI": Category(
                        id="cs.SI",
                        full_name="Signal Processing",
                        is_active=True,
                        in_archive="cs",
                        description='Theory, algorithms and applications of signal analysis',
                        ),
            }
            """;

    private final List<ArxivEntry> entries = new ArxivTaxonomy().in(MODULE);

    @Test
    void readsEveryGroupArchiveAndCategoryTheModuleStates() {
        assertThat(entries).extracting(ArxivEntry::id)
                .containsExactly("grp_cs", "grp_test", "cs", "cmp-lg", "cs.CL", "cs.SI");
    }

    @Test
    void readsASubjectAsArxivNamesAndDescribesIt() {
        assertAll(
                () -> assertThat(entry("cs.CL").kind()).isEqualTo("category"),
                () -> assertThat(entry("cs.CL").name()).isEqualTo("Computation and Language"),
                () -> assertThat(entry("cs.CL").description())
                        .isEqualTo("Covers natural language processing (broadly construed)."));
    }

    @Test
    void readsAValueInWhateverQuotingTheModuleWrappedItIn() {
        assertThat(entry("cs.SI").description())
                .isEqualTo("Theory, algorithms and applications of signal analysis");
    }

    @Test
    void takesTheAliasArxivPublishesBesideANameAsTheOtherLabel() {
        assertThat(entry("cs.CL").alias()).isEqualTo("cmp-lg");
    }

    @Test
    void nestsACategoryInItsArchiveAnArchiveInItsGroupAndAGroupInNothing() {
        assertAll(
                () -> assertThat(entry("cs.CL").broader()).isEqualTo("cs"),
                () -> assertThat(entry("cs").broader()).isEqualTo("grp_cs"),
                () -> assertThat(entry("grp_cs").broader()).isEmpty());
    }

    @Test
    void readsWhatArxivStatesAsLiveRatherThanJudgingItHere() {
        assertAll(
                () -> assertThat(entry("cs.CL").published()).isTrue(),
                () -> assertThat(entry("cmp-lg").published()).isFalse(),
                () -> assertThat(entry("grp_test").published()).isFalse());
    }

    @Test
    void refusesAModuleStatingNoTaxonomyRatherThanReadingItAsEmpty() {
        assertThatThrownBy(() -> new ArxivTaxonomy().in("ARCHIVES: Dict[str, Archive] = {}"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("no Group, Archive or Category");
    }

    private ArxivEntry entry(final String id) {
        return entries.stream().filter(entry -> id.equals(entry.id())).findFirst().orElseThrow();
    }
}
