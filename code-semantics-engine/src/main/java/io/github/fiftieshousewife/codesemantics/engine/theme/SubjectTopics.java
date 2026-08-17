package io.github.fiftieshousewife.codesemantics.engine.theme;

/**
 * One published subject area, read as a distribution over the same topics a body of code is read as.
 *
 * <p>This is the whole of the hop. The taxonomy states {@code cs.IR} covers <em>indexing, dictionaries,
 * retrieval, content and analysis</em>; those words go through the reading a repository's own prose goes
 * through, and what comes back is an intensity over the dictionary's topics. A scope is then compared with
 * a subject area the same way one scope is compared with another, because by this point they are the same
 * kind of thing — and nothing was matched, so no word of the description ever had to appear in the code.
 */
public record SubjectTopics(String concept, String label, String group, TopicDistribution distribution,
        int phrases) {
}
