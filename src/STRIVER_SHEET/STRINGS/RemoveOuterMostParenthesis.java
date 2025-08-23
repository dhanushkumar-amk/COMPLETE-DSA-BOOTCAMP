package STRIVER_SHEET.STRINGS;

import java.util.ArrayList;

public class RemoveOuterMostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        int counter = 0;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')')
                counter--;

            if(counter != 0)
                ans.append(s.charAt(i));

            if(s.charAt(i) == '(')
                counter++;
        }
        return ans.toString();
    }


    public static ArrayList<String> removeInvalidParentheses(String s) {
        int counter = 0;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')')
                counter--;

            if(counter != 0)
               result.add(String.valueOf(s.charAt(i)));

            if(s.charAt(i) == '(')
                counter++;
        }
        return result;
    }

}
