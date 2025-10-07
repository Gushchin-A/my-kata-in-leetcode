#!/usr/bin/env python3
import json, re, os, pathlib
from pathlib import Path

REPO = Path(__file__).resolve().parents[1]
STATS = REPO / "stats.json"
README = REPO / "README.md"

# --- helpers ---
def is_problem_dir(name: str) -> bool:
    return re.match(r"^\d{4}-", name) is not None

def split_number_and_slug(dirname: str):
    num = int(dirname.split("-", 1)[0])
    slug = dirname.split("-", 1)[1]
    return num, slug

def human_title(slug: str) -> str:
    # simple Title Case; keeps acronyms like "II" if present
    words = slug.split("-")
    return " ".join(w.upper() if w in {"ii","iii","iv"} else w.capitalize() for w in words)

def lc_url(slug: str) -> str:
    return f"https://leetcode.com/problems/{slug}"

def difficulty_str(s: str) -> str:
    x = (s or "").strip().lower()
    return {"easy":"Easy","medium":"Medium","hard":"Hard"}.get(x, "Easy")

# --- load stats.json (if exists) ---
stats = {}
if STATS.exists():
    with open(STATS, "r", encoding="utf-8") as f:
        raw = json.load(f)
    stats = raw.get("leetcode", {}).get("shas", {})
else:
    stats = {}

# collect problems from directories
problems = []
for entry in sorted([p.name for p in REPO.iterdir() if p.is_dir() and is_problem_dir(p.name)]):
    num, slug = split_number_and_slug(entry)
    # difficulty: prefer stats.json, else fallback to Easy
    st = stats.get(entry, {})
    diff = difficulty_str(st.get("difficulty", "Easy"))
    title = human_title(slug)
    problems.append({
        "num": num,
        "slug": slug,
        "dirname": entry,
        "title": title,
        "difficulty": diff,
        "lc_url": lc_url(slug),
        "solution_link": f"[Java]({entry})",
    })

# sort by problem number
problems.sort(key=lambda x: x["num"])

# counts
counts = {"Easy":0, "Medium":0, "Hard":0}
for p in problems:
    counts[p["difficulty"]] = counts.get(p["difficulty"], 0) + 1
total = len(problems)

# build markdown table rows
rows = []
rows.append("| #   | Title | Solution | Difficulty | Tags |")
rows.append("|-----|-------|----------|------------|------|")
for p in problems:
    rows.append(f"| {p['num']} | [{p['title']}]({p['lc_url']}) | {p['solution_link']} | {p['difficulty']} |  |")

# assemble README by your template
readme = f"""### I'm solving exercises on leetcode. Nothing unusual.
---

#### 📊 Progress

- Easy: {counts['Easy']} ✅  
- Medium: {counts['Medium']} ⚡  
- Hard: {counts['Hard']} 🔥  
- **Total: {total}**

---

#### 📘 Solutions

{os.linesep.join(rows)}
"""

# write only if changed
old = README.read_text(encoding="utf-8") if README.exists() else ""
if old.strip() != readme.strip():
    README.write_text(readme, encoding="utf-8")
    print("README.md updated")
else:
    print("README.md up-to-date")
