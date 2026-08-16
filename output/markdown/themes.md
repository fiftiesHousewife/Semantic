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
| `linguistics` | 0.0509 | 80.5% | 4,223 | 153 | 12,489 | 33.8% | `word` 31.9% (1,514) `name` 15.9% (703) `term` 12.4% (352) `parse` 5.0% (146) |
| `computing` | 0.0131 | 81.5% | 6,343 | 26 | 1,555 | 4.2% | `repository` 7.6% (472) `folder` 4.6% (33) `read` 4.4% (859) `dictionary` 4.1% (221) |

Read over 497 files and 36,899 lines: 467 topics, 1 files no topic could be resolved for, and 33.8% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.1%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +6.4 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.4% | `telecommunication` | 0.0002 | 0.0412 | under | `file` 65.1% (241) `entry` 28.8% (186) `copy` 2.3% (27) `note` 2.0% (7) |
| 7.4% | `plants` | 0.0018 | 0.0322 | under | `root` 55.8% (163) `tree` 36.4% (194) `seed` 5.2% (38) `leaf` 1.8% (28) |
| 7.3% | `publishing` | 0.0171 | 0.0679 | under | `publish` 24.2% (331) `read` 13.3% (169) `write` 11.8% (686) `vocabulary` 10.3% (186) |
| 6.1% | `physics` | 0.0665 | 0.0194 | **over** | `mass` 45.2% (139) `weight` 31.9% (71) `length` 6.2% (74) `radius` 3.4% (3) |
| 4.8% | `time_period` | 0.0292 | 0.0041 | **over** | `span` 46.3% (19) `none` 24.3% (9) `long` 5.4% (27) `even` 4.9% (4) |
| 3.7% | `lexicography` | 0.0349 | 0.0088 | **over** | `citation` 85.7% (97) `sense` 10.8% (320) `gloss` 1.7% (2) `lemma` 1.2% (79) |
| 3.6% | `electronics` | 0.0008 | 0.0153 | under | `tsv` 86.7% (38) `field` 6.5% (204) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 2.8% | `astrology` | 0.0000 | 0.0089 | under | `placement` 96.6% (107) `term` 1.5% (363) `figure` 1.2% (109) `scheme` 0.6% (41) |

### `code-semantics-api/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +5.0 points, and 37 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.9% | `telecommunication` | 0.0017 | 0.0412 | under | `file` 65.1% (241) `entry` 28.8% (186) `copy` 2.3% (27) `note` 2.0% (7) |
| 7.1% | `plants` | 0.0004 | 0.0322 | under | `root` 55.8% (163) `tree` 36.4% (194) `seed` 5.2% (38) `leaf` 1.8% (28) |
| 6.7% | `biology` | 0.0383 | 0.0024 | **over** | `morphology` 29.5% (19) `owl` 21.1% (22) `person` 9.3% (23) `glob` 8.4% (5) |
| 5.8% | `publishing` | 0.0167 | 0.0679 | under | `publish` 24.2% (331) `read` 13.3% (169) `write` 11.8% (686) `vocabulary` 10.3% (186) |
| 5.0% | `politics` | 0.0552 | 0.0129 | **over** | `vote` 51.4% (53) `normalisation` 23.4% (19) `reading` 6.4% (669) `name` 5.4% (795) |
| 3.8% | `literature` | 0.0016 | 0.0227 | under | `header` 35.3% (82) `write` 15.5% (685) `text` 12.3% (82) `prose` 8.3% (126) |
| 3.6% | `linguistics` | 0.3029 | 0.2009 | **over** | `word` 31.9% (1,514) `name` 15.9% (703) `term` 12.4% (352) `parse` 5.0% (146) |
| 3.5% | `law` | 0.0949 | 0.0428 | **over** | `file` 11.3% (490) `witness` 9.5% (73) `summary` 8.5% (59) `claim` 6.6% (111) |

### `code-semantics-engine/src/main/java`

**3.5%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.5% | `electronics` | 0.0013 | 0.0153 | under | `tsv` 86.7% (38) `field` 6.5% (204) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 11.6% | `chemistry` | 0.0019 | 0.0147 | under | `extraction` 32.9% (55) `fraction` 14.5% (13) `extract` 10.0% (7) `test` 8.2% (242) |
| 6.7% | `psychology` | 0.0015 | 0.0096 | under | `module` 81.8% (76) `confidence` 5.9% (20) `know` 3.7% (78) `test` 3.5% (242) |
| 4.5% | `animals` | 0.0004 | 0.0047 | under | `nest` 57.1% (28) `owl` 28.1% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.5% | `calculus` | 0.0140 | 0.0059 | **over** | `divergence` 100.0% (167) |
| 2.6% | `literature` | 0.0132 | 0.0227 | under | `header` 35.3% (82) `write` 15.5% (685) `text` 12.3% (82) `prose` 8.3% (126) |
| 2.4% | `grammar` | 0.0422 | 0.0295 | **over** | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (40) `verb` 13.7% (77) |
| 2.1% | `information-science` | 0.0011 | 0.0043 | under | `synset` 72.4% (28) `document` 21.3% (74) `ontology` 5.7% (116) `align` 0.4% (1) |

### `code-semantics-engine/src/test/java`

**4.0%** of the maximum divergence from the repository, against a null median of 1.6% over 999 resamples of the same size — an excess of +2.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.3% | `electronics` | 0.0004 | 0.0153 | under | `tsv` 86.7% (38) `field` 6.5% (204) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 13.2% | `plants` | 0.0704 | 0.0322 | **over** | `root` 55.8% (163) `tree` 36.4% (194) `seed` 5.2% (38) `leaf` 1.8% (28) |
| 4.6% | `animals` | 0.0002 | 0.0047 | under | `nest` 57.1% (28) `owl` 28.1% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.9% | `psychology` | 0.0025 | 0.0096 | under | `module` 81.8% (76) `confidence` 5.9% (20) `know` 3.7% (78) `test` 3.5% (242) |
| 3.2% | `computer-languages` | 0.0001 | 0.0030 | under | `json` 74.3% (6) `sparql` 10.9% (1) `owl` 8.1% (22) `java` 4.6% (70) |
| 3.1% | `publishing` | 0.0910 | 0.0679 | **over** | `publish` 24.2% (331) `read` 13.3% (169) `write` 11.8% (686) `vocabulary` 10.3% (186) |
| 3.0% | `astrology` | 0.0183 | 0.0089 | **over** | `placement` 96.6% (107) `term` 1.5% (363) `figure` 1.2% (109) `scheme` 0.6% (41) |
| 2.7% | `mathematics` | 0.0337 | 0.0495 | under | `from` 28.7% (147) `function` 10.0% (93) `distribution` 6.9% (99) `lemma` 6.4% (79) |

### `lexicon-extraction/src/main/java`

**18.7%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +12.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.1% | `linguistics` | 0.0916 | 0.2009 | under | `word` 31.9% (1,514) `name` 15.9% (703) `term` 12.4% (352) `parse` 5.0% (146) |
| 7.2% | `literature` | 0.0840 | 0.0227 | **over** | `header` 35.3% (82) `write` 15.5% (685) `text` 12.3% (82) `prose` 8.3% (126) |
| 6.4% | `animals` | 0.0414 | 0.0047 | **over** | `nest` 57.1% (28) `owl` 28.1% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 6.3% | `plants` | 0.0019 | 0.0322 | under | `root` 55.8% (163) `tree` 36.4% (194) `seed` 5.2% (38) `leaf` 1.8% (28) |
| 6.3% | `grammar` | 0.0012 | 0.0295 | under | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (40) `verb` 13.7% (77) |
| 5.4% | `electronics` | 0.0596 | 0.0153 | **over** | `tsv` 86.7% (38) `field` 6.5% (204) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 4.6% | `computer-languages` | 0.0283 | 0.0030 | **over** | `json` 74.3% (6) `sparql` 10.9% (1) `owl` 8.1% (22) `java` 4.6% (70) |
| 4.0% | `physics` | 0.0009 | 0.0194 | under | `mass` 45.2% (139) `weight` 31.9% (71) `length` 6.2% (74) `radius` 3.4% (3) |

### `lexicon-extraction/src/test/java`

**22.0%** of the maximum divergence from the repository, against a null median of 7.4% over 999 resamples of the same size — an excess of +14.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.5% | `chemistry` | 0.1468 | 0.0147 | **over** | `extraction` 32.9% (55) `fraction` 14.5% (13) `extract` 10.0% (7) `test` 8.2% (242) |
| 16.6% | `electronics` | 0.1281 | 0.0153 | **over** | `tsv` 86.7% (38) `field` 6.5% (204) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 5.4% | `linguistics` | 0.1019 | 0.2009 | under | `word` 31.9% (1,514) `name` 15.9% (703) `term` 12.4% (352) `parse` 5.0% (146) |
| 3.5% | `physics` | 0.0008 | 0.0194 | under | `mass` 45.2% (139) `weight` 31.9% (71) `length` 6.2% (74) `radius` 3.4% (3) |
| 2.9% | `person` | 0.0028 | 0.0224 | under | `reader` 25.8% (145) `child` 14.9% (22) `host` 11.8% (31) `bearer` 7.2% (18) |
| 2.8% | `psychology` | 0.0368 | 0.0096 | **over** | `module` 81.8% (76) `confidence` 5.9% (20) `know` 3.7% (78) `test` 3.5% (242) |
| 2.4% | `law` | 0.0146 | 0.0428 | under | `file` 11.3% (490) `witness` 9.5% (73) `summary` 8.5% (59) `claim` 6.6% (111) |
| 2.0% | `astrology` | 0.0000 | 0.0089 | under | `placement` 96.6% (107) `term` 1.5% (363) `figure` 1.2% (109) `scheme` 0.6% (41) |

### `lexicon/src/main/java`

**19.1%** of the maximum divergence from the repository, against a null median of 10.8% over 999 resamples of the same size — an excess of +8.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `plants` | 0.0000 | 0.0322 | under | `root` 55.8% (163) `tree` 36.4% (194) `seed` 5.2% (38) `leaf` 1.8% (28) |
| 5.4% | `publishing` | 0.0193 | 0.0679 | under | `publish` 24.2% (331) `read` 13.3% (169) `write` 11.8% (686) `vocabulary` 10.3% (186) |
| 4.5% | `person` | 0.0674 | 0.0224 | **over** | `reader` 25.8% (145) `child` 14.9% (22) `host` 11.8% (31) `bearer` 7.2% (18) |
| 4.2% | `physics` | 0.0006 | 0.0194 | under | `mass` 45.2% (139) `weight` 31.9% (71) `length` 6.2% (74) `radius` 3.4% (3) |
| 4.2% | `mathematics` | 0.1079 | 0.0495 | **over** | `from` 28.7% (147) `function` 10.0% (93) `distribution` 6.9% (99) `lemma` 6.4% (79) |
| 4.0% | `grammar` | 0.0757 | 0.0295 | **over** | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (40) `verb` 13.7% (77) |
| 4.0% | `networking` | 0.0305 | 0.0048 | **over** | `resource` 65.9% (266) `preamble` 9.8% (8) `request` 8.1% (11) `node` 6.6% (72) |
| 3.6% | `linguistics` | 0.2985 | 0.2009 | **over** | `word` 31.9% (1,514) `name` 15.9% (703) `term` 12.4% (352) `parse` 5.0% (146) |

### `lexicon/src/test/java`

**13.7%** of the maximum divergence from the repository, against a null median of 11.0% over 999 resamples of the same size — an excess of +2.6 points, and 79 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.3% | `plants` | 0.0002 | 0.0322 | under | `root` 55.8% (163) `tree` 36.4% (194) `seed` 5.2% (38) `leaf` 1.8% (28) |
| 5.8% | `linguistics` | 0.3064 | 0.2009 | **over** | `word` 31.9% (1,514) `name` 15.9% (703) `term` 12.4% (352) `parse` 5.0% (146) |
| 5.8% | `lexicography` | 0.0403 | 0.0088 | **over** | `citation` 85.7% (97) `sense` 10.8% (320) `gloss` 1.7% (2) `lemma` 1.2% (79) |
| 5.5% | `electronics` | 0.0000 | 0.0153 | under | `tsv` 86.7% (38) `field` 6.5% (204) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 3.2% | `astrology` | 0.0000 | 0.0089 | under | `placement` 96.6% (107) `term` 1.5% (363) `figure` 1.2% (109) `scheme` 0.6% (41) |
| 2.6% | `chemistry` | 0.0024 | 0.0147 | under | `extraction` 32.9% (55) `fraction` 14.5% (13) `extract` 10.0% (7) `test` 8.2% (242) |
| 2.4% | `administration` | 0.0001 | 0.0069 | under | `branch` 65.1% (130) `title` 13.9% (16) `foreign` 11.0% (12) `resolution` 3.7% (12) |
| 2.2% | `calculus` | 0.0000 | 0.0059 | under | `divergence` 100.0% (167) |

### `documentation`

**24.0%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of -10.5 points, and 966 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.5 s, recorded rather than estimated.
