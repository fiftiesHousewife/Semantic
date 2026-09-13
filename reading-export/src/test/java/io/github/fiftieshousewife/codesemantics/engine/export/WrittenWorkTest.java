package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WrittenWorkTest {

    private static final String ENGINE = """
            public class Engine {
                private final String model = "";
                void load() {
                }
            }
            """;

    private final WrittenWork work = new WrittenWork();

    @TempDir
    Path base;

    @TempDir
    Path head;

    @Test
    void readsAMethodStandingAtTheHeadAloneAsADeclarationAdded() throws IOException {
        wrote(base, "Engine.java", ENGINE);
        wrote(head, "Engine.java", """
                public class Engine {
                    private final String model = "";
                    void load() {
                    }
                    void unload() {
                    }
                }
                """);

        final ExportedWork.Written written = work.between(base, head);

        assertAll(
                () -> assertThat(written.added().methods()).isEqualTo(1),
                () -> assertThat(written.added().types()).isZero(),
                () -> assertThat(written.removed().total()).isZero(),
                () -> assertThat(written.kept()).isEqualTo(3),
                () -> assertThat(written.filesAdded()).isZero());
    }

    @Test
    void namesEveryTypeAFileTheHeadAloneStatesAdds() throws IOException {
        wrote(base, "Engine.java", ENGINE);
        wrote(head, "Engine.java", ENGINE);
        wrote(head, "Loader.java", """
                public class Loader {
                }
                """);

        final ExportedWork.Written written = work.between(base, head);

        assertAll(
                () -> assertThat(written.filesRead()).isEqualTo(2),
                () -> assertThat(written.filesAdded()).isEqualTo(1),
                () -> assertThat(written.typesAdded())
                        .extracting(ExportedWork.NamedDeclaration::name)
                        .containsExactly("Loader"),
                () -> assertThat(written.typesRemoved()).isEmpty());
    }

    @Test
    void readsEveryDeclarationAsAddedWhereTheBaseStatesNoFileAtAll() throws IOException {
        wrote(head, "Engine.java", ENGINE);

        final ExportedWork.Written written = work.between(base, head);

        assertAll(
                () -> assertThat(written.added().types()).isEqualTo(1),
                () -> assertThat(written.added().methods()).isEqualTo(1),
                () -> assertThat(written.added().fields()).isEqualTo(1),
                () -> assertThat(written.kept()).isZero(),
                () -> assertThat(written.filesAdded()).isEqualTo(1));
    }

    @Test
    void readsARenamedTypeAsOneRemovedAndOneAdded() throws IOException {
        wrote(base, "Engine.java", "public class Engine {\n}\n");
        wrote(head, "Engine.java", "public class InferenceEngine {\n}\n");

        final ExportedWork.Written written = work.between(base, head);

        assertAll(
                () -> assertThat(written.typesAdded())
                        .extracting(ExportedWork.NamedDeclaration::name)
                        .containsExactly("InferenceEngine"),
                () -> assertThat(written.typesRemoved())
                        .extracting(ExportedWork.NamedDeclaration::name)
                        .containsExactly("Engine"),
                () -> assertThat(written.kept()).isZero());
    }

    private static void wrote(final Path tree, final String name, final String source) throws IOException {
        final Path sources = tree.resolve("engine").resolve("src").resolve("main").resolve("java");
        Files.createDirectories(sources);
        Files.writeString(sources.resolve(name), source);
    }
}
