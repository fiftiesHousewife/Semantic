# vocabulary-page

Draws one repository's significant words as a [word cloud](https://en.wikipedia.org/wiki/Tag_cloud) per pipeline stage, in one HTML file. It is a diagnostic viewer: it writes under `vocabulary-page/build/reports/vocabulary/` and never under `output/`, which holds JSON and nothing else.

```
./gradlew vocabularyPage                       # the word cloud per pipeline stage
./gradlew domainVenn                           # the domains of the significant words, as overlapping sets
./gradlew synsetCloud                          # the same words gathered under their WordNet senses
./gradlew evaluationPages -Dcs.evaluation.dir=<clones>   # all three pages for every clone, with an index
```

The single-page tasks read the tree the build runs in, or any other clone with `-Dcs.clone.dir=<path>`. Every page is written under `build/reports/vocabulary/<repository>/`, carries links to its two siblings, and `index.html` beside the folders names every repository with pages on disk.

## What the page shows

- One panel per stage of `WordPipeline`, each drawn from what the stage before it left. The stages are the pipeline's own; the page names none of them itself.
- A word's size is its term of the Jensen–Shannon divergence between this repository and the reference it is read against, in bits — not its count. The words a Java program contains most of are the words every Java program contains most of, so a picture sized by count draws the language rather than the repository.
- A word is drawn only where that figure stands outside what a repository of this size reaches by chance, at a bar derived from the reference's own permutation null. How many words are drawn is not a number chosen here.

## The classes

| Class | What it is |
|---|---|
| `StagedVocabulary` | the words at every stage, each carrying its divergence, its multiple of the chance bar and its count, measured once over the population entering the pipeline |
| `VocabularyPage` | the page's markup as typed [j2html](https://j2html.com/) tags; the stylesheet and the script are their own files under `src/main/resources/vocabulary/` and are carried whole into the page |
| `VocabularyPageCommand` | reads the repository, stages its vocabulary and writes the page |
| `DomainOverlap` | the significant words placed by the [WordNet domains](https://wndomains.fbk.eu/) their senses state: each word's divergence divided among its labelled senses, the three leading domains drawn only where an unambiguous word states them, every overlap reported |
| `DomainVennPage`, `DomainVennCommand` | the overlapping-sets page over that: circles sized by each domain's mass, a count per overlap opening its words, and the unambiguous words in bold |
| `SynsetCloud`, `SynsetCloudPage`, `SynsetCloudCommand` | the same words gathered under the WordNet senses they are most often written in, one tile per meaning — `topic`, `subject` and `theme` are one tile — each linking back to the vocabulary |
| `SignificantWords`, `ScoredWord` | the one population every page draws: the export's signals, merged under their lemmas |

## How a word's claim reaches a domain

The domain pages divide each word's claim over its dictionary senses by the counts [WordNet's own tagged corpus](https://wordnet.princeton.edu/documentation/cntlist5wn) publishes, the weighting stated in [Magnini et al., SENSEVAL-2](https://aclanthology.org/S01-1027.pdf): an uncounted sense holds 0.5, and a sense carrying several labels counts once per label. Three consequences, each visible on the page:

- A word with one meaning speaks with its whole claim, and a common word's rare sense speaks at the rate it is actually written — nothing is gated, and no weight is chosen here.
- The share of a word sitting on senses [WordNet Domains](https://wndomains.fbk.eu/) labels nothing with stays on no domain; the foot states that share. The bundled lift omits factotum — domain-less — senses, and redistributing their weight is what once ranked religion third on this repository, on `citation`, `ordinary` and `none`.
- The counts are from balanced 1990s text, and [Koeling, McCarthy and Carroll](https://aclanthology.org/H05-1053/) showed sense distributions shift with domain — computing senses are underweighted here for exactly that reason.
- Two context reweightings are built, and both are measured against the counts on the nine evaluation members by `./gradlew discoursePass -Dcs.evaluation.dir=<clones>`. Each multiplies a sense's count weight by 1 + a context's share of its labels, bounded in [1, 2] by what a share is and exactly 1 for an unlabelled sense. The **discourse pass** takes the whole repository's first-pass shares as the context; it moves the top-three concentration by at most 1.3 points, changes no member's leading domain, and reorders one pair on one member. The **name-neighbour pass** ([`PredominantSenses`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/PredominantSenses.java) over [`NameNeighbours`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/NameNeighbours.java)) takes as each word's context the words written beside it in declared names — predominant-sense acquisition with the repository as its own corpus. It changes the leading domain of 3–7% of labelled words: on Fineract it repairs the finance vocabulary — `credit banking→economy`, `teller administration→finance`, `delinquency psychological_features→economy` — and on every member it also pulls computing words off `computer_science` — `node→anatomy`, `queue→body_care`, `protocol→sociology` — because the context shares are built from the same counts that underweight computing senses, so the reweighting inherits the bias it was meant to correct. Domain totals move by less than a point either way. Every page therefore draws the counts-alone pass, and correcting the computing undercount needs corrected counts — domain-specific sense frequencies — rather than any reweighting built on the existing ones.

This is the one module that may depend on a markup writer. The published reading stays JSON-only; anything drawn is drawn from the same classes the export is written from, so the picture and the report cannot disagree.
