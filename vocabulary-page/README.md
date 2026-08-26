# vocabulary-page

Draws the export's significant words as two linked pages per repository: the vocabulary — the funnel of the rules that produce the signals, ending in a [word cloud](https://en.wikipedia.org/wiki/Tag_cloud) of meanings — and the domains, the three leading [WordNet domains](https://wndomains.fbk.eu/) as overlapping sets. Diagnostic viewers: they write under `vocabulary-page/build/reports/vocabulary/<repository>/` and never under `output/`, which holds JSON and nothing else.

```
./gradlew vocabularyPage                                 # the funnel and the cloud of meanings
./gradlew domainVenn                                     # the domains as overlapping sets, per source
./gradlew evaluationPages                                # both pages for every reading under output/
./gradlew discoursePass -Dcs.evaluation.dir=<clones>     # the sense-weighting passes compared, printed
```

The pages consume published readings — `reading.json` and `evidence.json` under `output/json`, or the folder `-Dcs.reading.dir=<folder>` names — and read no tree, so a picture and the published figures cannot disagree and drawing costs no parse. `evaluationPages` writes both pages for every reading under `output/`. Each page links its sibling and `index.html`, which names every repository with pages on disk; the domains page offers each bundled domain source, WordNet Domains and eXtended WordNet Domains, as a choice above the figure. Every figure a page draws is in the JSON block it draws it from, written beside the page as `vocabulary.json` and `domain-venn.json`.

## One population

Both pages draw one population — the export's signals — so no two pictures can disagree about which words are significant, and the funnel states every rule between the declared names and the tiles. Each count is a figure the export carries:

| Funnel step | The export's own figure |
|---|---|
| the declared names of the published source sets, as words | the field the ranking scores |
| within what chance reaches | `setAside.wordsBelowEveryThreshold` |
| within the reference's own sampling error | `setAside.wordsWithinTheReferencesError` |
| supplied by English | `setAside.wordsTheLanguageSupplies` |
| the signals | `signals.length` |
| two spellings, one dictionary form | the merge both pages draw |
| two words, one commonest sense | the cloud's tiles — `topic`, `subject` and `theme` are one tile |

## How a word's claim reaches a domain

The domain page divides each word's claim over its dictionary senses by the counts [WordNet's own tagged corpus](https://wordnet.princeton.edu/documentation/cntlist5wn) publishes, the weighting stated in [Magnini et al., SENSEVAL-2](https://aclanthology.org/S01-1027.pdf): an uncounted sense holds 0.5, and a sense carrying several labels counts once per label. Three consequences, each visible on the page:

- A word with one meaning speaks with its whole claim, and a common word's rare sense speaks at the rate it is actually written — nothing is gated, and no weight is chosen here.
- The share of a word sitting on senses [WordNet Domains](https://wndomains.fbk.eu/) labels nothing with stays on no domain; the foot states that share. The bundled lift omits factotum — domain-less — senses, and redistributing their weight is what once ranked religion third on this repository, on `citation`, `ordinary` and `none`.
- The counts are from balanced 1990s text, and [Koeling, McCarthy and Carroll](https://aclanthology.org/H05-1053/) showed sense distributions shift with domain — computing senses are underweighted here for exactly that reason.
- [eXtended WordNet Domains](https://adimen.ehu.eus/web/XWND) is bundled beside the lift — one leading domain per synset, keyed by sense key — and `discoursePass` prints the domain reading under both sources. Measured on the nine: the unlabelled share falls from 52–64% to under 1%, Fineract's leaders become finance, banking and book_keeping, Tika's and Santuario's computer_science strengthens — and Aeron's telecommunication vanishes under geometry while the Maven negative control leads on archaeology, `artifact` read as the excavated kind. The argmax labels carry no strength, so a weak label votes as loudly as a sure one; the bundled weight column is the derived scale a next measurement would use, and the pages keep the original lift until it is taken.
- Two context reweightings are built, and both are measured against the counts on the nine evaluation members by `./gradlew discoursePass`. Each multiplies a sense's count weight by 1 + a context's share of its labels, bounded in [1, 2] by what a share is. The **discourse pass** takes the whole repository's first-pass shares as the context; it changes no member's leading domain. The **name-neighbour pass** ([`PredominantSenses`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/PredominantSenses.java) over [`NameNeighbours`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/NameNeighbours.java)) takes as each word's context the words written beside it in declared names; it repairs finance words on Fineract and pulls computing words off `computer_science` everywhere, because its context shares inherit the counts' own bias. Both pages draw the counts-alone pass.

## The classes

| Class | What it is |
|---|---|
| [`VocabularyFunnel`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/VocabularyFunnel.java) | the funnel's counts and the final tiles, computed by the ranking's own rules |
| [`VocabularyPage`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/VocabularyPage.java), [`VocabularyPageCommand`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/VocabularyPageCommand.java) | the funnel-and-cloud page as typed [j2html](https://j2html.com/) tags, and the command that writes it |
| [`DomainOverlap`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/DomainOverlap.java) | the words placed by the domains their senses state: circles chosen by divided mass, every overlap reported, the unlabelled share held on no domain |
| [`DomainVennPage`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/DomainVennPage.java), [`DomainVennCommand`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/DomainVennCommand.java) | the overlapping-sets page: circle area by share, a count per overlap opening its words, unambiguous words in bold |
| [`SignificantWords`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/SignificantWords.java), [`ScoredWord`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/ScoredWord.java) | the one population every page draws |
| [`EvaluationPagesCommand`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/EvaluationPagesCommand.java), [`PagesIndex`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/PagesIndex.java) | both pages for every clone, and the index naming them |

This is the one module that may depend on a markup writer. The published reading stays JSON-only; anything drawn is drawn from the same classes the export is written from, so the picture and the report cannot disagree.
