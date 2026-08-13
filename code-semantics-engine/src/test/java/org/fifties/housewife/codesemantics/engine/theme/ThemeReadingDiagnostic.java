package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads what this repository is about, scope by scope, and writes both the report a person reads and the
 * graph a viewer draws.
 *
 * <p>The draw is seeded on a fixed number so two runs of one tree agree: a permutation null that moved
 * between runs would make every excess unfalsifiable.
 */
@Tag("diagnostic")
class ThemeReadingDiagnostic {

    private static final String REPORT = "build/reports/self-reading/themes.md";
    private static final String GRAPH = "build/reports/self-reading/themes.json";

    private static final String SETTINGS_FILE = "settings.gradle.kts";
    private static final String CLONE_DIRECTORY_PROPERTY = "cs.clone.dir";

    private static final long SEED = 20260813L;
    private static final int TOPICS_GRAPHED = 18;
    private static final int WITNESSES_HELD = 8;

    private static final String PREAMBLE = """
            What this repository's names are about, read through the two bundled resources that assign a word
            to a subject: WordNet Domains, which labels each of a word's senses, and Wiktionary's topic
            vocabulary, which labels the headword. Each word occurrence commits one unit of mass per resource,
            divided among the readings that resource names, so an ambiguous word does not shout.

            **Read the ranking below as the weak reading it is.** A topic's intensity over one scope counts
            every occurrence of every word, and the commonest words in Java source are also the most
            ambiguous ones — `string`, `set`, `map`, `assert`, `of`. Their senses spray mass across subjects
            that have nothing to do with this codebase, which is why the witnesses are printed beside every
            row: a topic carried by one word is one word's opinion, and the table says so.

            The reading worth acting on is the comparison underneath it. A topic written at much the same
            density everywhere contributes almost nothing to a divergence, so the ambiguity that dominates a
            count cancels in a comparison — and each scope's divergence is judged against the field of
            divergences a scope of its own size draws by chance, so a small scope cannot look interesting
            merely by being small.
            """;

    @Test
    void readsThisRepositorysThemesAndWritesTheReportAndTheGraph() throws IOException {
        final Path root = repositoryRoot();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final RepositoryThemes themes = ThemeReading.fromClasspath(SEED).of(root, scopes);

        write(themes, root);

        assertAll(
                () -> assertThat(themes.rankings()).as("a repository of names reads as some subject").isNotEmpty(),
                () -> assertThat(themes.repository().intensity().shareByTopic().values().stream()
                        .mapToDouble(Double::doubleValue).sum())
                        .as("an intensity is a distribution and sums to one")
                        .isCloseTo(1.0, offset(1e-9)),
                () -> assertThat(themes.divergences()).allSatisfy(divergence ->
                        assertThat(divergence.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(Files.readString(Path.of(REPORT))).contains("What distinguishes each scope"),
                () -> assertThat(Files.readString(Path.of(GRAPH))).contains("\"nodes\""));
    }

    private void write(final RepositoryThemes themes, final Path root) throws IOException {
        final Path report = Path.of(REPORT);
        Files.createDirectories(report.getParent());
        Files.writeString(report, "# Themes — %s%n%n%s%n%s".formatted(root.getFileName(), PREAMBLE,
                new ThemeReport().render(themes)));
        new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(Path.of(GRAPH).toFile(),
                ThemeGraph.of(root.getFileName().toString(), themes, TOPICS_GRAPHED, WITNESSES_HELD));
    }

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
