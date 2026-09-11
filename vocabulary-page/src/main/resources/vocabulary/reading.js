/* Draws the findings page's two figures from the data block: the cloud of the meanings the signals merge
   to, and the three leading domains as overlapping sets with a word count per region. */
(function () {
    "use strict";

    var SVG = "http://www.w3.org/2000/svg";
    var BANDS = 5;
    var TILE_SMALLEST = 0.85;
    var TILE_LARGEST = 2.6;
    var WORD_SMALLEST = 0.95;
    var WORD_LARGEST = 2.1;
    var LARGEST_RADIUS = 140;
    var SMALLEST_RADIUS = 60;
    var CENTRE_SPACING = 0.72;
    var DISJOINT_SPACING = 1.08;
    var MARGIN = 26;
    var GRID_STEP = 5;

    var data = JSON.parse(document.getElementById("reading").textContent);
    var leading = data.leadingDomains || [];
    var overlap = data.overlap || {domains: [], regions: [], otherDomains: []};
    var cloudReadout = document.querySelector(".cloud-readout");
    var vennReadout = document.querySelector(".venn-readout");
    var vennByWord = {};

    function element(name, className, text) {
        var made = document.createElement(name);
        if (className) {
            made.className = className;
        }
        if (text !== undefined) {
            made.textContent = text;
        }
        return made;
    }

    function svgElement(name, attributes) {
        var made = document.createElementNS(SVG, name);
        Object.keys(attributes).forEach(function (key) {
            made.setAttribute(key, attributes[key]);
        });
        return made;
    }

    /* ---- the cloud ---- */

    function chipFor(tile) {
        var place = -1;
        (tile.domains || []).forEach(function (domain) {
            var found = leading.indexOf(domain);
            if (found >= 0 && (place < 0 || found < place)) {
                place = found;
            }
        });
        return place < 0 ? null : element("span", "chip set-" + place);
    }

    function tileStatement(tile) {
        var parts = [tile.label + " — " + tile.claim.toFixed(4) + " bits, "
            + tile.timesChance.toFixed(1) + " times what chance reaches"];
        if (tile.occurrences) {
            parts[0] += ", written " + tile.occurrences.toLocaleString()
                + (tile.occurrences === 1 ? " time" : " times");
        }
        if (tile.partOfSpeech) {
            parts.push(tile.partOfSpeech + " '" + tile.name.replace(/_/g, " ") + "'");
        }
        if (tile.domains && tile.domains.length) {
            parts.push(tile.domains.join(", "));
        }
        return parts.join(" · ");
    }

    /* Largest tiles toward the middle, so the cloud reads from its centre outwards. */
    function centred(tiles) {
        var left = [];
        var right = [];
        tiles.forEach(function (tile, index) {
            (index % 2 ? left : right).push(tile);
        });
        return left.reverse().concat(right);
    }

    function drawCloud() {
        var cloud = document.querySelector(".cloud");
        var tiles = ((data.funnel && data.funnel.tiles) || []).map(function (tile) {
            return {label: tile.members.join(" · ").replace(/_/g, " "), claim: tile.claim,
                timesChance: tile.timesChance, members: tile.members, domains: tile.domains,
                partOfSpeech: tile.partOfSpeech, name: tile.name, occurrences: tile.occurrences};
        });
        if (tiles.length === 0) {
            cloudReadout.textContent = "The reading reports no signals here.";
            return;
        }
        var positive = tiles.filter(function (tile) { return tile.claim > 0; })
            .map(function (tile) { return tile.claim; });
        var weakest = Math.min.apply(null, positive);
        var strongest = Math.max.apply(null, positive);
        var claimSpan = strongest > weakest ? Math.log(strongest / weakest) : 0;
        var loudest = tiles.reduce(function (most, tile) {
            return Math.max(most, tile.timesChance);
        }, 1);
        var doublings = Math.log(loudest) / Math.LN2;
        centred(tiles).forEach(function (tile) {
            var made = element("b", tile.members.length > 1 ? "merged" : null);
            var chip = chipFor(tile);
            if (chip !== null) {
                made.appendChild(chip);
            }
            made.appendChild(document.createTextNode(tile.label));
            var share = tile.claim > 0 && claimSpan > 0
                ? Math.log(tile.claim / weakest) / claimSpan : 0;
            made.style.fontSize =
                (TILE_SMALLEST + (TILE_LARGEST - TILE_SMALLEST) * share).toFixed(2) + "rem";
            var above = Math.log(Math.max(tile.timesChance, 1)) / Math.LN2;
            made.setAttribute("data-band", String(doublings > 0
                ? Math.min(BANDS - 1, Math.floor(above / doublings * BANDS)) : 0));
            made.setAttribute("tabindex", "0");
            made.addEventListener("mouseenter", function () {
                cloudReadout.textContent = tileStatement(tile);
            });
            made.addEventListener("focus", function () {
                cloudReadout.textContent = tileStatement(tile);
            });
            made.addEventListener("click", function () {
                var placed = vennByWord[tile.members[0]];
                if (placed) {
                    placed.scrollIntoView({block: "center", behavior: "smooth"});
                    placed.focus();
                }
            });
            cloud.appendChild(made);
        });
        cloudReadout.textContent = tiles.length.toLocaleString()
            + " meanings. Rest on a tile for its figures; click one for its place in the domains.";
        requestAnimationFrame(function () {
            cloud.scrollTop = Math.max(0, (cloud.scrollHeight - cloud.clientHeight) / 2);
        });
    }

    /* ---- the overlapping sets ---- */

    function drawOverlap() {
        var sets = overlap.domains.length;
        if (sets === 0) {
            vennReadout.textContent = "No labelled sense places these words in any domain.";
            drawFoot([]);
            return;
        }
        var heaviest = overlap.domains.reduce(function (most, domain) {
            return Math.max(most, domain.claim);
        }, 0);
        var placedWeight = overlap.domains.concat(overlap.otherDomains).reduce(function (sum, domain) {
            return sum + domain.claim;
        }, 0);
        function shareOf(domain) {
            return (100 * domain.claim / placedWeight).toFixed(0) + "%";
        }
        var radii = overlap.domains.map(function (domain) {
            return Math.max(SMALLEST_RADIUS, LARGEST_RADIUS * Math.sqrt(domain.claim / heaviest));
        });

        function sharedWords(one, two) {
            return overlap.regions.filter(function (region) {
                return region.domains.indexOf(one) >= 0 && region.domains.indexOf(two) >= 0;
            }).reduce(function (count, region) {
                return count + region.words.length;
            }, 0);
        }

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
                + (words.length ? ": " + words.join(", ")
                    + (region.words.length > words.length ? ", …" : "") : "");
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

        function sized(claim) {
            if (most <= least) {
                return WORD_SMALLEST;
            }
            var share = (Math.log(claim) - Math.log(least)) / (Math.log(most) - Math.log(least));
            return WORD_SMALLEST + (WORD_LARGEST - WORD_SMALLEST) * share;
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
                    + " · " + shareOf(overlap.domains[index]);
                svg.appendChild(label);
            });
            placed.forEach(function (centre, index) {
                var circle = svg.querySelectorAll("circle")[index];
                circle.addEventListener("mouseenter", function () {
                    vennReadout.textContent = overlap.domains[index].domain + " holds "
                        + shareOf(overlap.domains[index])
                        + " of the weight that reaches any domain — "
                        + overlap.domains[index].claim.toFixed(4)
                        + " bits — and the circle's area is in proportion to it.";
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
                    vennReadout.textContent = regionStatement(region);
                }
                function open() {
                    document.getElementById(sectionId(region))
                        .scrollIntoView({behavior: "smooth"});
                }
                count.addEventListener("mouseenter", show);
                count.addEventListener("focus", show);
                count.addEventListener("click", open);
                var target = svgElement("circle",
                    {cx: at.x, cy: at.y, r: 20, "class": "target"});
                target.addEventListener("mouseenter", show);
                target.addEventListener("click", open);
                svg.appendChild(count);
                svg.appendChild(target);
            });
            document.querySelector(".figure").appendChild(svg);
        }

        function wordStatement(region, word) {
            var labels = word.placedBy || [];
            var shown = labels.slice(0, 8);
            return word.word + " — " + word.claim.toFixed(4) + " bits · senses state "
                + namesOf(region).join(", ")
                + (word.unambiguous ? " · one domain across every labelled sense"
                    : " · its senses state several domains")
                + (shown.length ? " · placed by " + shown.join("; ")
                    + (labels.length > shown.length
                        ? " and " + (labels.length - shown.length) + " more" : "") : "");
        }

        function wordTile(region, word) {
            var made = element("span", word.unambiguous ? "anchor" : null, word.word);
            vennByWord[word.word] = made;
            made.style.fontSize = sized(word.claim).toFixed(2) + "rem";
            made.setAttribute("tabindex", "0");
            function show() {
                vennReadout.textContent = wordStatement(region, word);
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
                var head = document.createElement("h3");
                region.domains.forEach(function (index) {
                    head.appendChild(element("span", "chip set-" + index));
                });
                head.appendChild(document.createTextNode(heading(region) + " — "
                    + region.words.length + (region.words.length === 1 ? " word" : " words")));
                section.appendChild(head);
                var words = element("div", "words");
                if (region.words.length === 0) {
                    words.appendChild(element("span", "none",
                        "No significant word's senses state exactly this overlap."));
                }
                region.words.forEach(function (word) {
                    words.appendChild(wordTile(region, word));
                });
                section.appendChild(words);
                panel.appendChild(section);
            });
        }

        vennReadout.textContent = "Rest on a word or a count for its figures.";
        drawFigure();
        drawRegions();
        drawFoot(allPlaced);
    }

    function drawFoot(allPlaced) {
        var others = (overlap.otherDomains || []).slice(0, 5).map(function (other) {
            return other.domain;
        });
        var parts = ["The export's " + data.signals + " signals become "
            + overlap.significantWords
            + " words once two spellings with one dictionary form count once; "
            + allPlaced.length + " sit in a drawn domain"];
        if (overlap.wordsInOtherDomainsOnly > 0) {
            parts.push(overlap.wordsInOtherDomainsOnly + " state only the "
                + overlap.otherDomains.length + " domains outside the picture (largest: "
                + others.join(", ") + ")");
        }
        parts.push(overlap.wordsWithoutALabelledSense + " state no labelled sense");
        parts.push((overlap.shareOfClaimOnUnlabelledSenses * 100).toFixed(0)
            + "% of the summed weight sits on senses with no domain label and contributes "
            + "no evidence");
        document.querySelector(".foot").textContent = parts.join("; ") + ".";
    }

    drawOverlap();
    drawCloud();
}());
