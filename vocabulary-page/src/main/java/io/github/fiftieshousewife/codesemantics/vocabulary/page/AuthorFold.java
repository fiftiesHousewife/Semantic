package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import j2html.tags.specialized.HeaderTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;

/**
 * What a reader sees before scrolling: whose pull requests these are, and the whole report in a short
 * list beneath, one line per question the sections below answer.
 *
 * <p>None of it states a judgement. A reading that said a change was an improvement would be asserting
 * something it has not measured.
 */
final class AuthorFold {

    private static final String PROFILE = "https://github.com/";

    private final AuthorOverview overview = new AuthorOverview();

    HeaderTag markup(final AuthorPullRequests author) {
        return header().withClass("fold").with(
                p().withClass("nav").with(a("\u2190 " + author.repository()).withHref("reading.html")),
                h1().with(a(author.author()).withHref(PROFILE + author.author()),
                        span(" on "), a(author.repository()).withHref("reading.html")),
                overview.markup(author));
    }
}
