package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class JoseTermsExtractionTest {

    private final JoseTermsExtraction extraction = new JoseTermsExtraction();

    @Test
    void refusesAFileSetThatIsNotTheOneTheHeaderWouldCite(@TempDir final Path directory)
            throws IOException {
        for (final JoseTermsExtraction.Registry registry : JoseTermsExtraction.REGISTRIES) {
            Files.writeString(directory.resolve(registry.name() + ".csv"), "Value,Reference\n");
        }
        assertThatThrownBy(() -> extraction.extract(directory, directory.resolve("jose-terms.tsv")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("17839e9c6c950c4708ece4c17a6a376df850ff79d76311f9bcc5cdee677dd1be");
    }

    @Test
    void refusesADirectoryMissingARegistry(@TempDir final Path directory) {
        assertThatThrownBy(() -> extraction.extract(directory, directory.resolve("jose-terms.tsv")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("web-signature-encryption-header-parameters.csv");
    }
}
