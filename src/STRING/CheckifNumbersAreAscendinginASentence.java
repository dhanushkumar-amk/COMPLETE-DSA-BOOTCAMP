package STRING;

import java.util.Arrays;

public class CheckifNumbersAreAscendinginASentence {

    public static void main(String[] args) {
        CheckifNumbersAreAscendinginASentence ans = new CheckifNumbersAreAscendinginASentence();
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
       System.out.println(ans.areNumbersAscending(s));

    }

    public boolean areNumbersAscending(String s) {
        int previousValue  = 0;
        String[] str = s.split("");
        int[] arr = new int[str.length];
        int index = 0;
        try {

            arr[index++] = Integer.parseInt();
        } catch (NumberFormatException e) {
            // Ignore if it's not a number
        }
    }


}
