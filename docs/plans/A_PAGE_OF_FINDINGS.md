# A page of findings

One page per repository stating what the reading found, and one landing page across repositories. The pages replace the four per-repository views and the cross-reading table, and they show findings: what the repository is about, who states it, and how far past chance each statement stands. The workings — the funnel of the ranking's rules, the set-aside counts, the per-normalisation match tables — stay in `reading.json` and `evidence.json`, which [the reconciliation plan](RECONCILE_THE_TWO_FILES.md) gives their contracts. [One page, with the evidence beneath it](ONE_PAGE.md) proposed the page-per-reading shape and its steps 2–5 are superseded by this plan; its review of the readings table and its nine mechanisms carry forward unchanged.

## What the pages say, and how

Three kinds of statement, each in one plain-English sentence pattern, each with the figure beside the words:

| Kind | Pattern | Example |
|---|---|---|
| a source answered | *{publisher} states {count} of its phrases here, against the {bar} the best of a field of {field} reaches by dealing its own words at random. It places {concept} under {path}. "{publisher's description}"* | *FIX states 52 of its phrases here, against the 5 a deal of its own words reaches. It places MsgSeqNum under Session. "Integer message sequence number."* |
| no source answered | *No {kind} matched: {count} vocabularies were judged and none wrote more phrases here than a deal of its own words reaches.* | *No published vocabulary matched: seven were judged and none wrote more phrases here than chance deals reach.* |
| a result is close to chance | *{scheme}'s nearest subject is {subject}, at {divergence} bits against the {chance} bits the nearest subject of a shuffled scheme reaches — {n} subjects are nearer than that shuffle, and the instrument cannot separate them.* | *OpenAlex's nearest subject is Authorship Attribution and Profiling, at 0.421 bits against 0.494 by shuffle — nine subjects are nearer than the shuffle, and the instrument cannot separate them.* |

The rules the patterns encode:

- **The strongest finding leads and the order is the export's own ranking.** `summary.answers` already ranks every source that cleared the answering kind's bar, so the page prints it in that order and invents no ordering of its own.
- **An empty result is a stated sentence, never an absent section.** A repository no vocabulary matched says so with the count judged; a placement no nearer than chance says so with both figures. Silence and absence are indistinguishable, so nothing is silent.
- **A marginal result names its margin.** Wherever a figure is within its chance bound — `standsApartFromChance` false, `timesTheBar` near 1, `nearerThanChance` holding more than one subject — the sentence states the chance figure beside the observed one rather than the observed one alone.
- **A description is quoted only for the concept it is stated for.** `descriptionStatedFor` says whose prose the description is; where the publisher states none for the matched concept, the page says so and names the level the prose came from. The stated-descriptions measurement found a description two or more levels up wrong four times in five, so prose from above the concept is attributed, never passed off.
- **Plain English throughout.** The [house style](../../.claude/skills/written-english/SKILL.md) binds every sentence the pages emit: no metaphor, the arithmetic in the readout, active voice, terms defined at first use with the publisher's own link.

## The landing page — `readings.html`

One card per repository with a published reading, and nothing else on the page.

| Element | Content | From |
|---|---|---|
| name | the repository, linked to its page | `summary.repository` |
| the finding | the first `answers` entry rendered in the sentence patterns above, one to two sentences | `summary.answers` |
| strength | one mark on a shared log scale — times its bar for a vocabulary, bits nearer than chance for a scheme, the two kinds in separate bands because they are different quantities | `answers[].timesItsBar`, `answers[].bitsPastChance` |
| the empty or marginal statement | where nothing answered or the leader is within chance, the second or third sentence pattern | `setAside.vocabulariesBelowTheirChanceBar`, `placedIn` |

The nine-column table the current page grew into is gone; [the review that priced it](ONE_PAGE.md) stands as the reason. The by-publisher transposition and the evaluation manifest's stated-area column are out of the landing page: the first answers a maintainer's question and can return later behind a link, the second puts this project's own curated judgement on a reader-facing page and stays a test fixture.

## The repository page — `reading.html`

One page, findings first, each section a figure with the sentence beside it. The three elements that read well today — written descriptions, the domain overlap, the word cloud — are its body.

| | Section | Shows | From |
|--:|---|---|---|
| 1 | The finding | the sentence patterns above, one per answering source, strongest first; the fold holds the heading and this section | `summary.answers` |
| 2 | The words it chose | the word cloud: every signal merged to its dictionary meaning, type size by score, colour by the leading domains — the cloud the vocabulary page ends in today, without the funnel above it | `signals`, `evidence.vocabulary` |
| 3 | What those words are about | the domain overlap: the three leading domains as sets, each region opening its words, with the live readout stating each share's arithmetic | `signals` through `DomainOverlap` |
| 4 | The phrases a publisher states | per qualifying vocabulary: the matched concepts at their stated paths with the publisher's description, quoted under the attribution rule; a vocabulary below its bar is one sentence with its two counts | `taxonomies[].concepts`, `setAside.vocabulariesBelowTheirChanceBar` |
| 5 | Where the schemes place it | each scheme at both levels: the nearest subject, the divergence against the chance figure, the subjects chance cannot separate, and the topics the placement rests on with their two shares | `summary.placedIn` |
| 6 | What this rests on | three sentences: the share of word occurrences a resource covers, the share of evidence resolving to no subject, and where the JSON files are | `summary.shareOfWordsWithACitation`, `summary.shareOfMassOnNoSubject` |

What the page does not carry, because it is the journey rather than the finding: the funnel of the ranking's rules, the per-normalisation match counts, the set-aside counts beyond the two shares in section 6, the scope-by-scope divergence tables, and every probe output. All of it stays published in the JSON, where the [debugging skill](../../.claude/skills/debugging-a-reading/SKILL.md) already reads it.

### Mechanisms carried forward

The nine mechanisms [the pages review](ONE_PAGE.md) names are the implementation vocabulary for every section: the answer in the fold, size carrying a quantity, a live readout stating arithmetic, summary-then-drill, a figure scrolling to its evidence, the abstention stated in a foot line, one colour per set reused in headings, deep links, and a back line naming where the reader is.

## Build shape

- **One task.** `./gradlew pages` writes `readings.html` and one `reading.html` per published reading under `output/`; `-Dcs.reading.dir` points it at any single published reading. `VocabularyPageCommand`, `DomainVennCommand`, `TermTreesCommand`, `TaxonomyMatchesCommand` and their pages are deleted with their stylesheets and scripts.
- **The pages read published JSON and no tree** — the module's existing contract, kept.
- **The drawing classes survive where a section draws them**: `DomainOverlap`, `SignificantWords`, the cloud's sense merge from `VocabularyFunnel` (the funnel's counts go, the merge stays), `TermTree` for section 4's paths. `VocabularyFunnel` itself, `DrawnReadings`'s table rendering and the pages being deleted go with their commands.
- **Schema 27.0 first.** Section 1 quotes the concept and its description as two fields, which is [the reconciliation plan](RECONCILE_THE_TWO_FILES.md)'s step 7; building the sentence patterns on the fused `result` string would parse display text.

## The order of work, and what settles each step

All five steps landed on 2026-09-11, with one remainder. `FindingSentences` renders the three patterns and the per-level placement sentences; `ReadingPage` draws the six sections with the cloud and the overlap adapted into `reading.js`; `LandingPage` draws the cards with a log-scaled mark per answering source; `./gradlew pages` writes every page and the landing, and the six page commands, five pages, twenty-two support classes and ten scripts and stylesheets are deleted. The three printing probes stay in `vocabulary-page`: they read `CorroboratedSenses`, `PredominantSenses` and `SubjectSenseSources`, which live beside the page classes, so moving the probes means moving that cluster — a separate decision.

| | Step | Settled by |
|--:|---|---|
| 1 | The sentence renderer: `answers[]` in, the three patterns out, as a tested class with no page around it | every committed reading renders; a reading with `ExportedAnswer.NONE` renders the no-source sentence; a scheme answer renders its bits |
| 2 | `reading.html` sections 1, 4, 5 and 6 — the findings, the phrases, the placements, the foot | the twelve committed readings each produce a page whose every figure appears in the reading it was drawn from |
| 3 | Sections 2 and 3 — the cloud and the overlap moved in from their pages | the two sections draw what their standalone pages drew, minus the funnel |
| 4 | `readings.html` — the cards and the strength marks | a reader can say what each of the twelve repositories is about, and which findings are marginal, without opening a second page |
| 5 | One `pages` task; the four page commands, their pages, scripts and stylesheets deleted; the three printing probes out of `vocabulary-page` | `./gradlew pages` is the only page command and the module holds pages plus the classes that compute what they draw |

**Refuted by** the check ONE_PAGE.md already states: a reader who cannot name what a repository is about, and what that rests on, from the fold of its page. The second check is this plan's own: a reader who cannot tell a strong finding from a marginal one without reading a number twice.

## The corrections of 2026-09-12

Read against the rebuilt pages, five corrections, and the last of them found the reading rather than the page — the sixth time in eight that a page complaint did.

1. **The answer leads the card, and the dictionary topics come off it.** The card led with the strongest evidence sentence; the question a reader brings is *what is this repository about*. The first repair put an about line of dictionary topics above the claim, and reading it back refuted it the same day: the topics were `computing` on every card — a topic every code repository shares names the corpus, not the member, the same arithmetic as the field levels a majority sits beneath — plus one wrong domain apiece, `cricket` on quickfixj from FIX's everyday words and `law` on fineract from the senses of `loan`, `interest` and `charge`, the one-domain sense argmax the weight-scaled voting row already records. What answers the question is the strongest answer's own claim — FIBO placing `PresentValue` under `Value` says finance as no sense label does — so that claim leads the card, whatever kind carried it, prefixed with the subject the source's own header states — `About financial information exchange: FIX states 52 of its phrases…` — because a source's name answers nothing on its own, and `# Subject:` is the publisher's stated scope, citable where a sense label is not. The topics stay on the member page with the workings.
2. **Every answer on one scale, against its own chance figure.** The cards ranked any vocabulary above any scheme by kind, so a vocabulary at 2.0× its bar outranked a placement 1.4× nearer than chance. `AnswerStrengths` puts both kinds on one dimensionless scale — times-its-own-chance-figure — so a near-chance answer sits below a strong one whatever its kind, and the previous rule ("the strongest finding leads and the order is the export's own ranking") is amended: the export's blocks are not re-ranked, but which measured figure speaks first on a card follows the shared scale. Placements come from `summary.placedIn`, not only from `answers`, so a strong placement shows beside a weak vocabulary even where the answering cascade stopped at the vocabulary.
3. **The workings are stated once.** The clause "against the N the best of a field of 7 reaches by dealing its own words at random" repeated on every card; it now stands once in the landing lede, and a card carries only its claims.
4. **A link looks like a link.** The card headings linked to the pages in plain ink with no underline; they are underlined and coloured now.
5. **The published runs were dressed as identifiers.** The signals seemed to hold no phrases; `./gradlew publishedRuns` shows the pipeline carries them end to end — on this repository 20 written, 4 clearing every bar, led by `part_of_speech`; fineract carries 58, strata 36 — but they are spelled with the underscore the topical resources write, so `interest_rate` read as code. The schema's description promised spaces and now states the underscore; pages show the space via `PublishedSpelling`, applied on the landing page's topics. The member pages' word pictures still show the underscore, because the spelling is load-bearing there — WordNet sense lookups key on it — and the one fix that reaches every site is spelling runs with spaces in the export itself at the next schema version, which is this plan's open remainder.

Two reading findings the redesign surfaced, recorded rather than hidden: the dictionary topics mislabel members whose vocabulary is everyday English — `cricket` on quickfixj (`leg`, `over`; the hazard backlog row 33 states) and `law` on fineract (`loan`, `interest`, `charge`) — which is the standing defect of the one-domain sense argmax; and several members' strongest placement is a near-chance subject (Artificial Intelligence at 1.3× on quickfixj), which the inline multiple says plainly wherever a placement leads.

## Open questions

1. **Whether section 4 draws the publisher's whole tree or only the matched branches.** The tree page draws everything and most of it is unmatched. *Settled by:* drawing matched branches with their stated paths, and counting whether any committed reading loses a concept the tree page showed.
2. **What the landing page says about the two committed readings on a fresh clone** — it has two cards and says so, the answer ONE_PAGE.md already gives.
