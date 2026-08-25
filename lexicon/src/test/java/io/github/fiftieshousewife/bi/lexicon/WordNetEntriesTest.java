package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;

import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.dictionary.Dictionary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordNetEntriesTest {

    private final WordNetEntries entries = new WordNetEntries(dictionary());

    @Test
    void statesEverySenseTheEntryListsInTheOrderItListsThem() {
        final IndexWord entry = entries.inflected(POS.NOUN, "session").orElseThrow();
        assertAll(
                () -> assertThat(entries.senses(entry)).isNotEmpty(),
                () -> assertThat(entries.senses(entry)).containsExactlyElementsOf(entry.getSenses()));
    }

    @Test
    void handsBackASenseListDetachedFromTheEntrySoAResolutionCannotMoveItUnderACaller() {
        final IndexWord entry = entries.inflected(POS.NOUN, "block").orElseThrow();
        final List<Synset> taken = entries.senses(entry);
        assertThatThrownBy(() -> taken.remove(0)).isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void countsTheSameSensesHoweverOftenItIsAsked() {
        final IndexWord entry = entries.inflected(POS.NOUN, "key").orElseThrow();
        assertThat(entries.senses(entry)).hasSameSizeAs(entries.senses(entry));
    }

    private static Dictionary dictionary() {
        try {
            return Dictionary.getDefaultResourceInstance();
        } catch (final Exception e) {
            throw new IllegalStateException("The bundled WordNet did not open", e);
        }
    }
}
