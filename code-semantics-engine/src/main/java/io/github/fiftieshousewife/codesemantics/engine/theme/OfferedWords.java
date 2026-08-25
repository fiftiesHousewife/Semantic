package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.Weights;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordPipeline;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordPipelines;

/**
 * Which words a reading offers to the resources at all, in what dictionary form, and what one occurrence of
 * each is worth before any resource has spoken. Three rules, none of them a list, and each asked of a
 * published resource:
 *
 * <p><b>Nothing is refused on its spelling.</b> A word working Java declares densely is offered like any
 * other and weighed by how densely — see {@link CorpusSpecificity}. Three stages of the word pipeline used
 * to remove {@code id}, {@code buf} and {@code the} here, and each was a gate patching a reference that had
 * no rate for a declared word. The corpus has one.
 *
 * <ul>
 *   <li>A word nothing chose is kept only where the dictionary knows it as a noun or a verb. {@code and},
 *       {@code of} and {@code that} are how English holds a sentence together, not what a sentence is
 *       about, and an open-class dictionary is what says so.</li>
 *   <li><b>A dependency's own name is not offered at all.</b> A coordinate denotes an artefact somebody
 *       else published, so asking a dictionary what it means is a category error — and the dictionary
 *       answers: {@code org.junit.jupiter} yields {@code jupiter}, the Roman god, and {@code owl} is an
 *       ontology language read as a bird. What a dependency states about a repository is stated by the
 *       artefact rather than by its spelling, so it belongs to a reading of coordinates and not to a
 *       reading of English.</li>
 *   <li>What is offered is worth what its {@link NameForm form} is worth, scaled by how much it narrows a
 *       subject at all — against the corpus of working Java where the author declared it, and against the
 *       published frequency list of English where they wrote it in a sentence.</li>
 * </ul>
 */
public final class OfferedWords {

    private final ContentWords content;
    private final WordNarrowing prose;
    private final WordNarrowing declaredNames;
    private final PublishedPhrases phrases;
    private final WordPipeline pipeline;
    private final Weights weights;

    public OfferedWords(final ContentWords content, final WordNarrowing prose,
                        final WordNarrowing declaredNames, final PublishedPhrases phrases,
                        final WordPipeline pipeline, final Weights weights) {
        this.content = content;
        this.prose = prose;
        this.declaredNames = declaredNames;
        this.phrases = phrases;
        this.pipeline = pipeline;
        this.weights = weights;
    }

    public static OfferedWords fromClasspath() {
        final ContentWords content = ContentWords.fromClasspath();
        return new OfferedWords(content, WordSpecificity.fromClasspath(),
                CorpusSpecificity.fromClasspath(), PublishedPhrases.fromClasspath(),
                WordPipelines.overJava(content), Weights.defaults());
    }

    /**
     * The same rules, weighing a declared name against one repository's own shares rather than against the
     * corpus alone. It is the only part of the reading that cannot be built from the classpath: it needs the
     * tree in front of it.
     */
    public OfferedWords readingAgainst(final WordNarrowing repositoryNames) {
        return new OfferedWords(content, prose, repositoryNames, phrases, pipeline, weights);
    }

    /**
     * The dictionary form this word is offered as, or nothing where it is a word the author did not choose
     * and the dictionary does not carry — a part of speech that holds a sentence together rather than saying
     * what it is about. A name the repository chose is otherwise always offered, whether or not any
     * dictionary knows it: an unread name is a finding, where an unread preposition is grammar.
     *
     * <p>A run of words a resource publishes as one entry is offered exactly as that resource writes it. It
     * arrives already in the dictionary's own form, because being in that form is what
     * {@link CollocatedWords} read it as a run for, and a lemmatiser asked about a collocation answers about
     * its head word — which would offer {@code base} for {@code base form} and lose the entry that was found.
     */
    public Optional<String> of(final NameForm form, final String word) {
        if (form == NameForm.IMPORT || pipeline.theDictionariesRemove(word)) {
            return Optional.empty();
        }
        if (phrases.states(word)) {
            return Optional.of(word);
        }
        return form.isChosenName() ? Optional.of(content.lemmaOrSurface(word)) : content.lemmaOf(word);
    }

    /** What one phrase in this position is worth, whatever it turns out to be about. */
    public double formWorth(final NameForm form) {
        return form.isProse() ? weights.prose() : weights.declaredName();
    }

    /**
     * How much this word narrows a subject within its phrase, read off the reference the word belongs to:
     * a declared name against the corpus of working Java, a word in a sentence against the published
     * frequency list of English.
     *
     * <p>A declared name narrowed fully until the corpus was drawn, because nothing stated how densely
     * working Java declares one. That made {@code get}, {@code id} and {@code name} worth as much in a
     * phrase as {@code notional} and {@code trade}, and three stages of the word pipeline were what removed
     * them before they could be offered. The corpus states the rate, so the weight carries it and no stage
     * has to refuse a word to keep it from dominating.
     */
    public double narrowing(final NameForm form, final String lemma) {
        return form.isChosenName() ? declaredNames.of(lemma) : prose.of(lemma);
    }
}
