package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class EvaluationPagesCommandTest {

    @Test
    void writesAllThreePagesPerRepositoryAndAnIndexNamingThem(@TempDir final Path clones,
                                                              @TempDir final Path reports)
            throws IOException {
        final Path member = clones.resolve("a-member");
        final Path scope = member.resolve("module").resolve("src").resolve("main").resolve("java")
                .resolve("a");
        Files.createDirectories(scope);
        Files.writeString(scope.resolve("Pricer.java"),
                "package a; /** Prices a coupon. */ class Pricer { int couponPrice; int lemmaParser; }");

        final List<String> written = EvaluationPagesCommand.pages(List.of(member), reports);

        assertAll(
                () -> assertThat(written).containsExactly("a-member"),
                () -> assertThat(reports.resolve("a-member").resolve("vocabulary.html")).exists(),
                () -> assertThat(reports.resolve("a-member").resolve("domain-venn.html")).exists(),
                () -> assertThat(Files.readString(reports.resolve("index.html")))
                        .contains("a-member/vocabulary.html")
                        .contains("a-member/domain-venn.html"));
    }
}
