package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * Reads the FpML 5.11 confirmation schemas into the bundled TSV, from a checkout of the HandCoded toolkit
 * repository, which vendors each FpML release whole: {@code -Pfpml=<path to a fpml-toolkit-java checkout>}.
 *
 * <p>The set is taken at a pinned commit rather than at a branch, for the same reason every citation this
 * library renders is a permalink. The set is the schema files of the release's confirmation view, and it is
 * accepted only if together they digest to the value recorded here — a checkout of any other revision
 * fails instead of being bundled.
 */
public final class FpmlTermsExtraction {

    private static final String REVISION = "cf7a6cba14470313505559e662252cff8d3afda5";

    private static final String SOURCE = "https://github.com/handcoded/fpml-toolkit-java/tree/" + REVISION;

    private static final String SCHEMAS = "files-fpml/schemas/fpml5-11/confirmation";

    private static final String SET_DIGEST =
            "b22291af8343d847590f8b0512475b189dc55f18cee460ab35328ebb0bd0aba4";

    private final FpmlConcepts concepts = new FpmlConcepts();

    private final FpmlTermsTsv tsv = new FpmlTermsTsv();

    private final ContentDigest digest = new ContentDigest();

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: FpmlTermsExtraction <toolkit checkout> <tsv>");
        }
        new FpmlTermsExtraction().extract(Path.of(args[0]), Path.of(args[1]));
    }

    public void extract(final Path checkout, final Path output) throws IOException {
        final List<ContentDigest.Member> schemas = schemasUnder(checkout);
        asRecorded(schemas);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(concepts.in(schemas), SOURCE, SET_DIGEST));
    }

    /** Every schema file of the confirmation view, in the order the sorted file names give. */
    private static List<ContentDigest.Member> schemasUnder(final Path checkout) throws IOException {
        final List<ContentDigest.Member> schemas = new ArrayList<>();
        try (Stream<Path> entries = Files.list(checkout.resolve(SCHEMAS))) {
            for (final Path schema : entries.filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().endsWith(".xsd"))
                    .sorted(Comparator.comparing(path -> path.getFileName().toString())).toList()) {
                schemas.add(new ContentDigest.Member(schema.getFileName().toString(),
                        Files.readAllBytes(schema)));
            }
        }
        return schemas;
    }

    /** The checkout is the pinned revision's only if its schema set digests to what was recorded. */
    List<ContentDigest.Member> asRecorded(final List<ContentDigest.Member> schemas) {
        final String found = digest.of(schemas);
        if (!SET_DIGEST.equals(found)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "The %s schemas read digest to %s, where revision %s holds %s",
                    schemas.size(), found, REVISION, SET_DIGEST));
        }
        return schemas;
    }
}
