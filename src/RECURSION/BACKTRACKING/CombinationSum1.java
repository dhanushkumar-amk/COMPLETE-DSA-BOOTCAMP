package RECURSION.BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        CombinationSum1 sol = new CombinationSum1();
        List < List < Integer >> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> answer = new ArrayList<>();
        findCombinations(0, candidates, target, answer, new ArrayList<>());
        return answer;
    }

    private void findCombinations(int index, int[] candidates, int target, List<List<Integer>> answer,  ArrayList<Integer> dataStructure) {

        // base case
        if (index == candidates.length){
            if (target == 0)
                answer.add(new ArrayList<>(dataStructure));  // add  if the target is 0 otherwise backtrack
            return;
        }

        //pick
        if (candidates[index] <= target){
            dataStructure.add(candidates[index]);
            findCombinations(index, candidates,target - candidates[index], answer, dataStructure);
            dataStructure.remove(dataStructure.size() - 1);  // backtrack
        }

        // not pick
        findCombinations(index + 1, candidates, target, answer, dataStructure);
    }

}
