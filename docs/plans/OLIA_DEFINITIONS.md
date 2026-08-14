# The taxonomy states more than we read — definitions, provenance, and its other modules

Measured on the bundled revision, not assumed. Every row carries a resolvable concept URI and `broader` is
now full, but the `definition` column is **empty in all 1,312 rows** while the ontology publishes:

| The source states | Count | What we do with it |
|---|--:|---|
| `rdfs:comment` — a real definition per concept | **1,292** | discarded |
| `owl:versionInfo` — where the publisher took the concept from | **968** | discarded |
| `rdfs:label` | 786 | kept where it differs from the identifier |
| `concept` URI, resolvable | 1,312 | kept, never rendered as a link |

**Following the URIs buys nothing and that was checked**: `http://purl.org/olia/olia.owl#Verb` answers 302 to
the whole ontology document, so a concept URI is a fragment into the one file already bundled. Of 4,381
references in it, all but a handful point inside OLiA — three reach ISOcat data categories and the rest are
the authors' own ORCID and GitHub links. Fetching 1,312 URLs would fetch one file 1,312 times.

**Why it matters beyond a richer page.** A definition is prose, and this library reads prose into topics
already — so a concept becomes matchable by **what it means** and not only by what it is called. That is a
second surface for the context problem above: `Topic` defined as *what a sentence is about* is checkable
against a repository that means a subject label, where the bare string `topic` is not. It is also what lets a
reader judge a match without opening the ontology, which is the whole argument for witnesses everywhere else
in this library.

**Cheap, and no licence question**: it is the same document under the same CC BY 3.0 header, and
`OwlClasses` already walks the elements these sit beside.

**Then, separately: OLiA is modular and we bundle only its core.** The repository publishes `owl/stable` and
`owl/experimental` — annotation models and linking models that map real tagsets, Penn Treebank and STTS
among them, onto the core concepts. That is a great deal more vocabulary and a great deal more chance of
matching identifiers a program really writes. It needs its own provenance header and its own licence read
before anything is bundled, and it should wait until definition-matching has been measured, because a
larger vocabulary matched the same misleading way is a larger version of the same defect.

---
