package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Reads arXiv's own taxonomy module into the bundled TSV. The module is taken at a pinned revision rather
 * than at a branch, for the same reason every citation this library renders is a permalink: a reading that
 * cannot be reproduced is not a citation.
 *
 * <p>Whatever it reads — the published module or the copy {@code -Pmodule=<path>} names — is accepted only
 * if git would give it the blob id that revision holds. So an extraction run without a network route still
 * writes the permalink as its source, having shown rather than assumed that it read what the permalink
 * holds, and a fetch answered by something other than the module fails instead of being bundled.
 */
public final class ArxivTaxonomyExtraction {

    private static final String REVISION = "a5985f621b07a4031c9e9b4f870a2206a9aa15a7";

    private static final URI MODULE = URI.create("https://raw.githubusercontent.com/arxiv/arxiv-base/"
            + REVISION + "/arxiv/taxonomy/definitions.py");

    private static final String MODULE_BLOB = "b50258d49ea7f9bdad24f3eab26e3ed7a868a8dd";

    private final ArxivTaxonomy taxonomy = new ArxivTaxonomy();

    private final ArxivConcepts concepts = new ArxivConcepts();

    private final ArxivTaxonomyTsv tsv = new ArxivTaxonomyTsv();

    private final PinnedSource source = new PinnedSource(MODULE, REVISION, MODULE_BLOB);

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: ArxivTaxonomyExtraction <module or blank> <tsv>");
        }
        new ArxivTaxonomyExtraction().extract(args[0], Path.of(args[1]));
    }

    public void extract(final String module, final Path output) throws IOException {
        final String read = new String(source.read(module), StandardCharsets.UTF_8);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(concepts.in(taxonomy.in(read)), source.permalink()));
    }

    PinnedSource source() {
        return source;
    }
}
