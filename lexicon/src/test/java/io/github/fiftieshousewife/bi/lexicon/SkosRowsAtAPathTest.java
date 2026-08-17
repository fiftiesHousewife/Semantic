package io.github.fiftieshousewife.bi.lexicon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.junit.jupiter.api.Assertions.assertAll;

class SkosRowsAtAPathTest {

    @TempDir
    private Path directory;

    private Path taxonomy(final String... lines) throws IOException {
        final Path file = directory.resolve("taxonomy.tsv");
        Files.write(file, List.of(lines));
        return file;
    }

    @Test
    void readsTheSameEightColumnsFromAPathAsFromTheClasspath() throws IOException {
        final Path file = taxonomy("# a provenance header nobody reads as a row",
                "AccountReconciliation\tAccount Reconciliation\t\tAccounting Services\tservice-domain"
                        + "\tOperations\tMatch and reconcile accounts\t");

        final List<SkosConcept> concepts = SkosRows.at(file);

        assertAll(
                () -> assertThat(concepts).hasSize(1),
                () -> assertThat(concepts.getFirst().concept()).isEqualTo("AccountReconciliation"),
                () -> assertThat(concepts.getFirst().prefLabel()).isEqualTo("Account Reconciliation"),
                () -> assertThat(concepts.getFirst().broader()).isEqualTo("Accounting Services"),
                () -> assertThat(concepts.getFirst().module()).isEqualTo("Operations"),
                () -> assertThat(concepts.getFirst().definition()).isEqualTo("Match and reconcile accounts"));
    }

    @Test
    void refusesARowOfTheWrongWidthRatherThanReadingEveryColumnAsItsNeighbour() throws IOException {
        final Path file = taxonomy("TooShort\tToo Short\tonly three columns");

        assertThatIllegalStateException().isThrownBy(() -> SkosRows.at(file))
                .withMessageContaining("3 columns");
    }

    @Test
    void namesTheFileItCouldNotReadRatherThanFailingAnonymously() {
        final Path missing = directory.resolve("absent.tsv");

        assertThatIllegalStateException().isThrownBy(() -> SkosRows.at(missing))
                .withMessageContaining("absent.tsv");
    }
}
