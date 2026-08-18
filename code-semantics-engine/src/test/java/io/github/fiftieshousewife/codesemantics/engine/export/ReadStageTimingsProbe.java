package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;

/**
 * Prints where the time of a read goes, one stage per row.
 *
 * <p>Each stage is touched once, in dependency order, in a fresh JVM, so a row's cost is that stage's own
 * first computation and the rows sum to what {@link ReadingExportDiagnostic} pays when it runs first. The
 * export row writes to a temporary folder and matches no injected taxonomy — those are rows of their own —
 * so a run leaves the published reports untouched.
 */
public final class ReadStageTimingsProbe {

    private static final String ROW = "%-58s %7.1fs%n";

    private ReadStageTimingsProbe() {
    }

    public static void main(final String[] args) throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final long started = System.nanoTime();
        timed("parse", reading::parsed);
        timed("legibility", reading::legibility);
        timed("topical reading, with each scope's chance draws", reading::themes);
        timed("bundled term vocabulary, every match and corroborated", reading::terms);
        timed("arXiv subject placement, with its chance draws", reading::arxivField);
        timed("published-names chance draws", reading::namesChance);
        final List<TermIndex> injected = timed("injected taxonomy indexes", ExportCommand::alsoMatched);
        for (final TermIndex index : injected) {
            timed(index.source() + ", every match and corroborated",
                    () -> CorroboratedReading.of(index, ExportedReading.conceptsOf(index),
                            reading.parsed()));
        }
        timed("export assembly and serialisation", () -> written(reading));
        System.out.printf(ROW, "total", seconds(started));
    }

    private static Path written(final TreeReading reading) throws IOException {
        final Path file = Files.createTempDirectory("read-timings").resolve(ExportFile.NAME);
        new ExportFile().wrote(file, new ExportedReading().of(reading.reading(), "", List.of(),
                reading.terms(), reading.arxivField(), reading.namesChance()));
        return file;
    }

    private static <T> T timed(final String stage, final Stage<T> work) throws IOException {
        final long started = System.nanoTime();
        final T value = work.value();
        System.out.printf(ROW, stage, seconds(started));
        return value;
    }

    private static double seconds(final long started) {
        return (System.nanoTime() - started) / 1_000_000_000.0;
    }

    /** One stage of the read, whose first computation is what the row times. */
    @FunctionalInterface
    private interface Stage<T> {
        T value() throws IOException;
    }
}
