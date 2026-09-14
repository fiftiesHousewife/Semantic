package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;

/**
 * Where one figure sits in the repository's own spread, which is what says whether it is worth looking at.
 *
 * <p>The bands are the repository's own quartiles and nothing this reading chose. A method carrying eight
 * statements is ordinary in a repository whose upper quartile is eight and unusual in one whose upper
 * quartile is two, and only the repository can say which it is.
 */
enum MetricBand {

    /** At or below the middle of the repository's own methods. */
    TYPICAL("at or below the median"),

    /** Above the middle and no higher than three quarters of the way up them. */
    HIGHER("up to the upper quartile"),

    /** Above what three quarters of the repository's own methods reach. */
    UNUSUAL("above the upper quartile");

    /**
     * The limit <a href="https://doi.org/10.1109/TSE.1976.233837">McCabe's own paper</a> proposes for one
     * module, which stands whatever the repository around it does.
     */
    private static final int MCCABES_LIMIT = 10;

    private final String shown;

    MetricBand(final String shown) {
        this.shown = shown;
    }

    String shown() {
        return shown;
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
     * upper quartile is unusual here even where McCabe would allow it.
     */
    static MetricBand ofComplexity(final int figure, final MeasuredCode.Spread repository) {
        return figure > MCCABES_LIMIT ? UNUSUAL : of(figure, repository);
    }
}
