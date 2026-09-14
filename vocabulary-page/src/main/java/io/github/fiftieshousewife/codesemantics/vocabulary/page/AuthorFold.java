package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import j2html.tags.DomContent;
import j2html.tags.specialized.HeaderTag;
import j2html.tags.specialized.PTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.each;
import static j2html.TagCreator.em;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.header;
import static j2html.TagCreator.p;
import static j2html.TagCreator.span;
import static j2html.TagCreator.text;

/**
 * What a reader sees before scrolling: whose pull requests these are, how many, what kind of change they
 * are, what their code is about, and what they do to the code.
 *
 * <p>Each line carries figures the tables below carry again in full. None of them states a judgement: a
 * reading that said a change was an improvement would be asserting something it has not measured.
 */
final class AuthorFold {

    private static final String PROFILE = "https://github.com/";

    private final AuthorSummary summary = new AuthorSummary();

    private final AuthorQuality quality = new AuthorQuality();

    HeaderTag markup(final AuthorPullRequests author) {
        return header().withClass("fold").with(
                p().withClass("nav").with(a("← " + author.repository()).withHref("reading.html")),
                h1().with(a(author.author()).withHref(PROFILE + author.author()),
                        span(" on "), a(author.repository()).withHref("reading.html")),
                p(summary.volume(author)).withClass("finding"),
                kind(author),
                subject(author),
                p(quality.of(author)).withClass("finding"));
    }

    /**
     * What kind of change these are, with the standard's own word reaching the table of shapes it comes
     * from.
     */
    private PTag kind(final AuthorPullRequests author) {
        final String said = summary.kind(author);
        final String word = summary.word(author);
        final String tracker = " " + summary.tracker(author);
        final int at = said.lastIndexOf(word);
        if (word.isEmpty() || at < 0) {
            return p().withClass("finding").with(span(said),
                    Footnotes.marker(Footnotes.CONVENTION), span(tracker));
        }
        return p().withClass("finding").with(span(said.substring(0, at)),
                a(word).withHref("../" + ChangeShapeTable.FILE),
                span(said.substring(at + word.length())),
                Footnotes.marker(Footnotes.CONVENTION), span(tracker));
    }

    /** What the code is about: the words themselves, and where the vocabularies file the terms. */
    private PTag subject(final AuthorPullRequests author) {
        final List<String> words = summary.subjectWords(author);
        if (words.isEmpty()) {
            return p("These pull requests have no subject matter in common.").withClass("finding");
        }
        return p().withClass("finding").with(span("About "), quoted(words), placed(author));
    }

    /**
     * Where the vocabularies file these terms, each subject in italics as the words above it are, so a
     * name a publisher states reads as a name and not as part of the sentence around it.
     */
    private DomContent placed(final AuthorPullRequests author) {
        final List<String> subjects = summary.placedUnder(author);
        if (subjects.isEmpty()) {
            return span("");
        }
        return span().with(span(" The vocabularies this repository publishes file the terms these "
                + "files write under "), quoted(subjects));
    }

    /** A list of names, each in italics, closing with a full stop. */
    private static DomContent quoted(final List<String> names) {
        return each(names, name -> span().with(em(name),
                text(name.equals(names.getLast()) ? "." : ", ")));
    }
}
