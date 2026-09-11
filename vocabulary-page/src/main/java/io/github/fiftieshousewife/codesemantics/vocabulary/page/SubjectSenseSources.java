package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import io.github.fiftieshousewife.codesemantics.engine.term.SubjectDomains;
import io.github.fiftieshousewife.codesemantics.engine.term.TopicLabelDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.CsoTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;

/**
 * The subject schemes' word-to-sense paths, by the name each is probed under. Every sense they state is
 * uncounted, which is what the corroborated weight applies to, so the probes that measure that weight read
 * the schemes through here.
 */
final class SubjectSenseSources {

    private static final String CATEGORY = "category";

    private static final String SUBFIELD = "subfield";

    /** Each scheme's word index is built once per JVM: a bundled taxonomy cannot change under a running program. */
    private static final SubjectDomains ARXIV_CATEGORIES =
            new SubjectDomains(ArxivSubjects.fromClasspath(), WordNetLexicon.fromClasspath(), CATEGORY);

    private static final SubjectDomains OPENALEX_SUBFIELDS =
            new SubjectDomains(OpenAlexTopics.fromClasspath(), WordNetLexicon.fromClasspath(), SUBFIELD);

    /** CSO states labels and no prose, so its word index reads the labels — see {@link TopicLabelDomains}. */
    private static final TopicLabelDomains CSO_TOPICS =
            new TopicLabelDomains(CsoTopics.fromClasspath().concepts(), WordNetLexicon.fromClasspath());

    private SubjectSenseSources() {
    }

    static Map<String, Function<String, List<CountedSenseDomains>>> bySource(
            final CorroboratedSenses corroborated) {
        final Map<String, Function<String, List<CountedSenseDomains>>> paths = new LinkedHashMap<>();
        paths.put("arXiv categories",
                word -> corroborated.of(ARXIV_CATEGORIES.countedSenseDomainsOf(word)));
        paths.put("OpenAlex subfields",
                word -> corroborated.of(OPENALEX_SUBFIELDS.countedSenseDomainsOf(word)));
        paths.put("CSO topics", word -> corroborated.of(CSO_TOPICS.countedSenseDomainsOf(word)));
        return paths;
    }
}
