package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WikidataInitialismsTest {

    private final WikidataInitialisms initialisms = WikidataInitialisms.fromClasspath();

    @Test
    void carriesEveryRegistryReadingOfACapitalsToken() {
        assertThat(initialisms.readingsOf("SNA").stream().map(WikidataInitialisms.Reading::label))
                .contains("national accounts", "United Nations System of National Accounts",
                        "Syrian National Army");
    }

    @Test
    void carriesSitelinkCountsAsProminence() {
        final List<WikidataInitialisms.Reading> readings = initialisms.readingsOf("WB");
        assertAll(
                () -> assertThat(readings).anyMatch(reading -> reading.label().equals("World Bank")
                        && reading.sitelinks() > 100),
                () -> assertThat(readings).anyMatch(reading -> reading.label().equals("World Balance")
                        && reading.sitelinks() < 10));
    }

    @Test
    void readsTheTokenExactlyAsWritten() {
        assertAll(
                () -> assertThat(initialisms.readingsOf("wb")).isEmpty(),
                () -> assertThat(initialisms.readingsOf("Wb")).isEmpty());
    }

    @Test
    void anUnregisteredTokenHasNoReadings() {
        assertThat(initialisms.readingsOf("QQQZ")).isEmpty();
    }
}
