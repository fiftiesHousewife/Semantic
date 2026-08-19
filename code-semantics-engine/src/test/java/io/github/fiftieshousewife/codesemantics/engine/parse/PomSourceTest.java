package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class PomSourceTest {

    private final PomSource source = new PomSource();

    private List<NameOccurrence> read(final String text) {
        return source.read(text).occurrences();
    }

    @Test
    void readsPomFilesAndNothingElse() {
        assertAll(
                () -> assertThat(source.reads(Path.of("tika-core", "pom.xml"))).isTrue(),
                () -> assertThat(source.reads(Path.of("README.md"))).isFalse(),
                () -> assertThat(source.reads(Path.of("Reading.java"))).isFalse());
    }

    @Test
    void readsAModuleEntryAsAChosenNameWhereItsParentStatesIt() {
        final String pom = "<project>\n<modules>\n<module>tika-parser-pdf-module</module>\n"
                + "<module>tika-detector-siegfried</module>\n</modules>\n</project>";
        assertThat(read(pom))
                .extracting(NameOccurrence::text, NameOccurrence::form, NameOccurrence::line)
                .containsExactly(
                        tuple("tika-parser-pdf-module", NameForm.MODULE, 3),
                        tuple("tika-detector-siegfried", NameForm.MODULE, 4));
    }

    @Test
    void readsTheDescriptionAsProseWithItsLineNumbers() {
        final String pom = "<project>\n<description>Parses PDF documents.\nUses PDFBox.</description>\n</project>";
        assertThat(read(pom))
                .extracting(NameOccurrence::text, NameOccurrence::form, NameOccurrence::line)
                .containsExactly(
                        tuple("Parses PDF documents.", NameForm.DOCUMENTATION, 2),
                        tuple("Uses PDFBox.", NameForm.DOCUMENTATION, 3));
    }

    @Test
    void readsAModuleStatedAsAPathAsRungsTheSplitterDividesAt() {
        assertThat(read("<module>parsers/pdf</module>"))
                .extracting(NameOccurrence::text)
                .containsExactly("parsers.pdf");
    }

    @Test
    void leavesOutEverythingElseAPomStates() {
        final String pom = """
                <project>
                <artifactId>tika-core</artifactId>
                <dependencies>
                <dependency>
                <groupId>org.apache.pdfbox</groupId>
                <artifactId>pdfbox</artifactId>
                </dependency>
                </dependencies>
                <name>Apache Tika core</name>
                </project>""";
        assertThat(read(pom)).isEmpty();
    }
}
