# skos-matching

Matches the names a repository declares against published vocabularies held as [SKOS](https://www.w3.org/TR/skos-reference/) concept rows: a *concept* is one published term with its preferred label, its broader concept and, where the publisher states one, its definition.

The bundled vocabularies are read from `lexicon` — [OLiA](https://acoli-repo.github.io/olia/) for linguistic annotation and the [CSO](https://cso.kmi.open.ac.uk/) for computer science — and a caller can inject any taxonomy held as the same eight-column TSV. No word of a key is chosen here: the publisher wrote the term, and `IdentifierWords` wrote the boundaries, exactly as it does for a declared name.

## How a match is made

| Step | Class | What it does |
|---|---|---|
| key the vocabulary | `WordKeyedConcepts` (in the engine), wrapped by `LinguisticTerms`, `ComputingTerms`, `FinanceTerms`, `InjectedTerms` | each published term becomes the words its own identifier reads as |
| find the spans | `TermSpans`, `TermMatches` | the runs of declared words that equal a published term, longest span first, at each normalisation — as written, as lemmas, as senses — reported separately by `NormalisedTerms` and never summed |
| weigh the span | `PhraseSpecificity` | what the run narrows, in [0, 1] |
| corroborate | `CorroboratedReading`, `BranchAgreement`, `WrittenSubtree`, `WrittenMass` | whether the concepts matched sit together under the branches the publisher states, and how much of a branch the repository wrote |
| read the publisher's prose | `ConceptTopics`, `WrittenKeywords`, `KeywordSpecificity` | the matched concepts as a distribution over the same topics code is read as, in the publisher's words rather than the repository's |

## What it depends on, and what depends on it

The module sits above `code-semantics-engine` (the parse, the identifier grammar and the topic resources) and `lexicon` (the SKOS rows). `reading-export` composes its results into `taxonomies` in `reading.json`; nothing in the engine reads this module.
