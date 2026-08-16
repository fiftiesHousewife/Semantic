package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.reading.OccurrenceCounts;
import org.fifties.housewife.codesemantics.engine.reading.RepositoryLegibility;
import org.fifties.housewife.codesemantics.engine.reading.ScopeLegibility;
import org.fifties.housewife.codesemantics.engine.reading.UnreadWords;
import org.fifties.housewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PublishedNamesTest {

    private final PublishedNames names = new PublishedNames();

    private static ScopeLegibility scope(final String name, final String named, final String written) {
        final WrittenWords words = new WrittenWords();
        words.saw(named, name + "/Reading.java:3", true);
        words.saw(written, name + "/Reading.java:4", false);
        return new ScopeLegibility(name, 1, new OccurrenceCounts(1, 1, 1, 2, 0, 2, 2), Map.of(), Map.of(),
                new UnreadWords(Map.of(), Map.of()), words);
    }

    private static RepositoryLegibility reading() {
        final ScopeLegibility published = scope("lexicon/src/main/java", "lemma", "dictionary");
        final ScopeLegibility checking = scope("lexicon/src/test/java", "refuses", "asserts");
        return new RepositoryLegibility(List.of(published, checking), published, Duration.ofMillis(1));
    }

    @Test
    void keepsThePublishedSourceSetsNamesApartFromTheOnesThatCheckThem() {
        assertAll(
                () -> assertThat(names.published(reading()).words()).containsExactly("lemma"),
                () -> assertThat(names.checking(reading()).words()).containsExactly("refuses"));
    }

    @Test
    void readsTheNamesAloneAndNotTheSentencesWrittenAboutThem() {
        assertThat(names.published(reading()).words())
                .as("a name is a word its author chose for a thing; a sentence is English")
                .doesNotContain("dictionary");
    }
}
