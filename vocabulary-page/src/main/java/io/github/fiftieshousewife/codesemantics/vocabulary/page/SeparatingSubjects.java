package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;

/**
 * The subjects that tell one drawn reading from the others: the about line holds what the answering
 * standards are about, less every subject a majority of the readings drawn beside it also name.
 */
final class SeparatingSubjects {

    /** A set of one reading has nothing to be told apart from, so no subject is refused for failing to. */
    private static final int NOTHING_TO_SEPARATE = 1;

    private final PublisherSubjects subjects = PublisherSubjects.all();

    /**
     * The subjects an outright majority of the readings drawn name, which therefore say which vocabulary
     * matched rather than what any one repository is about.
     *
     * <p>CSO answers ten of the twelve readings published here and states {@code computer science} for
     * every one of them, so a reader comparing them learns from that word only that they are all
     * software. FpML, FIX and FIBO answer five each and their subjects separate the readings that carry
     * them from the readings that do not.
     *
     * <p><b>The bound is a majority because that is where one subject outweighs everything outside it</b>,
     * which is the rule {@code StatedAncestry.fieldLevels} already states over a vocabulary's own concepts
     * for the same reason. It is derived from the set being drawn and moves when that set does, rather
     * than naming a vocabulary here.
     */
    Set<String> subjectsAMajorityNames(final List<ReadingRow> readings) {
        if (readings.size() <= NOTHING_TO_SEPARATE) {
            return Set.of();
        }
        final Map<String, Long> readingsNaming = readings.stream()
                .flatMap(reading -> reading.answers().stream()
                        .map(ExportedAnswer::source)
                        .map(subjects::of)
                        .flatMap(Optional::stream)
                        .distinct())
                .collect(Collectors.groupingBy(subject -> subject, Collectors.counting()));
        return readingsNaming.entrySet().stream()
                .filter(subject -> 2 * subject.getValue() > readings.size())
                .map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableSet());
    }


    /**
     * What the standards that answered are about, strongest first, each named once, and without the
     * subjects a majority of the readings drawn name.
     *
     * <p>Two standards about the same thing state it once: FIBO and FpML both answer strata, and a line
     * reading <em>derivatives, derivatives</em> would be the page repeating itself rather than the
     * publishers agreeing.
     *
     * <p>A reading whose every answer came from a standard a majority names is left with no line at all.
     * That is the correct outcome: nothing was said about it that was not said about most of the others.
     */
    List<String> about(final List<DrawnReading.DrawnAnswer> answers, final Set<String> shared) {
        return answers.stream()
                .map(DrawnReading.DrawnAnswer::source)
                .map(subjects::of)
                .flatMap(Optional::stream)
                .filter(subject -> !shared.contains(subject))
                .distinct()
                .toList();
    }
}
