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
| `linguistics` | 0.0512 | 80.8% | 3,818 | 139 | 11,224 | 33.9% | `word` 1,393 `name` 622 `term` 300 `parse` 133 |
| `computing` | 0.0137 | 83.2% | 5,595 | 28 | 1,854 | 5.6% | `repository` 409 `read` 748 `folder` 30 `parse` 133 |
| `grammar` | 0.0086 | 89.9% | 2,152 | 17 | 1,299 | 3.9% | `phrase` 148 `part_of_speech` 39 `occurrence` 161 `verb` 77 |

Read over 453 files and 33,123 lines: 463 topics, 1 files no topic could be resolved for, and 33.9% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.1% of it; the other 75.9% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1574 bits** from the repository, against a null median of 0.0969 over 999 resamples of the same size — an excess of +0.0605, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.0% | `telecommunication` | 0.0002 | 0.0421 | under | `file` 214 `entry` 182 `note` 7 `argument` 9 |
| 7.1% | `plants` | 0.0018 | 0.0306 | under | `root` 140 `tree` 166 `seed` 25 `leaf` 17 |
| 6.9% | `publishing` | 0.0171 | 0.0655 | under | `publish` 274 `read` 152 `write` 610 `vocabulary` 152 |
| 6.4% | `physics` | 0.0665 | 0.0190 | **over** | `mass` 131 `weight` 57 `length` 49 `radius` 3 |
| 4.9% | `time_period` | 0.0292 | 0.0042 | **over** | `span` 15 `none` 5 `long` 21 `even` 4 |
| 4.1% | `electronics` | 0.0008 | 0.0168 | under | `tsv` 38 `field` 184 `headroom` 2 `bar` 99 |
| 3.4% | `lexicography` | 0.0349 | 0.0097 | **over** | `citation` 96 `sense` 311 `gloss` 2 `lemma` 76 |
| 2.6% | `philosophy` | 0.0001 | 0.0090 | under | `describe` 37 `lemma` 76 `each` 42 `explain` 13 |

### `code-semantics-api/src/test/java`

**0.2038 bits** from the repository, against a null median of 0.1576 over 999 resamples of the same size — an excess of +0.0462, and 37 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.2% | `telecommunication` | 0.0017 | 0.0421 | under | `file` 214 `entry` 182 `note` 7 `argument` 9 |
| 6.8% | `plants` | 0.0004 | 0.0306 | under | `root` 140 `tree` 166 `seed` 25 `leaf` 17 |
| 6.7% | `biology` | 0.0383 | 0.0025 | **over** | `morphology` 19 `owl` 22 `person` 21 `glob` 5 |
| 5.5% | `publishing` | 0.0167 | 0.0655 | under | `publish` 274 `read` 152 `write` 610 `vocabulary` 152 |
| 4.7% | `politics` | 0.0552 | 0.0138 | **over** | `vote` 53 `normalisation` 19 `reading` 578 `name` 707 |
| 4.1% | `literature` | 0.0016 | 0.0236 | under | `header` 76 `write` 609 `text` 69 `prose` 95 |
| 3.8% | `linguistics` | 0.3029 | 0.1999 | **over** | `word` 1,393 `name` 622 `term` 300 `parse` 133 |
| 3.6% | `law` | 0.0949 | 0.0429 | **over** | `file` 424 `witness` 70 `summary` 54 `claim` 104 |

### `code-semantics-engine/src/main/java`

**0.0390 bits** from the repository, against a null median of 0.0165 over 999 resamples of the same size — an excess of +0.0225, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.9% | `electronics` | 0.0015 | 0.0168 | under | `tsv` 38 `field` 184 `headroom` 2 `bar` 99 |
| 10.7% | `chemistry` | 0.0018 | 0.0146 | under | `extraction` 50 `fraction` 9 `extract` 7 `test` 215 |
| 7.2% | `psychology` | 0.0015 | 0.0107 | under | `module` 71 `confidence` 20 `know` 69 `test` 215 |
| 4.3% | `animals` | 0.0005 | 0.0052 | under | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 3.4% | `grammar` | 0.0486 | 0.0315 | **over** | `phrase` 148 `part_of_speech` 39 `occurrence` 161 `verb` 77 |
| 3.3% | `calculus` | 0.0134 | 0.0054 | **over** | `divergence` 141 |
| 2.2% | `plants` | 0.0197 | 0.0306 | under | `root` 140 `tree` 166 `seed` 25 `leaf` 17 |
| 2.1% | `semantics` | 0.0121 | 0.0057 | **over** | `occurrence` 161 `reference` 161 `word` 1,422 `sense` 311 |

### `code-semantics-engine/src/test/java`

**0.0443 bits** from the repository, against a null median of 0.0174 over 999 resamples of the same size — an excess of +0.0270, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.2% | `electronics` | 0.0004 | 0.0168 | under | `tsv` 38 `field` 184 `headroom` 2 `bar` 99 |
| 13.6% | `plants` | 0.0713 | 0.0306 | **over** | `root` 140 `tree` 166 `seed` 25 `leaf` 17 |
| 4.7% | `animals` | 0.0002 | 0.0052 | under | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 4.4% | `chemistry` | 0.0047 | 0.0146 | under | `extraction` 50 `fraction` 9 `extract` 7 `test` 215 |
| 4.1% | `mathematics` | 0.0293 | 0.0491 | under | `from` 136 `function` 57 `distribution` 84 `lemma` 76 |
| 3.4% | `publishing` | 0.0911 | 0.0655 | **over** | `publish` 274 `read` 152 `write` 610 `vocabulary` 152 |
| 3.4% | `psychology` | 0.0033 | 0.0107 | under | `module` 71 `confidence` 20 `know` 69 `test` 215 |
| 3.1% | `computer-languages` | 0.0001 | 0.0033 | under | `json` 6 `sparql` 1 `owl` 22 `java` 59 |

### `lexicon-extraction/src/main/java`

**0.1824 bits** from the repository, against a null median of 0.0599 over 999 resamples of the same size — an excess of +0.1225, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.2% | `linguistics` | 0.0916 | 0.1999 | under | `word` 1,393 `name` 622 `term` 300 `parse` 133 |
| 7.1% | `literature` | 0.0840 | 0.0236 | **over** | `header` 76 `write` 609 `text` 69 `prose` 95 |
| 7.0% | `grammar` | 0.0012 | 0.0315 | under | `phrase` 148 `part_of_speech` 39 `occurrence` 161 `verb` 77 |
| 6.3% | `animals` | 0.0414 | 0.0052 | **over** | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 6.0% | `plants` | 0.0019 | 0.0306 | under | `root` 140 `tree` 166 `seed` 25 `leaf` 17 |
| 5.0% | `electronics` | 0.0596 | 0.0168 | **over** | `tsv` 38 `field` 184 `headroom` 2 `bar` 99 |
| 4.5% | `computer-languages` | 0.0283 | 0.0033 | **over** | `json` 6 `sparql` 1 `owl` 22 `java` 59 |
| 4.0% | `physics` | 0.0009 | 0.0190 | under | `mass` 131 `weight` 57 `length` 49 `radius` 3 |

### `lexicon-extraction/src/test/java`

**0.2156 bits** from the repository, against a null median of 0.0752 over 999 resamples of the same size — an excess of +0.1405, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.0% | `chemistry` | 0.1468 | 0.0146 | **over** | `extraction` 50 `fraction` 9 `extract` 7 `test` 215 |
| 16.2% | `electronics` | 0.1281 | 0.0168 | **over** | `tsv` 38 `field` 184 `headroom` 2 `bar` 99 |
| 5.4% | `linguistics` | 0.1019 | 0.1999 | under | `word` 1,393 `name` 622 `term` 300 `parse` 133 |
| 3.5% | `physics` | 0.0008 | 0.0190 | under | `mass` 131 `weight` 57 `length` 49 `radius` 3 |
| 2.8% | `person` | 0.0028 | 0.0217 | under | `reader` 122 `child` 20 `host` 29 `bearer` 18 |
| 2.5% | `psychology` | 0.0368 | 0.0107 | **over** | `module` 71 `confidence` 20 `know` 69 `test` 215 |
| 2.4% | `law` | 0.0146 | 0.0429 | under | `file` 424 `witness` 70 `summary` 54 `claim` 104 |
| 2.3% | `grammar` | 0.0086 | 0.0315 | under | `phrase` 148 `part_of_speech` 39 `occurrence` 161 `verb` 77 |

### `lexicon/src/main/java`

**0.1938 bits** from the repository, against a null median of 0.1117 over 999 resamples of the same size — an excess of +0.0822, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.9% | `plants` | 0.0000 | 0.0306 | under | `root` 140 `tree` 166 `seed` 25 `leaf` 17 |
| 6.6% | `publishing` | 0.0143 | 0.0655 | under | `publish` 274 `read` 152 `write` 610 `vocabulary` 152 |
| 4.9% | `person` | 0.0693 | 0.0217 | **over** | `reader` 122 `child` 20 `host` 29 `bearer` 18 |
| 4.8% | `mathematics` | 0.1131 | 0.0491 | **over** | `from` 136 `function` 57 `distribution` 84 `lemma` 76 |
| 4.1% | `networking` | 0.0327 | 0.0052 | **over** | `resource` 253 `preamble` 7 `request` 11 `node` 67 |
| 4.0% | `physics` | 0.0006 | 0.0190 | under | `mass` 131 `weight` 57 `length` 49 `radius` 3 |
| 4.0% | `grammar` | 0.0793 | 0.0315 | **over** | `phrase` 148 `part_of_speech` 39 `occurrence` 161 `verb` 77 |
| 3.3% | `chemistry` | 0.0003 | 0.0146 | under | `extraction` 50 `fraction` 9 `extract` 7 `test` 215 |

### `lexicon/src/test/java`

**0.1503 bits** from the repository, against a null median of 0.1215 over 999 resamples of the same size — an excess of +0.0288, and 64 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `plants` | 0.0002 | 0.0306 | under | `root` 140 `tree` 166 `seed` 25 `leaf` 17 |
| 8.7% | `linguistics` | 0.3387 | 0.1999 | **over** | `word` 1,393 `name` 622 `term` 300 `parse` 133 |
| 5.8% | `lexicography` | 0.0445 | 0.0097 | **over** | `citation` 96 `sense` 311 `gloss` 2 `lemma` 76 |
| 5.5% | `electronics` | 0.0000 | 0.0168 | under | `tsv` 38 `field` 184 `headroom` 2 `bar` 99 |
| 2.9% | `politics` | 0.0013 | 0.0138 | under | `vote` 53 `normalisation` 19 `reading` 578 `name` 707 |
| 2.8% | `chemistry` | 0.0018 | 0.0146 | under | `extraction` 50 `fraction` 9 `extract` 7 `test` 215 |
| 2.0% | `computing` | 0.0309 | 0.0580 | under | `repository` 409 `read` 748 `folder` 30 `parse` 133 |
| 2.0% | `information-science` | 0.0180 | 0.0047 | **over** | `synset` 26 `document` 65 `ontology` 104 `align` 1 |

### `documentation`

**0.2466 bits** from the repository, against a null median of 0.3433 over 999 resamples of the same size — an excess of -0.0967, and 939 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.1 s, recorded rather than estimated.
