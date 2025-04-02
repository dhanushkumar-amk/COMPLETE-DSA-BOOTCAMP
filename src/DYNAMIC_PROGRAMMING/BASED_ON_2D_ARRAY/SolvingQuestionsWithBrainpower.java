package DYNAMIC_PROGRAMMING.BASED_ON_2D_ARRAY;

//leetcode : 2140
// https://leetcode.com/problems/solving-questions-with-brainpower/description/?envType=daily-question&envId=2025-04-01

import java.util.Arrays;

public class SolvingQuestionsWithBrainpower {

    public static void main(String[] args) {
        SolvingQuestionsWithBrainpower answer = new SolvingQuestionsWithBrainpower();
        int[][] questions = {
                {3,2},
                {4,3},
                {4,4},
                {2,5},
        };

        System.out.println(answer.mostPoints(questions));

    }

    public long mostPoints(int[][] questions) {
        int n = questions.length;

        long[] memo = new long[n];
        Arrays.fill(memo, -1);

        return helper(questions, 0, memo);

    }

    private long helper(int[][] questions, int position, long[] memo) {

        // base case
        if (position >= questions.length)
            return 0;

        if (memo[position] != -1)
            return memo[position];

        long exclude = helper(questions, position + 1, memo);
        long include = questions[position][0] + helper(questions, position + questions[position][1] + 1, memo);
        memo[position] = Math.max(exclude, include);
        return memo[position];

    }
}
