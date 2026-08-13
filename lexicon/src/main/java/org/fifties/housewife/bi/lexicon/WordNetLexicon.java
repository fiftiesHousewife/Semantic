package org.fifties.housewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

/**
 * {@link Lexicon} over the bundled WordNet database. A noun denotes a person when its person senses —
 * those in WordNet's {@code noun.person} lexicographer file, the partition that holds every occupation,
 * role and kind of human — dominate its other senses by corpus use count. WordNet's sense ordering alone
 * is not enough: for words the sense-tagged corpus never counted the ordering is arbitrary, and "trailer"
 * lists "someone who trails" ahead of the vehicle, so an uncounted word reads as a person only when it has
 * no other kind of sense at all (a cinematographer is nothing but a person; a trailer is mostly not).
 * Lookup applies WordNet's own morphology, so plural forms resolve to their lemma without any inflection
 * rules here.
 */
public final class WordNetLexicon implements Lexicon {

    private static final String PERSON_LEX_FILE = "noun.person";

    private final Dictionary dictionary;
    private final WordNetDomains domains;
    private final WordNetAbbreviations abbreviations;
    private final WordNetContrast contrast;
    private final WordNetSenses senses;

    WordNetLexicon(final Dictionary dictionary, final WordNetDomains domains) {
        this.dictionary = dictionary;
        this.domains = domains;
        this.abbreviations = new WordNetAbbreviations(dictionary);
        this.contrast = new WordNetContrast(dictionary);
        this.senses = new WordNetSenses(dictionary);
    }

    public static WordNetLexicon fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    @Override
    public Optional<String> nounBase(final String word) {
        return baseForm(POS.NOUN, word);
    }

    @Override
    public Optional<String> verbBase(final String word) {
        return baseForm(POS.VERB, word);
    }

    // WordNet reads separators as collocation joiners ("hot_dog"), so a compound like "title_basics"
    // would resolve through phrase lookup to its head word. Base forms answer for single words only.
    private Optional<String> baseForm(final POS partOfSpeech, final String word) {
        final String lower = word.toLowerCase(Locale.ROOT);
        if (!isSingleWord(lower)) {
            return Optional.empty();
        }
        try {
            final IndexWord base = dictionary.getMorphologicalProcessor()
                    .lookupBaseForm(partOfSpeech, lower);
            return Optional.ofNullable(base).map(IndexWord::getLemma);
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet base-form lookup failed for \"" + word + "\"", e);
        }
    }

    private static boolean isSingleWord(final String lower) {
        return lower.chars().allMatch(letter -> letter >= 'a' && letter <= 'z');
    }

    @Override
    public Optional<String> abbreviationNoun(final String token) {
        return abbreviations.abbreviationNoun(token);
    }

    @Override
    public int senseCount(final String word) {
        final String lower = word.toLowerCase(Locale.ROOT);
        if (!isSingleWord(lower)) {
            return 0;
        }
        int senses = 0;
        for (final POS partOfSpeech : POS.values()) {
            senses += sensesOf(partOfSpeech, lower);
        }
        return senses;
    }

    private int sensesOf(final POS partOfSpeech, final String lower) {
        try {
            final IndexWord entry = dictionary.lookupIndexWord(partOfSpeech, lower);
            return entry == null ? 0 : entry.getSenses().size();
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet sense lookup failed for \"" + lower + "\"", e);
        }
    }

    @Override
    public Optional<WordSense> commonestSense(final String word) {
        return senses.commonestSense(word);
    }

    @Override
    public Set<String> domainsOf(final String word) {
        return domains.domainsOf(word);
    }

    @Override
    public List<Set<String>> senseDomainsOf(final String word) {
        return domains.senseDomainsOf(word);
    }

    @Override
    public Set<String> lemmasOf(final String domain) {
        return domains.lemmasOf(domain);
    }

    @Override
    public Set<String> sharedHypernyms(final String first, final String second) {
        return contrast.sharedHypernyms(first, second);
    }

    @Override
    public boolean antonymous(final String first, final String second) {
        return contrast.antonymous(first, second);
    }

    @Override
    public List<Set<String>> sharedHypernymChain(final String first, final String second) {
        return contrast.sharedHypernymChain(first, second);
    }

    @Override
    public boolean denotesPerson(final String noun) {
        final IndexWord word = indexWord(noun);
        if (word == null || word.getSenses().isEmpty()) {
            return false;
        }
        int personUse = 0;
        int otherUse = 0;
        boolean everyNounSenseIsAPerson = true;
        for (final Synset sense : word.getSenses()) {
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

    private IndexWord indexWord(final String noun) {
        try {
            return dictionary.lookupIndexWord(POS.NOUN, noun.toLowerCase(Locale.ROOT));
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet lookup failed for \"" + noun + "\"", e);
        }
    }

    private static WordNetLexicon loadFromClasspath() {
        try {
            return new WordNetLexicon(Dictionary.getDefaultResourceInstance(), WordNetDomains.fromClasspath());
        } catch (final JWNLException e) {
            throw new IllegalStateException("Failed to load the bundled WordNet database", e);
        }
    }

    private static final WordNetLexicon CLASSPATH_DEFAULTS = loadFromClasspath();
}
