package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.term.BranchAgreement;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.PhraseBar;
import io.github.fiftieshousewife.codesemantics.engine.term.SpecificTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedAncestry;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedDescriptions;
import io.github.fiftieshousewife.codesemantics.engine.term.StatedPaths;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.engine.term.TermOrderNull;
import io.github.fiftieshousewife.codesemantics.engine.term.WrittenRuns;
import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectAreas;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import io.github.fiftieshousewife.codesemantics.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Every term vocabulary judged against one repository as one field: each is matched, its permutation bar
 * drawn at the reading's seed, and the field split into the vocabularies published and the ones refused.
 *
 * <p>The field is judged at once because the bar sits at the quantile the field's size sets, so which
 * vocabularies compete is part of what any one bar means. {@link ExportedTaxonomy.Bar#fieldMembers()}
 * publishes the membership for the same reason.
 */
final class JudgedTaxonomies {

    /**
     * What one reading's field of vocabularies came to.
     *
     * @param published                  the vocabularies whose phrase count exceeds their chance bar
     * @param refused                    a row per vocabulary judged and not published, with the bar it failed
     * @param termsWorkingJavaAlsoWrites the vocabularies' terms the reference corpus writes, summed
     */
    record Judgement(List<ExportedTaxonomy> published, List<SetAside.RefusedVocabulary> refused,
                     int termsWorkingJavaAlsoWrites) {
    }

    /** The OLiA reading arrives from the caller because the reading's diagnostics already took it. */
    Judgement of(final RepositoryReading reading, final List<TermIndex> alsoMatched,
                 final CorroboratedReading terms) {
        final TopicDistribution reads = reading.themes().repository().comparison();
        final SubjectAreas areas = SubjectAreas.fromClasspath();
        final List<TermIndex> published = refusingASharedSource(Stream.concat(
                        Stream.<TermIndex>of(LinguisticTerms.fromClasspath()), alsoMatched.stream())
                .toList());
        final List<SpecificTerms> judged = published.stream().map(SpecificTerms::of).toList();
        final List<PhraseBar> bars = TermOrderNull.seeded(reading.seed())
                .over(WrittenRuns.fromClasspath().in(reading.parsed()), List.copyOf(judged));
        final List<ExportedTaxonomy> matched = new ArrayList<>(List.of(olia(terms, reads, areas,
                bars.getFirst())));
        IntStream.range(1, published.size()).forEach(at -> matched.add(judged(reading, reads, areas,
                published.get(at), judged.get(at), bars.get(at))));
        return new Judgement(
                matched.stream().filter(one -> one.bar().exceedsChance()).toList(),
                refused(matched),
                judged.stream().mapToInt(SpecificTerms::refused).sum());
    }

    private static ExportedTaxonomy olia(final CorroboratedReading terms, final TopicDistribution reads,
                                         final SubjectAreas areas, final PhraseBar bar) {
        final StatedAncestry ancestry = new StatedAncestry(LinguisticTerms.fromClasspath());
        final List<SkosConcept> concepts = OliaTerms.fromClasspath().concepts();
        return new ExportedTaxonomies().of(LinguisticTerms.fromClasspath().source(), terms.matched(),
                BranchAgreement.between(reads, concepts, areas), bar,
                new StatedPaths(ancestry, concepts), StatedDescriptions.over(concepts, ancestry));
    }

    private static ExportedTaxonomy judged(final RepositoryReading reading, final TopicDistribution reads,
                                           final SubjectAreas areas, final TermIndex index,
                                           final SpecificTerms specific, final PhraseBar bar) {
        final StatedAncestry ancestry = new StatedAncestry(index);
        final List<SkosConcept> concepts = index.publishedConcepts();
        return new ExportedTaxonomies().of(index.source(),
                CorroboratedReading.of(specific, concepts, reading.parsed()).matched(),
                BranchAgreement.between(reads, concepts, areas), bar,
                new StatedPaths(ancestry, concepts), StatedDescriptions.over(concepts, ancestry));
    }

    /**
     * A field where two vocabularies state one source name would publish two taxonomies a reader cannot
     * tell apart, and every bar and match citing the name would not say which vocabulary spoke.
     */
    static List<TermIndex> refusingASharedSource(final List<TermIndex> field) {
        final List<String> shared = field.stream()
                .collect(Collectors.groupingBy(TermIndex::source, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .sorted()
                .toList();
        if (!shared.isEmpty()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "Two vocabularies in one field state one source name, so a match citing it would not "
                            + "say which spoke: %s",
                    shared));
        }
        return field;
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
}
