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
        final Map<String, Double> byTopic = massByTopic(sightings);
        System.out.printf("%n== %s — summed occurrence mass — %d spans, %d topics reached%n", heading,
                sightings.size(), byTopic.size());
        System.out.printf("%-52s %10s%n", "topic", "mass");
        ranked(byTopic).stream().limit(SHOWN).forEach(topic ->
                System.out.printf("%-52s %10.2f%s%n", topic.topic(), topic.score(), marked(topic)));
        statistic(sightings, ranked(byTopic));
    }

    private void twoShares(final String heading, final List<TermSighting> sightings) {
        final List<WrittenKeywords> written = WrittenKeywords.in(keywords, sightings, narrows);
        final Map<String, Double> byTopic = written.stream()
                .collect(Collectors.toMap(WrittenKeywords::topic, WrittenKeywords::weight));
        System.out.printf("%n== %s — two shares — %d spans, %d topics reached%n", heading, sightings.size(),
                byTopic.size());
        System.out.printf("%-52s %5s %6s %8s %8s%n", "topic", "wrote", "stated", "of topic", "of code");
        written.stream().limit(SHOWN).forEach(reached ->
                System.out.printf("%-52s %5d %6d %8.4f %8.4f%s%n", label(reached.topic()),
                        reached.keywordsWritten(), reached.keywordsPublished(), reached.statedShare(),
                        reached.writingShare(), marked(scored(reached.topic(), reached.weight()))));
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
