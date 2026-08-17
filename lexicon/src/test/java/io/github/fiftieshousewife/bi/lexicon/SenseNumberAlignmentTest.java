package io.github.fiftieshousewife.bi.lexicon;

import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.dictionary.Dictionary;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Measures how far the bundled domains file's sense numbers have drifted from the bundled dictionary: the
 * file is WordNet Domains 3.2 lifted to WordNet <b>3.0</b>, the dictionary is WordNet <b>3.1</b>, and its own
 * header warns that a per-sense join is version-sensitive.
 *
 * <p>A file naming {@code lemma#n#7} where the dictionary knows six noun senses has certainly drifted; one
 * naming a sense the dictionary has may still have drifted silently, so this is a floor on the damage.
 */
class SenseNumberAlignmentTest {

    private static final String RESOURCE = "wordnet-domains.txt";

    @Test
    void namesSenseNumbersTheBundledDictionaryStillHas() throws Exception {
        final Dictionary dictionary = Dictionary.getDefaultResourceInstance();
        final Map<String, Integer> highestSenseAsked = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(
                getClass().getResourceAsStream("/" + RESOURCE)), StandardCharsets.UTF_8))) {
            reader.lines().filter(line -> !line.isBlank() && !line.startsWith("#"))
                    .forEach(line -> record(line.split(" ", -1)[1], highestSenseAsked));
        }

        int checked = 0;
        int beyond = 0;
        for (final Map.Entry<String, Integer> asked : highestSenseAsked.entrySet()) {
            final String[] key = asked.getKey().split("#", -1);
            final POS partOfSpeech = POS.getPOSForKey(key[1]);
            if (partOfSpeech == null) {
                continue;
            }
            final IndexWord entry = dictionary.getIndexWord(partOfSpeech, key[0].replace('_', ' '));
            if (entry == null) {
                continue;
            }
            checked++;
            beyond += entry.getSenses().size() < asked.getValue() ? 1 : 0;
        }
        final double aligned = 1.0 - (double) beyond / checked;

        assertThat(aligned)
                .as("A RISK, MEASURED. %,d of %,d lemma-and-part-of-speech keys in the lifted 3.0 domains "
                        + "file name a sense number the bundled 3.1 dictionary does not have, so the "
                        + "per-sense join its header calls version-sensitive holds for %.2f%% of them. A "
                        + "reading that joins on the lemma alone runs no such risk and reads a word as its "
                        + "rarest meaning instead; this is the price of not doing that, stated.",
                        beyond, checked, aligned * 100.0)
                .isGreaterThan(0.99);
    }

    private static void record(final String senseKey, final Map<String, Integer> highest) {
        final String[] parts = senseKey.split("#", -1);
        highest.merge(parts[0].toLowerCase(Locale.ROOT) + "#" + parts[1], Integer.parseInt(parts[2]),
                Integer::max);
    }
}
