package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import j2html.tags.DomContent;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.TrTag;

import static j2html.TagCreator.b;
import static j2html.TagCreator.code;
import static j2html.TagCreator.div;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.p;
import static j2html.TagCreator.section;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;

/**
 * What the bundled vocabularies call the terms each pull request's changed files write.
 *
 * <p>These are matches and never a placement. A repository is placed only where a vocabulary writes more
 * of its phrases than a deal of that vocabulary's own words reaches, and that bar is drawn over a whole
 * tree; a few changed files are too small a field for it, so no vocabulary is said to have answered.
 */
final class AuthorConcepts {

    SectionTag markup(final AuthorPullRequests author) {
        final SectionTag drawn = section().withId("concepts")
                .with(h2("What published vocabularies call these words"));
        if (author.pullRequests().stream().allMatch(pullRequest -> pullRequest.concepts().isEmpty())) {
            return drawn.with(p("No bundled vocabulary states a concept for any term these files write."));
        }
        return drawn.with(
                p().withClass("lede").withText("A row is one term a publisher states a concept for, with "
                        + "its own prose beside it. No vocabulary is said to have answered: the bar a "
                        + "placement clears is drawn over a whole tree, and a few changed files are too "
                        + "small a field for it."),
                div().withClass("scrolls").with(table().withClass("work").with(
                        thead(tr(th("Pull request"), th("Term"), th("Written").withClass("number"),
                                th("Vocabulary"), th("Concept"), th("What the publisher states it is"))),
                        tbody(each(author.pullRequests(), AuthorConcepts::rows)))));
    }

    private static DomContent rows(final ExportedPullRequest pullRequest) {
        return each(pullRequest.concepts(), concept -> row(pullRequest, concept));
    }

    private static TrTag row(final ExportedPullRequest pullRequest,
                             final ExportedPullRequest.MatchedConcept concept) {
        return tr(td(b(String.valueOf(pullRequest.number()))), td(code(concept.term())),
                td(String.valueOf(concept.occurrences())).withClass("number"),
                td(concept.vocabulary()), td(concept.concept()), td(concept.definition()));
    }
}
