package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class MediaTypeConceptsTest {

    private final MediaTypeConcepts concepts = new MediaTypeConcepts();

    @Test
    void carriesTheRegisteredTemplateByteForByte() {
        final List<SkosConcept> read = concepts.in("application",
                "Name,Template,Reference\npdf,application/pdf,[RFC8118]");
        assertThat(read).singleElement().satisfies(type -> assertAll(
                () -> assertThat(type.concept()).isEqualTo("application/pdf"),
                () -> assertThat(type.prefLabel()).isEqualTo("application/pdf"),
                () -> assertThat(type.broader()).isEqualTo("application"),
                () -> assertThat(type.kind()).isEqualTo("media-type"),
                () -> assertThat(type.definition()).isEmpty(),
                () -> assertThat(type.note()).isEqualTo("[RFC8118]")));
    }

    @Test
    void keepsTheRegistrysOwnDeprecationStatementInTheNote() {
        assertThat(concepts.in("text",
                "Name,Template,Reference\ndirectory - DEPRECATED by RFC6350,text/directory,[RFC2425]"))
                .singleElement()
                .satisfies(type -> assertAll(
                        () -> assertThat(type.concept()).isEqualTo("text/directory"),
                        () -> assertThat(type.note())
                                .isEqualTo("directory - DEPRECATED by RFC6350 | [RFC2425]")));
    }

    @Test
    void readsAQuotedReferenceWithTheCommasItHolds() {
        assertThat(concepts.in("application",
                "Name,Template,Reference\ncmw+cbor,application/cmw+cbor,\"[RFC9999, Sections 3.1, 3.2]\""))
                .singleElement()
                .satisfies(type -> assertThat(type.note()).isEqualTo("[RFC9999, Sections 3.1, 3.2]"));
    }

    @Test
    void refusesARowThatIsNotThreeFields() {
        assertThatThrownBy(() -> concepts.in("application", "Name,Template,Reference\nonly-two,fields"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Not a three-field registry row");
    }
}
