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
 * makes, which is what {@link ChosenWords} ranks by.
 *
 * <p><b>Dividing that term by the occurrences which earned it was tried and it measures nothing.</b> Where a
 * reference does not carry a word at all its share there is zero, the term collapses to half the share here,
 * and the term per occurrence is therefore the same constant for every such word. On this tree that tied all
 * sixty drawn words to six decimal places and left them in alphabetical order. Among the words a reference is
 * silent about — which is most of a repository's own vocabulary — how often it was written is the only signal
 * there is, so a picture of that vocabulary cannot avoid being mass-weighted.
 *
 * <p><b>A word is drawn only where its claim stands outside chance.</b> {@link VocabularyNull} draws a
 * repository of this size from the reference's own distribution and reads off the quantile a field of this
 * many words asks for. That bar is derived from a null rather than chosen as a minimum count.
 *
 * <p>Both figures are measured ONCE, over the population entering the pipeline, and carried through every
 * stage the word survives — including the occurrence count they are divided by, which is why a stage removing
 * a word's neighbours cannot make it grow. Recomputing per stage would re-normalise the shares each time and
 * the difference between two panels would stop being the doing of the stage between them.
 */
public record StagedVocabulary(String repository, int files, List<Stage> stages) {

    /** One stage: what it keeps, what it removed to keep it, and the words it left. */
    public record Stage(WordStage stage, String keeps, String removes, int words, int occurrences,
                        int removedWords, int removedOccurrences, List<RankedWord> drawn) {
    }

    /**
     * One word at one stage: how far it departs from what it is read against, in bits, and how often this
     * stage still holds it.
     */
    public record RankedWord(String word, double claim, int occurrences) {
    }

    public StagedVocabulary {
        stages = List.copyOf(stages);
    }

    /**
     * The words a stage left that depart furthest, furthest first.
     *
     * <p><b>How many are drawn is not a number chosen here.</b> Every word that clears its bar is drawn, so
     * the picture ends where the evidence does rather than at a round figure somebody picked. On this tree
     * that is 325 of the final stage's 1,259 words and 780 of the first stage's 4,262.
     *
     * <p>Two things keep a word out, and neither is a rule about the word. A word every reference writes at
     * least as densely as this repository does departs from nothing, so there is no size to draw it at. A
     * word whose claim a repository of this size would have reached against that reference by chance has not
     * been shown to depart at all.
     */
    public static List<RankedWord> drawnFrom(final StagedWords staged,
                                             final Map<String, ChosenWord> chosenByWord,
                                             final Map<String, Double> barByReference) {
        return staged.surviving().words().stream()
                .filter(chosenByWord::containsKey)
                .map(chosenByWord::get)
                .filter(chosen -> chosen.claim() > 0.0 && chosen.occurrences() > 0)
                .filter(chosen -> chosen.clears(barByReference))
                .map(chosen -> new RankedWord(chosen.word(), chosen.claim(),
                        staged.surviving().occurrencesOf(chosen.word())))
                .sorted(Comparator.comparingDouble(RankedWord::claim).reversed()
                        .thenComparing(RankedWord::word))
                .toList();
    }
}
