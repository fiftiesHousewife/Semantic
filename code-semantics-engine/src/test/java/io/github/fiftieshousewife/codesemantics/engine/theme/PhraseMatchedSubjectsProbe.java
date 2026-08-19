package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.InjectedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * Places the repository under reading among OpenAlex's topics by the runs of words it declares, rather than
 * by comparing two distributions over dictionary labels.
 *
 * <p>The scheme's own keywords are the matchable side — a publisher stating {@code Word Sense
 * Disambiguation} has vouched for the run — so the existing term matcher reads a subject scheme with
 * nothing new written for it.
 *
 * <p>The expected result is stated as a rank rather than as a named topic: given the Apache DOAP category
 * token the project publishes for itself, do the topics whose own account states that token outrank the
 * topics that do not? Nobody here picks a winner, and the bar is fixed at 0.5 by the statistic's own
 * definition.
 *
 * <p>Three readings are printed rather than one, because which of them to vote on is the open question and
 * a probe that answered it silently would have decided it. Every match, the matches the branch rule
 * corroborates, and the runs of more than one word.
 */
public final class PhraseMatchedSubjectsProbe {

    private static final int SHOWN = 10;

    private static final String KEYWORDS_OF_OPENALEX = "openalex keywords";

    private PhraseMatchedSubjectsProbe() {
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 1 || args[0].isBlank()) {
            throw new IllegalArgumentException("Usage: PhraseMatchedSubjectsProbe <domain token>. The token "
                    + "is the expected result and is stated by the project's own publisher, never chosen "
                    + "here — an Apache DOAP category token such as content, build-management or security.");
        }
        final String token = args[0];
        final List<SkosConcept> topics = OpenAlexTopics.fromClasspath().described();
        final List<SkosConcept> keywords = new PublishedKeywords().in(topics);

        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final CorroboratedReading reading = CorroboratedReading.of(
                InjectedTerms.of(InjectedTaxonomy.of(keywords, KEYWORDS_OF_OPENALEX), KEYWORDS_OF_OPENALEX),
                keywords, parsed);

        final List<TermSighting> every = reading.every().sightings();
        final List<TermSighting> corroborated = reading.matched().sightings();
        final List<TermSighting> runs = every.stream().filter(sighting -> sighting.length() > 1).toList();

        System.out.printf("%n%s%n", root);
        System.out.printf("%d topics, %d keywords published%n", topics.size(), keywords.size());
        System.out.printf("expected result: a topic stating %s outranks one that does not%n", token);

        final StatedDomainToken expectation = new StatedDomainToken(token);
        arm("every match", every, topics, expectation, token);
        java.util.Arrays.stream(TermRung.values()).forEach(rung -> {
            final List<TermSighting> found = reading.every().at(rung).sightings();
            arm("rung: " + rung.normalisation(), found, topics, expectation, token);
            arm("rung: " + rung.normalisation() + ", runs of more than one word",
                    found.stream().filter(sighting -> sighting.length() > 1).toList(),
                    topics, expectation, token);
        });
        arm("corroborated by the branch rule", corroborated, topics, expectation, token);
        arm("runs of more than one word", runs, topics, expectation, token);
    }

    private static void arm(final String heading, final List<TermSighting> sightings,
                            final List<SkosConcept> topics, final StatedDomainToken expectation,
                            final String token) {
        final Map<String, Double> byTopic = massByTopic(sightings);
        final List<ProbabilityOfSuperiority.Scored> scored = topics.stream()
                .map(topic -> new ProbabilityOfSuperiority.Scored(topic.prefLabel(),
                        byTopic.getOrDefault(topic.concept(), 0.0), expectation.of(topic)))
                .toList();

        System.out.printf("%n== %s — %d spans, %d topics reached%n", heading, sightings.size(),
                byTopic.size());
        System.out.printf("%-56s %10s%n", "topic", "mass");
        scored.stream()
                .sorted(Comparator.comparingDouble(ProbabilityOfSuperiority.Scored::score).reversed())
                .limit(SHOWN)
                .forEach(topic -> System.out.printf("%-56s %10.2f%s%n", topic.topic(), topic.score(),
                        topic.expectation() == ProbabilityOfSuperiority.Expectation.MEETS_IT
                                ? "   <- states " + token : ""));

        if (sightings.isEmpty()) {
            System.out.printf("no span answered on this reading%n");
            return;
        }
        final long marked = scored.stream()
                .filter(topic -> topic.expectation() == ProbabilityOfSuperiority.Expectation.MEETS_IT)
                .count();
        if (marked == 0 || marked == scored.size()) {
            System.out.printf("the expectation marks %d of %d topics, so the scheme states nothing to "
                    + "score against and the ranking above is all there is%n", marked, scored.size());
            return;
        }
        final ProbabilityOfSuperiority.Superiority found = new ProbabilityOfSuperiority().of(scored);
        System.out.printf("%d state %s, %d do not; chance %.3f against 0.5 — %s%n", found.meeting(), token,
                found.notMeeting(), found.chance(),
                found.beatsChance() ? "ABOVE CHANCE" : "at or below chance");
    }

    /** What each topic's keywords were worth where the repository declared them, summed over its sightings. */
    private static Map<String, Double> massByTopic(final List<TermSighting> sightings) {
        final Map<String, Double> byTopic = new HashMap<>();
        sightings.forEach(sighting -> sighting.concepts().forEach(keyword ->
                byTopic.merge(keyword.broader(), sighting.mass(), Double::sum)));
        return byTopic;
    }
}
