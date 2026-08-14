package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;


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

    private static final String QUALIFICATION =
            "Only the topics that **earned a place**: a topic reaches this table where it makes some part "
            + "of this repository unlike the rest of it — a scope that departed further than the furthest "
            + "of a field of chance draws — and where more than one word carries it. A topic held at the "
            + "same density everywhere distinguishes nothing, and a topic one word holds a majority of is "
            + "that word's opinion. Both bars follow from the reading; neither is a list.";

    public String render(final RepositoryThemes themes) {
        final List<String> lines = new ArrayList<>();
        lines.add("## What the whole repository reads as");
        lines.add("");
        lines.add(QUALIFICATION);
        lines.add("");
        lines.add(ThemeTables.RANKING_HEADER);
        ranked(themes).forEach(lines::add);
        lines.add("");
        lines.add(vocabularySentence(themes));
        lines.add("");
        lines.add("## What distinguishes each scope from the repository");
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

    /**
     * The divergence beside the field it has to beat. Whether it beat it is stated in the same sentence,
     * because a divergence quoted without its null is the number a reader will treat as a finding.
     */
    private static String verdict(final ScopeDivergence divergence) {
        final PermutationNull.Chance chance = divergence.chance();
        return String.format(Locale.ROOT,
                "**%s bits** from the repository, against a null median of %s over %s resamples of the same "
                        + "size — an excess of %+.4f, and %d of those draws diverged at least as far. %s",
                ThemeTables.bits(divergence.bits()), ThemeTables.bits(chance.median()),
                ThemeTables.count(chance.resamples()), chance.excess(), chance.atLeastAsExtreme(),
                chance.exceedsChance()
                        ? "The scope stands outside its own null, so its topics are ranked below."
                        : "**The scope does not stand outside its own null**, so it has no topical content "
                                + "beyond its size and nothing is ranked.");
    }

    private static String vocabularySentence(final RepositoryThemes themes) {
        return ("Read over %s files and %s lines: %s topics, %s files no topic could be resolved for, and %s "
                + "of the repository's lines led by its single strongest topic. ι is a share of topical mass "
                + "and sums to 1 across every topic; the columns beside it are counts and do not. **From "
                + "names** is how much of a theme the code itself carried rather than its prose.").formatted(
                ThemeTables.count(themes.files().size()), ThemeTables.count(themes.lines()),
                ThemeTables.count(themes.rankings().size()),
                ThemeTables.count(themes.filesWithoutATopic()),
                ThemeTables.percentage(themes.rankings().isEmpty() ? 0.0
                        : themes.rankings().stream()
                                .mapToDouble(ranking -> ranking.lineShare(themes.lines()))
                                .max().orElse(0.0)));
    }

    private static String costSentence(final RepositoryThemes themes) {
        return String.format(Locale.ROOT,
                "Read, compared and resampled in %.1f s, recorded rather than estimated.",
                themes.elapsed().toMillis() / 1000.0);
    }
}
