package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Where the taxonomy itself puts a term: the chain of concepts it states above one, broadest first.
 *
 * <p>This is the coordinate a picture of matched terms is drawn on, and it is a citation rather than a
 * grouping. The source published the parent; nothing here decided that {@code Contrast} belongs under
 * discourse relations and {@code Verb} does not. It is also the first thing in this library that can tell one
 * match from another without a word of English: two terms of the same length and the same frequency sit in
 * different branches because their publisher put them there.
 *
 * <p><b>A chain that ends immediately is the common case and is not a failure.</b> OLiA states no named parent
 * for {@code Noun}, {@code Verb}, {@code Phrase} or {@code CommonNoun} — their superclasses are anonymous
 * restrictions, or belong to an ontology it imports rather than carries — so those terms stand at their own
 * root. Inventing a parent for them would be this library stating a taxonomy the publisher did not.
 */
public final class StatedAncestry {

    private static final String FIRST_STATED = " | ";

    private final java.util.function.UnaryOperator<Optional<String>> lookUp;

    private final java.util.function.Supplier<List<String>> labels;

    private Set<String> fieldLevels;

    public StatedAncestry(final TermIndex index) {
        this.lookUp = label -> label.flatMap(index::broaderOf);
        this.labels = () -> index.publishedConcepts().stream()
                .map(io.github.fiftieshousewife.bi.lexicon.SkosConcept::prefLabel).toList();
    }

    private StatedAncestry(final java.util.Map<String, String> broaderByLabel) {
        this.lookUp = label -> label.map(broaderByLabel::get)
                .filter(parent -> parent != null && !parent.isBlank())
                .map(StatedAncestry::firstOf);
        this.labels = () -> List.copyOf(broaderByLabel.keySet());
    }

    /**
     * The same walk over a list of concepts rather than over an index, for a caller that holds the
     * publisher's rows. A concept stated beneath several is walked through the first, because a chain is
     * one path and the publisher's own order decides which.
     */
    public static StatedAncestry over(final java.util.List<io.github.fiftieshousewife.bi.lexicon.SkosConcept> published) {
        return new StatedAncestry(published.stream().collect(java.util.stream.Collectors.toMap(
                io.github.fiftieshousewife.bi.lexicon.SkosConcept::prefLabel,
                io.github.fiftieshousewife.bi.lexicon.SkosConcept::broader, (first, later) -> first)));
    }

    private static String firstOf(final String stated) {
        return stated.contains(FIRST_STATED)
                ? stated.substring(0, stated.indexOf(FIRST_STATED)).strip() : stated.strip();
    }

    /** The concept and everything the source states above it, broadest first. */
    public List<String> of(final String prefLabel) {
        final List<String> climbed = new ArrayList<>(List.of(prefLabel));
        final Set<String> seen = new HashSet<>(climbed);
        Optional<String> above = lookUp.apply(Optional.of(prefLabel));
        while (above.isPresent() && seen.add(above.get())) {
            climbed.add(above.get());
            above = lookUp.apply(above);
        }
        return List.copyOf(climbed.reversed());
    }

    /** The broadest concept the source states above this one, which is the term itself where it states none. */
    public String rootOf(final String prefLabel) {
        return of(prefLabel).getFirst();
    }

    /**
     * The broadest concept <em>above</em> this one that still tells a reader something, or nothing where no
     * such concept exists.
     *
     * <p>A publisher's own name for its whole field is an ancestor of nearly everything it states, so
     * naming it says only which vocabulary matched — which the reading already said. CSO puts 80% of its
     * 11,438 topics under {@code computer science} and FIX 68% of its 7,170 rows under {@code Common},
     * where FIBO's largest root holds 24% and FpML's 14%. The walk therefore steps past an ancestor an
     * outright majority of the vocabulary sits beneath and stops at the first that is not one.
     *
     * <p><b>The bound is a majority because that is where one level outweighs everything outside it</b>,
     * which is the rule {@code PublishedPaths.fieldLevels} already states for the same reason.
     *
     * <p><b>The concept itself is never the answer.</b> A publisher that states nothing above a concept has
     * placed it nowhere, and answering with the concept reads as a placement the publisher did not make:
     * FpML declares 616 of its 1,405 types with no base type, so a third of its matches named themselves.
     * {@link #rootOf} answers with the concept, because a walk that must return a coordinate has to.
     */
    public Optional<String> topOfTheBranchOf(final String prefLabel) {
        return pathAbove(prefLabel).stream().findFirst();
    }

    /**
     * Every concept the publisher states above this one, broadest first, with the levels naming the
     * scheme's own field stepped over. Empty where the publisher states nothing above it.
     *
     * <p>This is the whole of what {@link #topOfTheBranchOf} returns the first of, and the two ends of it
     * are what a reading used to carry instead. The ends coincide wherever a publisher states one ancestor
     * — FIX places 5,434 of its 7,170 rows directly under {@code Common}, and FpML declares 616 of its
     * 1,405 types with no base type at all — and they hide the middle wherever it states several: FIBO
     * puts {@code PresentValue} under {@code QuantitativeValue} under {@code Value} under {@code Aspect},
     * and the two ends drop {@code Value}.
     */
    public List<String> pathAbove(final String prefLabel) {
        return of(prefLabel).stream()
                .filter(above -> !above.equals(prefLabel))
                .filter(above -> !fieldLevels().contains(above))
                .toList();
    }

    /**
     * The levels an outright majority of the vocabulary's own concepts sit beneath. Computed once and kept,
     * because a bundled vocabulary cannot change under a running program.
     */
    Set<String> fieldLevels() {
        if (fieldLevels == null) {
            final List<String> published = labels.get();
            final java.util.Map<String, Integer> beneath = new java.util.HashMap<>();
            published.forEach(label -> of(label).stream()
                    .filter(above -> !above.equals(label))
                    .forEach(above -> beneath.merge(above, 1, Integer::sum)));
            fieldLevels = beneath.entrySet().stream()
                    .filter(level -> 2 * level.getValue() > published.size())
                    .map(java.util.Map.Entry::getKey)
                    .collect(java.util.stream.Collectors.toUnmodifiableSet());
        }
        return fieldLevels;
    }
}
