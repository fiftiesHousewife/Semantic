package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BianConceptsTest {

    private final BianConcepts concepts = new BianConcepts();

    private static ContentDigest.Member specification(final String domain, final String body) {
        return new ContentDigest.Member(domain + "/" + domain + "Specification.csv",
                body.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void readsADomainsRowFromItsSpecificationsOwnFields() {
        final List<SkosConcept> read = concepts.in(List.of(specification("ACHFulfillment", """
                "Business Area"\tOperations
                "Business Domain"\tClearing And Settlement
                "Service Domain"\tACH Fulfillment
                "Role Definition"\t"Handles the operational interface."
                "Example of use"\t"A payment is processed."
                """)));

        final SkosConcept domain = read.getFirst();
        assertAll(
                () -> assertThat(domain.concept()).isEqualTo("ACHFulfillment"),
                () -> assertThat(domain.prefLabel()).isEqualTo("ACH Fulfillment"),
                () -> assertThat(domain.broader()).isEqualTo("Clearing And Settlement"),
                () -> assertThat(domain.kind()).isEqualTo("service-domain"),
                () -> assertThat(domain.module()).isEqualTo("Operations"),
                () -> assertThat(domain.definition())
                        .isEqualTo("Handles the operational interface. A payment is processed."));
    }

    @Test
    void aDomainStatingNoRoleDefinitionIsNotCarried() {
        final List<SkosConcept> read = concepts.in(List.of(
                specification("SalesPlanning", "\"Service Domain\"\tSales Planning\n"),
                specification("Kept", "\"Role Definition\"\tStated.\n")));

        assertThat(read).extracting(SkosConcept::concept).containsExactly("Kept");
    }

    @Test
    void aDomainStatingNoExampleOfUseKeepsTheRoleDefinitionAlone() {
        final List<SkosConcept> read = concepts.in(List.of(
                specification("Kept", "\"Role Definition\"\t\"Stated purpose.\"\n")));

        assertThat(read.getFirst().definition()).isEqualTo("Stated purpose.");
    }
}
