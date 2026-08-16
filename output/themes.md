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
| `linguistics` | 0.0516 | 80.1% | 3,621 | 129 | 10,402 | 33.5% | `word`&nbsp;1,324 `name`&nbsp;570 `term`&nbsp;266 `parse`&nbsp;122 |
| `computing` | 0.0123 | 82.5% | 5,164 | 21 | 1,362 | 4.4% | `repository`&nbsp;379 `parse`&nbsp;122 `dictionary`&nbsp;206 `read`&nbsp;698 |
| `grammar` | 0.0090 | 89.2% | 2,013 | 17 | 1,299 | 4.2% | `phrase`&nbsp;146 `part_of_speech`&nbsp;39 `occurrence`&nbsp;143 `verb`&nbsp;75 |

Read over 419 files and 31,044 lines: 459 topics, 1 files no topic could be resolved for, and 33.5% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1538 bits** from the repository, against a null median of 0.0971 over 999 resamples of the same size — an excess of +0.0567, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.5% | `telecommunication` | 0.0002 | 0.0397 | under | `file`&nbsp;200 `entry`&nbsp;168 `note`&nbsp;7 `record`&nbsp;3 |
| 7.4% | `plants` | 0.0018 | 0.0310 | under | `root`&nbsp;135 `tree`&nbsp;141 `seed`&nbsp;22 `leaf`&nbsp;19 |
| 6.9% | `publishing` | 0.0171 | 0.0644 | under | `publish`&nbsp;248 `read`&nbsp;147 `write`&nbsp;536 `vocabulary`&nbsp;138 |
| 5.9% | `physics` | 0.0665 | 0.0208 | **over** | `mass`&nbsp;130 `weight`&nbsp;59 `radius`&nbsp;5 `length`&nbsp;41 |
| 4.9% | `time_period` | 0.0292 | 0.0043 | **over** | `span`&nbsp;15 `none`&nbsp;5 `even`&nbsp;4 `longest`&nbsp;16 |
| 4.6% | `electronics` | 0.0008 | 0.0181 | under | `tsv`&nbsp;38 `field`&nbsp;163 `headroom`&nbsp;2 `bar`&nbsp;89 |
| 3.2% | `lexicography` | 0.0349 | 0.0105 | **over** | `citation`&nbsp;94 `sense`&nbsp;306 `gloss`&nbsp;2 `lemma`&nbsp;72 |
| 2.9% | `philosophy` | 0.0001 | 0.0095 | under | `lemma`&nbsp;72 `describe`&nbsp;37 `each`&nbsp;37 `explain`&nbsp;16 |

### `code-semantics-api/src/test/java`

**0.2013 bits** from the repository, against a null median of 0.1550 over 999 resamples of the same size — an excess of +0.0463, and 39 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.8% | `telecommunication` | 0.0017 | 0.0397 | under | `file`&nbsp;200 `entry`&nbsp;168 `note`&nbsp;7 `record`&nbsp;3 |
| 7.0% | `plants` | 0.0004 | 0.0310 | under | `root`&nbsp;135 `tree`&nbsp;141 `seed`&nbsp;22 `leaf`&nbsp;19 |
| 6.7% | `biology` | 0.0383 | 0.0026 | **over** | `morphology`&nbsp;19 `owl`&nbsp;21 `person`&nbsp;19 `glob`&nbsp;5 |
| 5.4% | `publishing` | 0.0167 | 0.0644 | under | `publish`&nbsp;248 `read`&nbsp;147 `write`&nbsp;536 `vocabulary`&nbsp;138 |
| 4.6% | `politics` | 0.0552 | 0.0144 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;12 `reading`&nbsp;532 `name`&nbsp;651 |
| 4.5% | `literature` | 0.0016 | 0.0252 | under | `header`&nbsp;71 `write`&nbsp;536 `text`&nbsp;54 `prose`&nbsp;94 |
| 3.9% | `law` | 0.0949 | 0.0412 | **over** | `file`&nbsp;391 `witness`&nbsp;66 `within`&nbsp;9 `summary`&nbsp;34 |
| 3.8% | `electronics` | 0.0005 | 0.0181 | under | `tsv`&nbsp;38 `field`&nbsp;163 `headroom`&nbsp;2 `bar`&nbsp;89 |

### `code-semantics-engine/src/main/java`

**0.0471 bits** from the repository, against a null median of 0.0191 over 999 resamples of the same size — an excess of +0.0280, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.9% | `electronics` | 0.0018 | 0.0181 | under | `tsv`&nbsp;38 `field`&nbsp;163 `headroom`&nbsp;2 `bar`&nbsp;89 |
| 9.4% | `chemistry` | 0.0019 | 0.0157 | under | `extraction`&nbsp;49 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;197 |
| 6.9% | `psychology` | 0.0013 | 0.0114 | under | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;66 `test`&nbsp;197 |
| 6.0% | `information-science` | 0.0001 | 0.0061 | under | `synset`&nbsp;26 `document`&nbsp;59 `ontology`&nbsp;103 `align`&nbsp;1 |
| 4.0% | `grammar` | 0.0541 | 0.0328 | **over** | `phrase`&nbsp;146 `part_of_speech`&nbsp;39 `occurrence`&nbsp;143 `verb`&nbsp;75 |
| 3.5% | `animals` | 0.0006 | 0.0056 | under | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;13 `posterior`&nbsp;6 |
| 2.8% | `computer-languages` | 0.0001 | 0.0032 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;53 |
| 2.6% | `linguistics` | 0.2414 | 0.2025 | **over** | `word`&nbsp;1,324 `name`&nbsp;570 `term`&nbsp;266 `parse`&nbsp;122 |

### `code-semantics-engine/src/test/java`

**0.0472 bits** from the repository, against a null median of 0.0188 over 999 resamples of the same size — an excess of +0.0284, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `electronics` | 0.0004 | 0.0181 | under | `tsv`&nbsp;38 `field`&nbsp;163 `headroom`&nbsp;2 `bar`&nbsp;89 |
| 14.0% | `plants` | 0.0744 | 0.0310 | **over** | `root`&nbsp;135 `tree`&nbsp;141 `seed`&nbsp;22 `leaf`&nbsp;19 |
| 4.8% | `animals` | 0.0002 | 0.0056 | under | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;13 `posterior`&nbsp;6 |
| 4.7% | `chemistry` | 0.0048 | 0.0157 | under | `extraction`&nbsp;49 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;197 |
| 3.7% | `publishing` | 0.0919 | 0.0644 | **over** | `publish`&nbsp;248 `read`&nbsp;147 `write`&nbsp;536 `vocabulary`&nbsp;138 |
| 3.4% | `mathematics` | 0.0309 | 0.0498 | under | `from`&nbsp;136 `function`&nbsp;58 `distribution`&nbsp;76 `lemma`&nbsp;72 |
| 3.4% | `psychology` | 0.0035 | 0.0114 | under | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;66 `test`&nbsp;197 |
| 2.5% | `computer-languages` | 0.0002 | 0.0032 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;53 |

### `lexicon-extraction/src/main/java`

**0.1807 bits** from the repository, against a null median of 0.0593 over 999 resamples of the same size — an excess of +0.1214, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `linguistics` | 0.0916 | 0.2025 | under | `word`&nbsp;1,324 `name`&nbsp;570 `term`&nbsp;266 `parse`&nbsp;122 |
| 7.4% | `grammar` | 0.0012 | 0.0328 | under | `phrase`&nbsp;146 `part_of_speech`&nbsp;39 `occurrence`&nbsp;143 `verb`&nbsp;75 |
| 6.7% | `literature` | 0.0840 | 0.0252 | **over** | `header`&nbsp;71 `write`&nbsp;536 `text`&nbsp;54 `prose`&nbsp;94 |
| 6.2% | `plants` | 0.0019 | 0.0310 | under | `root`&nbsp;135 `tree`&nbsp;141 `seed`&nbsp;22 `leaf`&nbsp;19 |
| 6.1% | `animals` | 0.0414 | 0.0056 | **over** | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;13 `posterior`&nbsp;6 |
| 4.7% | `electronics` | 0.0596 | 0.0181 | **over** | `tsv`&nbsp;38 `field`&nbsp;163 `headroom`&nbsp;2 `bar`&nbsp;89 |
| 4.6% | `computer-languages` | 0.0283 | 0.0032 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;53 |
| 4.5% | `physics` | 0.0009 | 0.0208 | under | `mass`&nbsp;130 `weight`&nbsp;59 `radius`&nbsp;5 `length`&nbsp;41 |

### `lexicon-extraction/src/test/java`

**0.2118 bits** from the repository, against a null median of 0.0737 over 999 resamples of the same size — an excess of +0.1381, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.8% | `chemistry` | 0.1468 | 0.0157 | **over** | `extraction`&nbsp;49 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;197 |
| 15.9% | `electronics` | 0.1281 | 0.0181 | **over** | `tsv`&nbsp;38 `field`&nbsp;163 `headroom`&nbsp;2 `bar`&nbsp;89 |
| 5.8% | `linguistics` | 0.1019 | 0.2025 | under | `word`&nbsp;1,324 `name`&nbsp;570 `term`&nbsp;266 `parse`&nbsp;122 |
| 4.0% | `physics` | 0.0008 | 0.0208 | under | `mass`&nbsp;130 `weight`&nbsp;59 `radius`&nbsp;5 `length`&nbsp;41 |
| 2.8% | `person` | 0.0028 | 0.0214 | under | `reader`&nbsp;119 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 2.6% | `grammar` | 0.0086 | 0.0328 | under | `phrase`&nbsp;146 `part_of_speech`&nbsp;39 `occurrence`&nbsp;143 `verb`&nbsp;75 |
| 2.4% | `psychology` | 0.0368 | 0.0114 | **over** | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;66 `test`&nbsp;197 |
| 2.2% | `law` | 0.0146 | 0.0412 | under | `file`&nbsp;391 `witness`&nbsp;66 `within`&nbsp;9 `summary`&nbsp;34 |

### `lexicon/src/main/java`

**0.1881 bits** from the repository, against a null median of 0.1111 over 999 resamples of the same size — an excess of +0.0770, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.2% | `plants` | 0.0000 | 0.0310 | under | `root`&nbsp;135 `tree`&nbsp;141 `seed`&nbsp;22 `leaf`&nbsp;19 |
| 6.6% | `publishing` | 0.0143 | 0.0644 | under | `publish`&nbsp;248 `read`&nbsp;147 `write`&nbsp;536 `vocabulary`&nbsp;138 |
| 5.1% | `person` | 0.0693 | 0.0214 | **over** | `reader`&nbsp;119 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 4.8% | `mathematics` | 0.1131 | 0.0498 | **over** | `from`&nbsp;136 `function`&nbsp;58 `distribution`&nbsp;76 `lemma`&nbsp;72 |
| 4.6% | `physics` | 0.0006 | 0.0208 | under | `mass`&nbsp;130 `weight`&nbsp;59 `radius`&nbsp;5 `length`&nbsp;41 |
| 4.3% | `networking` | 0.0327 | 0.0052 | **over** | `resource`&nbsp;242 `preamble`&nbsp;7 `request`&nbsp;11 `node`&nbsp;70 |
| 3.8% | `grammar` | 0.0793 | 0.0328 | **over** | `phrase`&nbsp;146 `part_of_speech`&nbsp;39 `occurrence`&nbsp;143 `verb`&nbsp;75 |
| 3.7% | `chemistry` | 0.0003 | 0.0157 | under | `extraction`&nbsp;49 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;197 |

### `lexicon/src/test/java`

**0.1450 bits** from the repository, against a null median of 0.1186 over 999 resamples of the same size — an excess of +0.0263, and 77 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.2% | `plants` | 0.0002 | 0.0310 | under | `root`&nbsp;135 `tree`&nbsp;141 `seed`&nbsp;22 `leaf`&nbsp;19 |
| 8.6% | `linguistics` | 0.3387 | 0.2025 | **over** | `word`&nbsp;1,324 `name`&nbsp;570 `term`&nbsp;266 `parse`&nbsp;122 |
| 6.2% | `electronics` | 0.0000 | 0.0181 | under | `tsv`&nbsp;38 `field`&nbsp;163 `headroom`&nbsp;2 `bar`&nbsp;89 |
| 5.6% | `lexicography` | 0.0445 | 0.0105 | **over** | `citation`&nbsp;94 `sense`&nbsp;306 `gloss`&nbsp;2 `lemma`&nbsp;72 |
| 3.2% | `politics` | 0.0013 | 0.0144 | under | `vote`&nbsp;53 `normalisation`&nbsp;12 `reading`&nbsp;532 `name`&nbsp;651 |
| 3.2% | `chemistry` | 0.0018 | 0.0157 | under | `extraction`&nbsp;49 `fraction`&nbsp;8 `extract`&nbsp;7 `test`&nbsp;197 |
| 2.1% | `military` | 0.0025 | 0.0138 | under | `repository`&nbsp;379 `base`&nbsp;49 `column`&nbsp;45 `refuse`&nbsp;130 |
| 2.0% | `psychology` | 0.0018 | 0.0114 | under | `module`&nbsp;72 `confidence`&nbsp;20 `know`&nbsp;66 `test`&nbsp;197 |

### `documentation`

**0.2325 bits** from the repository, against a null median of 0.3457 over 999 resamples of the same size — an excess of -0.1131, and 972 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 7.3 s, recorded rather than estimated.
