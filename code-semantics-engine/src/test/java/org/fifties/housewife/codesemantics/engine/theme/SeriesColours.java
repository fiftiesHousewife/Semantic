package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

/**
 * The page's series colours, in the order they are handed out, with a dark-theme counterpart for each.
 *
 * <p>They are held in one place because two pictures on the same page must give the same theme the same
 * colour — a reader who learns a colour in the sunburst reads it again in the bar without being told.
 */
final class SeriesColours {

    private static final List<String> LIGHT = List.of("#2a78d6", "#eb6834", "#1baf7a", "#eda100", "#e87ba4",
            "#008300", "#4a3aa7", "#0f7a52");
    private static final List<String> DARK = List.of("#3987e5", "#d95926", "#199e70", "#c98500", "#d55181",
            "#008300", "#9085e9", "#2fa87a");

    static final String REST = "var(--rule-strong)";
    static final String ABSTAINED = "var(--abstain)";

    private SeriesColours() {
    }

    static String light(final int rank) {
        return LIGHT.get(rank % LIGHT.size());
    }

    static String dark(final int rank) {
        return DARK.get(rank % DARK.size());
    }

    static int count() {
        return LIGHT.size();
    }

    /** The custom properties a mark carries so one rule can paint it in either theme. */
    static String swatch(final String light, final String dark) {
        return "--c:%s;--cd:%s".formatted(light, dark);
    }
}
