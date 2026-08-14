# The limits of the reading, and the open questions

## The reachability contract

**The resource half has landed.** `BundledResourceReachabilityTest` asserts that every entry this project
publishes is named in the constant pool of a class it publishes beside it, over the artefacts the build
states as `cs.published.artefacts` rather than over the test JVM's own classpath — a test that scans itself
finds every name it mentions, including the one it mentions to prove it can say no. Dropping an unread TSV
into `lexicon/src/main/resources` fails the build; removing it restores it.

**The class half has not.** The contract also asserts that the class naming a resource is itself named by
something else — the floor on being called, since a class nothing else names is dead by construction. That is
a reference graph over the constant pools rather than a substring search in them, and it is the half that
would have caught the source project's real failure rather than its symptom.

Bytecode rather than source in both halves, because the two disagree in precisely the case that matters: a
class named only in a javadoc link reads as referenced and compiles to nothing, so prose alone makes a dead
class look used to a reader and to a grep alike.

**Why it earns its place:** bundled data nothing loads is not inert. It ships, so it carries its licence; it
is maintained, so it costs; and it is cited, so it lends its authority to behaviour it never touched. All
three were true at once in the source project — 24,889 surnames behind a loader with no callers, while two
unrelated classes explained their behaviour by "the surname list", a file no execution had ever read.

## What the self test cannot yet say

Each of these is a limit of the reading rather than a bug in it, and each is answered by a slice above rather
than by tuning this one.

- **A parse is not a resolution.** A declaration is known by its position in the syntax, so a call to a method
  this repository declared is indistinguishable from a call to somebody else's and neither is read. The plan
  counts a name once per occurrence, which this cannot yet do honestly: it would need to attribute a call to
  the declaration it reaches, and that is `javaparser-symbol-solver`, optional by design.
- **It reads a working tree, not a revision.** Nothing is pinned by a commit SHA, so no permalink is rendered
  and no vote is cast — `ConceptVote` could not be constructed without an anchor, which is the type system
  doing its job. Stages 1–3 are what change this.
- **It asks WordNet for noun and verb lemmas only**, which is the coverage the `Lexicon` contract exposes. An
  adjective or adverb the dictionary knows and neither part of speech carries reads as uncited, so the WordNet
  column understates its own resource — the direction an unverified figure should err in.
- **It drops prose.** Comments carry words the pipeline will read as prose evidence in its own right, and
  counting them in a figure about what the code is written in would flatter it. A prose legibility figure
  reported *beside* the code one is the honest form, and needs the prose reading first.
- **λ over one scope is a weak reading**, exactly as §16 of the plan says of intensity. It is reported because
  a denominator must be, not because a single-scope number is the interesting one. The divergence against a
  stated reference is.

---

## Open questions, each with the measurement that settles it

- **Does the tree-sitter core/grammar version skew hold?** Parse a known file with core 0.26.6 and
  `tree-sitter-java` 0.23.5 and compare the symbol set against a hand-checked expectation.
- **Is a larger frequency prior worth it?** Run the segmenter over a fixed set of a thousand unsplit
  lowercase identifiers with the Leipzig list and with each alternative, and compare accuracy. Pay for the
  larger resource only if the difference is real.
- **Does `duckpgq` earn a place?** It is real but lightly exercised (6,957 downloads in one week). Adopt only
  as optional sugar over a schema already correct without it.
- **What is WordNet's licence position in this repository?** Neither the Princeton licence nor extjwnl's
  EPL/LGPL is stated in-tree. That is a real gap inherited with the port.
