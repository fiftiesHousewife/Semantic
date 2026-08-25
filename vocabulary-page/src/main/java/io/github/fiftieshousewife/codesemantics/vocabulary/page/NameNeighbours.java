package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedSourceSets;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;

/**
 * How often each significant word is written beside each other one inside a declared name.
 *
 * <p>A name's words are the tightest context a repository states: {@code couponSchedule} is the author
 * writing {@code coupon} and {@code schedule} about one thing. The counts are taken over the chosen names
 * of the published source sets — the population the significant words themselves come from — with each
 * name contributing each pair once however often a word repeats inside it.
 */
final class NameNeighbours {

    private NameNeighbours() {
    }

    /** The pair counts over one parsed repository's published, chosen names. */
    static Map<String, Map<String, Long>> among(final ParsedRepository parsed, final Set<String> lemmas,
                                                final IdentifierWords words, final ContentWords content) {
        final PublishedSourceSets sets = new PublishedSourceSets();
        return among(parsed.files().stream()
                .filter(file -> sets.publishes(file.scope()))
                .flatMap(file -> file.occurrences().stream())
                .filter(occurrence -> occurrence.form().isChosenName())
                .map(occurrence -> words.of(occurrence.text()).words().stream()
                        .map(content::lemmaOrSurface)
                        .toList()), lemmas);
    }

    /** The pair counts over the given names' word lists, kept to the lemmas the caller cares about. */
    static Map<String, Map<String, Long>> among(final Stream<List<String>> names,
                                                final Set<String> lemmas) {
        final Map<String, Map<String, Long>> counts = new HashMap<>();
        names.map(name -> name.stream().filter(lemmas::contains).distinct().toList())
                .filter(name -> name.size() > 1)
                .forEach(name -> countPairs(name, counts));
        return counts;
    }

    private static void countPairs(final List<String> name, final Map<String, Map<String, Long>> counts) {
        name.forEach(word -> name.stream()
                .filter(other -> !other.equals(word))
                .forEach(other -> counts.computeIfAbsent(word, unused -> new HashMap<>())
                        .merge(other, 1L, Long::sum)));
    }
}
