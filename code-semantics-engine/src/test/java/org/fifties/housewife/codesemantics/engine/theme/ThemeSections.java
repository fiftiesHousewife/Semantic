package org.fifties.housewife.codesemantics.engine.theme;

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

    private static final int CLAUSES_SHOWN = 4;

    private static final List<String> VERB_COLUMNS = List.of("Verb", "Times", "What it acts on");

    private static final List<String> FOREIGN_COLUMNS = List.of("Word", "Distance", "Written",
            "The dictionary places it in");

    DomContent heading(final String heading, final String explaining) {
        return div(h2(heading), p(explaining).withClass("note")).withClass("section-head");
    }

    DomContent figure(final String naming, final String reads) {
        return div(dt(naming), dd(reads)).withClass("stat");
    }

    DomContent behaviours(final List<ThemeGraph.Verb> verbs) {
        return section(heading(PageProse.BEHAVIOUR_HEADING, PageProse.BEHAVIOUR),
                div(table(caption(PageProse.BEHAVIOUR_CAPTION),
                        columns(VERB_COLUMNS),
                        tbody(each(verbs, this::verb)))).withClass("scroller"));
    }

    private DomContent verb(final ThemeGraph.Verb verb) {
        return tr(th(verb.verb()).attr("scope", "row"),
                td(ThemeTables.count(verb.times())).withClass("n"),
                td(each(verb.clauses().stream().limit(CLAUSES_SHOWN).map(ThemeSections::clause)))
                        .withClass("clauses"));
    }

    private static DomContent clause(final ThemeGraph.Clause clause) {
        return span(clause.sentence()).withClass("clause");
    }

    DomContent foreignWords(final List<ThemeGraph.Foreign> foreign) {
        return section(heading(PageProse.FOREIGN_HEADING, PageProse.FOREIGN),
                div(table(columns(FOREIGN_COLUMNS), tbody(each(foreign, this::foreignWord))))
                        .withClass("scroller"));
    }

    private DomContent foreignWord(final ThemeGraph.Foreign foreign) {
        return tr(th(code(foreign.word())).attr("scope", "row"),
                td(ThemeTables.bits(foreign.bits())).withClass("n"),
                td(ThemeTables.count(foreign.occurrences())).withClass("n"),
                td(String.join(", ", foreign.subjects())));
    }

    DomContent strangeResults() {
        return section(div(h2(PageProse.STRANGE_HEADING)).withClass("section-head"),
                p(PageProse.STRANGE_LAW).withClass("note"),
                p(PageProse.STRANGE_HIERARCHY).withClass("note"),
                p(PageProse.STRANGE_REST).withClass("note"));
    }

    private static DomContent columns(final List<String> named) {
        return thead(tr(each(named, column -> th(column).attr("scope", "col"))));
    }
}
