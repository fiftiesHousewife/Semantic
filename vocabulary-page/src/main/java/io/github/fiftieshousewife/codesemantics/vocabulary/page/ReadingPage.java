package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedConcept;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSummary;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import j2html.tags.specialized.BodyTag;
import j2html.tags.specialized.DivTag;
import j2html.tags.specialized.LiTag;
import j2html.tags.specialized.SectionTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.b;
import static j2html.TagCreator.body;
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
import static j2html.TagCreator.style;
import static j2html.TagCreator.text;
import static j2html.TagCreator.ul;

/**
 * One repository's findings on one page: the answer sentences in the fold, the matched phrases with the
 * publisher's own prose, each scheme's placement against its shuffle, and the two shares everything rests
 * on. Every figure on the page appears in the reading it was drawn from, and an empty result is a stated
 * sentence rather than an absent section.
 */
public final class ReadingPage {

    private final String stylesheet;

    private final String behaviour;

    private final FindingSentences sentences = new FindingSentences();

    public ReadingPage(final String stylesheet, final String behaviour) {
        this.stylesheet = stylesheet;
        this.behaviour = behaviour;
    }

    /** The whole page: the sections from the reading, the two figures from the data block. */
    public String markup(final ReadingExport reading, final String data) {
        return PageDocument.of(reading.summary().repository(), page(reading, data).render());
    }

    private BodyTag page(final ReadingExport reading, final String data) {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        header().withClass("fold").with(
                                p().withClass("nav").with(
                                        a("← every reading").withHref("../readings.html")),
                                h1(reading.summary().repository()),
                                each(sentences.of(reading),
                                        sentence -> p(sentence).withClass("finding"))),
                        words(),
                        domains(),
                        phrases(reading),
                        placements(reading),
                        ground(reading.summary())),
                script().withType("application/json").withId("reading").with(rawHtml(data)),
                script(rawHtml(behaviour)));
    }

    private static SectionTag words() {
        return section().withId("words").with(
                h2("The words it chose"),
                p().withClass("lede").withText("Every signal merged to its dictionary meaning. A "
                        + "word’s size is its score in bits against the reference writing it lowest, "
                        + "its weight is how far that score stands outside chance, and a coloured mark "
                        + "names one of the three leading domains drawn below."),
                div().withClass("cloud"),
                p().withClass("readout cloud-readout"));
    }

    private static SectionTag domains() {
        return section().withId("domains").with(
                h2("What those words are about"),
                p().withClass("lede").withText("The three domains carrying most of the words’ weight, "
                        + "as overlapping sets. A word sits in every domain any of its senses states, "
                        + "so an overlap holds the words placed in both of its domains; a count opens "
                        + "its overlap’s words."),
                div().withClass("figure"),
                p().withClass("readout venn-readout"),
                div().withClass("overlaps"),
                p().withClass("foot"));
    }

    private SectionTag phrases(final ReadingExport reading) {
        final SectionTag drawn = section().withId("phrases")
                .with(h2("The phrases a publisher states"));
        if (reading.taxonomies().isEmpty()) {
            drawn.with(p("No published vocabulary wrote more of its phrases here than a deal of its "
                    + "own words reaches."));
        }
        reading.taxonomies().forEach(vocabulary -> drawn.with(
                h3(vocabulary.vocabulary()),
                ul().withClass("concepts").with(each(vocabulary.concepts(),
                        concept -> conceptRow(vocabulary, concept)))));
        reading.setAside().vocabulariesBelowTheirChanceBar().forEach(refused ->
                drawn.with(p(sentences.refused(refused)).withClass("refused")));
        return drawn;
    }

    private static LiTag conceptRow(final ExportedTaxonomy vocabulary, final ExportedConcept concept) {
        return li(
                b(concept.term()),
                text(" — " + concept.concept() + pathOf(concept) + ", " + written(concept) + "."),
                p(ConceptProse.of(vocabulary.vocabulary(), concept)).withClass("prose"));
    }

    private static String pathOf(final ExportedConcept concept) {
        return concept.statedPath().isEmpty()
                ? "" : ", under " + String.join(" › ", concept.statedPath());
    }

    private static String written(final ExportedConcept concept) {
        return concept.occurrences() == 1
                ? "written once"
                : String.format(Locale.ROOT, "written %d times", concept.occurrences());
    }

    private SectionTag placements(final ReadingExport reading) {
        final SectionTag drawn = section().withId("placements")
                .with(h2("Where the schemes place it"));
        reading.summary().placedIn().forEach(scheme -> drawn.with(
                h3(scheme.scheme()),
                level(scheme.scheme(), scheme.archive()),
                level(scheme.scheme(), scheme.category())));
        return drawn;
    }

    private DivTag level(final String scheme, final ExportedPlacement.Level level) {
        final DivTag drawn = div().withClass("level")
                .with(p(sentences.placement(scheme, level)));
        if (!level.carriedBy().isEmpty()) {
            drawn.with(ul().withClass("met-on").with(each(level.carriedBy(),
                    topic -> li(shares(topic)))));
        }
        return drawn;
    }

    private static String shares(final ExportedPlacement.CarryingTopic topic) {
        return String.format(Locale.ROOT,
                "%s — %.1f%% of the repository, %.1f%% of the subject’s description",
                topic.topic(), topic.shareOfRepository() * 100, topic.shareOfSubject() * 100);
    }

    private static SectionTag ground(final ExportedSummary summary) {
        return section().withId("ground").with(
                h2("What this rests on"),
                p(String.format(Locale.ROOT,
                        "Some bundled resource can be cited for %.1f%% of the word occurrences. "
                                + "%.1f%% of the observed evidence resolves to no subject. The answers "
                                + "are in reading.json and the workings in evidence.json, in this "
                                + "reading’s own folder.",
                        summary.shareOfWordsWithACitation() * 100,
                        summary.shareOfMassOnNoSubject() * 100)));
    }
}
