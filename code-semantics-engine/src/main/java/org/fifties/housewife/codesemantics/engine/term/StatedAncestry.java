package org.fifties.housewife.codesemantics.engine.term;

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

    private final TermIndex index;

    public StatedAncestry(final TermIndex index) {
        this.index = index;
    }

    /** The concept and everything the source states above it, broadest first. */
    public List<String> of(final String prefLabel) {
        final List<String> climbed = new ArrayList<>(List.of(prefLabel));
        final Set<String> seen = new HashSet<>(climbed);
        Optional<String> above = index.broaderOf(prefLabel);
        while (above.isPresent() && seen.add(above.get())) {
            climbed.add(above.get());
            above = index.broaderOf(above.get());
        }
        return List.copyOf(climbed.reversed());
    }

    /** The broadest concept the source states above this one, which is the term itself where it states none. */
    public String rootOf(final String prefLabel) {
        return of(prefLabel).getFirst();
    }
}
