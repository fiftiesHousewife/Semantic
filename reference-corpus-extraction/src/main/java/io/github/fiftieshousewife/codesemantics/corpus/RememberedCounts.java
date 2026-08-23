package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * A repository search that asks for any one count at most once.
 *
 * <p>Resolving a rank bisects its year by creation date, and every rank in the same year walks the same
 * first few ranges before diverging. Those repeats are the bulk of a draw's cost, because each one is a
 * paced request against a rate limit rather than arithmetic.
 *
 * <p>It also makes a run internally consistent. A frame counted twice during one draw can answer twice
 * differently, and a bisection whose bounds disagree with each other resolves a rank to the wrong
 * repository. Asking once removes that whether or not it saves time.
 *
 * <p>Pages are not remembered. A count is a number about a range; a page is the thing the rank is finally
 * read out of, and each is asked for once by construction.
 */
public final class RememberedCounts implements RepositorySearch {

    private final RepositorySearch asked;
    private final Map<String, Long> counts = new HashMap<>();

    public RememberedCounts(final RepositorySearch asked) {
        this.asked = asked;
    }

    /** How many distinct counts this run has needed, which is what it spent on them. */
    public int remembered() {
        return counts.size();
    }

    @Override
    public long count(final String query) {
        return counts.computeIfAbsent(query, asked::count);
    }

    @Override
    public List<JsonNode> oldestFirst(final String query, final int perPage, final int page) {
        return asked.oldestFirst(query, perPage, page);
    }
}
