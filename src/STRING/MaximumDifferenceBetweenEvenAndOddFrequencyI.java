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
        int minFreqOdd = Integer.MIN_VALUE;
        int maxFreqEven = Integer.MAX_VALUE;

        for(char element : s.toCharArray())
            freq[element - 'a']++;

        for (int i = 0; i < freq.length; i++) {
            if( freq[i] % 2 != 0 &&freq[i] > maxFreqEven) {
                minFreqOdd = freq[i];
            } else if(freq[i] % 2 == 0 && freq[i] < minFreqOdd)
                maxFreqEven = freq[i];
        }
        return  minFreqOdd - maxFreqEven;
    }
}
