package org.fifties.housewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Every word the reading offered to the resources, how often, and one place to see it. It is the tally the
 * topic reading needs but cannot take from {@link TopicWitnesses}: a word placed in five subjects appears
 * under five topics there, and adding those up would count it five times.
 */
public final class WordSightings {

    private final Map<String, Integer> occurrences = new HashMap<>();
    private final Map<String, String> firstSite = new HashMap<>();
    private final Set<String> chosenAsNames = new HashSet<>();

    public void saw(final String word, final String site, final boolean chosenAsName) {
        occurrences.merge(word, 1, Integer::sum);
        firstSite.putIfAbsent(word, site);
        if (chosenAsName) {
            chosenAsNames.add(word);
        }
    }

    /** The words this repository used as names of things, rather than only in a sentence about them. */
    public Set<String> namedWith() {
        return Set.copyOf(chosenAsNames);
    }

    public Set<String> words() {
        return Set.copyOf(occurrences.keySet());
    }

    public int occurrencesOf(final String word) {
        return occurrences.getOrDefault(word, 0);
    }

    public String siteOf(final String word) {
        return firstSite.getOrDefault(word, "");
    }

    public int distinctWords() {
        return occurrences.size();
    }
}
