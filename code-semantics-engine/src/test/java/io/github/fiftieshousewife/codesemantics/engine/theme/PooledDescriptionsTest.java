package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PooledDescriptionsTest {

    private final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();

    private final PooledDescriptions pooled = new PooledDescriptions();

    @Test
    void joinsTheDescriptionsThePublisherStatesUnderOneBroaderSubject() {
        final SkosConcept computerScience = broader("cs");
        assertAll(
                () -> assertThat(computerScience.prefLabel()).isEqualTo("Computer Science"),
                () -> assertThat(computerScience.definition())
                        .contains("natural language processing")
                        .contains("indexing, dictionaries, retrieval"));
    }

    @Test
    void groupsByTheTaxonomysOwnBroaderColumnAndNotByAnyGroupingOfItsOwn() {
        assertThat(pooled.broaderThan(taxonomy.described(), taxonomy)).extracting(SkosConcept::concept)
                .containsExactlyInAnyOrderElementsOf(taxonomy.described().stream()
                        .map(SkosConcept::broader).distinct().toList());
    }

    @Test
    void keepsTheBroaderSubjectsOwnPlaceInTheHierarchy() {
        assertThat(broader("cs").module()).isEqualTo("grp_cs");
    }

    @Test
    void marksAPooledSubjectAsTheLevelItWasPooledTo() {
        assertThat(pooled.broaderThan(taxonomy.described(), taxonomy))
                .allMatch(subject -> "archive".equals(subject.kind()));
    }

    private SkosConcept broader(final String concept) {
        final List<SkosConcept> subjects = pooled.broaderThan(taxonomy.described(), taxonomy);
        return subjects.stream().filter(subject -> concept.equals(subject.concept())).findFirst()
                .orElseThrow();
    }
}
