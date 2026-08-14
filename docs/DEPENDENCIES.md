# Dependencies, and why each one

A decision record rather than a plan: what this library depends on, what it deliberately does not, and the
licence of each. It was the seventeenth section of the origin plan, which has been deleted now that the
topic plans under [`plans/`](plans) carry everything else it said. This part outlived it because a library
choice is a standing fact rather than a step to be completed.

All versions live in [`gradle/libs.versions.toml`](../gradle/libs.versions.toml); the catalog is the
authority and this page is the reasoning. A catalog entry fetches nothing until a module declares it, so
several of the libraries below are named and not yet consumed — adopted one at a time as the stage that
needs them lands.

Versions verified against `repo1.maven.org` on 2026-08-13. Where a fact is not verified it says so.

| Purpose | Library | Version | Licence | Note |
|---|---|---|---|---|
| Parsing (primary) | `io.github.bonede:tree-sitter` + per-grammar artefacts | core `0.26.6`; `tree-sitter-java 0.23.5`, `tree-sitter-python 0.25.0`, `tree-sitter-go 0.25.0`, `tree-sitter-typescript 0.23.2` | tree-sitter MIT | JNI. **The core/grammar version skew (0.26 vs 0.23) is the first thing to measure** — ABI compatibility across it is not something to assume |
| Parsing (alternative) | `io.github.tree-sitter:jtreesitter` | `0.26.1` | MIT | The tree-sitter organisation's own binding, on the FFM API. **Requires Java 22+**; this project's toolchain is 21, so adopting it is a toolchain decision, not just a dependency one |
| Java type resolution (optional) | `com.github.javaparser:javaparser-symbol-solver-core` | `3.28.2` | Apache 2.0 / LGPL-3 dual | Turns `REFERENCES` from name-matching into real resolution. **Optional by design** — a library that requires a resolvable classpath cannot analyse a repo it cannot build |
| Java type resolution (alternative) | `org.eclipse.jdt:org.eclipse.jdt.core` | `3.46.0` | EPL-2.0 | Better resolution, heavier and Eclipse-runtime-shaped API |
| Git | `org.eclipse.jgit:org.eclipse.jgit` | `7.7.1.202607240634-r` | Eclipse Distribution License (BSD-3) | `RevWalk`, `TreeWalk`, `RenameDetector`, `DiffFormatter`. Pure Java, no `git` binary |
| Store | `org.duckdb:duckdb_jdbc` | `1.5.5.1` | MIT | Matches this project's pinned version |
| Graph export | `org.apache.tinkerpop:tinkergraph-gremlin` | `3.8.1` (4.0.0 is at `beta.3` — not yet) | Apache 2.0 | Export target only |
| RDF export | `org.apache.jena:jena-arq` | `6.2.0` | Apache 2.0 | Export target only; RDF4J `6.0.0` (EDL) is the equivalent alternative |
| Lexicon | `net.sf.extjwnl:extjwnl` + `extjwnl-data-wn31` | `2.0.5` / `1.2` | extjwnl EPL/LGPL; WordNet 3.1 Princeton licence | Via this project's `lexicon` module |
| Caching | `com.github.ben-manes.caffeine:caffeine` | `3.2.4` | Apache 2.0 | Sense lookups are hot and repeat |
| Test | `org.junit.jupiter:junit-jupiter` `6.1.3`, `org.assertj:assertj-core` `3.27.3` | | EPL-2.0 / Apache 2.0 | AssertJ `4.0.0-M1` exists but is a milestone |

**Rejected, with the reason.** `srcML` — a native C++ binary with no Maven artefact, and GPL-licensed (verify
before any reconsideration); the packaging alone disqualifies it for an embedded library. `universal-ctags` —
a native binary whose tag output is line-granular and syntactically shallow; retained only as a possible
fallback for a language no tree-sitter grammar covers. GitHub GraphQL — requires authentication, which
requirement 5 places outside this library.

**Why tree-sitter over an AST library.** A repository is polyglot: this one holds 1,649 `.java`, 232
`.ts`/`.tsx`, 27 `.kts`, 10 `.sh` and 8 `.yml` tracked files. One parser interface across all of them, with
symbol extraction expressed declaratively as `.scm` queries per language, is the difference between a library
and a Java tool. Error tolerance matters independently: a PR's head commit does not always compile, and a
parser that refuses such a file cannot analyse the PRs that most need analysing.
