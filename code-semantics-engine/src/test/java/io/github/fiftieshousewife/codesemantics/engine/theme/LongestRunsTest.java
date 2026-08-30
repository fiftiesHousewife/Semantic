package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LongestRunsTest {

    /** The same index, counting how often the walk asks it whether a run is published. */
    private static final class CountedQuestions extends PublishedPhrases {

        private int asked;

        private CountedQuestions(final Set<String> written) {
            super(written);
        }

        @Override
        public boolean states(final String run) {
            asked++;
            return super.states(run);
        }
    }

    private static final Set<String> WRITTEN = Set.of("noun_phrase", "part_of_speech",
            "a_very_long_run_of_words_nothing_here_begins");

    @Test
    void asksTheIndexOnlyAboutRunsTheWordStandingThereCouldBegin() {
        final CountedQuestions index = new CountedQuestions(WRITTEN);
        final LongestRuns walk = new LongestRuns(index, run -> true);

        walk.of(List.of("noun", "phrase", "written", "here"));

        assertAll(
                () -> assertThat(index.asked)
                        .as("noun begins a run of two and the other three words begin none")
                        .isEqualTo(1),
                () -> assertThat(index.longestRun())
                        .as("the index still states its own widest entry")
                        .isEqualTo(9));
    }

    @Test
    void readsThePhraseInTheUnitsTheIndexPublishesIt() {
        final LongestRuns walk = new LongestRuns(new PublishedPhrases(WRITTEN), run -> true);

        assertAll(
                () -> assertThat(walk.of(List.of("noun", "phrase", "written", "here")))
                        .containsExactly("noun_phrase", "written", "here"),
                () -> assertThat(walk.of(List.of("part", "of", "speech")))
                        .containsExactly("part_of_speech"));
    }
}
