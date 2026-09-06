package io.github.fiftieshousewife.codesemantics.lexicon;

import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;

import java.util.Locale;

/**
 * Whether a noun denotes a person. It does when its person senses — those in WordNet's {@code noun.person}
 * lexicographer file, the partition that holds every occupation, role and kind of human — dominate its
 * other senses by corpus use count. WordNet's sense ordering alone is not enough: for words the
 * sense-tagged corpus never counted the ordering is arbitrary, and "trailer" lists "someone who trails"
 * ahead of the vehicle, so an uncounted word reads as a person only when it has no other kind of sense at
 * all (a cinematographer is nothing but a person; a trailer is mostly not).
 */
final class WordNetPersons {

    private static final String PERSON_LEX_FILE = "noun.person";

    private final WordNetEntries entries;

    WordNetPersons(final WordNetEntries entries) {
        this.entries = entries;
    }

    boolean denotesPerson(final String noun) {
        return entries.inflected(POS.NOUN, noun.toLowerCase(Locale.ROOT))
                .filter(word -> !entries.senses(word).isEmpty())
                .map(this::sensesDenoteAPerson)
                .orElse(false);
    }

    private boolean sensesDenoteAPerson(final IndexWord word) {
        int personUse = 0;
        int otherUse = 0;
        boolean everyNounSenseIsAPerson = true;
        for (final Synset sense : entries.senses(word)) {
            if (PERSON_LEX_FILE.equals(sense.getLexFileName())) {
                personUse = Math.max(personUse, useCount(sense, word.getLemma()));
            } else {
                otherUse = Math.max(otherUse, useCount(sense, word.getLemma()));
                everyNounSenseIsAPerson = false;
            }
        }
        return personUse > otherUse || (personUse == 0 && otherUse == 0 && everyNounSenseIsAPerson);
    }

    private static int useCount(final Synset sense, final String lemma) {
        return sense.getWords().stream()
                .filter(word -> word.getLemma().equalsIgnoreCase(lemma))
                .mapToInt(Word::getUseCount)
                .max()
                .orElse(0);
    }
}
