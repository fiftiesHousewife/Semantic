package org.fifties.housewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class CitedWordsTest {

    private static final WordCitation FREQUENCY =
            new ResourceCitation(EvidenceSource.WORD_FREQUENCY, Set.of("page", "cursor")::contains);

    private static final WordCitation WORDNET =
            new ResourceCitation(EvidenceSource.WORDNET_SENSE, Set.of("page")::contains);

    private final CitedWords cited = new CitedWords(List.of(FREQUENCY, WORDNET));

    @Test
    void namesEveryResourceThatCanBeCitedForTheWord() {
        assertThat(cited.citing("page"))
                .containsExactlyInAnyOrder(EvidenceSource.WORD_FREQUENCY, EvidenceSource.WORDNET_SENSE);
    }

    @Test
    void namesOnlyTheResourcesThatCarryIt() {
        assertThat(cited.citing("cursor")).containsExactly(EvidenceSource.WORD_FREQUENCY);
    }

    @Test
    void abstainsForAWordNothingCarriesRatherThanNamingSomething() {
        assertThat(cited.citing("dsl")).isEmpty();
    }

    @Test
    void consultsAResourceOnceForAWordHoweverOftenItIsWritten() {
        final AtomicInteger lookups = new AtomicInteger();
        final CitedWords counting = new CitedWords(List.of(
                new ResourceCitation(EvidenceSource.WORD_FREQUENCY, word -> {
                    lookups.incrementAndGet();
                    return true;
                })));

        counting.citing("page");
        counting.citing("page");
        counting.citing("cursor");

        assertThat(lookups).hasValue(2);
    }

    @Test
    void refusesACitationThatWouldNameNoResourceOrConsultNothing() {
        assertAll(
                () -> assertThatThrownBy(() -> new ResourceCitation(null, word -> true))
                        .isInstanceOf(NullPointerException.class).hasMessage("source"),
                () -> assertThatThrownBy(() -> new ResourceCitation(EvidenceSource.WORD_FREQUENCY, null))
                        .isInstanceOf(NullPointerException.class).hasMessage("lookup"));
    }
}
