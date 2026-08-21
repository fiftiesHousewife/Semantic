package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.Comparator;
import java.util.List;

/**
 * What one stage of the pipeline left, and what it took out to leave it.
 *
 * <p>Both halves are kept because only the pair says what a stage did. A population alone cannot say whether
 * a word is missing because a rule removed it or because nobody wrote it.
 */
public record StagedWords(WordStage stage, WrittenWords surviving, List<RemovedWord> removed) {

    public StagedWords {
        removed = removed.stream()
                .sorted(Comparator.comparingInt(RemovedWord::occurrences).reversed()
                        .thenComparing(RemovedWord::word))
                .toList();
    }

    /** How many occurrences this stage removed, which is what it cost the reading below it. */
    public int occurrencesRemoved() {
        return removed.stream().mapToInt(RemovedWord::occurrences).sum();
    }
}
