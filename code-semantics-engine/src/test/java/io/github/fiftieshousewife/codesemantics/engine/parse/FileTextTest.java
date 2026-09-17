package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FileTextTest {

    @TempDir
    Path folder;

    @Test
    void readsWhatTheFileHolds() throws IOException {
        final Path file = Files.writeString(folder.resolve("Engine.java"), "class Engine {\n}\n");

        assertThat(FileText.of(file)).isEqualTo("class Engine {\n}\n");
    }

    @Test
    void namesTheFileItCouldNotRead() {
        assertThatThrownBy(() -> FileText.of(folder.resolve("absent.java")))
                .isInstanceOf(UncheckedIOException.class)
                .hasMessageContaining("absent.java");
    }
}
