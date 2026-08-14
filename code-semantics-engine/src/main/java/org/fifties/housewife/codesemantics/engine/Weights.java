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
     * What a sentence of prose is worth — a javadoc statement, a comment, a line of documentation.
     *
     * <p>It was a quarter while the unit was the word, because prose is most of the words in this repository
     * and at parity it would have decided every theme by volume alone. The unit is now the <em>phrase</em>,
     * so a twenty-word sentence and a two-word field name each commit once and volume no longer decides
     * anything. What is left for this number to express is the difference in kind, which is real but smaller:
     * a name is the code and a sentence is commentary on it, chosen with less deliberation and read by fewer
     * people.
     *
     * <p>A half is a stated starting point and not a finding. The measurement that would move it is the one
     * the report prints beside every theme — what share of it came from names — and the case to watch is a
     * theme that exists only in the prose, which is a theme the code does not carry.
     */
    @Builder.Default double prose = 0.5;

    public static Weights defaults() {
        return Weights.builder().build();
    }
}
