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
| `linguistics` | 0.0515 | 80.1% | 3,668 | 132 | 10,663 | 33.7% | `word` 1,333 `name` 610 `term` 271 `parse` 129 |
| `computing` | 0.0130 | 83.4% | 5,270 | 24 | 1,638 | 5.2% | `repository` 365 `read` 711 `parse` 129 `dictionary` 205 |
| `grammar` | 0.0088 | 89.5% | 2,021 | 17 | 1,299 | 4.1% | `phrase` 145 `part_of_speech` 39 `occurrence` 145 `verb` 76 |

Read over 427 files and 31,651 lines: 460 topics, 1 files no topic could be resolved for, and 33.7% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1533 bits** from the repository, against a null median of 0.0967 over 999 resamples of the same size — an excess of +0.0566, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.7% | `telecommunication` | 0.0002 | 0.0402 | under | `file` 204 `entry` 182 `note` 7 `fetch` 25 |
| 7.5% | `plants` | 0.0018 | 0.0313 | under | `root` 138 `tree` 150 `seed` 21 `leaf` 18 |
| 6.9% | `publishing` | 0.0171 | 0.0645 | under | `publish` 247 `read` 147 `write` 550 `vocabulary` 142 |
| 6.1% | `physics` | 0.0665 | 0.0204 | **over** | `mass` 129 `weight` 60 `radius` 5 `length` 46 |
| 4.8% | `time_period` | 0.0292 | 0.0044 | **over** | `span` 15 `none` 5 `long` 17 `even` 4 |
| 4.5% | `electronics` | 0.0008 | 0.0178 | under | `tsv` 38 `field` 167 `headroom` 2 `bar` 90 |
| 3.3% | `lexicography` | 0.0349 | 0.0103 | **over** | `citation` 94 `sense` 310 `gloss` 2 `lemma` 75 |
| 2.8% | `philosophy` | 0.0001 | 0.0093 | under | `lemma` 75 `describe` 36 `each` 38 `explain` 15 |

### `code-semantics-api/src/test/java`

**0.2007 bits** from the repository, against a null median of 0.1540 over 999 resamples of the same size — an excess of +0.0467, and 43 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.9% | `telecommunication` | 0.0017 | 0.0402 | under | `file` 204 `entry` 182 `note` 7 `fetch` 25 |
| 7.1% | `plants` | 0.0004 | 0.0313 | under | `root` 138 `tree` 150 `seed` 21 `leaf` 18 |
| 6.7% | `biology` | 0.0383 | 0.0026 | **over** | `morphology` 19 `owl` 22 `person` 19 `glob` 5 |
| 5.4% | `publishing` | 0.0167 | 0.0645 | under | `publish` 247 `read` 147 `write` 550 `vocabulary` 142 |
| 4.6% | `politics` | 0.0552 | 0.0143 | **over** | `vote` 53 `normalisation` 13 `reading` 539 `name` 695 |
| 4.4% | `literature` | 0.0016 | 0.0248 | under | `header` 72 `write` 550 `text` 62 `prose` 91 |
| 3.8% | `law` | 0.0949 | 0.0418 | **over** | `file` 397 `witness` 66 `within` 9 `claim` 103 |
| 3.8% | `electronics` | 0.0005 | 0.0178 | under | `tsv` 38 `field` 167 `headroom` 2 `bar` 90 |

### `code-semantics-engine/src/main/java`

**0.0456 bits** from the repository, against a null median of 0.0187 over 999 resamples of the same size — an excess of +0.0269, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.1% | `electronics` | 0.0017 | 0.0178 | under | `tsv` 38 `field` 167 `headroom` 2 `bar` 90 |
| 9.4% | `chemistry` | 0.0020 | 0.0155 | under | `extraction` 48 `fraction` 9 `extract` 7 `test` 202 |
| 6.3% | `psychology` | 0.0017 | 0.0113 | under | `module` 71 `confidence` 20 `know` 66 `test` 202 |
| 6.1% | `information-science` | 0.0001 | 0.0060 | under | `synset` 27 `document` 53 `ontology` 104 `align` 1 |
| 4.0% | `grammar` | 0.0529 | 0.0322 | **over** | `phrase` 145 `part_of_speech` 39 `occurrence` 145 `verb` 76 |
| 3.8% | `animals` | 0.0005 | 0.0055 | under | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 2.9% | `linguistics` | 0.2422 | 0.2019 | **over** | `word` 1,333 `name` 610 `term` 271 `parse` 129 |
| 2.9% | `computer-languages` | 0.0001 | 0.0032 | under | `json` 5 `sparql` 1 `owl` 22 `java` 52 |

### `code-semantics-engine/src/test/java`

**0.0461 bits** from the repository, against a null median of 0.0180 over 999 resamples of the same size — an excess of +0.0281, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.9% | `electronics` | 0.0004 | 0.0178 | under | `tsv` 38 `field` 167 `headroom` 2 `bar` 90 |
| 14.0% | `plants` | 0.0742 | 0.0313 | **over** | `root` 138 `tree` 150 `seed` 21 `leaf` 18 |
| 4.9% | `animals` | 0.0002 | 0.0055 | under | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 4.5% | `chemistry` | 0.0049 | 0.0155 | under | `extraction` 48 `fraction` 9 `extract` 7 `test` 202 |
| 4.0% | `publishing` | 0.0928 | 0.0645 | **over** | `publish` 247 `read` 147 `write` 550 `vocabulary` 142 |
| 3.4% | `psychology` | 0.0034 | 0.0113 | under | `module` 71 `confidence` 20 `know` 66 `test` 202 |
| 3.3% | `mathematics` | 0.0309 | 0.0492 | under | `from` 138 `function` 57 `distribution` 76 `lemma` 75 |
| 2.6% | `computer-languages` | 0.0002 | 0.0032 | under | `json` 5 `sparql` 1 `owl` 22 `java` 52 |

### `lexicon-extraction/src/main/java`

**0.1805 bits** from the repository, against a null median of 0.0587 over 999 resamples of the same size — an excess of +0.1217, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.5% | `linguistics` | 0.0916 | 0.2019 | under | `word` 1,333 `name` 610 `term` 271 `parse` 129 |
| 7.2% | `grammar` | 0.0012 | 0.0322 | under | `phrase` 145 `part_of_speech` 39 `occurrence` 145 `verb` 76 |
| 6.8% | `literature` | 0.0840 | 0.0248 | **over** | `header` 72 `write` 550 `text` 62 `prose` 91 |
| 6.3% | `plants` | 0.0019 | 0.0313 | under | `root` 138 `tree` 150 `seed` 21 `leaf` 18 |
| 6.2% | `animals` | 0.0414 | 0.0055 | **over** | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 4.8% | `electronics` | 0.0596 | 0.0178 | **over** | `tsv` 38 `field` 167 `headroom` 2 `bar` 90 |
| 4.6% | `computer-languages` | 0.0283 | 0.0032 | **over** | `json` 5 `sparql` 1 `owl` 22 `java` 52 |
| 4.4% | `physics` | 0.0009 | 0.0204 | under | `mass` 129 `weight` 60 `radius` 5 `length` 46 |

### `lexicon-extraction/src/test/java`

**0.2126 bits** from the repository, against a null median of 0.0741 over 999 resamples of the same size — an excess of +0.1384, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.8% | `chemistry` | 0.1468 | 0.0155 | **over** | `extraction` 48 `fraction` 9 `extract` 7 `test` 202 |
| 16.0% | `electronics` | 0.1281 | 0.0178 | **over** | `tsv` 38 `field` 167 `headroom` 2 `bar` 90 |
| 5.7% | `linguistics` | 0.1019 | 0.2019 | under | `word` 1,333 `name` 610 `term` 271 `parse` 129 |
| 3.9% | `physics` | 0.0008 | 0.0204 | under | `mass` 129 `weight` 60 `radius` 5 `length` 46 |
| 3.0% | `person` | 0.0028 | 0.0225 | under | `reader` 120 `child` 21 `host` 28 `bearer` 18 |
| 2.5% | `grammar` | 0.0086 | 0.0322 | under | `phrase` 145 `part_of_speech` 39 `occurrence` 145 `verb` 76 |
| 2.4% | `psychology` | 0.0368 | 0.0113 | **over** | `module` 71 `confidence` 20 `know` 66 `test` 202 |
| 2.3% | `law` | 0.0146 | 0.0418 | under | `file` 397 `witness` 66 `within` 9 `claim` 103 |

### `lexicon/src/main/java`

**0.1884 bits** from the repository, against a null median of 0.1087 over 999 resamples of the same size — an excess of +0.0798, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `plants` | 0.0000 | 0.0313 | under | `root` 138 `tree` 150 `seed` 21 `leaf` 18 |
| 6.6% | `publishing` | 0.0143 | 0.0645 | under | `publish` 247 `read` 147 `write` 550 `vocabulary` 142 |
| 4.9% | `mathematics` | 0.1131 | 0.0492 | **over** | `from` 138 `function` 57 `distribution` 76 `lemma` 75 |
| 4.8% | `person` | 0.0693 | 0.0225 | **over** | `reader` 120 `child` 21 `host` 28 `bearer` 18 |
| 4.5% | `physics` | 0.0006 | 0.0204 | under | `mass` 129 `weight` 60 `radius` 5 `length` 46 |
| 4.3% | `networking` | 0.0327 | 0.0051 | **over** | `resource` 242 `preamble` 7 `request` 10 `node` 70 |
| 3.9% | `grammar` | 0.0793 | 0.0322 | **over** | `phrase` 145 `part_of_speech` 39 `occurrence` 145 `verb` 76 |
| 3.7% | `chemistry` | 0.0003 | 0.0155 | under | `extraction` 48 `fraction` 9 `extract` 7 `test` 202 |

### `lexicon/src/test/java`

**0.1457 bits** from the repository, against a null median of 0.1182 over 999 resamples of the same size — an excess of +0.0275, and 88 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.2% | `plants` | 0.0002 | 0.0313 | under | `root` 138 `tree` 150 `seed` 21 `leaf` 18 |
| 8.7% | `linguistics` | 0.3387 | 0.2019 | **over** | `word` 1,333 `name` 610 `term` 271 `parse` 129 |
| 6.0% | `electronics` | 0.0000 | 0.0178 | under | `tsv` 38 `field` 167 `headroom` 2 `bar` 90 |
| 5.7% | `lexicography` | 0.0445 | 0.0103 | **over** | `citation` 94 `sense` 310 `gloss` 2 `lemma` 75 |
| 3.1% | `politics` | 0.0013 | 0.0143 | under | `vote` 53 `normalisation` 13 `reading` 539 `name` 695 |
| 3.1% | `chemistry` | 0.0018 | 0.0155 | under | `extraction` 48 `fraction` 9 `extract` 7 `test` 202 |
| 2.1% | `military` | 0.0025 | 0.0136 | under | `repository` 365 `base` 51 `column` 45 `refuse` 128 |
| 1.9% | `psychology` | 0.0018 | 0.0113 | under | `module` 71 `confidence` 20 `know` 66 `test` 202 |

### `documentation`

**0.2370 bits** from the repository, against a null median of 0.3408 over 999 resamples of the same size — an excess of -0.1038, and 970 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 7.3 s, recorded rather than estimated.
