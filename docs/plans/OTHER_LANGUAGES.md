# Other languages: SQL and TypeScript

The reading claims to answer what a repository is about. It answers it for Java, and every rule that makes it work is a rule about Java's grammar. A repository whose subject matter is in its schema and its front end is read today as whatever its Java says, which for a great many repositories is the smaller half.

## What is Java's, and what is not

| Java's | Language-neutral |
|---|---|
| `JavaSource` — the parse, and every `NameForm` position it fills | `NameForm` itself: declaration against use, name against prose |
| `PlatformNames`, `PlatformVocabulary`, `PlatformPackages` — asked of `ModuleFinder.ofSystem()` | `ReferenceVocabulary` — a body of words somebody else wrote |
| `TypeInitials` — a name that is the initials of its own declared type | The rule it states: a name standing for a type is a use |
| `ImportOrigins` — platform, own, third party | `WordSegmenter`, `PieceCost`, `CollocatedWords`, `ContentWords` |
| `JavadocProse` — Javadoc's own model of itself | `TopicDistribution`, `JensenShannon`, `PermutationNull`, `TermSpans` |

**The move is one package per language, with the shared reading depending on none of them.** Today `engine.parse` holds Java's grammar and the reading's own vocabulary of positions in one place, so a second language cannot be added without editing the first. `engine.parse.java`, `engine.parse.sql`, `engine.parse.typescript`, each supplying a `SourceReader`, with `NameForm` and `NameOccurrence` staying where they are.

## The two candidates, and what each costs

| | What a declaration is | What the platform reference is | Parser |
|---|---|---|---|
| **SQL** | table, column, view, index, constraint, procedure, parameter | the standard's own function and keyword tables — `sql-functions.tsv` is already bundled and already carries its provenance | a dialect-tolerant parser, or the schema-identifier grammar this library was ported from, which read exactly this |
| **TypeScript** | interface, type alias, class, method, property, parameter, local | the DOM and standard-library declarations `typescript`'s own `lib.*.d.ts` states, which is the same delegation `ModuleFinder.ofSystem()` is | the TypeScript compiler's own API, or a tolerant parser over declarations only |

SQL is the cheaper of the two and the more valuable: a schema is the shortest statement of a domain's vocabulary anyone writes, the identifiers carry no framework surface, and the reference already exists in the tree.

## The defect this exposed in the Java reading

**`PlatformVocabulary` asks the JVM that is running the reading, not the platform the read repository builds against.** A repository targeting Java 8 is read against Java 21's API, and every method name added since is counted as vocabulary that repository had available. It is the same class of error as reading a moving target: the reference has to be pinned to what the tree in hand states.

- The clone states it: `maven.compiler.release`, a Gradle toolchain, `.java-version`, or a module descriptor.
- `ModuleFinder.of(<other JDK>/jmods)` reads another installation without running it, so the delegation survives — nothing is bundled and nothing is listed.
- **What settles it:** the share of a member's declared words the reference refuses, read against its own stated release and against the running JVM. If the two agree to within a point the defect is cosmetic and is recorded as such; if they do not, every panel figure taken against the wrong release is restated.
