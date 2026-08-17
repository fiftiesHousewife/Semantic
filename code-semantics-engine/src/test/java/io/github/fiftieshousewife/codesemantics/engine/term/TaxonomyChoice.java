package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.Collectors;

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
 * @param themes      the subjects the theme reading qualified, each with the words that carried it
 * @param field       the published subject the repository stands nearest to
 * @param bits        how far it stands from that subject
 * @param chanceBar   the nearest a taxonomy of chance offered, which the distance had to beat
 * @param standsApart whether it did
 * @param taxonomy    the term vocabulary that field selects
 * @param because     why that vocabulary is the one this field asks for
 */
public record TaxonomyChoice(List<Theme> themes, String field, double bits, double chanceBar,
                             boolean standsApart, String taxonomy, String because) {

    /** How many carrying words to name. Enough to show the reading does not rest on one; not a wall of text. */
    private static final int WORDS_NAMED = 4;

    public TaxonomyChoice {
        themes = List.copyOf(themes);
    }

    /** One subject the reading qualified, and the words in this repository that put it there. */
    public record Theme(String topic, List<String> words) {

        public Theme {
            words = List.copyOf(words);
        }

        String carriedBy() {
            return words.stream().limit(WORDS_NAMED).map("`%s`"::formatted)
                    .collect(Collectors.joining(", "));
        }
    }

    /**
     * The chain in prose, for a page that has to show its working before it shows its result.
     *
     * <p>It used to be one sentence naming the subjects and the two figures, which told a reader what was
     * concluded and nothing about why — the words that actually carried each subject, which is the only part
     * anyone can argue with, were left out entirely. A reader who disagrees with `linguistics` needs to see
     * that it was carried by `word` and `parse` before they can say whether it was carried wrongly.
     */
    public String reasoning() {
        return "%s %s %s".formatted(carried(), placed(), selects());
    }

    private String carried() {
        return themes.isEmpty()
                ? "No subject in this repository stood far enough from the rest of it to be reported."
                : "This repository reads as " + themes.stream()
                        .map(theme -> "**%s**, carried by %s".formatted(theme.topic(), theme.carriedBy()))
                        .collect(Collectors.joining("; and ")) + ". Each of those had to be written more "
                        + "densely in some part of this repository than across the whole of it, by more than "
                        + "a scope of its own size draws by chance, and had to be carried by more than one "
                        + "word — a subject resting on a single word is that word's opinion.";
    }

    private String placed() {
        return ("Those subjects, as a distribution, were then compared with the distribution each published "
                + "subject reads as. The nearest is %s at %.4f bits; a taxonomy of chance — real description "
                + "lengths filled with words drawn from the pooled vocabulary of every description — offered "
                + "a nearest of %.4f, so the placement %s.")
                .formatted(field, bits, chanceBar,
                        standsApart ? "stands apart from chance" : "says only that the scheme is large");
    }

    private String selects() {
        return "That field is what selects the vocabulary matched below: %s, because %s.".formatted(taxonomy,
                because);
    }
}
