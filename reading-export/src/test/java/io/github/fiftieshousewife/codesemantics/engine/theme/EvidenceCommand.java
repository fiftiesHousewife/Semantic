package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportSchema;
import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.WordVerdict;

/**
 * Reads a working tree and writes the workings, with no test framework involved — the separation
 * {@code ExportCommand} already states for the answers, stated here for the path that reached them.
 *
 * <p>What {@code ThemeReadingDiagnostic} adds is the assertions. Keeping the write here is what lets a
 * runner read nine trees in one JVM without starting a JUnit engine nine times.
 */
public final class EvidenceCommand {

    private static final String EVIDENCE = "evidence.json";

    /** The stated shape of the workings, checked before every write like the answers' schema is. */
    static final String SCHEMA = "/evidence-export.schema.json";

    private static final int TOPICS_GRAPHED = 18;

    private static final int WITNESSES_HELD = 8;

    private EvidenceCommand() {
    }

    /** The workings behind one tree's reading, at the caller's stated commit, written with that tree's reports. */
    public static Path wrote(final TreeReading reading, final String commit) throws IOException {
        final Path file = ReportFolder.forReadingOf(reading.root()).file(EVIDENCE);
        final ObjectMapper mapper = new ObjectMapper();
        final JsonNode document = mapper.valueToTree(evidenceOf(reading, commit));
        final Set<String> refusals = ExportSchema.fromClasspath(SCHEMA).refusals(document);
        if (!refusals.isEmpty()) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "%s refuses this document: %s",
                    SCHEMA, refusals));
        }
        mapper.writerWithDefaultPrettyPrinter().writeValue(file.toFile(), document);
        return file;
    }

    static ReadingEvidence evidenceOf(final TreeReading reading, final String commit) {
        final Path root = reading.root();
        return ReadingEvidence.of(
                ThemeGraph.of(root.getFileName().toString(), reading.themes(), TOPICS_GRAPHED,
                        WITNESSES_HELD, new SourceLinks(root)),
                commit, reading.reading().seed(),
                ReadingEvidence.matching(reading::terms),
                setAside(reading),
                EvidenceWorkings.of(reading.themes().workings(), ReadWords.fromClasspath()),
                vocabulary(reading));
    }

    /** Every ranked word with the whole of its verdict, so a funnel of the signals is arguable from here. */
    private static List<ReadingEvidence.RankedWord> vocabulary(final TreeReading reading) {
        final Map<String, Double> bars = VocabularyNull.byReference(reading.namesChance());
        return ChosenWords.againstEnglishAndTheCorpus()
                .in(new PublishedNames().published(reading.legibility())).stream()
                .map(word -> new ReadingEvidence.RankedWord(word.word(), word.claim(), word.margin(),
                        timesChance(word, bars), word.occurrences(), WordVerdict.of(word, bars)))
                .toList();
    }

    /**
     * The margin as a multiple of its own reference's threshold, at whichever leaves the least room, and
     * {@code null} where no reference has a positive bar — a multiple of a bar that does not exist.
     */
    private static Double timesChance(final ChosenWord word, final Map<String, Double> bars) {
        return word.against().stream()
                .filter(reference -> bars.getOrDefault(reference.reference(), 0.0) > 0.0)
                .map(reference -> reference.margin() / bars.get(reference.reference()))
                .min(Double::compareTo)
                .orElse(null);
    }

    /** The words behind two of the counts the export states, at the bars this run's own null drew. */
    private static EvidenceSetAside setAside(final TreeReading reading) {
        return EvidenceSetAside.of(reading.legibility(),
                ChosenWords.againstEnglishAndTheCorpus()
                        .in(new PublishedNames().published(reading.legibility())),
                reading.namesChance());
    }
}
