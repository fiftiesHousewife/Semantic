package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import io.github.fiftieshousewife.bi.lexicon.MediaTypes;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class WrittenMediaTypesTest {

    @TempDir
    private Path root;

    private final MediaTypes registry = MediaTypes.fromClasspath();

    private void source(final String path, final String text) throws IOException {
        final Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, text);
    }

    @Test
    void countsALiteralByteIdenticalToARegisteredIdentifierAndNothingElse() throws IOException {
        source("core/src/main/java/Detector.java", """
                class Detector {
                    static final String PDF = "application/pdf";
                    static final String ALSO_PDF = "application/pdf";
                    static final String UNREGISTERED = "text/x-java-source";
                    static final String PROSE = "a pdf document";
                }
                """);
        assertThat(WrittenMediaTypes.writtenUnder(root, registry).sightings())
                .extracting(WrittenMediaTypes.Sighting::identifier, WrittenMediaTypes.Sighting::occurrences)
                .containsExactly(tuple("application/pdf", 2));
    }

    @Test
    void statesNothingWhereATreeWritesNoRegisteredIdentifier() throws IOException {
        source("core/src/main/java/Reading.java", "class Reading { }");
        assertThat(WrittenMediaTypes.writtenUnder(root, registry).sightings()).isEmpty();
    }
}
