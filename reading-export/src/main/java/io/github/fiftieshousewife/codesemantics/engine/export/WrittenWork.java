package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.Declaration;
import io.github.fiftieshousewife.codesemantics.engine.parse.DeclarationDiff;
import io.github.fiftieshousewife.codesemantics.engine.parse.DeclarationKind;
import io.github.fiftieshousewife.codesemantics.engine.parse.DeclaredMembers;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.parse.RepeatedBodies;
import io.github.fiftieshousewife.codesemantics.engine.parse.TreeMetrics;
import io.github.fiftieshousewife.codesemantics.engine.reading.ChangedFileScopes;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceKind;
import io.github.fiftieshousewife.codesemantics.engine.reading.StatedExclusions;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;

/**
 * Classifies what a pull request writes: the declarations of its changed files at its head commit read
 * against the same files at its base commit, both directories pinned by the fetch step.
 *
 * <p>This is the parse's answer and not a standard's. A declaration added is a fact of the text, the way a
 * {@code fix:} prefix is the Conventional Commits specification's word; what no bundled standard states is
 * the name for a change that adds nine methods and removes one, so no such class is named here.
 */
public final class WrittenWork {

    private final DeclaredMembers members = DeclaredMembers.newInstance();

    private final ChangedTests tests = new ChangedTests();

    /** The head tree read against the base tree the fetch step wrote beside it. */
    ChangedCode between(final Path base, final Path head) {
        final List<SourceScope> scopes = new ChangedFileScopes().under(head);
        final DeclarationDiff diff = DeclarationDiff.between(
                members.under(base, new ChangedFileScopes().under(base)),
                members.under(head, scopes));
        final List<Path> read = filesIn(scopes);
        return new ChangedCode(read.size(), (int) read.stream()
                .filter(file -> !Files.exists(base.resolve(head.relativize(file))))
                .count(),
                counted(diff.addedByKind()), counted(diff.removedByKind()), diff.kept(),
                types(diff.added()), types(diff.removed()), byKind(head, scopes, read),
                measured(head, scopes), measured(base, new ChangedFileScopes().under(base)),
                tests.typesWithoutOne(head, diff.added(), scopes),
                tests.methodsAdded(head, scopes, diff.added()), repeated(head, scopes));
    }

    /**
     * How many of the files read are of each kind the build's own layout states. A file two scopes both
     * reach is counted once, under the first that reaches it, so the counts sum to the files read.
     */
    private static List<ChangedCode.KindFiles> byKind(final Path head, final List<SourceScope> scopes,
                                                       final List<Path> read) {
        final Map<Path, String> kindOf = new LinkedHashMap<>();
        scopes.forEach(scope -> scope.files().forEach(file ->
                kindOf.putIfAbsent(file, SourceKind.of(scope.name()).published())));
        final Map<String, Integer> counts = new LinkedHashMap<>();
        kindOf.values().forEach(kind -> counts.merge(kind, 1, Integer::sum));
        final int other = unread(head, read);
        if (other > 0) {
            counts.put(SourceKind.OTHER.published(), other);
        }
        return counts.entrySet().stream()
                .map(entry -> new ChangedCode.KindFiles(entry.getKey(), entry.getValue()))
                .toList();
    }

    /**
     * The method bodies the changed files write more than once, read over all of them together so a body
     * copied from one file into another is found as readily as one copied within a file.
     */
    private static ChangedCode.Repeated repeated(final Path root, final List<SourceScope> scopes) {
        final RepeatedBodies.Repeated written = RepeatedBodies.newInstance().under(root, scopes);
        return new ChangedCode.Repeated(written.statements(), written.largest(),
                written.methods().stream()
                .map(method -> new ChangedCode.NamedDeclaration(method.path(), method.written()))
                .toList());
    }

    /** The same measurement over a whole working tree, which is what a pull request is read against. */
    public static MeasuredCode ofTheWholeTree(final Path root) {
        return measured(root, RepositoryReading.scopesUnder(root));
    }

    private static MeasuredCode measured(final Path root, final List<SourceScope> scopes) {
        return new MeasuredCode(commentLinesIn(root, scopes), metricsIn(root, scopes));
    }

    /** The size and complexity of what one end declares, measured as the published definitions state. */
    private static MeasuredCode.Metrics metricsIn(final Path root, final List<SourceScope> scopes) {
        final TreeMetrics.Measured measured = TreeMetrics.newInstance().under(root, scopes);
        return new MeasuredCode.Metrics(measured.types(), measured.methods(), measured.statements(),
                measured.largestType(), spread(measured.methodStatements()),
                spread(measured.complexity()), spread(measured.nesting()),
                spread(measured.parameters()));
    }

    private static MeasuredCode.Spread spread(final TreeMetrics.Spread measured) {
        return new MeasuredCode.Spread(measured.median(), measured.upperQuartile(), measured.highest());
    }

    /**
     * The lines one tree's authors wrote as prose, each counted at what the parse says one occurrence of
     * it is worth. Prose standing in every file was written once and copied into the rest, so a licence
     * header sixteen lines long counts sixteen lines over the whole tree rather than sixteen per file —
     * the weight {@code CopiedComments} derives from the tree in hand, and without it the figure would
     * mostly count a legal instrument nobody here wrote.
     */
    private static int commentLinesIn(final Path root, final List<SourceScope> scopes) {
        return (int) Math.round(ParsedRepository.of(root, scopes).files().stream()
                .flatMap(file -> file.occurrences().stream())
                .filter(occurrence -> occurrence.form().isProse())
                .mapToDouble(occurrence -> occurrence.weight() * occurrence.text().lines().count())
                .sum());
    }

    /**
     * How many of the pull request's own files no scope reaches — a changelog, a licence — which are
     * counted under {@code other} so the kinds account for every file it changed. The tree's own
     * {@code .readingignore} travels with every copy that has one and states what the reading must leave
     * out, so it is not a file the pull request changed and is counted under no kind at all.
     */
    private static int unread(final Path head, final List<Path> read) {
        try (Stream<Path> everything = Files.walk(head)) {
            return (int) everything
                    .filter(Files::isRegularFile)
                    .filter(file -> !StatedExclusions.FILE.equals(file.getFileName().toString()))
                    .filter(file -> !read.contains(file))
                    .count();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + head, e);
        }
    }

    private static List<Path> filesIn(final List<SourceScope> scopes) {
        return scopes.stream()
                .flatMap(scope -> scope.files().stream())
                .distinct()
                .sorted()
                .toList();
    }

    private static ChangedCode.Declarations counted(final Map<DeclarationKind, Integer> byKind) {
        return new ChangedCode.Declarations(byKind.get(DeclarationKind.TYPE),
                byKind.get(DeclarationKind.METHOD), byKind.get(DeclarationKind.FIELD));
    }

    private static List<ChangedCode.NamedDeclaration> types(final List<Declaration> declarations) {
        return declarations.stream()
                .filter(declaration -> declaration.kind() == DeclarationKind.TYPE)
                .map(declaration -> new ChangedCode.NamedDeclaration(declaration.path(),
                        declaration.written()))
                .toList();
    }
}
