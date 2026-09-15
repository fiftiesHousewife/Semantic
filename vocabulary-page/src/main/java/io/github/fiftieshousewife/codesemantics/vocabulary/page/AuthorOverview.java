package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import j2html.tags.DomContent;
import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.UlTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.b;
import static j2html.TagCreator.each;
import static j2html.TagCreator.em;
import static j2html.TagCreator.li;
import static j2html.TagCreator.span;
import static j2html.TagCreator.text;
import static j2html.TagCreator.ul;

/**
 * The whole report in seven short lines, one per question the sections below answer, each reaching the
 * section that carries the figures behind it.
 *
 * <p>Every figure is a total the sections state again in full. A reader who stops here knows what the
 * pull requests are about, what kind of change they are, how much they change, what arrives tested, how
 * the code compares with the repository around it, and how well the descriptions match the code.
 */
final class AuthorOverview {

    private final AuthorSummary summary = new AuthorSummary();

    private final AuthorQuality quality = new AuthorQuality();

    UlTag markup(final AuthorPullRequests author) {
        if (author.readAgainstABase() == 0) {
            return ul().withClass("overview").with(volume(author), about(author));
        }
        return ul().withClass("overview").with(volume(author), about(author), kind(author),
                changed(author), tested(author), leaves(author), described(author));
    }

    private LiTag volume(final AuthorPullRequests author) {
        return line("How many", "commits", text(summary.volume(author)));
    }

    /** What the code is about: the words themselves, then where the vocabularies file those terms. */
    private LiTag about(final AuthorPullRequests author) {
        final List<String> words = summary.subjectWords(author);
        if (words.isEmpty()) {
            return line("About", "subjects", text(Counted.agreeing(author.pullRequests().size(),
                    "This pull request has", "These pull requests have")
                    + " no subject matter in common."));
        }
        return line("About", "subjects", named(words), filed(author));
    }

    /**
     * How many terms the vocabularies this repository published name, and the subjects they file them
     * under, each subject in italics as the words above it are.
     */
    private DomContent filed(final AuthorPullRequests author) {
        final List<String> subjects = summary.placedUnder(author);
        if (subjects.isEmpty()) {
            return span("");
        }
        return span().with(span(" The vocabularies this repository publishes name "),
                a(Counted.of((int) AuthorTotals.termsNamed(author), "term")).withHref("#concepts"),
                span(" of what these files write, filed under "), named(subjects));
    }

    private LiTag kind(final AuthorPullRequests author) {
        final String said = summary.kind(author);
        final String word = summary.word(author);
        final int at = said.lastIndexOf(word);
        if (word.isEmpty() || at < 0) {
            return line("What kind", "work", text(said), Footnotes.marker(Footnotes.CONVENTION),
                    text(" " + summary.tracker(author)));
        }
        return line("What kind", "work", text(said.substring(0, at)),
                a(word).withHref("../" + ChangeShapeTable.FILE),
                text(said.substring(at + word.length())), Footnotes.marker(Footnotes.CONVENTION),
                text(" " + summary.tracker(author)));
    }

    private LiTag changed(final AuthorPullRequests author) {
        return line(Counted.agreeing(author.pullRequests().size(), "What it changes",
                "What they change"), "scale", text(quality.changed(author)), written(author));
    }

    /** What they write, left off where a change touches no code at all — a pom, a changelog. */
    private static DomContent written(final AuthorPullRequests author) {
        final int statements = AuthorTotals.statementsAdded(author);
        final int prose = AuthorTotals.proseLinesAdded(author);
        if (statements == 0 && prose == 0) {
            return span("");
        }
        return text(String.format(Locale.ROOT, " %s %s of code and %s of prose.",
                Counted.agreeing(author.pullRequests().size(), "It writes", "They write"),
                Counted.of(statements, "statement"), Counted.of(prose, "line")));
    }

    private LiTag tested(final AuthorPullRequests author) {
        final int methods = AuthorTotals.testMethodsAdded(author);
        final String add = Counted.agreeing(author.pullRequests().size(), "It adds", "They add");
        if (methods == 0) {
            return line("What arrives tested", "untested", text(quality.tested(author)),
                    text(" " + add + " no test method."));
        }
        return line("What arrives tested", "untested", text(quality.tested(author)),
                text(String.format(Locale.ROOT, " %s %s.", add, Counted.of(methods, "test method"))));
    }

    private LiTag leaves(final AuthorPullRequests author) {
        return line("What the code looks like", "review", text(quality.complexity(author)),
                text(" " + quality.outliers(author)), repeated(author));
    }

    /** What they write twice, left off where every method body of theirs stands once. */
    private static DomContent repeated(final AuthorPullRequests author) {
        final int statements = AuthorTotals.statementsRepeated(author);
        if (statements == 0) {
            return span("");
        }
        return span().with(span(String.format(Locale.ROOT, " %s stand in a method body another of "
                        + "their own methods writes too, the biggest of those bodies carrying %d",
                Counted.of(statements, "statement"), AuthorTotals.biggestRepeat(author))),
                Footnotes.marker(Footnotes.REPEATED), span("."));
    }

    /** How far each description sits from the code shipped with it, counted by band, strongest first. */
    private LiTag described(final AuthorPullRequests author) {
        final List<Map.Entry<StatementFit, Long>> fits = AuthorTotals.fits(author);
        final String asked = Counted.agreeing(author.pullRequests().size(),
                "How well the description fits", "How well the descriptions fit");
        if (fits.isEmpty()) {
            return line(asked, "subjects", text(Counted.agreeing(author.pullRequests().size(),
                    "No description was fetched for it.",
                    "No description was fetched for any of them.")));
        }
        return line(asked, "subjects",
                text("The fit is " + fits.stream()
                        .map(band -> band.getKey().shown() + " in " + band.getValue())
                        .collect(Collectors.joining(", ")) + "."),
                Footnotes.marker(Footnotes.FIT));
    }

    /** One line: the question it answers, linked to the section that carries the figures behind it. */
    private static LiTag line(final String asked, final String section, final DomContent... said) {
        return li().with(b().with(a(asked).withHref("#" + section)), span(" — ")).with(said);
    }

    /** A list of names, each in italics, closing with a full stop. */
    private static DomContent named(final List<String> names) {
        return each(names, name -> span().with(em(name),
                text(name.equals(names.getLast()) ? "." : ", ")));
    }
}
