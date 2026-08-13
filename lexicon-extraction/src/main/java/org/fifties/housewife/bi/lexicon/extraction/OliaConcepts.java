package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * OLiA's classes as taxonomy concepts: the terms linguistic annotation is stated in, each carrying the
 * class it is stated beneath and the words a reader would say it in.
 *
 * <p>Unlike the two taxonomies bundled before it, this one is meant to be <em>matched</em>. Its terms are
 * already identifiers — {@code AdjectivePhrase}, {@code Determiner}, {@code Acronym} — so a program writing
 * about grammar writes them, and the match is identifier to identifier with no English in between. That is
 * the {@code sql-functions.tsv} case a third time.
 *
 * <p>{@code broader} is dropped where the file states a superclass it does not itself state. A dangling
 * parent is a reference into an ontology this file imports and does not carry, and a taxonomy naming a
 * concept it cannot produce is worse than one that stops: the roll-up would climb to a name nothing can
 * answer for.
 *
 * <p>{@code module} is the ontology document the class's own identifier names — OLiA publishes its top
 * level, its core and its system vocabulary as separate ontologies, and the namespace says which is which.
 */
public class OliaConcepts {

    private static final String CLASS = "class";

    private static final String FRAGMENT = "#";

    private static final String NOTHING = "";

    public List<SkosConcept> in(final List<OwlClass> classes) {
        final Set<String> stated = classes.stream().map(OwlClass::id).collect(Collectors.toUnmodifiableSet());
        return classes.stream().map(owl -> concept(owl, stated)).toList();
    }

    private static SkosConcept concept(final OwlClass owl, final Set<String> stated) {
        return new SkosConcept(owl.concept(), owl.id(), altLabel(owl),
                stated.contains(owl.broader()) ? owl.broader() : NOTHING, CLASS, moduleOf(owl),
                NOTHING);
    }

    /** The label the ontology writes for a reader, where it says something the identifier does not. */
    private static String altLabel(final OwlClass owl) {
        return owl.label().equalsIgnoreCase(owl.id()) ? NOTHING : owl.label();
    }

    private static String moduleOf(final OwlClass owl) {
        final int fragment = owl.concept().indexOf(FRAGMENT);
        if (fragment < 0) {
            return NOTHING;
        }
        final String ontology = owl.concept().substring(0, fragment);
        return ontology.substring(ontology.lastIndexOf('/') + 1);
    }
}
