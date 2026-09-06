package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads the IANA JOSE registries' published CSVs into the bundled TSV.
 *
 * <p>The registries state no revision, so the file set itself is the citation: whatever is read is
 * accepted only if it digests to the recorded value, so a copy that is not the file set this class cites
 * fails instead of being bundled. The CSVs are read from a local directory — {@code -Psource=<path>} —
 * one file per registry as IANA serves them at
 * {@code https://www.iana.org/assignments/jose/<registry>.csv}.
 */
public final class JoseTermsExtraction {

    private static final String SOURCE =
            "IANA JSON Object Signing and Encryption registries, https://www.iana.org/assignments/jose/ "
                    + "(web-signature-encryption-header-parameters.csv, "
                    + "web-signature-encryption-algorithms.csv, web-encryption-compression-algorithms.csv, "
                    + "web-key-types.csv, web-key-elliptic-curve.csv, web-key-parameters.csv, "
                    + "web-key-use.csv, web-key-operations.csv, web-key-set-parameters.csv), "
                    + "retrieved 2026-09-06";

    /** The registries with published CSVs, in the order the digest covers them, each with what a row is. */
    static final List<Registry> REGISTRIES = List.of(
            new Registry("web-signature-encryption-header-parameters", "header-parameter"),
            new Registry("web-signature-encryption-algorithms", "algorithm"),
            new Registry("web-encryption-compression-algorithms", "compression-algorithm"),
            new Registry("web-key-types", "key-type"),
            new Registry("web-key-elliptic-curve", "curve"),
            new Registry("web-key-parameters", "key-parameter"),
            new Registry("web-key-use", "key-use"),
            new Registry("web-key-operations", "key-operation"),
            new Registry("web-key-set-parameters", "key-set-parameter"));

    /** One registry: the file IANA serves it as, and the noun its rows register. */
    record Registry(String name, String kind) {
    }

    private final JoseConcepts concepts = new JoseConcepts();

    private final JoseTermsTsv tsv = new JoseTermsTsv();

    private final PinnedSet source = new PinnedSet(SOURCE, "registry CSVs",
            "17839e9c6c950c4708ece4c17a6a376df850ff79d76311f9bcc5cdee677dd1be");

    public void extract(final Path directory, final Path output) throws IOException {
        final List<ContentDigest.Member> read = source.pinned(readAll(directory));
        final List<SkosConcept> registered = read.stream()
                .flatMap(member -> registrationsOf(member).stream())
                .toList();
        new BundledResource(output).written(rendered(registered));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> registered) {
        return tsv.render(registered, source.citation(), source.digest());
    }

    PinnedSet source() {
        return source;
    }

    private List<SkosConcept> registrationsOf(final ContentDigest.Member member) {
        final String registry = member.name().replace(".csv", "");
        return concepts.in(registry, kindOf(registry),
                new String(member.bytes(), StandardCharsets.UTF_8));
    }

    private static String kindOf(final String registry) {
        return REGISTRIES.stream()
                .filter(candidate -> candidate.name().equals(registry))
                .findFirst()
                .orElseThrow()
                .kind();
    }

    private static List<ContentDigest.Member> readAll(final Path directory) {
        return REGISTRIES.stream()
                .map(registry -> registry.name() + ".csv")
                .map(file -> {
                    try {
                        return new ContentDigest.Member(file, Files.readAllBytes(directory.resolve(file)));
                    } catch (final IOException e) {
                        throw new IllegalArgumentException(String.format(Locale.ROOT,
                                "The registry directory is missing %s",
                                file), e);
                    }
                })
                .toList();
    }
}
