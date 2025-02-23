package BITMANUPULATION;

import java.util.ArrayList;
import java.util.List;

public class Subsets______PowerSet {

    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        int n = nums.length;
        int subsets = 1 << n;

        for (int num = 0; num < subsets - 1; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                if ((num & ((1 << i)))) == true
                        list.add(nums[i]);
            }
            answer.add(list);
        }

        return answer;
    }

}
