# COMP 251 - Assignment 2 Test Cases

## **IMPORTANT**

- Even though we tried making the most appropriate testcases for this assignment, there still may be some errors in them, do not hesitate to point them out.

- Having everything right in the following tests does not mean in any way that you will obtain 100% on the assignment.

---

## Contribute

You are more than welcome to fork this repository and add more test cases.

### To do's

[ ] Test cases for Question 1 : Disjoint Sets

[ ] Add case where student has time to complete all assignments + leftover time

[ ] Big test case for Question 3 : Greedy

---

## Question 2 : _Kruskal's Algoritm_

| Graph    | Purpose of test                                             |
| -------- | ----------------------------------------------------------- |
| kruTest1 | General tree                                                |
| kruTest2 | General tree                                                |
| kruTest3 | Tree is already a MST / all edges come from a single vertex |

![First Graph](https://github.com/tomsarry/COMP251_A2_TestCases/blob/master/Kruskal's%20Algorithm/assets/Tree1.PNG?raw=true) ![First MST](https://github.com/tomsarry/COMP251_A2_TestCases/blob/master/Kruskal's%20Algorithm/assets/MST1.PNG?raw=true)

Explanations can be found [here](https://www.geeksforgeeks.org/kruskals-minimum-spanning-tree-algorithm-greedy-algo-2/).

![Second Graph](https://github.com/tomsarry/COMP251_A2_TestCases/blob/master/Kruskal's%20Algorithm/assets/Tree2.PNG?raw=true) ![Second MST](https://github.com/tomsarry/COMP251_A2_TestCases/blob/master/Kruskal's%20Algorithm/assets/MST2.PNG?raw=true)

No explanation on website, had to derive the MST by myself.

_**Note:** Second tree has two solutions for the last edge -> I added 2 different result files to account for this, if you result is any of these, you should be fine._

---

## Question 3 : _Greedy Algorithm_

If you add new test cases, you must update the following variables:

```java
int[][] weights;
int[][] deadlines;
int[][] expected;
int[] expectedSum; // Sum of the weights of all completed assignments.
```

The extra array `expectedSum` was introduced to account for multiple correct solutions.

### Running tests

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

Test 4: PASS
------------------------------
Expected: [5, 6, 3, 0, 1, 7]
Your solution: [5, 6, 3, 0, 1, 7]

Test 5: PASS
------------------------------
Expected: [3, 5, 2, 4, 0, 7, 6]
Your solution: [3, 5, 2, 4, 0, 7, 6]

Test 6: PASS
------------------------------
Expected: [1]
Your solution: [1]

You passed 6/6 tests!
N.B. Some test cases may have multiple solutions, so your solution (while valid) may not match the expected solution.
```
