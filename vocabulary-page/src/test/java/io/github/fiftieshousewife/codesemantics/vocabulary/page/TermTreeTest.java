package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermTreeTest {

    private static final List<SkosConcept> STATED_AS_CONCEPTS = List.of(
            concept("Agreement", "", ""),
            concept("Contract", "Agreement", ""),
            concept("InterestRateSwap", "Contract", "DER"),
            concept("Loan", "Contract", "FBC"),
            concept("SecuredLoan", "Loan", "FBC"),
            concept("Occurrence", "", ""));

    private static final List<SkosConcept> STATED_AS_NAMES = List.of(
            concept("ACH Fulfillment", "Clearing And Settlement", "Operations"),
            concept("Order Allocation", "Clearing And Settlement", "Operations"),
            concept("Term Deposit", "Loans and Deposits", "Products"));

    private static SkosConcept concept(final String label, final String broader, final String module) {
        return new SkosConcept("urn:" + label, label, "", broader, "class", module, "", "");
    }

    private static ReadingFolder.TermMatchRow row(final String vocabulary, final String term,
                                                  final int words, final int occurrences,
                                                  final String concept) {
        return new ReadingFolder.TermMatchRow(vocabulary, term, words, "WORDS", occurrences, "REPORTED",
                List.of(concept));
    }

    @Test
    void drawsNoConceptBeneathItselfWhereThePublisherNamesItsOwnLabelAsItsParent() {
        final TermTree tree = TermTree.of("FIX",
                List.of(row("FIX", "msg seq num", 3, 7, "MsgSeqNum")),
                List.of(concept("Session", "", ""),
                        concept("Session", "Session", ""),
                        concept("MsgSeqNum", "Session", "")));

        assertAll(
                () -> assertThat(tree.roots()).extracting(TermTree.Node::label)
                        .containsExactly("Session"),
                () -> assertThat(tree.roots().getFirst().children())
                        .extracting(TermTree.Node::label)
                        .containsExactly("MsgSeqNum"));
    }

    @Test
    void nestsAPhraseMatchUnderThePublishersOwnBroaderChain() {
        final TermTree tree = TermTree.of("FIBO",
                List.of(row("FIBO", "interest rate swap", 3, 5, "InterestRateSwap")),
                STATED_AS_CONCEPTS);

        assertAll(
                () -> assertThat(tree.roots()).extracting(TermTree.Node::label)
                        .containsExactly("Agreement"),
                () -> assertThat(tree.roots().getFirst().children()).extracting(TermTree.Node::label)
                        .containsExactly("Contract"),
                () -> assertThat(matchedChildrenOf(tree.roots().getFirst().children().getFirst()))
                        .extracting(TermTree.Node::label, TermTree.Node::occurrences)
                        .containsExactly(tuple("InterestRateSwap", 5)));
    }

    @Test
    void greysAConceptThePublisherStatesBesideAMatchAndTheRepositoryNeverWrote() {
        final TermTree tree = TermTree.of("FIBO",
                List.of(row("FIBO", "interest rate swap", 3, 5, "InterestRateSwap")),
                STATED_AS_CONCEPTS);

        final TermTree.Node contract = tree.roots().getFirst().children().getFirst();

        assertThat(contract.children())
                .filteredOn(node -> node.standing() == TermTree.Standing.UNMATCHED)
                .extracting(TermTree.Node::label)
                .containsExactly("Loan");
    }

    @Test
    void countsTheUnmatchedTopLevelConceptsWithoutListingThem() {
        final TermTree tree = TermTree.of("FIBO",
                List.of(row("FIBO", "interest rate swap", 3, 5, "InterestRateSwap")),
                STATED_AS_CONCEPTS);

        assertThat(tree.unmatchedRoots())
                .as("Occurrence has no match below it and stays a count rather than a listing")
                .isEqualTo(1);
    }

    @Test
    void statesHowManyConceptsThePublisherHoldsBelowAGreyedOne() {
        final TermTree tree = TermTree.of("FIBO",
                List.of(row("FIBO", "interest rate swap", 3, 5, "InterestRateSwap")),
                STATED_AS_CONCEPTS);

        final TermTree.Node contract = tree.roots().getFirst().children().getFirst();

        assertThat(contract.children())
                .filteredOn(node -> node.standing() == TermTree.Standing.UNMATCHED)
                .extracting(TermTree.Node::label, TermTree.Node::conceptsBelow)
                .containsExactly(tuple("Loan", 1));
    }

    @Test
    void listsAtMostTheStatedNumberOfGreyedChildrenAndCountsTheRest() {
        final List<SkosConcept> wide = Stream.concat(
                        Stream.of(concept("Root", "", ""), concept("Written", "Root", "")),
                        IntStream.range(0, 10).mapToObj(i -> concept("Silent" + i, "Root", "")))
                .toList();

        final TermTree tree = TermTree.of("FIBO",
                List.of(row("FIBO", "written thing", 2, 1, "Written")), wide);

        final TermTree.Node root = tree.roots().getFirst();

        assertAll(
                () -> assertThat(root.children())
                        .filteredOn(node -> node.standing() == TermTree.Standing.UNMATCHED)
                        .hasSize(TermTree.UNMATCHED_LISTED),
                () -> assertThat(root.unlistedUnmatched()).isEqualTo(10 - TermTree.UNMATCHED_LISTED));
    }

    @Test
    void countsASingleWordMatchWithoutDrawingIt() {
        final TermTree tree = TermTree.of("FIBO",
                List.of(row("FIBO", "interest rate swap", 3, 5, "InterestRateSwap"),
                        row("FIBO", "value", 1, 40, "Occurrence")),
                STATED_AS_CONCEPTS);

        assertAll(
                () -> assertThat(tree.singleWordTerms()).isEqualTo(1),
                () -> assertThat(tree.singleWordOccurrences()).isEqualTo(40));
    }

    @Test
    void drawsALevelThePublisherStatesAsANameRatherThanAConcept() {
        final TermTree tree = TermTree.of("BIAN",
                List.of(row("BIAN", "term deposit", 2, 7, "Term Deposit")),
                STATED_AS_NAMES);

        assertAll(
                () -> assertThat(tree.roots()).extracting(TermTree.Node::label)
                        .containsExactly("Products"),
                () -> assertThat(tree.roots().getFirst().children())
                        .extracting(TermTree.Node::label)
                        .containsExactly("Loans and Deposits"),
                () -> assertThat(matchedChildrenOf(tree.roots().getFirst().children().getFirst()))
                        .extracting(TermTree.Node::label, TermTree.Node::occurrences)
                        .containsExactly(tuple("Term Deposit", 7)));
    }

    @Test
    void ordersMatchedSiblingsByTheOccurrencesAtOrBelowEach() {
        final TermTree tree = TermTree.of("BIAN",
                List.of(row("BIAN", "term deposit", 2, 7, "Term Deposit"),
                        row("BIAN", "ach fulfillment", 2, 30, "ACH Fulfillment")),
                STATED_AS_NAMES);

        assertThat(tree.roots()).extracting(TermTree.Node::label)
                .containsExactly("Operations", "Products");
    }

    @Test
    void leavesTheTreeEmptyWhereNoPhraseMatched() {
        final TermTree tree = TermTree.of("FIBO",
                List.of(row("FIBO", "value", 1, 40, "Occurrence")),
                STATED_AS_CONCEPTS);

        assertAll(
                () -> assertThat(tree.roots()).isEmpty(),
                () -> assertThat(tree.singleWordTerms()).isEqualTo(1));
    }

    private static List<TermTree.Node> matchedChildrenOf(final TermTree.Node node) {
        return node.children().stream()
                .filter(child -> child.standing() == TermTree.Standing.MATCHED)
                .toList();
    }
}
