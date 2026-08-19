package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.theme.ProbabilityOfSuperiority.Expectation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StatedDomainTokenTest {

    private static SkosConcept stating(final String definition) {
        return new SkosConcept("T1", "A Topic", "", "", "topic", "", definition, "");
    }

    @Test
    void marksASubjectStatingTheToken() {
        assertThat(new StatedDomainToken("content").of(stating("papers about content extraction")))
                .isEqualTo(Expectation.MEETS_IT);
    }

    @Test
    void marksASubjectStatingTheTokenWhateverItsCase() {
        assertThat(new StatedDomainToken("security").of(stating("Security of XML signatures")))
                .isEqualTo(Expectation.MEETS_IT);
    }

    @Test
    void leavesASubjectMerelySharingAStemWithTheTokenUnmarked() {
        assertThat(new StatedDomainToken("content").of(stating("a contentious finding about contentment")))
                .isEqualTo(Expectation.DOES_NOT);
    }

    @Test
    void marksASubjectStatingEveryWordOfAHyphenatedToken() {
        assertThat(new StatedDomainToken("build-management")
                .of(stating("management of the software build pipeline")))
                .isEqualTo(Expectation.MEETS_IT);
    }

    @Test
    void leavesASubjectStatingOnlyOneWordOfAHyphenatedTokenUnmarked() {
        assertThat(new StatedDomainToken("build-management")
                .of(stating("management of chronic disease")))
                .isEqualTo(Expectation.DOES_NOT);
    }

    @Test
    void readsTheKeywordsAsReadilyAsTheProseBecauseBothAreTheSubjectsOwnAccount() {
        assertThat(new StatedDomainToken("security").of(stating("prose about signatures | Security, Keys")))
                .isEqualTo(Expectation.MEETS_IT);
    }

    @Test
    void refusesATokenOfNoWords() {
        assertThatThrownBy(() -> new StatedDomainToken("---"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("no words");
    }
}
