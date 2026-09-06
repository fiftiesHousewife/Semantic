package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads NIST's OSCAL edition of the Cybersecurity Framework into the bundled TSV. The catalogue is taken at
 * a pinned revision rather than at a branch, for the same reason every citation this library renders is a
 * permalink: a reading that cannot be reproduced is not a citation.
 *
 * <p>Whatever it reads — the published catalogue or the copy {@code -Psource} names — is accepted
 * only if git would give it the blob id that revision holds. So an extraction run without a network route
 * still writes the permalink as its source, having shown rather than assumed that it read what the
 * permalink holds, and a fetch answered by something other than the catalogue fails instead of being
 * bundled.
 */
public final class NistCsfExtraction {

    private static final String REVISION = "78650f02ad9321bb7b817846f8fbd4f2bcd620de";

    private static final URI CATALOG = URI.create("https://raw.githubusercontent.com/usnistgov/oscal-content/"
            + REVISION + "/nist.gov/CSF/v2.0/json/NIST_CSF_v2.0_catalog.json");

    private static final String CATALOG_BLOB = "7b8b2d8b45cbf6fca093fcc5ae9f17ca9938b425";

    private final CsfConcepts concepts = new CsfConcepts();

    private final NistCsfTsv tsv = new NistCsfTsv();

    private final PinnedSource source = new PinnedSource(CATALOG, REVISION, CATALOG_BLOB);

    public void extract(final String catalog, final Path output) throws IOException {
        final OscalCatalog document =
                new OscalCatalog(new String(source.read(catalog), StandardCharsets.UTF_8));
        new BundledResource(output).written(rendered(concepts.in(document.controls()), document.version()));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read, final String catalogVersion) {
        return tsv.render(read, catalogVersion, source.permalink());
    }

    PinnedSource source() {
        return source;
    }
}
