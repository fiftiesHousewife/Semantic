# Themes — CodeSemantics

What this repository's names are about, read through the two bundled resources that assign a word
to a subject: WordNet Domains, which labels each of a word's senses, and Wiktionary's topic
vocabulary, which labels the headword. Each word occurrence commits one unit of mass per resource,
divided among the readings that resource names, so an ambiguous word does not shout.

A label another label of the same word already implies is not one of those readings. The topic
vocabulary publishes a closure over its own hierarchy — a word labelled `computing` arrives
carrying `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences`
besides — and the hierarchy that derived them, published by the same extractor, is what folds
them back into the label they came from. Nothing is excluded and no list is written: where the
hierarchy is silent, every label the word carries stands.

**Read the ranking below as the weak reading it is.** A topic's intensity over one scope counts
every occurrence of every word, and the commonest words in Java source are also the most
ambiguous ones — `string`, `set`, `map`, `assert`, `of`. Their senses spray mass across subjects
that have nothing to do with this codebase, which is why the witnesses are printed beside every
row: a topic carried by one word is one word's opinion, and the table says so.

The reading worth acting on is the comparison underneath it. A topic written at much the same
density everywhere contributes almost nothing to a divergence, so the ambiguity that dominates a
count cancels in a comparison — and each scope's divergence is judged against the field of
divergences a scope of its own size draws by chance, so a small scope cannot look interesting
merely by being small.

## What the whole repository reads as

Only the topics that **earned a place**: a topic reaches this table where it makes some part of this repository unlike the rest of it — a scope that departed further than the furthest of a field of chance draws — and where more than one word carries it. A topic held at the same density everywhere distinguishes nothing, and a topic one word holds a majority of is that word's opinion. Both bars follow from the reading; neither is a list.

| Topic | ι | From names | References | Leads | Lines led | Share of lines | Carried by |
|---|--:|--:|--:|--:|--:|--:|---|
| `linguistics` | 0.0466 | 80.2% | 3,037 | 108 | 8,553 | 32.7% | `word`&nbsp;1,083 `name`&nbsp;452 `term`&nbsp;253 `parse`&nbsp;109 |
| `computing` | 0.0115 | 82.8% | 4,363 | 22 | 1,564 | 6.0% | `repository`&nbsp;352 `parse`&nbsp;109 `read`&nbsp;599 `unread`&nbsp;9 |

Read over 363 files and 26,149 lines: 466 topics, 1 files no topic could be resolved for, and 32.7% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 22.1% of it; the other 77.9% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1568 bits** from the repository, against a null median of 0.0971 over 999 resamples of the same size — an excess of +0.0597, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.1% | `telecommunication` | 0.0002 | 0.0554 | under | `file`&nbsp;180 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 8.1% | `publishing` | 0.0129 | 0.0624 | under | `publish`&nbsp;185 `read`&nbsp;122 `directory`&nbsp;51 `write`&nbsp;365 |
| 8.1% | `plants` | 0.0015 | 0.0327 | under | `root`&nbsp;103 `tree`&nbsp;116 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 6.1% | `electronics` | 0.0008 | 0.0235 | under | `tsv`&nbsp;38 `field`&nbsp;153 `default`&nbsp;25 `node`&nbsp;53 |
| 5.3% | `physics` | 0.0597 | 0.0185 | **over** | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.7% | `time_period` | 0.0220 | 0.0030 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;12 |
| 2.7% | `philosophy` | 0.0001 | 0.0090 | under | `describe`&nbsp;35 `lemma`&nbsp;70 `explain`&nbsp;12 `each`&nbsp;24 |
| 2.4% | `lexicography` | 0.0362 | 0.0136 | **over** | `citation`&nbsp;93 `sense`&nbsp;305 `gloss`&nbsp;2 `lemma`&nbsp;70 |

### `code-semantics-api/src/test/java`

**0.2061 bits** from the repository, against a null median of 0.1517 over 999 resamples of the same size — an excess of +0.0544, and 37 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.9% | `telecommunication` | 0.0010 | 0.0554 | under | `file`&nbsp;180 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 7.5% | `plants` | 0.0003 | 0.0327 | under | `root`&nbsp;103 `tree`&nbsp;116 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 7.3% | `biology` | 0.0437 | 0.0031 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 6.2% | `literature` | 0.0003 | 0.0277 | under | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;365 `title`&nbsp;13 |
| 5.3% | `politics` | 0.0642 | 0.0165 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;436 `name`&nbsp;512 |
| 5.2% | `electronics` | 0.0003 | 0.0235 | under | `tsv`&nbsp;38 `field`&nbsp;153 `default`&nbsp;25 `node`&nbsp;53 |
| 4.2% | `linguistics` | 0.3234 | 0.2108 | **over** | `word`&nbsp;1,083 `name`&nbsp;452 `term`&nbsp;253 `parse`&nbsp;109 |
| 4.0% | `publishing` | 0.0199 | 0.0624 | under | `publish`&nbsp;185 `read`&nbsp;122 `directory`&nbsp;51 `write`&nbsp;365 |

### `code-semantics-engine/src/main/java`

**0.0679 bits** from the repository, against a null median of 0.0220 over 999 resamples of the same size — an excess of +0.0459, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.7% | `electronics` | 0.0003 | 0.0235 | under | `tsv`&nbsp;38 `field`&nbsp;153 `default`&nbsp;25 `node`&nbsp;53 |
| 12.3% | `chemistry` | 0.0013 | 0.0227 | under | `syn`&nbsp;15 `extraction`&nbsp;48 `extract`&nbsp;7 `test`&nbsp;171 |
| 8.8% | `psychology` | 0.0004 | 0.0140 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;56 `test`&nbsp;171 |
| 6.8% | `grammar` | 0.0575 | 0.0255 | **over** | `phrase`&nbsp;146 `verb`&nbsp;66 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 3.5% | `politics` | 0.0348 | 0.0165 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;436 `name`&nbsp;512 |
| 2.8% | `computer-languages` | 0.0002 | 0.0048 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 2.3% | `telecommunication` | 0.0793 | 0.0554 | **over** | `file`&nbsp;180 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 2.2% | `literature` | 0.0146 | 0.0277 | under | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;365 `title`&nbsp;13 |

### `code-semantics-engine/src/test/java`

**0.0660 bits** from the repository, against a null median of 0.0230 over 999 resamples of the same size — an excess of +0.0430, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.3% | `plants` | 0.1018 | 0.0327 | **over** | `root`&nbsp;103 `tree`&nbsp;116 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 16.4% | `electronics` | 0.0003 | 0.0235 | under | `tsv`&nbsp;38 `field`&nbsp;153 `default`&nbsp;25 `node`&nbsp;53 |
| 11.4% | `chemistry` | 0.0018 | 0.0227 | under | `syn`&nbsp;15 `extraction`&nbsp;48 `extract`&nbsp;7 `test`&nbsp;171 |
| 2.9% | `psychology` | 0.0044 | 0.0140 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;56 `test`&nbsp;171 |
| 2.9% | `computer-languages` | 0.0002 | 0.0048 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 2.2% | `animals` | 0.0011 | 0.0063 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |
| 1.9% | `physiology` | 0.0000 | 0.0026 | under | `dump`&nbsp;20 `map`&nbsp;25 `parity`&nbsp;4 `system`&nbsp;7 |
| 1.9% | `christianity` | 0.0004 | 0.0040 | under | `kind`&nbsp;48 `use`&nbsp;68 `publish`&nbsp;185 `publisher`&nbsp;61 |

### `lexicon-extraction/src/main/java`

**0.1582 bits** from the repository, against a null median of 0.0553 over 999 resamples of the same size — an excess of +0.1028, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.9% | `linguistics` | 0.0967 | 0.2108 | under | `word`&nbsp;1,083 `name`&nbsp;452 `term`&nbsp;253 `parse`&nbsp;109 |
| 7.9% | `plants` | 0.0016 | 0.0327 | under | `root`&nbsp;103 `tree`&nbsp;116 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 7.2% | `literature` | 0.0864 | 0.0277 | **over** | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;365 `title`&nbsp;13 |
| 6.2% | `grammar` | 0.0012 | 0.0255 | under | `phrase`&nbsp;146 `verb`&nbsp;66 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 5.1% | `computer-languages` | 0.0319 | 0.0048 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 4.7% | `electronics` | 0.0652 | 0.0235 | **over** | `tsv`&nbsp;38 `field`&nbsp;153 `default`&nbsp;25 `node`&nbsp;53 |
| 4.1% | `physics` | 0.0013 | 0.0185 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.8% | `animals` | 0.0300 | 0.0063 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |

### `lexicon-extraction/src/test/java`

**0.2123 bits** from the repository, against a null median of 0.0689 over 999 resamples of the same size — an excess of +0.1433, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.1% | `chemistry` | 0.1672 | 0.0227 | **over** | `syn`&nbsp;15 `extraction`&nbsp;48 `extract`&nbsp;7 `test`&nbsp;171 |
| 15.6% | `electronics` | 0.1399 | 0.0235 | **over** | `tsv`&nbsp;38 `field`&nbsp;153 `default`&nbsp;25 `node`&nbsp;53 |
| 8.0% | `linguistics` | 0.0930 | 0.2108 | under | `word`&nbsp;1,083 `name`&nbsp;452 `term`&nbsp;253 `parse`&nbsp;109 |
| 3.8% | `person` | 0.0024 | 0.0257 | under | `reader`&nbsp;104 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 3.0% | `law` | 0.0113 | 0.0407 | under | `file`&nbsp;364 `witness`&nbsp;70 `summary`&nbsp;33 `within`&nbsp;8 |
| 3.0% | `plants` | 0.0072 | 0.0327 | under | `root`&nbsp;103 `tree`&nbsp;116 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 2.9% | `lexicography` | 0.0002 | 0.0136 | under | `citation`&nbsp;93 `sense`&nbsp;305 `gloss`&nbsp;2 `lemma`&nbsp;70 |
| 2.9% | `physics` | 0.0015 | 0.0185 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |

### `lexicon/src/main/java`

**0.1594 bits** from the repository, against a null median of 0.1067 over 999 resamples of the same size — an excess of +0.0528, and 4 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.3% | `plants` | 0.0000 | 0.0327 | under | `root`&nbsp;103 `tree`&nbsp;116 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 5.6% | `person` | 0.0743 | 0.0257 | **over** | `reader`&nbsp;104 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 5.2% | `publishing` | 0.0199 | 0.0624 | under | `publish`&nbsp;185 `read`&nbsp;122 `directory`&nbsp;51 `write`&nbsp;365 |
| 4.8% | `linguistics` | 0.3161 | 0.2108 | **over** | `word`&nbsp;1,083 `name`&nbsp;452 `term`&nbsp;253 `parse`&nbsp;109 |
| 4.7% | `physics` | 0.0007 | 0.0185 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.6% | `networking` | 0.0338 | 0.0064 | **over** | `resource`&nbsp;201 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 4.5% | `mathematics` | 0.1066 | 0.0511 | **over** | `from`&nbsp;107 `function`&nbsp;60 `lemma`&nbsp;70 `distribution`&nbsp;60 |
| 4.0% | `law` | 0.0114 | 0.0407 | under | `file`&nbsp;364 `witness`&nbsp;70 `summary`&nbsp;33 `within`&nbsp;8 |

### `lexicon/src/test/java`

**0.1459 bits** from the repository, against a null median of 0.1164 over 999 resamples of the same size — an excess of +0.0295, and 68 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.0% | `plants` | 0.0001 | 0.0327 | under | `root`&nbsp;103 `tree`&nbsp;116 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 9.7% | `linguistics` | 0.3594 | 0.2108 | **over** | `word`&nbsp;1,083 `name`&nbsp;452 `term`&nbsp;253 `parse`&nbsp;109 |
| 9.0% | `lexicography` | 0.0649 | 0.0136 | **over** | `citation`&nbsp;93 `sense`&nbsp;305 `gloss`&nbsp;2 `lemma`&nbsp;70 |
| 8.0% | `electronics` | 0.0000 | 0.0235 | under | `tsv`&nbsp;38 `field`&nbsp;153 `default`&nbsp;25 `node`&nbsp;53 |
| 4.8% | `physics` | 0.0009 | 0.0185 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.2% | `politics` | 0.0020 | 0.0165 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;436 `name`&nbsp;512 |
| 3.1% | `psychology` | 0.0012 | 0.0140 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;56 `test`&nbsp;171 |
| 1.8% | `military` | 0.0037 | 0.0151 | under | `repository`&nbsp;352 `column`&nbsp;43 `base`&nbsp;46 `refuse`&nbsp;101 |

### `documentation`

**0.2617 bits** from the repository, against a null median of 0.3488 over 999 resamples of the same size — an excess of -0.0871, and 922 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 5.2 s, recorded rather than estimated.
