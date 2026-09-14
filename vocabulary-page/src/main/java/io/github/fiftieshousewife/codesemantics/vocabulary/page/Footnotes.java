package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.SectionTag;
import j2html.tags.specialized.SupTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.li;
import static j2html.TagCreator.ol;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.sup;

/**
 * The notes the report's figures rest on, kept out of the sentences that carry them. A marker beside a
 * claim links to the note, and the note names the publisher whose definition the claim uses.
 */
final class Footnotes {

    /** What Conventional Commits is, and where the word beside a change comes from. */
    static final int CONVENTION = 1;

    /** How the fit between a description and its code is measured and banded. */
    static final int FIT = 2;

    /** What an untested type is counted by, and what the count does not say. */
    static final int UNTESTED = 3;

    /** Why the kinds of file sum to fewer than the files changed. */
    static final int OUTSIDE_THE_BUILD = 4;

    private Footnotes() {
    }

    /** The marker that links a claim to its note. */
    static SupTag marker(final int note) {
        return sup().with(a(String.valueOf(note))
                .withHref(String.format(Locale.ROOT, "#note-%d", note))
                .withId(String.format(Locale.ROOT, "marker-%d", note)));
    }

    static SectionTag markup() {
        return section().withId("notes").with(
                h2("Notes"),
                ol().withClass("notes").with(each(List.of(convention(), fit(), untested(), outside()),
                        note -> note)));
    }

    private static LiTag convention() {
        return li().withId("note-" + CONVENTION).with(
                a("Conventional Commits").withHref("https://www.conventionalcommits.org/en/v1.0.0/"),
                span(" is a convention for writing commit messages: one beginning "),
                span("feat:").withClass("token"),
                span(" says the change adds a feature, one beginning "),
                span("fix:").withClass("token"),
                span(" that it repairs a defect. Where a pull request's own statement uses none of its "
                        + "words, the word beside the change is the one that standard's definition "
                        + "covers the measured shape with — what the code does, rather than what its "
                        + "author wrote. "),
                a("Every shape and the word it falls under").withHref("../" + ChangeShapeTable.FILE),
                span(" is one table, the shapes that name nothing among them."));
    }

    private static LiTag outside() {
        return li().withId("note-" + OUTSIDE_THE_BUILD).with(
                span("The kinds count the files the build declares — its source sets, its module chain, "
                        + "the documentation directory — so they sum to fewer than the files changed "
                        + "wherever a pull request touches one the build declares nowhere, such as a "
                        + "changelog. How many those are is published as "),
                span("filesUnread").withClass("token"),
                span("."));
    }

    private static LiTag untested() {
        return li().withId("note-" + UNTESTED).with(
                span("A type counts as untested where the pull request adds it to a source set the "
                        + "build publishes and adds no class whose name "),
                a("Maven Surefire's default includes")
                        .withHref("https://maven.apache.org/surefire/maven-surefire-plugin/"
                                + "test-mojo.html#includes"),
                span(" would run as its test — "),
                span("Test*").withClass("token"),
                span(", "),
                span("*Test").withClass("token"),
                span(", "),
                span("*Tests").withClass("token"),
                span(" or "),
                span("*TestCase").withClass("token"),
                span(". It says no test arrived with the type. A type a test already standing in the "
                        + "repository exercises is counted here all the same, because the reading runs "
                        + "nothing and measures no coverage."));
    }

    private static LiTag fit() {
        return li().withId("note-" + FIT).with(
                span("How well a description fits its code is the "),
                a("Jensen–Shannon divergence").withHref("https://doi.org/10.1109/18.61115"),
                span(" between a reading of what the pull request says and a reading of what it changes, "
                        + "compared with 100 descriptions of the same shape built from that code's own "
                        + "words at random. It reads high where fewer than 5 of those 100 sit closer to "
                        + "the code, medium where fewer than 10 do, and uncertain where more do — the "
                        + "two significance levels published practice states."));
    }
}
