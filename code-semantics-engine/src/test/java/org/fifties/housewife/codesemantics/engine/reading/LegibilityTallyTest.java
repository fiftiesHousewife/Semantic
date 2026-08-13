package org.fifties.housewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.parse.NameForm;
import org.fifties.housewife.codesemantics.engine.parse.NameOccurrence;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.fifties.housewife.codesemantics.name.WordSegmenter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class LegibilityTallyTest {

    private static final String SITE = "code-semantics-engine/src/main/java/Example.java";

    private final CitedWords cited = new CitedWords(List.of(
            new ResourceCitation(EvidenceSource.WORD_FREQUENCY, Set.of("page", "cursor", "next")::contains),
            new ResourceCitation(EvidenceSource.WORDNET_SENSE, Set.of("page")::contains)));

    private final LegibilityTally tally =
            new LegibilityTally(cited, new IdentifierWords(WordSegmenter.fromClasspath()));

    private void add(final String identifier, final int line) {
        tally.add(SITE, new NameOccurrence(identifier, NameForm.FIELD, line));
    }

    private void wrote(final String prose, final int line) {
        tally.add(SITE, new NameOccurrence(prose, NameForm.JAVADOC, line));
    }

    @Test
    void readsTheShareOfWordOccurrencesSomethingCanBeCitedFor() {
        add("nextPage", 3);
        add("dsl", 4);

        final OccurrenceCounts counts = tally.reading("scope", 1).counts();

        assertAll(
                () -> assertThat(counts.declarations()).isEqualTo(2),
                () -> assertThat(counts.words()).isEqualTo(3),
                () -> assertThat(counts.read()).isEqualTo(2),
                () -> assertThat(counts.legibility()).isCloseTo(2.0 / 3.0, offset(1e-9)));
    }

    @Test
    void readsASentenceAsItsWordsAndANameAsItsOwnBoundaries() {
        add("nextPage", 1);
        wrote("The next page of the cursor.", 2);

        final OccurrenceCounts counts = tally.reading("scope", 1).counts();

        assertAll(
                () -> assertThat(counts.declarations()).as("prose is not a declaration").isOne(),
                () -> assertThat(counts.nameWords()).isEqualTo(2),
                () -> assertThat(counts.proseWords()).isEqualTo(6),
                () -> assertThat(counts.proseShare()).isCloseTo(6.0 / 8.0, offset(1e-9)));
    }

    @Test
    void countsEveryOccurrenceOfAWordAndNotOnlyItsSurface() {
        add("page", 1);
        add("page", 2);
        add("pageCursor", 3);

        final OccurrenceCounts counts = tally.reading("scope", 1).counts();

        assertAll(
                () -> assertThat(counts.words()).isEqualTo(4),
                () -> assertThat(counts.distinctWords()).isEqualTo(2),
                () -> assertThat(counts.wordsSeenOnce()).isOne(),
                () -> assertThat(counts.tailShare()).isEqualTo(0.5));
    }

    @Test
    void namesEveryResourceThatCarriedTheReadingAndTheOverlapBetweenThem() {
        add("page", 1);
        add("cursor", 2);

        final ScopeLegibility reading = tally.reading("scope", 1);

        assertAll(
                () -> assertThat(reading.occurrencesBySource())
                        .containsEntry(EvidenceSource.WORD_FREQUENCY, 2)
                        .containsEntry(EvidenceSource.WORDNET_SENSE, 1),
                () -> assertThat(reading.shareCitedBy(EvidenceSource.WORD_FREQUENCY)).isEqualTo(1.0),
                () -> assertThat(reading.shareCitedBy(EvidenceSource.WIKIDATA_NAME)).isZero(),
                () -> assertThat(reading.occurrencesRestingOn(EvidenceSource.WORD_FREQUENCY))
                        .as("cursor rests on the frequency list alone; page is corroborated by WordNet")
                        .isOne(),
                () -> assertThat(reading.occurrencesRestingOn(EvidenceSource.WORDNET_SENSE)).isZero());
    }

    @Test
    void keepsWhatNothingCouldReadAndWhereToSeeIt() {
        add("dsl", 7);
        add("dsl", 9);
        add("tconst", 11);

        final UnreadWords unread = tally.reading("scope", 1).unread();

        assertAll(
                () -> assertThat(unread.occurrences()).containsEntry("dsl", 2).containsEntry("tconst", 1),
                () -> assertThat(unread.firstSite()).containsEntry("dsl", SITE + ":7"),
                () -> assertThat(unread.totalOccurrences()).isEqualTo(3),
                () -> assertThat(unread.mostWritten(1))
                        .containsExactly(new UnreadWords.Sighting("dsl", 2, SITE + ":7")));
    }

    @Test
    void readsNothingFromAScopeWithNoFilesAndCallsItNeitherAReadingNorAFailure() {
        final ScopeLegibility reading = tally.reading("empty", 0);

        assertAll(
                () -> assertThat(reading.counts().legibility()).isZero(),
                () -> assertThat(reading.counts().proseShare()).isZero(),
                () -> assertThat(reading.counts().tailShare()).isZero(),
                () -> assertThat(reading.unread().occurrences()).isEmpty());
    }
}
