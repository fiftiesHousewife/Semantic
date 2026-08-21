package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.reading.ScopeLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.StagedWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordPipelines;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws the tree under reading at every stage of the word pipeline, one cloud per stage.
 *
 * <p>It is a diagnostic and writes nowhere near {@code output/}, which holds JSON and nothing else.
 */
@Slf4j
public final class VocabularyPageCommand {

    /** How many words a stage draws. Beyond this a cloud is a texture rather than a reading. */
    private static final int DRAWN = 60;

    private static final String PAGE = "vocabulary.html";
    private static final String STYLESHEET = "vocabulary.css";
    private static final String BEHAVIOUR = "vocabulary.js";
    private static final String RESOURCES = "vocabulary/";
    private static final String REPORTS = "code-semantics-engine/build/reports/vocabulary";

    private VocabularyPageCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        wrote(Path.of(REPORTS), staged(TreeReading.ofTheCloneUnderReading()));
    }

    /** Every stage the pipeline puts this tree's words through, with what each left and what it took out. */
    static StagedVocabulary staged(final TreeReading reading) {
        final List<StagedWords> stages = WordPipelines.overJava(ContentWords.fromClasspath())
                .over(written(reading));
        return new StagedVocabulary(reading.root().getFileName().toString(),
                reading.legibility().scopes().size(),
                stages.stream().map(VocabularyPageCommand::stage).toList());
    }

    private static StagedVocabulary.Stage stage(final StagedWords staged) {
        final WrittenWords surviving = staged.surviving();
        return new StagedVocabulary.Stage(staged.stage(), staged.stage().keeps(),
                staged.stage().removes(),
                surviving.words().size(), surviving.totalOccurrences(),
                staged.removed().size(), staged.occurrencesRemoved(),
                StagedVocabulary.drawnFrom(staged, DRAWN));
    }

    /** Every word the tree wrote, as one tally over every scope the walk found. */
    private static WrittenWords written(final TreeReading reading) {
        return WrittenWords.pooling(reading.legibility().scopes().stream()
                .map(ScopeLegibility::written)
                .toList());
    }

    static Path wrote(final Path reports, final StagedVocabulary staged) throws IOException {
        Files.createDirectories(reports);
        final String data = new ObjectMapper().writeValueAsString(Map.of("repository", staged));
        final Path page = reports.resolve(PAGE);
        Files.writeString(page, new VocabularyPage(data, read(STYLESHEET), read(BEHAVIOUR)).markup());
        log.info("{} at {} stages: file://{}", staged.repository(), staged.stages().size(),
                page.toAbsolutePath());
        return page;
    }

    /**
     * The stylesheet and the script, read from the files they are authored in. They are carried whole into
     * one page so it opens from anywhere without its siblings, and neither is ever written in Java.
     */
    private static String read(final String asset) throws IOException {
        try (InputStream source = VocabularyPageCommand.class.getClassLoader()
                .getResourceAsStream(RESOURCES + asset)) {
            if (source == null) {
                throw new IllegalStateException("The page's " + asset + " is not on the classpath");
            }
            return new String(source.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
