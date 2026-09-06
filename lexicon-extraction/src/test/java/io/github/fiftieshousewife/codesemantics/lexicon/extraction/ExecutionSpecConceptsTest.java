package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExecutionSpecConceptsTest {

    private static final String BLOCKS = """
            @dataclass
            class Withdrawal:
                \"\"\"
                Withdrawals represent a transfer of ETH.
                \"\"\"

                validator_index: U64
                \"\"\"
                The index of the validator that is withdrawing.
                \"\"\"
            """;

    private static final String GAS = """
            def calculate_blob_gas_price(excess_blob_gas: U64) -> Uint:
                \"\"\"
                Calculate the blob gas price.
                \"\"\"
            """;

    private static List<SkosConcept> read() {
        return new ExecutionSpecConcepts().in(
                Map.of("blocks.py", BLOCKS, "vm/gas.py", GAS), "bpo2");
    }

    @Test
    void statesTheSpecificationsOwnReferencePathAsTheConcept() {
        assertThat(read()).extracting(SkosConcept::concept)
                .containsExactly(
                        "ethereum.forks.bpo2.blocks.Withdrawal",
                        "ethereum.forks.bpo2.blocks.Withdrawal.validator_index",
                        "ethereum.forks.bpo2.vm.gas.calculate_blob_gas_price");
    }

    @Test
    void aFieldSitsUnderItsClassWithItsOwnProse() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("validator_index"))
                .singleElement()
                .satisfies(concept -> assertAll(
                        () -> assertThat(concept.broader()).isEqualTo("Withdrawal"),
                        () -> assertThat(concept.kind()).isEqualTo("field"),
                        () -> assertThat(concept.module()).isEqualTo("blocks"),
                        () -> assertThat(concept.definition())
                                .isEqualTo("The index of the validator that is withdrawing.")));
    }
}
