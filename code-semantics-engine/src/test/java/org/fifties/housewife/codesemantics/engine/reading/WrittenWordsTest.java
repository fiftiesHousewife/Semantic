package org.fifties.housewife.codesemantics.engine.reading;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class WrittenWordsTest {

    private final WrittenWords written = new WrittenWords();

    @Test
    void countsEveryOccurrenceAndKeepsOnePlaceToGoAndLookAtIt() {
        written.saw("synset", "Lexicon.java:4", true);
        written.saw("synset", "Reading.java:9", false);

        assertAll(
                () -> assertThat(written.occurrencesOf("synset")).isEqualTo(2),
                () -> assertThat(written.namedOccurrencesOf("synset")).isOne(),
                () -> assertThat(written.siteOf("synset")).isEqualTo("Lexicon.java:4"),
                () -> assertThat(written.totalOccurrences()).isEqualTo(2));
    }

    @Test
    void readsTheNamesAloneWithThePlaceTheNameWasWrittenRatherThanTheProse() {
        written.saw("topic", "Prose.java:2", false);
        written.saw("topic", "Topic.java:8", true);
        written.saw("the", "Prose.java:3", false);

        final WrittenWords named = written.asNamesOnly();

        assertAll(
                () -> assertThat(named.words()).containsExactly("topic"),
                () -> assertThat(named.occurrencesOf("topic")).isOne(),
                () -> assertThat(named.siteOf("topic")).isEqualTo("Topic.java:8"));
    }

    @Test
    void readsSeveralScopesAsOneTally() {
        final WrittenWords other = new WrittenWords();
        written.saw("word", "Engine.java:1", true);
        other.saw("word", "Lexicon.java:1", true);
        other.saw("rung", "Lexicon.java:2", true);

        final WrittenWords pooled = WrittenWords.pooling(List.of(written, other));

        assertAll(
                () -> assertThat(pooled.occurrencesOf("word")).isEqualTo(2),
                () -> assertThat(pooled.occurrencesOf("rung")).isOne(),
                () -> assertThat(pooled.siteOf("word")).isEqualTo("Engine.java:1"));
    }

    @Test
    void readsWhatWasWrittenAsADistributionOverWords() {
        written.saw("word", "Engine.java:1", true);
        written.saw("word", "Engine.java:2", true);
        written.saw("rung", "Engine.java:3", true);

        assertAll(
                () -> assertThat(written.shareByWord().get("word")).isCloseTo(2.0 / 3.0, offset(1e-12)),
                () -> assertThat(written.shareByWord().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, offset(1e-12)));
    }

    @Test
    void readsNothingAsNoDistributionRatherThanADivisionByZero() {
        assertThat(written.shareByWord()).isEmpty();
    }
}
