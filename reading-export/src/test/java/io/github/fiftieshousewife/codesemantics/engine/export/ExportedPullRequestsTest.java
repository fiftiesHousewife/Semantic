package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.repository.PullRequestFacts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedPullRequestsTest {

    private static final PullRequestFacts FACTS = new PullRequestFacts(3154, "tballison",
            "9351a7063d41ec9a47a50b444a9f0242fd765860", "fa7ea0996857fd785d782d0cb887c04b996dddb9", 2);

    private static final String STATEMENT =
            "About cryptography and ciphers.\n\nAdds a public key exchange to the parser.";

    private final ExportedPullRequests exported = new ExportedPullRequests();

    @TempDir
    Path tree;

    @BeforeEach
    void aSmallTreeAboutLanguage() throws IOException {
        final Path sources = tree.resolve("engine").resolve("src").resolve("main").resolve("java");
        Files.createDirectories(sources);
        Files.writeString(sources.resolve("LanguageParser.java"), """
                public class LanguageParser {
                    private String grammar;
                    private String sentence;
                    private String phoneme;
                    void parseSentence() {
                    }
                }
                """);
        Files.writeString(tree.resolve("README.md"), "Reads sentences against a grammar.");
    }

    @Test
    void readsTheChangedFilesIdenticallyWithAndWithoutTheStatement() {
        final RepositoryReading reading = RepositoryReading.of(tree);

        final ExportedPullRequest without = exported.of(FACTS, reading);
        final ExportedPullRequest with = exported.of(FACTS, reading, STATEMENT, 1);

        assertAll(
                () -> assertThat(with.signals()).isEqualTo(without.signals()),
                () -> assertThat(with.thresholds()).isEqualTo(without.thresholds()),
                () -> assertThat(with.withStatement(null)).isEqualTo(without),
                () -> assertThat(with.signals())
                        .as("a stated word must never come back as a written signal")
                        .noneMatch(signal -> signal.word().contains("cryptography")));
    }

    @Test
    void statesTheDivergenceBesideTheReadingWithItsShapeAndItsChance() {
        final RepositoryReading reading = RepositoryReading.of(tree);

        final ExportedStatement statement = exported.of(FACTS, reading, STATEMENT, 1).statement();

        assertAll(
                () -> assertThat(statement.sentences()).isEqualTo(2),
                () -> assertThat(statement.words()).isEqualTo(12),
                () -> assertThat(statement.divergenceBits()).isBetween(0.0, 1.0),
                () -> assertThat(statement.chanceDivergenceBits()).isBetween(0.0, 1.0),
                () -> assertThat(statement.resamples()).isPositive());
    }

    @Test
    void leavesTheStatementOutWhereNothingInItCouldBeRead() {
        final RepositoryReading reading = RepositoryReading.of(tree);

        assertThat(exported.of(FACTS, reading, "qzxv wvvx", 1).statement()).isNull();
    }
}
