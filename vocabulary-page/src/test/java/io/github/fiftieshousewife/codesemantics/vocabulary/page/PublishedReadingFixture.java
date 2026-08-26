package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportFile;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSignal;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSummary;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingSource;
import io.github.fiftieshousewife.codesemantics.engine.export.SetAside;
import io.github.fiftieshousewife.codesemantics.engine.export.SightingSite;

/**
 * One small published reading on disk, for the page tests to consume: three signals with real dictionary
 * words, and workings whose tallies match the export's counts.
 */
final class PublishedReadingFixture {

    private PublishedReadingFixture() {
    }

    static ReadingFolder wrote(final Path folder) throws IOException {
        Files.createDirectories(folder);
        new ExportFile().wrote(folder.resolve(ExportFile.NAME), export());
        Files.writeString(folder.resolve("evidence.json"), """
                {
                  "schemaVersion": "5.0",
                  "vocabulary": [
                    {"word": "coupon", "claim": 0.010, "margin": 0.009, "timesChance": 5.0,
                     "occurrences": 40, "leftAt": ""},
                    {"word": "lemma", "claim": 0.008, "margin": 0.007, "timesChance": 4.0,
                     "occurrences": 30, "leftAt": ""},
                    {"word": "parsers", "claim": 0.006, "margin": 0.005, "timesChance": 3.0,
                     "occurrences": 20, "leftAt": ""},
                    {"word": "get", "claim": -0.002, "margin": -0.003, "timesChance": -1.5,
                     "occurrences": 200, "leftAt": "chance"},
                    {"word": "buf", "claim": 0.0001, "margin": -0.0001, "timesChance": -0.1,
                     "occurrences": 12, "leftAt": "error"},
                    {"word": "by", "claim": 0.003, "margin": 0.002, "timesChance": 1.4,
                     "occurrences": 15, "leftAt": "english"}
                  ]
                }
                """);
        return ReadingFolder.at(folder);
    }

    private static ReadingExport export() {
        return ReadingExport.of(
                new ExportedSummary("a-repository", "c0ffee", List.of("linguistics"), List.of(),
                        List.of(), List.of(), List.of(), List.of(), 0.9, 0.5,
                        new ExportedSummary.Counts(3, 0, 0)),
                List.of(signal("coupon", 0.010, 0.009, 40), signal("lemma", 0.008, 0.007, 30),
                        signal("parsers", 0.006, 0.005, 20)),
                Map.of("ordinary English", 0.0018, "the reference corpus", 0.002),
                List.of(), List.of(),
                new SetAside(0, 1, 1, 1, 0, 0, 0));
    }

    private static ExportedSignal signal(final String word, final double bits, final double margin,
                                         final int occurrences) {
        return new ExportedSignal(ReadingSource.CLONE, word, occurrences, occurrences, bits, margin,
                "the reference corpus", new SightingSite("A.java", 1));
    }
}
