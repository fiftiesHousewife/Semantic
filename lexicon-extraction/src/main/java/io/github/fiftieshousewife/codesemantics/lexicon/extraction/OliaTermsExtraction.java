package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;

/**
 * Reads OLiA's core ontology into the bundled TSV. The ontology is taken at a pinned revision rather than at
 * a branch, for the same reason every citation this library renders is a permalink: a reading that cannot be
 * reproduced is not a citation.
 *
 * <p>Whatever it reads — the published ontology or the copy {@code -Psource} names — is accepted
 * only if git would give it the blob id that revision holds. So an extraction run without a network route
 * still writes the permalink as its source, having shown rather than assumed that it read what the permalink
 * holds, and a fetch answered by something other than the ontology fails instead of being bundled.
 */
public final class OliaTermsExtraction {

    private static final String REVISION = "d3bd4f1aef9047b33186bfb2a1795401f3f1a4a6";

    private static final URI ONTOLOGY = URI.create("https://raw.githubusercontent.com/acoli-repo/olia/"
            + REVISION + "/owl/core/olia.owl");

    private static final String ONTOLOGY_BLOB = "5c5e8bda93eaeab2940472a167ff8d3107be8d43";

    private final OwlClasses classes = new OwlClasses();

    private final OliaConcepts concepts = new OliaConcepts();

    private final OliaTermsTsv tsv = new OliaTermsTsv();

    private final PinnedSource source = new PinnedSource(ONTOLOGY, REVISION, ONTOLOGY_BLOB);

    public void extract(final String ontology, final Path output) throws IOException {
        final byte[] read = source.read(ontology);
        new BundledResource(output).written(tsv.render(concepts.in(classes.in(read)), source.permalink()));
    }

    PinnedSource source() {
        return source;
    }
}
