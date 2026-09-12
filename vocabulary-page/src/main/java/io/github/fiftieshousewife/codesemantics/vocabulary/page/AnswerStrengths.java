package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;

/**
 * Every answer of one reading on a single dimensionless scale: how many times its own chance figure it
 * stands at. A vocabulary's figure is its phrase count against the best a deal of its own words reaches;
 * a placement's is how much nearer its subject stands than the nearest subject of a scheme of shuffled
 * descriptions. Each is measured against its own null, so the two kinds can be ranked together without a
 * kind being preferred by construction.
 *
 * <p>Placements come from {@code summary.placedIn} rather than from {@code answers}, and only where they
 * stand apart from chance, so a card can show a strong placement beside a weak vocabulary even when the
 * answering cascade stopped at the vocabulary.
 */
final class AnswerStrengths {

    /** One answer at its strength: the kind names its unit, and the ratio is times-its-own-chance-figure. */
    record Strength(String kind, String source, String subject, double ratio) {

        static final String VOCABULARY = "vocabulary";
        static final String SCHEME = "scheme";

        String label() {
            return String.format(Locale.ROOT, VOCABULARY.equals(kind)
                    ? "%.1f× its chance bar" : "%.1f× nearer than chance", ratio);
        }
    }

    /** Every strength of one reading, strongest first. */
    List<Strength> of(final ReadingExport reading) {
        return Stream.concat(vocabularies(reading), placements(reading))
                .sorted(Comparator.comparingDouble(Strength::ratio).reversed())
                .toList();
    }

    Optional<Strength> strongest(final ReadingExport reading) {
        return of(reading).stream().findFirst();
    }

    private static Stream<Strength> vocabularies(final ReadingExport reading) {
        return reading.summary().answers().stream()
                .filter(answer -> answer.timesItsBar() != null)
                .map(answer -> new Strength(Strength.VOCABULARY, answer.source(), answer.result(),
                        answer.timesItsBar()));
    }

    private static Stream<Strength> placements(final ReadingExport reading) {
        return reading.summary().placedIn().stream()
                .flatMap(placement -> Stream.of(placement.archive(), placement.category())
                        .filter(ExportedPlacement.Level::standsApartFromChance)
                        .map(level -> new Strength(Strength.SCHEME, placement.scheme(),
                                level.subject(), ratioOf(level)))
                        .max(Comparator.comparingDouble(Strength::ratio))
                        .stream());
    }

    /** How much nearer than chance: the chance figure over the observed one, above 1 where nearer. */
    private static double ratioOf(final ExportedPlacement.Level level) {
        return level.nearestByChanceBits() / level.divergenceBits();
    }
}
