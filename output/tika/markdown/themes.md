# Themes — tika

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
| `computing` | 0.1172 | 50.3% | 76,291 | 1,245 | 269,482 | 67.5% | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| `linguistics` | 0.0266 | 56.6% | 32,102 | 184 | 28,998 | 7.3% | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |

Read over 2,242 files and 399,203 lines: 555 topics, 40 files no topic could be resolved for, and 67.5% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 33.2% of it; the other 66.8% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `tika-annotation-processor/src/main/java`

**35.8%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of +6.9 points, and 195 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-annotation-processor/src/test/java`

**67.8%** of the maximum divergence from the repository, against a null median of 41.7% over 999 resamples of the same size — an excess of +26.1 points, and 99 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/main/java`

**14.1%** of the maximum divergence from the repository, against a null median of 22.9% over 999 resamples of the same size — an excess of -8.8 points, and 988 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/test/java`

**22.7%** of the maximum divergence from the repository, against a null median of 25.4% over 999 resamples of the same size — an excess of -2.7 points, and 689 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/main/java`

**42.7%** of the maximum divergence from the repository, against a null median of 43.5% over 999 resamples of the same size — an excess of -0.8 points, and 525 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/test/java`

**41.2%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of -1.4 points, and 540 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-core/src/main/java`

**4.2%** of the maximum divergence from the repository, against a null median of 1.0% over 999 resamples of the same size — an excess of +3.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.8% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 10.1% | `computer-languages` | 0.0033 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 7.0% | `computer-graphics` | 0.0216 | 0.0067 | **over** | `instance` 28.8% (593) `jpeg` 15.6% (49) `mpeg` 11.2% (48) `renderer` 10.5% (22) |
| 4.8% | `geography` | 0.0286 | 0.0134 | **over** | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 4.8% | `commerce` | 0.0003 | 0.0056 | under | `server` 68.9% (895) `packet` 9.8% (73) `package` 5.8% (229) `quote` 5.6% (66) |
| 4.5% | `linguistics` | 0.1148 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 3.3% | `plants` | 0.0013 | 0.0066 | under | `root` 50.7% (472) `log` 28.1% (537) `stub` 4.5% (82) `complete` 4.3% (180) |
| 2.1% | `person` | 0.0087 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |

### `tika-core/src/test/java`

**6.3%** of the maximum divergence from the repository, against a null median of 3.5% over 999 resamples of the same size — an excess of +2.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.1% | `electrotechnology` | 0.0550 | 0.0158 | **over** | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 8.2% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 4.3% | `literature` | 0.0065 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 4.2% | `metrology` | 0.0001 | 0.0061 | under | `array` 29.0% (828) `entropy` 13.3% (96) `rate` 7.5% (148) `measurement` 5.7% (13) |
| 3.8% | `programming` | 0.0817 | 0.0518 | **over** | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.3% | `grammar` | 0.0017 | 0.0092 | under | `num` 59.8% (471) `clause` 7.8% (33) `modify` 5.3% (129) `number` 4.9% (768) |
| 3.2% | `cryptography` | 0.0001 | 0.0045 | under | `encrypt` 20.9% (103) `password` 15.7% (194) `private_key` 13.6% (28) `md5` 12.7% (21) |
| 2.9% | `plants` | 0.0009 | 0.0066 | under | `root` 50.7% (472) `log` 28.1% (537) `stub` 4.5% (82) `complete` 4.3% (180) |

### `tika-detectors/tika-detector-magika/src/main/java`

**30.3%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of -12.4 points, and 846 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-magika/src/test/java`

**40.9%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of +7.5 points, and 252 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/main/java`

**36.3%** of the maximum divergence from the repository, against a null median of 41.9% over 999 resamples of the same size — an excess of -5.6 points, and 685 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/java`

**41.7%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of +8.9 points, and 210 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/java`

**26.1%** of the maximum divergence from the repository, against a null median of 25.7% over 999 resamples of the same size — an excess of +0.4 points, and 476 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-server/src/test/java`

**48.5%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of +14.6 points, and 118 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/main/java`

**19.2%** of the maximum divergence from the repository, against a null median of 16.9% over 999 resamples of the same size — an excess of +2.3 points, and 257 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/test/java`

**25.5%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -8.4 points, and 838 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java`

**19.0%** of the maximum divergence from the repository, against a null median of 16.6% over 999 resamples of the same size — an excess of +2.5 points, and 229 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java`

**44.0%** of the maximum divergence from the repository, against a null median of 42.5% over 999 resamples of the same size — an excess of +1.5 points, and 458 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java`

**17.2%** of the maximum divergence from the repository, against a null median of 13.5% over 999 resamples of the same size — an excess of +3.7 points, and 81 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java`

**15.3%** of the maximum divergence from the repository, against a null median of 11.4% over 999 resamples of the same size — an excess of +3.9 points, and 44 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java`

**27.1%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of -6.2 points, and 796 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/main/java`

**15.7%** of the maximum divergence from the repository, against a null median of 7.5% over 999 resamples of the same size — an excess of +8.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.1% | `publishing` | 0.0852 | 0.0175 | **over** | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 7.8% | `computing` | 0.1846 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 6.7% | `arithmetic` | 0.0308 | 0.0022 | **over** | `extract` 91.3% (1,175) `integer` 3.9% (153) `subtract` 0.7% (15) `position` 0.7% (254) |
| 5.7% | `theatre` | 0.0300 | 0.0032 | **over** | `mime` 77.0% (619) `script` 18.6% (916) `extra` 2.2% (17) `jackson` 1.0% (83) |
| 4.7% | `geology` | 0.0202 | 0.0012 | **over** | `col` 53.6% (69) `delta` 13.7% (41) `julian` 5.1% (5) `it` 4.6% (580) |
| 4.2% | `electrotechnology` | 0.0005 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 4.2% | `electronics` | 0.0006 | 0.0162 | under | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 4.0% | `databases` | 0.0224 | 0.0028 | **over** | `entity` 18.9% (298) `jdbc` 15.2% (36) `bookmark` 8.2% (26) `select` 7.1% (87) |

### `tika-eval/tika-eval-app/src/test/java`

**21.5%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +5.8 points, and 51 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-core/src/main/java`

**21.9%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +14.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 26.3% | `mathematics` | 0.2057 | 0.0258 | **over** | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 7.4% | `video-games` | 0.0523 | 0.0052 | **over** | `stats` 25.4% (45) `meta` 14.7% (175) `item` 11.7% (329) `oom` 4.1% (35) |
| 4.0% | `computer-languages` | 0.0001 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 3.9% | `telecommunication` | 0.0014 | 0.0235 | under | `file` 40.8% (3,338) `entry` 19.8% (839) `medium` 7.7% (448) `message` 3.7% (312) |
| 3.2% | `electronics` | 0.0003 | 0.0162 | under | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 2.9% | `metrology` | 0.0302 | 0.0061 | **over** | `array` 29.0% (828) `entropy` 13.3% (96) `rate` 7.5% (148) `measurement` 5.7% (13) |
| 2.6% | `geography` | 0.0004 | 0.0134 | under | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 2.6% | `quality` | 0.0221 | 0.0033 | **over** | `available` 9.3% (58) `external` 8.8% (193) `internal` 7.7% (57) `new` 6.2% (102) |

### `tika-eval/tika-eval-core/src/test/java`

**19.3%** of the maximum divergence from the repository, against a null median of 19.3% over 999 resamples of the same size — an excess of -0.1 points, and 510 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-example/src/main/java`

**15.2%** of the maximum divergence from the repository, against a null median of 6.6% over 999 resamples of the same size — an excess of +8.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.2% | `telecommunication` | 0.1173 | 0.0235 | **over** | `file` 40.8% (3,338) `entry` 19.8% (839) `medium` 7.7% (448) `message` 3.7% (312) |
| 6.0% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 3.8% | `electrotechnology` | 0.0468 | 0.0158 | **over** | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 3.3% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 2.7% | `mathematics` | 0.0071 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 2.6% | `buildings` | 0.0003 | 0.0098 | under | `log` 22.1% (537) `window` 20.4% (380) `tear_down` 16.8% (48) `machine` 8.0% (47) |
| 2.3% | `networking` | 0.0010 | 0.0111 | under | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 2.3% | `sport` | 0.0135 | 0.0020 | **over** | `ref` 36.2% (190) `balancer` 20.5% (16) `split` 9.2% (150) `champion` 7.7% (25) |

### `tika-example/src/test/java`

**28.6%** of the maximum divergence from the repository, against a null median of 15.8% over 999 resamples of the same size — an excess of +12.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `chemistry` | 0.1033 | 0.0115 | **over** | `buffer` 16.3% (430) `builder` 15.6% (189) `type` 14.4% (3,570) `char` 10.3% (604) |
| 7.7% | `electrotechnology` | 0.0933 | 0.0158 | **over** | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 4.5% | `buildings` | 0.0554 | 0.0098 | **over** | `log` 22.1% (537) `window` 20.4% (380) `tear_down` 16.8% (48) `machine` 8.0% (47) |
| 4.3% | `telecommunication` | 0.0813 | 0.0235 | **over** | `file` 40.8% (3,338) `entry` 19.8% (839) `medium` 7.7% (448) `message` 3.7% (312) |
| 4.1% | `computing` | 0.1871 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 3.7% | `programming` | 0.0108 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.7% | `linguistics` | 0.1668 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 2.5% | `person` | 0.0004 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |

### `tika-grpc/src/main/java`

**26.2%** of the maximum divergence from the repository, against a null median of 28.8% over 999 resamples of the same size — an excess of -2.6 points, and 640 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/java`

**34.8%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of +9.3 points, and 97 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-handlers/tika-handler-boilerpipe/src/main/java`

**38.9%** of the maximum divergence from the repository, against a null median of 42.0% over 999 resamples of the same size — an excess of -3.0 points, and 581 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java`

**35.1%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of +1.9 points, and 410 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java`

**38.0%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of -4.4 points, and 641 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java`

**33.3%** of the maximum divergence from the repository, against a null median of 33.6% over 999 resamples of the same size — an excess of -0.2 points, and 510 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java`

**43.8%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of +10.5 points, and 163 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java`

**63.1%** of the maximum divergence from the repository, against a null median of 22.9% over 999 resamples of the same size — an excess of +40.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 38.5% | `hydraulics` | 0.5502 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 14.6% | `christianity` | 0.1985 | 0.0019 | **over** | `use` 62.2% (4,419) `kind` 4.8% (2,192) `secret` 4.8% (77) `element` 3.8% (1,058) |
| 11.0% | `computing` | 0.0590 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 3.8% | `programming` | 0.0006 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.0% | `mathematics` | 0.0001 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 1.6% | `literature` | 0.0000 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 1.5% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 1.4% | `computer_science` | 0.0029 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |

### `tika-integration-tests/tika-resource-loading-tests/src/test/java`

**32.8%** of the maximum divergence from the repository, against a null median of 33.8% over 999 resamples of the same size — an excess of -1.0 points, and 540 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-woodstox-tests/src/test/java`

**45.2%** of the maximum divergence from the repository, against a null median of 42.6% over 999 resamples of the same size — an excess of +2.6 points, and 430 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/main/java`

**65.7%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of +31.5 points, and 18 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/java`

**39.0%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of -2.6 points, and 578 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup-core/src/main/java`

**33.5%** of the maximum divergence from the repository, against a null median of 17.8% over 999 resamples of the same size — an excess of +15.7 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.0% | `mathematics` | 0.1633 | 0.0258 | **over** | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 7.7% | `computing` | 0.1372 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 5.6% | `programming` | 0.0031 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 4.8% | `art` | 0.0424 | 0.0022 | **over** | `flag` 46.2% (321) `artist` 19.3% (29) `write` 8.8% (953) `key` 4.3% (1,843) |
| 4.7% | `rail-transport` | 0.0405 | 0.0017 | **over** | `pre` 24.2% (30) `exc` 22.9% (16) `helper` 15.3% (127) `uni` 8.2% (56) |
| 4.5% | `linguistics` | 0.1868 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 3.6% | `arithmetic` | 0.0339 | 0.0022 | **over** | `extract` 91.3% (1,175) `integer` 3.9% (153) `subtract` 0.7% (15) `position` 0.7% (254) |
| 3.6% | `computer_science` | 0.0008 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |

### `tika-langdetect/tika-langdetect-charsoup/src/main/java`

**30.7%** of the maximum divergence from the repository, against a null median of 28.8% over 999 resamples of the same size — an excess of +1.9 points, and 401 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/java`

**20.3%** of the maximum divergence from the repository, against a null median of 7.1% over 999 resamples of the same size — an excess of +13.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.0% | `computing` | 0.1069 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 7.1% | `telecommunications` | 0.0369 | 0.0016 | **over** | `ext` 83.2% (103) `csd` 3.1% (3) `prefix` 2.1% (659) `read` 2.1% (1,089) |
| 5.0% | `linguistics` | 0.1652 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 4.6% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 4.0% | `geography` | 0.0497 | 0.0134 | **over** | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 3.0% | `computer_science` | 0.0056 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 2.8% | `programming` | 0.0188 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.7% | `networking` | 0.0000 | 0.0111 | under | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |

### `tika-langdetect/tika-langdetect-lingo24/src/main/java`

**38.7%** of the maximum divergence from the repository, against a null median of 41.7% over 999 resamples of the same size — an excess of -3.0 points, and 590 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-lingo24/src/test/java`

**74.6%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of +32.2 points, and 74 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/main/java`

**55.6%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of +13.3 points, and 243 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/test/java`

**83.2%** of the maximum divergence from the repository, against a null median of 41.7% over 999 resamples of the same size — an excess of +41.4 points, and 25 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/main/java`

**29.5%** of the maximum divergence from the repository, against a null median of 28.7% over 999 resamples of the same size — an excess of +0.7 points, and 467 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/test/java`

**63.5%** of the maximum divergence from the repository, against a null median of 42.8% over 999 resamples of the same size — an excess of +20.7 points, and 147 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/main/java`

**33.9%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of -0.7 points, and 522 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/java`

**61.3%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of +20.7 points, and 172 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-test-commons/src/main/java`

**48.6%** of the maximum divergence from the repository, against a null median of 42.5% over 999 resamples of the same size — an excess of +6.1 points, and 336 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/main/java`

**28.7%** of the maximum divergence from the repository, against a null median of 28.2% over 999 resamples of the same size — an excess of +0.5 points, and 466 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/java`

**33.4%** of the maximum divergence from the repository, against a null median of 17.9% over 999 resamples of the same size — an excess of +15.6 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.5% | `networking` | 0.1055 | 0.0111 | **over** | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 9.4% | `number` | 0.0784 | 0.0030 | **over** | `value` 37.0% (1,953) `digit` 13.6% (88) `nothing` 10.7% (145) `first` 10.4% (89) |
| 7.4% | `linguistics` | 0.0088 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 6.0% | `publishing` | 0.0924 | 0.0175 | **over** | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 4.2% | `computer_science` | 0.0000 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 3.7% | `basketball` | 0.0267 | 0.0002 | **over** | `key` 32.2% (1,843) `three` 22.5% (98) `reject` 8.5% (187) `four` 6.6% (68) |
| 3.0% | `literature` | 0.0000 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 2.9% | `nautical` | 0.0347 | 0.0043 | **over** | `datum` 27.5% (1,968) `src` 25.6% (57) `att` 4.6% (79) `port` 4.0% (126) |

### `tika-ml/tika-ml-chardetect/src/main/java`

**20.7%** of the maximum divergence from the repository, against a null median of 20.6% over 999 resamples of the same size — an excess of +0.0 points, and 497 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/test/java`

**48.4%** of the maximum divergence from the repository, against a null median of 43.6% over 999 resamples of the same size — an excess of +4.8 points, and 380 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/main/java`

**53.3%** of the maximum divergence from the repository, against a null median of 28.6% over 999 resamples of the same size — an excess of +24.7 points, and 6 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/test/java`

**62.0%** of the maximum divergence from the repository, against a null median of 41.9% over 999 resamples of the same size — an excess of +20.1 points, and 173 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/main/java`

**18.2%** of the maximum divergence from the repository, against a null median of 19.1% over 999 resamples of the same size — an excess of -0.8 points, and 574 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/test/java`

**22.4%** of the maximum divergence from the repository, against a null median of 25.2% over 999 resamples of the same size — an excess of -2.9 points, and 716 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/main/java`

**20.5%** of the maximum divergence from the repository, against a null median of 20.4% over 999 resamples of the same size — an excess of +0.1 points, and 490 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/test/java`

**22.1%** of the maximum divergence from the repository, against a null median of 17.9% over 999 resamples of the same size — an excess of +4.1 points, and 143 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/main/java`

**46.4%** of the maximum divergence from the repository, against a null median of 42.2% over 999 resamples of the same size — an excess of +4.2 points, and 379 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/test/java`

**42.0%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of +9.1 points, and 210 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java`

**25.9%** of the maximum divergence from the repository, against a null median of 35.0% over 999 resamples of the same size — an excess of -9.2 points, and 835 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java`

**32.9%** of the maximum divergence from the repository, against a null median of 33.4% over 999 resamples of the same size — an excess of -0.5 points, and 514 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java`

**15.6%** of the maximum divergence from the repository, against a null median of 16.7% over 999 resamples of the same size — an excess of -1.1 points, and 634 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java`

**28.1%** of the maximum divergence from the repository, against a null median of 19.0% over 999 resamples of the same size — an excess of +9.1 points, and 33 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java`

**51.4%** of the maximum divergence from the repository, against a null median of 43.4% over 999 resamples of the same size — an excess of +8.1 points, and 290 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java`

**23.8%** of the maximum divergence from the repository, against a null median of 20.6% over 999 resamples of the same size — an excess of +3.3 points, and 249 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java`

**30.0%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of -13.0 points, and 866 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 28.7% over 999 resamples of the same size — an excess of -3.4 points, and 676 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/main/java`

**23.0%** of the maximum divergence from the repository, against a null median of 12.5% over 999 resamples of the same size — an excess of +10.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.6% | `travel-industry` | 0.0616 | 0.0005 | **over** | `locator` 99.6% (62) `pseudo` 0.2% (9) `osi` 0.1% (3) `fit` 0.0% (33) |
| 7.5% | `linguistics` | 0.0166 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 7.1% | `buildings` | 0.0646 | 0.0098 | **over** | `log` 22.1% (537) `window` 20.4% (380) `tear_down` 16.8% (48) `machine` 8.0% (47) |
| 6.3% | `publishing` | 0.0769 | 0.0175 | **over** | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 3.4% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 2.7% | `law` | 0.0057 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 2.5% | `time_period` | 0.0000 | 0.0117 | under | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 2.3% | `programming` | 0.0200 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |

### `tika-parsers/tika-parsers-ml/tika-inference/src/test/java`

**27.2%** of the maximum divergence from the repository, against a null median of 20.8% over 999 resamples of the same size — an excess of +6.4 points, and 98 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java`

**12.9%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +3.9 points, and 4 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.6% | `linguistics` | 0.1631 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 7.5% | `astronomy` | 0.0272 | 0.0018 | **over** | `latitude` 14.0% (24) `longitude` 11.3% (23) `alt` 8.4% (70) `egress` 7.7% (29) |
| 6.1% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 4.8% | `electronics` | 0.0008 | 0.0162 | under | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 4.0% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 3.9% | `politics` | 0.0171 | 0.0019 | **over** | `pas` 38.2% (221) `country` 13.0% (47) `zip` 7.7% (702) `alignment` 3.2% (27) |
| 3.5% | `science-fiction` | 0.0127 | 0.0008 | **over** | `entity` 48.1% (298) `tesseract` 35.2% (194) `inner` 5.6% (49) `cred` 4.2% (17) |
| 2.9% | `databases` | 0.0160 | 0.0028 | **over** | `entity` 18.9% (298) `jdbc` 15.2% (36) `bookmark` 8.2% (26) `select` 7.1% (87) |

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java`

**24.2%** of the maximum divergence from the repository, against a null median of 20.5% over 999 resamples of the same size — an excess of +3.7 points, and 221 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java`

**29.5%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -4.4 points, and 659 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java`

**22.5%** of the maximum divergence from the repository, against a null median of 25.2% over 999 resamples of the same size — an excess of -2.8 points, and 685 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java`

**33.0%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of -0.3 points, and 512 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java`

**66.6%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of +24.2 points, and 121 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java`

**18.0%** of the maximum divergence from the repository, against a null median of 20.8% over 999 resamples of the same size — an excess of -2.8 points, and 736 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java`

**30.6%** of the maximum divergence from the repository, against a null median of 22.7% over 999 resamples of the same size — an excess of +7.8 points, and 94 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java`

**11.7%** of the maximum divergence from the repository, against a null median of 3.8% over 999 resamples of the same size — an excess of +7.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.1% | `computing` | 0.5081 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 7.5% | `mathematics` | 0.0019 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 6.2% | `electrotechnology` | 0.0518 | 0.0158 | **over** | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 4.4% | `law` | 0.0071 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 4.4% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 2.5% | `linguistics` | 0.0499 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 2.3% | `publishing` | 0.0049 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 2.2% | `economy` | 0.0001 | 0.0058 | under | `property` 39.7% (1,144) `manager` 13.9% (316) `total` 9.1% (216) `mark_down` 7.1% (31) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java`

**13.7%** of the maximum divergence from the repository, against a null median of 14.8% over 999 resamples of the same size — an excess of -1.1 points, and 658 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java`

**25.2%** of the maximum divergence from the repository, against a null median of 20.8% over 999 resamples of the same size — an excess of +4.4 points, and 187 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java`

**15.1%** of the maximum divergence from the repository, against a null median of 7.2% over 999 resamples of the same size — an excess of +7.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.3% | `music` | 0.0783 | 0.0063 | **over** | `ti` 19.3% (1,144) `album` 7.5% (30) `composer` 4.9% (11) `label` 4.7% (373) |
| 6.5% | `art` | 0.0290 | 0.0022 | **over** | `flag` 46.2% (321) `artist` 19.3% (29) `write` 8.8% (953) `key` 4.3% (1,843) |
| 6.1% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 4.3% | `computer-graphics` | 0.0321 | 0.0067 | **over** | `instance` 28.8% (593) `jpeg` 15.6% (49) `mpeg` 11.2% (48) `renderer` 10.5% (22) |
| 3.7% | `programming` | 0.0997 | 0.0518 | **over** | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.4% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 3.0% | `acoustics` | 0.0102 | 0.0002 | **over** | `audio` 96.6% (164) `sound` 1.8% (3) `static` 0.8% (4) `noisiness` 0.5% (1) |
| 2.9% | `algebra` | 0.0003 | 0.0102 | under | `content` 75.6% (2,669) `unknown` 8.6% (290) `normalizer` 4.5% (16) `index` 3.7% (943) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java`

**18.9%** of the maximum divergence from the repository, against a null median of 12.3% over 999 resamples of the same size — an excess of +6.6 points, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java`

**20.6%** of the maximum divergence from the repository, against a null median of 17.7% over 999 resamples of the same size — an excess of +2.9 points, and 223 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java`

**33.9%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +8.9 points, and 102 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java`

**15.0%** of the maximum divergence from the repository, against a null median of 19.1% over 999 resamples of the same size — an excess of -4.1 points, and 874 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java`

**29.6%** of the maximum divergence from the repository, against a null median of 20.6% over 999 resamples of the same size — an excess of +8.9 points, and 58 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java`

**22.0%** of the maximum divergence from the repository, against a null median of 24.9% over 999 resamples of the same size — an excess of -2.9 points, and 724 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java`

**35.2%** of the maximum divergence from the repository, against a null median of 22.6% over 999 resamples of the same size — an excess of +12.6 points, and 29 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java`

**41.2%** of the maximum divergence from the repository, against a null median of 28.6% over 999 resamples of the same size — an excess of +12.6 points, and 94 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java`

**83.9%** of the maximum divergence from the repository, against a null median of 43.1% over 999 resamples of the same size — an excess of +40.8 points, and 31 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java`

**48.7%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +23.6 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.7% | `mathematics` | 0.3071 | 0.0258 | **over** | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 16.6% | `publishing` | 0.2362 | 0.0175 | **over** | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 4.9% | `linguistics` | 0.0095 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 4.3% | `computing` | 0.1517 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 4.0% | `engineering` | 0.0504 | 0.0023 | **over** | `datum` 44.4% (1,968) `generator` 40.1% (43) `encoder` 6.5% (8) `preload` 2.6% (7) |
| 3.7% | `computer_science` | 0.1090 | 0.0284 | **over** | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 2.7% | `law` | 0.0005 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 2.4% | `telecommunication` | 0.0000 | 0.0235 | under | `file` 40.8% (3,338) `entry` 19.8% (839) `medium` 7.7% (448) `message` 3.7% (312) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of -10.1 points, and 897 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java`

**32.3%** of the maximum divergence from the repository, against a null median of 42.5% over 999 resamples of the same size — an excess of -10.2 points, and 801 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java`

**28.2%** of the maximum divergence from the repository, against a null median of 20.6% over 999 resamples of the same size — an excess of +7.5 points, and 88 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java`

**25.2%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -8.5 points, and 843 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java`

**12.7%** of the maximum divergence from the repository, against a null median of 11.7% over 999 resamples of the same size — an excess of +0.9 points, and 330 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java`

**27.6%** of the maximum divergence from the repository, against a null median of 14.0% over 999 resamples of the same size — an excess of +13.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.0% | `computing` | 0.7039 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 14.3% | `linguistics` | 0.0005 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 3.6% | `mathematics` | 0.0012 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 3.4% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 2.9% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 2.8% | `law` | 0.0040 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 2.6% | `programming` | 0.0158 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.6% | `person` | 0.0004 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java`

**24.6%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -9.3 points, and 890 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java`

**27.6%** of the maximum divergence from the repository, against a null median of 33.4% over 999 resamples of the same size — an excess of -5.8 points, and 768 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java`

**34.6%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of +0.5 points, and 477 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java`

**17.7%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of -11.2 points, and 974 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java`

**25.6%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -8.1 points, and 855 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java`

**7.5%** of the maximum divergence from the repository, against a null median of 1.1% over 999 resamples of the same size — an excess of +6.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `computer-languages` | 0.0004 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 9.8% | `electrotechnology` | 0.0001 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 6.9% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 6.5% | `electronics` | 0.0017 | 0.0162 | under | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 4.7% | `computer_science` | 0.0572 | 0.0284 | **over** | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 4.1% | `metrology` | 0.0211 | 0.0061 | **over** | `array` 29.0% (828) `entropy` 13.3% (96) `rate` 7.5% (148) `measurement` 5.7% (13) |
| 3.6% | `networking` | 0.0018 | 0.0111 | under | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 3.1% | `mathematics` | 0.0475 | 0.0258 | **over** | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java`

**13.8%** of the maximum divergence from the repository, against a null median of 5.1% over 999 resamples of the same size — an excess of +8.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `aviation` | 0.0424 | 0.0046 | **over** | `rtf` 37.7% (101) `max` 36.7% (1,148) `threshold` 5.4% (202) `fis` 2.8% (5) |
| 6.6% | `literature` | 0.0656 | 0.0203 | **over** | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 6.2% | `tennis` | 0.0306 | 0.0038 | **over** | `get` 96.4% (1,718) `return` 1.0% (1,518) `server` 1.0% (895) `single` 0.5% (542) |
| 5.1% | `linguistics` | 0.0354 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 4.2% | `medicine` | 0.0016 | 0.0178 | under | `uri` 40.5% (301) `type` 11.9% (3,570) `start` 5.5% (1,276) `doc` 5.4% (475) |
| 4.0% | `person` | 0.0013 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 3.8% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 3.7% | `computing` | 0.4160 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java`

**10.0%** of the maximum divergence from the repository, against a null median of 6.2% over 999 resamples of the same size — an excess of +3.8 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 6.0% | `linguistics` | 0.1432 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 5.7% | `computer-languages` | 0.0019 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 5.2% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 4.7% | `law` | 0.0079 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 4.3% | `electrotechnology` | 0.0021 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 4.2% | `chemistry` | 0.0341 | 0.0115 | **over** | `buffer` 16.3% (430) `builder` 15.6% (189) `type` 14.4% (3,570) `char` 10.3% (604) |
| 4.1% | `programming` | 0.0919 | 0.0518 | **over** | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 4.0% | `medicine` | 0.0435 | 0.0178 | **over** | `uri` 40.5% (301) `type` 11.9% (3,570) `start` 5.5% (1,276) `doc` 5.4% (475) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java`

**22.3%** of the maximum divergence from the repository, against a null median of 14.0% over 999 resamples of the same size — an excess of +8.3 points, and 10 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java`

**18.4%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -15.2 points, and 992 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java`

**30.7%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of -11.6 points, and 867 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java`

**23.8%** of the maximum divergence from the repository, against a null median of 22.8% over 999 resamples of the same size — an excess of +1.0 points, and 440 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java`

**26.9%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of -7.1 points, and 777 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java`

**19.1%** of the maximum divergence from the repository, against a null median of 8.7% over 999 resamples of the same size — an excess of +10.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.0% | `publishing` | 0.0998 | 0.0175 | **over** | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 5.0% | `computer-graphics` | 0.0404 | 0.0067 | **over** | `instance` 28.8% (593) `jpeg` 15.6% (49) `mpeg` 11.2% (48) `renderer` 10.5% (22) |
| 4.9% | `software` | 0.0322 | 0.0037 | **over** | `excel` 15.9% (98) `pdf` 12.2% (134) `shift_jis` 11.0% (62) `factory_class` 9.2% (20) |
| 4.8% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 4.5% | `information-science` | 0.0256 | 0.0020 | **over** | `document` 96.7% (1,786) `align` 1.8% (60) `controlled_vocabulary` 0.4% (14) `keyword` 0.3% (7) |
| 4.2% | `statistics` | 0.0246 | 0.0021 | **over** | `sigma` 18.8% (50) `doe` 10.1% (354) `class` 7.1% (1,560) `histogram` 7.0% (23) |
| 4.1% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 3.9% | `motor-racing` | 0.0173 | 0.0004 | **over** | `dpi` 81.4% (23) `observer` 8.0% (22) `intermediate` 5.4% (87) `place` 2.5% (135) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java`

**22.0%** of the maximum divergence from the repository, against a null median of 19.3% over 999 resamples of the same size — an excess of +2.7 points, and 242 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java`

**19.2%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +3.5 points, and 130 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java`

**19.4%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +7.1 points, and 4 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.8% | `computing` | 0.5688 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 6.7% | `programming` | 0.1321 | 0.0518 | **over** | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 4.8% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 4.4% | `literature` | 0.0005 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 4.0% | `publishing` | 0.0003 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 3.5% | `electrotechnology` | 0.0004 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 3.3% | `law` | 0.0056 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 3.0% | `person` | 0.0010 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java`

**15.9%** of the maximum divergence from the repository, against a null median of 14.9% over 999 resamples of the same size — an excess of +1.0 points, and 369 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java`

**23.4%** of the maximum divergence from the repository, against a null median of 19.1% over 999 resamples of the same size — an excess of +4.2 points, and 156 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java`

**23.9%** of the maximum divergence from the repository, against a null median of 28.4% over 999 resamples of the same size — an excess of -4.5 points, and 755 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java`

**43.1%** of the maximum divergence from the repository, against a null median of 29.0% over 999 resamples of the same size — an excess of +14.1 points, and 66 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java`

**23.4%** of the maximum divergence from the repository, against a null median of 12.3% over 999 resamples of the same size — an excess of +11.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.6% | `medicine` | 0.1459 | 0.0178 | **over** | `uri` 40.5% (301) `type` 11.9% (3,570) `start` 5.5% (1,276) `doc` 5.4% (475) |
| 5.7% | `programming` | 0.1333 | 0.0518 | **over** | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 4.7% | `law` | 0.0015 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 4.1% | `computing` | 0.4577 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 3.5% | `publishing` | 0.0001 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 3.5% | `person` | 0.0000 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 3.4% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 2.9% | `linguistics` | 0.1481 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java`

**31.3%** of the maximum divergence from the repository, against a null median of 19.2% over 999 resamples of the same size — an excess of +12.1 points, and 10 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 23.3% over 999 resamples of the same size — an excess of +0.9 points, and 427 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java`

**35.3%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of +6.4 points, and 191 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java`

**21.3%** of the maximum divergence from the repository, against a null median of 11.7% over 999 resamples of the same size — an excess of +9.6 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.9% | `linguistics` | 0.2499 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 6.1% | `furniture` | 0.0304 | 0.0007 | **over** | `counter` 87.3% (79) `drawer` 8.0% (12) `phone` 1.7% (29) `mirror` 1.1% (64) |
| 5.0% | `computer_science` | 0.0015 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 4.8% | `literature` | 0.0000 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 4.4% | `telecommunication` | 0.0721 | 0.0235 | **over** | `file` 40.8% (3,338) `entry` 19.8% (839) `medium` 7.7% (448) `message` 3.7% (312) |
| 4.4% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 3.8% | `person` | 0.0000 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 3.4% | `electrotechnology` | 0.0518 | 0.0158 | **over** | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java`

**44.7%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of +11.4 points, and 153 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/main/java`

**20.0%** of the maximum divergence from the repository, against a null median of 22.7% over 999 resamples of the same size — an excess of -2.7 points, and 707 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/java`

**31.8%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of +6.5 points, and 166 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-httpclient-commons/src/main/java`

**48.7%** of the maximum divergence from the repository, against a null median of 28.8% over 999 resamples of the same size — an excess of +19.9 points, and 17 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-api/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 9.5% over 999 resamples of the same size — an excess of +16.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.6% | `biology` | 0.0740 | 0.0038 | **over** | `emit` 61.3% (982) `bos` 5.2% (67) `reporter` 3.8% (152) `model` 3.0% (860) |
| 8.9% | `electronics` | 0.0981 | 0.0162 | **over** | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 6.6% | `hydraulics` | 0.0689 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 4.4% | `glassblowing` | 0.0263 | 0.0005 | **over** | `found` 97.2% (302) `step` 2.0% (99) `web` 0.6% (67) `way` 0.3% (131) |
| 3.8% | `literature` | 0.0000 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 3.5% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 3.4% | `linguistics` | 0.0306 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 3.2% | `mathematics` | 0.0726 | 0.0258 | **over** | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |

### `tika-pipes/tika-pipes-config-store-ignite/src/main/java`

**37.0%** of the maximum divergence from the repository, against a null median of 22.8% over 999 resamples of the same size — an excess of +14.1 points, and 14 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-config-store-ignite/src/test/java`

**61.1%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of +18.8 points, and 189 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/main/java`

**11.1%** of the maximum divergence from the repository, against a null median of 3.9% over 999 resamples of the same size — an excess of +7.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.2% | `electronics` | 0.0649 | 0.0162 | **over** | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 8.6% | `biology` | 0.0330 | 0.0038 | **over** | `emit` 61.3% (982) `bos` 5.2% (67) `reporter` 3.8% (152) `model` 3.0% (860) |
| 8.1% | `hydraulics` | 0.0466 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 5.0% | `publishing` | 0.0017 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 4.6% | `linguistics` | 0.0410 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 3.2% | `geography` | 0.0018 | 0.0134 | under | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 2.9% | `electrotechnology` | 0.0033 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 2.9% | `algebra` | 0.0010 | 0.0102 | under | `content` 75.6% (2,669) `unknown` 8.6% (290) `normalizer` 4.5% (16) `index` 3.7% (943) |

### `tika-pipes/tika-pipes-core/src/test/java`

**16.8%** of the maximum divergence from the repository, against a null median of 12.3% over 999 resamples of the same size — an excess of +4.5 points, and 39 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/main/java`

**25.1%** of the maximum divergence from the repository, against a null median of 25.7% over 999 resamples of the same size — an excess of -0.7 points, and 557 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/test/java`

**34.9%** of the maximum divergence from the repository, against a null median of 42.2% over 999 resamples of the same size — an excess of -7.3 points, and 690 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/java`

**17.8%** of the maximum divergence from the repository, against a null median of 9.2% over 999 resamples of the same size — an excess of +8.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.4% | `hydraulics` | 0.1217 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 5.2% | `literature` | 0.0003 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 4.2% | `publishing` | 0.0005 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 3.6% | `geography` | 0.0001 | 0.0134 | under | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 3.2% | `computing` | 0.4215 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 2.4% | `administration` | 0.0135 | 0.0013 | **over** | `manager` 47.7% (316) `title` 19.9% (186) `branch` 5.4% (53) `file_folder` 4.7% (5) |
| 2.3% | `person` | 0.0026 | 0.0164 | under | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 2.2% | `tennis` | 0.0190 | 0.0038 | **over** | `get` 96.4% (1,718) `return` 1.0% (1,518) `server` 1.0% (895) `single` 0.5% (542) |

### `tika-pipes/tika-pipes-iterator-commons/src/main/java`

**47.6%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of +13.6 points, and 129 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java`

**26.8%** of the maximum divergence from the repository, against a null median of 20.6% over 999 resamples of the same size — an excess of +6.1 points, and 106 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java`

**48.4%** of the maximum divergence from the repository, against a null median of 41.7% over 999 resamples of the same size — an excess of +6.7 points, and 337 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java`

**28.7%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +12.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.8% | `time_period` | 0.0984 | 0.0117 | **over** | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 7.1% | `electronics` | 0.0895 | 0.0162 | **over** | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 6.9% | `hydraulics` | 0.0744 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 6.2% | `computing` | 0.1628 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 4.9% | `military` | 0.0557 | 0.0085 | **over** | `column` 10.9% (275) `predict` 9.6% (124) `password` 7.1% (195) `base` 6.0% (877) |
| 4.2% | `transport` | 0.0386 | 0.0037 | **over** | `container` 29.0% (558) `train` 15.9% (226) `driver` 7.6% (26) `stop` 7.0% (42) |
| 3.5% | `graphical-user-interface` | 0.0253 | 0.0010 | **over** | `container` 68.5% (558) `label` 9.5% (373) `widget` 5.0% (12) `chooser` 3.8% (2) |
| 3.4% | `sports` | 0.0360 | 0.0048 | **over** | `timeout` 29.9% (360) `min` 16.8% (273) `buf` 14.7% (112) `match` 3.8% (622) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java`

**36.1%** of the maximum divergence from the repository, against a null median of 24.9% over 999 resamples of the same size — an excess of +11.2 points, and 58 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java`

**35.7%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of +10.4 points, and 80 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java`

**27.0%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -6.9 points, and 800 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java`

**23.6%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +7.9 points, and 18 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java`

**41.2%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of +7.4 points, and 262 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java`

**22.4%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +10.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.7% | `time_period` | 0.0718 | 0.0117 | **over** | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 6.9% | `computer-languages` | 0.0815 | 0.0186 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 6.5% | `electronics` | 0.0743 | 0.0162 | **over** | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 6.1% | `computer_science` | 0.0001 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 6.0% | `hydraulics` | 0.0584 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 3.9% | `sociology` | 0.0305 | 0.0036 | **over** | `status` 51.1% (355) `integration` 11.9% (61) `priority` 5.9% (36) `migration` 5.7% (74) |
| 3.5% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 3.1% | `publishing` | 0.0007 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 19.2% over 999 resamples of the same size — an excess of +6.1 points, and 71 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java`

**30.7%** of the maximum divergence from the repository, against a null median of 15.8% over 999 resamples of the same size — an excess of +14.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.0% | `time_period` | 0.1044 | 0.0117 | **over** | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 8.8% | `electronics` | 0.1073 | 0.0162 | **over** | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 7.4% | `mechanics` | 0.0594 | 0.0028 | **over** | `bucket` 48.2% (412) `override` 20.4% (136) `reset` 12.6% (87) `throttle` 10.1% (23) |
| 6.7% | `hydraulics` | 0.0766 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 4.6% | `computing` | 0.1761 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 3.7% | `computer-hardware` | 0.0246 | 0.0003 | **over** | `storage` 85.1% (156) `cpu` 8.7% (62) `ram` 4.0% (101) `core` 1.0% (242) |
| 3.1% | `person` | 0.0598 | 0.0164 | **over** | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 3.0% | `telecommunication` | 0.0009 | 0.0235 | under | `file` 40.8% (3,338) `entry` 19.8% (839) `medium` 7.7% (448) `message` 3.7% (312) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java`

**27.5%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +2.3 points, and 363 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java`

**30.9%** of the maximum divergence from the repository, against a null median of 25.2% over 999 resamples of the same size — an excess of +5.8 points, and 177 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java`

**46.5%** of the maximum divergence from the repository, against a null median of 43.8% over 999 resamples of the same size — an excess of +2.7 points, and 441 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java`

**35.3%** of the maximum divergence from the repository, against a null median of 16.7% over 999 resamples of the same size — an excess of +18.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.5% | `exchange` | 0.1372 | 0.0008 | **over** | `issuer` 84.4% (17) `stock` 9.0% (23) `option` 3.9% (232) `put` 2.7% (17) |
| 12.0% | `cryptography` | 0.1077 | 0.0045 | **over** | `encrypt` 20.9% (103) `password` 15.7% (194) `private_key` 13.6% (28) `md5` 12.7% (21) |
| 9.2% | `networking` | 0.1067 | 0.0111 | **over** | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 5.3% | `programming` | 0.0032 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.5% | `literature` | 0.0762 | 0.0203 | **over** | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 2.6% | `mathematics` | 0.0018 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 2.5% | `computer_science` | 0.0027 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 2.4% | `publishing` | 0.0001 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java`

**36.9%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +11.7 points, and 46 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +8.4 points, and 12 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java`

**24.8%** of the maximum divergence from the repository, against a null median of 25.4% over 999 resamples of the same size — an excess of -0.6 points, and 541 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java`

**48.0%** of the maximum divergence from the repository, against a null median of 25.6% over 999 resamples of the same size — an excess of +22.5 points, and 5 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.0% | `hydraulics` | 0.1926 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 7.7% | `time_period` | 0.1187 | 0.0117 | **over** | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 7.6% | `computing` | 0.1114 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 7.5% | `computer-languages` | 0.1348 | 0.0186 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 7.4% | `person` | 0.1282 | 0.0164 | **over** | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 3.5% | `philosophy` | 0.0469 | 0.0030 | **over** | `that` 58.2% (55) `each` 6.3% (11) `abstract` 4.3% (90) `creation` 4.0% (57) |
| 2.9% | `computer_science` | 0.0000 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 2.6% | `mathematics` | 0.0001 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java`

**36.6%** of the maximum divergence from the repository, against a null median of 33.6% over 999 resamples of the same size — an excess of +3.0 points, and 392 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java`

**25.6%** of the maximum divergence from the repository, against a null median of 19.0% over 999 resamples of the same size — an excess of +6.6 points, and 77 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java`

**39.3%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of +5.6 points, and 306 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java`

**38.6%** of the maximum divergence from the repository, against a null median of 17.8% over 999 resamples of the same size — an excess of +20.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 27.9% | `law` | 0.3324 | 0.0292 | **over** | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 4.3% | `mechanics` | 0.0458 | 0.0028 | **over** | `bucket` 48.2% (412) `override` 20.4% (136) `reset` 12.6% (87) `throttle` 10.1% (23) |
| 3.5% | `town_planning` | 0.0315 | 0.0007 | **over** | `store` 40.7% (493) `current` 20.0% (74) `archive` 13.8% (93) `tenant` 9.1% (19) |
| 3.3% | `mathematics` | 0.0000 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 3.2% | `computing` | 0.1840 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 2.9% | `programming` | 0.0098 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.6% | `literature` | 0.0000 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 2.3% | `publishing` | 0.0000 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java`

**33.0%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of -0.2 points, and 505 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java`

**27.7%** of the maximum divergence from the repository, against a null median of 13.4% over 999 resamples of the same size — an excess of +14.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.3% | `computer-languages` | 0.1573 | 0.0186 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 7.1% | `person` | 0.0885 | 0.0164 | **over** | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 6.7% | `sociology` | 0.0530 | 0.0036 | **over** | `status` 51.1% (355) `integration` 11.9% (61) `priority` 5.9% (36) `migration` 5.7% (74) |
| 4.5% | `plants` | 0.0475 | 0.0066 | **over** | `root` 50.7% (472) `log` 28.1% (537) `stub` 4.5% (82) `complete` 4.3% (180) |
| 3.0% | `networking` | 0.0466 | 0.0111 | **over** | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 3.0% | `publishing` | 0.0001 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 2.9% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 2.6% | `computing` | 0.2128 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java`

**46.9%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of +12.9 points, and 142 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java`

**23.7%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +8.0 points, and 12 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java`

**29.9%** of the maximum divergence from the repository, against a null median of 28.3% over 999 resamples of the same size — an excess of +1.6 points, and 416 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java`

**31.7%** of the maximum divergence from the repository, against a null median of 17.7% over 999 resamples of the same size — an excess of +14.0 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `electronics` | 0.1449 | 0.0162 | **over** | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 11.2% | `person` | 0.1286 | 0.0164 | **over** | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 8.1% | `computing` | 0.1371 | 0.3144 | under | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 7.3% | `hydraulics` | 0.0825 | 0.0103 | **over** | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 4.7% | `law` | 0.1001 | 0.0292 | **over** | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 3.7% | `time_period` | 0.0574 | 0.0117 | **over** | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 3.4% | `telecommunication` | 0.0003 | 0.0235 | under | `file` 40.8% (3,338) `entry` 19.8% (839) `medium` 7.7% (448) `message` 3.7% (312) |
| 3.2% | `literature` | 0.0000 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java`

**27.9%** of the maximum divergence from the repository, against a null median of 28.3% over 999 resamples of the same size — an excess of -0.4 points, and 532 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-reporter-commons/src/main/java`

**52.3%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of +10.0 points, and 292 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/main/java`

**34.5%** of the maximum divergence from the repository, against a null median of 19.3% over 999 resamples of the same size — an excess of +15.2 points, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 38.7% | `time_period` | 0.3284 | 0.0117 | **over** | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 5.2% | `plants` | 0.0601 | 0.0066 | **over** | `root` 50.7% (472) `log` 28.1% (537) `stub` 4.5% (82) `complete` 4.3% (180) |
| 4.1% | `computer_science` | 0.0000 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 2.9% | `literature` | 0.0000 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 2.4% | `computer-languages` | 0.0599 | 0.0186 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 2.3% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 1.9% | `geography` | 0.0000 | 0.0134 | under | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 1.9% | `publishing` | 0.0010 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |

### `tika-plugins-core/src/test/java`

**34.8%** of the maximum divergence from the repository, against a null median of 28.5% over 999 resamples of the same size — an excess of +6.4 points, and 235 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/main/java`

**15.0%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +8.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.3% | `graph-theory` | 0.0720 | 0.0027 | **over** | `component` 83.2% (706) `node` 6.1% (606) `size` 4.3% (852) `path` 2.6% (1,783) |
| 3.8% | `electrotechnology` | 0.0465 | 0.0158 | **over** | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 3.4% | `time_period` | 0.0003 | 0.0117 | under | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 3.4% | `psychology` | 0.0199 | 0.0030 | **over** | `confidence` 42.2% (233) `module` 21.2% (143) `self` 8.0% (69) `matter` 6.3% (69) |
| 3.0% | `geography` | 0.0011 | 0.0134 | under | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 2.8% | `literature` | 0.0042 | 0.0203 | under | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 2.7% | `medicine` | 0.0031 | 0.0178 | under | `uri` 40.5% (301) `type` 11.9% (3,570) `start` 5.5% (1,276) `doc` 5.4% (475) |
| 2.7% | `computer-languages` | 0.0446 | 0.0186 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |

### `tika-serialization/src/test/java`

**13.7%** of the maximum divergence from the repository, against a null median of 6.9% over 999 resamples of the same size — an excess of +6.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `computer-languages` | 0.1021 | 0.0186 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 5.9% | `publishing` | 0.0002 | 0.0175 | under | `table` 31.6% (890) `page` 18.1% (595) `text` 13.4% (2,249) `read` 8.9% (311) |
| 4.0% | `computing` | 0.4201 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |
| 3.9% | `time_period` | 0.0001 | 0.0117 | under | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 3.7% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 99.9% (1,210) `module` 0.1% (143) `accumulator` 0.0% (9) |
| 2.7% | `networking` | 0.0009 | 0.0111 | under | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 2.7% | `graph-theory` | 0.0157 | 0.0027 | **over** | `component` 83.2% (706) `node` 6.1% (606) `size` 4.3% (852) `path` 2.6% (1,783) |
| 2.0% | `algebra` | 0.0014 | 0.0102 | under | `content` 75.6% (2,669) `unknown` 8.6% (290) `normalizer` 4.5% (16) `index` 3.7% (943) |

### `tika-server/tika-server-core/src/main/java`

**18.8%** of the maximum divergence from the repository, against a null median of 6.1% over 999 resamples of the same size — an excess of +12.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.4% | `networking` | 0.1162 | 0.0111 | **over** | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 13.7% | `commerce` | 0.0752 | 0.0056 | **over** | `server` 68.9% (895) `packet` 9.8% (73) `package` 5.8% (229) `quote` 5.6% (66) |
| 6.9% | `literature` | 0.0778 | 0.0203 | **over** | `header` 41.7% (1,080) `writer` 16.2% (286) `text` 12.3% (2,249) `author` 11.1% (180) |
| 3.4% | `sociology` | 0.0247 | 0.0036 | **over** | `status` 51.1% (355) `integration` 11.9% (61) `priority` 5.9% (36) `migration` 5.7% (74) |
| 3.3% | `programming` | 0.0180 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.8% | `mathematics` | 0.0054 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 2.6% | `computer-languages` | 0.0026 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 2.1% | `time_period` | 0.0009 | 0.0117 | under | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |

### `tika-server/tika-server-core/src/test/java`

**16.0%** of the maximum divergence from the repository, against a null median of 8.4% over 999 resamples of the same size — an excess of +7.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.9% | `networking` | 0.0787 | 0.0111 | **over** | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 7.1% | `law` | 0.0886 | 0.0292 | **over** | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 6.2% | `anatomy` | 0.0354 | 0.0044 | **over** | `body` 41.7% (469) `socket` 17.6% (151) `iter` 8.1% (11) `colon` 5.6% (23) |
| 5.3% | `linguistics` | 0.0317 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 5.1% | `ecology` | 0.0181 | 0.0003 | **over** | `tl` 77.3% (97) `consumer` 15.5% (58) `range` 2.6% (299) `crash` 2.5% (213) |
| 4.9% | `electrotechnology` | 0.0000 | 0.0158 | under | `detector` 99.7% (1,226) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 4.1% | `translation-studies` | 0.0181 | 0.0011 | **over** | `ti` 65.5% (1,144) `tl` 17.2% (97) `source_text` 7.5% (12) `source_language` 3.0% (75) |
| 4.0% | `tennis` | 0.0253 | 0.0038 | **over** | `get` 96.4% (1,718) `return` 1.0% (1,518) `server` 1.0% (895) `single` 0.5% (542) |

### `tika-server/tika-server-standard/src/main/java`

**30.9%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -2.8 points, and 616 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/test/java`

**21.8%** of the maximum divergence from the repository, against a null median of 11.7% over 999 resamples of the same size — an excess of +10.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.0% | `person` | 0.1053 | 0.0164 | **over** | `reader` 39.6% (381) `child` 11.2% (342) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 9.3% | `networking` | 0.0775 | 0.0111 | **over** | `http` 33.3% (2,748) `resource` 31.0% (772) `request` 20.2% (862) `mime` 3.4% (620) |
| 7.4% | `programming` | 0.0051 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 7.3% | `computer-languages` | 0.0827 | 0.0186 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 5.1% | `mathematics` | 0.0006 | 0.0258 | under | `count` 20.2% (923) `value` 9.2% (1,974) `from` 6.3% (242) `rel` 5.8% (66) |
| 4.4% | `linguistics` | 0.0292 | 0.0825 | under | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 2.6% | `time_period` | 0.0001 | 0.0117 | under | `extension` 46.8% (490) `future` 10.2% (96) `current` 8.4% (291) `year` 6.6% (24) |
| 2.2% | `computing` | 0.4118 | 0.3144 | **over** | `metadata` 25.0% (4,354) `config` 6.2% (1,342) `parser` 6.1% (2,820) `byte` 3.5% (3,171) |

### `tika-translate/src/main/java`

**17.1%** of the maximum divergence from the repository, against a null median of 14.7% over 999 resamples of the same size — an excess of +2.3 points, and 210 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/test/java`

**41.3%** of the maximum divergence from the repository, against a null median of 17.0% over 999 resamples of the same size — an excess of +24.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.2% | `linguistics` | 0.3695 | 0.0825 | **over** | `name` 31.6% (4,000) `context` 18.5% (2,286) `prefix` 6.1% (659) `parse` 6.1% (3,079) |
| 12.9% | `botany` | 0.1155 | 0.0013 | **over** | `translator` 30.1% (127) `offset` 9.2% (446) `key` 9.2% (1,843) `node` 6.6% (606) |
| 8.3% | `software` | 0.0874 | 0.0037 | **over** | `excel` 15.9% (98) `pdf` 12.2% (134) `shift_jis` 11.0% (62) `factory_class` 9.2% (20) |
| 5.8% | `programming` | 0.0005 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.4% | `computer_science` | 0.0000 | 0.0284 | under | `parser` 22.4% (2,820) `byte` 19.2% (3,171) `url` 11.7% (502) `format` 9.6% (683) |
| 3.0% | `law` | 0.0007 | 0.0292 | under | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 2.9% | `quality` | 0.0372 | 0.0033 | **over** | `available` 9.3% (58) `external` 8.8% (193) `internal` 7.7% (57) `new` 6.2% (102) |
| 2.2% | `computer-languages` | 0.0000 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |

### `tika-xmp/src/main/java`

**24.3%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +8.7 points, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-xmp/src/test/java`

**35.0%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of +1.8 points, and 421 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `documentation`

**8.9%** of the maximum divergence from the repository, against a null median of 3.2% over 999 resamples of the same size — an excess of +5.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.4% | `law` | 0.1049 | 0.0292 | **over** | `file` 18.7% (10,529) `client` 12.4% (808) `note` 2.5% (417) `default` 2.4% (1,965) |
| 8.2% | `computer-languages` | 0.0008 | 0.0186 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `java` 0.3% (280) |
| 4.6% | `geography` | 0.0366 | 0.0134 | **over** | `stream` 21.8% (1,709) `apache` 8.3% (6,924) `state` 7.0% (282) `java` 3.5% (280) |
| 3.8% | `programming` | 0.0252 | 0.0518 | under | `handler` 42.4% (1,987) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.4% | `christianity` | 0.0124 | 0.0019 | **over** | `use` 62.2% (4,419) `kind` 4.8% (2,192) `secret` 4.8% (77) `element` 3.8% (1,058) |
| 2.9% | `electronics` | 0.0351 | 0.0162 | **over** | `emitter` 55.7% (681) `input` 10.8% (1,082) `ti` 10.8% (1,144) `default` 2.6% (1,965) |
| 2.8% | `medicine` | 0.0055 | 0.0178 | under | `uri` 40.5% (301) `type` 11.9% (3,570) `start` 5.5% (1,276) `doc` 5.4% (475) |
| 2.7% | `dentistry` | 0.0062 | 0.0003 | **over** | `maintainer` 83.3% (4) `extraction` 7.9% (241) `post` 2.9% (185) `do` 2.1% (136) |

Read, compared and resampled in 66.6 s, recorded rather than estimated.
