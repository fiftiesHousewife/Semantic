package io.github.fiftieshousewife.codesemantics.lexicon;

import net.sf.extjwnl.data.POS;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Joins a word's counted senses to the domain labels the bundled resources state for them: WordNet Domains
 * by lemma, part of speech and sense number, and the eXtended WordNet Domains reduction by sense key.
 */
final class WordNetSenseDomains {

    private final WordNetSenses senses;
    private final WordNetDomains domains;
    private final WordNetBaseForms baseForms;

    WordNetSenseDomains(final WordNetSenses senses, final WordNetDomains domains,
                        final WordNetBaseForms baseForms) {
        this.senses = senses;
        this.domains = domains;
        this.baseForms = baseForms;
    }

    Set<String> commonestSenseDomains(final String word) {
        return domainsOf(senses.commonestSenseAsNoun(word), word);
    }

    Set<String> commonestVerbSenseDomains(final String word) {
        return domainsOf(senses.commonestSenseAsVerb(word), word);
    }

    Set<String> commonestAnySenseDomains(final String word) {
        return domainsOf(senses.commonestSense(word), word);
    }

    List<CountedSenseDomains> countedSenseDomainsOf(final String word) {
        return senses.countedSenses(word).stream()
                .map(counted -> countedDomainsOf(counted, word))
                .toList();
    }

    private Set<String> domainsOf(final Optional<WordSense> sense, final String word) {
        return sense.map(read -> domains.domainsOfSense(baseOf(word, read), read.posKey(),
                read.senseNumber())).orElseGet(Set::of);
    }

    private CountedSenseDomains countedDomainsOf(final CountedSense counted, final String word) {
        final WordSense named = counted.named();
        return new CountedSenseDomains(
                domains.domainsOfSense(baseOf(word, named), named.posKey(), named.senseNumber()),
                counted.uses(), counted.synsetLemmas());
    }

    /** The resource is keyed by the dictionary's own lemma, which is what morphology resolved the word to. */
    private String baseOf(final String word, final WordSense sense) {
        return baseForms.baseForm(POS.getPOSForKey(sense.posKey()), word).orElse(word);
    }
}
