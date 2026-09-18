package io.github.fiftieshousewife.codesemantics.lexicon;

import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import static java.util.function.Predicate.not;

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
        final List<Synset> senses = entries.senses(word);
        final int personUse = highestUseCount(senses, word, WordNetPersons::isAPersonSense);
        final int otherUse = highestUseCount(senses, word, not(WordNetPersons::isAPersonSense));
        return personUse > otherUse || isUncountedAndNothingElse(personUse, senses);
    }

    /** The corpus use count of the most-used sense in one partition, and zero where that partition is empty. */
    private int highestUseCount(final List<Synset> senses, final IndexWord word, final Predicate<Synset> part) {
        return senses.stream()
                .filter(part)
                .mapToInt(sense -> useCount(sense, word.getLemma()))
                .max()
                .orElse(0);
    }

    /** A word the sense-tagged corpus never counted denotes a person where it has no other kind of sense. */
    private static boolean isUncountedAndNothingElse(final int personUse, final List<Synset> senses) {
        return personUse == 0 && senses.stream().allMatch(WordNetPersons::isAPersonSense);
    }

    private static boolean isAPersonSense(final Synset sense) {
        return PERSON_LEX_FILE.equals(sense.getLexFileName());
    }

    private static int useCount(final Synset sense, final String lemma) {
        return sense.getWords().stream()
                .filter(word -> word.getLemma().equalsIgnoreCase(lemma))
                .mapToInt(Word::getUseCount)
                .max()
                .orElse(0);
    }
}
