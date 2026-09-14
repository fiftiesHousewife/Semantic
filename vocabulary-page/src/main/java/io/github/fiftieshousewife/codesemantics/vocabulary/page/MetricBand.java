package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;

/**
 * Where one figure sits in the repository's own spread, which is what says whether it is worth looking at.
 *
 * <p>The bands are the repository's own quartiles and nothing this reading chose. A method carrying eight
 * statements is ordinary in a repository whose 75th centile is eight and unusual in one whose 75th
 * centile is two, and only the repository states which it is.
 *
 * <p>Each carries a mark of its own shape — a tick, a dash, a cross — so the band a figure sits in reaches
 * a reader who sees no colour, and every mark differs from the other two in outline as well as in hue.
 */
enum MetricBand {

    /** At or below the middle of the repository's own methods. */
    TYPICAL("at or below the median", "\u2713"),

    /** Above the middle and no higher than the repository's 75th centile. */
    HIGHER("up to the 75th centile", "\u2013"),

    /** Above the repository's 75th centile. */
    UNUSUAL("above the 75th centile", "\u2717");

    /**
     * The limit <a href="https://doi.org/10.1109/TSE.1976.233837">McCabe's own paper</a> proposes for one
     * module, which stands whatever the repository around it does.
     */
    private static final int MCCABES_LIMIT = 10;

    private final String shown;

    private final String mark;

    MetricBand(final String shown, final String mark) {
        this.shown = shown;
        this.mark = mark;
    }

    String shown() {
        return shown;
    }

    /** The character standing beside a figure of this band, which is what tells the three apart. */
    String mark() {
        return mark;
    }

    /** Where this figure sits against the repository's own spread of the same measure. */
    static MetricBand of(final int figure, final MeasuredCode.Spread repository) {
        if (repository.upperQuartile() == 0) {
            return TYPICAL;
        }
        if (figure > repository.upperQuartile()) {
            return UNUSUAL;
        }
        return figure > repository.median() ? HIGHER : TYPICAL;
    }

    /**
     * The same for a complexity, taking the stricter of the repository's own spread and McCabe's limit: a
     * method past ten is unusual however complex the repository around it, and one past this repository's
     * 75th centile is unusual here even where McCabe would allow it.
     */
    static MetricBand ofComplexity(final int figure, final MeasuredCode.Spread repository) {
        return figure > MCCABES_LIMIT ? UNUSUAL : of(figure, repository);
    }
}
