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
| `linguistics` | 0.0527 | 65.7% | 4,408 | 176 | 14,235 | 35.5% | `word` 30.5% (1,580) `term` 15.8% (390) `name` 15.4% (744) `parse` 4.7% (159) |
| `computing` | 0.0146 | 71.4% | 6,653 | 33 | 1,813 | 4.5% | `repository` 6.6% (467) `folder` 5.2% (37) `read` 5.0% (930) `dictionary` 3.8% (235) |

Read over 552 files and 40,146 lines: 468 topics, 4 files no topic could be resolved for, and 35.5% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.2% of it; the other 75.8% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.2%** of the maximum divergence from the repository, against a null median of 9.6% over 999 resamples of the same size — an excess of +6.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.9% | `telecommunication` | 0.0002 | 0.0434 | under | `file` 62.4% (240) `entry` 31.0% (215) `copy` 3.2% (37) `note` 1.5% (6) |
| 8.9% | `publishing` | 0.0148 | 0.0709 | under | `publish` 24.8% (354) `read` 14.6% (183) `write` 11.5% (729) `vocabulary` 9.3% (179) |
| 6.7% | `plants` | 0.0018 | 0.0298 | under | `root` 52.6% (161) `tree` 39.6% (202) `seed` 5.0% (49) `leaf` 1.9% (36) |
| 5.3% | `time_period` | 0.0315 | 0.0042 | **over** | `span` 52.2% (26) `none` 20.3% (9) `stage` 6.5% (23) `long` 4.5% (23) |
| 4.7% | `physics` | 0.0578 | 0.0187 | **over** | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.4% | `lexicography` | 0.0323 | 0.0082 | **over** | `citation` 86.2% (98) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.4% | `politics` | 0.0402 | 0.0126 | **over** | `vote` 52.0% (56) `normalisation` 21.5% (23) `reading` 6.9% (699) `name` 4.7% (835) |
| 2.7% | `electronics` | 0.0007 | 0.0119 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |

### `code-semantics-api/src/test/java`

**21.0%** of the maximum divergence from the repository, against a null median of 15.3% over 999 resamples of the same size — an excess of +5.7 points, and 22 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.5% | `telecommunication` | 0.0014 | 0.0434 | under | `file` 62.4% (240) `entry` 31.0% (215) `copy` 3.2% (37) `note` 1.5% (6) |
| 6.9% | `publishing` | 0.0147 | 0.0709 | under | `publish` 24.8% (354) `read` 14.6% (183) `write` 11.5% (729) `vocabulary` 9.3% (179) |
| 6.1% | `biology` | 0.0370 | 0.0027 | **over** | `morphology` 26.2% (21) `owl` 21.2% (24) `person` 8.3% (24) `glob` 7.1% (4) |
| 6.0% | `politics` | 0.0611 | 0.0126 | **over** | `vote` 52.0% (56) `normalisation` 21.5% (23) `reading` 6.9% (699) `name` 4.7% (835) |
| 5.9% | `plants` | 0.0009 | 0.0298 | under | `root` 52.6% (161) `tree` 39.6% (202) `seed` 5.0% (49) `leaf` 1.9% (36) |
| 5.0% | `law` | 0.1071 | 0.0422 | **over** | `file` 10.3% (493) `witness` 9.1% (70) `summary` 8.3% (57) `claim` 7.1% (119) |
| 3.9% | `literature` | 0.0017 | 0.0238 | under | `header` 36.1% (87) `write` 16.5% (728) `text` 13.7% (105) `prose` 8.7% (127) |
| 3.2% | `linguistics` | 0.3002 | 0.2032 | **over** | `word` 30.5% (1,580) `term` 15.8% (390) `name` 15.4% (744) `parse` 4.7% (159) |

### `code-semantics-engine/src/main/java`

**3.4%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `chemistry` | 0.0018 | 0.0157 | under | `extraction` 50.2% (59) `fraction` 13.0% (14) `extract` 9.0% (7) `render` 5.1% (14) |
| 10.4% | `electronics` | 0.0013 | 0.0119 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 6.0% | `psychology` | 0.0015 | 0.0086 | under | `module` 83.7% (68) `confidence` 4.7% (18) `know` 3.6% (73) `matter` 1.7% (28) |
| 4.3% | `animals` | 0.0004 | 0.0044 | under | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 3.8% | `calculus` | 0.0134 | 0.0054 | **over** | `divergence` 100.0% (154) |
| 3.6% | `literature` | 0.0127 | 0.0238 | under | `header` 36.1% (87) `write` 16.5% (728) `text` 13.7% (105) `prose` 8.7% (127) |
| 2.2% | `information-science` | 0.0011 | 0.0043 | under | `synset` 70.2% (26) `document` 24.2% (78) `ontology` 4.9% (125) `align` 0.4% (1) |
| 2.2% | `grammar` | 0.0415 | 0.0295 | **over** | `phrase` 21.5% (160) `occurrence` 15.5% (179) `verb` 15.4% (86) `part_of_speech` 12.3% (37) |

### `code-semantics-engine/src/test/java`

**3.7%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `electronics` | 0.0004 | 0.0119 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 13.2% | `plants` | 0.0652 | 0.0298 | **over** | `root` 52.6% (161) `tree` 39.6% (202) `seed` 5.0% (49) `leaf` 1.9% (36) |
| 4.8% | `psychology` | 0.0018 | 0.0086 | under | `module` 83.7% (68) `confidence` 4.7% (18) `know` 3.6% (73) `matter` 1.7% (28) |
| 4.7% | `chemistry` | 0.0057 | 0.0157 | under | `extraction` 50.2% (59) `fraction` 13.0% (14) `extract` 9.0% (7) `render` 5.1% (14) |
| 3.3% | `mathematics` | 0.0313 | 0.0475 | under | `from` 28.3% (161) `function` 10.2% (98) `count` 7.1% (72) `distribution` 6.8% (100) |
| 2.9% | `quality` | 0.0105 | 0.0041 | **over** | `ordinary` 27.9% (48) `tolerance` 12.1% (6) `dark` 6.9% (1) `best` 5.7% (8) |
| 2.6% | `computer-languages` | 0.0001 | 0.0025 | under | `json` 46.2% (4) `xml` 17.2% (6) `sparql` 14.7% (1) `owl` 12.4% (24) |
| 2.5% | `astrology` | 0.0153 | 0.0077 | **over** | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |

### `lexicon-extraction/src/main/java`

**16.4%** of the maximum divergence from the repository, against a null median of 5.1% over 999 resamples of the same size — an excess of +11.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.3% | `linguistics` | 0.0794 | 0.2032 | under | `word` 30.5% (1,580) `term` 15.8% (390) `name` 15.4% (744) `parse` 4.7% (159) |
| 7.2% | `literature` | 0.0806 | 0.0238 | **over** | `header` 36.1% (87) `write` 16.5% (728) `text` 13.7% (105) `prose` 8.7% (127) |
| 6.8% | `plants` | 0.0016 | 0.0298 | under | `root` 52.6% (161) `tree` 39.6% (202) `seed` 5.0% (49) `leaf` 1.9% (36) |
| 4.5% | `psychology` | 0.0387 | 0.0086 | **over** | `module` 83.7% (68) `confidence` 4.7% (18) `know` 3.6% (73) `matter` 1.7% (28) |
| 4.5% | `animals` | 0.0292 | 0.0044 | **over** | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 4.1% | `physics` | 0.0011 | 0.0187 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.9% | `grammar` | 0.0056 | 0.0295 | under | `phrase` 21.5% (160) `occurrence` 15.5% (179) `verb` 15.4% (86) `part_of_speech` 12.3% (37) |
| 3.6% | `money` | 0.0001 | 0.0123 | under | `share` 71.8% (343) `score` 8.6% (53) `say` 7.8% (283) `coverage` 4.3% (18) |

### `lexicon-extraction/src/test/java`

**20.2%** of the maximum divergence from the repository, against a null median of 6.2% over 999 resamples of the same size — an excess of +14.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.9% | `chemistry` | 0.1473 | 0.0157 | **over** | `extraction` 50.2% (59) `fraction` 13.0% (14) `extract` 9.0% (7) `render` 5.1% (14) |
| 12.0% | `electronics` | 0.0894 | 0.0119 | **over** | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 6.5% | `linguistics` | 0.0990 | 0.2032 | under | `word` 30.5% (1,580) `term` 15.8% (390) `name` 15.4% (744) `parse` 4.7% (159) |
| 3.4% | `physics` | 0.0011 | 0.0187 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.2% | `person` | 0.0020 | 0.0207 | under | `reader` 18.1% (132) `child` 15.6% (23) `host` 10.8% (28) `parent` 7.9% (66) |
| 3.1% | `law` | 0.0121 | 0.0422 | under | `file` 10.3% (493) `witness` 9.1% (70) `summary` 8.3% (57) `claim` 7.1% (119) |
| 2.8% | `grammar` | 0.0065 | 0.0295 | under | `phrase` 21.5% (160) `occurrence` 15.5% (179) `verb` 15.4% (86) `part_of_speech` 12.3% (37) |
| 2.3% | `computing` | 0.1087 | 0.0622 | **over** | `repository` 6.6% (467) `folder` 5.2% (37) `read` 5.0% (930) `dictionary` 3.8% (235) |

### `lexicon/src/main/java`

**18.3%** of the maximum divergence from the repository, against a null median of 9.3% over 999 resamples of the same size — an excess of +8.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `networking` | 0.0520 | 0.0058 | **over** | `resource` 72.5% (264) `preamble` 8.3% (8) `request` 5.9% (10) `node` 5.1% (80) |
| 8.1% | `plants` | 0.0000 | 0.0298 | under | `root` 52.6% (161) `tree` 39.6% (202) `seed` 5.0% (49) `leaf` 1.9% (36) |
| 6.8% | `publishing` | 0.0174 | 0.0709 | under | `publish` 24.8% (354) `read` 14.6% (183) `write` 11.5% (729) `vocabulary` 9.3% (179) |
| 4.8% | `grammar` | 0.0800 | 0.0295 | **over** | `phrase` 21.5% (160) `occurrence` 15.5% (179) `verb` 15.4% (86) `part_of_speech` 12.3% (37) |
| 4.3% | `linguistics` | 0.3082 | 0.2032 | **over** | `word` 30.5% (1,580) `term` 15.8% (390) `name` 15.4% (744) `parse` 4.7% (159) |
| 4.3% | `mathematics` | 0.1042 | 0.0475 | **over** | `from` 28.3% (161) `function` 10.2% (98) `count` 7.1% (72) `distribution` 6.8% (100) |
| 4.1% | `physics` | 0.0007 | 0.0187 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.9% | `chemistry` | 0.0002 | 0.0157 | under | `extraction` 50.2% (59) `fraction` 13.0% (14) `extract` 9.0% (7) `render` 5.1% (14) |

### `lexicon/src/test/java`

**12.2%** of the maximum divergence from the repository, against a null median of 9.4% over 999 resamples of the same size — an excess of +2.8 points, and 24 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.8% | `plants` | 0.0001 | 0.0298 | under | `root` 52.6% (161) `tree` 39.6% (202) `seed` 5.0% (49) `leaf` 1.9% (36) |
| 6.0% | `chemistry` | 0.0002 | 0.0157 | under | `extraction` 50.2% (59) `fraction` 13.0% (14) `extract` 9.0% (7) `render` 5.1% (14) |
| 4.8% | `lexicography` | 0.0331 | 0.0082 | **over** | `citation` 86.2% (98) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 4.8% | `electronics` | 0.0000 | 0.0119 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 4.0% | `linguistics` | 0.2844 | 0.2032 | **over** | `word` 30.5% (1,580) `term` 15.8% (390) `name` 15.4% (744) `parse` 4.7% (159) |
| 3.4% | `telecommunication` | 0.0807 | 0.0434 | **over** | `file` 62.4% (240) `entry` 31.0% (215) `copy` 3.2% (37) `note` 1.5% (6) |
| 3.1% | `astrology` | 0.0000 | 0.0077 | under | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |
| 2.9% | `psychology` | 0.0003 | 0.0086 | under | `module` 83.7% (68) `confidence` 4.7% (18) `know` 3.6% (73) `matter` 1.7% (28) |

### `documentation`

**23.2%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of -10.9 points, and 981 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.4 s, recorded rather than estimated.
