package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import j2html.tags.specialized.BodyTag;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.li;
import static j2html.TagCreator.p;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.style;
import static j2html.TagCreator.text;
import static j2html.TagCreator.ul;

/**
 * Every published reading on one figure, each answering source placed by how far past its own chance bar
 * it stands, with the evidence behind each reading beneath it.
 *
 * <p>Markup is never a string in a Java file, the stylesheet and the script are their own files carried
 * whole into the page, and the figure is drawn by the script from the data block — the same contract as
 * {@link DomainVennPage}, for the same reason: a mark's position is geometry, and geometry belongs where
 * it can be computed.
 *
 * <p><b>A table was tried and is what this replaces.</b> Nine columns, one of them a paragraph and eight
 * of them four characters, and a reader could not see from it which readings rest on strong evidence and
 * which cleared their bar by a tenth. The figure says that without a figure being read.
 *
 * <p>The heading, the lede and the figure share one viewport height, so every reading is on screen before
 * anything scrolls; the evidence follows below it.
 */
public final class ReadingsPage {

    private static final String PERMUTATION = "https://www.jstor.org/stable/2984158";
    private static final String DIVERGENCE = "https://ieeexplore.ieee.org/document/61115";

    private final String data;
    private final String stylesheet;
    private final String behaviour;

    public ReadingsPage(final String data, final String stylesheet, final String behaviour) {
        this.data = data;
        this.stylesheet = stylesheet;
        this.behaviour = behaviour;
    }

    public String markup() {
        return PageDocument.of("The readings", page().render());
    }

    private BodyTag page() {
        return body(
                style(rawHtml(stylesheet)),
                div().withClass("sheet").with(
                        h1("The readings"),
                        p().withClass("nav").with(
                                a("matches per vocabulary").withHref("taxonomy-matches.html")),
                        p().withClass("lede").with(
                                text("What each repository is about: the subjects its publishers place "
                                        + "the phrases it wrote under, most-written first. A subject is "
                                        + "the publisher's own — this repository writes "
                                        + "key agreement and public key certificates, and CSO states "
                                        + "that both sit under public key cryptography. Two publishers "
                                        + "naming one subject stay two entries, because deciding they "
                                        + "meant the same thing is a judgement nothing here can cite. "
                                        + "Rest on one for the concepts behind it, each named as its "
                                        + "publisher spells it. Above them, what the "
                                        + "standards that answered are themselves about: FpML's "
                                        + "derivatives, CWE's software weaknesses. A subject an outright "
                                        + "majority of these readings name is left out, because it "
                                        + "separates none of them from the others — CSO answers ten of "
                                        + "the twelve and states computer science for all ten, which "
                                        + "tells a reader only that they are software. Beneath each, "
                                        + "where "
                                        + "a subject scheme separated the repository from a scheme of "
                                        + "chance, the subject it stood nearest to — nothing is matched "
                                        + "there and the answer is a distance against published prose, "
                                        + "which is weaker evidence than a publisher stating that a run "
                                        + "this repository wrote is a term of its field. It is here "
                                        + "because a scheme names a subject in ordinary English where a "
                                        + "vocabulary names an identifier.")),
                        div().withClass("about"),
                        p().withClass("readout"),
                        div().withClass("fold").with(
                                h1("How far past chance each answer stands"),
                                p().withClass("lede").with(
                                        text("Every published reading, and every source that cleared the "
                                                + "bar of the rung answering it. A source stands where "
                                                + "its own evidence puts it: a vocabulary at the "
                                                + "multiple of the count the best of a field of seven "
                                                + "reaches by "),
                                        a("dealing").withHref(PERMUTATION),
                                        text(" that publisher's own words at random, a subject scheme at "
                                                + "how many bits nearer than a scheme of chance its "
                                                + "placement stood, in "),
                                        a("Jensen–Shannon divergence").withHref(DIVERGENCE),
                                        text(". The two are different quantities and share no axis, so "
                                                + "the schemes stand in their own band — and a reading "
                                                + "a scheme answered is one whose vocabularies said "
                                                + "nothing.")),
                                p().withClass("views"),
                                div().withClass("figure")),
                        div().withClass("evidence"),
                        ul().withClass("method").with(
                                li().with(text("A mark's position is how far past its own bar the source "
                                        + "stands, on a log scale with the bar itself at the left. A "
                                        + "mark on the rule cleared by nothing worth reading.")),
                                li().with(text("A mark's area is how many of the publisher's terms of "
                                        + "more than one word the repository wrote, which is the count "
                                        + "the bar is computed over. A scheme matches nothing and its "
                                        + "marks are one size.")),
                                li().with(text("A parent is the one level the publisher states directly "
                                        + "above a concept, and the fold groups the concepts a "
                                        + "vocabulary matched by it.")),
                                li().with(text("The path beside an answer is every level the publisher "
                                        + "states above it, broadest first, with the levels an outright "
                                        + "majority of that vocabulary sits beneath left off — CSO's "
                                        + "computer science, FIX's Common, FIBO's FND — because a level "
                                        + "every match shares names only the vocabulary that matched.")),
                                li().with(text("A path of nothing is the publisher placing the concept "
                                        + "nowhere, which FpML does for 616 of its 1,405 types.")),
                                li().with(text("The count beside a source is taken at the words level: "
                                        + "both it and the deals behind the bar compare the words the two "
                                        + "sides wrote. A match a dictionary reached is listed and says "
                                        + "which level reached it, and the bar did not test it.")),
                                li().with(text("A description is the nearest prose the publisher states "
                                        + "at or above the concept. Where it states none for the concept "
                                        + "itself, the level it does state one for is named: CSO says "
                                        + "nothing about public keys and describes public key "
                                        + "cryptography, which is what the line then shows.")),
                                li().with(text("The mark beside a repository is whether the area a "
                                        + "manifest states for it is the area a scheme placed it in, or "
                                        + "one that area descends from. It is drawn only where a "
                                        + "manifest names the repository, and it scores nothing.")))),
                script().withType("application/json").withId("readings").with(rawHtml(data)),
                script(rawHtml(behaviour)));
    }
}
