package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.Thresholds;
import org.fifties.housewife.codesemantics.engine.Weights;
import org.fifties.housewife.codesemantics.engine.pipeline.OpenSpaceAccumulator;
import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierOccurrence;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.engine.reading.JavaLanguageKeywords;
import org.fifties.housewife.codesemantics.name.WordSegmenter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicTallyTest {

    private static final String SITE = "engine/src/main/java/Reading.java";

    private final TopicWitnesses witnesses = new TopicWitnesses();

    /** word → senses, so the fixture states exactly what each word is claimed to be about. */
    private final SenseDomains senses = word -> switch (word) {
        case "word" -> List.of(Set.of("linguistics"));
        case "cursor" -> List.of(Set.of("computing"), Set.of("typography"));
        default -> List.of();
    };

    private final TopicTally tally = new TopicTally(
            new TopicCitations(senses, word -> Set.of(), Weights.defaults()),
            new IdentifierWords(WordSegmenter.fromClasspath()), new JavaLanguageKeywords(), witnesses);

    private void add(final String identifier, final int line) {
        tally.add(SITE, new IdentifierOccurrence(identifier, line));
    }

    @Test
    void commitsTheMassEachWordsResourcesGaveIt() {
        add("word", 3);
        add("wordCursor", 4);

        final FileTopics file = tally.reading(SITE, 40);

        assertAll(
                () -> assertThat(file.massByTopic().get("linguistics")).isCloseTo(2.0, offset(1e-12)),
                () -> assertThat(file.massByTopic().get("computing")).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(file.distribution().shareOf("linguistics")).isCloseTo(2.0 / 3.0,
                        offset(1e-12)));
    }

    @Test
    void countsOneReferencePerOccurrenceHoweverManySensesNamedTheTopic() {
        add("cursor", 1);

        assertAll(
                () -> assertThat(tally.reading(SITE, 10).referencesTo("computing")).isOne(),
                () -> assertThat(tally.reading(SITE, 10).referencesTo("typography")).isOne());
    }

    @Test
    void setsTheLanguagesOwnWordsAsideRatherThanReadingThemAsSubjects() {
        add("class", 1);
        add("final", 2);

        assertAll(
                () -> assertThat(tally.reading(SITE, 10).massByTopic()).isEmpty(),
                () -> assertThat(tally.reading(SITE, 10).wordOccurrences()).isZero());
    }

    @Test
    void countsWhatNoResourceCouldPlaceRatherThanDroppingIt() {
        add("word", 1);
        add("qzxfgh", 2);

        final FileTopics file = tally.reading(SITE, 10);

        assertAll(
                () -> assertThat(file.unreadableOccurrences()).isOne(),
                () -> assertThat(file.wordOccurrences()).isEqualTo(2));
    }

    @Test
    void recordsTheWordAndTheSiteBehindEveryTopicItRead() {
        add("word", 7);

        assertThat(witnesses.forTopic("linguistics", 3))
                .singleElement()
                .satisfies(witness -> assertAll(
                        () -> assertThat(witness.word()).isEqualTo("word"),
                        () -> assertThat(witness.occurrences()).isOne(),
                        () -> assertThat(witness.site()).isEqualTo(SITE + ":7")));
    }

    @Test
    void weighsWhatNothingCouldReadAgainstTheTopicItResolves() {
        add("word", 1);
        add("qzxfgh", 2);
        add("qzxfgh", 3);

        final ValueShare<String> dominant = tally.reading(SITE, 10)
                .dominant(new OpenSpaceAccumulator<>(Thresholds.defaults()))
                .orElseThrow();

        assertAll(
                () -> assertThat(dominant.value()).isEqualTo("linguistics"),
                () -> assertThat(dominant.share())
                        .as("one unit read against two occurrences nothing could place")
                        .isCloseTo(1.0 / 3.0, offset(1e-12)));
    }

    @Test
    void resolvesNoTopicForAFileNothingCouldBeReadIn() {
        add("qzxfgh", 1);

        assertThat(tally.reading(SITE, 10).dominant(new OpenSpaceAccumulator<>(Thresholds.defaults())))
                .isEmpty();
    }
}
