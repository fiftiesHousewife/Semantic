package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportFile;
import io.github.fiftieshousewife.codesemantics.engine.export.PullRequestExport;
import io.github.fiftieshousewife.codesemantics.engine.export.PullRequestFile;
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

    /**
     * The published answers where this build can read them, and nothing where the folder holds a reading
     * of another shape. A sweep over every folder under {@code output/} meets readings taken at older
     * versions, and one of those is a folder this build cannot draw rather than a failed run.
     */
    public Optional<ReadingExport> readable() {
        try {
            return Optional.of(export());
        } catch (final RuntimeException cannotRead) {
            return Optional.empty();
        }
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
     * The pull requests read beside this repository, as their own published document, and nothing where
     * the run read none. It is a separate file from the reading, so a folder without one is a repository
     * read on its own rather than a document missing a section.
     */
    public Optional<PullRequestExport> pullRequests() {
        final Path file = folder.resolve(PullRequestFile.NAME);
        if (!Files.isRegularFile(file)) {
            return Optional.empty();
        }
        try {
            return Optional.of(new PullRequestFile().in(file));
        } catch (final IOException e) {
            throw new UncheckedIOException("No readable pull requests at " + file, e);
        }
    }

    /**
     * One ranked word of the vocabulary workings: its claim, the margin the verdict rests on, that margin
     * as a multiple of the tightest chance threshold, and the verdict — {@code SIGNAL} or the rule that
     * removed the word.
     */
    public record RankedWord(String word, double claim, double margin, double timesChance,
                             int occurrences, String verdict) {
    }

    /** One term match of the workings: the vocabulary, the term, its size, and where it was placed. */
    public record TermMatchRow(String vocabulary, String term, int wordsInTerm, String normalisation,
                               int occurrences, String outcome, List<String> concepts) {

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
                        match.path("normalisation").asText(),
                        match.path("occurrences").asInt(),
                        match.path("outcome").asText(),
                        concepts));
            });
            return List.copyOf(matches);
        } catch (final IOException e) {
            throw new UncheckedIOException("No readable workings at " + folder, e);
        }
    }

    /**
     * The collocated dictionary units the reading merged, from the evidence's word workings — the words
     * written with an underscore — each with its occurrence count, empty where the file predates them.
     */
    public Map<String, Integer> collocatedUnits() {
        try {
            final JsonNode evidence = new ObjectMapper().readTree(
                    folder.resolve(EVIDENCE).toFile());
            final Map<String, Integer> units = new LinkedHashMap<>();
            evidence.path("workings").path("words").forEach(word -> {
                final String written = word.path("word").asText();
                if (written.contains("_")) {
                    units.merge(written, word.path("occurrences").asInt(), Integer::sum);
                }
            });
            return Map.copyOf(units);
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
                    word.path("verdict").asText())));
            return List.copyOf(ranked);
        } catch (final IOException e) {
            throw new UncheckedIOException("No readable workings at " + folder, e);
        }
    }
}
