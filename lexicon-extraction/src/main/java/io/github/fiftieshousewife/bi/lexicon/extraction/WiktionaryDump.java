package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * The wiktextract dump on local disk, downloaded from kaikki.org when absent. An existing file is
 * trusted and never re-fetched — delete it to pick up a newer dump. The download lands in a part file
 * and is moved into place atomically, so an interrupted transfer can never pose as a complete dump.
 */
public class WiktionaryDump {

    static final URI ENGLISH_DUMP =
            URI.create("https://kaikki.org/dictionary/English/kaikki.org-dictionary-English.jsonl.gz");
    static final URI TRANSLINGUAL_DUMP =
            URI.create("https://kaikki.org/dictionary/Translingual/kaikki.org-dictionary-Translingual.jsonl.gz");

    private final URI source;
    private final Path target;

    public WiktionaryDump(final URI source, final Path target) {
        this.source = source;
        this.target = target;
    }

    public static WiktionaryDump english() {
        return new WiktionaryDump(ENGLISH_DUMP, downloadTarget("kaikki.org-dictionary-English.jsonl.gz"));
    }

    public static WiktionaryDump translingual() {
        return new WiktionaryDump(TRANSLINGUAL_DUMP,
                downloadTarget("kaikki.org-dictionary-Translingual.jsonl.gz"));
    }

    private static Path downloadTarget(final String fileName) {
        return Path.of(System.getProperty("user.home"), "Downloads", fileName);
    }

    public Path fetch() throws IOException {
        if (Files.exists(target)) {
            return target;
        }
        Files.createDirectories(target.toAbsolutePath().getParent());
        final Path partial = target.resolveSibling(target.getFileName() + ".part");
        final HttpResponse<Path> response = download(partial);
        if (response.statusCode() != 200) {
            Files.deleteIfExists(partial);
            throw new IllegalStateException("Download failed with HTTP " + response.statusCode() + ": " + source);
        }
        Files.move(partial, target, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        return target;
    }

    private HttpResponse<Path> download(final Path partial) throws IOException {
        try (HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NORMAL).build()) {
            return client.send(HttpRequest.newBuilder(source).build(), HttpResponse.BodyHandlers.ofFile(partial));
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Download interrupted: " + source, e);
        }
    }
}
