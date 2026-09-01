# code-semantics

[![build](https://github.com/fiftiesHousewife/Semantic/actions/workflows/build.yml/badge.svg)](https://github.com/fiftiesHousewife/Semantic/actions/workflows/build.yml)

A Java library that states what subject matter a source repository is concerned with, by reading the words in the names its authors declared.

- **Takes** a directory of Java source. No clone, no build, no type resolution, no network.
- **Gives** three JSON files: the answer, the workings behind it, and what moved since the last run.
- **Decides from published resources.** A dictionary states which words carry subject matter, a frequency list states which are ordinary, a hundred drawn repositories state what working Java is written in, and 999 seeded resamples state which figures chance produces. This project writes no word list of its own.
- **Reports a figure only where it exceeds every one of those 999 resamples.**

It works in the terms of lexical semantics and information theory. The [glossary](docs/GLOSSARY.md) defines every term it uses, with a reference for each.

**Every figure below is a reading of a named commit.** This repository is inside the corpus it reports on, including this file, so writing a figure down changes it. `./gradlew read` regenerates them all.

## Running it

| Command | What it does |
|---|---|
| `./gradlew read` | reads this repository and writes the three files under [`output/json/`](output/json) |
| `./gradlew read -Dcs.clone.dir=<path>` | reads another checkout, and writes its files under `output/<name>/json/` |
| `./gradlew readingExport` | writes [`reading.json`](output/json/reading.json) alone |
| `./gradlew checkAll` | tests and coverage verification, which is what [the build](.github/workflows/build.yml) runs on every push and pull request |

A read of this repository takes about four and a half minutes. [Limitations](#limitations) states where that time goes.

Java 25 toolchain, `-Xlint:all -Werror`, Error Prone, an 80% JaCoCo instruction floor per module.

The commands that answer a question about one word, one subject or one evaluation-set member are in [the appendix](#appendix-diagnostics).

## Calling it from Java

The coordinate is the `reading-export` module, which brings the engine and the matcher with it:

```kotlin
implementation("io.github.fiftieshousewife:reading-export:0.1.0-SNAPSHOT")
```

`./gradlew publishToMavenLocal` puts the jars in `~/.m2/repository` under that coordinate. Nothing is on Maven Central yet.

**A directory in, one validated export out.** [`ExportedReading`](reading-export/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java) takes the path, reads it, and returns the document [`reading.json`](output/json/reading.json) holds. The commit is an argument because the library reads no `.git`: what a working tree is checked out at is a fact its caller states, and a caller with none passes the empty string.

```java
ReadingExport export = new ExportedReading().of(Path.of("/path/to/repository"), "43cbdae6");
```

Writing it is one more call. [`ExportFile`](reading-export/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java) checks the document against [the export schema](reading-export/src/main/resources/reading-export.schema.json) before it reaches a file, so a run produces a document matching that schema or produces none:

```java
new ExportFile().wrote(Path.of("reading.json"), export);
```

[`PublishedFormat`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java) refuses any file name whose suffix it does not state, and the only suffix it states is `.json`.

**A caller who already holds a reading passes it in.** [`RepositoryReading`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java) is the parse and the topical reading on their own, and `ExportedReading` takes one where a program has already computed it, along with a term reading, a field placement and the chance thresholds over the published names — each an overload:

```java
RepositoryReading reading = RepositoryReading.of(Path.of("/path/to/repository"));
ReadingExport export = new ExportedReading().of(reading, "43cbdae6");
```

It takes the directory rather than finding one. Nothing in it reads a system property, asks which tree a test is running inside, or memoises across a JVM.

**It states what it is doing.** A large tree takes minutes, so each stage logs what it started and what it found, through SLF4J at `INFO` on `RepositoryReading`:

```
INFO  RepositoryReading - Parsing /path/to/repository — 9 source sets
INFO  RepositoryReading - Parsed /path/to/repository in 12.4s
INFO  RepositoryReading - Reading subjects over /path/to/repository — this is the slow stage, and it resamples 999 times
INFO  RepositoryReading - Read 552 topics over 2,156 files in 141.8s
```

Nothing writes to a stream a caller cannot redirect. The library declares no SLF4J provider, so a consumer binds its own.

The taxonomy layer beneath it:

| To | Call |
|---|---|
| read a taxonomy the jar does not carry | `InjectedTaxonomy.named(Path.of("my-vocabulary.tsv"))` |
| take the same taxonomy a build would | `InjectedTaxonomy.fromCommandLineOrBundled()`, which honours `-Dcs.taxonomy` and falls back to the bundled scheme |
| read any eight-column taxonomy file | `SkosRows.at(Path)`, the reader the bundled ones go through |
| place a reading against subjects | `SubjectAreas.of(concepts)`, then `SubjectPlacement.byDivergence().of(distribution, subjects)` |
| judge that placement against chance | `SubjectNull.seeded(seed).of(nearest, distribution, descriptions)` |
| match declared names against a term taxonomy | `InjectedTerms.of(published, source)`, then `CorroboratedReading.of(terms, concepts, parsed)` |
| compare two distributions | `new JensenShannon().divergence(a, b)`, bounded at one bit by its own definition |

**A named taxonomy that cannot be read throws.** A caller who asked for one taxonomy and received another would read a wrong answer, so `InjectedTaxonomy.named` fails and states which file it could not read.

## What a run writes

Three files under `output/json/`, all committed, so the current figures can be read without running anything.

| File | Holds | Validated |
|---|---|---|
| [`reading.json`](output/json/reading.json) | the answer and the evidence for it | against [`reading-export.schema.json`](reading-export/src/main/resources/reading-export.schema.json) before the file exists |
| [`evidence.json`](output/json/evidence.json) | the workings: every word with the subjects it contributed to, every dropped topic with the rule that dropped it, every run no resource covered, and every file with the topic leading it | nothing, and it states its own `schemaVersion` |
| `changes.json` | each figure before and after, and every topic, word and concept that entered or left | written only where a previous reading shares the same `schemaVersion` |

`reading.json` is at `schemaVersion` **24.0**. The version rises when a field is added, renamed or removed, so a consumer branches on it. [`ReadingExportSchemaTest`](reading-export/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java) fails the build on a change the schema does not state.

| Section | Holds | One entry per |
|---|---|---|
| `summary` | the answer | run |
| `signals` | the words this repository writes more of than ordinary English and working Java do | word or published phrase |
| `themes` | the subjects separating one part of the repository from the rest | topic, in the scope that separates |
| `taxonomies` | the published concepts the declared names match, with the level each match was found at | vocabulary published |
| `setAside` | what the reading measured and left out of those three lists | run |

### The summary answers on its own

Read at commit `1a55ee6`, abbreviated:

```json
{
  "repository": "CodeSemantics",
  "commit": "1a55ee6b317a810c6b802e26c412254a7f48e29d",
  "answers": [
    { "sourceType": "taxonomy", "source": "OLiA",
      "statedPath": ["InflectionTypeFeature"],
      "result": "BaseForm — Uninflected forms and forms that have the same form are tagged as BaseForm.",
      "qualifiedBy": "4 phrases against the 2 a deal of its own words reaches",
      "timesItsBar": 2.0 },
    { "sourceType": "taxonomy", "source": "CSO",
      "statedPath": ["artificial intelligence"],
      "result": "machine learning — Machine learning (ML) is a field of study in artificial intelligence.",
      "qualifiedBy": "8 phrases against the 6 a deal of its own words reaches",
      "timesItsBar": 1.33 }
  ],
  "about": ["linguistics", "computing", "grammar"],
  "aboutStatedBy": ["WordNet Domains", "Wiktionary topics"],
  "placedIn": [
    { "scheme": "arXiv",
      "archive":  { "subject": "Computer Science", "divergenceBits": 0.3281,
                    "nearestByChanceBits": 0.4100, "standsApartFromChance": true },
      "category": { "subject": "Computation and Language", "divergenceBits": 0.4176,
                    "nearestByChanceBits": 0.4534, "standsApartFromChance": true } },
    { "scheme": "OpenAlex", "...": "Artificial Intelligence, and Authorship Attribution and Profiling" },
    { "scheme": "CSO",      "...": "linguistics, and information technology" }
  ],
  "distinctiveScopes": [
    { "scope": "lexicon/src/main/java", "divergenceBits": 0.1160,
      "writesMoreOf": ["linguistics", "grammar"] }
  ],
  "leadingWords": [{ "word": "word", "divergenceBits": 0.0158, "occurrences": 395 }],
  "leadingConcepts": [
    { "concept": "Source",     "publishedBy": "OLiA" },
    { "concept": "vocabulary", "publishedBy": "CSO" }
  ],
  "shareOfWordsWithACitation": 0.9809,
  "shareOfMassOnNoSubject": 0.8470,
  "counts": { "signals": 282, "themes": 8, "concepts": 171 }
}
```

**`answers` holds every source that qualified at the first level to qualify**, ranked by how rarely a chance deal reaches its count. The levels back off — a vocabulary's terms of more than one word, then the same vocabularies' one-word terms, then every subject scheme level standing apart from chance — and the backoff runs between levels and never inside one. On [jPOS](https://github.com/jpos/jPOS), a card-payment library, five vocabularies qualify at the first level, and the one placing its matched concept under `Cards` is not the one with the rarest count. A reading with nothing above chance holds one entry stating that.

**`placedIn` states three schemes and two levels each.** `archive` is compared against every category's description pooled under it, which is enough prose for the divergence to be stable. `category` is compared against the few dozen words the scheme states for that subject alone, which is the weaker measurement and the sharper answer. Read `standsApartFromChance` before reading `subject`: some subject is always nearest.

Each list beneath the summary answers a follow-up question.

| To find out | Read |
|---|---|
| which words separate this repository from its references, and where each was written | `signals` |
| what one part of the repository is about | `themes` |
| which published concepts the declared names match | `taxonomies[].concepts` |
| how much was measured and left out | `setAside` |

Any JSON reader will do: `JSON.parse` in a browser or Node, [`jq`](https://jqlang.github.io/jq/) at a shell, or a type generated from the schema, which ships inside the published jar at `/reading-export.schema.json`.

One signal, in full:

```json
{
  "readFrom": "CLONE",
  "word": "lemma",
  "occurrences": 22,
  "occurrencesInNames": 22,
  "divergenceBits": 0.0015700827861832715,
  "closestReference": "working Java",
  "firstWrittenAt": {
    "file": "code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java",
    "line": 64
  }
}
```

`divergenceBits` is this word's term of the [Jensen–Shannon divergence](#references) between this repository's word distribution and the reference's, bounded at 1 bit. `closestReference` names the reference scoring the word lowest, which is the score reported: `get` scores high against ordinary English and low against working Java, so working Java is its closest reference. Each reference's threshold comes from that reference's own [permutation null](#references), so the number of rows follows from the repository's size.

**`setAside` is what makes the three lists readable.** 282 signals out of 1,292 words scored is a different claim from 282 out of 8,000.

| Key | On this repository |
|---|--:|
| `wordOccurrencesNoResourceCovers` | 3,034 |
| `wordsBelowEveryThreshold` | 1,000 |
| `wordsWithinTheReferencesError` | 30 |
| `wordsTheLanguageSupplies` | 10 |
| `scopesWithinChance` | 5 |
| `matchesDiscardedByBranchRule` | 78 |
| `termsWorkingJavaAlsoWrites` | 2,761 |
| `vocabulariesBelowTheirChanceBar` | 5, each named with the count it reached and the count a chance deal reaches |
| `filesTheParserCouldNotRead` | 0 |

`wordsTheLanguageSupplies` holds the words English puts inside a name. `massByTopic` is a name about mass and about topics, and `by` is what the language puts between them; against a frequency list drawn from prose it reads as specialist, because prose is not where a program's prepositions are written. Two bundled resources place such a word between them — WordNet carries no noun, verb or adjective entry for it, and the frequency list carries it as a word English is written in.

## Definitions

Each term below carries an everyday meaning as well. The technical one is meant. The [glossary](docs/GLOSSARY.md) carries the rest, each with the class that implements it.

| Term | Meaning here |
|---|---|
| **scope** | one [source set](https://docs.gradle.org/current/userguide/java_plugin.html#sec:source_sets) — a single `<module>/src/<set>/java` directory — so `lexicon/src/main/java` and `lexicon/src/test/java` are two scopes of one module. The repository's documentation is a scope of its own, and so are its Maven modules and its test resources. A package, a class or a single file is not a scope |
| **phrase** | one declared name, or one sentence of prose. It is the unit of evidence: each contributes a single unit of mass whatever its length, so a long javadoc sentence carries the same weight as a short field name |
| **sense** | one of the distinct meanings a dictionary lists under a word, as [WordNet](#references) enumerates them. `cite` has several, one of them summoning a defendant to court |
| **headword** | the word itself with its senses pooled, which is the form a dictionary indexes |
| **lemma** | the dictionary form of an inflected word, as [WordNet](#references) indexes it: `citations` → `citation` |
| **λ (legibility)** | the share of word occurrences any bundled resource could be cited for. 98.1% here, 97.1% on Apache Tika |
| **divergence** | how far two distributions over subjects stand apart, bounded at one bit by its own definition and reported as the share of that bound it holds |
| **span** | one match of a published taxonomy term inside a declared name |
| **normalisation level** | what both sides of a match were reduced to before they were compared: the words as written, their dictionary forms, a cited expansion, or a WordNet sense |

## How the reading works

### What the parse takes

| Category | Taken | Weight per phrase |
|---|---|--:|
| Declared names | types, methods, fields, parameters, locals, record components, constants, pattern bindings, labels, and the distinguishing segment of the package | 1.0 |
| Dependencies | imports belonging neither to the Java platform nor to the repository under analysis | 0.5 |
| Prose | javadoc, comments, and markdown the repository has not declared to be a working note | 0.5 |

**Only names a repository declares are counted.** `String`, `List` and `assertThat` belong to the platform and to third-party libraries, and a repository referencing them has said nothing about its own subject. The syntax is what tells a declaration from a use, so [`ParsedRepository`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java) reads each file with [JavaParser](https://github.com/javaparser/javaparser) into a syntax tree over the [Java language grammar](https://docs.oracle.com/javase/specs/jls/se21/html/jls-2.html) and keeps the identifier at a declaration node. The same identifier at a use is set aside. No symbol solver is on the classpath: what a name refers to is a question this reading never asks.

A string literal is somebody's vocabulary quoted and is set aside with the uses. One exception carries a citation: a literal byte-identical to an identifier in the [IANA media type registry](https://www.iana.org/assignments/media-types/) is the publisher's own string, counted beside the reading and added to no figure.

A package is one naming decision however many files sit under it, so it is read once. An import is read only in a source set the build publishes, which removes `junit`, `assertj` and `j2html` without naming a library.

### How a name becomes a subject

Worked example: the field `private final CitationSource citationSource;`.

| | Step | On the example | Class |
|--:|---|---|---|
| 1 | The parse keeps the declaration and drops the use | `citationSource` is kept; the type `CitationSource` at this position is a use | [`ParsedRepository`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java) |
| 2 | Split at case transitions and separators | `citation`, `source` | [`Tokeniser`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java), [`IdentifierWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java) |
| 3 | Price a glued run against a frequency list, and keep whole any run the dictionary carries | `pushevent` → `push`, `event`; `abstains` and `userid` each stay one word, [for different reasons](#where-one-word-ends-and-the-next-begins) | [`WordSegmenter`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java), [`PieceCost`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java) |
| 4 | Fold a published run of words into one term | `partOfSpeech` → `part of speech`, counted once | [`CollocatedWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java) |
| 5 | Discard a word carrying no subject matter and take the lemma of the rest | *of*, *and*, *which* leave; `citations` → `citation` | [`ContentWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java), [`WordMorphology`](code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java) |
| 6 | Collect what each resource states the word is about | `cite` → `law`, from the sense about summoning a defendant | [`TopicCitations`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java) |
| 7 | Count each label once, however many ancestors it arrives with | a word labelled `computing` arrives labelled `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences` too, because the resource publishes every ancestor beside the label. Counting six would make one statement about one word six times the evidence, so the five ancestors fold back into `computing` | [`StatedTopics`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedTopics.java) |
| 8 | Weight each label, add them up per scope, and compare the result with chance | one distribution over subjects per scope, and the distance each scope must exceed to be reported | [`TopicDistribution`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java), [`PermutationNull`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java) |

### Where each weight comes from

| Weight | Definition | Source |
|---|---|---|
| Sense coverage | labelled senses ÷ total senses | both counts from WordNet. The domain resource states in its own header that it omits domain-less senses |
| Specificity | `log(rank) / log(size)` | a published frequency list, whose own length bounds it in `[0, 1]` |
| Phrase agreement | the geometric mean over the words agreeing on a subject, times the share of the phrase's words that agree | the words of the phrase, read together. On its own, `cite` could be law (summoning a defendant), linguistics or publishing. The name is `citationSource`, so the reading scores the pair: `citation` and `source` both carry publishing and neither carries law, and publishing is what the name is scored for |

### Where one word ends and the next begins

The rules come from [UAX #29](https://www.unicode.org/reports/tr29/), the Unicode standard for text segmentation. Two of its word-boundary rules cover cases a splitter working from capital letters alone gets wrong:

| Rule | What it states | Effect |
|---|---|---|
| WB9, WB10 | a letter next to a digit is not a boundary | `utf8Decode` reads as `utf8` and `decode` |
| WB6, WB7 | a letter either side of an apostrophe is not a boundary | `resource's` is one word. Split at the apostrophe, the trailing `s` reaches the dictionary, which carries it as a noun |

**A run with no boundary in it at all.** `pushevent` carries no capital, no underscore and no digit. Five steps decide what it is, in order, and the first four are refusals:

| | The question | What answers it |
|--:|---|---|
| 1 | Is it a candidate at all? | A run under six letters, or one the frequency list carries, or one WordNet carries, or one that is a known word plus an inflection, is left whole. Nothing further is asked |
| 2 | What are the ways of cutting it? | Every split into pieces, enumerated |
| 3 | What does each piece cost? | `log(rank) + 3` against the frequency list. A piece of three letters or fewer must be genuinely common — inside rank 1,000 for two letters, 6,000 for three — because the list carries fragments like `tc`, `ri` and `ity` that would let any identifier parse. A piece failing that is unreadable, and no split containing it can be scored |
| 4 | Is the split words or fragments? | A split whose pieces average under three letters is discarded |
| 5 | Which survives? | The cheapest. Where none survives, the run is left whole |

Three worked examples, and two of them come back whole:

| Run | What happens | Why |
|---|---|---|
| `pushevent` | → `push`, `event` | Nothing carries `pushevent` whole, and both pieces are common words. `pu` + `shevent` prices worse |
| `abstains` | stays `abstains` | Refused at step 1. WordNet carries `abstains`, so it is never offered for cutting. On frequency alone it reads as `ab` + `stains`, both of which the list carries, and the dictionary check is what stops that split |
| `userid` | stays `userid` | Refused at step 3. `user` + `id` needs `id`, which ranks 4,690 — far outside the 1,000 a two-letter piece must reach — so that split is unscorable, and no other cut of those six letters prices better. It splits only where a catalogue of published tokens vouches for `id`, and no such catalogue is wired: `CitedTokens.NONE` is what the reading runs on |

A dictionary keeps `abstains` whole and a rarity floor keeps `userid` whole. The first is WordNet's own coverage and the second a rank against a published frequency list.

### Why a raw word count says nothing

The words a Java program contains most of are the words every Java program contains most of. Each word is therefore scored against the rate at which two references write it:

| Reference | What it states | What it scores down that the other cannot |
|---|---|---|
| The bundled frequency list | what ordinary English is written in, as a rank per word | `the`, `of`, `that` |
| [`CorpusVocabulary`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/CorpusVocabulary.java) over the pooled reference corpus | what working Java is written in: the share of each word over the declared names of a hundred public Java repositories, drawn by a stated frame with no reference to this one | `get`, `set`, `value`, `map`, `object`, `list`, `string`, which a frequency list of English finds specialist |

The corpus is 28,839 words over 1,541,720 occurrences, and its own manifest records the draw, the commits and the licence checks. A word ranks high only where both references write it less often than this repository does. Where a reference writes it more often, its score falls.

## The two statistics

### Divergence, and why it is a percentage

Every distance reported here is a [Jensen–Shannon divergence](#references), written as the share of its own maximum it holds.

The reading turns each scope into a distribution over subjects — for `lexicon/src/main/java`, so much `grammar`, so much `computing`, so much `linguistics`, summing to 1 across everything observed. The whole repository is another such distribution. A divergence measures how far two of them stand apart.

- **0%** — the two are identical: the scope writes every subject at exactly the repository's rate.
- **100%** — they share nothing: every subject one writes, the other never writes.
- **The maximum follows from the definition** under base-2 logarithms, which is one bit, so the percentage is a share of a bound nobody chose.

That last property is the reason for choosing this measure. [Kullback–Leibler divergence](#references) answers a similar question and is unbounded above, so 4.2 of it means nothing without a maximum, and it has none.

**Which way is close.** A small percentage is high overlap. `code-semantics-engine/src/main/java` at 4.1% writes very nearly what the whole repository writes; `documentation` at 15.5% writes something different.

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

So **18.9% is what a three-to-one preference reversed between two subjects looks like.** `lexicon/src/main/java` sits at 11.6% from this repository, spread over more subjects than two.

Each topic's own term of that sum is reported separately, which is what states *which* subjects carried the distance. A term and the whole it belongs to are read off the same one-bit scale.

### The 999 resamples, and which scopes they discard

Every scope's distribution differs somewhat from the whole repository's, so a table of distances alone would report all 22 of them as meaning something. The resamples state which of those distances a random group of files of that size produces anyway.

The problem is size. A small scope produces a large distance by accident: read 3 files and they will look unlike the other 883 whatever is in them. So the reading builds each scope its own **null distribution** — the spread of values a statistic takes when chance alone is at work, the term from Good's [permutation test](#references).

| | Step |
|--:|---|
| 1 | Measure the real figure: the divergence between this scope's distribution and the whole repository's |
| 2 | Draw 999 fake scopes of exactly the same number of files, at random, from the same repository |
| 3 | Measure the same divergence for each of the 999 |
| 4 | Report the real scope only where its divergence exceeds **all** 999 |

**Worked example on this repository, where the scope that is further away is the one discarded:**

| Scope | Files | Distance from the repository | Draws reaching at least that far | |
|---|--:|--:|--:|---|
| `code-semantics-engine/src/main/java` | 156 | 4.1% | 0 of 999 | reported |
| `reference-corpus/src/test/java` | 3 | 34.5% | 291 of 999 | discarded |
| `documentation` | 3 | 15.5% | 997 of 999 | discarded |

`reference-corpus/src/test/java` stands eight times further from the repository than the engine's main source set and is discarded, because 291 of the 999 random groups of three files reached at least as far. The engine's main source set is the largest in the tree, and a random group of 156 files never once reached 4.1%. **Evidence is a distance a random group of that size does not reach.** On this reading 17 of the 22 scopes are reported and 5 are discarded, each named in `setAside.scopesWithinChance`.

**Why each scope is tested when the question is about the whole repository.** A repository has no distance from itself, so the statistic exists only for a part read against the rest, and each part needs its own null because the distances chance reaches depend on the part's size. The parts are also where the repository-level answer comes from: a topic enters *what the repository is about* by accounting for some reported scope's distance. Every Java file writes the same ambiguous words, so a topic held at one density through the whole tree cannot be told apart from the language; a topic concentrated in one part is subject matter its author put there. One parser and one set of dictionaries read both sides of that comparison, so the dictionaries' own biases cancel.

Step 4 uses all 999 rather than the usual 95th percentile because every scope is tested at once. Testing 22 scopes at the 95th percentile would report one by chance alone; the `1/(n+1)` quantile holds the family-wise error at the stated level. The method assumes nothing about the shape of the distribution, which matters because nothing here is normally distributed.

**The test decides only what is reported.** A scope whose distance its null reaches is read in full and contributes to the repository's distribution exactly as any other does. What it does not get is a ranking of its own topics.

## Matching against published taxonomies

**Four readings, four words.** They answer different questions and the export names them apart.

| Reading | Called | Reads | Answers |
|---|---|---|---|
| Dictionary labels on the words a repository declares | **themes** — `themes`, `summary.about` | WordNet Domains, Wiktionary topics | what its words are about |
| A published scheme's prose, compared as a distribution | **placement** — `summary.placedIn` | arXiv, OpenAlex, CSO | which published subject it stands nearest, against chance |
| A published vocabulary's terms, matched against declared names | **concepts** — `taxonomies[].concepts` | seven vocabularies | which published concepts it spells |
| The levels those concepts sit under | **subjects** — `taxonomies[].concepts[].placedUnder` | the same publisher's own hierarchy | what the concepts it spells are about |

The fourth exists because the third has a hard limit: **a term match can only find a concept whose name the code writes.** Apache Tika does document processing and declares no identifier reading *document processing*, so that concept is unreachable to the matcher while `xml`, `html` and `hyperlink` — which it does declare — all sit beneath it.

**Every taxonomy becomes [SKOS](#references) before it is read** — the W3C model for published vocabularies, in which each concept has a preferred label, any number of alternative labels, and `broader`/`narrower` links. OLiA arrives as OWL and FIBO as RDF/XML; both become the same eight columns, so the matcher and the branch rule work the same way whatever the publisher used.

**Two shapes, and the file decides which.** [`TaxonomyShape`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java) reads prose present or absent, which is all the code can know. Whether a taxonomy stating prose partitions a field of study or what an organisation does is a fact about its publisher's intent that no file states.

| Kind | What it partitions | What it can state | What it cannot |
|---|---|---|---|
| **Subject scheme** | a field of study | which published subject this repository reads most like, against chance | nothing about software with no research field — payments, ledgers, build tooling |
| **Functional taxonomy** | what an organisation does | whether a repository's work reads like a stated capability | nothing about a repository outside the institution it partitions |
| **Term vocabulary** | what a field's things are called | which of a field's published concepts this repository declares, as identifiers a reader can check | nothing about a repository using a field's ideas without writing its words |

### The three subject schemes

| Scheme | Rows | Read from | What it adds |
|---|--:|---|---|
| [arXiv category taxonomy](https://arxiv.org/category_taxonomy) | 174 — 8 groups, 11 archives, 155 categories, 152 of them described | [`arxiv-taxonomy.tsv`](lexicon/src/main/resources/arxiv-taxonomy.tsv) | the categories a preprint archive files papers under, each with a published description at an 18-word median |
| [OpenAlex](https://openalex.org/) | 4,798 — 4,516 topics under 252 subfields, 26 fields and 4 domains | [`openalex-topics.tsv`](lexicon/src/main/resources/openalex-topics.tsv) | *Personal Information Management*, *Library Science and Information Systems*, *Caching and Content Delivery*, where arXiv names none of them. Descriptions run to a 69-word median |
| [CSO](https://cso.kmi.open.ac.uk/), the Computer Science Ontology | 11,438 topics, 12 with no parent and 225 directly beneath those | [`cso-topics.tsv`](lexicon/src/main/resources/cso-topics.tsv), [`cso-abstracts.tsv`](lexicon/src/main/resources/cso-abstracts.tsv) | computer science at a grain the other two have no category for |

Nobody writes `cs.CL` in code and nobody writes *Computation and Language* either, so [`PooledDescriptions`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PooledDescriptions.java) pools each category's own description through the pipeline above and [`SubjectPlacement`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectPlacement.java) compares distribution against distribution. [`SubjectNull`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNull.java) builds a taxonomy of chance from the same descriptions, and the nearest real subject has to beat the nearest chance one.

**CSO states no definition for any of its 11,438 topics**, so [`CsoSubjects`](lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CsoSubjects.java) states a subject two ways and both are the publisher's. **Labels**: the topic's own label, the equivalents CSO prints beside it, and the labels of the topics CSO places under it. **Prose**: CSO states an `owl:sameAs` for 5,294 of its topics naming the DBpedia resource for each, which is the English Wikipedia article of that title by DBpedia's own construction, and [`cso-abstracts.tsv`](lexicon/src/main/resources/cso-abstracts.tsv) carries the lead summary of every article CSO links to. Every row names the Wikipedia revision it was read at.

Reading prose the publisher's own link names took CSO from standing apart on 2 of 22 level readings to 20 of 22, measured over the eleven evaluation members.

**Worked example.** CSO states `artificial intelligence` beneath `computer science`, and 36 topics beneath `artificial intelligence` — `machine learning`, `knowledge representation`, `cellular automata` and 33 more. Those 36 labels, the topic's own label and its equivalents open the text the placement reads for that subject; the Wikipedia summaries of the ones CSO links follow. `computer science` is then the 20 subjects beneath it, joined.

**Two levels per scheme, because a chance threshold needs a field it can be computed over.** `SubjectNull` draws 999 chance subjects and reads the threshold off the quantile the field size sets, so a field of 11,439 puts it at the single smallest draw. CSO's 12 roots and its 225 subjects are both fields a threshold can be read from.

**arXiv's two gaps, both of which move a reported figure:**

- **It classifies research**, so commercial software is placed by resemblance to a research field. Finance and economics take 12 of its 174 rows.
- **Whole domains have no category at all**: payments and settlement, ledgers, e-commerce and order management, health records, logistics, telecommunications operations, identity, and deployment tooling. Something is always nearest, and the reading cannot state that the right answer was absent from the list.

### The functional taxonomy

A functional taxonomy names what an organisation does rather than what things in its field are called, so it is compared as a distribution. The bundled one is the [NIST Cybersecurity Framework 2.0](https://www.nist.gov/cyberframework), read from [`nist-csf-functions.tsv`](lexicon/src/main/resources/nist-csf-functions.tsv): six functions, and every category and subcategory NIST files under one of them. [`FunctionPlacement`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java) pools each function's statements and compares them with a scope's own reading.

**A framework needs a different null from a subject scheme.** A framework's functions all come from one document in one register, so they share a vocabulary by construction. [`PermutedAssignment`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutedAssignment.java) instead reassigns the framework's own statements to its own functions, each function keeping the number its publisher gave it. Every statement is real and every function keeps its size; only which statements pool together is chance, so a function stands apart only where the partition carries something.

**No function reported is a correct outcome.** A repository with no security surface lands nowhere, and this one does.

### The seven term vocabularies

| Vocabulary | Rows | Field | What it tests |
|---|--:|---|---|
| [OLiA](https://github.com/acoli-repo/olia) — Ontologies of Linguistic Annotation | 1,312 | linguistic annotation | the in-domain case for this repository: a vocabulary of grammar against a library built from lemmas and senses |
| [CSO](https://cso.kmi.open.ac.uk/) — the Computer Science Ontology | 11,438 | computer science | the near-domain case, and the first source that separates this repository from Apache Tika, which every subject scheme files under one category |
| [FIBO](https://spec.edmcouncil.org/fibo/) — Financial Industry Business Ontology | 1,833 | finance | the out-of-domain case for this repository, and the in-domain case for [Strata](https://github.com/OpenGamma/Strata) and [Fineract](https://github.com/apache/fineract) |
| [FpML](https://www.fpml.org/) — Financial products Markup Language 5.11 | 1,405 | derivatives trading | the types a trading system writes on the wire |
| [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/) — FIX Latest | 7,170 | electronic trading | the messages and fields a FIX engine declares, front office through settlement |
| [CWE](https://cwe.mitre.org/) — Common Weakness Enumeration 4.13 | 959 | security | weakness names are phrases, and each match cites MITRE's own page |
| [BIAN](https://github.com/bian-official/artefacts) — Service Landscape | 319 | banking capability | what a bank does, against the payment libraries in the evaluation set |

A run judges all seven and publishes only those whose count exceeds what a chance deal of their own words reaches. On this repository OLiA and CSO are published and the other five are named in `setAside.vocabulariesBelowTheirChanceBar`, each with the count it reached.

### How a match is made

[`TermSpans`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java) takes the longest published term at each position of a name, left to right, with no two matches overlapping. A prefix that is not itself a published term is no evidence.

**Four normalisation levels, reported separately and never summed.** The narrowest that answers is the one that answers, and a wider one is asked only where the narrower found nothing. Every published row states the level it was matched at, in `taxonomies[].concepts[].normalisation`.

| Level | Both sides reduced to | Source |
|---|---|---|
| `words` | the sequence of words itself | a string comparison |
| `lemmas` | the [lemma](#definitions) of each word | WordNet's lemma index. `phrases` matching `Phrase` is one word and its plural |
| `expansions` | the expansion a dictionary cites for a shortened word | [`wiktionary-abbreviations.tsv`](lexicon/src/main/resources/wiktionary-abbreviations.tsv), 45,633 rows. `qty` reaches `quantity`, and Strata writes `short quantity` and `long quantity` 171 times each |
| `senses` | the WordNet sense a whole run belongs to | WordNet's sense index. `nominal phrase` meets `noun phrase` because the dictionary wrote both spellings into one entry |

**Both sides go through one normalisation.** [`LemmaRuns`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java) and [`SenseRuns`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java) go over the publisher's terms when the index is built and over the repository's runs when they are asked about.

**Two guards on the wider levels, each measured.** An expansion several sources spell differently is not made at all — 15,048 of 22,411 tokens cite exactly one, so `msg`, `num`, `id` and `auth` expand to nothing and `MsgSeqNum` stays as written. A word English uses in its own right expands only where WordNet carries it and its expansion in one sense; without that, `head` reached `Headline` 533 times on [Besu](https://github.com/besu-eth/besu). The sense level reads only a run WordNet holds whole, which took the published sense matches across the twelve readings from 145 to 15 and lost no vocabulary its place.

**A level that cannot read a run stops there.** A level that searched and found nothing and a level that could not look are different answers, and only the first is a reason to ask a wider one. WordNet holds no dictionary form for `id` and does hold the psychoanalytic noun, so without this rule a name written `id` would reach `ids`, which CSO states for an intrusion detection system.

**A publisher's labels are read as words.** A declared name cannot hold a space and a taxonomy written in English is full of them: CSO states 10,047 of its 11,438 topics as several words. `IdentifierWords` treats a space as a separator beside the dot and the dollar, so `natural language processing` is three words and `naturalLanguageProcessing` can meet it.

**Corroboration by branch.** A match on a single word counts only where the repository also writes at least one of that concept's siblings. Writing several concepts from one part of a field is evidence of working in it; writing a single one is what an ordinary English word a taxonomy has claimed produces. OLiA places `Preferred` under `UsageAndFrequencyFeature` beside `Rare` and `Common`; this repository writes `Preferred` once and none of its siblings, so the match is discarded. `Verb` survives, because `Noun`, `Clause` and `Phrase` are written too. A match of more than one word needs no such support. On this reading the rule discards 78 matches, counted in `setAside.matchesDiscardedByBranchRule`.

### How a vocabulary is judged

Matching a term says a repository wrote a run of words some publisher states. It does not say the publisher's subject reached the repository, because any sufficiently large word list matches something somewhere. Three stages settle that, and each is a comparison against a published resource.

| Stage | Class | What it does |
|--:|---|---|
| 1 | [`SpecificTerms`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SpecificTerms.java) | Removes from the field every term working Java has been shown to write. `time zone`, `mime type` and `resource type` are published by somebody and written by everybody. The reference is [the runs a seeded draw of a hundred repositories writes](reference-corpus/src/main/resources/reference-corpus-run-shares.tsv), and a run counts as written where its share exceeds its own standard error. On this reading it removes 2,761 terms |
| 2 | [`MatchedPhrases`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedPhrases.java) | Counts how many of the surviving terms **of more than one word** stand in the declared names, each term once however often it is written. One term written eight hundred times is one term the repository knows |
| 3 | [`TermOrderNull`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermOrderNull.java) | Deals the source's own words across its own terms 999 times and recounts, keeping how many terms the source states, how long each is, and its whole word list. Only which words the publisher put beside which is destroyed. [`ChanceExpectedBest`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java) reads the quantile from the number of vocabularies competing |

**The repository is held still and the vocabulary is dealt.** Declared names are compositional — a repository writes the same words beside each other over and over — so dealing the repository instead would put a source's words together in orders nobody wrote, and every source whose words a repository writes at all would stand above such a threshold.

**Worked example, read at commit `1a55ee6`.** This repository writes four of OLiA's multi-word terms, among them `base form` and `verb phrase`. A deal of OLiA's own words across its own terms reaches two, over a field of seven vocabularies at 999 deals, and 23 of the 999 deals reached four or more. So `taxonomies` carries OLiA at twice its threshold, and `bar` records the arithmetic:

```json
{ "phrases": 4, "chanceExpectedBest": 2, "median": 1, "timesTheBar": 2.0,
  "atLeastAsExtreme": 23, "chanceRate": 0.024, "field": 7, "resamples": 999 }
```

`bar.phrases` counts the `words` level alone, because both it and the deals behind it compare the words the two sides wrote. A match a dictionary reached is published with the level that reached it and is not among the four.

### Reading against a taxonomy the published jar does not carry

A source is a candidate long before anything decides to publish it, and a candidate has to be read by the reading that would bundle it.

| From | How |
|---|---|
| a build | `./gradlew functionalPlacement -Ptaxonomy=<path>`, or `-Dcs.taxonomy=<path>` on any reading |
| a program | `InjectedTaxonomy.named(Path)`, or `InjectedTaxonomy.fromCommandLineOrBundled()` for the resolution a build gets |

## The evaluation set

The taxonomies, the resources and the rules were all chosen while reading this tree, so a reading that works here establishes nothing on its own. Eleven repositories the reading was never written for are read alongside it, named in [`evaluation-set.tsv`](reading-export/src/test/resources/evaluation-set.tsv). Each member carries a subject area somebody outside this project stated, a licence read at the pinned revision, and whether a bundled vocabulary is expected to reach it.

| Command | What it does |
|---|---|
| `./gradlew evaluationFetch -Dcs.evaluation.dir=<dir>` | fetches each member at the commit the manifest pins, and does nothing where the tree is already there |
| `./gradlew evaluationReadAll -Dcs.evaluation.dir=<dir>` | reads every member in one JVM, several at a time, one folder per member under `output/` |
| `./gradlew evaluationScore` | scores the readings already under `output/` against the areas the manifest states |

| Member | Stated area | Expected |
|---|---|---|
| [Apache Tika](https://github.com/apache/tika) | Computer Science | out of domain |
| [Apache Maven](https://github.com/apache/maven) | Computer Science | out of domain — a build tool has no subject matter a bundled vocabulary covers, so reaching nothing is the correct result |
| [Apache Santuario](https://github.com/apache/santuario-xml-security-java) | Computer Science | in domain, for the security vocabulary |
| [Aeron](https://github.com/aeron-io/aeron), [Besu](https://github.com/besu-eth/besu) | Computer Science | out of domain |
| [Strata](https://github.com/OpenGamma/Strata), [Fineract](https://github.com/apache/fineract), [QuickFIX/J](https://github.com/quickfix-j/quickfixj), [jPOS](https://github.com/jpos/jPOS), [fix-trading-simulator](https://github.com/felipewind/fix-trading-simulator), [jmeter-iso8583](https://github.com/tilln/jmeter-iso8583) | Finance | in domain, for the finance vocabularies |

**What the twelve readings show, at schema 24.0.** Each vocabulary's answer is stated as the multiple of the count a chance deal of its own words reaches.

| Reading | The vocabularies that answered |
|---|---|
| QuickFIX/J | FIX ×10.4, FIBO ×2.0, FpML ×1.5 |
| fix-trading-simulator | FIX ×9.0 |
| Strata | FIBO ×2.76, FpML ×2.76, BIAN ×2.0 |
| jPOS | FIBO ×2.0, FpML ×2.0, CSO ×1.6 |
| Fineract | FIBO ×1.76, FpML ×1.27, CSO ×1.15 |
| Apache Tika | CWE ×2.0, FpML ×1.5, CSO ×1.43 |
| this repository | OLiA ×2.0, CSO ×1.33 |
| **Apache Maven** | **none** — no vocabulary reached it, and the reading answers from a subject scheme instead |

The two FIX engines lead with FIX, the derivatives and banking libraries lead with FIBO, and the build tool is reached by nothing. **Across the twelve readings, 65 of the 72 subject-scheme level readings stand apart from chance**: arXiv on 20 of 24, OpenAlex on 23 of 24, CSO on 22 of 24.

**What the same measurement refuses.** A term vocabulary states prose per concept, so it can be offered to the placement machinery as though it were a subject scheme. Three have been, and all three fail the out-of-domain control:

| Source | Stands apart on | Where it should reach nothing |
|---|---|---|
| BIAN, at both its levels | 9 of 11 members | it names `Cross Channel` on Maven, Tika, Santuario, Aeron and Besu, and cannot separate Fineract or Strata, the only banking and derivatives libraries in the set |
| FIX, at its 7,003 field definitions | 5 of 11 | it reaches Santuario and Tika, and does not reach Strata, Fineract or jPOS |
| FpML, at its 1,181 type definitions | 2 of 11 | it reaches Aeron, and does not reach Strata, its own field |

Matching those same vocabularies term by term gives the table above. A vocabulary of terms is matched; a scheme of subjects is placed against; and offering one to the other's machinery has been measured three times and has not worked.

## Limitations

- **Java only.** The parse, the platform reference and the declaration rules are all Java's. Another language needs its own parse and its own reference.
- **A word is resolved from its phrase alone.** The words of one declared name are read together and nothing else contributes: the type the name is declared on, the class it sits in and the rest of the file all play no part. `citationSource` resolves correctly because `citation` and `source` both carry publishing and neither carries law; a field named `source` alone gets whatever the dictionary lists. Reading Apache Tika is where that shows: `stream` reads as *geography*, `pipe` as *hydraulics*, `detector` as *electrotechnology*.
- **The domain-label resources cover specialist senses only.** [WordNet Domains](https://wndomains.fbk.eu/) states in its own header that it omits domain-less senses, so a word used in its everyday meaning is either unlabelled or labelled with the one specialist sense somebody recorded. `log`, `root`, `stub` and `tree` all read as *plants*, because the timber is a sense a domain resource labels and the file a program appends to is not.
- **A scope is a source-set directory.** That keeps generated output out of a reading with no list of directories to ignore. A repository laid out any other way reads as having no Java in it, and reports no error.
- **The splitter has known failure cases**, each pinned by a test: `XMLHttpRequest`, `parseHTTPResponse`, `toJSONString`, `getDSLContext`, `IPv6Address`. The one bundled catalogue that would arbitrate them was measured and rejected: the Wikidata initialism registry lists `THE`, `OF` and `AND` beside the tokens a Java file is made of — `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE`.
- **A read takes minutes**, and no result is kept between runs. Every threshold is derived by resampling — 999 seeded draws per scope, per reference, per subject scheme and per vocabulary — and every declared name is matched against all seven vocabularies. Measured on one laptop at commit `1a55ee6`, by `./gradlew readTimings`:

| Stage | This repository |
|---|--:|
| The whole reading | 106.0s |
| Assembling and serialising the export | 73.4s |
| The topical reading, with each scope's chance draws | 13.3s |
| The arXiv subject placement, with its chance draws | 5.3s |
| The parse | 2.4s |
| The published-names chance draws | 2.2s |
| The legibility reading | 2.0s |
| Matching all seven vocabularies, corroborated | 7.2s |

Assembling the export holds 69% of a read, and most of that cost does not depend on the repository: [`ScrambledTerms`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ScrambledTerms.java) permutes each vocabulary's own words 999 times, which for CSO is 999 deals over 14,259 terms whatever tree is being read. `./gradlew read` adds Gradle's own startup, the diagnostics and the pinned findings, and takes about four and a half minutes.

## Modules

| Module | Contents |
|---|---|
| `lexicon` | the bundled lexical resources and the code that reads them: WordNet through extjwnl, Wiktionary abbreviations, topic labels and hierarchy, Wikidata names and initialisms, an SQL function catalogue, and the seven term vocabularies |
| `lexicon-extraction` | Gradle tasks that regenerate each bundled resource from its published source at a pinned revision |
| `code-semantics-api` | model records and stage contracts: the evidence trail, `SourceAnchor`, `RepositoryFacts`, pooled log-odds arithmetic, the tokeniser, the word segmenter |
| `code-semantics-engine` | the pipeline: parse, word extraction, topic resolution, divergence statistics, subject placement |
| `skos-matching` | matching declared names against published SKOS vocabularies, and the scoring of what was matched |
| `reading-export` | the published reading — `reading.json`, `evidence.json`, `changes.json` — its schema, and the `read`, evaluation and probe tasks |
| `vocabulary-page` | the pages that draw a published reading, and the classes that compute what they draw. The one module that may depend on a markup writer |
| `reference-corpus` | the pooled word and run shares of the drawn repositories, with the manifest that pins the draw |
| `reference-corpus-extraction` | Gradle tasks that draw the sample from a stated frame and pool the corpus tables at pinned commits |
| `repository-clones` | repositories pinned to commits: the manifest, and the shallow clone that fetches one |

Every bundled resource states its source URL, revision and licence in a `#` header, and the build fails without one. [`NOTICE.md`](NOTICE.md) lists each file and its terms.

## Excluding files from a reading

Put a `.readingignore` at the root of the directory to be read. One glob per line, `#` for a comment, paths relative to that root. It applies to source directories as well as prose, and no file means nothing is excluded. Use it for what records how the work is done rather than what it is for.

```
# Notes about how the work is done. Exclude them from any reading.
CONTRIBUTING.md
docs/plans/**
**/generated/**
```

## Appendix: diagnostics

Each answers a question the export raises and does not settle.

| Command | What it answers |
|---|---|
| `./gradlew wordVotes -Pwords="cite source"` | every subject each resource gives those words, and what each is worth |
| `./gradlew wordPlace -Pwords="get set list"` | where those words stand in the ranking, and which reference scored each of them down |
| `./gradlew topicCarriers -Ptopics="linguistics"` | every word that produced a topic's score, with its share |
| `./gradlew termhood -Dcs.clone.dir=<path>` | each vocabulary's matched phrases with what the reference corpus writes beside them |
| `./gradlew countedPhrases -Dcs.clone.dir=<path>` | the published phrase count against the count its threshold was computed over |
| `./gradlew functionalPlacement -Ptaxonomy=<path>` | where a repository stands among any eight-column taxonomy's subjects, against chance |
| `./gradlew abbreviatedTypes` | every declared name that is the initials of its own type |
| `./gradlew verbPhrases` | every clause the declared method names state, published and test scopes apart |
| `./gradlew wordsAndPhrases` | every word and multi-word phrase the chosen names state four or more times, by raw count |
| `./gradlew readTimings` | where the time of a read goes, one stage per row |
| `./gradlew readings` | the page that draws every reading under `output/` |

## References

| | Reference |
|---|---|
| A domain for every synset | [eXtended WordNet Domains](https://adimen.ehu.eus/web/XWND), González-Agirre, A., Castillo, M. and Rigau, G. (2012), LREC. CC BY 3.0, bundled as one leading domain per synset keyed by sense key. [BabelDomains](https://aclanthology.org/E17-2036/) is the successor and is CC BY-NC 3.0, which a library distributed under Apache-2.0 cannot bundle |
| Banking capabilities | [BIAN Service Landscape](https://github.com/bian-official/artefacts), Banking Industry Architecture Network. 319 service domains, Apache-2.0 |
| Computer science topics | [CSO](https://cso.kmi.open.ac.uk/), the Computer Science Ontology, Knowledge Media Institute, The Open University. 11,438 topics, CC BY 4.0, and no definition for any of them |
| Derivatives-trade terms | [FpML](https://www.fpml.org/), the Financial products Markup Language, ISDA. 1,405 complex types of the 5.11 confirmation schemas, under the [FpML Public License](https://www.fpml.org/the_standard/fpml-public-license/) |
| Dividing a word among its senses | Magnini, B., Strapparava, C., Pezzulo, G. and Gliozzo, A. (2001), [*Using domain information for word sense disambiguation*](https://aclanthology.org/S01-1027.pdf), SENSEVAL-2. A lemma's domain score is the relative frequency of the domain over its senses' tagged-corpus counts, a sense counted once per label and an uncounted sense smoothed at 0.5 |
| Electronic-trading terms | [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/), FIX Trading Community. 7,170 named things of FIX Latest, Apache-2.0 |
| Financial terms | [FIBO](https://spec.edmcouncil.org/fibo/), EDM Council. 1,833 named classes, MIT |
| Jensen–Shannon divergence | Lin, J. (1991), *Divergence measures based on the Shannon entropy*, IEEE Transactions on Information Theory 37(1), 145–151. Bounded at 1 bit under base-2 logarithms |
| Kullback–Leibler divergence | Kullback, S. and Leibler, R. A. (1951), *On information and sufficiency*, Annals of Mathematical Statistics 22(1), 79–86. Unbounded above, which is why no figure here is reported in it |
| Linguistic annotation terms | [OLiA](https://github.com/acoli-repo/olia), Ontologies of Linguistic Annotation. 1,312 concepts |
| One sense per discourse | Gale, W., Church, K. and Yarowsky, D. (1992), *One sense per discourse*, Proceedings of the HLT workshop |
| Partitioned security activity | [NIST Cybersecurity Framework 2.0](https://www.nist.gov/cyberframework), read from NIST's own OSCAL edition. A US Government work |
| Permutation test | Good, P. (2005), *Permutation, Parametric and Bootstrap Tests of Hypotheses*, 3rd ed., Springer |
| Predominant senses without annotation | McCarthy, D., Koeling, R., Weeds, J. and Carroll, J. (2007), [*Unsupervised acquisition of predominant word senses*](https://aclanthology.org/J07-4005.pdf), Computational Linguistics 33(4) |
| Property accessor names | [JavaBeans specification 1.01](https://www.oracle.com/java/technologies/javase/javabeans-spec.html), section 8.3, design patterns for properties — `get`, `set` and `is` |
| Published subjects | [arXiv category taxonomy](https://arxiv.org/category_taxonomy), 155 categories, 152 of them described |
| Published vocabularies, one model | [SKOS](https://www.w3.org/TR/skos-reference/), W3C Simple Knowledge Organization System |
| Relevant domains against a null | Gliozzo, A., Strapparava, C. and Magnini, B. (2004), [*Unsupervised domain relevance estimation for word sense disambiguation*](https://aclanthology.org/W04-3249/), EMNLP |
| Research topics | [OpenAlex](https://openalex.org/), 4,516 topics under 252 subfields, 26 fields and 4 domains, CC0 |
| Security weaknesses | [CWE](https://cwe.mitre.org/), The MITRE Corporation. 959 weaknesses of catalog 4.13, under the [CWE Terms of Use](https://cwe.mitre.org/about/termsofuse.html) |
| Sense distributions shift with domain | Koeling, R., McCarthy, D. and Carroll, J. (2005), [*Domain-specific sense distributions and predominant sense acquisition*](https://aclanthology.org/H05-1053/), HLT-EMNLP. A domain's own text ranks senses better than the tagged corpus, which is why 1990s counts underweight computing senses here |
| Subject labels per sense | [WordNet Domains](https://wndomains.fbk.eu/), Fondazione Bruno Kessler. Domain-less senses are absent from the bundled lift, so the share of a word they hold is reported on no domain rather than redistributed |
| The platform's own vocabulary | `java.lang.module.ModuleFinder.ofSystem()`, and the class file format, [JVMS §4.4](https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html) |
| Topic labels per headword | [Wiktionary](https://en.wiktionary.org/), read through [wiktextract](https://github.com/tatuylonen/wiktextract) |
| Word boundaries | [UAX #29, Unicode Text Segmentation](https://www.unicode.org/reports/tr29/), rules WB6, WB7, WB9, WB10 |
| Word frequency | [Leipzig Corpora Collection](https://wortschatz.uni-leipzig.de/en/download), three English corpora of one million sentences each |
| Word sense frequencies | WordNet's own tagged-corpus counts (`cntlist`), read through [extjwnl](https://github.com/extjwnl/extjwnl)'s use counts |
| Word sense, lemma, synset | [WordNet](https://wordnet.princeton.edu/), Princeton University. Fellbaum, C. (ed., 1998), *WordNet: An Electronic Lexical Database*, MIT Press |

## Licence

Apache-2.0 ([`LICENSE`](LICENSE)), declared in the published POM. The bundled lexical data is licensed separately and each file states its own terms; two files derived from Wiktionary are CC BY-SA 4.0, which attaches to those files rather than to code that reads them. [`NOTICE.md`](NOTICE.md) lists every file.
