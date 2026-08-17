package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Reads FIBO's production T-Box into the bundled TSV, from the hundred-odd ontologies its own manifest names.
 *
 * <p>The set is taken at a pinned commit rather than at a branch, for the same reason every citation this
 * library renders is a permalink. Two things are checked before anything is written: the manifest is the blob
 * that commit holds, and the ontologies it names digest to the set recorded here. The first says the list of
 * members is the publisher's; the second says the members are the ones that commit held. Either check failing
 * fails the extraction rather than bundling something the header would then misdescribe.
 *
 * <p>It reads a checkout — there is no useful "fetch it yourself" path for a hundred files behind one
 * commit, and a clone is what a person running this already has. {@code -Pfibo=<path to a FIBO checkout>}.
 */
public final class FiboTermsExtraction {

    private static final String REVISION = "119fa8c091aa4beece7d22aefa6fe138021a4355";

    private static final String SOURCE = "https://github.com/edmcouncil/fibo/tree/" + REVISION;

    private static final String MANIFEST = "AboutFIBOProd-TBoxOnly.rdf";

    private static final String MANIFEST_BLOB = "69b9b10debbd5ad37e62a302d04e37ecbc063cc0";

    private static final String ONTOLOGY_SET_DIGEST =
            "4799041cdc99a1d970e4f6a6285bd17d981ef71e51e1e156017158957271748f";

    private final FiboManifest manifest = new FiboManifest();

    private final OwlClasses classes = new OwlClasses();

    private final FiboConcepts concepts = new FiboConcepts();

    private final FiboTermsTsv tsv = new FiboTermsTsv();

    private final PinnedSource source = new PinnedSource(
            URI.create("https://raw.githubusercontent.com/edmcouncil/fibo/" + REVISION + "/" + MANIFEST),
            REVISION, MANIFEST_BLOB);

    private final ContentDigest digest = new ContentDigest();

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: FiboTermsExtraction <fibo checkout> <tsv>");
        }
        new FiboTermsExtraction().extract(Path.of(args[0]), Path.of(args[1]));
    }

    public void extract(final Path checkout, final Path output) throws IOException {
        final byte[] read = source.pinned(Files.readAllBytes(checkout.resolve(MANIFEST)));
        final List<String> ontologies = manifest.ontologiesIn(read);
        final List<ContentDigest.Member> members = membersOf(checkout, ontologies);
        final List<OwlClass> owl = merged(members);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(concepts.in(owl), SOURCE, ontologies.size(), asRecorded(members)));
    }

    PinnedSource source() {
        return source;
    }

    /** And the ontologies it names are that revision's only if together they digest to what was recorded. */
    String asRecorded(final List<ContentDigest.Member> members) {
        final String found = digest.of(members);
        if (!ONTOLOGY_SET_DIGEST.equals(found)) {
            throw new IllegalArgumentException("The " + members.size() + " ontologies read digest to "
                    + found + ", where revision " + REVISION + " holds " + ONTOLOGY_SET_DIGEST);
        }
        return found;
    }

    private static List<ContentDigest.Member> membersOf(final Path checkout, final List<String> ontologies)
            throws IOException {
        final List<ContentDigest.Member> members = new ArrayList<>();
        for (final String ontology : ontologies) {
            members.add(new ContentDigest.Member(ontology,
                    Files.readAllBytes(checkout.resolve(ontology))));
        }
        return members;
    }

    /**
     * One vocabulary out of a hundred documents. A concept is stated in one of them and referred to from
     * several, so the same URI arrives more than once and the statements pool exactly as they do when one
     * document writes a class out twice.
     */
    private List<OwlClass> merged(final List<ContentDigest.Member> members) {
        final Map<String, OwlClass> byConcept = new LinkedHashMap<>();
        members.forEach(member -> classes.in(member.bytes()).forEach(owl ->
                byConcept.merge(owl.concept(), owl, FiboTermsExtraction::pooled)));
        return List.copyOf(byConcept.values());
    }

    private static OwlClass pooled(final OwlClass known, final OwlClass also) {
        final Map<String, List<String>> annotations = new LinkedHashMap<>(known.annotations());
        also.annotations().forEach((property, values) -> annotations.merge(property, values,
                (before, after) -> java.util.stream.Stream.concat(before.stream(), after.stream()).toList()));
        return new OwlClass(known.concept(), known.id(),
                known.broader().isEmpty() ? also.broader() : known.broader(), annotations);
    }
}
