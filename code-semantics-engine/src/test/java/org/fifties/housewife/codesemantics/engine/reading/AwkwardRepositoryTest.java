package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.parse.ImportOrigin;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The repositories the evaluation set's own plan says it must contain, and which this reading has never been given:
 * one that does not wholly parse, one that is mostly not code at all, and one that imports nothing outside
 * itself.
 *
 * <p>Each of them is a legitimate member — the degenerate arm exists precisely because a reading that only
 * works on well-formed libraries has been measured on the easy half of the world. So each must produce a
 * reading rather than an exception, and the figure it produces must be reported rather than assumed away.
 * The tree this library was developed against parses cleanly end to end, which is exactly why nothing here
 * was ever exercised by the self test.
 */
class AwkwardRepositoryTest {

    @Test
    void readsATreeWhereSomeFileDoesNotParse(@TempDir final Path root) throws IOException {
        sourceFile(root, "Sound.java", "package a; /** A noun phrase. */ class Sound { String word; }");
        sourceFile(root, "Broken.java", "package a; class Broken { this is not java (");

        final ParsedRepository parsed = parse(root);

        assertAll(
                () -> assertThat(parsed.unsoundFiles())
                        .as("a file the parser refuses is counted, not dropped and not fatal")
                        .isOne(),
                () -> assertThat(parsed.files())
                        .as("and the files that did parse are still read")
                        .isNotEmpty());
    }

    @Test
    void readsATreeThatIsMostlyNotCode(@TempDir final Path root) throws IOException {
        Files.writeString(root.resolve("README.md"), "# A repository of configuration\n\nIt holds settings.\n");
        Files.writeString(root.resolve("settings.yaml"), "key: value\n");

        final List<SourceScope> scopes = scopesUnder(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);

        assertAll(
                () -> assertThat(parsed.unsoundFiles()).isZero(),
                () -> assertThat(parsed.imports().read())
                        .as("a repository that names no dependency has named no dependency, which is a "
                                + "reading and not a failure")
                        .isZero(),
                () -> assertThat(LegibilityReading.fromClasspath().of(parsed).repository().counts().legibility())
                        .as("a legibility with nothing to divide is a share of nothing, never a division "
                                + "by zero escaping as a number no bound covers")
                        .isBetween(0.0, 1.0));
    }

    @Test
    void readsNoJavaAtAllInATreeThatDeclaresItsSourcesSomewhereElse(@TempDir final Path root)
            throws IOException {
        final Path elsewhere = root.resolve("java").resolve("a");
        Files.createDirectories(elsewhere);
        Files.writeString(elsewhere.resolve("Elsewhere.java"), "package a; class Elsewhere { String word; }");

        assertThat(new JavaSourceScopes().under(root))
                .as("A LIMIT, PINNED. A scope is <module>/src/<set>/java, which is where Gradle and Maven "
                        + "declare sources and is what keeps generated output out of the reading with no "
                        + "list of directories to ignore. A repository laid out any other way — Bazel, "
                        + "Android, a bare java/ or src/ — therefore reads as having no Java in it at all, "
                        + "and reads so silently. In an evaluation set that is a member scoring zero for a reason "
                        + "that has nothing to do with what it is about, so the layout has to be recorded "
                        + "beside each member or the arm is measuring build conventions.")
                .isEmpty();
    }

    @Test
    void readsATreeThatImportsNothingOutsideItself(@TempDir final Path root) throws IOException {
        sourceFile(root, "Alone.java", "package a; class Alone { int count; void add(int amount) { count += amount; } }");

        final ParsedRepository parsed = parse(root);

        assertAll(
                () -> assertThat(parsed.imports().read()).isZero(),
                () -> assertThat(parsed.files()).isNotEmpty());
    }

    private static ParsedRepository parse(final Path root) {
        return ParsedRepository.of(root, scopesUnder(root));
    }

    private static List<SourceScope> scopesUnder(final Path root) {
        return Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
    }

    /** A file where a Gradle or Maven build declares its sources are, which is what makes a scope. */
    private static void sourceFile(final Path root, final String name, final String source) throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve(name), source);
    }
}
