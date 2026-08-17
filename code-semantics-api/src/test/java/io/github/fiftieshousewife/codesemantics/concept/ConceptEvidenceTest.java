package io.github.fiftieshousewife.codesemantics.concept;

import java.util.ArrayList;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import io.github.fiftieshousewife.codesemantics.repository.SourceAnchor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class ConceptEvidenceTest {

    private static final SourceAnchor ANCHOR = new SourceAnchor("github.com", "junit-team", "junit-framework",
            "0123456789abcdef0123456789abcdef01234567", "src/main/java/Example.java", 12, 12);

    private static final ConceptId PAGE = new ConceptId(6_501_311L, "n");
    private static final ConceptId CURSOR = new ConceptId(3_193_107L, "n");

    private static ConceptVote vote(final ConceptId concept, final double weight) {
        return new ConceptVote(concept, weight, EvidenceSource.WORDNET_SENSE, ANCHOR);
    }

    @Test
    void abstentionCarriesNoVotesAndNoCitations() {
        assertAll(
                () -> assertThat(ConceptEvidence.NONE.concepts()).isEmpty(),
                () -> assertThat(ConceptEvidence.NONE.citations()).isEmpty());
    }

    @Test
    void mergeConcatenatesVotesAndCitationsOfEveryPart() {
        final ConceptEvidence first = new ConceptEvidence(List.of(vote(PAGE, 1.0)),
                List.of(new Citation("page", EvidenceSource.WORDNET_SENSE, "page%1:10:00::", "a sheet",
                        1.0, ANCHOR)));
        final ConceptEvidence second = new ConceptEvidence(List.of(vote(CURSOR, 0.5)), List.of());

        final ConceptEvidence merged = ConceptEvidence.merge(List.of(first, second, ConceptEvidence.NONE));

        assertAll(
                () -> assertThat(merged.concepts()).extracting(ConceptVote::value).containsExactly(PAGE, CURSOR),
                () -> assertThat(merged.citations()).extracting(Citation::surface).containsExactly("page"));
    }

    @Test
    void copiesItsListsSoALaterMutationCannotRewriteRecordedEvidence() {
        final List<ConceptVote> votes = new ArrayList<>(List.of(vote(PAGE, 1.0)));
        final ConceptEvidence evidence = new ConceptEvidence(votes, List.of());
        votes.add(vote(CURSOR, 1.0));

        assertThat(evidence.concepts()).hasSize(1);
    }

    @Test
    void anUnattributedVoteCannotBeConstructed() {
        assertAll(
                () -> assertThatThrownBy(() ->
                        new ConceptVote(PAGE, 1.0, EvidenceSource.WORDNET_SENSE, null))
                        .isInstanceOf(NullPointerException.class).hasMessage("anchor"),
                () -> assertThatThrownBy(() ->
                        new Citation("page", EvidenceSource.WORDNET_SENSE, "page%1:10:00::", "a sheet", 1.0, null))
                        .isInstanceOf(NullPointerException.class).hasMessage("anchor"));
    }

    @Test
    void aConceptNamesItsSynsetOffsetAndPartOfSpeech() {
        assertThat(PAGE).hasToString("6501311-n");
    }
}
