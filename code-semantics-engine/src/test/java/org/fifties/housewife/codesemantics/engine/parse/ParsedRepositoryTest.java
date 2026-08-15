package org.fifties.housewife.codesemantics.engine.parse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ParsedRepositoryTest {

    private static Path write(final Path root, final String path, final String source) throws IOException {
        final Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, source);
        return file;
    }

    private static ParsedRepository of(final Path root, final Path... files) {
        return ParsedRepository.of(root, List.of(new SourceScope("main", List.of(files))));
    }

    @Test
    void readsWhatAFilesPackageSaysThatItsNeighboursDoNot(@TempDir final Path root) throws IOException {
        final Path theme = write(root, "Theme.java", "package org.acme.tool.theme;\nclass Theme {}\n");
        final Path parse = write(root, "Parse.java", "package org.acme.tool.parse;\nclass Parse {}\n");

        final List<String> packages = ParsedRepository
                .of(root, List.of(new SourceScope("main", List.of(theme, parse)))).files().stream()
                .flatMap(file -> file.occurrences().stream())
                .filter(occurrence -> occurrence.form() == NameForm.PACKAGE)
                .map(NameOccurrence::text)
                .toList();

        assertThat(packages)
                .as("the coordinate every file shares is the organisation's and is read once by nobody; "
                        + "what distinguishes a file is the taxonomy its author chose")
                .containsExactlyInAnyOrder("theme", "parse");
    }

    @Test
    void readsEveryWordOfAPackageTailAndNotTheWholeTailAsOneToken(@TempDir final Path root)
            throws IOException {
        final Path deep = write(root, "Deep.java",
                "package org.acme.tool.engine.theme;\nclass Deep {}\n");
        final Path shallow = write(root, "Shallow.java", "package org.acme.tool.parse;\nclass Shallow {}\n");

        final List<String> words = of(root, deep, shallow).files().stream()
                .flatMap(file -> file.occurrences().stream())
                .filter(occurrence -> occurrence.form() == NameForm.PACKAGE)
                .flatMap(occurrence -> IdentifierWords.fromClasspath().of(occurrence.text()).words().stream())
                .toList();

        assertThat(words)
                .as("a package is the taxonomy its author chose, and every rung of it is one of the words")
                .containsExactlyInAnyOrder("engine", "theme", "parse");
    }

    @Test
    void keepsTheDependenciesARepositoryChoseAndSetsAsideTheRest(@TempDir final Path root) throws IOException {
        final Path file = write(root, "Reading.java", """
                package example.engine;
                import java.util.List;
                import example.engine.other.Thing;
                import net.sf.extjwnl.data.POS;
                class Reading { }
                """);
        write(root, "Thing.java", "package example.engine.other;\nclass Thing { }\n");

        final ParsedRepository parsed = ParsedRepository.of(root,
                List.of(new SourceScope("main", List.of(file, root.resolve("Thing.java")))));

        assertAll(
                () -> assertThat(parsed.files().getFirst().occurrences())
                        .filteredOn(occurrence -> occurrence.form() == NameForm.IMPORT)
                        .extracting(NameOccurrence::text)
                        .containsExactly("net.sf.extjwnl.data.POS"),
                () -> assertThat(parsed.importsFrom(ImportOrigin.PLATFORM)).isOne(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.INTERNAL)).isOne(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.EXTERNAL)).isOne());
    }

    @Test
    void carriesEachFilesScopeAndLengthForTheScopesToBeReadOver(@TempDir final Path root) throws IOException {
        final Path file = write(root, "Reading.java", "package example;\nclass Reading { }\n");

        assertThat(of(root, file).files())
                .singleElement()
                .satisfies(parsed -> assertAll(
                        () -> assertThat(parsed.scope()).isEqualTo("main"),
                        () -> assertThat(parsed.path()).isEqualTo("Reading.java"),
                        () -> assertThat(parsed.lines()).isEqualTo(2),
                        () -> assertThat(parsed.sound()).isTrue(),
                        () -> assertThat(parsed.occurrencesOf(NameForm.TYPE)).isOne()));
    }

    @Test
    void countsAFileThatDidNotParseCleanlyAndStillReadsWhatItRecovered(@TempDir final Path root)
            throws IOException {
        final Path broken = write(root, "Broken.java",
                "package example;\nclass Broken {\n    int cursor;\n    void read() { int x = ; }\n}\n");
        final Path sound = write(root, "Sound.java", "package example;\nclass Sound { }\n");

        final ParsedRepository parsed = of(root, broken, sound);

        assertAll(
                () -> assertThat(parsed.unsoundFiles()).isOne(),
                () -> assertThat(parsed.files()).hasSize(2),
                () -> assertThat(parsed.files().getFirst().occurrences())
                        .as("a reading that dropped what it could not parse perfectly would report a "
                                + "smaller corpus without saying so")
                        .extracting(NameOccurrence::text)
                        .contains("cursor"));
    }

    @Test
    void readsNothingFromAnEmptyTree(@TempDir final Path root) {
        final ParsedRepository parsed = ParsedRepository.of(root, List.of());

        assertAll(
                () -> assertThat(parsed.files()).isEmpty(),
                () -> assertThat(parsed.unsoundFiles()).isZero(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.EXTERNAL)).isZero());
    }
}
