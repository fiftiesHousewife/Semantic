package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WiktionaryCitationsTest {

    private final WiktionaryCitations citations = WiktionaryCitations.fromClasspath();

    @Test
    void citesTheSoleExpansionOfAnUnambiguousToken() {
        final List<WiktionaryCitations.Citation> cited = citations.citationsOf("svr");
        assertAll(
                () -> assertThat(cited).hasSize(1),
                () -> assertThat(cited.getFirst().expansion()).isEqualTo("server"),
                () -> assertThat(cited.getFirst().topics()).contains("computing"));
    }

    @Test
    void citesEveryCompetingExpansionOfAnAmbiguousToken() {
        assertThat(citations.citationsOf("bp").stream().map(WiktionaryCitations.Citation::expansion))
                .contains("blood pressure", "boiling point", "base pair")
                .doesNotContain("break point");
    }

    @Test
    void carriesTheSensesTopicLabels() {
        assertThat(citations.citationsOf("ht"))
                .anyMatch(citation -> citation.expansion().equals("half time")
                        && citation.topics().contains("sports"));
    }

    @Test
    void citesTheQuantityAUnitSymbolMeasures() {
        assertThat(citations.citationsOf("kj"))
                .anyMatch(citation -> citation.expansion().equals("kilojoule")
                        && citation.quantity().equals("work or energy"));
    }

    @Test
    void anOrdinaryAbbreviationCarriesNoQuantity() {
        assertThat(citations.citationsOf("kcal"))
                .allMatch(citation -> citation.quantity().isEmpty());
    }

    @Test
    void anUncitedTokenHasNoCitations() {
        assertAll(
                () -> assertThat(citations.citationsOf("prct")).isEmpty(),
                () -> assertThat(citations.citationsOf("winners")).isEmpty());
    }

    @Test
    void lookupIsCaseInsensitiveOnTheToken() {
        assertThat(citations.citationsOf("QTY"))
                .anyMatch(citation -> citation.expansion().equals("quantity"));
    }
}
