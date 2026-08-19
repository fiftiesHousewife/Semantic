package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * How much of a topic's published keywords a repository wrote, rather than how often it wrote any of them.
 *
 * <p>Summed occurrence mass ranks a topic matched on one everyday word above a topic matched on five
 * separate ones, because the everyday word is written hundreds of times. Five separate agreements are the
 * stronger evidence, and a count of occurrences cannot say so.
 *
 * <p><b>The score is two shares multiplied, each bounded at 1 by its own definition</b>, exactly as
 * {@link io.github.fiftieshousewife.codesemantics.engine.term.WrittenSubtree} scores a branch. One is the
 * share of what the topic's own keywords narrow that the repository declared; the other is the share of the
 * repository's matched writing the topic accounts for. Neither denominator was chosen here: the first is
 * the publisher's keyword set, the second is everything the scheme read.
 *
 * <p>The second share is what stops one keyword carrying a topic. A topic publishing a single keyword the
 * repository happens to write would score a perfect stated share on one word, which is the failure
 * {@code WrittenSubtree} already met with one share.
 *
 * <p>A keyword matched at several rungs of the ladder counts once. It is one agreement the publisher and
 * the repository reached, and counting it per rung would weigh a topic by how many ways a dictionary could
 * reach the same run.
 */
public record WrittenKeywords(String topic, int keywordsWritten, int keywordsPublished, double statedShare,
                              double writingShare, double weight) {

    /** Every topic the repository reached, the ones it wrote most of first. */
    public static List<WrittenKeywords> in(final List<SkosConcept> keywords,
                                           final List<TermSighting> sightings,
                                           final KeywordSpecificity specificity) {
        final Map<String, Double> publishedNarrows = specificity.byTopic(keywords);
        final Map<String, Long> published = keywords.stream()
                .collect(Collectors.groupingBy(SkosConcept::broader, Collectors.counting()));
        final Map<String, Double> mass = massByTopic(sightings);
        final double read = totalMass(sightings);
        return matchedByTopic(sightings).entrySet().stream()
                .map(reached -> reached(reached.getKey(), reached.getValue(), specificity,
                        publishedNarrows, published, mass, read))
                .sorted(Comparator.comparingDouble(WrittenKeywords::weight).reversed()
                        .thenComparing(WrittenKeywords::topic))
                .toList();
    }

    private static WrittenKeywords reached(final String topic, final List<SkosConcept> matched,
                                           final KeywordSpecificity specificity,
                                           final Map<String, Double> publishedNarrows,
                                           final Map<String, Long> published,
                                           final Map<String, Double> mass, final double read) {
        final double narrowed = matched.stream().mapToDouble(specificity::of).sum();
        final double statedShare = narrowed / publishedNarrows.get(topic);
        final double writingShare = read == 0.0 ? 0.0 : mass.get(topic) / read;
        return new WrittenKeywords(topic, matched.size(), published.get(topic).intValue(), statedShare,
                writingShare, statedShare * writingShare);
    }

    /**
     * What the repository's writing of a topic's keywords is worth, counted once per topic per span so that
     * the share it is divided into cannot exceed the whole.
     */
    private static Map<String, Double> massByTopic(final List<TermSighting> sightings) {
        final Map<String, Double> byTopic = new HashMap<>();
        sightings.forEach(sighting -> sighting.concepts().stream()
                .map(SkosConcept::broader)
                .distinct()
                .forEach(topic -> byTopic.merge(topic, sighting.mass(), Double::sum)));
        return byTopic;
    }

    /** Every distinct keyword the repository declared, under the topic that published it. */
    private static Map<String, List<SkosConcept>> matchedByTopic(final List<TermSighting> sightings) {
        return sightings.stream()
                .flatMap(sighting -> sighting.concepts().stream())
                .collect(Collectors.toMap(SkosConcept::concept, keyword -> keyword, (first, again) -> first))
                .values().stream()
                .collect(Collectors.groupingBy(SkosConcept::broader));
    }

    private static double totalMass(final List<TermSighting> sightings) {
        return sightings.stream().mapToDouble(TermSighting::mass).sum();
    }
}
