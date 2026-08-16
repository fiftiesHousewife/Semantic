# Visualisation

## Visualisation

**A first viewer exists** for the theme reading — `ThemePage` renders the same `ThemeGraph` the export is written from, so the picture and the report cannot disagree. It is written the way everything else here is: markup is a DSL of typed tags and never a string in a Java file, the stylesheet and the script are their own files, and the page carries no document wrapper so whatever renders it supplies one. Its layout is deterministic (themes on rows ordered by intensity, arcs joining two themes when the same word was read as both), which is the same discipline the concept map below demands and for the same reason: no force simulation, because readability is not a layout parameter. What it draws is the shared *word*, which makes the polysemy that dominates a raw ranking visible instead of hiding it.

**A site is a link only where the reading could render one.** With no remote to permalink into, the reading renders an editor link — a path on the machine that read the tree, which opens nothing anywhere else and publishes that machine's layout to everyone the page reaches. The page names such a site and does not anchor it, and drops the url from the payload its script reads. It is the shape of the real fix rather than the fix: stages 1–3 are what make a witness a permalink.

**A picture has a resolution and a page does not.** The taxonomy sunburst draws all 1,311 concepts to scale, which is what it is for, and a leaf wedge is a hairline that will not hold its own name at any font size — the labels stop after the second ring and a hover tooltip names one wedge at a time. So the leaves are read on the tree page instead, every one of them named with the publisher's definition, and the picture keeps the one job it can do: the shape of a field and how much of it is lit. A viewer that answered both would be answering one of them badly.

Still to build: a concept map laid out by the hypernym tree — the taxonomy supplies the coordinates, so no force simulation is needed and none should be used — and a divergence bar over the ranked per-concept shares, which chart as diverging bars with a real axis maximum of 1.

**What must not be built** is a force-directed view over every node kind at once. One mid-sized repository at one commit yields 6,211 distinct words, 24.8% of them occurring exactly once. A whole-graph rendering is unreadable by construction, and readability is not a layout parameter.
