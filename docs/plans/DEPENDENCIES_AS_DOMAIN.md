# What a repository depends on is a statement about its domain

## What a repository depends on is a statement about its domain

Every reading in this tree takes a word, asks a dictionary what it might mean, and then spends its effort
arguing with the answer. `cite` votes `law`, `topic` votes `music`, and four separate items below exist to
undo the damage. **A declared dependency is not a word.** This repository imports `net.sf.extjwnl`; that
coordinate resolves to a WordNet interface library and it says *lexical database* with no English in between
and nothing to disambiguate. A repository that depends on a lexical database is doing computational
linguistics, and no amount of sense disambiguation over identifiers will ever state that as cleanly.

**The parse already does the hard half and throws the answer away.** `ImportOrigins` sorts every import by
prefix walk into three: the platform's, this tree's own, and everybody else's. The third is currently used
only to be counted in the legibility denominator. It is the highest-signal, lowest-ambiguity evidence in the
corpus and nothing reads it as evidence of a subject.

### Why it is different in kind from everything else here

| | An identifier | A dependency |
|---|---|---|
| Chosen by | the author, from English | the author, from a global namespace of published artefacts |
| Ambiguity | high — the whole sense problem | **none.** `net.sf.extjwnl` denotes one artefact |
| Volume | 15,452 words in this tree | tens of coordinates |
| What it states | what a line is called | what the program is *made of* |

The volume asymmetry is the reason it must be a separate reading rather than more votes in the theme pool: a
dozen coordinates cannot outvote fifteen thousand words, and they should not have to. The right shape is a
sibling reading with its own report line, exactly as the subject placement is a sibling of the theme table.

### What could be cited for a coordinate, in order of how much work each is

1. **The coordinate's own segments, read as words.** `net.sf.extjwnl` yields `jwnl` — *Java WordNet Library* —
   which the splitter currently reads as `jwnlexception` in the unread tail, so this needs the acronym rule
   before it states anything. Cheapest, weakest, and available today.
2. **The group and artefact as published.** Maven Central states a coordinate's own `description` and
   `url`, and a POM is a file the publisher wrote about their own artefact. That is prose about the
   dependency, so it goes through the reading this repository's prose already goes through and comes back as
   a distribution over the same topics — the `SubjectAreas` hop a second time, with a POM in place of an
   arXiv description. **No network at build time**: a resolved dependency's POM is already on disk in the
   Gradle cache, and for a library handed a clone it is whatever the build file names.
3. **A published classification of the artefact itself.** Libraries.io, the Software Heritage archive and
   `github/linguist` all state something; each needs its licence read before anything is bundled, and the
   `sql-functions.tsv` rule applies — a curated statement of a published fact is citable, a curated
   observation of a corpus is not.

Start at 2. It reuses machinery that exists, it needs no new bundled resource, and the publisher's own
description of their own artefact is the strongest citation available for what an artefact is for.

### What settles it, stated before it runs

The known-answer test is free and it is this tree: a reading that cannot place a repository importing
`net.sf.extjwnl`, JavaParser and Jackson under language and parsing has failed the easiest case it will ever
be given. Then the panel, where the answer is known and was not chosen by us — `netty/netty` depends on
`io.netty`'s own transport stack and JDK networking; `bcgit/bc-java` depends on nothing and is the honest
hard case; `apache/lucene` depends on analysis and codec modules.

**Abandon if:** the POM descriptions place this tree no better than its identifiers already do, or if the
placement is carried by build-tooling dependencies every Java repository has — JUnit, AssertJ, Lombok — in
which case the reading is measuring *that this is a Java project* and the honest thing is to say so. Note
that a test dependency is a statement about how a repository is built and not about what it is for, and the
scopes are already separated, so that split is available without deciding anything by hand.

---
