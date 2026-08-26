package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Locale;
import java.util.zip.ZipFile;

/**
 * Reduces the eXtended WordNet Domains distribution to the bundled one-domain-per-synset table, keyed by
 * sense key through WordNet 3.0's own sense index.
 *
 * <p>Both inputs are handed over by path — the extraction JVM has no network route in agent sessions —
 * and each is accepted only where its bytes digest to the recorded constant, so the table can only ever
 * be built from the distribution and the index it says it was built from.
 */
public final class XwndDomainsExtraction {

    static final String SOURCE_URL = "https://adimen.ehu.eus/web/files/XWND/xwnd-30g.tgz";
    static final String ARCHIVE_SHA256 =
            "bf7e85e57db36771a926649d4cfddad579e87c3f925cc3ab68465a0304555aac";
    static final String INDEX_URL =
            "https://repo1.maven.org/maven2/net/sf/extjwnl/extjwnl-data-wn30/1.2/extjwnl-data-wn30-1.2.jar";
    static final String INDEX_SHA256 =
            "67ce20a24eeb03ccb604327761e4c7958fc761016f6833384493b7479fb3ad70";

    private static final String INDEX_ENTRY = "net/sf/extjwnl/data/wordnet/wn30/index.sense";
    private static final Path OUT = Path.of("lexicon/src/main/resources/xwnd-domains.tsv");

    private XwndDomainsExtraction() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Path archive = Path.of(arguments[0]);
        final Path index = Path.of(arguments[1]);
        accept(archive, ARCHIVE_SHA256, "the XWND distribution");
        accept(index, INDEX_SHA256, "the WordNet 3.0 data artefact");
        try (InputStream vectors = Files.newInputStream(archive);
             ZipFile jar = new ZipFile(index.toFile());
             InputStream senses = jar.getInputStream(jar.getEntry(INDEX_ENTRY))) {
            Files.writeString(OUT, new XwndDomainsTsv().render(XwndConcepts.in(vectors, senses),
                    SOURCE_URL, ARCHIVE_SHA256, INDEX_URL, INDEX_SHA256));
        }
    }

    /** The file's bytes must digest to the recorded constant, or nothing is read from it. */
    static void accept(final Path file, final String recorded, final String what) throws IOException {
        final String digest = sha256(file);
        if (!recorded.equals(digest)) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "The file at %s digests to %s where %s digests to %s. A table built from unverified "
                            + "bytes states a provenance it does not have.",
                    file, digest, what, recorded));
        }
    }

    private static String sha256(final Path file) throws IOException {
        try {
            return HexFormat.of().formatHex(
                    MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(file)));
        } catch (final NoSuchAlgorithmException e) {
            throw new IllegalStateException("Every JVM ships SHA-256", e);
        }
    }
}
