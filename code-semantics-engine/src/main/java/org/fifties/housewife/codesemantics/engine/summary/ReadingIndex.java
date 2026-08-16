package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;
import java.util.stream.Stream;

/**
 * What a reader is handed first: the summary, and then every other report with the bar it carries stated
 * beside it.
 *
 * <p>A folder of six files with no index is a folder nobody reads in the right order, and the wrong order
 * here is expensive — the detailed reports print what was <em>measured</em> and the summary prints what was
 * <em>shown</em>, so a reader who opens {@code themes.md} first meets four hundred and eighty-nine topics
 * before meeting the six that earned a place.
 *
 * <p>Every entry names its bar, because a report with a bar and a report without one are different kinds of
 * document and a reader has no way to tell by looking.
 */
public record ReadingIndex(String repository, List<Entry> entries) {

    /** One report, what it answers, and what a row in it had to clear to be printed. */
    public record Entry(String file, String title, String answers, String bar) {
    }

    public ReadingIndex {
        entries = List.copyOf(entries);
    }

    /**
     * The named reports, in the order asked for. A name no entry carries is a report the walkthrough thinks
     * it writes and does not, so it fails here rather than rendering a link to nothing.
     */
    public List<Entry> named(final String... files) {
        return Stream.of(files).map(this::entry).toList();
    }

    private Entry entry(final String file) {
        return entries.stream().filter(entry -> entry.file().equals(file)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("no report named " + file));
    }

    /** The reports the self reading writes, in the order they should be read. */
    public static ReadingIndex of(final String repository) {
        return new ReadingIndex(repository, List.of(
                new Entry("summary.html", "Summary",
                        "what the reading shows, in one page",
                        "every line cleared a bar; what did not is named and printed nowhere"),
                new Entry("themes-chart.html", "The charts",
                        "both pictures this reading draws: what the repository is about, and where in a "
                                + "published field it writes",
                        "only topics that distinguish some part of it and that more than one word carries; "
                                + "the field is drawn whole, lit where this repository writes"),
                new Entry("themes.html", "Themes — the detail",
                        "the same reading with every scope, witness and site",
                        "the ranking is qualified; the scope tables print everything measured"),
                new Entry("subjects.html", "Subjects",
                        "where the repository stands against 152 published subject areas",
                        "the nearest must beat the nearest a taxonomy of chance offers"),
                new Entry("taxonomy.html", "The taxonomy",
                        "the published field as a tree, concept by concept, with what this repository wrote "
                                + "under each",
                        "a branch nothing was written under is counted, not hidden; the picture of the "
                                + "whole field is on the chart page"),
                new Entry("evidence.html", "The evidence",
                        "every concept this repository writes, with the names and the lines it wrote them at",
                        "a count is a claim until somebody can go and look; this is what it links to"),
                new Entry("terms.html", "Terms",
                        "which branches of the field the repository occupies, and what it wrote there",
                        "a branch is ranked by distinct concepts written, not by how often"),
                new Entry("vocabulary.html", "The vocabulary",
                        "the words this repository chose, against the words English and the platform "
                                + "chose for it",
                        "a word is ranked by the weakest claim any reference makes for it; nothing is "
                                + "excluded, and what a reference refused sorts last"),
                new Entry("self-reading.html", "Legibility",
                        "how much of the repository any resource can be cited for",
                        "a denominator, not a finding")));
    }
}
