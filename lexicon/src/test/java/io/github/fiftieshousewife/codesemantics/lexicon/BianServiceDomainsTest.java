package io.github.fiftieshousewife.codesemantics.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BianServiceDomainsTest {

    private final BianServiceDomains domains = BianServiceDomains.fromClasspath();

    @Test
    void namesTheSchemeItPlacesAgainstAndCarriesEveryServiceDomainTheLandscapeStates() {
        assertAll(
                () -> assertThat(domains.scheme()).isEqualTo("BIAN"),
                () -> assertThat(domains.concepts()).hasSize(319),
                () -> assertThat(domains.concepts())
                        .allMatch(domain -> "service-domain".equals(domain.kind())));
    }

    @Test
    void placesAgainstEveryDomainBecauseTheLandscapeStatesARoleDefinitionForEachOne() {
        assertAll(
                () -> assertThat(domains.described()).hasSameSizeAs(domains.concepts()),
                () -> assertThat(domains.described()).extracting(SkosConcept::definition)
                        .doesNotContain(""),
                () -> assertThat(domains.described()).extracting(SkosConcept::prefLabel)
                        .contains("Card Capture", "Point of Service", "Savings Account"));
    }

    @Test
    void poolsUnderTheBusinessDomainTheLandscapeStatesAboveEachOne() {
        assertAll(
                () -> assertThat(domains.described()).extracting(SkosConcept::broader)
                        .doesNotContain(""),
                () -> assertThat(domains.conceptOf("CardCapture").prefLabel())
                        .isEqualTo("Card Capture"),
                () -> assertThat(domains.conceptOf("CardCapture").broader())
                        .isEqualTo("Cards"));
    }

    @Test
    void answersForABusinessDomainTooBecauseTheLandscapeStatesThatLevelAsAColumn() {
        assertAll(
                () -> assertThat(domains.conceptOf("Cards").prefLabel()).isEqualTo("Cards"),
                () -> assertThat(domains.conceptOf("Cards").broader())
                        .as("the business area the same rows place it in")
                        .isEqualTo("Products"),
                () -> assertThat(domains.conceptOf("Cards").definition())
                        .as("BIAN states prose for a service domain and none for the level above it")
                        .isEmpty(),
                () -> assertThat(domains.described())
                        .extracting(SkosConcept::broader)
                        .allSatisfy(broader -> assertThat(domains.conceptOf(broader))
                                .as("a pooled level looks its own name up, so every one must answer")
                                .isNotNull()));
    }
}
