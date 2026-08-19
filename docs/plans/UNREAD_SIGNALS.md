# What is written and not read

The reading consumes four things: the names a Java file declares, the javadoc and comments beside them, the external imports, and the markdown. Everything else a repository writes is invisible to it. This plan lists what that leaves on the table, measured on this tree and on Apache Tika `43cbdae6` (surveyed 2026-08-19), ranked by yield against cost, in the order the items are to be taken.

## 1. AsciiDoc documentation

**86 of Tika's 118 prose documents are `.adoc`, and the reading consumes only the 32 `.md`.** `MarkdownSource` and `DocumentationScope` both test for one suffix, so three quarters of the member's documentation is invisible for want of one more `SourceReader` in a signal class the reading already has. No new evidence type, no new weighting question.

| Claim | The measurement |
|---|---|
| The gap is real prose | Tika's prose share and λ before and after |
| It moves the reading | the documentation scope's divergence, and the placement, before and after |

**Landed.** `AsciiDocSource` reads `.adoc` beside `MarkdownSource`, and the documentation scope lists both suffixes. On Tika, against the reading committed at `fdc645f`: 86 files and 60,932 word occurrences arrive, the prose share moves 78% to 80%, λ holds at 0.971, and the placement holds at Computer Science / Computation and Language. The documentation scope's divergence falls 31.0% to 8.9% and its `linguistics` lean disappears — that lean was an artefact of which quarter of the documentation was markdown, so the reading before this item was wrong about the member's documentation and is no longer. A macro whose bracketed text wraps onto the next line loses its target rather than reading the path as prose; the six occurrences of `xref` Tika's own PDF sources write stay, because the rule is a parse rule and not a word list.

## 2. String literal values against published registries

`JavaSource` visits no literal. **Tika writes 764 distinct IANA media types as Java string constants** — the parse reads the constant's name and discards `"application/pdf"`. A literal equal to a published registry's own identifier is a citation, and a stronger one than any English word: the publisher defined the string. IANA's media type registry licence is the pre-work, read before anything is extracted — [the industry plan](INDUSTRY_VOCABULARIES.md) holds the licence table and [term matching](TERM_MATCHING.md) already names registries a repository *implements* as the stronger candidate class.

A literal is somebody's vocabulary quoted unless a registry claims it, so the rule is narrow: a literal that is byte-identical to a registry identifier is a concept sighting; every other literal contributes nothing. No English is read out of string literals under this item.

| Claim | The measurement |
|---|---|
| Literals reach concepts the names cannot | concepts reached on Tika from literal matches that no declared name reaches — document formats are unreachable today |
| The signal is not the names again | the overlap between literal-matched and name-matched concepts; **abandon if** the literals only restate the constants' own names |

## 3. Service registries as the second syntactic stream

**25 `META-INF/services` files on Tika** name every `Parser` and `Detector` implementation the tree provides, as fully qualified class names. Imports say what a repository *calls*; a services file says what it *provides* — the other half of [the syntactic stream](WHAT_IT_ACTUALLY_DOES.md), stated by the platform's own `ServiceLoader` contract, so reading it cites a specification rather than inferring an architecture.

| Claim | The measurement |
|---|---|
| Provision is its own evidence | the provided-interface vocabulary beside the import vocabulary, agreement or disagreement reported, never summed |

## 4. Module names and their stated descriptions

**Tika is 127 Maven modules** named `tika-parser-pdf-module`, `tika-detector-siegfried` — chosen names the reading never splits, because package words are read and directory rungs above `src` are not. The pom `<description>` elements beside them are publisher prose. A module name is one naming decision, counted once like a package.

| Claim | The measurement |
|---|---|
| Module names carry subject matter | the vocabulary and placement movement on Tika with module rungs read as one occurrence each |

## 5. The test corpus's own filenames

Tika's fixtures state the domain by extension without a byte being opened: 79 `.pdf`, 74 `.docx`, 54 `.doc`, 44 `.rtf`, 35 `.xlsx`. The fixture's *content* is somebody else's document and stays unread; the chosen path words and the extension — which maps to the same IANA registry as item 2 — are the signal.

## 6. Type hierarchy edges

**1,621 `extends`/`implements` clauses on Tika, 25 in this engine's main sources.** A declaration that a chosen name is-a another chosen name is the strongest structural relation in either tree, and the tally discards it. This is not a separate effort: it is the declaring-node provenance [the verb-phrase plan's step 1](WHAT_IT_ACTUALLY_DOES.md) already requires, and it lands there.

## 7. The small residue

- **Annotation values** — `@Tag("diagnostic")` ×14 here: the suite's own taxonomy of itself; the annotation type is quoted, the string inside is chosen.
- **Assertion and exception messages** — on this tree every `.as("...")` and thrown message is an author sentence stating a contract; prose-class evidence with a noise question (format strings, paths) that needs its own partition before it votes.
- **Build scripts** — 18 task descriptions in one module's build file; a `.gradle.kts` reader is [other-languages](OTHER_LANGUAGES.md) work.
- **Bundled resource headers and schema descriptions** — this repository's chosen words about its own data.

## What is deliberately not here

Call sites and receivers are population (2) of the verb-phrase work and stay excluded by decision. Git history is outside the reading's contract — a directory in, no clone, no network. Fixture file *contents* are other people's documents and are never read as this repository's words.
