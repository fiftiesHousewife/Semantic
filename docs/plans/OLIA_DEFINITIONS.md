# The taxonomy states more than we read — definitions, provenance, and its other modules

Measured on the bundled revision, not assumed. **The extraction half has landed.** The document states 1,292 `rdfs:comment` and 969 `owl:versionInfo` elements in all; of those, the ones sitting on a named class are what a taxonomy row can carry:

| The source states | Count | What we do with it |
|---|--:|---|
| `rdfs:comment` on a named class — a real definition | **1,271 over 1,216 concepts** | carried, as `definition` |
| `owl:versionInfo` on a named class — where the publisher took the concept from | **949 over 780 concepts** | carried, as `note`, a column the SKOS shape did not have |
| `rdfs:label` | 786 | kept where it differs from the identifier |
| `concept` URI, resolvable | 1,312 | kept, never rendered as a link |

Whitespace is collapsed so a row stays a row, repeated statements are joined rather than the first one kept, and an exact repeat counts once — which is the 1,272nd comment. `OliaTermsTest` asserts each of those counts against the shipped file, so the next reading that drops a property fails rather than ships quietly.

**What is left is the use, not the extraction.** Nothing yet *reads* a definition: a concept is still matched by the string it is called and not by what it means.

**They are visible now, which is a different thing and was worth doing first.** The taxonomy page names all 1,311 concepts rather than the 56 this repository writes, each with the publisher's own definition, and the 1,255 it does not write sit behind one closed fold per branch — the same rule at every depth, including the 59 root branches of the field this codebase never enters. The picture cannot do this and no styling will make it: a sunburst wedge is as wide as its share of the field, so a leaf is a hairline and its name will not fit inside it. A reader asking what this library *should* be matching against was reading the resource file to find out, and the answer belongs in the reading.

**Following the URIs buys nothing and that was checked**: `http://purl.org/olia/olia.owl#Verb` answers 302 to the whole ontology document, so a concept URI is a fragment into the one file already bundled. Of 4,381 references in it, all but a handful point inside OLiA — three reach ISOcat data categories and the rest are the authors' own ORCID and GitHub links. Fetching 1,312 URLs would fetch one file 1,312 times.

**Why it matters beyond a richer page.** A definition is prose, and this library reads prose into topics already — so a concept becomes matchable by **what it means** and not only by what it is called. That is a second surface for the context problem above: `Topic` defined as *what a sentence is about* is checkable against a repository that means a subject label, where the bare string `topic` is not. It is also what lets a reader judge a match without opening the ontology, which is the whole argument for witnesses everywhere else in this library.

**Cheap, and no licence question**: it is the same document under the same CC BY 3.0 header, and `OwlClasses` already walks the elements these sit beside.

**Then, separately: OLiA is modular and we bundle only its core.** The repository publishes `owl/stable` and `owl/experimental` — annotation models and linking models that map real tagsets, Penn Treebank and STTS among them, onto the core concepts. That is a great deal more vocabulary and a great deal more chance of matching identifiers a program really writes. It needs its own provenance header and its own licence read before anything is bundled, and it should wait until definition-matching has been measured, because a larger vocabulary matched the same misleading way is a larger version of the same defect.

---
