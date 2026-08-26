/* Draws the funnel of the export's rules; each row shows its own population, the last by default. */
(function () {
    "use strict";

    var BANDS = 5;
    var SMALLEST = 0.85;
    var LARGEST = 2.6;

    var data = JSON.parse(document.getElementById("vocabulary").textContent);
    var funnel = data.funnel;
    var leading = data.leadingDomains || [];
    document.querySelector(".repository").textContent = funnel.repository;
    var readout = document.querySelector(".readout");

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

    function surviving(rules) {
        return funnel.ranked.filter(function (word) {
            return rules.indexOf(word.leftAt) < 0;
        }).map(function (word) {
            return {label: word.word, claim: word.claim, timesChance: word.timesChance,
                members: [word.word], domains: []};
        });
    }

    function fromForms() {
        return funnel.forms.map(function (form) {
            return {label: form.word, claim: form.claim, timesChance: form.timesChance,
                members: [form.word], domains: [], occurrences: form.occurrences};
        });
    }

    function fromTiles() {
        return funnel.tiles.map(function (tile) {
            return {label: tile.members.join(" · ").replace(/_/g, " "), claim: tile.claim,
                timesChance: tile.timesChance, members: tile.members, domains: tile.domains,
                partOfSpeech: tile.partOfSpeech, name: tile.name, occurrences: tile.occurrences,
                merged: tile.members.length > 1};
        });
    }

    var steps = [
        {left: funnel.field, rule: "the declared names of the published source sets, as words",
            population: function () { return surviving([]); }},
        {left: funnel.field - funnel.belowChance, removed: funnel.belowChance,
            rule: "within what a reference reaches by chance",
            population: function () { return surviving(["chance"]); }},
        {left: funnel.field - funnel.belowChance - funnel.withinError, removed: funnel.withinError,
            rule: "above the bars only inside the reference's own sampling error",
            population: function () { return surviving(["chance", "error"]); }},
        {left: funnel.signals, removed: funnel.languageSupplied,
            rule: "supplied by English rather than chosen — the signals are what remain",
            population: function () { return surviving(["chance", "error", "english"]); }},
        {left: funnel.words, rule: "two spellings with one dictionary form count once",
            population: fromForms},
        {left: funnel.tiles.length, rule: "two words with one commonest sense share a tile",
            population: fromTiles}
    ];
    var at = steps.length - 1;

    function chipFor(tile) {
        var place = -1;
        tile.domains.forEach(function (domain) {
            var found = leading.indexOf(domain);
            if (found >= 0 && (place < 0 || found < place)) {
                place = found;
            }
        });
        return place < 0 ? null : element("span", "chip set-" + place);
    }

    function statement(tile) {
        var parts = [tile.label + " — " + tile.claim.toFixed(4) + " bits, "
            + tile.timesChance.toFixed(1) + " times what chance reaches"];
        if (tile.occurrences) {
            parts[0] += ", written " + tile.occurrences.toLocaleString()
                + (tile.occurrences === 1 ? " time" : " times");
        }
        if (tile.partOfSpeech) {
            parts.push(tile.partOfSpeech + " '" + tile.name.replace(/_/g, " ") + "'");
        }
        if (tile.domains.length) {
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

    var byWord = {};

    function drawCloud() {
        var cloud = document.querySelector(".cloud");
        cloud.textContent = "";
        byWord = {};
        var tiles = steps[at].population();
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
            var made = element("b", tile.merged ? "merged" : null);
            var chip = chipFor(tile);
            if (chip !== null) {
                made.appendChild(chip);
            }
            made.appendChild(document.createTextNode(tile.label));
            var share = tile.claim > 0 && claimSpan > 0
                ? Math.log(tile.claim / weakest) / claimSpan : 0;
            made.style.fontSize = (SMALLEST + (LARGEST - SMALLEST) * share).toFixed(2) + "rem";
            var above = Math.log(Math.max(tile.timesChance, 1)) / Math.LN2;
            made.setAttribute("data-band", String(doublings > 0
                ? Math.min(BANDS - 1, Math.floor(above / doublings * BANDS)) : 0));
            made.setAttribute("tabindex", "0");
            made.addEventListener("mouseenter", function () { readout.textContent = statement(tile); });
            made.addEventListener("focus", function () { readout.textContent = statement(tile); });
            made.addEventListener("click", function () {
                location.href = "domain-venn.html#w-" + encodeURIComponent(tile.members[0]);
            });
            tile.members.forEach(function (member) {
                byWord[member] = made;
            });
            cloud.appendChild(made);
        });
        readout.textContent = tiles.length.toLocaleString() + " on this row — "
            + steps[at].rule + ". Rest on a tile for its figures; click one for its domain.";
        requestAnimationFrame(function () {
            cloud.scrollTop = Math.max(0, (cloud.scrollHeight - cloud.clientHeight) / 2);
        });
    }

    var rows = [];
    var panel = document.querySelector(".funnel");
    steps.forEach(function (step, index) {
        var row = element("div", "step");
        row.setAttribute("tabindex", "0");
        var bar = element("div", "bar");
        bar.style.width = Math.max(1.5, 100 * step.left / funnel.field).toFixed(1) + "%";
        row.appendChild(bar);
        var caption = element("p", "caption");
        caption.appendChild(element("strong", null, step.left.toLocaleString()));
        caption.appendChild(document.createTextNode(" — " + step.rule
            + (step.removed ? " (" + step.removed.toLocaleString() + " set aside)" : "")));
        row.appendChild(caption);
        function choose() {
            at = index;
            rows.forEach(function (each, other) {
                each.className = other === index ? "step chosen" : "step";
            });
            drawCloud();
        }
        row.addEventListener("click", choose);
        row.addEventListener("keydown", function (pressed) {
            if (pressed.key === "Enter" || pressed.key === " ") {
                pressed.preventDefault();
                choose();
            }
        });
        rows.push(row);
        panel.appendChild(row);
    });
    rows[at].className = "step chosen";

    document.querySelector(".foot").textContent = "Of the " + funnel.field.toLocaleString()
        + " words the published names state, " + funnel.belowChance.toLocaleString()
        + " sit within chance, " + funnel.withinError + " within the reference's own error and "
        + funnel.languageSupplied + " are English's; the " + funnel.signals
        + " signals become " + funnel.words + " dictionary forms and " + funnel.tiles.length
        + " meanings. A coloured mark names one of the leading domains: " + leading.join(", ") + ".";

    drawCloud();

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
