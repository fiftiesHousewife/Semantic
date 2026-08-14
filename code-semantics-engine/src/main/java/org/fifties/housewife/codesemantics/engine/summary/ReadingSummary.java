package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.reading.RepositoryLegibility;
import org.fifties.housewife.codesemantics.engine.reading.ScopeLegibility;
import org.fifties.housewife.codesemantics.engine.theme.QualifiedTopics;
import org.fifties.housewife.codesemantics.engine.theme.TopicCitations;
import org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes;
import org.fifties.housewife.codesemantics.engine.theme.ScopeDivergence;
import org.fifties.housewife.codesemantics.engine.theme.SubjectNull;
import org.fifties.housewife.codesemantics.engine.theme.SubjectPlacement.Placement;

/**
 * Everything the reading found that cleared a stated bar, and nothing else.
 *
 * <p>The detailed reports print what was measured; this prints what was <em>shown</em>. The difference is a
 * bar in every case and never an opinion about which rows look convincing: a scope appears only where its
 * divergence beat the furthest of a field of chance draws, a subject appears only where it beat the nearest
 * a taxonomy of chance would have offered, and a topic appears only where it accounts for some qualified
 * scope's departure. A ranking of the whole repository has nothing to be compared against, so there is none
 * here — that absence is the honest form of the question "what is it about", not an omission.
 *
 * <p><b>What did not clear its bar is named rather than dropped.</b> A summary that printed only the
 * survivors would read as a reading with nothing wrong with it, and the withheld list is usually the more
 * informative half.
 */
public record ReadingSummary(String repository, Legibility legibility, Field field,
                             List<Distinctive> distinctive, List<String> about, List<Withheld> withheld) {

    private static final org.fifties.housewife.codesemantics.engine.theme.TopicDistribution ORDINARY_ENGLISH =
            org.fifties.housewife.codesemantics.engine.theme.OrdinaryEnglish.fromClasspath().reading();

    /** How much of the repository any resource could be cited for, which is the denominator for the rest. */
    public record Legibility(double lambda, int words, int files, double proseShare) {
    }

    /** The nearest published subject, and the nearest a taxonomy of chance offered. */
    public record Field(String label, double bits, double chanceNearest, String runnerUp,
                        double runnerUpBits) {

        public boolean standsApart() {
            return bits < chanceNearest;
        }
    }

    /** One scope that departed from the repository further than chance, and what it writes more of. */
    public record Distinctive(String scope, double bits, List<String> topics) {
    }

    /** Something the reading measured and will not report, with the bar it failed. */
    public record Withheld(String what, String why) {
    }

    public ReadingSummary {
        distinctive = List.copyOf(distinctive);
        about = List.copyOf(about);
        withheld = List.copyOf(withheld);
    }

    public static ReadingSummary of(final String repository, final RepositoryLegibility legibility,
                                    final RepositoryThemes themes, final List<Placement> field,
                                    final SubjectNull.Chance chance, final int topicsPerScope) {
        final List<ScopeDivergence> qualified = themes.divergences().stream()
                .filter(scope -> scope.chance().exceedsChance())
                .toList();
        final List<Distinctive> distinctive = qualified.stream()
                .map(scope -> new Distinctive(scope.scope(), scope.bits(),
                        new QualifiedTopics(themes.witnesses(), ORDINARY_ENGLISH).concentratedIn(scope, topicsPerScope)))
                .filter(scope -> !scope.topics().isEmpty())
                .toList();
        return new ReadingSummary(repository, legibilityOf(legibility.repository()),
                fieldOf(field, chance), distinctive, new QualifiedTopics(themes.witnesses(), ORDINARY_ENGLISH).across(qualified, themes.repository().intensity()),
                withheldFrom(themes, qualified));
    }

    private static Legibility legibilityOf(final ScopeLegibility scope) {
        return new Legibility(scope.counts().legibility(), scope.counts().words(), scope.files(),
                scope.counts().proseShare());
    }

    private static Field fieldOf(final List<Placement> field, final SubjectNull.Chance chance) {
        final Placement nearest = field.getFirst();
        final Placement runnerUp = field.get(1);
        return new Field(nearest.label(), nearest.bits(), chance.chanceNearest(), runnerUp.label(),
                runnerUp.bits());
    }

    private static List<Withheld> withheldFrom(final RepositoryThemes themes,
                                               final List<ScopeDivergence> qualified) {
        return themes.divergences().stream()
                .filter(scope -> !qualified.contains(scope))
                .map(scope -> new Withheld(scope.scope(), String.format(
                        "%.4f bits, and %d of 999 chance draws stood at least as far", scope.bits(),
                        scope.chance().atLeastAsExtreme())))
                .toList();
    }
}
