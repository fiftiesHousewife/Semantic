package io.github.fiftieshousewife.codesemantics.engine.export;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.UnreadJavaFiles;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary;
import io.github.fiftieshousewife.codesemantics.engine.term.BranchAgreement;
import io.github.fiftieshousewife.codesemantics.engine.term.ControlTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.PhraseBar;
import io.github.fiftieshousewife.codesemantics.engine.term.SpecificTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedAncestry;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedDescriptions;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedPaths;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.engine.term.TermOrderNull;
import io.github.fiftieshousewife.codesemantics.engine.term.WrittenRuns;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.SharedMass;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectPlacement;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.RefusedWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;
import io.github.fiftieshousewife.codesemantics.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * One working tree read into the export a consumer receives, and the whole of what a program embedding this
 * library has to call: a directory in, one validated document out. A caller already holding a
 * {@link RepositoryReading}, a term reading or a field placement passes it instead of paying for it twice.
 * Every reading it composes runs at the reading's own seed, so two callers of one tree state the same
 * figures.
 */
public final class ExportedReading {

    /** Enough words behind a topic to check the row; the whole tail is in the reports. */
    private static final int WITNESSES_HELD = 8;

    /** Enough words to see what a placement rests on; the whole tail is in {@code themes}. */
    private static final int PLACEMENT_WITNESSES = 3;

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

    /**
     * Every bundled term vocabulary, which is what a caller naming no others gets.
     *
     * <p><b>All seven, and not the two this repository is in the field of.</b> Which vocabulary is a
     * control is a fact about the repository being read and not about the vocabulary: FIBO is out of
     * domain here and is the in-domain one on a derivatives library. Judging only the two would mean
     * quickfixj could never publish FIX and strata could never publish FIBO, whatever their phrase counts,
     * which is the enum deciding in advance the question the chance bar exists to ask.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit) {
        return of(reading, commit, everyBundledVocabularyBesidesOlia());
    }

    /**
     * The whole of the published surface: a directory in, one validated export out.
     *
     * <p>The commit is an argument because the library reads no {@code .git}. What a working tree is
     * checked out at is a fact its caller states, and a caller with none states the empty string.
     *
     * <p>The reading it takes is not shared with any other, which is {@link RepositoryReading}'s rule:
     * a caller reading one tree twice, or several trees in one program, decides for itself how long a
     * reading lives.
     */
    public ReadingExport of(final Path directory, final String commit) {
        return of(RepositoryReading.of(directory), commit);
    }

    /**
     * Every bundled term vocabulary but OLiA, which the reading holds separately. One statement of the
     * list, so a caller supplying its own term reading judges the same field the default does.
     */
    public static List<TermIndex> everyBundledVocabularyBesidesOlia() {
        return Stream.concat(
                        Stream.of(MatchedTaxonomies.values())
                                .filter(taxonomy -> taxonomy != MatchedTaxonomies.OLIA)
                                .map(MatchedTaxonomies::index),
                        Stream.of(ControlTaxonomies.values()).map(ControlTaxonomies::index))
                .toList();
    }

    /**
     * The enumerated taxonomies and any the caller supplies, each matched and reported as its own taxonomy.
     * A consumer injects its own by path and passes the index here.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched) {
        return of(reading, commit, alsoMatched,
                CorroboratedReading.of(SpecificTerms.of(LinguisticTerms.fromClasspath()),
                        OliaTerms.fromClasspath().concepts(), reading.parsed()),
                PlacedField.ofArxiv(reading.themes().repository().comparison(), reading.seed()));
    }

    /**
     * The same, over a term reading and a field placement the caller already holds, so a run whose
     * diagnostics took them does not take them again. They must be of this reading's tree at its seed,
     * and the term reading must be over {@link SpecificTerms}: a vocabulary published here is judged on
     * the terms that are its own, and one read over the publisher's whole index would carry matches the
     * other vocabularies' counts had removed.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched, final CorroboratedReading terms,
                            final PlacedField field) {
        return of(reading, commit, alsoMatched, terms, field,
                ChosenWords.againstEnglishAndTheCorpus()
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

        final List<ExportedSignal> signals = vocabulary.signals();
        final List<ExportedTheme> reported = new ExportedThemes(WITNESSES_HELD).in(summary, themes);
        final TopicDistribution reads = themes.repository().comparison();
        final SubjectAreas areas = SubjectAreas.fromClasspath();
        final List<TermIndex> published = Stream.concat(
                        Stream.<TermIndex>of(LinguisticTerms.fromClasspath()), alsoMatched.stream())
                .toList();
        final List<SpecificTerms> judged = published.stream().map(SpecificTerms::of).toList();
        final List<PhraseBar> bars = TermOrderNull.seeded(reading.seed())
                .over(WrittenRuns.fromClasspath().in(parsed), List.copyOf(judged));
        final StatedAncestry olia = new StatedAncestry(LinguisticTerms.fromClasspath());
        final List<ExportedTaxonomy> matched = new ArrayList<>(List.of(new ExportedTaxonomies().of(
                LinguisticTerms.fromClasspath().source(), terms.matched(),
                BranchAgreement.between(reads, OliaTerms.fromClasspath().concepts(), areas),
                bars.getFirst(), new StatedPaths(olia, OliaTerms.fromClasspath().concepts()),
                StatedDescriptions.over(OliaTerms.fromClasspath().concepts(), olia))));
        IntStream.range(1, published.size()).forEach(at -> {
            final StatedAncestry ancestry = new StatedAncestry(published.get(at));
            final List<SkosConcept> concepts = published.get(at).publishedConcepts();
            matched.add(new ExportedTaxonomies().of(
                    published.get(at).source(),
                    CorroboratedReading.of(judged.get(at), concepts, parsed).matched(),
                    BranchAgreement.between(reads, concepts, areas),
                    bars.get(at), new StatedPaths(ancestry, concepts),
                    StatedDescriptions.over(concepts, ancestry)));
        });
        final List<ExportedTaxonomy> taxonomies = matched.stream()
                .filter(one -> one.bar().exceedsChance())
                .toList();

        final ReadingExport answered = ReadingExport.builder()
                .summary(summarised(reading, commit, summary, signals, reported,
                        taxonomies, placedIn(reading, themes, field)))
                .signals(signals)
                .thresholds(vocabulary.bars())
                .themes(reported)
                .taxonomies(taxonomies)
                .setAside(setAside(summary, vocabulary, legibility, terms, parsed, refused(matched),
                        judged.stream().mapToInt(SpecificTerms::refused).sum(), reading))
                .build();
        return answering(answered);
    }

    /**
     * The same reading with {@code summary.answers} filled from every source that cleared the bar of the
     * most specific normalisation that qualified. They are taken from the finished export rather than from the
     * readings behind it, so the answers and the blocks a consumer reads them against are one document.
     */
    private static ReadingExport answering(final ReadingExport export) {
        return new ReadingExport(export.schemaVersion(),
                answered(export.summary(), EvidenceKinds.answering(export)), export.signals(),
                export.thresholds(), export.themes(), export.taxonomies(), export.setAside());
    }

    private static ExportedSummary answered(final ExportedSummary summary,
                                            final List<ExportedAnswer> answers) {
        return new ExportedSummary(summary.repository(), summary.commit(), answers, summary.about(),
                summary.aboutStatedBy(), summary.placedIn(), summary.leadingWords(),
                summary.leadingConcepts(), summary.distinctiveScopes(),
                summary.shareOfWordsWithACitation(), summary.shareOfMassOnNoSubject(), summary.counts());
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
        final List<ChosenWord> ranked = ChosenWords.againstEnglishAndTheCorpus()
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
                                              final List<ExportedPlacement> placedIn) {
        return ExportedSummary.builder()
                .repository(reading.root().getFileName().toString())
                .commit(commit)
                .answers(List.of(ExportedAnswer.NONE))
                .about(summary.about())
                .aboutStatedBy(ABOUT_STATED_BY)
                .placedIn(placedIn)
                .leadingWords(leading(signals))
                .leadingConcepts(leadingConcepts(taxonomies))
                .distinctiveScopes(distinctive(summary))
                .shareOfWordsWithACitation(summary.legibility().lambda())
                .shareOfMassOnNoSubject(summary.legibility().unplaced())
                .counts(ExportedSummary.Counts.builder()
                        .signals(signals.size())
                        .themes(themes.size())
                        .concepts(taxonomies.stream().mapToInt(one -> one.concepts().size()).sum())
                        .build())
                .build();
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
        return List.of(placement(field, themes),
                placement(PlacedField.ofOpenAlex(themes.repository().comparison(), reading.seed()),
                        themes),
                placement(PlacedField.ofCso(themes.repository().comparison(), reading.seed()), themes));
    }

    /** One placement per scheme, each level carrying what it rests on and what chance cannot separate. */
    static ExportedPlacement placement(final PlacedField field, final RepositoryThemes themes) {
        return new ExportedPlacement(field.scheme(),
                level(field.archives(), field.archiveChance().chanceNearest(), themes),
                level(field.categories(), field.categoryChance().chanceNearest(), themes));
    }

    /**
     * One level: the nearest subject, and every subject standing nearer than chance did with it. The band is
     * the chance figure's own, so nothing here chooses how wide a tie has to be to count as one.
     */
    private static ExportedPlacement.Level level(final List<SubjectPlacement.Placement> ranked,
                                                 final double chanceNearest,
                                                 final RepositoryThemes themes) {
        final SubjectPlacement.Placement nearest = ranked.getFirst();
        return ExportedPlacement.Level.of(nearest.label(), nearest.bits(), chanceNearest,
                carrying(nearest, themes),
                ranked.stream()
                        .filter(placed -> placed.bits() < chanceNearest)
                        .map(placed -> new ExportedPlacement.Contender(placed.label(), placed.bits(),
                                placed.carriedBy().stream().map(SharedMass.Shared::topic).toList()))
                        .toList());
    }

    /**
     * What each meeting topic is worth to the placement, with the words that put the repository's mass
     * there. Fewer words than a theme row holds: a placement is the answer and the whole tail is in
     * {@code themes} and in the evidence beside it.
     */
    private static List<ExportedPlacement.CarryingTopic> carrying(final SubjectPlacement.Placement placed,
                                                                  final RepositoryThemes themes) {
        return placed.carriedBy().stream()
                .map(met -> new ExportedPlacement.CarryingTopic(met.topic(), met.scopeShare(),
                        met.subjectShare(),
                        themes.witnesses().forTopic(met.topic(), PLACEMENT_WITNESSES).stream()
                                .map(ExportedThemes::testimony).toList()))
                .toList();
    }

    /**
     * Every vocabulary the reading matched and refused, with the bar each failed, so a reader can argue
     * with the refusal from the file rather than take the count on trust.
     */
    static List<SetAside.RefusedVocabulary> refused(final List<ExportedTaxonomy> matched) {
        return matched.stream()
                .filter(one -> !one.bar().exceedsChance())
                .map(one -> new SetAside.RefusedVocabulary(one.vocabulary(), one.bar()))
                .toList();
    }

    private static SetAside setAside(final ReadingSummary summary, final Vocabulary vocabulary,
                                     final RepositoryLegibility legibility, final CorroboratedReading terms,
                                     final ParsedRepository parsed,
                                     final List<SetAside.RefusedVocabulary> belowTheirChanceBar,
                                     final int termsWorkingJavaAlsoWrites,
                                     final RepositoryReading reading) {
        final RefusedWords refused = new RefusedWords();
        return new SetAside(
                legibility.repository().counts().words() - legibility.repository().counts().read(),
                refused.in(vocabulary.ranked(), vocabulary.bars()).size(),
                (int) vocabulary.ranked().stream()
                        .filter(word -> word.withinTheReferencesError(vocabulary.bars()))
                        .count(),
                refused.suppliedByTheLanguage(vocabulary.ranked(), vocabulary.bars()).size(),
                summary.withheld().size(), terms.refusedByBranch(), belowTheirChanceBar,
                termsWorkingJavaAlsoWrites, parsed.unsoundFiles(),
                new UnreadJavaFiles().under(reading.root(),
                        RepositoryReading.scopesUnder(reading.root())));
    }
}
