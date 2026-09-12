package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import lombok.Builder;

/**
 * Everything one run of the reading produced that a consumer would act on: the answer first, then the
 * evidence under it.
 *
 * <p>{@link ExportedSummary} is the whole result in one object — what the repository is about, where it was
 * placed, the words and concepts that carried it. The three lists below it are the evidence for those
 * statements, one entry at a time, and a consumer that wants only the answer never reads them.
 *
 * <p><b>Signals and not refusals.</b> A word nothing could be cited for, a match the branch rule discarded
 * and a topic no further away than chance are absent from all three lists and present as counts in
 * {@link SetAside}, so a consumer can tell two hundred signals out of nine hundred candidates from two
 * hundred out of nine thousand without reading a list of refusals. The lists themselves stay in the reports.
 *
 * <p>{@code pullRequests} carries any pull requests read beside the working tree, each as its own reading
 * against its own chance thresholds, so the repository's blocks above stand unchanged whether or not any
 * pull request was read.
 *
 * <p>The reports are a rendering of this and not the other way round: producing this object requires none of
 * them. Its shape is stated in {@code reading-export.schema.json}, which ships beside it and which every
 * document is checked against before it is written.
 */
public record ReadingExport(String schemaVersion, ExportedSummary summary, List<ExportedSignal> signals,
                            Map<String, Double> thresholds, List<ExportedTheme> themes,
                            List<ExportedTaxonomy> taxonomies, SetAside setAside,
                            List<ExportedPullRequest> pullRequests) {

    /**
     * The version of this file's shape. It rises when a field is added, renamed or removed, so a consumer's
     * code can branch on it rather than discover a change by failing.
     */
    public static final String SCHEMA_VERSION = "29.0";

    public ReadingExport {
        Objects.requireNonNull(schemaVersion, "schemaVersion");
        Objects.requireNonNull(summary, "summary");
        signals = List.copyOf(signals);
        thresholds = Collections.unmodifiableSortedMap(new TreeMap<>(thresholds));
        themes = List.copyOf(themes);
        taxonomies = List.copyOf(taxonomies);
        Objects.requireNonNull(setAside, "setAside");
        pullRequests = List.copyOf(pullRequests);
    }

    /** The document at the version this build states, which is the only version it knows how to write. */
    @Builder
    public static ReadingExport of(final ExportedSummary summary, final List<ExportedSignal> signals,
                                   final Map<String, Double> thresholds, final List<ExportedTheme> themes,
                                   final List<ExportedTaxonomy> taxonomies, final SetAside setAside) {
        return new ReadingExport(SCHEMA_VERSION, summary, signals, thresholds, themes, taxonomies,
                setAside, List.of());
    }

    /**
     * The same document with these pull requests beside it. The blocks already composed do not move: the
     * repository's reading stands in the file with the pull requests and without them, which is what lets a
     * consumer check that neither answered the other.
     */
    public ReadingExport withPullRequests(final List<ExportedPullRequest> read) {
        return new ReadingExport(schemaVersion, summary, signals, thresholds, themes, taxonomies,
                setAside, read);
    }
}
