package STRING;

import java.util.Arrays;

public class CheckifNumbersAreAscendinginASentence {

    public static void main(String[] args) {
        CheckifNumbersAreAscendinginASentence ans = new CheckifNumbersAreAscendinginASentence();
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";


    }

    public boolean areNumbersAscending(String s) {
        String[] arr = s.split("");
        int prevValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("abcdefghijklmnopqrstuvwxyz"))
                continue;
            else if( > prevValue){
                prevValue
            }

        }

    }


}
