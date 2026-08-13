package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;

/**
 * One thing both sides of a term match can be turned into before they are compared.
 *
 * <p>A rung of the ladder is nothing more than this plus the index it is applied to, which is why there is one
 * decorator and not one per rung. The published terms go through it when the index is built and a repository's
 * runs go through it when they are asked about, so neither side is privileged and the comparison is between
 * two things the same statement produced.
 *
 * <p><b>Empty is an abstention and never a fallback.</b> A normalisation that cannot read part of a run yields
 * nothing at all rather than the part it could read: half a normal form would be a comparison this library
 * invented for the half it understood.
 *
 * @param <K> what a run of words becomes — the type is the rung's own, and two rungs never share a key space
 */
public interface TermNormalisation<K> {

    /** What this run of words becomes, or nothing where it cannot be read at all. */
    Optional<K> of(List<String> words);

    /** The rung a match made through this normalisation is recorded at. */
    TermRung rung();
}
