package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

public class DistinctSubSequences {



    public int numDistinct(String s, String t) {

    }


    private int function(int i, int j, String string1, String string2){

        // base case
        if(i < 0)
            return 0;

        if (j < 0)
            return 1;

        if (string1.charAt(i) == string2.charAt(j))
        int leaveOne = function(i -1, j - 1, string1, string2);
        int stay = ;

    }

}
