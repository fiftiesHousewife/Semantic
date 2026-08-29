package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * FIBO's classes as taxonomy concepts: the terms the financial industry states its business in, each
 * carrying what its publisher says it means, what else it is called, and which scheme it was adapted from.
 *
 * <p>Like OLiA this vocabulary is meant to be <em>matched</em>, and unlike OLiA most of it is not one word.
 * 89% of its labels are phrases — {@code interest rate swap}, {@code asset backed security} — which is the
 * whole reason it is here: a single-word term is what an out-of-domain repository hits by accident, and a
 * phrase is what it does not. Both keys are carried, because the fragment is what a trading system's
 * identifiers are built from and the label is what its prose is written in.
 *
 * <p>Where each column comes from, so what is not carried is a visible line rather than an oversight:
 *
 * <table>
 *   <caption>FIBO's vocabulary, mapped to the shape every bundled taxonomy is normalised to</caption>
 *   <tr><th>Column</th><th>FIBO states it in</th></tr>
 *   <tr><td>{@code prefLabel}</td><td>the class's own URI fragment, an identifier already</td></tr>
 *   <tr><td>{@code altLabel}</td><td>{@code rdfs:label}, {@code cmns-av:synonym}, {@code cmns-av:abbreviation}
 *       — each a published statement of what else the concept is called, never a synonym borrowed from a
 *       dictionary that knows nothing about finance</td></tr>
 *   <tr><td>{@code definition}</td><td>{@code skos:definition}</td></tr>
 *   <tr><td>{@code note}</td><td>{@code cmns-av:adaptedFrom} — the standard or statute the definition was
 *       taken from — then {@code cmns-av:explanatoryNote}, {@code skos:note} and {@code skos:example}</td></tr>
 *   <tr><td>{@code broader}</td><td>the first superclass stated by name, whichever ontology publishes it</td></tr>
 *   <tr><td>{@code module}</td><td>the FIBO domain the concept's own URI names — {@code FBC}, {@code SEC},
 *       {@code DER} — which is the roll-up level the publisher itself uses</td></tr>
 * </table>
 *
 * <p><b>A superclass this file set does not itself carry is still the superclass FIBO states.</b> FIBO
 * roots a great deal of itself in the OMG Commons Ontology Library, which its production manifest imports
 * from a different namespace and {@code FiboManifest} therefore does not read: at the pinned revision, 229
 * of 1,833 classes are placed beneath a Commons concept — {@code MerchantIdentifier} beneath
 * {@code Identifier}, {@code Publication} beneath {@code Document}, {@code Branch} beneath
 * {@code OrganizationalSubUnit}. Writing those as unplaced said the publisher states no parent, which is
 * false for all but 46 of them, and it is what put a concept with no branch into a reading's answer.
 * Naming the parent is not the same as climbing to it: {@code TaxonomyTree.isRoot} already stands a
 * concept at its own root where the file carries none of its stated parents, so a roll-up still stops
 * where the file stops and only the name it stops beneath is now the publisher's.
 *
 * <p>What is <b>not</b> carried is {@code owl:disjointWith}, {@code owl:equivalentClass} and
 * {@code rdfs:seeAlso}. Those state a relation between two concepts rather than something about one, and
 * this shape has one row per concept with no column that could hold them without inventing a meaning for it.
 * That is a limit of the shape and the provenance header says so outright.
 */
public class FiboConcepts {

    private static final String CLASS = "class";

    private static final String RDFS = "http://www.w3.org/2000/01/rdf-schema#";
    private static final String SKOS = "http://www.w3.org/2004/02/skos/core#";
    private static final String COMMONS = "https://www.omg.org/spec/Commons/AnnotationVocabulary/";

    private static final List<String> CALLED = List.of(RDFS + "label", COMMONS + "synonym",
            COMMONS + "abbreviation");

    private static final String DEFINITION = SKOS + "definition";

    private static final List<String> NOTED = List.of(COMMONS + "adaptedFrom", COMMONS + "explanatoryNote",
            SKOS + "note", SKOS + "example");

    private static final String ONTOLOGY = "/fibo/ontology/";

    private static final String NOTHING = "";

    private final JoinedStatements statements = new JoinedStatements();

    public List<SkosConcept> in(final List<OwlClass> classes) {
        return classes.stream().map(this::concept).toList();
    }

    private SkosConcept concept(final OwlClass owl) {
        return new SkosConcept(owl.concept(), owl.id(), calledAlso(owl), owl.broader(), CLASS,
                moduleOf(owl), statements.of(owl.statedIn(DEFINITION)),
                statements.of(owl.statedInAny(NOTED)));
    }

    /**
     * Everything else the publisher says the concept is called. A label saying only what the identifier
     * already says is not another name for it, so it is dropped — the same rule OLiA's conversion applies,
     * and it is why {@code merchant} against {@code Merchant} adds nothing while {@code CDS} against
     * {@code CreditDefaultSwap} adds a great deal.
     */
    private String calledAlso(final OwlClass owl) {
        return statements.of(owl.statedInAny(CALLED).stream()
                .filter(name -> !name.strip().replace(" ", "").equalsIgnoreCase(owl.id()))
                .toList());
    }

    /**
     * The FIBO domain the concept's URI names. A concept URI reads
     * {@code https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/Bond}, and the segment after
     * the ontology root is the module the publisher files it under.
     */
    private static String moduleOf(final OwlClass owl) {
        final int root = owl.concept().indexOf(ONTOLOGY);
        if (root < 0) {
            return NOTHING;
        }
        final String path = owl.concept().substring(root + ONTOLOGY.length());
        final int next = path.indexOf('/');
        return next < 0 ? NOTHING : path.substring(0, next);
    }
}
