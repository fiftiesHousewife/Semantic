package io.github.fiftieshousewife.codesemantics.lexicon;

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
 *
 * <p>Each label carries a strength derived from the weight column the table states. A domain's
 * propagation vector sums to one over WordNet 3.0's 117,536 synsets, so a vector saying nothing about a
 * synset would weigh it at the uniform {@code u = 1/117536}; the strength {@code w / (w + u)} is the
 * stated weight's ratio against that uniform weight in its bounded {@code r / (1 + r)} form, so a label
 * the vector barely raised above saying nothing carries about half strength and a heavily weighted one
 * approaches full strength.
 */
public final class XwndDomains {

    /** One label the table states for a sense: its domain and the strength its weight derives. */
    public record Label(String domain, double strength) {
    }

    private static final String RESOURCE = "/xwnd-domains.tsv";

    /** The weight of a propagation vector spread evenly over WordNet 3.0's 117,536 synsets. */
    private static final double UNIFORM_WEIGHT = 1.0 / 117_536;

    private final Map<String, Label> labelBySenseKey;

    private XwndDomains(final Map<String, Label> labelBySenseKey) {
        this.labelBySenseKey = Map.copyOf(labelBySenseKey);
    }

    public static XwndDomains fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The leading domain of the synset this sense key belongs to, where the table holds the key. */
    public Optional<String> of(final String senseKey) {
        return labelOf(senseKey).map(Label::domain);
    }

    /** The leading domain with its strength, where the table holds the key. */
    public Optional<Label> labelOf(final String senseKey) {
        return Optional.ofNullable(labelBySenseKey.get(senseKey));
    }

    private static XwndDomains load() {
        final Map<String, Label> labels = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                XwndDomains.class.getResourceAsStream(RESOURCE), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("#") || line.isBlank()) {
                    continue;
                }
                labels.put(senseKeyOf(line), statedLabel(line));
            }
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + RESOURCE, e);
        }
        return new XwndDomains(labels);
    }

    private static String senseKeyOf(final String line) {
        return line.substring(0, line.indexOf('\t'));
    }

    private static Label statedLabel(final String line) {
        final int firstTab = line.indexOf('\t');
        final int secondTab = line.indexOf('\t', firstTab + 1);
        final double weight = Double.parseDouble(line.substring(secondTab + 1));
        return new Label(line.substring(firstTab + 1, secondTab), weight / (weight + UNIFORM_WEIGHT));
    }

    private static final XwndDomains CLASSPATH_DEFAULTS = load();
}
