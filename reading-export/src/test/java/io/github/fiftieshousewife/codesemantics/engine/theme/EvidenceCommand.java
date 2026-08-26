package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;

/**
 * Reads a working tree and writes the workings, with no test framework involved — the separation
 * {@code ExportCommand} already states for the answers, stated here for the path that reached them.
 *
 * <p>What {@code ThemeReadingDiagnostic} adds is the assertions. Keeping the write here is what lets a
 * runner read nine trees in one JVM without starting a JUnit engine nine times.
 */
public final class EvidenceCommand {

    private static final String EVIDENCE = "evidence.json";

    private static final int TOPICS_GRAPHED = 18;

    private static final int WITNESSES_HELD = 8;

    private EvidenceCommand() {
    }

    /** The workings behind one tree's reading, written where that tree's reports go. */
    public static Path wrote(final TreeReading reading) throws IOException {
        final Path root = reading.root();
        final Path file = ReportFolder.forReadingOf(root).file(EVIDENCE);
        new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValue(file.toFile(), evidenceOf(reading, root));
        return file;
    }

    private static ReadingEvidence evidenceOf(final TreeReading reading, final Path root) {
        return ReadingEvidence.of(
                ThemeGraph.of(root.getFileName().toString(), reading.themes(), TOPICS_GRAPHED,
                        WITNESSES_HELD, new SourceLinks(root)),
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
                        timesChance(word, bars), word.occurrences(), leftAt(word, bars)))
                .toList();
    }

    private static String leftAt(final ChosenWord word, final Map<String, Double> bars) {
        if (word.withinTheReferencesError(bars)) {
            return "error";
        }
        if (!word.clears(bars)) {
            return "chance";
        }
        return word.theLanguages() ? "english" : "";
    }

    /** The margin as a multiple of its own reference's threshold, at whichever leaves the least room. */
    private static double timesChance(final ChosenWord word, final Map<String, Double> bars) {
        return word.against().stream()
                .filter(reference -> bars.getOrDefault(reference.reference(), 0.0) > 0.0)
                .mapToDouble(reference -> reference.margin() / bars.get(reference.reference()))
                .min()
                .orElse(0.0);
    }

    /** The words behind two of the counts the export states, at the bars this run's own null drew. */
    private static EvidenceSetAside setAside(final TreeReading reading) {
        return EvidenceSetAside.of(reading.legibility(),
                ChosenWords.againstEnglishAndTheCorpus()
                        .in(new PublishedNames().published(reading.legibility())),
                reading.namesChance());
    }
}
