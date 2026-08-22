package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReferenceCorpusTest {

    private static final String DIRECTORY = "cs.corpus.dir";
    private static final String MANIFEST = "cs.corpus.manifest";

    @AfterEach
    void forgetWhatTheRunNamed() {
        System.clearProperty(DIRECTORY);
        System.clearProperty(MANIFEST);
    }

    private String git(final Path in, final String... arguments) throws IOException, InterruptedException {
        final List<String> command = new ArrayList<>(List.of("git", "-C", in.toString()));
        command.addAll(List.of(arguments));
        final Process ran = new ProcessBuilder(command).redirectErrorStream(true).start();
        final String said = new String(ran.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
        assertThat(ran.waitFor()).as("%s said %s", String.join(" ", command), said).isZero();
        return said;
    }

    @Test
    void refusesToReadCorpusClonesTheRunNeverNamed() {
        assertThatThrownBy(ReferenceCorpus::directory)
                .as("a corpus run without a corpus is a question never asked, and an empty denominator "
                        + "demotes nothing exactly as a reference with nothing to demote does")
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining(DIRECTORY);
    }

    @Test
    void readsTheDirectoryTheRunNames(@TempDir final Path corpus) {
        System.setProperty(DIRECTORY, corpus.toString());

        assertThat(ReferenceCorpus.directory()).isEqualTo(corpus.toAbsolutePath().normalize());
    }

    @Test
    void refusesADrawThisModuleDoesNotRecord() {
        assertThatThrownBy(() -> ReferenceCorpus.drawn("/no-such-draw.tsv"))
                .as("a sample named but not recorded is a question never asked, and an absent denominator "
                        + "reads exactly like one with nothing to demote")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void readsTheUniformDrawWhereTheRunNamesNoManifest() {
        assertThat(ReferenceCorpus.manifest().repositories())
                .as("the ordinary case states no path; a perturbation states one")
                .hasSize(10);
    }

    @Test
    void readsTheManifestTheRunNamesInsteadOfTheOneItBundles(@TempDir final Path directory)
            throws IOException {
        final Path named = directory.resolve("another-draw.tsv");
        Files.write(named, List.of("# a second sample", "one\thttps://example.invalid/one.git\tabc\tMIT"));
        System.setProperty(MANIFEST, named.toString());

        assertThat(ReferenceCorpus.manifest().repositories())
                .extracting(repository -> repository.name())
                .containsExactly("one");
    }

    @Test
    void fetchesEveryRepositoryTheNamedManifestPins(@TempDir final Path origin,
                                                    @TempDir final Path directory,
                                                    @TempDir final Path corpus)
            throws IOException, InterruptedException {
        git(origin, "init", "--quiet", "--initial-branch=main");
        Files.writeString(origin.resolve("Pricer.java"), "class Pricer { }\n");
        git(origin, "add", ".");
        git(origin, "-c", "user.name=A Tester", "-c", "user.email=tester@example.invalid",
                "commit", "--quiet", "-m", "one commit");
        final String sha = git(origin, "rev-parse", "HEAD");
        final Path named = directory.resolve("local-draw.tsv");
        Files.write(named, List.of("pricer\t" + origin.toUri() + "\t" + sha + "\tApache-2.0"));
        System.setProperty(MANIFEST, named.toString());
        System.setProperty(DIRECTORY, corpus.toString());

        CorpusFetchCommand.main(new String[0]);

        assertAll(
                () -> assertThat(corpus.resolve("pricer/Pricer.java")).exists(),
                () -> assertThat(git(corpus.resolve("pricer"), "rev-parse", "HEAD")).isEqualTo(sha));
    }
}
