package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;

/**
 * One working tree read into the export a consumer receives. With {@link RepositoryReading} it is the whole
 * of what a program embedding this library has to call: a directory in, one validated document out. Every
 * reading it composes is one the reports also run, at the same seed, so the file and the documents state the
 * same figures — and none of the documents has to be written for the file to exist.
 */
public final class ExportedReading {

    /** Enough words behind a topic to check the row; the whole tail is in the reports. */
    private static final int WITNESSES_HELD = 8;

    private static final int TOPICS_PER_SCOPE = 3;

    /** How many words and concepts the summary names before a consumer opens the evidence beneath it. */
    private static final int LEADING = 10;

    /**
     * What named the topics in {@code about}. They are not a taxonomy's concepts: they are the labels two
     * dictionaries put on the senses of the words a repository declares, and a consumer reading
     * {@code linguistics} beside {@code ontology} should be able to tell which kind of answer it has.
     */
    private static final List<String> ABOUT_STATED_BY =
            List.of("WordNet Domains", "Wiktionary topics");

    /** The bundled vocabulary alone, which is what a caller naming no others gets. */
    public ReadingExport of(final RepositoryReading reading, final String commit) {
        return of(reading, commit, List.of());
    }

    /**
     * The bundled vocabulary and any the caller supplies, each matched and reported as its own taxonomy.
     *
     * <p>A source the published jar does not carry is read by path — the Computer Science Ontology is
     * 14,636 topics under CC BY 4.0 and nothing bundles it — so a consumer that wants it in the export
     * hands it over rather than asking this class to find it.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched) {
        final ParsedRepository parsed = reading.parsed();
        final RepositoryThemes themes = reading.themes();
        final RepositoryLegibility legibility = reading.legibility();
        final PlacedField field = PlacedField.ofArxiv(themes.repository().comparison(), reading.seed());
        final ReadingSummary summary = summaryOf(reading, legibility, themes, field);
        final Vocabulary vocabulary = vocabularyOf(legibility, reading.seed());
        final CorroboratedReading terms = CorroboratedReading.of(LinguisticTerms.fromClasspath(),
                OliaTerms.fromClasspath().concepts(), parsed);

        final List<ExportedSignal> signals = vocabulary.signals();
        final List<ExportedTheme> reported = new ExportedThemes(WITNESSES_HELD).in(summary, themes);
        final ExportedTaxonomy taxonomy = new ExportedTaxonomies().of(
                LinguisticTerms.fromClasspath().source(), terms.matched(), placement(field));
        final List<ExportedTaxonomy> taxonomies = new java.util.ArrayList<>(List.of(taxonomy));
        alsoMatched.forEach(index -> taxonomies.add(new ExportedTaxonomies().of(index.source(),
                CorroboratedReading.of(index, conceptsOf(index), parsed).matched(), placement(field))));

        return ReadingExport.of(
                summarised(reading, commit, summary, signals, reported, List.copyOf(taxonomies), field),
                signals, reported, List.copyOf(taxonomies),
                setAside(summary, vocabulary, legibility, terms, parsed));
    }

    /** The ranking and the signals it produced, kept together so the counts can be taken from both. */
    private record Vocabulary(List<ChosenWord> ranked, List<ExportedSignal> signals) {
    }

    private static Vocabulary vocabularyOf(final RepositoryLegibility legibility, final long seed) {
        final ChosenWords chosen = ChosenWords.againstEnglishAndThePlatform();
        final WrittenWords names = new PublishedNames().published(legibility);
        final List<ChosenWord> ranked = chosen.in(names);
        final Map<String, Double> thresholds = VocabularyNull.byReference(
                VocabularyNull.seeded(seed).over(names, chosen.references()));
        return new Vocabulary(ranked, new ExportedSignals(thresholds, ReadingSource.CLONE).in(ranked));
    }

    private static ReadingSummary summaryOf(final RepositoryReading reading, final RepositoryLegibility legibility,
                                            final RepositoryThemes themes, final PlacedField field) {
        return ReadingSummary.of(reading.root().getFileName().toString(), legibility, themes, field,
                TOPICS_PER_SCOPE);
    }

    private static ExportedSummary summarised(final RepositoryReading reading, final String commit,
                                              final ReadingSummary summary, final List<ExportedSignal> signals,
                                              final List<ExportedTheme> themes,
                                              final List<ExportedTaxonomy> taxonomies,
                                              final PlacedField field) {
        return new ExportedSummary(reading.root().getFileName().toString(), commit, summary.about(),
                ABOUT_STATED_BY, placement(field), leading(signals), leadingConcepts(taxonomies),
                distinctive(summary),
                summary.legibility().lambda(), summary.legibility().unplaced(),
                new ExportedSummary.Counts(signals.size(), themes.size(),
                        taxonomies.stream().mapToInt(one -> one.concepts().size()).sum()));
    }

    private static List<LeadingWord> leading(final List<ExportedSignal> signals) {
        return signals.stream().limit(LEADING).map(LeadingWord::of).toList();
    }

    /**
     * The concepts a supplied index publishes, which is what the branch rule needs to know what sits beside
     * what. An index answers for its own terms, so nothing here has to know which publisher it came from.
     */
    private static List<io.github.fiftieshousewife.bi.lexicon.SkosConcept> conceptsOf(final TermIndex index) {
        return index.terms().stream().flatMap(words -> index.conceptsOf(words).stream()).distinct().toList();
    }

    /**
     * The concepts the summary names, taken across every vocabulary rather than the first.
     *
     * <p>One vocabulary names the parts of a field and another names what the field is about, and a summary
     * drawn from whichever happened to be bundled reports the duller of the two. Each is asked for its own
     * leaders and they are interleaved, so a reader sees both kinds before either runs out.
     */
    private static List<ExportedSummary.LeadingConcept> leadingConcepts(
            final List<ExportedTaxonomy> taxonomies) {
        final List<List<ExportedSummary.LeadingConcept>> perVocabulary = taxonomies.stream()
                .map(taxonomy -> taxonomy.concepts().stream()
                        .map(concept -> new ExportedSummary.LeadingConcept(concept.concept(),
                                taxonomy.vocabulary()))
                        .distinct().limit(LEADING).toList())
                .toList();
        final List<ExportedSummary.LeadingConcept> leading = new java.util.ArrayList<>();
        for (int place = 0; leading.size() < LEADING && place < LEADING; place++) {
            for (final List<ExportedSummary.LeadingConcept> concepts : perVocabulary) {
                if (place < concepts.size() && !leading.contains(concepts.get(place))
                        && leading.size() < LEADING) {
                    leading.add(concepts.get(place));
                }
            }
        }
        return List.copyOf(leading);
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
