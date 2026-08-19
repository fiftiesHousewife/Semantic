package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.engine.parse.ImportOrigin;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
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
 * rather than milliseconds. Run it with {@code ./gradlew read}, which streams the report to the console
 * and leaves it at the path below.
 */
@Tag("diagnostic")
class SelfReadingDiagnostic {

    private static final String REPORT = "self-reading";

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
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final Path root = tree.root();
        final ParsedRepository parsed = tree.parsed();
        final RepositoryLegibility reading = tree.legibility();
        final ReportFolder reports = ReportFolder.forReadingOf(root);

        write(reports, reading, root, parsed);

        assertAll(
                () -> assertThat(reading.repository().counts().legibility()).isBetween(0.0, 1.0),
                () -> assertThat(reading.scopes()).allSatisfy(scope ->
                        assertThat(scope.counts().read()).isLessThanOrEqualTo(scope.counts().words())),
                () -> assertThat(Files.readString(reports.file(REPORT + ".md"))).contains("**repository**"));
    }

    private void write(final ReportFolder reports, final RepositoryLegibility reading, final Path root,
            final ParsedRepository parsed) throws IOException {
                reports.wrote(REPORT, "# Self-reading — %s%n%n%s%n%s%n%s%n%n%s".formatted(root.getFileName(),
                PREAMBLE, new LegibilityReport().render(reading), imports(parsed),
                provided(ProvidedServices.statedUnder(root), parsed)), "Legibility");
    }

    /** What the parse set aside, so a narrowed corpus is a reported figure rather than a silent one. */
    private static String imports(final ParsedRepository parsed) {
        return ("Imports read as this repository's own choice: %d. Set aside as the platform's own vocabulary: "
                + "%d. Set aside as this repository's own coordinates: %d. Set aside as the toolchain a "
                + "source set nothing is published from is checked with: %d. Files the parser refused: %d.")
                .formatted(parsed.imports().read(),
                        parsed.imports().from(ImportOrigin.PLATFORM),
                        parsed.imports().from(ImportOrigin.INTERNAL),
                        parsed.imports().toolchain(),
                        parsed.unsoundFiles());
    }

    /**
     * What the tree provides, beside what it calls, and never summed with it: each {@code META-INF/services}
     * registry names a service interface, sorted into own, platform and external by the same rule the
     * imports were.
     */
    private static String provided(final ProvidedServices services, final ParsedRepository parsed) {
        if (services.registrations().isEmpty()) {
            return "Service interfaces this tree registers providers for under the `ServiceLoader` "
                    + "contract: none.";
        }
        final int providers = services.registrations().stream()
                .mapToInt(ProvidedServices.Registration::providers)
                .sum();
        return ("Service interfaces this tree registers providers for under the `ServiceLoader` contract: "
                + "%d, carrying %d provider entries. Of the interfaces, its own: %d, the platform's: %d, "
                + "external: %d.")
                .formatted(services.registrations().size(), providers,
                        countedAs(services, parsed, ImportOrigin.INTERNAL),
                        countedAs(services, parsed, ImportOrigin.PLATFORM),
                        countedAs(services, parsed, ImportOrigin.EXTERNAL));
    }

    private static int countedAs(final ProvidedServices services, final ParsedRepository parsed,
            final ImportOrigin origin) {
        return (int) services.registrations().stream()
                .filter(registration -> parsed.origins().of(registration.serviceInterface()) == origin)
                .count();
    }
}
