/* Draws the domain overlaps: the circles with a count per region, then the words of each region. */
(function () {
    "use strict";

    var SVG = "http://www.w3.org/2000/svg";
    var SMALLEST = 0.95;
    var LARGEST = 2.1;

    var overlap = JSON.parse(document.getElementById("overlap").textContent).overlap;
    var sets = overlap.domains.length;

    /* Fixed geometry per set count; a laid-out diagram is the same on every run. */
    var CIRCLES = {
        1: [{x: 280, y: 200, label: [280, 40]}],
        2: [{x: 210, y: 200, label: [110, 60]}, {x: 350, y: 200, label: [450, 60]}],
        3: [{x: 210, y: 170, label: [100, 40]}, {x: 350, y: 170, label: [460, 40]},
            {x: 280, y: 280, label: [280, 425]}]
    }[sets];
    var COUNTS = {
        1: {"0": [280, 205]},
        2: {"0": [160, 205], "1": [400, 205], "0,1": [280, 205]},
        3: {"0": [160, 150], "1": [400, 150], "2": [280, 340],
            "0,1": [280, 130], "0,2": [205, 255], "1,2": [355, 255], "0,1,2": [280, 205]}
    }[sets];
    var RADIUS = 130;

    document.querySelector(".repository").textContent = overlap.repository;
    var readout = document.querySelector(".readout");
    readout.textContent = "Rest on a word for its figures.";

    function svgElement(name, attributes) {
        var made = document.createElementNS(SVG, name);
        Object.keys(attributes).forEach(function (key) {
            made.setAttribute(key, attributes[key]);
        });
        return made;
    }

    function wordsOf(region) {
        return region.words;
    }

    var placed = overlap.regions.map(wordsOf).reduce(function (all, words) {
        return all.concat(words);
    }, []);
    var claims = placed.map(function (word) { return word.claim; });
    var least = Math.min.apply(null, claims);
    var most = Math.max.apply(null, claims);

    /* Size is a fixed multiple of the claim, the scale the word cloud page states. */
    function sized(claim) {
        if (most <= least) {
            return SMALLEST;
        }
        var share = (Math.log(claim) - Math.log(least)) / (Math.log(most) - Math.log(least));
        return SMALLEST + (LARGEST - SMALLEST) * share;
    }

    function drawFigure() {
        var svg = svgElement("svg", {viewBox: "0 0 560 440", role: "img",
            "aria-label": "Overlapping domain sets with a word count per region"});
        CIRCLES.forEach(function (circle, index) {
            svg.appendChild(svgElement("circle",
                {cx: circle.x, cy: circle.y, r: RADIUS, "class": "set-" + index}));
        });
        CIRCLES.forEach(function (circle, index) {
            var label = svgElement("text",
                {x: circle.label[0], y: circle.label[1], "text-anchor": "middle"});
            label.textContent = overlap.domains[index];
            svg.appendChild(label);
        });
        overlap.regions.forEach(function (region) {
            var at = COUNTS[region.domains.join(",")];
            var count = svgElement("text",
                {x: at[0], y: at[1], "text-anchor": "middle", "class": "count"});
            count.textContent = String(region.words.length);
            svg.appendChild(count);
        });
        document.querySelector(".figure").appendChild(svg);
    }

    function heading(region) {
        var names = region.domains.map(function (index) { return overlap.domains[index]; });
        if (names.length === overlap.domains.length && names.length > 1) {
            return "all " + names.length;
        }
        return names.join(" and ") + (names.length === 1 && overlap.domains.length > 1 ? " only" : "");
    }

    function statement(region, word) {
        var names = region.domains.map(function (index) { return overlap.domains[index]; });
        return word.word + " — " + word.claim.toFixed(4) + " bits · senses state " + names.join(", ")
            + (word.unambiguous ? " · one domain across every labelled sense"
                : " · its senses state several domains");
    }

    function tile(region, word) {
        var made = document.createElement("b");
        made.textContent = word.word;
        if (word.unambiguous) {
            made.className = "anchor";
        }
        made.style.fontSize = sized(word.claim).toFixed(2) + "rem";
        made.setAttribute("tabindex", "0");
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
            var head = document.createElement("h2");
            region.domains.forEach(function (index) {
                var chip = document.createElement("span");
                chip.className = "chip set-" + index;
                head.appendChild(chip);
            });
            head.appendChild(document.createTextNode(heading(region)
                + " — " + region.words.length + (region.words.length === 1 ? " word" : " words")));
            section.appendChild(head);
            if (region.words.length === 0) {
                var none = document.createElement("span");
                none.className = "none";
                none.textContent = "No significant word's senses state exactly this overlap.";
                section.appendChild(none);
            }
            region.words.forEach(function (word) {
                section.appendChild(tile(region, word));
            });
            panel.appendChild(section);
        });
    }

    function drawFoot() {
        var others = overlap.otherDomains.slice(0, 5).map(function (other) { return other.domain; });
        var parts = [];
        if (overlap.otherDomains.length > 0) {
            parts.push(overlap.otherDomains.length + " further domains hold words the picture leaves out"
                + " (largest: " + others.join(", ") + ")");
        }
        parts.push(overlap.wordsWithoutALabelledSense
            + " significant words carry no labelled sense, and a reading that cannot cite abstains");
        document.querySelector(".foot").textContent = parts.join(". ") + ".";
    }

    if (sets > 0) {
        drawFigure();
        drawRegions();
    }
    drawFoot();
}());
