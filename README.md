# code-semantics

A Java library that states what subject matter a source repository is concerned with, by reading the words in the names its authors declared.

It works in the terms of lexical semantics and information theory and assumes neither: [`docs/GLOSSARY.md`](docs/GLOSSARY.md) defines every one of them — *lemma*, *sense*, *synset*, *divergence*, *permutation null* — with what it is called in this tree and a reference for each.

| | |
|---|---|
| **Takes** | a directory of Java source. No clone, no build, no type resolution, no network |
| **Gives** | one JSON file per run: the words this repository writes more of than English or the Java platform does, the subjects those words place it in, and the concepts of a published taxonomy its names declare |
| **Decides by** | published resources only. A dictionary says which words carry subject matter, a frequency list says which are ordinary, and 999 resamples say which figures chance would have produced. No word list is written here |
| **Run** | `./gradlew read`, then read [`output/markdown/summary.md`](output/markdown/summary.md) |

![One bar per topic the reading reports, each as long as the share of the reading that topic accounts for](output/svg/themes-bar.svg)

One bar per topic whose figure exceeds all 999 chance resamples, longest first, each as long as the share of the reading that topic accounts for. Colour groups the topics the topic resource places under one broad subject: Wiktionary states `sciences` above both `linguistics` and `grammar`, and `natural-sciences` above `computing`, so the first two share a colour and the third does not.

## What it does

- **Reads a local directory.** No clone, no fetch, no compile, no type resolution — a repository that does not build is still readable, and so is a pull request.
- **Counts only the names a repository declares.** `String`, `List` and `assertThat` belong to the platform and to third-party libraries; a repository referencing them has said nothing about its own subject. Only the syntax says which is which, so [`ParsedRepository`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java) reads each file with [JavaParser](https://github.com/javaparser/javaparser) into an abstract syntax tree over the [Java language grammar](https://docs.oracle.com/javase/specs/jls/se21/html/jls-2.html), then keeps the identifier at a declaration node — a type, method, field, parameter, local, record component, constant, pattern binding or label — while the same identifier at a use is set aside. No symbol solver is on the classpath: what a name refers to is a separate question this reading never asks.
- **Looks each word up in published resources** — [WordNet](https://wordnet.princeton.edu/), [WordNet Domains](https://wndomains.fbk.eu/), [Wiktionary](https://en.wiktionary.org/)'s topic vocabulary and the [Leipzig Corpora Collection](https://wortschatz.uni-leipzig.de/en/download) frequency list — and records what each resource says the word is about.
- **Adds that up into a distribution over subjects**, weighting each [phrase](#definitions) once however long it is, per [scope](#definitions) and for the repository.
- **Compares distributions**: a scope against the whole repository, the repository against a [published subject scheme](#subject-scheme), and every declared name against a [published term taxonomy](#term-taxonomy).
- **Reports nothing that chance would have produced.** Every reported figure has passed a [permutation test](#references), described below.

### What a divergence in bits is

Every distance these reports state is a **divergence in bits**.

The reading turns each scope into a distribution over subjects — for `lexicon/src/main/java`, so much `grammar`, so much `computing`, so much `linguistics`, summing to 1 across everything observed. The whole repository is another such distribution. A divergence measures how far two of them stand apart.

The measure is the [Jensen–Shannon divergence](#references), and it has three properties the reading depends on:

| | |
|---|---|
| **0 bits** | the two distributions are identical — the scope writes every subject at exactly the repository's rate |
| **1 bit** | they share nothing — every subject one writes, the other never writes |
| **bounded at 1** | the maximum follows from the definition under base-2 logarithms, so no figure here needs a scale explained beside it |

That last property is why this measure and not another. [Kullback–Leibler divergence](#references) answers a similar question and is unbounded above, so 4.2 of it means nothing without knowing what the maximum was — and there is no maximum.

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

So **0.1887 bits is what a three-to-one preference reversed between two subjects looks like.** `lexicon/src/main/java` sits at 0.1945 bits from this repository — about that far apart, spread over more subjects than two.

Each topic's own term of that sum is reported separately, which is what says *which* subjects carried the distance. `grammar` accounts for 0.0076 bits of `lexicon/src/main/java`'s 0.1945.

### What the 999 resamples are for

A scope's distribution always differs somewhat from the whole repository's. The question is whether the difference means anything, and a small scope produces a large difference by accident: read 4 files and they will look unlike the other 447 whatever they contain.

So the reading builds the distribution of differences chance alone produces, and asks where the real one falls in it:

| | Step |
|--:|---|
| 1 | Measure the real figure: the divergence between this scope's distribution and the whole repository's |
| 2 | Draw 999 fake scopes of exactly the same number of files, at random, from the same repository |
| 3 | Measure the same divergence for each of the 999 |
| 4 | Report the real scope only if its divergence is larger than **all** 999 |

Worked example: `lexicon/src/main/java` sits 0.1945 bits from the whole repository, and no random group of the same number of files reached that far, so the reading reports it. `documentation` sits 0.2490 bits away — **further** — and the reading does not report it, because 960 of the 999 random draws reached at least that far. Distance alone is not evidence. Distance a random group of that size does not reach is.

Step 4 uses all 999 rather than the usual 95th percentile because every scope is tested at once. Testing 40 scopes at the 95th percentile would report two by chance alone; the `1/(n+1)` quantile is what keeps the whole table honest. The method is Good's [permutation test](#references), and it assumes nothing about the shape of the distribution — which matters, because nothing here is normally distributed.

Failures are named. Every scope that did not pass is printed with its figure and how many draws beat it, at the end of [the summary](output/markdown/summary.md).

## The export

Every run writes [`output/json/reading.json`](output/json/reading.json). It carries the result and the evidence for it, so a consumer needs no HTML, no markdown and no second run.

| Section | Holds | One entry per |
|---|---|---|
| `summary` | the result | run |
| `signals` | the words and phrases the repository writes more of than English or the Java platform does | word or published phrase |
| `themes` | the subjects distinguishing one part of the repository from the rest | topic, in the scope it distinguishes |
| `taxonomies` | the published concepts the repository's names match, and where the reading places it | vocabulary matched against |
| `setAside` | counts of what the three lists omit | run |

### Reading it

`summary` answers the question on its own. Nothing under it is needed to know what the repository is about:

```json
{
  "repository": "CodeSemantics",
  "about": ["linguistics", "computing", "grammar"],
  "placedIn": {
    "scheme": "arXiv",
    "subject": "Computer Science",
    "divergenceBits": 0.3399432131693857,
    "nearestByChanceBits": 0.4125288002235385,
    "standsApartFromChance": true
  },
  "leadingWords": [{ "word": "word", "divergenceBits": 0.0158, "occurrences": 239 }, ...],
  "leadingConcepts": ["Source", "Root", "Token", "Phrase", "Verb"],
  "shareOfWordsWithACitation": 0.983078231292517,
  "shareOfMassOnNoSubject": 0.7602347402694423,
  "counts": { "signals": 246, "themes": 5, "concepts": 115 }
}
```

Read `placedIn.standsApartFromChance` before `placedIn.subject`: some subject is always nearest, and the boolean is what makes the nearest one a result.

Each list under the summary answers a follow-up question.

| To find out | Read |
|---|---|
| which words carry the signal, and where each was written | `signals` |
| what one part of the repository is about | `themes` |
| which published concepts the declared names match | `taxonomies[].concepts` |
| how much was measured and left out of the lists | `setAside` |

Any JSON reader will do. In Python, with nothing installed:

```python
import json

reading = json.load(open("output/json/reading.json"))

print(reading["summary"]["about"])                      # ['linguistics', 'computing', 'grammar']
print(reading["summary"]["placedIn"]["subject"])        # Computer Science

for signal in reading["signals"][:10]:                  # the ten strongest words
    print(signal["word"], round(signal["divergenceBits"], 4), signal["firstWrittenAt"]["file"])

lexicon = [t for t in reading["themes"] if t["scope"] == "lexicon/src/main/java"]
print([(t["topic"], t["carriedBy"][:3]) for t in lexicon])
```

In a browser or Node, `JSON.parse` over the same file gives the same objects. [`jq`](https://jqlang.github.io/jq/) works too where it is installed — `jq '.summary' output/json/reading.json` — but nothing here needs it.

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
    "file": "code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/BundledCitations.java",
    "line": 64
  }
}
```

`divergenceBits` is this word's term of the [Jensen–Shannon divergence](#references) between the repository's word distribution and the reference's, bounded at 1 bit. `closestReference` names the reference scoring the word lowest, which is the score reported: `get` scores high against ordinary English and low against the Java platform's own API, so the platform is its closest reference. Each reference's threshold comes from that reference's own [permutation null](#references), so the number of rows follows from the repository's size.

Words English supplies inside a name are scored, ranked and left out of `signals`. `massByTopic` is a name about mass and about topics, and `by` is what the language puts between them: against a frequency list drawn from prose it reads as specialist, because prose is not where a program's prepositions are written. Two bundled resources place such a word between them — WordNet carries no noun, verb or adjective entry for it, and the frequency list carries it as a word English is written in — and [the vocabulary report](output/markdown/vocabulary.md) prints it under its own heading with the rank it earned.

**Signals only.** A word no resource covers, a match the branch rule discarded and a topic within chance appear in no list, and `setAside` counts each. 246 signals out of 894 words scored is a different claim from 246 out of 8,000, and the counts are what tell the two apart.

### The schema

[`reading-export.schema.json`](code-semantics-engine/src/main/resources/reading-export.schema.json) states the shape, with a description on every field. It ships inside the published jar at `/reading-export.schema.json`, so a consumer can generate types from it or validate against it:

```bash
python3 -c "import json; print(json.load(open('reading-export.schema.json'))['properties']['summary']['properties']['placedIn']['description'])"
```

`ExportFile` validates every document against that schema before writing it, so a run produces a document matching the contract or produces none. `schemaVersion` rises when a field is added, renamed or removed, and `ReadingExportSchemaTest` fails the build on a change the schema does not state.

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
| `./gradlew checkAll` | tests and coverage verification |

The commands that answer a question about one word, one topic or one panel member are in [the appendix](#appendix-diagnostics-and-analysis).

Java 21 toolchain, `-Xlint:all -Werror`, Error Prone, an 80% JaCoCo instruction floor per module.

### What a run tells you

- [**The topics, with the evidence behind each**](output/markdown/summary.md) — every topic whose figure exceeds all 999 chance resamples, its distance in bits, and the words and lines that produced it. Start here.
- [**How much of the repository could be read at all**](output/markdown/self-reading.md) — λ, the files that would not parse, and the words no resource could be cited for.
- [**The words and phrases that carry the most signal here**](output/markdown/vocabulary.md) — every declared word ranked against ordinary English and against the Java platform's own API. A word both references write more often than this repository does scores lower than one neither of them writes.
- [**What each scope is about**](output/markdown/themes.md) — with the words that produced each topic's score, and the line each was written on.
- [**Where it stands among published subjects**](output/markdown/subjects.md) — the nearest of the 152 subject categories [arXiv](https://arxiv.org/category_taxonomy) publishes to classify scientific papers, from `cs.CL` Computation and Language to `math.AG` Algebraic Geometry. The nearest real category must be nearer than the nearest of a set of categories built by shuffling the real ones.
- [**Which published taxonomy terms the declared names match**](output/markdown/terms.md) — per normalisation level, and every one-word match discarded for standing alone in its part of the taxonomy (see [corroboration by branch](#matching-against-published-taxonomies)).
- [**The field drawn as a sunburst**](output/svg/taxonomy-sunburst.svg) — the whole published taxonomy, lit where this repository writes a concept.

A run writes four pages beside those files: `output/html/index.html` traces the nine steps in order with each step's figures, `taxonomy.html` draws the field as a tree with every concept and its publisher's definition, `evidence.html` lists every match with a link to the line, and `themes-chart.html` carries both charts. **They are pages, so they render in a browser and not on this site** — open them from `output/` after a run. The markdown above and the two SVGs are what renders here.

## Backtesting

Every figure this repository reports about itself is an instrument measuring itself. The taxonomies, the resources and the rules were all chosen while reading this tree, so a reading that works here establishes nothing on its own. A backtest reads a repository the reading was never written for.

`./gradlew evaluationFetch -Dcs.evaluation.dir=<dir>` fetches each member at the commit the manifest pins; `./gradlew evaluationRead -Dcs.evaluation.dir=<dir>` reads them, one report folder per member under `output/`.

### One member so far: Apache Tika

[Apache Tika](https://github.com/apache/tika) at `43cbdae6`, Apache-2.0. Its domain is the category token the Apache Software Foundation states in its own DOAP record, written down before the reading ran. It is a text and metadata extraction toolkit — five times this repository's size and outside its subject matter.

| | Tika | This repository |
|---|--:|--:|
| Word occurrences read | 770,028 | 82,075 |
| Files | 2,156 | 451 |
| λ, share with a citation | 0.972 | 0.983 |
| Evidence resolving to no subject | 68.7% | 76.1% |
| Nearest arXiv subject | Computer Science, 0.3621 bits | Computer Science, 0.3399 bits |
| Nearest by chance | 0.4337 bits | 0.4125 bits |
| Subjects distinguishing some scope | `computing`, `law`, `linguistics` | `linguistics`, `computing`, `grammar` |
| OLiA concepts written, of 1,311 | 108 | 115 |
| OLiA root branches reached, of 70 | 13 | 12 |

**λ reproduces off this tree**, which is the first thing the backtest had to show: 0.972 against 0.983, on a repository nine times the size and in another domain.

**The reading places Tika under Computer Science and separates it from chance**, and `computing` is the subject distinguishing most of its scopes — which is what its own DOAP category states.

**`law` is a defect the backtest found and this tree could never show.** It distinguishes five of Tika's eight leading scopes, and it is the Apache licence header: 45.1% of Tika's comment word occurrences sit in a comment copied into more than one file, against 0.3% here, because this repository carries no licence header. A comment copied into 2,140 files is counted 2,140 times. [What the author chose](docs/plans/WHAT_THE_AUTHOR_CHOSE.md) states the fix — a comment appearing in *n* files weighs 1/*n*.

**The term matcher does not yet discriminate.** Tika writes 108 OLiA concepts against this repository's 65, and its top branches hold `Text`, `String`, `Result`, `Object` and `Exception` — Java's naming conventions colliding with ordinary English nouns that a linguistics taxonomy happens to publish. A vocabulary of linguistic annotation should say almost nothing about a text extraction toolkit, and this one says a great deal.

The whole reading is snapshotted under [`output/tika/`](output/tika): [the summary](output/tika/markdown/summary.md), [what each scope is about](output/tika/markdown/themes.md), [the words it chose](output/tika/markdown/vocabulary.md), [the taxonomy terms it writes](output/tika/markdown/terms.md) and [where it stands among published subjects](output/tika/markdown/subjects.md).

### What one member cannot settle

A vocabulary must match inside its domain **and** produce few or no matches outside it. Tika extracts text and OLiA annotates text, so it is a poor negative control by construction. The member that would settle it is one with no text in its subject matter — `maven` or `ant`, which Apache states as `build-management`. Naming one costs a licence verified at a pinned revision, a domain stated by somebody outside this project and recorded before the reading runs, and an expected result.

## Definitions

Each term below has an everyday meaning too. The technical one is meant. [`docs/GLOSSARY.md`](docs/GLOSSARY.md) carries the rest — the words about words, the words about the shape of words, and the statistics — each with the class that implements it.

| Term | Meaning here |
|---|---|
| **scope** | one directory the build compiles as a unit — `<module>/src/<set>/java`, so `lexicon/src/main/java` and `lexicon/src/test/java` are two — or the repository's documentation. A package or a single file is not a scope |
| **phrase** | one declared name, or one sentence of prose. It is the unit of evidence: each contributes a single unit of mass whatever its length, so a long javadoc sentence cannot outweigh a short field name |
| **sense** | one of the distinct meanings a dictionary lists under a word, as [WordNet](#references) enumerates them. `cite` has several, one of them summoning a defendant to court |
| **headword** | the word itself, with its senses pooled — the form a dictionary indexes |
| **lemma** | the dictionary form of an inflected word, as [WordNet](https://wordnet.princeton.edu/) indexes it: `citations` → `citation` |
| **λ (legibility)** | the share of word occurrences any bundled resource could be cited for |
| **divergence** | how far two distributions over subjects stand apart, in bits, bounded at 1. [Defined with a worked example above](#what-a-divergence-in-bits-is) |
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
| 1 | The parse keeps the declaration and drops the use | `citationSource` is kept; the type `CitationSource` at this position is a use | [`ParsedRepository`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/ParsedRepository.java) |
| 2 | Split at case transitions and separators | `citation`, `source` | [`Tokeniser`](code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/Tokeniser.java), [`IdentifierWords`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/reading/IdentifierWords.java) |
| 3 | Price a glued run against a frequency list, and keep whole any run the dictionary carries | `userid` → `user`, `id`; `abstains` stays one word | [`WordSegmenter`](code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordSegmenter.java), [`PieceCost`](code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/PieceCost.java) |
| 4 | Fold a published run of words into one term | `partOfSpeech` → `part of speech`, one term counted once | [`CollocatedWords`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/CollocatedWords.java) |
| 5 | Discard a word carrying no subject matter, and take the lemma of the rest | *of*, *and*, *which* leave; `citations` → `citation` | [`ContentWords`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/ContentWords.java), [`WordMorphology`](code-semantics-api/src/main/java/org/fifties/housewife/codesemantics/name/WordMorphology.java) |
| 6 | Collect what each resource says the word is about | `cite` → `law`, from the sense about summoning a defendant | [`TopicCitations`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicCitations.java) |
| 7 | Count each label once, however many ancestors it arrives with | a word labelled `computing` arrives labelled `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences` as well, because the resource publishes every ancestor alongside the label. Counted as six, one statement about one word would be six times the evidence, so the five ancestors are folded back into `computing` | [`StatedTopics`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/StatedTopics.java) |
| 8 | Weight each label, add them up per scope, and test the result against chance | one distribution over subjects per scope, and the distance each scope must exceed to be reported | [`TopicDistribution`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/TopicDistribution.java), [`PermutationNull`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PermutationNull.java) |

### Where one word ends and the next begins

The rules come from [UAX #29](https://www.unicode.org/reports/tr29/), the Unicode standard for text segmentation. Two of its word-boundary rules cover cases a splitter working from capital letters alone gets wrong:

| Rule | What it states | Effect |
|---|---|---|
| WB9, WB10 | a letter next to a digit is not a boundary | `utf8Decode` reads as `utf8` and `decode` |
| WB6, WB7 | a letter either side of an apostrophe is not a boundary | `resource's` is one word. Split at the apostrophe, the trailing `s` reaches the dictionary, which carries it as a noun |

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
| [`PlatformVocabulary`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/PlatformVocabulary.java), from `ModuleFinder.ofSystem()` | what ordinary Java is written in: every type name and every public or protected method name the platform declares in its exported packages, split by the same grammar | `get`, `set`, `value`, `map`, `object`, `list`, `string`, which a frequency list of English finds *specialist* |

The second asks the running JDK to describe itself, the same delegation [`PlatformPackages`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/parse/PlatformPackages.java) uses to sort an import. [`ClassFileMethods`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/vocabulary/ClassFileMethods.java) reads the method names from each class file's constant pool, loading no class. A word ranks high only where both references write it less often than this repository does; where a reference writes it more often, its score falls and it keeps its place in the table. [See the whole ranking](output/markdown/vocabulary.md).

## Matching against published taxonomies

| Kind | Example | How it is used |
|---|---|---|
| **Subject scheme** — classifies whole documents | the [arXiv category taxonomy](https://arxiv.org/category_taxonomy): 152 categories the preprint archive uses to file scientific papers, each with a published description | as a reference distribution. Its category names never appear in code, so the reading pools each category's own description through the same pipeline and compares distribution against distribution |
| **Term taxonomy** — names the terms a field's practitioners use | [OLiA](https://github.com/acoli-repo/olia), [FIBO](https://spec.edmcouncil.org/fibo/) | matched against declared names. OLiA publishes `AdjectivePhrase`; a repository may declare `adjectivePhrase`, and both split into the same two words |

**Every taxonomy is converted to [SKOS](https://www.w3.org/TR/skos-reference/) before it is read** — the W3C model for published vocabularies: each concept has a preferred label, any number of alternative labels, and `broader`/`narrower` links to its neighbours. OLiA arrives as OWL and FIBO as RDF/XML; both become the same rows, so the matcher and the branch rule work the same way whatever the publisher used.

### Subject scheme

The bundled one is the [arXiv category taxonomy](https://arxiv.org/category_taxonomy), read from [`arxiv-taxonomy.tsv`](lexicon/src/main/resources/arxiv-taxonomy.tsv): 174 rows — 8 groups, the 11 archives inside them and 155 categories, of which the 152 arXiv publishes a description for are what the reading uses. Nobody writes `cs.CL` in code and nobody writes Computation and Language either, so [`PooledDescriptions`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/PooledDescriptions.java) pools each category's own description through the pipeline above and [`SubjectPlacement`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectPlacement.java) compares distribution against distribution. [`SubjectNull`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/theme/SubjectNull.java) builds a taxonomy of chance from the same descriptions, and the nearest real category has to beat the nearest chance one.

**Two gaps, both of which move a reported figure:**

- **It classifies research, so commercial software is placed by resemblance to a research field.** Finance and economics take 12 of the 174 rows — Trading and Market Microstructure, Risk Management, Pricing of Securities, Portfolio Management — and a trading system is placed against those.
- **Whole domains have no category at all**: payments and settlement, ledgers, e-commerce and order management, health records, logistics, telecommunications operations, identity, and deployment tooling. Something is always nearest, and the reading cannot state that the right answer was absent from the list.

[PyPI's 321 `Topic ::` classifiers](https://pypi.org/classifiers/) carry `Office/Business :: Financial :: Point-Of-Sale`, `Communications :: Telephony` and `System :: Logging`, and swapping the scheme for them is [planned](docs/plans/CLASSIFYING_A_REPOSITORY.md). What settles the swap is the share of repositories whose stated category has a nearest subject at all under each scheme.

### Term taxonomy

[`TermSpans`](code-semantics-engine/src/main/java/org/fifties/housewife/codesemantics/engine/term/TermSpans.java) takes the longest published term at each position, left to right, with no two matches overlapping. A prefix that is not itself a published term is not evidence.

**Two normalisation levels, reported separately and never summed:**

| Level | Both sides reduced to | Source |
|--:|---|---|
| 1 | the sequence of words itself | a string comparison, which invents nothing |
| 2 | the lemma of each word | WordNet's lemma index. `phrases` matching `Phrase` is one word and its plural, not two words a dictionary calls alike |

**Corroboration by branch.** A taxonomy is a tree: every concept sits under a parent, beside sibling concepts the publisher placed there. A match on a single word counts only where the repository also writes at least one of that concept's siblings. Writing several concepts from one part of a field is evidence of working in it; writing a single one is what an ordinary English word the taxonomy has claimed produces.

Worked example: OLiA places `Preferred` under `UsageAndFrequencyFeature`, beside `Rare`, `Common` and the rest. This repository writes `Preferred` once and none of its siblings, so the match is discarded. `Verb` survives, because `Noun`, `Clause` and `Phrase` are written too. A match of more than one word — Tika's `AdjectivePhrase` against OLiA's — needs no such support, because two words matching by chance is far less likely than one.

**The two bundled taxonomies:**

| Taxonomy | Field | What it tests |
|---|---|---|
| [OLiA](https://github.com/acoli-repo/olia) — Ontologies of Linguistic Annotation | linguistic annotation | the in-domain case: a vocabulary of grammar should match a library built from lemmas and senses |
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
- **A word is resolved from its phrase alone.** The words of one declared name are read together and nothing else votes — not the type the name is declared on, not the class it sits in, not what the rest of the file is about. `citationSource` resolves correctly because `citation` and `source` both carry publishing and neither carries law; a field named `source` on its own gets whatever the dictionary lists, and the surrounding code cannot correct it. Reading Apache Tika is where that shows: `stream` there is read as *geography*, `pipe` as *hydraulics*, and `detector` as *electrotechnology*. In each case the sense a program means is not the sense the resources carry.
- **The domain-label resources cover specialist senses only.** [WordNet Domains](https://wndomains.fbk.eu/) states in its own header that it omits domain-less senses, so a word used in its everyday meaning is either unlabelled — contributing nothing — or labelled with the one specialist sense somebody recorded for it. `log`, `root`, `stub` and `tree` are all read as *plants*, because the timber is a sense a domain resource labels and the file a program appends to is not.
- **The taxonomies were chosen after examining this codebase**, so the term matching has not yet been shown to discriminate. One out-of-domain repository has been read; a panel of them is what would settle it.
- **The splitter has known failure cases**, each pinned by a test. The one bundled catalogue that would arbitrate them was measured and rejected: the Wikidata initialism registry lists `THE`, `OF` and `AND` beside the tokens a Java file is made of — `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE`.
- **A scope is a source-set directory.** That keeps generated output out of the reading with no list of directories to ignore, but a repository laid out any other way reads as having no Java in it, silently.

## Appendix: diagnostics and analysis

Each one answers a question the reports raise but do not settle: why a word scored as it did, what carried a topic, and what the reading does on a repository it was not written for.

| Command | What it answers |
|---|---|
| `./gradlew wordVotes -Pwords="cite source"` | every subject each resource gives those words, and what each vote is worth |
| `./gradlew wordPlace -Pwords="get set list"` | where those words stand in the vocabulary ranking, and which reference scored each of them down |
| `./gradlew topicCarriers -Ptopics="linguistics"` | every word that produced a topic's score, with its share |
| `./gradlew abbreviatedTypes` | every declared name that is the initials of its own type, with that type |
| `./gradlew evaluationFetch -Dcs.evaluation.dir=<dir>` | fetches each backtest member at the commit the manifest pins it to |
| `./gradlew evaluationRead -Dcs.evaluation.dir=<dir>` | reads every member of the backtest panel, one report folder per member |

## Appendix: what the reading discarded

Each report names what it did not use, at the end of that report and nowhere else: [topics no further away than chance resampling put them](output/markdown/summary.md), [one-word taxonomy matches standing alone in their branch](output/markdown/terms.md), and [words no bundled resource has an entry for](output/markdown/self-reading.md).

## References

| | Reference |
|---|---|
| Financial terms | [FIBO](https://spec.edmcouncil.org/fibo/), EDM Council |
| Jensen–Shannon divergence | Lin, J. (1991), *Divergence measures based on the Shannon entropy*, IEEE Transactions on Information Theory 37(1), 145–151. Bounded at 1 bit under base-2 logarithms |
| Linguistic annotation terms | [OLiA](https://github.com/acoli-repo/olia), Ontologies of Linguistic Annotation |
| Kullback–Leibler divergence | Kullback, S. and Leibler, R. A. (1951), *On information and sufficiency*, Annals of Mathematical Statistics 22(1), 79–86. Unbounded above, which is why no figure here is reported in it |
| Permutation test | Good, P. (2005), *Permutation, Parametric and Bootstrap Tests of Hypotheses*, 3rd ed., Springer |
| Published subjects | [arXiv category taxonomy](https://arxiv.org/category_taxonomy), 152 subjects |
| Published vocabularies, one model | [SKOS](https://www.w3.org/TR/skos-reference/), W3C Simple Knowledge Organization System |
| Subject labels per sense | [WordNet Domains](https://wndomains.fbk.eu/), Fondazione Bruno Kessler |
| The platform's own vocabulary | `java.lang.module.ModuleFinder.ofSystem()`, and the class file format, [JVMS §4.4](https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-4.html) |
| Topic labels per headword | [Wiktionary](https://en.wiktionary.org/), read through [wiktextract](https://github.com/tatuylonen/wiktextract) |
| Word boundaries | [UAX #29, Unicode Text Segmentation](https://www.unicode.org/reports/tr29/), rules WB6, WB7, WB9, WB10 |
| Word frequency | [Leipzig Corpora Collection](https://wortschatz.uni-leipzig.de/en/download), three English corpora of one million sentences each |
| Word sense, lemma, synset | [WordNet](https://wordnet.princeton.edu/), Princeton University. Fellbaum, C. (ed., 1998), *WordNet: An Electronic Lexical Database*, MIT Press |

## Licence

Apache-2.0 ([`LICENSE`](LICENSE)), declared in the published POM. The bundled lexical data is licensed separately and each file states its own terms; two files derived from Wiktionary are CC BY-SA 4.0, which attaches to those files rather than to code that reads them. [`NOTICE.md`](NOTICE.md) lists every file.
