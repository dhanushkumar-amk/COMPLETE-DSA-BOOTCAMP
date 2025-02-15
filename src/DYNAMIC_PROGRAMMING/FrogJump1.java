package DYNAMIC_PROGRAMMING;

public class FrogJump1 {
    public static void main(String[] args) {

    }

    static int solve(int n,int[] height,int[] dp){
        
        
        if(n == 0)
            return 0;
        
        if( dp[n] != -1)
            return dp[n];

        int jumpOneStep = solve(n-1, height,dp)+ Math.abs(height[n]-height[n-1]);

        int jumpTwoSteps = Integer.MAX_VALUE;
        if(n>1)
            jumpTwoSteps = solve(n-2, height,dp)+ Math.abs(height[n]-height[n-2]);

        return dp[n]=Math.min(jumpOneStep, jumpTwoSteps);
    }
}
