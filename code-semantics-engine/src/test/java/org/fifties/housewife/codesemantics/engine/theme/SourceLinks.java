package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.fifties.housewife.codesemantics.repository.SourceAnchor;

/**
 * Turns a {@code path:line} into something a reader can click.
 *
 * <p>Where the repository has a remote and a commit, that is a permalink, rendered by {@link SourceAnchor}
 * from components rather than assembled here — the full forty-hex SHA, the host the remote names, and the
 * line as a fragment. Where it does not, there is no honest permalink to render and the link opens the file
 * in the reader's own editor instead. Neither case invents a URL that would resolve to the wrong lines,
 * which is the whole reason the anchor is a type and not a string.
 *
 * <p>This is a caller's job and lives with the diagnostic rather than in the library: the library is handed
 * the facts about a repository and never reads {@code .git} itself.
 */
final class SourceLinks {

    private static final Pattern SITE = Pattern.compile("^(?<path>.+):(?<line>\\d+)$");
    private static final Pattern ORIGIN = Pattern.compile(
            "url\\s*=\\s*(?:https://(?<host>[^/]+)/|git@(?<sshHost>[^:]+):)(?<owner>[^/]+)/(?<repo>[^\\s.]+)");
    private static final Pattern FULL_SHA = Pattern.compile("[0-9a-f]{40}");

    private final Path root;
    private final Optional<Remote> remote;

    private record Remote(String host, String owner, String repo, String commitSha) {
    }

    SourceLinks(final Path root) {
        this.root = root;
        this.remote = remoteOf(root);
    }

    /** Whether the links are permalinks into a hosted repository, or editor links into this working copy. */
    boolean isPermalink() {
        return remote.isPresent();
    }

    String describing() {
        return remote.map(named -> "permalinks into %s/%s/%s at %s".formatted(named.host(), named.owner(),
                        named.repo(), named.commitSha().substring(0, 7)))
                .orElse("links that open the file in your editor — this working copy has no remote to "
                        + "permalink into yet");
    }

    String of(final String site) {
        final Matcher matched = SITE.matcher(site);
        if (!matched.matches()) {
            return "";
        }
        final String path = matched.group("path");
        final int line = Integer.parseInt(matched.group("line"));
        return remote
                .map(named -> new SourceAnchor(named.host(), named.owner(), named.repo(), named.commitSha(),
                        path, line, line).permalink().toString())
                .orElseGet(() -> "vscode://file/%s:%d".formatted(root.resolve(path), line));
    }

    private static Optional<Remote> remoteOf(final Path root) {
        final Path config = root.resolve(".git/config");
        if (!Files.isRegularFile(config)) {
            return Optional.empty();
        }
        final Matcher origin = ORIGIN.matcher(read(config));
        if (!origin.find()) {
            return Optional.empty();
        }
        final String host = origin.group("host") == null ? origin.group("sshHost") : origin.group("host");
        return headOf(root).map(sha -> new Remote(host, origin.group("owner"), origin.group("repo"), sha));
    }

    /** The commit the working copy is on, read from the ref {@code HEAD} names. */
    private static Optional<String> headOf(final Path root) {
        final String head = read(root.resolve(".git/HEAD")).trim();
        final String reference = head.startsWith("ref: ") ? head.substring(5) : head;
        final Path ref = root.resolve(".git").resolve(reference);
        final String sha = Files.isRegularFile(ref) ? read(ref).trim() : reference;
        return FULL_SHA.matcher(sha).matches() ? Optional.of(sha) : Optional.empty();
    }

    private static String read(final Path file) {
        try {
            return Files.isRegularFile(file) ? Files.readString(file) : "";
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
