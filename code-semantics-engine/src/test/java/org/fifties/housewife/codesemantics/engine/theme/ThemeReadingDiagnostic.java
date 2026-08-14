package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.CloneUnderReading;
import org.fifties.housewife.codesemantics.engine.reading.DocumentationScope;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads what this repository is about, scope by scope, and writes both the report a person reads and the
 * graph a viewer draws.
 *
 * <p>The draw is seeded on a fixed number so two runs of one tree agree: a permutation null that moved
 * between runs would make every excess unfalsifiable.
 */
@Tag("diagnostic")
class ThemeReadingDiagnostic {

    private static final ReportFolder REPORTS = new ReportFolder();
    private static final String REPORT = "themes";
    private static final String GRAPH = "themes.json";
    private static final String PAGE = "themes-chart.html";

    private static final TopicDistribution ORDINARY_ENGLISH =
            OrdinaryEnglish.fromClasspath().reading();

    private static final long SEED = 20260813L;
    private static final int TOPICS_GRAPHED = 18;
    private static final int WITNESSES_HELD = 8;

    private static final String PREAMBLE = """
            What this repository's names are about, read through the two bundled resources that assign a word
            to a subject: WordNet Domains, which labels each of a word's senses, and Wiktionary's topic
            vocabulary, which labels the headword. Each word occurrence commits one unit of mass per resource,
            divided among the readings that resource names, so an ambiguous word does not shout.

            A label another label of the same word already implies is not one of those readings. The topic
            vocabulary publishes a closure over its own hierarchy — a word labelled `computing` arrives
            carrying `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences`
            besides — and the hierarchy that derived them, published by the same extractor, is what folds
            them back into the label they came from. Nothing is excluded and no list is written: where the
            hierarchy is silent, every label the word carries stands.

            **Read the ranking below as the weak reading it is.** A topic's intensity over one scope counts
            every occurrence of every word, and the commonest words in Java source are also the most
            ambiguous ones — `string`, `set`, `map`, `assert`, `of`. Their senses spray mass across subjects
            that have nothing to do with this codebase, which is why the witnesses are printed beside every
            row: a topic carried by one word is one word's opinion, and the table says so.

            The reading worth acting on is the comparison underneath it. A topic written at much the same
            density everywhere contributes almost nothing to a divergence, so the ambiguity that dominates a
            count cancels in a comparison — and each scope's divergence is judged against the field of
            divergences a scope of its own size draws by chance, so a small scope cannot look interesting
            merely by being small.
            """;

    @Test
    void readsThisRepositorysThemesAndWritesTheReportAndTheGraph() throws IOException {
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final RepositoryThemes themes = ThemeReading.fromClasspath(SEED).of(parsed);

        write(themes, root);

        assertAll(
                () -> assertThat(themes.rankings()).as("a repository of names reads as some subject").isNotEmpty(),
                () -> assertThat(themes.repository().intensity().shareByTopic().values().stream()
                        .mapToDouble(Double::doubleValue).sum())
                        .as("an intensity is a distribution and sums to one")
                        .isCloseTo(1.0, offset(1e-9)),
                () -> assertThat(themes.divergences()).allSatisfy(divergence ->
                        assertThat(divergence.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(Files.readString(REPORTS.file(REPORT + ".md"))).contains("What distinguishes each scope"),
                () -> assertThat(Files.readString(REPORTS.file(GRAPH))).contains("\"nodes\""),
                () -> assertThat(Files.readString(REPORTS.file(PAGE)))
                        .as("the page draws the same reading the report states")
                        .contains("What this repository is about"),
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
                        .as("THE GOAL, HALF MET AND HELD THERE. `biology` and `music` were read out of this "
                                + "repository by the vote and must stay out: `taxonomy` and `ancestry` are "
                                + "a tree of concepts, `topic` and `phrase` are the units of this reading, "
                                + "and no word of either was named to exclude them. What did it was reading "
                                + "the sense a word is most often written in, letting the parse say which "
                                + "part of speech that is, and asking whether the repository writes a "
                                + "subject more than ordinary English does.")
                        .doesNotContain("biology", "music"),
                () -> assertThat(qualifiedTopics(themes))
                        .as("A DEFECT, PINNED, AND ITS CAUSE MEASURED. `law` and `publishing` survive ten "
                                + "cycles of the same treatment, and they survive honestly: this repository "
                                + "writes `witness`, `cite`, `read`, `publish` and `page` far more than "
                                + "ordinary English does, and the resources are not wrong that those words "
                                + "denote those subjects. Removing them needs a resource that states what "
                                + "the words mean *here* — a domain vocabulary of computing, which the "
                                + "backlog already names and does not yet have. Anything else would be a "
                                + "list of subjects to suppress, which the doctrine forbids and which would "
                                + "not survive the next repository. When such a resource lands this "
                                + "assertion must fail and be deleted.")
                        .contains("law", "publishing"));
    }

    private static List<String> qualifiedTopics(final RepositoryThemes themes) {
        return new QualifiedTopics(themes.witnesses(), ORDINARY_ENGLISH).across(
                themes.divergences().stream().filter(scope -> scope.chance().exceedsChance()).toList(),
                themes.repository().intensity());
    }

    private static String leadingTopic(final RepositoryThemes themes) {
        return themes.repository().intensity().shareByTopic().entrySet().stream()
                .max(java.util.Map.Entry.comparingByValue())
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

    private void write(final RepositoryThemes themes, final Path root) throws IOException {
                REPORTS.wrote(REPORT, "# Themes — %s%n%n%s%n%s".formatted(root.getFileName(), PREAMBLE,
                new ThemeReport().render(themes)), "Themes");
        final ThemeGraph graph = ThemeGraph.of(root.getFileName().toString(), themes, TOPICS_GRAPHED,
                WITNESSES_HELD, new SourceLinks(root));
        new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(REPORTS.file(GRAPH).toFile(), graph);
        Files.writeString(REPORTS.file(PAGE), new ThemePage().of(graph));
    }
}
