package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;

/**
 * The corroborated weight a repository's own writing gives a subject scheme's senses: within an arm whose
 * senses are all uncounted, a sense whose placing label the repository wrote as one run of adjacent words
 * takes the run's occurrence count as its {@code uses}, and every other sense keeps the uncounted weight.
 *
 * <p>The written runs are the committed evidence and nothing else: the multi-word terms the span walk
 * matched at the words themselves — the spelling rungs are left out because admitting a variant an entry
 * forbids is the documented route to overgeneration — and the collocated dictionary units the reading
 * merged. An arm with any counted sense is untouched, because counting frames never mix: WordNet's arm
 * keeps its tagged-corpus counts whatever the repository wrote.
 */
final class CorroboratedSenses {

    private static final Pattern WORDS = Pattern.compile("\\p{L}+");

    private static final String WORDS_RUNG = "WORDS";

    private final Map<String, Integer> occurrencesByRun;

    private CorroboratedSenses(final Map<String, Integer> occurrencesByRun) {
        this.occurrencesByRun = Map.copyOf(occurrencesByRun);
    }

    /** The runs one published reading's evidence records the repository writing, with their counts. */
    static CorroboratedSenses fromCommittedEvidence(final ReadingFolder reading) {
        final Map<String, Integer> runs = new HashMap<>();
        reading.termMatches().stream()
                .filter(match -> match.wordsInTerm() > 1)
                .filter(match -> WORDS_RUNG.equals(match.rung()))
                .forEach(match -> runs.merge(runOf(match.term()), match.occurrences(), Integer::sum));
        reading.collocatedUnits().forEach((unit, occurrences) ->
                runs.merge(runOf(unit), occurrences, Integer::sum));
        return new CorroboratedSenses(runs);
    }

    static CorroboratedSenses none() {
        return new CorroboratedSenses(Map.of());
    }

    /**
     * The arm's senses with the corroborated weights, unchanged where any sense carries a count of its
     * own. A sense with no written placing label keeps the uncounted weight, and a word with no senses
     * still has none — corroboration adds weight only where labels already exist.
     */
    List<CountedSenseDomains> of(final List<CountedSenseDomains> senses) {
        if (senses.stream().anyMatch(sense -> sense.uses() > 0)) {
            return senses;
        }
        return senses.stream()
                .map(this::corroborated)
                .toList();
    }

    private CountedSenseDomains corroborated(final CountedSenseDomains sense) {
        final int written = sense.placingLabels().stream()
                .mapToInt(label -> occurrencesByRun.getOrDefault(runOf(label), 0))
                .max()
                .orElse(0);
        return written == 0 ? sense : new CountedSenseDomains(sense.domains(), written,
                sense.labelStrength(), sense.placingLabels());
    }

    /** A label or term as the run of its words, lower case and single-spaced, so spellings meet. */
    private static String runOf(final String label) {
        return String.join(" ", WORDS.matcher(label.toLowerCase(Locale.ROOT)).results()
                .map(MatchResult::group)
                .toList());
    }
}
