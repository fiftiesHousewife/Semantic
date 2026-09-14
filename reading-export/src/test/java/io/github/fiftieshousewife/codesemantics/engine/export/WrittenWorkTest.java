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

    private static final String LICENCE = """
            /*
             * Licensed to the Apache Software Foundation under one or more
             * contributor license agreements. See the NOTICE file.
             */
            """;

    @Test
    void countsALicenceHeaderStandingInEveryFileOnce(@TempDir final Path alone) throws IOException {
        wrote(alone, "Engine.java", LICENCE + "class Engine {\n}\n");
        wrote(head, "Engine.java", LICENCE + "class Engine {\n}\n");
        wrote(head, "Loader.java", LICENCE + "class Loader {\n}\n");

        assertThat(work.between(base, head).atHead().commentLines())
                .as("one legal instrument repeated once per file was written once, so a second file "
                        + "carrying it adds nothing; counting it per file would outweigh whatever the "
                        + "repository is for")
                .isEqualTo(work.between(base, alone).atHead().commentLines());
    }

    @Test
    void countsTheProseAnAuthorWroteWhereItStandsAlone(@TempDir final Path alone) throws IOException {
        final String documented = """
                class Engine {
                    /**
                     * Loads the engine the configuration names.
                     */
                    void load() {
                    }
                }
                """;
        wrote(alone, "Engine.java", documented);
        wrote(head, "Engine.java", documented);
        wrote(head, "Loader.java", "class Loader {\n}\n");

        assertThat(work.between(base, head).atHead().commentLines())
                .as("prose standing in one file is that author's own and is counted whole")
                .isEqualTo(work.between(base, alone).atHead().commentLines())
                .isPositive();
    }

    @Test
    void countsAChangedFileNoScopeReachesAsUnread() throws IOException {
        wrote(base, "Engine.java", ENGINE);
        wrote(head, "Engine.java", ENGINE);
        Files.writeString(head.resolve("CHANGES.txt"), "Added inference bindings.\n");

        final ExportedWork.Written written = work.between(base, head);

        assertAll(
                () -> assertThat(written.filesRead())
                        .as("a changelog sits in no source set, no documentation directory and on no "
                                + "module chain, so nothing reaches it")
                        .isEqualTo(1),
                () -> assertThat(kind(written, "other")).isEqualTo(1),
                () -> assertThat(allKinds(written))
                        .as("the kinds account for every file the pull request changed")
                        .isEqualTo(2));
    }

    @Test
    void countsEveryFileItReadsUnderExactlyOneKind() throws IOException {
        wrote(head, "Engine.java", ENGINE);
        Files.createDirectories(head.resolve("docs"));
        Files.writeString(head.resolve("docs").resolve("inference.md"), "Loading an engine.\n");
        Files.writeString(head.resolve("CHANGES.txt"), "Added inference bindings.\n");

        final ExportedWork.Written written = work.between(base, head);

        assertThat(allKinds(written))
                .as("the kinds account for every file the pull request changed, the ones the build "
                        + "declares nowhere among them")
                .isEqualTo(written.filesRead() + kind(written, "other"));
    }

    @Test
    void countsTheTreesOwnExclusionsAsNeitherReadNorUnread() throws IOException {
        wrote(head, "Engine.java", ENGINE);
        Files.writeString(head.resolve(".readingignore"), "docs/\n");

        final ExportedWork.Written written = work.between(base, head);

        assertAll(
                () -> assertThat(written.filesRead()).isEqualTo(1),
                () -> assertThat(kind(written, "other"))
                        .as("the tree's own statement of what to exclude travels with the copy and is "
                                + "not a file the pull request changed")
                        .isZero());
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

    private static int kind(final ExportedWork.Written written, final String kind) {
        return written.filesByKind().stream()
                .filter(files -> kind.equals(files.kind()))
                .mapToInt(ExportedWork.KindFiles::files)
                .sum();
    }

    private static int allKinds(final ExportedWork.Written written) {
        return written.filesByKind().stream().mapToInt(ExportedWork.KindFiles::files).sum();
    }

    private static void wrote(final Path tree, final String name, final String source) throws IOException {
        final Path sources = tree.resolve("engine").resolve("src").resolve("main").resolve("java");
        Files.createDirectories(sources);
        Files.writeString(sources.resolve(name), source);
    }
}
