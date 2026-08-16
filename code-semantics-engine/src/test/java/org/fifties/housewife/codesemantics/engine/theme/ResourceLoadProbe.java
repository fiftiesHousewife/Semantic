package org.fifties.housewife.codesemantics.engine.theme;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.WordNetLexicon;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.engine.vocabulary.ChosenWords;
import org.fifties.housewife.codesemantics.engine.vocabulary.EnglishVocabulary;
import org.fifties.housewife.codesemantics.engine.vocabulary.PlatformNames;
import org.fifties.housewife.codesemantics.engine.vocabulary.PlatformVocabulary;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/** What each bundled resource costs to read, so a decision to read it once is taken on a number. */
@Tag("diagnostic")
class ResourceLoadProbe {

    private static final Map<String, Supplier<Object>> LOADERS = new LinkedHashMap<>();

    static {
        LOADERS.put("WordNetLexicon", WordNetLexicon::fromClasspath);
        LOADERS.put("ArxivSubjects", ArxivSubjects::fromClasspath);
        LOADERS.put("IdentifierWords", IdentifierWords::fromClasspath);
        LOADERS.put("CollocatedWords", CollocatedWords::fromClasspath);
        LOADERS.put("OfferedWords", OfferedWords::fromClasspath);
        LOADERS.put("TopicCitations", TopicCitations::fromClasspath);
        LOADERS.put("SenseCoverage", SenseCoverage::fromClasspath);
        LOADERS.put("StatedTopics", StatedTopics::fromClasspath);
        LOADERS.put("OrdinaryEnglish", OrdinaryEnglish::fromClasspath);
        LOADERS.put("SubjectAreas", SubjectAreas::fromClasspath);
        LOADERS.put("FieldOfStudy", FieldOfStudy::fromClasspath);
        LOADERS.put("PlatformNames", PlatformNames::ofSystem);
        LOADERS.put("PlatformVocabulary", PlatformVocabulary::ofSystem);
        LOADERS.put("EnglishVocabulary", EnglishVocabulary::fromClasspath);
        LOADERS.put("ChosenWords", ChosenWords::againstEnglishAndThePlatform);
    }

    @Test
    void reportsWhatEachBundledResourceCostsToReadTwice() {
        System.out.printf("%n%-20s %10s %10s%n", "resource", "first ms", "again ms");
        LOADERS.forEach((name, loader) -> {
            final long first = millisOf(loader);
            final long again = millisOf(loader);
            System.out.printf("%-20s %10d %10d%n", name, first, again);
        });

        assertThat(LOADERS).isNotEmpty();
    }

    private static long millisOf(final Supplier<Object> loader) {
        final long startedAt = System.nanoTime();
        assertThat(loader.get()).isNotNull();
        return (System.nanoTime() - startedAt) / 1_000_000L;
    }
}
