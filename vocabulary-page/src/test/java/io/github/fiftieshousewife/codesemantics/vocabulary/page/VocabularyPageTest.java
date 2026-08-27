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
    void statesItsOwnDocumentShellAndCharset() {
        final String markup = new VocabularyPage("{}", "", "").markup();

        assertAll(
                () -> assertThat(markup).startsWith("<!DOCTYPE html>"),
                () -> assertThat(markup).contains("<meta charset=\"utf-8\">"),
                () -> assertThat(markup).endsWith("</html>"));
    }
}
