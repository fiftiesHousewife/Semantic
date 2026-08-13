#!/usr/bin/env python3
"""Builds the themes page from the reading's own export, so the picture and the report cannot disagree.

Every figure it draws is copied unchanged from themes.json; it computes nothing of its own except the
geometry of the arcs and the lines-by-theme roll-up, which is a sum. Run the reading first:

    ./gradlew selfRead
    python3 docs/self-reading/build_themes_page.py

It is documentation rather than library code, and it is the only Python in the tree: a viewer for an
export is not a reason for the published artefact to grow a dependency or a report format.
"""
import json
import pathlib
import html

ROOT = pathlib.Path(__file__).resolve().parents[2]
DATA = ROOT / "code-semantics-engine/build/reports/self-reading/themes.json"
OUT = ROOT / "code-semantics-engine/build/reports/self-reading/themes.html"

EDGES_DRAWN = 44
NODES_DRAWN = 18
LEGEND_THEMES = 7

SERIES_LIGHT = ["#2a78d6", "#eb6834", "#1baf7a", "#eda100", "#e87ba4", "#008300", "#4a3aa7"]
SERIES_DARK = ["#3987e5", "#d95926", "#199e70", "#c98500", "#d55181", "#008300", "#9085e9"]

d = json.loads(DATA.read_text())
nodes = d["nodes"][:NODES_DRAWN]
edges = sorted(d["edges"], key=lambda e: -e["occurrences"])[:EDGES_DRAWN]
scopes = d["scopes"]
files = d["filesRead"]
verbs = d["verbs"][:14]
foreign = d["foreignWords"][:18]

# --- lines led by theme, over the whole tree ------------------------------------------------
lines_by_theme = {}
for f in files:
    key = f["dominant"] or ""
    lines_by_theme[key] = lines_by_theme.get(key, 0) + f["lines"]
total_lines = sum(lines_by_theme.values())
led = sorted(((t, n) for t, n in lines_by_theme.items() if t), key=lambda x: -x[1])
top = led[:LEGEND_THEMES]
rest = sum(n for _, n in led[LEGEND_THEMES:])
unresolved = lines_by_theme.get("", 0)
stack = [(t, n, SERIES_LIGHT[i], SERIES_DARK[i]) for i, (t, n) in enumerate(top)]
if rest:
    stack.append(("%d more themes" % len(led[LEGEND_THEMES:]), rest, "var(--rule-strong)", "var(--rule-strong)"))
if unresolved:
    stack.append(("no theme resolved", unresolved, "var(--abstain)", "var(--abstain)"))

# --- arc diagram geometry ---------------------------------------------------------------------
ROW = 27
TOP = 16
LABEL_X = 238
NODE_X = 252
WIDTH = 720
HEIGHT = TOP * 2 + ROW * len(nodes)
row_y = {n["topic"]: TOP + ROW * i + ROW / 2 for i, n in enumerate(nodes)}
max_intensity = max(n["intensity"] for n in nodes)
max_edge = max(e["occurrences"] for e in edges)


def radius(node):
    return 3.0 + 7.0 * (node["intensity"] / max_intensity) ** 0.5


def arc(edge):
    y1, y2 = row_y[edge["from"]], row_y[edge["to"]]
    bulge = min(300.0, 26.0 + abs(y2 - y1) * 0.62)
    return f"M {NODE_X} {y1:.1f} C {NODE_X + bulge:.0f} {y1:.1f} {NODE_X + bulge:.0f} {y2:.1f} {NODE_X} {y2:.1f}"


def esc(text):
    return html.escape(str(text), quote=True)


def num(value):
    return f"{value:,}"


arcs = "\n".join(
    '<path class="arc" d="{d}" data-from="{f}" data-to="{t}" stroke-width="{w:.2f}"><title>{title}</title></path>'.format(
        d=arc(e), f=esc(e["from"]), t=esc(e["to"]),
        w=0.7 + 3.6 * (e["occurrences"] / max_edge) ** 0.5,
        title=esc("%s and %s share %s occurrences of %s" % (
            e["from"], e["to"], num(e["occurrences"]), ", ".join(e["words"][:4]))))
    for e in edges)

rows = []
for node in nodes:
    y = row_y[node["topic"]]
    rows.append(
        '<g class="row" tabindex="0" role="button" aria-label="{label}" data-topic="{topic}">'
        '<rect class="hit" x="0" y="{ry:.1f}" width="{w}" height="{rh}"></rect>'
        '<text class="row-label" x="{lx}" y="{y:.1f}">{topic}</text>'
        '<text class="row-figure" x="{fx}" y="{y:.1f}">{lines}</text>'
        '<circle class="node" cx="{nx}" cy="{y:.1f}" r="{r:.2f}"></circle>'
        '</g>'.format(
            label=esc("%s — intensity %.4f, leads %s lines, carried by %s words"
                      % (node["topic"], node["intensity"], num(node["linesLed"]), num(node["wordsBehind"]))),
            topic=esc(node["topic"]), ry=y - ROW / 2, rh=ROW, w=WIDTH, lx=LABEL_X - 62, y=y + 4,
            fx=LABEL_X, lines=num(node["linesLed"]), nx=NODE_X, r=radius(node)))
arc_rows = "\n".join(rows)

# --- ranking table ------------------------------------------------------------------------------
max_refs = max(n["references"] for n in nodes)
table_rows = "\n".join(
    "<tr data-topic=\"{topic}\">"
    "<th scope=\"row\">{topic}</th>"
    "<td class=\"n\">{iota:.4f}</td>"
    "<td class=\"n\">{names:.0f}%</td>"
    "<td class=\"n bar-cell\"><span class=\"bar\" style=\"--w:{refw:.1f}%\"></span><span class=\"v\">{refs}</span></td>"
    "<td class=\"n\">{files}</td><td class=\"n\">{leads}</td>"
    "<td class=\"n bar-cell\"><span class=\"bar alt\" style=\"--w:{linew:.1f}%\"></span><span class=\"v\">{lines}</span></td>"
    "<td class=\"n\">{share:.1f}%</td><td class=\"n\">{words}</td>"
    "<td class=\"witness\">{witnesses}</td></tr>".format(
        topic=esc(n["topic"]), iota=n["intensity"], names=100.0 * n["nameShare"], refs=num(n["references"]),
        refw=100.0 * n["references"] / max_refs, files=num(n["files"]), leads=num(n["leads"]),
        lines=num(n["linesLed"]), linew=100.0 * n["lineShare"], share=100.0 * n["lineShare"],
        words=num(n["wordsBehind"]),
        witnesses=" ".join('<code>%s</code>&#8239;%s' % (esc(w["word"]), num(w["occurrences"]))
                           for w in n["carriedBy"][:3]))
    for n in nodes)

# --- stacked lines bar ---------------------------------------------------------------------------
segments = []
legend = []
for label, count, light, dark in stack:
    pct = 100.0 * count / total_lines
    inline = f'<span class="seg-label">{esc(label)}</span>' if pct >= 11 else ""
    segments.append(
        '<div class="seg" style="--w:{pct:.2f}%;--c:{light};--cd:{dark}" title="{title}">{inline}</div>'.format(
            pct=pct, light=light, dark=dark, inline=inline,
            title=esc("%s — %s lines, %.1f%% of the tree" % (label, num(count), pct))))
    legend.append(
        '<li><span class="swatch" style="--c:{light};--cd:{dark}"></span>{label}'
        '<span class="legend-figure">{lines} · {pct:.1f}%</span></li>'.format(
            light=light, dark=dark, label=esc(label), lines=num(count), pct=pct))
segments_html = "\n".join(segments)
legend_html = "\n".join(legend)

def link(site):
    return '<a class="site" href="{url}">{where}</a>'.format(url=esc(site["url"]), where=esc(site["where"]))


verb_rows = "\n".join(
    '<tr><th scope="row">{verb}</th><td class="n">{times}</td><td class="clauses">{clauses}</td></tr>'.format(
        verb=esc(v["verb"]), times=num(v["times"]),
        clauses=" ".join('<span class="clause">{sentence} {site}</span>'.format(
            sentence=esc(c["sentence"]), site=link(c["site"])) for c in v["clauses"][:4]))
    for v in verbs)

foreign_rows = "\n".join(
    '<tr><th scope="row"><code>{word}</code></th><td class="n">{bits:.3f}</td><td class="n">{n}</td>'
    '<td>{subjects}</td><td>{site}</td></tr>'.format(
        word=esc(f["word"]), bits=f["bits"], n=num(f["occurrences"]),
        subjects=", ".join(esc(t) for t in f["subjects"]), site=link(f["site"]))
    for f in foreign)

# --- scope cards ----------------------------------------------------------------------------------
max_share = max((c["shareOfDivergence"] for s in scopes for c in s["contributions"]), default=0.2)
max_bits = max(max(s["bits"], s["nullMedian"]) for s in scopes)


def contribution_row(c):
    width = 100.0 * c["shareOfDivergence"] / max_share
    side = "over" if c["concentratedInScope"] else "under"
    words = " ".join('<code>%s</code>' % esc(w["word"]) for w in c["carriedBy"][:3])
    return (
        '<div class="contrib {side}">'
        '<div class="contrib-track"><span class="contrib-bar" style="--w:{w:.1f}%"></span></div>'
        '<div class="contrib-name">{topic}<span class="contrib-share">{share:.1f}% of the difference</span></div>'
        '<div class="contrib-figures">{scope:.4f} <span class="vs">in scope vs</span> {ref:.4f}</div>'
        '<div class="contrib-words">{words}</div>'
        '</div>').format(side=side, w=width, topic=esc(c["topic"]),
                         share=100.0 * c["shareOfDivergence"], scope=c["scopeShare"],
                         ref=c["referenceShare"], words=words)


def scope_card(s):
    verdict = ("stands outside its own null" if s["exceedsChance"]
               else "does not stand outside its own null")
    body = ("\n".join(contribution_row(c) for c in s["contributions"]) if s["exceedsChance"]
            else '<p class="withheld">A scope of this size draws a divergence this large by chance, so it '
                 'has no topical content beyond its size and nothing is ranked.</p>')
    return (
        '<article class="scope">'
        '<header><h3>{name}</h3>'
        '<p class="scope-meta">{files} files · {lines} lines</p></header>'
        '<div class="chance">'
        '<div class="chance-row"><span class="chance-key">observed</span>'
        '<span class="chance-track"><span class="chance-bar observed" style="--w:{obs:.1f}%"></span></span>'
        '<span class="chance-val">{bits:.4f} bits</span></div>'
        '<div class="chance-row"><span class="chance-key">chance</span>'
        '<span class="chance-track"><span class="chance-bar" style="--w:{nul:.1f}%"></span></span>'
        '<span class="chance-val">{median:.4f} bits</span></div>'
        '<p class="chance-note"><span class="pill {pill}">{verdict}</span> excess {excess:+.4f} · '
        '{extreme} of {resamples} chance draws diverged at least as far</p>'
        '</div>{body}</article>').format(
        name=esc(s["name"]), files=num(s["files"]), lines=num(s["lines"]),
        obs=100.0 * s["bits"] / max_bits, nul=100.0 * s["nullMedian"] / max_bits,
        bits=s["bits"], median=s["nullMedian"], excess=s["excess"],
        extreme=num(s["atLeastAsExtreme"]), resamples=num(s["resamples"]),
        pill="good" if s["exceedsChance"] else "flat", verdict=verdict, body=body)


scope_cards = "\n".join(scope_card(s) for s in scopes)

witness_data = {n["topic"]: n for n in nodes}
edge_data = [{"from": e["from"], "to": e["to"], "occurrences": e["occurrences"], "words": e["words"][:5]}
             for e in edges]

page = f"""<title>Themes — {esc(d['repository'])}</title>
<style>
:root {{
  color-scheme: light;
  --paper:#f2f5f8; --surface:#ffffff; --surface-2:#f7f9fb;
  --ink:#111820; --ink-2:#48566a; --ink-3:#7a8798;
  --rule:#dfe6ee; --rule-strong:#b9c4d1;
  --accent:#2a78d6; --accent-soft:#2a78d61a;
  --abstain:#a76a00; --over:#2a78d6; --under:#eb6834;
  --good:#0f7a52; --good-soft:#0f7a521f;
  --serif:ui-serif,Georgia,'Iowan Old Style','Times New Roman',serif;
  --sans:ui-sans-serif,system-ui,-apple-system,'Segoe UI',Roboto,sans-serif;
  --mono:ui-monospace,SFMono-Regular,'SF Mono',Menlo,Consolas,monospace;
}}
@media (prefers-color-scheme: dark) {{
  :root:where(:not([data-theme="light"])) {{
    color-scheme: dark;
    --paper:#0e1216; --surface:#151b21; --surface-2:#1a2129;
    --ink:#e7edf4; --ink-2:#a4b1c0; --ink-3:#74818f;
    --rule:#252e38; --rule-strong:#3a4653;
    --accent:#3987e5; --accent-soft:#3987e526;
    --abstain:#c98500; --over:#3987e5; --under:#d95926;
    --good:#2fa87a; --good-soft:#2fa87a22;
  }}
}}
:root[data-theme="dark"] {{
  color-scheme: dark;
  --paper:#0e1216; --surface:#151b21; --surface-2:#1a2129;
  --ink:#e7edf4; --ink-2:#a4b1c0; --ink-3:#74818f;
  --rule:#252e38; --rule-strong:#3a4653;
  --accent:#3987e5; --accent-soft:#3987e526;
  --abstain:#c98500; --over:#3987e5; --under:#d95926;
  --good:#2fa87a; --good-soft:#2fa87a22;
}}
* {{ box-sizing:border-box; }}
body {{
  margin:0; background:var(--paper); color:var(--ink);
  font-family:var(--sans); font-size:16px; line-height:1.6;
  -webkit-font-smoothing:antialiased;
}}
.wrap {{ max-width:1080px; margin:0 auto; padding:clamp(28px,5vw,64px) clamp(18px,4vw,40px) 96px; }}
.eyebrow {{
  font-family:var(--mono); font-size:11px; letter-spacing:.16em; text-transform:uppercase;
  color:var(--ink-3); margin:0 0 10px;
}}
h1 {{
  font-family:var(--serif); font-weight:600; font-size:clamp(30px,4.4vw,46px); line-height:1.1;
  letter-spacing:-.015em; margin:0 0 14px; text-wrap:balance;
}}
h2 {{
  font-family:var(--serif); font-weight:600; font-size:clamp(22px,2.6vw,29px); line-height:1.2;
  letter-spacing:-.01em; margin:0 0 6px; text-wrap:balance;
}}
h3 {{ font-family:var(--serif); font-weight:600; font-size:19px; margin:0; letter-spacing:-.005em; }}
p {{ margin:0 0 14px; }}
.lede {{ font-size:18px; color:var(--ink-2); max-width:66ch; }}
.note {{ font-size:14.5px; color:var(--ink-2); max-width:70ch; }}
section {{ margin-top:clamp(44px,6vw,76px); }}
.section-head {{ margin-bottom:22px; }}
code {{ font-family:var(--mono); font-size:.86em; background:var(--surface-2); padding:1px 5px;
  border-radius:3px; border:1px solid var(--rule); }}
a {{ color:var(--accent); }}
:focus-visible {{ outline:2px solid var(--accent); outline-offset:2px; border-radius:3px; }}

.stats {{ display:grid; grid-template-columns:repeat(auto-fit,minmax(132px,1fr)); gap:1px;
  background:var(--rule); border:1px solid var(--rule); border-radius:8px; overflow:hidden; margin-top:30px; }}
.stat {{ background:var(--surface); padding:16px 18px; }}
.stat dt {{ font-family:var(--mono); font-size:10.5px; letter-spacing:.13em; text-transform:uppercase;
  color:var(--ink-3); margin-bottom:6px; }}
.stat dd {{ margin:0; font-family:var(--serif); font-size:26px; font-variant-numeric:tabular-nums;
  letter-spacing:-.02em; }}
.stat dd small {{ font-size:13px; font-family:var(--sans); color:var(--ink-3); letter-spacing:0; }}

.limits {{ border-left:2px solid var(--rule-strong); padding:2px 0 2px 18px; margin:26px 0 0;
  color:var(--ink-2); font-size:14.5px; max-width:72ch; }}

.panel {{ background:var(--surface); border:1px solid var(--rule); border-radius:10px; }}
.graph {{ display:grid; grid-template-columns:minmax(0,1fr) minmax(260px,320px); gap:0; }}
@media (max-width:860px) {{ .graph {{ grid-template-columns:1fr; }} }}
.graph-figure {{ padding:14px 8px 18px 14px; overflow-x:auto; }}
.graph svg {{ width:100%; height:auto; display:block; min-width:520px; }}
.arc {{ fill:none; stroke:var(--ink-3); opacity:.22; transition:opacity .15s, stroke .15s; }}
.node {{ fill:var(--accent); }}
.row-label {{ font-family:var(--sans); font-size:12.5px; fill:var(--ink); text-anchor:end; }}
.row-figure {{ font-family:var(--mono); font-size:11px; fill:var(--ink-3); text-anchor:end;
  font-variant-numeric:tabular-nums; }}
.hit {{ fill:transparent; }}
.row {{ cursor:pointer; }}
.row:hover .row-label, .row.on .row-label {{ fill:var(--accent); font-weight:600; }}
.row.on .node {{ stroke:var(--accent); stroke-width:6; stroke-opacity:.22; }}
svg.selected .arc {{ opacity:.07; }}
svg.selected .arc.lit {{ opacity:.85; stroke:var(--accent); }}
svg.selected .row:not(.on) .row-label {{ fill:var(--ink-3); }}
.evidence {{ border-left:1px solid var(--rule); padding:20px 22px; min-height:100%; }}
@media (max-width:860px) {{ .evidence {{ border-left:0; border-top:1px solid var(--rule); }} }}
.evidence h3 {{ margin-bottom:2px; }}
.evidence .kicker {{ font-family:var(--mono); font-size:10.5px; letter-spacing:.13em;
  text-transform:uppercase; color:var(--ink-3); margin:0 0 12px; }}
.witness-list {{ list-style:none; margin:14px 0 0; padding:0; display:flex; flex-direction:column; gap:10px; }}
.witness-list li {{ display:grid; grid-template-columns:1fr auto; gap:2px 10px; font-size:13.5px;
  border-top:1px solid var(--rule); padding-top:9px; }}
.witness-list .w {{ font-family:var(--mono); font-size:13px; }}
.witness-list .c {{ font-variant-numeric:tabular-nums; color:var(--ink-2); }}
.witness-list .src {{ grid-column:1/-1; font-size:11.5px; color:var(--ink-3); font-family:var(--mono);
  word-break:break-all; }}
.shared {{ margin-top:16px; font-size:13.5px; color:var(--ink-2); }}
.shared ul {{ list-style:none; margin:8px 0 0; padding:0; display:flex; flex-direction:column; gap:6px; }}
.shared li {{ display:flex; justify-content:space-between; gap:12px; border-top:1px solid var(--rule);
  padding-top:6px; }}
.shared .n {{ font-variant-numeric:tabular-nums; color:var(--ink-3); font-family:var(--mono); font-size:12px; }}

.scroller {{ overflow-x:auto; border:1px solid var(--rule); border-radius:10px; background:var(--surface); }}
table {{ border-collapse:collapse; width:100%; font-size:14px; }}
caption {{ text-align:left; padding:16px 18px 0; color:var(--ink-2); font-size:14px; }}
th, td {{ padding:9px 14px; text-align:left; border-bottom:1px solid var(--rule); white-space:nowrap; }}
thead th {{ font-family:var(--mono); font-size:10.5px; letter-spacing:.1em; text-transform:uppercase;
  color:var(--ink-3); font-weight:500; position:sticky; top:0; background:var(--surface); }}
tbody th {{ font-weight:600; }}
td.n {{ text-align:right; font-variant-numeric:tabular-nums; }}
tbody tr:hover {{ background:var(--surface-2); }}
.bar-cell {{ position:relative; min-width:104px; }}
.bar {{ position:absolute; left:14px; right:14px; bottom:4px; height:3px; border-radius:2px;
  background:var(--rule); }}
.bar::after {{ content:""; position:absolute; left:0; top:0; bottom:0; width:var(--w);
  background:var(--accent); border-radius:2px; }}
.bar.alt::after {{ background:var(--ink-3); }}
td.witness {{ color:var(--ink-2); font-size:13px; }}

.stack {{ display:flex; height:44px; border-radius:8px; overflow:hidden; border:1px solid var(--rule);
  background:var(--surface); }}
.seg {{ width:var(--w); background:var(--c); border-right:2px solid var(--paper); display:flex;
  align-items:center; padding:0 10px; min-width:2px; }}
.seg:last-child {{ border-right:0; }}
.seg-label {{ font-size:12px; color:#fff; font-weight:600; text-shadow:0 1px 2px rgba(0,0,0,.35);
  white-space:nowrap; overflow:hidden; }}
@media (prefers-color-scheme: dark) {{ :root:where(:not([data-theme="light"])) .seg {{ background:var(--cd); }} }}
:root[data-theme="dark"] .seg {{ background:var(--cd); }}
.site {{ font-family:var(--mono); font-size:11px; color:var(--ink-3); text-decoration:none;
  border-bottom:1px dotted var(--rule-strong); }}
.site:hover {{ color:var(--accent); border-bottom-color:var(--accent); }}
.clause {{ display:block; padding:2px 0; }}
td.clauses {{ white-space:normal; min-width:340px; font-size:13px; }}
.witness-list .sites {{ grid-column:1/-1; display:flex; flex-wrap:wrap; gap:8px; }}
.legend {{ list-style:none; margin:16px 0 0; padding:0; display:grid;
  grid-template-columns:repeat(auto-fit,minmax(210px,1fr)); gap:8px 22px; font-size:13.5px; }}
.legend li {{ display:flex; align-items:baseline; gap:8px; }}
.swatch {{ width:10px; height:10px; border-radius:2px; background:var(--c); flex:none; }}
@media (prefers-color-scheme: dark) {{ :root:where(:not([data-theme="light"])) .swatch {{ background:var(--cd); }} }}
:root[data-theme="dark"] .swatch {{ background:var(--cd); }}
.legend-figure {{ margin-left:auto; color:var(--ink-3); font-family:var(--mono); font-size:12px;
  font-variant-numeric:tabular-nums; }}

.scopes {{ display:grid; grid-template-columns:repeat(auto-fit,minmax(340px,1fr)); gap:18px; }}
.scope {{ background:var(--surface); border:1px solid var(--rule); border-radius:10px; padding:20px 22px 22px; }}
.scope header {{ margin-bottom:14px; }}
.scope-meta {{ font-family:var(--mono); font-size:11.5px; color:var(--ink-3); margin:4px 0 0; }}
.chance {{ margin-bottom:16px; }}
.chance-row {{ display:grid; grid-template-columns:62px 1fr 96px; align-items:center; gap:10px;
  margin-bottom:5px; }}
.chance-key {{ font-family:var(--mono); font-size:10.5px; letter-spacing:.1em; text-transform:uppercase;
  color:var(--ink-3); }}
.chance-track {{ height:8px; background:var(--surface-2); border:1px solid var(--rule); border-radius:4px;
  position:relative; }}
.chance-bar {{ position:absolute; inset:0 auto 0 0; width:var(--w); background:var(--rule-strong);
  border-radius:3px; }}
.chance-bar.observed {{ background:var(--accent); }}
.chance-val {{ font-family:var(--mono); font-size:12px; text-align:right; font-variant-numeric:tabular-nums;
  color:var(--ink-2); }}
.chance-note {{ font-size:12.5px; color:var(--ink-3); margin:10px 0 0; }}
.pill {{ display:inline-block; font-size:11px; font-weight:600; padding:2px 8px; border-radius:99px;
  margin-right:8px; }}
.pill.good {{ background:var(--good-soft); color:var(--good); }}
.pill.flat {{ background:var(--surface-2); color:var(--ink-2); border:1px solid var(--rule); }}
.contrib {{ display:grid; grid-template-columns:8px 1fr; gap:0 12px; padding:10px 0;
  border-top:1px solid var(--rule); }}
.contrib-track {{ grid-row:1/4; width:8px; background:var(--surface-2); border-radius:4px;
  position:relative; overflow:hidden; }}
.contrib-bar {{ position:absolute; left:0; right:0; bottom:0; height:var(--w); border-radius:4px;
  background:var(--over); }}
.contrib.under .contrib-bar {{ background:var(--under); }}
.contrib-name {{ font-size:14px; font-weight:600; display:flex; justify-content:space-between; gap:10px; }}
.contrib-share {{ font-weight:400; color:var(--ink-3); font-family:var(--mono); font-size:11.5px;
  font-variant-numeric:tabular-nums; }}
.contrib-figures {{ font-family:var(--mono); font-size:11.5px; color:var(--ink-2);
  font-variant-numeric:tabular-nums; }}
.contrib-figures .vs {{ color:var(--ink-3); }}
.contrib-words {{ font-size:12px; color:var(--ink-3); margin-top:3px; }}
.contrib-words code {{ background:none; border:0; padding:0; }}
.withheld {{ font-size:13.5px; color:var(--ink-2); border-top:1px solid var(--rule); padding-top:12px;
  margin:0; }}
.foot {{ margin-top:60px; border-top:1px solid var(--rule); padding-top:20px; color:var(--ink-3);
  font-size:13px; }}
@media (prefers-reduced-motion: reduce) {{ * {{ transition:none !important; }} }}
</style>

<div class="wrap">
<header>
  <p class="eyebrow">Self-reading · {esc(d['repository'])}</p>
  <h1>What this repository is about, and the words that say so</h1>
  <p class="lede">A parse of every file, read for the names this repository <em>declared</em>, the prose it
  wrote, and the dependencies it chose — then each word offered to two published resources that place a word
  in a subject. Nothing here is asserted: every theme carries the words that earned it, and a theme carried
  by one word says so on its own row.</p>
  <dl class="stats">
    <div class="stat"><dt>Files read</dt><dd>{num(d['files'])}</dd></div>
    <div class="stat"><dt>Lines</dt><dd>{num(d['lines'])}</dd></div>
    <div class="stat"><dt>Themes found</dt><dd>{num(d['topics'])}</dd></div>
    <div class="stat"><dt>Scopes compared</dt><dd>{len(scopes)}</dd></div>
    <div class="stat"><dt>Cost</dt><dd>{d['elapsedMillis'] / 1000:.1f}<small> s</small></dd></div>
  </dl>
  <p class="limits" id="linkage">Every site on this page is a link: {esc(d['linkage'])}.</p>
  <p class="limits">What a Java file mostly contains is somebody else's vocabulary quoted: <code>String</code>,
  <code>List</code> and <code>assertThat</code> are uses of declarations the platform and the test framework
  made, and a use is not a word this codebase chose. Only a parse can tell a declaration from a use, so that
  is what runs. Prose is read for its content words alone — the dictionary is an open-class one, so the words
  English uses to hold a sentence together are simply not in it — and every word is read as its dictionary
  form, so <code>words</code> and <code>word</code> are one subject. A word nothing chose is weighted by how
  much it narrows a subject, which the frequency list states and nothing here decides. Still not done: no git
  read, so nothing is pinned to a commit and no permalink is rendered, and no votes, because a vote needs an
  anchor and an anchor needs a revision.</p>
</header>

<section>
  <div class="section-head">
    <h2>The theme graph</h2>
    <p class="note">Each theme sits on its own row, sized by intensity and figured by the lines it leads.
    An arc joins two themes when <em>the same word was read as both</em> — which is what a shared arc means
    and all it means. Select a theme to see the words behind it, ordered by the mass each actually carried
    rather than by how often it was written.</p>
  </div>
  <div class="panel graph">
    <div class="graph-figure">
      <svg id="arcs" viewBox="0 0 {WIDTH} {HEIGHT}" role="img"
           aria-label="Themes joined by the words read as both">
        <g class="arcs">{arcs}</g>
        <g class="rows">{arc_rows}</g>
      </svg>
    </div>
    <aside class="evidence" id="evidence" aria-live="polite"></aside>
  </div>
</section>

<section>
  <div class="section-head">
    <h2>Which themes dominate</h2>
    <p class="note">Three different questions, three different answers, and their disagreement is the
    reading. <strong>ι</strong> is the theme's share of the tree's topical mass. <strong>References</strong>
    counts word occurrences. <strong>Lines led</strong> counts only the files where the theme beats every
    other, which is the measure closest to "how much of this codebase is that".</p>
  </div>
  <div class="scroller">
    <table>
      <caption>The eighteen strongest themes, by intensity. Words behind is the count of distinct
      surfaces; the last column names the three most written of them.</caption>
      <thead><tr>
        <th scope="col">Theme</th><th scope="col">ι</th><th scope="col">From names</th>
        <th scope="col">References</th>
        <th scope="col">Files</th><th scope="col">Leads</th><th scope="col">Lines led</th>
        <th scope="col">Share</th><th scope="col">Words</th><th scope="col">Carried by</th>
      </tr></thead>
      <tbody>{table_rows}</tbody>
    </table>
  </div>
</section>

<section>
  <div class="section-head">
    <h2>What this repository does</h2>
    <p class="note">A method name is a clause and a test name is a sentence, so the suite is a specification
    wherever that convention holds. The leading word is a verb where the dictionary carries a verb entry for
    it; where it does not, the name yields no behaviour rather than a guessed one. Every clause links to the
    line it was read from.</p>
  </div>
  <div class="scroller">
    <table>
      <caption>The verbs this repository performs most, with what each acts on.</caption>
      <thead><tr><th scope="col">Verb</th><th scope="col">Times</th>
        <th scope="col">What it acts on</th></tr></thead>
      <tbody>{verb_rows}</tbody>
    </table>
  </div>
</section>

<section>
  <div class="section-head">
    <h2>Words carried in from somewhere else</h2>
    <p class="note">Each of these is written at least three times, and the dictionary places it in a subject
    this repository is not about — measured as the divergence of the word's own reading from the
    repository's, in bits. That is what a metaphor looks like from the outside. It is also what an ordinary
    technical term looks like when the resources are too coarse for it, which is why these are
    <strong>candidates</strong> and the evidence is printed beside them.</p>
  </div>
  <div class="scroller">
    <table>
      <thead><tr><th scope="col">Word</th><th scope="col">Distance</th><th scope="col">Written</th>
        <th scope="col">The dictionary places it in</th><th scope="col">First seen</th></tr></thead>
      <tbody>{foreign_rows}</tbody>
    </table>
  </div>
</section>

<section>
  <div class="section-head">
    <h2>Lines of code, by the theme that leads them</h2>
    <p class="note">Every file resolves to at most one leading theme, weighed against everything in it that
    no resource could read. The bar is all {num(total_lines)} lines of the tree.</p>
  </div>
  <div class="stack">{segments_html}</div>
  <ul class="legend">{legend_html}</ul>
</section>

<section>
  <div class="section-head">
    <h2>What distinguishes each scope</h2>
    <p class="note">A ranking over one scope is a weak reading — the commonest words in Java source are also
    the most ambiguous, and they are everywhere. A comparison is the strong one: a theme written at the same
    density everywhere contributes nothing to it. Each scope is measured against the whole repository, and
    then against the field of divergences a scope of <em>its own size</em> draws by chance.</p>
  </div>
  <div class="scopes">{scope_cards}</div>
</section>

<section>
  <div class="section-head">
    <h2>Read the strange results, not around them</h2>
  </div>
  <p class="note"><strong>Law is <code>cite</code>, <code>evidence</code>, <code>claim</code> and
  <code>licence</code>.</strong> Every one of those is a word this library really is about, and every one of
  them the dictionary also places somewhere else — which is why each now votes its commitment weighted by
  that same commitment, and why law leads 39 files rather than the 48 it led before that rule. It is still
  first, and whether a library about citation and evidence <em>is</em> about law in any useful sense is a
  question the dictionary cannot settle and this reading does not pretend to.</p>
  <p class="note"><strong>Mythology was <code>jupiter</code>.</strong> It is a real theme of one source set,
  and its witness is the JUnit Jupiter dependency that set imports — the dictionary knows Jupiter as a Roman
  god, and it is not wrong. <strong><code>sciences</code>, <code>natural-sciences</code>,
  <code>physical-sciences</code>, <code>engineering</code> and <code>computing</code> fire together</strong>
  on the same words and lead almost no files between them: they are Wiktionary's hierarchy, so one theme is
  being counted five times. Neither of those is a defect in the evidence. They are what reading a word with
  nothing around it, against two vocabularies that do not know about each other, actually produces.</p>
  <p class="note">Two fixes are named in the backlog, and neither is a word list. <strong>Sense
  disambiguation</strong> — the sibling words in one identifier, the enclosing declaration, the file's own
  pooled domain — is what would let <code>jupiter</code> be read as the thing the file imports rather than as
  a planet. And <strong>Wiktionary publishes its topic hierarchy</strong>: extracting it would let a label
  pool with its parent by citation instead of splitting one theme five ways.</p>
</section>

<p class="foot">Generated by <code>./gradlew selfRead</code> from this repository's own sources; every figure
here is copied unchanged from the reading's export, so this page and the report behind it cannot disagree.
The permutation null is seeded, so two runs of one tree agree.</p>
</div>

<script id="themes" type="application/json">{json.dumps({"nodes": witness_data, "edges": edge_data})}</script>
<script>
(function () {{
  const data = JSON.parse(document.getElementById('themes').textContent);
  const svg = document.getElementById('arcs');
  const panel = document.getElementById('evidence');
  const rows = Array.from(svg.querySelectorAll('.row'));
  const arcs = Array.from(svg.querySelectorAll('.arc'));
  const fmt = (n) => n.toLocaleString('en-US');

  function shared(topic) {{
    return data.edges
      .filter((e) => e.from === topic || e.to === topic)
      .map((e) => ({{ other: e.from === topic ? e.to : e.from, occurrences: e.occurrences, words: e.words }}))
      .sort((a, b) => b.occurrences - a.occurrences)
      .slice(0, 6);
  }}

  function show(topic, dim) {{
    const node = data.nodes[topic];
    if (!node) {{ return; }}
    const witnesses = node.carriedBy.map((w) =>
      `<li><span class="w">${{w.word}}</span><span class="c">${{fmt(w.occurrences)}} · ` +
      `${{w.mass.toFixed(1)}} mass</span>` +
      `<span class="src">${{w.sources.join(' · ')}}</span>` +
      `<span class="sites">${{w.sites.map((s) =>
        `<a href="${{s.url}}">${{s.where}}</a>`).join(' ')}}</span></li>`).join('');
    const links = shared(topic).map((s) =>
      `<li><span>${{s.other}} <span class="n">${{s.words.slice(0, 3).join(', ')}}</span></span>` +
      `<span class="n">${{fmt(s.occurrences)}}</span></li>`).join('');
    panel.innerHTML =
      `<p class="kicker">Why this theme was read</p><h3>${{topic}}</h3>` +
      `<p class="note" style="font-size:13.5px;margin:8px 0 0">${{fmt(node.wordsBehind)}} distinct words ` +
      `carried it across ${{fmt(node.files)}} files; it leads ${{fmt(node.leads)}} of them, ` +
      `${{fmt(node.linesLed)}} lines.</p>` +
      `<ul class="witness-list">${{witnesses}}</ul>` +
      `<div class="shared"><p class="kicker" style="margin:0">Words shared with</p><ul>${{links}}</ul></div>`;
    rows.forEach((row) => row.classList.toggle('on', row.dataset.topic === topic));
    arcs.forEach((arc) => arc.classList.toggle('lit',
      arc.dataset.from === topic || arc.dataset.to === topic));
    svg.classList.toggle('selected', dim !== false);
  }}

  rows.forEach((row) => {{
    row.addEventListener('click', () => show(row.dataset.topic, true));
    row.addEventListener('keydown', (event) => {{
      if (event.key === 'Enter' || event.key === ' ') {{ event.preventDefault(); show(row.dataset.topic, true); }}
    }});
  }});
  show(rows[0].dataset.topic, false);
}}());
</script>
"""

OUT.write_text(page)
print(f"wrote {OUT} — {len(page):,} bytes; {len(nodes)} nodes, {len(edges)} edges, {total_lines:,} lines")
