package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;

/**
 * Turns the published readings into what the comparison page draws, ordered so the strongest evidence
 * stands first.
 *
 * <p>A reading is ordered by its strongest answer and its answers among themselves by their own strength,
 * because two sources answering one reading are rarely equal evidence and a list that does not order them
 * reads as though they were.
 */
final class DrawnReadings {

    private final PublisherLinks publishers = PublisherLinks.all();

    private final PublisherSubjects subjects = PublisherSubjects.all();

    private final ReadableName readable = ReadableName.fromClasspath();

    /** Every reading, strongest first, with the vocabularies any of them answered from. */
    DrawnReading.Drawing of(final List<ReadingRow> readings, final StatedAreas stated) {
        final List<DrawnReading> drawn = readings.stream()
                .map(reading -> reading(reading, stated))
                .sorted(Comparator.comparingDouble(DrawnReading::strength).reversed()
                        .thenComparing(DrawnReading::repository))
                .toList();
        return new DrawnReading.Drawing(drawn, sourcesOf(drawn));
    }

    /** Every source that answered anywhere, in the order the strongest answers name them. */
    private static List<String> sourcesOf(final List<DrawnReading> readings) {
        return readings.stream()
                .flatMap(reading -> reading.answers().stream())
                .map(DrawnReading.DrawnAnswer::source)
                .distinct()
                .toList();
    }

    private DrawnReading reading(final ReadingRow reading, final StatedAreas stated) {
        final Optional<String> area = reading.statedArea();
        final List<DrawnReading.DrawnAnswer> answers = reading.answers().stream()
                .map(answer -> answer(reading, answer))
                .sorted(Comparator.comparingInt(DrawnReading.DrawnAnswer::beyondChance).reversed()
                        .thenComparing(Comparator.comparingDouble(DrawnReading.DrawnAnswer::strength)
                                .reversed()))
                .toList();
        return new DrawnReading(reading.repository(), sourceTypeOf(reading), about(answers), answers,
                subjectsOf(answers), placedIn(reading), reading.lambda(), area.orElse(null),
                area.map(named -> stated.reached(reading.repository(), reading.subjects())).orElse(null),
                reading.vocabulariesBelowTheirChanceBar());
    }

    /**
     * What the standards that answered are about, strongest first and each named once.
     *
     * <p>Two standards about the same thing state it once: FIBO and FpML both answer strata, and a line
     * reading <em>derivatives, derivatives</em> would be the page repeating itself rather than the
     * publishers agreeing.
     */
    private List<String> about(final List<DrawnReading.DrawnAnswer> answers) {
        return answers.stream()
                .map(DrawnReading.DrawnAnswer::source)
                .map(subjects::of)
                .flatMap(Optional::stream)
                .distinct()
                .toList();
    }

    /** A publisher naming several parents at once is taken at the first, because a path is one answer. */
    private static final String SEVERAL_PARENTS = "|";

    /**
     * Every subject the answering publishers place this repository's phrases under, pooled and ranked by
     * how often the repository wrote what sits there.
     *
     * <p>One entry per publisher and subject. Two publishers naming one subject stay two entries, because
     * merging them would be this library deciding that two publishers said the same thing.
     */
    private List<DrawnReading.Subject> subjectsOf(final List<DrawnReading.DrawnAnswer> answers) {
        final Map<String, Integer> beyondBySource = answers.stream()
                .collect(Collectors.toMap(DrawnReading.DrawnAnswer::source,
                        DrawnReading.DrawnAnswer::beyondChance, (first, later) -> first));
        final Map<String, DrawnReading.Subject> pooled = new LinkedHashMap<>();
        answers.forEach(answer -> answer.branches().forEach(branch -> {
            final String subject = firstOf(branch.branch());
            pooled.merge(answer.source() + " " + subject,
                    new DrawnReading.Subject(subject, subject, answer.source(), branch.occurrences(),
                            branch.concepts()),
                    DrawnReadings::and);
        }));
        return pooled.values().stream()
                .map(this::readable)
                .sorted(Comparator
                        .comparingInt((DrawnReading.Subject subject) ->
                                beyondBySource.getOrDefault(subject.source(), 0)).reversed()
                        .thenComparing(this::formOf)
                        .thenComparing(Comparator.comparingInt(DrawnReading.Subject::occurrences)
                                .reversed())
                        .thenComparing(DrawnReading.Subject::subject))
                .toList();
    }

    /** The subject with the name a reader can read, which is the publisher's or the grammar's. */
    private DrawnReading.Subject readable(final DrawnReading.Subject subject) {
        return new DrawnReading.Subject(subject.subject(),
                readable.of(subject.subject().isBlank()
                        ? subject.concepts().getFirst().concept() : subject.subject()),
                subject.source(), subject.occurrences(), subject.concepts());
    }

    /**
     * Whether the subject reads as English once the grammar has had it, which breaks a tie the strength
     * leaves.
     *
     * <p><b>It is not what the ranking runs on.</b> Ranking a phrase above an identifier put CSO's
     * <em>reinforcement learning</em> and <em>value functions</em> above BIAN's <em>Term Deposit</em> and
     * FIBO's {@code PresentValue} on a derivatives library — because CSO labels in English and FIBO does
     * not. CSO cleared its bar there by 1.06 times and FIBO by 2.77, so the reading had already measured
     * which was the better evidence and the label's shape was overriding it. The strength answers first,
     * and how the label reads decides only between sources the strength cannot separate — strata's FIBO
     * at 2.765 and FpML at 2.760. Within one source it separates {@code SingleGeneralOrderHandling},
     * which anglicises, from {@code MsgSeqNum}, which does not — quickfixj wrote the second forty times
     * as often and it tells a reader nothing.
     */
    private LabelForm formOf(final DrawnReading.Subject subject) {
        return LabelForm.of(subject.subject()) == LabelForm.PHRASE
                || readable.anglicises(subject.subject())
                ? LabelForm.PHRASE : LabelForm.IDENTIFIER;
    }

    private static DrawnReading.Subject and(final DrawnReading.Subject first,
                                            final DrawnReading.Subject later) {
        final List<ReadingRow.Written> concepts = new ArrayList<>(first.concepts());
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

    /**
     * Every scheme's placement, at the levels standing apart from chance and no others.
     *
     * <p>A subject a scheme could not separate from a scheme of chance is not drawn at all. Printing it
     * with a caveat beside it is still printing a subject a reader takes at face value, which is the same
     * bar every vocabulary faces.
     */
    private static List<DrawnReading.Placement> placedIn(final ReadingRow reading) {
        return reading.placedIn().stream()
                .map(scheme -> new DrawnReading.Placement(scheme.scheme(),
                        apart(scheme.archive()), apart(scheme.category())))
                .filter(placement -> !placement.archive().isBlank()
                        || !placement.category().isBlank())
                .toList();
    }

    private static String apart(final ExportedPlacement.Level level) {
        return level.standsApartFromChance() ? level.subject() : "";
    }

    /** The rung that answered, which every answer of one reading comes from. */
    private static String sourceTypeOf(final ReadingRow reading) {
        return reading.answers().getFirst().sourceType();
    }

    private DrawnReading.DrawnAnswer answer(final ReadingRow reading, final ExportedAnswer answer) {
        return new DrawnReading.DrawnAnswer(answer.source(),
                publishers.of(answer.source()).orElse(null),
                answer.statedPath(),
                DrawnReading.conceptOf(answer.result()),
                DrawnReading.definitionOf(answer.result()),
                strengthOf(answer), unitOf(answer),
                answer.qualifiedBy(),
                reading.barOf(answer.source()).map(bar -> bar.phrases()).orElse(0),
                reading.barOf(answer.source())
                        .map(bar -> bar.phrases() - bar.chanceExpectedBest()).orElse(0),
                reading.branchesOf(answer.source()));
    }

    /**
     * Which scale the answer may be drawn on, and {@code NO_EVIDENCE} where it may be drawn on neither.
     *
     * <p>A reading that answered from nothing states no figure at all. Reading that as a distance of zero
     * bits would put it at the origin of a log scale, which is nowhere, so the unit says there is no
     * figure and the figure draws the reading a row with no mark.
     */
    private static String unitOf(final ExportedAnswer answer) {
        if (answer.timesItsBar() != null) {
            return DrawnReading.DrawnAnswer.TIMES_ITS_BAR;
        }
        return answer.bitsPastChance() == null
                ? DrawnReading.DrawnAnswer.NO_EVIDENCE
                : DrawnReading.DrawnAnswer.BITS_PAST_CHANCE;
    }

    /** The figure the answer stated, and zero where it stated none, which {@code unit} says it did. */
    private static double strengthOf(final ExportedAnswer answer) {
        if (answer.timesItsBar() != null) {
            return answer.timesItsBar();
        }
        return answer.bitsPastChance() == null ? 0.0 : answer.bitsPastChance();
    }
}
