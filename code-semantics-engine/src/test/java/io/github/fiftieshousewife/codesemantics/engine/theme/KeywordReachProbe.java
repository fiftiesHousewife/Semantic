package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.InjectedTerms;

/**
 * How much of a subject scheme a repository could reach at all, over every keyword the scheme publishes.
 *
 * <p>A ranking says which topics were reached and cannot say why the rest were not. This counts all 45,154
 * published keywords into the buckets that name the repair each one would need, and reports the topics the
 * expected result marks apart from the ones it does not. That split is the point: a census pooled over the
 * whole scheme reports the same figures whether or not the topics a repository ought to reach are reachable.
 *
 * <p>Declared names and prose are counted apart and never summed, because whether a sentence counts as the
 * author's own word is an open decision and a figure that had already added them could not inform it.
 */
public final class KeywordReachProbe {

    private static final String KEYWORDS_OF_OPENALEX = "openalex keywords";

    private KeywordReachProbe() {
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 1 || args[0].isBlank()) {
            throw new IllegalArgumentException("Usage: KeywordReachProbe <subject area>. The area is the "
                    + "expected result and is stated by the project's own publisher, never chosen here.");
        }
        final String area = args[0];
        final List<SkosConcept> topics = OpenAlexTopics.fromClasspath().described();
        final List<SkosConcept> keywords = new PublishedKeywords().in(topics);

        final Path root = new CloneUnderReading().root();
        final ParsedRepository parsed = ParsedRepository.of(root, new JavaSourceScopes().under(root));
        final IdentifierWords identifiers = IdentifierWords.fromClasspath();
        final WrittenRuns runs = WrittenRuns.fromClasspath();
        final FurthestWritten declared = FurthestWritten.in(
                runs.ofNames(parsed, form -> !form.isProse()), runs.ofDeclarations(parsed));
        final FurthestWritten prose = FurthestWritten.in(runs.ofNames(parsed, NameForm::isProse));

        final CorroboratedReading reading = CorroboratedReading.of(
                InjectedTerms.of(InjectedTaxonomy.of(keywords, KEYWORDS_OF_OPENALEX), KEYWORDS_OF_OPENALEX),
                keywords, parsed);
        final ReachTable table = new ReachTable(matchedConcepts(reading));

        final PlacedUnder expectation = PlacedUnder.in(OpenAlexTopics.fromClasspath(), area);
        final Set<String> marked = topics.stream()
                .filter(topic -> expectation.of(topic) == ProbabilityOfSuperiority.Expectation.MEETS_IT)
                .map(SkosConcept::concept)
                .collect(Collectors.toUnmodifiableSet());

        final List<KeywordReach> reached = keywords.stream()
                .map(keyword -> KeywordReach.of(keyword, identifiers, declared, prose))
                .toList();

        System.out.printf("%n%s%n", root);
        System.out.printf("%d topics, %d keywords published; %d topics state %s%n", topics.size(),
                keywords.size(), marked.size(), area);

        table.print("every topic", reached);
        table.print("topics stating " + area, reached.stream()
                .filter(keyword -> marked.contains(keyword.topic())).toList());
        table.print("topics not stating " + area, reached.stream()
                .filter(keyword -> !marked.contains(keyword.topic())).toList());
    }

    /** Which keyword concepts some rung of the ladder found, so a run written and missed can be named. */
    private static Set<String> matchedConcepts(final CorroboratedReading reading) {
        return reading.every().sightings().stream()
                .flatMap(sighting -> sighting.concepts().stream())
                .map(SkosConcept::concept)
                .collect(Collectors.toUnmodifiableSet());
    }
}
