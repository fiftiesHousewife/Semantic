package org.fifties.housewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.List;

public final class WordNetSenseProbe {

    private WordNetSenseProbe() {
    }

    public static void main(final String[] args) throws JWNLException {
        final Dictionary dictionary = Dictionary.getDefaultResourceInstance();
        for (final String noun : args) {
            final IndexWord word = dictionary.lookupIndexWord(POS.NOUN, noun);
            if (word == null) {
                System.out.printf("%s: UNKNOWN%n", noun);
                continue;
            }
            final List<Synset> senses = word.getSenses();
            for (int i = 0; i < senses.size(); i++) {
                final Synset synset = senses.get(i);
                final int useCount = synset.getWords().stream()
                        .filter(w -> w.getLemma().equalsIgnoreCase(word.getLemma()))
                        .mapToInt(Word::getUseCount)
                        .max().orElse(0);
                System.out.printf("%s[%d] %s count=%d gloss=%.60s%n",
                        noun, i, synset.getLexFileName(), useCount, synset.getGloss());
            }
        }
    }
}
