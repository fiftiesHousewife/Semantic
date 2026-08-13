package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.behaviour.Behaviour;
import org.fifties.housewife.codesemantics.engine.behaviour.Behaviours;

/**
 * Renders a {@link RepositoryThemes} as markdown, in the order that keeps a reader honest: the ranking a
 * consumer asked for, immediately followed by the words carrying it, and then the comparison that is the
 * reading actually worth acting on.
 *
 * <p>A scope whose divergence did not beat its own permutation null gets no ranking printed at all. Printing
 * one under a caveat would be printing it, and the caveat is not what gets quoted.
 */
public final class ThemeReport {

    private static final int TOPICS_SHOWN = 15;
    private static final int FOREIGN_SHOWN = 20;
    private static final int VERBS_SHOWN = 12;
    private static final int CLAUSES_SHOWN = 4;
    private static final int CONTRIBUTIONS_SHOWN = 8;
    private static final int WITNESSES_HELD = 8;

    public String render(final RepositoryThemes themes) {
        final List<String> lines = new ArrayList<>();
        lines.add("## What the whole repository reads as");
        lines.add("");
        lines.add(ThemeTables.RANKING_HEADER);
        ranked(themes).forEach(lines::add);
        lines.add("");
        lines.add(vocabularySentence(themes));
        lines.add("");
        lines.addAll(behaviourSection(themes));
        lines.add("");
        lines.addAll(foreignSection(themes));
        lines.add("");
        lines.add("## What distinguishes each scope from the repository");
        themes.divergences().forEach(divergence -> lines.addAll(scopeSection(themes, divergence)));
        lines.add("");
        lines.add(costSentence(themes));
        return String.join("\n", lines) + "\n";
    }

    private List<String> ranked(final RepositoryThemes themes) {
        return themes.rankings().stream()
                .limit(TOPICS_SHOWN)
                .map(ranking -> ThemeTables.rankingRow(ranking, themes.lines(),
                        themes.witnesses().forTopic(ranking.topic(), WITNESSES_HELD)))
                .toList();
    }

    /**
     * What the repository says it does, in its own words. A method name is a clause and a test name is a
     * sentence, so the suite is a specification wherever the convention holds.
     */
    private List<String> behaviourSection(final RepositoryThemes themes) {
        final Map<String, List<Behaviour>> byVerb = Behaviours.byVerb(themes.behaviours());
        final List<String> lines = new ArrayList<>();
        lines.add("## What this repository does");
        lines.add("");
        lines.add(("%s of its declared methods name a clause the dictionary can read as a verb and what the "
                + "verb acts on. Nothing here knows any verbs — a name whose first word has no verb entry "
                + "yields no behaviour rather than a guessed one.").formatted(
                ThemeTables.count(themes.behaviours().size())));
        lines.add("");
        lines.add(ThemeTables.BEHAVIOUR_HEADER);
        byVerb.entrySet().stream()
                .limit(VERBS_SHOWN)
                .forEach(verb -> lines.add(ThemeTables.behaviourRow(verb.getKey(), verb.getValue(),
                        CLAUSES_SHOWN)));
        return lines;
    }

    /**
     * The words whose own subject is furthest from this repository's — where a metaphor shows up, because a
     * metaphor is a word carried in from somewhere else. Candidates, with the evidence to dismiss them by.
     */
    private List<String> foreignSection(final RepositoryThemes themes) {
        final List<String> lines = new ArrayList<>();
        lines.add("## Words carried in from somewhere else");
        lines.add("");
        lines.add("Each of these is written at least three times, and the dictionary places it in a subject "
                + "this repository is not about. That is what a metaphor looks like from the outside — and "
                + "also what an ordinary technical term looks like when the resources are too coarse for it, "
                + "which is why these are candidates and the evidence is printed beside them.");
        lines.add("");
        lines.add(ThemeTables.FOREIGN_HEADER);
        themes.foreignWords().stream()
                .limit(FOREIGN_SHOWN)
                .forEach(foreign -> lines.add(ThemeTables.foreignRow(foreign)));
        return lines;
    }

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
