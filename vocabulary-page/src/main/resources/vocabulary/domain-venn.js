/* Draws the domain overlaps under the reader's chosen source: circles sized by each domain's mass, a
   count per region that opens the region's words, and the words linking to the vocabulary page. */
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
    var sources = data.sources;
    var readout = document.querySelector(".readout");
    var byWord = {};

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

    function render(source) {
        if (source === data.domainSummarySource) {
            renderDomainSummary();
            return;
        }
        if (source === data.phraseSummarySource) {
            renderSummary();
            return;
        }
        var overlap = data.overlaps[source];
        var phrases = (data.phraseSources || []).indexOf(source) >= 0;
        var vocabulary = phrases ? source.replace(/ phrases$/, "") : null;
        var domainSource = !phrases;
        var sets = overlap.domains.length;
        byWord = {};
        document.querySelector(".fold").className = "fold";
        var figure = document.querySelector(".figure");
        figure.textContent = "";
        figure.style.display = "";
        drawBack(phrases ? vocabulary : null, domainSource ? source : null);
        document.querySelector(".overlaps").textContent = "";
        readout.textContent = "Rest on a word or a count for its figures.";

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
                    + " · " + shareOf(overlap.domains[index]);
                svg.appendChild(label);
            });
            placed.forEach(function (centre, index) {
                var circle = svg.querySelectorAll("circle")[index];
                circle.addEventListener("mouseenter", function () {
                    readout.textContent = overlap.domains[index].domain + " holds "
                        + shareOf(overlap.domains[index]) + " of the weight that reaches any domain — "
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
            return word.word + " — " + (phrases
                    ? word.claim.toFixed(0) + " occurrences"
                    : word.claim.toFixed(4) + " bits") + " · senses state "
                + namesOf(region).join(", ")
                + (word.unambiguous ? " · one domain across every labelled sense"
                    : " · its senses state several domains")
                + placedBy(word);
        }

        function placedBy(word) {
            var labels = word.placedBy || [];
            if (labels.length === 0) {
                return "";
            }
            var shown = labels.slice(0, 8);
            return " · placed by " + shown.join("; ")
                + (labels.length > shown.length
                    ? " and " + (labels.length - shown.length) + " more" : "");
        }

        function tile(region, word) {
            var made = document.createElement("a");
            byWord[word.word] = made;
            made.textContent = word.word;
            made.href = phrases
                ? "term-trees.html#" + encodeURIComponent(vocabulary)
                : "vocabulary.html#w-" + encodeURIComponent(word.word);
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
            var parts = [phrases
                ? "The evidence's reported phrase matches are " + overlap.significantWords
                    + " distinct terms; " + allPlaced.length + " sit in a drawn domain"
                : "The export's " + data.signals + " signals become " + overlap.significantWords
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

        if (sets > 0) {
            drawFigure();
            drawRegions();
        }
        drawFoot();
    }

    function returning(said, to) {
        var back = element("a", null, said);
        back.href = "#s-" + encodeURIComponent(to);
        back.addEventListener("click", function (event) {
            event.preventDefault();
            show(to);
        });
        return back;
    }

    function drawBack(vocabulary, domainSource) {
        var back = document.querySelector(".back");
        back.textContent = "";
        if (domainSource) {
            back.appendChild(returning("← every domain source", data.domainSummarySource));
            back.appendChild(document.createTextNode(" · the three domains " + domainSource
                + " puts most of this repository's weight on"));
            return;
        }
        if (!vocabulary) {
            return;
        }
        back.appendChild(returning("← every vocabulary", data.phraseSummarySource));
        back.appendChild(document.createTextNode(" · " + vocabulary + "'s matched phrases, drawn "
            + "over the areas where its matches part ways · "));
        var tree = element("a", null, "tree");
        tree.href = "term-trees.html#" + encodeURIComponent(vocabulary);
        back.appendChild(tree);
    }

    /* Every domain source at once: what each of them made of the same words, with its own name opening
       its overlap. The labels are never pooled — three publishers' words for overlapping subject matter
       are not the same label — so what a reader compares is each source's leaders and its coverage. */
    function renderDomainSummary() {
        byWord = {};
        drawBack(null, null);
        document.querySelector(".fold").className = "fold summary";
        figureIsHidden();
        var panel = document.querySelector(".overlaps");
        panel.textContent = "";
        readout.textContent = "A source's name opens the three domains it puts most of the weight on.";
        var summary = data.domainSummary;
        summary.rows.forEach(function (row) {
            var section = element("section", "summary-row");
            var heading = element("h2");
            heading.appendChild(returning(row.source, row.source));
            section.appendChild(heading);
            var leaders = element("div", "leaders");
            if (row.leading.length === 0) {
                leaders.appendChild(element("span", "none",
                    "This source labels none of this repository's words."));
            }
            row.leading.forEach(function (leader, index) {
                var named = element("span", "leader");
                named.appendChild(element("span", "chip set-" + index));
                named.appendChild(element("span", "domain", leader.domain));
                named.appendChild(element("span", "share",
                    (100 * leader.share).toFixed(0) + "%"));
                leaders.appendChild(named);
            });
            section.appendChild(leaders);
            var scale = element("div", "summary-scale");
            var bar = element("div", "summary-bar");
            bar.style.width = (100 * row.placedShare).toFixed(1) + "%";
            scale.appendChild(bar);
            section.appendChild(scale);
            section.appendChild(element("p", "held",
                row.placedWords + " of " + summary.significantWords + " words labelled, "
                    + (100 * row.placedShare).toFixed(0) + "% · " + row.description));
            panel.appendChild(section);
        });
        document.querySelector(".foot").textContent = "Each source states its own labels and they are "
            + "never mapped onto one another: WordNet's computer_science, OpenAlex's Artificial "
            + "Intelligence and CSO's computer systems are three publishers' words for overlapping "
            + "subject matter, and deciding which of them mean the same thing would be a judgement this "
            + "library made rather than one it can cite. The bar is how many of the same words a source "
            + "labelled with anything, so a source reaching a tenth of them names a leading domain "
            + "about a tenth of the repository. A leader's own share is of the weight that source "
            + "placed. How many words no source reached is not stated: each row counts the words its "
            + "own source is silent about, and two sources are silent about different words.";
    }

    function figureIsHidden() {
        var figure = document.querySelector(".figure");
        figure.textContent = "";
        figure.style.display = "none";
    }

    function renderSummary() {
        byWord = {};
        drawBack(null, null);
        document.querySelector(".fold").className = "fold summary";
        figureIsHidden();
        var panel = document.querySelector(".overlaps");
        panel.textContent = "";
        readout.textContent = "A vocabulary's name opens its overlap; tree opens the publisher's hierarchy.";
        var most = (data.phraseSummary || []).reduce(function (found, row) {
            return Math.max(found, row.phraseOccurrences);
        }, 0);
        (data.phraseSummary || []).forEach(function (row) {
            var section = element("section", "summary-row");
            var heading = element("h2");
            if (row.phraseTerms > 0) {
                var open = element("a", null, row.vocabulary);
                open.href = "#s-" + encodeURIComponent(row.source);
                open.addEventListener("click", function (event) {
                    event.preventDefault();
                    show(row.source);
                });
                heading.appendChild(open);
                heading.appendChild(document.createTextNode(" — " + row.phraseTerms
                    + (row.phraseTerms === 1 ? " phrase" : " phrases") + ", "
                    + row.phraseOccurrences + " occurrences · "));
            } else {
                heading.className = "silent";
                heading.appendChild(document.createTextNode(row.vocabulary + " — no phrase match · "));
            }
            var tree = element("a", null, "tree");
            tree.href = "term-trees.html#" + encodeURIComponent(row.vocabulary);
            heading.appendChild(tree);
            section.appendChild(heading);
            if (row.phraseOccurrences > 0 && most > 0) {
                var scale = element("div", "summary-scale");
                var bar = element("div",
                    "summary-bar v-" + row.vocabulary.toLowerCase().replace(/[^a-z]/g, ""));
                bar.style.width = (100 * row.phraseOccurrences / most).toFixed(1) + "%";
                scale.appendChild(bar);
                section.appendChild(scale);
            }
            section.appendChild(element("p", "description", row.description));
            panel.appendChild(section);
        });
        document.querySelector(".foot").textContent = "Only reported phrase matches are counted: "
            + "terms of two or more words the branch rule kept. Single-word matches are everyday "
            + "English more often than terms of art and are not drawn.";
    }

    /* Which picker button a source stands under: a source reached by drilling keeps its summary lit. */
    function pickerSourceOf(source) {
        if ((data.phraseSources || []).indexOf(source) >= 0) {
            return data.phraseSummarySource;
        }
        return (data.domainSources || []).indexOf(source) >= 0 ? data.domainSummarySource : source;
    }

    var buttons = [];
    var picker = document.querySelector(".sources");

    function show(source) {
        var chosen = pickerSourceOf(source);
        buttons.forEach(function (each) {
            each.className = each.textContent === chosen ? "chosen" : "";
        });
        render(source);
    }

    sources.forEach(function (source) {
        var button = element("button", null, source);
        button.type = "button";
        button.addEventListener("click", function () {
            show(source);
        });
        buttons.push(button);
        picker.appendChild(button);
    });

    var linkedSource = location.hash.indexOf("#s-") === 0
        ? decodeURIComponent(location.hash.slice(3)) : null;
    var known = linkedSource && (sources.indexOf(linkedSource) >= 0
        || data.overlaps[linkedSource] !== undefined
        || linkedSource === data.phraseSummarySource
        || linkedSource === data.domainSummarySource);
    var opened = known ? linkedSource : data.domainSummarySource;

    document.querySelector(".repository").textContent =
        data.overlaps[Object.keys(data.overlaps)[0]].repository;
    show(opened);

    /* A link from the vocabulary names one word; stand on it in its overlap. */
    if (location.hash.indexOf("#w-") === 0) {
        var linked = byWord[decodeURIComponent(location.hash.slice(3))];
        if (linked) {
            requestAnimationFrame(function () {
                linked.scrollIntoView({block: "center"});
                linked.focus();
            });
        }
    }
}());
