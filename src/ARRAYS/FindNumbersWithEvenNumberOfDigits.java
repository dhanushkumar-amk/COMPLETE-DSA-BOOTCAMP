package ARRAYS;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/?envType=daily-question&envId=2025-04-30
// leetcode : 1295



public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        FindNumbersWithEvenNumberOfDigits answer = new FindNumbersWithEvenNumberOfDigits();
        System.out.println(answer.findNumbers(nums));
    }


    public int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenNumber(i))
                count++;
        }
        return count;
    }

    private boolean isEvenNumber(int num) {

        while (num != 0){
            int 
        }
    }
}
