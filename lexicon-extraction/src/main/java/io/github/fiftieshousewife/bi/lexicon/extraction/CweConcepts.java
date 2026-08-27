package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The weaknesses of a CWE catalog, one concept each: the weakness's own name is the term, its
 * {@code ChildOf} relation in the research view — view 1000, CWE's one hierarchical statement of what is a
 * kind of what — is {@code broader} under the parent's own name, its abstraction level is the kind, its
 * description the definition, and the publisher's alternate terms pool into {@code altLabel}. A name
 * ending in a quoted parenthetical — {@code ('Cross-site Scripting')} — states the common name inside it,
 * and that name joins the alternate terms.
 *
 * <p>Categories and views are not read, and said outright: a category is a grouping a view draws for
 * navigation, not a weakness, and a view is a way of looking at the same 900-odd weaknesses.
 */
public final class CweConcepts {

    private static final String CWE = "http://cwe.mitre.org/cwe-7";
    private static final String PERMALINK = "https://cwe.mitre.org/data/definitions/%s.html";
    private static final String RESEARCH_VIEW = "1000";
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");
    private static final Pattern COMMON_NAME = Pattern.compile(".*\\('(.+)'\\)$");

    public List<SkosConcept> in(final byte[] catalog) {
        final Document parsed = RdfXml.parsed(catalog);
        final List<Element> weaknesses = RdfXml.elements(parsed.getElementsByTagNameNS(CWE, "Weakness"))
                .toList();
        final Map<String, String> namesById = new HashMap<>();
        weaknesses.forEach(weakness -> namesById.put(weakness.getAttribute("ID"),
                weakness.getAttribute("Name")));
        return weaknesses.stream()
                .map(weakness -> conceptOf(weakness, namesById))
                .toList();
    }

    private static SkosConcept conceptOf(final Element weakness, final Map<String, String> namesById) {
        final String id = weakness.getAttribute("ID");
        return new SkosConcept(PERMALINK.formatted(id), weakness.getAttribute("Name"),
                alternateTermsOf(weakness), broaderOf(weakness, namesById),
                weakness.getAttribute("Abstraction"), "", descriptionOf(weakness), "");
    }

    /** The research view's {@code ChildOf} parents, each under its own name, joined in the stated order. */
    private static String broaderOf(final Element weakness, final Map<String, String> namesById) {
        return RdfXml.elements(weakness.getElementsByTagNameNS(CWE, "Related_Weakness"))
                .filter(related -> "ChildOf".equals(related.getAttribute("Nature")))
                .filter(related -> RESEARCH_VIEW.equals(related.getAttribute("View_ID")))
                .map(related -> related.getAttribute("CWE_ID"))
                .map(parent -> namesById.getOrDefault(parent, ""))
                .filter(name -> !name.isBlank())
                .distinct()
                .collect(Collectors.joining(SkosConcept.STATEMENTS));
    }

    private static String alternateTermsOf(final Element weakness) {
        final Matcher common = COMMON_NAME.matcher(weakness.getAttribute("Name"));
        return Stream.concat(
                        common.matches() ? Stream.of(common.group(1)) : Stream.empty(),
                        RdfXml.elements(weakness.getElementsByTagNameNS(CWE, "Term"))
                                .map(Element::getTextContent))
                .map(String::strip)
                .filter(term -> !term.isBlank())
                .distinct()
                .collect(Collectors.joining(SkosConcept.STATEMENTS));
    }

    /** The weakness's own description, first stated, with its line breaks collapsed. */
    private static String descriptionOf(final Element weakness) {
        return RdfXml.elements(weakness.getElementsByTagNameNS(CWE, "Description"))
                .findFirst()
                .map(Element::getTextContent)
                .map(text -> WHITESPACE.matcher(text.strip()).replaceAll(" "))
                .orElse("");
    }
}
