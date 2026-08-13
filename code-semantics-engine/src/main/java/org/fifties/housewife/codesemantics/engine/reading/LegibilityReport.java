package org.fifties.housewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * Renders a {@link RepositoryLegibility} as the markdown a reader can check. Every figure that is a share is
 * printed beside the count it came from, because a share whose denominator is not shown cannot be argued with
 * — and the whole point of reporting legibility beside a reading is to let a consumer see how thin the reading
 * is.
 */
public final class LegibilityReport {

    private static final int TAIL_LIMIT = 15;

    private static final String SCOPE_HEADER = """
            | Scope | Files | Identifiers | The language's own | The author's words | Read | λ |
            |---|--:|--:|--:|--:|--:|--:|""";

    private static final String SOURCE_HEADER = """
            | Resource | Occurrences it can be cited for | Share | Resting on it alone |
            |---|--:|--:|--:|""";

    private static final String TAIL_HEADER = """
            | Word | Occurrences | First seen |
            |---|--:|---|""";

    public String render(final RepositoryLegibility reading) {
        final List<String> lines = new ArrayList<>();
        lines.add(SCOPE_HEADER);
        reading.scopes().forEach(scope -> lines.add(scopeRow(scope, false)));
        lines.add(scopeRow(reading.repository(), true));
        lines.add("");
        lines.add(vocabularySentence(reading.repository()));
        lines.add("");
        lines.add(SOURCE_HEADER);
        sourceRows(reading.repository()).forEach(lines::add);
        lines.add("");
        lines.add(TAIL_HEADER);
        tailRows(reading.repository()).forEach(lines::add);
        lines.add("");
        lines.add(costSentence(reading));
        return String.join("\n", lines) + "\n";
    }

    private static String scopeRow(final ScopeLegibility scope, final boolean total) {
        final OccurrenceCounts counts = scope.counts();
        final String name = total ? "**" + scope.name() + "**" : "`" + scope.name() + "`";
        return "| %s | %s | %s | %s (%s) | %s | %s | **%s** |".formatted(name,
                count(scope.files()), count(counts.identifiers()),
                count(counts.languageWords()), percentage(counts.languageWordShare()),
                count(counts.words()), count(counts.read()), legibility(counts.legibility()));
    }

    private static String vocabularySentence(final ScopeLegibility repository) {
        final OccurrenceCounts counts = repository.counts();
        return ("The author's words are %s occurrences of %s distinct surfaces, %s of them (%s) written exactly "
                + "once. %s glued runs no boundary divided were read by the segmenter; %s occurrences across "
                + "%s surfaces nothing could be cited for at all.").formatted(
                count(counts.words()), count(counts.distinctWords()), count(counts.wordsSeenOnce()),
                percentage(counts.tailShare()), count(counts.gluedRunsRead()),
                count(repository.unread().totalOccurrences()), count(repository.unread().occurrences().size()));
    }

    private static List<String> sourceRows(final ScopeLegibility repository) {
        return repository.occurrencesBySource().entrySet().stream()
                .sorted(Map.Entry.<EvidenceSource, Integer>comparingByValue().reversed())
                .map(source -> "| `%s` | %s | %s | %s |".formatted(source.getKey().displayName(),
                        count(source.getValue()), percentage(repository.shareCitedBy(source.getKey())),
                        count(repository.occurrencesRestingOn(source.getKey()))))
                .toList();
    }

    private static List<String> tailRows(final ScopeLegibility repository) {
        return repository.unread().mostWritten(TAIL_LIMIT).stream()
                .map(sighting -> "| `%s` | %s | `%s` |".formatted(sighting.word(),
                        count(sighting.occurrences()), sighting.site()))
                .toList();
    }

    private static String costSentence(final RepositoryLegibility reading) {
        final int files = reading.repository().files();
        final long milliseconds = reading.elapsed().toMillis();
        return String.format(Locale.ROOT,
                "Read %s files in %.1f s — %.1f ms a file, recorded rather than estimated.",
                count(files), milliseconds / 1000.0, files == 0 ? 0.0 : (double) milliseconds / files);
    }

    private static String count(final int value) {
        return String.format(Locale.ROOT, "%,d", value);
    }

    private static String percentage(final double share) {
        return String.format(Locale.ROOT, "%.1f%%", share * 100.0);
    }

    private static String legibility(final double lambda) {
        return String.format(Locale.ROOT, "%.3f", lambda);
    }
}
