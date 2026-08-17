package io.github.fiftieshousewife.codesemantics.symbol;

import io.github.fiftieshousewife.codesemantics.concept.ConceptEvidence;

/**
 * One reading over one declaration. A stage is pure and side-effect free, so within a phase the order stages
 * run in is immaterial and their evidence simply merges; order is load-bearing only across phases, and that
 * ordering is stated in one place rather than implied by a stage's own behaviour.
 */
@FunctionalInterface
public interface SymbolPipelineStage {

    ConceptEvidence evaluate(SymbolContext context);
}
