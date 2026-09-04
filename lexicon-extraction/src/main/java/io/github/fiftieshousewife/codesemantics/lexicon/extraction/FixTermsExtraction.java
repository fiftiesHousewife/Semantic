package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;

/**
 * Reads FIX Orchestra's FIX Latest into the bundled TSV, from the one file the FIX Trading Community
 * publishes it in: {@code -Psource=<path to OrchestraFIXLatest.xml>}, or the permalink itself where a network
 * route exists.
 *
 * <p>The file is taken at a pinned commit rather than at a branch, for the same reason every citation this
 * library renders is a permalink, and it is accepted only if git would give its bytes the blob id that
 * revision holds.
 */
public final class FixTermsExtraction {

    private static final String REVISION = "099914dd0edd49a699326f0441776d6e21cfaf93";

    private static final String SOURCE =
            "https://github.com/FIXTradingCommunity/orchestrations/tree/" + REVISION;

    private static final String ORCHESTRA_BLOB = "89da6b99e88717960e48b0279cd844d4fc3e89b2";

    private final FixConcepts concepts = new FixConcepts();

    private final FixTermsTsv tsv = new FixTermsTsv();

    private final PinnedSource source = new PinnedSource(
            URI.create("https://raw.githubusercontent.com/FIXTradingCommunity/orchestrations/"
                    + REVISION + "/FIX%20Standard/OrchestraFIXLatest.xml"),
            REVISION, ORCHESTRA_BLOB);

    public void extract(final String orchestra, final Path output) throws IOException {
        final byte[] read = source.read(orchestra);
        new BundledResource(output).written(tsv.render(concepts.in(read), SOURCE, ORCHESTRA_BLOB));
    }

    PinnedSource source() {
        return source;
    }
}
