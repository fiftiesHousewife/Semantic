package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class FixtureNameSourceTest {

    private final FixtureNameSource source = new FixtureNameSource();

    @Test
    void readsOnlyFilesUnderATestResourcesDirectory() {
        assertAll(
                () -> assertThat(source.reads(
                        Path.of("core", "src", "test", "resources", "test-documents", "testEXCEL.xls")))
                        .isTrue(),
                () -> assertThat(source.reads(Path.of("core", "src", "main", "resources", "shipped.xml")))
                        .isFalse(),
                () -> assertThat(source.reads(Path.of("core", "src", "test", "java", "ReadingTest.java")))
                        .isFalse());
    }

    @Test
    void refusesTheDirectoryTheJarSpecificationReserves() {
        assertThat(source.reads(Path.of("core", "src", "test", "resources", "META-INF", "services",
                "org.apache.tika.parser.Parser")))
                .isFalse();
    }

    @Test
    void neverOpensTheFileBecauseItsContentsAreSomebodyElsesDocument() {
        assertThat(source.opensTheFile()).isFalse();
    }

    @Test
    void readsTheChosenNameAndNothingElse() {
        assertThat(source.read(
                Path.of("core", "src", "test", "resources", "test-documents", "testEXCEL_embedded.xls"), "")
                .occurrences())
                .extracting(NameOccurrence::text, NameOccurrence::form, NameOccurrence::line)
                .containsExactly(tuple("testEXCEL_embedded.xls", NameForm.FIXTURE, 1));
    }
}
