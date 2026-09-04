package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.GZIPOutputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class WiktionaryExtractionTest {

    private static final String DUMP = """
            {"word":"avg","lang_code":"en","senses":[{"tags":["abbreviation"],"alt_of":[{"word":"average"}],"topics":["mathematics"]}]}
            {"word":"average","lang_code":"en","senses":[{"tags":["uncountable"],"glosses":["The arithmetic mean."]}]}
            {"word":"pts","lang_code":"en","senses":[{"tags":["abbreviation"],"alt_of":[{"word":"points"}]}]}
            {"word":"break point","lang_code":"en","senses":[{"topics":["tennis","sports"],"glosses":["A point that would win the game."]}]}
            """;

    private static final String TRANSLINGUAL_DUMP = """
            {"word":"kJ","lang_code":"mul","pos":"symbol","senses":[{"tags":["alt-of","symbol"],\
            "alt_of":[{"word":"kilojoule","extra":"an SI unit of work or energy equal to 10\\u00b3 joules"}],\
            "topics":["metrology"]}]}
            {"word":"kj","lang_code":"mul","pos":"symbol","senses":[{"glosses":["ISO 639-1 language code for Kwanyama."]}]}
            """;

    @TempDir
    Path workDir;

    @Test
    void extractsBothTsvsFromTheEnglishAndTranslingualDumps() throws IOException {
        final Path dump = workDir.resolve("dump.jsonl");
        Files.writeString(dump, DUMP);
        final Path translingual = workDir.resolve("translingual.jsonl");
        Files.writeString(translingual, TRANSLINGUAL_DUMP);
        final Path abbreviations = workDir.resolve("out/wiktionary-abbreviations.tsv");
        final Path topics = workDir.resolve("out/wiktionary-topics.tsv");

        final WiktionaryExtraction extraction = new WiktionaryExtraction();
        extraction.extract(extraction.dumps(dump.toString(), translingual.toString()),
                abbreviations, topics);

        assertAll(
                () -> assertThat(dataRows(abbreviations)).containsExactly(
                        "avg\taverage\tabbreviation\tmathematics\t",
                        "kj\tkilojoule\tsymbol\tmetrology\twork or energy",
                        "pts\tpoints\tabbreviation\t\t"),
                () -> assertThat(dataRows(topics)).containsExactly(
                        "avg\tmathematics",
                        "break_point\tsports,tennis"));
    }

    @Test
    void readsAGzippedDump() throws IOException {
        final Path dump = workDir.resolve("dump.jsonl.gz");
        try (OutputStream stream = new GZIPOutputStream(Files.newOutputStream(dump))) {
            stream.write(DUMP.getBytes(StandardCharsets.UTF_8));
        }
        final Path abbreviations = workDir.resolve("abbreviations.tsv");
        final Path topics = workDir.resolve("topics.tsv");

        new WiktionaryExtraction().extract(List.of(dump), abbreviations, topics);

        assertAll(
                () -> assertThat(dataRows(abbreviations)).hasSize(2),
                () -> assertThat(dataRows(topics)).hasSize(2));
    }

    @Test
    void readsTheDumpsACallerNamesWithoutDownloadingEither() throws IOException {
        final Path english = workDir.resolve("en.jsonl");
        final Path translingual = workDir.resolve("mul.jsonl");

        assertThat(new WiktionaryExtraction().dumps(english.toString(), translingual.toString()))
                .containsExactly(english, translingual);
    }

    private static List<String> dataRows(final Path output) throws IOException {
        return Files.readAllLines(output).stream().filter(line -> !line.startsWith("#")).toList();
    }
}
