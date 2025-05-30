package SLIDING_WINDOW_AND_POINTERS;


// leetcode 2379
// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/?envType=daily-question&envId=2025-03-08

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {

    public static void main(String[] args) {
        String block = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(block, k));
    }

    public static int minimumRecolors(String blocks, int k) {

        blocks = blocks.toLowerCase();

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= blocks.length() - k; i++) {
            int currentLength = 0;
            for (int j = i; j < i + k ; j++) {

                if (blocks.charAt(j) == 'w'){
                    currentLength++;
                }
            }
            answer = Math.min(answer, currentLength);
        }
        return answer;
    }
}
