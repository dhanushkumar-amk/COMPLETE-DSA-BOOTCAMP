package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.Arrays;

public class ShortestCommonSuperSequence {

//    public String shortestCommonSupersequence(String string1, String string2) {
//        int n = string1.length();
//        int m = string2.length();
//
//        int[][] dp =new int[n+1][m+1];
//        for (int i = 0; i <= n; i++) {
//            dp[i][0] = 0;
//        }
//        for (int i = 0; i <= m; i++) {
//            dp[0][i] = 0;
//        }
//
//        for (int index1 = 1; index1 <= n; index1++) {
//            for (int index2 = 1; index2 <= m; index2++) {
//                if (string1.charAt(index1 - 1) == string2.charAt(index2 - 1))
//                    dp[index1][index2] = 1 + dp[index1 - 1][index2 - 1];
//                else
//                    dp[index1][index2] = 0 + Math.max(dp[index1 - 1][index2], dp[index1][index2 - 1]);
//            }
//        }
//
//        // tabulation table 
//        int len = dp[n][m];
//        int i = n;
//        int j = m;
//
//        int index = len - 1;
//        String answer = "";
//
//        while (i > 0 && j > 0) {
//            if (string1.charAt(i - 1) == string2.charAt(j - 1)) {
//                answer += string1.charAt(i-1);
//                index--;
//                i--;
//                j--;
//            } else if (dp[i - 1][j] > dp[i][j - 1]) {
//                answer += string1.charAt(i-1);
//                i--;
//            } else {
//                answer += string2.charAt(j-1);
//                j--;
//            }
//        }
//
//        //Adding Remaing Characters - Only one of the below two while loops will run 
//
//        while(i>0){
//            answer += string1.charAt(i-1);
//            i--;
//        }
//        while(j>0){
//            answer += string2.charAt(j-1);
//            j--;
//        }
//
//        return new StringBuilder(answer).reverse().toString();
//    }

    public static void main(String args[]) {

        String s1 = "brute";
        String s2 = "groot";
        ShortestCommonSuperSequence answer = new ShortestCommonSuperSequence();

        System.out.println("The Longest Common Supersequence is "+answer.shortestCommonSupersequence(s1,s2));
    }
 
        public String shortestCommonSupersequence(String str1, String str2) {

            int dp[][] = longestCommonSubsequence(str1, str2);

            StringBuilder s = new StringBuilder();

            int n = str1.length();
            int m = str2.length();

            int i = 0;
            int j = 0;

            // Construct the shortest common supersequence
            while (i < n && j < m) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    // If characters match, take it and move diagonally
                    s.append(str1.charAt(i));
                    i++; j++;
                } else {
                    // Take the character from str1 or str2 based on LCS path
                    if (i < n - 1 && dp[i + 1][j] == dp[i][j]) {
                        s.append(str1.charAt(i));
                        i++;
                    } else {
                        s.append(str2.charAt(j));
                        j++;
                    }
                }
            }

            // Add remaining characters
            while (i < n) s.append(str1.charAt(i++));
            while (j < m) s.append(str2.charAt(j++));

            return s.toString();
        }

        // Function to compute LCS DP table
        public int[][] longestCommonSubsequence(String text1, String text2) {
           
            int n = text1.length();
            int m = text2.length();
           
            int[][] dp = new int[n][m];
            
            for (int i = 0; i < n; i++)
                Arrays.fill(dp[i], -1);
            
            solve(text1, text2, 0, 0, dp);
            
            return dp;
        }

        // Memoized LCS function
        public int solve(String text1, String text2, int index1, int index2, int dp[][]) {
            
            int n = text1.length();
            int m = text2.length();
            
            if (index1 == n || index2 == m)
                return 0;

            if (dp[index1][index2] != -1)
                return dp[index1][index2];

            if (text1.charAt(index1) == text2.charAt(index2)) {
                return dp[index1][index2] = 1 + solve(text1, text2, index1 + 1, index2 + 1, dp);
            } else {
                int opt1 = solve(text1, text2, index1, index2 + 1, dp);
                int opt2 = solve(text1, text2, index1 + 1, index2, dp);
                return dp[index1][index2] = Math.max(opt1, opt2);
            }
        }
    }
   
