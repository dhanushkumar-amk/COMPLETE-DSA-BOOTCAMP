package STRIVER_SHEET.STRINGS;

public class LargestCommonPrefix {
    public static void main(String[] args) {

    }


    public String longestCommonPrefix(String[] strs) {
        String string1 = strs[0];
        String string2 = strs[strs.length - 1];

        int index = 0;
        while (index < string1.length()){
            if(string1.charAt(index) == string2.charAt(index))
                index++;
            else break;
        }
        return string1.substring(0, index);
    }
}
