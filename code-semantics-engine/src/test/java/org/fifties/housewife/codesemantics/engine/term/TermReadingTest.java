package org.fifties.housewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fifties.housewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermReadingTest {

    private static final String SOURCE = "a taxonomy";

    private final TermReading reading = TermReading.over(publishing(SOURCE, "common noun", "phrase"));

    @Test
    void findsAPublishedTermInADeclaredName(@TempDir final Path root) throws IOException {
        final MatchedTerms matched = reading.of(parsed(root, "Page.java", """
                package example;
                class Page {
                    private String commonNoun;
                }
                """));

        assertAll(
                () -> assertThat(matched.spansFound()).isEqualTo(1),
                () -> assertThat(matched.distinctTerms()).isEqualTo(1),
                () -> assertThat(matched.longerThanOneWord()).extracting(TermSighting::term)
                        .containsExactly("common noun"),
                () -> assertThat(matched.sightings().getFirst().firstSite()).contains("Page.java"));
    }

    @Test
    void readsANameTheRepositoryDeclaredAndNotTheProseItWroteAboutIt(@TempDir final Path root)
            throws IOException {
        final MatchedTerms matched = reading.of(parsed(root, "Page.java", """
                package example;
                /** A phrase is a common noun beside another. */
                class Page {
                    private String cursor;
                }
                """));

        assertThat(matched.spansFound())
                .as("a term in a sentence is an author writing about a field, not a program working in it")
                .isZero();
    }

    @Test
    void countsEveryDeclaredNameItOfferedAndNotOnlyTheOnesThatMatched(@TempDir final Path root)
            throws IOException {
        final MatchedTerms matched = reading.of(parsed(root, "Page.java", """
                package example;
                class Page {
                    private String phrase;
                    private String cursor;
                }
                """));

        assertAll(
                () -> assertThat(matched.namesRead()).isGreaterThan(matched.spansFound()),
                () -> assertThat(matched.perThousandNames()).isPositive());
    }

    @Test
    void saysWhichFilesNothingWasFoundIn(@TempDir final Path root) throws IOException {
        final Path found = write(root, "Page.java", "package example;\nclass Page { String phrase; }\n");
        final Path missing = write(root, "Cursor.java", "package example;\nclass Cursor { String at; }\n");

        final MatchedTerms matched = reading.of(
                ParsedRepository.of(root, List.of(new SourceScope("main", List.of(found, missing)))));

        assertAll(
                () -> assertThat(matched.filesRead()).isEqualTo(2),
                () -> assertThat(matched.filesMatched()).isEqualTo(1),
                () -> assertThat(matched.filesWithNoMatch()).isEqualTo(1));
    }

    @Test
    void countsATermWrittenTwiceAsOneTermSeenTwice(@TempDir final Path root) throws IOException {
        final MatchedTerms matched = reading.of(parsed(root, "Page.java", """
                package example;
                class Page {
                    private String phrase;
                    private String phraseAgain;
                }
                """));

        assertAll(
                () -> assertThat(matched.distinctTerms()).isEqualTo(1),
                () -> assertThat(matched.spansFound()).isEqualTo(2),
                () -> assertThat(matched.byMass(1).getFirst().occurrences()).isEqualTo(2));
    }

    private static ParsedRepository parsed(final Path root, final String path, final String source)
            throws IOException {
        return ParsedRepository.of(root,
                List.of(new SourceScope("main", List.of(write(root, path, source)))));
    }

    private static Path write(final Path root, final String path, final String source) throws IOException {
        final Path file = root.resolve("engine/src/main/java").resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, source);
        return file;
    }
}
