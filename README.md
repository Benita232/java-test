### Question 1 — `countEvens(int n)`

This method must:

* Return how many even numbers exist from 1 to `n` (inclusive)
* Return `0` if `n` is less than 1

The code contains a wrong edge-case return value, an off-by-one error in the loop bound, and an assignment used instead of a comparison. Fix all of them.

```java
public static int countEvens(int n) {}
```

---

### Question 2 — `findMax(int[] arr)`

This method must:

* Return the largest value in the array
* Return `Integer.MIN_VALUE` if the array is null or empty

Fix the two null/empty checks and the loop bound error.

```java
public static int findMax(int[] arr) {}
```

---

### Question 3 — `classifyAge(int age)`

This method must return a category string based on the age:

| Age Range     | Category    |
|---------------|-------------|
| Outside 0–120 | `"Invalid"` |
| 0 – 12        | `"Child"`   |
| 13 – 17       | `"Teen"`    |
| 18 – 64       | `"Adult"`   |
| 65 – 120      | `"Senior"`  |

Fill in the blank conditions and ensure the ranges do not overlap.

```java
public static String classifyAge(int age) {}
```

---

### Question 4 — `countUpperCase(String s)`

Complete the method body so that it:

* Returns the number of uppercase letters (`A`–`Z`) in the string
* Returns `0` for a null or empty string

No starter code is provided — write the full method body.

```java
public static int countUpperCase(String s) {}
```

---

## Comprehension Question Section

Please answer these in `answers.txt`. Do not remove the comments and do not change the format.

---

### Comprehension Question 1 — IDEs (5 Points)

You have just started at a small dev agency in Cape Town. A junior colleague is frustrated because their setup "just uses Notepad" and they keep losing track of errors until they try to run the code. Your team lead asks you to send that colleague a quick written explanation of what an IDE is and why the whole team uses one instead of a plain text editor.

Write that explanation. Cover what an IDE is, two or three specific features that make it valuable day-to-day, and name at least two IDEs a Java developer might use.

---

### Comprehension Question 2 — Version Control (5 Points)

You are working alone on a small project. You have been making changes for three days without committing. You accidentally delete a file that contained two days of work and cannot undo it. A senior developer looks at your repository and says: "This is why we commit regularly."

Explain to a friend who has never used Git how version control would have prevented this disaster. Your explanation should touch on what version control is and why it exists, what a commit is and why you make them often, and the role of a remote repository (like GitHub) as a backup.

---

### Comprehension Question 3 — Build Tools (10 Points)

Your team is a group of four students working on a shared Java project. One person compiles with `javac` from the terminal, another uses an IDE button, a third downloaded a library JAR manually and placed it in a random folder, and nobody can run each other's code without fixing paths first.

Write a short internal team note making the case for adopting Maven. Cover what a build tool is and what problem it solves, how Maven manages dependencies so nobody downloads JARs manually, and the three Maven commands the team would use most — with a one-line explanation of each.

---

### Comprehension Question 4 — Constructors (5 Points)

A classmate is looking at a `Student` class and sees this:

```java
public Student() { ... }
public Student(String name, int age) { ... }
```

They ask: *"Why is there a method with the same name as the class? And why are there two of them — isn't that just duplicate code?"*

Explain constructors to your classmate. Cover what a constructor does and how it differs from a regular method, the difference between a default and a parameterised constructor, and give one reason why you would define your own instead of relying on the default.

---

### Comprehension Question 5 — Object-Oriented Programming (10 Points)

Your team is building a library management system. A teammate suggests tracking everything with three parallel arrays at the top of the program — one for book titles, one for authors, and one for availability status.

Using this library system as your example throughout, explain OOP and argue why it is a better approach than parallel arrays. Your answer should cover what OOP is and the core idea behind it, what a class is and how it acts as a blueprint (using a `Book` class as your example), and the difference between a class and an object/instance — with a concrete example.
