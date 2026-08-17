package io.github.fiftieshousewife.codesemantics.engine.behaviour;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.parse.JavaSource;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BehavioursTest {

    private final Behaviours behaviours = Behaviours.fromClasspath();

    private List<Behaviour> read(final String source) {
        return behaviours.in(List.of(new ParsedFile("main", "Reading.java", 40,
                JavaSource.newInstance().read(source).occurrences(), true)));
    }

    @Test
    void readsAMethodNameAsTheClauseItsAuthorWrote() {
        assertThat(read("""
                package example;
                class Reading {
                    void resolveNextPage() { }
                }
                """))
                .singleElement()
                .satisfies(behaviour -> assertAll(
                        () -> assertThat(behaviour.verb()).isEqualTo("resolve"),
                        () -> assertThat(behaviour.object()).containsExactly("next", "page"),
                        () -> assertThat(behaviour.sentence()).isEqualTo("resolve next page"),
                        () -> assertThat(behaviour.subject()).isEqualTo("resolveNextPage"),
                        () -> assertThat(behaviour.site()).isEqualTo("Reading.java:3")));
    }

    @Test
    void readsATestNameAsTheSentenceItWasWrittenToBe() {
        assertThat(read("""
                package example;
                class ReadingTest {
                    void refusesALineRangeThatRunsBackwards() { }
                }
                """))
                .singleElement()
                .extracting(Behaviour::sentence)
                .isEqualTo("refuse a line range that runs backwards");
    }

    @Test
    void readsTheVerbsDictionaryFormSoATenseDoesNotSplitABehaviour() {
        assertThat(read("""
                package example;
                class Reading {
                    void reads() { }
                    void reading() { }
                }
                """))
                .extracting(Behaviour::verb)
                .containsOnly("read");
    }

    @Test
    void readsNoBehaviourFromANameWhoseFirstWordIsNotAVerb() {
        assertThat(read("""
                package example;
                class Reading {
                    int lexicalEvidence() { return 0; }
                }
                """))
                .as("a guessed verb would be an assertion, and the dictionary has not made one")
                .isEmpty();
    }

    /**
     * The limit of asking a dictionary rather than a parser which word is the verb, pinned because it is a
     * known over-reading and not a surprise. A getter named for what it returns reads as a clause when the
     * noun it starts with is also a verb somewhere in English — one can mass troops — and no amount of
     * evidence about the word alone can tell that this name is not a clause.
     */
    @Test
    void readsANounThatIsAlsoAVerbAsAVerb() {
        assertThat(read("""
                package example;
                class Reading {
                    int massByTopic() { return 0; }
                }
                """))
                .singleElement()
                .extracting(Behaviour::verb)
                .isEqualTo("mass");
    }

    @Test
    void readsAVerbThatActsOnNothingAsTheBareVerbItIs() {
        assertThat(read("""
                package example;
                class Reading {
                    void read() { }
                }
                """))
                .singleElement()
                .extracting(Behaviour::sentence)
                .isEqualTo("read");
    }

    @Test
    void groupsTheClausesByTheVerbTheyPerformMostPerformedFirst() {
        final Map<String, List<Behaviour>> byVerb = Behaviours.byVerb(read("""
                package example;
                class Reading {
                    void readARepository() { }
                    void readAFile() { }
                    void refuseAName() { }
                }
                """));

        assertAll(
                () -> assertThat(byVerb.keySet()).containsExactly("read", "refuse"),
                () -> assertThat(byVerb.get("read")).extracting(Behaviour::sentence)
                        .containsExactly("read a file", "read a repository"));
    }
}
