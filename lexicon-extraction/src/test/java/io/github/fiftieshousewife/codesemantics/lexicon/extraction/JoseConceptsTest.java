package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class JoseConceptsTest {

    private static final String HEADER_PARAMETERS = """
            Header Parameter Name,Header Parameter Description,Header Parameter Usage Location(s),Change Controller,Reference
            alg,Algorithm,JWS,[IESG],"[RFC7515, Section 4.1.1]"
            alg,Algorithm,JWE,[IESG],"[RFC7516, Section 4.1.1]"
            x5c,X.509 Certificate Chain,JWS,[IESG],"[RFC7515, Section 4.1.6]"
            url,URL,"JWE, JWS",[IESG],"[RFC8555, Section 6.4.1]"
            """;

    private static final String ALGORITHMS = """
            Algorithm Name,Algorithm Description,Algorithm Usage Location(s),JOSE Implementation Requirements,Change Controller,Reference,Algorithm Analysis Document(s)
            ECDH-ES+A128KW,"ECDH-ES using Concat KDF and ""A128KW"" wrapping",alg,Recommended,[IESG],"[RFC7518, Section 4.6]",n/a
            """;

    private static List<SkosConcept> headerParameters() {
        return new JoseConcepts().in("web-signature-encryption-header-parameters", "header-parameter",
                HEADER_PARAMETERS);
    }

    @Test
    void scopesTheRegisteredValueByItsRegistryAndCarriesItByteForByte() {
        assertThat(headerParameters())
                .filteredOn(concept -> concept.prefLabel().equals("x5c"))
                .extracting(SkosConcept::concept)
                .containsExactly("web-signature-encryption-header-parameters/x5c");
    }

    @Test
    void mergesRepeatedRegistrationsOfOneValueIntoOneRowWhoseStatementsJoin() {
        assertThat(headerParameters())
                .filteredOn(concept -> concept.prefLabel().equals("alg"))
                .extracting(SkosConcept::altLabel, SkosConcept::note)
                .containsExactly(tuple("Algorithm",
                        "[RFC7515, Section 4.1.1]" + SkosConcept.STATEMENTS + "[RFC7516, Section 4.1.1]"));
    }

    @Test
    void readsAQuotedFieldWithCommasAndDoubledQuotesInside() {
        assertThat(new JoseConcepts().in("web-signature-encryption-algorithms", "algorithm", ALGORITHMS))
                .extracting(SkosConcept::altLabel)
                .containsExactly("ECDH-ES using Concat KDF and \"A128KW\" wrapping");
    }

    @Test
    void filesEveryRowUnderItsRegistryWithTheKindItRegisters() {
        assertAll(
                () -> assertThat(headerParameters()).extracting(SkosConcept::broader)
                        .containsOnly("web-signature-encryption-header-parameters"),
                () -> assertThat(headerParameters()).extracting(SkosConcept::module)
                        .containsOnly("web-signature-encryption-header-parameters"),
                () -> assertThat(headerParameters()).extracting(SkosConcept::kind)
                        .containsOnly("header-parameter"),
                () -> assertThat(headerParameters()).extracting(SkosConcept::definition)
                        .containsOnly(""));
    }

    @Test
    void refusesACsvStatingNoReferenceColumn() {
        assertThatThrownBy(() -> new JoseConcepts().in("web-key-use", "key-use", "Value,Description\n"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("web-key-use")
                .hasMessageContaining("Reference");
    }
}
