# code-semantics

A codebase is a corpus of names. This library reads a **repository** the way a data-inference engine reads a
datasource: it turns identifiers into words, cites each word to a published dictionary, pools the citations
as weighted votes, and stores the result as a graph in which every node and every edge names the line that
evidenced it.

It reads at three levels — the repository, the pull request and the commit — over code and over the prose
that surrounds it, and it answers questions of the form *what is this scope about, compared with that one*.

The full design is [`docs/plans/CODE_SEMANTICS_LIBRARY_PLAN.md`](docs/plans/CODE_SEMANTICS_LIBRARY_PLAN.md),
the slices are indexed in [`BACKLOG.md`](BACKLOG.md), and each slice is a document under
[`docs/plans/`](docs/plans).

**Not a linguist?** [`docs/GLOSSARY.md`](docs/GLOSSARY.md) defines every term this project uses — lemma,
lemmatisation, synset, morphology, semantics, hypernym, SKOS — with a reference for each, alongside the
statistical vocabulary and the words this project uses in a particular way.

---

## The governing rule

**Every signal is a weighted vote from a citable derived resource. No hand-written vocabulary, no exclusion
list, no gate.**

A reading that cannot cite a source abstains, and abstention carries zero weight rather than a zero-valued
vote. A rule that must dominate expresses as a high-magnitude signed vote, never as an out-of-band override,
so a resolved reading is a pure function of its recorded votes and the trail explains itself.

Four consequences that shape the code:

- **A refutation is evidence.** Evidence mass sums the absolute weight cast, so a vote *against* still counts
  as something having been said. Only a total absence of evidence abstains.
- **A citation outranks an assertion.** Cited readings are consulted before any structural heuristic.
- **A bound is derived, never chosen.** Every statistic the library reports has a maximum that follows from
  its definition — a share bounds itself at 1; a Jensen–Shannon divergence bounds itself at 1 bit.
- **Attribution is a type, not a convention.** A vote requires a `SourceAnchor`, so an unattributed vote
  cannot be constructed.

## What it does not do

It does not judge code quality. It does not authenticate, clone or fetch — it is handed a local clone path
and a `RepositoryFacts` record another process assembled. It does not resolve types by default, because a
library that requires a buildable repository cannot analyse most repositories. It does not rank concepts
without a reference, because a single-scope ranking is a weak reading and a divergence against a stated
reference is a strong one. And it does not delete evidence: orphaned commits after a force-push, tokens
nothing could read, and blobs with zero legibility all stay in the graph, because what was observed and not
understood is a finding.

---

## Modules

| Module | Holds |
|---|---|
| `lexicon` | The bundled lexical resources and the readers over them — WordNet via extjwnl, Wiktionary abbreviations, topics and the topic hierarchy, Wikidata names and initialisms, the DuckDB function catalogue. A verbatim port apart from the hierarchy; see below. |
| `lexicon-extraction` | The Gradle tasks that regenerate those resources from their published sources. This is where the plan's new catalogues — language keyword tables, standard-library API indexes, `github/linguist` data — belong. |
| `code-semantics-api` | Model records, stage contracts and the identifier-reading grammar: the attributed evidence trail, `SourceAnchor`, `RepositoryFacts`, the pooled log-odds arithmetic, the tokeniser, and the word segmenter with its cost model and morphology. |
| `code-semantics-engine` | The reading pipeline: the pooled accumulator, the legibility reading the self test runs, and the twelve stages of the plan as they land. |

`build-logic/` holds the convention plugins (`cs.java-conventions`, `cs.java-library`, `cs.maven-publish`,
`cs.aggregate-tasks`). Module build files stay minimal by design.

### The `lexicon` module is a port

It is copied verbatim from the Business Intelligence project, package names (`org.fifties.housewife.bi.lexicon`)
included, so that a fix in either repository transfers as a straight diff. Prefer re-syncing it over diverging
it; if it must diverge, say so in the module's own README rather than silently.

Its resources total roughly 34 MB and each file carries a `#` provenance header naming its source and
licence. **A bundled resource without a provenance header is a build failure**: `VocabularyProvenanceTest`
ports across with the module and covers both resource directories. Its sibling — the reachability contract,
that every bundled resource is named by production bytecode and that bytecode by something else — needs a
classpath scanner and is in the backlog rather than the tree.

`sql-functions.tsv` is the precedent every catalogue this library adds must follow. Its own header states the
principle: *a schema token equal to a function's name is a fact about the standard this tool executes rather
than an observation of any corpus.*

Every bundled file's declared source and licence is summarised in [`NOTICE.md`](NOTICE.md), including one gap
stated rather than papered over: WordNet arrives through `extjwnl` on the classpath, and neither the Princeton
licence nor extjwnl's EPL/LGPL is stated in this repository yet.

---

## Building

```bash
./gradlew checkAll          # every module's tests and coverage floor
./gradlew selfRead          # read this repository with the library and print the report
./gradlew build             # jars
./gradlew dependencyUpdates # available dependency upgrades
```

Java 21 toolchain, `-Xlint:all -Werror`, Error Prone, JaCoCo at an 80% instruction floor on every module
(every module currently clears it; `jacocoTestReport` states the actual figures per module).

---

## The self test

`./gradlew selfRead` points the library at this repository and reports what it is written in, what it is
about, and what it does. The reports land in [`output/`](output) — legibility, themes, subjects, terms, a
taxonomy sunburst and a page of evidence, indexed by [`output/index.html`](output/index.html) — and they are
committed, so a reader sees the current reading without running anything.

**There are no figures in this file, and that is deliberate.** The corpus includes this README, so a number
written here changes the number: the report would be inside the thing it reports on, and there is no commit
at which the two agree exactly. Worse, a hand-copied figure outlives the code that produced it — the verb
table that used to sit below survived the removal of the reading that generated it, and nobody noticed.
So every figure lives in `output/`, regenerated by one command and by nothing else, and this file describes
the reading rather than quoting it. Point the same reading at another clone with `-Dcs.clone.dir=<path>`.

### What it reads, and what it refuses to

A Java file is mostly somebody else's vocabulary quoted. `String`, `List` and `assertThat` are *uses* of
declarations the platform and the test framework made, and a use is not a word this codebase chose. So the
reading runs over a **parse**, and takes only what this repository committed to:

| Kind | What is taken | What one phrase of it is worth |
|---|---|--:|
| Declared names | types, methods, fields, parameters, locals, components, constants | 1.0 |
| Dependencies | imports that are neither the platform's own packages nor this tree's | 0.5 |
| Prose | javadoc, comments, and whatever markdown the repository does not state is a working note | 0.5 |

**The unit is the phrase, not the word.** A declared name is one phrase and a sentence of prose is one
phrase, and each commits a single unit however many words it took to say — so a twenty-word javadoc sentence
does not outvote a two-word field name by being longer. Prose is most of the words and, at one unit per
sentence, a much smaller share of the evidence. The report prints **what share of each theme came from
names**, and the case to watch is a theme that exists only in the prose.

Five published resources draw every boundary, and not one line of vocabulary is written here:

- **`ModuleFinder.ofSystem()`** states which packages are the platform's, so `java.util` is set aside where
  `net.sf.extjwnl` is kept. `ImportOrigins` sorts every import by prefix walk into three — the platform's,
  this tree's own, and everybody else's — and only the third is a choice worth reading.
- **WordNet**, an open-class dictionary by construction, states which words carry subject matter — so the
  words English uses to hold a sentence together are refused without a stop list existing — and lemmatises
  what survives, so `words` and `word` are one subject.
- **The Leipzig frequency list** states how much a word narrows a subject. A word nothing chose is weighted
  by `log(rank)/log(size)`, the surprisal the list itself states, bounded by the list's own length.
- **The share of a word the labeller actually spoke for.** The domain resource omits domain-less senses —
  its own header says so — so a word's everyday meaning carries no label and only its specialist senses vote.
  `cite` is labelled *law* and nothing else, because a court cites a defendant; the bibliographic sense this
  repository always means is domain-less and silent. So a label is worth *labelled senses ÷ total senses*,
  both read from WordNet: one label on one sense of six speaks for a sixth of the word.
- **The topic resource's own hierarchy**, which states which of its labels imply which. It publishes a
  closure, not a label set: a word labelled `computing` arrives carrying `engineering`, `mathematics`,
  `natural-sciences`, `physical-sciences` and `sciences` besides. Read as six labels, one statement about the
  word becomes six votes and the subject actually named comes out worth a sixth of it. The hierarchy folds
  each derived label back into the one it came from — the same published map that derived it, so the fold is
  a citation rather than a synonym list.
- **The phrase itself** is what disambiguates its words. A word alone is ambiguous and nothing can fix that;
  a word among its siblings is much less so, and the siblings are free. `cite` alone is law, linguistics,
  publishing and half a dozen more; `citationSource` is cite beside source, and what both name is what the
  phrase is about. A subject scores by the **geometric mean** of what the agreeing words committed — the
  log-linear pooling this library uses everywhere — times **the share of the phrase that agrees**, so a
  subject one word in twenty names scores a twentieth of what it would alone. The phrase then commits what it
  settled on: Simpson's index over its own shares, so a phrase that could not decide between four subjects is
  worth a quarter rather than a whole one spread thinner.

One-and-two-letter words are refused whichever they are, because a dictionary entry for a one-letter form is
about a symbol — `a` the ampere, `be` beryllium, `em` a printer's measure — and a name can be a sentence with
an article in it.

### Legibility λ

λ is the share of a scope's word occurrences at least one bundled resource can be cited for. It is a
**denominator**, reported beside every reading that rests on one, and never a finding: a scope at λ = 0.02
has an intensity reading and the consumer has to be told how thin it is.

## What it says this repository does

A method name is a clause and a test name is a sentence, so the suite is a specification wherever that
convention holds. `Behaviours` reads a declared method name verb-first — the leading word where the
dictionary carries a verb entry for it, and the rest as what the verb acts on. A name whose first word has no
verb entry yields no behaviour rather than a guessed one, and `ForeignWords` ranks the names whose own subject
is furthest from the repository's, as metaphor candidates.

**It is computed on every run and rendered nowhere.** `ThemeReading` calls it and `RepositoryThemes` carries
the result, but no report or page consumes `behaviours()`. That is the first item of
[`docs/plans/BEHAVIOURS.md`](docs/plans/BEHAVIOURS.md) and exactly the failure the reachability half of the
resource contract exists to catch.

Reading a name as a clause at all needed the splitter defect fixed first: `refusesALineRange` was reading as
*refuses / aline / range*. The acronym-run boundary now lands in `IdentifierWords`, alongside the ported
tokeniser rather than inside it, and four of the plan's five documented mis-splits read correctly —
`XMLHttpRequest`, `parseHTTPResponse`, `getDSLContext`, `JWNLException`. The letter/digit boundary is
deliberately still absent, because `utf8` is one token in the catalogues that name it.

## What a published taxonomy matched, and on what

A subject scheme places a whole repository and can say nothing about a line in it, because nobody writes
`cs.CL`. A **term** taxonomy publishes names a program in its field declares, so it is matched rather than
diverged against: OLiA's `AdjectivePhrase` and this repository's `adjectivePhrase` read as the same two words
through the same splitter, and a hit is the ontology stating that this is a term of its field.

Both sides are normalised to one thing before they are compared, and the ladder takes the **narrowest**
normalisation that answers. Which rung answered is carried on every span, and there is a rate for each and
none across them — a match on the words and a match on a sense two different words happen to share are not
the same evidence.

| Rung | Both sides become | Cited from |
|--:|---|---|
| 1 | the run of words itself | nothing — it is a string comparison, and it invents nothing either |
| 2 | the dictionary form of each word | WordNet's own lemmas |
| 3 | the sense the dictionary carries each word in | WordNet's own sense entries |

**The third rung is refused, and it was the one this work set out to build.** Most frequent sense was wanted
because it is where `lemma` could meet `BaseForm` and `article` could meet `Determiner`; it buys neither —
WordNet holds no entry for *base form* at all, and it reads *article* as a piece of prose and *determiner* as
a conclusive argument. What it buys instead is a set of spans of which **every one is a single word**, against
a design whose whole premise is that the multi-word term is the signal. Its largest term is `subject` and
`theme` reading as `Topic`: one WordNet entry holds all three, which is the same artefact that already puts
`music` under everything the theme reading says. A term matcher exists so that a match needs no English in
between, and that rung puts the English back. It stays in the tree, reported apart and voting on nothing,
because the figure is the argument.

The middle rung is the part that was worth having, and separating it is what showed the third one up. A
taxonomy publishes singulars and a program declares whatever its sentence needed, so `phrases` meeting
`Phrase` is one word inflected rather than a claim about meaning — and pooled with the senses it would have
made the generalisation look twice as productive as it is.

**A single-word match is admitted only where its branch is occupied by more than the one concept.** OLiA
states `Preferred` under `UsageAndFrequencyFeature`; this repository writes it once and writes nothing else
under that feature, so the match is an English word the taxonomy happens to have claimed. What supports
`Verb` is that this repository also writes `Noun`, `Clause` and `Phrase` — its siblings, as the publisher
placed them. A term written in more than one word needs no corroboration. `CorroborationReport` prints the
corroborated reading beside the full one and names every refusal with the branch it stood alone in, so the
rule is argued with concept by concept rather than as a rate.

Nothing here votes. The theme reading is untouched by all of it, because a vocabulary run only on a
repository inside its own domain has not been shown to discriminate anything; the arm that decides needs a
repository OLiA should say nothing about.

## Words carried in from somewhere else

A metaphor is a word carried in from a subject the reader already knows, so it is a word whose own topical
reading diverges from the repository's — measured with the same Jensen–Shannon divergence, in bits, over the
words this repository used as **names** rather than merely in a sentence. They are **candidates**: a distance
cannot tell a figure of speech from a technical term the resources are too coarse for, which is why the
subjects and a link are printed beside each one.

### The comparison, which is the reading worth acting on

Each scope is compared with the whole repository, then judged against the field a scope of **its own size**
draws by chance: 999 seeded resamples. Every source set and the documentation are read as scopes, and a scope
that does not stand outside its own null has its ranking **withheld entirely**, because a caveat is not what
gets quoted. The bar is `ChanceExpectedBest` — the `1/(n+1)` quantile — because every scope of a repository is
tested at once, so the scopes are a field competing to look furthest and a median would be a coin flip.

### What is still wrong, and what would fix it

**The reading still asks what a word means with nothing around it**, and every remaining oddity traces to
that one gap. A general dictionary omits domain-less senses — its own header says so — so a word's everyday
meaning carries no label and only its specialist senses vote: `cite` is *law* and nothing else, in a library
that cites dictionaries. Folding, filtering, reweighting and abstention have each been tried on that table
and each failed for the same reason, which is that a label cannot be repaired downstream of a sense that was
never read.

The plans that would fix it are [sense disambiguation](docs/plans/SENSE_DISAMBIGUATION.md),
[the vote itself](docs/plans/THE_VOTE.md) and
[what a repository depends on](docs/plans/DEPENDENCIES_AS_DOMAIN.md) — and none of them means anything until
[the backtest](docs/plans/THE_PANEL.md) runs, because every figure in `output/` today is an instrument
reading itself.

---

## What a repository says it is not

A reading is offered every markdown file at a repository's root and everything under its `docs` directory,
and some of that is notes about the work rather than the work. **Which files those are is the repository's
statement and not this library's**, so it is read from a `.readingignore` at the root of the tree under
reading — one glob per line, matched against the path relative to that root, `#` for a comment. A repository
that states nothing excludes nothing; silence is not permission to guess.

This repository's own [`.readingignore`](.readingignore) excludes its backlog, its session conventions, the
plan documents under `docs/plans/` and the glossary — each because reading them would be the instrument
reading its own notes. `README.md` is deliberately *not* excluded: it states what this library is for, and it
also quotes the reading's own figures, which is a self-reference the backlog measures rather than hides.

`StatedExclusions` is what honours it, and both `DocumentationScope` and `JavaSourceScopes` consult it.

---

## What is already in the tree

| | Landed |
|---|---|
| **The arithmetic** | Pooled log-odds, the closed-axis accumulator, the attributed evidence trail, and `OpenSpaceAccumulator` — the open-space partition where confidence is the winner's share among contenders and what nothing could read sits in the denominator |
| **The words** | `Tokeniser`, `IdentifierWords`, `WordRanks`, `WordSegmenter` split into `PieceCost`, `CompoundParses` and `WordMorphology`, over a 20,000-word Leipzig frequency list |
| **The parse** | `JavaSource` over JavaParser, reading only what a repository *declared* — types, methods, fields, parameters, locals, components, constants, pattern bindings, labels, the package's distinguishing segment — plus its prose and the imports that are neither the platform's nor its own. `PlatformPackages` cites `ModuleFinder.ofSystem()`; `ImportOrigins` sorts by prefix walk |
| **The theme reading** | `TopicCitations` over WordNet Domains and Wiktionary topics, `TopicDistribution`, `JensenShannon` with its per-topic decomposition, `PermutationNull` at 999 seeded resamples, and `ChanceExpectedBest` as one bar for both nulls. `PhraseTopics` reads a phrase's words as context for one another; `StatedTopics` folds a label another already implies; `ContentWords` and `WordSpecificity` weigh what is left |
| **Two references** | `OrdinaryEnglish` and `FieldOfStudy`, so a topic must distinguish this repository from everyday English **and** be one its field has, that it has more of |
| **The subject placement** | `SubjectAreas` puts a scope and an arXiv subject in one topic space; `SubjectNull` draws the field a taxonomy of chance would have offered |
| **The term reading** | `TermIndex`, `LinguisticTerms` over OLiA, `TermSpans` as a longest-match non-overlapping cover of the *ordered* words, `PhraseSpecificity`, the three-rung normalisation ladder, `TaxonomyTree` over any SKOS source, and `StatedSiblings` / `CorroboratedTerms` — the branch corroboration that refuses a one-word match standing alone in its branch |
| **The extractions** | `./gradlew :lexicon-extraction:extract{OliaTerms,ArxivTaxonomy,NistCsf}`, each pinned to a revision and verified by the blob id that revision holds, each carrying a provenance header `VocabularyProvenanceTest` enforces |
| **The self test** | `./gradlew selfRead` — legibility, themes, subjects, terms, the taxonomy sunburst and the evidence pages, condensed into `output/` |
| **Two probes** | `./gradlew wordVotes -Pwords="…"` prints every vote cast for a word; `./gradlew topicCarriers -Ptopics="…"` prints every word carrying a topic |

---

## Where the work starts

The first vertical slice is §20 of the plan: one repository (`junit-team/junit-framework`), one language,
two contrasting pull requests, and deliberately naive sense disambiguation, so that the contextual readings
of §9 are later measured against a stated baseline rather than assumed to help.

Its acceptance is stated as measurements rather than features, and the load-bearing one is the **noise**
gate: a dependency-bump pull request's observed divergence must not exceed its permutation null. A statistic
that finds semantic content in a version bump is wrong, and that single measurement is what distinguishes a
real reading from a plausible-looking one.

`BACKLOG.md` carries the slices.

---

## Licence

The library's own code is Apache-2.0 — [`LICENSE`](LICENSE), and the same terms are declared in the published
POM. **The bundled lexical data is not covered by it**: each file states its own source and licence in a
provenance header, and two of them (the Wiktionary extractions) are CC BY-SA 4.0, which is share-alike and
attaches to those files rather than to the code that reads them. [`NOTICE.md`](NOTICE.md) summarises all eight
and names the one gap — WordNet's own terms, which arrive through `extjwnl` on the classpath and are not
stated in this repository yet.
