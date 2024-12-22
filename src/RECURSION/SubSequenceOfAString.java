package RECURSION;

import java.util.ArrayList;

public class SubSequenceOfAString {
    public static void main(String[] args) {
        String s = "abc";
        String answer = "";
        subSequence(s, answer);

//        System.out.println(list);
    }

//    static ArrayList<String> list = new ArrayList<>();

    static void subSequence(String s, String answer){

        // base case
        if (s.length() == 0) {
//            list.add(answer);
            System.out.println(answer);
            return;
        }
        // pick the character
        subSequence(s.substring(1), answer + s.charAt(0));

        // not pick the character
        subSequence(s.substring(1), answer);

    }
}
