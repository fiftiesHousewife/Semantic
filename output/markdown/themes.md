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
| `linguistics` | 0.0511 | 80.4% | 4,134 | 159 | 12,680 | 33.8% | `word` 32.2% (1,500) `name` 15.3% (675) `term` 13.0% (361) `parse` 4.6% (142) |
| `computing` | 0.0133 | 81.4% | 6,228 | 28 | 1,606 | 4.3% | `repository` 7.2% (452) `read` 4.8% (849) `folder` 4.7% (33) `dictionary` 4.2% (224) |

Read over 510 files and 37,532 lines: 465 topics, 3 files no topic could be resolved for, and 33.8% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 23.8% of it; the other 76.2% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**15.9%** of the maximum divergence from the repository, against a null median of 9.6% over 999 resamples of the same size — an excess of +6.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.5% | `telecommunication` | 0.0002 | 0.0412 | under | `file` 63.5% (222) `entry` 30.4% (189) `copy` 2.4% (28) `note` 1.7% (6) |
| 7.5% | `plants` | 0.0018 | 0.0323 | under | `root` 53.0% (158) `tree` 39.3% (198) `seed` 4.9% (40) `leaf` 2.0% (32) |
| 7.4% | `publishing` | 0.0173 | 0.0686 | under | `publish` 26.1% (341) `read` 12.5% (164) `write` 12.1% (693) `vocabulary` 9.7% (178) |
| 5.5% | `time_period` | 0.0315 | 0.0040 | **over** | `span` 43.3% (18) `none` 25.8% (9) `long` 5.7% (23) `even` 5.2% (3) |
| 4.4% | `physics` | 0.0581 | 0.0200 | **over** | `mass` 47.9% (136) `weight` 27.6% (65) `length` 6.8% (72) `radius` 3.6% (2) |
| 3.7% | `politics` | 0.0427 | 0.0132 | **over** | `vote` 51.9% (53) `normalisation` 23.4% (22) `reading` 6.6% (656) `name` 5.5% (768) |
| 3.6% | `electronics` | 0.0007 | 0.0149 | under | `tsv` 86.7% (38) `field` 6.4% (198) `headroom` 3.2% (2) `bar` 1.3% (96) |
| 3.4% | `lexicography` | 0.0323 | 0.0085 | **over** | `citation` 87.0% (94) `sense` 10.0% (310) `lemma` 1.3% (78) `gloss` 1.1% (1) |

### `code-semantics-api/src/test/java`

**20.5%** of the maximum divergence from the repository, against a null median of 15.2% over 999 resamples of the same size — an excess of +5.3 points, and 33 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `telecommunication` | 0.0017 | 0.0412 | under | `file` 63.5% (222) `entry` 30.4% (189) `copy` 2.4% (28) `note` 1.7% (6) |
| 7.2% | `plants` | 0.0004 | 0.0323 | under | `root` 53.0% (158) `tree` 39.3% (198) `seed` 4.9% (40) `leaf` 2.0% (32) |
| 6.5% | `biology` | 0.0383 | 0.0027 | **over** | `morphology` 27.7% (19) `owl` 22.7% (24) `person` 8.7% (23) `glob` 7.8% (4) |
| 6.0% | `publishing` | 0.0167 | 0.0686 | under | `publish` 26.1% (341) `read` 12.5% (164) `write` 12.1% (693) `vocabulary` 9.7% (178) |
| 4.9% | `politics` | 0.0552 | 0.0132 | **over** | `vote` 51.9% (53) `normalisation` 23.4% (22) `reading` 6.6% (656) `name` 5.5% (768) |
| 3.8% | `literature` | 0.0016 | 0.0223 | under | `header` 36.3% (81) `write` 16.4% (692) `text` 12.4% (83) `prose` 8.5% (118) |
| 3.6% | `law` | 0.0949 | 0.0427 | **over** | `file` 10.7% (458) `witness` 9.5% (70) `summary` 8.4% (57) `verdict` 6.7% (10) |
| 3.6% | `linguistics` | 0.3029 | 0.2021 | **over** | `word` 32.2% (1,500) `name` 15.3% (675) `term` 13.0% (361) `parse` 4.6% (142) |

### `code-semantics-engine/src/main/java`

**3.4%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.2% | `electronics` | 0.0013 | 0.0149 | under | `tsv` 86.7% (38) `field` 6.4% (198) `headroom` 3.2% (2) `bar` 1.3% (96) |
| 11.7% | `chemistry` | 0.0019 | 0.0144 | under | `extraction` 33.1% (53) `fraction` 14.6% (13) `extract` 10.1% (7) `test` 8.2% (243) |
| 6.4% | `psychology` | 0.0015 | 0.0091 | under | `module` 81.8% (72) `confidence` 4.5% (18) `test` 3.7% (243) `know` 3.4% (74) |
| 4.6% | `animals` | 0.0004 | 0.0046 | under | `nest` 60.2% (28) `owl` 27.4% (24) `head` 6.8% (13) `posterior` 3.3% (5) |
| 3.7% | `calculus` | 0.0140 | 0.0059 | **over** | `divergence` 100.0% (154) |
| 2.6% | `literature` | 0.0131 | 0.0223 | under | `header` 36.3% (81) `write` 16.4% (692) `text` 12.4% (83) `prose` 8.5% (118) |
| 2.3% | `grammar` | 0.0403 | 0.0283 | **over** | `phrase` 21.3% (147) `occurrence` 15.9% (171) `part_of_speech` 15.0% (38) `verb` 13.7% (74) |
| 2.1% | `information-science` | 0.0011 | 0.0042 | under | `synset` 71.0% (26) `document` 22.6% (73) `ontology` 5.7% (116) `align` 0.4% (1) |

### `code-semantics-engine/src/test/java`

**3.6%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.6% | `electronics` | 0.0004 | 0.0149 | under | `tsv` 86.7% (38) `field` 6.4% (198) `headroom` 3.2% (2) `bar` 1.3% (96) |
| 13.1% | `plants` | 0.0684 | 0.0323 | **over** | `root` 53.0% (158) `tree` 39.3% (198) `seed` 4.9% (40) `leaf` 2.0% (32) |
| 3.6% | `psychology` | 0.0027 | 0.0091 | under | `module` 81.8% (72) `confidence` 4.5% (18) `test` 3.7% (243) `know` 3.4% (74) |
| 3.6% | `computer-languages` | 0.0001 | 0.0030 | under | `json` 73.7% (6) `sparql` 10.8% (1) `owl` 8.9% (24) `java` 4.5% (69) |
| 3.2% | `publishing` | 0.0911 | 0.0686 | **over** | `publish` 26.1% (341) `read` 12.5% (164) `write` 12.1% (693) `vocabulary` 9.7% (178) |
| 3.1% | `mathematics` | 0.0326 | 0.0485 | under | `from` 28.0% (150) `function` 10.4% (95) `lemma` 6.8% (78) `distribution` 6.8% (97) |
| 2.8% | `astrology` | 0.0174 | 0.0089 | **over** | `placement` 95.3% (107) `term` 1.6% (373) `figure` 1.3% (107) `descendant` 1.2% (7) |
| 2.3% | `politics` | 0.0065 | 0.0132 | under | `vote` 51.9% (53) `normalisation` 23.4% (22) `reading` 6.6% (656) `name` 5.5% (768) |

### `lexicon-extraction/src/main/java`

**18.7%** of the maximum divergence from the repository, against a null median of 5.9% over 999 resamples of the same size — an excess of +12.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.4% | `linguistics` | 0.0852 | 0.2021 | under | `word` 32.2% (1,500) `name` 15.3% (675) `term` 13.0% (361) `parse` 4.6% (142) |
| 7.3% | `literature` | 0.0837 | 0.0223 | **over** | `header` 36.3% (81) `write` 16.4% (692) `text` 12.4% (83) `prose` 8.5% (118) |
| 6.3% | `plants` | 0.0019 | 0.0323 | under | `root` 53.0% (158) `tree` 39.3% (198) `seed` 4.9% (40) `leaf` 2.0% (32) |
| 5.9% | `grammar` | 0.0012 | 0.0283 | under | `phrase` 21.3% (147) `occurrence` 15.9% (171) `part_of_speech` 15.0% (38) `verb` 13.7% (74) |
| 5.5% | `electronics` | 0.0596 | 0.0149 | **over** | `tsv` 86.7% (38) `field` 6.4% (198) `headroom` 3.2% (2) `bar` 1.3% (96) |
| 5.0% | `animals` | 0.0348 | 0.0046 | **over** | `nest` 60.2% (28) `owl` 27.4% (24) `head` 6.8% (13) `posterior` 3.3% (5) |
| 4.6% | `computer-languages` | 0.0285 | 0.0030 | **over** | `json` 73.7% (6) `sparql` 10.8% (1) `owl` 8.9% (24) `java` 4.5% (69) |
| 4.0% | `physics` | 0.0010 | 0.0200 | under | `mass` 47.9% (136) `weight` 27.6% (65) `length` 6.8% (72) `radius` 3.6% (2) |

### `lexicon-extraction/src/test/java`

**21.9%** of the maximum divergence from the repository, against a null median of 7.1% over 999 resamples of the same size — an excess of +14.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.0% | `chemistry` | 0.1427 | 0.0144 | **over** | `extraction` 33.1% (53) `fraction` 14.6% (13) `extract` 10.1% (7) `test` 8.2% (243) |
| 16.1% | `electronics` | 0.1242 | 0.0149 | **over** | `tsv` 86.7% (38) `field` 6.4% (198) `headroom` 3.2% (2) `bar` 1.3% (96) |
| 5.9% | `linguistics` | 0.0990 | 0.2021 | under | `word` 32.2% (1,500) `name` 15.3% (675) `term` 13.0% (361) `parse` 4.6% (142) |
| 3.7% | `physics` | 0.0007 | 0.0200 | under | `mass` 47.9% (136) `weight` 27.6% (65) `length` 6.8% (72) `radius` 3.6% (2) |
| 3.0% | `person` | 0.0027 | 0.0230 | under | `reader` 26.6% (136) `child` 14.2% (22) `host` 10.1% (29) `bearer` 7.2% (18) |
| 2.8% | `psychology` | 0.0357 | 0.0091 | **over** | `module` 81.8% (72) `confidence` 4.5% (18) `test` 3.7% (243) `know` 3.4% (74) |
| 2.5% | `law` | 0.0142 | 0.0427 | under | `file` 10.7% (458) `witness` 9.5% (70) `summary` 8.4% (57) `verdict` 6.7% (10) |
| 2.0% | `astrology` | 0.0000 | 0.0089 | under | `placement` 95.3% (107) `term` 1.6% (373) `figure` 1.3% (107) `descendant` 1.2% (7) |

### `lexicon/src/main/java`

**19.3%** of the maximum divergence from the repository, against a null median of 10.6% over 999 resamples of the same size — an excess of +8.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `plants` | 0.0000 | 0.0323 | under | `root` 53.0% (158) `tree` 39.3% (198) `seed` 4.9% (40) `leaf` 2.0% (32) |
| 6.1% | `publishing` | 0.0175 | 0.0686 | under | `publish` 26.1% (341) `read` 12.5% (164) `write` 12.1% (693) `vocabulary` 9.7% (178) |
| 4.3% | `physics` | 0.0006 | 0.0200 | under | `mass` 47.9% (136) `weight` 27.6% (65) `length` 6.8% (72) `radius` 3.6% (2) |
| 4.2% | `person` | 0.0673 | 0.0230 | **over** | `reader` 26.6% (136) `child` 14.2% (22) `host` 10.1% (29) `bearer` 7.2% (18) |
| 4.1% | `linguistics` | 0.3075 | 0.2021 | **over** | `word` 32.2% (1,500) `name` 15.3% (675) `term` 13.0% (361) `parse` 4.6% (142) |
| 3.9% | `networking` | 0.0307 | 0.0050 | **over** | `resource` 69.6% (254) `preamble` 9.0% (8) `request` 6.4% (9) `node` 6.0% (70) |
| 3.8% | `grammar` | 0.0726 | 0.0283 | **over** | `phrase` 21.3% (147) `occurrence` 15.9% (171) `part_of_speech` 15.0% (38) `verb` 13.7% (74) |
| 3.6% | `mathematics` | 0.1014 | 0.0485 | **over** | `from` 28.0% (150) `function` 10.4% (95) `lemma` 6.8% (78) `distribution` 6.8% (97) |

### `lexicon/src/test/java`

**13.6%** of the maximum divergence from the repository, against a null median of 10.9% over 999 resamples of the same size — an excess of +2.6 points, and 75 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.4% | `plants` | 0.0002 | 0.0323 | under | `root` 53.0% (158) `tree` 39.3% (198) `seed` 4.9% (40) `leaf` 2.0% (32) |
| 5.7% | `linguistics` | 0.3064 | 0.2021 | **over** | `word` 32.2% (1,500) `name` 15.3% (675) `term` 13.0% (361) `parse` 4.6% (142) |
| 5.7% | `lexicography` | 0.0393 | 0.0085 | **over** | `citation` 87.0% (94) `sense` 10.0% (310) `lemma` 1.3% (78) `gloss` 1.1% (1) |
| 5.4% | `electronics` | 0.0000 | 0.0149 | under | `tsv` 86.7% (38) `field` 6.4% (198) `headroom` 3.2% (2) `bar` 1.3% (96) |
| 3.2% | `astrology` | 0.0000 | 0.0089 | under | `placement` 95.3% (107) `term` 1.6% (373) `figure` 1.3% (107) `descendant` 1.2% (7) |
| 2.5% | `chemistry` | 0.0024 | 0.0144 | under | `extraction` 33.1% (53) `fraction` 14.6% (13) `extract` 10.1% (7) `test` 8.2% (243) |
| 2.4% | `administration` | 0.0001 | 0.0071 | under | `branch` 69.3% (138) `foreign` 10.7% (11) `title` 9.6% (12) `english` 4.1% (75) |
| 2.2% | `calculus` | 0.0000 | 0.0059 | under | `divergence` 100.0% (154) |

### `documentation`

**23.6%** of the maximum divergence from the repository, against a null median of 34.6% over 999 resamples of the same size — an excess of -10.9 points, and 968 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.3 s, recorded rather than estimated.
