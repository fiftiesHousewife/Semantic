package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.Weights;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReadWordsTest {

    private static final String SITE = "engine/src/main/java/Reading.java:7";

    private final SenseDomains senses = word -> switch (word) {
        case "word" -> List.of(Set.of("linguistics"));
        case "cursor" -> List.of(Set.of("computing"), Set.of("typography"));
        default -> List.of();
    };

    private final ReadWords read = new ReadWords(
            new TopicCitations(senses, word -> Set.of(), word -> 2, Weights.defaults()),
            new TopicCommitment(),
            new SenseCoverage(new StatedSenses(Map.of(), Map.of()), word -> Set.of()),
            WordSpecificity.fromClasspath());

    private final Workings workings = Workings.newInstance();

    private final WordSightings sightings = workings.sightings();

    @Test
    void statesWhatTheResourcesSayAboutAWordAndWhatTheReadingMadeOfIt() {
        sightings.saw("cursor", SITE, true);
        sightings.saw("cursor", "Reading.java:9", true);

        workings.witnesses().record("computing", "cursor", "text cursor", SITE,
                EvidenceSource.TOPICAL_DOMAIN, 0.75);
        final WordEvidence cursor = read.in(workings).getFirst();

        assertAll(
                () -> assertThat(cursor.word()).isEqualTo("cursor"),
                () -> assertThat(cursor.occurrences()).as("how often it was seen").isEqualTo(2),
                () -> assertThat(cursor.carried()).as("what it was worth, which is a different figure")
                        .isCloseTo(0.75, offset(1e-12)),
                () -> assertThat(cursor.carriedNothing()).isFalse(),
                () -> assertThat(cursor.writtenAsAName()).isTrue(),
                () -> assertThat(cursor.firstSite()).isEqualTo(SITE),
                () -> assertThat(cursor.shareByTopic())
                        .containsOnlyKeys("computing", "typography"),
                () -> assertThat(cursor.shareByTopic().get("computing")).isCloseTo(0.5, offset(1e-12)),
                () -> assertThat(cursor.unread()).isFalse());
    }

    @Test
    void statesAWordNoResourceSpokeForRatherThanLeavingItOut() {
        sightings.saw("synset", SITE, true);

        final WordEvidence synset = read.in(workings).getFirst();

        assertAll(
                () -> assertThat(synset.unread())
                        .as("a word carrying no subject and a word carrying a wrong one are two complaints")
                        .isTrue(),
                () -> assertThat(synset.asHeadWord()).isEmpty(),
                () -> assertThat(synset.shareByTopic()).isEmpty(),
                () -> assertThat(synset.specificity()).isBetween(0.0, 1.0));
    }

    @Test
    void ordersByWhatEachWordCarriedRatherThanByHowOftenItWasSeen() {
        sightings.saw("word", SITE, false);
        sightings.saw("cursor", SITE, true);
        sightings.saw("cursor", SITE, true);
        workings.witnesses().record("linguistics", "word", "one word", SITE,
                EvidenceSource.TOPICAL_DOMAIN, 4.0);
        workings.witnesses().record("computing", "cursor", "text cursor", SITE,
                EvidenceSource.TOPICAL_DOMAIN, 0.5);

        assertAll(
                () -> assertThat(read.in(workings)).extracting(WordEvidence::word)
                        .containsExactly("word", "cursor"),
                () -> assertThat(read.in(workings).getLast().occurrences())
                        .as("the word seen twice as often carried an eighth as much")
                        .isEqualTo(2),
                () -> assertThat(read.in(workings).getLast().writtenAsAName()).isTrue(),
                () -> assertThat(read.in(workings).getFirst().writtenAsAName())
                        .as("prose only")
                        .isFalse());
    }

    @Test
    void statesAWordThatWasSeenAndCarriedNothing() {
        sightings.saw("require", SITE, false);

        assertAll(
                () -> assertThat(read.in(workings).getFirst().occurrences()).isEqualTo(1),
                () -> assertThat(read.in(workings).getFirst().carried()).isEqualTo(0.0),
                () -> assertThat(read.in(workings).getFirst().carriedNothing()).isTrue());
    }
}
