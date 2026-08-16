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
| `linguistics` | 0.0511 | 80.6% | 4,140 | 153 | 12,323 | 34.0% | `word` 32.2% (1,500) `name` 15.9% (682) `term` 12.6% (342) `parse` 5.0% (140) |
| `computing` | 0.0134 | 82.3% | 6,156 | 28 | 1,661 | 4.6% | `repository` 7.5% (449) `folder` 4.7% (32) `read` 4.4% (832) `dictionary` 4.2% (219) |

Read over 492 files and 36,236 lines: 466 topics, 1 files no topic could be resolved for, and 34.0% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.0%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +6.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.6% | `telecommunication` | 0.0002 | 0.0416 | under | `file` 64.6% (237) `entry` 29.2% (185) `copy` 2.3% (27) `note` 2.0% (7) |
| 6.9% | `publishing` | 0.0171 | 0.0660 | under | `publish` 24.0% (314) `read` 13.5% (159) `write` 11.5% (654) `vocabulary` 10.1% (169) |
| 6.9% | `plants` | 0.0018 | 0.0302 | under | `root` 56.6% (155) `tree` 38.3% (178) `seed` 3.3% (28) `leaf` 0.9% (20) |
| 6.2% | `physics` | 0.0665 | 0.0194 | **over** | `mass` 46.4% (139) `weight` 30.3% (69) `length` 6.4% (73) `radius` 3.5% (3) |
| 4.8% | `time_period` | 0.0292 | 0.0042 | **over** | `span` 46.3% (19) `none` 24.3% (9) `long` 5.4% (24) `even` 4.9% (4) |
| 3.7% | `lexicography` | 0.0349 | 0.0089 | **over** | `citation` 85.7% (97) `sense` 10.8% (317) `gloss` 1.7% (2) `lemma` 1.2% (78) |
| 3.7% | `electronics` | 0.0008 | 0.0154 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 2.8% | `astrology` | 0.0000 | 0.0090 | under | `placement` 96.6% (104) `term` 1.5% (353) `figure` 1.2% (106) `scheme` 0.6% (38) |

### `code-semantics-api/src/test/java`

**20.5%** of the maximum divergence from the repository, against a null median of 15.4% over 999 resamples of the same size — an excess of +5.1 points, and 34 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `telecommunication` | 0.0017 | 0.0416 | under | `file` 64.6% (237) `entry` 29.2% (185) `copy` 2.3% (27) `note` 2.0% (7) |
| 6.7% | `biology` | 0.0383 | 0.0024 | **over** | `morphology` 29.6% (19) `owl` 21.1% (22) `person` 9.4% (23) `glob` 8.4% (5) |
| 6.7% | `plants` | 0.0004 | 0.0302 | under | `root` 56.6% (155) `tree` 38.3% (178) `seed` 3.3% (28) `leaf` 0.9% (20) |
| 5.5% | `publishing` | 0.0167 | 0.0660 | under | `publish` 24.0% (314) `read` 13.5% (159) `write` 11.5% (654) `vocabulary` 10.1% (169) |
| 5.0% | `politics` | 0.0552 | 0.0130 | **over** | `vote` 51.6% (53) `normalisation` 23.5% (19) `reading` 6.3% (643) `name` 5.4% (773) |
| 3.9% | `literature` | 0.0016 | 0.0228 | under | `header` 36.0% (82) `write` 14.9% (653) `text` 12.6% (81) `prose` 8.4% (114) |
| 3.6% | `linguistics` | 0.3029 | 0.2015 | **over** | `word` 32.2% (1,500) `name` 15.9% (682) `term` 12.6% (342) `parse` 5.0% (140) |
| 3.4% | `law` | 0.0949 | 0.0435 | **over** | `file` 11.4% (481) `witness` 9.6% (73) `summary` 8.5% (55) `claim` 6.6% (111) |

### `code-semantics-engine/src/main/java`

**3.7%** of the maximum divergence from the repository, against a null median of 1.5% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `electronics` | 0.0013 | 0.0154 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 10.6% | `chemistry` | 0.0020 | 0.0148 | under | `extraction` 33.0% (54) `fraction` 14.6% (13) `extract` 10.0% (7) `test` 8.2% (238) |
| 6.8% | `psychology` | 0.0014 | 0.0098 | under | `module` 82.0% (75) `confidence` 6.0% (20) `know` 3.7% (72) `test` 3.6% (238) |
| 4.2% | `animals` | 0.0004 | 0.0048 | under | `nest` 57.0% (28) `owl` 28.1% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.7% | `calculus` | 0.0148 | 0.0060 | **over** | `divergence` 100.0% (166) |
| 3.4% | `plants` | 0.0173 | 0.0302 | under | `root` 56.6% (155) `tree` 38.3% (178) `seed` 3.3% (28) `leaf` 0.9% (20) |
| 2.9% | `literature` | 0.0126 | 0.0228 | under | `header` 36.0% (82) `write` 14.9% (653) `text` 12.6% (81) `prose` 8.4% (114) |
| 2.7% | `grammar` | 0.0441 | 0.0298 | **over** | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |

### `code-semantics-engine/src/test/java`

**3.9%** of the maximum divergence from the repository, against a null median of 1.5% over 999 resamples of the same size — an excess of +2.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `electronics` | 0.0004 | 0.0154 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 14.9% | `plants` | 0.0698 | 0.0302 | **over** | `root` 56.6% (155) `tree` 38.3% (178) `seed` 3.3% (28) `leaf` 0.9% (20) |
| 4.7% | `animals` | 0.0002 | 0.0048 | under | `nest` 57.0% (28) `owl` 28.1% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.6% | `psychology` | 0.0029 | 0.0098 | under | `module` 82.0% (75) `confidence` 6.0% (20) `know` 3.7% (72) `test` 3.6% (238) |
| 3.5% | `publishing` | 0.0903 | 0.0660 | **over** | `publish` 24.0% (314) `read` 13.5% (159) `write` 11.5% (654) `vocabulary` 10.1% (169) |
| 3.3% | `computer-languages` | 0.0001 | 0.0030 | under | `json` 74.2% (6) `sparql` 10.8% (1) `owl` 8.1% (22) `java` 4.7% (69) |
| 3.2% | `mathematics` | 0.0330 | 0.0500 | under | `from` 28.8% (147) `function` 10.0% (92) `distribution` 6.9% (95) `lemma` 6.4% (78) |
| 2.9% | `astrology` | 0.0181 | 0.0090 | **over** | `placement` 96.6% (104) `term` 1.5% (353) `figure` 1.2% (106) `scheme` 0.6% (38) |

### `lexicon-extraction/src/main/java`

**18.7%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +12.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.2% | `linguistics` | 0.0916 | 0.2015 | under | `word` 32.2% (1,500) `name` 15.9% (682) `term` 12.6% (342) `parse` 5.0% (140) |
| 7.2% | `literature` | 0.0840 | 0.0228 | **over** | `header` 36.0% (82) `write` 14.9% (653) `text` 12.6% (81) `prose` 8.4% (114) |
| 6.4% | `animals` | 0.0414 | 0.0048 | **over** | `nest` 57.0% (28) `owl` 28.1% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 6.4% | `grammar` | 0.0012 | 0.0298 | under | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |
| 5.8% | `plants` | 0.0019 | 0.0302 | under | `root` 56.6% (155) `tree` 38.3% (178) `seed` 3.3% (28) `leaf` 0.9% (20) |
| 5.4% | `electronics` | 0.0596 | 0.0154 | **over** | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 4.6% | `computer-languages` | 0.0283 | 0.0030 | **over** | `json` 74.2% (6) `sparql` 10.8% (1) `owl` 8.1% (22) `java` 4.7% (69) |
| 4.0% | `physics` | 0.0009 | 0.0194 | under | `mass` 46.4% (139) `weight` 30.3% (69) `length` 6.4% (73) `radius` 3.5% (3) |

### `lexicon-extraction/src/test/java`

**22.0%** of the maximum divergence from the repository, against a null median of 7.5% over 999 resamples of the same size — an excess of +14.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.5% | `chemistry` | 0.1468 | 0.0148 | **over** | `extraction` 33.0% (54) `fraction` 14.6% (13) `extract` 10.0% (7) `test` 8.2% (238) |
| 16.6% | `electronics` | 0.1281 | 0.0154 | **over** | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 5.5% | `linguistics` | 0.1019 | 0.2015 | under | `word` 32.2% (1,500) `name` 15.9% (682) `term` 12.6% (342) `parse` 5.0% (140) |
| 3.5% | `physics` | 0.0008 | 0.0194 | under | `mass` 46.4% (139) `weight` 30.3% (69) `length` 6.4% (73) `radius` 3.5% (3) |
| 2.9% | `person` | 0.0028 | 0.0224 | under | `reader` 26.1% (139) `child` 14.3% (21) `host` 11.9% (29) `bearer` 7.3% (18) |
| 2.7% | `psychology` | 0.0368 | 0.0098 | **over** | `module` 82.0% (75) `confidence` 6.0% (20) `know` 3.7% (72) `test` 3.6% (238) |
| 2.5% | `law` | 0.0146 | 0.0435 | under | `file` 11.4% (481) `witness` 9.6% (73) `summary` 8.5% (55) `claim` 6.6% (111) |
| 2.0% | `grammar` | 0.0086 | 0.0298 | under | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |

### `lexicon/src/main/java`

**18.9%** of the maximum divergence from the repository, against a null median of 10.8% over 999 resamples of the same size — an excess of +8.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `plants` | 0.0000 | 0.0302 | under | `root` 56.6% (155) `tree` 38.3% (178) `seed` 3.3% (28) `leaf` 0.9% (20) |
| 5.2% | `publishing` | 0.0193 | 0.0660 | under | `publish` 24.0% (314) `read` 13.5% (159) `write` 11.5% (654) `vocabulary` 10.1% (169) |
| 4.5% | `person` | 0.0674 | 0.0224 | **over** | `reader` 26.1% (139) `child` 14.3% (21) `host` 11.9% (29) `bearer` 7.3% (18) |
| 4.2% | `physics` | 0.0006 | 0.0194 | under | `mass` 46.4% (139) `weight` 30.3% (69) `length` 6.4% (73) `radius` 3.5% (3) |
| 4.2% | `mathematics` | 0.1079 | 0.0500 | **over** | `from` 28.8% (147) `function` 10.0% (92) `distribution` 6.9% (95) `lemma` 6.4% (78) |
| 4.0% | `networking` | 0.0305 | 0.0048 | **over** | `resource` 66.2% (264) `preamble` 9.8% (8) `request` 8.1% (11) `node` 6.5% (68) |
| 4.0% | `grammar` | 0.0757 | 0.0298 | **over** | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |
| 3.6% | `linguistics` | 0.2985 | 0.2015 | **over** | `word` 32.2% (1,500) `name` 15.9% (682) `term` 12.6% (342) `parse` 5.0% (140) |

### `lexicon/src/test/java`

**13.5%** of the maximum divergence from the repository, against a null median of 11.2% over 999 resamples of the same size — an excess of +2.4 points, and 94 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.6% | `plants` | 0.0002 | 0.0302 | under | `root` 56.6% (155) `tree` 38.3% (178) `seed` 3.3% (28) `leaf` 0.9% (20) |
| 5.8% | `linguistics` | 0.3064 | 0.2015 | **over** | `word` 32.2% (1,500) `name` 15.9% (682) `term` 12.6% (342) `parse` 5.0% (140) |
| 5.8% | `lexicography` | 0.0403 | 0.0089 | **over** | `citation` 85.7% (97) `sense` 10.8% (317) `gloss` 1.7% (2) `lemma` 1.2% (78) |
| 5.6% | `electronics` | 0.0000 | 0.0154 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 3.3% | `astrology` | 0.0000 | 0.0090 | under | `placement` 96.6% (104) `term` 1.5% (353) `figure` 1.2% (106) `scheme` 0.6% (38) |
| 2.6% | `chemistry` | 0.0024 | 0.0148 | under | `extraction` 33.0% (54) `fraction` 14.6% (13) `extract` 10.0% (7) `test` 8.2% (238) |
| 2.2% | `calculus` | 0.0000 | 0.0060 | under | `divergence` 100.0% (166) |
| 2.1% | `politics` | 0.0025 | 0.0130 | under | `vote` 51.6% (53) `normalisation` 23.5% (19) `reading` 6.3% (643) `name` 5.4% (773) |

### `documentation`

**23.7%** of the maximum divergence from the repository, against a null median of 34.8% over 999 resamples of the same size — an excess of -11.1 points, and 979 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.5 s, recorded rather than estimated.
