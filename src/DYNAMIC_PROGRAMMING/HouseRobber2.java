package DYNAMIC_PROGRAMMING;

//https://leetcode.com/problems/house-robber-ii/description/
// leetcode 213

public class HouseRobber2 {


        public static  int rob1(int[] nums) {
            int n = nums.length;

            // -1, 0, 1 previous1 = 0 and previous2 -1
            int previous1 = nums[0];
            int previous2 = 0;

            for (int i = 1; i < n; i++) {

                // pick means = i - 2;
                int pick = nums[i];
                if (i > 1)
                    pick+= previous2;

                // just go i - 1
                int notPick = previous1;

                int current = Math.max(pick, notPick);
                previous2 = previous1;
                previous1 = current;
            }

            // 5,6,7, n; n= i answer is i -1 is previous1
            return previous1;
        }

    public int rob(int[] nums) {

            int[] temp1 = new int[nums.length];
            int[] tem2 = new int[nums.length];

            
    }

}

