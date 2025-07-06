package STRING;

import java.util.Arrays;

public class CheckifNumbersAreAscendinginASentence {

    public static void main(String[] args) {
        CheckifNumbersAreAscendinginASentence ans = new CheckifNumbersAreAscendinginASentence();
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String[] arr = s.split("");
        for(String ar : arr){
            System.out.print(ar);
        }
    }


}
