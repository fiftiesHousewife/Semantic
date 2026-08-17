package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Reads wiktextract's topic generalisation map into the bundled TSV. The module is taken at a pinned
 * revision rather than at a branch, for the same reason every citation this library renders is a permalink:
 * a reading that cannot be reproduced is not a citation.
 *
 * <p>Whatever it reads — the published module or the copy {@code -Pmodule=<path>} names — is accepted only
 * if git would give it the blob id that revision holds. So an extraction run without a network route still
 * writes the permalink as its source, having shown rather than assumed that it read what the permalink
 * holds, and a fetch that was answered by something other than the module fails instead of being bundled.
 */
public final class TopicHierarchyExtraction {

    private static final String REVISION = "872fc7bfc15c388eca84591268d6f35759c42290";

    private static final URI MODULE = URI.create("https://raw.githubusercontent.com/tatuylonen/wiktextract/"
            + REVISION + "/src/wiktextract/topics.py");

    private static final String MODULE_BLOB = "ef2bece45e88f7e88bccbec28a46c90cc8f9ab29";

    private final TopicGeneralisations generalisations = new TopicGeneralisations();

    private final TopicHierarchyTsv tsv = new TopicHierarchyTsv();

    private final PinnedSource source = new PinnedSource(MODULE, REVISION, MODULE_BLOB);

    public static void main(final String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: TopicHierarchyExtraction <module or blank> <tsv>");
        }
        new TopicHierarchyExtraction().extract(args[0], Path.of(args[1]));
    }

    public void extract(final String module, final Path output) throws IOException {
        final String read = new String(source.read(module), StandardCharsets.UTF_8);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(generalisations.in(read), source.permalink()));
    }

    PinnedSource source() {
        return source;
    }
}
