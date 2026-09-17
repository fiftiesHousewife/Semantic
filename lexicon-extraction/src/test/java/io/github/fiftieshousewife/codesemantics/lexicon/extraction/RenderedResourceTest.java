package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosRows;

import static org.assertj.core.api.Assertions.assertThat;

class RenderedResourceTest {

    private static final int FIBO_ONTOLOGIES_NAMED = 106;

    private static final String NIST_CATALOG_VERSION = "1.2.0";


    @Test
    void arxivTaxonomyIsWhatItsRendererWrites() throws IOException {
        assertThat(new ArxivTaxonomyExtraction().rendered(SkosRows.in("arxiv-taxonomy.tsv")))
                .isEqualTo(committed("arxiv-taxonomy.tsv"));
    }

    @Test
    void oliaTermsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new OliaTermsExtraction().rendered(SkosRows.in("olia-terms.tsv")))
                .isEqualTo(committed("olia-terms.tsv"));
    }

    @Test
    void bianServiceDomainsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new BianServiceDomainsExtraction().rendered(SkosRows.in("bian-service-domains.tsv")))
                .isEqualTo(committed("bian-service-domains.tsv"));
    }

    @Test
    void csoTopicsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new CsoTopicsExtraction().rendered(SkosRows.in("cso-topics.tsv")))
                .isEqualTo(committed("cso-topics.tsv"));
    }

    @Test
    void cweTermsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new CweTermsExtraction().rendered(SkosRows.in("cwe-terms.tsv")))
                .isEqualTo(committed("cwe-terms.tsv"));
    }

    @Test
    void fiboTermsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new FiboTermsExtraction().rendered(SkosRows.in("fibo-terms.tsv"),
                FIBO_ONTOLOGIES_NAMED))
                .isEqualTo(committed("fibo-terms.tsv"));
    }

    @Test
    void fixTermsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new FixTermsExtraction().rendered(SkosRows.in("fix-terms.tsv")))
                .isEqualTo(committed("fix-terms.tsv"));
    }

    @Test
    void fpmlTermsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new FpmlTermsExtraction().rendered(SkosRows.in("fpml-terms.tsv")))
                .isEqualTo(committed("fpml-terms.tsv"));
    }

    @Test
    void mediaTypesAreWhatTheirRendererWrites() throws IOException {
        assertThat(new MediaTypeExtraction().rendered(SkosRows.in("media-types.tsv")))
                .isEqualTo(committed("media-types.tsv"));
    }

    @Test
    void nistCsfFunctionsAreWhatTheirRendererWrites() throws IOException {
        assertThat(new NistCsfExtraction().rendered(SkosRows.in("nist-csf-functions.tsv"),
                NIST_CATALOG_VERSION))
                .isEqualTo(committed("nist-csf-functions.tsv"));
    }


    private static String committed(final String resource) throws IOException {
        try (InputStream stream = RenderedResourceTest.class.getResourceAsStream("/" + resource)) {
            return new String(stream.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
