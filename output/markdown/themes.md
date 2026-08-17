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
| `linguistics` | 0.0510 | 80.4% | 4,314 | 156 | 12,697 | 33.8% | `word` 32.1% (1,550) `name` 15.7% (713) `term` 12.7% (365) `parse` 4.9% (149) |
| `computing` | 0.0131 | 81.6% | 6,480 | 26 | 1,555 | 4.1% | `repository` 7.5% (485) `folder` 4.5% (33) `read` 4.5% (876) `dictionary` 4.1% (230) |

Read over 505 files and 37,579 lines: 467 topics, 1 files no topic could be resolved for, and 33.8% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 23.9% of it; the other 76.1% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.0%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +6.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.3% | `telecommunication` | 0.0002 | 0.0406 | under | `file` 65.1% (241) `entry` 28.8% (190) `copy` 2.3% (27) `note` 2.0% (7) |
| 7.6% | `publishing` | 0.0171 | 0.0691 | under | `publish` 25.9% (343) `read` 12.8% (171) `write` 12.2% (730) `vocabulary` 9.9% (186) |
| 7.4% | `plants` | 0.0018 | 0.0320 | under | `root` 55.2% (164) `tree` 37.0% (198) `seed` 5.1% (38) `leaf` 1.9% (31) |
| 5.5% | `physics` | 0.0665 | 0.0213 | **over** | `mass` 49.3% (150) `weight` 29.4% (73) `length` 5.7% (74) `radius` 3.2% (3) |
| 4.9% | `time_period` | 0.0292 | 0.0040 | **over** | `span` 46.4% (19) `none` 24.4% (9) `long` 5.4% (27) `even` 4.9% (3) |
| 3.8% | `lexicography` | 0.0349 | 0.0087 | **over** | `citation` 85.6% (97) `sense` 10.8% (323) `gloss` 1.7% (2) `lemma` 1.3% (81) |
| 3.6% | `electronics` | 0.0008 | 0.0150 | under | `tsv` 86.7% (38) `field` 6.5% (207) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 2.7% | `astrology` | 0.0000 | 0.0088 | under | `placement` 95.5% (107) `term` 1.5% (376) `figure` 1.2% (111) `descendant` 1.1% (7) |

### `code-semantics-api/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 15.4% over 999 resamples of the same size — an excess of +5.1 points, and 36 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.8% | `telecommunication` | 0.0017 | 0.0406 | under | `file` 65.1% (241) `entry` 28.8% (190) `copy` 2.3% (27) `note` 2.0% (7) |
| 7.1% | `plants` | 0.0004 | 0.0320 | under | `root` 55.2% (164) `tree` 37.0% (198) `seed` 5.1% (38) `leaf` 1.9% (31) |
| 6.7% | `biology` | 0.0383 | 0.0024 | **over** | `morphology` 28.4% (19) `owl` 20.3% (22) `person` 9.0% (23) `glob` 8.0% (5) |
| 6.0% | `publishing` | 0.0167 | 0.0691 | under | `publish` 25.9% (343) `read` 12.8% (171) `write` 12.2% (730) `vocabulary` 9.9% (186) |
| 5.0% | `politics` | 0.0552 | 0.0127 | **over** | `vote` 51.0% (53) `normalisation` 23.9% (23) `reading` 6.4% (673) `name` 5.3% (805) |
| 3.8% | `literature` | 0.0016 | 0.0227 | under | `header` 34.6% (82) `write` 16.7% (729) `text` 12.1% (85) `prose` 8.2% (126) |
| 3.6% | `law` | 0.0949 | 0.0422 | **over** | `file` 11.3% (492) `witness` 9.5% (73) `summary` 8.4% (58) `claim` 6.6% (112) |
| 3.6% | `linguistics` | 0.3029 | 0.2017 | **over** | `word` 32.1% (1,550) `name` 15.7% (713) `term` 12.7% (365) `parse` 4.9% (149) |

### `code-semantics-engine/src/main/java`

**3.4%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.5% | `electronics` | 0.0012 | 0.0150 | under | `tsv` 86.7% (38) `field` 6.5% (207) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 11.6% | `chemistry` | 0.0019 | 0.0144 | under | `extraction` 33.0% (56) `fraction` 14.5% (13) `extract` 10.0% (7) `test` 8.2% (246) |
| 6.8% | `psychology` | 0.0015 | 0.0095 | under | `module` 80.7% (76) `confidence` 5.9% (20) `know` 3.7% (79) `test` 3.5% (246) |
| 5.1% | `animals` | 0.0004 | 0.0051 | under | `nest` 60.6% (29) `owl` 25.8% (22) `head` 7.3% (14) `posterior` 3.2% (6) |
| 3.5% | `calculus` | 0.0137 | 0.0058 | **over** | `divergence` 100.0% (166) |
| 2.5% | `literature` | 0.0135 | 0.0227 | under | `header` 34.6% (82) `write` 16.7% (729) `text` 12.1% (85) `prose` 8.2% (126) |
| 2.5% | `grammar` | 0.0423 | 0.0294 | **over** | `phrase` 21.3% (152) `occurrence` 17.1% (196) `part_of_speech` 15.5% (40) `verb` 13.5% (79) |
| 2.2% | `information-science` | 0.0011 | 0.0042 | under | `synset` 71.5% (29) `document` 22.2% (78) `ontology` 5.7% (121) `align` 0.4% (1) |

### `code-semantics-engine/src/test/java`

**3.7%** of the maximum divergence from the repository, against a null median of 1.5% over 999 resamples of the same size — an excess of +2.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.2% | `electronics` | 0.0004 | 0.0150 | under | `tsv` 86.7% (38) `field` 6.5% (207) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 12.8% | `plants` | 0.0680 | 0.0320 | **over** | `root` 55.2% (164) `tree` 37.0% (198) `seed` 5.1% (38) `leaf` 1.9% (31) |
| 3.9% | `psychology` | 0.0027 | 0.0095 | under | `module` 80.7% (76) `confidence` 5.9% (20) `know` 3.7% (79) `test` 3.5% (246) |
| 3.5% | `publishing` | 0.0932 | 0.0691 | **over** | `publish` 25.9% (343) `read` 12.8% (171) `write` 12.2% (730) `vocabulary` 9.9% (186) |
| 3.3% | `computer-languages` | 0.0001 | 0.0029 | under | `json` 74.3% (6) `sparql` 10.9% (1) `owl` 8.1% (22) `java` 4.6% (70) |
| 3.0% | `astrology` | 0.0177 | 0.0088 | **over** | `placement` 95.5% (107) `term` 1.5% (376) `figure` 1.2% (111) `descendant` 1.1% (7) |
| 2.9% | `mathematics` | 0.0333 | 0.0490 | under | `from` 28.5% (150) `function` 9.8% (93) `distribution` 6.8% (99) `lemma` 6.7% (81) |
| 2.2% | `metrology` | 0.0006 | 0.0035 | under | `quantity` 49.3% (16) `array` 22.9% (6) `millisecond` 11.9% (2) `frequency` 4.6% (23) |

### `lexicon-extraction/src/main/java`

**18.8%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +12.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.1% | `linguistics` | 0.0916 | 0.2017 | under | `word` 32.1% (1,550) `name` 15.7% (713) `term` 12.7% (365) `parse` 4.9% (149) |
| 7.2% | `literature` | 0.0840 | 0.0227 | **over** | `header` 34.6% (82) `write` 16.7% (729) `text` 12.1% (85) `prose` 8.2% (126) |
| 6.2% | `grammar` | 0.0012 | 0.0294 | under | `phrase` 21.3% (152) `occurrence` 17.1% (196) `part_of_speech` 15.5% (40) `verb` 13.5% (79) |
| 6.2% | `plants` | 0.0019 | 0.0320 | under | `root` 55.2% (164) `tree` 37.0% (198) `seed` 5.1% (38) `leaf` 1.9% (31) |
| 6.2% | `animals` | 0.0414 | 0.0051 | **over** | `nest` 60.6% (29) `owl` 25.8% (22) `head` 7.3% (14) `posterior` 3.2% (6) |
| 5.5% | `electronics` | 0.0596 | 0.0150 | **over** | `tsv` 86.7% (38) `field` 6.5% (207) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 4.6% | `computer-languages` | 0.0283 | 0.0029 | **over** | `json` 74.3% (6) `sparql` 10.9% (1) `owl` 8.1% (22) `java` 4.6% (70) |
| 4.5% | `physics` | 0.0009 | 0.0213 | under | `mass` 49.3% (150) `weight` 29.4% (73) `length` 5.7% (74) `radius` 3.2% (3) |

### `lexicon-extraction/src/test/java`

**22.2%** of the maximum divergence from the repository, against a null median of 7.4% over 999 resamples of the same size — an excess of +14.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.6% | `chemistry` | 0.1468 | 0.0144 | **over** | `extraction` 33.0% (56) `fraction` 14.5% (13) `extract` 10.0% (7) `test` 8.2% (246) |
| 16.6% | `electronics` | 0.1281 | 0.0150 | **over** | `tsv` 86.7% (38) `field` 6.5% (207) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 5.4% | `linguistics` | 0.1019 | 0.2017 | under | `word` 32.1% (1,550) `name` 15.7% (713) `term` 12.7% (365) `parse` 4.9% (149) |
| 3.9% | `physics` | 0.0008 | 0.0213 | under | `mass` 49.3% (150) `weight` 29.4% (73) `length` 5.7% (74) `radius` 3.2% (3) |
| 2.9% | `person` | 0.0028 | 0.0225 | under | `reader` 26.1% (147) `child` 14.5% (23) `host` 11.5% (31) `bearer` 7.0% (18) |
| 2.8% | `psychology` | 0.0368 | 0.0095 | **over** | `module` 80.7% (76) `confidence` 5.9% (20) `know` 3.7% (79) `test` 3.5% (246) |
| 2.3% | `law` | 0.0146 | 0.0422 | under | `file` 11.3% (492) `witness` 9.5% (73) `summary` 8.4% (58) `claim` 6.6% (112) |
| 2.0% | `grammar` | 0.0086 | 0.0294 | under | `phrase` 21.3% (152) `occurrence` 17.1% (196) `part_of_speech` 15.5% (40) `verb` 13.5% (79) |

### `lexicon/src/main/java`

**19.1%** of the maximum divergence from the repository, against a null median of 10.8% over 999 resamples of the same size — an excess of +8.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `plants` | 0.0000 | 0.0320 | under | `root` 55.2% (164) `tree` 37.0% (198) `seed` 5.1% (38) `leaf` 1.9% (31) |
| 5.6% | `publishing` | 0.0193 | 0.0691 | under | `publish` 25.9% (343) `read` 12.8% (171) `write` 12.2% (730) `vocabulary` 9.9% (186) |
| 4.7% | `physics` | 0.0006 | 0.0213 | under | `mass` 49.3% (150) `weight` 29.4% (73) `length` 5.7% (74) `radius` 3.2% (3) |
| 4.4% | `person` | 0.0674 | 0.0225 | **over** | `reader` 26.1% (147) `child` 14.5% (23) `host` 11.5% (31) `bearer` 7.0% (18) |
| 4.3% | `mathematics` | 0.1079 | 0.0490 | **over** | `from` 28.5% (150) `function` 9.8% (93) `distribution` 6.8% (99) `lemma` 6.7% (81) |
| 4.0% | `grammar` | 0.0757 | 0.0294 | **over** | `phrase` 21.3% (152) `occurrence` 17.1% (196) `part_of_speech` 15.5% (40) `verb` 13.5% (79) |
| 3.9% | `networking` | 0.0305 | 0.0049 | **over** | `resource` 69.1% (269) `preamble` 8.8% (8) `request` 7.3% (11) `node` 5.9% (72) |
| 3.6% | `linguistics` | 0.2985 | 0.2017 | **over** | `word` 32.1% (1,550) `name` 15.7% (713) `term` 12.7% (365) `parse` 4.9% (149) |

### `lexicon/src/test/java`

**13.6%** of the maximum divergence from the repository, against a null median of 11.0% over 999 resamples of the same size — an excess of +2.6 points, and 80 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.2% | `plants` | 0.0002 | 0.0320 | under | `root` 55.2% (164) `tree` 37.0% (198) `seed` 5.1% (38) `leaf` 1.9% (31) |
| 5.9% | `lexicography` | 0.0403 | 0.0087 | **over** | `citation` 85.6% (97) `sense` 10.8% (323) `gloss` 1.7% (2) `lemma` 1.3% (81) |
| 5.8% | `linguistics` | 0.3064 | 0.2017 | **over** | `word` 32.1% (1,550) `name` 15.7% (713) `term` 12.7% (365) `parse` 4.9% (149) |
| 5.4% | `electronics` | 0.0000 | 0.0150 | under | `tsv` 86.7% (38) `field` 6.5% (207) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 3.2% | `astrology` | 0.0000 | 0.0088 | under | `placement` 95.5% (107) `term` 1.5% (376) `figure` 1.2% (111) `descendant` 1.1% (7) |
| 2.5% | `chemistry` | 0.0024 | 0.0144 | under | `extraction` 33.0% (56) `fraction` 14.5% (13) `extract` 10.0% (7) `test` 8.2% (246) |
| 2.4% | `administration` | 0.0001 | 0.0071 | under | `branch` 68.7% (144) `title` 12.4% (16) `foreign` 9.8% (12) `resolution` 3.3% (12) |
| 2.1% | `calculus` | 0.0000 | 0.0058 | under | `divergence` 100.0% (166) |

### `documentation`

**23.9%** of the maximum divergence from the repository, against a null median of 34.7% over 999 resamples of the same size — an excess of -10.7 points, and 962 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.5 s, recorded rather than estimated.
