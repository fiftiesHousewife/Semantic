/* Draws the funnel of the export's rules, then one cloud of the meanings that survive them. */
(function () {
    "use strict";

    var BANDS = 5;
    var SMALLEST = 0.9;
    var LARGEST = 3.0;

    var data = JSON.parse(document.getElementById("vocabulary").textContent);
    var funnel = data.funnel;
    var leading = data.leadingDomains || [];
    document.querySelector(".repository").textContent = funnel.repository;
    var readout = document.querySelector(".readout");
    readout.textContent = "Rest on a tile for its figures.";

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

    var steps = [
        {left: funnel.field, rule: "the declared names of the published source sets, as words"},
        {left: funnel.field - funnel.belowChance, removed: funnel.belowChance,
            rule: "written no more densely here than a reference writes them, within what chance reaches"},
        {left: funnel.field - funnel.belowChance - funnel.withinError, removed: funnel.withinError,
            rule: "above the bars only inside the reference's own sampling error"},
        {left: funnel.signals, removed: funnel.languageSupplied,
            rule: "supplied by English rather than chosen — the export's signals are what remain"},
        {left: funnel.words, rule: "two spellings with one dictionary form count once"},
        {left: funnel.tiles.length, rule: "two words with one commonest sense share a tile"}
    ];

    var panel = document.querySelector(".funnel");
    steps.forEach(function (step) {
        var row = element("div", "step");
        var bar = element("div", "bar");
        bar.style.width = Math.max(1.5, 100 * step.left / funnel.field).toFixed(1) + "%";
        row.appendChild(bar);
        var caption = element("p", "caption");
        caption.appendChild(element("strong", null, step.left.toLocaleString()));
        caption.appendChild(document.createTextNode(" — " + step.rule
            + (step.removed ? " (" + step.removed.toLocaleString() + " set aside)" : "")));
        row.appendChild(caption);
        panel.appendChild(row);
    });

    /* Largest tiles toward the middle, so the cloud reads from its centre outwards. */
    function centred(tiles) {
        var left = [];
        var right = [];
        tiles.forEach(function (tile, index) {
            (index % 2 ? left : right).push(tile);
        });
        return left.reverse().concat(right);
    }

    var claims = funnel.tiles.map(function (tile) { return tile.claim; });
    var weakest = Math.min.apply(null, claims);
    var strongest = Math.max.apply(null, claims);
    var claimSpan = Math.log(strongest / weakest);
    var loudest = funnel.tiles.reduce(function (most, tile) {
        return Math.max(most, tile.timesChance);
    }, 1);
    var doublings = Math.log(loudest) / Math.LN2;

    function sized(claim) {
        var share = claimSpan > 0 ? Math.log(claim / weakest) / claimSpan : 1;
        return SMALLEST + (LARGEST - SMALLEST) * share;
    }

    function bandOf(tile) {
        var above = Math.log(Math.max(tile.timesChance, 1)) / Math.LN2;
        return doublings > 0
            ? Math.min(BANDS - 1, Math.floor(above / doublings * BANDS))
            : BANDS - 1;
    }

    function chipFor(tile) {
        var at = -1;
        tile.domains.forEach(function (domain) {
            var place = leading.indexOf(domain);
            if (place >= 0 && (at < 0 || place < at)) {
                at = place;
            }
        });
        if (at < 0) {
            return null;
        }
        return element("span", "chip set-" + at);
    }

    function statement(tile) {
        var parts = [tile.members.join(" · ").replace(/_/g, " ") + " — "
            + tile.claim.toFixed(4) + " bits, " + tile.timesChance.toFixed(1)
            + " times what chance reaches, written " + tile.occurrences.toLocaleString()
            + (tile.occurrences === 1 ? " time" : " times")];
        if (tile.partOfSpeech) {
            parts.push(tile.partOfSpeech + " '" + tile.name.replace(/_/g, " ") + "'");
        } else {
            parts.push("no dictionary sense");
        }
        if (tile.domains.length) {
            parts.push(tile.domains.join(", "));
        }
        return parts.join(" · ");
    }

    var byWord = {};
    var cloud = document.querySelector(".cloud");
    centred(funnel.tiles).forEach(function (tile) {
        var made = element("b", tile.members.length > 1 ? "merged" : null);
        var chip = chipFor(tile);
        if (chip !== null) {
            made.appendChild(chip);
        }
        made.appendChild(document.createTextNode(
            tile.members.join(" · ").replace(/_/g, " ")));
        made.style.fontSize = sized(tile.claim).toFixed(2) + "rem";
        made.setAttribute("data-band", String(bandOf(tile)));
        made.setAttribute("tabindex", "0");
        function show() {
            readout.textContent = statement(tile);
        }
        made.addEventListener("mouseenter", show);
        made.addEventListener("focus", show);
        tile.members.forEach(function (member) {
            byWord[member] = made;
        });
        cloud.appendChild(made);
    });

    document.querySelector(".foot").textContent = "Of the " + funnel.field.toLocaleString()
        + " words the published names state, " + funnel.belowChance.toLocaleString()
        + " sit within chance, " + funnel.withinError + " within the reference's own error and "
        + funnel.languageSupplied + " are English's; the " + funnel.signals
        + " signals become " + funnel.words + " dictionary forms and " + funnel.tiles.length
        + " meanings. A coloured mark names one of the leading domains: " + leading.join(", ") + ".";

    /* A link from another page names one word; stand on the tile that holds it. */
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
