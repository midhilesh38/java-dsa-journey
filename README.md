# Java + DSA Journey 🚀

I'm restarting my Java and Data Structures & Algorithms prep from the ground up, following a structured 14-week roadmap. I'd learned some Java and DSA before but couldn't stay consistent — this repo is me documenting daily progress to stay accountable and track what I actually understand vs. what I just recognize.

**Rule I'm following: no zero days.** At minimum, 1 problem or 20 minutes of focused work, every day.

---

## Progress Tracker

| Week | Topic | Status |
|---|---|---|
| 1 | Java Basics — Syntax, Variables, Loops | ✅ Done |
| 2 | Arrays & Strings (Java fundamentals) | ✅ Done |
| 3 | Collections (ArrayList, HashMap, HashSet, Stack, Queue, PriorityQueue) | ✅ Done |
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
src/
└── WeekN/
    └── DayN/
        └── Program.java
```

- One folder per week, with a subfolder per day.
- Daily progress and lessons learned are tracked in the **Log** section below, plus a running `Cheat Sheet.md` at the repo root for quick method/syntax reference.

---

## Log

### Week 1 — Java Basics
- **Day 1** — Variables, print statements, basic math. Built a temperature converter and a simple calculator (+, -, *, /, %). Learned that `int / int` truncates decimals, and `double / 0` gives `Infinity` instead of crashing.
- **Day 2** — Loops + if/else combined with `%`. Built FizzBuzz, an even/odd checker, and a largest-of-three-numbers program using the running max pattern. Learned that condition order matters in `else if` chains (checking "divisible by both" before individual checks).
- **Day 3** — Nested loops, `break`, and boolean flags. Built a primes-under-100 checker, a multiplication table, and a sum-of-digits program using the digit-peeling pattern (`% 10` then `/ 10`). Learned to trace nested loops carefully — the inner loop fully completes before the outer loop advances — and that accumulator variables (like `sum`) carry their value across iterations instead of resetting.
- **Day 4** (17/07/2026) — Methods/functions. Built `factorial`, `reverseNumber`, and `isPalindrome` (reusing `reverseNumber` instead of duplicating logic — the DRY principle). Learned why accumulators need the right "identity value" (`1` for products, `0` for sums), and how `return` exits a method immediately.
- **Day 5** (18/07/2026) — Review day: rewrote all Day 1-4 programs from memory, no notes. 8 of 11 came out fully correct. Found 3 real gaps to fix and redo:
  - Temperature converter: used `nextInt()` instead of `nextDouble()` for decimal input
  - Primes: loop started at `i=1` instead of `i=2`, incorrectly flagging `1` as prime
  - Methods practice: forgot the `static` keyword on helper methods, and forgot `return fact;` in `factorial`

  All 3 gaps fixed and self-verified same day — **Week 1 closed ✅**

### Week 2 — Arrays & Strings
- **Day 6** — 1D arrays. Built sum, max, and min (in one pass) using the running-max/min pattern extended from Day 2. Learned that arrays index from `0`, the last valid index is `length - 1`, and that a for-each loop only reads values — it can't modify the original array (proved this with a live test: doubled values inside a for-each loop, printed the array after, and confirmed it was unchanged).
- **Day 7** — Array manipulation. Built `reverseInPlace` (two-pointer swap) and `removeDuplicates` from a sorted array (write-pointer pattern). Hit a real bug from calling a mutating method twice — once to size a result array, once again in a loop condition — which silently corrupted the result. Fixed by storing the method's result in a variable and reusing it. Core lesson: **arrays are reference types** — passing an array into a method gives that method direct access to the same memory, so mutations persist and stack up across calls if you're not careful.
- **Day 8** — 2D arrays. Built `printMatrix`, `sumMatrix`, and `transposeMatrix` (tested deliberately on a non-square matrix). First attempt crashed with an `ArrayIndexOutOfBoundsException` from creating the result array with the *original* dimensions instead of flipped ones (`new int[rows][cols]` instead of `new int[cols][rows]`). Fixed and re-verified clean on a cold retest during Day 10's review.
- **Day 9** — Strings as char arrays. Built `reverseString`, `countVowels`, and `isPalindrome` using `toCharArray()` and the same two-pointer pattern from Day 7. Learned Strings are immutable (must convert to `char[]` to modify), `.equals()` vs `==` for content comparison, and hit a real gap around **method chaining order** — a `char[]` has no String methods like `.toLowerCase()`, so all String-specific operations must happen *before* converting to a char array, not after.
- **Day 10** — StringBuilder vs String concatenation. Timed building a 100,000-character string both ways. First run had a typo (`result = result = "a"` instead of `result = result + "a"`) that invalidated the benchmark; after fixing it, measured **String concatenation: ~830ms vs StringBuilder: ~3ms — roughly a 270x difference**, from the same quadratic-copy-cost effect covered on Day 1. Also used this as a review day: retested the Day 8 transpose fix and the Day 9 chaining-order fix from memory — both came back correct.

  **Week 2 closed ✅**

### Week 3 — Collections
- **Day 11** — ArrayList. Built add/get/remove/loop examples with `ArrayList<Integer>`. Learned ArrayList requires wrapper types (`Integer`, not `int`), `.size()` instead of `.length`/`.length()`, and that `remove(int index)` removes by position — not by value — unless you explicitly use the overloaded `remove(Object)` version.
- **Day 12** — HashMap. Built a word-frequency counter using the core counting pattern `map.put(key, map.getOrDefault(key, 0) + 1)`. Learned `get()` returns `null` (not an error) for a missing key — a common source of delayed `NullPointerException` bugs — while `getOrDefault()` avoids this with a safe fallback. Also learned HashMap has **no guaranteed iteration order**. Quiz follow-up revealed a gap in applying `containsKey()` efficiently (initially reached for a manual loop instead of the built-in instant lookup) — corrected and logged in the cheat sheet.
- **Day 13** — HashSet. Built `hasDuplicate(int[] arr)` — single-pass duplicate detection using `contains()` before `add()`, instead of comparing every pair with nested loops. Learned `add()` silently ignores values already in the set (no error, no duplicate).
- **Day 14** — Stack (via `ArrayDeque`). Built a valid-parentheses checker using `push`/`pop`/`peek`. Learned why `java.util.Stack` is generally avoided in favor of `ArrayDeque` (legacy synchronization overhead), why `pop()` on an empty stack throws `NoSuchElementException` instead of returning `null`, and the classic "looks done but isn't" bug of forgetting to check `stack.isEmpty()` at the end (misses unclosed opening brackets like `"(("`).
- **Day 15** — Queue (FIFO, via `LinkedList`) and PriorityQueue. Built a queue drain demo confirming FIFO order, and `threeSmallest(int[] arr)` using a PriorityQueue (min-heap by default). First attempt accidentally used `arr.length` instead of `3` for both the result array size and loop bound — which didn't crash, but silently returned the *entire array sorted* instead of just the 3 smallest (a neat accidental discovery: fully draining a PriorityQueue produces a sorted array). Fixed by bounding both to `3`.

  **Week 3 closed ✅ — Collections fully complete**

---

## What's next

Starting Days 16-17: buffer/review days revisiting shaky spots from Weeks 1-3, then moving into **Two Pointers, Sliding Window, and Prefix Sum** (Days 18-25) — the first block of real, named LeetCode problems in this roadmap (Two Sum, Container With Most Water, Longest Substring Without Repeating Characters, and more).

---

## Why I'm doing this publicly

Mostly for accountability — a public commit history is harder to quietly abandon than a private todo list. Also doubles as a portfolio signal for later job applications.
