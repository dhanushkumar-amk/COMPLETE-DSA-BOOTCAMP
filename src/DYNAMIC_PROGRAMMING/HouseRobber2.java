package DYNAMIC_PROGRAMMING;

//https://leetcode.com/problems/house-robber-ii/description/
// leetcode 213



public class HouseRobber2 {

        // Helper function to solve the House Robber I problem
        private int rob1(int[] nums) {
            int n = nums.length;
            if (n == 0) return 0;
            if (n == 1) return nums[0];

            int previous1 = nums[0];
            int previous2 = 0;

            for (int i = 1; i < n; i++) {
                int pick = nums[i] + (i > 1 ? previous2 : 0);
                int notPick = previous1;
                int current = Math.max(pick, notPick);
                previous2 = previous1;
                previous1 = current;
            }

            return previous1;
        }

        // Main function to solve the House Robber II problem
        public int rob(int[] nums) {
            int n = nums.length;
            if (n == 0) return 0;
            if (n == 1) return nums[0];

            // Split the problem into two subproblems
            int[] temp1 = new int[n - 1];
            int[] temp2 = new int[n - 1];

            for (int i = 0; i < n - 1; i++) {
                temp1[i] = nums[i]; // Exclude the last house
                temp2[i] = nums[i + 1]; // Exclude the first house
            }

            // Solve both subproblems
            int ans1 = rob1(temp1);
            int ans2 = rob1(temp2);

            // Return the maximum of the two solutions
            return Math.max(ans1, ans2);
        }
    }

}

