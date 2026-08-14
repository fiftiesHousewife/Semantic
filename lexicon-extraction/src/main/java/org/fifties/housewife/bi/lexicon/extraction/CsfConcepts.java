package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * The Cybersecurity Framework's own nodes as taxonomy concepts: a function, the categories under it, and
 * the subcategories under those, each carrying the outcome NIST states it as.
 *
 * <p>A withdrawn concept is dropped, and the drop is the publisher's statement rather than ours: CSF 2.0
 * carries its predecessor's categories with a {@code withdrawn} status and an {@code incorporated_into}
 * link naming where each went. What survives is what NIST publishes as the framework — and it comes out at
 * the six functions, twenty-two categories and one hundred and six subcategories NIST says it has, which is
 * how the extraction is checked against the publication rather than against itself.
 *
 * <p>{@code module} is the function a concept rolls up to, reached through the document's own nesting. Six
 * functions is the level the framework itself names, so it is the level a reading can report at without
 * inventing a grouping to report.
 */
public class CsfConcepts {

    /**
     * OSCAL states no provenance for a control beyond the catalogue it is published in, which is the file
     * itself. There is nothing in the source being passed over here.
     */
    private static final String NO_NOTE = "";

    private final RollUp functions = new RollUp();

    public List<SkosConcept> in(final List<OscalControl> controls) {
        final Map<String, OscalControl> byId = controls.stream()
                .collect(Collectors.toMap(OscalControl::id, Function.identity()));
        return controls.stream().filter(control -> !control.withdrawn())
                .map(control -> concept(control, byId)).toList();
    }

    private SkosConcept concept(final OscalControl control, final Map<String, OscalControl> byId) {
        return new SkosConcept(control.id(), control.title(), altLabel(control), control.broader(),
                control.kind(), functions.topOf(control, byId).id(), control.definition(), NO_NOTE);
    }

    /** The label published beside a title — {@code GOVERN (GV)} — wherever a different one is published. */
    private static String altLabel(final OscalControl control) {
        return control.label().equals(control.title()) ? "" : control.label();
    }
}
