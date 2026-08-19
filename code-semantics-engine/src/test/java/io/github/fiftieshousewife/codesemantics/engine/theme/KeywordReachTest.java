package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class KeywordReachTest {

    private static final List<List<String>> NOTHING = List.of();

    private final IdentifierWords identifiers = IdentifierWords.fromClasspath();

    private static SkosConcept keyword(final String label) {
        return new SkosConcept("T1#0", label, "", "T1", "keyword", "domains/3", "", "");
    }

    private KeywordReach reach(final String label, final List<List<String>> declared,
                               final List<List<String>> prose) {
        return KeywordReach.of(keyword(label), identifiers, FurthestWritten.in(declared),
                FurthestWritten.in(prose));
    }

    @Test
    void readsAKeywordTheRepositoryDeclaredAsThisRunOfAdjacentWords() {
        assertThat(reach("Word Sense Disambiguation",
                List.of(List.of("word", "sense", "disambiguation", "reader")), NOTHING).inDeclarations())
                .isEqualTo(FurthestWritten.Reach.AS_THIS_RUN);
    }

    @Test
    void readsEveryWordDeclaredAndNeverNextToTheOthers() {
        assertThat(reach("Source Code Analysis",
                List.of(List.of("source", "reader"), List.of("code", "walk"), List.of("analysis")),
                NOTHING).inDeclarations())
                .isEqualTo(FurthestWritten.Reach.EVERY_WORD_NEVER_ADJACENT);
    }

    @Test
    void namesARunAsWrittenOnlyInProseWhereNoDeclarationCarriesIt() {
        final KeywordReach reached = reach("Knowledge Representation", NOTHING,
                List.of(List.of("knowledge", "representation")));
        assertAll(
                () -> assertThat(reached.inDeclarations()).isEqualTo(FurthestWritten.Reach.NOT_WRITTEN),
                () -> assertThat(reached.inProse()).isEqualTo(FurthestWritten.Reach.AS_THIS_RUN),
                () -> assertThat(reached.writtenOnlyInProse()).isTrue());
    }

    @Test
    void readsARunTheDeclarationsCarryAsReachedWithoutProseBeingAsked() {
        final KeywordReach reached = reach("Term Matching", List.of(List.of("term", "matching")),
                List.of(List.of("term", "matching")));
        assertThat(reached.writtenOnlyInProse()).isFalse();
    }

    @Test
    void carriesTheTopicThePublisherStatedTheKeywordBeneath() {
        assertThat(reach("Text Mining", NOTHING, NOTHING))
                .extracting(KeywordReach::concept, KeywordReach::keyword, KeywordReach::topic)
                .containsExactly("T1#0", "Text Mining", "T1");
    }
}
