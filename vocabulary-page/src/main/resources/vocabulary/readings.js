/* Draws every published reading as one mark per answering source, placed by how far past its own bar the
   source stands, and the evidence behind each reading beneath the figure. */
(function () {
    "use strict";

    var SVG = "http://www.w3.org/2000/svg";
    var TIMES_ITS_BAR = "times its bar";
    var BITS_PAST_CHANCE = "bits past chance";
    /* A mark's area carries the phrases behind it; the floor keeps a one-phrase mark readable. */
    var LARGEST_RADIUS = 11;
    var SMALLEST_RADIUS = 3.5;
    var ROW_HEIGHT = 26;
    var BAND_GAP = 30;
    var LEFT_RAIL = 150;
    var RIGHT_MARGIN = 30;
    var TOP_MARGIN = 14;
    var AXIS_HEIGHT = 26;
    var WIDTH = 900;
    var BY_REPOSITORY = "by repository";
    var BY_PUBLISHER = "by publisher";

    var data = JSON.parse(document.getElementById("readings").textContent);
    var readout = document.querySelector(".readout");
    var figure = document.querySelector(".figure");

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

    function classOf(source) {
        return "v-" + source.toLowerCase().replace(/[^a-z]/g, "");
    }

    function figuresOf(answer) {
        return answer.unit === TIMES_ITS_BAR
            ? answer.phrases + " phrases at " + answer.strength.toFixed(1) + " times its bar"
            : answer.strength.toFixed(3) + " bits nearer than chance reached";
    }

    function pathOf(answer) {
        return answer.statedPath.length ? answer.statedPath.join(" › ") : "placed nowhere";
    }

    /* Every answer of every reading, paired with the reading it belongs to, built once. */
    var everyAnswer = data.readings.reduce(function (all, reading) {
        return all.concat(reading.answers.map(function (answer) {
            return {reading: reading, answer: answer};
        }));
    }, []);

    var mostPhrases = everyAnswer.reduce(function (found, each) {
        return Math.max(found, each.answer.phrases);
    }, 0);

    function radiusOf(answer) {
        if (answer.unit !== TIMES_ITS_BAR || mostPhrases === 0) {
            return SMALLEST_RADIUS;
        }
        return Math.max(SMALLEST_RADIUS,
            LARGEST_RADIUS * Math.sqrt(answer.phrases / mostPhrases));
    }

    function statement(reading, answer) {
        var said = answer.definition
            ? answer.concept + " — " + answer.definition
            : answer.concept;
        return reading.repository + " — " + answer.source + " states " + figuresOf(answer)
            + ". It places it under " + pathOf(answer) + ". " + said;
    }

    function rest(reading, answer) {
        return function () {
            readout.textContent = "";
            readout.appendChild(document.createTextNode(statement(reading, answer)));
        };
    }

    /* One band of rows sharing a unit: its own log scale, its own axis, and the bar rule only where
       there is one to draw. A vocabulary's scale starts at its bar, which is 1 and is a real position;
       a scheme's starts at a distance of nothing, which is off a log scale altogether, so the schemes
       get no rule and their axis states the range it covers. */
    function band(rows, unit, caption) {
        var strengths = rows.reduce(function (all, row) {
            return all.concat(row.marks.map(function (mark) {
                return mark.answer.strength;
            }));
        }, []);
        var most = Math.max.apply(null, strengths.concat(unit === TIMES_ITS_BAR ? [1] : []));
        var least = unit === TIMES_ITS_BAR ? 1 : Math.min.apply(null, strengths) / 2;
        var span = Math.max(Math.log(most) - Math.log(least), 0.0001);
        function at(strength) {
            var share = (Math.log(strength) - Math.log(least)) / span;
            return LEFT_RAIL + share * (WIDTH - LEFT_RAIL - RIGHT_MARGIN);
        }
        return {rows: rows, unit: unit, caption: caption, at: at, most: most, least: least};
    }

    function drawBand(svg, shape, top) {
        var y = top;
        if (shape.caption) {
            svg.appendChild(text(LEFT_RAIL, y + 10, shape.caption, "band"));
            y += 18;
        }
        if (shape.unit === TIMES_ITS_BAR) {
            svg.appendChild(svgElement("line", {x1: shape.at(1), y1: y, x2: shape.at(1),
                y2: y + shape.rows.length * ROW_HEIGHT, "class": "bar-rule"}));
        }
        shape.rows.forEach(function (row, index) {
            var centre = y + index * ROW_HEIGHT + ROW_HEIGHT / 2;
            svg.appendChild(rowLabel(row, centre));
            svg.appendChild(svgElement("line", {x1: LEFT_RAIL, y1: centre, x2: WIDTH - RIGHT_MARGIN,
                y2: centre, "class": "lane"}));
            row.marks.forEach(function (mark) {
                svg.appendChild(drawMark(mark, shape.at(mark.answer.strength), centre));
            });
        });
        y += shape.rows.length * ROW_HEIGHT;
        svg.appendChild(axis(shape, y));
        return y + AXIS_HEIGHT;
    }

    function axis(shape, y) {
        var group = svgElement("g", {});
        group.appendChild(svgElement("line",
            {x1: LEFT_RAIL, y1: y, x2: WIDTH - RIGHT_MARGIN, y2: y, "class": "lane"}));
        ticksOf(shape).forEach(function (tick) {
            var label = text(shape.at(tick.at), y + 14, tick.label, "");
            label.setAttribute("text-anchor", "middle");
            group.appendChild(label);
        });
        return group;
    }

    function ticksOf(shape) {
        if (shape.unit !== TIMES_ITS_BAR) {
            return [{at: 2 * shape.least, label: (2 * shape.least).toFixed(3) + " bits"},
                {at: shape.most, label: shape.most.toFixed(3) + " bits"}];
        }
        var ticks = [];
        var each = 1;
        while (each <= shape.most) {
            ticks.push({at: each, label: each + "×"});
            each *= 2;
        }
        return ticks;
    }

    function text(x, y, said, className) {
        var made = svgElement("text", {x: x, y: y});
        if (className) {
            made.setAttribute("class", className);
        }
        made.textContent = said;
        return made;
    }

    function rowLabel(row, centre) {
        var group = svgElement("g", {});
        var label = text(LEFT_RAIL - 22, centre + 4, row.label, "row");
        label.setAttribute("text-anchor", "end");
        group.appendChild(label);
        if (row.area) {
            group.appendChild(svgElement("circle", {cx: LEFT_RAIL - 12, cy: centre, r: 4,
                "class": "area " + row.area}));
        }
        return group;
    }

    function drawMark(mark, x, centre) {
        var circle = svgElement("circle", {cx: x, cy: centre, r: radiusOf(mark.answer),
            "class": "mark " + classOf(mark.answer.source), tabindex: "0"});
        var show = rest(mark.reading, mark.answer);
        circle.addEventListener("mouseenter", show);
        circle.addEventListener("focus", show);
        circle.addEventListener("click", function () {
            var section = document.getElementById(sectionId(mark.reading));
            if (section) {
                section.scrollIntoView({behavior: "smooth"});
            }
        });
        return circle;
    }

    function sectionId(reading) {
        return "r-" + reading.repository;
    }

    function rowsByRepository() {
        return data.readings.map(function (reading) {
            return {
                label: reading.repository,
                area: reading.statedArea ? (reading.reachedItsArea ? "reached" : "missed") : null,
                marks: reading.answers.map(function (answer) {
                    return {reading: reading, answer: answer};
                })
            };
        });
    }

    function rowsByPublisher() {
        return data.publishers.map(function (source) {
            return {
                label: source,
                area: null,
                marks: everyAnswer.filter(function (each) {
                    return each.answer.source === source;
                })
            };
        });
    }

    function inUnit(rows, unit) {
        return rows.map(function (row) {
            return {label: row.label, area: row.area, marks: row.marks.filter(function (mark) {
                return mark.answer.unit === unit;
            })};
        }).filter(function (row) {
            return row.marks.length > 0;
        });
    }

    /* A reading whose answers state no figure at all stands on neither scale. It keeps a row in the
       vocabulary band with no mark, because a reading that answered from nothing is a reading, and
       dropping it would leave the figure quietly short. */
    function unmarked(rows) {
        return rows.filter(function (row) {
            return row.marks.every(function (mark) {
                return mark.answer.unit !== TIMES_ITS_BAR
                    && mark.answer.unit !== BITS_PAST_CHANCE;
            });
        }).map(function (row) {
            return {label: row.label, area: row.area, marks: []};
        });
    }

    function drawFigure(rows) {
        var vocabularies = inUnit(rows, TIMES_ITS_BAR).concat(unmarked(rows));
        var schemes = inUnit(rows, BITS_PAST_CHANCE);
        var bands = [];
        if (vocabularies.length) {
            bands.push(band(vocabularies, TIMES_ITS_BAR,
                "answered by a published vocabulary, at the multiple of its own chance bar"));
        }
        if (schemes.length) {
            bands.push(band(schemes, "bits past chance",
                "answered by a subject scheme, in bits nearer than chance reached — "
                    + "these are the readings whose vocabularies said nothing"));
        }
        var height = TOP_MARGIN + bands.reduce(function (sum, shape) {
            return sum + (shape.caption ? 18 : 0) + shape.rows.length * ROW_HEIGHT
                + AXIS_HEIGHT + BAND_GAP;
        }, 0);
        var svg = svgElement("svg", {viewBox: "0 0 " + WIDTH + " " + Math.ceil(height),
            role: "img",
            "aria-label": "Every reading, each answering source placed by how far past its bar it stands"});
        var y = TOP_MARGIN;
        bands.forEach(function (shape) {
            y = drawBand(svg, shape, y) + BAND_GAP;
        });
        figure.textContent = "";
        figure.appendChild(svg);
    }

    function sourceName(answer) {
        if (!answer.publishedAt) {
            return element("span", null, answer.source);
        }
        var link = element("a", null, answer.source);
        link.href = answer.publishedAt;
        link.className = classOf(answer.source);
        return link;
    }

    /* The level the chance bar counts. A match found at any other level is a real match the bar never
       tested, so the count and the list are not the same figure and each row says which it is in. */
    var COUNTED_LEVEL = "words";

    function branchesOf(answer) {
        if (answer.branches.length < 2) {
            return null;
        }
        var phrases = 0;
        var counted = 0;
        answer.branches.forEach(function (branch) {
            branch.concepts.forEach(function (concept) {
                phrases += 1;
                counted += concept.normalisation === COUNTED_LEVEL ? 1 : 0;
            });
        });
        var details = element("details");
        details.appendChild(element("summary", null,
            "every phrase " + answer.source + " places: " + answer.branches.length
                + " branches, " + phrases + " phrases, " + counted
                + " of them at the level the bar counts"));
        var list = element("ul");
        answer.branches.forEach(function (branch) {
            var item = element("li");
            item.appendChild(element("span", "branch", branch.branch || "placed nowhere"));
            var written = element("ul", "written");
            branch.concepts.forEach(function (concept) {
                var line = element("li");
                line.appendChild(element("span", "phrase", concept.concept));
                line.appendChild(element("span", "occurrences", String(concept.occurrences)));
                if (concept.normalisation !== COUNTED_LEVEL) {
                    line.appendChild(element("span", "level",
                        "matched at " + concept.normalisation + ", which the bar did not count"));
                }
                if (concept.description) {
                    line.appendChild(element("span", "definition", concept.description));
                    if (concept.descriptionStatedFor !== concept.concept) {
                        line.appendChild(element("span", "stated-for",
                            answer.source + " states this for " + concept.descriptionStatedFor));
                    }
                }
                written.appendChild(line);
            });
            item.appendChild(written);
            list.appendChild(item);
        });
        details.appendChild(list);
        return details;
    }

    /* One subject as a line a reader can read: what the repository wrote, how often, and what its
       publisher says it means. The label alone is an identifier and says nothing. */
    function subjectLine(reading, subject) {
        var line = element("li", classOf(subject.source));
        line.appendChild(element("span", "label", headingOf(subject)));
        line.appendChild(element("span", "occurrences", String(subject.occurrences)));
        line.appendChild(element("span", "from", subject.subject
            ? subject.source + " places these here"
            : subject.source + " states nothing above this"));
        var phrases = element("div", "phrases");
        subject.concepts.forEach(function (written) {
            var each = element("div", "phrase-line");
            each.appendChild(element("span", "phrase", written.concept));
            each.appendChild(element("span", "occurrences", String(written.occurrences)));
            each.appendChild(element("span", "definition", written.description
                || (subject.source + " states nothing about it at any level")));
            if (written.description && written.descriptionStatedFor !== written.concept) {
                each.appendChild(element("span", "stated-for",
                    subject.source + " states this for " + written.descriptionStatedFor));
            }
            phrases.appendChild(each);
        });
        line.appendChild(phrases);
        line.addEventListener("mouseenter", function () {
            readout.textContent = reading.repository + " writes " + writtenHere(subject)
                + " — " + subject.occurrences + " occurrences.";
        });
        return line;
    }

    function drawAnswer(reading, answer, most) {
        var row = element("div", "answer");
        var source = element("div", "source");
        source.appendChild(sourceName(answer));
        row.appendChild(source);
        row.appendChild(element("div", "strength", answer.unit === TIMES_ITS_BAR
            ? answer.strength.toFixed(1) + "×"
            : answer.strength.toFixed(3) + " bits"));
        var says = element("div", "says");
        says.appendChild(element("span", "concept", answer.concept));
        if (answer.definition) {
            says.appendChild(document.createTextNode(" — "));
            says.appendChild(element("span", "definition", answer.definition));
        }
        row.appendChild(says);
        var scale = element("div", "scale");
        var filled = element("div", classOf(answer.source));
        filled.style.width = (most > 0 ? 100 * answer.strength / most : 0).toFixed(1) + "%";
        scale.appendChild(filled);
        row.appendChild(scale);
        row.appendChild(element("div", "path", pathOf(answer)));
        var branches = branchesOf(answer);
        if (branches) {
            row.appendChild(branches);
        }
        row.addEventListener("mouseenter", rest(reading, answer));
        return row;
    }

    function drawEvidence() {
        var panel = document.querySelector(".evidence");
        panel.textContent = "";
        data.readings.forEach(function (reading) {
            var section = element("section");
            section.id = sectionId(reading);
            var head = element("h2");
            head.appendChild(element("span", "name", reading.repository));
            if (reading.about.length) {
                head.appendChild(element("span", "about-what", reading.about.join(" · ")));
            }
            var views = element("span", "views-of");
            [["words", "vocabulary.html"], ["domains", "domain-venn.html"],
                ["trees", "term-trees.html"]].forEach(function (view, index) {
                if (index > 0) {
                    views.appendChild(document.createTextNode(" · "));
                }
                var link = element("a", null, view[0]);
                link.href = reading.repository + "/" + view[1];
                views.appendChild(link);
            });
            head.appendChild(views);
            head.appendChild(element("span", "held", reading.sourceType + " · "
                + (100 * reading.citableShare).toFixed(1) + "% of words a resource can cite · "
                + reading.belowTheirChanceBar.length + " vocabularies below their bar"));
            if (reading.statedArea) {
                head.appendChild(element("span",
                    "area " + (reading.reachedItsArea ? "reached" : "missed"),
                    (reading.reachedItsArea ? "reaches " : "misses ") + reading.statedArea));
            }
            section.appendChild(head);
            if (reading.subjects.length) {
                var stated = element("ul", "stated");
                reading.subjects.forEach(function (subject) {
                    stated.appendChild(subjectLine(reading, subject));
                });
                section.appendChild(stated);
            }
            var most = reading.answers.reduce(function (found, answer) {
                return Math.max(found, answer.strength);
            }, 0);
            reading.answers.forEach(function (answer) {
                section.appendChild(drawAnswer(reading, answer, most));
            });
            panel.appendChild(section);
        });
    }

    /* How many subjects each repository shows in the block at the top. The rest are in its section. */
    var SUBJECTS_ABOVE = 6;

    function named(written) {
        return written.description ? written.concept + " — " + written.description : written.concept;
    }






    /* What each repository is about, as text. No chips, no grid, no colour: a reader wants a sentence
       they can read, and a box sized by its contents is not one. */

    /* How many subjects a description names before the rest become a count. */
    var SUBJECTS_ABOVE = 6;

    /* The description names subjects and never the phrases beneath them. BaseForm and ProperNoun are the
       evidence a subject rests on, not a description of anything, and they belong under the reading with
       their counts rather than in the sentence that says what the repository is about. */
    function wroteSentence(reading) {
        var named = reading.subjects.slice(0, SUBJECTS_ABOVE).map(function (subject) {
            return subject.readable;
        });
        var said = element("p", "wrote");
        named.forEach(function (subject, index) {
            if (index > 0) {
                said.appendChild(document.createTextNode(", "));
            }
            said.appendChild(element("span", "named", subject));
        });
        if (reading.subjects.length > SUBJECTS_ABOVE) {
            said.appendChild(document.createTextNode(", and "));
            var more = element("a", "more",
                (reading.subjects.length - SUBJECTS_ABOVE) + " more");
            more.href = "matches.html#r-" + reading.repository;
            said.appendChild(more);
            said.appendChild(document.createTextNode("."));
        } else {
            said.appendChild(document.createTextNode("."));
        }
        return said;
    }

    /* Which vocabularies were judged and refused, with both counts. A count on its own cannot be argued
       with: a reader wants to know that CSO wrote 17 phrases against the 16 a deal of its own words
       reaches, and that OLiA wrote 6 against 2 on the same repository. */
    function refusedSentence(reading) {
        var each = reading.belowTheirChanceBar.map(function (refused) {
            return refused.vocabulary + " " + refused.bar.phrases + " against "
                + refused.bar.chanceExpectedBest;
        });
        return element("p", "refused", "Matched and set aside for writing no more phrases than a deal of "
            + "the publisher's own words reaches: " + each.join(", ") + ".");
    }

    function placedSentence(reading) {
        var levels = reading.placedIn.map(function (scheme) {
            return [scheme.archive, scheme.category].filter(Boolean).join(" \u203A ");
        });
        return element("p", "placed", "Subject schemes place it nearest to " + levels.join("; ") + ".");
    }

    function describe(reading) {
        var block = element("section", "about-row");
        block.id = "about-" + reading.repository;
        var head = element("h2");
        var name = element("a", "name", reading.repository);
        name.href = reading.repository + "/vocabulary.html";
        head.appendChild(name);
        block.appendChild(head);
        if (reading.about.length) {
            block.appendChild(element("p", "about-what", reading.about.join(", ") + "."));
        }
        if (reading.subjects.length) {
            block.appendChild(wroteSentence(reading));
        } else {
            block.appendChild(element("p", "wrote",
                "No vocabulary cleared the count a deal of its own words reaches, so none is published "
                    + "and none is drawn on here. " + reading.belowTheirChanceBar.length
                    + " were matched and set aside; their matches are in evidence.json."));
        }
        if (reading.placedIn.length) {
            block.appendChild(placedSentence(reading));
        }
        if (reading.belowTheirChanceBar.length) {
            block.appendChild(refusedSentence(reading));
        }
        var views = element("p", "views-of");
        [["words", "vocabulary.html"], ["domains", "domain-venn.html"],
            ["trees", "term-trees.html"]].forEach(function (view, index) {
            if (index > 0) {
                views.appendChild(document.createTextNode(" · "));
            }
            var link = element("a", null, view[0]);
            link.href = reading.repository + "/" + view[1];
            views.appendChild(link);
        });
        views.appendChild(document.createTextNode(" · "));
        var everyMatch = element("a", null, "every match");
        everyMatch.href = "matches.html#r-" + reading.repository;
        views.appendChild(everyMatch);
        block.appendChild(views);
        return block;
    }

    function drawAbout() {
        var panel = document.querySelector(".about");
        panel.textContent = "";
        data.readings.forEach(function (reading) {
            panel.appendChild(describe(reading));
        });
    }

    var buttons = [];

    function show(view) {
        buttons.forEach(function (each) {
            each.className = each.textContent === view ? "chosen" : "";
        });
        drawFigure(view === BY_PUBLISHER ? rowsByPublisher() : rowsByRepository());
        readout.textContent = "Rest on a mark for what that source said; click it for the evidence.";
    }

    [BY_REPOSITORY, BY_PUBLISHER].forEach(function (view) {
        var button = element("button", null, view);
        button.type = "button";
        button.addEventListener("click", function () {
            show(view);
        });
        buttons.push(button);
        document.querySelector(".views").appendChild(button);
    });

    drawAbout();
    drawEvidence();
    show(BY_REPOSITORY);
}());
