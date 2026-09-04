package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchNormalisation;

/**
 * Every term match a reading recorded, drawn one per line so a reader can check what the description
 * rests on.
 *
 * <p><b>It draws the matches the reading set aside as well as the ones it published.</b> A vocabulary
 * that failed its bar publishes nothing, and a page that showed only what was published would tell a
 * reader nothing matched — which maven's reading says while its workings hold 55 matched phrases. The
 * outcome column states which is which.
 */
final class DrawnMatches {

    /** Only a term of more than one word; a one-word term is everyday English more often than a term. */
    private static final int PHRASE = 2;

    /** Every phrase match of one reading, most written first. */
    List<DrawnMatch> of(final String repository, final List<ReadingFolder.TermMatchRow> matches,
                        final List<ExportedTaxonomy> published) {
        final Map<String, ExportedTaxonomy.Bar> bars = published.stream()
                .collect(Collectors.toMap(ExportedTaxonomy::vocabulary, ExportedTaxonomy::bar,
                        (first, later) -> first));
        return matches.stream()
                .filter(match -> match.wordsInTerm() >= PHRASE)
                .map(match -> drawn(repository, match, bars))
                .sorted(Comparator.comparingInt(DrawnMatch::beyondChance).reversed()
                        .thenComparing(Comparator.comparingInt(DrawnMatch::occurrences).reversed())
                        .thenComparing(DrawnMatch::term))
                .toList();
    }

    private static DrawnMatch drawn(final String repository, final ReadingFolder.TermMatchRow match,
                                    final Map<String, ExportedTaxonomy.Bar> bars) {
        final ExportedTaxonomy.Bar bar = bars.get(match.vocabulary());
        return new DrawnMatch(repository, match.vocabulary(), match.term(), match.concepts(),
                match.occurrences(), matchedOn(match.normalisation()), match.outcome(),
                bar == null ? 0 : bar.phrases(), bar == null ? 0 : bar.chanceExpectedBest());
    }

    /**
     * What both sides were reduced to, in the words the reading states rather than the name of its
     * constant. A reading written before a level existed states a name this enumeration does not, and
     * that name is drawn as it stands rather than the page failing on an older reading.
     */
    private static String matchedOn(final String stated) {
        try {
            return MatchNormalisation.valueOf(stated).normalisation();
        } catch (final IllegalArgumentException unknownToThisVersion) {
            return stated.toLowerCase(java.util.Locale.ROOT);
        }
    }
}
