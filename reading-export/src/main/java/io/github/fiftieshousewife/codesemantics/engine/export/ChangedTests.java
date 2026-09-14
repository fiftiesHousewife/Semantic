package io.github.fiftieshousewife.codesemantics.engine.export;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.parse.Declaration;
import io.github.fiftieshousewife.codesemantics.engine.parse.DeclarationKind;
import io.github.fiftieshousewife.codesemantics.engine.parse.DeclaredTests;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceKind;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;
import io.github.fiftieshousewife.codesemantics.engine.reading.SurefireTestNames;

/**
 * What a change does about tests: the test methods it adds, and the types it adds to what the build
 * publishes with no test of their own.
 *
 * <p>Both are read from the head tree beside the declarations the diff states, and neither runs anything.
 * A type a test already standing exercises is named here all the same, and a test method added is a test
 * that arrived rather than coverage of anything named.
 */
final class ChangedTests {

    private final SurefireTestNames names = new SurefireTestNames();

    /**
     * The types the change adds to what the build publishes and adds no test for, each named beside the
     * test it arrives without. A test is one whose name Surefire would run, and its subject is the name
     * that pattern leaves — so a change adding {@code TikaConfig} and {@code TikaConfigTest} has covered
     * the first. The name the missing test would carry comes from the first of the same patterns, so a
     * reader is given a name Surefire would run rather than one chosen here.
     */
    List<ChangedCode.TypeWithoutATest> typesWithoutOne(final Path root, final List<Declaration> added,
                                                       final List<SourceScope> scopes) {
        final Map<String, SourceKind> kindOfPath = kindOfEachPath(root, scopes);
        final Set<String> tested = added.stream()
                .map(Declaration::name)
                .map(names::subjectOf)
                .flatMap(Optional::stream)
                .collect(Collectors.toUnmodifiableSet());
        return added.stream()
                .filter(declaration -> declaration.kind() == DeclarationKind.TYPE)
                .filter(declaration -> kindOfPath.getOrDefault(declaration.path(), SourceKind.OTHER)
                        == SourceKind.PRODUCTION)
                .filter(declaration -> !names.names(declaration.name()))
                .filter(declaration -> !tested.contains(declaration.name()))
                .map(declaration -> new ChangedCode.TypeWithoutATest(declaration.path(),
                        declaration.written(), names.testOf(declaration.name()).orElse("")))
                .toList();
    }

    /**
     * How many of the methods the change adds carry the annotation naming a test. The declarations added
     * are what the diff states, and which of them a tree annotates is a second parse of the same files,
     * so a test method added to a class that already stood counts as readily as one arriving with it.
     */
    int methodsAdded(final Path root, final List<SourceScope> scopes, final List<Declaration> added) {
        final Set<Declaration> tests = Set.copyOf(DeclaredTests.newInstance().under(root, scopes));
        return (int) added.stream()
                .filter(tests::contains)
                .count();
    }

    /** Which kind each read file is, keyed on the path the declarations are written against. */
    private static Map<String, SourceKind> kindOfEachPath(final Path root,
                                                          final List<SourceScope> scopes) {
        final Map<String, SourceKind> kinds = new LinkedHashMap<>();
        scopes.forEach(scope -> scope.files().forEach(file ->
                kinds.putIfAbsent(root.relativize(file).toString(), SourceKind.of(scope.name()))));
        return kinds;
    }
}
