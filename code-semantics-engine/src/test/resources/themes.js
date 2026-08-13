(function () {
  const data = JSON.parse(document.getElementById('themes').textContent);
  const svg = document.getElementById('space');
  const panel = document.getElementById('evidence');
  const topics = Object.keys(data.nodes);
  const fmt = (n) => n.toLocaleString('en-US');
  const NS = 'http://www.w3.org/2000/svg';
  const WIDTH = 720;
  const HEIGHT = 480;
  const SPAN = 150;
  const DEPTH = 900;
  const still = window.matchMedia('(prefers-reduced-motion: reduce)').matches;

  // Each axis is normalised by its own largest value, so the box a theme sits in is derived from the
  // reading and never chosen. A theme at the far corner is the strongest on all three counts.
  const most = (read) => Math.max(...topics.map((t) => read(data.nodes[t])), Number.MIN_VALUE);
  const scale = {
    x: most((n) => n.intensity),
    y: most((n) => n.lineShare),
    z: most((n) => n.nameShare),
  };
  const widest = Math.max(...data.edges.map((e) => e.occurrences), 1);
  const mostWords = most((n) => n.wordsBehind);

  const placed = topics.map((topic) => {
    const node = data.nodes[topic];
    return {
      topic,
      x: (node.intensity / scale.x) * 2 - 1,
      y: 1 - (node.lineShare / scale.y) * 2,
      z: (node.nameShare / scale.z) * 2 - 1,
      r: 4 + 7 * Math.sqrt(node.wordsBehind / mostWords),
    };
  });
  const at = Object.fromEntries(placed.map((p) => [p.topic, p]));

  // Drawn from the same corner, so each axis reads as "further along this is more of this".
  const CORNER = { x: -1, y: 1, z: -1 };
  const AXES = [
    { end: { x: 1, y: 1, z: -1 }, name: 'ι' },
    { end: { x: -1, y: -1, z: -1 }, name: 'leads' },
    { end: { x: -1, y: 1, z: 1 }, name: 'names' },
  ];

  let turn = 0.6;
  let tilt = -0.35;
  let selected = topics[0];
  let dragging = null;

  // Turn about the vertical axis, then tilt about the horizontal one, then divide by depth. Three lines
  // of arithmetic and no library: the coordinates are given, and all this does is look at them.
  function project(p) {
    const cos = Math.cos(turn), sin = Math.sin(turn);
    const cosT = Math.cos(tilt), sinT = Math.sin(tilt);
    const turned = { x: p.x * cos + p.z * sin, z: p.z * cos - p.x * sin };
    const y = p.y * cosT - turned.z * sinT;
    const depth = p.y * sinT + turned.z * cosT;
    const near = DEPTH / (DEPTH + depth * SPAN);
    return { x: WIDTH / 2 + turned.x * SPAN * near, y: HEIGHT / 2 + y * SPAN * near, near, depth };
  }

  function element(name, attributes, text) {
    const node = document.createElementNS(NS, name);
    Object.entries(attributes).forEach(([key, value]) => node.setAttribute(key, value));
    if (text !== undefined) { node.textContent = text; }
    return node;
  }

  function draw() {
    svg.setAttribute('viewBox', `0 0 ${WIDTH} ${HEIGHT}`);
    while (svg.firstChild) { svg.removeChild(svg.firstChild); }
    const origin = project(CORNER);
    AXES.forEach((axis) => {
      const end = project(axis.end);
      svg.appendChild(element('line', {
        class: 'axis', x1: origin.x, y1: origin.y, x2: end.x, y2: end.y,
      }));
      svg.appendChild(element('text', { class: 'axis-label', x: end.x, y: end.y - 6 }, axis.name));
    });
    data.edges
      .filter((edge) => at[edge.from] && at[edge.to])
      .map((edge) => ({ edge, a: project(at[edge.from]), b: project(at[edge.to]) }))
      .sort((one, other) => (one.a.near + one.b.near) - (other.a.near + other.b.near))
      .forEach((drawn) => {
        const lit = drawn.edge.from === selected || drawn.edge.to === selected;
        const line = element('line', {
          class: lit ? 'edge lit' : 'edge',
          x1: drawn.a.x, y1: drawn.a.y, x2: drawn.b.x, y2: drawn.b.y,
          'stroke-width': (0.6 + 3.2 * Math.sqrt(drawn.edge.occurrences / widest)).toFixed(2),
        });
        line.appendChild(element('title', {},
          `${drawn.edge.from} and ${drawn.edge.to} share ${fmt(drawn.edge.occurrences)} occurrences of `
          + drawn.edge.words.slice(0, 4).join(', ')));
        svg.appendChild(line);
      });
    placed
      .map((p) => ({ p, seen: project(p) }))
      .sort((one, other) => one.seen.near - other.seen.near)
      .forEach(({ p, seen }) => {
        const group = element('g', {
          class: p.topic === selected ? 'theme on' : 'theme',
          tabindex: '0', role: 'button', 'data-topic': p.topic,
          'aria-label': `${p.topic}, intensity ${data.nodes[p.topic].intensity.toFixed(4)}`,
        });
        group.appendChild(element('circle', {
          class: 'node', cx: seen.x, cy: seen.y, r: (p.r * seen.near).toFixed(2),
          opacity: (0.45 + 0.55 * seen.near).toFixed(2),
        }));
        group.appendChild(element('text', {
          class: 'theme-label', x: seen.x + p.r * seen.near + 5, y: seen.y + 4,
          opacity: (0.35 + 0.65 * seen.near).toFixed(2),
        }, p.topic));
        group.addEventListener('click', () => show(p.topic));
        group.addEventListener('keydown', (event) => {
          if (event.key === 'Enter' || event.key === ' ') { event.preventDefault(); show(p.topic); }
        });
        svg.appendChild(group);
      });
  }

  // A site is a link only where the reading rendered one this page can open; otherwise it is named.
  function site(s) {
    return s.url
      ? `<a class="site" href="${s.url}">${s.where}</a>`
      : `<span class="site dead">${s.where}</span>`;
  }

  // The phrase is what was read, so it is what is quoted — with the witnessing word marked inside it.
  function quoted(phrase, word) {
    return phrase.split(' ')
      .map((w) => (w === word ? `<b>${w}</b>` : w))
      .join(' ');
  }

  function shared(topic) {
    return data.edges
      .filter((e) => e.from === topic || e.to === topic)
      .map((e) => ({ other: e.from === topic ? e.to : e.from, occurrences: e.occurrences, words: e.words }))
      .sort((a, b) => b.occurrences - a.occurrences)
      .slice(0, 6);
  }

  function show(topic) {
    const node = data.nodes[topic];
    if (!node) { return; }
    selected = topic;
    const witnesses = node.carriedBy.map((w) =>
      `<li><span class="w">${w.word}</span><span class="c">${fmt(w.occurrences)} · ` +
      `${w.mass.toFixed(1)} mass</span>` +
      `<span class="src">${w.sources.join(' · ')}</span>` +
      `<ul class="quotes">${w.quotations.map((q) =>
        `<li><span class="phrase">${quoted(q.phrase, w.word)}</span>${site(q.site)}</li>`)
        .join('')}</ul></li>`).join('');
    const links = shared(topic).map((s) =>
      `<li><span>${s.other} <span class="n">${s.words.slice(0, 3).join(', ')}</span></span>` +
      `<span class="n">${fmt(s.occurrences)}</span></li>`).join('');
    panel.innerHTML =
      `<p class="kicker">Why this theme was read</p><h3>${topic}</h3>` +
      `<p class="note" style="font-size:13.5px;margin:8px 0 0">${fmt(node.wordsBehind)} distinct words ` +
      `carried it across ${fmt(node.files)} files; it leads ${fmt(node.leads)} of them, ` +
      `${fmt(node.linesLed)} lines.</p>` +
      `<ul class="witness-list">${witnesses}</ul>` +
      `<div class="shared"><p class="kicker" style="margin:0">Words shared with</p><ul>${links}</ul></div>`;
    draw();
  }

  svg.addEventListener('pointerdown', (event) => {
    dragging = { x: event.clientX, y: event.clientY };
    svg.setPointerCapture(event.pointerId);
  });
  svg.addEventListener('pointermove', (event) => {
    if (!dragging) { return; }
    turn += (event.clientX - dragging.x) / 160;
    tilt = Math.max(-1.2, Math.min(1.2, tilt + (event.clientY - dragging.y) / 260));
    dragging = { x: event.clientX, y: event.clientY };
    draw();
  });
  ['pointerup', 'pointercancel', 'pointerleave'].forEach((ending) =>
    svg.addEventListener(ending, () => { dragging = null; }));

  show(selected);
  if (!still) {
    const settle = setInterval(() => {
      if (dragging) { clearInterval(settle); return; }
      turn += 0.004;
      draw();
    }, 40);
    svg.addEventListener('pointerdown', () => clearInterval(settle), { once: true });
  }
}());
