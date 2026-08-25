package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    static List<ScoredWord> of(final RepositoryReading reading) {
        final WrittenWords written = new PublishedNames().published(reading.legibility());
        final ChosenWords ranking = ChosenWords.againstEnglishAndTheCorpus();
        final Map<String, Double> bars =
                VocabularyNull.byReference(ranking.chanceFor(written, reading.seed()));
        final ContentWords content = ContentWords.fromClasspath();
        final Map<String, Double> claimByLemma = ranking.in(written).stream()
                .filter(word -> !word.theLanguages())
                .filter(word -> word.clears(bars))
                .collect(Collectors.groupingBy(word -> content.lemmaOrSurface(word.word()),
                        Collectors.summingDouble(ChosenWord::claim)));
        return claimByLemma.entrySet().stream()
                .map(entry -> new ScoredWord(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingDouble(ScoredWord::claim).reversed()
                        .thenComparing(ScoredWord::word))
                .toList();
    }
}
