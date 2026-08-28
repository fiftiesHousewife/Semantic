package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class EveryPublishedRunTest {

    private final PublishedPhrases every = EveryPublishedRun.newInstance();

    @Test
    void statesEveryRunTheDictionariesState() {
        final Set<String> dictionaries = PublishedPhrases.fromClasspath().stated();
        assertThat(dictionaries).isNotEmpty().allMatch(every::states);
    }

    @Test
    void statesEveryRunTheTermVocabulariesState() {
        final Set<String> vocabularies = PublishedTermRuns.fromClasspath().written();
        assertThat(vocabularies).isNotEmpty().allMatch(every::states);
    }

    @Test
    void reachesFurtherThanTheIndexAReadingRunsOn() {
        assertAll(
                () -> assertThat(every.size())
                        .isGreaterThan(PublishedPhrases.fromClasspath().size()),
                () -> assertThat(every.longestRun())
                        .isGreaterThanOrEqualTo(PublishedPhrases.fromClasspath().longestRun()));
    }
}
