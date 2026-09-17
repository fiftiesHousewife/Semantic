package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

import io.github.fiftieshousewife.codesemantics.engine.reading.ChangedFileScopes;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Counts, over the pull requests a fetch step pinned, how many carry a declaration that was removed at the
 * base and added at the head under an identical body — the shape a refactoring catalogue names.
 *
 * <p>It prints and nothing votes on it. The question it answers is whether a change vocabulary read from
 * the diff would name anything at all: a body standing at both ends under a different name or a different
 * enclosing declaration is a measurement, where matching on similarity would be an assertion.
 *
 * <p>Run it with {@code ./gradlew :code-semantics-engine:test --tests '*MovedDeclarationsProbe'
 * -Dinclude.tags=diagnostic -Dcs.pullrequests.dir=<directory fetch/fetch-pull-requests.sh filled>}.
 */
@Tag("diagnostic")
class MovedDeclarationsProbe {

    private static final String BASE_SUFFIX = "-base";

    private final JavaParser parser = new JavaParser(new ParserConfiguration()
            .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21));

    private final EnclosingDeclarations enclosing = new EnclosingDeclarations();

    @Test
    void countsTheDeclarationsWhoseBodyStandsAtBothEndsUnderAnotherName() {
        final String named = System.getProperty("cs.pullrequests.dir", "");
        if (named.isBlank()) {
            System.out.println("No -Dcs.pullrequests.dir, so there is nothing to read.");
            return;
        }
        final Path directory = Path.of(named);
        System.out.printf(Locale.ROOT, "%-8s %9s %9s %9s   %s%n",
                "request", "removed", "added", "matched", "what the catalogue would name");
        try (Stream<Path> heads = Files.list(directory)) {
            heads.filter(Files::isDirectory)
                    .filter(head -> !head.getFileName().toString().endsWith(BASE_SUFFIX))
                    .filter(head -> Files.isDirectory(baseOf(head)))
                    .sorted()
                    .forEach(this::report);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to list " + directory, e);
        }
    }

    private static Path baseOf(final Path head) {
        return head.resolveSibling(head.getFileName() + BASE_SUFFIX);
    }

    private void report(final Path head) {
        final Map<Declaration, String> atHead = bodiesUnder(head);
        final Map<Declaration, String> atBase = bodiesUnder(baseOf(head));
        final List<Declaration> added = atHead.keySet().stream()
                .filter(declaration -> !atBase.containsKey(declaration))
                .toList();
        final List<Declaration> removed = atBase.keySet().stream()
                .filter(declaration -> !atHead.containsKey(declaration))
                .toList();
        final List<String> named = new ArrayList<>();
        removed.forEach(gone -> added.stream()
                .filter(arrived -> atBase.get(gone).equals(atHead.get(arrived)))
                .findFirst()
                .ifPresent(arrived -> named.add(nameFor(gone, arrived))));
        System.out.printf(Locale.ROOT, "%-8s %9d %9d %9d   %s%n", head.getFileName(),
                removed.size(), added.size(), named.size(),
                named.isEmpty() ? "nothing" : String.join("; ", named));
    }

    /** What a catalogue calls a body standing at both ends: the evidence is the name and where it sits. */
    private static String nameFor(final Declaration gone, final Declaration arrived) {
        final boolean sameName = gone.name().equals(arrived.name());
        final boolean sameSeat = gone.path().equals(arrived.path())
                && gone.enclosing().equals(arrived.enclosing());
        if (sameSeat) {
            return "Rename Method (" + gone.name() + " to " + arrived.name() + ")";
        }
        if (sameName) {
            return "Move Method (" + gone.name() + ")";
        }
        return "Move And Rename Method (" + gone.name() + " to " + arrived.name() + ")";
    }

    private Map<Declaration, String> bodiesUnder(final Path root) {
        final Map<Declaration, String> bodies = new LinkedHashMap<>();
        new ChangedFileScopes().under(root).stream()
                .flatMap(scope -> scope.files().stream())
                .filter(file -> file.getFileName().toString().endsWith(".java"))
                .distinct()
                .sorted()
                .forEach(file -> read(root, file, bodies));
        return bodies;
    }

    private void read(final Path root, final Path file, final Map<Declaration, String> bodies) {
        final String path = root.relativize(file).toString();
        parser.parse(contentOf(file)).getResult().ifPresent(unit ->
                unit.findAll(CallableDeclaration.class).forEach(method ->
                        bodyOf(method).ifPresent(body -> bodies.put(
                                new Declaration(path, enclosing.around(method), DeclarationKind.METHOD,
                                        method.getNameAsString()), body))));
    }

    private static Optional<String> bodyOf(final CallableDeclaration<?> method) {
        return method.findFirst(BlockStmt.class)
                .filter(block -> block.getParentNode().filter(method::equals).isPresent())
                .map(BlockStmt::toString);
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
