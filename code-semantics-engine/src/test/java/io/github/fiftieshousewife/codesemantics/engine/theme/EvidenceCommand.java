package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;

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
                EvidenceWorkings.of(reading.themes().workings(), ReadWords.fromClasspath()));
    }

    /** The words behind two of the counts the export states, at the bars this run's own null drew. */
    private static EvidenceSetAside setAside(final TreeReading reading) {
        return EvidenceSetAside.of(reading.legibility(),
                ChosenWords.againstEnglishAndThePlatform()
                        .in(new PublishedNames().published(reading.legibility())),
                reading.namesChance());
    }
}
