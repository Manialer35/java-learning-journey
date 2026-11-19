# Java Learning Journey ☕

My own Java practice from the first semester of my **M.Sc. Data Science at Trier University** (winter 2026/27).
I'm a beginner in Java and I commit what I practise, bugs fixed and all.

## What's here
| File | What it does | Pattern practised |
|---|---|---|
| `GCD.java` | Greatest common divisor with Euclid's subtraction method (input via dialog boxes) | `while` loop, `if/else` |
| `K3BExercise_1.java` | Reads an array, prints the sum and the average | accumulator |
| `K3BExercise_2.java` | Counts even and odd numbers | counter, `%` |
| `K3BExercise3.java` | Finds the minimum and every position where it appears | two-pass (find, then positions) |
| `Scan.java` | My first experiments with `Scanner` input | console input |

## How to run
```bash
javac K3BExercise3.java
java K3BExercise3
# input: 5 4 1 7 1 9   ->   output: 1 1 3
```

## Bug rules I learned the hard way
1. Reset the index before every new loop.
2. The loop step goes outside the `if`, or the loop never ends.
3. Fill the array first, then use `array[0]` as the starting candidate for min/max.
4. If a loop reads `array[i+1]`, it must stop at `size - 1`.

Graded university assignment solutions are deliberately **not** published here.
