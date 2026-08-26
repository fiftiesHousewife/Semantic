package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSignal;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;

/**
 * The export's signals, merged under their lemmas: every published name's word that clears each
 * reference's own chance bar and that English did not supply. Every page draws this one population, so no
 * two pictures can disagree about which words are significant.
 */
final class SignificantWords {

    private SignificantWords() {
    }

    /** The merged words, and how many signals the export states before two spellings become one word. */
    record Significant(List<ScoredWord> words, int signals) {
    }

    /** The same population read from a published reading rather than retaken from the tree. */
    static Significant of(final ReadingExport export) {
        final ContentWords content = ContentWords.fromClasspath();
        final Map<String, Double> claimByLemma = export.signals().stream()
                .collect(Collectors.groupingBy(signal -> content.lemmaOrSurface(signal.word()),
                        Collectors.summingDouble(ExportedSignal::divergenceBits)));
        return new Significant(claimByLemma.entrySet().stream()
                .map(entry -> new ScoredWord(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingDouble(ScoredWord::claim).reversed()
                        .thenComparing(ScoredWord::word))
                .toList(), export.signals().size());
    }

    static Significant of(final RepositoryReading reading) {
        final WrittenWords written = new PublishedNames().published(reading.legibility());
        final ChosenWords ranking = ChosenWords.againstEnglishAndTheCorpus();
        final Map<String, Double> bars =
                VocabularyNull.byReference(ranking.chanceFor(written, reading.seed()));
        final ContentWords content = ContentWords.fromClasspath();
        final List<ChosenWord> cleared = ranking.in(written).stream()
                .filter(word -> !word.theLanguages())
                .filter(word -> word.clears(bars))
                .toList();
        final Map<String, Double> claimByLemma = cleared.stream()
                .collect(Collectors.groupingBy(word -> content.lemmaOrSurface(word.word()),
                        Collectors.summingDouble(ChosenWord::claim)));
        return new Significant(claimByLemma.entrySet().stream()
                .map(entry -> new ScoredWord(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingDouble(ScoredWord::claim).reversed()
                        .thenComparing(ScoredWord::word))
                .toList(), cleared.size());
    }
}
