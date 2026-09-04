# A readable name for every subject

The index answers *what is this repository about* with the subjects its publishers place the matched phrases under. For seven of the twelve readings that already reads as English — `public key cryptography`, `hash functions`, `concurrency control`. For the other five it reads as identifiers: `Session`, `SingleGeneralOrderHandling`, `QuantitativeValue`, `StartingDate`, `InflectionTypeFeature`. This plan is how the identifiers get a readable name without anyone writing one.

**The constraint that decides everything below.** A name this project invents is a curated observation of a corpus and is refused. Every name here comes from the publisher's own file, or from grammar — the identifier splitter's rules, which are permitted where a list of words is not.

## What the publishers actually state

Measured on the bundled extracts, 2026-08-31.

| | rows | carry documentation | the subject levels the index shows |
|---|--:|--:|---|
| FIX | 7,170 | 7,003 | `Session`, `SingleGeneralOrderHandling`, `QuotationNegotiation`, `Indication`, `SettlementInstruction` — **every one blank** |
| FpML | 1,405 | 1,181 | `Offset`, `Period`, `Product`, `StartingDate` carry documentation; `Scheme` and `NonEmptyScheme` are **not published rows at all** |
| FIBO | 1,833 | — | `QuantitativeValue`, `ExplicitDate`, `Identifier` |
| OLiA | 1,312 | — | `InflectionTypeFeature`, `Noun`, `Phrase`, `LayoutElement` |

Two facts fall out of that and they point in different directions.

**FIX documents its fields and not its categories.** `MsgSeqNum` states *"Integer message sequence number."* — the publisher's own English, already extracted. Of FIX's 39 categories and sections, **2 carry any documentation**: `AccountReporting` states *"Account Reporting"* and `PostTrade` states a paragraph. The extractor is not at fault — it reads `annotation/documentation` and those two prove the path works. FIX Orchestra simply states nothing for the rest, so nothing can be cited for `Session`.

**FpML documents its types and the index is naming things that are not types.** `Offset` and `Period` carry a sentence each. `Scheme` and `NonEmptyScheme` appear only as base-type names on other rows, are among the 235 unresolvable parents, and so reach no documentation.

## The four sources, in the order they should be asked

| | Source | Reaches | Costs |
|--:|---|---|---|
| 1 | **The identifier's own words**, split by grammar | every identifier in every vocabulary | nothing — `IdentifierWords` is in the tree |
| 2 | **The publisher's documentation**, already extracted | FIX fields, FpML types, CWE, BIAN | nothing — it is in the TSV and does not reach the page |
| 3 | **The documentation of the concepts beneath a subject** | any subject whose members are documented | a rule for choosing among them |
| 4 | **Re-extraction** of what the publisher states and the extract drops | FpML's unpublished base types | an extraction change and a re-run |

### 1 — split the identifier

`SingleGeneralOrderHandling` → *single general order handling*. `QuotationNegotiation` → *quotation negotiation*. `SettlementInstruction` → *settlement instruction*. `StartingDate` → *starting date*. `QuantitativeValue` → *quantitative value*. `InflectionTypeFeature` → *inflection type feature*.

Every one of the five readings' leading subjects becomes readable for the cost of running a splitter this repository already owns on a string it already has. It is grammar, so it needs no resource and states no vocabulary.

**Where it fails, and it fails honestly.** `MsgSeqNum` → *msg seq num*, because the publisher abbreviated. The abbreviation case is exactly the seam `CLAUDE.md` holds open at `CitedTokens.NONE`, and it is not this plan's to close — but step 2 covers it, because FIX documents that field.

**And the failure is measurable, so it can be ranked on.** An identifier whose split words are all ordinary English anglicises; one carrying shorthand does not, and the difference is a lookup against a resource already bundled rather than a judgement:

| Identifier | Split | Every word ordinary English? |
|---|---|---|
| `ExecutionReport` | execution report | yes |
| `QuoteRequest` | quote request | yes |
| `SingleGeneralOrderHandling` | single general order handling | yes |
| `SettlementInstruction` | settlement instruction | yes |
| `MsgSeqNum` | msg seq num | **no** — none of the three |
| `ClOrdID` | cl ord id | **no** |

So the ranking gains a third tier beneath the phrase/identifier split it already has: a publisher's own phrase first, then an identifier that anglicises, then one that does not. quickfixj currently leads with `Session` at 659 occurrences; under this rule it leads with `SingleGeneralOrderHandling` — *single general order handling*, holding `ExecutionReport` and `QuoteRequest` — which is what the repository is actually about. The frequency list that answers *is this ordinary English* is the one `OrdinaryEnglish` already cites; nothing new is bundled.

### 2 — prefer the publisher's own sentence

Where the publisher documents the concept, its first clause is a better name than any split of its identifier: FIX states *"Integer message sequence number"* for `MsgSeqNum`, and no splitter reaches that. This is already in `ExportedTaxonomy.Concept.definition` and already on the page beneath the fold; what is missing is that the **subject** line does not use it.

### 3 — describe a subject by what sits under it

`Session` states nothing. But the repository wrote `MsgSeqNum`, `BeginString` and `ResendRequest` under it, and FIX documents all three. A subject with no name of its own can be named by the concepts it holds — *session: message sequence number, begin string, resend request*.

**This is the one that needs a stated rule**, because choosing among the members is a judgement. The rule that follows the existing doctrine: take the members in the order the reading already ranks them — most-written first — and state the first that carries documentation. That is Katz backoff at the label, which `EvidenceKinds` already runs at the answer.

### 4 — extract what is dropped

FpML's `Scheme` and `NonEmptyScheme` are named as base types on 235 rows and published as rows on none, so nothing about them is reachable. The precedent is recorded: FIBO, FpML and FIX each threw away a parent their publisher states, and all three were extraction defects. This one should be measured the same way — read the FpML schema for what it states about those names, and if it states nothing, the identifier split is the answer and the seam closes.

## What is refused

- **Writing a label.** *Session* → "the FIX session layer" is this project stating what FIX means. No.
- **Mapping one publisher's subject onto another's.** CSO's `public key cryptography` and FIX's `Session` stay two entries.
- **An embedding, a model, or a lookup of what an identifier "probably means".** An embedding is admissible only as a candidate generator a citable reading confirms, and there is nothing here to confirm against.
- **Naming a subject after a word-domain leader.** The domain path is available for every repository and is wrong often enough to disqualify it: it places quickfixj under *telegraphy* and *gastronomy*, fix-trading-simulator under *hockey* and *basketball*, and strata under *Paleontology*.

## The order of work, and what settles each step

| | Step | Settled by |
|--:|---|---|
| 1a | the identifier split reaches every subject label | `SingleGeneralOrderHandling` reads as *single general order handling* on the index, and the split is `IdentifierWords`, not a second grammar |
| 1b | an identifier that anglicises outranks one that does not | quickfixj leads with *single general order handling*, holding `ExecutionReport` and `QuoteRequest`, rather than with `MsgSeqNum` at four times the occurrences |
| 2 | a documented concept's own sentence outranks the split of its identifier | `MsgSeqNum` reads as *integer message sequence number*, which no splitter reaches |
| 3 | a subject with no documentation takes the first documented concept beneath it | `Session` reads as something a reader understands, and the rule is the backoff the export already runs, not a new one |
| 4 | FpML's unpublished base types are measured | either they carry documentation the extract drops, or they do not and the split stands |

**Refuted by:** a split that reads worse than the identifier. `MsgSeqNum` → *msg seq num* is not an improvement, and if step 2 does not cover the abbreviated cases the index should show the identifier rather than a worse version of it. The check is on the five readings whose subjects are identifiers today — quickfixj, fix-trading-simulator, CodeSemantics, and the identifier tail of strata and fineract.

## What this does not fix

Three readings have **no English subject from any vocabulary that answered**, and no step here changes that: quickfixj, fix-trading-simulator and CodeSemantics matched only publishers that label with identifiers. Steps 1 to 3 make those identifiers readable. They do not make FIX state that `Session` is about a trading protocol's message layer, because FIX does not say so.
