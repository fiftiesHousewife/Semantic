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
| `linguistics` | 0.0514 | 80.8% | 4,038 | 148 | 11,926 | 33.9% | `word` 32.5% (1,475) `name` 15.9% (659) `term` 12.2% (323) `parse` 4.9% (138) |
| `computing` | 0.0133 | 82.9% | 5,929 | 28 | 1,661 | 4.7% | `repository` 7.5% (440) `folder` 4.9% (32) `read` 4.4% (796) `parse` 4.2% (138) |

Read over 478 files and 35,208 lines: 463 topics, 1 files no topic could be resolved for, and 33.9% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**15.8%** of the maximum divergence from the repository, against a null median of 9.8% over 999 resamples of the same size — an excess of +6.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.6% | `telecommunication` | 0.0002 | 0.0411 | under | `file` 63.9% (233) `entry` 29.7% (184) `copy` 2.4% (26) `note` 2.0% (7) |
| 6.7% | `plants` | 0.0018 | 0.0294 | under | `root` 56.6% (148) `tree` 38.1% (171) `seed` 3.5% (26) `leaf` 0.9% (19) |
| 6.7% | `publishing` | 0.0171 | 0.0645 | under | `publish` 23.0% (288) `read` 13.9% (159) `write` 11.7% (644) `vocabulary` 10.4% (162) |
| 6.1% | `physics` | 0.0665 | 0.0197 | **over** | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (70) `radius` 3.5% (3) |
| 4.8% | `time_period` | 0.0292 | 0.0041 | **over** | `span` 46.7% (19) `none` 23.9% (6) `long` 5.4% (21) `even` 4.9% (4) |
| 3.9% | `electronics` | 0.0008 | 0.0159 | under | `tsv` 86.7% (38) `field` 6.5% (194) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 3.6% | `lexicography` | 0.0349 | 0.0092 | **over** | `citation` 85.7% (96) `sense` 10.8% (312) `gloss` 1.7% (2) `lemma` 1.2% (77) |
| 2.5% | `philosophy` | 0.0001 | 0.0086 | under | `describe` 28.5% (37) `lemma` 26.5% (77) `each` 11.8% (48) `explain` 11.1% (15) |

### `code-semantics-api/src/test/java`

**20.3%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +4.7 points, and 42 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `telecommunication` | 0.0017 | 0.0411 | under | `file` 63.9% (233) `entry` 29.7% (184) `copy` 2.4% (26) `note` 2.0% (7) |
| 6.8% | `biology` | 0.0383 | 0.0024 | **over** | `morphology` 30.5% (19) `owl` 21.9% (22) `person` 9.6% (23) `glob` 8.6% (5) |
| 6.6% | `plants` | 0.0004 | 0.0294 | under | `root` 56.6% (148) `tree` 38.1% (171) `seed` 3.5% (26) `leaf` 0.9% (19) |
| 5.3% | `publishing` | 0.0167 | 0.0645 | under | `publish` 23.0% (288) `read` 13.9% (159) `write` 11.7% (644) `vocabulary` 10.4% (162) |
| 4.9% | `politics` | 0.0552 | 0.0132 | **over** | `vote` 52.1% (53) `normalisation` 23.7% (19) `reading` 6.1% (619) `name` 5.2% (748) |
| 4.0% | `literature` | 0.0016 | 0.0234 | under | `header` 36.2% (79) `write` 14.9% (643) `text` 12.6% (80) `prose` 8.5% (111) |
| 3.5% | `linguistics` | 0.3029 | 0.2027 | **over** | `word` 32.5% (1,475) `name` 15.9% (659) `term` 12.2% (323) `parse` 4.9% (138) |
| 3.5% | `law` | 0.0949 | 0.0435 | **over** | `file` 11.4% (458) `witness` 9.8% (73) `summary` 8.7% (55) `claim` 6.7% (111) |

### `code-semantics-engine/src/main/java`

**3.8%** of the maximum divergence from the repository, against a null median of 1.5% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.5% | `electronics` | 0.0014 | 0.0159 | under | `tsv` 86.7% (38) `field` 6.5% (194) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 10.6% | `chemistry` | 0.0020 | 0.0152 | under | `extraction` 33.1% (51) `fraction` 14.6% (13) `extract` 10.1% (7) `test` 8.0% (229) |
| 6.9% | `psychology` | 0.0014 | 0.0101 | under | `module` 82.0% (74) `confidence` 6.0% (20) `know` 3.8% (71) `test` 3.5% (229) |
| 4.2% | `animals` | 0.0004 | 0.0049 | under | `nest` 57.0% (28) `owl` 28.2% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.8% | `calculus` | 0.0152 | 0.0061 | **over** | `divergence` 100.0% (162) |
| 2.9% | `grammar` | 0.0453 | 0.0302 | **over** | `phrase` 21.8% (151) `occurrence` 16.1% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |
| 2.8% | `literature` | 0.0130 | 0.0234 | under | `header` 36.2% (79) `write` 14.9% (643) `text` 12.6% (80) `prose` 8.5% (111) |
| 2.7% | `plants` | 0.0179 | 0.0294 | under | `root` 56.6% (148) `tree` 38.1% (171) `seed` 3.5% (26) `leaf` 0.9% (19) |

### `code-semantics-engine/src/test/java`

**4.1%** of the maximum divergence from the repository, against a null median of 1.6% over 999 resamples of the same size — an excess of +2.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.6% | `electronics` | 0.0004 | 0.0159 | under | `tsv` 86.7% (38) `field` 6.5% (194) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 13.8% | `plants` | 0.0679 | 0.0294 | **over** | `root` 56.6% (148) `tree` 38.1% (171) `seed` 3.5% (26) `leaf` 0.9% (19) |
| 4.8% | `mathematics` | 0.0268 | 0.0469 | under | `from` 29.9% (140) `function` 7.6% (57) `distribution` 7.3% (88) `lemma` 6.9% (77) |
| 4.6% | `animals` | 0.0002 | 0.0049 | under | `nest` 57.0% (28) `owl` 28.2% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.5% | `psychology` | 0.0031 | 0.0101 | under | `module` 82.0% (74) `confidence` 6.0% (20) `know` 3.8% (71) `test` 3.5% (229) |
| 3.2% | `computer-languages` | 0.0001 | 0.0031 | under | `json` 74.8% (6) `sparql` 10.9% (1) `owl` 7.9% (22) `java` 4.2% (67) |
| 3.2% | `publishing` | 0.0879 | 0.0645 | **over** | `publish` 23.0% (288) `read` 13.9% (159) `write` 11.7% (644) `vocabulary` 10.4% (162) |
| 2.2% | `metrology` | 0.0006 | 0.0037 | under | `quantity` 49.4% (16) `array` 22.9% (6) `millisecond` 11.9% (2) `frequency` 4.6% (23) |

### `lexicon-extraction/src/main/java`

**18.7%** of the maximum divergence from the repository, against a null median of 6.1% over 999 resamples of the same size — an excess of +12.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `linguistics` | 0.0916 | 0.2027 | under | `word` 32.5% (1,475) `name` 15.9% (659) `term` 12.2% (323) `parse` 4.9% (138) |
| 7.0% | `literature` | 0.0840 | 0.0234 | **over** | `header` 36.2% (79) `write` 14.9% (643) `text` 12.6% (80) `prose` 8.5% (111) |
| 6.5% | `grammar` | 0.0012 | 0.0302 | under | `phrase` 21.8% (151) `occurrence` 16.1% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |
| 6.3% | `animals` | 0.0414 | 0.0049 | **over** | `nest` 57.0% (28) `owl` 28.2% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 5.6% | `plants` | 0.0019 | 0.0294 | under | `root` 56.6% (148) `tree` 38.1% (171) `seed` 3.5% (26) `leaf` 0.9% (19) |
| 5.2% | `electronics` | 0.0596 | 0.0159 | **over** | `tsv` 86.7% (38) `field` 6.5% (194) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 4.5% | `computer-languages` | 0.0283 | 0.0031 | **over** | `json` 74.8% (6) `sparql` 10.9% (1) `owl` 7.9% (22) `java` 4.2% (67) |
| 4.1% | `physics` | 0.0009 | 0.0197 | under | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (70) `radius` 3.5% (3) |

### `lexicon-extraction/src/test/java`

**21.8%** of the maximum divergence from the repository, against a null median of 7.5% over 999 resamples of the same size — an excess of +14.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.5% | `chemistry` | 0.1468 | 0.0152 | **over** | `extraction` 33.1% (51) `fraction` 14.6% (13) `extract` 10.1% (7) `test` 8.0% (229) |
| 16.5% | `electronics` | 0.1281 | 0.0159 | **over** | `tsv` 86.7% (38) `field` 6.5% (194) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 5.6% | `linguistics` | 0.1019 | 0.2027 | under | `word` 32.5% (1,475) `name` 15.9% (659) `term` 12.2% (323) `parse` 4.9% (138) |
| 3.6% | `physics` | 0.0008 | 0.0197 | under | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (70) `radius` 3.5% (3) |
| 2.9% | `person` | 0.0028 | 0.0224 | under | `reader` 26.2% (136) `child` 14.4% (20) `host` 12.1% (29) `bearer` 7.4% (18) |
| 2.7% | `psychology` | 0.0368 | 0.0101 | **over** | `module` 82.0% (74) `confidence` 6.0% (20) `know` 3.8% (71) `test` 3.5% (229) |
| 2.5% | `law` | 0.0146 | 0.0435 | under | `file` 11.4% (458) `witness` 9.8% (73) `summary` 8.7% (55) `claim` 6.7% (111) |
| 2.1% | `grammar` | 0.0086 | 0.0302 | under | `phrase` 21.8% (151) `occurrence` 16.1% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |

### `lexicon/src/main/java`

**19.0%** of the maximum divergence from the repository, against a null median of 10.8% over 999 resamples of the same size — an excess of +8.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.7% | `plants` | 0.0000 | 0.0294 | under | `root` 56.6% (148) `tree` 38.1% (171) `seed` 3.5% (26) `leaf` 0.9% (19) |
| 4.9% | `publishing` | 0.0192 | 0.0645 | under | `publish` 23.0% (288) `read` 13.9% (159) `write` 11.7% (644) `vocabulary` 10.4% (162) |
| 4.7% | `mathematics` | 0.1079 | 0.0469 | **over** | `from` 29.9% (140) `function` 7.6% (57) `distribution` 7.3% (88) `lemma` 6.9% (77) |
| 4.3% | `physics` | 0.0006 | 0.0197 | under | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (70) `radius` 3.5% (3) |
| 4.3% | `person` | 0.0662 | 0.0224 | **over** | `reader` 26.2% (136) `child` 14.4% (20) `host` 12.1% (29) `bearer` 7.4% (18) |
| 4.0% | `networking` | 0.0312 | 0.0050 | **over** | `resource` 66.2% (256) `preamble` 9.9% (8) `request` 8.2% (11) `node` 6.5% (68) |
| 3.9% | `grammar` | 0.0758 | 0.0302 | **over** | `phrase` 21.8% (151) `occurrence` 16.1% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |
| 3.6% | `chemistry` | 0.0003 | 0.0152 | under | `extraction` 33.1% (51) `fraction` 14.6% (13) `extract` 10.1% (7) `test` 8.0% (229) |

### `lexicon/src/test/java`

**15.2%** of the maximum divergence from the repository, against a null median of 12.0% over 999 resamples of the same size — an excess of +3.2 points, and 63 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.1% | `plants` | 0.0002 | 0.0294 | under | `root` 56.6% (148) `tree` 38.1% (171) `seed` 3.5% (26) `leaf` 0.9% (19) |
| 8.2% | `linguistics` | 0.3387 | 0.2027 | **over** | `word` 32.5% (1,475) `name` 15.9% (659) `term` 12.2% (323) `parse` 4.9% (138) |
| 6.0% | `lexicography` | 0.0445 | 0.0092 | **over** | `citation` 85.7% (96) `sense` 10.8% (312) `gloss` 1.7% (2) `lemma` 1.2% (77) |
| 5.2% | `electronics` | 0.0000 | 0.0159 | under | `tsv` 86.7% (38) `field` 6.5% (194) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 2.9% | `chemistry` | 0.0018 | 0.0152 | under | `extraction` 33.1% (51) `fraction` 14.6% (13) `extract` 10.1% (7) `test` 8.0% (229) |
| 2.7% | `politics` | 0.0013 | 0.0132 | under | `vote` 52.1% (53) `normalisation` 23.7% (19) `reading` 6.1% (619) `name` 5.2% (748) |
| 2.5% | `astrology` | 0.0000 | 0.0077 | under | `placement` 96.4% (92) `term` 1.5% (332) `figure` 1.4% (105) `scheme` 0.6% (36) |
| 2.1% | `information-science` | 0.0180 | 0.0044 | **over** | `synset` 72.5% (26) `document` 21.3% (65) `ontology` 5.6% (104) `align` 0.4% (1) |

### `documentation`

**23.9%** of the maximum divergence from the repository, against a null median of 35.1% over 999 resamples of the same size — an excess of -11.1 points, and 972 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.2 s, recorded rather than estimated.
