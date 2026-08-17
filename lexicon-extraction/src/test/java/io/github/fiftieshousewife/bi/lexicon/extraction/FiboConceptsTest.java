package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FiboConceptsTest {

    private static final String FIBO = "https://spec.edmcouncil.org/fibo/ontology/";
    private static final String RDFS_LABEL = "http://www.w3.org/2000/01/rdf-schema#label";
    private static final String DEFINITION = "http://www.w3.org/2004/02/skos/core#definition";
    private static final String EXAMPLE = "http://www.w3.org/2004/02/skos/core#example";
    private static final String SYNONYM = "https://www.omg.org/spec/Commons/AnnotationVocabulary/synonym";
    private static final String ABBREVIATION =
            "https://www.omg.org/spec/Commons/AnnotationVocabulary/abbreviation";
    private static final String ADAPTED_FROM =
            "https://www.omg.org/spec/Commons/AnnotationVocabulary/adaptedFrom";

    private static final OwlClass SWAP = new OwlClass(FIBO + "DER/RateDerivatives/IRSwaps/InterestRateSwap",
            "InterestRateSwap", "InterestRateDerivative",
            Map.of(RDFS_LABEL, List.of("interest rate swap"),
                    DEFINITION, List.of("swap whose underlier is an interest rate"),
                    ADAPTED_FROM, List.of("ISDA 2021 definitions"),
                    EXAMPLE, List.of("a fixed-for-floating swap")));

    private static final OwlClass DEFAULT_SWAP = new OwlClass(FIBO + "DER/CreditDerivatives/CDS",
            "CreditDefaultSwap", "InterestRateSwap",
            Map.of(RDFS_LABEL, List.of("credit default swap"),
                    SYNONYM, List.of("credit swap"), ABBREVIATION, List.of("CDS")));

    private static final OwlClass DANGLING = new OwlClass(FIBO + "FND/Utilities/Thing",
            "Thing", "SomethingTheCommonsVocabularyStates", Map.of());

    private final List<SkosConcept> concepts =
            new FiboConcepts().in(List.of(SWAP, DEFAULT_SWAP, DANGLING));

    @Test
    void takesTheTermAsPublishedBecauseThatIsWhatTheCodeWouldWrite() {
        assertThat(concepts).extracting(SkosConcept::prefLabel)
                .containsExactly("InterestRateSwap", "CreditDefaultSwap", "Thing");
    }

    @Test
    void carriesWhatThePublisherSaysTheConceptMeans() {
        assertThat(concept("InterestRateSwap").definition())
                .isEqualTo("swap whose underlier is an interest rate");
    }

    @Test
    void dropsALabelThatSaysOnlyWhatTheIdentifierAlreadySays() {
        assertThat(concept("InterestRateSwap").altLabel())
                .as("`interest rate swap` against `InterestRateSwap` is not another name for the concept")
                .isEmpty();
    }

    @Test
    void keepsEveryNameThePublisherStatesThatTheIdentifierDoesNot() {
        assertThat(concept("CreditDefaultSwap").altLabel())
                .as("a synonym and an abbreviation are each a published statement of what else it is "
                        + "called, and an abbreviation is what a program is most likely to have written")
                .isEqualTo("credit swap | CDS");
    }

    @Test
    void poolsWhatThePublisherSaysAboutAConceptBesidesItsMeaning() {
        assertThat(concept("InterestRateSwap").note())
                .as("where a definition was taken from, then what qualifies it — provenance first, "
                        + "because that is the part that makes a match citable outside the ontology")
                .isEqualTo("ISDA 2021 definitions | a fixed-for-floating swap");
    }

    @Test
    void filesAConceptUnderTheModuleThePublishersOwnUriNames() {
        assertAll(
                () -> assertThat(concept("InterestRateSwap").module()).isEqualTo("DER"),
                () -> assertThat(concept("Thing").module()).isEqualTo("FND"));
    }

    @Test
    void dropsASuperclassTheFileSetStatesButDoesNotItselfCarry() {
        assertThat(concept("Thing").broader())
                .as("a roll-up must not climb to a concept nothing here can answer for")
                .isEmpty();
    }

    @Test
    void keepsTheClassTheOntologyStatesBeneathAnotherItDoesCarry() {
        assertThat(concept("CreditDefaultSwap").broader()).isEqualTo("InterestRateSwap");
    }

    private SkosConcept concept(final String term) {
        return concepts.stream().filter(concept -> term.equals(concept.prefLabel())).findFirst().orElseThrow();
    }
}
