package io.github.fiftieshousewife.codesemantics.engine.summary;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.DivergenceShare;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.ScopeLegibility;
import io.github.fiftieshousewife.codesemantics.engine.theme.FieldOfStudy;
import io.github.fiftieshousewife.codesemantics.engine.theme.QualifiedTopics;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.ScopeDivergence;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;

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

    private static final DivergenceShare DIVERGENCE = new DivergenceShare();

    private static final io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution ORDINARY_ENGLISH =
            io.github.fiftieshousewife.codesemantics.engine.theme.OrdinaryEnglish.fromClasspath().reading();

    /* A scope names only topics the whole reading qualified, so one table cannot contradict the other. */

    /**
     * The two denominators, stated together because they are read together and count different things.
     *
     * <p>λ is lexical: the share of word occurrences some bundled resource can be cited for at all. The
     * unplaced share is topical: of the mass the reading then observed, how much no subject was settled on —
     * a phrase nothing could place, and the part of a phrase whose words named so many subjects that none of
     * them was settled. A word can be perfectly legible and settle nothing, so λ is high where the unplaced
     * share is high, and a reader given one figure without the other will read the second as a failure of
     * the first.
     */
    public record Legibility(double lambda, int words, int files, double proseShare, double unplaced) {
    }

    /**
     * Where the reading places the repository, at both levels the subject scheme states.
     *
     * <p>The archive is compared against every category's description pooled under it, so its divergence
     * rests on enough prose to be stable. The category is compared against the few dozen words the scheme
     * states for it alone: a weaker measurement, and the one that answers what the repository is about.
     */
    public record Field(Nearest archive, Nearest category, String runnerUp, double runnerUpBits) {

        /** One subject, how far the repository stands from it, and how near chance came. */
        public record Nearest(String label, double bits, double chanceNearest) {

            public boolean standsApart() {
                return bits < chanceNearest;
            }
        }

        public boolean standsApart() {
            return archive.standsApart();
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
                                    final RepositoryThemes themes, final PlacedField field,
                                    final int topicsPerScope) {
        final List<ScopeDivergence> qualified = themes.divergences().stream()
                .filter(scope -> scope.chance().exceedsChance())
                .toList();
        final QualifiedTopics topics = new QualifiedTopics(themes.witnesses(), ORDINARY_ENGLISH,
                FieldOfStudy.fromClasspath().nearestTo(themes.repository().comparison()));
        final List<String> about = topics.across(qualified, themes.repository().intensity(),
                themes.repository().comparison());
        final List<Distinctive> distinctive = qualified.stream()
                .map(scope -> new Distinctive(scope.scope(), scope.bits(),
                        topics.concentratedIn(scope, topicsPerScope).stream()
                                .filter(about::contains).toList()))
                .filter(scope -> !scope.topics().isEmpty())
                .toList();
        return new ReadingSummary(repository,
                legibilityOf(legibility.repository(), themes.repository().intensity().unplaced()),
                fieldOf(field), distinctive, about,
                withheldFrom(themes, qualified));
    }

    private static Legibility legibilityOf(final ScopeLegibility scope, final double unplaced) {
        return new Legibility(scope.counts().legibility(), scope.counts().words(), scope.files(),
                scope.counts().proseShare(), unplaced);
    }

    private static Field fieldOf(final PlacedField field) {
        return new Field(
                new Field.Nearest(field.nearestArchive().label(), field.nearestArchive().bits(),
                        field.archiveChance().chanceNearest()),
                new Field.Nearest(field.nearestCategory().label(), field.nearestCategory().bits(),
                        field.categoryChance().chanceNearest()),
                field.runnerUpArchive().label(), field.runnerUpArchive().bits());
    }

    private static List<Withheld> withheldFrom(final RepositoryThemes themes,
                                               final List<ScopeDivergence> qualified) {
        return themes.divergences().stream()
                .filter(scope -> !qualified.contains(scope))
                .map(scope -> new Withheld(scope.scope(), String.format(
                        "%s of the maximum divergence, and %d of 999 chance draws stood at least as far",
                        DIVERGENCE.of(scope.bits()), scope.chance().atLeastAsExtreme())))
                .toList();
    }
}
