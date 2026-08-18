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
| `linguistics` | 0.0494 | 80.7% | 4,277 | 164 | 13,181 | 33.5% | `word` 31.7% (1,536) `name` 15.3% (704) `term` 13.2% (378) `parse` 5.0% (156) |
| `computing` | 0.0148 | 82.6% | 6,519 | 35 | 1,989 | 5.1% | `repository` 6.5% (464) `read` 5.1% (906) `folder` 5.1% (37) `dictionary` 3.7% (230) |

Read over 544 files and 39,339 lines: 467 topics, 4 files no topic could be resolved for, and 33.5% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 23.6% of it; the other 76.4% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.1%** of the maximum divergence from the repository, against a null median of 9.6% over 999 resamples of the same size — an excess of +6.5 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.9% | `telecommunication` | 0.0002 | 0.0431 | under | `file` 61.7% (229) `entry` 31.3% (200) `copy` 3.3% (37) `note` 1.6% (6) |
| 7.8% | `publishing` | 0.0173 | 0.0707 | under | `publish` 25.3% (348) `read` 13.4% (172) `write` 12.2% (722) `vocabulary` 9.3% (178) |
| 6.7% | `plants` | 0.0018 | 0.0299 | under | `root` 53.2% (161) `tree` 38.9% (200) `seed` 5.1% (49) `leaf` 2.0% (33) |
| 5.1% | `time_period` | 0.0315 | 0.0044 | **over** | `span` 51.4% (27) `none` 19.9% (9) `stage` 6.3% (22) `long` 4.4% (23) |
| 4.6% | `physics` | 0.0581 | 0.0190 | **over** | `mass` 46.2% (136) `weight` 29.1% (66) `length` 6.5% (72) `radius` 3.5% (2) |
| 3.9% | `politics` | 0.0427 | 0.0125 | **over** | `vote` 49.5% (53) `normalisation` 22.3% (23) `reading` 7.3% (691) `name` 5.4% (799) |
| 3.9% | `electronics` | 0.0007 | 0.0161 | under | `tsv` 87.8% (42) `field` 5.8% (204) `headroom` 2.9% (2) `bar` 1.1% (106) |
| 3.4% | `lexicography` | 0.0323 | 0.0082 | **over** | `citation` 87.0% (96) `sense` 10.0% (317) `lemma` 1.3% (79) `gloss` 1.1% (1) |

### `code-semantics-api/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 15.4% over 999 resamples of the same size — an excess of +5.2 points, and 27 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `telecommunication` | 0.0017 | 0.0431 | under | `file` 61.7% (229) `entry` 31.3% (200) `copy` 3.3% (37) `note` 1.6% (6) |
| 6.6% | `plants` | 0.0004 | 0.0299 | under | `root` 53.2% (161) `tree` 38.9% (200) `seed` 5.1% (49) `leaf` 2.0% (33) |
| 6.5% | `biology` | 0.0383 | 0.0027 | **over** | `morphology` 25.7% (21) `owl` 21.0% (24) `person` 8.3% (24) `glob` 7.2% (4) |
| 6.3% | `publishing` | 0.0167 | 0.0707 | under | `publish` 25.3% (348) `read` 13.4% (172) `write` 12.2% (722) `vocabulary` 9.3% (178) |
| 5.1% | `politics` | 0.0552 | 0.0125 | **over** | `vote` 49.5% (53) `normalisation` 22.3% (23) `reading` 7.3% (691) `name` 5.4% (799) |
| 3.9% | `linguistics` | 0.3029 | 0.1972 | **over** | `word` 31.7% (1,536) `name` 15.3% (704) `term` 13.2% (378) `parse` 5.0% (156) |
| 3.9% | `law` | 0.0949 | 0.0408 | **over** | `file` 10.7% (476) `witness` 9.6% (70) `summary` 8.4% (57) `verdict` 6.8% (10) |
| 3.8% | `literature` | 0.0016 | 0.0228 | under | `header` 37.6% (87) `write` 16.7% (721) `text` 12.5% (89) `prose` 8.1% (119) |

### `code-semantics-engine/src/main/java`

**3.6%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.7% | `electronics` | 0.0013 | 0.0161 | under | `tsv` 87.8% (42) `field` 5.8% (204) `headroom` 2.9% (2) `bar` 1.1% (106) |
| 13.7% | `chemistry` | 0.0018 | 0.0167 | under | `extraction` 39.8% (59) `fraction` 13.5% (14) `extract` 9.3% (7) `test` 9.1% (261) |
| 5.9% | `psychology` | 0.0015 | 0.0090 | under | `module` 80.8% (68) `confidence` 4.7% (18) `test` 4.0% (261) `know` 3.7% (75) |
| 4.1% | `animals` | 0.0004 | 0.0045 | under | `nest` 56.0% (28) `owl` 25.5% (24) `tail` 8.1% (24) `head` 6.3% (13) |
| 3.6% | `calculus` | 0.0137 | 0.0055 | **over** | `divergence` 100.0% (154) |
| 2.8% | `literature` | 0.0129 | 0.0228 | under | `header` 37.6% (87) `write` 16.7% (721) `text` 12.5% (89) `prose` 8.1% (119) |
| 2.1% | `grammar` | 0.0395 | 0.0277 | **over** | `phrase` 21.1% (148) `occurrence` 15.7% (173) `part_of_speech` 13.9% (37) `verb` 13.5% (74) |
| 2.0% | `information-science` | 0.0011 | 0.0043 | under | `synset` 71.5% (26) `document` 22.8% (77) `ontology` 5.1% (125) `align` 0.4% (1) |

### `code-semantics-engine/src/test/java`

**3.8%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.3% | `electronics` | 0.0004 | 0.0161 | under | `tsv` 87.8% (42) `field` 5.8% (204) `headroom` 2.9% (2) `bar` 1.1% (106) |
| 13.0% | `plants` | 0.0658 | 0.0299 | **over** | `root` 53.2% (161) `tree` 38.9% (200) `seed` 5.1% (49) `leaf` 2.0% (33) |
| 3.7% | `computer-languages` | 0.0001 | 0.0032 | under | `json` 68.7% (6) `sparql` 10.0% (1) `owl` 8.3% (24) `xml` 7.8% (6) |
| 3.5% | `chemistry` | 0.0074 | 0.0167 | under | `extraction` 39.8% (59) `fraction` 13.5% (14) `extract` 9.3% (7) `test` 9.1% (261) |
| 3.4% | `psychology` | 0.0027 | 0.0090 | under | `module` 80.8% (68) `confidence` 4.7% (18) `test` 4.0% (261) `know` 3.7% (75) |
| 3.0% | `mathematics` | 0.0320 | 0.0477 | under | `from` 28.7% (161) `function` 10.0% (97) `distribution` 6.7% (100) `count` 6.6% (68) |
| 2.9% | `publishing` | 0.0929 | 0.0707 | **over** | `publish` 25.3% (348) `read` 13.4% (172) `write` 12.2% (722) `vocabulary` 9.3% (178) |
| 2.5% | `astrology` | 0.0159 | 0.0080 | **over** | `placement` 94.9% (107) `term` 2.0% (394) `figure` 1.3% (108) `descendant` 1.2% (8) |

### `lexicon-extraction/src/main/java`

**17.1%** of the maximum divergence from the repository, against a null median of 5.0% over 999 resamples of the same size — an excess of +12.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.8% | `linguistics` | 0.0757 | 0.1972 | under | `word` 31.7% (1,536) `name` 15.3% (704) `term` 13.2% (378) `parse` 5.0% (156) |
| 7.5% | `electronics` | 0.0690 | 0.0161 | **over** | `tsv` 87.8% (42) `field` 5.8% (204) `headroom` 2.9% (2) `bar` 1.1% (106) |
| 7.2% | `literature` | 0.0804 | 0.0228 | **over** | `header` 37.6% (87) `write` 16.7% (721) `text` 12.5% (89) `prose` 8.1% (119) |
| 6.6% | `plants` | 0.0016 | 0.0299 | under | `root` 53.2% (161) `tree` 38.9% (200) `seed` 5.1% (49) `leaf` 2.0% (33) |
| 4.3% | `animals` | 0.0292 | 0.0045 | **over** | `nest` 56.0% (28) `owl` 25.5% (24) `tail` 8.1% (24) `head` 6.3% (13) |
| 4.2% | `computer-languages` | 0.0256 | 0.0032 | **over** | `json` 68.7% (6) `sparql` 10.0% (1) `owl` 8.3% (24) `xml` 7.8% (6) |
| 4.1% | `physics` | 0.0011 | 0.0190 | under | `mass` 46.2% (136) `weight` 29.1% (66) `length` 6.5% (72) `radius` 3.5% (2) |
| 3.4% | `money` | 0.0001 | 0.0123 | under | `share` 71.7% (334) `score` 8.8% (53) `say` 8.0% (284) `coverage` 4.3% (18) |

### `lexicon-extraction/src/test/java`

**19.9%** of the maximum divergence from the repository, against a null median of 6.1% over 999 resamples of the same size — an excess of +13.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.7% | `chemistry` | 0.1522 | 0.0167 | **over** | `extraction` 39.8% (59) `fraction` 13.5% (14) `extract` 9.3% (7) `test` 9.1% (261) |
| 12.6% | `electronics` | 0.1016 | 0.0161 | **over** | `tsv` 87.8% (42) `field` 5.8% (204) `headroom` 2.9% (2) `bar` 1.1% (106) |
| 7.4% | `linguistics` | 0.0901 | 0.1972 | under | `word` 31.7% (1,536) `name` 15.3% (704) `term` 13.2% (378) `parse` 5.0% (156) |
| 3.7% | `physics` | 0.0008 | 0.0190 | under | `mass` 46.2% (136) `weight` 29.1% (66) `length` 6.5% (72) `radius` 3.5% (2) |
| 3.1% | `person` | 0.0022 | 0.0206 | under | `reader` 18.4% (129) `child` 15.8% (23) `host` 11.0% (28) `parent` 8.0% (66) |
| 2.3% | `grammar` | 0.0073 | 0.0277 | under | `phrase` 21.1% (148) `occurrence` 15.7% (173) `part_of_speech` 13.9% (37) `verb` 13.5% (74) |
| 2.2% | `law` | 0.0152 | 0.0408 | under | `file` 10.7% (476) `witness` 9.6% (70) `summary` 8.4% (57) `verdict` 6.8% (10) |
| 2.1% | `psychology` | 0.0296 | 0.0090 | **over** | `module` 80.8% (68) `confidence` 4.7% (18) `test` 4.0% (261) `know` 3.7% (75) |

### `lexicon/src/main/java`

**18.4%** of the maximum divergence from the repository, against a null median of 9.4% over 999 resamples of the same size — an excess of +9.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.5% | `networking` | 0.0533 | 0.0060 | **over** | `resource` 72.3% (264) `preamble` 8.3% (8) `request` 5.9% (10) `node` 5.0% (80) |
| 8.0% | `plants` | 0.0000 | 0.0299 | under | `root` 53.2% (161) `tree` 38.9% (200) `seed` 5.1% (49) `leaf` 2.0% (33) |
| 6.7% | `publishing` | 0.0175 | 0.0707 | under | `publish` 25.3% (348) `read` 13.4% (172) `write` 12.2% (722) `vocabulary` 9.3% (178) |
| 5.1% | `grammar` | 0.0797 | 0.0277 | **over** | `phrase` 21.1% (148) `occurrence` 15.7% (173) `part_of_speech` 13.9% (37) `verb` 13.5% (74) |
| 4.4% | `linguistics` | 0.3024 | 0.1972 | **over** | `word` 31.7% (1,536) `name` 15.3% (704) `term` 13.2% (378) `parse` 5.0% (156) |
| 4.2% | `mathematics` | 0.1041 | 0.0477 | **over** | `from` 28.7% (161) `function` 10.0% (97) `distribution` 6.7% (100) `count` 6.6% (68) |
| 4.2% | `physics` | 0.0007 | 0.0190 | under | `mass` 46.2% (136) `weight` 29.1% (66) `length` 6.5% (72) `radius` 3.5% (2) |
| 4.1% | `chemistry` | 0.0002 | 0.0167 | under | `extraction` 39.8% (59) `fraction` 13.5% (14) `extract` 9.3% (7) `test` 9.1% (261) |

### `lexicon/src/test/java`

**12.1%** of the maximum divergence from the repository, against a null median of 9.4% over 999 resamples of the same size — an excess of +2.7 points, and 37 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.9% | `plants` | 0.0001 | 0.0299 | under | `root` 53.2% (161) `tree` 38.9% (200) `seed` 5.1% (49) `leaf` 2.0% (33) |
| 6.6% | `electronics` | 0.0000 | 0.0161 | under | `tsv` 87.8% (42) `field` 5.8% (204) `headroom` 2.9% (2) `bar` 1.1% (106) |
| 4.7% | `lexicography` | 0.0328 | 0.0082 | **over** | `citation` 87.0% (96) `sense` 10.0% (317) `lemma` 1.3% (79) `gloss` 1.1% (1) |
| 3.9% | `chemistry` | 0.0021 | 0.0167 | under | `extraction` 39.8% (59) `fraction` 13.5% (14) `extract` 9.3% (7) `test` 9.1% (261) |
| 3.9% | `telecommunication` | 0.0832 | 0.0431 | **over** | `file` 61.7% (229) `entry` 31.3% (200) `copy` 3.3% (37) `note` 1.6% (6) |
| 3.7% | `linguistics` | 0.2735 | 0.1972 | **over** | `word` 31.7% (1,536) `name` 15.3% (704) `term` 13.2% (378) `parse` 5.0% (156) |
| 3.2% | `astrology` | 0.0000 | 0.0080 | under | `placement` 94.9% (107) `term` 2.0% (394) `figure` 1.3% (108) `descendant` 1.2% (8) |
| 2.6% | `administration` | 0.0001 | 0.0067 | under | `branch` 69.3% (143) `foreign` 10.7% (11) `title` 9.6% (12) `english` 4.0% (75) |

### `documentation`

**23.4%** of the maximum divergence from the repository, against a null median of 34.9% over 999 resamples of the same size — an excess of -11.4 points, and 980 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.7 s, recorded rather than estimated.
