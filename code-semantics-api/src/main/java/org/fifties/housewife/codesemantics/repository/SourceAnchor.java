package org.fifties.housewife.codesemantics.repository;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * The components of a permalink to the lines that evidenced a reading, rendered late so that a repository
 * which moves owner renders correctly without rewriting a stored URL.
 *
 * <p>The commit SHA is always a full 40 hex characters and never a branch or tag: a ref moves, and a
 * permalink that moves is not attribution. Line numbers are 1-based and inclusive, and a single line renders
 * {@code #Ln} rather than {@code #Ln-Ln}, because the host highlights the two differently.
 *
 * <p>The blob permalink is the only anchor form emitted for code. The diff anchor
 * {@code …/pull/{n}/files#diff-{hash}} is deliberately absent: its hash construction is a host implementation
 * detail that has changed, and a construction that can silently rot is not attribution.
 */
public record SourceAnchor(String host, String owner, String repo, String commitSha,
                           String path, int startLine, int endLine) {

    private static final int SHA_LENGTH = 40;

    public SourceAnchor {
        Objects.requireNonNull(host, "host");
        Objects.requireNonNull(owner, "owner");
        Objects.requireNonNull(repo, "repo");
        Objects.requireNonNull(commitSha, "commitSha");
        Objects.requireNonNull(path, "path");
        if (commitSha.length() != SHA_LENGTH) {
            throw new IllegalArgumentException("a permalink pins a full commit sha: " + commitSha);
        }
        if (startLine > endLine) {
            throw new IllegalArgumentException("line range runs backwards: " + startLine + ".." + endLine);
        }
    }

    /** The blob permalink to the anchored lines. */
    public URI permalink() {
        final String fragment = startLine == endLine
                ? "#L%d".formatted(startLine)
                : "#L%d-L%d".formatted(startLine, endLine);
        return URI.create("https://%s/%s/%s/blob/%s/%s%s"
                .formatted(host, owner, repo, commitSha, encodedPath(), fragment));
    }

    /** The permalink to the commit itself. */
    public URI commitPermalink() {
        return URI.create("https://%s/%s/%s/commit/%s".formatted(host, owner, repo, commitSha));
    }

    /**
     * Path segments are percent-encoded individually so that {@code /} survives as the separator it is.
     * {@link URLEncoder} writes a space as {@code +}, which a path does not read that way.
     */
    private String encodedPath() {
        return Arrays.stream(path.split("/", -1))
                .map(segment -> URLEncoder.encode(segment, StandardCharsets.UTF_8).replace("+", "%20"))
                .collect(Collectors.joining("/"));
    }
}
