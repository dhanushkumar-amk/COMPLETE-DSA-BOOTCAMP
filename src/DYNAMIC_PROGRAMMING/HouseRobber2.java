package DYNAMIC_PROGRAMMING;

//https://leetcode.com/problems/house-robber-ii/description/
// leetcode 213



public class HouseRobber2 {

    public static void main(String[] args) {
        // Test case 1: Single house
        int[] nums1 = {5};
        Solution solution = new Solution();
        System.out.println("Test Case 1: " + solution.rob(nums1)); // Expected: 5

        // Test case 2: Two houses
        int[] nums2 = {2, 3};
        System.out.println("Test Case 2: " + solution.rob(nums2)); // Expected: 3

        // Test case 3: No houses
        int[] nums3 = {};
        System.out.println("Test Case 3: " + solution.rob(nums3)); // Expected: 0
    }



            // Helper function to solve the House Robber I problem for a given range
            private int rob1(int[] nums, int start, int end) {
                int previous1 = 0; // Represents dp[i-1]
                int previous2 = 0;  // Represents dp[i-2]

                for (int i = start; i <= end; i++) {
                    int pick = nums[i] + previous2; // Rob the current house and add dp[i-2]
                    int notPick = previous1;       // Do not rob the current house, take dp[i-1]
                    int current = Math.max(pick, notPick); // Current maximum
                    previous2 = previous1; // Update dp[i-2] to dp[i-1]
                    previous1 = current;   // Update dp[i-1] to current
                }

                return previous1; // The final result is stored in previous1
            }

            // Main function to solve the House Robber II problem
            public int rob(int[] nums) {
                int n = nums.length;
                if (n == 0) return 0;
                if (n == 1) return nums[0];

                // Solve two subproblems:
                // 1. Rob houses from 0 to n-2 (exclude the last house)
                // 2. Rob houses from 1 to n-1 (exclude the first house)
                int ans1 = rob1(nums, 0, n - 2); // Exclude the last house
                int ans2 = rob1(nums, 1, n - 1); // Exclude the first house

                // Return the maximum of the two solutions
                return Math.max(ans1, ans2);
            }
        }


