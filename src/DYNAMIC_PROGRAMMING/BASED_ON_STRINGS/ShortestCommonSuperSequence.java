package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

public class ShortestCommonSuperSequence {

    public String shortestCommonSupersequence(String string1, String string2) {
        int n = string1.length();
        int m = string2.length();

        int[][] dp =new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (string1.charAt(ind1 - 1) == string2.charAt(ind2 - 1))
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                else
                    dp[ind1][ind2] = 0 + Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }

        // tabulation table
        int len = dp[n][m];
        int i = n;
        int j = m;

        int index = len - 1;
        String answer = "";

        while (i > 0 && j > 0) {
            if (string1.charAt(i - 1) == string2.charAt(j - 1)) {
                answer += string1.charAt(i-1);
                index--;
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                answer += string1.charAt(i-1);
                i--;
            } else {
                answer += string2.charAt(j-1);
                j--;
            }
        }

        //Adding Remaing Characters - Only one of the below two while loops will run 

        while(i>0){
            answer += string1.charAt(i-1);
            i--;
        }
        while(j>0){
            answer += string2.charAt(j-1);
            j--;
        }

        return new StringBuilder(answer).reverse().toString();
    }

    
}
