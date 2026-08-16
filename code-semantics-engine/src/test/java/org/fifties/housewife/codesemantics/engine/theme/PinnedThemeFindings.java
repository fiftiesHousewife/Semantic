package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What the theme reading found when it was pointed at this repository, held in place.
 *
 * <p>These are claims about one named tree and not about Java, so they read the host tree directly rather
 * than the clone {@code -Dcs.clone.dir} names. A figure that is true of this codebase — that it leads
 * `linguistics`, that `law` and `music` left by a vote — says nothing about the next repository, and a
 * reading pointed at somebody else's tree that failed on them would be reporting the evaluation set's job as a defect.
 * {@link ThemeReadingDiagnostic} keeps what must hold wherever it is pointed; this keeps what was measured
 * here.
 */
@Tag("pinned")
class PinnedThemeFindings {

    private static final TopicDistribution ORDINARY_ENGLISH = OrdinaryEnglish.fromClasspath().reading();

    private static final int WITNESSES_HELD = 8;

    @Test
    void readsThisRepositoryAsTheFieldItWorksIn() throws IOException {
        final RepositoryThemes themes = TreeReading.ofTheHostTree().themes();

        assertAll(
                () -> assertThat(leadingTopic(themes))
                        .as("THE GOAL, ASSERTED. A library of lemmas, senses, word frequencies and "
                                + "hypernym chains is working in computational linguistics, and the "
                                + "strongest topic the resources read it as must say so. This led `law` "
                                + "for most of the reading's life and `computing` after that; it leads "
                                + "`linguistics` because a dependency's name stopped being read as English, "
                                + "a resource stopped being normalised to one unit, and a word nothing "
                                + "labelled stopped reading as fully spoken for. Nothing is excluded and no "
                                + "word is listed.")
                        .isEqualTo("linguistics"),
                () -> assertThat(shareOf(themes, "linguistics"))
                        .as("and it must lead by more than a nose, because a lead inside the noise is a "
                                + "coin toss that happened to land right")
                        .isGreaterThan(1.5 * shareOf(themes, "music")),
                () -> assertThat(witnessesFor(themes, "linguistics"))
                        .as("carried by words that are the field's own. Named sparingly and on purpose: "
                                + "this reading reads itself, so a witness whose count depends on how "
                                + "often the reader's own code happens to mention it is a fragile thing "
                                + "to assert — deleting a record called `Verb` once broke this line.")
                        .contains("word", "parse"),
                () -> assertThat(themes.witnesses().restsOnOneWord("linguistics"))
                        .as("and carried by more than one of them, which is the claim that matters")
                        .isFalse(),
                () -> assertThat(qualifiedTopics(themes))
                        .as("THE GOAL. None of `biology`, `law`, `publishing` or `music` is represented in "
                                + "this codebase, and none is named anywhere to keep it out. Each left by a "
                                + "vote: the sense a word is most often written in rather than every sense "
                                + "pooled; the part of speech the parse implies; a reference for what "
                                + "ordinary English is about, read off the bundled frequency list; and a "
                                + "reference for what this repository's own field is about, read off "
                                + "arXiv's descriptions of computer science. The last is the one that "
                                + "settles `law` and `music`, and it settles them for the same reason: "
                                + "computer science carries both more strongly than this repository does, "
                                + "so they are subjects of the field rather than of this codebase.")
                        .doesNotContain("biology", "law", "publishing", "music"),
                () -> assertThat(qualifiedTopics(themes))
                        .as("and what is left must be what this repository is actually about. `grammar` "
                                + "joined the day a run of words a dictionary publishes stopped being read "
                                + "as its words apart: `part of speech` is written 42 times here and was "
                                + "three words pooling their subjects, where the dictionary states one "
                                + "subject for the run. A library whose splitter is grammar and whose "
                                + "bundled taxonomy is linguistic annotation is about grammar, and it took "
                                + "reading a name in the order it was written for the resources to say so.")
                        .containsExactly("linguistics", "computing", "grammar"));
    }

    private static List<String> qualifiedTopics(final RepositoryThemes themes) {
        return new QualifiedTopics(themes.witnesses(), ORDINARY_ENGLISH,
                FieldOfStudy.fromClasspath().nearestTo(themes.repository().comparison())).across(
                themes.divergences().stream().filter(scope -> scope.chance().exceedsChance()).toList(),
                themes.repository().intensity(), themes.repository().comparison());
    }

    private static String leadingTopic(final RepositoryThemes themes) {
        return themes.repository().intensity().shareByTopic().entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();
    }

    private static double shareOf(final RepositoryThemes themes, final String topic) {
        return themes.repository().intensity().shareOf(topic);
    }

    private static List<String> witnessesFor(final RepositoryThemes themes, final String topic) {
        return themes.witnesses().forTopic(topic, WITNESSES_HELD).stream()
                .map(TopicWitnesses.Witness::word)
                .toList();
    }
}
