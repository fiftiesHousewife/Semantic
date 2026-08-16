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
| `linguistics` | 0.0507 | 80.8% | 4,078 | 149 | 12,024 | 33.6% | `word` 32.4% (1,478) `name` 16.1% (671) `term` 12.1% (324) `parse` 4.9% (138) |
| `computing` | 0.0134 | 82.7% | 6,045 | 28 | 1,661 | 4.6% | `repository` 7.6% (446) `folder` 4.8% (32) `read` 4.4% (814) `parse` 4.1% (138) |

Read over 486 files and 35,766 lines: 463 topics, 1 files no topic could be resolved for, and 33.6% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.0%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +6.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.8% | `telecommunication` | 0.0002 | 0.0422 | under | `file` 64.6% (237) `entry` 29.2% (184) `copy` 2.3% (27) `note` 2.0% (7) |
| 6.7% | `publishing` | 0.0171 | 0.0650 | under | `publish` 22.9% (297) `read` 13.8% (159) `write` 11.6% (647) `vocabulary` 10.4% (168) |
| 6.6% | `plants` | 0.0018 | 0.0293 | under | `root` 57.0% (150) `tree` 37.8% (172) `seed` 3.5% (28) `leaf` 0.9% (19) |
| 6.2% | `physics` | 0.0665 | 0.0194 | **over** | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (71) `radius` 3.5% (3) |
| 4.8% | `time_period` | 0.0292 | 0.0041 | **over** | `span` 46.6% (19) `none` 24.1% (8) `long` 5.4% (24) `even` 4.9% (4) |
| 3.7% | `electronics` | 0.0008 | 0.0156 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 3.7% | `lexicography` | 0.0349 | 0.0091 | **over** | `citation` 85.7% (96) `sense` 10.8% (313) `gloss` 1.7% (2) `lemma` 1.2% (78) |
| 2.8% | `astrology` | 0.0000 | 0.0091 | under | `placement` 96.8% (102) `term` 1.4% (333) `figure` 1.2% (106) `scheme` 0.5% (37) |

### `code-semantics-api/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +5.0 points, and 40 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.2% | `telecommunication` | 0.0017 | 0.0422 | under | `file` 64.6% (237) `entry` 29.2% (184) `copy` 2.3% (27) `note` 2.0% (7) |
| 6.7% | `biology` | 0.0383 | 0.0024 | **over** | `morphology` 30.1% (19) `owl` 21.6% (22) `person` 9.5% (23) `glob` 8.5% (5) |
| 6.5% | `plants` | 0.0004 | 0.0293 | under | `root` 57.0% (150) `tree` 37.8% (172) `seed` 3.5% (28) `leaf` 0.9% (19) |
| 5.3% | `publishing` | 0.0167 | 0.0650 | under | `publish` 22.9% (297) `read` 13.8% (159) `write` 11.6% (647) `vocabulary` 10.4% (168) |
| 4.9% | `politics` | 0.0552 | 0.0132 | **over** | `vote` 51.7% (53) `normalisation` 23.5% (19) `reading` 6.3% (633) `name` 5.4% (762) |
| 3.9% | `literature` | 0.0016 | 0.0230 | under | `header` 36.2% (80) `write` 14.9% (646) `text` 12.6% (80) `prose` 8.5% (112) |
| 3.7% | `linguistics` | 0.3029 | 0.2002 | **over** | `word` 32.4% (1,478) `name` 16.1% (671) `term` 12.1% (324) `parse` 4.9% (138) |
| 3.5% | `law` | 0.0949 | 0.0430 | **over** | `file` 11.5% (474) `witness` 9.8% (73) `summary` 8.6% (55) `claim` 6.7% (111) |

### `code-semantics-engine/src/main/java`

**3.8%** of the maximum divergence from the repository, against a null median of 1.5% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.5% | `electronics` | 0.0014 | 0.0156 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 10.7% | `chemistry` | 0.0020 | 0.0149 | under | `extraction` 33.1% (52) `fraction` 14.6% (13) `extract` 10.0% (7) `test` 8.0% (234) |
| 7.0% | `psychology` | 0.0014 | 0.0100 | under | `module` 82.0% (74) `confidence` 6.0% (20) `know` 3.8% (72) `test` 3.5% (234) |
| 4.2% | `animals` | 0.0004 | 0.0048 | under | `nest` 57.0% (28) `owl` 28.2% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.7% | `calculus` | 0.0149 | 0.0061 | **over** | `divergence` 100.0% (165) |
| 2.9% | `plants` | 0.0176 | 0.0293 | under | `root` 57.0% (150) `tree` 37.8% (172) `seed` 3.5% (28) `leaf` 0.9% (19) |
| 2.9% | `literature` | 0.0128 | 0.0230 | under | `header` 36.2% (80) `write` 14.9% (646) `text` 12.6% (80) `prose` 8.5% (112) |
| 2.8% | `grammar` | 0.0445 | 0.0299 | **over** | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |

### `code-semantics-engine/src/test/java`

**4.0%** of the maximum divergence from the repository, against a null median of 1.6% over 999 resamples of the same size — an excess of +2.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.9% | `electronics` | 0.0004 | 0.0156 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 14.0% | `plants` | 0.0674 | 0.0293 | **over** | `root` 57.0% (150) `tree` 37.8% (172) `seed` 3.5% (28) `leaf` 0.9% (19) |
| 4.7% | `animals` | 0.0002 | 0.0048 | under | `nest` 57.0% (28) `owl` 28.2% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 3.6% | `psychology` | 0.0030 | 0.0100 | under | `module` 82.0% (74) `confidence` 6.0% (20) `know` 3.8% (72) `test` 3.5% (234) |
| 3.5% | `publishing` | 0.0891 | 0.0650 | **over** | `publish` 22.9% (297) `read` 13.8% (159) `write` 11.6% (647) `vocabulary` 10.4% (168) |
| 3.3% | `computer-languages` | 0.0001 | 0.0030 | under | `json` 74.8% (6) `sparql` 10.9% (1) `owl` 7.9% (22) `java` 4.2% (67) |
| 3.2% | `mathematics` | 0.0334 | 0.0506 | under | `from` 28.8% (146) `function` 10.0% (92) `distribution` 6.9% (91) `lemma` 6.4% (78) |
| 3.0% | `astrology` | 0.0184 | 0.0091 | **over** | `placement` 96.8% (102) `term` 1.4% (333) `figure` 1.2% (106) `scheme` 0.5% (37) |

### `lexicon-extraction/src/main/java`

**18.6%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +12.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `linguistics` | 0.0916 | 0.2002 | under | `word` 32.4% (1,478) `name` 16.1% (671) `term` 12.1% (324) `parse` 4.9% (138) |
| 7.2% | `literature` | 0.0840 | 0.0230 | **over** | `header` 36.2% (80) `write` 14.9% (646) `text` 12.6% (80) `prose` 8.5% (112) |
| 6.4% | `animals` | 0.0414 | 0.0048 | **over** | `nest` 57.0% (28) `owl` 28.2% (22) `head` 8.0% (14) `posterior` 3.5% (6) |
| 6.4% | `grammar` | 0.0012 | 0.0299 | under | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |
| 5.6% | `plants` | 0.0019 | 0.0293 | under | `root` 57.0% (150) `tree` 37.8% (172) `seed` 3.5% (28) `leaf` 0.9% (19) |
| 5.3% | `electronics` | 0.0596 | 0.0156 | **over** | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 4.6% | `computer-languages` | 0.0283 | 0.0030 | **over** | `json` 74.8% (6) `sparql` 10.9% (1) `owl` 7.9% (22) `java` 4.2% (67) |
| 4.0% | `physics` | 0.0009 | 0.0194 | under | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (71) `radius` 3.5% (3) |

### `lexicon-extraction/src/test/java`

**21.9%** of the maximum divergence from the repository, against a null median of 7.5% over 999 resamples of the same size — an excess of +14.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.5% | `chemistry` | 0.1468 | 0.0149 | **over** | `extraction` 33.1% (52) `fraction` 14.6% (13) `extract` 10.0% (7) `test` 8.0% (234) |
| 16.5% | `electronics` | 0.1281 | 0.0156 | **over** | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 5.4% | `linguistics` | 0.1019 | 0.2002 | under | `word` 32.4% (1,478) `name` 16.1% (671) `term` 12.1% (324) `parse` 4.9% (138) |
| 3.5% | `physics` | 0.0008 | 0.0194 | under | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (71) `radius` 3.5% (3) |
| 2.8% | `person` | 0.0028 | 0.0221 | under | `reader` 26.3% (137) `child` 14.4% (20) `host` 12.0% (29) `bearer` 7.4% (18) |
| 2.7% | `psychology` | 0.0368 | 0.0100 | **over** | `module` 82.0% (74) `confidence` 6.0% (20) `know` 3.8% (72) `test` 3.5% (234) |
| 2.4% | `law` | 0.0146 | 0.0430 | under | `file` 11.5% (474) `witness` 9.8% (73) `summary` 8.6% (55) `claim` 6.7% (111) |
| 2.1% | `grammar` | 0.0086 | 0.0299 | under | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |

### `lexicon/src/main/java`

**18.8%** of the maximum divergence from the repository, against a null median of 10.7% over 999 resamples of the same size — an excess of +8.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.8% | `plants` | 0.0000 | 0.0293 | under | `root` 57.0% (150) `tree` 37.8% (172) `seed` 3.5% (28) `leaf` 0.9% (19) |
| 5.0% | `publishing` | 0.0192 | 0.0650 | under | `publish` 22.9% (297) `read` 13.8% (159) `write` 11.6% (647) `vocabulary` 10.4% (168) |
| 4.6% | `person` | 0.0673 | 0.0221 | **over** | `reader` 26.3% (137) `child` 14.4% (20) `host` 12.0% (29) `bearer` 7.4% (18) |
| 4.3% | `physics` | 0.0006 | 0.0194 | under | `mass` 46.5% (139) `weight` 30.3% (69) `length` 6.4% (71) `radius` 3.5% (3) |
| 4.1% | `mathematics` | 0.1079 | 0.0506 | **over** | `from` 28.8% (146) `function` 10.0% (92) `distribution` 6.9% (91) `lemma` 6.4% (78) |
| 4.0% | `networking` | 0.0305 | 0.0048 | **over** | `resource` 66.2% (256) `preamble` 9.9% (8) `request` 8.2% (11) `node` 6.5% (68) |
| 3.9% | `grammar` | 0.0758 | 0.0299 | **over** | `phrase` 21.7% (151) `occurrence` 16.0% (184) `part_of_speech` 15.8% (39) `verb` 13.7% (77) |
| 3.7% | `linguistics` | 0.2985 | 0.2002 | **over** | `word` 32.4% (1,478) `name` 16.1% (671) `term` 12.1% (324) `parse` 4.9% (138) |

### `lexicon/src/test/java`

**14.5%** of the maximum divergence from the repository, against a null median of 11.6% over 999 resamples of the same size — an excess of +2.9 points, and 58 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.6% | `plants` | 0.0002 | 0.0293 | under | `root` 57.0% (150) `tree` 37.8% (172) `seed` 3.5% (28) `leaf` 0.9% (19) |
| 7.1% | `linguistics` | 0.3217 | 0.2002 | **over** | `word` 32.4% (1,478) `name` 16.1% (671) `term` 12.1% (324) `parse` 4.9% (138) |
| 5.8% | `lexicography` | 0.0423 | 0.0091 | **over** | `citation` 85.7% (96) `sense` 10.8% (313) `gloss` 1.7% (2) `lemma` 1.2% (78) |
| 5.3% | `electronics` | 0.0000 | 0.0156 | under | `tsv` 86.7% (38) `field` 6.5% (198) `headroom` 3.1% (2) `bar` 1.2% (103) |
| 3.1% | `astrology` | 0.0000 | 0.0091 | under | `placement` 96.8% (102) `term` 1.4% (333) `figure` 1.2% (106) `scheme` 0.5% (37) |
| 3.0% | `chemistry` | 0.0017 | 0.0149 | under | `extraction` 33.1% (52) `fraction` 14.6% (13) `extract` 10.0% (7) `test` 8.0% (234) |
| 2.1% | `calculus` | 0.0000 | 0.0061 | under | `divergence` 100.0% (165) |
| 2.0% | `information-science` | 0.0171 | 0.0044 | **over** | `synset` 72.5% (26) `document` 21.3% (67) `ontology` 5.6% (104) `align` 0.4% (1) |

### `documentation`

**24.0%** of the maximum divergence from the repository, against a null median of 35.1% over 999 resamples of the same size — an excess of -11.1 points, and 979 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.4 s, recorded rather than estimated.
