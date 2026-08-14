package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


/**
 * Renders a {@link RepositoryThemes} as markdown, in the order that keeps a reader honest: the ranking a
 * consumer asked for, immediately followed by the words carrying it, and then the comparison that is the
 * reading actually worth acting on.
 *
 * <p>A scope whose divergence did not beat its own permutation null gets no ranking printed at all. Printing
 * one under a caveat would be printing it, and the caveat is not what gets quoted.
 */
public final class ThemeReport {


    private static final TopicDistribution ORDINARY_ENGLISH =
            OrdinaryEnglish.fromClasspath().reading();

    private static final int TOPICS_SHOWN = 15;
    private static final int CONTRIBUTIONS_SHOWN = 8;
    private static final int WITNESSES_HELD = 8;

    public String render(final RepositoryThemes themes) {
        final List<String> lines = new ArrayList<>();
        lines.add("## What the whole repository reads as");
        lines.add("");
        lines.add(ThemeProse.QUALIFICATION);
        lines.add("");
        lines.add(ThemeTables.RANKING_HEADER);
        ranked(themes).forEach(lines::add);
        lines.add("");
        lines.add(vocabularySentence(themes));
        lines.add("");
        lines.add("## What distinguishes each scope from the repository");
        lines.add("");
        lines.add(ThemeProse.COMPARED_AMONG_WHAT_WAS_PLACED);
        themes.divergences().forEach(divergence -> lines.addAll(scopeSection(themes, divergence)));
        lines.add("");
        lines.add(costSentence(themes));
        return String.join("\n", lines) + "\n";
    }

    /**
     * The topics that earned a place, most-distinguishing first — not the topics with the most mass. A raw
     * ranking is led by whatever ambiguous word a codebase writes most, and this report printed one for most
     * of its life: {@code baseball} on {@code first}, {@code astronomy} on an import of JUnit Jupiter. A
     * topic reaches this table only where it makes some part of the repository unlike the rest of it and
     * where more than one word carries it.
     */
    private List<String> ranked(final RepositoryThemes themes) {
        final List<String> qualified = new QualifiedTopics(themes.witnesses(), ORDINARY_ENGLISH,
                FieldOfStudy.fromClasspath().nearestTo(themes.repository().intensity())).across(
                themes.divergences().stream().filter(scope -> scope.chance().exceedsChance()).toList(),
                themes.repository().intensity());
        return themes.rankings().stream()
                .filter(ranking -> qualified.contains(ranking.topic()))
                .limit(TOPICS_SHOWN)
                .map(ranking -> ThemeTables.rankingRow(ranking, themes.lines(),
                        themes.witnesses().forTopic(ranking.topic(), WITNESSES_HELD)))
                .toList();
    }


    /**
     * The words whose own subject is furthest from this repository's — where a metaphor shows up, because a
     * metaphor is a word carried in from somewhere else. Candidates, with the evidence to dismiss them by.
     */

    private List<String> scopeSection(final RepositoryThemes themes, final ScopeDivergence divergence) {
        final List<String> lines = new ArrayList<>();
        lines.add("");
        lines.add("### `%s`".formatted(divergence.scope()));
        lines.add("");
        lines.add(verdict(divergence));
        if (!divergence.qualified(CONTRIBUTIONS_SHOWN).isEmpty()) {
            lines.add("");
            lines.add(ThemeTables.CONTRIBUTION_HEADER);
            divergence.qualified(CONTRIBUTIONS_SHOWN).forEach(contribution -> lines.add(
                    ThemeTables.contributionRow(contribution,
                            themes.witnesses().forTopic(contribution.topic(), WITNESSES_HELD))));
        }
        return lines;
    }

    private static String verdict(final ScopeDivergence divergence) {
        final PermutationNull.Chance chance = divergence.chance();
        return String.format(Locale.ROOT, ThemeProse.VERDICT,
                ThemeTables.bits(divergence.bits()), ThemeTables.bits(chance.median()),
                ThemeTables.count(chance.resamples()), chance.excess(), chance.atLeastAsExtreme(),
                chance.exceedsChance() ? ThemeProse.STOOD_OUT : ThemeProse.DID_NOT_STAND_OUT);
    }

    private static String vocabularySentence(final RepositoryThemes themes) {
        final double unplaced = themes.repository().intensity().unplaced();
        return ThemeProse.VOCABULARY.formatted(
                ThemeTables.count(themes.files().size()), ThemeTables.count(themes.lines()),
                ThemeTables.count(themes.rankings().size()),
                ThemeTables.count(themes.filesWithoutATopic()),
                ThemeTables.percentage(mostLinesLed(themes)),
                ThemeTables.percentage(1.0 - unplaced), ThemeTables.percentage(unplaced));
    }

    /** The share of the repository's lines the strongest topic leads, and zero where nothing led any. */
    private static double mostLinesLed(final RepositoryThemes themes) {
        return themes.rankings().stream()
                .mapToDouble(ranking -> ranking.lineShare(themes.lines()))
                .max().orElse(0.0);
    }

    private static String costSentence(final RepositoryThemes themes) {
        return String.format(Locale.ROOT, ThemeProse.COST, themes.elapsed().toMillis() / 1000.0);
    }
}
