# Extending the taxonomies

Adding a vocabulary or a scheme touches ten files and two hand-written enumerations. This states what that costs, what each of the three ways out costs, and the one measurement that settles the change.

## What it costs today

Counted on the change that bundled Wikipedia's summaries of CSO's linked topics, 2026-08-29:

| | |
|---|---|
| Extraction | `CsoAbstractsExtraction`, `CsoAbstractsTsv` |
| Registration | a `BundledExtractions` entry |
| The resource | `cso-abstracts.tsv`, with its provenance header |
| The reader | `CsoAbstracts` |
| Where it is read | `CsoSubjects` |
| Notices | a `NOTICE.md` row, a README section |
| Tests | two |

A *matched vocabulary* costs more: an entry in `MatchedTaxonomies` or `ControlTaxonomies` stating its index, its one-line description and — since 2026-08-29 — where its publisher publishes it. A *subject scheme* costs a `PlacedField` factory and a line in `ExportedReading.placedIn`.

**Three of those statements are already in the file.** The header states the source and the licence; the enum states the name, the publisher and the description. Nothing checks that the two agree, and nothing could.

## The constraint that decides the design

`TermOrderNull` passes `judged.size()` as the field a vocabulary's permutation bar is read at, and `ChanceExpectedBest` sets the bar at the `1/(n+1)` quantile of that field. **Adding a vocabulary therefore moves every other vocabulary's published bar**, on every reading, whether or not the new one matches anything.

That is not an argument against discovery. It is an argument that **the set discovered has to be published**, so a bar that moved because the set changed is attributable rather than mysterious. `changes.json` compares figure by figure and would report seven moved bars with no cause stated anywhere.

The second constraint is already recorded: `BundledVocabulary.files()` does not recurse, because a resource moved into a subdirectory would silently empty the list both provenance tests walk. Any discovery mechanism inherits that hazard and must fail on a set smaller than it has ever seen rather than on an empty one.

## The three ways, and what each is for

| | What it solves | What it does not |
|---|---|---|
| **A skill** | Repeatability. [`adding-a-taxonomy`](../../.claude/skills/adding-a-taxonomy/SKILL.md) already states the invariants and the eight files | Nothing about the cost. A skill documents ten files; it does not make them nine |
| **A plugin** | A *consumer's* own vocabulary, in their own jar, without a fork. `ServiceLoader<TermIndex>` is Java's own answer and needs no scan, no build change and no module descriptor — a `META-INF/services` entry on the classpath | Nothing about the bundled set, which is where the ten files are. `InjectedTaxonomy.named` already takes one file by path |
| **Discovery** | The bundled set. A vocabulary states its own name, publisher and kind in the header it already carries, and the enumerations stop existing | Nothing on its own — it is only admissible with the field published beside it |

## What to build, in order

1. **Three more keyed lines in the provenance header** — `# Name:`, `# Publisher:`, `# Kind: terms \| subjects` — enforced by `VocabularyProvenanceTest` exactly as `# Source:` and `# Licence:` already are. The header becomes the whole statement of what a resource is, which is where the doctrine already puts source and licence.
2. **`BundledTaxonomies` reads those headers** and replaces `MatchedTaxonomies` and `ControlTaxonomies`. The matched/control split goes with them: both enums' own javadoc says which is which depends on the repository under reading rather than on the vocabulary, and `ControlTaxonomies`' javadoc calling them "of a field the read repositories are not in" was already true only of this repository.
3. **The export states the field's membership**, not only its size. `taxonomies[].bar.field` is 7; beside it belongs the seven names, so a moved bar can be read against a changed set.
4. **`ServiceLoader<TermIndex>` for a consumer's own**, entering the same field and published in the same list as the bundled ones — a vocabulary somebody else wrote is judged by the same bar or it is not evidence.

## The criterion

A refactor that changes no reading has a byte-equality test, and this one does: **run the eleven evaluation members with the seven enumerated vocabularies and with the seven discovered from their headers, and require every published figure to be identical.** Anything that moves is a disagreement between what a file states about itself and what the enumeration stated about it, which is the defect this change exists to remove.

Step 3 moves figures by adding a field, so it is a schema change and takes its own reading.
