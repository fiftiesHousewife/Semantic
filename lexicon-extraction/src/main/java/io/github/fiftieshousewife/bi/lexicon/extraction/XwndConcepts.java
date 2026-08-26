package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.zip.GZIPInputStream;

/**
 * The eXtended WordNet Domains distribution reduced to one domain per synset and re-keyed by sense key:
 * for each WordNet 3.0 synset, the domain whose propagation vector weighs it highest, carried onto every
 * sense key the synset holds. A sense key is WordNet's own version-stable identifier, so the join to the
 * bundled WordNet 3.1 database survives the offsets moving — which they did, almost all of them.
 *
 * <p>The maximum is the reduction the resource's own evaluation uses and the one-domain-per-synset shape
 * its successors publish, and it needs no chosen constant. A tie is broken by the domain's name, so two
 * runs produce identical bytes.
 */
final class XwndConcepts {

    /** One sense key's leading domain, with the propagation weight that made it the leading one. */
    record Leading(String senseKey, String domain, double weight) {
    }

    private final Map<String, Leading> bySynset = new HashMap<>();

    /** Every sense key's leading domain, from the domain vectors and WordNet 3.0's own sense index. */
    static List<Leading> in(final InputStream archive, final InputStream senseIndex) throws IOException {
        final XwndConcepts concepts = new XwndConcepts();
        final TarEntries entries = new TarEntries(new GZIPInputStream(archive));
        Optional<TarEntries.Entry> entry = entries.next();
        while (entry.isPresent()) {
            final String name = entry.get().name();
            if (name.endsWith(".ppv")) {
                concepts.read(domainOf(name), entry.get().content());
            }
            entry = entries.next();
        }
        if (concepts.bySynset.isEmpty()) {
            throw new IllegalStateException("The archive held no .ppv domain vector at all; a reduction "
                    + "of nothing would write an empty resource that reads as a resource.");
        }
        return concepts.keyed(senseIndex);
    }

    private static String domainOf(final String entryName) {
        final int slash = entryName.lastIndexOf('/');
        return entryName.substring(slash + 1, entryName.length() - ".ppv".length());
    }

    private void read(final String domain, final byte[] vector) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new ByteArrayInputStream(vector), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                final int tab = line.indexOf('\t');
                final String synset = line.substring(0, tab);
                final double weight = Double.parseDouble(line.substring(tab + 1));
                final Leading held = bySynset.get(synset);
                if (held == null || weight > held.weight()
                        || (weight == held.weight() && domain.compareTo(held.domain()) < 0)) {
                    bySynset.put(synset, new Leading(synset, domain, weight));
                }
            }
        }
    }

    /**
     * Each synset's leading domain carried onto its sense keys, through {@code index.sense} — one row per
     * key: {@code sense_key offset sense_number tag_cnt}, the offset being the WordNet 3.0 synset the key
     * belongs to. A satellite adjective's type digit is 5 and its domain vector sits in the {@code -a}
     * files, so both adjective types read the same vectors.
     */
    private List<Leading> keyed(final InputStream senseIndex) throws IOException {
        final List<Leading> keyed = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(senseIndex, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                final int firstSpace = line.indexOf(' ');
                final int secondSpace = line.indexOf(' ', firstSpace + 1);
                final String senseKey = line.substring(0, firstSpace);
                final String offset = line.substring(firstSpace + 1, secondSpace);
                final Leading leading = bySynset.get(offset + "-" + posOf(senseKey));
                if (leading != null) {
                    keyed.add(new Leading(senseKey, leading.domain(), leading.weight()));
                }
            }
        }
        if (keyed.isEmpty()) {
            throw new IllegalStateException("No sense key of the index matched a synset of the vectors; "
                    + "the two inputs are not the same WordNet.");
        }
        return keyed;
    }

    private static String posOf(final String senseKey) {
        final char type = senseKey.charAt(senseKey.indexOf('%') + 1);
        return switch (type) {
            case '1' -> "n";
            case '2' -> "v";
            case '3', '5' -> "a";
            case '4' -> "r";
            default -> throw new IllegalStateException("A sense key's type digit is 1 to 5: " + senseKey);
        };
    }
}
