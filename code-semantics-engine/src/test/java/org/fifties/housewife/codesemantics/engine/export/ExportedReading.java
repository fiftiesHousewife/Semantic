package org.fifties.housewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.OliaTerms;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.LegibilityReading;
import org.fifties.housewife.codesemantics.engine.reading.RepositoryLegibility;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;
import org.fifties.housewife.codesemantics.engine.reading.WrittenWords;
import org.fifties.housewife.codesemantics.engine.summary.ReadingSummary;
import org.fifties.housewife.codesemantics.engine.term.CorroboratedReading;
import org.fifties.housewife.codesemantics.engine.term.LinguisticTerms;
import org.fifties.housewife.codesemantics.engine.theme.PlacedField;
import org.fifties.housewife.codesemantics.engine.theme.RepositoryThemes;
import org.fifties.housewife.codesemantics.engine.vocabulary.ChosenWord;
import org.fifties.housewife.codesemantics.engine.vocabulary.ChosenWords;
import org.fifties.housewife.codesemantics.engine.vocabulary.PublishedNames;
import org.fifties.housewife.codesemantics.engine.vocabulary.VocabularyNull;

/**
 * One working tree read into the export a consumer receives. Every reading it composes is one the reports
 * also run, at the same seed, so the file and the documents state the same figures — and none of the
 * documents has to be written for the file to exist.
 */
public final class ExportedReading {

    /** Enough words behind a topic to check the row; the whole tail is in the reports. */
    private static final int WITNESSES_HELD = 8;

    private static final int TOPICS_PER_SCOPE = 3;

    /** How many words and concepts the summary names before a consumer opens the evidence beneath it. */
    private static final int LEADING = 10;

    public ReadingExport of(final TreeReading reading, final String commit) {
        final ParsedRepository parsed = reading.parsed();
        final RepositoryThemes themes = reading.themes();
        final RepositoryLegibility legibility = LegibilityReading.fromClasspath().of(parsed);
        final PlacedField field = PlacedField.ofArxiv(themes.repository().comparison(), TreeReading.SEED);
        final ReadingSummary summary = summaryOf(reading, legibility, themes, field);
        final Vocabulary vocabulary = vocabularyOf(legibility);
        final CorroboratedReading terms = CorroboratedReading.of(LinguisticTerms.fromClasspath(),
                OliaTerms.fromClasspath().concepts(), parsed);

        final List<ExportedSignal> signals = vocabulary.signals();
        final List<ExportedTheme> reported = new ExportedThemes(WITNESSES_HELD).in(summary, themes);
        final ExportedTaxonomy taxonomy = new ExportedTaxonomies().of(
                LinguisticTerms.fromClasspath().source(), terms.matched(), placement(field));

        return ReadingExport.of(
                summarised(reading, commit, summary, signals, reported, taxonomy, field),
                signals, reported, List.of(taxonomy),
                setAside(summary, vocabulary, legibility, terms, parsed));
    }

    /** The ranking and the signals it produced, kept together so the counts can be taken from both. */
    private record Vocabulary(List<ChosenWord> ranked, List<ExportedSignal> signals) {
    }

    private static Vocabulary vocabularyOf(final RepositoryLegibility legibility) {
        final ChosenWords chosen = ChosenWords.againstEnglishAndThePlatform();
        final WrittenWords names = new PublishedNames().published(legibility);
        final List<ChosenWord> ranked = chosen.in(names);
        final Map<String, Double> thresholds = VocabularyNull.byReference(
                VocabularyNull.seeded(TreeReading.SEED).over(names, chosen.references()));
        return new Vocabulary(ranked, new ExportedSignals(thresholds, ReadingSource.CLONE).in(ranked));
    }

    private static ReadingSummary summaryOf(final TreeReading reading, final RepositoryLegibility legibility,
                                            final RepositoryThemes themes, final PlacedField field) {
        return ReadingSummary.of(reading.root().getFileName().toString(), legibility, themes, field,
                TOPICS_PER_SCOPE);
    }

    private static ExportedSummary summarised(final TreeReading reading, final String commit,
                                              final ReadingSummary summary, final List<ExportedSignal> signals,
                                              final List<ExportedTheme> themes,
                                              final ExportedTaxonomy taxonomy, final PlacedField field) {
        return new ExportedSummary(reading.root().getFileName().toString(), commit, summary.about(),
                placement(field), leading(signals), leadingConcepts(taxonomy), distinctive(summary),
                summary.legibility().lambda(), summary.legibility().unplaced(),
                new ExportedSummary.Counts(signals.size(), themes.size(), taxonomy.concepts().size()));
    }

    private static List<LeadingWord> leading(final List<ExportedSignal> signals) {
        return signals.stream().limit(LEADING).map(LeadingWord::of).toList();
    }

    private static List<String> leadingConcepts(final ExportedTaxonomy taxonomy) {
        return taxonomy.concepts().stream().limit(LEADING)
                .map(ExportedTaxonomy.Concept::concept).distinct().toList();
    }

    private static List<ExportedSummary.DistinctiveScope> distinctive(final ReadingSummary summary) {
        return summary.distinctive().stream()
                .map(scope -> new ExportedSummary.DistinctiveScope(scope.scope(), scope.bits(),
                        scope.topics()))
                .toList();
    }

    private static ExportedPlacement placement(final PlacedField field) {
        return new ExportedPlacement(field.scheme(),
                ExportedPlacement.Level.of(field.nearestArchive().label(), field.nearestArchive().bits(),
                        field.archiveChance().chanceNearest()),
                ExportedPlacement.Level.of(field.nearestCategory().label(), field.nearestCategory().bits(),
                        field.categoryChance().chanceNearest()));
    }

    private static SetAside setAside(final ReadingSummary summary, final Vocabulary vocabulary,
                                     final RepositoryLegibility legibility, final CorroboratedReading terms,
                                     final ParsedRepository parsed) {
        return new SetAside(
                legibility.repository().counts().words() - legibility.repository().counts().read(),
                vocabulary.ranked().size() - vocabulary.signals().size(),
                summary.withheld().size(), terms.refusedByBranch(), parsed.unsoundFiles());
    }
}
