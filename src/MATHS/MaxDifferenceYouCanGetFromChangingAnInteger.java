package MATHS;


// leetcode : 1432
// https://leetcode.com/problems/max-difference-you-can-get-from-changing-an-integer/?envType=daily-question&envId=2025-06-15
public class MaxDifferenceYouCanGetFromChangingAnInteger {
    public static void main(String[] args) {
        MaxDifferenceYouCanGetFromChangingAnInteger ans = new MaxDifferenceYouCanGetFromChangingAnInteger();
        int num = 555;
        System.out.println(ans.maxDiff(num));

    }
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        char[] maxChar = s.toCharArray();
        char[] minChar = s.toCharArray();
        int n = s.length();


        // convert the max value
        for (int i = 0; i < n; ++i) {
            if(maxChar[i] != '9')
                char target = maxChar[i];
        }


    }
}