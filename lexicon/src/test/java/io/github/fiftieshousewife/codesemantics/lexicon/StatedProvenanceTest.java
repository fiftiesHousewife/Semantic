package io.github.fiftieshousewife.codesemantics.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatedProvenanceTest {

    @Test
    void readsEveryStatementATaxonomyMakesAboutItself() {
        final StatedProvenance fibo = StatedProvenance.of("fibo-terms.tsv");

        assertAll(
                () -> assertThat(fibo.name()).isEqualTo("Financial Industry Business Ontology"),
                () -> assertThat(fibo.shortName()).isEqualTo("FIBO"),
                () -> assertThat(fibo.publisher()).isEqualTo("the EDM Council"),
                () -> assertThat(fibo.publishedAt()).isEqualTo("https://spec.edmcouncil.org/fibo/"),
                () -> assertThat(fibo.kind()).isEqualTo("terms"),
                () -> assertThat(fibo.subject()).isEqualTo("financial instruments, parties and agreements"),
                () -> assertThat(fibo.description()).startsWith("The Financial Industry Business Ontology:"));
    }

    @Test
    void keepsAValueWholeWhereTheHeaderStatesItAcrossOneLine() {
        assertThat(StatedProvenance.of("fix-terms.tsv").description())
                .isEqualTo("The FIX protocol as FIX Orchestra states it: how the front office talks to the "
                        + "market and the back office settles.");
    }

    @Test
    void refusesAKeyTheResourceStatesNoLineFor() {
        final StatedProvenance functions = StatedProvenance.of("sql-functions.tsv");

        assertAll(
                () -> assertThat(functions.kind()).isEqualTo("identifiers"),
                () -> assertThatThrownBy(functions::subject)
                        .isInstanceOf(IllegalStateException.class)
                        .hasMessageContaining("sql-functions.tsv")
                        .hasMessageContaining("Subject"));
    }

    @Test
    void passesOverTheProseAResourceOpensWith() {
        assertThat(StatedProvenance.of("olia-terms.tsv").name())
                .isEqualTo("Ontologies of Linguistic Annotation");
    }

    @Test
    void readsTheKeysOfAResourceThatIsNotATaxonomy() {
        final StatedProvenance topics = StatedProvenance.of("wiktionary-topics.tsv");

        assertAll(
                () -> assertThat(topics.name()).isEqualTo("Wiktionary topic vocabulary"),
                () -> assertThat(topics.kind()).isEqualTo("words"));
    }
}
