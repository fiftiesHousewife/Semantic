# Text the caller supplies, and the tracker the work is recorded in

Everything the reading has ever read, it found in the tree. A repository's subject matter is not all in its tree: the issue that motivated a change, the ticket describing the domain, a specification held elsewhere — each is a statement about what the code is for, written by the people who wrote the code, and none of it is reachable today.

Two shapes, and they differ in what they cost rather than in what they are worth.

## A string or a file the caller hands in

The cheap half. A caller supplies prose the repository does not contain and the reading treats it as prose: the same path a javadoc takes, through the same resources, at whatever a sentence is worth.

**What it changes.** `JavaSourceScopes` and `DocumentationScope` find what is under the root; `StatedExclusions` narrows it. Neither can express a source that is not in the tree, so a scope needs to be able to name text handed to it rather than found. The reading must still say where each figure came from — supplied text that is silently pooled with a repository's own prose would make a reading nobody can check.

**The hazard, stated before it is built.** A caller who supplies a description of the domain they want the answer to be gets that answer. That is marking your own homework with a shorter pencil, and it is why supplied text has to be **reported as its own scope**, with the repository's reading available beside it and without it. A reading that cannot be run both ways is not evidence about the code.

**What settles it:** a reading of one repository with and without its supplied text, with the divergence between the two reported. **Abandon if** the supplied text cannot be shown to move a figure it should not — that is, if the safeguard cannot be demonstrated rather than asserted.

## A tracker reference and the credentials to read it

The expensive half, and the value is that nobody has to paste anything: point the reading at a JIRA project or a GitHub repository's issues and it reads the titles and bodies of the work the code was written to do.

**What it costs.** A credential, which nothing in this library currently takes and which must never reach a report, a log line or a committed figure. A rate limit and a network dependency, where every reading today is a function of a directory. And a pinned retrieval — the panel manifest already establishes the shape: a reading of a moving target is not reproducible, so an issue set has to be recorded at a stated time with a stated query, the way `panel.tsv` records a sha256 of what it read and when.

**What it buys that the tree cannot.** An issue states the domain in the domain's own words rather than in the code's. `TERM_MATCHING` measures a matcher that cannot tell a term of a field from an English word a taxonomy claimed; a tracker is the one source where the field's own vocabulary is written by the same people in unconstrained prose.

**What settles it:** whether a repository's placement against a published subject taxonomy moves toward the domain its own tracker states, on a member of the panel where that domain was recorded by somebody outside this project before the reading ran. **Abandon if** the tracker text places a repository no better than its README does — a README costs no credential.

## Order

The string and the file come first: they need no credential, no network and no pinning, and they are what makes the safeguard above testable. The tracker follows once a reading can be run with and without supplied text and the difference reported.
