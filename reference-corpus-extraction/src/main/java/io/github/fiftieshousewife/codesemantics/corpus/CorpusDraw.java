package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;

import io.github.fiftieshousewife.codesemantics.clones.HeadCommit;

import lombok.extern.slf4j.Slf4j;

/**
 * Takes repositories from a frame at seeded ranks until it has as many as were asked for.
 *
 * <p>A rank producing no repository is recorded and another is taken. So is a rank landing on a named
 * exclusion, on a repository already taken, or — where a publication test is supplied — on one whose build
 * states no publication. Every rejection carries the rank that produced it, so a reader can tell how many
 * ranks a sample consumed.
 *
 * <p>A repository is pinned at the commit its default branch points at when it is taken, and every later
 * question is asked of that commit rather than of the branch. A branch moves; a draw recording one records
 * a sample nobody can read twice.
 */
@Slf4j
public final class CorpusDraw {

    /** What one draw produced: the repositories taken, and every rank that produced none. */
    public record Drawn(List<Map<String, Object>> taken, List<Map<String, Object>> rejected) {
    }

    private final SampledFrame frame;
    private final MersenneTwister drawing;
    private final Set<String> excluded;
    private final Optional<PublishedArtefact> publication;
    private final HeadCommit head;

    public CorpusDraw(final SampledFrame frame, final MersenneTwister drawing, final Set<String> excluded,
                      final Optional<PublishedArtefact> publication, final HeadCommit head) {
        this.frame = frame;
        this.drawing = drawing;
        this.excluded = Set.copyOf(excluded);
        this.publication = publication;
        this.head = head;
    }

    public Drawn of(final int wanted, final long total) {
        final List<Map<String, Object>> taken = new ArrayList<>();
        final List<Map<String, Object>> rejected = new ArrayList<>();
        while (taken.size() < wanted) {
            final long rank = drawing.below(total);
            final Optional<JsonNode> found = frame.at(rank);
            if (found.isEmpty()) {
                rejected.add(why(rank, "", "GitHub will not page to that rank"));
                continue;
            }
            take(found.get(), rank, taken, rejected, wanted);
        }
        return new Drawn(List.copyOf(taken), List.copyOf(rejected));
    }

    private void take(final JsonNode repository, final long rank, final List<Map<String, Object>> taken,
                      final List<Map<String, Object>> rejected, final int wanted) {
        final String name = repository.get("full_name").asText();
        if (excluded.contains(name.toLowerCase(Locale.ROOT))) {
            rejected.add(why(rank, name, "named as an exclusion"));
            return;
        }
        if (taken.stream().anyMatch(each -> name.equals(each.get("repository")))) {
            rejected.add(why(rank, name, "already taken"));
            return;
        }
        final String sha = head.of(origin(repository));
        final Optional<String> states = publication
                .map(test -> test.statedBy(name, sha))
                .orElseGet(() -> Optional.of(""));
        if (states.isEmpty()) {
            rejected.add(why(rank, name, "states no publication"));
            log.info("  rejected {}: states no publication", name);
            return;
        }
        taken.add(row(rank, repository, sha, states.get()));
        log.info("TAKEN {}/{}  rank {}  {}  {}  {}", taken.size(), wanted, rank, name, sha, states.get());
    }

    private static Map<String, Object> row(final long rank, final JsonNode repository, final String sha,
                                           final String states) {
        final Map<String, Object> row = new LinkedHashMap<>();
        row.put("repository", repository.get("full_name").asText());
        row.put("rank", rank);
        row.put("sha", sha);
        row.put("origin", origin(repository));
        row.put("created", repository.path("created_at").asText(""));
        row.put("sizeKb", repository.path("size").asLong());
        row.put("stars", repository.path("stargazers_count").asLong());
        row.put("licenceAtPin", repository.path("license").path("spdx_id").asText("none"));
        row.put("description", repository.path("description").asText(""));
        row.put("publishes", states);
        return row;
    }

    /** Where the clone is fetched from, which is also what git is asked for the pin. */
    private static String origin(final JsonNode repository) {
        return repository.path("html_url").asText() + ".git";
    }

    private static Map<String, Object> why(final long rank, final String repository, final String reason) {
        final Map<String, Object> rejected = new LinkedHashMap<>();
        rejected.put("rank", rank);
        rejected.put("repository", repository);
        rejected.put("why", reason);
        return rejected;
    }
}
