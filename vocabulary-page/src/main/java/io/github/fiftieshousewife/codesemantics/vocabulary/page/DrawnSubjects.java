package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;

/**
 * The subject lines of one drawn reading: what the answering standards are about, and every subject their
 * publishers place the repository's phrases under, pooled, named readably and ordered described-first.
 */
final class DrawnSubjects {

    /** A set of one reading has nothing to be told apart from, so no subject is refused for failing to. */
    private static final int NOTHING_TO_SEPARATE = 1;

    /** A publisher naming several parents at once is taken at the first, because a path is one answer. */
    private static final String SEVERAL_PARENTS = "|";

    private final PublisherSubjects subjects = PublisherSubjects.all();

    private final ReadableName readable = ReadableName.fromClasspath();

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

    /**
     * Every subject the answering publishers place this repository's phrases under, pooled and ranked by
     * whether its publisher describes it and by how much of the repository sits under it.
     *
     * <p>One entry per publisher and subject. Two publishers naming one subject stay two entries, because
     * merging them would be this library deciding that two publishers said the same thing.
     *
     * <p><b>The description is not ordered by the evidence.</b> Ranking these by each source's own chance
     * rate imported the ordering of {@code answers} into the line a reader reads for meaning, and the two
     * are not the same question: CSO ranks first by chance rate on most readings and states a definition
     * for a fifth of its topics, so a reader was handed {@code public keys} and nothing that says what it
     * is, above BIAN's <em>Card Capture</em>, which BIAN defines. {@code answers} keeps the chance rate,
     * which is what says whose evidence is the stronger.
     */
    List<DrawnReading.Subject> of(final List<DrawnReading.DrawnAnswer> answers) {
        final Map<String, DrawnReading.Subject> pooled = new LinkedHashMap<>();
        answers.forEach(answer -> answer.branches().forEach(branch -> {
            final String subject = firstOf(branch.branch());
            pooled.merge(answer.source() + " " + subject,
                    new DrawnReading.Subject(subject, subject, answer.source(), branch.occurrences(),
                            branch.concepts()),
                    DrawnSubjects::and);
        }));
        return pooled.values().stream()
                .map(this::readable)
                .sorted(describedFirst())
                .toList();
    }

    /**
     * The order the description is drawn in: a subject its publisher describes, then one stated in
     * English, then the share of the repository written under it.
     *
     * <p>The share is the subject's occurrences, because every subject of one reading is a share of the
     * same repository and a count and a share order identically over them.
     */
    private Comparator<DrawnReading.Subject> describedFirst() {
        return Comparator
                .comparing(DrawnSubjects::describedBy)
                .thenComparing(this::formOf)
                .thenComparing(Comparator.comparingInt(DrawnReading.Subject::occurrences).reversed())
                .thenComparing(DrawnReading.Subject::subject);
    }

    private static SubjectDescription describedBy(final DrawnReading.Subject subject) {
        return SubjectDescription.of(subject.concepts());
    }

    /** The subject with the name a reader can read, which is the publisher's or the grammar's. */
    private DrawnReading.Subject readable(final DrawnReading.Subject subject) {
        return new DrawnReading.Subject(subject.subject(),
                readable.of(subject.subject().isBlank()
                        ? subject.concepts().getFirst().concept() : subject.subject()),
                subject.source(), subject.occurrences(), subject.concepts());
    }

    /**
     * Whether the subject reads as English once the grammar has had it, which breaks a tie between two
     * subjects their publishers both describe or both leave undescribed.
     *
     * <p><b>It is not what the ranking runs on.</b> Ranking a phrase above an identifier put CSO's
     * <em>reinforcement learning</em> and <em>value functions</em> above BIAN's <em>Term Deposit</em> and
     * FIBO's {@code PresentValue} on a derivatives library — because CSO labels in English and FIBO does
     * not, and CSO defines neither of those two topics. Whether the publisher says what a concept means
     * answers first, and how the label reads decides only between subjects that cannot separate.
     */
    private LabelForm formOf(final DrawnReading.Subject subject) {
        return LabelForm.of(subject.subject()) == LabelForm.PHRASE
                || readable.anglicises(subject.subject())
                ? LabelForm.PHRASE : LabelForm.IDENTIFIER;
    }

    private static DrawnReading.Subject and(final DrawnReading.Subject first,
                                            final DrawnReading.Subject later) {
        final List<WrittenConcept> concepts = new ArrayList<>(first.concepts());
        later.concepts().stream().filter(concept -> !concepts.contains(concept)).forEach(concepts::add);
        return new DrawnReading.Subject(first.subject(), first.readable(), first.source(),
                first.occurrences() + later.occurrences(), concepts);
    }

    /**
     * The first parent a publisher states, and nothing where it states none.
     *
     * <p>An empty subject is not a gap to fill. FpML declares 616 of its 1,405 types with no base type,
     * and strata's largest group of matched phrases is exactly those — so the entry stands, holding the
     * phrases, and the page names it by what is in it rather than by a subject nobody stated.
     */
    private static String firstOf(final String stated) {
        final String named = stated.contains(SEVERAL_PARENTS)
                ? stated.substring(0, stated.indexOf(SEVERAL_PARENTS)) : stated;
        return named.strip();
    }
}
