package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SubjectDescriptionTest {

    private static WrittenConcept concept(final String description, final String statedFor) {
        return new WrittenConcept("Card Capture", description, statedFor, "words", 9);
    }

    @Test
    void readsASubjectWhosePublisherStatesProseForAConceptPlacedThereAsDescribed() {
        assertThat(SubjectDescription.of(List.of(concept("the capture of a card", "Card Capture"))))
                .isEqualTo(SubjectDescription.DESCRIBED);
    }

    @Test
    void readsProseStatedForALevelAboveTheConceptAsProse() {
        assertThat(SubjectDescription.of(List.of(concept("what a card is", "Cards"))))
                .isEqualTo(SubjectDescription.DESCRIBED);
    }

    @Test
    void readsASubjectWhosePublisherStatesProseForNoneOfItAsUndescribed() {
        assertThat(SubjectDescription.of(List.of(concept("", ""), concept("   ", ""))))
                .isEqualTo(SubjectDescription.UNDESCRIBED);
    }

    @Test
    void readsASubjectHoldingOneDescribedConceptAmongSeveralAsDescribed() {
        assertThat(SubjectDescription.of(List.of(concept("", ""), concept("a card transaction", "Cards"))))
                .isEqualTo(SubjectDescription.DESCRIBED);
    }

    @Test
    void readsASubjectHoldingNoConceptsAtAllAsUndescribed() {
        assertThat(SubjectDescription.of(List.of())).isEqualTo(SubjectDescription.UNDESCRIBED);
    }
}
