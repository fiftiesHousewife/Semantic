package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Set;

import org.fifties.housewife.bi.lexicon.Lexicon;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;

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

    /** The bundled WordNet Domains reading, through the ported lexicon. */
    static SenseDomains fromClasspath() {
        final Lexicon lexicon = WordNetLexicon.fromClasspath();
        return lexicon::senseDomainsOf;
    }
}
