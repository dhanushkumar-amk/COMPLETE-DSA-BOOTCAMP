package STRING;

import java.util.Arrays;

public class CheckifNumbersAreAscendinginASentence {

    public static void main(String[] args) {
        CheckifNumbersAreAscendinginASentence ans = new CheckifNumbersAreAscendinginASentence();
        String s = "1 box has 3 blue 4 red 6 green and 1 yellow marbles";
        System.out.println(ans.areNumbersAscending(s));

    }

    public boolean areNumbersAscending(String s) {
        int previousValue = 0;
        String[] strs = s.split(" ");
        for (String str : strs) {

                int current = Integer.parseInt(str);
                if(current < 56) {
                    if (current <= previousValue) {
                        return false;
                    }
                    previousValue = current;
                }

        }
        return true;
    }
}
