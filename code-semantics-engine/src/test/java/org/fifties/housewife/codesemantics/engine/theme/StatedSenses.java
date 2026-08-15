package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.Lexicon;
import org.fifties.housewife.bi.lexicon.WordSense;

/**
 * A dictionary that answers only the two questions a topical reading asks of one: which subjects label a
 * word's senses, and how many senses it has. Everything else a {@link Lexicon} can be asked is refused,
 * because a fixture that answered would be inviting a reading to depend on it.
 */
record StatedSenses(Map<String, List<Set<String>>> domains, Map<String, Integer> senses) implements Lexicon {

    @Override
    public List<Set<String>> senseDomainsOf(final String word) {
        return domains.getOrDefault(word, List.of());
    }

    @Override
    public int senseCount(final String word) {
        return senses.getOrDefault(word, 0);
    }

    @Override
    public boolean denotesPerson(final String noun) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public Optional<String> nounBase(final String word) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public Optional<String> verbBase(final String word) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public Optional<String> abbreviationNoun(final String token) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
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
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public Set<String> domainsOf(final String word) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public Set<String> lemmasOf(final String domain) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public Set<String> labelledCollocations() {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public Set<String> sharedHypernyms(final String first, final String second) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public boolean antonymous(final String first, final String second) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }

    @Override
    public List<Set<String>> sharedHypernymChain(final String first, final String second) {
        throw new UnsupportedOperationException("a topical reading does not ask this");
    }
}
