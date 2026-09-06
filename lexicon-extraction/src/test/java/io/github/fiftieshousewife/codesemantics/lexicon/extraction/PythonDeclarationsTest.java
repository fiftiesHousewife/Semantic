package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class PythonDeclarationsTest {

    private static final String MODULE = """
            \"\"\"
            Module prose the reader does not capture.
            \"\"\"

            from dataclasses import dataclass

            ELASTICITY_MULTIPLIER = Uint(2)
            \"\"\"
            The amount the block gas limit may grow by.

            A second paragraph the definition cuts before.
            \"\"\"


            @dataclass
            class Header:
                \"\"\"
                Header of a block in the chain.
                \"\"\"

                base_fee_per_gas: Uint
                \"\"\"
                The fee per unit of gas burned, set by the protocol.
                \"\"\"

                _private_marker: Uint

                def restated(self) -> Uint:
                    \"\"\"A method the reader does not capture.\"\"\"
                    total: Uint = Uint(0)
                    return total


            class Ops(enum.Enum):
                \"\"\"Enum for EVM Opcodes.\"\"\"

                ADD = 0x01


            def validate_header(
                chain: BlockChain,
                header: Header,
            ) -> None:
                \"\"\"
                Verify a block header against its parent.
                \"\"\"
                parent: Header = chain.blocks[-1].header
            """;

    private static List<PythonDeclarations.Declaration> read() {
        return new PythonDeclarations().in(MODULE.lines().toList());
    }

    @Test
    void readsEachKindOfDeclarationWithItsOwner() {
        assertThat(read())
                .extracting(PythonDeclarations.Declaration::name,
                        PythonDeclarations.Declaration::kind,
                        PythonDeclarations.Declaration::owner)
                .containsExactly(
                        tuple("ELASTICITY_MULTIPLIER", "constant", ""),
                        tuple("Header", "class", ""),
                        tuple("base_fee_per_gas", "field", "Header"),
                        tuple("Ops", "class", ""),
                        tuple("ADD", "constant", "Ops"),
                        tuple("validate_header", "function", ""));
    }

    @Test
    void cutsADefinitionAtItsFirstBlankLine() {
        assertThat(read())
                .filteredOn(declared -> declared.name().equals("ELASTICITY_MULTIPLIER"))
                .extracting(PythonDeclarations.Declaration::docstring)
                .containsExactly("The amount the block gas limit may grow by.");
    }

    @Test
    void readsTheDocstringPastAMultiLineSignature() {
        assertThat(read())
                .filteredOn(declared -> declared.name().equals("validate_header"))
                .extracting(PythonDeclarations.Declaration::docstring)
                .containsExactly("Verify a block header against its parent.");
    }

    @Test
    void readsASingleLineDocstring() {
        assertAll(
                () -> assertThat(read()).filteredOn(declared -> declared.name().equals("Ops"))
                        .extracting(PythonDeclarations.Declaration::docstring)
                        .containsExactly("Enum for EVM Opcodes."),
                () -> assertThat(read()).extracting(PythonDeclarations.Declaration::name)
                        .doesNotContain("_private_marker", "restated", "total", "parent"));
    }
}
