package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class ProvidedServicesTest {

    @TempDir
    private Path root;

    private void register(final String sourceSet, final String serviceInterface, final String... providers)
            throws IOException {
        final Path file = root.resolve("core/src/" + sourceSet + "/resources/META-INF/services/" + serviceInterface);
        Files.createDirectories(file.getParent());
        Files.writeString(file, String.join("\n", providers));
    }

    @Test
    void readsEachRegistryFileAsTheInterfaceItNamesAndCountsItsProviders() throws IOException {
        register("main", "org.apache.tika.parser.Parser", "org.apache.tika.parser.AutoDetectParser",
                "org.apache.tika.parser.EmptyParser");
        register("main", "org.apache.tika.detect.Detector", "org.apache.tika.detect.TypeDetector");
        assertThat(ProvidedServices.statedUnder(root).registrations())
                .extracting(ProvidedServices.Registration::serviceInterface,
                        ProvidedServices.Registration::providers)
                .containsExactly(
                        tuple("org.apache.tika.detect.Detector", 1),
                        tuple("org.apache.tika.parser.Parser", 2));
    }

    @Test
    void leavesOutCommentAndBlankLinesBecauseTheContractSaysTheyNameNoProvider() throws IOException {
        register("main", "org.apache.tika.parser.Parser", "# the provider below is the default", "",
                "org.apache.tika.parser.AutoDetectParser");
        assertThat(ProvidedServices.statedUnder(root).registrations())
                .extracting(ProvidedServices.Registration::providers)
                .containsExactly(1);
    }

    @Test
    void refusesARegistryOutsideASourceSetsResources() throws IOException {
        final Path built = root.resolve("core/build/resources/main/META-INF/services/org.example.Made");
        Files.createDirectories(built.getParent());
        Files.writeString(built, "org.example.MadeImpl");
        assertThat(ProvidedServices.statedUnder(root).registrations()).isEmpty();
    }

    @Test
    void honoursTheExclusionsTheRepositoryStates() throws IOException {
        Files.writeString(root.resolve(".readingignore"), "vendored/**\n");
        register("main", "org.apache.tika.parser.Parser", "org.apache.tika.parser.AutoDetectParser");
        final Path vendored =
                root.resolve("vendored/src/main/resources/META-INF/services/org.example.Elsewhere");
        Files.createDirectories(vendored.getParent());
        Files.writeString(vendored, "org.example.ElsewhereImpl");
        assertThat(ProvidedServices.statedUnder(root).registrations())
                .extracting(ProvidedServices.Registration::serviceInterface)
                .containsExactly("org.apache.tika.parser.Parser");
    }

    @Test
    void statesNothingWhereATreeRegistersNothing() {
        assertThat(ProvidedServices.statedUnder(root).registrations()).isEmpty();
    }
}
