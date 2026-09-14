package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import j2html.tags.DomContent;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.DivTag;
import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TrTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.b;
import static j2html.TagCreator.body;
import static j2html.TagCreator.code;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.h3;
import static j2html.TagCreator.header;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.style;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.text;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;
import static j2html.TagCreator.ul;

/**
 * One author's pull requests on one repository: three lines saying how much they change, what kind of
 * change they are and what their code is about, then a row per pull request for each, with the full lists
 * a row's counts link to.
 */
public final class AuthorPage {

    private final String stylesheet;

    private final String behaviour;

    private final AuthorSummary summary = new AuthorSummary();

    private final AuthorWork work = new AuthorWork();

    private final AuthorScale scale = new AuthorScale();

    private final AuthorReview review = new AuthorReview();

    private final AuthorSubjects subjects = new AuthorSubjects();

    private final AuthorConcepts concepts = new AuthorConcepts();

    public AuthorPage(final String stylesheet, final String behaviour) {
        this.stylesheet = stylesheet;
        this.behaviour = behaviour;
    }

    public String markup(final AuthorPullRequests author) {
        return PageDocument.of(author.author() + " on " + author.repository(), page(author).render());
    }

    private BodyTag page(final AuthorPullRequests author) {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        header().withClass("fold").with(
                                p().withClass("nav").with(a("← " + author.repository())
                                        .withHref("reading.html")),
                                h1().with(a(author.author()).withHref("https://github.com/" + author.author()),
                                        span(" on "),
                                        a(author.repository()).withHref("reading.html")),
                                p(summary.volume(author)).withClass("finding"),
                                p().withClass("finding").with(span(summary.kind(author)),
                                        Footnotes.marker(Footnotes.CONVENTION),
                                        span(" " + summary.tracker(author))),
                                p(summary.subject(author)).withClass("finding")),
                        work.markup(author),
                        scale.markup(author),
                        review.markup(author),
                        subjects.markup(author),
                        concepts.markup(author),
                        words(author),
                        types(author),
                        untested(author),
                        commits(author),
                        Footnotes.markup()),
                script().withType("application/json").withId("pull-requests")
                        .with(rawHtml(new AuthorData().of(author))),
                script(rawHtml(behaviour)));
    }

    /** One cloud per pull request of the words it writes above both references, merged to their forms. */
    private static SectionTag words(final AuthorPullRequests author) {
        return section().withId("words").with(
                h2("The words each one writes above both references"),
                p().withClass("lede").withText("A word\u2019s size is its score in bits against "
                        + "whichever reference writes it lower. Forms a dictionary calls one word are "
                        + "merged and shown once."),
                div().withClass("clouds").with(each(author.pullRequests(), AuthorPage::cloudFor)));
    }

    private static DivTag cloudFor(final ExportedPullRequest pullRequest) {
        final String number = String.valueOf(pullRequest.number());
        return div().withClass("pull-request-cloud").withId(PullRequestAnchors.wordsId(pullRequest))
                .with(h3(number),
                        div().withClass("cloud").attr("data-pull-request", number),
                        p().withClass("readout cloud-readout").attr("data-pull-request", number));
    }

    /** Every type each pull request introduces, which its count links to. */
    private static SectionTag types(final AuthorPullRequests author) {
        final SectionTag drawn = section().withId("types").with(h2("The types each one introduces"));
        if (author.typesAdded().isEmpty()) {
            return drawn.with(p("None of them declares a type that did not stand before it."));
        }
        return drawn.with(ul().withClass("readings")
                .with(each(author.pullRequests(), AuthorPage::typesOf)));
    }

    private static LiTag typesOf(final ExportedPullRequest pullRequest) {
        final List<String> added = AuthorWork.typesAdded(pullRequest);
        return li().withId(PullRequestAnchors.typesId(pullRequest))
                .with(b().with(PullRequestLink.numbered(pullRequest)),
                        code(added.isEmpty() ? " none" : " " + String.join(", ", added)));
    }

    /** The types each pull request adds to what the build publishes and adds no test for. */
    private static SectionTag untested(final AuthorPullRequests author) {
        final SectionTag drawn = section().withId("untested")
                .with(h2("The types added with no test of their own"));
        if (author.typesAddedWithoutATest().isEmpty()) {
            return drawn.with(p("Every type they add to what the build publishes arrives with a test "
                    + "named for it."));
        }
        return drawn.with(ul().withClass("readings")
                .with(each(author.pullRequests(), AuthorPage::untestedOf)));
    }

    private static LiTag untestedOf(final ExportedPullRequest pullRequest) {
        final List<String> named = PullRequestWork.written(pullRequest)
                .map(ExportedWork.Written::typesAddedWithoutATest)
                .orElse(List.of())
                .stream()
                .map(ExportedWork.NamedDeclaration::name)
                .toList();
        return li(b().with(PullRequestLink.numbered(pullRequest)),
                code(named.isEmpty() ? " none" : " " + String.join(", ", named)));
    }

    /** The commits each pull request was read at, so a figure here can be taken again. */
    private static SectionTag commits(final AuthorPullRequests author) {
        return section().withId("commits").with(
                h2("The commits read"),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Head"), th("Base"))),
                        tbody(each(author.pullRequests(), AuthorPage::commit)))));
    }

    private static TrTag commit(final ExportedPullRequest pullRequest) {
        return tr(PullRequestLink.cell(pullRequest), td().with(PullRequestLink.commit(pullRequest)),
                td(code(pullRequest.baseSha())));
    }

}
