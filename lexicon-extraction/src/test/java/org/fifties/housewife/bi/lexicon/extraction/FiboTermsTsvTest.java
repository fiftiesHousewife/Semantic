package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FiboTermsTsvTest {

    private static final List<SkosConcept> CONCEPTS = List.of(new SkosConcept(
            "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/InterestRateSwap",
            "InterestRateSwap", "", "InterestRateDerivative", "class", "DER",
            "swap whose underlier is an interest rate", "ISDA 2021 definitions"));

    private static final String SOURCE = "https://example.invalid/fibo/tree/0123456789";

    private final String rendered = new FiboTermsTsv().render(CONCEPTS, SOURCE, 106, "abc123");

    @Test
    void statesWhereItCameFromAndOnWhatTerms() {
        assertAll(
                () -> assertThat(rendered).contains("# Source: the FIBO repository at", SOURCE),
                () -> assertThat(rendered).contains("# Licence: MIT"),
                () -> assertThat(rendered).contains("EDM Council"));
    }

    @Test
    void statesWhichOntologiesWereReadAndWhoDecidedThat() {
        assertAll(
                () -> assertThat(rendered).contains("AboutFIBOProd-TBoxOnly.rdf"),
                () -> assertThat(rendered).contains("106"),
                () -> assertThat(rendered)
                        .as("a reader has to be able to tell a publisher's selection from ours")
                        .contains("Walking a directory instead would make this project's own selection"));
    }

    @Test
    void saysOutrightThatTheSetDigestIsOursRatherThanThePublishers() {
        assertAll(
                () -> assertThat(rendered).contains("abc123"),
                () -> assertThat(rendered).contains("OURS and not the publisher's"));
    }

    @Test
    void namesWhatTheShapeCannotCarryRatherThanLeavingItToBeNoticed() {
        assertThat(rendered).contains("owl:disjointWith", "owl:equivalentClass", "rdfs:seeAlso");
    }

    @Test
    void namesTheColumnsItWrites() {
        assertThat(rendered).contains(SkosTsv.COLUMNS);
    }

    @Test
    void writesEveryConceptBelowTheHeader() {
        assertThat(rendered).endsWith(
                "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/InterestRateSwap\t"
                        + "InterestRateSwap\t\tInterestRateDerivative\tclass\tDER\t"
                        + "swap whose underlier is an interest rate\tISDA 2021 definitions\n");
    }
}
