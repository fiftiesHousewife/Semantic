# Glossary

This library reads code with the tools of lexical semantics and the arithmetic of information theory, and it assumes neither. Every term below appears in the source, the reports or the plans; each entry says what it means, what it is called in this tree, and where to read more.

> This file is excluded from the corpus the reading reads — [`.readingignore`](../.readingignore) states so. A glossary of linguistics written into a repository whose stated goal is to be *placed* under linguistics would satisfy that goal by construction, which is the doctrine's own rule against marking your own homework.

---

## Words about words

| Term | What it means | Where it is here |
|---|---|---|
| **Token** | One indivisible piece of text after splitting — roughly, one word. [Tokenization](https://en.wikipedia.org/wiki/Lexical_analysis#Tokenization) | `Tokeniser`, `IdentifierWords` |
| **Identifier** | A name the programmer chose: a class, method, field or variable. The unit this library reads | `NameOccurrence`, `IdentifierWords` |
| **Lemma** | The dictionary form of a word. *phrases*, *phrasing* and *phrased* all have the lemma **phrase**. [Lemma](https://en.wikipedia.org/wiki/Lemma_(morphology)) | `LemmaRuns`, `ContentWords` |
| **Lemmatisation** | Reducing an inflected word to its lemma, using a dictionary rather than by chopping letters off. [Lemmatisation](https://en.wikipedia.org/wiki/Lemmatisation) | `LemmaRuns` — the middle rung of the term-matching ladder. It exists so that `phrases` meeting `Phrase` is scored as *one word inflected* and not as a claim about meaning |
| **Stemming** | The cruder cousin: chopping suffixes without consulting a dictionary, so *universe* and *university* collapse. Not used here | — |
| **Headword** | The form a dictionary files an entry under, before any sense is chosen. A resource labelling the *headword* makes a vaguer claim than one labelling a sense | `TopicCitations`, Wiktionary topics |
| **Sense** | One distinct meaning of a word. *cite* has eight in WordNet; only one is about a courtroom | `WordSense`, `SenseRuns` |
| **Synset** | WordNet's unit: a **set of synonyms** that share one sense, so *topic*, *theme* and *subject* are one synset. Comparing two words as synsets is comparing meanings rather than spellings. [WordNet](https://wordnet.princeton.edu/) | `SenseRuns`, `WordNetLexicon`. **Still used**, as the broadest rung of the ladder — and *refused as evidence*, because every match it buys on this tree is one word long |
| **Polysemy** | One word carrying several related senses. The whole difficulty this library argues with | `SenseCoverage` |
| **Homograph** | Two unrelated words spelled the same — *file* the container and *file* the rank formation | `SENSE_DISAMBIGUATION.md` |
| **Word-sense disambiguation** | Deciding which sense a word carries *in this position*. [WSD](https://en.wikipedia.org/wiki/Word-sense_disambiguation) | `PhraseTopics` — a phrase's words as context for one another |
| **Content word** | A noun, verb, adjective or adverb — a word carrying subject matter, as against a **function word** (*the*, *of*, *is*) which holds a sentence together | `ContentWords`, which cites WordNet's open-class coverage rather than a stop list |
| **Collocation** | Words that habitually occur together and mean something as a pair — *base form*, *common noun* | `Collocation` in OLiA; `PublishedPhrases` holds the ones the two topical resources state, and `CollocatedWords` reads a run of them as one word |

## Words about the shape of words

| Term | What it means | Where it is here |
|---|---|---|
| **Morphology** | How words are built out of smaller meaningful parts. [Morphology](https://en.wikipedia.org/wiki/Morphology_(linguistics)) | `WordMorphology` |
| **Morpheme** | The smallest meaningful part: *un-*, *read*, *-able* | `WordMorphology` |
| **Affix / prefix / suffix** | A morpheme attached to a word — before it, after it, or generally | `WordMorphology`, and OLiA's `Affix`, `Prefix`, `Suffix` |
| **Stem / root** | What is left of a word once its affixes are taken off | OLiA's `Stem`, `Root` |
| **Inflection** | A change of form that does not change the word — *phrase* → *phrases* | the lemma rung exists to price this correctly |
| **Derivation** | A change of form that makes a *new* word — *segment* → *segmenter* | the unbuilt half of [`BEHAVIOURS.md`](plans/BEHAVIOURS.md) |
| **Compound** | One word made of several — `topicDistribution`, or `userid` written without a boundary | `WordSegmenter`, `CompoundParses` |
| **Acronym / initialism / abbreviation** | Shortened forms. An acronym is pronounced as a word (*NATO*), an initialism spelled out (*HTTP*) | `wikidata-initialisms.tsv`, `WordNetAbbreviations` |

## Words about the shape of sentences

| Term | What it means | Where it is here |
|---|---|---|
| **Syntax** | How words combine into phrases and sentences — *structure*. [Syntax](https://en.wikipedia.org/wiki/Syntax) | `JavaSource` reads program syntax; OLiA's `SyntacticRole` |
| **Semantics** | What an expression **means**, as against how it is arranged. [Semantics](https://en.wikipedia.org/wiki/Semantics) | the whole library; OLiA's `SemanticFeature` |
| **Pragmatics** | What an expression means **in use** — what a sentence is *about*, what is new information. [Pragmatics](https://en.wikipedia.org/wiki/Pragmatics) | OLiA's `PragmaticUnit`, under which sits the `Topic` this library matches by accident |
| **Part of speech** | A word's grammatical class: noun, verb, adjective. Chosen here **by the parse**, not guessed: an identifier is a noun phrase, a method name is a clause | `Behaviours` |
| **Noun phrase** | A noun with the words modifying it — `topicDistribution` is one, and its **head** is the last word | `PhraseTopics` |
| **Head** | The word a phrase is really about; the rest modifies it | OLiA's `Head` |
| **Clause** | A verb and what it acts on. A method name reads as one, verb first | `Behaviours` |

## Words about vocabularies

| Term | What it means | Where it is here |
|---|---|---|
| **Corpus** | The body of text being read. Here: this repository, its declared names and its prose | `SourceScope`, `.readingignore` |
| **Lexicon** | A vocabulary as a resource a program can ask questions of | the `lexicon` module |
| **Taxonomy** | A published vocabulary arranged as a hierarchy | `TaxonomyTree` |
| **Ontology** | A taxonomy with stated relations between its concepts, usually in OWL. [OWL](https://www.w3.org/OWL/) | `OwlClasses`, OLiA |
| **SKOS** | The W3C vocabulary for publishing a concept scheme — `prefLabel`, `altLabel`, `broader`, `definition`. Every source this library bundles is normalised to these columns. [SKOS](https://www.w3.org/TR/skos-reference/) | `SkosConcept`, `SkosTsv` |
| **prefLabel / altLabel** | A concept's preferred name, and any other name its publisher states for it. A synonym is never invented here | `SkosConcept` |
| **broader** | The concept a publisher states one sits under. Followed, never inferred | `StatedAncestry`, `TaxonomyTree` |
| **Hypernym / hyponym** | *Kind-of* upwards and downwards: a **sparrow** is a hyponym of **bird**; **bird** is its hypernym. [Hyponymy](https://en.wikipedia.org/wiki/Hyponymy_and_hypernymy) | `Lexicon.sharedHypernyms` — in the tree and not yet read by the matcher |
| **Subsumption** | One concept being a kind of another — the relation `broader` and hypernymy both state | [`TERM_MATCHING.md`](plans/TERM_MATCHING.md) |
| **Least common subsumer** | The nearest concept two others are both a kind of. Its **depth** is how near they really are — two concepts meeting only at the root have been shown to be unrelated | the unbuilt hypernym-depth arm |
| **Semantic domain** | A subject label attached to a word — *computing*, *law*, *music*. General dictionaries label a word's **specialist** senses only, which is why *cite* votes *law* | `WordNetDomains`, `wiktionary-topics.tsv` |
| **Gloss / definition** | A publisher's own sentence explaining a concept. Prose, so it can be read into topics — which is what would make a concept matchable by what it *means* | [`OLIA_DEFINITIONS.md`](plans/OLIA_DEFINITIONS.md) |

## Words about the arithmetic

| Term | What it means | Where it is here |
|---|---|---|
| **Surprisal** | How informative a word is: rare words carry more. Read off a published frequency list, never chosen. [Information content](https://en.wikipedia.org/wiki/Information_content) | `WordSpecificity`, `PhraseSpecificity` |
| **Jensen–Shannon divergence** | How far apart two distributions are, in bits, **bounded at 1** — which is why it is used and Kullback–Leibler, which is unbounded, is not. [JSD](https://en.wikipedia.org/wiki/Jensen%E2%80%93Shannon_divergence) | `JensenShannon` |
| **Permutation null** | What the same statistic would have shown by chance: resample, recompute 999 times, and judge the real figure against that field. [Permutation test](https://en.wikipedia.org/wiki/Permutation_test) | `PermutationNull`, `SubjectNull` |
| **Chance-expected best** | The bar when a *field* of candidates competes: with 152 subjects you get 152 attempts at looking nearest, so the bar is the best of 152 draws and not the median | `ChanceExpectedBest` |
| **Log-linear pooling** | Combining independent opinions by their geometric mean, so two resources agreeing is worth more than one resource shouting | `PooledLogOdds` |
| **Abstention mass** | The share of a reading nothing could account for, carried **in the denominator** rather than dropped. A signal that cannot speak abstains; it does not vote zero | `OpenSpaceAccumulator` |
| **λ (legibility)** | The share of a scope's word occurrences some bundled resource could read. A denominator, reported beside every reading that rests on one | `LegibilityReading` |
| **ι (intensity)** | How much of a scope a topic accounts for | `TopicDistribution` |
| **Wu–Palmer similarity** | Nearness in a taxonomy, from the depth of the least common subsumer. Bounded in `[0, 1]` by construction | proposed, unbuilt |

## "High-meaning" words, which is two separate facts

There is no single class called that, and deliberately so — it is the product of two independent citations, each of which can be argued with on its own.

| | The question | The citation | Where |
|---|---|---|---|
| **Is it a content word at all?** | Does English use this word to carry subject matter, or to hold a sentence together? | WordNet is a dictionary of **open-class** words by construction. *and*, *of*, *that*, *which* are not in it as a noun or a verb, so asking for their lemma is how the reading finds out — **without anybody writing a stop list** | `ContentWords` |
| **How much does it narrow?** | How rare is it? | `log(rank) / log(size)` off the bundled Leipzig frequency list. Bounded in `[0, 1]` by the list's own length, not by a chosen constant, and a word the list does not carry at all is as specific as the list can say | `WordSpecificity` |

The two multiply. A term's mass is `specificity × occurrences`, so `name` written 460 times weighs almost nothing and `interest rate swap` written once weighs near the ceiling. `PhraseSpecificity` extends it to a run of words as the complement of the product of their commonness — equal to `WordSpecificity` at one word, and rising with every word added.

Two things worth knowing about the second:

- **It is a weight and never a gate.** The commonest word in English still votes, at the smallest weight the list can express. Nothing is excluded anywhere in this library.
- **Summed surprisal was the other reading and was rejected.** It needs truncating to stay bounded and reaches that ceiling on any two content words, so every multi-word term would weigh the same.

One further rule that is about length rather than meaning: one- and two-letter forms are refused, because a dictionary entry for a one-letter form is a symbol reading — *a* the ampere, *be* beryllium, *em* a printer's measure — and a name can be a sentence with an article in it.

## Words this project uses in a particular way

| Term | What it means here |
|---|---|
| **Citation** | A statement by a published resource. Every signal in this library is a weighted vote from one, and a reading that cannot cite **abstains** |
| **Witness** | The specific word, line or concept a claim rests on, printed beside the claim so a reader can argue with it |
| **Declaration vs use** | A name this repository *declared*, against a name it merely *used* from somebody else's library. Only declarations are read, which is what removes `String`, `List` and `assertThat` without naming any of them |
| **Scope** | One source set or the documentation, read as a unit and compared against the whole repository |
| **Blob** | A `(content, path)` pair in git. Content-addressed, so an unchanged file across five hundred commits is one observation |
| **Provenance header** | The comment block at the top of every bundled resource stating its source URL, its pinned revision and its licence. A resource without one fails the build |
| **Rung** | Which normalisation a term match was made at — the words, their lemmas, or their senses. Carried on every match, and never summed across |

---

## The standards the shape is borrowed from

These publish no vocabulary of their own; they are the grammars everything below is stated in.

| Standard | What it gives this library | Reference |
|---|---|---|
| **SKOS** — Simple Knowledge Organization System | The seven columns every bundled taxonomy is normalised to, whatever its publisher used: `concept`, `prefLabel`, `altLabel`, `broader`, `kind`, `module`, `definition`. A source already publishing SKOS is copied rather than interpreted, and one that is not is restated in the vocabulary SKOS gives for saying it. Normalising the *vocabulary* is the win; emitting SKOS RDF is not, and is deliberately not done | [W3C SKOS Reference](https://www.w3.org/TR/skos-reference/), [Primer](https://www.w3.org/TR/skos-primer/) |
| **OWL** / **RDF** | What OLiA and FIBO are actually published in, read with an XML parser rather than by pattern — a class states its superclasses beside anonymous restrictions that are themselves classes, and only a parse tells them apart | [OWL 2](https://www.w3.org/TR/owl2-overview/), [RDF/XML](https://www.w3.org/TR/rdf-syntax-grammar/) |
| **OASIS genericode** | The format FpML publishes its 236 coding schemes in, when that extraction lands | [genericode 1.0](https://docs.oasis-open.org/codelist/genericode/) |
| **OSCAL** | The one format NIST publishes all its catalogues in, so SP 800-53 needs no second reader | [OSCAL](https://pages.nist.gov/OSCAL/) |

## Primary sources

| Resource | What it publishes | Licence |
|---|---|---|
| [WordNet](https://wordnet.princeton.edu/) | English senses, synsets, hypernym chains, corpus sense counts | Princeton WordNet licence, via `extjwnl` |
| [WordNet Domains](https://wndomains.fbk.eu/) | A semantic domain per labelled sense | as stated in `wordnet-domains.txt` |
| [Wiktionary / wiktextract](https://kaikki.org/) | Topic labels per headword, and a generalisation map over them | CC BY-SA 4.0 |
| [OLiA](https://github.com/acoli-repo/olia) | 1,312 concepts of linguistic annotation, already spelled as identifiers | CC BY 3.0 |
| [arXiv taxonomy](https://github.com/arxiv/arxiv-base) | 8 groups, 11 archives, 155 subject categories with descriptions | MIT |
| [NIST CSF 2.0](https://github.com/usnistgov/oscal-content) | 6 functions, 22 categories, 106 subcategories, each with its stated outcome | public domain / CC0 |
| [Leipzig corpora](https://wortschatz.uni-leipzig.de/) | A 20,000-word English frequency list | as stated in the resource header |

[`NOTICE.md`](../NOTICE.md) states every bundled file, its source and its licence.
