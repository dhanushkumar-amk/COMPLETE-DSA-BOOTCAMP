package BITMANUPULATION;

import java.util.ArrayList;
import java.util.List;

public class SubsetsPowerSet {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        SubsetsPowerSet solution = new SubsetsPowerSet();
        List<List<Integer>> subsets = solution.subsets(nums);

        System.out.println("Subsets (Power Set) of [1, 2, 3]: ");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        int subsets = 1 << n;

        for (int num = 0; num < subsets; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            answer.add(list);
        }

        return answer;
    }

}
