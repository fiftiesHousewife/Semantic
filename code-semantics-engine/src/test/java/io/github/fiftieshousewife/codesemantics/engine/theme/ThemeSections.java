package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import j2html.tags.DomContent;

import static j2html.TagCreator.caption;
import static j2html.TagCreator.code;
import static j2html.TagCreator.dd;
import static j2html.TagCreator.div;
import static j2html.TagCreator.dt;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.p;
import static j2html.TagCreator.section;
import static j2html.TagCreator.span;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.tr;

/**
 * The parts of the page that are the same shape wherever they appear — a section under its heading, a
 * figure in the masthead, a table of rows — and the two tables whose rows are a clause and a word rather
 * than a theme.
 */
final class ThemeSections {

    DomContent heading(final String heading, final String explaining) {
        return div(h2(heading), p(explaining).withClass("note")).withClass("section-head");
    }

    DomContent figure(final String naming, final String reads) {
        return div(dt(naming), dd(reads)).withClass("stat");
    }

    DomContent strangeResults() {
        return section(div(h2(PageProse.STRANGE_HEADING)).withClass("section-head"),
                p(PageProse.STRANGE_LAW).withClass("note"),
                p(PageProse.STRANGE_HIERARCHY).withClass("note"),
                p(PageProse.STRANGE_REST).withClass("note"));
    }

}
