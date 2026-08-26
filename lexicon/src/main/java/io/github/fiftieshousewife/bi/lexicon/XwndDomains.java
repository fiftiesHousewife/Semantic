package io.github.fiftieshousewife.bi.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * The bundled eXtended WordNet Domains reduction: one leading domain per synset, keyed by sense key —
 * WordNet's own version-stable identifier — so the labels the distribution states for WordNet 3.0 join
 * the bundled 3.1 database without an offset alignment.
 */
public final class XwndDomains {

    private static final String RESOURCE = "/xwnd-domains.tsv";

    private final Map<String, String> domainBySenseKey;

    private XwndDomains(final Map<String, String> domainBySenseKey) {
        this.domainBySenseKey = Map.copyOf(domainBySenseKey);
    }

    public static XwndDomains fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The leading domain of the synset this sense key belongs to, where the table holds the key. */
    public Optional<String> of(final String senseKey) {
        return Optional.ofNullable(domainBySenseKey.get(senseKey));
    }

    private static XwndDomains load() {
        final Map<String, String> domains = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                XwndDomains.class.getResourceAsStream(RESOURCE), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("#") || line.isBlank()) {
                    continue;
                }
                final int firstTab = line.indexOf('\t');
                final int secondTab = line.indexOf('\t', firstTab + 1);
                domains.put(line.substring(0, firstTab), line.substring(firstTab + 1, secondTab));
            }
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + RESOURCE, e);
        }
        return new XwndDomains(domains);
    }

    private static final XwndDomains CLASSPATH_DEFAULTS = load();
}
