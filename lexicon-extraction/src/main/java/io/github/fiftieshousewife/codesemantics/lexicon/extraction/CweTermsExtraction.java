package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads the CWE catalog into the bundled TSV, from the one XML file the OWASP SDK repository vendors:
 * {@code -Psource=<path to cwe-archive.xml>}, or the permalink itself where a network route exists.
 *
 * <p>The file is taken at a pinned commit rather than at a branch, for the same reason every citation this
 * library renders is a permalink, and it is accepted only if git would give its bytes the blob id that
 * revision holds.
 */
public final class CweTermsExtraction {

    private static final String REVISION = "477ff29b8a6fcb0c5e8fe7234f0af736d41c203c";

    private static final String SOURCE =
            "https://github.com/OWASP/cwe-sdk-javascript/tree/" + REVISION;

    private static final String CATALOG_BLOB = "8338e6520a20df70ca3f7b8cb7768750a842165f";

    private final CweConcepts concepts = new CweConcepts();

    private final CweTermsTsv tsv = new CweTermsTsv();

    private final PinnedSource source = new PinnedSource(
            URI.create("https://raw.githubusercontent.com/OWASP/cwe-sdk-javascript/"
                    + REVISION + "/raw/cwe-archive.xml"),
            REVISION, CATALOG_BLOB);

    public void extract(final String catalog, final Path output) throws IOException {
        final byte[] read = source.read(catalog);
        new BundledResource(output).written(rendered(concepts.in(read)));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read) {
        return tsv.render(read, SOURCE, CATALOG_BLOB);
    }

    PinnedSource source() {
        return source;
    }
}
