package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertAll;

class TruncatedDescriptionsTest {

    private static final String FIVE_WORDS = "indexing dictionaries retrieval content analysis";

    private final TruncatedDescriptions descriptions = new TruncatedDescriptions();

    private static SkosConcept concept(final String definition) {
        return new SkosConcept("cs.IR", "Information Retrieval", "", "cs", "category", "grp_cs", definition,
                "");
    }

    @Test
    void keepsEveryWordAtTheFullLength() {
        assertThat(descriptions.truncated(FIVE_WORDS, 1.0)).isEqualTo(FIVE_WORDS);
    }

    @Test
    void keepsHalfTheWordsRoundedUpSoAnOddDescriptionKeepsTheMiddleOne() {
        assertThat(descriptions.truncated(FIVE_WORDS, 0.5)).isEqualTo("indexing dictionaries retrieval");
    }

    @Test
    void keepsOneWordWhereTheFractionWouldOtherwiseKeepNone() {
        assertAll(
                () -> assertThat(descriptions.truncated(FIVE_WORDS, 0.0625)).isEqualTo("indexing"),
                () -> assertThat(descriptions.truncated("retrieval", 0.0625)).isEqualTo("retrieval"));
    }

    @Test
    void readsAWordAsTheWhitespaceTheDescriptionSeparatesItsOwnBy() {
        assertThat(descriptions.truncated("indexing\tdictionaries\n retrieval", 0.5))
                .isEqualTo("indexing dictionaries");
    }

    @Test
    void carriesEveryPropertyBesideTheDefinitionUnchanged() {
        final SkosConcept truncated = descriptions.at(List.of(concept(FIVE_WORDS)), 0.5).getFirst();

        assertAll(
                () -> assertThat(truncated.concept()).isEqualTo("cs.IR"),
                () -> assertThat(truncated.prefLabel()).isEqualTo("Information Retrieval"),
                () -> assertThat(truncated.broader()).isEqualTo("cs"),
                () -> assertThat(truncated.module()).isEqualTo("grp_cs"),
                () -> assertThat(truncated.definition()).isEqualTo("indexing dictionaries retrieval"));
    }

    @Test
    void refusesAFractionOutsideTheRangeAShareOfSomethingCanHold() {
        assertAll(
                () -> assertThatIllegalArgumentException()
                        .isThrownBy(() -> descriptions.truncated(FIVE_WORDS, 0.0)),
                () -> assertThatIllegalArgumentException()
                        .isThrownBy(() -> descriptions.truncated(FIVE_WORDS, 1.5)));
    }
}
