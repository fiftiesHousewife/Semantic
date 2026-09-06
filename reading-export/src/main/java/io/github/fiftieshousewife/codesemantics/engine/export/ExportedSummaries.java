package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary;

/**
 * The summary block of the export: the reading's leading words and concepts, its distinctive scopes and its
 * counts, assembled from the blocks the rest of the document carries so the two never disagree.
 */
final class ExportedSummaries {

    /** How many words and concepts the summary names before a consumer opens the evidence beneath it. */
    private static final int LEADING = 10;

    /**
     * What named the topics in {@code about}. They are not a taxonomy's concepts: they are the labels two
     * dictionaries put on the senses of the words a repository declares, and a consumer reading
     * {@code linguistics} beside {@code ontology} should be able to tell which kind of answer it has.
     */
    private static final List<String> ABOUT_STATED_BY =
            List.of("WordNet Domains", "Wiktionary topics");

    ExportedSummary of(final RepositoryReading reading, final String commit,
                       final ReadingSummary summary, final List<ExportedSignal> signals,
                       final List<ExportedTheme> themes, final List<ExportedTaxonomy> taxonomies,
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

    /** The same summary with its answers filled, which is the last thing the export learns. */
    static ExportedSummary answered(final ExportedSummary summary, final List<ExportedAnswer> answers) {
        return new ExportedSummary(summary.repository(), summary.commit(), answers, summary.about(),
                summary.aboutStatedBy(), summary.placedIn(), summary.leadingWords(),
                summary.leadingConcepts(), summary.distinctiveScopes(),
                summary.shareOfWordsWithACitation(), summary.shareOfMassOnNoSubject(), summary.counts());
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
}
