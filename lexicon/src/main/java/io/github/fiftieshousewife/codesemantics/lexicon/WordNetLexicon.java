package io.github.fiftieshousewife.codesemantics.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * {@link Lexicon} over the bundled WordNet database. Each question is carried by the collaborator named for
 * it — base forms, senses, domain labels, abbreviations, contrast and person nouns — and lookup applies
 * WordNet's own morphology, so plural forms resolve to their lemma without any inflection rules here.
 */
public final class WordNetLexicon implements Lexicon {

    private final WordNetBaseForms baseForms;
    private final WordNetDomains domains;
    private final WordNetAbbreviations abbreviations;
    private final WordNetContrast contrast;
    private final WordNetSenses senses;
    private final WordNetSenseDomains senseDomains;
    private final WordNetPersons persons;

    WordNetLexicon(final Dictionary dictionary, final WordNetDomains domains) {
        final WordNetEntries entries = new WordNetEntries(dictionary);
        this.baseForms = new WordNetBaseForms(dictionary);
        this.domains = domains;
        this.abbreviations = new WordNetAbbreviations(entries);
        this.contrast = new WordNetContrast(entries);
        this.senses = new WordNetSenses(entries);
        this.senseDomains = new WordNetSenseDomains(senses, domains, baseForms);
        this.persons = new WordNetPersons(entries);
    }

    public static WordNetLexicon fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    @Override
    public Optional<String> nounBase(final String word) {
        return baseForms.baseForm(POS.NOUN, word);
    }

    @Override
    public Optional<String> verbBase(final String word) {
        return baseForms.baseForm(POS.VERB, word);
    }

    @Override
    public Optional<String> adjectiveBase(final String word) {
        return baseForms.baseForm(POS.ADJECTIVE, word);
    }

    @Override
    public Optional<String> statedVerbInflection(final String word) {
        return baseForms.statedVerbInflection(word);
    }

    @Override
    public Optional<String> abbreviationNoun(final String token) {
        return abbreviations.abbreviationNoun(token);
    }

    @Override
    public int senseCount(final String word) {
        return senses.senseCount(word);
    }

    @Override
    public Optional<WordSense> commonestSense(final String word) {
        return senses.commonestSense(word);
    }

    @Override
    public Set<String> commonestSenseDomains(final String word) {
        return senseDomains.commonestSenseDomains(word);
    }

    @Override
    public Set<String> commonestVerbSenseDomains(final String word) {
        return senseDomains.commonestVerbSenseDomains(word);
    }

    @Override
    public Set<String> commonestAnySenseDomains(final String word) {
        return senseDomains.commonestAnySenseDomains(word);
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
    public List<CountedSenseDomains> countedSenseDomainsOf(final String word) {
        return senseDomains.countedSenseDomainsOf(word);
    }

    @Override
    public Set<String> lemmasOf(final String domain) {
        return domains.lemmasOf(domain);
    }

    @Override
    public Set<String> labelledCollocations() {
        return domains.labelledCollocations();
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
        return persons.denotesPerson(noun);
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
