package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ExecutionSpecTermsExtractionTest {

    @TempDir
    private Path checkout;

    @Test
    void refusesACheckoutThatIsNotTheRevisionTheHeaderWouldCite() throws IOException {
        final Path fork = checkout.resolve("src/ethereum/forks/bpo2");
        Files.createDirectories(fork);
        Files.write(fork.resolve("__init__.py"), List.of(
                "\"\"\"Fork prose.\"\"\"",
                "FORK_CRITERIA: ForkCriteria = ByTimestamp(1767747671)"));

        assertThatThrownBy(() -> new ExecutionSpecTermsExtraction()
                .extract(checkout, checkout.resolve("out.tsv")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("df6dbdca52989902abd09cc4603cfab4922d5cf13cf0b2a3653e4aa7db3f0a91");
    }
}
