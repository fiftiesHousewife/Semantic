package org.fifties.housewife.codesemantics.engine;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

/**
 * How much each resource's reading counts for, centralised so a retune is one record and not a search. A
 * weight here scales evidence; it never decides an outcome, because every outcome is a pooled reading over
 * evidence several resources contributed.
 *
 * <p>Both topical resources start at parity. That is a stated starting point rather than a finding: nothing
 * has yet measured whether a WordNet Domains label or a Wiktionary topic label is the better reading of a
 * code identifier, and asserting a ratio before measuring one would be inventing a result.
 */
@Value
@Builder
@Accessors(fluent = true)
public class Weights {

    /** What one word occurrence's WordNet Domains reading contributes, spread across the senses it has. */
    @Builder.Default double wordNetDomain = 1.0;

    /** What one word occurrence's Wiktionary topic reading contributes, spread across the topics it names. */
    @Builder.Default double wiktionaryTopic = 1.0;

    public static Weights defaults() {
        return Weights.builder().build();
    }
}
