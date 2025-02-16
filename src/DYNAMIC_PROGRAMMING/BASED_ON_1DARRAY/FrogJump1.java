package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class FrogJump1 {
    public static void main(String[] args) {

        int[] height ={30,10,60 , 10 , 60 , 50};
        int n = height.length;

        int[] dp=new int[n];
        Arrays.fill(dp,-1);

//        System.out.println(jump1(n-1,height,dp));
//        System.out.println(jump2(n, height, dp));

        jump3(n, height);


    }

    // memorization
    static int jump1(int n,int[] height,int[] dp){
        
        
        if(n == 0)
            return 0;
        
        if( dp[n] != -1)
            return dp[n];

        int jumpOneStep = jump1(n-1, height,dp)+ Math.abs(height[n]-height[n-1]);

        int jumpTwoSteps = Integer.MAX_VALUE;

        if(n>1) jumpTwoSteps = jump1(n-2, height,dp)+ Math.abs(height[n]-height[n-2]);

        return dp[n]=Math.min(jumpOneStep, jumpTwoSteps);
    }


    // tabulation
    static int jump2(int n, int[] height, int[] dp){

        dp[0] = 0;


        for (int i = 2; i < n; i++) {
            int oneStep = dp[i - 1] + Math.abs(height[i]  -height[i - 1]);

            int twoStep = Integer.MAX_VALUE;

            if (i > 1)
                twoStep = dp[i - 2] + Math.abs(height[i] -height[i - 2]);

            dp[i] = Math.min(oneStep, twoStep);
        }

        return dp[n - 1];
    }



    //space optimization
    static void jump3(int n, int[] height){

        int previous1 = 0;
        int previous2 = 0;

        for (int i = 1; i < n; i++) {
            int jumOne = previous1 + Math.abs(height[i] - height[i - 1]);

            int jumpTwo = Integer.MAX_VALUE;

            if (i > 1)
                jumpTwo = previous2 + Math.abs(height[i] - height[i - 2]);

            int current = Math.min(jumOne, jumpTwo);

            previous2 = previous1;
            previous1 = current;

        }
        System.out.println(previous1);

    }
}
