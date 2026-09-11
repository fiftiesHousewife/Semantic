package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportSchema;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchNormalisation;
import io.github.fiftieshousewife.codesemantics.engine.term.TermOutcome;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.WordVerdict;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class EvidenceCommandTest {

    private static TreeReading reading(final Path root) throws IOException {
        final Path scope = root.resolve("module").resolve("src").resolve("main").resolve("java").resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("NounPhrase.java"),
                "package a; /** Reads a noun phrase. */ class NounPhrase { String headword; String lemma; }");
        return TreeReading.of(root);
    }

    @Test
    void statesTheRunItWasWrittenBy(@TempDir final Path root) throws IOException {
        final TreeReading reading = reading(root);

        final ReadingEvidence evidence = EvidenceCommand.evidenceOf(reading, "c0ffee");

        assertAll(
                () -> assertThat(evidence.schemaVersion()).isEqualTo(ReadingEvidence.VERSION),
                () -> assertThat(evidence.commit()).isEqualTo("c0ffee"),
                () -> assertThat(evidence.seed()).isEqualTo(reading.reading().seed()));
    }

    @Test
    void statesEveryRankedWordsVerdictAsANamedValue(@TempDir final Path root) throws IOException {
        final ReadingEvidence evidence = EvidenceCommand.evidenceOf(reading(root), "");

        assertThat(evidence.vocabulary())
                .isNotEmpty()
                .allSatisfy(word -> assertThat(word.verdict()).isNotNull());
    }

    @Test
    void assemblesADocumentItsOwnSchemaAdmits(@TempDir final Path root) throws IOException {
        final ReadingEvidence evidence = EvidenceCommand.evidenceOf(reading(root), "c0ffee");

        assertThat(ExportSchema.fromClasspath(EvidenceCommand.SCHEMA)
                .refusals(new ObjectMapper().valueToTree(evidence)))
                .isEmpty();
    }

    @Test
    void refusesADocumentCarryingAKeyTheSchemaDoesNotName(@TempDir final Path root) throws IOException {
        final ObjectNode document = new ObjectMapper()
                .valueToTree(EvidenceCommand.evidenceOf(reading(root), "c0ffee"));
        document.set("seedUsed", document.remove("seed"));

        assertThat(ExportSchema.fromClasspath(EvidenceCommand.SCHEMA).refusals(document))
                .as("the writer cannot change the shape without the schema saying so")
                .isNotEmpty();
    }

    @Test
    void statesEveryValueOfEachEnumTheDocumentCanCarry() throws IOException {
        final JsonNode schema = new ObjectMapper().readTree(
                EvidenceCommandTest.class.getResourceAsStream(EvidenceCommand.SCHEMA));

        assertAll(
                () -> assertThat(enumAt(schema, "/properties/workings/properties/unread/items"
                        + "/properties/reason/enum"))
                        .containsExactlyInAnyOrder(names(UnreadReason.values())),
                () -> assertThat(enumAt(schema, "/properties/vocabulary/items/properties/verdict/enum"))
                        .containsExactlyInAnyOrder(names(WordVerdict.values())),
                () -> assertThat(enumAt(schema, "/properties/matches/items/properties/outcome/enum"))
                        .containsExactlyInAnyOrder(names(TermOutcome.values())),
                () -> assertThat(enumAt(schema, "/properties/matches/items/properties/normalisation/enum"))
                        .containsExactlyInAnyOrder(names(MatchNormalisation.values())));
    }

    private static List<String> enumAt(final JsonNode schema, final String pointer) {
        final List<String> values = new ArrayList<>();
        schema.at(pointer).forEach(value -> values.add(value.asText()));
        return values;
    }

    private static String[] names(final Enum<?>[] values) {
        return Stream.of(values).map(Enum::name).toArray(String[]::new);
    }

    @Test
    void writesNoTimesChanceWhereNoReferenceHasAPositiveBar() throws IOException {
        final ReadingEvidence.RankedWord silent =
                new ReadingEvidence.RankedWord("lemma", 0.02, 0.018, null, 40, WordVerdict.SIGNAL);

        assertThat(new ObjectMapper().writeValueAsString(silent))
                .as("a multiple of a bar that does not exist is absent, never zero")
                .doesNotContain("timesChance")
                .contains("\"verdict\":\"SIGNAL\"");
    }

    @Test
    void writesTimesChanceWhereABarExists() throws IOException {
        final ReadingEvidence.RankedWord scored =
                new ReadingEvidence.RankedWord("lemma", 0.02, 0.018, 5.0, 40, WordVerdict.SIGNAL);

        assertThat(new ObjectMapper().writeValueAsString(scored)).contains("\"timesChance\":5.0");
    }
}
