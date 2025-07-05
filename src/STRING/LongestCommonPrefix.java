package STRING;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix ans = new LongestCommonPrefix();
        String[] strs = {"ab", "a"};
        System.out.println(ans.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0].toString();
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index;
        
        for( index = 0; index < s2.length() -1 ; ++index){
            if(s1.charAt(index) == s2.charAt(index))
                index++;
            else
                break;
        }
        return s1.substring(0,index);
    }
}