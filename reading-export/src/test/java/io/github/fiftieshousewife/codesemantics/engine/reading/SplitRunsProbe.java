package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.codesemantics.name.WordSegmenter;

/**
 * Every glued run the segmenter took apart, with what the dictionary says about the run whole.
 *
 * <p>It is what the whole-run rule buys, on whatever tree it is pointed at. The segmenter priced here reads
 * frequency alone, as it did before {@link DictionaryWords} was supplied to it, so every run it splits that
 * the dictionary carries whole is a reading the live one now keeps intact.
 *
 * <p>The runs are printed rather than summarised, because the failure mode is a run the dictionary carries
 * that the author did mean as two words, and that is a judgement a reader makes by looking at the list.
 */
public final class SplitRunsProbe {

    private static final int PRINTED = 60;

    /** A segmenter that recognises every run, so it refuses every split and yields the raw tokens. */
    private static final WordSegmenter UNSEGMENTED = WordSegmenter.citing(token -> true);

    private SplitRunsProbe() {
    }

    public static void main(final String[] args) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Lexicon dictionary = WordNetLexicon.fromClasspath();
        final WordSegmenter segmenter = WordSegmenter.fromClasspath();
        final Map<String, Integer> split = splitRuns(reading.parsed().files(), segmenter);
        final List<Map.Entry<String, Integer>> carried = split.entrySet().stream()
                .filter(run -> !partsOfSpeech(dictionary, run.getKey()).isEmpty())
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .toList();

        System.out.printf("%n%s — %,d distinct runs the segmenter split, %,d occurrences%n",
                reading.root().getFileName(), split.size(), occurrences(split.values()));
        System.out.printf("%,d of them the dictionary carries whole, %,d occurrences — the readings the "
                        + "whole-run rule keeps intact%n%n", carried.size(),
                occurrences(carried.stream().map(Map.Entry::getValue).toList()));
        System.out.printf("  %-20s %8s %-26s %s%n", "run", "written", "read as", "the dictionary calls it");
        carried.stream().limit(PRINTED).forEach(run -> System.out.printf("  %-20s %8d %-26s %s%n",
                run.getKey(), run.getValue(),
                String.join(" / ", segmenter.segment(run.getKey()).orElse(List.of())),
                partsOfSpeech(dictionary, run.getKey())));
    }

    /** Every run the segmenter took apart, counted over the names this repository declared. */
    private static Map<String, Integer> splitRuns(final List<ParsedFile> files,
                                                  final WordSegmenter segmenter) {
        final IdentifierWords tokens = new IdentifierWords(UNSEGMENTED);
        final Map<String, Integer> split = new HashMap<>();
        files.stream()
                .flatMap(file -> file.occurrences().stream())
                .filter(occurrence -> occurrence.form().isChosenName())
                .forEach(occurrence -> tokens.of(occurrence.text()).words().stream()
                        .filter(token -> segmenter.segment(token).isPresent())
                        .forEach(token -> split.merge(token, 1, Integer::sum)));
        return split;
    }

    /** Which open classes the dictionary places the run in, as it would be said aloud. */
    private static String partsOfSpeech(final Lexicon dictionary, final String run) {
        return Stream.of(named("noun", dictionary.nounBase(run)), named("verb", dictionary.verbBase(run)),
                        named("adjective", dictionary.adjectiveBase(run)))
                .flatMap(Optional::stream)
                .reduce((first, second) -> first + ", " + second)
                .orElse("");
    }

    private static Optional<String> named(final String part, final Optional<String> base) {
        return base.map(form -> part + " " + form);
    }

    private static int occurrences(final Collection<Integer> counts) {
        return counts.stream().mapToInt(Integer::intValue).sum();
    }
}
