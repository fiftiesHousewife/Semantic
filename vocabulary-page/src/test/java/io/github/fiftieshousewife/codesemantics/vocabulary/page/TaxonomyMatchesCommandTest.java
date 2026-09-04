package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TaxonomyMatchesCommandTest {

    @Test
    void countsEveryReadingOverTheOneVocabularyList(@TempDir final Path folder) throws IOException {
        PublishedReadingFixture.wrote(folder);

        final List<TaxonomyMatchesCommand.RepositoryMatches> rows =
                TaxonomyMatchesCommand.rows(List.of(folder));

        assertAll(
                () -> assertThat(rows).hasSize(1),
                () -> assertThat(rows.getFirst().repository()).isEqualTo("a-repository"),
                () -> assertThat(rows.getFirst().counts())
                        .extracting(VocabularyMatchCounts::vocabulary)
                        .containsExactly("OLiA", "CSO", "FIBO", "FpML", "FIX", "CWE", "BIAN"),
                () -> assertThat(rows.getFirst().counts().stream()
                        .filter(counts -> counts.vocabulary().equals("FIBO"))
                        .findFirst()
                        .orElseThrow()
                        .phraseOccurrences())
                        .as("interest rate at the words normalisation and credit risk at a spelling one both count")
                        .isEqualTo(11));
    }

    @Test
    void writesOnePageComparingEveryReading(@TempDir final Path folder, @TempDir final Path reports)
            throws IOException {
        PublishedReadingFixture.wrote(folder);

        final Path page = TaxonomyMatchesCommand.wrote(reports,
                TaxonomyMatchesCommand.rows(List.of(folder)));

        assertAll(
                () -> assertThat(page).exists(),
                () -> assertThat(reports.resolve("taxonomy-matches.json")).exists(),
                () -> assertThat(Files.readString(page))
                        .contains("a-repository")
                        .contains("FIBO")
                        .contains("term-trees.html#FIBO")
                        .contains("domain-venn.html#s-Phrase matches"));
    }
}
