package io.github.fiftieshousewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.dictionary.Dictionary;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordNetEntriesTest {

    private final WordNetEntries entries = new WordNetEntries(dictionary());

    private static Dictionary dictionary() {
        try {
            return Dictionary.getDefaultResourceInstance();
        } catch (final JWNLException e) {
            throw new IllegalStateException("Failed to load the bundled WordNet database", e);
        }
    }

    @Test
    void exactAnswersOnlyTheFormTheDictionaryIsKeyedBy() {
        assertAll(
                () -> assertThat(entries.exact(POS.NOUN, "phrase")).map(IndexWord::getLemma)
                        .hasValue("phrase"),
                () -> assertThat(entries.exact(POS.NOUN, "phrases")).isEmpty());
    }

    @Test
    void inflectedResolvesThroughTheDictionarysOwnMorphology() {
        assertThat(entries.inflected(POS.NOUN, "phrases")).map(IndexWord::getLemma).hasValue("phrase");
    }

    @Test
    void aWordTheDictionaryDoesNotCarryIsEmptyNotNull() {
        assertAll(
                () -> assertThat(entries.exact(POS.NOUN, "qzxv")).isEmpty(),
                () -> assertThat(entries.inflected(POS.NOUN, "qzxv")).isEmpty());
    }
}
