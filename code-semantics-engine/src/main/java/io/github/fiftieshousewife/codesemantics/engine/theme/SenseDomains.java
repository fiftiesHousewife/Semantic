package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;

/**
 * The subject labels a resource assigns to each of a word's senses, kept apart by sense. The sense structure
 * is the whole reason this is not a flat set: a word meaning food in both its senses and chemistry in one is
 * saying that food is the more central reading, and only the per-sense view can state it.
 *
 * <p>It is the one question a topical reading asks of a dictionary, so it is the whole of the seam. A
 * reading that depended on a ten-method dictionary interface could not be exercised without one.
 */
@FunctionalInterface
public interface SenseDomains {

    /** One label set per sense, or empty when the resource does not cover the word. */
    List<Set<String>> of(String word);

    /**
     * The bundled WordNet Domains reading of the sense each word is <b>most often written in</b>, through
     * the ported lexicon.
     *
     * <p>Pooling every labelled sense instead reads a word as its rarest meaning: {@code cite} carries a
     * subject on exactly one sense — being summoned before a court — so a pooled reading calls citations
     * {@code law} with no evidence the courtroom sense was ever meant. Asked for the commonest sense,
     * {@code cite} says nothing at all, which is the correct outcome: a reading that cannot cite abstains.
     *
     * <p>The list has one entry or none, because there is one commonest sense. That keeps the contract
     * per-sense, so a reading that pools and a reading that disambiguates are the same shape.
     */
    static SenseDomains fromClasspath() {
        final Lexicon lexicon = WordNetLexicon.fromClasspath();
        return word -> lexicon.commonestSenseDomains(word).isEmpty()
                ? List.of()
                : List.of(lexicon.commonestSenseDomains(word));
    }

    /**
     * The commonest sense whichever part of speech carries it, counted by WordNet's own tagged corpus —
     * the reading for prose, where nothing in the grammar says a word is being used as a name.
     */
    static SenseDomains anyPartFromClasspath() {
        final Lexicon lexicon = WordNetLexicon.fromClasspath();
        return word -> lexicon.commonestAnySenseDomains(word).isEmpty()
                ? List.of()
                : List.of(lexicon.commonestAnySenseDomains(word));
    }

    /** The same reading taken of each word's commonest <b>verb</b> sense, for words the grammar says are. */
    static SenseDomains verbsFromClasspath() {
        final Lexicon lexicon = WordNetLexicon.fromClasspath();
        return word -> lexicon.commonestVerbSenseDomains(word).isEmpty()
                ? List.of()
                : List.of(lexicon.commonestVerbSenseDomains(word));
    }

    /** The pooled reading this one replaced, kept so the two can be measured against each other. */
    static SenseDomains pooledFromClasspath() {
        return WordNetLexicon.fromClasspath()::senseDomainsOf;
    }
}
