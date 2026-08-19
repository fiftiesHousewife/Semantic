# What a repository does, not what it says

Every reading in this library is built from **nouns a repository chose for itself**. `massByTopic`, `DocumentSelector`, `ParsingReader` — the reading splits them, looks the words up, and asks which published concept they spell. That answers what a codebase *calls* things.

Two things it cannot answer, and both have a route:

| | Question | Evidence it needs |
|---|---|---|
| **1** | What does the code **do** to those things? | the verbs — the methods declared over the nouns |
| **2** | What does it **actually** do, as opposed to say? | the libraries it calls, and what their publishers state those libraries do |

The first is the prerequisite. It is also the only route to a **functional taxonomy**.

## Why a functional taxonomy needs verbs

A term taxonomy publishes nouns: CSO states `parsing`, OLiA states `AdjectivePhrase`. A **functional** taxonomy publishes verb phrases — BIAN states `Manage Enterprise Risk`, NIST states `GV.OC-01` with a sentence defining it. [`SkosConcept`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java)'s own javadoc records the consequence: *"nobody writes `ManageEnterpriseRisk` in code"*, so a functional taxonomy is compared as a **distribution against prose** and never matched term to term.

That is a weaker reading than the term arm, and it is weaker for a reason that can be removed. **Nobody writes `ManageEnterpriseRisk`, but plenty of repositories write `manage` and `risk` in one method signature.** A reading that produced verb phrases could match a functional taxonomy the way the term arm matches CSO — identifier to identifier, with the publisher stating the hit.

## Step 1 — provenance on every nominal signal — done at the parse, open at the tally

**The walk now keeps the declaration.** [`EnclosingDeclarations`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/EnclosingDeclarations.java) reads the types and methods a node sits inside, [`NameOccurrence`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java) carries them outermost first beside the declared type's words, and [`DeclarationWords`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclarationWords.java) writes one declaration's words in the order the file writes them.

What a name occurrence carries, and what it still does not:

| | Per occurrence |
|---|---|
| kept | the words |
| kept | `file:line`, up to twelve |
| kept | the [`NameForm`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java) |
| kept | the enclosing types and methods, outermost first |
| kept | the declared type beside the name, which [`DeclaredTypeWords`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java) reads |
| open | the declaration carried through to the **matched span**, which `RecordedSpans` still reduces to a `file:line` string |
| open | the receiver of a call, which needs the call site |

**What that leaves.** Step 2 reads a method's own name and needs nothing more, so it is unblocked. The third source of an object below still needs the call site, which the parse has and the tally discards.

**The first use of it measured a repair to zero.** [The phrase arm's repairs](PHRASE_ARM_REPAIRS.md) assembled a published run across one declaration and reached 0 marked keywords on this repository, 0 on Tika and 1 on Santuario. That is a finding about noun runs and says nothing about verbs, which are what this plan wants the declaration for.

## Step 2 — the verbs

A Java method name is already a verb phrase by convention, and the splitter already produces its words. `detectEncoding` reads as *detect* / *encoding*; `parse` / *encoding* is a verb applied to a noun the term arm has already matched.

**Which word is the verb is citable, not guessable.** WordNet indexes verbs separately from nouns, and [`ContentWords`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java) already asks it for a noun base and a verb base and prefers the noun. The same lookup states which words of a method name are verbs. No list is written here.

Three sources of the object the verb applies to, cheapest first:

| Source | Example | Cost |
|---|---|---|
| **The method's own name** | `detectEncoding` → *detect encoding* | free; the words are already split |
| **The declared return and parameter types** | `Metadata detect(InputStream)` → *detect metadata* | `DeclaredTypeWords` already reads them |
| **The receiver of a call** | `parser.parse(stream)` → *parse* applied to a `Parser` | needs the call site, which the parse has and the tally discards |

Take them in that order. The first alone is worth measuring before the others are built.

**A worked example.** Apache Tika declares `DocumentSelector` and `ParsingReader`, and CSO's `document processing` was unreachable from either. `AutoDetectParser.parse(InputStream, ContentHandler, Metadata)` yields *parse* applied to *content handler* and *metadata* — and a functional taxonomy stating *extract document metadata* has three of those four words.

## Step 3 — what the libraries say it does

A repository's imports are already read. [`NameForm.IMPORT`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java) keeps a dependency a file names, *"only where it is neither the platform's nor this tree's own"*, and [`PlatformPackages`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PlatformPackages.java) decides which is which by asking `ModuleFinder.ofSystem()`. So `org.apache.pdfbox` and `com.fasterxml.jackson` are already in hand, and nothing yet asks what they are for.

**The constraint that shapes this step**: the reading takes *"a directory of Java source. No clone, no build, no type resolution, no network."* Reading a dependency's own javadoc means having its sources, which means a build and a fetch. That is a different product and it must not be smuggled in.

Two designs, and the second is the one to build:

| | Design | Why |
|---|---|---|
| ✗ | Resolve dependencies and read their javadoc | needs a build and a network; breaks the stated contract of the reading |
| ✓ | Cite a **published registry** of what a coordinate is for | a registry is a bundled resource with a provenance header, exactly like every other one |

Candidates for the registry, to be measured rather than chosen: Maven Central's own `description` per artefact, the [Software Heritage](https://www.softwareheritage.org/) catalogue, and each project's own `Bundle-Description` where it ships OSGi metadata. **The bound must be derived** — a registry naming a coordinate is a citation; a guess from the package name is not.

## The two streams, and how they meet

The existing arm reads what an author **named**. This one reads what the code **calls**. They are different evidence and must not be summed, for the same reason the rungs are reported apart:

| Stream | Unit | Cites |
|---|---|---|
| Semantic | a word an author chose | WordNet, a frequency list, a published taxonomy |
| Syntactic | a call an author made | the parse, and a registry stating what the callee is for |

They are blended by being reported side by side and by **agreeing or disagreeing**, which is the finding either way. A repository whose names say *linguistics* and whose calls are all `pdfbox` and `poi` is a repository that says one thing and does another, and that is worth stating rather than averaging away.

## Condensing to a specification, parked

The question is whether the syntactic stream could be condensed to something like `Allium` — a **language-neutral specification style**. It is parked, and the order is the reason: a specification format is a target for what the streams find, and choosing one before either stream produces anything would be fixing the shape of evidence that does not exist yet.

Steps 1 to 3 stand without it and are what such a format would carry. Two of their outputs are already in the right shape for one: a verb phrase is a predicate over a noun the term arm has matched to a published concept, and a call is a relation between a declared type and a coordinate a registry describes. **Neither depends on Java** — both come from the parse, and [the plan for other languages](OTHER_LANGUAGES.md) already keeps `NameForm` and the statistics free of any one grammar.

## What settles it

**A repository whose function is known, matched against a functional taxonomy it should hit.** The term arm was settled that way — a linguistics vocabulary must fire on a linguistics library and stay quiet on a finance one — and this arm needs the same pair drawn disjointly from the repositories it was developed against.

| Claim | The measurement |
|---|---|
| Verb phrases reach a functional taxonomy at all | spans matched against `bian-service-domains.tsv`, which is bundled and currently matched by nothing |
| They reach it better than nouns alone | the same count with the verbs removed |
| The gain is not chance | a permutation null, as every other figure here carries |

**Abandon if** verb phrases from method names alone match no more of a functional taxonomy than the nouns already do. That would mean the taxonomy's verbs — *manage*, *provide*, *administer* — are not the verbs a program writes, and the work belongs in the taxonomy rather than in the reading.
