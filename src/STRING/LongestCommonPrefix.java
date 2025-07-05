package STRING;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix ans = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
//        ans.longestCommonPrefix(strs);
        System.out.println(Arrays.toString(strs));
    }
}