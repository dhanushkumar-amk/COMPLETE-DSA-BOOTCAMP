package RECURSION.BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

    public static void main(String[] args) {

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
            dataStructure.remove(candidates[index]);  // backtrack 
        }

        // not pick
        findCombinations(index + 1, candidates, target, answer, dataStructure);
    }

}
