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
| `linguistics` | 0.0506 | 80.6% | 4,221 | 162 | 12,974 | 34.0% | `word` 31.9% (1,529) `name` 15.3% (695) `term` 12.9% (367) `parse` 5.0% (155) |
| `computing` | 0.0144 | 82.1% | 6,356 | 33 | 1,818 | 4.8% | `repository` 6.9% (455) `folder` 5.5% (36) `read` 4.9% (863) `dictionary` 4.0% (229) |

Read over 527 files and 38,209 lines: 466 topics, 4 files no topic could be resolved for, and 34.0% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 23.7% of it; the other 76.3% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.0%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +6.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.3% | `telecommunication` | 0.0002 | 0.0440 | under | `file` 62.1% (231) `entry` 31.0% (199) `copy` 3.3% (35) `note` 1.6% (6) |
| 7.3% | `publishing` | 0.0173 | 0.0683 | under | `publish` 26.0% (346) `write` 12.6% (705) `read` 11.4% (156) `vocabulary` 9.8% (179) |
| 7.2% | `plants` | 0.0018 | 0.0313 | under | `root` 53.4% (162) `tree` 38.8% (199) `seed` 5.0% (48) `leaf` 1.9% (32) |
| 5.3% | `time_period` | 0.0315 | 0.0043 | **over** | `span` 53.9% (27) `none` 20.9% (9) `long` 4.6% (23) `even` 4.2% (3) |
| 4.5% | `physics` | 0.0581 | 0.0194 | **over** | `mass` 47.7% (136) `weight` 27.4% (64) `length` 6.7% (72) `radius` 3.6% (2) |
| 3.8% | `politics` | 0.0427 | 0.0129 | **over** | `vote` 49.5% (53) `normalisation` 22.3% (22) `reading` 7.3% (675) `name` 5.4% (790) |
| 3.7% | `electronics` | 0.0007 | 0.0153 | under | `tsv` 86.6% (38) `field` 6.4% (199) `headroom` 3.1% (2) `bar` 1.3% (103) |
| 3.3% | `lexicography` | 0.0323 | 0.0085 | **over** | `citation` 87.0% (94) `sense` 10.0% (317) `lemma` 1.3% (79) `gloss` 1.1% (1) |

### `code-semantics-api/src/test/java`

**20.5%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +4.9 points, and 27 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `telecommunication` | 0.0017 | 0.0440 | under | `file` 62.1% (231) `entry` 31.0% (199) `copy` 3.3% (35) `note` 1.6% (6) |
| 7.0% | `plants` | 0.0004 | 0.0313 | under | `root` 53.4% (162) `tree` 38.8% (199) `seed` 5.0% (48) `leaf` 1.9% (32) |
| 6.6% | `biology` | 0.0383 | 0.0026 | **over** | `morphology` 27.1% (21) `owl` 22.1% (24) `person` 8.8% (24) `glob` 7.6% (4) |
| 5.9% | `publishing` | 0.0167 | 0.0683 | under | `publish` 26.0% (346) `write` 12.6% (705) `read` 11.4% (156) `vocabulary` 9.8% (179) |
| 5.0% | `politics` | 0.0552 | 0.0129 | **over** | `vote` 49.5% (53) `normalisation` 22.3% (22) `reading` 7.3% (675) `name` 5.4% (790) |
| 3.8% | `law` | 0.0949 | 0.0417 | **over** | `file` 10.9% (471) `witness` 9.6% (70) `summary` 8.5% (57) `verdict` 6.8% (10) |
| 3.7% | `linguistics` | 0.3029 | 0.2008 | **over** | `word` 31.9% (1,529) `name` 15.3% (695) `term` 12.9% (367) `parse` 5.0% (155) |
| 3.6% | `literature` | 0.0016 | 0.0218 | under | `header` 36.0% (83) `write` 17.0% (704) `text` 12.5% (86) `prose` 8.4% (118) |

### `code-semantics-engine/src/main/java`

**3.4%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.6% | `electronics` | 0.0013 | 0.0153 | under | `tsv` 86.6% (38) `field` 6.4% (199) `headroom` 3.1% (2) `bar` 1.3% (103) |
| 11.3% | `chemistry` | 0.0019 | 0.0142 | under | `extraction` 34.5% (54) `fraction` 15.1% (14) `extract` 10.4% (7) `test` 8.6% (254) |
| 6.5% | `psychology` | 0.0015 | 0.0092 | under | `module` 80.9% (68) `confidence` 4.7% (18) `test` 3.9% (254) `know` 3.7% (75) |
| 4.3% | `animals` | 0.0004 | 0.0045 | under | `nest` 60.2% (28) `owl` 27.4% (24) `head` 6.8% (13) `posterior` 3.3% (5) |
| 3.8% | `calculus` | 0.0139 | 0.0056 | **over** | `divergence` 100.0% (154) |
| 2.4% | `information-science` | 0.0011 | 0.0044 | under | `synset` 71.6% (26) `document` 22.9% (77) `ontology` 5.0% (114) `align` 0.4% (1) |
| 2.3% | `literature` | 0.0131 | 0.0218 | under | `header` 36.0% (83) `write` 17.0% (704) `text` 12.5% (86) `prose` 8.4% (118) |
| 2.2% | `grammar` | 0.0398 | 0.0280 | **over** | `phrase` 21.3% (147) `occurrence` 15.9% (172) `part_of_speech` 14.1% (37) `verb` 13.6% (74) |

### `code-semantics-engine/src/test/java`

**3.8%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.5% | `electronics` | 0.0004 | 0.0153 | under | `tsv` 86.6% (38) `field` 6.4% (199) `headroom` 3.1% (2) `bar` 1.3% (103) |
| 12.8% | `plants` | 0.0673 | 0.0313 | **over** | `root` 53.4% (162) `tree` 38.8% (199) `seed` 5.0% (48) `leaf` 1.9% (32) |
| 3.9% | `computer-languages` | 0.0001 | 0.0033 | under | `json` 68.7% (6) `sparql` 10.0% (1) `owl` 8.3% (24) `xml` 7.8% (6) |
| 3.6% | `psychology` | 0.0027 | 0.0092 | under | `module` 80.9% (68) `confidence` 4.7% (18) `test` 3.9% (254) `know` 3.7% (75) |
| 3.5% | `publishing` | 0.0926 | 0.0683 | **over** | `publish` 26.0% (346) `write` 12.6% (705) `read` 11.4% (156) `vocabulary` 9.8% (179) |
| 3.1% | `mathematics` | 0.0320 | 0.0479 | under | `from` 28.5% (156) `function` 10.1% (96) `distribution` 6.7% (98) `lemma` 6.6% (79) |
| 2.4% | `astrology` | 0.0160 | 0.0082 | **over** | `placement` 95.2% (107) `term` 1.7% (380) `figure` 1.3% (107) `descendant` 1.2% (7) |
| 2.0% | `quality` | 0.0085 | 0.0036 | **over** | `ordinary` 27.2% (48) `tolerance` 12.1% (6) `dark` 7.6% (1) `general` 5.1% (9) |

### `lexicon-extraction/src/main/java`

**18.5%** of the maximum divergence from the repository, against a null median of 5.6% over 999 resamples of the same size — an excess of +12.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.8% | `linguistics` | 0.0831 | 0.2008 | under | `word` 31.9% (1,529) `name` 15.3% (695) `term` 12.9% (367) `parse` 5.0% (155) |
| 6.6% | `literature` | 0.0786 | 0.0218 | **over** | `header` 36.0% (83) `write` 17.0% (704) `text` 12.5% (86) `prose` 8.4% (118) |
| 6.4% | `electronics` | 0.0647 | 0.0153 | **over** | `tsv` 86.6% (38) `field` 6.4% (199) `headroom` 3.1% (2) `bar` 1.3% (103) |
| 6.2% | `plants` | 0.0018 | 0.0313 | under | `root` 53.4% (162) `tree` 38.8% (199) `seed` 5.0% (48) `leaf` 1.9% (32) |
| 6.0% | `grammar` | 0.0012 | 0.0280 | under | `phrase` 21.3% (147) `occurrence` 15.9% (172) `part_of_speech` 14.1% (37) `verb` 13.6% (74) |
| 4.7% | `animals` | 0.0327 | 0.0045 | **over** | `nest` 60.2% (28) `owl` 27.4% (24) `head` 6.8% (13) `posterior` 3.3% (5) |
| 4.6% | `computer-languages` | 0.0293 | 0.0033 | **over** | `json` 68.7% (6) `sparql` 10.0% (1) `owl` 8.3% (24) `xml` 7.8% (6) |
| 4.0% | `physics` | 0.0010 | 0.0194 | under | `mass` 47.7% (136) `weight` 27.4% (64) `length` 6.7% (72) `radius` 3.6% (2) |

### `lexicon-extraction/src/test/java`

**19.9%** of the maximum divergence from the repository, against a null median of 6.8% over 999 resamples of the same size — an excess of +13.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.8% | `chemistry` | 0.1318 | 0.0142 | **over** | `extraction` 34.5% (54) `fraction` 15.1% (14) `extract` 10.4% (7) `test` 8.6% (254) |
| 15.5% | `electronics` | 0.1146 | 0.0153 | **over** | `tsv` 86.6% (38) `field` 6.4% (199) `headroom` 3.1% (2) `bar` 1.3% (103) |
| 6.0% | `linguistics` | 0.1015 | 0.2008 | under | `word` 31.9% (1,529) `name` 15.3% (695) `term` 12.9% (367) `parse` 5.0% (155) |
| 4.0% | `physics` | 0.0007 | 0.0194 | under | `mass` 47.7% (136) `weight` 27.4% (64) `length` 6.7% (72) `radius` 3.6% (2) |
| 3.0% | `person` | 0.0025 | 0.0209 | under | `reader` 18.8% (128) `child` 16.0% (22) `host` 11.2% (29) `bearer` 8.1% (18) |
| 2.6% | `psychology` | 0.0331 | 0.0092 | **over** | `module` 80.9% (68) `confidence` 4.7% (18) `test` 3.9% (254) `know` 3.7% (75) |
| 2.2% | `grammar` | 0.0077 | 0.0280 | under | `phrase` 21.3% (147) `occurrence` 15.9% (172) `part_of_speech` 14.1% (37) `verb` 13.6% (74) |
| 2.1% | `law` | 0.0160 | 0.0417 | under | `file` 10.9% (471) `witness` 9.6% (70) `summary` 8.5% (57) `verdict` 6.8% (10) |

### `lexicon/src/main/java`

**18.4%** of the maximum divergence from the repository, against a null median of 10.0% over 999 resamples of the same size — an excess of +8.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.5% | `plants` | 0.0000 | 0.0313 | under | `root` 53.4% (162) `tree` 38.8% (199) `seed` 5.0% (48) `leaf` 1.9% (32) |
| 6.1% | `grammar` | 0.0863 | 0.0280 | **over** | `phrase` 21.3% (147) `occurrence` 15.9% (172) `part_of_speech` 14.1% (37) `verb` 13.6% (74) |
| 6.0% | `networking` | 0.0411 | 0.0055 | **over** | `resource` 71.2% (262) `preamble` 8.7% (8) `request` 6.1% (10) `node` 5.1% (71) |
| 5.8% | `publishing` | 0.0189 | 0.0683 | under | `publish` 26.0% (346) `write` 12.6% (705) `read` 11.4% (156) `vocabulary` 9.8% (179) |
| 4.3% | `physics` | 0.0006 | 0.0194 | under | `mass` 47.7% (136) `weight` 27.4% (64) `length` 6.7% (72) `radius` 3.6% (2) |
| 3.7% | `linguistics` | 0.2983 | 0.2008 | **over** | `word` 31.9% (1,529) `name` 15.3% (695) `term` 12.9% (367) `parse` 5.0% (155) |
| 3.5% | `mathematics` | 0.0987 | 0.0479 | **over** | `from` 28.5% (156) `function` 10.1% (96) `distribution` 6.7% (98) `lemma` 6.6% (79) |
| 3.4% | `chemistry` | 0.0003 | 0.0142 | under | `extraction` 34.5% (54) `fraction` 15.1% (14) `extract` 10.4% (7) `test` 8.6% (254) |

### `lexicon/src/test/java`

**12.0%** of the maximum divergence from the repository, against a null median of 9.3% over 999 resamples of the same size — an excess of +2.6 points, and 42 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.6% | `plants` | 0.0001 | 0.0313 | under | `root` 53.4% (162) `tree` 38.8% (199) `seed` 5.0% (48) `leaf` 1.9% (32) |
| 6.3% | `electronics` | 0.0000 | 0.0153 | under | `tsv` 86.6% (38) `field` 6.4% (199) `headroom` 3.1% (2) `bar` 1.3% (103) |
| 4.6% | `lexicography` | 0.0328 | 0.0085 | **over** | `citation` 87.0% (94) `sense` 10.0% (317) `lemma` 1.3% (79) `gloss` 1.1% (1) |
| 3.7% | `telecommunication` | 0.0832 | 0.0440 | **over** | `file` 62.1% (231) `entry` 31.0% (199) `copy` 3.3% (35) `note` 1.6% (6) |
| 3.4% | `linguistics` | 0.2735 | 0.2008 | **over** | `word` 31.9% (1,529) `name` 15.3% (695) `term` 12.9% (367) `parse` 5.0% (155) |
| 3.4% | `astrology` | 0.0000 | 0.0082 | under | `placement` 95.2% (107) `term` 1.7% (380) `figure` 1.3% (107) `descendant` 1.2% (7) |
| 3.0% | `chemistry` | 0.0021 | 0.0142 | under | `extraction` 34.5% (54) `fraction` 15.1% (14) `extract` 10.4% (7) `test` 8.6% (254) |
| 2.7% | `administration` | 0.0001 | 0.0069 | under | `branch` 69.3% (140) `foreign` 10.7% (11) `title` 9.6% (12) `english` 4.0% (75) |

### `documentation`

**23.4%** of the maximum divergence from the repository, against a null median of 34.8% over 999 resamples of the same size — an excess of -11.4 points, and 973 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 7.2 s, recorded rather than estimated.
