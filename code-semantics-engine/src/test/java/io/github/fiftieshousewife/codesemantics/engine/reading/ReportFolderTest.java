package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReportFolderTest {

    @Test
    void writesTheReadersOwnTreeStraightIntoTheOutputFolder(@TempDir final Path base) {
        final Path host = base.resolve("CodeSemantics");

        assertThat(ReportFolder.forReadingOf(host, host, base).root()).isEqualTo(base);
    }

    @Test
    void writesAnotherCloneBeneathAFolderNamedAfterIt(@TempDir final Path base) {
        final Path host = base.resolve("CodeSemantics");
        final Path elsewhere = base.resolve("clones").resolve("gson");

        assertThat(ReportFolder.forReadingOf(elsewhere, host, base).root()).isEqualTo(base.resolve("gson"));
    }

    @Test
    void tellsTwoClonesOfTheSameNameApartByTheWholePathTheyWereReadFrom(@TempDir final Path base) {
        final Path host = base.resolve("CodeSemantics");
        final Path relative = Path.of("..").resolve(host.getFileName().toString());

        assertThat(ReportFolder.forReadingOf(relative, host, base).root())
                .as("a path that normalises to somewhere else is somewhere else")
                .isEqualTo(base.resolve(host.getFileName().toString()));
    }

    @Test
    void makesTheFolderItNamesBeforeHandingOverAFileInIt(@TempDir final Path base) throws IOException {
        final Path host = base.resolve("CodeSemantics");
        final ReportFolder folder = ReportFolder.forReadingOf(base.resolve("gson"), host, base);

        final Path report = folder.file("themes.md");

        assertAll(
                () -> assertThat(report)
                        .as("one folder per format, so what a person reads is not in with what a browser opens")
                        .isEqualTo(base.resolve("gson").resolve("markdown").resolve("themes.md")),
                () -> assertThat(report.getParent()).isDirectory());
    }

    @Test
    void refusesToWriteAFormatNothingPublishes(@TempDir final Path base) {
        final ReportFolder folder = ReportFolder.forReadingOf(base, base, base);

        assertThatIllegalArgumentException().isThrownBy(() -> folder.file("themes.txt"))
                .withMessageContaining("themes.txt");
    }

    @Test
    void writesTheReportAndThePageItRendersAsUnderOneName(@TempDir final Path base) throws IOException {
        final Path host = base.resolve("CodeSemantics");
        final ReportFolder folder = ReportFolder.forReadingOf(host, host, base);

        folder.wrote("themes", "# Themes\n\nWhat it is about.\n", "Themes");

        assertAll(
                () -> assertThat(Files.readString(base.resolve("markdown").resolve("themes.md")))
                        .contains("What it is about."),
                () -> assertThat(Files.readString(base.resolve("html").resolve("themes.html")))
                        .contains("<title>"));
    }
}
