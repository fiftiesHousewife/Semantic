package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The file formats of a DROID signature file, one concept each: the format's own name is the term, its
 * PUID — PRONOM's persistent unique identifier — is the concept as the permalink the registry states for
 * it, and the extensions and media types the registry states pool into {@code altLabel}. The stated
 * version goes to {@code note}, because PRONOM publishes one record per version of a format and the name
 * alone does not say which.
 *
 * <p>The registry states no hierarchy and no prose in this file, so {@code broader} and
 * {@code definition} are blank on every row — a blank that is the publisher's statement, not a gap.
 */
public final class PronomFormats {

    private static final String SIGNATURE_FILE = "http://www.nationalarchives.gov.uk/pronom/SignatureFile";
    private static final String PERMALINK = "https://www.nationalarchives.gov.uk/PRONOM/%s";

    public List<SkosConcept> in(final byte[] signatureFile) {
        final Document parsed = RdfXml.parsed(signatureFile);
        return RdfXml.elements(parsed.getElementsByTagNameNS(SIGNATURE_FILE, "FileFormat"))
                .map(PronomFormats::conceptOf)
                .toList();
    }

    private static SkosConcept conceptOf(final Element format) {
        return new SkosConcept(PERMALINK.formatted(format.getAttribute("PUID")),
                format.getAttribute("Name").strip(),
                extensionsAndMediaTypesOf(format), "", "format", "", "",
                versionOf(format));
    }

    /** The stated extensions, then the stated media types — a MIMEType attribute may hold several. */
    private static String extensionsAndMediaTypesOf(final Element format) {
        return Stream.concat(
                        RdfXml.elements(format.getElementsByTagNameNS(SIGNATURE_FILE, "Extension"))
                                .map(Element::getTextContent),
                        Stream.of(format.getAttribute("MIMEType").split(",", -1)))
                .map(String::strip)
                .filter(name -> !name.isBlank())
                .distinct()
                .collect(Collectors.joining(SkosConcept.STATEMENTS));
    }

    private static String versionOf(final Element format) {
        final String version = format.getAttribute("Version").strip();
        return version.isBlank() ? "" : "version " + version;
    }
}
