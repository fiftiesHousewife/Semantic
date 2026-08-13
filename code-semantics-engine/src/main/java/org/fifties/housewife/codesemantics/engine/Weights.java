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

    /**
     * What a name this repository declared is worth. It is the unit the other two are stated against,
     * because a name is not evidence <em>about</em> the code — it is the code. Someone chose it, every
     * reader of that line reads it, and changing it changes the program's meaning to a person.
     */
    @Builder.Default double declaredName = 1.0;

    /**
     * What a dependency a file names is worth. A choice about what the code is made of rather than about
     * what it says, and one a file makes once however much it leans on it.
     */
    @Builder.Default double dependency = 0.5;

    /**
     * What a word of prose is worth — javadoc, a comment, a line of documentation. Prose is commentary on
     * the code rather than the code, it is discursive where a name is deliberate, and there is far more of
     * it: on this repository it is roughly two thirds of every word occurrence, so at parity it would decide
     * every theme by weight of volume alone.
     *
     * <p>A quarter is a stated starting point and not a finding. The measurement that would move it is the
     * one the report prints beside every theme: what share of it came from names rather than from prose. A
     * theme that only exists in the prose is a theme the code does not carry, and the number to tune against
     * is how often that happens.
     */
    @Builder.Default double prose = 0.25;

    public static Weights defaults() {
        return Weights.builder().build();
    }
}
