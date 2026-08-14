package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

/**
 * Why <em>this</em> taxonomy was the one matched, carried with the reading it produced.
 *
 * <p>A term match is only as good as the choice of what to match against, and that choice is the step most
 * easily smuggled past a reader. OLiA fits this repository — but it was reached by a chain of readings that
 * each stand on their own evidence, and a page that showed the match without the chain would be asking to be
 * believed rather than checked. Every field here is a figure some other reading already had to defend.
 *
 * <p>The order is the order of inference. What the repository is about is read from its own names and prose;
 * that reading places it against a published subject scheme; the placement has to beat a taxonomy of chance
 * before it counts; and only then does the field select a term vocabulary. Break any link and the match
 * below is an assertion.
 *
 * @param themes      the subjects the theme reading qualified, which is where the chain starts
 * @param field       the published subject the repository stands nearest to
 * @param bits        how far it stands from that subject
 * @param chanceBar   the nearest a taxonomy of chance offered, which the distance had to beat
 * @param standsApart whether it did
 * @param taxonomy    the term vocabulary that field selects
 * @param because     why that vocabulary is the one this field asks for
 */
public record TaxonomyChoice(List<String> themes, String field, double bits, double chanceBar,
                             boolean standsApart, String taxonomy, String because) {

    public TaxonomyChoice {
        themes = List.copyOf(themes);
    }

    /** The chain in one sentence, for a page that has to show its working before it shows its result. */
    public String reasoning() {
        return ("This repository reads as %s. Placed against a published subject scheme it stands nearest "
                + "to %s at %.4f bits, where the nearest a taxonomy of chance offered was %.4f — so the "
                + "placement %s. %s is the term vocabulary that field asks for: %s.")
                .formatted(String.join(" and ", themes), field, bits, chanceBar,
                        standsApart ? "stands apart from chance" : "says only that the scheme is large",
                        taxonomy, because);
    }
}
