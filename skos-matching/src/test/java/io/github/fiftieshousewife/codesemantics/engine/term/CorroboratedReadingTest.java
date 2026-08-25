package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorroboratedReadingTest {

    private static final SkosConcept WORD_CLASS = concept("WordClass", "");
    private static final SkosConcept USAGE = concept("UsageFeature", "");
    private static final SkosConcept VERB = concept("Verb", "WordClass");
    private static final SkosConcept NOUN = concept("Noun", "WordClass");
    private static final SkosConcept RARE = concept("Rare", "UsageFeature");

    /** The branches as well as what hangs off them: a tree missing its parents states no sibling at all. */
    private static final List<SkosConcept> PUBLISHED = List.of(WORD_CLASS, USAGE, VERB, NOUN, RARE);

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("urn:" + label, label, "", broader, "class", "fixture", "", "");
    }

    /** A term index of three concepts, two of them siblings, which is what the branch rule turns on. */
    private record ThreeTerms(Map<List<String>, List<SkosConcept>> byWords) implements TermIndex {

        static ThreeTerms newInstance() {
            return new ThreeTerms(Map.of(List.of("verb"), List.of(VERB), List.of("noun"), List.of(NOUN),
                    List.of("rare"), List.of(RARE)));
        }

        @Override
        public List<SkosConcept> conceptsOf(final List<String> words) {
            return byWords.getOrDefault(words, List.of());
        }

        @Override
        public Optional<String> broaderOf(final String prefLabel) {
            return byWords.values().stream().flatMap(List::stream)
                    .filter(concept -> concept.prefLabel().equalsIgnoreCase(prefLabel))
                    .map(SkosConcept::broader)
                    .findFirst();
        }

        @Override
        public Set<List<String>> terms() {
            return byWords.keySet();
        }

        @Override
        public int longestTerm() {
            return byWords.keySet().stream().mapToInt(List::size).max().orElse(0);
        }

        @Override
        public String source() {
            return "fixture";
        }

        @Override
        public TermRung rung() {
            return TermRung.WORDS;
        }
    }

    /** A term index that counts how often it is asked for concepts, so a test can price a reading in asks. */
    private static final class AskedIndex implements TermIndex {

        private final TermIndex published;
        private int asked;

        AskedIndex(final TermIndex published) {
            this.published = published;
        }

        int asked() {
            return asked;
        }

        @Override
        public List<SkosConcept> conceptsOf(final List<String> words) {
            asked++;
            return published.conceptsOf(words);
        }

        @Override
        public Set<List<String>> terms() {
            return published.terms();
        }

        @Override
        public int longestTerm() {
            return published.longestTerm();
        }

        @Override
        public Optional<String> broaderOf(final String prefLabel) {
            return published.broaderOf(prefLabel);
        }

        @Override
        public String source() {
            return published.source();
        }

        @Override
        public TermRung rung() {
            return published.rung();
        }
    }

    private static ParsedRepository parse(final Path root) throws IOException {
        final Path source = root.resolve("src/main/java");
        Files.createDirectories(source);
        Files.writeString(source.resolve("Grammar.java"),
                "package a; class Grammar { String verb; String noun; String rare; }");
        return ParsedRepository.of(root, new JavaSourceScopes().under(root));
    }

    private static ParsedRepository parseWritingEachTermSeveralTimes(final Path root) throws IOException {
        final Path source = root.resolve("src/main/java");
        Files.createDirectories(source);
        Files.writeString(source.resolve("Grammar.java"),
                "package a; class Grammar { String verbCount; String verbShare; String nounCount; "
                        + "String nounShare; String rareCount; String rareShare; }");
        return ParsedRepository.of(root, new JavaSourceScopes().under(root));
    }

    @Test
    void refusesAOneWordTermWrittenBesideNoConceptOfItsOwnBranch(@TempDir final Path root)
            throws IOException {
        final CorroboratedReading reading = CorroboratedReading.of(ThreeTerms.newInstance(),
                PUBLISHED, parse(root));

        assertAll(
                () -> assertThat(reading.every().sightings()).map(TermSighting::term)
                        .containsExactlyInAnyOrder("verb", "noun", "rare"),
                () -> assertThat(reading.matched().sightings()).map(TermSighting::term)
                        .as("Verb and Noun corroborate each other under WordClass; Rare stands alone")
                        .containsExactlyInAnyOrder("verb", "noun"),
                () -> assertThat(reading.refusedByBranch()).isOne());
    }

    @Test
    void readsTheParseOnceForBothTheEveryAndTheCorroboratedReading(@TempDir final Path root)
            throws IOException {
        final ParsedRepository parsed = parseWritingEachTermSeveralTimes(root);
        final AskedIndex alone = new AskedIndex(ThreeTerms.newInstance());
        TermReading.over(alone).of(parsed);

        final AskedIndex counted = new AskedIndex(ThreeTerms.newInstance());
        CorroboratedReading.of(counted, PUBLISHED, parsed);

        assertThat(counted.asked())
                .as("the branch rule rereads the recorded runs, not the parse, so the second reading "
                        + "costs the distinct terms rather than the occurrences")
                .isLessThan(2 * alone.asked());
    }

    @Test
    void agreesWithASecondPassThatReadsTheParseAgainForTheBranchRule(@TempDir final Path root)
            throws IOException {
        final ParsedRepository parsed = parseWritingEachTermSeveralTimes(root);
        final CorroboratedReading reading = CorroboratedReading.of(ThreeTerms.newInstance(), PUBLISHED,
                parsed);

        final MatchedTerms secondPass = TermReading
                .corroboratedBy(ThreeTerms.newInstance(), reading.siblings()).of(parsed);

        assertThat(reading.matched())
                .usingRecursiveComparison().ignoringCollectionOrder()
                .isEqualTo(secondPass);
    }

    @Test
    void keepsAOneWordRunReadAtTheSenseRungWhoseBranchTheRepositoryWrote(@TempDir final Path root)
            throws IOException {
        final SkosConcept namePart = concept("name part", "");
        final SkosConcept familyName = concept("family name", "name part");
        final SkosConcept properNoun = concept("proper noun", "name part");
        final ThreeTerms index = new ThreeTerms(Map.of(
                List.of("family", "name"), List.of(familyName),
                List.of("proper", "noun"), List.of(properNoun)));
        final Path source = root.resolve("src/main/java");
        Files.createDirectories(source);
        Files.writeString(source.resolve("Names.java"),
                "package a; class Names { String surname; String properNoun; }");
        final ParsedRepository parsed = ParsedRepository.of(root, new JavaSourceScopes().under(root));

        final CorroboratedReading reading = CorroboratedReading.of(index,
                List.of(namePart, familyName, properNoun), parsed);

        assertAll(
                () -> assertThat(reading.matched().sightings()).map(TermSighting::term)
                        .contains("surname"),
                () -> assertThat(reading.matched().sightings().stream()
                        .filter(sighting -> sighting.term().equals("surname"))
                        .findFirst().orElseThrow().rung())
                        .as("the dictionary read surname as family name, and proper noun written in the "
                                + "same branch corroborates it")
                        .isEqualTo(TermRung.SENSES));
    }

    @Test
    void readsTheBranchOffTheReadingThatRefusedNothing(@TempDir final Path root) throws IOException {
        final CorroboratedReading reading = CorroboratedReading.of(ThreeTerms.newInstance(),
                PUBLISHED, parse(root));

        assertAll(
                () -> assertThat(reading.siblings().writtenBeside("Verb"))
                        .as("asking the corroborated reading which siblings were written would be the rule "
                                + "judging itself")
                        .isPositive(),
                () -> assertThat(reading.everyTree().written())
                        .isGreaterThan(reading.tree().written()));
    }
}
