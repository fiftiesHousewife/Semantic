# The extractors

**Landed 2026-09-04.** `lexicon-extraction` stated the same six steps once per source; it states them once. The queue behind it — the standards a repository implements, a second linguistics taxonomy, the classification run's Trove classifiers — no longer arrives as another copy.

## What every extraction does, in order

1. Pin a revision — a commit, never a branch.
2. Name the source at that revision, as a URL a reader can open.
3. Read it: fetch it, or read the local copy a `-Psource` property names.
4. **Verify the digest the publisher's own revision holds**, so a run without a network route still writes the permalink honestly and a fetch answered by something else fails.
5. Parse the source's own format into rows.
6. Write the TSV with its provenance header.

**Only step 5 differs**, and it is the only step that is about the source at all.

## What each step is now, and what it replaced

| Step | The one place | It replaced |
|---|---|---|
| 4, for a source that is one file | `PinnedSource`, which asks whether git would give the bytes the blob id that revision holds | already the one place before this change |
| 4, for a source that is a set of files | **`PinnedSet`**, over `ContentDigest` | seven hand-written acceptances with seven refusal messages — `CsoTopicsExtraction.pinned`, `FpmlTermsExtraction.asRecorded`, `FiboTermsExtraction.asRecorded`, `BianServiceDomainsExtraction.asRecorded`, `MediaTypeExtraction.pinned`, `OpenAlexTopicsExtraction.pinned`, and `XwndDomainsExtraction`, which reimplemented SHA-256 beside the class that already computes it |
| 6 | **`BundledResource`** | fifteen copies of `Files.createDirectories(output.toAbsolutePath().getParent())` followed by `Files.writeString` |
| the arguments | **`StatedSources`**, which reads a source an extraction downloads for itself as blank and refuses one it reads off disk by name | sixteen `main` methods, each restating its own argument order and its own usage string, called through a `String[]` that `BundledExtractions` had already built from typed values |
| the routing | **`BundledExtraction`**, a record of the name, what it reads and the reading | an enum of eighteen anonymous subclasses. What each extraction reads is now prose a caller sees: naming a taxonomy nothing bundles prints every name and what each takes |
| 5 | `Extraction`, one method | — |

`FiboTermsExtraction` is the one source pinned both ways, and it states both: `PinnedSource` for the manifest's own blob, `PinnedSet` for the ontologies the manifest names.

## What settled it

**One source runs end to end with no network route and no local copy — `sql-functions`, read out of the embedded query engine** — and `git diff` over the regenerated `lexicon/src/main/resources/sql-functions.tsv` reports nothing. That is the whole path through the new shape: `ExtractionCommand`, `BundledExtractions`, `StatedSources`, `SqlFunctionExtraction`, `BundledResource`.

The other seventeen sources need a checkout, an archive or a network route the agent shell does not have, so their byte-identity rests on the constants: every recorded digest and every source citation moved unchanged into its `PinnedSet`, and each is the value the committed TSV's own header carries.

**One refusal moved deliberately.** `XwndDomainsExtraction` wrote to a path it hardcoded relative to the working directory, ignoring the resource directory every other extraction was handed. It takes the path now.

## What is left

`BundledExtractions` is 133 lines against the 150 the repository holds to. `CsoConcepts` at 174 and `OwlClasses` at 169 are over it and this change did not touch them.
