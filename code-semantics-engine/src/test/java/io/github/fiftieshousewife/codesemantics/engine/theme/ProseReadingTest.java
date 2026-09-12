package io.github.fiftieshousewife.codesemantics.engine.theme;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProseReadingTest {

    private static final String STATEMENT = "statement";

    private final ProseReading prose = ProseReading.fromClasspath();

    @Test
    void readsSentencesOfProseIntoADistributionOverSubjects() {
        final FileTopics reading = prose.of(STATEMENT,
                "Covers natural language processing, computational linguistics and speech.\n\n"
                        + "Enriched categories, abelian categories and homological algebra.");
        assertAll(
                () -> assertThat(reading.distribution().isEmpty()).isFalse(),
                () -> assertThat(reading.phraseOccurrences()).isEqualTo(2));
    }

    @Test
    void stepsOverFencedCodeExactlyAsADocumentationFileDoes() {
        final FileTopics bare = prose.of(STATEMENT, "The parser reads office documents.");
        final FileTopics fenced = prose.of(STATEMENT,
                "The parser reads office documents.\n```\ncryptography cipher key exchange\n```");
        assertThat(fenced.distribution().shareByTopic()).isEqualTo(bare.distribution().shareByTopic());
    }

    @Test
    void countsTheWordsOfEachSentenceForTheSampleANullDraws() {
        assertThat(prose.sentenceLengths("one two three\n\nfour five")).containsExactly(3, 2);
    }

    @Test
    void countsNoSentenceInsideAnHtmlComment() {
        assertThat(prose.sentenceLengths("<!--\nhidden licence header\n-->\nfour five six seven"))
                .containsExactly(4);
    }
}
