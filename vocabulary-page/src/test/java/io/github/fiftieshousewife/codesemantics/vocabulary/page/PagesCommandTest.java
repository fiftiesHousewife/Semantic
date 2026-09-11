package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PagesCommandTest {

    @Test
    void writesOneFindingsPagePerPublishedReading(@TempDir final Path folder, @TempDir final Path reports)
            throws IOException {
        PublishedReadingFixture.wrote(folder);

        final List<Path> written = PagesCommand.wrote(reports, List.of(folder));

        final Path page = reports.resolve("a-repository").resolve(PagesCommand.PAGE);
        assertAll(
                () -> assertThat(written).containsExactly(page, reports.resolve(PagesCommand.LANDING)),
                () -> assertThat(Files.readString(reports.resolve(PagesCommand.LANDING)))
                        .contains("href=\"a-repository/reading.html\""),
                () -> assertThat(page).isRegularFile(),
                () -> assertThat(Files.readString(page))
                        .contains("<h1>a-repository</h1>")
                        .contains("<style>")
                        .contains("What this rests on")
                        .contains("id=\"reading\"")
                        .contains("\"overlap\""));
    }
}
