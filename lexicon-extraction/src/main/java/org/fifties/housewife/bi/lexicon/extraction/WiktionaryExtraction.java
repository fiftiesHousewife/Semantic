package org.fifties.housewife.bi.lexicon.extraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/**
 * Streams the kaikki.org wiktextract JSONL dumps once each and writes the two bundled TSVs: the
 * abbreviation citations and the topic vocabulary. Without dump paths the English and Translingual
 * dumps are downloaded first (and reused on later runs); the tool only ever reads the dumps and
 * rewrites the TSVs, so re-running against newer dumps refreshes both in place. The topic vocabulary
 * reads the English entries alone — the Translingual section contributes unit-symbol citations, not
 * words a domain could be spoken about in.
 */
public final class WiktionaryExtraction {

    private final AbbreviationSenses senses = new AbbreviationSenses();
    private final TopicVocabulary vocabulary = new TopicVocabulary();
    private final AbbreviationTsv abbreviationTsv = new AbbreviationTsv();
    private final TopicTsv topicTsv = new TopicTsv();

    public static void main(final String[] args) throws IOException {
        if (args.length < 4 || args[2].isBlank() || args[3].isBlank()) {
            throw new IllegalArgumentException("Usage: WiktionaryExtraction "
                    + "<English kaikki jsonl or jsonl.gz dump; blank downloads it> "
                    + "<Translingual dump; blank downloads it> <abbreviations tsv> <topics tsv>");
        }
        final Path english = args[0].isBlank() ? WiktionaryDump.english().fetch() : Path.of(args[0]);
        final Path translingual = args[1].isBlank() ? WiktionaryDump.translingual().fetch() : Path.of(args[1]);
        new WiktionaryExtraction().extract(List.of(english, translingual), Path.of(args[2]), Path.of(args[3]));
    }

    public void extract(final List<Path> dumps, final Path abbreviationsOut, final Path topicsOut)
            throws IOException {
        final List<AbbreviationSense> cited = new ArrayList<>();
        final Map<String, Set<String>> topicsByWord = new HashMap<>();
        for (final Path dump : dumps) {
            read(dump, cited, topicsByWord);
        }
        write(abbreviationsOut, abbreviationTsv.render(cited));
        write(topicsOut, topicTsv.render(topicsByWord));
    }

    private void read(final Path dump, final List<AbbreviationSense> cited,
                      final Map<String, Set<String>> topicsByWord) throws IOException {
        try (BufferedReader reader = open(dump)) {
            // The contains gates spare a JSON parse per line over a dump of more than a million
            // entries: only a line naming an alt_of/form_of target can cite an expansion, and only
            // a line carrying topics can vote a word into a domain's vocabulary.
            reader.lines().forEach(line -> {
                if (line.contains("\"alt_of\"") || line.contains("\"form_of\"")) {
                    cited.addAll(senses.fromEntryJson(line));
                }
                if (line.contains("\"topics\"")) {
                    vocabulary.fromEntryJson(line).ifPresent(entry -> topicsByWord
                            .computeIfAbsent(entry.word(), word -> new HashSet<>())
                            .addAll(entry.topics()));
                }
            });
        }
    }

    private static void write(final Path output, final String text) throws IOException {
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, text);
    }

    private static BufferedReader open(final Path dump) throws IOException {
        final InputStream stream = Files.newInputStream(dump);
        return new BufferedReader(new InputStreamReader(
                dump.getFileName().toString().endsWith(".gz") ? new GZIPInputStream(stream) : stream,
                StandardCharsets.UTF_8));
    }
}
