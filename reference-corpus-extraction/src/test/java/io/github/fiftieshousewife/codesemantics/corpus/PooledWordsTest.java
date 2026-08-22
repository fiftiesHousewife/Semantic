package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.clones.RepositoryManifest;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PooledWordsTest {

    private static final String KETTLE = """
            package example.one;

            /** A comment about the flywheel. */
            public class KettleWarden {

                private final String kettleDepth = "";

                public String kettleDepth() {
                    return kettleDepth;
                }
            }
            """;

    private static final String LANTERN = """
            package example.two;

            public class LanternWarden {

                public String kettleGlow() {
                    return "";
                }
            }
            """;

    @Test
    void countsAWordOnceForEachDeclarationThatWritesIt(@TempDir final Path corpus) throws IOException {
        final WrittenWords pooled = PooledWords.fromClasspath()
                .of(treeAt(corpus, "kettle", "KettleWarden", KETTLE));
        assertAll(
                () -> assertThat(pooled.occurrencesOf("kettle")).isEqualTo(3),
                () -> assertThat(pooled.occurrencesOf("warden")).isEqualTo(1),
                () -> assertThat(pooled.occurrencesOf("depth")).isEqualTo(2));
    }

    @Test
    void leavesOutAWordWrittenOnlyInASentenceAboutADeclaration(@TempDir final Path corpus) throws IOException {
        final WrittenWords pooled = PooledWords.fromClasspath()
                .of(treeAt(corpus, "kettle", "KettleWarden", KETTLE));
        assertThat(pooled.words()).doesNotContain("flywheel");
    }

    @Test
    void sumsAWordAcrossEveryRepositoryTheManifestPins(@TempDir final Path corpus) throws IOException {
        treeAt(corpus, "kettle", "KettleWarden", KETTLE);
        treeAt(corpus, "lantern", "LanternWarden", LANTERN);
        final WrittenWords pooled = PooledWords.fromClasspath().over(manifest("kettle", "lantern"), corpus);
        assertAll(
                () -> assertThat(pooled.occurrencesOf("kettle")).isEqualTo(4),
                () -> assertThat(pooled.occurrencesOf("warden")).isEqualTo(2),
                () -> assertThat(pooled.occurrencesOf("lantern")).isEqualTo(1));
    }

    private static RepositoryManifest manifest(final String... names) {
        return RepositoryManifest.of(Stream.of(names)
                .map(name -> String.join("\t", name, "https://example.invalid/" + name + ".git",
                        "0123456789abcdef0123456789abcdef01234567", "MIT")));
    }

    private static Path treeAt(final Path corpus, final String name, final String type, final String source)
            throws IOException {
        final Path root = corpus.resolve(name);
        final Path sources = root.resolve(Path.of("module", "src", "main", "java", "example"));
        Files.createDirectories(sources);
        Files.writeString(sources.resolve(type + ".java"), source);
        return root;
    }
}
