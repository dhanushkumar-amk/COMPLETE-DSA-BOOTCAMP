package DYNAMIC_PROGRAMMING;

//https://leetcode.com/problems/house-robber-ii/description/
// leetcode 213

public class HouseRobber2 {


        public int rob(int[] nums) {

            int n = nums.length;
            int previous1 = nums[0];
            int previous2 = 0;

            for (int i = 1; i < n; i++) {

                int pick = nums[i];

                if (i > 1)
                    pick += previous2;

                int notPick = 0 + previous1;




            }
    }
}

