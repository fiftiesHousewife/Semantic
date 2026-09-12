package io.github.fiftieshousewife.codesemantics.engine.parse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AuthoredLinesTest {

    private static final String TEMPLATE =
            "Thanks for your contribution!\n\nBefore opening the pull request, please verify that\n"
                    + "* commits are squashed into a single one";

    @Test
    void keepsEveryLineTheTemplateDoesNotState() {
        final String statement = "TIKA-4889: Inference engines\n\nThanks for your contribution!\n\n"
                + "* commits are squashed into a single one\n\nAdds an embedding engine.";

        assertThat(AuthoredLines.of(statement, TEMPLATE))
                .isEqualTo("TIKA-4889: Inference engines\n\n\n\nAdds an embedding engine.");
    }

    @Test
    void keepsALineTheAuthorEdited() {
        assertThat(AuthoredLines.of("Before opening the pull request, I verified that", TEMPLATE))
                .isEqualTo("Before opening the pull request, I verified that");
    }

    @Test
    void dropsATemplateLineTheCopyIndentedDifferently() {
        assertThat(AuthoredLines.of("  Thanks for your contribution!", TEMPLATE)).isEmpty();
    }

    @Test
    void leavesAStatementAloneWhereTheTemplateIsEmpty() {
        assertThat(AuthoredLines.of("TIKA-4889: Inference engines", ""))
                .isEqualTo("TIKA-4889: Inference engines");
    }
}
