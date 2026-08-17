package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.junit.jupiter.api.Assertions.assertAll;

class InjectedTaxonomyTest {

    @TempDir
    private Path directory;

    private Path taxonomy() throws IOException {
        final Path file = directory.resolve("candidate.tsv");
        Files.write(file, List.of(
                "# a header the reader skips",
                "Described\tDescribed\t\tParent\tkind\tModule\tA sentence about the subject\t",
                "Undescribed\tUndescribed\t\tParent\tkind\tModule\t\t"));
        return file;
    }

    @Test
    void readsTheTaxonomyACallerNamesRatherThanTheBundledOne() throws IOException {
        final InjectedTaxonomy injected = InjectedTaxonomy.named(taxonomy());

        assertAll(
                () -> assertThat(injected.concepts()).hasSize(2),
                () -> assertThat(injected.source()).isEqualTo("candidate.tsv"));
    }

    @Test
    void offersOnlyTheConceptsStatingADescriptionBecauseAPlacementNeedsProse() throws IOException {
        assertThat(InjectedTaxonomy.named(taxonomy()).described())
                .singleElement()
                .satisfies(concept -> assertThat(concept.concept()).isEqualTo("Described"));
    }

    @Test
    void readsTheBundledTaxonomyWhereACallerNamesNone() {
        assertAll(
                () -> assertThat(InjectedTaxonomy.bundled().described()).hasSizeGreaterThan(100),
                () -> assertThat(InjectedTaxonomy.bundled().source()).isEqualTo("arxiv-taxonomy.tsv"));
    }

    @Test
    void failsRatherThanFallingBackWhereTheNamedTaxonomyCannotBeRead() {
        assertThatIllegalStateException()
                .isThrownBy(() -> InjectedTaxonomy.named(directory.resolve("absent.tsv")))
                .withMessageContaining("absent.tsv");
    }
}
