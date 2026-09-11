package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class VocabularyFunnelTest {

    @Test
    void funnelsAPublishedReadingFromItsNamesToItsMeanings(@TempDir final Path folder)
            throws IOException {
        final ReadingFolder reading = PublishedReadingFixture.wrote(folder);

        final VocabularyFunnel funnel = VocabularyFunnel.of(reading);

        assertAll(
                () -> assertThat(funnel.repository()).isEqualTo("a-repository"),
                () -> assertThat(funnel.field()).isEqualTo(6),
                () -> assertThat(funnel.field() - funnel.belowChance() - funnel.languageSupplied())
                        .as("the words within the reference's error are inside the below-threshold count, "
                                + "so the funnel subtracts them once")
                        .isEqualTo(funnel.signals()),
                () -> assertThat(funnel.signals()).isEqualTo(3),
                () -> assertThat(funnel.words())
                        .as("parsers and its dictionary form count once")
                        .isEqualTo(3),
                () -> assertThat(funnel.tiles().stream().flatMap(tile -> tile.members().stream()))
                        .as("the tiles hold exactly the words the domain page draws")
                        .containsExactlyInAnyOrderElementsOf(
                                SignificantWords.of(reading.export()).words().stream()
                                        .map(ScoredWord::word)
                                        .toList()));
    }
}
