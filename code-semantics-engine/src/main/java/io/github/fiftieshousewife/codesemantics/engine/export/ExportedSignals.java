package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;

/**
 * The words and published phrases scoring above every reference's own threshold.
 *
 * <p>Each reference's threshold comes from that reference's own permutation null, so the number of rows
 * follows from the repository's size. A word scores above every threshold or it is omitted: the lowest score
 * any reference gives it is the score it carries.
 */
public final class ExportedSignals {

    private final Map<String, Double> thresholdByReference;
    private final ReadingSource source;

    public ExportedSignals(final Map<String, Double> thresholdByReference, final ReadingSource source) {
        this.thresholdByReference = Map.copyOf(thresholdByReference);
        this.source = source;
    }

    /**
     * The signals in the ranking, highest score first.
     *
     * <p>A word two published resources place outside the dictionary and inside the language — {@code by},
     * {@code from}, {@code beside} — is one English put inside a name rather than one this repository chose,
     * so it is scored, ranked and left out here. The vocabulary report prints it under its own heading.
     */
    public List<ExportedSignal> in(final List<ChosenWord> ranked) {
        return ranked.stream()
                .filter(word -> !word.theLanguages())
                .filter(word -> word.clears(thresholdByReference))
                .map(this::signal)
                .toList();
    }

    private ExportedSignal signal(final ChosenWord word) {
        return new ExportedSignal(source, word.word(), word.occurrences(), word.inNames(), word.claim(),
                closestReference(word), SightingSite.of(word.site()));
    }

    /**
     * The reference scoring this word lowest against its own threshold, which is the score reported. Every
     * reference scored the word above its threshold, so the smallest margin is the one that decided it.
     */
    private String closestReference(final ChosenWord word) {
        return word.against().stream()
                .min(Comparator.comparingDouble(this::margin))
                .map(ChosenWord.ReferenceClaim::reference)
                .orElseThrow(() -> new IllegalStateException("no reference scored " + word.word()));
    }

    private double margin(final ChosenWord.ReferenceClaim claim) {
        return claim.claim() - thresholdByReference.getOrDefault(claim.reference(), 0.0);
    }
}
