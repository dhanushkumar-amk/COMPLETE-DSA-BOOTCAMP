package STRING;

import java.util.Arrays;

public class CheckifNumbersAreAscendinginASentence {

    public static void main(String[] args) {
        CheckifNumbersAreAscendinginASentence ans = new CheckifNumbersAreAscendinginASentence();
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(ans.areNumbersAscending(s));

    }

    public boolean areNumbersAscending(String s) {
        String[] arr = s.split("");
        int prevValue = 0;
       for(String word : arr){
           int num = Integer.parseInt(word);

           if(num > prevValue){
               prevValue = num;
               continue;
           }
           else
               return false;
       }
    return true;
    }


}
