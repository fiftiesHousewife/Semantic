package io.github.fiftieshousewife.codesemantics.engine.pipeline;

import java.util.Objects;

/**
 * A value resolved out of an open space, with the share of the evidence it holds. The share is a posterior
 * among <em>contenders</em> — the values something actually voted for, plus the mass of observations nothing
 * could read — so it is bounded at 1 by what a share means and never by how many values the space happens to
 * contain.
 */
public record ValueShare<V>(V value, double share, double mass) {

    public ValueShare {
        Objects.requireNonNull(value, "value");
    }
}
