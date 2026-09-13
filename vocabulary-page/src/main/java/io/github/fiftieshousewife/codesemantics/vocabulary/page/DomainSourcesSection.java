package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Locale;
import java.util.stream.Collectors;

import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.SectionTag;

import static j2html.TagCreator.b;
import static j2html.TagCreator.each;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.section;
import static j2html.TagCreator.text;
import static j2html.TagCreator.ul;

/**
 * The page section naming the resources the domain claims rest on: one row per bundled domain source,
 * with its coverage of the same significant words, its leading domains, and what it labels a word by.
 */
final class DomainSourcesSection {

    SectionTag markup(final DomainSources sources) {
        return section().withId("sources").with(
                h2("What each source states about the words"),
                p().withClass("lede").withText("One row per bundled domain source, over the same "
                        + "significant words: how many of them it labels with anything, and where it "
                        + "puts most of the weight it places. The picture above draws WordNet Domains; "
                        + "the other rows read the same words through their own labels."),
                ul().withClass("sources").with(each(sources.rows(),
                        row -> row(row, sources.significantWords()))));
    }

    private static LiTag row(final DomainSources.Row row, final int significantWords) {
        return li(
                b(row.source()),
                text(String.format(Locale.ROOT,
                        " — labels %d of %d words; most weight on %s. %s",
                        row.placedWords(), significantWords, leading(row), row.description())));
    }

    private static String leading(final DomainSources.Row row) {
        return row.leading().stream()
                .map(one -> String.format(Locale.ROOT, "%s (%.0f%%)",
                        PublishedSpelling.shown(one.domain()), one.share() * 100))
                .collect(Collectors.joining(", "));
    }
}
