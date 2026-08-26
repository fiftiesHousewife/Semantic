package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class EvaluationPagesCommandTest {

    @Test
    void writesEveryPagePerPublishedReadingAndAnIndexNamingThem(@TempDir final Path output,
                                                                @TempDir final Path reports)
            throws IOException {
        PublishedReadingFixture.wrote(output.resolve("json"));

        final List<Path> readings = EvaluationPagesCommand.readings(output);
        final List<String> written = EvaluationPagesCommand.pages(readings, reports);

        assertAll(
                () -> assertThat(readings).hasSize(1),
                () -> assertThat(written).containsExactly("a-repository"),
                () -> assertThat(reports.resolve("a-repository").resolve("vocabulary.html")).exists(),
                () -> assertThat(reports.resolve("a-repository").resolve("domain-venn.html")).exists(),
                () -> assertThat(reports.resolve("a-repository").resolve("control-matches.html")).exists(),
                () -> assertThat(Files.readString(reports.resolve("index.html")))
                        .contains("a-repository/vocabulary.html")
                        .contains("a-repository/domain-venn.html")
                        .contains("a-repository/control-matches.html"));
    }
}
