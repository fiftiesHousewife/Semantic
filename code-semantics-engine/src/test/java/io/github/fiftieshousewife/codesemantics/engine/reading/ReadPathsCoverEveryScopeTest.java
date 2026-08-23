package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.clones.ReadPaths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * A corpus repository is fetched with only the blobs {@link ReadPaths} names. A scope reading a file those
 * patterns leave off the disk would read a corpus repository differently from the repository under reading,
 * and a share here would stop being comparable to a share there.
 */
class ReadPathsCoverEveryScopeTest {

    @TempDir
    private Path tree;

    @Test
    void keepsEveryFileTheSourceScopesWalk() throws IOException {
        write("module/src/main/java/TradeReportBuilder.java", "class TradeReportBuilder {}");
        write("module/src/test/java/TradeReportBuilderTest.java", "class TradeReportBuilderTest {}");
        write("README.md", "# A repository");
        write("docs/guide.adoc", "= A guide");
        write("pom.xml", "<project><groupId>a.b</groupId></project>");
        write("module/pom.xml", "<project><groupId>a.b</groupId></project>");
        write("module/src/test/resources/a-fixture-corpus.txt", "fixture");
        write("module/src/test/resources/nested/another.bin", "fixture");

        final List<Path> walked = RepositoryReading.scopesUnder(tree).stream()
                .flatMap(scope -> scope.files().stream())
                .map(tree::relativize)
                .toList();

        assertAll(
                () -> assertThat(walked)
                        .as("a scope reading nothing would make the coverage check below vacuous")
                        .anyMatch(file -> file.toString().endsWith(".java"))
                        .anyMatch(file -> file.toString().endsWith(".md"))
                        .anyMatch(file -> file.toString().endsWith(".adoc"))
                        .anyMatch(file -> file.toString().endsWith("pom.xml"))
                        .anyMatch(file -> file.toString().contains("src/test/resources")),
                () -> assertThat(walked).allSatisfy(file -> assertThat(isKept(file))
                        .as("%s is read by a source scope, so the sparse fetch has to keep it", file)
                        .isTrue()));
    }

    @Test
    void keepsTheStatedExclusionsAReadingObeys() {
        assertThat(isKept(Path.of(".readingignore")))
                .as("a tree's own exclusions decide what the scopes skip, so they have to be on disk")
                .isTrue();
    }

    /** Whether any pattern keeps the path, reading git's leading slash as anchored at the tree's root. */
    private static boolean isKept(final Path file) {
        return ReadPaths.patterns().stream()
                .map(pattern -> pattern.startsWith("/") ? pattern.substring(1) : pattern)
                .map(glob -> FileSystems.getDefault().getPathMatcher("glob:" + glob))
                .anyMatch(matcher -> matches(matcher, file));
    }

    /** Git matches a pattern at any depth; a glob anchored with {@code **}{@code /} needs a directory. */
    private static boolean matches(final PathMatcher matcher, final Path file) {
        return matcher.matches(file) || matcher.matches(Path.of("root").resolve(file));
    }

    private void write(final String at, final String content) throws IOException {
        final Path file = tree.resolve(at);
        Files.createDirectories(file.getParent());
        Files.writeString(file, content, StandardCharsets.UTF_8);
    }
}
