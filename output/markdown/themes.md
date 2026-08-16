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
| `linguistics` | 0.0511 | 80.9% | 3,936 | 142 | 11,534 | 33.7% | `word` 1,424 `name` 655 `term` 314 `parse` 137 |
| `computing` | 0.0136 | 83.2% | 5,783 | 28 | 1,661 | 4.9% | `repository` 419 `folder` 32 `read` 767 `parse` 137 |

Read over 463 files and 34,186 lines: 463 topics, 1 files no topic could be resolved for, and 33.7% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.1% of it; the other 75.9% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**15.8%** of the maximum divergence from the repository, against a null median of 9.9% over 999 resamples of the same size — an excess of +5.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.0% | `telecommunication` | 0.0002 | 0.0425 | under | `file` 233 `entry` 184 `copy` 27 `note` 7 |
| 6.8% | `plants` | 0.0018 | 0.0298 | under | `root` 145 `tree` 167 `seed` 25 `leaf` 20 |
| 6.7% | `publishing` | 0.0171 | 0.0645 | under | `publish` 277 `read` 154 `write` 637 `vocabulary` 152 |
| 6.4% | `physics` | 0.0665 | 0.0191 | **over** | `mass` 131 `weight` 68 `length` 50 `radius` 3 |
| 4.8% | `time_period` | 0.0292 | 0.0042 | **over** | `span` 19 `none` 5 `long` 21 `even` 4 |
| 4.0% | `electronics` | 0.0008 | 0.0164 | under | `tsv` 38 `field` 188 `headroom` 2 `bar` 101 |
| 3.5% | `lexicography` | 0.0349 | 0.0095 | **over** | `citation` 96 `sense` 311 `gloss` 2 `lemma` 76 |
| 2.6% | `philosophy` | 0.0001 | 0.0088 | under | `describe` 37 `lemma` 76 `each` 44 `explain` 13 |

### `code-semantics-api/src/test/java`

**20.4%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +4.8 points, and 57 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `telecommunication` | 0.0017 | 0.0425 | under | `file` 233 `entry` 184 `copy` 27 `note` 7 |
| 6.7% | `biology` | 0.0383 | 0.0024 | **over** | `morphology` 19 `owl` 22 `person` 23 `glob` 5 |
| 6.6% | `plants` | 0.0004 | 0.0298 | under | `root` 145 `tree` 167 `seed` 25 `leaf` 20 |
| 5.3% | `publishing` | 0.0167 | 0.0645 | under | `publish` 277 `read` 154 `write` 637 `vocabulary` 152 |
| 4.7% | `politics` | 0.0552 | 0.0137 | **over** | `vote` 53 `normalisation` 19 `reading` 604 `name` 742 |
| 4.2% | `literature` | 0.0016 | 0.0241 | under | `header` 80 `write` 636 `text` 80 `prose` 110 |
| 3.7% | `linguistics` | 0.3029 | 0.2011 | **over** | `word` 1,424 `name` 655 `term` 314 `parse` 137 |
| 3.4% | `law` | 0.0949 | 0.0435 | **over** | `file` 455 `witness` 70 `summary` 55 `claim` 111 |

### `code-semantics-engine/src/main/java`

**3.9%** of the maximum divergence from the repository, against a null median of 1.6% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.7% | `electronics` | 0.0014 | 0.0164 | under | `tsv` 38 `field` 188 `headroom` 2 `bar` 101 |
| 10.0% | `chemistry` | 0.0019 | 0.0144 | under | `extraction` 51 `fraction` 9 `extract` 7 `test` 221 |
| 7.0% | `psychology` | 0.0015 | 0.0104 | under | `module` 71 `confidence` 20 `know` 70 `test` 221 |
| 4.2% | `animals` | 0.0004 | 0.0051 | under | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 3.9% | `calculus` | 0.0156 | 0.0062 | **over** | `divergence` 159 |
| 3.0% | `grammar` | 0.0467 | 0.0310 | **over** | `phrase` 151 `part_of_speech` 39 `occurrence` 180 `verb` 77 |
| 2.8% | `literature` | 0.0135 | 0.0241 | under | `header` 80 `write` 636 `text` 80 `prose` 110 |
| 2.4% | `plants` | 0.0186 | 0.0298 | under | `root` 145 `tree` 167 `seed` 25 `leaf` 20 |

### `code-semantics-engine/src/test/java`

**4.3%** of the maximum divergence from the repository, against a null median of 1.7% over 999 resamples of the same size — an excess of +2.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.2% | `electronics` | 0.0004 | 0.0164 | under | `tsv` 38 `field` 188 `headroom` 2 `bar` 101 |
| 13.8% | `plants` | 0.0699 | 0.0298 | **over** | `root` 145 `tree` 167 `seed` 25 `leaf` 20 |
| 4.7% | `animals` | 0.0002 | 0.0051 | under | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 4.4% | `chemistry` | 0.0046 | 0.0144 | under | `extraction` 51 `fraction` 9 `extract` 7 `test` 221 |
| 4.3% | `mathematics` | 0.0283 | 0.0481 | under | `from` 138 `function` 57 `distribution` 86 `lemma` 76 |
| 3.4% | `psychology` | 0.0032 | 0.0104 | under | `module` 71 `confidence` 20 `know` 70 `test` 221 |
| 3.3% | `publishing` | 0.0889 | 0.0645 | **over** | `publish` 277 `read` 154 `write` 637 `vocabulary` 152 |
| 3.1% | `computer-languages` | 0.0001 | 0.0032 | under | `json` 6 `sparql` 1 `owl` 22 `java` 62 |

### `lexicon-extraction/src/main/java`

**18.3%** of the maximum divergence from the repository, against a null median of 6.1% over 999 resamples of the same size — an excess of +12.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `linguistics` | 0.0916 | 0.2011 | under | `word` 1,424 `name` 655 `term` 314 `parse` 137 |
| 6.9% | `literature` | 0.0840 | 0.0241 | **over** | `header` 80 `write` 636 `text` 80 `prose` 110 |
| 6.8% | `grammar` | 0.0012 | 0.0310 | under | `phrase` 151 `part_of_speech` 39 `occurrence` 180 `verb` 77 |
| 6.4% | `animals` | 0.0414 | 0.0051 | **over** | `nest` 28 `owl` 22 `head` 13 `posterior` 6 |
| 5.8% | `plants` | 0.0019 | 0.0298 | under | `root` 145 `tree` 167 `seed` 25 `leaf` 20 |
| 5.1% | `electronics` | 0.0596 | 0.0164 | **over** | `tsv` 38 `field` 188 `headroom` 2 `bar` 101 |
| 4.5% | `computer-languages` | 0.0283 | 0.0032 | **over** | `json` 6 `sparql` 1 `owl` 22 `java` 62 |
| 4.0% | `physics` | 0.0009 | 0.0191 | under | `mass` 131 `weight` 68 `length` 50 `radius` 3 |

### `lexicon-extraction/src/test/java`

**21.6%** of the maximum divergence from the repository, against a null median of 7.5% over 999 resamples of the same size — an excess of +14.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.1% | `chemistry` | 0.1468 | 0.0144 | **over** | `extraction` 51 `fraction` 9 `extract` 7 `test` 221 |
| 16.3% | `electronics` | 0.1281 | 0.0164 | **over** | `tsv` 38 `field` 188 `headroom` 2 `bar` 101 |
| 5.5% | `linguistics` | 0.1019 | 0.2011 | under | `word` 1,424 `name` 655 `term` 314 `parse` 137 |
| 3.5% | `physics` | 0.0008 | 0.0191 | under | `mass` 131 `weight` 68 `length` 50 `radius` 3 |
| 2.7% | `person` | 0.0028 | 0.0213 | under | `reader` 130 `child` 20 `host` 29 `bearer` 18 |
| 2.6% | `psychology` | 0.0368 | 0.0104 | **over** | `module` 71 `confidence` 20 `know` 70 `test` 221 |
| 2.5% | `law` | 0.0146 | 0.0435 | under | `file` 455 `witness` 70 `summary` 55 `claim` 111 |
| 2.2% | `grammar` | 0.0086 | 0.0310 | under | `phrase` 151 `part_of_speech` 39 `occurrence` 180 `verb` 77 |

### `lexicon/src/main/java`

**19.5%** of the maximum divergence from the repository, against a null median of 11.2% over 999 resamples of the same size — an excess of +8.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.6% | `plants` | 0.0000 | 0.0298 | under | `root` 145 `tree` 167 `seed` 25 `leaf` 20 |
| 6.4% | `publishing` | 0.0143 | 0.0645 | under | `publish` 277 `read` 154 `write` 637 `vocabulary` 152 |
| 5.0% | `mathematics` | 0.1131 | 0.0481 | **over** | `from` 138 `function` 57 `distribution` 86 `lemma` 76 |
| 5.0% | `person` | 0.0693 | 0.0213 | **over** | `reader` 130 `child` 20 `host` 29 `bearer` 18 |
| 4.2% | `networking` | 0.0327 | 0.0051 | **over** | `resource` 254 `preamble` 7 `request` 11 `node` 68 |
| 4.1% | `grammar` | 0.0793 | 0.0310 | **over** | `phrase` 151 `part_of_speech` 39 `occurrence` 180 `verb` 77 |
| 4.0% | `physics` | 0.0006 | 0.0191 | under | `mass` 131 `weight` 68 `length` 50 `radius` 3 |
| 3.3% | `chemistry` | 0.0003 | 0.0144 | under | `extraction` 51 `fraction` 9 `extract` 7 `test` 221 |

### `lexicon/src/test/java`

**15.1%** of the maximum divergence from the repository, against a null median of 12.1% over 999 resamples of the same size — an excess of +3.0 points, and 59 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.4% | `plants` | 0.0002 | 0.0298 | under | `root` 145 `tree` 167 `seed` 25 `leaf` 20 |
| 8.5% | `linguistics` | 0.3387 | 0.2011 | **over** | `word` 1,424 `name` 655 `term` 314 `parse` 137 |
| 5.9% | `lexicography` | 0.0445 | 0.0095 | **over** | `citation` 96 `sense` 311 `gloss` 2 `lemma` 76 |
| 5.4% | `electronics` | 0.0000 | 0.0164 | under | `tsv` 38 `field` 188 `headroom` 2 `bar` 101 |
| 2.8% | `politics` | 0.0013 | 0.0137 | under | `vote` 53 `normalisation` 19 `reading` 604 `name` 742 |
| 2.7% | `chemistry` | 0.0018 | 0.0144 | under | `extraction` 51 `fraction` 9 `extract` 7 `test` 221 |
| 2.1% | `calculus` | 0.0000 | 0.0062 | under | `divergence` 159 |
| 2.0% | `information-science` | 0.0180 | 0.0046 | **over** | `synset` 26 `document` 65 `ontology` 104 `align` 1 |

### `documentation`

**24.4%** of the maximum divergence from the repository, against a null median of 34.9% over 999 resamples of the same size — an excess of -10.5 points, and 967 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 7.8 s, recorded rather than estimated.
