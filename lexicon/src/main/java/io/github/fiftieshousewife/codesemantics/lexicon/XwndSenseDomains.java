package io.github.fiftieshousewife.codesemantics.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.List;
import java.util.Set;
import java.util.function.ToDoubleFunction;

/**
 * A word's counted senses with the labels of the bundled eXtended WordNet Domains reduction: one leading
 * domain per synset, joined by sense key, empty only where the bundled dictionary and the table disagree
 * about a key.
 */
public final class XwndSenseDomains {

    private final WordNetSenses senses;
    private final XwndDomains extended;

    XwndSenseDomains(final WordNetSenses senses, final XwndDomains extended) {
        this.senses = senses;
        this.extended = extended;
    }

    public static XwndSenseDomains fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public List<CountedSenseDomains> countedSenseDomainsOf(final String word) {
        return sensesOf(word, label -> 1.0);
    }

    /**
     * The same labels, each carrying the strength its stated propagation weight derives — the
     * {@code w / (w + uniform)} ratio {@link XwndDomains} computes — so a barely leading domain votes at
     * about half strength and the shortfall reaches no domain.
     */
    public List<CountedSenseDomains> weighedCountedSenseDomainsOf(final String word) {
        return sensesOf(word, XwndDomains.Label::strength);
    }

    private List<CountedSenseDomains> sensesOf(final String word,
                                               final ToDoubleFunction<XwndDomains.Label> strength) {
        return senses.countedSenses(word).stream()
                .map(counted -> counted.senseKey()
                        .flatMap(extended::labelOf)
                        .map(label -> new CountedSenseDomains(Set.of(label.domain()), counted.uses(),
                                strength.applyAsDouble(label), counted.synsetLemmas()))
                        .orElseGet(() -> new CountedSenseDomains(Set.of(), counted.uses(),
                                counted.synsetLemmas())))
                .toList();
    }

    private static XwndSenseDomains loadFromClasspath() {
        try {
            final WordNetEntries entries = new WordNetEntries(Dictionary.getDefaultResourceInstance());
            return new XwndSenseDomains(new WordNetSenses(entries), XwndDomains.fromClasspath());
        } catch (final JWNLException e) {
            throw new IllegalStateException("Failed to load the bundled WordNet database", e);
        }
    }

    private static final XwndSenseDomains CLASSPATH_DEFAULTS = loadFromClasspath();
}
