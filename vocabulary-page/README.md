# vocabulary-page

Draws one repository's significant words as a [word cloud](https://en.wikipedia.org/wiki/Tag_cloud) per pipeline stage, in one HTML file. It is a diagnostic viewer: it writes under `vocabulary-page/build/reports/vocabulary/` and never under `output/`, which holds JSON and nothing else.

```
./gradlew vocabularyPage                       # the tree this build runs in
./gradlew vocabularyPage -Dcs.clone.dir=<path> # any other clone
```

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

This is the one module that may depend on a markup writer. The published reading stays JSON-only; anything drawn is drawn from the same classes the export is written from, so the picture and the report cannot disagree.
