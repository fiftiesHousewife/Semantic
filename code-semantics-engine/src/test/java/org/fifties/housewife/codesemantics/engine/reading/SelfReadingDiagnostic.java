package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.codesemantics.engine.parse.ImportOrigin;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
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
            A reading of this repository's own Java sources by the library that reads repositories, over a
            parse of the working tree. What it reads is what this repository **declared** — its types,
            methods, fields, parameters and locals — the **prose** it wrote in javadoc and comments, and the
            **dependencies** it named that are neither the platform's nor its own.

            Everything else a Java file contains is somebody else's vocabulary quoted: `String`, `List` and
            `assertThat` are uses of declarations the platform and the test framework made, and a use is not
            a word this codebase chose. Only a parse can tell the two apart, which is why this reading needs
            one. λ is the share of those word occurrences at least one bundled resource can be cited for.
            """;

    @Test
    void readsThisRepositoryAndWritesTheLegibilityReport() throws IOException {
        final Path root = repositoryRoot();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final RepositoryLegibility reading = LegibilityReading.fromClasspath().of(parsed);

        write(reading, root, parsed);

        assertAll(
                () -> assertThat(scopes).as("a repository with no Java sources cannot be read").isNotEmpty(),
                () -> assertThat(reading.repository().counts().declarations()).isPositive(),
                () -> assertThat(parsed.unsoundFiles()).as("every file in this tree parses cleanly").isZero(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.EXTERNAL)).isPositive(),
                () -> assertThat(reading.repository().counts().legibility()).isBetween(0.0, 1.0),
                () -> assertThat(reading.scopes()).allSatisfy(scope ->
                        assertThat(scope.counts().read()).isLessThanOrEqualTo(scope.counts().words())),
                () -> assertThat(Files.readString(Path.of(REPORT))).contains("**repository**"));
    }

    private void write(final RepositoryLegibility reading, final Path root, final ParsedRepository parsed)
            throws IOException {
        final Path report = Path.of(REPORT);
        Files.createDirectories(report.getParent());
        Files.writeString(report, "# Self-reading — %s%n%n%s%n%s%n%s".formatted(root.getFileName(), PREAMBLE,
                new LegibilityReport().render(reading), imports(parsed)));
    }

    /** What the parse set aside, so a narrowed corpus is a reported figure rather than a silent one. */
    private static String imports(final ParsedRepository parsed) {
        return ("Imports read as this repository's own choice: %d. Set aside as the platform's own vocabulary: "
                + "%d. Set aside as this repository's own coordinates: %d. No file failed to parse.")
                .formatted(parsed.importsFrom(ImportOrigin.EXTERNAL),
                        parsed.importsFrom(ImportOrigin.PLATFORM),
                        parsed.importsFrom(ImportOrigin.INTERNAL));
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
