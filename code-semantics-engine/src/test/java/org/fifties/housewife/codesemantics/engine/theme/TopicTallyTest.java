package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.Thresholds;
import org.fifties.housewife.codesemantics.engine.Weights;
import org.fifties.housewife.codesemantics.engine.pipeline.OpenSpaceAccumulator;
import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;
import org.fifties.housewife.codesemantics.engine.parse.NameForm;
import org.fifties.housewife.codesemantics.engine.parse.NameOccurrence;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
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
        case "word_cursor" -> List.of(Set.of("lexicography"));
        default -> List.of();
    };

    /** A fixture says what it means: no resource publishes a run, unless a test says one does. */
    private static final PublishedPhrases NOTHING_PUBLISHED = new PublishedPhrases(Set.of());

    private final TopicTally tally = tallyOver(NOTHING_PUBLISHED, witnesses);

    private TopicTally tallyOver(final PublishedPhrases published, final TopicWitnesses into) {
        return new TopicTally(new IdentifierWords(WordSegmenter.fromClasspath()),
                new CollocatedWords(published, ContentWords.fromClasspath()),
                new OfferedWords(ContentWords.fromClasspath(), WordSpecificity.fromClasspath(), published,
                        Weights.defaults()),
                new PhraseTopics(citations(), new TopicCommitment(), fullyCovered()), into,
                new WordSightings());
    }

    private TopicCitations citations() {
        return new TopicCitations(senses, word -> Set.of(), word -> 1, Weights.defaults());
    }

    /** A fixture says what it means: coverage is not what these tests are about. */
    private static SenseCoverage fullyCovered() {
        return new SenseCoverage(new StatedSenses(Map.of(), Map.of()), word -> Set.of());
    }

    private void add(final String identifier, final int line) {
        tally.add(SITE, new NameOccurrence(identifier, NameForm.FIELD, line));
    }

    @Test
    void commitsAWholeUnitForAPhraseWhoseWordsSettleOnOneSubject() {
        add("word", 3);

        assertThat(tally.reading(SITE, 40).massByTopic().get("linguistics"))
                .as("one word, one subject, one unit — a name is worth what its form is worth")
                .isCloseTo(1.0, offset(1e-12));
    }

    @Test
    void commitsLessForAPhraseThatCouldNotDecide() {
        add("cursor", 1);

        final FileTopics file = tally.reading(SITE, 10);

        assertAll(
                () -> assertThat(file.massByTopic().values().stream().mapToDouble(Double::doubleValue).sum())
                        .as("two subjects at even odds is half a unit, not a whole one spread thinner")
                        .isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(file.massByTopic().get("computing"))
                        .isCloseTo(file.massByTopic().get("typography"), offset(1e-12)));
    }

    @Test
    void weighsAWordByWhatTheRestOfItsPhraseAgreesWith() {
        add("word", 3);
        final double alone = tally.reading(SITE, 40).massByTopic().get("linguistics");

        final TopicTally amongStrangers = tallyOver(NOTHING_PUBLISHED, new TopicWitnesses());
        amongStrangers.add(SITE, new NameOccurrence("wordCursor", NameForm.FIELD, 4));

        assertThat(amongStrangers.reading(SITE, 40).massByTopic().get("linguistics"))
                .as("a subject only one word of a phrase names is one word's opinion about the phrase")
                .isLessThan(alone);
    }

    @Test
    void readsARunAResourcePublishesAsOneWordRatherThanAsItsWordsApart() {
        final TopicTally asATerm = tallyOver(new PublishedPhrases(Set.of("word_cursor")),
                new TopicWitnesses());
        asATerm.add(SITE, new NameOccurrence("wordCursor", NameForm.FIELD, 4));

        assertAll(
                () -> assertThat(asATerm.reading(SITE, 40).massByTopic())
                        .as("what the resource says of the run, and neither of the subjects its words carry")
                        .containsOnlyKeys("lexicography"),
                () -> assertThat(asATerm.reading(SITE, 40).massByTopic().get("lexicography"))
                        .as("one name, one term, one unit")
                        .isCloseTo(1.0, offset(1e-12)));
    }

    @Test
    void countsOneReferencePerOccurrenceHoweverManySensesNamedTheTopic() {
        add("cursor", 1);

        assertAll(
                () -> assertThat(tally.reading(SITE, 10).referencesTo("computing")).isOne(),
                () -> assertThat(tally.reading(SITE, 10).referencesTo("typography")).isOne());
    }

    @Test
    void countsWhatNoResourceCouldPlaceRatherThanDroppingIt() {
        add("word", 1);
        add("qzxfgh", 2);

        final FileTopics file = tally.reading(SITE, 10);

        assertAll(
                () -> assertThat(file.unreadableOccurrences()).isOne(),
                () -> assertThat(file.phraseOccurrences()).isEqualTo(2));
    }

    @Test
    void keepsTheWholeOfAPhraseNothingCouldPlace() {
        add("qzxfgh", 2);

        assertThat(tally.reading(SITE, 10).unplacedMass())
                .as("a name is worth one unit whether or not anything could read it")
                .isCloseTo(1.0, offset(1e-12));
    }

    @Test
    void keepsWhatAPhraseCouldNotSettleOnASubject() {
        add("cursor", 1);

        final FileTopics file = tally.reading(SITE, 10);

        assertAll(
                () -> assertThat(file.unplacedMass())
                        .as("two subjects at even odds settle half a unit, and the other half is not a vote")
                        .isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(file.distribution().unplaced()).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(file.distribution().shareOf("computing")).isCloseTo(0.25, offset(1e-12)));
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
