package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import j2html.tags.DomContent;

import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.li;
import static j2html.TagCreator.span;
import static j2html.TagCreator.ul;

/**
 * Every line of the tree, under the theme that leads the file it sits in — and, in the same bar, the lines
 * no theme could be resolved for at all.
 *
 * <p>The abstention is drawn because it is a reading and not a gap: a file whose words nothing could place
 * has been read and has answered nothing, and a picture that quietly dropped it would show a tree more
 * legible than the one that was measured.
 */
final class LinesLedBar {

    private static final int THEMES_NAMED = 7;

    /** A segment narrower than this cannot hold its own name, and an unreadable label is not a label. */
    private static final double LABEL_FITS = 0.11;

    private static final List<String> LIGHT = List.of("#2a78d6", "#eb6834", "#1baf7a", "#eda100", "#e87ba4",
            "#008300", "#4a3aa7");
    private static final List<String> DARK = List.of("#3987e5", "#d95926", "#199e70", "#c98500", "#d55181",
            "#008300", "#9085e9");

    private static final String REST = "var(--rule-strong)";
    private static final String ABSTAINED = "var(--abstain)";

    private final List<Segment> segments;
    private final int lines;

    private record Segment(String label, int lines, String light, String dark) {
    }

    LinesLedBar(final List<ThemeGraph.File> files) {
        final Map<String, Integer> byTheme = ledByTheme(files);
        this.lines = byTheme.values().stream().mapToInt(Integer::intValue).sum();
        this.segments = segments(byTheme);
    }

    int lines() {
        return lines;
    }

    DomContent bar() {
        return div(each(segments, this::segment)).withClass("stack");
    }

    DomContent legend() {
        return ul(each(segments, this::entry)).withClass("legend");
    }

    private DomContent segment(final Segment segment) {
        final double share = share(segment);
        return div(fits(share) ? span(segment.label()).withClass("seg-label") : span())
                .withClass("seg")
                .attr("style", swatch(segment, "--w:%s;".formatted(ThemeTables.percentage(share))))
                .attr("title", "%s — %s lines, %s of the tree".formatted(segment.label(),
                        ThemeTables.count(segment.lines()), ThemeTables.percentage(share)));
    }

    private DomContent entry(final Segment segment) {
        return li(span().withClass("swatch").attr("style", swatch(segment, "")),
                span(segment.label()),
                span("%s · %s".formatted(ThemeTables.count(segment.lines()),
                        ThemeTables.percentage(share(segment)))).withClass("legend-figure"));
    }

    private static String swatch(final Segment segment, final String width) {
        return "%s--c:%s;--cd:%s".formatted(width, segment.light(), segment.dark());
    }

    private static boolean fits(final double share) {
        return share >= LABEL_FITS;
    }

    private double share(final Segment segment) {
        return (double) segment.lines() / lines;
    }

    /** The empty key is the abstention — a file the reading resolved no theme for, carried and not dropped. */
    private static Map<String, Integer> ledByTheme(final List<ThemeGraph.File> files) {
        final Map<String, Integer> byTheme = new LinkedHashMap<>();
        files.forEach(file -> byTheme.merge(file.dominant(), file.lines(), Integer::sum));
        return byTheme;
    }

    private static List<Segment> segments(final Map<String, Integer> byTheme) {
        final List<Map.Entry<String, Integer>> led = byTheme.entrySet().stream()
                .filter(theme -> !theme.getKey().isEmpty())
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .toList();
        final List<Segment> segments = new ArrayList<>(named(led));
        final int rest = led.stream().skip(THEMES_NAMED).mapToInt(Map.Entry::getValue).sum();
        if (rest > 0) {
            segments.add(new Segment("%d more themes".formatted(led.size() - THEMES_NAMED), rest, REST,
                    REST));
        }
        final int abstained = byTheme.getOrDefault("", 0);
        if (abstained > 0) {
            segments.add(new Segment("no theme resolved", abstained, ABSTAINED, ABSTAINED));
        }
        return List.copyOf(segments);
    }

    private static List<Segment> named(final List<Map.Entry<String, Integer>> led) {
        return IntStream.range(0, Math.min(THEMES_NAMED, led.size()))
                .mapToObj(rank -> new Segment(led.get(rank).getKey(), led.get(rank).getValue(),
                        LIGHT.get(rank), DARK.get(rank)))
                .toList();
    }
}
