package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

public class DistinctSubSequences {



    public int numDistinct(String s, String t) {

        int n = s.length();
        int m = t.length();

        int[][] dp = new int[][]

        return function(n -1, m-1, s, t);
    }


    private int function(int i, int j, String string1, String string2){

        // base case
        if(i < 0)
            return 0;

        if (j < 0)
            return 1;

        if (string1.charAt(i) == string2.charAt(j)) {

            int leaveOneOnBoth = function(i - 1, j - 1, string1, string2);
            int leaveOneOnS1 = function(i - 1, j, string1, string2);  // s2 is same as bag

            return leaveOneOnBoth + leaveOneOnS1;
        }

        //else
        return function(i -1, j, string1, string2);
    }

}
