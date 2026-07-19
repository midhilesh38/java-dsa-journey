# Java + DSA Journey 🚀

I'm restarting my Java and Data Structures & Algorithms prep from the ground up, following a structured 14-week roadmap. I'd learned some Java and DSA before but couldn't stay consistent — this repo is me documenting daily progress to stay accountable and track what I actually understand vs. what I just recognize.

**Rule I'm following: no zero days.** At minimum, 1 problem or 20 minutes of focused work, every day.

---

## Progress Tracker

| Week | Topic | Status |
|---|---|---|
| 1 | Java Basics — Syntax, Variables, Loops | ✅ Done |
| 2 | Arrays & Strings (Java fundamentals) | 🔲 Not Started |
| 3 | Collections (ArrayList, HashMap, HashSet, Stack, Queue, PriorityQueue) | 🔲 Not Started |
| 4–5 | Arrays & Strings (DSA patterns — two pointers, sliding window, prefix sum) | 🔲 Not Started |
| 6–7 | Recursion & Backtracking | 🔲 Not Started |
| 8 | Linked Lists, Stacks & Queues | 🔲 Not Started |
| 9–10 | Trees & Graphs | 🔲 Not Started |
| 11 | Sorting & Searching | 🔲 Not Started |
| 12–13 | Dynamic Programming | 🔲 Not Started |
| 14 | Heaps, HashMaps & Sets (advanced patterns) | 🔲 Not Started |

*(Update the emoji as you go: 🔲 Not Started → 🟡 In Progress → ✅ Done)*

---

## How this repo is organized

```
week01-day01-basics/
├── Temperature.java
├── SimpleCalculator.java
└── NOTES.md
```

- One folder per day (Weeks 1–3), then one folder per topic once DSA problems start (Week 4 onward).
- Every folder has a short `NOTES.md` — what I built, and one thing that confused me + how I resolved it.

---

## Log

### Week 1
- **Day 1** — Variables, print statements, basic math. Built a temperature converter and a simple calculator (+, -, *, /, %). Learned that `int / int` truncates decimals, and `double / 0` gives `Infinity` instead of crashing.
- **Day 2** — Loops + if/else combined with `%`. Built FizzBuzz, an even/odd checker, and a largest-of-three-numbers program using the running max pattern. Learned that condition order matters in `else if` chains (checking "divisible by both" before individual checks).
- **Day 3** — Nested loops, `break`, and boolean flags. Built a primes-under-100 checker, a multiplication table, and a sum-of-digits program using the digit-peeling pattern (`% 10` then `/ 10`). Learned to trace nested loops carefully — the inner loop fully completes before the outer loop advances — and that accumulator variables (like `sum`) carry their value across iterations instead of resetting.
- **Day 4** (17/07/2026) — Methods/functions. Built `factorial`, `reverseNumber`, and `isPalindrome` (reusing `reverseNumber` instead of duplicating logic — the DRY principle). Learned why accumulators need the right "identity value" (`1` for products, `0` for sums), and how `return` exits a method immediately.
- **Day 5** (18/07/2026) — Review day: rewrote all Day 1-4 programs from memory, no notes. 8 of 11 came out fully correct. Found 3 real gaps to fix and redo:
  - Temperature converter: used `nextInt()` instead of `nextDouble()` for decimal input
  - Primes: loop started at `i=1` instead of `i=2`, incorrectly flagging `1` as prime
  - Methods practice: forgot the `static` keyword on helper methods, and forgot `return fact;` in `factorial`
  
  All 3 gaps fixed and self-verified same day — Week 1 closed ✅.

---

## Why I'm doing this publicly

Mostly for accountability — a public commit history is harder to quietly abandon than a private todo list. Also doubles as a portfolio signal for later job applications.
