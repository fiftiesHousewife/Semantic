package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.SenseDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.lexicon.WordSense;

/**
 * The narrowing that produces the export's signals, one count per rule, ending in one tile per meaning.
 *
 * <p>These are the ranking's own rules and no others, so every count here is one the export states:
 * {@code belowChance} is {@code setAside.wordsBelowEveryThreshold}, {@code withinError} is
 * {@code setAside.wordsWithinTheReferencesError}, {@code languageSupplied} is
 * {@code setAside.wordsTheLanguageSupplies}, and {@code signals} is the length of {@code signals}.
 *
 * <p>Two merges follow the rules, and neither removes anything. Two spellings with one dictionary form
 * become one word with the claims summed — claims are terms of one divergence, so summing them is the
 * ranking's own arithmetic. Two words whose commonest sense is one WordNet synset become one tile: the
 * dictionary says they mean the same thing. A word the dictionary states no sense for keeps its own tile.
 */
public record VocabularyFunnel(String repository, int field, int belowChance, int withinError,
                               int languageSupplied, int signals, int words, List<Ranked> ranked,
                               List<Form> forms, List<Tile> tiles) {

    /**
     * One ranked word with the rule that sets it aside, or none where it survives to the signals —
     * what a funnel row shows when it is asked for its own population.
     */
    public record Ranked(String word, double claim, double timesChance, String leftAt) {
    }

    /** One dictionary form of the signals, the population between the spellings and the meanings. */
    public record Form(String word, double claim, double timesChance, int occurrences) {
    }

    /**
     * One meaning of the final cloud: the words of this repository that resolve to it, the claims summed,
     * and that claim as a multiple of the tightest margin-to-bar ratio any spelling attains.
     *
     * @param name the synset's own headword, or the word itself where the dictionary states no sense
     */
    public record Tile(String name, String partOfSpeech, double claim, double timesChance,
                       int occurrences, List<String> members, List<String> domains) {
    }

    public VocabularyFunnel {
        ranked = List.copyOf(ranked);
        forms = List.copyOf(forms);
        tiles = List.copyOf(tiles);
    }

    /** The funnel of one published reading: the counts from its export, the words from its workings. */
    public static VocabularyFunnel of(final ReadingFolder reading) {
        final ReadingExport export = reading.export();
        final List<ReadingFolder.RankedWord> workings = reading.vocabularyWorkings();
        final List<Word> words = merged(workings);
        return new VocabularyFunnel(export.summary().repository(),
                workings.size(),
                export.setAside().wordsBelowEveryThreshold(),
                export.setAside().wordsWithinTheReferencesError(),
                export.setAside().wordsTheLanguageSupplies(),
                export.signals().size(),
                words.size(),
                workings.stream()
                        .map(word -> new Ranked(word.word(), word.claim(), word.timesChance(),
                                word.leftAt()))
                        .toList(),
                words.stream()
                        .sorted(Comparator.comparingDouble(Word::claim).reversed()
                                .thenComparing(Word::word))
                        .map(word -> new Form(word.word(), word.claim(), word.timesChance(),
                                word.occurrences()))
                        .toList(),
                tiles(words));
    }

    /** One dictionary form with its figures, the intermediate the sense merge runs on. */
    private record Word(String word, double claim, double timesChance, int occurrences) {
    }

    private static List<Word> merged(final List<ReadingFolder.RankedWord> workings) {
        final ContentWords content = ContentWords.fromClasspath();
        return workings.stream()
                .filter(word -> word.leftAt().isEmpty())
                .collect(Collectors.groupingBy(word -> content.lemmaOrSurface(word.word())))
                .entrySet().stream()
                .map(entry -> word(entry.getKey(), entry.getValue()))
                .toList();
    }

    private static Word word(final String lemma, final List<ReadingFolder.RankedWord> spellings) {
        return new Word(lemma,
                spellings.stream().mapToDouble(ReadingFolder.RankedWord::claim).sum(),
                spellings.stream().mapToDouble(ReadingFolder.RankedWord::timesChance).max().orElse(0.0),
                spellings.stream().mapToInt(ReadingFolder.RankedWord::occurrences).sum());
    }

    /** The words under their commonest senses; a word with no sense keeps a tile of its own. */
    private static List<Tile> tiles(final List<Word> words) {
        final WordNetLexicon lexicon = WordNetLexicon.fromClasspath();
        final SenseDomains domains = SenseDomains.fromClasspath();
        final Map<String, List<Word>> bySense = words.stream()
                .collect(Collectors.groupingBy(word -> lexicon.commonestSense(word.word())
                        .map(sense -> sense.partOfSpeech() + ":" + sense.offset())
                        .orElse("word:" + word.word())));
        return bySense.values().stream()
                .map(members -> tile(members, lexicon, domains))
                .sorted(Comparator.comparingDouble(Tile::claim).reversed()
                        .thenComparing(Tile::name))
                .toList();
    }

    private static Tile tile(final List<Word> members, final WordNetLexicon lexicon,
                             final SenseDomains domains) {
        final List<Word> ranked = members.stream()
                .sorted(Comparator.comparingDouble(Word::claim).reversed()
                        .thenComparing(Word::word))
                .toList();
        final Word leading = ranked.getFirst();
        final Optional<WordSense> sense = lexicon.commonestSense(leading.word());
        return new Tile(sense.map(WordSense::name).orElse(leading.word()),
                sense.map(WordSense::partOfSpeech).orElse(""),
                ranked.stream().mapToDouble(Word::claim).sum(),
                ranked.stream().mapToDouble(Word::timesChance).max().orElse(0.0),
                ranked.stream().mapToInt(Word::occurrences).sum(),
                ranked.stream().map(Word::word).toList(),
                statedFor(leading.word(), domains));
    }

    private static List<String> statedFor(final String word, final SenseDomains domains) {
        final Set<String> stated = domains.of(word).stream()
                .flatMap(Set::stream)
                .collect(Collectors.toCollection(TreeSet::new));
        return List.copyOf(stated);
    }
}
