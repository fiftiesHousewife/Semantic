package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;

class TestResourceScopeTest {

    @TempDir
    private Path root;

    private final TestResourceScope scope = new TestResourceScope();

    private void fixture(final String path) throws IOException {
        final Path file = root.resolve(path);
        Files.createDirectories(file.getParent());
        Files.writeString(file, "somebody else's document");
    }

    private List<String> read() {
        return scope.under(root).stream()
                .flatMap(found -> found.files().stream())
                .map(file -> root.relativize(file).toString())
                .toList();
    }

    @Test
    void readsEveryFixtureUnderATestResourcesDirectoryAndNamesTheScopeAfterIt() throws IOException {
        fixture("core/src/test/resources/test-documents/testEXCEL.xls");
        fixture("core/src/main/resources/shipped.xml");
        fixture("core/src/test/java/ReadingTest.java");
        assertThat(scope.under(root))
                .satisfiesExactly(found -> {
                    assertThat(found.name())
                            .isEqualTo(Path.of("core", "src", "test", "resources").toString());
                    assertThat(found.files())
                            .containsExactly(root.resolve(
                                    "core/src/test/resources/test-documents/testEXCEL.xls"));
                });
    }

    @Test
    void leavesOutTheDirectoryTheJarSpecificationReserves() throws IOException {
        fixture("core/src/test/resources/META-INF/services/org.apache.tika.parser.Parser");
        fixture("core/src/test/resources/testPDF.pdf");
        assertThat(read()).containsExactly(
                Path.of("core", "src", "test", "resources", "testPDF.pdf").toString());
    }

    @Test
    void honoursTheExclusionsTheRepositoryStates() throws IOException {
        Files.writeString(root.resolve(".readingignore"), "vendored/**\n");
        fixture("vendored/src/test/resources/testPDF.pdf");
        assertThat(scope.under(root)).isEmpty();
    }

    @Test
    void abstainsWhereATreeCarriesNoTestResources() {
        assertThat(scope.under(root)).isEmpty();
    }
}
