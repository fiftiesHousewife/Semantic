package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MergedEntriesTest {

    private static final ArxivEntry COLLAPSED_ARCHIVE = new ArxivEntry("hep-th", "archive",
            "High Energy Physics - Theory", "", "grp_physics", "", true, false);

    private static final ArxivEntry ITS_ONLY_CATEGORY = new ArxivEntry("hep-th", "category",
            "High Energy Physics - Theory", "", "hep-th", "Formal aspects of quantum field theory",
            true, false);

    private static final ArxivEntry LIVE_ARCHIVE = new ArxivEntry("astro-ph", "archive", "Astrophysics",
            "", "grp_physics", "", true, false);

    private static final ArxivEntry ITS_RETIRED_CATEGORY = new ArxivEntry("astro-ph", "category",
            "Astrophysics", "", "astro-ph", "", false, false);

    private final MergedEntries merged = new MergedEntries();

    @Test
    void statesOneSubjectWhereTheSourceGaveTwoRecordsOneIdentifier() {
        assertThat(merged.in(List.of(COLLAPSED_ARCHIVE, ITS_ONLY_CATEGORY))).hasSize(1);
    }

    @Test
    void takesTheDescribingRecordWhereBothAreLive() {
        final ArxivEntry entry = merged.in(List.of(COLLAPSED_ARCHIVE, ITS_ONLY_CATEGORY)).getFirst();
        assertAll(
                () -> assertThat(entry.kind()).isEqualTo("category"),
                () -> assertThat(entry.description()).isEqualTo("Formal aspects of quantum field theory"));
    }

    @Test
    void takesTheLiveRecordEvenThoughTheRetiredOneWouldHaveBeenReadFirst() {
        final ArxivEntry entry = merged.in(List.of(LIVE_ARCHIVE, ITS_RETIRED_CATEGORY)).getFirst();
        assertAll(
                () -> assertThat(entry.kind()).isEqualTo("archive"),
                () -> assertThat(entry.published()).isTrue(),
                () -> assertThat(entry.broader()).isEqualTo("grp_physics"));
    }

    @Test
    void refusesToReadAConceptStatedInsideItselfAsBroaderThanItself() {
        assertThat(merged.in(List.of(COLLAPSED_ARCHIVE, ITS_ONLY_CATEGORY)).getFirst().broader())
                .isEqualTo("grp_physics");
    }

    @Test
    void leavesAnIdentifierStatedOnceExactlyAsItWasStated() {
        assertThat(merged.in(List.of(LIVE_ARCHIVE))).containsExactly(LIVE_ARCHIVE);
    }
}
