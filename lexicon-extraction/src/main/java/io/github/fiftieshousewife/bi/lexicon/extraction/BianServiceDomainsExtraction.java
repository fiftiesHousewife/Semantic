package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Reads the BIAN Service Landscape into the bundled TSV, from the artefacts repository's one specification
 * file per service domain.
 *
 * <p>The set is taken at a pinned commit rather than at a branch, for the same reason every citation this
 * library renders is a permalink. The repository states no manifest, so the set is the specification files
 * a checkout holds, and it is accepted only if together they digest to the value recorded here — a checkout
 * of any other revision fails instead of being bundled. It reads a checkout, as the FIBO extraction does:
 * {@code -Pbian=<path to an artefacts checkout>}.
 */
public final class BianServiceDomainsExtraction {

    private static final String REVISION = "a928c56e7989492f7214b2bd0ae7b204644efc03";

    private static final String SOURCE = "https://github.com/bian-official/artefacts/tree/" + REVISION;

    private static final String SPECIFICATION = "Specification.csv";

    private static final String SET_DIGEST =
            "a6eca3a102942b5cc699653f243c24cfe1923f6bb580cd99a9655e38ba49fa19";

    private final BianConcepts concepts = new BianConcepts();

    private final BianServiceDomainsTsv tsv = new BianServiceDomainsTsv();

    private final ContentDigest digest = new ContentDigest();

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: BianServiceDomainsExtraction <artefacts checkout> <tsv>");
        }
        new BianServiceDomainsExtraction().extract(Path.of(args[0]), Path.of(args[1]));
    }

    public void extract(final Path checkout, final Path output) throws IOException {
        final List<ContentDigest.Member> specifications = specificationsUnder(checkout);
        asRecorded(specifications);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(concepts.in(specifications), SOURCE, SET_DIGEST));
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

    /** The checkout is the pinned revision's only if its specification set digests to what was recorded. */
    List<ContentDigest.Member> asRecorded(final List<ContentDigest.Member> specifications) {
        final String found = digest.of(specifications);
        if (!SET_DIGEST.equals(found)) {
            throw new IllegalArgumentException("The " + specifications.size() + " specifications read "
                    + "digest to " + found + ", where revision " + REVISION + " holds " + SET_DIGEST);
        }
        return specifications;
    }
}
