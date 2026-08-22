package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

/** Whatever answers a repository query: how many match, and a page of them oldest first. */
public interface RepositorySearch {

    /** How many repositories the query matches. */
    long count(String query);

    /** One page of matches, oldest first, which is the order a rank is resolved in. */
    List<JsonNode> oldestFirst(String query, int perPage, int page);
}
