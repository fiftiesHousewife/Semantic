package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.bi.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.engine.term.BranchAgreement;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectPlacement;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.RefusedWords;
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

    /** Every taxonomy {@link MatchedTaxonomies} enumerates, which is what a caller naming no others gets. */
    public ReadingExport of(final RepositoryReading reading, final String commit) {
        return of(reading, commit, MatchedTaxonomies.besides(MatchedTaxonomies.OLIA));
    }

    /**
     * The enumerated taxonomies and any the caller supplies, each matched and reported as its own taxonomy.
     * A consumer injects its own by path and passes the index here.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched) {
        return of(reading, commit, alsoMatched,
                CorroboratedReading.of(LinguisticTerms.fromClasspath(),
                        OliaTerms.fromClasspath().concepts(), reading.parsed()),
                PlacedField.ofArxiv(reading.themes().repository().comparison(), reading.seed()));
    }

    /**
     * The same, over a term reading and a field placement the caller already holds, so a run whose
     * diagnostics took them does not take them again. They must be of this reading's tree at its seed.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched, final CorroboratedReading terms,
                            final PlacedField field) {
        return of(reading, commit, alsoMatched, terms, field,
                ChosenWords.againstEnglishAndThePlatform()
                        .chanceFor(new PublishedNames().published(reading.legibility()), reading.seed()));
    }

    /**
     * The same again, over chance bars the caller already drew — they must be over this reading's published
     * names at its seed, or the signals are cut where another tree's null puts the bar.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched, final CorroboratedReading terms,
                            final PlacedField field, final List<VocabularyNull.Bar> namesChance) {
        final ParsedRepository parsed = reading.parsed();
        final RepositoryThemes themes = reading.themes();
        final RepositoryLegibility legibility = reading.legibility();
        final ReadingSummary summary = summaryOf(reading, legibility, themes, field);
        final Vocabulary vocabulary = vocabularyOf(legibility, namesChance);

        final List<ExportedBehaviour> behaviours = ExportedBehaviours.fromClasspath().in(parsed.files());
        final List<ExportedSignal> signals = vocabulary.signals();
        final List<ExportedTheme> reported = new ExportedThemes(WITNESSES_HELD).in(summary, themes);
        final TopicDistribution reads = themes.repository().comparison();
        final SubjectAreas areas = SubjectAreas.fromClasspath();
        final ExportedTaxonomy taxonomy = new ExportedTaxonomies().of(
                LinguisticTerms.fromClasspath().source(), terms.matched(),
                BranchAgreement.between(reads, OliaTerms.fromClasspath().concepts(), areas));
        final List<ExportedTaxonomy> taxonomies = new ArrayList<>(List.of(taxonomy));
        alsoMatched.forEach(index -> taxonomies.add(new ExportedTaxonomies().of(index.source(),
                CorroboratedReading.of(index, index.publishedConcepts(), parsed).matched(),
                BranchAgreement.between(reads, index.publishedConcepts(), areas))));

        return ReadingExport.builder()
                .summary(summarised(reading, commit, summary, signals, reported,
                        List.copyOf(taxonomies), behaviours, placedIn(reading, themes, field)))
                .signals(signals)
                .themes(reported)
                .taxonomies(List.copyOf(taxonomies))
                .behaviours(behaviours)
                .setAside(setAside(summary, vocabulary, legibility, terms, parsed))
                .build();
    }

    /**
     * The ranking, the signals it produced and the bars they were cut at, kept together so every count is
     * taken from the rule that produced it rather than from a subtraction that pools two.
     */
    private record Vocabulary(List<ChosenWord> ranked, List<ExportedSignal> signals,
                              Map<String, Double> bars) {
    }

    private static Vocabulary vocabularyOf(final RepositoryLegibility legibility,
                                           final List<VocabularyNull.Bar> namesChance) {
        final List<ChosenWord> ranked = ChosenWords.againstEnglishAndThePlatform()
                .in(new PublishedNames().published(legibility));
        final Map<String, Double> thresholds = VocabularyNull.byReference(namesChance);
        return new Vocabulary(ranked, new ExportedSignals(thresholds, ReadingSource.CLONE).in(ranked),
                thresholds);
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
                                              final List<ExportedBehaviour> behaviours,
                                              final List<ExportedPlacement> placedIn) {
        return ExportedSummary.builder()
                .repository(reading.root().getFileName().toString())
                .commit(commit)
                .about(summary.about())
                .aboutStatedBy(ABOUT_STATED_BY)
                .placedIn(placedIn)
                .leadingWords(leading(signals))
                .leadingConcepts(leadingConcepts(taxonomies))
                .leadingBehaviours(leadingBehaviours(behaviours))
                .distinctiveScopes(distinctive(summary))
                .shareOfWordsWithACitation(summary.legibility().lambda())
                .shareOfMassOnNoSubject(summary.legibility().unplaced())
                .counts(ExportedSummary.Counts.builder()
                        .signals(signals.size())
                        .themes(themes.size())
                        .concepts(taxonomies.stream().mapToInt(one -> one.concepts().size()).sum())
                        .behaviours(behaviours.size())
                        .build())
                .build();
    }

    /**
     * The clauses the summary names. Only those stating what the verb acts on are drawn: a bare {@code read}
     * repeats far more often than {@code read declaration} and says far less, so a summary ranked on count
     * alone would answer every repository with the same half-dozen verbs. The whole list, bare verbs
     * included, is in {@code behaviours}.
     */
    private static List<String> leadingBehaviours(final List<ExportedBehaviour> behaviours) {
        return behaviours.stream()
                .filter(behaviour -> !behaviour.object().isEmpty())
                .limit(LEADING)
                .map(ExportedBehaviour::phrase)
                .toList();
    }

    private static List<LeadingWord> leading(final List<ExportedSignal> signals) {
        return signals.stream().limit(LEADING).map(LeadingWord::of).toList();
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
        return IntStream.range(0, LEADING).boxed()
                .flatMap(place -> perVocabulary.stream()
                        .filter(concepts -> place < concepts.size())
                        .map(concepts -> concepts.get(place)))
                .distinct()
                .limit(LEADING)
                .toList();
    }

    private static List<ExportedSummary.DistinctiveScope> distinctive(final ReadingSummary summary) {
        return summary.distinctive().stream()
                .map(scope -> new ExportedSummary.DistinctiveScope(scope.scope(), scope.bits(),
                        scope.topics()))
                .toList();
    }

    /**
     * Every bundled scheme's placement of the same reading, each drawn against its own null.
     *
     * <p>The arXiv field arrives from the caller because the summary's own bars were computed against it;
     * every other scheme is placed here. No scheme is picked, and a scheme reporting nothing reports it.
     */
    private static List<ExportedPlacement> placedIn(final RepositoryReading reading,
                                                    final RepositoryThemes themes, final PlacedField field) {
        return List.of(placement(field),
                placement(PlacedField.ofOpenAlex(themes.repository().comparison(), reading.seed())));
    }

    /** One placement per scheme, each level carrying what it rests on and what chance cannot separate. */
    static ExportedPlacement placement(final PlacedField field) {
        return new ExportedPlacement(field.scheme(),
                level(field.archives(), field.archiveChance().chanceNearest()),
                level(field.categories(), field.categoryChance().chanceNearest()));
    }

    /**
     * One level: the nearest subject, and every subject standing nearer than chance did with it. The band is
     * the chance figure's own, so nothing here chooses how wide a tie has to be to count as one.
     */
    private static ExportedPlacement.Level level(final List<SubjectPlacement.Placement> ranked,
                                                 final double chanceNearest) {
        final SubjectPlacement.Placement nearest = ranked.getFirst();
        return ExportedPlacement.Level.of(nearest.label(), nearest.bits(), chanceNearest,
                nearest.carriedBy(),
                ranked.stream()
                        .filter(placed -> placed.bits() < chanceNearest)
                        .map(placed -> new ExportedPlacement.Contender(placed.label(), placed.bits(),
                                placed.carriedBy()))
                        .toList());
    }

    private static SetAside setAside(final ReadingSummary summary, final Vocabulary vocabulary,
                                     final RepositoryLegibility legibility, final CorroboratedReading terms,
                                     final ParsedRepository parsed) {
        final RefusedWords refused = new RefusedWords();
        return new SetAside(
                legibility.repository().counts().words() - legibility.repository().counts().read(),
                refused.in(vocabulary.ranked(), vocabulary.bars()).size(),
                refused.suppliedByTheLanguage(vocabulary.ranked(), vocabulary.bars()).size(),
                summary.withheld().size(), terms.refusedByBranch(), parsed.unsoundFiles());
    }
}
