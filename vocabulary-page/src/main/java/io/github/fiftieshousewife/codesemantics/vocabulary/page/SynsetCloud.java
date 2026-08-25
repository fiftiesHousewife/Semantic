package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.WordSense;
import io.github.fiftieshousewife.codesemantics.engine.theme.SenseDomains;

/**
 * The significant words gathered under the WordNet senses they are most often written in — a cloud of
 * meanings rather than spellings. A <i>synset</i> is WordNet's unit: one meaning with the words that share
 * it, named by its part of speech and its offset in the database.
 *
 * <p>Two words resolving to one synset are one tile: the dictionary says they mean the same thing, and a
 * cloud of spellings would draw that one meaning twice. The tile's weight is their claims summed — claims
 * are terms of one divergence, so summing them is the same arithmetic the ranking already uses.
 *
 * <p>A word the dictionary states no sense for is counted rather than dropped, and a reading that cannot
 * cite abstains.
 */
public record SynsetCloud(String repository, List<Sense> senses, int significantWords,
                          int wordsWithoutASense) {

    /** One synset: the words of this repository that resolve to it, and the mass they carry together. */
    public record Sense(String partOfSpeech, long offset, String name, double claim,
                        List<Member> members, List<String> domains) {
    }

    /** One word under a sense, with its own claim, so a merged tile can still be taken apart. */
    public record Member(String word, double claim) {
    }

    public SynsetCloud {
        senses = List.copyOf(senses);
    }

    public static SynsetCloud of(final String repository, final List<ScoredWord> words,
                                 final Function<String, Optional<WordSense>> senseOf,
                                 final SenseDomains domains) {
        final Map<String, List<ScoredWord>> bySynset = words.stream()
                .filter(word -> senseOf.apply(word.word()).isPresent())
                .collect(Collectors.groupingBy(word -> keyOf(senseOf.apply(word.word()).orElseThrow())));
        final List<Sense> senses = bySynset.values().stream()
                .map(members -> sense(members, senseOf, domains))
                .sorted(Comparator.comparingDouble(Sense::claim).reversed()
                        .thenComparing(Sense::name))
                .toList();
        return new SynsetCloud(repository, senses, words.size(),
                (int) words.stream().filter(word -> senseOf.apply(word.word()).isEmpty()).count());
    }

    private static String keyOf(final WordSense sense) {
        return sense.partOfSpeech() + ":" + sense.offset();
    }

    private static Sense sense(final List<ScoredWord> members,
                               final Function<String, Optional<WordSense>> senseOf,
                               final SenseDomains domains) {
        final List<Member> gathered = members.stream()
                .map(member -> new Member(member.word(), member.claim()))
                .sorted(Comparator.comparingDouble(Member::claim).reversed()
                        .thenComparing(Member::word))
                .toList();
        final WordSense sense = senseOf.apply(gathered.getFirst().word()).orElseThrow();
        return new Sense(sense.partOfSpeech(), sense.offset(), sense.name(),
                members.stream().mapToDouble(ScoredWord::claim).sum(),
                gathered, domainsOf(gathered.getFirst().word(), domains));
    }

    /** The labels of the sense the word is most often written in, which is the sense that grouped it. */
    private static List<String> domainsOf(final String word, final SenseDomains domains) {
        return domains.of(word).stream()
                .flatMap(Set::stream)
                .collect(Collectors.toCollection(TreeSet::new))
                .stream()
                .toList();
    }
}
