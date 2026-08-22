"""Draws a seeded uniform sample of repositories from a stated GitHub frame, resolving ranks exactly.

  python3 draw.py --frame 'language:Java fork:false mirror:false size:>=1000' \
                  --until 2026-08-20T23:59:59Z --seed 20260821 --draws 10 --out drawn.json

WHY IT IS SHAPED THIS WAY. GitHub reports total_count exactly, and additively, for a result set up to about
a million: a day, a month, a year and a four-year span each equalled the sum of their halves exactly, the
largest at 1,081,460. Above that it estimates, and the estimate is not monotonic in a date bound -- the same
frame counted 3,833,338 repositories created before 2026-01-08 and 3,804,662 before 2026-01-22, a fortnight
later. A rank cannot be resolved against numbers that move, so every query here is a bounded range holding
fewer than a million repositories:

  1. Yearly windows, counted exactly, give an exact cumulative index. Their sum is the frame size.
  2. A seeded rank picks its year, then halves within it -- every sub-window smaller than a year, so every
     count still exact -- until the window holds under a thousand, which is GitHub's page cap.
  3. The rank's offset indexes that page directly, ordered by creation time ascending.

Unauthenticated, the search API allows ten queries a minute and enforces a secondary limit below that, so a
draw costs roughly ten queries and a few minutes per row.
"""
import argparse, json, random, subprocess, sys, time, urllib.parse

PAGE_CAP = 1000
PACE = 9.0
FIRST_YEAR = 2007


def api(params):
    url = 'https://api.github.com/search/repositories?' + urllib.parse.urlencode(params)
    for _ in range(12):
        out = subprocess.run(['curl', '-s', '-H', 'Accept: application/vnd.github+json', url],
                             capture_output=True, text=True).stdout
        try:
            body = json.loads(out)
        except json.JSONDecodeError:
            time.sleep(30)
            continue
        if 'total_count' not in body:
            time.sleep(60)
            continue
        time.sleep(PACE)
        return body
    raise SystemExit('gave up: ' + url)


def secs(t):
    return int(time.mktime(time.strptime(t, '%Y-%m-%dT%H:%M:%SZ')))


def stamp(s):
    return time.strftime('%Y-%m-%dT%H:%M:%SZ', time.localtime(s))


class Frame:
    """A stated GitHub query, with an exact cumulative index over yearly windows."""

    def __init__(self, query, until, audit):
        self.query = query
        self.until = until
        self.audit = audit
        self.counts = {}
        self.windows = []

    def count(self, lo, hi):
        """The exact size of the closed range [lo, hi]. Every caller keeps it under a million."""
        if (lo, hi) not in self.counts:
            self.counts[(lo, hi)] = api(
                {'q': f'{self.query} created:{lo}..{hi}', 'per_page': 1})['total_count']
            self.audit.append({'range': [lo, hi], 'count': self.counts[(lo, hi)]})
        return self.counts[(lo, hi)]

    def index(self):
        """One window per year, counted exactly. Refuses a window GitHub would estimate."""
        for year in range(FIRST_YEAR, int(self.until[:4]) + 1):
            lo = f'{year}-01-01T00:00:00Z'
            hi = self.until if year == int(self.until[:4]) else f'{year}-12-31T23:59:59Z'
            total = self.count(lo, hi)
            if total >= 1_000_000:
                raise SystemExit(f'{year} holds {total}, which GitHub estimates rather than counts. '
                                 'Partition it more finely before trusting the index.')
            self.windows.append({'year': year, 'lo': lo, 'hi': hi, 'count': total})
            print(f'{year}  {total:>8}', flush=True)
        return sum(w['count'] for w in self.windows)

    def at(self, rank):
        """The repository at the given rank of the frame, ordered by creation time ascending."""
        seen = 0
        for window in self.windows:
            if rank < seen + window['count']:
                return self._within(window['lo'], window['hi'], window['count'], rank - seen)
            seen += window['count']
        raise SystemExit(f'rank {rank} falls outside the index')

    def _within(self, lo, hi, whole, offset):
        while whole > PAGE_CAP and secs(hi) - secs(lo) > 1:
            mid = stamp((secs(lo) + secs(hi)) // 2)
            left = self.count(lo, stamp(secs(mid) - 1))
            if offset < left:
                hi, whole = stamp(secs(mid) - 1), left
            else:
                offset, lo, whole = offset - left, mid, whole - left
        page = api({'q': f'{self.query} created:{lo}..{hi}', 'sort': 'created', 'order': 'asc',
                    'per_page': 100, 'page': offset // 100 + 1})
        items = page.get('items', [])
        return items[offset % 100] if offset % 100 < len(items) else None


def fetched(url):
    """A file from raw.githubusercontent.com, or nothing. Costs no API rate limit, which is why the
    publication predicate is read here rather than through the contents endpoint."""
    done = subprocess.run(['curl', '-s', '-w', '%{http_code}', url], capture_output=True, text=True).stdout
    return done[:-3] if done.endswith('200') else ''


def core(path):
    """The REST API, which allows sixty calls an hour unauthenticated. Used only for accepted candidates."""
    for _ in range(20):
        out = subprocess.run(['curl', '-s', '-H', 'Accept: application/vnd.github+json',
                              'https://api.github.com' + path], capture_output=True, text=True).stdout
        try:
            body = json.loads(out)
        except json.JSONDecodeError:
            time.sleep(30)
            continue
        if isinstance(body, dict) and 'rate limit' in body.get('message', '').lower():
            time.sleep(70)
            continue
        time.sleep(2)
        return body
    raise SystemExit('gave up on ' + path)


def publishes(full_name, ref):
    """Whether the tree states a publication: a Maven groupId, or the Gradle plugin that publishes one.

    A groupId is the coordinate an artefact publishes under and maven-publish is what publishes it, so
    between them they are what a repository does to make its code available as a library."""
    raw = f'https://raw.githubusercontent.com/{full_name}/{ref}/'
    if '<groupId' in fetched(raw + 'pom.xml'):
        return 'pom.xml states a groupId'
    for build in ('build.gradle', 'build.gradle.kts'):
        if 'maven-publish' in fetched(raw + build):
            return f'{build} applies maven-publish'
    return ''


def main():
    parsed = argparse.ArgumentParser()
    parsed.add_argument('--frame', required=True)
    parsed.add_argument('--until', required=True)
    parsed.add_argument('--seed', type=int, required=True)
    parsed.add_argument('--draws', type=int, required=True)
    parsed.add_argument('--exclude', default='')
    parsed.add_argument('--require-publication', action='store_true')
    parsed.add_argument('--out', required=True)
    given = parsed.parse_args()

    excluded = {name.strip().lower() for name in given.exclude.split(',') if name.strip()}
    audit = []
    frame = Frame(given.frame, given.until, audit)
    total = frame.index()
    print(f'frame = {total} (exact), seed = {given.seed}', flush=True)

    rng = random.Random(given.seed)
    drawn, rejected = [], []
    while len(drawn) < given.draws:
        rank = rng.randrange(total)
        item = frame.at(rank)
        if item is None:
            rejected.append({'rank': rank, 'why': 'no repository at that offset'})
            continue
        full = item['full_name']
        if full.lower() in excluded:
            rejected.append({'rank': rank, 'repository': full, 'why': 'excluded by name'})
            continue
        if any(d['full_name'] == full for d in drawn):
            rejected.append({'rank': rank, 'repository': full, 'why': 'already drawn'})
            continue
        if given.require_publication:
            why = publishes(full, item['default_branch'])
            if not why:
                rejected.append({'rank': rank, 'repository': full, 'why': 'states no publication'})
                print(f'  rejected {full}: states no publication', flush=True)
                continue
            head = core(f"/repos/{full}/commits/{item['default_branch']}")
            sha = head['sha']
            atPin = publishes(full, sha)
            if not atPin:
                rejected.append({'rank': rank, 'repository': full,
                                 'why': 'states a publication on the branch but not at the pinned commit'})
                continue
            licence = core(f'/repos/{full}/license?ref={sha}')
            spdx = (licence.get('license') or {}).get('spdx_id') if isinstance(licence, dict) else None
            item['_pin'] = {'sha': sha, 'licenceAtPin': spdx or 'none', 'publishes': atPin}
        item['_draw'] = {'rank': rank}
        drawn.append(item)
        print(f"DRAWN {len(drawn)}/{given.draws}  rank {rank}  {full}"
              f"  {item.get('_pin', {}).get('publishes', '')}", flush=True)
        record(given, total, drawn, rejected, audit)
    record(given, total, drawn, rejected, audit)


def record(given, total, drawn, rejected, audit):
    json.dump({'frame': given.frame, 'until': given.until, 'seed': given.seed, 'total': total,
               'drawn': drawn, 'rejected': rejected, 'audit': audit},
              open(given.out, 'w'), indent=2)


main()
