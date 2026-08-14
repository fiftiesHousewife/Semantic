package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * Renders FIBO's classes as the TSV the lexicon bundles: a provenance header naming the revision the
 * ontologies were read at, the manifest that decided which ones those were, and the terms they are published
 * on, then the concepts in the shape every taxonomy here is normalised to.
 */
public class FiboTermsTsv {

    private final SkosTsv rows = new SkosTsv();

    public String render(final List<SkosConcept> concepts, final String source, final int ontologies,
                         final String setDigest) {
        return header(concepts.size(), source, ontologies, setDigest) + rows.render(concepts);
    }

    private static String header(final int count, final String source, final int ontologies,
                                 final String setDigest) {
        return """
                # The Financial Industry Business Ontology, as the terms a program working in finance
                # actually writes. Like olia-terms.tsv this vocabulary is meant to be matched, and unlike it
                # most of these terms are phrases: 89% of FIBO's labels are more than one word — interest
                # rate swap, asset backed security, credit default swap. That is why it is bundled. A
                # one-word term is what a repository outside the domain hits by accident, and a phrase is
                # what it does not, so a vocabulary of phrases is the arm that can show a domain reading
                # firing where its publisher's field is and staying silent everywhere else.
                #
                # Columns:\s""" + SkosTsv.COLUMNS + """
                .
                # prefLabel is the class's own URI fragment, which is already an identifier a trading system
                # writes. altLabel pools rdfs:label, cmns-av:synonym and cmns-av:abbreviation — each one a
                # published statement of what else the concept is called, never a synonym borrowed from a
                # dictionary that knows nothing about finance — and drops a label that says only what the
                # identifier already says. definition is skos:definition. note pools cmns-av:adaptedFrom,
                # which names the standard or statute a definition was taken from, then
                # cmns-av:explanatoryNote, skos:note and skos:example. Where a property is stated more than
                # once the statements are joined with " | " in the order the publisher wrote them.
                #
                # NOT CARRIED, and said outright rather than left to be noticed: owl:disjointWith,
                # owl:equivalentClass and rdfs:seeAlso. Each states a relation between two concepts rather
                # than something about one, and a shape with one row per concept has no column that could
                # hold them without inventing a meaning for it. broader is the one relation this shape does
                # carry, and it is dropped where the superclass belongs to an ontology this file does not
                # itself carry — a roll-up must not climb to a concept nothing here can answer for.
                #
                # Which ontologies: FIBO publishes no merged document, so something has to decide what the
                # vocabulary is. FIBO decides. AboutFIBOProd-TBoxOnly.rdf exists, in its own words, to load
                # "the latest FIBO production ontologies, excluding reference data and examples", and names
                # each by owl:imports. Named and read at this revision:\s""" + ontologies + """
                .
                # Walking a directory instead would make this project's own selection the corpus.
                #
                # Source: the FIBO repository at\s""" + source + """
                .
                #   The manifest is pinned by the blob id that revision holds. The ontologies it names are
                #   pinned together by a SHA-256 over each one's own git blob id, recorded at extraction:
                #  \s""" + setDigest + """
                .
                #   That digest is OURS and not the publisher's — FIBO states no checksum over the set — so
                #   it says the members have not moved since this file was written, not that the publisher
                #   vouches for them. The revision above is the publisher's own content address and does.
                # Licence: MIT, stated by the manifest itself in dct:license and by the repository's own
                #   LICENSE file. Copyright (c) 2018-2026 EDM Association dba EDM Council, Inc. and
                #   Copyright (c) 2018-2025 Object Management Group, Inc. Permission is granted free of
                #   charge to any person obtaining a copy to deal in the software without restriction,
                #   including the rights to use, copy, modify, merge, publish, distribute, sublicense and
                #   sell copies, subject to the copyright notice and this permission notice being included.
                #   The software is provided as is, without warranty of any kind.
                # Generated by FiboTermsExtraction:\s""" + count + " concepts.\n";
    }
}
