package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.SectionTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.b;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.ul;

/**
 * The pull requests read beside a repository, one line per author, each linking to that author's own
 * report. A repository whose reading carries none states so in a sentence.
 *
 * <p>A pull request's signals are priced against thresholds drawn over its own changed files. The
 * repository's own figures above stand unchanged whether or not any pull request was read.
 */
final class PullRequestSection {

    SectionTag markup(final List<AuthorPullRequests> authors) {
        final SectionTag drawn = section().withId("pull-requests").with(h2("Pull requests"));
        if (authors.isEmpty()) {
            return drawn.with(p("No pull request was fetched for this repository, so only its working "
                    + "tree is read."));
        }
        return drawn.with(
                p().withClass("lede").withText("Each pull request is read on its own, against "
                        + "thresholds drawn from the files it changes. The figures above are the "
                        + "working tree's alone."),
                ul().withClass("authors").with(each(authors, PullRequestSection::author)));
    }

    private static LiTag author(final AuthorPullRequests author) {
        return li(b().with(a(author.author()).withHref(author.file())),
                span(" — " + claim(author)));
    }

    private static String claim(final AuthorPullRequests author) {
        final String read = String.format(Locale.ROOT, "%s, changing %s",
                Counted.of(author.pullRequests().size(), "pull request"),
                Counted.of(author.changedFiles(), "file"));
        if (author.readAgainstABase() == 0) {
            return read + ".";
        }
        return String.format(Locale.ROOT, "%s. %s %s and %s %s.", read,
                author.pullRequests().size() == 1 ? "It adds" : "They add",
                DeclarationPhrase.of(author.added()),
                author.pullRequests().size() == 1 ? "removes" : "remove",
                DeclarationPhrase.of(author.removed()));
    }
}
