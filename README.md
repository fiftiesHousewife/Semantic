# code-semantics

[![build](https://github.com/fiftiesHousewife/Semantic/actions/workflows/build.yml/badge.svg)](https://github.com/fiftiesHousewife/Semantic/actions/workflows/build.yml)

A Java library that states what subject matter a source repository is concerned with, by reading the words in the names its authors declared.

- **Takes** a directory of Java source. No clone, no build, no type resolution, no network.
- **Gives** three JSON files: the answer, the workings behind it, and what moved since the last run.
- **Decides from published resources.** A dictionary states which words carry subject matter, a frequency list states which are ordinary, a hundred drawn repositories state what working Java is written in, and 999 seeded resamples state which figures chance produces. This project writes no word list of its own.
- **Reports a figure only where it exceeds every one of those 999 resamples.**

It works in the terms of lexical semantics and information theory. The [glossary](docs/GLOSSARY.md) defines every term, with a reference for each; [the method](docs/METHOD.md) gives the arithmetic and the sources.

## Using it

The coordinate is the `reading-export` module, which brings the engine and the matcher with it. `./gradlew publishToMavenLocal` puts the jars in `~/.m2/repository`; nothing is on Maven Central yet.

```kotlin
implementation("io.github.fiftieshousewife:reading-export:0.1.0-SNAPSHOT")
```

**A directory in, one validated export out.** [`ExportedReading`](reading-export/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java) takes the path and returns the document `reading.json` holds. The commit is an argument because the library reads no `.git`: what a working tree is checked out at is a fact its caller states, and a caller with none passes the empty string.

```java
ReadingExport export = new ExportedReading().of(Path.of("/path/to/repository"), "43cbdae6");
new ExportFile().wrote(Path.of("reading.json"), export);
```

[`ExportFile`](reading-export/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java) checks the document against [the export schema](reading-export/src/main/resources/reading-export.schema.json) before it reaches a file, so a run produces a document matching that schema or produces none. [`PublishedFormat`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java) refuses any file name whose suffix it does not state, and the only suffix it states is `.json`.

**A caller who already holds a reading passes it in.** [`RepositoryReading`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java) is the parse and the topical reading on their own:

```java
RepositoryReading reading = RepositoryReading.of(Path.of("/path/to/repository"));
ReadingExport export = new ExportedReading().of(reading, "43cbdae6");
```

**Reading a repository's pull requests** takes the fetched directory and nothing else:

```java
PullRequestSet set = PullRequestSet.under(Path.of("pull-requests/tika"));
List<ExportedPullRequest> read = new ReadPullRequests(List.of()).in(set);
PullRequestDocument.wrote(folder, Optional.of(set.repository()),
        Optional.of(WrittenWork.ofTheWholeTree(clone)), read);
```

[`ReadPullRequests`](reading-export/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadPullRequests.java) judges the statements together, so each is priced against the field of all of them, and reads each head as the changed-file copy it is.

**A consumer's own vocabulary enters the same field.** A jar registering a [`TermIndex`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java) implementation in `META-INF/services` — [`ServiceLoader`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/ServiceLoader.html)'s own contract — is matched beside the bundled vocabularies and judged by the same permutation bar. Adding one moves every bundled vocabulary's bar, because each bar sits at a quantile set by the size of the field it competes in, and `taxonomies[].bar.fieldMembers` names that field.

**It states what it is doing.** A large tree takes minutes, so each stage logs through SLF4J at `INFO` on `RepositoryReading`. Nothing writes to a stream a caller cannot redirect, and the library declares no provider, so a consumer binds its own.

```
INFO  RepositoryReading - Parsing /path/to/repository — 9 source sets
INFO  RepositoryReading - Read 552 topics over 2,156 files in 141.8s
```

The taxonomy layer beneath it:

| To | Call |
|---|---|
| read a taxonomy the jar does not carry | `InjectedTaxonomy.named(Path.of("my-vocabulary.tsv"))`, which throws and names the file where it cannot be read |
| take the same taxonomy a build would | `InjectedTaxonomy.fromCommandLineOrBundled()`, which honours `-Dcs.taxonomy` |
| read any eight-column taxonomy file | `SkosRows.at(Path)` |
| place a reading against subjects | `SubjectAreas.of(concepts)`, then `SubjectPlacement.byDivergence().of(distribution, subjects)` |
| judge that placement against chance | `SubjectNull.seeded(seed).of(nearest, distribution, descriptions)` |
| match declared names against a term vocabulary | `InjectedTerms.of(published, source)`, then `CorroboratedReading.of(terms, concepts, parsed)` |
| compare two distributions | `new JensenShannon().divergence(a, b)`, bounded at one bit by its own definition |

### From a build

| Command | What it does |
|---|---|
| `./gradlew read -Dcs.clone.dir=<path>` | reads a checkout and writes the three files under `output/<name>/json/` |
| `./gradlew pullRequests -Dcs.clone.dir=<path> -Dcs.pullrequests.dir=<path>` | reads a checkout and the pull requests fetched beside it, then writes a report per author |
| `fetch/fetch-pull-requests.sh <owner/name> <clone> [target]` | writes one directory per pull request, its base version, what it says, and the tracker's word for every issue it references. `PR_AUTHOR` selects whose are taken |
| `fetch/fetch-commits.sh <clone> [author] [target]` | writes one repository's commit messages, filtered to an author where one is named, pinned to the commit the clone stands at |
| `./gradlew pages` | writes one findings page per reading under `output/`, one report per pull request author, and the card page comparing them |
| `./gradlew checkAll` | tests and coverage verification, which is what [the build](.github/workflows/build.yml) runs on every push |

Java 25 toolchain, `-Xlint:all -Werror`, Error Prone, an 80% JaCoCo instruction floor per module. [Releasing](docs/RELEASING.md) covers publication; [the method](docs/METHOD.md) covers the diagnostics that answer a question about one word or one subject.

## What a run writes

| File | Holds | Validated |
|---|---|---|
| `reading.json` | the answer and the evidence for it | against [`reading-export.schema.json`](reading-export/src/main/resources/reading-export.schema.json) before the file exists |
| `evidence.json` | the workings: every word with the subjects it contributed to, every dropped topic with the rule that dropped it, every run no resource covered, and every file with the topic leading it | nothing, and it states its own `schemaVersion` |
| `changes.json` | each figure before and after, and every topic, word and concept that entered or left | written only where a previous reading shares the same `schemaVersion` |
| `pull-requests.json` | everything a reading discovers about the pull requests fetched beside the tree | against [`pull-requests.schema.json`](reading-export/src/main/resources/pull-requests.schema.json) before the file exists |

The `schemaVersion` rises when a field is added, renamed or removed, so a consumer branches on it. [`ReadingExportSchemaTest`](reading-export/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java) fails the build on a change the schema does not state.

| Section | Holds | One entry per |
|---|---|---|
| `summary` | the answer | run |
| `signals` | the words the repository writes more of than ordinary English and working Java do | word or published phrase |
| `themes` | the subjects separating one part of the repository from the rest | topic, in the scope that separates |
| `taxonomies` | the published concepts the declared names match, with the level each match was found at | vocabulary published |
| `setAside` | what the reading measured and left out of those three lists | run |

### The summary, abbreviated

```json
{
  "repository": "CodeSemantics",
  "commit": "1a55ee6b317a810c6b802e26c412254a7f48e29d",
  "answers": [
    { "sourceType": "taxonomy", "source": "OLiA",
      "statedPath": ["InflectionTypeFeature"],
      "result": "BaseForm — Uninflected forms and forms that have the same form are tagged as BaseForm.",
      "qualifiedBy": "4 phrases against the 2 a deal of its own words reaches",
      "timesItsBar": 2.0 }
  ],
  "about": ["linguistics", "computing", "grammar"],
  "aboutStatedBy": ["WordNet Domains", "Wiktionary topics"],
  "distinctiveScopes": [
    { "scope": "lexicon/src/main/java", "divergenceBits": 0.1160,
      "writesMoreOf": ["linguistics", "grammar"] }
  ],
  "leadingWords": [{ "word": "word", "divergenceBits": 0.0158, "occurrences": 395 }],
  "leadingConcepts": [{ "concept": "Source", "publishedBy": "OLiA" }],
  "shareOfWordsWithACitation": 0.9809,
  "shareOfMassOnNoSubject": 0.8470,
  "counts": { "signals": 282, "themes": 8, "concepts": 171 }
}
```

**`answers` holds every source that qualified at the first level to qualify**, ranked by how rarely a chance deal reaches its count. The levels back off — a vocabulary's terms of more than one word, then the same vocabularies' one-word terms, then every subject scheme level standing apart from chance — and the backoff runs between levels and never inside one. A reading with nothing above chance holds one entry stating that.

**`placedIn` states each subject scheme at two levels.** The broader level is compared against every category's description pooled under it, which is enough prose for the divergence to be stable; the narrower against the few dozen words the scheme states for that subject alone, which is the weaker measurement and the sharper answer. Read `standsApartFromChance` before reading `subject`: some subject is always nearest.

One signal, in full:

```json
{
  "readFrom": "CLONE",
  "word": "lemma",
  "occurrences": 22,
  "occurrencesInNames": 22,
  "divergenceBits": 0.0015700827861832715,
  "closestReference": "working Java",
  "firstWrittenAt": { "file": "…/engine/reading/BundledCitations.java", "line": 64 }
}
```

`divergenceBits` is this word's term of the [Jensen–Shannon divergence](#references) between the repository's word distribution and the reference's, bounded at 1 bit. `closestReference` names the reference scoring the word lowest, which is the score reported: `get` scores high against ordinary English and low against working Java, so working Java is its closest reference.

**`setAside` is what makes the three lists readable.** 282 signals out of 1,292 words scored is a different claim from 282 out of 8,000. It counts the word occurrences no resource covers, the words below every threshold or inside the references' error, the scopes within chance, the matches the branch rule discarded, the terms working Java also writes, the vocabularies below their chance bar — each named with the count it reached — and the files the parser could not read.

`wordsTheLanguageSupplies` holds the words English puts inside a name. `massByTopic` is a name about mass and about topics, and `by` is what the language puts between them; against a frequency list drawn from prose it reads as specialist, because prose is not where a program's prepositions are written. Two bundled resources place such a word between them — WordNet carries no noun, verb or adjective entry for it, and the frequency list carries it as a word English is written in.

### What a pull request adds

The library reads no network and no `.git`, so a pull request reaches it as a directory. [`fetch/fetch-pull-requests.sh`](fetch/fetch-pull-requests.sh) writes four things, each recording the commit it was taken at: the changed files as the pull request leaves them, the same files as it found them, what the pull request says, and the repository's own pull request template. Where the repository's `pom.xml` names a JIRA tracker under `issueManagement`, the script also records the type that tracker gives each issue the statement mentions.

Each pull request is read on its own, against thresholds drawn from the files it changes, and the result is its own document at its own `schemaVersion`. It answers a different question about a different corpus: the reading is of a working tree at one commit, this is of the changes proposed against it.

| Field | What it answers |
|---|---|
| `signals` | which words the changed files write more densely than both references, each beating a threshold drawn from those files alone |
| `statement` | how far what the pull request says sits from what it changes, measured against statements of the same shape built from words drawn at random from the code |
| `work` | what the statement calls the change under [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/), what the repository's tracker calls it, which declarations the changed files add and remove, and the type whose published definition covers what the parse measured |
| `concepts` | what the bundled vocabularies state for the terms those files write. These are matches and never a placement: a few changed files are too small a field for the chance bar, which is drawn over a whole tree |

Worked example — [apache/tika](https://github.com/apache/tika) pull request 3153:

| Figure | Value |
|---|---|
| Words above both references | 61, strongest `component`, `parser`, `load` |
| Statement | 33 words, sitting 0.382 bits from the changed files; 96 of 100 statements built at random sit further away |
| What it says it is | nothing — its title opens with a JIRA key, which Conventional Commits does not define |
| What its code says it is | `feat`, because it adds declarations and removes none, which is what the specification defines that word as |
| What the tracker calls it | `Task`, for TIKA-4889 |
| Files | 35 changed, 34 read — 19 production, 11 tests, 2 fixtures, 2 documentation |
| Declarations added | 31 types, 145 methods, 75 fields; none removed, 312 left as they were |
| Types added with no test of their own | 10 |

Four rules decide those figures, and each cites a published statement.

- **Which files are which.** The build declares where its source, its tests and its resources live. Each file is counted under the one it sits in.
- **Which declarations changed.** A declaration is the one it is only where the same file writes the same name inside the same declarations. A renamed method is one removed and one added; matching across a rename would assert an intention the text does not carry.
- **What kind of change it is.** The word comes from a definition applied to a count — a change that only adds declarations is what Conventional Commits defines `feat` as. A shape no definition covers yields no word, and the mapping states why.
- **Which types arrived untested.** A type counts as untested where the same pull request adds no class whose name [Maven Surefire's default includes](https://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#includes) would run as its test. It says no test arrived with the type; the reading runs nothing and measures no coverage.

**Code is counted in statements, prose in lines.** A line count of code moves with the formatter, with the javadoc above it and with where the braces sit, none of which is a fact about what the code does. The statements a method carries are the same however it is laid out, and a block holds statements rather than being one. A type's size is the members it declares. Complexity is [McCabe's](https://doi.org/10.1109/TSE.1976.233837): one per method, plus one for each point at which control can branch.

**The shape-to-word mapping is a bundled resource.** [`change-shape-types.tsv`](lexicon/src/main/resources/change-shape-types.tsv) states one row per shape the reading can measure, in the order the rules apply — the first shape a change has is the one that answers, so a change confined to the source sets that check the published ones is `test` even where it adds declarations. Each row quotes the publisher's own definition beside the measurement it is taken to cover.

| A change that | Is a | Because the standard defines it as |
|---|---|---|
| changes documentation and nothing else | `docs` | Documentation only changes |
| changes only the files that check what the build publishes | `test` | Adding missing tests or correcting existing tests |
| changes only build files | `build` | Changes that affect the build system or external dependencies |
| adds declarations and removes none | `feat` | a commit of the type feat introduces a new feature to the codebase |
| removes declarations and adds none | nothing | Semantic Versioning calls removing something from the published API an incompatible change. The parse states which declaration a name is, never whether the published surface carries it, so a removal from the published API cannot be told from a removal of something private |
| adds and removes declarations | nothing | More than one definition covers it, and nothing measured chooses between them |
| changes lines and neither adds nor removes a declaration | nothing | Both `refactor` and `fix` cover a change confined to method bodies |

A tracker type is not mapped. Jira states `Task` as work that needs doing and names no kind of change.

## Definitions

Each term below carries an everyday meaning as well. The technical one is meant. The [glossary](docs/GLOSSARY.md) carries the rest, each with the class that implements it.

| Term | Meaning here |
|---|---|
| **scope** | one [source set](https://docs.gradle.org/current/userguide/java_plugin.html#sec:source_sets) — a single `<module>/src/<set>/java` directory — so `lexicon/src/main/java` and `lexicon/src/test/java` are two scopes of one module. A repository's documentation is a scope of its own, and so are its Maven modules and its test resources. A package, a class or a single file is not a scope |
| **phrase** | one declared name, or one sentence of prose. It is the unit of evidence: each contributes a single unit of mass whatever its length, so a long javadoc sentence carries the same weight as a short field name |
| **sense** | one of the distinct meanings a dictionary lists under a word, as [WordNet](#references) enumerates them. `cite` has several, one of them summoning a defendant to court |
| **headword** | the word itself with its senses pooled, which is the form a dictionary indexes |
| **lemma** | the dictionary form of an inflected word, as [WordNet](#references) indexes it: `citations` → `citation` |
| **λ (legibility)** | the share of word occurrences any bundled resource could be cited for |
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
| 2 | Split at case transitions and separators | `citation`, `source` | [`Tokeniser`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java), [`IdentifierWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java) |
| 3 | Price a glued run against a frequency list, and keep whole any run the dictionary carries | `pushevent` → `push`, `event`; `abstains` and `userid` each stay one word, [for different reasons](#where-one-word-ends-and-the-next-begins) | [`WordSegmenter`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java), [`PieceCost`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java) |
| 4 | Fold a published run of words into one term | `partOfSpeech` → `part of speech`, counted once | [`CollocatedWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java) |
| 5 | Discard a word carrying no subject matter and take the lemma of the rest | *of*, *and*, *which* leave; `citations` → `citation` | [`ContentWords`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java), [`WordMorphology`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java) |
| 6 | Collect what each resource states the word is about | `cite` → `law`, from the sense about summoning a defendant | [`TopicCitations`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java) |
| 7 | Count each label once, however many ancestors it arrives with | a word labelled `computing` arrives labelled `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences` too, because the resource publishes every ancestor beside the label. Counting six would make one statement about one word six times the evidence, so the five ancestors fold back into `computing` | [`StatedTopics`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedTopics.java) |
| 8 | Weight each label, add them up per scope, and compare the result with chance | one distribution over subjects per scope, and the distance each scope must exceed to be reported | [`TopicDistribution`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java), [`PermutationNull`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java) |

[The method](docs/METHOD.md) gives the two statistics behind step 8 — the divergence and the 999 resamples — with the arithmetic worked through.

### Where each weight comes from

| Weight | Definition | Source |
|---|---|---|
| Sense coverage | labelled senses ÷ total senses | both counts from WordNet. The domain resource states in its own header that it omits domain-less senses |
| Specificity | `log(rank) / log(size)` | a published frequency list, whose own length bounds it in `[0, 1]` |
| Phrase agreement | the geometric mean over the words agreeing on a subject, times the share of the phrase's words that agree | the words of the phrase, read together. On its own, `cite` could be law, linguistics or publishing. The name is `citationSource`, so the reading scores the pair: `citation` and `source` both carry publishing and neither carries law, and publishing is what the name is scored for |

### Where one word ends and the next begins

The rules come from [UAX #29](https://www.unicode.org/reports/tr29/), the Unicode standard for text segmentation. Two of its word-boundary rules cover cases a splitter working from capital letters alone gets wrong.

| Rule | What it states | Effect |
|---|---|---|
| WB9, WB10 | a letter next to a digit is not a boundary | `utf8Decode` reads as `utf8` and `decode` |
| WB6, WB7 | a letter either side of an apostrophe is not a boundary | `resource's` is one word. Split at the apostrophe, the trailing `s` reaches the dictionary, which carries it as a noun |

**A run with no boundary in it at all.** `pushevent` carries no capital, no underscore and no digit. Five steps decide what it is, in order, and the first four are refusals.

| | The question | What answers it |
|--:|---|---|
| 1 | Is it a candidate at all? | A run under six letters, or one the frequency list carries, or one WordNet carries, or one that is a known word plus an inflection, is left whole |
| 2 | What are the ways of cutting it? | Every split into pieces, enumerated |
| 3 | What does each piece cost? | `log(rank) + 3` against the frequency list. A piece of three letters must be inside rank 6,000; a piece of two is read only where a catalogue of published tokens cites it, because the list carries fragments like `tc`, `ri` and `ity` that would let any identifier parse |
| 4 | Is the split words or fragments? | A split whose pieces average under three letters is discarded |
| 5 | Which survives? | The cheapest. Where none survives, the run is left whole |

| Run | What happens | Why |
|---|---|---|
| `pushevent` | → `push`, `event` | Nothing carries `pushevent` whole, and both pieces are common words. `pu` + `shevent` prices worse |
| `notebook` | stays `notebook` | Refused at step 5. The word itself ranks 12,315 and costs 12.4; note at 680 beside book at 293 costs 18.2 |
| `abstains` | stays `abstains` | Refused at step 1. WordNet carries `abstains`, so it is never offered for cutting. On frequency alone it reads as `ab` + `stains`, both of which the list carries |
| `userid` | stays `userid` | Refused at step 3. `user` + `id` needs `id`, which is two letters, and no catalogue of published tokens is wired: `CitedTokens.NONE` is what the reading runs on |

### Why a raw word count says nothing

The words a Java program contains most of are the words every Java program contains most of. Each word is therefore scored against the rate at which two references write it.

| Reference | What it states | What it scores down that the other cannot |
|---|---|---|
| The bundled frequency list | what ordinary English is written in, as a rank per word | `the`, `of`, `that` |
| [`CorpusVocabulary`](code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/CorpusVocabulary.java) over the pooled reference corpus | what working Java is written in: the share of each word over the declared names of a hundred public Java repositories, drawn by a stated frame | `get`, `set`, `value`, `map`, `object`, `list`, `string`, which a frequency list of English finds specialist |

The corpus is 28,839 words over 1,541,720 occurrences, and its own manifest records the draw, the commits and the licence checks. A word ranks high only where both references write it less often than the repository being read does.

## Limitations

- **Java only.** The parse, the platform reference and the declaration rules are all Java's. Another language needs its own parse and its own reference.
- **A word is resolved from its phrase alone.** The words of one declared name are read together and nothing else contributes: the type the name is declared on, the class it sits in and the rest of the file all play no part. `citationSource` resolves correctly; a field named `source` alone gets whatever the dictionary lists. On Apache Tika, `stream` reads as *geography*, `pipe` as *hydraulics*, `detector` as *electrotechnology*.
- **The domain-label resources cover specialist senses only.** [WordNet Domains](https://wndomains.fbk.eu/) states in its own header that it omits domain-less senses, so a word used in its everyday meaning is either unlabelled or labelled with the one specialist sense somebody recorded. `log`, `root`, `stub` and `tree` all read as *plants*, because the timber is a sense a domain resource labels and the file a program appends to is not.
- **A scope is a source-set directory.** That keeps generated output out of a reading with no list of directories to ignore. A repository laid out any other way reads as having no Java in it, and reports no error.
- **The splitter has known failure cases**, each pinned by a test: `XMLHttpRequest`, `parseHTTPResponse`, `toJSONString`, `getDSLContext`, `IPv6Address`. The one bundled catalogue that would arbitrate them lists `THE`, `OF` and `AND` beside the tokens a Java file is made of — `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE` — so it is not wired.
- **The reading answers from a term vocabulary and never from a subject scheme.** Comparing a repository to a field of study through a few hundred generic labels names the stated area 5 times of 11 at best across the evaluation set, because a derivatives library and a poverty study both read as economy, finance and mathematics. [The method](docs/METHOD.md) has the figures. A repository no bundled vocabulary reaches gets no answer, which two of the eleven members do.
- **A read takes minutes**, and no result is kept between runs. Every threshold is derived by resampling — 999 seeded draws per scope, per reference, per subject scheme and per vocabulary — and every declared name is matched against all seven vocabularies. Assembling the export holds about two thirds of a read, and most of that cost does not depend on the repository: [`ScrambledTerms`](skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/ScrambledTerms.java) permutes each vocabulary's own words 999 times whatever tree is being read.

## Modules

| Module | Contents |
|---|---|
| `lexicon` | the bundled lexical resources and the code that reads them: WordNet through extjwnl, Wiktionary abbreviations, topic labels and hierarchy, Wikidata names and initialisms, an SQL function catalogue, and the seven term vocabularies |
| `lexicon-extraction` | Gradle tasks that regenerate each bundled resource from its published source at a pinned revision |
| `code-semantics-engine` | the pipeline and its model records: parse, word extraction, topic resolution, divergence statistics, subject placement, the tokeniser, the word segmenter, the evidence trail |
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
CONTRIBUTING.md
docs/plans/**
**/generated/**
```

## References

| | Reference |
|---|---|
| A domain for every synset | [eXtended WordNet Domains](https://adimen.ehu.eus/web/XWND), González-Agirre, A., Castillo, M. and Rigau, G. (2012), LREC. CC BY 3.0, bundled as one leading domain per synset keyed by sense key. [BabelDomains](https://aclanthology.org/E17-2036/) is the successor and is CC BY-NC 3.0, which a library distributed under Apache-2.0 cannot bundle |
| Banking capabilities | [BIAN Service Landscape](https://github.com/bian-official/artefacts), Banking Industry Architecture Network. 319 service domains, Apache-2.0 |
| Change types a commit message states | [Conventional Commits v1.0.0](https://www.conventionalcommits.org/en/v1.0.0/), with type definitions from the [Angular commit guidelines](https://github.com/angular/angular/blob/22b96b96902e1a42ee8c5e807720424abad3082a/CONTRIBUTING.md) at the revision the specification links. 11 tokens, MIT for both |
| Computer science topics | [CSO](https://cso.kmi.open.ac.uk/), the Computer Science Ontology, Knowledge Media Institute, The Open University. 11,438 topics, CC BY 4.0, and no definition for any of them |
| Cyclomatic complexity | [McCabe, T. (1976), *A Complexity Measure*](https://doi.org/10.1109/TSE.1976.233837), IEEE Transactions on Software Engineering SE-2(4) |
| Derivatives-trade terms | [FpML](https://www.fpml.org/), the Financial products Markup Language, ISDA. 1,405 complex types of the 5.11 confirmation schemas, under the [FpML Public License](https://www.fpml.org/the_standard/fpml-public-license/) |
| Dividing a word among its senses | Magnini, B., Strapparava, C., Pezzulo, G. and Gliozzo, A. (2001), [*Using domain information for word sense disambiguation*](https://aclanthology.org/S01-1027.pdf), SENSEVAL-2 |
| Electronic-trading terms | [FIX Orchestra](https://www.fixtrading.org/standards/fix-orchestra/), FIX Trading Community. 7,170 named things of FIX Latest, Apache-2.0 |
| File formats | [PRONOM](https://www.nationalarchives.gov.uk/pronom/), The National Archives. 2,571 formats of DROID signature file V125, under the [Open Government Licence v3.0](https://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/) |
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
| Security weaknesses | [CWE](https://cwe.mitre.org/), The MITRE Corporation. 959 weaknesses of catalog 4.13, under the [CWE Terms of Use](https://cwe.mitre.org/about/termsofuse.html) |
| Sense distributions shift with domain | Koeling, R., McCarthy, D. and Carroll, J. (2005), [*Domain-specific sense distributions and predominant sense acquisition*](https://aclanthology.org/H05-1053/), HLT-EMNLP |
| Subject labels per sense | [WordNet Domains](https://wndomains.fbk.eu/), Fondazione Bruno Kessler. Domain-less senses are absent from the bundled lift, so the share of a word they hold is reported on no domain rather than redistributed |
| The platform's own vocabulary | `java.lang.module.ModuleFinder.ofSystem()`, and the class file format, [JVMS §4.4](https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html) |
| Topic labels per headword | [Wiktionary](https://en.wiktionary.org/), read through [wiktextract](https://github.com/tatuylonen/wiktextract) |
| Word boundaries | [UAX #29, Unicode Text Segmentation](https://www.unicode.org/reports/tr29/), rules WB6, WB7, WB9, WB10 |
| Word frequency | [Leipzig Corpora Collection](https://wortschatz.uni-leipzig.de/en/download), three English corpora of one million sentences each |
| Word sense frequencies | WordNet's own tagged-corpus counts (`cntlist`), read through [extjwnl](https://github.com/extjwnl/extjwnl)'s use counts |
| Word sense, lemma, synset | [WordNet](https://wordnet.princeton.edu/), Princeton University. Fellbaum, C. (ed., 1998), *WordNet: An Electronic Lexical Database*, MIT Press |

## Licence

Apache-2.0 ([`LICENSE`](LICENSE)), declared in the published POM. The bundled lexical data is licensed separately and each file states its own terms; two files derived from Wiktionary are CC BY-SA 4.0, which attaches to those files rather than to code that reads them. [`NOTICE.md`](NOTICE.md) lists every file.
