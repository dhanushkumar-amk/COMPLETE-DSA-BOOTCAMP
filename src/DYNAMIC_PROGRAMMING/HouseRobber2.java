package DYNAMIC_PROGRAMMING;

//https://leetcode.com/problems/house-robber-ii/description/
// leetcode 213

import java.util.ArrayList;

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

            int n = nums.length;
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();


            if (n == 1)
                return nums[0];

        for (int i = 0; i < n; i++) {
                if (i != 0)
                    temp1.add(nums[i], )
        }
    }

}

