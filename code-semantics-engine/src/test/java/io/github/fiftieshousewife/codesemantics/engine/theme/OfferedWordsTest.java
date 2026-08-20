package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.Weights;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.name.WordSegmenter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/** Which words reach the resources at all, and what one occurrence of each is worth before they answer. */
class OfferedWordsTest {

    private static final String SITE = "engine/src/main/java/Reading.java";

    private final Workings workings = Workings.newInstance();

    private final SenseDomains senses = word -> switch (word) {
        case "word" -> List.of(Set.of("linguistics"));
        case "cursor" -> List.of(Set.of("computing"), Set.of("typography"));
        default -> List.of();
    };

    private final TopicTally tally = new TopicTally(
            new IdentifierWords(WordSegmenter.fromClasspath()), noPublishedRuns(),
            OfferedWords.fromClasspath(),
            new PhraseTopics(citations(), new TopicCommitment(), fullyCovered()), workings);

    /** A fixture says what it means: a run read as one word is not what these tests are about. */
    private static CollocatedWords noPublishedRuns() {
        return new CollocatedWords(new PublishedPhrases(Set.of()), ContentWords.fromClasspath());
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
    void readsOnlyTheContentWordsOfASentenceAndNotWhatHoldsItTogether() {
        tally.add(SITE, new NameOccurrence("The word and the cursor.", NameForm.JAVADOC, 4));

        assertAll(
                () -> assertThat(tally.reading(SITE, 10).referencesTo("linguistics")).isOne(),
                () -> assertThat(tally.reading(SITE, 10).phraseOccurrences())
                        .as("one sentence is one phrase, whatever it took to say it")
                        .isOne());
    }

    @Test
    void offersEveryWordOfANameWhetherOrNotADictionaryCarriesIt() {
        add("qzxfgh", 1);

        assertThat(tally.reading(SITE, 10).phraseOccurrences())
                .as("an unread name is a finding, where an unread preposition is grammar")
                .isOne();
    }

    @Test
    void readsAWordAsItsDictionaryFormSoAnInflectionDoesNotSplitItsEvidence() {
        add("words", 1);
        add("word", 2);

        assertThat(tally.reading(SITE, 10).referencesTo("linguistics"))
                .as("words and word are one subject, not two")
                .isEqualTo(2);
    }

    @Test
    void weighsADeclaredNameAboveASentenceAboutIt() {
        final OfferedWords offered = OfferedWords.fromClasspath();

        assertAll(
                () -> assertThat(offered.formWorth(NameForm.FIELD)).isEqualTo(1.0),
                () -> assertThat(offered.formWorth(NameForm.JAVADOC))
                        .as("prose is commentary on the code rather than the code")
                        .isLessThan(offered.formWorth(NameForm.FIELD)));
    }

    @Test
    void refusesToAskADictionaryWhatADependencysNameMeans() {
        final OfferedWords offered = OfferedWords.fromClasspath();

        assertAll(
                () -> assertThat(offered.of(NameForm.IMPORT, "jupiter"))
                        .as("org.junit.jupiter names a test framework, and WordNet answers a Roman god")
                        .isEmpty(),
                () -> assertThat(offered.of(NameForm.IMPORT, "owl"))
                        .as("and an ontology language is not a bird")
                        .isEmpty(),
                () -> assertThat(offered.of(NameForm.FIELD, "jupiter"))
                        .as("a name this repository declared is still its own word")
                        .contains("jupiter"));
    }

    @Test
    void refusesASymbolLengthWordWhicheverItIs() {
        final OfferedWords offered = OfferedWords.fromClasspath();

        assertAll(
                () -> assertThat(offered.of(NameForm.JAVADOC, "a")).isEmpty(),
                () -> assertThat(offered.of(NameForm.FIELD, "a"))
                        .as("a name can be a sentence, and an article inside one is still an article")
                        .isEmpty(),
                () -> assertThat(offered.of(NameForm.FIELD, "cursor")).contains("cursor"));
    }
}
