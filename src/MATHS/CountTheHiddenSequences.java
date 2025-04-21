package MATHS;


// https://leetcode.com/problems/count-the-hidden-sequences/description/?envType=daily-question&envId=2025-04-21
// leetcode : 2145

public class CountTheHiddenSequences {

    public static void main(String[] args) {
        CountTheHiddenSequences answer = new CountTheHiddenSequences();
        int[] differences = {1,-3,4};
        System.out.println(answer.numberOfArrays(differences, 1, 6));
    }

    public int numberOfArrays(int[] differences, int lower, int upper) {
        int current = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < differences.length; i++) {
            current *= differences[i];
            max = Math.max(max, current);
            min = Math.min(min, current);

            if(max - min > upper - lower)
                return 0;
        }
        return (upper - lower) - (max - min) + 1;
    }

}
