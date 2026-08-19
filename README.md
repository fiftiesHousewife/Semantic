# code-semantics

[![build](https://github.com/fiftiesHousewife/Semantic/actions/workflows/build.yml/badge.svg)](https://github.com/fiftiesHousewife/Semantic/actions/workflows/build.yml)

A Java library that states what subject matter a source repository is concerned with, by reading the words in the names its authors declared.

It works in the terms of lexical semantics and information theory, and expects no prior knowledge of either. The [glossary](docs/GLOSSARY.md) defines every term it uses — *lemma*, *sense*, *synset*, *divergence*, *permutation null* — with what it is called in this tree and a reference for each.

- **Takes** — a directory of Java source. No clone, no build, no type resolution, no network.
- **Gives** — one export per run, [`reading.json`](output/json/reading.json): the words this repository writes more of than English or the Java platform does, the subjects those words place it in, and the concepts of a published taxonomy its names declare. A run also writes `themes.json`, the graph the themes viewer draws from.
- **Decides by** — published resources only. A dictionary says which words carry subject matter, a frequency list says which are ordinary, and 999 resamples say which figures chance would have produced. No word list is written here.
- **Run** — `./gradlew read`, then read the [summary](output/markdown/summary.md).

![One bar per topic, each as long as the share of the divergence between this repository's parts that the topic accounts for](output/svg/themes-bar.svg)

One bar per topic whose figure exceeds all 999 chance resamples, longest first. **A bar measures signal, not volume.** The signal is the [divergence](#step-1--measuring-the-difference-what-a-divergence-is-and-why-it-is-a-percentage) between this repository's parts — how far one source set's reading stands from the rest — and a bar's length is the share of that divergence the topic accounts for. Volume is mostly noise here: a topic written at the same density everywhere cancels out of the comparison, so `linguistics` accounts for 81.6% of what separates the parts while being 5.0% of everything the reading observed.

Colour groups the topics the topic resource places under one broad subject: Wiktionary states `sciences` above `linguistics` and `natural-sciences` above `computing`, so the two bars take different colours, and two topics under one broad subject would share one.

## What it does

- **Reads a local directory.** No clone, no fetch, no compile, no type resolution — a repository that does not build is still readable, and so is a pull request.
- **Counts only the names a repository declares.** `String`, `List` and `assertThat` belong to the platform and to third-party libraries; a repository referencing them has said nothing about its own subject. Only the syntax says which is which, so [`ParsedRepository`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java) reads each file with [JavaParser](https://github.com/javaparser/javaparser) into an abstract syntax tree over the [Java language grammar](https://docs.oracle.com/javase/specs/jls/se21/html/jls-2.html), then keeps the identifier at a declaration node — a type, method, field, parameter, local, record component, constant, pattern binding or label — while the same identifier at a use is set aside. No symbol solver is on the classpath: what a name refers to is a separate question this reading never asks. A string literal is somebody's vocabulary quoted and is set aside with the uses, with one exception carrying a citation: a literal byte-identical to an identifier in the [IANA media type registry](https://www.iana.org/assignments/media-types/) is the publisher's own string, counted beside the reading and summed into no vote.
- **Looks each word up in published resources** — [WordNet](https://wordnet.princeton.edu/), [WordNet Domains](https://wndomains.fbk.eu/), [Wiktionary](https://en.wiktionary.org/)'s topic vocabulary and the [Leipzig Corpora Collection](https://wortschatz.uni-leipzig.de/en/download) frequency list — and records what each resource says the word is about.
- **Adds that up into a distribution over subjects**, weighting each [phrase](#definitions) once however long it is, per **scope** and for the repository. **A scope is a [source set](https://docs.gradle.org/current/userguide/java_plugin.html#sec:source_sets)** — one `<module>/src/<set>/java` directory — so `lexicon/src/main/java` and `lexicon/src/test/java` are two, and every table below saying *scope* means one of those. The repository's own documentation — markdown and AsciiDoc — is one more, and so are its Maven modules, read from the module chain the poms themselves state, and its test resources, read by file name with the contents never opened.
- **Compares distributions**: a scope against the whole repository, the repository against a [published subject scheme](#subject-scheme), and every declared name against a [published term taxonomy](#term-taxonomy).
- **Reports nothing that chance would have produced.** Every reported figure has passed a [permutation test](#references), described below.

### Step 1 — measuring the difference: what a divergence is, and why it is a percentage

Every distance these reports state is a **Jensen–Shannon divergence**, written as the share of its own maximum it holds.

The reading turns each scope — each [source set](#definitions) — into a distribution over subjects. For `lexicon/src/main/java`: so much `grammar`, so much `computing`, so much `linguistics`, summing to 1 across everything observed. The whole repository is another such distribution. A divergence measures how far two of them stand apart.

The measure is the [Jensen–Shannon divergence](#references), and it has three properties the reading depends on:

- **0%** — the two distributions are identical: the scope writes every subject at exactly the repository's rate.
- **100%** — they share nothing: every subject one writes, the other never writes.
- **The maximum follows from the definition** under base-2 logarithms — one bit — so the percentage is a share of a bound nobody chose, and no figure here needs a scale explained beside it.

That last property is the reason for choosing this measure. [Kullback–Leibler divergence](#references) answers a similar question and is unbounded above, so 4.2 of it means nothing without knowing what the maximum was — and there is no maximum.

**Which way is close.** A **small** percentage is high overlap: the two readings are about the same subjects at about the same rates. A **large** one is low overlap, and 100% is no subject in common. So `code-semantics-engine/src/main/java` at 3.9% writes very nearly what the whole repository writes, and `documentation` at 24.0% writes something noticeably different.

**But size alone decides nothing, and this is the point of the next step.** 24.0% is the larger figure and it is the one the reading throws away, because the source set producing it is small enough that 972 of 999 random groups of that size reached at least as far. A percentage here is only ever read against the null built for a source set of that size.

**Worked example.** Take two readings over two subjects. One is three-quarters `grammar` and one-quarter `computing`; the other is the reverse.

| | `grammar` | `computing` |
|---|--:|--:|
| The scope, *P* | 0.75 | 0.25 |
| The repository, *Q* | 0.25 | 0.75 |
| Their midpoint, *M* | 0.50 | 0.50 |

Score each side against the midpoint, then average the two:

```
D(P‖M) = 0.75·log₂(0.75/0.50) + 0.25·log₂(0.25/0.50)
       = 0.75·(0.585)          + 0.25·(−1)
       = 0.4387 − 0.25         = 0.1887

D(Q‖M) = 0.1887   (by symmetry)

JSD    = ½(0.1887) + ½(0.1887) = 0.1887 bits
```

So **18.9% is what a three-to-one preference reversed between two subjects looks like.** `lexicon/src/main/java` sits at 19.4% from this repository — about that far apart, spread over more subjects than two.

Each topic's own term of that sum is reported separately, which is what says *which* subjects carried the distance. The reports state each term as a share of the same one-bit maximum, so a term and the whole it belongs to are read off the same scale.

### Step 2 — separating signal from noise: what the 999 resamples are for

**They decide which source sets are signal.** Every source set's distribution differs somewhat from the whole repository's, so a table of distances alone would report every one of them as if it meant something. The resamples say which of those distances a random group of files of that size would have produced anyway — and a source set whose distance chance reaches has its topics withheld rather than ranked.

The problem is size. A small source set produces a large distance by accident: read 4 files and they will look unlike the other 447 whatever is in them. A distance is therefore uninterpretable until it is read against the distances a random group of *that size* reaches, so the reading builds each source set its own **null distribution** — the spread of values a statistic takes when chance alone is at work, the term from Good's [permutation test](#references). Where the real distance falls in that spread is the test:

| | Step |
|--:|---|
| 1 | Measure the real figure: the divergence between this scope's distribution and the whole repository's |
| 2 | Draw 999 fake scopes of exactly the same number of files, at random, from the same repository |
| 3 | Measure the same divergence for each of the 999 |
| 4 | Report the real scope only if its divergence is larger than **all** 999 |

**Worked example, on this repository.** Two source sets, and the one that is further away is the one thrown out.

| Source set | Distance from the repository | Draws reaching at least that far | |
|---|--:|--:|---|
| `code-semantics-engine/src/main/java` | 3.9% | 0 of 999 | kept — its topics are ranked |
| `documentation` | 24.0% | 972 of 999 | discarded — nothing is ranked for it |

`documentation` stands six times further from the repository than the engine's main source set and is the one discarded, because it is small: 972 of the 999 random groups of that many files reached at least as far, so chance explains the whole of its distance. The engine's main source set is the largest in the tree, and a random group of that many files never once reached 3.9%. **Evidence is distance a random group of that size does not reach.**

Kept on this reading: `code-semantics-api/src/test/java`, `lexicon/src/test/java` and `code-semantics-engine/src/main/java`. Discarded: `documentation`.

**Why each source set is tested, when the question is about the whole repository.** The repository cannot be read this way against itself — its distance from itself is zero — so the statistic exists only for a part read against the rest, and each part needs its own null distribution because the distances chance reaches depend on the part's size. The parts are also where the repository-level answer comes from: a topic enters *what the repository is about* only by accounting for some surviving source set's distance. Every Java file writes the same ambiguous words, so a topic held at one density through the whole tree cannot be told apart from the language; a topic concentrated in one part is subject matter its author put there. Both sides of that comparison are read by one parser and one set of dictionaries, so the dictionaries' own biases cancel.

Step 4 uses all 999 rather than the usual 95th percentile because every scope is tested at once. Testing 40 scopes at the 95th percentile would report two by chance alone; the `1/(n+1)` quantile holds the family-wise error at the stated level. The method is Good's [permutation test](#references), and it assumes nothing about the shape of the distribution — which matters, because nothing here is normally distributed.

**The test decides only what is reported.** A source set whose distance its null distribution reaches is read in full and contributes to the repository's distribution exactly as any other does; what it does not get is a ranking of its own topics, because the ranking would be of noise. Failures are named: every source set that did not pass is printed with its figure and how many of the 999 draws beat it, at the end of [the summary](output/markdown/summary.md).

## The export

Every run writes [`reading.json`](output/json/reading.json). It carries the result and the evidence for it, so a consumer needs no HTML, no markdown and no second run.

| Section | Holds | One entry per |
|---|---|---|
| `summary` | the result | run |
| `signals` | the words and phrases the repository writes more of than English or the Java platform does | word or published phrase |
| `themes` | the subjects distinguishing one part of the repository from the rest | topic, in the scope it distinguishes |
| `taxonomies` | the published concepts the repository's names match, and the branches those concepts sit under | vocabulary matched against |
| `setAside` | counts of what the three lists omit | run |

**`taxonomies` holds one entry per vocabulary matched.** A run matches every taxonomy [`MatchedTaxonomies`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTaxonomies.java) enumerates — OLiA and the Computer Science Ontology — so the export carries both side by side, each with its own concepts and counts. A consumer adds its own:

```java
ReadingExport export = new ExportedReading().of(reading, commit,
        List.of(InjectedTerms.of(InjectedTaxonomy.named(path), "my-vocabulary")));
```

A taxonomy stating prose is left out of that list deliberately: it has a placement reading of its own and is not a vocabulary of terms anybody declares.

**What a concept list looks like, and why the second one is the interesting one.** Read at commit `e5fe01e`, this repository matches two vocabularies. OLiA names the parts of a grammar; the Computer Science Ontology names what a piece of computer science is about, and 12,850 of its 14,636 topics are more than one word:

| Vocabulary | Concepts this repository declares |
|---|---|
| OLiA | `Source` `Root` `Token` `Phrase` `Verb` `Noun` `Text` `Document` `Citation` `Evidence` |
| **CSO** | **`ontology`** 38 · **`part of speech`** 21 · `parsing` 20 · **`semantics`** 15 · **`synsets`** 13 · `descriptor` 23 · `hypertext markup language` 5 · `xml` 3 · `rdf` 2 · **`word sense`** 1 · `computer science` 1 · `reasoning` 1 |

OLiA's answer is that this repository writes about grammar, which is true and is what a vocabulary of grammar can say. CSO's answer is *ontology, part of speech, word sense, semantics, synsets* — which names the field rather than the parts, and is checkable concept by concept against what a publisher wrote.

**The same vocabulary read against a different repository is what shows it working.** Apache Tika at `43cbdae6` is a text-extraction toolkit; this repository is a library of lemmas and senses. The bundled subject scheme places **both** under `cs.CL` Computation and Language. CSO does not:

| | Concepts it declares |
|---|---|
| **This repository** | `ontology` · `part of speech` · `semantics` · `synsets` · `word sense` · `reasoning` · `rdf` |
| **Apache Tika** | `parse` 666 · `xml` 354 · `html` 264 · `detector` 181 · `encoding` 118 · `hyperlink` 47 · `email` 42 · `cache` 41 · **`word processing`** · `nlp` 13 · `encryption` 12 · `classifier` 9 · `decoding` 7 · `transformer` 3 · **`data encryption`** · `css` · `https` · `gps` · `cad` |

That is the granularity a subject scheme cannot reach. CSO states `document processing`, `document image analysis`, `character recognition` and `character sets` as topics in their own right, because it classifies what a piece of computer science is *about* rather than which journal would take the paper.

**Figures move every run.** They are a reading of the named commit; `./gradlew read` regenerates them, and [the committed reports](output) hold the current ones.

### Reading it

`summary` answers the question on its own. Nothing under it is needed to know what the repository is about:

```json
{
  "repository": "CodeSemantics",
  "about": ["linguistics", "computing", "grammar"],
  "placedIn": {
    "scheme": "arXiv",
    "archive":  { "subject": "Computer Science", "divergenceBits": 0.3401, "standsApartFromChance": true },
    "category": { "subject": "Computation and Language", "divergenceBits": 0.3970, "standsApartFromChance": true }
  },
  "leadingWords": [{ "word": "word", "divergenceBits": 0.0158, "occurrences": 239 }, ...],
  "aboutStatedBy": ["WordNet Domains", "Wiktionary topics"],
  "leadingConcepts": [
    { "concept": "Source",   "publishedBy": "OLiA" },
    { "concept": "ontology", "publishedBy": "cso-topics.tsv" },
    { "concept": "Root",     "publishedBy": "OLiA" },
    { "concept": "parsing",  "publishedBy": "cso-topics.tsv" }, ...
  ],
  "shareOfWordsWithACitation": 0.9830255639097745,
  "shareOfMassOnNoSubject": 0.7591515609169042,
  "counts": { "signals": 261, "themes": 5, "concepts": 115 }
}
```

`placedIn` states two levels. `archive` is compared against every category's description pooled under it — enough prose for the divergence to be stable, and broad enough that *Computer Science* says little about a Java library. `category` is compared against the few dozen words arXiv states for that subject alone: the weaker measurement, and the answer to what the repository is about. Read `standsApartFromChance` on either before reading its `subject`, because some subject is always nearest.

Each list under the summary answers a follow-up question.

| To find out | Read |
|---|---|
| which words carry the signal, and where each was written | `signals` |
| what one part of the repository is about | `themes` |
| which published concepts the declared names match | `taxonomies[].concepts` |
| how much was measured and left out of the lists | `setAside` |

Any JSON reader will do — `JSON.parse` in a browser or Node, [`jq`](https://jqlang.github.io/jq/) at a shell, a generated type from the schema below. Nothing here needs a client library.

One signal, in full:

```json
{
  "readFrom": "CLONE",
  "word": "lemma",
  "occurrences": 22,
  "occurrencesInNames": 22,
  "divergenceBits": 0.0015700827861832715,
  "closestReference": "the platform's own API",
  "firstWrittenAt": {
    "file": "code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java",
    "line": 64
  }
}
```

`divergenceBits` is this word's term of the [Jensen–Shannon divergence](#references) between the repository's word distribution and the reference's, bounded at 1 bit. `closestReference` names the reference scoring the word lowest, which is the score reported: `get` scores high against ordinary English and low against the Java platform's own API, so the platform is its closest reference. Each reference's threshold comes from that reference's own [permutation null](#references), so the number of rows follows from the repository's size.

Words English supplies inside a name are scored, ranked and left out of `signals`. `massByTopic` is a name about mass and about topics, and `by` is what the language puts between them: against a frequency list drawn from prose it reads as specialist, because prose is not where a program's prepositions are written. Two bundled resources place such a word between them — WordNet carries no noun, verb or adjective entry for it, and the frequency list carries it as a word English is written in — and [the vocabulary report](output/markdown/vocabulary.md) prints it under its own heading with its rank.

**Signals only.** A word no resource covers, a match the branch rule discarded and a topic within chance appear in no list, and `setAside` counts each. 261 signals out of 895 words scored is a different claim from 261 out of 8,000, and the counts are what tell the two apart.

### The schema

[The export's schema](code-semantics-engine/src/main/resources/reading-export.schema.json) states the shape, with a description on every field. It ships inside the published jar at `/reading-export.schema.json`, so a consumer can generate types from it or validate against it.

`ExportFile` validates every document against that schema before writing it, so a run produces a document matching the contract or produces none. `schemaVersion` rises when a field is added, renamed or removed, and `ReadingExportSchemaTest` fails the build on a change the schema does not state.

**It is at `3.1`.** A consumer branches on that version rather than discovering a change by failing. The run is the first such consumer: it reads the previous export to write `changes.md`, and a version it cannot read is a run with nothing to compare against.

### Producing it

| Command | Writes |
|---|---|
| `./gradlew readingExport` | the export alone, with no report produced |
| `./gradlew read` | the export and every report |
| `./gradlew readingExport -Dcs.clone.dir=<path>` | the export for another checkout, under `output/<name>/json/` |

## Running it

| Command | What it does |
|---|---|
| `./gradlew read` | reads this repository and writes the reports linked below |
| `./gradlew read -Dcs.clone.dir=<path>` | reads another checkout, and keeps its reports separate |
| `./gradlew checkAll` | tests and coverage verification — what [the build](.github/workflows/build.yml) runs on every push and pull request |

The commands that answer a question about one word, one topic or one evaluation-set member are in [the appendix](#appendix-diagnostics-and-analysis).

Java 25 toolchain, `-Xlint:all -Werror`, Error Prone, an 80% JaCoCo instruction floor per module.

### What a run tells you

- [**The topics, with the evidence behind each**](output/markdown/summary.md) — every topic whose figure exceeds all 999 chance resamples, its distance as a share of the maximum, and the words and lines that produced it. Start here.
- [**How much of the repository could be read at all**](output/markdown/self-reading.md) — λ, the files that would not parse, and the words no resource could be cited for.
- [**The words and phrases that carry the most signal here**](output/markdown/vocabulary.md) — every declared word ranked against ordinary English and against the Java platform's own API. A word both references write more often than this repository does scores lower than one neither of them writes.
- [**What each scope is about**](output/markdown/themes.md) — with the words that produced each topic's score, and the line each was written on.
- [**Where it stands among published subjects**](output/markdown/subjects.md) — the nearest of the 152 subject categories [arXiv](https://arxiv.org/category_taxonomy) publishes to classify scientific papers, from `cs.CL` Computation and Language to `math.AG` Algebraic Geometry. The nearest real category must be nearer than the nearest of a set of categories built by shuffling the real ones.
- [**Which published taxonomy terms the declared names match**](output/markdown/terms.md) — per normalisation level, and every one-word match discarded for standing alone in its part of the taxonomy (see [corroboration by branch](#matching-against-published-taxonomies)).
- [**The field drawn as a sunburst**](output/svg/taxonomy-sunburst.svg) — the whole published taxonomy, with the concepts this repository writes marked.

A run writes four pages beside those files: `output/html/index.html` traces the nine steps in order with each step's figures, `taxonomy.html` draws the field as a tree with every concept and its publisher's definition, `evidence.html` lists every match with a link to the line, and `themes-chart.html` carries both charts. **They are pages, so they render in a browser and not on this site** — open them from `output/` after a run. The markdown above and the two SVGs are what renders here.

## Calling it from Java

**A directory in, one validated export out.** `RepositoryReading` takes the path and reads it; `ExportedReading` turns that into the same document `output/json/reading.json` holds.

```java
RepositoryReading reading = RepositoryReading.of(Path.of("/path/to/repository"));
ReadingExport export = new ExportedReading().of(reading, "43cbdae6");
```

It takes the directory rather than finding one: nothing in it reads a system property, asks which tree a test is running inside, or memoises across a JVM. A run of diagnostics does want a shared reading per tree, and `TreeReading` holds that on the test side — which is why the decision about how long a reading lives stays out of the API.

**Reports too.** `ReportFolder` takes a directory and writes a report's markdown, with the page beside it rendered by whatever the caller supplies — the default writes the HTML twin this repository's reports have, and a consumer wanting markdown alone passes a renderer returning nothing. That keeps the markup library out of the published jar while leaving the behaviour unchanged.

**It says what it is doing.** A large tree takes minutes, and a caller watching silence cannot tell a slow parse from a hung one, so each stage logs what it is starting and what it found through SLF4J at `INFO` on `RepositoryReading`:

```
INFO  RepositoryReading - Parsing /path/to/repository — 9 source sets
INFO  RepositoryReading - Parsed /path/to/repository in 12.4s
INFO  RepositoryReading - Reading subjects over /path/to/repository — this is the slow stage, and it resamples 999 times
INFO  RepositoryReading - Read 552 topics over 2,156 files in 141.8s
```

Nothing writes to a stream a caller cannot redirect. Turn the logger down for silence, up for more; the library declares no SLF4J provider, so a consumer binds its own.

The taxonomy layer beneath it:

| To | Call |
|---|---|
| read a taxonomy the jar does not carry | `InjectedTaxonomy.named(Path.of("my-vocabulary.tsv"))` |
| take the same taxonomy a build would | `InjectedTaxonomy.fromCommandLineOrBundled()` — honours `-Dcs.taxonomy`, falls back to the bundled scheme |
| read any eight-column taxonomy file | `SkosRows.at(Path)`, the same reader the bundled ones go through |
| place a reading against subjects | `SubjectAreas.of(concepts)`, then `SubjectPlacement.byDivergence().of(distribution, subjects)` |
| judge that placement against chance | `SubjectNull.seeded(seed).of(nearest, distribution, descriptions)` |
| place against a functional taxonomy | `FunctionPlacement.fromClasspath().of(distribution, statementsByFunction)`, with `PermutedAssignment` as its null |
| match declared names against a term taxonomy | `InjectedTerms.of(published, source)`, then `CorroboratedReading.of(terms, concepts, parsed)` |
| compare two distributions directly | `new JensenShannon().divergence(a, b)` — bounded at one bit by its own definition |

**A named taxonomy that cannot be read throws rather than falling back.** A caller who asked for one taxonomy and silently received another would read a wrong answer without being told, so `InjectedTaxonomy.named` fails and says which file it could not read.

Worked example — place a repository's reading against BIAN rather than arXiv:

```java
InjectedTaxonomy bian = InjectedTaxonomy.of(BianServiceDomains.fromClasspath().concepts(), "BIAN");
List<SubjectTopics> domains = SubjectAreas.fromClasspath().of(bian.described());
List<SubjectPlacement.Placement> nearest =
        SubjectPlacement.byDivergence().of(repositoryDistribution, domains);
```

`described()` is what a placement needs and it is not the same as `concepts()`: a concept with no definition has no prose to compare, and CSO states none for any of its 14,636 topics — which is why CSO is matched as a term taxonomy instead.

## Backtesting

The taxonomies, the resources and the rules were all chosen while reading this tree, so a reading that works here establishes nothing on its own. A backtest reads a repository the reading was never written for.

`./gradlew evaluationFetch -Dcs.evaluation.dir=<dir>` fetches each member at the commit the manifest pins; `./gradlew evaluationRead -Dcs.evaluation.dir=<dir>` reads them, one report folder per member under `output/`. A fetch does nothing where the tree is already at its pinned commit, so a member is downloaded once and read as often as wanted.

### The members

Three, named in [`evaluation-set.tsv`](code-semantics-engine/src/test/resources/evaluation-set.tsv). Each domain is the category token the Apache Software Foundation states in its own DOAP record, published separately from the code and recorded **before** the reading runs; each licence is verified at the pinned revision rather than at HEAD.

| Member | Pinned at | Stated domain | Why it is there | Read |
|---|---|---|---|---|
| [Apache Tika](https://github.com/apache/tika) | `43cbdae6` | `content` | text and metadata extraction, five times this repository's size and outside its subject matter | yes |
| [Apache Maven](https://github.com/apache/maven) | `7ff92c68` | `build-management` | the negative control: no bundled vocabulary should say anything about it, and silence is the correct result | not yet |
| [Apache Santuario](https://github.com/apache/santuario-xml-security-java) | `6e978eea` | `security`, `xml` | the first member the bundled NIST Cybersecurity Framework partitions, which until now had no repository to fire on at all | not yet |

### What has been read: Apache Tika

[Apache Tika](https://github.com/apache/tika) at `43cbdae6`, Apache-2.0. Its domain is the category token the Apache Software Foundation states in its own DOAP record, written down before the reading ran. It is a text and metadata extraction toolkit — five times this repository's size and outside its subject matter.

| | Tika | This repository |
|---|--:|--:|
| Word occurrences read | 770,028 | 86,762 |
| Files | 2,156 | 463 |
| λ, share with a citation | 0.972 | 0.983 |
| Evidence resolving to no subject | 67.2% | 76.0% |
| Nearest arXiv archive | Computer Science, 37.2% | Computer Science, 34.1% |
| Nearest by chance | 42.5% | 41.2% |
| Nearest arXiv category | `cs.CL` Computation and Language, 39.2% | `cs.CL` Computation and Language, 39.7% |
| Subjects distinguishing some scope | `computing`, `linguistics` | `linguistics`, `computing` |
| OLiA concepts written, of 1,311 | 108 | 68 |
| OLiA root branches reached, of 70 | 13 | 12 |
| OLiA spans refused as the declared type | 1,850 | 90 |

**λ reproduces off this tree**, which is the first thing the backtest had to show: 0.972 against 0.983, on a repository nine times the size and in another domain.

**The reading places Tika under Computer Science and separates it from chance**, and `computing` is the subject distinguishing most of its scopes — which is what its own DOAP category states.

**A comment carries the weight of one writing, not one per file.** 45.1% of Tika's comment word occurrences stand in a comment written into more than one file, against 0.3% here, because this repository carries no licence header. The Apache header stands in 2,140 of Tika's 2,149 Java files, and [`CopiedComments`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java) weighs a comment standing in *n* files at 1/*n* — derived from the tree in hand, bounded in (0, 1] by its own definition, citing no bundled resource. Tika's reported themes are `computing` and `linguistics`.

**The category level does not separate the two.** Both repositories' nearest single subject is `cs.CL` Computation and Language, and Tika is the nearer at 39.2% against 39.7%. That is defensible — Tika extracts text and detects languages — and it is exactly why the evaluation set needs a member with no text in its subject matter. A scheme placing a text-extraction toolkit and a linguistics library in one category has not been shown to tell them apart.

**A name repeating its own declared type is the language's word.** `Set<String> mimeSet` writes `set` because Java asks for the type on the line. [`DeclaredTypeWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java) reads those words off the parse and the matcher refuses a span made only of them: **1,850 spans on Tika**, led by `string` 407, `result` 355, `object` 234, `writer` 175 and `document` 125, against 90 here. The word stays in the name, because dropping one closes a gap between two words the author never wrote next to each other; only the match is refused, and [the term report](output/tika/markdown/terms.md) names every term it removes.

**108 concepts on a text-extraction toolkit is a great many for a vocabulary of linguistic annotation.** Tika reaches 13 of OLiA's 70 root branches against this repository's 12. Tika extracts text and OLiA annotates text, so the two agree about something real — which is the next section's problem.

The whole reading is snapshotted under [the Tika report folder](output/tika): [the summary](output/tika/markdown/summary.md), [what each scope is about](output/tika/markdown/themes.md), [the words it chose](output/tika/markdown/vocabulary.md), [the taxonomy terms it writes](output/tika/markdown/terms.md) and [where it stands among published subjects](output/tika/markdown/subjects.md).

### What is not settled yet

A vocabulary must match inside its domain **and** produce few or no matches outside it. Tika extracts text and OLiA annotates text, so it is a poor negative control by construction, and no bundled taxonomy had a member inside its own domain at all.

Both gaps now have a member named, fetched and pinned, and **neither has been read**. Maven is the negative control — a build tool has no text in its subject matter, so the honest result is silence. Santuario is the positive control for the NIST Cybersecurity Framework, and its second stated token `xml` overlaps Tika's `content`, which also asks whether the reading separates two neighbouring domains. Until `evaluationRead` has run over all three, the figures above are one repository's.

## Definitions

Each term below has an everyday meaning too. The technical one is meant. The [glossary](docs/GLOSSARY.md) carries the rest — the words about words, the words about the shape of words, and the statistics — each with the class that implements it.

| Term | Meaning here |
|---|---|
| **scope** | **in Java, a [source set](https://docs.gradle.org/current/userguide/java_plugin.html#sec:source_sets)** — one `<module>/src/<set>/java` directory, so `lexicon/src/main/java` and `lexicon/src/test/java` are two scopes of one module. The repository's documentation is a scope of its own. A package, a class or a single file is not a scope, and neither is a Gradle module: a module with a main and a test source set is two scopes |
| **phrase** | one declared name, or one sentence of prose. It is the unit of evidence: each contributes a single unit of mass whatever its length, so a long javadoc sentence cannot outweigh a short field name |
| **sense** | one of the distinct meanings a dictionary lists under a word, as [WordNet](#references) enumerates them. `cite` has several, one of them summoning a defendant to court |
| **headword** | the word itself, with its senses pooled — the form a dictionary indexes |
| **lemma** | the dictionary form of an inflected word, as [WordNet](https://wordnet.princeton.edu/) indexes it: `citations` → `citation` |
| **λ (legibility)** | the share of word occurrences any bundled resource could be cited for |
| **divergence** | how far two distributions over subjects stand apart, bounded at one bit by its own definition and reported as the share of that bound it holds. [Defined with a worked example above](#step-1--measuring-the-difference-what-a-divergence-is-and-why-it-is-a-percentage) |
| **span** | one match of a published taxonomy term inside a declared name |
| **rung** | one step a publisher states between a concept and the root of its branch |

## What the parse takes

| Category | Taken | Weight per phrase |
|---|---|--:|
| Declared names | types, methods, fields, parameters, locals, record components, constants, pattern bindings, labels, the distinguishing segment of the package | 1.0 |
| Dependencies | imports belonging neither to the Java platform nor to the repository under analysis | 0.5 |
| Prose | javadoc, comments, and markdown the repository has not declared to be a working note | 0.5 |

A package is one naming decision however many files sit under it, so it is read once; and an import is read only in a source set the build publishes, which removes `junit`, `assertj` and `j2html` without naming a library.

## How a name becomes a subject

Worked example: the field `private final CitationSource citationSource;`. The same sequence with this repository's own figures is `output/html/index.html`, written by a run.

| | Step | On the example | Class |
|--:|---|---|---|
| 1 | The parse keeps the declaration and drops the use | `citationSource` is kept; the type `CitationSource` at this position is a use | [`ParsedRepository`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java) |
| 2 | Split at case transitions and separators | `citation`, `source` | [`Tokeniser`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java), [`IdentifierWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java) |
| 3 | Price a glued run against a frequency list, and keep whole any run the dictionary carries | `pushevent` → `push`, `event`; `abstains` and `userid` each stay one word, [for different reasons](#where-one-word-ends-and-the-next-begins) | [`WordSegmenter`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java), [`PieceCost`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java) |
| 4 | Fold a published run of words into one term | `partOfSpeech` → `part of speech`, one term counted once | [`CollocatedWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java) |
| 5 | Discard a word carrying no subject matter, and take the lemma of the rest | *of*, *and*, *which* leave; `citations` → `citation` | [`ContentWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java), [`WordMorphology`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java) |
| 6 | Collect what each resource says the word is about | `cite` → `law`, from the sense about summoning a defendant | [`TopicCitations`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java) |
| 7 | Count each label once, however many ancestors it arrives with | a word labelled `computing` arrives labelled `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences` as well, because the resource publishes every ancestor alongside the label. Counted as six, one statement about one word would be six times the evidence, so the five ancestors are folded back into `computing` | [`StatedTopics`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedTopics.java) |
| 8 | Weight each label, add them up per scope, and test the result against chance | one distribution over subjects per scope, and the distance each scope must exceed to be reported | [`TopicDistribution`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java), [`PermutationNull`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java) |

### Where one word ends and the next begins

The rules come from [UAX #29](https://www.unicode.org/reports/tr29/), the Unicode standard for text segmentation. Two of its word-boundary rules cover cases a splitter working from capital letters alone gets wrong:

| Rule | What it states | Effect |
|---|---|---|
| WB9, WB10 | a letter next to a digit is not a boundary | `utf8Decode` reads as `utf8` and `decode` |
| WB6, WB7 | a letter either side of an apostrophe is not a boundary | `resource's` is one word. Split at the apostrophe, the trailing `s` reaches the dictionary, which carries it as a noun |

#### A run with no boundary in it at all

`pushevent` carries no capital, no underscore and no digit, so nothing above divides it. Five steps decide what it is, in order, and **the first four are all refusals**:

| | The question | What answers it |
|--:|---|---|
| 1 | Is it a candidate at all? | A run under six letters, or one the frequency list already carries, or one WordNet carries, or one that is a known word plus an inflection, is **left whole**. Nothing further is asked |
| 2 | What are the ways of cutting it? | Every split into pieces, enumerated |
| 3 | What does each piece cost? | `log(rank) + 3` against the frequency list. **A piece of three letters or fewer must be genuinely common** — inside rank 1,000 for two letters, 6,000 for three — because the list carries fragments like `tc`, `ri` and `ity` that would let any identifier parse. A piece failing that is unreadable, and no split containing it can be scored at all |
| 4 | Is the split words or fragments? | A split whose pieces average under three letters is discarded |
| 5 | Which survives? | The cheapest. If none survives, the run is **left whole** |

**Three worked examples, and two of them come back whole.**

| Run | What happens | Why |
|---|---|---|
| `pushevent` | → `push`, `event` | Nothing carries `pushevent` whole, and both pieces are common words. `pu` + `shevent` prices worse |
| `abstains` | stays `abstains` | **Refused at step 1.** WordNet carries `abstains`, so it is never offered for cutting. This matters: on frequency alone it reads as `ab` + `stains`, both of which the list carries, and that split is what the dictionary check exists to stop |
| `userid` | stays `userid` | **Refused at step 3.** `user` + `id` needs `id`, which ranks 4,690 — far outside the 1,000 a two-letter piece must reach — so that split is unscorable, and no other cut of those six letters prices better. It splits only where a catalogue of published tokens vouches for `id`, and **no such catalogue is wired**: `CitedTokens.NONE` is what the reading runs on, because the one registry that would fill the seam carries `THE`, `OF`, `CODE`, `DATA` and `NAME`, and a segmenter arbitrating against it would find a reading for almost any run of letters |

So `abstains` is kept whole by a **dictionary**, and `userid` is kept whole by a **rarity floor**. Neither is a list of words to treat specially: the first is WordNet's own coverage, the second a rank against a published frequency list.

### Where each weight comes from

| Weight | Definition | Where it comes from |
|---|---|---|
| Sense coverage | labelled senses ÷ total senses | both counts from WordNet. The domain resource states in its own header that it omits domain-less senses |
| Specificity | `log(rank) / log(size)` | a published frequency list, which bounds it in `[0, 1]` by its own length |
| Phrase agreement | geometric mean over the words that agree on a subject, times the share of the phrase's words that agree | the words of the phrase, read together. On its own, `cite` could be law (summoning a defendant), linguistics or publishing. The name is `citationSource`, so the reading scores the pair: `citation` and `source` both carry publishing, neither carries law, and publishing is what the name is scored for |

### Why a raw word count is not enough

The words a Java program contains most of are the words *every* Java program contains most of. Each word is therefore scored against the rate at which two references write it:

| Reference | What it states | What it scores down that the other cannot |
|---|---|---|
| The bundled frequency list | what ordinary English is written in, as a rank per word | `the`, `of`, `that` |
| [`PlatformVocabulary`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/PlatformVocabulary.java), from `ModuleFinder.ofSystem()` | what ordinary Java is written in: every type name and every public or protected method name the platform declares in its exported packages, split by the same grammar | `get`, `set`, `value`, `map`, `object`, `list`, `string`, which a frequency list of English finds *specialist* |

The second asks the running JDK to describe itself, the same delegation [`PlatformPackages`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PlatformPackages.java) uses to sort an import. [`ClassFileMethods`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java) reads the method names from each class file's constant pool, loading no class. A word ranks high only where both references write it less often than this repository does; where a reference writes it more often, its score falls and it keeps its place in the table. [See the whole ranking](output/markdown/vocabulary.md).

## Matching against published taxonomies

**Four readings, four words.** They answer different questions and the report names them apart, because a reader handed one list of "results" cannot tell which question it answers:

| Reading | Called | Reads | Answers |
|---|---|---|---|
| Dictionary labels on the words a repository declares | **themes** — `themes`, `summary.about` | WordNet Domains, Wiktionary topics | what its words are about |
| A published taxonomy's prose, compared as a distribution | **placement** — `summary.placedIn` | arXiv, NIST CSF, BIAN | which published subject it stands nearest, against chance |
| A published taxonomy's terms, matched against declared names | **concepts** — `taxonomies[].concepts` | OLiA, FIBO, CSO | which published concepts it spells |
| The branches those concepts concentrate in | **subjects** — `taxonomies[].subjects` | the same taxonomy's own hierarchy | what the concepts it spells are about |

The fourth exists because the third has a hard limit: **a term match can only find a concept whose name the code writes.** Apache Tika does document processing and never declares an identifier reading *document processing*, so that concept is unreachable to the matcher while `xml`, `html`, `css` and `hyperlink` — which it does declare — all sit beneath it. Walking to the branch is how a reading reaches what a repository is about rather than what it happened to spell. **The walk does not work yet**: on Tika it reaches *network protocols* where its stated domain is *document processing*, because the score rewards branch size and Tika's matched leaves are dominated by generic web terms.

**Three kinds, and the difference decides what a reading can tell you.** Two of them are the same *shape* — prose per concept, compared as a distribution — and answer different questions; the third has no prose and can only be matched.

| Kind | What it partitions | Shape | What it can tell you | What it cannot |
|---|---|---|---|---|
| **Subject scheme** | a field of study | prose per subject | which published subject this repository reads most like, against chance | nothing about software with no research field — payments, ledgers, build tooling |
| **Functional taxonomy** | what an organisation *does* | prose per function | whether a repository's work looks like a stated capability — trade processing rather than wealth management | nothing about a repository outside the institution it partitions |
| **Term taxonomy** | what a field's things are *called* | labels, often no prose | which of a field's published concepts this repository declares, as identifiers a reader can check | nothing about a repository that uses a field's ideas without writing its words |

`TaxonomyShape` decides the last column from the file itself — prose present or absent — because that is all the code can know. **Subject and functional are the same shape**: arXiv's categories and BIAN's service domains are read by identical machinery and differ only in what their publisher was classifying, which is a fact about intent that no file states.

| Kind | Example | How it is used |
|---|---|---|
| **Subject scheme** — classifies whole documents | the [arXiv category taxonomy](https://arxiv.org/category_taxonomy): 152 categories the preprint archive uses to file scientific papers, each with a published description | as a reference distribution. Its category names never appear in code, so the reading pools each category's own description through the same pipeline and compares distribution against distribution |
| **Term taxonomy** — names the terms a field's practitioners use | [OLiA](https://github.com/acoli-repo/olia), [FIBO](https://spec.edmcouncil.org/fibo/), [CSO](https://cso.kmi.open.ac.uk/) | matched against declared names. OLiA publishes `AdjectivePhrase`; a repository may declare `adjectivePhrase`, and both split into the same two words |
| **Functional taxonomy** — partitions what an organisation *does* | the [NIST Cybersecurity Framework](https://www.nist.gov/cyberframework), the [BIAN Service Landscape](https://github.com/bian-official/artefacts) | as a reference distribution, like a subject scheme. Nobody writes `GV.OC-01` in code and nobody writes Organizational Context either, so each function is read from the statements its publisher files under it |

**Every taxonomy is converted to [SKOS](https://www.w3.org/TR/skos-reference/) before it is read** — the W3C model for published vocabularies: each concept has a preferred label, any number of alternative labels, and `broader`/`narrower` links to its neighbours. OLiA arrives as OWL and FIBO as RDF/XML; both become the same rows, so the matcher and the branch rule work the same way whatever the publisher used.

### Subject scheme

The bundled one is the [arXiv category taxonomy](https://arxiv.org/category_taxonomy), read from [`arxiv-taxonomy.tsv`](lexicon/src/main/resources/arxiv-taxonomy.tsv): 174 rows — 8 groups, the 11 archives inside them and 155 categories, of which the 152 arXiv publishes a description for are what the reading uses. Nobody writes `cs.CL` in code and nobody writes Computation and Language either, so [`PooledDescriptions`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PooledDescriptions.java) pools each category's own description through the pipeline above and [`SubjectPlacement`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectPlacement.java) compares distribution against distribution. [`SubjectNull`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNull.java) builds a taxonomy of chance from the same descriptions, and the nearest real category has to beat the nearest chance one.

**Two gaps, both of which move a reported figure:**

- **It classifies research, so commercial software is placed by resemblance to a research field.** Finance and economics take 12 of the 174 rows — Trading and Market Microstructure, Risk Management, Pricing of Securities, Portfolio Management — and a trading system is placed against those.
- **Whole domains have no category at all**: payments and settlement, ledgers, e-commerce and order management, health records, logistics, telecommunications operations, identity, and deployment tooling. Something is always nearest, and the reading cannot state that the right answer was absent from the list.

[PyPI's 321 `Topic ::` classifiers](https://pypi.org/classifiers/) cover much of what arXiv does not — `Office/Business :: Financial :: Point-Of-Sale`, `Communications :: Telephony`, `System :: Logging` — and could replace it. **Two measurements shape the swap.**

- **Trove states no definition for any classifier**, so it cannot be read as a subject scheme at all: this section compares a repository's distribution against a category's *prose*, and there is none. Trove is a term taxonomy of activity names, matched against declared names, which is a different mechanism and a different chunk of the plan.
- **Half its leaf names are single ordinary words** — 153 of 298, including `System`, `Session`, `Testing`, `Unit`, `General`, `Libraries`, `Filters` and `Analysis`. Every Java repository declares a dozen of them, which is what the corroboration rule below exists to survive.

What settles the swap is the share of repositories whose stated category has a nearest subject at all under each scheme.

#### A second subject scheme is bundled, and it is not the default

[OpenAlex](https://openalex.org/) publishes 4,516 research topics under 252 subfields, 26 fields and 4 domains, each topic carrying a description and ten keywords. It is read from [`openalex-topics.tsv`](lexicon/src/main/resources/openalex-topics.tsv) — 4,798 rows, CC0 — extracted from a snapshot pinned by digest, and it answers arXiv's second gap in part: it names *Personal Information Management*, *Library Science and Information Systems* and *Caching and Content Delivery*, where arXiv names none of them. Its descriptions run to a 69-word median against arXiv's 18.

**It stays out of the default placement until it clears the out-of-domain control.** Placed against a repository the reading was not written for, the best of 4,516 chance subjects comes nearer than the best real one, so the reading reports nothing — while arXiv clears its null on the same repository. Both are two commands, and the figures are in [`BACKLOG.md`](BACKLOG.md):

```
./gradlew functionalPlacement -Ptaxonomy=lexicon/src/main/resources/openalex-topics.tsv
./gradlew functionalPlacement -Ptaxonomy=lexicon/src/main/resources/arxiv-taxonomy.tsv
```

[`SubjectNull`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNull.java) keeps the field size and the real description lengths and draws the words from the pooled vocabulary of every description, so a chance subject under OpenAlex is 69 words of generic academic English drawn from all of science, where under arXiv it is 18 words drawn from a physics-heavy pool of 152. **Two explanations fit and one measurement separates them**: a random 152-topic subsample of OpenAlex, placed against the same repository. If chance still wins, the pooled vocabulary is the cause; if it stops, the field size is.

### Functional taxonomy

A functional taxonomy names what an organisation does rather than what things in its field are called, so it is compared as a distribution and never matched term by term. The bundled one is the [NIST Cybersecurity Framework 2.0](https://www.nist.gov/cyberframework), read from [`nist-csf-functions.tsv`](lexicon/src/main/resources/nist-csf-functions.tsv): six functions, and every category and subcategory NIST files under one of them. [`FunctionPlacement`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java) pools each function's statements and compares them with a scope's own reading.

**A framework needs a different null from a subject scheme.** A framework's functions all come from one document in one register, so they share a vocabulary by construction — asking whether their words could have arisen by chance is already answered. [`PermutedAssignment`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutedAssignment.java) instead reassigns the framework's own statements to its own functions, each function keeping the number its publisher gave it. Every statement is real and every function keeps its size; only which statements pool together is chance. So a function clears its null only where the *partition* carries something.

**No function reported is a correct outcome.** A repository with no security surface should land nowhere, and this one does — [the security-functions report](output/markdown/security-functions.md) carries the figures.

**It is compared and never matched because this reading produces only nouns.** A functional taxonomy publishes verb phrases — BIAN states `Manage Enterprise Risk` — and every signal here is a noun an author chose for a thing. Nobody writes `ManageEnterpriseRisk`, and plenty of repositories write `manage` and `risk` in one method signature: the methods are verbs applied to the nouns the term matching already covers, and reading them is what would let a functional taxonomy be matched identifier to identifier like a term taxonomy.

### Reading against a taxonomy the published jar does not carry

A source is a candidate long before anything decides to publish it, and a candidate has to be read by the same reading that would bundle it, or the measurement is not the one the bundled reading would take.

| From | How |
|---|---|
| a build | `./gradlew functionalPlacement -Ptaxonomy=<path>`, or `-Dcs.taxonomy=<path>` on any reading |
| a program | `InjectedTaxonomy.named(Path)`, or `InjectedTaxonomy.fromCommandLineOrBundled()` for the same resolution a build gets |

A named file that cannot be read **fails rather than falling back** to the bundled taxonomy: a caller who asked for one taxonomy and silently got another would read the wrong answer without being told.

### Term taxonomy

[`TermSpans`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java) takes the longest published term at each position, left to right, with no two matches overlapping. A prefix that is not itself a published term is not evidence.

**Three normalisation levels, reported separately and never summed. The narrowest that answers is the one that answers, and a wider one is asked only where the narrower said nothing:**

| Level | Both sides reduced to | Source |
|--:|---|---|
| 1 | the sequence of words itself | a string comparison |
| 2 | the [lemma](docs/GLOSSARY.md) of each word | WordNet's lemma index. `phrases` matching `Phrase` is one word and its plural |
| 3 | the [synset](https://wordnet.princeton.edu/) each word belongs to — the set of words WordNet records under one meaning | WordNet's sense index. `nominal phrase` meets `noun phrase` because the dictionary wrote both spellings into one entry |

**Both sides go through one normalisation.** [`LemmaRuns`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java) and [`SenseRuns`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java) are put over the publisher's terms when the index is built and over the repository's runs when they are asked about, so neither side is privileged.

**Level 2 is reported apart from level 3 so that a plural cannot be counted as a shared meaning.** Level 3 is the widest claim and carries the risk with it: WordNet reads `topic`, `theme` and `subject` as one entry, so a repository writing about topics meets a taxonomy stating subjects whether or not either meant the other. Every match records the level that found it, and [the term report](output/markdown/terms.md) prints the levels apart.

**A run is offered to the dictionary whole before its words.** `SenseRuns` asks WordNet for `document processing` first, and falls back to a run of two senses only where the dictionary carries no entry for the pair.

**A level that cannot read a run stops the ladder.** A level that searched and found nothing and a level that could not look are different answers, and only the first is a reason to ask a wider one. WordNet holds no dictionary form for `id` and does hold the psychoanalytic noun, so without this rule a name written `id` reaches a term spelled `ids` — which the Computer Science Ontology states for an intrusion detection system — through a level that had no business answering. The rule removes the match outright.

**A taxonomy's own labels are read as words.** A declared name cannot hold a space, and a taxonomy written in English is full of them: the Computer Science Ontology states 12,850 of its 14,636 topics as several words. `IdentifierWords` treats a space as a separator alongside the dot and the dollar, so `natural language processing` is three words and `naturalLanguageProcessing` can meet it.

**Corroboration by branch.** A taxonomy is a tree: every concept sits under a parent, beside sibling concepts the publisher placed there. A match on a single word counts only where the repository also writes at least one of that concept's siblings. Writing several concepts from one part of a field is evidence of working in it; writing a single one is what an ordinary English word the taxonomy has claimed produces.

Worked example: OLiA places `Preferred` under `UsageAndFrequencyFeature`, beside `Rare`, `Common` and the rest. This repository writes `Preferred` once and none of its siblings, so the match is discarded. `Verb` survives, because `Noun`, `Clause` and `Phrase` are written too. A match of more than one word — Tika's `AdjectivePhrase` against OLiA's — needs no such support, because two words matching by chance is far less likely than one.

**The three bundled term taxonomies** — the functional ones are above:

| Taxonomy | Field | What it tests |
|---|---|---|
| [OLiA](https://github.com/acoli-repo/olia) — Ontologies of Linguistic Annotation | linguistic annotation | the in-domain case: a vocabulary of grammar should match a library built from lemmas and senses |
| [CSO](https://cso.kmi.open.ac.uk/) — the Computer Science Ontology, 14,636 topics | computer science | the near-domain case: the first source measured here that separates this repository from Apache Tika, which the subject scheme files under one category |
| [FIBO](https://spec.edmcouncil.org/fibo/) — Financial Industry Business Ontology | finance | the out-of-domain case: a vocabulary of finance should match almost nothing in it |

A vocabulary matching inside its own domain establishes nothing, because any sufficiently large word list matches something somewhere. What has to be shown is that it produces few or no matches outside that domain.

## Modules

| Module | Contents |
|---|---|
| `lexicon` | the bundled lexical resources and the code that reads them: WordNet via extjwnl, Wiktionary abbreviations, topic labels and hierarchy, Wikidata names and initialisms, an SQL function catalogue |
| `lexicon-extraction` | Gradle tasks that regenerate each bundled resource from its published source at a pinned revision |
| `code-semantics-api` | model records and stage contracts: the evidence trail, `SourceAnchor`, `RepositoryFacts`, pooled log-odds arithmetic, the tokeniser, the word segmenter |
| `code-semantics-engine` | the pipeline: parse, word extraction, topic resolution, divergence statistics, reports |

Every bundled resource states its source URL, revision and licence in a `#` header, and the build fails without one. [`NOTICE.md`](NOTICE.md) lists each file and its terms.

## Excluding files from a reading

Put a `.readingignore` at the root of the directory to be read. One glob per line, `#` for a comment, paths relative to that root; it applies to source directories as well as prose, and no file means nothing is excluded. Use it for what records how the work is done rather than what it is for.

```
# Notes about how the work is done. Exclude them from any reading.
CONTRIBUTING.md
docs/plans/**
**/generated/**
```

## Limitations

- **Java only, for now.** The parse, the platform reference and the declaration rules are all Java's. SQL and TypeScript are the next two languages, and each needs its own parse and its own reference.
- **A word is resolved from its phrase alone.** The words of one declared name are read together and nothing else contributes evidence — the type the name is declared on, the class it sits in and the rest of the file all play no part. `citationSource` resolves correctly because `citation` and `source` both carry publishing and neither carries law; a field named `source` on its own gets whatever the dictionary lists, and the surrounding code cannot correct it. Reading Apache Tika is where that shows: `stream` there is read as *geography*, `pipe` as *hydraulics*, and `detector` as *electrotechnology*. In each case the sense a program means is not the sense the resources carry.
- **The domain-label resources cover specialist senses only.** [WordNet Domains](https://wndomains.fbk.eu/) states in its own header that it omits domain-less senses, so a word used in its everyday meaning is either unlabelled — contributing nothing — or labelled with the one specialist sense somebody recorded for it. `log`, `root`, `stub` and `tree` are all read as *plants*, because the timber is a sense a domain resource labels and the file a program appends to is not.
- **The taxonomies were chosen after examining this codebase**, so the term matching has not yet been shown to discriminate. One out-of-domain repository has been read; an evaluation set of them is what would settle it.
- **The splitter has known failure cases**, each pinned by a test. The one bundled catalogue that would arbitrate them was measured and rejected: the Wikidata initialism registry lists `THE`, `OF` and `AND` beside the tokens a Java file is made of — `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE`.
- **A scope is a source-set directory.** That keeps generated output out of the reading with no list of directories to ignore, but a repository laid out any other way reads as having no Java in it, silently.
- **A read takes minutes.** Every reported bar is derived by resampling — 999 seeded chance draws per scope, per reference and per subject scheme — and every declared name is matched against every taxonomy, so the cost grows with the repository and no result is kept between runs. Measured on one laptop, reader at `b6790b2`; the stage rows are what `./gradlew readTimings` prints, each stage's own first cost, and the whole run adds loading the bundled resources and writing every report:

| | This repository | [Apache Tika](https://github.com/apache/tika) at `43cbdae6` |
|---|--:|--:|
| `./gradlew read`, the whole run | 1m 3s | 3m 15s |
| The parse and the legibility reading | 5s | 21s |
| The topic reading, with each scope's chance draws | 8s | 68s |
| The arXiv subject placement, with its chance draws | 9s | 10s |
| The published-names chance draws | 2s | 10s |
| The term match against every bundled taxonomy, corroborated | 4s | 9s |
| The export | 1s | 1s |

The topic reading with its per-scope chance draws holds most of the stage cost on a large repository. The arXiv placement is close to constant, because most of its cost is reading the scheme's own 152 subject descriptions and its 1,998 chance descriptions through the same pipeline, and neither grows with the repository. Matching cost grows with the taxonomy: every declared name is offered to each of a taxonomy's three normalisation levels, so the [CSO](https://cso.kmi.open.ac.uk/)'s 14,636 topics cost more than [OLiA](https://github.com/acoli-repo/olia)'s 1,311 concepts. A repository with eight times the word occurrences reads in three times the time.

## Appendix: diagnostics and analysis

Each one answers a question the reports raise but do not settle: why a word scored as it did, what carried a topic, and what the reading does on a repository it was not written for.

| Command | What it answers |
|---|---|
| `./gradlew wordVotes -Pwords="cite source"` | every subject each resource gives those words, and what each vote is worth |
| `./gradlew wordPlace -Pwords="get set list"` | where those words stand in the vocabulary ranking, and which reference scored each of them down |
| `./gradlew topicCarriers -Ptopics="linguistics"` | every word that produced a topic's score, with its share |
| `./gradlew abbreviatedTypes` | every declared name that is the initials of its own type, with that type |
| `./gradlew verbPhrases` | every clause the declared method names state — verb, then what it acts on — with the leading words WordNet has no verb for, published and test scopes apart |
| `./gradlew wordsAndPhrases` | every word and multi-word phrase the chosen names state four or more times, clauses included, by raw count — the flat view the weighted rankings rest on |
| `./gradlew readTimings` | where the time of a read goes, one stage per row — the finer split of the table in [Limitations](#limitations) |
| `./gradlew evaluationFetch -Dcs.evaluation.dir=<dir>` | fetches each backtest member at the commit the manifest pins it to |
| `./gradlew evaluationRead -Dcs.evaluation.dir=<dir>` | reads every member of the evaluation set, one report folder per member |

## Appendix: what the reading discarded

Each report names what it did not use, at the end of that report and nowhere else: [topics no further away than chance resampling put them](output/markdown/summary.md), [one-word taxonomy matches standing alone in their branch](output/markdown/terms.md), and [words no bundled resource has an entry for](output/markdown/self-reading.md).

## References

| | Reference |
|---|---|
| Banking capabilities | [BIAN Service Landscape](https://github.com/bian-official/artefacts), Banking Industry Architecture Network. 319 service domains, Apache-2.0 |
| Computer science topics | [CSO](https://cso.kmi.open.ac.uk/), the Computer Science Ontology, Knowledge Media Institute, The Open University. 14,636 topics, CC BY 4.0, and no definition for any of them |
| Financial terms | [FIBO](https://spec.edmcouncil.org/fibo/), EDM Council |
| Jensen–Shannon divergence | Lin, J. (1991), *Divergence measures based on the Shannon entropy*, IEEE Transactions on Information Theory 37(1), 145–151. Bounded at 1 bit under base-2 logarithms |
| Kullback–Leibler divergence | Kullback, S. and Leibler, R. A. (1951), *On information and sufficiency*, Annals of Mathematical Statistics 22(1), 79–86. Unbounded above, which is why no figure here is reported in it |
| Linguistic annotation terms | [OLiA](https://github.com/acoli-repo/olia), Ontologies of Linguistic Annotation |
| Partitioned security activity | [NIST Cybersecurity Framework 2.0](https://www.nist.gov/cyberframework), read from NIST's own OSCAL edition. A US Government work |
| Permutation test | Good, P. (2005), *Permutation, Parametric and Bootstrap Tests of Hypotheses*, 3rd ed., Springer |
| Published subjects | [arXiv category taxonomy](https://arxiv.org/category_taxonomy), 152 subjects |
| Published vocabularies, one model | [SKOS](https://www.w3.org/TR/skos-reference/), W3C Simple Knowledge Organization System |
| Research topics | [OpenAlex](https://openalex.org/), 4,516 topics under 252 subfields, 26 fields and 4 domains, CC0 |
| Subject labels per sense | [WordNet Domains](https://wndomains.fbk.eu/), Fondazione Bruno Kessler |
| Property accessor names | [JavaBeans specification 1.01](https://www.oracle.com/java/technologies/javase/javabeans-spec.html), section 8.3, design patterns for properties — `get`, `set` and `is` |
| The platform's own vocabulary | `java.lang.module.ModuleFinder.ofSystem()`, and the class file format, [JVMS §4.4](https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html) |
| Topic labels per headword | [Wiktionary](https://en.wiktionary.org/), read through [wiktextract](https://github.com/tatuylonen/wiktextract) |
| Word boundaries | [UAX #29, Unicode Text Segmentation](https://www.unicode.org/reports/tr29/), rules WB6, WB7, WB9, WB10 |
| Word frequency | [Leipzig Corpora Collection](https://wortschatz.uni-leipzig.de/en/download), three English corpora of one million sentences each |
| Word sense, lemma, synset | [WordNet](https://wordnet.princeton.edu/), Princeton University. Fellbaum, C. (ed., 1998), *WordNet: An Electronic Lexical Database*, MIT Press |

## Licence

Apache-2.0 ([`LICENSE`](LICENSE)), declared in the published POM. The bundled lexical data is licensed separately and each file states its own terms; two files derived from Wiktionary are CC BY-SA 4.0, which attaches to those files rather than to code that reads them. [`NOTICE.md`](NOTICE.md) lists every file.
