package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class VocabularyPageTest {

    @Test
    void carriesTheDataTheStylesheetAndTheBehaviourIntoOnePage() {
        final String markup = new VocabularyPage("{\"repository\":{}}", ".sheet { margin: 0; }",
                "console.log('drawn');").markup();

        assertAll(
                () -> assertThat(markup).contains("id=\"vocabulary\">{\"repository\":{}}</script>"),
                () -> assertThat(markup).contains(".sheet { margin: 0; }"),
                () -> assertThat(markup).contains("console.log('drawn');"));
    }

    @Test
    void carriesNoDocumentWrapperSoWhateverRendersItSuppliesOne() {
        final String markup = new VocabularyPage("{}", "", "").markup();

        assertAll(
                () -> assertThat(markup).startsWith("<body>"),
                () -> assertThat(markup).doesNotContain("<html"),
                () -> assertThat(markup).doesNotContain("<!DOCTYPE"));
    }
}
