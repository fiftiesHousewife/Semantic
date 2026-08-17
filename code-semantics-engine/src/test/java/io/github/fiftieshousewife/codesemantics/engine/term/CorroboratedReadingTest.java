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
            return 1;
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

    private static ParsedRepository parse(final Path root) throws IOException {
        final Path source = root.resolve("src/main/java");
        Files.createDirectories(source);
        Files.writeString(source.resolve("Grammar.java"),
                "package a; class Grammar { String verb; String noun; String rare; }");
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
