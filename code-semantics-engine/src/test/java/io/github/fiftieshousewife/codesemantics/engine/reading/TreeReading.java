package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.ThemeReading;

/**
 * The parse and the topical reading of one working tree, computed once per JVM and shared.
 *
 * <p>Sound only because the reading is deterministic over an unchanged tree. The memo is keyed on the
 * resolved root, so each member of an evaluation-set run gets its own entry, and where
 * {@code -Dcs.clone.dir} is unset the host tree and the clone resolve to one path and one reading.
 *
 * <p>The seed lives here rather than in each caller, so there is one copy to keep in step.
 */
public final class TreeReading {

    /** The seed the null is drawn with, so two runs of one tree agree rather than placing it differently. */
    public static final long SEED = RepositoryReading.SEED;

    /**
     * One {@link RepositoryReading} per tree, shared across the diagnostics of a run.
     *
     * <p>The published class deliberately memoises nothing across a JVM, because a library should not decide
     * how long a caller's reading lives. A run of diagnostics does want exactly that, and holding it here is
     * what keeps the decision out of the API.
     */
    private static final Map<Path, RepositoryReading> READINGS = new ConcurrentHashMap<>();

    /** The bundled term vocabulary's reading of each tree, shared for the same reason as the reading. */
    private static final Map<Path, CorroboratedReading> TERMS = new ConcurrentHashMap<>();

    /** Each tree's arXiv placement at the shared seed, with both chance draws inside it. */
    private static final Map<Path, PlacedField> FIELDS = new ConcurrentHashMap<>();

    private final Path root;

    private TreeReading(final Path root) {
        this.root = root;
    }

    /** The published reading of this tree, for a diagnostic that wants to call the API a consumer calls. */
    public RepositoryReading reading() {
        return READINGS.computeIfAbsent(root, RepositoryReading::of);
    }

    /** The tree {@code -Dcs.clone.dir} names, or the one the test is running inside where it does not. */
    public static TreeReading ofTheCloneUnderReading() {
        return new TreeReading(new CloneUnderReading().root());
    }

    /**
     * The tree the test is running inside, whatever {@code -Dcs.clone.dir} says. A claim about one named
     * repository has to be checked against that repository and not against whichever clone was passed in.
     */
    public static TreeReading ofTheHostTree() {
        return new TreeReading(new HostTree().root());
    }

    public Path root() {
        return root;
    }

    /** Every Java source set and the markdown beside it, filtered by whatever {@code .readingignore} states. */
    public static List<SourceScope> scopesUnder(final Path root) {
        return RepositoryReading.scopesUnder(root);
    }

    public ParsedRepository parsed() {
        return reading().parsed();
    }

    public RepositoryLegibility legibility() {
        return reading().legibility();
    }

    /** The bundled term vocabulary read over this tree, computed once per JVM like the reading itself. */
    public CorroboratedReading terms() {
        return TERMS.computeIfAbsent(root, tree -> CorroboratedReading.of(LinguisticTerms.fromClasspath(),
                OliaTerms.fromClasspath().concepts(), parsed()));
    }

    /** Where this tree stands among arXiv's subjects at the shared seed, computed once per JVM. */
    public PlacedField arxivField() {
        return FIELDS.computeIfAbsent(root,
                tree -> PlacedField.ofArxiv(themes().repository().comparison(), SEED));
    }

    public RepositoryThemes themes() {
        return reading().themes();
    }
}
