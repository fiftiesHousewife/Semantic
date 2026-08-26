package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class ControlTreeTest {

    private static final List<SkosConcept> STATED_AS_CONCEPTS = List.of(
            concept("Agreement", "", ""),
            concept("Contract", "Agreement", ""),
            concept("InterestRateSwap", "Contract", "DER"),
            concept("Occurrence", "", ""));

    private static final List<SkosConcept> STATED_AS_NAMES = List.of(
            concept("ACH Fulfillment", "Clearing And Settlement", "Operations"),
            concept("Term Deposit", "Loans and Deposits", "Products"));

    private static SkosConcept concept(final String label, final String broader, final String module) {
        return new SkosConcept("urn:" + label, label, "", broader, "class", module, "", "");
    }

    private static ReadingFolder.TermMatchRow row(final String vocabulary, final String term,
                                                  final int words, final int occurrences,
                                                  final String concept) {
        return new ReadingFolder.TermMatchRow(vocabulary, term, words, occurrences, "REPORTED",
                List.of(concept));
    }

    @Test
    void nestsAPhraseMatchUnderThePublishersOwnBroaderChain() {
        final ControlTree tree = ControlTree.of("FIBO",
                List.of(row("FIBO", "interest rate swap", 3, 5, "InterestRateSwap")),
                STATED_AS_CONCEPTS);

        assertAll(
                () -> assertThat(tree.roots()).extracting(ControlTree.Node::label)
                        .containsExactly("Agreement"),
                () -> assertThat(tree.roots().getFirst().children()).extracting(ControlTree.Node::label)
                        .containsExactly("Contract"),
                () -> assertThat(tree.roots().getFirst().children().getFirst().children())
                        .extracting(ControlTree.Node::label, ControlTree.Node::occurrences)
                        .containsExactly(tuple("InterestRateSwap", 5)));
    }

    @Test
    void countsASingleWordMatchWithoutDrawingIt() {
        final ControlTree tree = ControlTree.of("FIBO",
                List.of(row("FIBO", "interest rate swap", 3, 5, "InterestRateSwap"),
                        row("FIBO", "value", 1, 40, "Occurrence")),
                STATED_AS_CONCEPTS);

        assertAll(
                () -> assertThat(tree.singleWordTerms()).isEqualTo(1),
                () -> assertThat(tree.singleWordOccurrences()).isEqualTo(40),
                () -> assertThat(flattened(tree.roots())).doesNotContain("Occurrence"));
    }

    @Test
    void drawsALevelThePublisherStatesAsANameRatherThanAConcept() {
        final ControlTree tree = ControlTree.of("BIAN",
                List.of(row("BIAN", "term deposit", 2, 7, "Term Deposit")),
                STATED_AS_NAMES);

        assertAll(
                () -> assertThat(tree.roots()).extracting(ControlTree.Node::label)
                        .containsExactly("Products"),
                () -> assertThat(tree.roots().getFirst().children())
                        .extracting(ControlTree.Node::label)
                        .containsExactly("Loans and Deposits"),
                () -> assertThat(tree.roots().getFirst().children().getFirst().children())
                        .extracting(ControlTree.Node::label, ControlTree.Node::occurrences)
                        .containsExactly(tuple("Term Deposit", 7)));
    }

    @Test
    void ordersSiblingsByTheOccurrencesAtOrBelowEach() {
        final ControlTree tree = ControlTree.of("BIAN",
                List.of(row("BIAN", "term deposit", 2, 7, "Term Deposit"),
                        row("BIAN", "ach fulfillment", 2, 30, "ACH Fulfillment")),
                STATED_AS_NAMES);

        assertThat(tree.roots()).extracting(ControlTree.Node::label)
                .containsExactly("Operations", "Products");
    }

    @Test
    void leavesTheTreeEmptyWhereNoPhraseMatched() {
        final ControlTree tree = ControlTree.of("FIBO",
                List.of(row("FIBO", "value", 1, 40, "Occurrence")),
                STATED_AS_CONCEPTS);

        assertAll(
                () -> assertThat(tree.roots()).isEmpty(),
                () -> assertThat(tree.singleWordTerms()).isEqualTo(1));
    }

    private static List<String> flattened(final List<ControlTree.Node> nodes) {
        return nodes.stream()
                .flatMap(node -> Stream.concat(
                        Stream.of(node.label()),
                        flattened(node.children()).stream()))
                .toList();
    }
}
