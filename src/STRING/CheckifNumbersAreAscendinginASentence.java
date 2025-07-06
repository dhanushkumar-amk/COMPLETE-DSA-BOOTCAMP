package STRING;

import java.util.Arrays;

public class CheckifNumbersAreAscendinginASentence {

    public static void main(String[] args) {
        CheckifNumbersAreAscendinginASentence ans = new CheckifNumbersAreAscendinginASentence();
        String s = "1 box has 3 blue 6 red 6 green and 12 yellow marbles";
       System.out.println(ans.areNumbersAscending(s));

    }

    public boolean areNumbersAscending(String s) {
        int previousValue  = 0;
        int currentValue = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if(Character.isDigit(ch)){
                currentValue *= 10;
                currentValue += ch - 48;
                if(currentValue > previousValue){
                    previousValue = currentValue;
                    continue;
                }
                else
                    return false;
            }

        }
    return true;
    }


}
