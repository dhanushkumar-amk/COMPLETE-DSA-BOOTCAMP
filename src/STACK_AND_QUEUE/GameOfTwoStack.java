package STACK_AND_QUEUE;

import java.util.Arrays;

public class GameOfTwoStack {
    public static void main(String[] args) {

        int[] a = {4,2,4,6,1};
        int[] b = {2,1,8,5};
        int target = 10;
        System.out.println(twoStack(target,a,b));

    }

    static int twoStack(int target, int[] a, int[] b){

        return helper(target, a,b,0,0) - 1;
    }

    private static  int helper(int target, int[] a, int[] b, int sum, int count){

        if (sum > target)
            return count;

        if(a.length == 0 || b.length == 0)
            return count;

        int answer1 = helper(target, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count+ 1);
        int answer2 = helper(target, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count+ 1);

        return Math.max(answer1, answer2);
    }

}
