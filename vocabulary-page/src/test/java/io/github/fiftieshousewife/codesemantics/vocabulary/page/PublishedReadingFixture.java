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
                  "matches": [
                    {"vocabulary": "FIBO", "term": "interest rate", "wordsInTerm": 2, "rung": "WORDS",
                     "specificity": 0.9, "occurrences": 6, "outcome": "REPORTED",
                     "concepts": ["InterestRate"], "sites": ["A.java:1"]},
                    {"vocabulary": "FIBO", "term": "coupon", "wordsInTerm": 1, "rung": "WORDS",
                     "specificity": 0.5, "occurrences": 40, "outcome": "REPORTED",
                     "concepts": ["Coupon"], "sites": ["A.java:1"]},
                    {"vocabulary": "BIAN", "term": "term deposit", "wordsInTerm": 2, "rung": "WORDS",
                     "specificity": 0.9, "occurrences": 3, "outcome": "REPORTED",
                     "concepts": ["Term Deposit"], "sites": ["A.java:2"]},
                    {"vocabulary": "FIBO", "term": "credit risk", "wordsInTerm": 2, "rung": "LEMMAS",
                     "specificity": 0.9, "occurrences": 5, "outcome": "REPORTED",
                     "concepts": ["CreditRisk"], "sites": ["A.java:3"]}
                  ],
                  "workings": {
                    "words": [
                      {"word": "part_of_speech", "occurrences": 21},
                      {"word": "coupon", "occurrences": 40}
                    ]
                  },
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
