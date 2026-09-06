package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads the FpML 5.11 confirmation schemas into the bundled TSV, from a checkout of the HandCoded toolkit
 * repository, which vendors each FpML release whole: {@code -Psource=<path to a fpml-toolkit-java checkout>}.
 *
 * <p>The set is taken at a pinned commit rather than at a branch, for the same reason every citation this
 * library renders is a permalink. The set is the schema files of the release's confirmation view, and it is
 * accepted only if together they digest to the value recorded here — a checkout of any other revision
 * fails instead of being bundled.
 */
public final class FpmlTermsExtraction {

    private static final String REVISION = "cf7a6cba14470313505559e662252cff8d3afda5";

    private static final String SCHEMAS = "files-fpml/schemas/fpml5-11/confirmation";

    private final FpmlConcepts concepts = new FpmlConcepts();

    private final FpmlTermsTsv tsv = new FpmlTermsTsv();

    private final PinnedSet source = new PinnedSet(
            "https://github.com/handcoded/fpml-toolkit-java/tree/" + REVISION, "schemas",
            "b22291af8343d847590f8b0512475b189dc55f18cee460ab35328ebb0bd0aba4");

    public void extract(final Path checkout, final Path output) throws IOException {
        final List<ContentDigest.Member> schemas = source.pinned(schemasUnder(checkout));
        new BundledResource(output).written(rendered(concepts.in(schemas)));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read) {
        return tsv.render(read, source.citation(), source.digest());
    }

    PinnedSet source() {
        return source;
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
}
