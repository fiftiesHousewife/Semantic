package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.SharedMass;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectPlacement;

/**
 * Every bundled subject scheme's placement of one reading, each drawn against its own null.
 *
 * <p>The arXiv field arrives from the caller because the summary's own bars were computed against it;
 * every other scheme is placed here. No scheme is picked, and a scheme reporting nothing reports it.
 */
final class ExportedPlacements {

    /** Enough words to see what a placement rests on; the whole tail is in {@code themes}. */
    private static final int PLACEMENT_WITNESSES = 3;

    List<ExportedPlacement> in(final RepositoryReading reading, final RepositoryThemes themes,
                               final PlacedField field) {
        return List.of(placement(field, themes),
                placement(PlacedField.ofOpenAlex(themes.repository().comparison(), reading.seed()),
                        themes),
                placement(PlacedField.ofCso(themes.repository().comparison(), reading.seed()), themes));
    }

    /** One placement per scheme, each level carrying what it rests on and what chance cannot separate. */
    static ExportedPlacement placement(final PlacedField field, final RepositoryThemes themes) {
        return new ExportedPlacement(field.scheme(),
                level(field.archives(), field.archiveChance().chanceNearest(), themes),
                level(field.categories(), field.categoryChance().chanceNearest(), themes));
    }

    /**
     * One level: the nearest subject, and every subject standing nearer than chance did with it. The band is
     * the chance figure's own, so nothing here chooses how wide a tie has to be to count as one.
     */
    private static ExportedPlacement.Level level(final List<SubjectPlacement.Placement> ranked,
                                                 final double chanceNearest,
                                                 final RepositoryThemes themes) {
        final SubjectPlacement.Placement nearest = ranked.getFirst();
        return ExportedPlacement.Level.of(nearest.label(), nearest.bits(), chanceNearest,
                carrying(nearest, themes),
                ranked.stream()
                        .filter(placed -> placed.bits() < chanceNearest)
                        .map(placed -> new ExportedPlacement.Contender(placed.label(), placed.bits(),
                                placed.carriedBy().stream().map(SharedMass.Shared::topic).toList()))
                        .toList());
    }

    /**
     * What each meeting topic is worth to the placement, with the words that put the repository's mass
     * there. Fewer words than a theme row holds: a placement is the answer and the whole tail is in
     * {@code themes} and in the evidence beside it.
     */
    private static List<ExportedPlacement.CarryingTopic> carrying(final SubjectPlacement.Placement placed,
                                                                  final RepositoryThemes themes) {
        return placed.carriedBy().stream()
                .map(met -> new ExportedPlacement.CarryingTopic(met.topic(), met.scopeShare(),
                        met.subjectShare(),
                        themes.witnesses().forTopic(met.topic(), PLACEMENT_WITNESSES).stream()
                                .map(ExportedThemes::testimony).toList()))
                .toList();
    }
}
