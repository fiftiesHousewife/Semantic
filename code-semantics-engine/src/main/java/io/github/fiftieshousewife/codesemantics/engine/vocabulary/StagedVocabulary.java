package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.reading.StagedWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordStage;

/**
 * One repository's vocabulary as the pipeline left it at each of its stages.
 *
 * <p>Every stage is the same population read at a different point, so a difference between two panels is
 * the doing of the stage between them and of nothing else. That is the whole reason to draw them side by
 * side, and it is what a picture assembled from two separately-filtered files could not offer.
 *
 * <p><b>A word is sized by its claim in bits, not by how often it was written.</b> The words a Java program
 * contains most of are the words every Java program contains most of, so a picture sized by count draws the
 * language rather than the repository. The claim is the word's term of the Jensen–Shannon divergence between
 * what this repository is written in and what it is read against, taking the weakest claim any reference
 * makes, which is what {@link ChosenWords} ranks by. A word twice the size departs twice as far.
 *
 * <p>The claim is measured ONCE, over the population entering the pipeline, and the same figure is carried
 * through every stage the word survives. Recomputing it per stage would re-normalise the shares each time, so
 * a word would appear to grow because its neighbours had left, and the difference between two panels would
 * stop being the doing of the stage between them.
 */
public record StagedVocabulary(String repository, int files, List<Stage> stages) {

    /** One stage: what it keeps, what it removed to keep it, and the words it left. */
    public record Stage(WordStage stage, String keeps, String removes, int words, int occurrences,
                        int removedWords, int removedOccurrences, List<RankedWord> drawn) {
    }

    /** One word at one stage: how far it departs from what it is read against, and how often it was written. */
    public record RankedWord(String word, double claim, int occurrences) {
    }

    public StagedVocabulary {
        stages = List.copyOf(stages);
    }

    /**
     * The strongest claims a stage left, strongest first.
     *
     * <p>A word every reference writes at least as densely as this repository does states no claim, so it
     * carries a claim of zero or below and is not drawn. That is not a rule removing it: it is there being
     * nothing to draw, since a cloud has no size for a word that departs from nothing.
     */
    public static List<RankedWord> drawnFrom(final StagedWords staged, final int kept,
                                             final Map<String, Double> claimByWord) {
        return staged.surviving().words().stream()
                .map(word -> new RankedWord(word, claimByWord.getOrDefault(word, 0.0),
                        staged.surviving().occurrencesOf(word)))
                .filter(word -> word.claim() > 0.0)
                .sorted(Comparator.comparingDouble(RankedWord::claim).reversed()
                        .thenComparing(RankedWord::word))
                .limit(kept)
                .toList();
    }
}
