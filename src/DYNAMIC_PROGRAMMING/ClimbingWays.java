package DYNAMIC_PROGRAMMING;

// https://leetcode.com/problems/climbing-stairs/description/
// leetcode 70

public class ClimbingWays {


    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }


    public static int climbStairs(int n) {

        if (n == 0 || n == 1)
            return 1;

        int left = climbStairs(n - 1);
        int right = climbStairs(n - 2);

        return left + right;
    }

}

