package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedUnder;
import io.github.fiftieshousewife.codesemantics.engine.theme.ProbabilityOfSuperiority;
import io.github.fiftieshousewife.codesemantics.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * What somebody outside this project states each repository is about, read from a manifest the caller
 * names, and whether a reading's placement reaches it.
 *
 * <p><b>It is read from a named file and never from the classpath.</b> The manifest this project keeps is
 * a test fixture whose own header states that it never votes, so putting it where a published page could
 * find it would be shipping a curated judgement as though it were a citation. A caller that has one names
 * it; a consumer drawing its own repository has none, and {@link #none()} is that case.
 *
 * <p>Reaching the area is the publisher's own question, not a string comparison. OpenAlex places every
 * topic under a subfield, that under a field and that under a domain, so a placement of
 * <em>Natural Language Processing Techniques</em> descends from <em>Computer Science</em> and a reader
 * comparing the two labels would call it wrong.
 */
public final class StatedAreas {

    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";
    private static final int NAME = 0;
    private static final int AREA = 4;
    private static final int COLUMNS = 5;

    private final Map<String, String> areaByRepository;
    private final List<SkosConcept> subjects;

    private StatedAreas(final Map<String, String> areaByRepository, final List<SkosConcept> subjects) {
        this.areaByRepository = Map.copyOf(areaByRepository);
        this.subjects = List.copyOf(subjects);
    }

    /** No manifest, which is what a consumer drawing its own repository has. */
    public static StatedAreas none() {
        return new StatedAreas(Map.of(), List.of());
    }

    /** A manifest at a path, stating a repository per row with its area in the fifth column. */
    public static StatedAreas at(final Path manifest) {
        try (Stream<String> rows = Files.lines(manifest, StandardCharsets.UTF_8)) {
            final Map<String, String> stated = new HashMap<>();
            rows.filter(row -> !row.isBlank() && !row.startsWith(COMMENT))
                    .map(row -> row.split(COLUMN, -1))
                    .filter(fields -> fields.length > COLUMNS)
                    .forEach(fields -> stated.put(fields[NAME], fields[AREA]));
            return new StatedAreas(stated, OpenAlexTopics.fromClasspath().concepts());
        } catch (final IOException e) {
            throw new UncheckedIOException("No readable manifest at " + manifest, e);
        }
    }

    /** The area stated for this repository, and none where the manifest names no such repository. */
    public Optional<String> of(final String repository) {
        return Optional.ofNullable(areaByRepository.get(repository));
    }

    /** Whether any of these subjects is the stated area or descends from it, by the publisher's own tree. */
    public boolean reached(final String repository, final List<String> placed) {
        return of(repository)
                .map(area -> descendsFrom(PlacedUnder.in(OpenAlexTopics.fromClasspath(), area), placed))
                .orElse(false);
    }

    private boolean descendsFrom(final PlacedUnder expectation, final List<String> placed) {
        return subjects.stream()
                .filter(concept -> placed.stream()
                        .anyMatch(subject -> subject.equalsIgnoreCase(concept.prefLabel())))
                .anyMatch(concept -> expectation.of(concept)
                        == ProbabilityOfSuperiority.Expectation.MEETS_IT);
    }
}
