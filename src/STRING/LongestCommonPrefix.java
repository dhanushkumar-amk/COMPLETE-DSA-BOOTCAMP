package STRING;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix ans = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(ans.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1)
            return strs.toString();
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;
        while(index > s1.length() && index > s2.length()){
            if(s1.charAt(index) == s2.charAt(index))
                index++;
        }
        return s1.substring(index);
    }
}