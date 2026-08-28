# vocabulary-page

Draws the export's significant words as two linked pages per repository: the vocabulary — the funnel of the rules that produce the signals, ending in a [word cloud](https://en.wikipedia.org/wiki/Tag_cloud) of meanings — and the domains, the three leading [WordNet domains](https://wndomains.fbk.eu/) as overlapping sets. Diagnostic viewers: they write under `vocabulary-page/build/reports/vocabulary/<repository>/` and never under `output/`, which holds JSON and nothing else.

```
./gradlew readings                                       # every published reading in one table
./gradlew vocabularyPage                                 # the funnel and the cloud of meanings
./gradlew domainVenn                                     # the domains as overlapping sets, per source
./gradlew evaluationPages                                # both pages for every reading under output/
./gradlew discoursePass -Dcs.evaluation.dir=<clones>     # the sense-weighting passes compared, printed
```

## The readings, compared

[`readings.html`](build/reports/vocabulary/readings.html) is one row per published reading: what it is about, the vocabulary whose phrase count beat what a deal of its own words reaches, where each scheme places it at both levels, λ, and **the subject area somebody outside this project states for that repository**. The last column is what separates a picture of the reading from a picture of whether the reading is right, and it is the one no page carried before.

```
./gradlew readings -Dcs.reading.manifest=reading-export/src/test/resources/evaluation-set.tsv
```

The manifest is **named rather than found**. The one this project keeps is a test fixture whose own header states that it never votes, so putting it where a published page could reach it would ship a curated judgement as though it were a citation. A run naming none draws every row with an empty stated-area column, which is what a consumer reading its own repository sees.

Reaching the area is the publisher's own question and not a string comparison: OpenAlex places every topic under a subfield, that under a field and that under a domain, so a placement of *Natural Language Processing Techniques* descends from *Computer Science* and a page comparing the two labels would mark a right answer wrong. [`StatedAreas`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/StatedAreas.java) walks the publisher's `broader` chain through [`PlacedUnder`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedUnder.java), which is what the evaluation score already uses.

**One bar, applied to both kinds of claim.** A vocabulary appears only where its phrase count beat what a deal of its own words reaches; a subject appears only where the scheme separated the repository from a scheme of chance. Printing a subject with *(within chance)* beside it was still printing a subject a reader takes at face value, and a page that bars one kind of claim and prints the other whatever it says has two standards on it. Five of the 44 level readings are within chance and are now drawn as `—`, with the nearest subject kept in the cell's title for anyone looking for it.

**The two kinds are headed apart**, because a reader running across a row would otherwise take them for one answer. A term vocabulary publishes identifiers and a repository in its field declares them, so a match is the publisher stating that this is a term of its field. A subject scheme publishes prose — nobody declares `ManageEnterpriseRisk` — so it is diverged against rather than matched, and the answer is which subject's own description the repository's vocabulary sits nearest to.

**The scheme columns are the schemes the readings state**, in the order they state them, and the page names none of them. Which schemes are bundled is a question the library answers and is under review; a page naming them would show a column headed for a scheme that had gone, and draw nothing for one that had arrived.

**A bar of zero is stated as such and never as a multiple.** Where the deals reach nothing at the quantile the field sets, any single match clears and `timesTheBar` answers with the count itself — so a vocabulary matched once against a bar of zero would read as standing exactly at a real bar. The page writes *no bar* instead.

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
| [`ReadingsPage`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/ReadingsPage.java), [`ReadingRow`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/ReadingRow.java), [`ReadingsCommand`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/ReadingsCommand.java) | every reading in one table, and the command that writes it |
| [`StatedAreas`](src/main/java/io/github/fiftieshousewife/codesemantics/vocabulary/page/StatedAreas.java) | what a named manifest states each repository is about, and whether a placement descends from it |

This is the one module that may depend on a markup writer. The published reading stays JSON-only; anything drawn is drawn from the same classes the export is written from, so the picture and the report cannot disagree.
