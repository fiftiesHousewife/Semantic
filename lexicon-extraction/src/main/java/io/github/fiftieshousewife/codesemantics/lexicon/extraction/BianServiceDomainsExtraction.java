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
 * Reads the BIAN Service Landscape into the bundled TSV, from the artefacts repository's one specification
 * file per service domain.
 *
 * <p>The set is taken at a pinned commit rather than at a branch, for the same reason every citation this
 * library renders is a permalink. The repository states no manifest, so the set is the specification files
 * a checkout holds, and it is accepted only if together they digest to the value recorded here — a checkout
 * of any other revision fails instead of being bundled. It reads a checkout, as the FIBO extraction does:
 * {@code -Psource=<path to an artefacts checkout>}.
 */
public final class BianServiceDomainsExtraction {

    private static final String REVISION = "a928c56e7989492f7214b2bd0ae7b204644efc03";

    private static final String SPECIFICATION = "Specification.csv";

    private final BianConcepts concepts = new BianConcepts();

    private final BianServiceDomainsTsv tsv = new BianServiceDomainsTsv();

    private final PinnedSet source = new PinnedSet(
            "https://github.com/bian-official/artefacts/tree/" + REVISION, "specifications",
            "a6eca3a102942b5cc699653f243c24cfe1923f6bb580cd99a9655e38ba49fa19");

    public void extract(final Path checkout, final Path output) throws IOException {
        final List<ContentDigest.Member> specifications = source.pinned(specificationsUnder(checkout));
        new BundledResource(output).written(rendered(concepts.in(specifications)));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read) {
        return tsv.render(read, source.citation(), source.digest());
    }

    PinnedSet source() {
        return source;
    }

    /** Every service domain's specification file, in the order the sorted directory names give. */
    private static List<ContentDigest.Member> specificationsUnder(final Path checkout) throws IOException {
        final List<ContentDigest.Member> specifications = new ArrayList<>();
        try (Stream<Path> entries = Files.list(checkout)) {
            for (final Path domain : entries.filter(Files::isDirectory)
                    .sorted(Comparator.comparing(path -> path.getFileName().toString())).toList()) {
                final String name = domain.getFileName().toString();
                final Path specification = domain.resolve(name + SPECIFICATION);
                if (Files.isRegularFile(specification)) {
                    specifications.add(new ContentDigest.Member(name + "/" + name + SPECIFICATION,
                            Files.readAllBytes(specification)));
                }
            }
        }
        return specifications;
    }
}
