package STRIVER_SHEET.STRINGS;

public class LargestOddNumberString {
    public static void main(String[] args) {
        String num = "35427";
        System.out.println();
    }

    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0 ; --i) {
            char ch = num.charAt(i);

            if( (ch - '0') % 2 == 1)
                return num.substring(0, i + 1);
        }
        return "";
    }



}
