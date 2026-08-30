package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.WordSense;

/**
 * A dictionary that counts how often it is asked for a noun's base form and refuses every other question,
 * so a test can assert how many lookups a reading actually makes.
 */
final class CountedLookups implements Lexicon {

    private int nounBaseCalls;

    /** How often the dictionary was asked for a noun base form. */
    int nounBaseCalls() {
        return nounBaseCalls;
    }

    @Override
    public List<Set<String>> senseDomainsOf(final String word) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public int senseCount(final String word) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public List<CountedSenseDomains> countedSenseDomainsOf(final String word) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public boolean denotesPerson(final String noun) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Optional<String> nounBase(final String word) {
        nounBaseCalls++;
        return Optional.of(word);
    }

    @Override
    public Optional<String> verbBase(final String word) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Optional<String> adjectiveBase(final String word) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Optional<String> statedVerbInflection(final String word) {
        return Optional.empty();
    }

    @Override
    public Optional<String> abbreviationNoun(final String token) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Set<String> commonestSenseDomains(final String word) {
        return senseDomainsOf(word).stream().findFirst().orElseGet(Set::of);
    }

    @Override
    public Set<String> commonestVerbSenseDomains(final String word) {
        return commonestSenseDomains(word);
    }

    @Override
    public Set<String> commonestAnySenseDomains(final String word) {
        return commonestSenseDomains(word);
    }

    @Override
    public Optional<WordSense> commonestSense(final String word) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Set<String> domainsOf(final String word) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Set<String> lemmasOf(final String domain) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Set<String> labelledCollocations() {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public Set<String> sharedHypernyms(final String first, final String second) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public boolean antonymous(final String first, final String second) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }

    @Override
    public List<Set<String>> sharedHypernymChain(final String first, final String second) {
        throw new UnsupportedOperationException("a lemma lookup does not ask this");
    }
}
