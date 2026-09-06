package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;

/**
 * The ranking, the signals it produced and the bars they were cut at, kept together so every count is
 * taken from the rule that produced it rather than from a subtraction that pools two.
 */
record Vocabulary(List<ChosenWord> ranked, List<ExportedSignal> signals, Map<String, Double> bars) {

    static Vocabulary of(final RepositoryLegibility legibility,
                         final List<VocabularyNull.Bar> namesChance) {
        final List<ChosenWord> ranked = ChosenWords.againstEnglishAndTheCorpus()
                .in(new PublishedNames().published(legibility));
        final Map<String, Double> thresholds = VocabularyNull.byReference(namesChance);
        return new Vocabulary(ranked, new ExportedSignals(thresholds, ReadingSource.CLONE).in(ranked),
                thresholds);
    }
}
