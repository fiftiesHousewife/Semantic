package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;

import j2html.tags.DomContent;

import static j2html.TagCreator.article;
import static j2html.TagCreator.code;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h3;
import static j2html.TagCreator.header;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;

/**
 * What distinguishes each scope from the repository, with the field it had to beat printed beside it.
 *
 * <p>A divergence drawn without its null is the number a reader will treat as a finding, so the observed
 * bits and the chance median are the same two bars on every card. A scope that did not clear its own null
 * has its ranking withheld entirely rather than shown under a caveat — the caveat is not what gets quoted.
 */
final class ScopeCards {

    private static final double LEAST_MAXIMUM = 0.2;
    private static final int WORDS_NAMED = 3;

    private final List<ThemeGraph.Scope> scopes;
    private final double widestShare;
    private final double mostBits;

    ScopeCards(final List<ThemeGraph.Scope> scopes) {
        this.scopes = scopes;
        this.widestShare = scopes.stream()
                .flatMap(scope -> scope.contributions().stream())
                .mapToDouble(ThemeGraph.Contribution::shareOfDivergence)
                .max().orElse(LEAST_MAXIMUM);
        this.mostBits = scopes.stream()
                .mapToDouble(scope -> Math.max(scope.bits(), scope.nullMedian()))
                .max().orElse(1.0);
    }

    DomContent cards() {
        return div(each(scopes, this::card)).withClass("scopes");
    }

    private DomContent card(final ThemeGraph.Scope scope) {
        return article(
                header(h3(scope.name()),
                        p("%s files · %s lines".formatted(ThemeTables.count(scope.files()),
                                ThemeTables.count(scope.lines()))).withClass("scope-meta")),
                chance(scope),
                scope.exceedsChance() ? contributions(scope) : withheld())
                .withClass("scope");
    }

    private DomContent chance(final ThemeGraph.Scope scope) {
        return div(measured("observed", scope.bits(), "chance-bar observed"),
                measured("chance", scope.nullMedian(), "chance-bar"),
                verdict(scope)).withClass("chance");
    }

    private DomContent measured(final String key, final double bits, final String styling) {
        return div(span(key).withClass("chance-key"),
                span(span().withClass(styling)
                        .attr("style", "--w:%s".formatted(ThemeTables.percentage(bits / mostBits))))
                        .withClass("chance-track"),
                span("%s bits".formatted(ThemeTables.bits(bits))).withClass("chance-val"))
                .withClass("chance-row");
    }

    private static DomContent verdict(final ThemeGraph.Scope scope) {
        return p(span(scope.exceedsChance() ? "stands outside its own null"
                        : "does not stand outside its own null")
                        .withClass(scope.exceedsChance() ? "pill good" : "pill flat"),
                span(String.format(Locale.ROOT,
                        " excess %+.4f · %s of %s chance draws diverged at least as far", scope.excess(),
                        ThemeTables.count(scope.atLeastAsExtreme()),
                        ThemeTables.count(scope.resamples()))))
                .withClass("chance-note");
    }

    private static DomContent withheld() {
        return p("A scope of this size draws a divergence this large by chance, so it has no topical "
                + "content beyond its size and nothing is ranked.").withClass("withheld");
    }

    private DomContent contributions(final ThemeGraph.Scope scope) {
        return div(each(scope.contributions(), this::contribution));
    }

    private DomContent contribution(final ThemeGraph.Contribution contribution) {
        return div(div(span().withClass("contrib-bar").attr("style", "--w:%s".formatted(
                        ThemeTables.percentage(contribution.shareOfDivergence() / widestShare))))
                        .withClass("contrib-track"),
                div(span(contribution.topic()),
                        span("%s of the difference".formatted(
                                ThemeTables.percentage(contribution.shareOfDivergence())))
                                .withClass("contrib-share")).withClass("contrib-name"),
                div(span(ThemeTables.share(contribution.scopeShare())),
                        span(" in scope vs ").withClass("vs"),
                        span(ThemeTables.share(contribution.referenceShare())))
                        .withClass("contrib-figures"),
                div(each(contribution.carriedBy().stream().limit(WORDS_NAMED)
                        .map(witness -> code(witness.word())))).withClass("contrib-words"))
                .withClass(contribution.concentratedInScope() ? "contrib over" : "contrib under");
    }
}
