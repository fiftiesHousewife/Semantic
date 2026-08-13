package org.fifties.housewife.codesemantics.symbol;

import java.util.ArrayList;
import java.util.List;

import org.fifties.housewife.codesemantics.concept.ConceptEvidence;
import org.fifties.housewife.codesemantics.repository.SourceAnchor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class SymbolContextTest {

    private static final SourceAnchor ANCHOR = new SourceAnchor("github.com", "junit-team", "junit-framework",
            "0123456789abcdef0123456789abcdef01234567", "src/main/java/HttpHeaderParser.java", 40, 58);

    private static SymbolContext context(final List<String> enclosing) {
        return new SymbolContext(SymbolKind.METHOD, "resolveNextPageCursor", "java", ANCHOR, enclosing,
                List.of("cursor", "response"));
    }

    @Test
    void carriesTheDeclarationAndTheSpanThatEvidencesIt() {
        final SymbolContext context = context(List.of("HttpHeaderParser", "org.example.http"));

        assertAll(
                () -> assertThat(context.kind()).isEqualTo(SymbolKind.METHOD),
                () -> assertThat(context.name()).isEqualTo("resolveNextPageCursor"),
                () -> assertThat(context.anchor().permalink().toString()).endsWith("#L40-L58"));
    }

    @Test
    void listsEnclosingDeclarationsNearestFirstSoAVoteCanDecayWithScopeDistance() {
        assertThat(context(List.of("HttpHeaderParser", "org.example.http")).enclosingNames())
                .containsExactly("HttpHeaderParser", "org.example.http");
    }

    @Test
    void copiesItsListsSoALaterMutationCannotRewriteTheContextAStageWasGiven() {
        final List<String> enclosing = new ArrayList<>(List.of("HttpHeaderParser"));
        final SymbolContext context = context(enclosing);
        enclosing.add("org.example.http");

        assertThat(context.enclosingNames()).hasSize(1);
    }

    @Test
    void requiresTheDeclarationItIsAboutAndTheLinesThatEvidenceIt() {
        assertAll(
                () -> assertThatThrownBy(() -> new SymbolContext(null, "x", "java", ANCHOR, List.of(), List.of()))
                        .isInstanceOf(NullPointerException.class).hasMessage("kind"),
                () -> assertThatThrownBy(() ->
                        new SymbolContext(SymbolKind.LOCAL, "x", "java", null, List.of(), List.of()))
                        .isInstanceOf(NullPointerException.class).hasMessage("anchor"));
    }

    @Test
    void aStageWithNothingToSayAbstainsRatherThanVotingForNothing() {
        final SymbolPipelineStage silent = symbol -> ConceptEvidence.NONE;

        assertThat(silent.evaluate(context(List.of())).concepts()).isEmpty();
    }
}
