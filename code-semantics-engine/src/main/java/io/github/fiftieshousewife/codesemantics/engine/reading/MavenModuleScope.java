package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Maven poms of a working tree, as one scope, found by following the module chain from the root pom:
 * each pom's own {@code <module>} entries state which directories are modules, so what is a module is the
 * build's own statement and never a directory sweep — a pom under a build output or a fixture corpus is not
 * on the chain and is not read. A tree built with something else has no root pom and no scope, which is the
 * correct answer rather than a missing one.
 */
public final class MavenModuleScope {

    private static final String NAME = "modules";
    private static final String POM_FILE = "pom.xml";
    private static final Pattern MODULE_ENTRY = Pattern.compile("<module>\\s*([^<]+?)\\s*</module>");

    public List<SourceScope> under(final Path root) {
        final Path rootPom = root.resolve(POM_FILE);
        if (!Files.isRegularFile(rootPom)) {
            return List.of();
        }
        final StatedExclusions excluded = StatedExclusions.statedUnder(root);
        final Set<Path> chain = new LinkedHashSet<>();
        collect(root, rootPom, excluded, chain);
        return chain.isEmpty() ? List.of() : List.of(new SourceScope(NAME, new ArrayList<>(chain)));
    }

    private void collect(final Path root, final Path pom, final StatedExclusions excluded,
            final Set<Path> chain) {
        if (excluded.excludes(root.relativize(pom)) || !chain.add(pom)) {
            return;
        }
        final Matcher modules = MODULE_ENTRY.matcher(contentOf(pom));
        while (modules.find()) {
            final Path stated = pom.getParent().resolve(modules.group(1)).resolve(POM_FILE).normalize();
            if (Files.isRegularFile(stated)) {
                collect(root, stated, excluded, chain);
            }
        }
    }

    private static String contentOf(final Path pom) {
        try {
            return Files.readString(pom);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + pom, e);
        }
    }
}
