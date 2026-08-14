# code-semantics

A Java library that determines what subject matter a source repository is concerned with, by analysing the
words in the names its authors chose.

## The problem it addresses

Given a repository of source code, there is no reliable automated way to state what domain it belongs to.
File paths, package names and dependency lists are conventions rather than statements of subject matter, and
a search for keywords requires knowing the keywords in advance.

The names a programmer declares — classes, methods, fields, variables — are chosen deliberately and are
composed of ordinary English words. This library extracts those words, looks each one up in published
dictionaries and classification schemes, and aggregates the results into a distribution over subject
categories. That distribution can then be compared against another distribution: another part of the same
repository, a published subject taxonomy, or ordinary English.

## Terminology

This document uses terms from lexical semantics. Readers unfamiliar with them will find each one defined,
with a reference, in [`docs/GLOSSARY.md`](docs/GLOSSARY.md). The terms used most often are:

- **Identifier** — a name a programmer declared, such as `topicDistribution`.
- **Lemma** — the dictionary form of a word. *phrases*, *phrasing* and *phrased* share the lemma *phrase*.
- **Sense** — one distinct meaning of a word. The verb *cite* has eight senses in WordNet.
- **Synset** — a set of words that share a single sense. *topic*, *theme* and *subject* form one synset.
- **Content word** — a noun, verb, adjective or adverb, as distinct from a function word such as *and* or
  *of*, which carries grammatical rather than subject-matter information.
- **Corpus** — the body of text under analysis. Here, one repository's identifiers and prose.
- **Taxonomy** — a published, hierarchically arranged vocabulary. This library reads several.

## Constraints on the design

The library operates under one constraint, applied without exception:

> Every signal is a weighted vote from a citable published resource. There is no hand-written vocabulary, no
> exclusion list and no override.

The constraint exists because the alternative is unfalsifiable. A stop list of words to ignore, or a list of
directories to skip, encodes the author's judgement about a particular corpus and cannot be verified against
anything. A published resource can be cited, versioned and checked.

Four consequences follow:

1. **An analysis that cannot cite a resource abstains.** Abstention carries zero weight. It is distinct from
   a vote of zero, and is tested as such.
2. **A cited reading is consulted before any structural heuristic.**
3. **Every reported statistic has a maximum that follows from its definition.** A share is bounded at 1; a
   Jensen–Shannon divergence is bounded at 1 bit. Kullback–Leibler divergence is unbounded and is therefore
   not used.
4. **Attribution is enforced by the type system.** Constructing a vote requires a `SourceAnchor`, so an
   unattributed vote cannot exist.

Grammar is permitted where vocabulary is not. The rules that split `adjectivePhrase` into two words are a
grammar and are allowed; a list of words to treat specially is not.

## Scope

The library does not assess code quality. It does not clone or fetch repositories: it is given a local
directory path. It does not resolve types, because doing so would require the repository to compile, and a
tool that requires a compiling repository cannot analyse most repositories or most pull requests. It does not
produce a ranking without a reference distribution, because a ranking over a single scope has nothing to be
compared against.

Data that could not be interpreted is retained rather than discarded. Words no resource could read, and files
from which nothing could be extracted, are recorded as such.

## Modules

| Module | Contents |
|---|---|
| `lexicon` | Bundled lexical resources and the code that reads them: WordNet via extjwnl, Wiktionary abbreviations, topic labels and topic hierarchy, Wikidata names and initialisms, and an SQL function catalogue. |
| `lexicon-extraction` | Gradle tasks that regenerate each bundled resource from its published source at a pinned revision. |
| `code-semantics-api` | Model records and stage contracts: the evidence trail, `SourceAnchor`, `RepositoryFacts`, pooled log-odds arithmetic, the tokeniser and the word segmenter. |
| `code-semantics-engine` | The analysis pipeline: parsing, word extraction, topic resolution, divergence statistics and report generation. |

`build-logic/` contains the Gradle convention plugins (`cs.java-conventions`, `cs.java-library`,
`cs.maven-publish`, `cs.aggregate-tasks`). Module build files contain only a plugin declaration and
module-specific dependencies.

### Provenance of bundled resources

Every bundled resource carries a `#` comment header stating its source URL, the revision it was taken from
and its licence. A resource without such a header causes `VocabularyProvenanceTest` to fail the build.

The `lexicon` module is copied verbatim from a separate project, package names included, so that a change in
either can be transferred as a diff. It should be re-synchronised rather than modified in place.

[`NOTICE.md`](NOTICE.md) lists each bundled file with its source and licence, and records one outstanding
gap: WordNet's data arrives through the `extjwnl` dependency at runtime, and neither the Princeton WordNet
licence nor extjwnl's own EPL/LGPL terms are yet stated in this repository.

## Building

```bash
./gradlew checkAll          # tests and coverage verification for every module
./gradlew selfRead          # run the analysis over this repository and write the reports
./gradlew build             # assemble jars
./gradlew dependencyUpdates # report available dependency upgrades
```

Java 21 toolchain, compiled with `-Xlint:all -Werror` and Error Prone. JaCoCo enforces an 80% instruction
coverage floor on every module.

## Running the analysis over this repository

`./gradlew selfRead` runs every diagnostic over this repository and writes its reports to
[`output/`](output): legibility, topic distributions, subject placement, term matches, a taxonomy diagram and
a page of supporting evidence, indexed by [`output/index.html`](output/index.html). Those files are committed,
so the current results can be read without running anything.

To analyse a different repository, pass `-Dcs.clone.dir=<path>`.

**This document contains no measurements.** Two reasons. First, this repository's own markdown is part of the
corpus being analysed, so a figure recorded here alters the figure. Second, a figure copied into prose
survives changes to the code that produced it: a table of verb frequencies remained in this file after the
report that generated it had been removed, and the discrepancy went unnoticed. All measurements are therefore
held only in `output/` and are regenerated by `./gradlew selfRead`.

## What is analysed

Most of the text in a Java file consists of names declared elsewhere. `String`, `List` and `assertThat` are
references to declarations made by the Java platform and by third-party libraries. Only a parse can
distinguish a declaration from a reference, so the analysis operates on a parse tree rather than on raw text,
and takes only the following:

| Category | Extracted | Weight per phrase |
|---|---|--:|
| Declared names | types, methods, fields, parameters, local variables, record components, constants, pattern bindings, labels, the distinguishing segment of the package declaration | 1.0 |
| Dependencies | imports belonging neither to the Java platform nor to the repository under analysis | 0.5 |
| Prose | javadoc, comments, and markdown the repository has not declared to be a working note | 0.5 |

The unit of evidence is the phrase, not the word. One declared name is one phrase and one sentence of prose
is one phrase, each contributing a single unit of evidence regardless of length. Without this, a long javadoc
sentence would outweigh a short field name purely by virtue of containing more words.

### Resources that determine each boundary

- **`ModuleFinder.ofSystem()`** reports which packages the Java platform exports. `ImportOrigins` classifies
  each import by prefix comparison against that list and against the packages the repository itself declares,
  producing three categories: platform, own, and third-party.
- **WordNet** contains only open-class words: nouns, verbs, adjectives and adverbs. Function words such as
  *and*, *of* and *which* have no such entry, so querying WordNet for a lemma identifies them without any
  list of words being written. The same query returns the lemma, so `words` and `word` are counted together.
- **A published frequency list** (Leipzig Corpora, 20,000 words) determines how much a word narrows a
  subject, as `log(rank) / log(size)`. The result is bounded in `[0, 1]` by the length of the list.
- **Sense coverage.** The domain-label resource states in its own header that domain-less senses are omitted
  from its published data. A word's everyday sense therefore carries no label, and only its specialist senses
  contribute. The verb *cite* is labelled *law* and nothing else, because one sense of it concerns summoning
  a defendant to court; the bibliographic sense carries no label. A label is accordingly worth
  *labelled senses ÷ total senses*, both counts read from WordNet.
- **The topic resource's own hierarchy.** The resource publishes the transitive closure of its label
  hierarchy: a word labelled `computing` also arrives labelled `engineering`, `mathematics`,
  `natural-sciences`, `physical-sciences` and `sciences`. Treated as six independent labels, one statement
  about a word produces six votes. `StatedTopics` folds each derived label back into the label it was derived
  from, using the same published hierarchy that produced it.
- **The surrounding phrase.** A word considered alone is ambiguous. `cite` alone yields law, linguistics,
  publishing and several others; in `citationSource` it appears beside `source`, and the subject both words
  share is the subject of the phrase. `PhraseTopics` scores a subject by the geometric mean of the values its
  agreeing words contributed, multiplied by the proportion of the phrase that agrees.

Words of one or two letters are excluded on grounds of length rather than identity: dictionary entries for
such forms describe symbols rather than words (*a* as ampere, *be* as beryllium, *em* as a typographic unit).

### Legibility (λ)

λ is the proportion of a scope's word occurrences for which at least one bundled resource can be cited. It is
reported alongside every result that depends on it. It is a denominator and not a result: a scope with λ =
0.02 still produces a topic distribution, and the consumer must be told how little evidence it rests on.

## Comparing scopes

Each scope — one Java source set, or the repository's documentation — is compared against the whole
repository using Jensen–Shannon divergence over the topic distributions, measured in bits.

The observed divergence is then compared against a null distribution: 999 seeded resamples of a scope of the
same size, drawn from the same repository. A scope whose observed divergence does not exceed that null has
its results withheld from the summary entirely.

The threshold is the `1/(n+1)` quantile of the null rather than its median, because every scope in a
repository is tested simultaneously. With *n* scopes competing, the largest of *n* chance draws is the
relevant comparison; using the median would admit roughly half of all scopes by chance.

## Matching against published taxonomies

Two kinds of published vocabulary exist and they are used differently.

A **subject scheme** (for example arXiv's category list) classifies whole documents. Its category names do
not appear in source code, so it is used as a reference distribution: the repository's topic distribution is
compared against each subject's, and the nearest subject is reported with a null of the same construction as
above.

A **term taxonomy** publishes the names used by practitioners in a field. Where those names are already
formatted as identifiers, they can be matched directly against declared names. OLiA (Ontologies of Linguistic
Annotation) publishes `AdjectivePhrase`; a repository may declare `adjectivePhrase`. Passing both through the
same identifier-splitting rules yields the same two words.

`TermSpans` finds the longest published term at each position in an identifier, working left to right, with
no two matches overlapping. A partial match is discarded: a prefix that is not itself a published term is not
evidence.

### The three normalisation levels

Both sides of a comparison are reduced to a common form before being compared. The narrowest form that
produces a match is the one used, and every match records which level produced it. Results are reported per
level and never summed across levels.

| Level | Both sides reduced to | Source of the reduction |
|--:|---|---|
| 1 | the sequence of words itself | none; this is a string comparison |
| 2 | the lemma of each word | WordNet's lemma index |
| 3 | the synset of each word | WordNet's sense entries |

**Level 3 has been measured and rejected as evidence.** It was included because it is where `lemma` might
match `BaseForm` and `article` might match `Determiner`. It achieves neither: WordNet has no entry for *base
form*, and it resolves *article* to a piece of writing and *determiner* to a decisive factor. Every match it
does produce is a single word, and its largest is `subject` and `theme` matching `Topic`, because WordNet
places all three in one synset. The level remains implemented and is reported separately, contributing to
nothing, because the measurement is the argument for rejecting it.

Level 2 is retained. A taxonomy publishes singular forms and a program declares whatever form its context
required, so `phrases` matching `Phrase` is an inflection rather than a claim about meaning. Separating it
from level 3 prevents level 3 from being credited with it.

### Corroboration by branch

A single-word match is accepted only where the repository writes more than one concept in the branch the
taxonomy places that concept in.

The reasoning is that a concept deep within a taxonomy represents a specific part of a subject. A repository
that writes one such concept and nothing else nearby has most likely used an ordinary English word that the
taxonomy happens to have claimed. OLiA places `Preferred` beneath `UsageAndFrequencyFeature`; this repository
writes `Preferred` once and writes no other concept beneath that node.

The comparison is made against the concept's siblings — the other children of the same parent — rather than
against everything beneath the parent. Both were measured. Comparing against the whole subtree admits
`Topic`, because this repository writes `Identifier` two levels below `Topic`'s parent, which leaves the
largest single match unchanged. Siblings share the deepest common ancestor a taxonomy can supply.

Matches of more than one word are accepted without corroboration.

`CorroborationReport` prints both the corroborated and uncorroborated results, and lists every refused term
with the branch in which it stood alone, so the rule can be examined case by case.

### Current status of the term matcher

No term match contributes to the topic distribution. The matcher has so far been run only against a
repository within the taxonomy's own domain, which cannot establish that it discriminates. Establishing that
requires running it against repositories the taxonomy should not match. See
[`docs/plans/THE_PANEL.md`](docs/plans/THE_PANEL.md).

## Repository configuration

Some markdown in a repository documents the work and some records how the work is done. Which files fall into
which category is a statement the repository is entitled to make about itself, so it is read from a
`.readingignore` file at the root of the directory under analysis: one glob pattern per line, matched against
the path relative to that root, `#` introducing a comment. A repository with no such file has nothing
excluded.

`StatedExclusions` reads the file; `DocumentationScope` and `JavaSourceScopes` both apply it, so source
directories can be excluded as well as prose.

This repository's [`.readingignore`](.readingignore) excludes its backlog, its session conventions, the
planning documents under `docs/plans/` and the glossary. Each of those describes the analysis rather than the
library's purpose, and including them would inflate the results with the analysis's own vocabulary.
`README.md` is not excluded.

## Implemented components

| Area | Components |
|---|---|
| Arithmetic | `PooledLogOdds`, `AxisEvidenceAccumulator` (closed enumerations), `OpenSpaceAccumulator` (open vocabularies, with explicit abstention mass in the denominator) |
| Word extraction | `Tokeniser`, `IdentifierWords`, `WordRanks`, `WordSegmenter` with `PieceCost`, `CompoundParses` and `WordMorphology` |
| Parsing | `JavaSource` over JavaParser; `PlatformPackages`; `ImportOrigins` |
| Topic resolution | `TopicCitations`, `TopicDistribution`, `PhraseTopics`, `StatedTopics`, `ContentWords`, `WordSpecificity`, `SenseCoverage` |
| Statistics | `JensenShannon` with per-topic decomposition, `PermutationNull`, `SubjectNull`, `ChanceExpectedBest`, `SharedMass` |
| Reference distributions | `OrdinaryEnglish` (the frequency list read through the same pipeline), `FieldOfStudy` (arXiv subject descriptions) |
| Term matching | `TermIndex`, `LinguisticTerms`, `TermSpans`, `PhraseSpecificity`, `NormalisedTerms`, `TaxonomyTree`, `StatedSiblings`, `CorroboratedTerms` |
| Extraction tasks | `extractOliaTerms`, `extractArxivTaxonomy`, `extractNistCsf`, each pinned to a revision and verified against the git blob identifier that revision holds |
| Diagnostics | `./gradlew selfRead`; `./gradlew wordVotes -Pwords="…"`; `./gradlew topicCarriers -Ptopics="…"` |

## Known limitations

- **Results have been obtained only on this repository.** The analysis was developed against this codebase
  and the taxonomies were selected after examining it. No figure in `output/` constitutes evidence that the
  method generalises. [`docs/plans/THE_PANEL.md`](docs/plans/THE_PANEL.md) specifies the test that would.
- **Words are resolved without context beyond their immediate phrase.** The enclosing declaration and the
  file's overall subject are not consulted. Remaining misclassifications trace to this.
- **The domain-label resources cover only specialist senses.** A word whose everyday meaning is the one
  intended contributes nothing, or contributes its specialist sense instead.
- **Some readings are computed and not reported.** `RepositoryThemes` carries a behaviour analysis that no
  report consumes. This is recorded in [`docs/plans/BEHAVIOURS.md`](docs/plans/BEHAVIOURS.md).
- **The identifier splitter has documented failure cases.** `utf8Decode` is not split at the letter-digit
  boundary, pending a citable catalogue that would arbitrate whether `utf8` is one token. `TokeniserTest`
  records each known case.

## Planned work

[`BACKLOG.md`](BACKLOG.md) indexes the planned work as a table. Each entry links to a document under
[`docs/plans/`](docs/plans) stating what would be measured, what result would establish it, and what result
would cause it to be abandoned. The full original design is
[`docs/plans/CODE_SEMANTICS_LIBRARY_PLAN.md`](docs/plans/CODE_SEMANTICS_LIBRARY_PLAN.md).

## Licence

The library's source code is licensed under Apache-2.0 ([`LICENSE`](LICENSE)), and the same terms are declared
in the published POM.

The bundled lexical data is licensed separately. Each file states its own source and licence in its provenance
header. Two of them, both derived from Wiktionary, are CC BY-SA 4.0, which is a share-alike licence attaching
to those files rather than to code that reads them. [`NOTICE.md`](NOTICE.md) lists every file and its terms.
