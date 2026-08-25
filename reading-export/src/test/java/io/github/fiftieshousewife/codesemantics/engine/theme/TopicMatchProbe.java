package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.InjectedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * Why one named subject is or is not reached: its published keywords one at a time, and for each the
 * furthest the repository got towards writing it.
 *
 * <p>A ranking says which subjects were reached. It cannot say why the one a reader expected was not, and
 * that question has several different answers — the run was never written, it was written but not next to
 * itself, it was written and the dictionary could not read it, or it was matched and the branch rule
 * refused it. Each implies a different repair, so they are reported apart.
 */
public final class TopicMatchProbe {

    private TopicMatchProbe() {
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 1 || args[0].isBlank()) {
            throw new IllegalArgumentException("Usage: TopicMatchProbe <part of a topic label>");
        }
        final List<String> wanted = java.util.Arrays.stream(args[0].split(";"))
                .map(part -> part.strip().toLowerCase(Locale.ROOT))
                .filter(part -> !part.isEmpty())
                .toList();
        final List<SkosConcept> topics = OpenAlexTopics.fromClasspath().described();
        final List<SkosConcept> keywords = new PublishedKeywords().in(topics);

        final Path root = new CloneUnderReading().root();
        final ParsedRepository parsed = ParsedRepository.of(root, new JavaSourceScopes().under(root));
        final CorroboratedReading reading = CorroboratedReading.of(
                InjectedTerms.of(InjectedTaxonomy.of(keywords, "openalex keywords"), "openalex keywords"),
                keywords, parsed);

        final IdentifierWords identifiers = IdentifierWords.fromClasspath();
        final WrittenRuns runs = WrittenRuns.fromClasspath();
        final List<List<String>> declared = runs.ofNames(parsed, form -> !form.isProse());
        final List<List<String>> prose = runs.ofNames(parsed, NameForm::isProse);
        final FurthestWritten written = FurthestWritten.in(declared, runs.ofDeclarations(parsed));
        final FurthestWritten inProse = FurthestWritten.in(prose);
        final Map<String, String> rungByConcept = matchedRungs(reading);
        final Map<String, Double> massByTopic = new java.util.HashMap<>();
        reading.every().sightings().forEach(sighting -> sighting.concepts().forEach(keyword ->
                massByTopic.merge(keyword.broader(), sighting.mass(), Double::sum)));
        final List<Map.Entry<String, Double>> ranked = massByTopic.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .toList();

        System.out.printf("%n%s — %d distinct declared names, %d distinct prose runs%n", root,
                declared.size(), prose.size());
        topics.stream()
                .filter(topic -> wanted.stream()
                        .anyMatch(part -> topic.prefLabel().toLowerCase(Locale.ROOT).contains(part)))
                .forEach(topic -> {
                    report(topic, keywords, identifiers, written, inProse, rungByConcept);
                    final int rank = IntStream.range(0, ranked.size())
                            .filter(place -> ranked.get(place).getKey().equals(topic.concept()))
                            .findFirst().orElse(-1);
                    System.out.printf("mass %.2f, ranked %d of %d topics reached; the highest holds %.2f%n",
                            massByTopic.getOrDefault(topic.concept(), 0.0), rank + 1, ranked.size(),
                            ranked.getFirst().getValue());
                });
    }

    private static void report(final SkosConcept topic, final List<SkosConcept> keywords,
                               final IdentifierWords identifiers, final FurthestWritten written,
                               final FurthestWritten inProse, final Map<String, String> rungByConcept) {
        System.out.printf("%n== %s (%s)%n", topic.prefLabel(), topic.concept());
        System.out.printf("%-34s  %s%n", "published keyword", "how far the repository got");
        keywords.stream()
                .filter(keyword -> keyword.broader().equals(topic.concept()))
                .forEach(keyword -> System.out.printf("%-34s  %s%n", keyword.prefLabel(),
                        outcome(identifiers.of(keyword.prefLabel()).words(), keyword, written, inProse,
                                rungByConcept)));
    }

    /** The furthest the repository got towards writing this keyword, and no further. */
    private static String outcome(final List<String> words, final SkosConcept keyword,
                                  final FurthestWritten written, final FurthestWritten inProse,
                                  final Map<String, String> rungByConcept) {
        if (rungByConcept.containsKey(keyword.concept())) {
            return "MATCHED on " + rungByConcept.get(keyword.concept());
        }
        final FurthestWritten.Reached reached = written.of(words);
        return switch (reached.reach()) {
            case AS_THIS_RUN -> "declared as this run, and no rung matched it";
            case ACROSS_ONE_DECLARATION -> "declared across one declaration, never inside one name";
            case EVERY_WORD_NEVER_ADJACENT -> "every word declared, never adjacent"
                    + (inProse.of(words).reach() == FurthestWritten.Reach.AS_THIS_RUN
                            ? " — WRITTEN IN PROSE" : "");
            case PARTLY_WRITTEN -> "declared except " + String.join(", ", reached.missing())
                    + (inProse.of(words).reach() == FurthestWritten.Reach.AS_THIS_RUN
                            ? " — WRITTEN IN PROSE" : "");
            case NOT_WRITTEN -> inProse.of(words).reach() == FurthestWritten.Reach.AS_THIS_RUN
                    ? "never declared — WRITTEN IN PROSE" : "no word of it declared";
        };
    }

    /** Which keyword concepts were matched, and what both sides were normalised to when they met. */
    private static Map<String, String> matchedRungs(final CorroboratedReading reading) {
        return reading.every().sightings().stream()
                .flatMap(sighting -> sighting.concepts().stream()
                        .map(concept -> Map.entry(concept.concept(), rungOf(sighting))))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (first, later) -> first));
    }

    private static String rungOf(final TermSighting sighting) {
        return sighting.rung().normalisation();
    }
}
