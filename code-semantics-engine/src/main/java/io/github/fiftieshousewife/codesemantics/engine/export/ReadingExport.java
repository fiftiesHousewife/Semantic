package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

import lombok.Builder;

/**
 * Everything one run of the reading produced that a consumer would act on: the answer first, then the
 * evidence under it.
 *
 * <p>{@link ExportedSummary} is the whole result in one object — what the repository is about, where it was
 * placed, the words and concepts that carried it. The four lists below it are the evidence for those
 * statements, one entry at a time, and a consumer that wants only the answer never reads them.
 *
 * <p><b>Named and done are different evidence.</b> Signals, themes and taxonomies say what a repository
 * calls things; {@link ExportedBehaviour} says what it does, read from the clause a method name states.
 * They are reported side by side and never summed, because a repository whose names say one thing and whose
 * verbs say another is stating a fact about itself that an average would hide.
 *
 * <p><b>Signals and not refusals.</b> A word nothing could be cited for, a match the branch rule discarded
 * and a topic no further away than chance are absent from all three lists and present as counts in
 * {@link SetAside}, so a consumer can tell two hundred signals out of nine hundred candidates from two
 * hundred out of nine thousand without reading a list of refusals. The lists themselves stay in the reports.
 *
 * <p>The reports are a rendering of this and not the other way round: producing this object requires none of
 * them. Its shape is stated in {@code reading-export.schema.json}, which ships beside it and which every
 * document is checked against before it is written.
 */
public record ReadingExport(String schemaVersion, ExportedSummary summary, List<ExportedSignal> signals,
                            List<ExportedTheme> themes, List<ExportedTaxonomy> taxonomies,
                            List<ExportedBehaviour> behaviours, SetAside setAside) {

    /**
     * The version of this file's shape. It rises when a field is added, renamed or removed, so a consumer's
     * code can branch on it rather than discover a change by failing.
     */
    public static final String SCHEMA_VERSION = "7.0";

    public ReadingExport {
        Objects.requireNonNull(schemaVersion, "schemaVersion");
        Objects.requireNonNull(summary, "summary");
        signals = List.copyOf(signals);
        themes = List.copyOf(themes);
        taxonomies = List.copyOf(taxonomies);
        behaviours = List.copyOf(behaviours);
        Objects.requireNonNull(setAside, "setAside");
    }

    /** The document at the version this build states, which is the only version it knows how to write. */
    @Builder
    public static ReadingExport of(final ExportedSummary summary, final List<ExportedSignal> signals,
                                   final List<ExportedTheme> themes, final List<ExportedTaxonomy> taxonomies,
                                   final List<ExportedBehaviour> behaviours, final SetAside setAside) {
        return new ReadingExport(SCHEMA_VERSION, summary, signals, themes, taxonomies, behaviours, setAside);
    }
}
