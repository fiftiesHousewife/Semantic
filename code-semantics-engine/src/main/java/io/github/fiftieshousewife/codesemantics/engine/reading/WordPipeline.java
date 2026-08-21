package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Every rule about what counts as a word of this repository, in one order, each stage stating what it
 * removed.
 *
 * <p>The rules existed already and were spread across the tree — a length rule in one package, a shorthand
 * rule in another, a names-and-prose split implicit in which tally a caller happened to ask for. Two paths
 * reading the same repository therefore answered differently about the same word: {@code buf} was the
 * fourth most distinctive word in a derivatives library and carried no subject at all, and {@code id} led
 * one ranking while the other never offered it. Nothing here is a new rule. What is new is that there is one
 * order and one place to read it.
 *
 * <p><b>The language arrives as a {@link Dialect}.</b> Most of the pipeline is facts about English and about
 * published dictionaries and holds wherever the code was written; a naming convention is a fact about one
 * language's specification and does not. The dialect is held here so both the word reading and the phrase
 * reading ask the same object rather than each citing JavaBeans for itself.
 *
 * <p>The lemma stage merges rather than removes, so it reports no removals: two spellings becoming one word
 * is not a word being taken out, and recording it as one would say the reading lost something it kept.
 *
 * <p><b>Two shapes, one set of rules.</b> {@link #over} funnels a whole tally, which is what a report of the
 * stages needs; {@link #leavesAt} asks the same rules about one word, which is what a reading streaming
 * words past them needs. {@link WordStage#NAMES} appears only in the first, because whether a word was
 * written as a name is a fact about the occurrence rather than about the word, and the streaming caller
 * already knows it from the parse.
 */
public final class WordPipeline {

    private final Predicate<String> tooShortToMean;
    private final CitedExpansions expansions;
    private final Predicate<String> theLanguages;
    private final UnaryOperator<String> lemma;
    private final Dialect dialect;

    public WordPipeline(final Predicate<String> tooShortToMean, final CitedExpansions expansions,
                        final UnaryOperator<String> lemma) {
        this(tooShortToMean, expansions, word -> false, lemma, Dialect.none());
    }

    public WordPipeline(final Predicate<String> tooShortToMean, final CitedExpansions expansions,
                        final Predicate<String> theLanguages, final UnaryOperator<String> lemma,
                        final Dialect dialect) {
        this.tooShortToMean = tooShortToMean;
        this.expansions = expansions;
        this.theLanguages = theLanguages;
        this.lemma = lemma;
        this.dialect = dialect;
    }

    /** The language whose naming conventions this pipeline reads, for a report to name. */
    public Dialect dialect() {
        return dialect;
    }

    /**
     * The stage that removes this word, or empty where it survives every one of them.
     *
     * <p>It is the same question {@link #over} answers for a whole tally, asked one word at a time, so a
     * reading that meets words as it walks a tree and a report that funnels a finished tally cannot
     * disagree about what a word is.
     */
    public java.util.Optional<WordStage> leavesAt(final String word) {
        if (tooShortToMean.test(word)) {
            return java.util.Optional.of(WordStage.SYMBOL);
        }
        if (expansions.outnumberTheMeaningsOf(word)) {
            return java.util.Optional.of(WordStage.SHORTHAND);
        }
        if (theLanguages.test(word)) {
            return java.util.Optional.of(WordStage.LANGUAGE);
        }
        return java.util.Optional.empty();
    }

    /**
     * Whether English supplied the word rather than the author choosing it.
     *
     * <p>It is asked separately from {@link #leavesAt} because a word can be two things at once: {@code by}
     * is both too short to be about anything and a preposition, and a reading that reported only the first
     * would have lost the second.
     */
    public boolean theLanguagesOwn(final String word) {
        return theLanguages.test(word);
    }

    /** Whether every stage that judges a word on its spelling alone keeps it. */
    public boolean keeps(final String word) {
        return leavesAt(word).isEmpty();
    }

    /** Every stage in order, each carrying what it left and what it took out to leave it. */
    public List<StagedWords> over(final WrittenWords written) {
        final List<StagedWords> staged = new ArrayList<>();
        staged.add(new StagedWords(WordStage.WRITTEN, written, List.of()));
        staged.add(namesOnly(written));
        staged.add(keeping(WordStage.SYMBOL, staged.getLast().surviving(),
                word -> !tooShortToMean.test(word)));
        staged.add(keeping(WordStage.SHORTHAND, staged.getLast().surviving(),
                word -> !expansions.outnumberTheMeaningsOf(word)));
        staged.add(keeping(WordStage.LANGUAGE, staged.getLast().surviving(),
                word -> !theLanguages.test(word)));
        staged.add(new StagedWords(WordStage.LEMMA, staged.getLast().surviving().mergedBy(lemma),
                List.of()));
        return List.copyOf(staged);
    }

    /**
     * A word written only in a sentence is what the file says about itself. The licence header is the
     * commonest prose in most repositories and the words it removes here — {@code license}, {@code apache},
     * {@code distribute} — are the ones that dominate any ranking taken before this stage.
     */
    private static StagedWords namesOnly(final WrittenWords written) {
        final WrittenWords names = written.asNamesOnly();
        return new StagedWords(WordStage.NAMES, names, written.words().stream()
                .filter(word -> !names.words().contains(word))
                .map(word -> new RemovedWord(word, written.occurrencesOf(word), WordStage.NAMES))
                .toList());
    }

    private static StagedWords keeping(final WordStage stage, final WrittenWords written,
                                       final Predicate<String> kept) {
        return new StagedWords(stage, written.retaining(kept), written.words().stream()
                .filter(kept.negate())
                .map(word -> new RemovedWord(word, written.occurrencesOf(word), stage))
                .toList());
    }
}
