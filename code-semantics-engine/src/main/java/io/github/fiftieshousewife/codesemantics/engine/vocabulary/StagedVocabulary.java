package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Comparator;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.StagedWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordStage;

/**
 * One repository's vocabulary as the pipeline left it at each of its stages.
 *
 * <p>Every stage is the same population read at a different point, so a difference between two panels is
 * the doing of the stage between them and of nothing else. That is the whole reason to draw them side by
 * side, and it is what a picture assembled from two separately-filtered files could not offer.
 *
 * <p>The weight is the occurrence count at every stage, so the panels share one unit and a word twice the
 * size of another was written twice as often. A ranking by departure is a different question and belongs in
 * a picture that says so.
 */
public record StagedVocabulary(String repository, int files, List<Stage> stages) {

    /** One stage: what it keeps, what it removed to keep it, and the words it left. */
    public record Stage(WordStage stage, String keeps, String removes, int words, int occurrences,
                        int removedWords, int removedOccurrences, List<RankedWord> drawn) {
    }

    /** One word at one stage, with how often the repository had written it there. */
    public record RankedWord(String word, double weight, int occurrences) {
    }

    public StagedVocabulary {
        stages = List.copyOf(stages);
    }

    /** The heaviest words a stage left, heaviest first. */
    public static List<RankedWord> drawnFrom(final StagedWords staged, final int kept) {
        return staged.surviving().words().stream()
                .map(word -> new RankedWord(word, staged.surviving().occurrencesOf(word),
                        staged.surviving().occurrencesOf(word)))
                .filter(word -> word.weight() > 0.0)
                .sorted(Comparator.comparingDouble(RankedWord::weight).reversed()
                        .thenComparing(RankedWord::word))
                .limit(kept)
                .toList();
    }
}
