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

    public StatedAncestry(final TermIndex index) {
        this.lookUp = label -> label.flatMap(index::broaderOf);
    }

    private StatedAncestry(final java.util.Map<String, String> broaderByLabel) {
        this.lookUp = label -> label.map(broaderByLabel::get)
                .filter(parent -> parent != null && !parent.isBlank())
                .map(StatedAncestry::firstOf);
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
}
