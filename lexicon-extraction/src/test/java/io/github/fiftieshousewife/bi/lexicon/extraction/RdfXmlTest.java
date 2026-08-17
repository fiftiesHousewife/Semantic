package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.w3c.dom.Document;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RdfXmlTest {

    @Test
    void parsesADocumentWithNamespacesRead() {
        final Document parsed = RdfXml.parsed(
                "<a:root xmlns:a=\"urn:a\"><a:child/>text<a:child/></a:root>"
                        .getBytes(StandardCharsets.UTF_8));

        assertThat(parsed.getDocumentElement().getNamespaceURI()).isEqualTo("urn:a");
    }

    @Test
    void streamsTheElementNodesAndNotTheTextBetweenThem() {
        final Document parsed = RdfXml.parsed(
                "<a:root xmlns:a=\"urn:a\"><a:child/>text<a:child/></a:root>"
                        .getBytes(StandardCharsets.UTF_8));

        assertThat(RdfXml.elements(parsed.getDocumentElement().getChildNodes())).hasSize(2);
    }

    @Test
    void refusesADocumentThatIsNotXml() {
        assertThatThrownBy(() -> RdfXml.parsed("not xml".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
