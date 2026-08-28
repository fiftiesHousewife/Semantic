# One page, with the evidence beneath it

The pages have the shape the export has just stopped having. [`ONE_ANSWER.md`](ONE_ANSWER.md) exists because `reading.json` published three unrelated blocks with nothing stating which of them answered; the pictures publish four unrelated views per repository with the same silence, and a reader opening `index.html` is given three links and no reason to prefer one. This plan gives the pages the shape of the answer: one page per reading that states what the repository is about and what bar that cleared, with every rung's evidence beneath it, and one page across readings that compares them.

## What is drawn today

Four page kinds and eight tasks, all consuming published JSON under `output/` and writing to `vocabulary-page/build/reports/vocabulary/`.

| Page | Drawn by | Holds |
|---|---|---|
| `index.html` | `PagesIndex` | every repository with pages on disk, three links each |
| `taxonomy-matches.html` | `TaxonomyMatchesPage` | every reading's term matches per vocabulary, as bars of shares |
| `<repository>/vocabulary.html` | `VocabularyPage` | the funnel of the ranking's rules, then a cloud of the meanings that survive |
| `<repository>/domain-venn.html` | `DomainVennPage` | the three leading WordNet domains as overlapping sets |
| `<repository>/term-trees.html` | `TermTreesPage` | each matched vocabulary's phrases at their place in the publisher's hierarchy |
| `<repository>/control-matches.html` | `TaxonomyMatchesPage` | the same bars for the out-of-domain controls |

Three further tasks — `discoursePass`, `corroboratedWeight`, `domainCarriers` — print and draw nothing.

## Four things wrong, each already stated somewhere in this project

**1. Nothing on any page says which view answers.** That is `ONE_ANSWER.md`'s opening sentence, applied to the pictures. A reader wanting to know what a repository is about has to open three pages and decide for themselves which one to believe.

**2. They are stale against schema 13.0 and cannot say so.** `taxonomies` now carries `bar`, and holds only the vocabularies whose phrase count beats what a deal of their own words reaches. `TermTreesPage`'s javadoc still states it draws "the taxonomies every run matches and the out-of-domain controls alike"; the export no longer carries the ones that failed. So the trees page draws fewer vocabularies than it used to and states no reason, no page draws a bar at all, and the two counts step 3 added — `setAside.vocabulariesBelowTheirChanceBar` and `setAside.termsWorkingJavaAlsoWrites` — reach no picture. On this repository that is the difference between drawing two vocabularies and drawing one.

**3. The word arms never took the shape the phrase view proved.** The backlog states it as its own row: *the phrase view lists every vocabulary and drills into an overlap; the word sources still draw one three-set venn each.* The summary-and-drill shape works and only one of four views uses it.

**4. Two navigation roots and an unlinked page.** `index.html` names the per-repository views, `taxonomy-matches.html` compares across readings and is reached from it, and `control-matches.html` is drawn by `evaluationPages` and linked from nowhere.

## The proposal: two pages and two tasks

### One page per reading — `reading.html`

Top of the page, in one line: **the answer, the publisher who stated it, and how many times its bar it made.** Beneath it, one section per rung of `ONE_ANSWER.md`'s cascade, each showing a figure and opening to the evidence that produced it. Nothing on the page is drawn that the reading does not carry, and each section names the JSON key it came from.

| Section | Figure it shows | What it opens to | From |
|---|---|---|---|
| the answer | the branch or subject, its publisher, times the bar | the rung that produced it, and the rungs beneath that did not answer | `summary.about`, `summary.aboutStatedBy` |
| its published terms | each vocabulary that beat its bar, `phrases` against `chanceExpectedBest` | the publisher's own hierarchy, matched concepts at their stated places — today's `term-trees` | `taxonomies[].bar`, `taxonomies[].concepts` |
| where it is placed | both schemes at both levels, divergence against what chance reaches | the topics carrying the distance, with the words and the quotations | `summary.placedIn` |
| the words it chose | the funnel of the ranking's rules, then the cloud — today's `vocabulary` page | the tiles, each opening its spellings and senses | `signals`, `setAside` |
| the domains those words state | the overlapping sets — today's `domain-venn` | each overlap's words | `signals`, drawn through `DomainOverlap` |
| what was set aside | every `setAside` count, named, including the two step 3 added | nothing; the rows are in `evidence.json` | `setAside` |

**A section whose figure is empty says so and stays.** A repository where no vocabulary beat its bar shows *no published vocabulary beat its bar* and the count of those that did not, rather than an absent section a reader cannot distinguish from one that was never drawn. That is the same rule the export already follows for `withheld`.

### One page across readings — `readings.html`

One row per repository, replacing both `index.html` and `taxonomy-matches.html`.

| Column | From |
|---|---|
| repository | `summary.repository` |
| what it is about | `summary.about` |
| the bar it cleared | `taxonomies[].bar.timesTheBar` for the answering vocabulary |
| where it is placed, both schemes | `summary.placedIn[].subject` |
| stands apart from chance | `summary.placedIn[].standsApartFromChance` |
| λ | `summary.shareOfWordsWithACitation` |
| the area its manifest states | `evaluation-set.tsv`, where the reading is an evaluation member |

The last column is the one no page has today and the one a reader most wants: it is the difference between a picture of the reading and a picture of whether the reading is right.

### Two tasks

```
./gradlew pages                              # this repository's reading, from output/json
./gradlew pages -Dcs.reading.dir=<folder>    # any published reading
./gradlew pages -Dcs.evaluation.dir=<clones> # every reading under output/, and the comparison
```

`vocabularyPage`, `domainVenn`, `termTrees`, `taxonomyMatches` and `evaluationPages` all become one command. `discoursePass`, `corroboratedWeight` and `domainCarriers` print rather than draw and belong with the other probes, not in a page module.

## What it does not change

- **The pages still read published JSON and no tree.** A picture and a published figure cannot disagree, and drawing costs no parse. That is the module's existing contract and this plan keeps it.
- **`output/` stays JSON.** `PublishedFormat` refuses any name that is not `.json`, and pages go on being written under `vocabulary-page/build/reports/`.
- **The drawing classes survive.** `VocabularyFunnel`, `DomainOverlap`, `TermTree` and `SignificantWords` compute figures and are what the sections above draw. What goes is the page-per-view split, the command per page, and the second navigation root.

## The order of work, and what settles each step

| | Step | Settled by |
|--:|---|---|
| 1 | `readings.html` — the comparison across readings, with the manifest's stated area beside each placement | it names every reading under `output/`, and a member whose placement is not its stated area is visible without opening anything |
| 2 | `reading.html` — the sections above, each drawing what its existing page draws today | every figure on the page appears in the reading it was drawn from; a reading with no qualifying vocabulary draws the empty statement rather than nothing |
| 3 | the bar and the two `setAside` counts reach the page | a vocabulary the export withheld is named as withheld, and no page draws one the export does not carry |
| 4 | one task, and the four page commands deleted | `./gradlew pages` writes both pages for one reading or for all, and `PagesIndex`, `TaxonomyMatchesCommand`, `TermTreesCommand`, `DomainVennCommand` and `VocabularyPageCommand` are gone |
| 5 | the three printing probes move out of `vocabulary-page` | the module holds pages and the classes that compute what they draw, and nothing that prints |

**Refuted by:** a single page that is harder to read than the four it replaces. The check is the one the phrase view already passed — a reader can name what the repository is about, and what that rests on, without opening a second page. If the sections cannot be collapsed to figures that fit one screen, the split was carrying its weight and this plan is wrong.

## Open questions

**1. Whether `reading.html` should draw the rungs that did not answer.** Showing them keeps the cascade a ranking rather than a gate, which is `ONE_ANSWER.md`'s own argument for keeping every rung's figures in the export. Hiding them is shorter. *Settled by:* drawing them collapsed, and seeing whether a reader opens them.

**2. Whether the evaluation manifest may reach a page at all.** It is a test fixture, off the published classpath, and its own header says so in capitals: *it is a test fixture and it never votes*. Drawing the stated area beside a placement is not a vote — nothing is scored by it — but it does put this project's own curated judgement on a picture. *Settled by:* a contract decision, not a measurement. The safe form draws it only where the page is generated from the evaluation set, and never for an arbitrary reading a consumer points the command at.

**3. What a consumer with no `output/` folder sees.** Every command today reads a published reading, so a fresh clone can draw nothing until a read has run. *Settled by:* the committed readings under `output/json` and `output/tika`, which are two, so the comparison page has two rows on a fresh clone and says so.
