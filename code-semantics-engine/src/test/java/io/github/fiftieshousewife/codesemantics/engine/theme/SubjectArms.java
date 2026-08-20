package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * One reading of a repository against a subject scheme, printed under both scorings so neither is adopted
 * silently. Summed occurrence mass is what the arm shipped with; two shares is what repair 0 proposes.
 */
final class SubjectArms {

    private static final int SHOWN = 10;

    private final List<SkosConcept> topics;

    private final List<SkosConcept> keywords;

    private final StatedDomainToken expectation;

    private final String token;

    private final KeywordSpecificity narrows;

    private final Map<String, String> labelByConcept;

    private final SuperiorityFigures figures;

    SubjectArms(final List<SkosConcept> topics, final List<SkosConcept> keywords,
                final StatedDomainToken expectation, final String token, final KeywordSpecificity narrows) {
        this.topics = topics;
        this.keywords = keywords;
        this.expectation = expectation;
        this.token = token;
        this.narrows = narrows;
        this.labelByConcept = topics.stream().collect(Collectors.toMap(SkosConcept::concept,
                SkosConcept::prefLabel, (first, again) -> first));
        this.figures = new SuperiorityFigures(token);
    }

    void print(final String heading, final List<TermSighting> sightings) {
        summedMass(heading, sightings);
        twoShares(heading, sightings);
    }

    private void summedMass(final String heading, final List<TermSighting> sightings) {
        massWeighted(heading, "summed occurrence mass", sightings, topic -> 1.0);
    }

    /** The same summed mass with a factor over the topic itself, so the grid is complete either scoring. */
    void massWeighted(final String heading, final String scoring, final List<TermSighting> sightings,
                      final java.util.function.ToDoubleFunction<String> byTopicWeight) {
        final Map<String, Double> byTopic = new HashMap<>();
        massByTopic(sightings).forEach((topic, mass) ->
                byTopic.put(topic, mass * byTopicWeight.applyAsDouble(topic)));
        System.out.printf("%n== %s — %s — %d spans, %d topics reached%n", heading, scoring,
                sightings.size(), byTopic.size());
        System.out.printf("%-52s %10s%n", "topic", "mass");
        ranked(byTopic).stream().limit(SHOWN).forEach(topic ->
                System.out.printf("%-52s %10.2f%s%n", topic.topic(), topic.score(), marked(topic)));
        statistic(sightings, ranked(byTopic));
    }

    private void twoShares(final String heading, final List<TermSighting> sightings) {
        weighted(heading, "two shares", sightings, topic -> 1.0);
    }

    /**
     * The same two shares with a third factor over the topic itself, so a candidate weighting is measured
     * beside the reading it would replace rather than adopted and then reported.
     */
    void weighted(final String heading, final String scoring, final List<TermSighting> sightings,
                  final java.util.function.ToDoubleFunction<String> byTopicWeight) {
        final List<WrittenKeywords> written = WrittenKeywords.in(keywords, sightings, narrows);
        final Map<String, Double> byTopic = written.stream()
                .collect(Collectors.toMap(WrittenKeywords::topic,
                        reached -> reached.weight() * byTopicWeight.applyAsDouble(reached.topic())));
        System.out.printf("%n== %s — %s — %d spans, %d topics reached%n", heading, scoring, sightings.size(),
                byTopic.size());
        System.out.printf("%-52s %8s%n", "topic", "score");
        ranked(byTopic).stream().limit(SHOWN).forEach(reached ->
                System.out.printf("%-52s %8.6f%s%n", reached.topic(), reached.score(), marked(reached)));
        statistic(sightings, ranked(byTopic));
    }

    private List<ProbabilityOfSuperiority.Scored> ranked(final Map<String, Double> byTopic) {
        return topics.stream()
                .map(topic -> scored(topic.concept(), byTopic.getOrDefault(topic.concept(), 0.0)))
                .sorted(Comparator.comparingDouble(ProbabilityOfSuperiority.Scored::score).reversed())
                .toList();
    }

    private ProbabilityOfSuperiority.Scored scored(final String concept, final double score) {
        return new ProbabilityOfSuperiority.Scored(label(concept), score, expectationOf(concept));
    }

    private ProbabilityOfSuperiority.Expectation expectationOf(final String concept) {
        return topics.stream()
                .filter(topic -> topic.concept().equals(concept))
                .findFirst()
                .map(expectation::of)
                .orElse(ProbabilityOfSuperiority.Expectation.DOES_NOT);
    }

    private String label(final String concept) {
        return labelByConcept.getOrDefault(concept, concept);
    }

    private String marked(final ProbabilityOfSuperiority.Scored topic) {
        return topic.expectation() == ProbabilityOfSuperiority.Expectation.MEETS_IT
                ? "   <- states " + token : "";
    }

    private void statistic(final List<TermSighting> sightings,
                           final List<ProbabilityOfSuperiority.Scored> scored) {
        if (sightings.isEmpty()) {
            System.out.printf("no span answered on this reading%n");
            return;
        }
        figures.print(scored);
    }

    /** Counted once per topic per span, so the share it is divided into cannot exceed the whole. */
    private static Map<String, Double> massByTopic(final List<TermSighting> sightings) {
        final Map<String, Double> byTopic = new HashMap<>();
        sightings.forEach(sighting -> sighting.concepts().stream()
                .map(SkosConcept::broader)
                .distinct()
                .forEach(topic -> byTopic.merge(topic, sighting.mass(), Double::sum)));
        return byTopic;
    }
}
