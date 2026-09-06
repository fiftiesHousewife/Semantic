package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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

    private final DrawnSubjects subjects = new DrawnSubjects();

    /** Every reading, strongest first, with the vocabularies any of them answered from. */
    DrawnReading.Drawing of(final List<ReadingRow> readings, final StatedAreas stated) {
        final Set<String> shared = subjects.subjectsAMajorityNames(readings);
        final List<DrawnReading> drawn = readings.stream()
                .map(reading -> reading(reading, stated, shared))
                .sorted(Comparator.comparingDouble(DrawnReading::strength).reversed()
                        .thenComparing(DrawnReading::repository))
                .toList();
        return new DrawnReading.Drawing(drawn, sourcesOf(drawn));
    }

    /**
     * The answers of one reading, rarest by chance first.
     *
     * <p><b>The rate is the ranking and the count is the tie-break.</b> Ranking by how many phrases a
     * publisher reached past its bar puts the largest vocabulary first on every repository, because the
     * count scales with how many terms the publisher states: CSO states 14,259 topics and BIAN 319, so on
     * jpos CSO led on 16 phrases past a bar of 10 while standing at only 1.6 times that bar — the weakest
     * ratio of the five that answered — and BIAN's <em>Card Capture</em>, <em>Point of Service</em> and
     * <em>Savings Account</em> came last on three. Ranking by the ratio has the opposite bias: it calls
     * four matches against a chance of two stronger than thirty against twenty-one.
     *
     * <p>The rate is a probability drawn from each publisher's own 999 deals, so it is comparable between
     * publishers of any size and nothing about it is chosen. It is also coarse — a count no deal reached
     * saturates at {@code 1/1000} — so two publishers that never occur by chance are separated by the
     * count past their bar, which is the figure the rate has run out of resolution to state.
     */
    private static final Comparator<DrawnReading.DrawnAnswer> RAREST_BY_CHANCE =
            Comparator.comparingDouble(DrawnReading.DrawnAnswer::chanceRate)
                    .thenComparing(Comparator.comparingInt(DrawnReading.DrawnAnswer::beyondChance)
                            .reversed())
                    .thenComparing(Comparator.comparingDouble(DrawnReading.DrawnAnswer::strength)
                            .reversed());

    /** Every source that answered anywhere, in the order the strongest answers name them. */
    private static List<String> sourcesOf(final List<DrawnReading> readings) {
        return readings.stream()
                .flatMap(reading -> reading.answers().stream())
                .map(DrawnReading.DrawnAnswer::source)
                .distinct()
                .toList();
    }

    private DrawnReading reading(final ReadingRow reading, final StatedAreas stated,
                                 final Set<String> shared) {
        final Optional<String> area = reading.statedArea();
        final List<DrawnReading.DrawnAnswer> answers = reading.answers().stream()
                .map(answer -> answer(reading, answer))
                .sorted(RAREST_BY_CHANCE)
                .toList();
        return new DrawnReading(reading.repository(), sourceTypeOf(reading),
                subjects.about(answers, shared), answers, subjects.of(answers), placedIn(reading),
                reading.lambda(), area.orElse(null),
                area.map(named -> stated.reached(reading.repository(), reading.subjects())).orElse(null),
                reading.vocabulariesBelowTheirChanceBar());
    }

    /** What a source stating no chance rate carries — a subject scheme, which is ranked beneath every
     * vocabulary that answered because the cascade already prefers a matched phrase to a divergence. */
    private static final double CERTAIN = 1.0;

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

    /** The normalisation that answered, which every answer of one reading comes from. */
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
                reading.barOf(answer.source()).map(bar -> bar.chanceRate()).orElse(CERTAIN),
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
