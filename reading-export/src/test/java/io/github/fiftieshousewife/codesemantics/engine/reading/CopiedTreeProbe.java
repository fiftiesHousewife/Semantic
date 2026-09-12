package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequests;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedReading;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSignal;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSummary;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingSource;
import io.github.fiftieshousewife.codesemantics.repository.PullRequestFacts;

/**
 * Reads one repository twice — the tree itself, and a copy stating every file the scopes name — and compares
 * the two exports block by block. The pull request path reads a directory a fetch step wrote, so this is the
 * property it rests on: a directory holding the same files is the same reading, signal for signal and score
 * for score.
 *
 * <p>The summary's {@code repository} and {@code commit} fields name the directory and the revision rather
 * than what was read, so they are the two fields the comparison sets aside. Everything else must be equal
 * exactly: the reading is deterministic at the shared seed, so a difference is a defect, never a tolerance
 * to widen.
 *
 * <p>It prints; nothing votes on it and no published figure moves. The copy is deleted when the two agree
 * and kept, with its path printed, when they do not.
 */
public final class CopiedTreeProbe {

    private CopiedTreeProbe() {
    }

    public static void main(final String[] arguments) throws IOException {
        final TreeReading original = TreeReading.ofTheCloneUnderReading();
        final Path copies = Files.createTempDirectory("copied-tree");
        final TreeReading copy = TreeReading.of(CopiedTree.ofEveryScope(original.root()).into(copies));
        final ReadingExport read = export(original);
        final ReadingExport reread = export(copy);

        System.out.printf("%n%s read twice, the second time from %s%n%n", original.root().getFileName(),
                copies);
        final Map<String, Boolean> blocks = compared(read, reread);
        blocks.put("pullRequest", pullRequestPathAgrees(read, copy));
        blocks.forEach((block, same) -> System.out.printf("%-12s %s%n", block, same ? "same" : "differs"));

        if (blocks.containsValue(false)) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "the copy at %s does not reproduce the reading",
                    copies));
        }
        deleted(copies);
    }

    private static ReadingExport export(final TreeReading reading) {
        return new ExportedReading().of(reading.reading(), "", ExportedReading.vocabulariesBesidesOlia(),
                reading.terms(), reading.arxivField(), reading.namesChance());
    }

    private static Map<String, Boolean> compared(final ReadingExport read, final ReadingExport reread) {
        final Map<String, Boolean> blocks = new LinkedHashMap<>();
        blocks.put("summary", summariesAgree(read.summary(), reread.summary()));
        blocks.put("signals", read.signals().equals(reread.signals()));
        blocks.put("thresholds", read.thresholds().equals(reread.thresholds()));
        blocks.put("themes", read.themes().equals(reread.themes()));
        blocks.put("taxonomies", read.taxonomies().equals(reread.taxonomies()));
        blocks.put("setAside", read.setAside().equals(reread.setAside()));
        return blocks;
    }

    /** Every summary field but the directory's name and the caller-stated commit, which name the copy. */
    private static boolean summariesAgree(final ExportedSummary read, final ExportedSummary reread) {
        return read.answers().equals(reread.answers())
                && read.about().equals(reread.about())
                && read.aboutStatedBy().equals(reread.aboutStatedBy())
                && read.placedIn().equals(reread.placedIn())
                && read.leadingWords().equals(reread.leadingWords())
                && read.leadingConcepts().equals(reread.leadingConcepts())
                && read.distinctiveScopes().equals(reread.distinctiveScopes())
                && read.shareOfWordsWithACitation() == reread.shareOfWordsWithACitation()
                && read.shareOfMassOnNoSubject() == reread.shareOfMassOnNoSubject()
                && Objects.equals(read.counts(), reread.counts());
    }

    /**
     * The copy composed as a pull request stating every file must carry the tree's own signals at the
     * tree's own thresholds, differing only in the source each signal states. The facts are placeholders:
     * nothing here is published, and the property under test is the pipeline, not the pins.
     */
    private static boolean pullRequestPathAgrees(final ReadingExport read, final TreeReading copy) {
        final String placeholder = "0".repeat(40);
        final ExportedPullRequest pullRequest = new ExportedPullRequests()
                .of(new PullRequestFacts(1, "copied-tree", placeholder, placeholder, 1), copy.reading());
        return read.thresholds().equals(pullRequest.thresholds())
                && read.signals().equals(restamped(pullRequest.signals()));
    }

    private static List<ExportedSignal> restamped(final List<ExportedSignal> signals) {
        return signals.stream()
                .map(signal -> new ExportedSignal(ReadingSource.CLONE, signal.word(), signal.occurrences(),
                        signal.occurrencesInNames(), signal.divergenceBits(), signal.marginBits(),
                        signal.closestReference(), signal.firstWrittenAt()))
                .toList();
    }

    private static void deleted(final Path copies) throws IOException {
        try (Stream<Path> files = Files.walk(copies)) {
            files.sorted(Comparator.reverseOrder())
                    .forEach(CopiedTreeProbe::removed);
        }
    }

    private static void removed(final Path file) {
        try {
            Files.delete(file);
        } catch (final IOException cannotDelete) {
            throw new UncheckedIOException(cannotDelete);
        }
    }
}
