package STRING;


// https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/?envType=daily-question&envId=2025-06-10
// leetcode : 3442

public class MaximumDifferenceBetweenEvenAndOddFrequencyI {

    public static void main(String[] args) {
        MaximumDifferenceBetweenEvenAndOddFrequencyI ans = new MaximumDifferenceBetweenEvenAndOddFrequencyI();
        String s = "aaaaabbc";
        System.out.println(ans.maxDifference(s));
    }

    public int maxDifference(String s) {
        int[] freq = new int[26];
        int minE = Integer.MAX_VALUE;
        int maxO = 1;

        for(char element : s.toCharArray())
            freq[element - 'a']++;

        for (int i = 0; i < 26; i++) {
            if(freq[i] == 0)
                continue;
            else if (freq[i] % 2 == 0)
                minE = Math.min(minE, freq[i]);
            else
                maxO = Math.max(maxO, freq[i]);
        }
        return maxO - minE;
    }
}
