# The extractors

**This is a prerequisite. No further vocabulary is bundled until it lands** — not the standards a repository implements, not a second linguistics taxonomy, not the classification run's Trove classifiers. Every one of them would otherwise arrive as another copy of the same six steps, and the copy is what the restructure removes.

`lexicon-extraction` holds 44 classes and every source is extracted by the same six steps, written out again each time. Six `*Extraction` classes state them; the next four sources the plans name would state them twice more each.

## What every extraction does, in order

1. Pin a revision — a commit, never a branch.
2. Name the source at that revision, as a URL a reader can open.
3. Read it: fetch it, or read the local copy a `-P` property names.
4. **Verify the blob id git would give what was read**, so a run without a network route still writes the permalink honestly and a fetch answered by something else fails.
5. Parse the source's own format into rows.
6. Write the TSV with its provenance header.

Steps 1–4 and 6 are identical in `OliaTermsExtraction`, `NistCsfExtraction`, `FiboTermsExtraction`, `SqlFunctionExtraction`, `ArxivTaxonomyExtraction`, `WiktionaryExtraction` and both Wikidata extractions. **Only step 5 differs**, and it is the only step that is about the source at all.

## The shape

- `PinnedSource` — revision, URI, expected blob id, and the property that overrides the fetch. One record, constructed per source.
- `Extraction` — one method: rows from the text that was read. Each source implements this and nothing else.
- One runner that composes the two, carries the `main`, and writes the header.

**What settles it:** every existing extraction is expressible with no behaviour change — the bundled TSVs are byte-identical after the move, which is a straight before-and-after over files already in the tree. **Abandon if** a source needs step 4 loosened; the blob-id check is what makes an extraction citable, and a source that cannot be pinned is a source that cannot be bundled.

**Why it is worth doing before the next source lands, not after.** Four more vocabularies are named across the plans — a second linguistics taxonomy, PyPI Trove classifiers, one or more industry ontologies — and each would otherwise arrive as another copy of the same 80 lines, with the provenance rules re-stated rather than inherited. It also pairs with the split `INDUSTRY_VOCABULARIES.md` states: the module is flat because the publisher had nowhere to live but the class name.
