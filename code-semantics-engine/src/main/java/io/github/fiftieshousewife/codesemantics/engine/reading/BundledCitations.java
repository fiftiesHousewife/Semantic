package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.NameTokens;
import io.github.fiftieshousewife.bi.lexicon.SqlFunctions;
import io.github.fiftieshousewife.bi.lexicon.WikidataInitialisms;
import io.github.fiftieshousewife.bi.lexicon.WiktionaryCitations;
import io.github.fiftieshousewife.bi.lexicon.WiktionaryTopics;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import io.github.fiftieshousewife.codesemantics.name.WordRanks;

/**
 * The citations the bundled resources can make about a word, one per resource, each paired with the evidence
 * source a vote resting on it would name. Nothing here is a list of words: every entry delegates to a
 * resource that states its own provenance, and the language's own words are cited to the platform's
 * implementation of its specification rather than to a table anyone wrote here.
 *
 * <p>Two of these readings are deliberately broad, and a report resting on them must say so. The name
 * registry knows Self and Ray as surnames however ordinary they read as words, and the initialism registry
 * knows a great many three-letter capitals tokens; both are honest citations and neither is evidence that the
 * word means that here. That is why they are reported per source, so a reader can see what carried a reading
 * rather than only that something did.
 */
public final class BundledCitations {

    private BundledCitations() {
    }

    /**
     * The bundled readings, cheapest resource first, so a reading that only asks whether anything cites a
     * word does the least work it can before reaching WordNet.
     */
    public static List<WordCitation> fromClasspath() {
        final WordRanks ranks = WordRanks.fromClasspath();
        final Lexicon wordNet = WordNetLexicon.fromClasspath();
        final WiktionaryCitations abbreviations = WiktionaryCitations.fromClasspath();
        final WiktionaryTopics topics = WiktionaryTopics.fromClasspath();
        final WikidataInitialisms initialisms = WikidataInitialisms.fromClasspath();
        final NameTokens names = NameTokens.fromClasspath();
        final SqlFunctions functions = SqlFunctions.fromClasspath();
        return List.of(
                new ResourceCitation(EvidenceSource.WORD_FREQUENCY, ranks::knows),
                new ResourceCitation(EvidenceSource.WIKTIONARY_TOPIC, word -> !topics.topicsOf(word).isEmpty()),
                new ResourceCitation(EvidenceSource.WIKTIONARY_ABBREVIATION,
                        word -> !abbreviations.citationsOf(word).isEmpty()),
                new ResourceCitation(EvidenceSource.QUERY_LANGUAGE_FUNCTION, functions::names),
                new ResourceCitation(EvidenceSource.WIKIDATA_INITIALISM,
                        word -> !initialisms.readingsOf(word.toUpperCase(Locale.ROOT)).isEmpty()),
                new ResourceCitation(EvidenceSource.WIKIDATA_NAME, names::readsAsName),
                new ResourceCitation(EvidenceSource.WORDNET_DOMAIN, word -> !wordNet.domainsOf(word).isEmpty()),
                new ResourceCitation(EvidenceSource.WORDNET_SENSE, word -> knowsALemma(wordNet, word)));
    }

    /**
     * WordNet is asked for a noun or a verb lemma, which is the coverage the {@link Lexicon} contract
     * exposes. An adjective or adverb the dictionary knows and neither part of speech carries reads as
     * uncited here — an understatement of WordNet's coverage, and the direction an unverified figure should
     * err in.
     */
    private static boolean knowsALemma(final Lexicon wordNet, final String word) {
        return wordNet.nounBase(word).isPresent() || wordNet.verbBase(word).isPresent();
    }
}
