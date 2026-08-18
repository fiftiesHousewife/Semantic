package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BianSpecificationTest {

    private static BianSpecification of(final String text) {
        return BianSpecification.of(text.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void readsQuotedAndUnquotedCellsUnderTheirKeys() {
        final BianSpecification specification = of("""
                "Service Domain specification for ACH Fulfillment"
                "Business Area"\tOperations
                "Role Definition"\t"Handles the ""operational"" interface."
                """);

        assertAll(
                () -> assertThat(specification.stated("Business Area")).isEqualTo("Operations"),
                () -> assertThat(specification.stated("Role Definition"))
                        .isEqualTo("Handles the \"operational\" interface."));
    }

    @Test
    void readsPastAByteOrderMarkAndKeepsAKeysLastValue() {
        final BianSpecification specification = of("﻿\"Key\"\tfirst\n\"Key\"\tsecond\n");

        assertThat(specification.stated("Key")).isEqualTo("second");
    }

    @Test
    void aKeyNeverStatedReadsAsEmptyAndAStatedValueIsTrimmed() {
        final BianSpecification specification = of("\"Example of use\"\t\"  a payment.  \"\n");

        assertAll(
                () -> assertThat(specification.stated("Example of use")).isEqualTo("a payment."),
                () -> assertThat(specification.stated("Role Definition")).isEmpty());
    }

    @Test
    void aQuotedCellCarriesTheTabAndLineBreakItWasWrittenWith() {
        final BianSpecification specification = of("\"Key\"\t\"one\ttab\nand a line\"\n");

        assertThat(specification.stated("Key")).isEqualTo("one\ttab\nand a line");
    }

    @Test
    void aStrayQuoteClosesTheQuotedPartAndTheRestOfTheCellIsCarriedLiterally() {
        final BianSpecification specification =
                of("\"Key\"\t\"A customer \"fraudulent use' data that is available\"\n\"Next\"\tRow\n");

        assertAll(
                () -> assertThat(specification.stated("Key"))
                        .isEqualTo("A customer fraudulent use' data that is available\""),
                () -> assertThat(specification.stated("Next")).isEqualTo("Row"));
    }
}
