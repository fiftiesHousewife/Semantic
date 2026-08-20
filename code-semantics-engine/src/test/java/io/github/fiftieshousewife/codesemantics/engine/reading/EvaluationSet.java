package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

/**
 * The evaluation set the reading is measured on: which repositories, pinned to which commits, said by whom
 * to be about what, and as which expected result. The manifest states each answer <em>before</em> the
 * reading runs; an answer chosen after reading a tree is the same defect as choosing a taxonomy after
 * reading this one.
 *
 * <p><b>It is a test fixture and it never votes.</b> Its provenance is this project — a curated observation
 * of a corpus, which the doctrine refuses as evidence — so it lives in test resources, off the published
 * classpath, where nothing in the library can reach it.
 */
public final class EvaluationSet {

    private static final String RESOURCE = "/evaluation-set.tsv";
    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";
    private static final int COLUMNS = 7;

    private static final String EVALUATION_DIRECTORY_PROPERTY = "cs.evaluation.dir";

    /** One member: where it came from, what it is pinned at, and what it is here to answer. */
    public record Member(String name, String origin, String sha, String licence, String area,
            String statedBy, String arm) {

        /** Where the clone of this member is expected, beneath the directory the evaluation set run names. */
        public Path under(final Path evaluationSet) {
            return evaluationSet.resolve(name);
        }
    }

    private final List<Member> members;

    private EvaluationSet(final List<Member> members) {
        this.members = List.copyOf(members);
    }

    public static EvaluationSet fromClasspath() {
        final InputStream stream = Objects.requireNonNull(
                EvaluationSet.class.getResourceAsStream(RESOURCE), RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return new EvaluationSet(reader.lines()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .map(EvaluationSet::member).toList());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the evaluation-set manifest", e);
        }
    }

    public List<Member> members() {
        return members;
    }

    /**
     * Where the clones are, or nothing where the caller has not said. An evaluation-set run without an
     * evaluation set is not a run with an empty one — it is a question that was never asked, and the
     * difference matters because an empty confusion matrix looks exactly like a perfect one.
     */
    public static Path directory() {
        final String supplied = System.getProperty(EVALUATION_DIRECTORY_PROPERTY, "");
        if (supplied.isBlank()) {
            throw new IllegalStateException("No " + EVALUATION_DIRECTORY_PROPERTY
                    + ". An evaluation-set run reads clones the caller has made; point it at the directory"
                    + " holding them.");
        }
        return Path.of(supplied).toAbsolutePath().normalize();
    }

    private static Member member(final String line) {
        final String[] fields = line.split(COLUMN, -1);
        if (fields.length != COLUMNS) {
            throw new IllegalStateException("A row of the evaluation-set manifest states " + fields.length
                    + " columns where the shape has " + COLUMNS + ": " + line);
        }
        return new Member(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6]);
    }
}
