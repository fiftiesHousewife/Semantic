package org.fifties.housewife.codesemantics.engine.theme;

/**
 * How far one topical intensity stands from another, in bits or in mass — whatever the statistic's own
 * definition bounds it at.
 *
 * <p>Two of them are used, and which one is used is a measurement rather than a preference. Both run the
 * same way round: <em>smaller is nearer</em>, so a placement, a null and a report never have to know which
 * statistic produced the number they are handling.
 */
@FunctionalInterface
public interface TopicComparison {

    double between(TopicDistribution scope, TopicDistribution subject);
}
