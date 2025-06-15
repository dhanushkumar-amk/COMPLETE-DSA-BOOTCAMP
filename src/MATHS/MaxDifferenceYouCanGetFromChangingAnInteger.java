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
            if(maxChar[i] != '9') {
                char target = maxChar[i];

                for (int j = 0; j < n; ++j) {
                    if(maxChar[j] == target)
                        maxChar[j] = '9';
                }
                break;
            }
        }

        if(minChar[0] > '1'){
            char target = minChar[0];
            for (int i = 1; i < n; ++i) {
                if(minChar[i] == target)
                    minChar[i] = '1';
            }
        }
        else{
            for (int i = 1; i < n; ++i) {
                if(minChar[i] > '1'){
                    char target = minChar[i];
                    for (int j = i; j < n; ++j) {
                        if(minChar[j] == target)
                            minChar[j] = '0';
                    }
                    break;
                }
            }
        }
        int maxNum = Integer.parseInt(new String(maxChar));
        int minNum = Integer.parseInt(new String(minChar));
        return maxNum - minNum;
    }
}