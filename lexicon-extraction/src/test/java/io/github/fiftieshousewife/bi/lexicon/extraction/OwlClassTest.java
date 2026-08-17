package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OwlClassTest {

    @Test
    void keepsItsAnnotationsWhenTheSourceListChangesAfterConstruction() {
        final List<String> statements = new ArrayList<>(List.of("a noun"));
        final OwlClass owl = new OwlClass("urn:x#Noun", "Noun", "", Map.of("comment", statements));
        statements.add("a verb");
        assertThat(owl.statedIn("comment")).containsExactly("a noun");
    }
}
