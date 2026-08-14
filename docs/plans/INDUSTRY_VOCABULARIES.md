# Read a repository against its industry's own vocabulary

## Read a repository against its industry's own vocabulary

The two bundled resources are general dictionaries, and a general dictionary only labels a word's specialist
senses — which is why this repository reads as *computing, law, music* and why `cite` votes law. A domain
vocabulary states the terms an industry actually writes, and a repository in that industry writes them too.

### The measurement that shaped the design, run before any of it was written

3,837 FIBO T-Box labels, matched by longest n-gram against this repository's 63,275 identifier occurrences.
This tree is out of domain for a finance ontology, so **every match here is a false positive by
construction**:

| Term length | Distinct terms | Matches on this tree |
|--:|--:|--:|
| 1 word | 306 | **1,789** |
| 2 words | 1,244 | 2 |
| 3+ words | 2,287 | 1 |

The one-word hits are `name` (460), `share` (231), `value` (198) — FIBO does declare classes labelled
*action*, *balance*, *butterfly*. All three multi-word hits are property labels (`is implied by`). Genuine
multi-word class matches out of domain: **zero**.

**So the multi-word term is the signal and the single-word term is the noise**, and neither fact was chosen.
A stop list is forbidden, so the weight comes from a resource: `PhraseSpecificity`, the n-gram extension of
`WordSpecificity`, reads the surprisal of an n-gram off the bundled frequency list. `name` weighs almost
nothing; `interest rate swap` weighs near the ceiling.

### The sources, and what each licence actually says

| Source | Domain | Publishes | Licence as stated | Verdict |
|---|---|---|---|---|
| **FIBO** | finance, and banking through its own `FBC`/`LOAN`/`BE`/`CAE` modules | OWL in RDF/XML, `rdfs:label` + `cmns-av:synonym` (422) + `cmns-av:abbreviation` (810) | **MIT**, verified from the repository's own `LICENSE` | **Ships first** |
| **CSO** | computing, ~15,000 topics | CSV/OWL over a SKOS-derived schema, `klink:relatedEquivalent` for synonymy | CC BY 4.0 on the publisher's pages — **not stated on the download page** | Stage 3, after the licence is verified in the file itself |
| **STW** | economics | native SKOS with English `altLabel`s | CC BY 4.0 **at v9.20**; v9.02 is **ODbL**, whose share-alike would attach to the derived file | Stage 5, pinned to a version whose licence was read |
| **FpML** | markets, derivatives | 236 coding schemes, 5,881 codes, in OASIS genericode; plus XSD element names | **FpML Public License 3.0 — verified**, read from the publisher | **Ships alongside FIBO.** See below |
| **ISO 20022** | payments | message components and a data dictionary, `CstmrCdtTrfInitn`, `Dbtr`, `Cdtr` | *"used and reproduced freely"* under the IPR policy — **"use" is not "redistribute"** | Needs a legal read before anything is bundled |
| ACM CCS | computing | SKOS | educational and research use only | Ruled out — a jar on Maven Central is neither |
| IEEE Thesaurus | engineering | PDF, e-mail gated | CC BY-NC-ND 4.0 | Ruled out twice: NC and ND. A third party's MIT-stamped RDF conversion of it is laundering, not a licence |
| GICS | industry | 4-tier classification | proprietary to S&P and MSCI | Ruled out |
| BIAN | banking | a service landscape, not a vocabulary | none stated | Ruled out — an unstated licence is a no |
| EuroVoc, LCSH, NAICS, JEL | — | — | mostly fine | Ruled out on **fitness**: they classify legislation, books and businesses, not the terms a codebase writes |

**A schema is a better citation for code than a thesaurus, and the doctrine already says so.**
`sql-functions.tsv`'s own header states the principle — *a schema token equal to a function's name is a fact
about the standard this tool executes rather than an observation of any corpus*. FpML and ISO 20022 are
exactly that case and are the only candidates whose terms are already **identifiers**: FpML writes
`interestRateSwap` and so does a trading system, so the match is identifier to identifier with no English in
between. A thesaurus needs lemmatising, splitting and n-gram alignment before it can meet code; a schema
does not. That is the argument for putting them ahead of CSO and STW **if their licences permit
redistribution**, and the licence is the whole question:

**FpML is settled, and it is the cleanest source found so far.** The FpML Public License 3.0 (effective
2026-02-01, licensor ISDA) grants *"a world-wide, royalty-free, non-exclusive license … to use, reproduce,
modify, display, perform, and distribute the FpML Specifications (or portions thereof) with or without
modifications, or as part of a Larger Work"*, and a Larger Work may be distributed under a licence of our
choice provided it does not limit the recipient's rights to the Specifications themselves. Two conditions
attach and both are satisfied by the provenance header this library already writes:

- the **Exhibit A notice** goes in the derived file's header, verbatim;
- the designation *FpML* may identify the specification and state the version, but must not be used as part
  of a trademark for this library, and any compliance claim must name the version. So the header names the
  exact scheme versions and the file claims nothing beyond citing them.

What it publishes is better suited to this library than a thesaurus:

| | Measured |
|---|--:|
| Coding schemes (`fpml.org/spec/coding-scheme/codelist.zip`, 388 KB) | 236 |
| Codes across them | 5,881 |
| Codes that are already single-token identifiers | **2,657** |

`asset-class-2-1.xml` states `Commodity`, `Credit`, `Equity`, `ForeignExchange`, `InterestRate`,
`SecuritiesFinancing` — the words a trading system's identifiers are actually built from. And
`product-taxonomy-4-0.xml` publishes **a hierarchy in the code itself**:
`Commodity:Agricultural:Dairy:Option:Cash`. Each colon is a broader/narrower step, so the `broader` column
falls out of the code with no inference at all — the strongest form of the citation this library asks for.

The format is **OASIS genericode**, with `Code`, `Source` and `Description` columns and a `CanonicalVersionUri`
per scheme, so the extraction is a plain XML read and each scheme is a concept scheme.

**ISO 20022** remains open: read `iso20022.org/terms-use` and the IPR policy against the words *redistribute
in a derived work*. If it clears, the External Code Sets are the interesting part.

### One shape for every source

Whatever a source publishes — OWL, SKOS, CSV, XSD — the extraction normalises it to the same
**SKOS-shaped** columns, and the bundled form stays a TSV:

```
concept   prefLabel   altLabel   broader   kind   module   definition
```

**`definition` is the seventh column and it was added when the first functional taxonomy landed**, because
a term taxonomy is read by its labels and a functional one cannot be. A row labelled `GV.OC-01` states
nothing whatever without the sentence NIST defines it by, and that sentence is the only thing a scope can be
compared against. It is `skos:definition`, so the shape is no less SKOS's for carrying it, and a term source
that publishes no definitions simply leaves it empty.

That is what "convert it to SKOS" should mean here. Emitting SKOS *RDF* and reading it back would take an
RDF dependency (`jena-arq` is in the catalogue, consumed by nothing) to arrive at the same four facts, and
the reading needs a term-to-concept index rather than a graph. Normalising the vocabulary is the win; the
serialisation is not. A conversion also **inherits the source's licence** — restating IEEE's thesaurus in
SKOS does not make it redistributable, and the derived file's header must carry the original terms.

### The matcher

`TopicCitations.of(String word)` takes one word, and `PhraseTopics` reads a phrase as a bag, so word order
is discarded. But **81% of FIBO's labels are multi-word**, and `Vocabulary.IDENTIFIER.phrasesOf` already
yields an *ordered* word list per identifier — the ordering is sitting there unused.

**The span reading itself has landed**, built against OLiA rather than FIBO because that was the taxonomy
whose licence could be read: `TermIndex`, `LinguisticTerms`, `TermSpans`, `TermSpan`, `PhraseSpecificity`,
and `TermReading` over a repository's declared names. Longest match left to right, bounded by the index's own
longest term, a hit advancing past itself and a miss advancing one word. **A partial match abstains**: only a
term the resource actually publishes votes, and a prefix that is not itself a published term is not a
citation. It matches the raw words rather than the offered lemmas, because `OfferedWords` drops function
words and would manufacture adjacency the author never wrote. A new source needs an extraction, a provenance
header and a `TermIndex` — no new reading.

What is left of this part is the join, and it stays undone until the out-of-domain arm has run. `PhraseTopics`
is at the line limit, so it splits: `AgreeingWords` (today's body, moved), `MatchedTerms` (the span reading's
votes), and a pooled `PhraseTopics` over an ordered list of both. `TopicCitations` does not change — the term
reading is its sibling, not its replacement.

**Synonyms are never grouped by hand.** SKOS `altLabel`, `klink:relatedEquivalent` and `cmns-av:synonym`
are each a published statement of synonymy, so each is a citation. Where a source publishes none — FIBO
largely does not, at 11% coverage — the reading abstains rather than borrowing WordNet, because a WordNet
synonym of a term's head noun is a statement about English and not about the taxonomy.

**Lemmatise both sides, and keep both keys.** `securities` lemmatises to `security`, which is a first-class
*computing* concept: collapsing them destroys evidence in exactly the case the taxonomy was added for. Index
the surface form and the lemma as separate keys onto one concept, weight the surface match higher, and
record which fired.

### What settles it, stated before it runs

A domain vocabulary must fire on a repository in its domain and **not** on one outside it. Held-out
in-domain: `OpenGamma/Strata` and `apache/fineract`, both Apache-2.0. Out of domain: `netty/netty`,
`junit-team/junit-framework`, `bcgit/bc-java`, and this tree — whose out-of-domain arm is already measured
above. Tuned on `paritytrading/parity` and `JavaMoney/moneta`, drawn disjointly.

Two nulls, because the existing one is the wrong shape: `PermutationNull` resamples files *within* a
repository and cannot answer a between-repository question. Pool the panel's files for the first; permute
the **term-to-concept** assignment within the taxonomy for the second, preserving branch and term-length
distributions, so the matcher hits the same spans in the same places and only the branch reported is chance.

**Abandon if:** in-domain mass does not clear the pooled null; multi-word matches in domain are not orders
of magnitude above the 3-in-63,275 baseline; discrimination survives only when single-word terms are
excluded **by hand**; or an audit of 50 sampled spans finds fewer than 40 genuine.

### Stage 1, specified to the file

Written here rather than under `docs/` on purpose: `docs/*.md` is read by the reading, and a specification
full of derivatives vocabulary would put `ForeignExchange` and `InterestRate` into the corpus and then find
them. The working notes are no longer parsed, so a specification costs the reading nothing.

**Nothing in `code-semantics-engine/src/main` changes in this stage.** The theme reading is untouched; if a
kill criterion fires, the extraction task, the resource and the diagnostic are deleted and no reading was
ever affected.

#### The bundled file

`lexicon/src/main/resources/fpml-schemes.tsv`, the shared columns, tab separated, sorted by `concept` —
`SkosTsv` already renders them, so this stage writes a header and a mapping and nothing else:

| Column | From | Example |
|---|---|---|
| `concept` | `CanonicalVersionUri` + `#` + code | `http://www.fpml.org/coding-scheme/asset-class-2-1#InterestRate` |
| `prefLabel` | the code exactly as published | `InterestRate` |
| `altLabel` | empty — genericode states no synonymy, and the reading abstains rather than borrowing WordNet | |
| `broader` | the parent path's concept where the code is colon-delimited, else the scheme's own concept | `…product-taxonomy-4-0#Commodity:Agricultural:Dairy:Option` |
| `kind` | `code` | `code` |
| `module` | `ShortName` from the scheme's `Identification` — the roll-up level the source itself names | `assetClassScheme` |
| `definition` | `Description` where the scheme states one, empty where it does not | |

Header carries `Source:` naming the archive URL and each scheme's own `Version`, `Licence:` naming the FpML
Public License 3.0, and **Exhibit A verbatim**. `VocabularyProvenanceTest` covers it the moment it lands.

#### Extraction — `lexicon-extraction`

| Class | Does one thing |
|---|---|
| `FpmlCodeList` | the archive on disk or fetched, its SHA-256 checked against a recorded constant |
| `ContentDigest` | SHA-256 over bytes, the sibling of `GitBlobId` for a source that is not a git blob |
| `GenericodeScheme` | one genericode document read to `Identification` (short name, version, canonical URI) plus its rows |
| `SchemeCode` | record: `code`, `source`, `description` |
| `FpmlConcepts` | codes to concept rows, deriving `broader` from the colon path |
| `FpmlSchemeTsv` | renders the TSV under the provenance header |
| `FpmlSchemeExtraction` | `main`, wired to `./gradlew :lexicon-extraction:extractFpmlSchemes` |

`GitBlobId` cannot pin this: the archive is not in git. The digest is ours rather than the publisher's, so
the header must say so — *"SHA-256 recorded at extraction; the publisher states no checksum"* — and each
scheme's own `Version` is the publisher's statement that actually matters.

#### Reading — `lexicon` and `code-semantics-engine`

| Class | Does one thing |
|---|---|
| `FpmlSchemes` (lexicon) | the bundled TSV as a term index: `conceptsOf(String term)`, `longestTerm()`, `broaderOf(String concept)` |
| `TermIndex` (engine, interface) | what a term index must answer, so a second source needs no new reading |
| `TermSpans` (engine) | the longest-match, non-overlapping cover of a phrase's ordered words |
| `TermSpan` (engine, record) | `from`, `to`, `words`, `concept`, `source` |
| `PhraseSpecificity` (engine) | an n-gram's surprisal off the bundled frequency list, the sibling of `WordSpecificity` |
| `DomainTermDiagnostic` (engine, test, `@Tag("diagnostic")`) | runs the panel and writes `domain-terms.md` |

`./gradlew domainRead`, modelled on `selfRead`, reading `-Dcs.panel.dir` — which `cs.java-conventions`
must forward beside `cs.clone.dir`, the only two properties the test convention passes to the forked JVM.

#### Tests that come first

- `GenericodeSchemeTest` — reads a scheme's identity and rows from a fixture; refuses a document stating no
  `Identification` rather than reading it as empty.
- `FpmlConceptsTest` — `Commodity:Agricultural:Dairy:Option:Cash` yields the parent
  `Commodity:Agricultural:Dairy:Option` as `broader`; a code with no colon takes the scheme as `broader`.
- `ContentDigestTest` — the digest of known bytes, against a value `shasum` also produces.
- `FpmlSchemeTsvTest` — sorted rows under a header carrying the licence and Exhibit A.
- `TermSpansTest` — longest wins and spans do not overlap; a prefix that is not itself a published term
  **abstains**; matching runs over the raw ordered words, not the offered lemmas.
- `PhraseSpecificityTest` — `name` weighs near nothing, `interest rate swap` near the ceiling, both bounded
  in `[0, 1]` by the frequency list's own length.
- `FpmlSchemesTest` — the bundled file answers `InterestRate`, and an unknown term yields nothing.

#### What stage 1 reports, and what would end it

`domainRead` writes, per repository in the panel: matched spans per thousand identifier occurrences, split
by term length; the schemes that matched; and the count of files where nothing matched. The out-of-domain
arm is already measured for FIBO — 1,789 one-word against 3 multi-word on this tree — and FpML's codes are
single tokens, so **the one-word rate is exactly what has to be shown to be discriminating here**. That is
the risk this stage exists to measure: FpML may be code-shaped and still be measuring the English words
*credit*, *equity* and *option*.

Abandon if in-domain matching does not clear the pooled permutation null, or if it clears only once
single-token codes are excluded by hand.

### Staging

1. **A term source and a diagnostic, with the reading untouched.** Landed for OLiA — `TermIndex`,
   `TermSpans`, `PhraseSpecificity` and `terms.md` under `selfRead` — and what remains of it is the arm that
   decides: a repository the vocabulary should say **nothing** about. That needs `./gradlew domainRead` behind
   `-Dcs.panel.dir`, which `cs.java-conventions` must forward beside `cs.clone.dir`. `extractFiboTerms` and
   `fibo-terms.tsv` are the same shape again for a domain this tree is outside of. If a kill criterion fires,
   two files are deleted and no reading was ever corrupted.
2. **The votes join the reading** — `MatchedTerms`, `TermCitations`, new `EvidenceSource` and `Weights`
   entries, and the FIBO module as the roll-up level the resource itself names.
3. **CSO and the branch confusion matrix**, which is also the first real attempt on `computing` versus
   `computer_science` — if CSO maps them, that mapping is CSO's statement rather than ours.
4. **Synonymy and abbreviations**, and the surface-versus-lemma comparison as an A/B on the held-out panel.
5. **STW**, only if the first three pass.

Note the roll-up here runs **opposite** to `StatedTopics`: there the resource published a closure and the
hierarchy subtracts what was derived; here the resource states one concept and the hierarchy rolls it up.
Same interface shape, opposite direction, and the javadoc has to say so.

---
