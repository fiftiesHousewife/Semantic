# Third-party notices

The library's own code is licensed under Apache-2.0; see `LICENSE`. Everything below is about data it did not
write, which that licence does not cover.

This library ships lexical data it did not write. Every bundled file states its own source and licence in a
leading comment block — a contract `VocabularyProvenanceTest` enforces over both resource directories, so a
file added without one fails the build. This page is a summary of those headers and not a substitute for
them: **the file's own header is the authority**, and where the two ever disagree the header is right and this
page is stale.

The library's own dependencies are declared in `gradle/libs.versions.toml` with their licences noted in
`docs/CODE_SEMANTICS_LIBRARY_PLAN.md` §17.

## Bundled data

| Resource | Rows | Source | Licence as the file states it |
|---|--:|---|---|
| `lexicon/src/main/resources/wikidata-names.tsv` | 408,732 | Wikidata items referenced as a person's given name (P735) or family name (P734), via the QLever SPARQL endpoint | CC0 1.0 |
| `lexicon/src/main/resources/wikidata-initialisms.tsv` | 189,977 | Wikidata short names and aliases, via the QLever SPARQL endpoint | CC0 1.0 |
| `lexicon/src/main/resources/wiktionary-topics.tsv` | 185,768 | Wiktionary, read from the kaikki.org wiktextract JSONL dump | **CC BY-SA 4.0 — share-alike, and it attaches to this file rather than to the code that reads it** |
| `lexicon/src/main/resources/wiktionary-abbreviations.tsv` | 45,633 | the same wiktextract dump | **CC BY-SA 4.0 — share-alike** |
| `lexicon/src/main/resources/wiktionary-topic-hierarchy.tsv` | 816 | wiktextract's own `topic_generalize_map`, read from its source at a pinned revision — the map that derived the broader labels in the topic vocabulary | MIT (wiktextract). The map is the tool's own source, not Wiktionary content, so the CC BY-SA terms above do not attach to it |
| `lexicon/src/main/resources/wordnet-domains.txt` | 92,617 | WordNet Domains 3.2, Fondazione Bruno Kessler, lifted to WordNet 3.0 by the `morungos/lifted-wordnet-domains` project | CC BY 3.0, attribution as the header states it |
| `lexicon/src/main/resources/sql-functions.tsv` | 506 | DuckDB's own `duckdb_functions()` catalogue, read from the embedded engine — no download | MIT (DuckDB) |
| `code-semantics-api/src/main/resources/common-english-words.txt` | 20,000 | three Leipzig Corpora Collection frequency files, normalised per-million before merging | CC BY 4.0 |

## WordNet, and a gap stated rather than papered over

WordNet 3.1 is **not** bundled here. It arrives on the classpath inside `net.sf.extjwnl:extjwnl-data-wn31`,
which `lexicon` declares as a runtime dependency and reads through
`Dictionary.getDefaultResourceInstance()` — nothing is extracted to disk.

Two licences therefore apply to a consumer of this library and **neither is stated in this repository**:
the Princeton WordNet licence covering the database, and extjwnl's own EPL/LGPL. That is a real gap, it was
inherited with the `lexicon` port, and it is recorded as an open question in `BACKLOG.md` rather than
answered here — because the honest answer is that it has not been verified yet, and a licence page that
guesses is worse than one that says so.
