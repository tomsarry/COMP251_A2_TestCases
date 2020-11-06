# Greedy Tester

If you add new test cases, you must update the following variables:

```java
int[][] weights;
int[][] deadlines;
int[][] expected;
int[] expectedSum; // Sum of the weights of all completed assignments.
```

The extra array `expectedSum` was introduced to account for multiple correct solutions.

## Running tests

This is pretty self-explanatory. You must compile `Greedy_Tester.java` along with your solution to the algorithm.

```b
$ javac Greedy_Tester.java
$ java Greedy_Tester
```

Sample output could look like:

```
Test 1: PASS
------------------------------
Expected: [1, 2, 0]
Your solution: [1, 2, 0]

Test 2: PASS
------------------------------
Expected: [0, 1, 2, 3]
Your solution: [0, 1, 2, 3]

Test 3: PASS
------------------------------
Expected: [0, 2, 1, 3]
Your solution: [0, 2, 1, 3]

You passed 3/3 tests!
N.B. Some test cases may have multiple solutions, so your solution (while valid) may not match the expected solution.
```