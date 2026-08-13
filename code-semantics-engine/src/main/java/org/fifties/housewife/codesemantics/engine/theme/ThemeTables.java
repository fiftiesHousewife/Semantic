package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.engine.behaviour.Behaviour;
import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;
import org.fifties.housewife.codesemantics.engine.theme.TopicWitnesses.Witness;

/** The markdown rows a theme report is made of, each keeping a figure beside the count it came from. */
final class ThemeTables {

    static final String RANKING_HEADER = """
            | Topic | ι | From names | References | Leads | Lines led | Share of lines | Carried by |
            |---|--:|--:|--:|--:|--:|--:|---|""";

    static final String BEHAVIOUR_HEADER = """
            | Verb | Times | What it acts on, and where |
            |---|--:|---|""";

    static final String FOREIGN_HEADER = """
            | Word | Distance | Occurrences | The dictionary places it in | First seen |
            |---|--:|--:|---|---|""";

    static final String CONTRIBUTION_HEADER = """
            | Share of the divergence | Topic | In scope | In repository | | Carried by |
            |--:|---|--:|--:|---|---|""";

    private static final int WITNESSES_SHOWN = 4;

    private ThemeTables() {
    }

    static String rankingRow(final TopicRanking ranking, final int totalLines, final List<Witness> carriedBy) {
        return "| `%s` | %s | %s | %s | %s | %s | %s | %s |".formatted(ranking.topic(),
                share(ranking.intensity()), percentage(ranking.nameShare()), count(ranking.references()),
                count(ranking.dominantFiles()), count(ranking.linesDominated()),
                percentage(ranking.lineShare(totalLines)), witnesses(carriedBy));
    }

    static String behaviourRow(final String verb, final List<Behaviour> clauses, final int shown) {
        return "| **%s** | %s | %s |".formatted(verb, count(clauses.size()),
                clauses.stream()
                        .limit(shown)
                        .map(clause -> "%s <sub>`%s`</sub>".formatted(clause.sentence(), clause.site()))
                        .collect(Collectors.joining("; ")));
    }

    static String foreignRow(final ForeignWords.ForeignWord foreign) {
        return "| `%s` | %s | %s | %s | `%s` |".formatted(foreign.word(), bits(foreign.bits()),
                count(foreign.occurrences()), String.join(", ", foreign.subjects()), foreign.site());
    }

    static String contributionRow(final Contribution contribution, final List<Witness> carriedBy) {
        return "| %s | `%s` | %s | %s | %s | %s |".formatted(percentage(contribution.shareOfDivergence()),
                contribution.topic(), share(contribution.scopeShare()), share(contribution.referenceShare()),
                contribution.concentratedInScope() ? "**over**" : "under", witnesses(carriedBy));
    }

    /** The words behind a topic, most written first — the reason a reader can argue with the row. */
    static String witnesses(final List<Witness> carriedBy) {
        return carriedBy.stream()
                .limit(WITNESSES_SHOWN)
                .map(witness -> "`%s`&nbsp;%s".formatted(witness.word(), count(witness.occurrences())))
                .collect(Collectors.joining(" "));
    }

    static String count(final int value) {
        return String.format(Locale.ROOT, "%,d", value);
    }

    static String share(final double value) {
        return String.format(Locale.ROOT, "%.4f", value);
    }

    static String percentage(final double value) {
        return String.format(Locale.ROOT, "%.1f%%", value * 100.0);
    }

    static String bits(final double value) {
        return String.format(Locale.ROOT, "%.4f", value);
    }
}
