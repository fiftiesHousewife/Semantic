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
| `linguistics` | 0.0515 | 80.2% | 3,390 | 125 | 10,036 | 33.2% | `word`&nbsp;1,263 `name`&nbsp;551 `term`&nbsp;263 `parse`&nbsp;120 |
| `computing` | 0.0126 | 81.9% | 5,046 | 21 | 1,361 | 4.5% | `repository`&nbsp;366 `dictionary`&nbsp;200 `parse`&nbsp;120 `read`&nbsp;682 |
| `grammar` | 0.0091 | 88.8% | 1,948 | 17 | 1,299 | 4.3% | `phrase`&nbsp;143 `part_of_speech`&nbsp;39 `occurrence`&nbsp;137 `verb`&nbsp;66 |

Read over 411 files and 30,198 lines: 460 topics, 1 files no topic could be resolved for, and 33.2% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.2% of it; the other 75.8% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1538 bits** from the repository, against a null median of 0.0966 over 999 resamples of the same size — an excess of +0.0572, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.7% | `telecommunication` | 0.0002 | 0.0404 | under | `file`&nbsp;199 `entry`&nbsp;166 `note`&nbsp;7 `record`&nbsp;3 |
| 7.5% | `plants` | 0.0018 | 0.0313 | under | `root`&nbsp;133 `tree`&nbsp;140 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 7.1% | `publishing` | 0.0171 | 0.0654 | under | `publish`&nbsp;244 `read`&nbsp;145 `write`&nbsp;511 `vocabulary`&nbsp;132 |
| 6.0% | `physics` | 0.0664 | 0.0206 | **over** | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;39 |
| 5.2% | `time_period` | 0.0292 | 0.0038 | **over** | `span`&nbsp;15 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;16 |
| 4.6% | `electronics` | 0.0008 | 0.0180 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;28 `node`&nbsp;64 |
| 3.1% | `lexicography` | 0.0347 | 0.0107 | **over** | `citation`&nbsp;93 `sense`&nbsp;306 `gloss`&nbsp;2 `lemma`&nbsp;72 |
| 2.9% | `philosophy` | 0.0001 | 0.0095 | under | `lemma`&nbsp;72 `describe`&nbsp;34 `each`&nbsp;34 `explain`&nbsp;11 |

### `code-semantics-api/src/test/java`

**0.2012 bits** from the repository, against a null median of 0.1552 over 999 resamples of the same size — an excess of +0.0460, and 38 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.9% | `telecommunication` | 0.0017 | 0.0404 | under | `file`&nbsp;199 `entry`&nbsp;166 `note`&nbsp;7 `record`&nbsp;3 |
| 7.1% | `plants` | 0.0004 | 0.0313 | under | `root`&nbsp;133 `tree`&nbsp;140 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 6.6% | `biology` | 0.0384 | 0.0027 | **over** | `morphology`&nbsp;17 `owl`&nbsp;21 `person`&nbsp;19 `glob`&nbsp;5 |
| 5.5% | `publishing` | 0.0167 | 0.0654 | under | `publish`&nbsp;244 `read`&nbsp;145 `write`&nbsp;511 `vocabulary`&nbsp;132 |
| 4.6% | `literature` | 0.0016 | 0.0257 | under | `header`&nbsp;71 `write`&nbsp;511 `text`&nbsp;52 `prose`&nbsp;94 |
| 4.5% | `politics` | 0.0552 | 0.0147 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;12 `reading`&nbsp;520 `name`&nbsp;630 |
| 3.9% | `law` | 0.0950 | 0.0412 | **over** | `file`&nbsp;386 `witness`&nbsp;66 `summary`&nbsp;34 `evidence`&nbsp;118 |
| 3.8% | `linguistics` | 0.3037 | 0.2005 | **over** | `word`&nbsp;1,263 `name`&nbsp;551 `term`&nbsp;263 `parse`&nbsp;120 |

### `code-semantics-engine/src/main/java`

**0.0483 bits** from the repository, against a null median of 0.0194 over 999 resamples of the same size — an excess of +0.0289, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.7% | `electronics` | 0.0005 | 0.0180 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;28 `node`&nbsp;64 |
| 9.3% | `chemistry` | 0.0020 | 0.0160 | under | `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;193 |
| 6.9% | `psychology` | 0.0014 | 0.0116 | under | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;64 `test`&nbsp;193 |
| 5.1% | `information-science` | 0.0001 | 0.0053 | under | `synset`&nbsp;26 `document`&nbsp;54 `ontology`&nbsp;103 `align`&nbsp;1 |
| 4.0% | `grammar` | 0.0545 | 0.0329 | **over** | `phrase`&nbsp;143 `part_of_speech`&nbsp;39 `occurrence`&nbsp;137 `verb`&nbsp;66 |
| 3.5% | `animals` | 0.0006 | 0.0057 | under | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;13 `posterior`&nbsp;6 |
| 2.8% | `computer-languages` | 0.0001 | 0.0033 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;50 |
| 2.7% | `linguistics` | 0.2407 | 0.2005 | **over** | `word`&nbsp;1,263 `name`&nbsp;551 `term`&nbsp;263 `parse`&nbsp;120 |

### `code-semantics-engine/src/test/java`

**0.0480 bits** from the repository, against a null median of 0.0192 over 999 resamples of the same size — an excess of +0.0289, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `electronics` | 0.0003 | 0.0180 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;28 `node`&nbsp;64 |
| 14.8% | `plants` | 0.0768 | 0.0313 | **over** | `root`&nbsp;133 `tree`&nbsp;140 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 4.8% | `animals` | 0.0002 | 0.0057 | under | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;13 `posterior`&nbsp;6 |
| 4.6% | `publishing` | 0.0968 | 0.0654 | **over** | `publish`&nbsp;244 `read`&nbsp;145 `write`&nbsp;511 `vocabulary`&nbsp;132 |
| 4.6% | `chemistry` | 0.0050 | 0.0160 | under | `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;193 |
| 3.6% | `mathematics` | 0.0304 | 0.0498 | under | `from`&nbsp;129 `function`&nbsp;58 `distribution`&nbsp;74 `lemma`&nbsp;72 |
| 3.4% | `psychology` | 0.0036 | 0.0116 | under | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;64 `test`&nbsp;193 |
| 2.6% | `computer-languages` | 0.0002 | 0.0033 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;50 |

### `lexicon-extraction/src/main/java`

**0.1786 bits** from the repository, against a null median of 0.0585 over 999 resamples of the same size — an excess of +0.1200, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `linguistics` | 0.0915 | 0.2005 | under | `word`&nbsp;1,263 `name`&nbsp;551 `term`&nbsp;263 `parse`&nbsp;120 |
| 7.5% | `grammar` | 0.0012 | 0.0329 | under | `phrase`&nbsp;143 `part_of_speech`&nbsp;39 `occurrence`&nbsp;137 `verb`&nbsp;66 |
| 6.7% | `literature` | 0.0848 | 0.0257 | **over** | `header`&nbsp;71 `write`&nbsp;511 `text`&nbsp;52 `prose`&nbsp;94 |
| 6.4% | `plants` | 0.0019 | 0.0313 | under | `root`&nbsp;133 `tree`&nbsp;140 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 6.1% | `animals` | 0.0412 | 0.0057 | **over** | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;13 `posterior`&nbsp;6 |
| 4.7% | `electronics` | 0.0591 | 0.0180 | **over** | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;28 `node`&nbsp;64 |
| 4.6% | `computer-languages` | 0.0283 | 0.0033 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;50 |
| 4.5% | `physics` | 0.0009 | 0.0206 | under | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;39 |

### `lexicon-extraction/src/test/java`

**0.2108 bits** from the repository, against a null median of 0.0732 over 999 resamples of the same size — an excess of +0.1377, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.7% | `chemistry` | 0.1468 | 0.0160 | **over** | `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;193 |
| 16.0% | `electronics` | 0.1281 | 0.0180 | **over** | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;28 `node`&nbsp;64 |
| 5.7% | `linguistics` | 0.1011 | 0.2005 | under | `word`&nbsp;1,263 `name`&nbsp;551 `term`&nbsp;263 `parse`&nbsp;120 |
| 3.9% | `physics` | 0.0008 | 0.0206 | under | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;39 |
| 2.9% | `person` | 0.0028 | 0.0217 | under | `reader`&nbsp;116 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 2.6% | `grammar` | 0.0086 | 0.0329 | under | `phrase`&nbsp;143 `part_of_speech`&nbsp;39 `occurrence`&nbsp;137 `verb`&nbsp;66 |
| 2.4% | `psychology` | 0.0368 | 0.0116 | **over** | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;64 `test`&nbsp;193 |
| 2.3% | `lexicography` | 0.0002 | 0.0107 | under | `citation`&nbsp;93 `sense`&nbsp;306 `gloss`&nbsp;2 `lemma`&nbsp;72 |

### `lexicon/src/main/java`

**0.1881 bits** from the repository, against a null median of 0.1096 over 999 resamples of the same size — an excess of +0.0785, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `plants` | 0.0000 | 0.0313 | under | `root`&nbsp;133 `tree`&nbsp;140 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 6.8% | `publishing` | 0.0144 | 0.0654 | under | `publish`&nbsp;244 `read`&nbsp;145 `write`&nbsp;511 `vocabulary`&nbsp;132 |
| 5.0% | `person` | 0.0693 | 0.0217 | **over** | `reader`&nbsp;116 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 4.8% | `mathematics` | 0.1131 | 0.0498 | **over** | `from`&nbsp;129 `function`&nbsp;58 `distribution`&nbsp;74 `lemma`&nbsp;72 |
| 4.6% | `physics` | 0.0006 | 0.0206 | under | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;39 |
| 4.2% | `networking` | 0.0326 | 0.0053 | **over** | `resource`&nbsp;238 `preamble`&nbsp;7 `request`&nbsp;11 `node`&nbsp;64 |
| 3.8% | `chemistry` | 0.0003 | 0.0160 | under | `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;193 |
| 3.5% | `grammar` | 0.0771 | 0.0329 | **over** | `phrase`&nbsp;143 `part_of_speech`&nbsp;39 `occurrence`&nbsp;137 `verb`&nbsp;66 |

### `lexicon/src/test/java`

**0.1453 bits** from the repository, against a null median of 0.1173 over 999 resamples of the same size — an excess of +0.0280, and 76 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.2% | `plants` | 0.0002 | 0.0313 | under | `root`&nbsp;133 `tree`&nbsp;140 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 8.9% | `linguistics` | 0.3389 | 0.2005 | **over** | `word`&nbsp;1,263 `name`&nbsp;551 `term`&nbsp;263 `parse`&nbsp;120 |
| 6.1% | `electronics` | 0.0000 | 0.0180 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;28 `node`&nbsp;64 |
| 5.8% | `lexicography` | 0.0457 | 0.0107 | **over** | `citation`&nbsp;93 `sense`&nbsp;306 `gloss`&nbsp;2 `lemma`&nbsp;72 |
| 3.3% | `politics` | 0.0013 | 0.0147 | under | `vote`&nbsp;53 `normalisation`&nbsp;12 `reading`&nbsp;520 `name`&nbsp;630 |
| 3.3% | `chemistry` | 0.0017 | 0.0160 | under | `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;193 |
| 2.0% | `psychology` | 0.0017 | 0.0116 | under | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;64 `test`&nbsp;193 |
| 2.0% | `military` | 0.0030 | 0.0142 | under | `repository`&nbsp;366 `base`&nbsp;47 `column`&nbsp;45 `refuse`&nbsp;128 |

### `documentation`

**0.2402 bits** from the repository, against a null median of 0.3442 over 999 resamples of the same size — an excess of -0.1040, and 969 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 6.9 s, recorded rather than estimated.
