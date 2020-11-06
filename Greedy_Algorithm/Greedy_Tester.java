import java.util.Arrays;

public class Greedy_Tester {
    public static void main(String[] args) {
        int tally = 0;

        // Add new test cases here:
        int[][] weights = new int[][] { { 23, 60, 14, 25, 7 }, { 1, 1, 1, 3 }, { 3, 3, 3, 1 },
                { 43, 43, 1, 22, 22, 69, 25, 98 }, { 8, 8, 8, 9, 9, 9, 10, 10 }, { 11, 12 } };
        int[][] deadlines = new int[][] { { 3, 1, 2, 1, 3 }, { 1, 2, 3, 4 }, { 1, 3, 3, 4 }, { 4, 6, 4, 3, 5, 1, 2, 6 },
                { 6, 1, 3, 1, 4, 2, 7, 7 }, { 1, 1 } };
        int[][] expected = new int[][] { { 1, 2, 0 }, { 0, 1, 2, 3 }, { 0, 2, 1, 3 }, { 5, 6, 3, 0, 1, 7 },
                { 3, 5, 2, 4, 0, 7, 6 }, { 1 } };

        // Where there are multiple possible solutions, the total weight of the
        // completed homework assignments is used to verify the validity of your greedy
        // algorithm. Please updated expectedSum if you add more tests:
        int[] expectedSum = new int[] { 97, 6, 10, 300, 55, 12 };

        for (int i = 0; i < expected.length; i++) {
            HW_Sched schedule = new HW_Sched(weights[i], deadlines[i], weights[i].length);
            int[] res = schedule.SelectAssignments();
            String resString = Arrays.toString(res), ansString = Arrays.toString(expected[i]);
            int resSum = 0;
            for (int j = 0; j < res.length; j++) {
                resSum += Math.max(weights[i][res[j]], 0);
            }
            String feedback;
            if (resString.equals(ansString) || resSum == expectedSum[i]) {
                feedback = "PASS";
                tally++;
            } else {
                feedback = "FAIL";
            }
            System.out.printf("Test %d: %s\n------------------------------\n", i + 1, feedback);
            System.out.printf("Expected: %s\nYour solution: %s\n\n", ansString, resString);
        }

        System.out.printf("You passed %d/%d tests!\n\n", tally, expected.length);
        System.out.println(
                "N.B. Some test cases may have multiple solutions, so your solution (while valid) may not match the expected solution.");
    }
}
