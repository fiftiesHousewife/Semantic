package org.fifties.housewife.codesemantics.engine.theme;

/**
 * What the theme report says, held apart from the figures it says it about.
 *
 * <p>The same separation {@code WalkthroughProse} makes and for the same reason: the prose states the method
 * and is the same whatever repository was read, where the figures beside it are not. A sentence that lives in
 * the class that formats one result is a sentence that gets edited to fit that result.
 */
final class ThemeProse {

    static final String QUALIFICATION =
            "Only the topics that **earned a place**: a topic reaches this table where it makes some part "
            + "of this repository unlike the rest of it — a scope that departed further than the furthest "
            + "of a field of chance draws — and where more than one word carries it. A topic held at the "
            + "same density everywhere distinguishes nothing, and a topic one word holds a majority of is "
            + "that word's opinion. Both bars follow from the reading; neither is a list.";

    static final String COMPARED_AMONG_WHAT_WAS_PLACED =
            "The two share columns below are shares of the mass a topic was settled on, where ι above is a "
            + "share of everything that was observed. A comparison is between what each side was placed in: "
            + "a scope nothing could be read in is not a scope about something else, and counting what went "
            + "unplaced as part of a divergence would report illegibility as a subject.";

    /**
     * The reading's own denominator, stated where a reader meets the first share taken over it. A share of
     * what was placed says nothing about how much there was to place, and this reading places a small part
     * of what it observes.
     */
    static final String VOCABULARY =
            "Read over %s files and %s lines: %s topics, %s files no topic could be resolved for, and %s "
            + "of the repository's lines led by its single strongest topic. **ι is a share of everything "
            + "the reading observed**, and the topics sum to %s of it; the other %s is mass no topic was "
            + "settled on — a phrase nothing could place at all, or one the resources named so many "
            + "subjects for that none of them was settled. The columns beside ι are counts and do not "
            + "sum. **From names** is how much of a theme the code itself carried rather than its prose.";

    /**
     * The divergence beside the field it had to beat. Whether it beat it is stated in the same sentence,
     * because a divergence quoted without its null is the number a reader will treat as a finding.
     */
    static final String VERDICT =
            "**%s bits** from the repository, against a null median of %s over %s resamples of the same "
            + "size — an excess of %+.4f, and %d of those draws diverged at least as far. %s";

    static final String STOOD_OUT = "The scope stands outside its own null, so its topics are ranked below.";

    static final String DID_NOT_STAND_OUT =
            "**The scope does not stand outside its own null**, so it has no topical content beyond its size "
            + "and nothing is ranked.";

    static final String COST = "Read, compared and resampled in %.1f s, recorded rather than estimated.";

    private ThemeProse() {
    }
}
