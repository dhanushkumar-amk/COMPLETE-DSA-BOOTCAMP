package STRING;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix ans = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
//        ans.longestCommonPrefix(strs);
        System.out.println(Arrays.toString(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans = "";
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index1 = s1.charAt(0);
        int index2 = s2.charAt(0);
        while(index1 < s1.length() || index2 < s2.length()){
            if(s1.charAt(index1) == s2.charAt(index2)){
                index1++;
                index2++;
            }
        }
        return ans.substring(0, index1);
    }
}