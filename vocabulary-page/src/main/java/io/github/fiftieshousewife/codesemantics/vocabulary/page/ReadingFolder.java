package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportFile;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;

/**
 * One published reading on disk — the folder holding {@code reading.json} and {@code evidence.json} —
 * which is what every page draws from. The pages consume the reading rather than retake it, so a picture
 * and the published figures cannot disagree, and drawing costs no parse.
 */
public final class ReadingFolder {

    private static final String EVIDENCE = "evidence.json";

    private final Path folder;

    private ReadingFolder(final Path folder) {
        this.folder = folder;
    }

    public static ReadingFolder at(final Path folder) {
        return new ReadingFolder(folder);
    }

    /** The published answers, read under their schema. */
    public ReadingExport export() {
        try {
            return new ExportFile().in(folder.resolve(ExportFile.NAME));
        } catch (final IOException e) {
            throw new UncheckedIOException("No readable reading at " + folder, e);
        }
    }

    /**
     * One ranked word of the vocabulary workings: its claim, the margin the verdict rests on, that margin
     * as a multiple of the tightest chance threshold, and the rule that set it aside or none.
     */
    public record RankedWord(String word, double claim, double margin, double timesChance,
                             int occurrences, String leftAt) {
    }

    /** One term match of the workings: the vocabulary, the term, its size, and where it was placed. */
    public record TermMatchRow(String vocabulary, String term, int wordsInTerm, int occurrences,
                               String outcome, List<String> concepts) {

        public TermMatchRow {
            concepts = List.copyOf(concepts);
        }
    }

    /** Every taxonomy's term matches from {@code evidence.json}, empty where the file predates them. */
    public List<TermMatchRow> termMatches() {
        try {
            final JsonNode evidence = new ObjectMapper().readTree(
                    folder.resolve(EVIDENCE).toFile());
            final List<TermMatchRow> matches = new ArrayList<>();
            evidence.path("matches").forEach(match -> {
                final List<String> concepts = new ArrayList<>();
                match.path("concepts").forEach(concept -> concepts.add(concept.asText()));
                matches.add(new TermMatchRow(
                        match.path("vocabulary").asText(),
                        match.path("term").asText(),
                        match.path("wordsInTerm").asInt(),
                        match.path("occurrences").asInt(),
                        match.path("outcome").asText(),
                        concepts));
            });
            return List.copyOf(matches);
        } catch (final IOException e) {
            throw new UncheckedIOException("No readable workings at " + folder, e);
        }
    }

    /** The ranking's workings from {@code evidence.json}, empty where the file predates them. */
    public List<RankedWord> vocabularyWorkings() {
        try {
            final JsonNode evidence = new ObjectMapper().readTree(
                    folder.resolve(EVIDENCE).toFile());
            final List<RankedWord> ranked = new ArrayList<>();
            evidence.path("vocabulary").forEach(word -> ranked.add(new RankedWord(
                    word.path("word").asText(),
                    word.path("claim").asDouble(),
                    word.path("margin").asDouble(),
                    word.path("timesChance").asDouble(),
                    word.path("occurrences").asInt(),
                    word.path("leftAt").asText())));
            return List.copyOf(ranked);
        } catch (final IOException e) {
            throw new UncheckedIOException("No readable workings at " + folder, e);
        }
    }
}
