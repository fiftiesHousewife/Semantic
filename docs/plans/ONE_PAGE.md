# One page, with the evidence beneath it

The pages have the shape the export has just stopped having. [`ONE_ANSWER.md`](ONE_ANSWER.md) exists because `reading.json` published three unrelated blocks with nothing stating which of them answered; the pictures publish four unrelated views per repository with the same silence, and a reader opening `index.html` is given three links and no reason to prefer one. This plan gives the pages the shape of the answer: one page per reading that states what the repository is about and what bar that cleared, with every normalisation's evidence beneath it, and one page across readings that compares them.

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

**3. The word paths never took the shape the phrase view proved.** The backlog states it as its own row: *the phrase view lists every vocabulary and drills into an overlap; the word sources still draw one three-set venn each.* The summary-and-drill shape works and only one of four views uses it.

**4. Two navigation roots and an unlinked page.** `index.html` names the per-repository views, `taxonomy-matches.html` compares across readings and is reached from it, and `control-matches.html` is drawn by `evaluationPages` and linked from nowhere.

## The proposal: two pages and two tasks

### One page per reading — `reading.html`

Top of the page, in one line: **the answer, the publisher who stated it, and how many times its bar it made.** Beneath it, one section per normalisation of `ONE_ANSWER.md`'s cascade, each showing a figure and opening to the evidence that produced it. Nothing on the page is drawn that the reading does not carry, and each section names the JSON key it came from.

| Section | Figure it shows | What it opens to | From |
|---|---|---|---|
| the answer | the branch or subject, its publisher, times the bar | the normalisation that produced it, and the normalisations beneath that did not answer | `summary.about`, `summary.aboutStatedBy` |
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

**1. Whether `reading.html` should draw the normalisations that did not answer.** Showing them keeps the cascade a ranking rather than a gate, which is `ONE_ANSWER.md`'s own argument for keeping every normalisation's figures in the export. Hiding them is shorter. *Settled by:* drawing them collapsed, and seeing whether a reader opens them.

**2. Whether the evaluation manifest may reach a page at all.** It is a test fixture, off the published classpath, and its own header says so in capitals: *it is a test fixture and it never votes*. Drawing the stated area beside a placement is not a vote — nothing is scored by it — but it does put this project's own curated judgement on a picture. *Settled by:* a contract decision, not a measurement. The safe form draws it only where the page is generated from the evaluation set, and never for an arbitrary reading a consumer points the command at.

**3. What a consumer with no `output/` folder sees.** Every command today reads a published reading, so a fresh clone can draw nothing until a read has run. *Settled by:* the committed readings under `output/json` and `output/tika`, which are two, so the comparison page has two rows on a fresh clone and says so.


---

# Step 1 shipped a table; the readings page should be a figure

`readings.html` landed as a nine-column grid. One column carries a paragraph and eight carry four characters, the same concept prints twice on 12 of 32 rows, and none of the nine mechanisms that make the overlap figure readable is in it. This section is the review of the page as generated on 2026-08-31, and the plan that replaces it. Steps 2–5 above stand.

Regenerate before reading any figure below — the committed page was drawn without the manifest:

```
./gradlew readings -Dcs.reading.manifest=reading-export/src/test/resources/evaluation-set.tsv
```

## Part 1 — the review

| | Finding | Measured |
|--:|---|---|
| A | `top of its branch` and `placed under` hold the same label | 12 of 32 rows |
| B | A subject scheme's answer shows no strength at all | 5 of 5 maven rows read `—` under `cleared its bar by`, while `qualifiedBy` carries the figure |
| C | A scheme is named twice with nothing saying which level | `arXiv` twice, `OpenAlex` twice, in one reading |
| D | One column carries the table and eight carry nothing | `result` averages 874 characters; the other eight average 4 to 12 |
| E | The `result` cell holds a definition *and* a disclosure of every branch | 27 of 32 rows carry one, and opening it reflows every column |
| F | The stated-area column was blank on the committed page | the run named no manifest; with one it reads 5 reached, 6 missed, 1 none |
| G | `readings.html` is reachable from nothing and links back to nothing | `index.html` names `taxonomy-matches.html` and 36 per-repository pages, never `readings.html` |
| H | `control-matches.html` is dead build output, not an unlinked page | no code has written it since `e1111b4`; the ten files on disk are stale artefacts of a deleted command |
| I | A quarter of `readings.css` styles classes the page never emits | `.unbarred`, `td.vocabularies`, `td.phrases`, `.terms`, `.term`, `tr.kinds` — 35 of 136 lines |
| J | The same seven-token palette is copied into all five stylesheets, light and dark | `--paper`, `--raised`, `--ink`, `--ink-soft`, `--ink-faint`, `--rule`, `--count`; the publisher colours are in two of them |

### A — why the two columns repeat

Both columns are ends of one path. `placedUnder` is the first `broader` the publisher states; `atTheTopOfItsBranch` is the first ancestor above the concept that is not a level an outright majority of the vocabulary sits beneath. Where the publisher states exactly one ancestor, the two ends are the same label and the page prints it twice.

That is the common case in the two vocabularies with the flattest hierarchies:

| | rows | rows whose whole stated ancestry is one level | why |
|---|--:|--:|---|
| FIX | 7,170 | 5,434 | `Common` holds 68% and is stepped over, leaving the concept and its section |
| FpML | 1,405 | 616 | 616 types declare no base type at all, and FpML has no majority level to step over |
| FIBO | 1,833 | 46 blank, 228 naming a parent FIBO does not publish | a single unresolvable parent ends the walk, so both ends are that parent |

The same shallowness hides the middle of a deep path. Strata's FIBO answer states `Aspect → Value → QuantitativeValue → PresentValue`; the page draws `Aspect` and `QuantitativeValue` and drops `Value` between them.

### B and C — a scheme answers with a path too

`EvidenceKinds` flattens one `ExportedPlacement` into two `ExportedAnswer`s, one per level, so a scheme's archive and its category become sibling rows carrying the same source name with nothing distinguishing them. Both then read `—` under `cleared its bar by`, because that column asks `ReadingRow.barOf`, which searches only the vocabularies. The strength is not missing — `qualifiedBy` already says *0.053 bits nearer than chance reached* — the page discards it. A reader cannot rank maven's five answers, and ranking them is the column's only job.

### F is not a page defect

`./gradlew readings` without `-Dcs.reading.manifest` draws a column of 12 dashes, and the task's own comment states the flag. With it the column is live: aeron, besu, maven, santuario and tika reach their stated area; all six Finance members miss it, because OpenAlex places them under Artificial Intelligence and Management Information Systems rather than under Finance. That is a fact about the placement, not a rendering fault.

## Part 2 — what the overlap figure does that the table does not

The judgement that the venn reads better is worth taking apart, because what makes it better is nine specific mechanisms, all of them already built in `domain-venn.js` and `taxonomy-matches.js`, and none of them in `readings.html`.

| | The mechanism | Where it is built |
|--:|---|---|
| 1 | **A picture in the fold.** The heading, the lede and the figure share one viewport height, so the whole answer is on screen before anything scrolls | `.fold` in `domain-venn.css` |
| 2 | **Size carries a quantity.** A circle's area is its domain's share of the weight; a word's type size is its own weight, log-scaled between 0.95rem and 2.1rem | `sized()`, `radii` |
| 3 | **A live readout, not a tooltip.** One sentence under the figure changes on hover *and* on focus, and it carries the arithmetic: *"holds 34% of the weight that reaches any domain — 0.0412 bits — and the circle's area is in proportion to it"* | `.readout` |
| 4 | **Summary first, then drill.** The picker's summary lists every vocabulary with a bar and a description; a name opens that vocabulary's own figure | `renderSummary()` |
| 5 | **Clicking a figure scrolls to its evidence.** A region's count opens that region's word list further down the same page | `sectionId()`, `scrollIntoView` |
| 6 | **The abstention is stated in a foot line.** Words in domains outside the picture, words with no labelled sense, and the share of weight contributing nothing | `drawFoot()` |
| 7 | **One colour per set, reused in the chips.** The figure's `set-0` and the section heading's chip are the same class | `.chip.set-0` |
| 8 | **Deep links both ways.** `#s-<source>` opens a source, `#w-<word>` scrolls to and focuses one word | `linkedSource`, `byWord` |
| 9 | **A back line naming where the reader is.** *"← every vocabulary · FIX's matched phrases, drawn over the areas where its matches part ways · tree"* | `drawBack()` |

`readings.html` has none of the nine. It also has the defect the memory of the seven corrections already named: *the venn showed the whole set of matches and their parents; the readings page collapsed it to the single most-written concept.* The `<details>` disclosure added afterwards puts the branches back, but inside a table cell, where opening one reflows the grid.

**So the fix is not a better table.** It is the readings page rebuilt in the idiom the other pages already use.

## Part 3 — the proposal

### 3.1 The figure: every reading, placed by how far past chance it stands

One row per repository. One mark per source that answered it, filled with that publisher's colour from the palette `taxonomy-matches.css` already defines. The horizontal position is **how far past its own chance bar the source stands**, on a log scale with a labelled rule at 1×. The mark's area is the evidence behind it — phrases matched.

```
                    the bar
                       │
  quickfixj    ────────┤●FpML  ●FIBO                              ⬤ FIX 52 × 10.4
  strata       ────────┤ ⬤CSO      ⬤FpML ⬤FIBO   ●BIAN
  fineract     ────────┤ ●CSO  ⬤FpML  ⬤FIBO
  santuario    ────────┤●CSO ●FIX
  ...
  ─────────────────────┴──────────────────────────────────────────────────
                      1×        2×        4×                    10×

  answered by a subject scheme, in bits nearer than chance reached
  maven        ────────┤ ●CSO 0.006   ●OpenAlex 0.046   ●arXiv 0.053
```

This draws the sharpest of Pippa's seven corrections without a number being read: *"showing FIX as well at the same level of detail based on a single phrase match is just muddying the waters."* Santuario's two marks both sit on the rule. Quickfixj's FIX sits alone at the right. The reader sees which readings rest on strong evidence and which are marginal, at a glance, which is the one thing the table cannot do.

**The two scales do not merge, and the figure says so.** A vocabulary's strength is a multiple of a permutation bar; a scheme's is a distance in bits. They are different quantities and putting them on one axis would be inventing a bound. The scheme-answered readings therefore draw in their own band below the axis with their own scale — which also draws `ONE_ANSWER.md`'s own rule, that a reading answered by a scheme is one whose vocabularies said nothing.

**The stated area sits at the row's left edge** as a reached or missed mark against the repository name, in the `--reached` and `--missed` colours `readings.css` already defines, rather than as a column of ticks four rows from the name it belongs to.

**Rejected: a venn of vocabularies over repositories.** Seven vocabularies, and `domain-venn.js` draws at most three sets. Set membership is also the wrong question — every vocabulary matches nearly every repository at *some* strength, so the sets would nest rather than overlap and the picture would say nothing.

### 3.2 The readout

One sentence beneath the figure, changing on hover and on focus, in the form `domain-venn.js` already uses — the arithmetic, not a label:

> quickfixj — FIX states 52 phrases here, against the 5 the best of a field of seven reaches by dealing FIX's own words at random. FIX places `MsgSeqNum` under Session. *Integer message sequence number.*

### 3.3 The drill: one section per reading, in the summary-row shape

Beneath the figure, one `section` per repository — the shape `renderSummary()` already draws, not a table row.

| Part | Holds | From |
|---|---|---|
| heading | the repository, linked to its words, domains and trees pages | `summary.repository` |
| the answer line | the publisher, the concept, and the publisher's **whole stated path** | `answers[]`, finding A |
| the definition | the concept's first sentence, the whole of it on the element | `answers[].result` |
| a bar per answering source | width by times-its-bar, coloured by publisher | `taxonomies[].bar` |
| the branches | every branch the publisher states for the phrases this repository wrote, each opening its concepts — the depth the venn had | `ReadingRow.branchesOf` |
| the foot | the citable share, the stated area and its verdict, and the vocabularies that did **not** clear their bar | `shareOfWordsWithACitation`, `setAside.vocabulariesBelowTheirChanceBar` |

A mark in the figure scrolls to its section. A section's publisher name opens that vocabulary's tree at its anchor, which `term-trees.html#FIX` already supports.

### 3.4 The path, drawn once

Finding A's fix, and it lives in the answer line and the readout rather than in two columns:

| Today | Proposed |
|---|---|
| `Session` · `Session` | `Session` |
| `Aspect` · `QuantitativeValue` | `Aspect › Value › QuantitativeValue` |
| `PostTrade` · `SettlementInstruction` | `PostTrade › SettlementInstruction` |
| `—` · `—` (a scheme) | `Electrical Engineering and Systems Science` |

It repeats nothing, it shows the middle levels the two columns drop, and where the publisher states nothing above the concept it reads `—`, which is what FpML's 616 rootless types deserve. It answers the question that put the second column there — *"is QuantitativeValue really a top level domain in fibo?"* — by drawing the depth rather than asserting two ends of it.

**Where a path is too long to draw**, elide the middle — `computer science › … › splines`, the whole of it on the element — rather than going back to two columns. CSO states paths seven levels deep.

### 3.5 The view picker

Two views, in the `.sources` button idiom:

- **by repository** — the figure above.
- **by publisher** — the same marks transposed: one row per vocabulary, one mark per repository it answered. This is what `taxonomy-matches.html` draws today as stacked bars, and it answers the question `EXTENDING_THE_TAXONOMIES.md` needs — which bundled vocabularies earn their place, and which answer nothing anywhere. On the current readings BIAN answers twice and CWE once.

`taxonomy-matches.html` becomes that view and stops being a page, which closes finding G's second navigation root.

## Part 4 — what the export must change

Three of the findings are defects in `reading.json`, not in the drawing. The page cannot fix them.

| | Change | Why it is the export's and not the page's |
|--:|---|---|
| 1 | `ExportedAnswer.placedUnder` and `atTheTopOfItsBranch` become one `statedPath`, a list root-first with the majority level stepped over | The publisher states a path. Two ends is this library's summary of it, and a summary that repeats itself on 38% of rows is the wrong summary. `StatedAncestry.of` already computes the whole walk and throws it away |
| 2 | `ExportedAnswer` gains `timesItsBar` for a taxonomy and `bitsPastChance` for a scheme, each **absent** where the source type cannot state it | A source that cannot speak in a unit abstains rather than voting zero. The two are different quantities and the export refusing to merge them is why the figure has two scales. `qualifiedBy` keeps the prose |
| 3 | One `ExportedAnswer` per scheme placement, not one per level: `statedPath` takes the archive, `result` the category, and where only the archive cleared, the path is the archive alone | The archive is the category's stated parent. Two rows carrying the same source name is the export answering by omission which level it means — the defect `ONE_ANSWER.md` exists for |

`schemaVersion` moves once for all three. `reading-export.schema.json` and its validator move with it, and `./gradlew read` reruns.

## Part 5 — what is deleted, and what is shared

- **`readings.css`'s six dead rules go** (finding I).
- **A shared stylesheet holds the palette** (finding J). Seven tokens copied five times, light and dark, and the publisher colours copied twice. One `page.css` carried into every page, each page's own file holding only what is its own.
- **`PagesIndex` and `index.html` go**, as step 4 above already plans. The readings page is the root, every page's `nav` links back to it, and each reading's own section carries the words, domains and trees links `index.html` held (finding G). Finding H needs no link: nothing writes `control-matches.html`, so the ten on disk go when the build directory is cleaned.
- **`TermTree` is reused, not reimplemented.** The branch drill in 3.3 is one vocabulary's tree, which `TermTree.of` already builds.

## Part 6 — the order of work, and what settles each step

| | Step | Settled by |
|--:|---|---|
| 1a | the export's three changes, and the schema bump | `reading.json` carries a path and a figure per answer; no reading holds two answers naming one scheme; `./gradlew read` is green and the committed readings are regenerated |
| 1b | the shared stylesheet, and the dead rules deleted | every emitted class has a rule and every rule a class, and the palette is defined once |
| 1c | the figure and the readout | a reader can name which readings rest on marginal evidence without reading a number, and santuario's two marks both sit on the rule |
| 1d | the drill sections, replacing the table | every branch the publisher states is reachable, and opening one moves nothing sideways |
| 1e | the by-publisher view, and `PagesIndex` deleted | one page compares readings, and every page links back to it |
| 1f | the manifest reaches the aggregate task | the stated-area verdict is drawn for the evaluation set and stays absent for a consumer's own tree |

Steps 2–5 of this plan follow, unchanged: `reading.html` per reading, the bar and the two `setAside` counts, one task, the probes moved out.

**Refuted by:** a figure a reader cannot read the answer off. The check is the one the phrase view passed — name what a repository is about, and what that rests on, without opening a second page. If the marks cannot be told apart at 12 rows and 32 marks, the figure is wrong and the answer belongs in the section headings alone, with the figure reduced to one bar per reading.

## Part 7 — open questions

**1. Whether the log axis needs a floor.** A source that cleared its bar by 1.05× and one that cleared by 1.1× are both marginal and would sit on top of each other. *Settled by:* drawing it. If the left of the axis is a pile, band the marginal ones rather than spreading them — the distinction between 1.05× and 1.1× is not one the permutation null supports.

**2. Whether a mark's area should be phrases or occurrences.** Phrases is the count the bar is computed over, so it is the honest one. Occurrences is what a reader means by "how much". *Settled by:* the measure picker `taxonomy-matches.js` already offers, and drawing both.

**3. What the figure does with a reading where nothing cleared.** `ExportedAnswer.NONE` exists and no current reading is one. *Settled by:* a row with no marks and the foot line saying so, which is the rule the export already follows for `withheld`.

**4. Whether the figure draws the vocabularies that failed their bar.** `setAside.vocabulariesBelowTheirChanceBar` is counted in every reading and reaches no page. A greyed mark left of the rule would say that FIX was tried on tika and did not clear, which is the principle `TermTreesPage` already holds — draw what the repository did not write as well as what it did. *Settled by:* the count. If most readings set aside five of seven vocabularies, the left of the rule is solid grey and the count belongs in the foot line instead.

**5. What the answer line shows where the publisher defines nothing.** All five definition-less answers on the current readings are maven's, and every one is a subject scheme naming a subject rather than a concept — so the case is real but confined to the scheme band. *Settled by:* drawing the subject alone, and checking it does not read as a truncated definition.

---

## What landed, 2026-08-31

Steps 1a to 1f of the section above, in one change. `git log` holds the detail; this records what a reader of the plan needs to know is no longer open.

| Step | What changed |
|---|---|
| 1a | `StatedAncestry.pathAbove` returns the whole walk, and `topOfTheBranchOf` is now the first of it. `ExportedTaxonomy.Concept` and `ExportedAnswer` carry `statedPath` in place of `atTheTopOfItsBranch`; `ExportedAnswer` carries `timesItsBar` **or** `bitsPastChance` and refuses to be built with the wrong one, or with both. `EvidenceKinds.PLACED_SUBJECT` answers once per scheme, the archive standing as the category's path. `schemaVersion` is **19.0** |
| 1b | `page.css` holds the tokens all five stylesheets copied, and the publisher palette two of them copied. `readings.css` is rewritten and its six dead rules are gone |
| 1c | `readings.js` draws the figure: one row per reading, one mark per answering source, position by strength on a log scale, area by phrases matched, a dashed rule at the bar, and a separate band with its own scale for the schemes. A readout beneath it states the arithmetic on hover and on focus |
| 1d | The table is gone. One section per reading beneath the figure — the publisher, its strength, the whole stated path, the definition, and the branches — and clicking a mark scrolls to it |
| 1e | A `by repository` / `by publisher` picker transposes the figure. `PagesIndex` and `index.html` are deleted and `readings.html` is the root |
| 1f | `evaluationPages` reads `cs.reading.manifest` itself, so the stated-area mark is drawn wherever the run names a manifest |

**Not done, and why.** `taxonomy-matches.html` was to be folded into the by-publisher view and is kept. The two answer different questions: the by-publisher view ranks the sources that *answered*, and the matches page counts every term each vocabulary matched anywhere, single words and out-of-domain controls included. Folding it would lose the second, so it stays and the readings page links it.
