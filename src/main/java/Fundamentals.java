public class Fundamentals {

    // ============================================================
    // Question 1 — countEvens(int n)                   [10 Points]
    // ============================================================
    //
    // This method must:
    //   - Return how many even numbers exist from 1 to n (inclusive)
    //   - Return 0 if n is less than 1
    //
    // The code below contains:
    //   - One wrong edge-case return value
    //   - One off-by-one error in the loop bound
    //   - One assignment used instead of a comparison  (= vs ==)
    //
    // Fix all three errors.

    public static int countEvens(int n) {
        if (n < 1) return -1;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 = 0) {
                count++;
            }
        }
        return count;
    }


    // ============================================================
    // Question 2 — findMax(int[] arr)                  [10 Points]
    // ============================================================
    //
    // This method must:
    //   - Return the largest value in the array
    //   - Return Integer.MIN_VALUE if the array is null or empty
    //
    // The code below contains:
    //   - Two assignment-instead-of-comparison errors (= vs ==)
    //   - One off-by-one error in the loop bound
    //
    // Fix all three errors.

    public static int findMax(int[] arr) {
        if (arr = null || arr.length = 0) return Integer.MIN_VALUE;
        int max = arr[0];
        for (int i = 1; i <= arr.length; i++) {    // fix: loop bound
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    // ============================================================
    // Question 3 — classifyAge(int age)                [10 Points]
    // ============================================================
    //
    // This method must return a category string based on age:
    //
    //   Age Range       Category
    //   ─────────────── ─────────────
    //   Outside 0–120   "Invalid"
    //   0  – 12         "Child"
    //   13 – 17         "Teen"
    //   18 – 64         "Adult"
    //   65 – 120        "Senior"
    //
    // Fill in the blank conditions.
    // Make sure the ranges do not overlap and all ages are covered.

    public static String classifyAge(int age) {
        if (                        ) {      // fill: out-of-range check
            return "Invalid";
        } else if (                 ) {      // fill: Child range
            return "Child";
        } else if (                 ) {      // fill: Teen range
            return "Teen";
        } else if (                 ) {      // fill: Adult range
            return "Adult";
        } else {
            return          ;                // fill: what goes here?
        }
    }


    // ============================================================
    // Question 4 — countUpperCase(String s)            [10 Points]
    // ============================================================
    //
    // Complete the method body so that it:
    //   - Returns the number of uppercase letters (A–Z) in the string
    //   - Returns 0 for a null or empty string
    //
    // No starter logic is provided — write the full method body.
    // Hint: Character.isUpperCase(char c) may be useful.

    public static int countUpperCase(String s) {

        return      ;
    }

}

