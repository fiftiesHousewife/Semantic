package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BundledTaxonomiesTest {

    @Test
    void namesEachTaxonomyAfterThePublisherItsOwnHeaderStates() {
        assertAll(
                () -> assertThat(BundledTaxonomies.OLIA.source()).isEqualTo("OLiA"),
                () -> assertThat(BundledTaxonomies.CSO.source()).isEqualTo("CSO"),
                () -> assertThat(BundledTaxonomies.FIBO.source()).isEqualTo("FIBO"),
                () -> assertThat(BundledTaxonomies.FPML.source()).isEqualTo("FpML"),
                () -> assertThat(BundledTaxonomies.FIX.source()).isEqualTo("FIX"),
                () -> assertThat(BundledTaxonomies.CWE.source()).isEqualTo("CWE"),
                () -> assertThat(BundledTaxonomies.BIAN.source()).isEqualTo("BIAN"));
    }

    @Test
    void namesTheIndexAfterTheSameThingTheHeaderDoes() {
        assertThat(BundledTaxonomies.values()).allSatisfy(taxonomy ->
                assertThat(taxonomy.index().source()).isEqualTo(taxonomy.source()));
    }

    @Test
    void statesThePublishedConceptsOfEachTaxonomy() {
        assertThat(BundledTaxonomies.values())
                .allSatisfy(taxonomy -> assertThat(taxonomy.publishedConcepts()).isNotEmpty());
    }

    @Test
    void readsEveryStatementOffTheResourcesOwnHeader() {
        assertThat(BundledTaxonomies.values()).allSatisfy(taxonomy -> assertAll(
                () -> assertThat(taxonomy.description()).isNotBlank(),
                () -> assertThat(taxonomy.subject()).isNotBlank(),
                () -> assertThat(taxonomy.publishedAt()).startsWith("https://")));
    }

    @Test
    void matchesEveryTaxonomyBesideTheOneAReadingAlreadyHolds() {
        assertThat(BundledTaxonomies.besides(BundledTaxonomies.OLIA))
                .hasSize(BundledTaxonomies.values().length - 1)
                .noneMatch(index -> index.source().equals(BundledTaxonomies.OLIA.source()));
    }

    @Test
    void readsATreeAgainstEveryBundledTaxonomyTheSameWay(@TempDir final Path root) throws IOException {
        final Path source = root.resolve("src/main/java");
        Files.createDirectories(source);
        Files.writeString(source.resolve("Swap.java"),
                "class InterestRateSwap { int termDeposit; int creditDefaultSwap; int settlDate; "
                        + "int useAfterFree; }");
        final ParsedRepository parsed = ParsedRepository.of(root, new JavaSourceScopes().under(root));

        assertAll(
                () -> assertThat(termsOf(BundledTaxonomies.FIBO, parsed)).contains("interest rate swap"),
                () -> assertThat(termsOf(BundledTaxonomies.FPML, parsed)).contains("credit default swap"),
                () -> assertThat(termsOf(BundledTaxonomies.FIX, parsed)).contains("settl date"),
                () -> assertThat(termsOf(BundledTaxonomies.CWE, parsed)).contains("use after free"),
                () -> assertThat(termsOf(BundledTaxonomies.BIAN, parsed)).contains("term deposit"));
    }

    private static java.util.List<String> termsOf(final BundledTaxonomies taxonomy,
                                                  final ParsedRepository parsed) {
        return taxonomy.reading(parsed).every().sightings().stream().map(TermSighting::term).toList();
    }
}
