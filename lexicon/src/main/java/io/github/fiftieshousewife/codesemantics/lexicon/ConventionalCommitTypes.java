package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The Conventional Commits tokens: the commit types and the breaking-change footer the specification
 * states for a commit message's first line, with the definition its source publishes for each.
 *
 * <p>A commit prefixed {@code fix:} writes the specification's word, not the author's, so a statement
 * parsed under the Conventional Commits grammar is classified by looking its type up here — and a token
 * the standard does not state yields no concept, never a guess.
 */
public final class ConventionalCommitTypes {

    private static final String RESOURCE = "conventional-commit-types.tsv";

    private static final String TYPE = "type";

    private static final ConventionalCommitTypes CLASSPATH_DEFAULTS = load();

    private final Map<String, SkosConcept> byToken;

    private final List<SkosConcept> concepts;

    private ConventionalCommitTypes(final List<SkosConcept> concepts) {
        this.concepts = List.copyOf(concepts);
        this.byToken = this.concepts.stream()
                .collect(Collectors.toUnmodifiableMap(SkosConcept::concept, Function.identity()));
    }

    public static ConventionalCommitTypes fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The commit type the standard states under this token, exactly as written; footers do not answer. */
    public Optional<SkosConcept> typeStated(final String token) {
        return Optional.ofNullable(byToken.get(token))
                .filter(concept -> TYPE.equals(concept.kind()));
    }

    /** Every token the standard states, types and footers alike. */
    public List<SkosConcept> concepts() {
        return concepts;
    }

    private static ConventionalCommitTypes load() {
        return new ConventionalCommitTypes(SkosRows.in(RESOURCE));
    }
}
