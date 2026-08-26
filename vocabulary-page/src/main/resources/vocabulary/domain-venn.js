/* Draws the domain overlaps: circles sized by each domain's mass, a count per region that opens the
   region's words, and the words themselves linking through to the vocabulary page. */
(function () {
    "use strict";

    var SVG = "http://www.w3.org/2000/svg";
    var SMALLEST = 0.95;
    var LARGEST = 2.1;
    /* A circle's area carries its domain's mass; the floor keeps the smallest circle readable. */
    var LARGEST_RADIUS = 140;
    var SMALLEST_RADIUS = 60;
    /* How far two centres sit apart, as a share of their radii summed: near enough to overlap clearly
       where some word sits in both domains, and clear of each other where none does. */
    var CENTRE_SPACING = 0.72;
    var DISJOINT_SPACING = 1.08;
    var MARGIN = 26;
    var GRID_STEP = 5;

    var data = JSON.parse(document.getElementById("overlap").textContent);
    var overlap = data.overlap;
    var sets = overlap.domains.length;
    document.querySelector(".repository").textContent = overlap.repository;
    var readout = document.querySelector(".readout");
    readout.textContent = "Rest on a word or a count for its figures.";

    var heaviest = overlap.domains.reduce(function (most, domain) {
        return Math.max(most, domain.claim);
    }, 0);
    var radii = overlap.domains.map(function (domain) {
        return Math.max(SMALLEST_RADIUS, LARGEST_RADIUS * Math.sqrt(domain.claim / heaviest));
    });

    /* How many words sit in every overlap containing both domains, which is what says whether their
       circles touch at all. */
    function sharedWords(one, two) {
        return overlap.regions.filter(function (region) {
            return region.domains.indexOf(one) >= 0 && region.domains.indexOf(two) >= 0;
        }).reduce(function (count, region) {
            return count + region.words.length;
        }, 0);
    }

    /* Centres from the radii: a pair overlaps only where some word sits in both of its domains, and the
       triangle the three spacings state is laid out by the law of cosines — the same picture on every
       run. A spacing no triangle can hold is drawn at the longest one that can. */
    function centres() {
        function apart(one, two) {
            var spacing = sharedWords(one, two) > 0 ? CENTRE_SPACING : DISJOINT_SPACING;
            return spacing * (radii[one] + radii[two]);
        }
        if (sets === 1) {
            return [{x: 0, y: 0}];
        }
        if (sets === 2) {
            return [{x: 0, y: 0}, {x: apart(0, 1), y: 0}];
        }
        var c = apart(0, 1);
        var b = apart(0, 2);
        var a = apart(1, 2);
        c = Math.min(c, 0.98 * (a + b));
        b = Math.min(b, 0.98 * (a + c));
        a = Math.min(a, 0.98 * (b + c));
        var x = (b * b + c * c - a * a) / (2 * c);
        return [{x: 0, y: 0}, {x: c, y: 0}, {x: x, y: Math.sqrt(Math.max(0, b * b - x * x))}];
    }
    var placed = centres();

    var leftEdge = Math.min.apply(null, placed.map(function (centre, index) {
        return centre.x - radii[index];
    }));
    var topEdge = Math.min.apply(null, placed.map(function (centre, index) {
        return centre.y - radii[index];
    }));
    placed.forEach(function (centre, index) {
        centre.x += MARGIN - leftEdge;
        centre.y += 1.6 * MARGIN - topEdge;
        centre.r = radii[index];
    });
    var width = Math.max.apply(null, placed.map(function (centre) {
        return centre.x + centre.r;
    })) + MARGIN;
    var height = Math.max.apply(null, placed.map(function (centre) {
        return centre.y + centre.r;
    })) + 1.6 * MARGIN;

    function membership(x, y) {
        return placed.map(function (centre) {
            var dx = x - centre.x;
            var dy = y - centre.y;
            return dx * dx + dy * dy < centre.r * centre.r;
        });
    }

    /* Where a region's count sits: the average of every grid point inside exactly that overlap. */
    function anchorOf(region) {
        var inside = region.domains;
        var sumX = 0;
        var sumY = 0;
        var found = 0;
        for (var x = 0; x < width; x += GRID_STEP) {
            for (var y = 0; y < height; y += GRID_STEP) {
                var at = membership(x, y);
                var matches = at.every(function (held, index) {
                    return held === (inside.indexOf(index) >= 0);
                });
                if (matches) {
                    sumX += x;
                    sumY += y;
                    found += 1;
                }
            }
        }
        return found === 0 ? null : {x: sumX / found, y: sumY / found};
    }

    function svgElement(name, attributes) {
        var made = document.createElementNS(SVG, name);
        Object.keys(attributes).forEach(function (key) {
            made.setAttribute(key, attributes[key]);
        });
        return made;
    }

    function namesOf(region) {
        return region.domains.map(function (index) {
            return overlap.domains[index].domain;
        });
    }

    function heading(region) {
        var names = namesOf(region);
        if (names.length === sets && names.length > 1) {
            return "all " + names.length;
        }
        return names.join(" and ") + (names.length === 1 && sets > 1 ? " only" : "");
    }

    function sectionId(region) {
        return "region-" + region.domains.join("-");
    }

    function regionStatement(region) {
        var words = region.words.slice(0, 12).map(function (word) {
            return word.word;
        });
        return heading(region) + " — " + region.words.length
            + (region.words.length === 1 ? " word" : " words")
            + (words.length ? ": " + words.join(", ") + (region.words.length > words.length ? ", …" : "")
                : "");
    }

    var allPlaced = overlap.regions.reduce(function (all, region) {
        return all.concat(region.words);
    }, []);
    var least = allPlaced.reduce(function (found, word) {
        return Math.min(found, word.claim);
    }, Infinity);
    var most = allPlaced.reduce(function (found, word) {
        return Math.max(found, word.claim);
    }, 0);

    /* Size is a fixed multiple of the claim, the scale the word cloud page states. */
    function sized(claim) {
        if (most <= least) {
            return SMALLEST;
        }
        var share = (Math.log(claim) - Math.log(least)) / (Math.log(most) - Math.log(least));
        return SMALLEST + (LARGEST - SMALLEST) * share;
    }

    function drawFigure() {
        var svg = svgElement("svg", {viewBox: "0 0 " + Math.ceil(width) + " " + Math.ceil(height),
            role: "img", "aria-label": "Overlapping domain sets with a word count per region"});
        placed.forEach(function (centre, index) {
            svg.appendChild(svgElement("circle",
                {cx: centre.x, cy: centre.y, r: centre.r, "class": "set-" + index}));
        });
        placed.forEach(function (centre, index) {
            var below = centre.y > height / 2;
            var label = svgElement("text", {x: centre.x,
                y: below ? centre.y + centre.r + 18 : centre.y - centre.r - 8,
                "text-anchor": "middle"});
            label.textContent = overlap.domains[index].domain
                + " · " + overlap.domains[index].claim.toFixed(4) + " bits";
            svg.appendChild(label);
        });
        placed.forEach(function (centre, index) {
            var circle = svg.querySelectorAll("circle")[index];
            circle.addEventListener("mouseenter", function () {
                readout.textContent = overlap.domains[index].domain + " — "
                    + overlap.domains[index].claim.toFixed(4)
                    + " bits of the divided weight; the circle's area is in proportion to it.";
            });
        });
        overlap.regions.forEach(function (region) {
            var at = anchorOf(region);
            if (at === null) {
                return;
            }
            var count = svgElement("text",
                {x: at.x, y: at.y + 5, "text-anchor": "middle", "class": "count", tabindex: "0"});
            count.textContent = String(region.words.length);
            function show() {
                readout.textContent = regionStatement(region);
            }
            count.addEventListener("mouseenter", show);
            count.addEventListener("focus", show);
            count.addEventListener("click", function () {
                document.getElementById(sectionId(region)).scrollIntoView({behavior: "smooth"});
            });
            var target = svgElement("circle",
                {cx: at.x, cy: at.y, r: 20, "class": "target"});
            target.addEventListener("mouseenter", show);
            target.addEventListener("click", function () {
                document.getElementById(sectionId(region)).scrollIntoView({behavior: "smooth"});
            });
            svg.appendChild(count);
            svg.appendChild(target);
        });
        document.querySelector(".figure").appendChild(svg);
    }

    function statement(region, word) {
        return word.word + " — " + word.claim.toFixed(4) + " bits · senses state "
            + namesOf(region).join(", ")
            + (word.unambiguous ? " · one domain across every labelled sense"
                : " · its senses state several domains");
    }

    function tile(region, word) {
        var made = document.createElement("a");
        made.textContent = word.word;
        made.href = "vocabulary.html#w-" + encodeURIComponent(word.word);
        made.className = word.unambiguous ? "anchor" : "";
        made.style.fontSize = sized(word.claim).toFixed(2) + "rem";
        function show() {
            readout.textContent = statement(region, word);
        }
        made.addEventListener("mouseenter", show);
        made.addEventListener("focus", show);
        return made;
    }

    function drawRegions() {
        var panel = document.querySelector(".overlaps");
        overlap.regions.forEach(function (region) {
            var section = document.createElement("section");
            section.id = sectionId(region);
            var head = document.createElement("h2");
            region.domains.forEach(function (index) {
                var chip = document.createElement("span");
                chip.className = "chip set-" + index;
                head.appendChild(chip);
            });
            head.appendChild(document.createTextNode(heading(region)
                + " — " + region.words.length + (region.words.length === 1 ? " word" : " words")));
            section.appendChild(head);
            var words = document.createElement("div");
            words.className = "words";
            if (region.words.length === 0) {
                var none = document.createElement("span");
                none.className = "none";
                none.textContent = "No significant word's senses state exactly this overlap.";
                words.appendChild(none);
            }
            region.words.forEach(function (word) {
                words.appendChild(tile(region, word));
            });
            section.appendChild(words);
            panel.appendChild(section);
        });
    }

    function drawFoot() {
        var others = overlap.otherDomains.slice(0, 5).map(function (other) {
            return other.domain;
        });
        var parts = ["The export's " + data.signals + " signals become " + overlap.significantWords
            + " words once two spellings with one dictionary form count once; "
            + allPlaced.length + " sit in a drawn domain"];
        if (overlap.wordsInOtherDomainsOnly > 0) {
            parts.push(overlap.wordsInOtherDomainsOnly + " state only the " + overlap.otherDomains.length
                + " domains outside the picture (largest: " + others.join(", ") + ")");
        }
        parts.push(overlap.wordsWithoutALabelledSense + " state no labelled sense");
        parts.push((overlap.shareOfClaimOnUnlabelledSenses * 100).toFixed(0)
            + "% of the summed weight sits on senses with no domain label and contributes no evidence");
        document.querySelector(".foot").textContent = parts.join("; ") + ".";
    }

    if (sets > 0) {
        drawFigure();
        drawRegions();
    }
    drawFoot();
}());
