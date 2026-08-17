package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ArxivTaxonomyTsvTest {

    private static final List<SkosConcept> CONCEPTS = List.of(new SkosConcept("cs.CL",
            "Computation and Language", "cmp-lg", "cs", "category", "grp_cs",
            "Covers natural language processing", ""));

    private static final String SOURCE = "https://example.invalid/definitions.py";

    private final String rendered = new ArxivTaxonomyTsv().render(CONCEPTS, SOURCE);

    @Test
    void statesWhereTheTaxonomyCameFromAndOnWhatTerms() {
        assertAll(
                () -> assertThat(rendered).contains("# Source: arXiv's own taxonomy definitions"),
                () -> assertThat(rendered).contains(SOURCE),
                () -> assertThat(rendered).contains("# Licence: MIT, Copyright (c) 2026 arXiv, Inc."));
    }

    @Test
    void namesTheColumnsTheRowsAreWrittenIn() {
        assertThat(rendered).contains("# Columns: " + SkosTsv.COLUMNS);
    }

    @Test
    void saysTheTaxonomyIsADistributionToCompareAgainstAndNotATermList() {
        assertThat(rendered).contains("not a vocabulary to match");
    }

    @Test
    void writesEverySubjectBelowTheHeader() {
        assertThat(rendered).endsWith(
                "cs.CL\tComputation and Language\tcmp-lg\tcs\tcategory\tgrp_cs\t"
                        + "Covers natural language processing\t\n");
    }
}
