package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class FrogJump1 {
    public static void main(String[] args) {

        int[] height ={30,10,60 , 10 , 60 , 50};
        int n = height.length;

        int[] dp=new int[n];
        Arrays.fill(dp,-1);

        System.out.println(jump1(n-1,height,dp));
    }

    static int jump1(int n,int[] height,int[] dp){
        
        
        if(n == 0)
            return 0;
        
        if( dp[n] != -1)
            return dp[n];

        int jumpOneStep = jump1(n-1, height,dp)+ Math.abs(height[n]-height[n-1]);

        int jumpTwoSteps = Integer.MAX_VALUE;
        if(n>1)
            jumpTwoSteps = jump1(n-2, height,dp)+ Math.abs(height[n]-height[n-2]);

        return dp[n]=Math.min(jumpOneStep, jumpTwoSteps);
    }
}
