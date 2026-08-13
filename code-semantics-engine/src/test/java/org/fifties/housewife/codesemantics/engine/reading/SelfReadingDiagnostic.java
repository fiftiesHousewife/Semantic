package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads this repository's own Java sources and writes the legibility report. It is the library's self test:
 * the one measurement it can take of itself with what is in the tree today, and a standing check that the
 * whole reading — scan, split, cite, abstain, tally — runs over real source rather than over fixtures.
 *
 * <p>Tagged {@code diagnostic} because its output is a report for a person to read and its cost is seconds
 * rather than milliseconds. Run it with {@code ./gradlew selfRead}, which streams the report to the console
 * and leaves it at the path below.
 */
@Tag("diagnostic")
class SelfReadingDiagnostic {

    private static final String REPORT = "build/reports/self-reading/self-reading.md";

    private static final String CLONE_DIRECTORY_PROPERTY = "cs.clone.dir";

    private static final String SETTINGS_FILE = "settings.gradle.kts";

    private static final String PREAMBLE = """
            A reading of this repository's own Java sources by the library that reads repositories. It is a
            **lexical scan of a working tree**, and each of those words is a limit: no parse, so no reading
            belongs to a declaration; no git read, so nothing is pinned by a commit SHA and no permalink is
            rendered; and no votes, because a vote requires an anchor and an anchor requires a revision.

            What it does say is what the code is written in, and how much of that some bundled resource can be
            cited for. λ is the share of the author's word occurrences at least one resource reads. The
            language's own words are counted separately and set aside, cited to the platform's own
            implementation of the Java Language Specification rather than to any list written here.
            """;

    @Test
    void readsThisRepositoryAndWritesTheLegibilityReport() throws IOException {
        final Path root = repositoryRoot();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final RepositoryLegibility reading = LegibilityReading.fromClasspath().of(root, scopes);

        write(reading, root);

        assertAll(
                () -> assertThat(scopes).as("a repository with no Java sources cannot be read").isNotEmpty(),
                () -> assertThat(reading.repository().counts().identifiers()).isPositive(),
                () -> assertThat(reading.repository().counts().legibility()).isBetween(0.0, 1.0),
                () -> assertThat(reading.scopes()).allSatisfy(scope ->
                        assertThat(scope.counts().read()).isLessThanOrEqualTo(scope.counts().words())),
                () -> assertThat(Files.readString(Path.of(REPORT))).contains("**repository**"));
    }

    private void write(final RepositoryLegibility reading, final Path root) throws IOException {
        final Path report = Path.of(REPORT);
        Files.createDirectories(report.getParent());
        Files.writeString(report, "# Self-reading — %s%n%n%s%n%s".formatted(root.getFileName(), PREAMBLE,
                new LegibilityReport().render(reading)));
    }

    /**
     * The repository the reading is pointed at: {@code -Dcs.clone.dir} when given, so the same diagnostic can
     * read another clone, and otherwise the enclosing build's own root — found by the settings file that
     * defines it rather than by counting {@code ..} segments from a working directory.
     */
    private static Path repositoryRoot() {
        final String supplied = System.getProperty(CLONE_DIRECTORY_PROPERTY, "");
        if (!supplied.isBlank()) {
            return Path.of(supplied).toAbsolutePath().normalize();
        }
        Path candidate = Path.of("").toAbsolutePath();
        while (!Files.isRegularFile(candidate.resolve(SETTINGS_FILE))) {
            candidate = candidate.getParent();
            if (candidate == null) {
                throw new IllegalStateException("No " + SETTINGS_FILE + " above " + Path.of("").toAbsolutePath());
            }
        }
        return candidate;
    }
}
