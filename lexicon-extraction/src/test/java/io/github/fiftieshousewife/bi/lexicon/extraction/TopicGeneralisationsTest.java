package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class TopicGeneralisationsTest {

    private static final String MODULE = """
            valid_topics = {
                "computing",
                "sciences",
            }

            topic_generalize_map = {
                "computing": "engineering mathematics",
                "mathematics": "sciences",
                "card games": "games",
                '"manner of action"': "manner",
                "Tham": "Buddhism",  # Buddhist religious script
            }

            for topic in topic_generalize_map.keys():
                pass
            """;

    private final TopicGeneralisations generalisations = new TopicGeneralisations();

    @Test
    void readsATopicsBroaderTopicsFromTheMapThatDerivesThem() {
        assertThat(generalisations.in(MODULE))
                .containsEntry("computing", Set.of("engineering", "mathematics"))
                .containsEntry("mathematics", Set.of("sciences"));
    }

    @Test
    void hyphenatesAKeyAsTheModuleHyphenatesItBeforeUse() {
        assertThat(generalisations.in(MODULE)).containsEntry("card-games", Set.of("games"));
    }

    @Test
    void readsAnEntryTheModuleQuotedOddlyOrCommentedOn() {
        assertAll(
                () -> assertThat(generalisations.in(MODULE))
                        .containsEntry("manner-of-action", Set.of("manner")),
                () -> assertThat(generalisations.in(MODULE)).containsEntry("Tham", Set.of("Buddhism")));
    }

    @Test
    void readsTheMapAloneAndNotTheTopicsListedBesideIt() {
        assertThat(generalisations.in(MODULE)).doesNotContainKey("sciences");
    }

    @Test
    void refusesAModuleStatingNoMapRatherThanReadingItAsEmpty() {
        assertAll(
                () -> assertThatThrownBy(() -> generalisations.in("valid_topics = {}\n"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("topic_generalize_map"),
                () -> assertThatThrownBy(() -> generalisations.in("topic_generalize_map = {\n  \"a\": \"b\","))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("never closed"));
    }

    @Test
    void poolsEveryLineNamingTheSameTopic() {
        assertThat(generalisations.in("""
                topic_generalize_map = {
                    "computing": "engineering",
                    "computing": "mathematics",
                }
                """))
                .isEqualTo(Map.of("computing", Set.of("engineering", "mathematics")));
    }
}
