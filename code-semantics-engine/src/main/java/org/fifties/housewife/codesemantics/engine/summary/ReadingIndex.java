package org.fifties.housewife.codesemantics.engine.summary;

import java.util.List;

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

    /** The reports the self reading writes, in the order they should be read. */
    public static ReadingIndex of(final String repository) {
        return new ReadingIndex(repository, List.of(
                new Entry("summary.html", "Summary",
                        "what the reading shows, in one page",
                        "every line cleared a bar; what did not is named and printed nowhere"),
                new Entry("themes-chart.html", "Themes — the chart",
                        "what the repository is about, drawn",
                        "only topics that distinguish some part of it and that more than one word carries"),
                new Entry("themes.html", "Themes — the detail",
                        "the same reading with every scope, witness and site",
                        "the ranking is qualified; the scope tables print everything measured"),
                new Entry("subjects.html", "Subjects",
                        "where the repository stands against 152 published subject areas",
                        "the nearest must beat the nearest a taxonomy of chance offers"),
                new Entry("terms-chart.html", "Terms — the chart",
                        "where the repository writes a published taxonomy's own terms",
                        "one rung of the ladder, named on the page"),
                new Entry("terms.html", "Terms — the detail",
                        "the same match, split by the rung the two sides met on",
                        "a rate per rung and none across them"),
                new Entry("self-reading.html", "Legibility",
                        "how much of the repository any resource can be cited for",
                        "a denominator, not a finding")));
    }
}
