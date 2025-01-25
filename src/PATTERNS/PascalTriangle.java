package PATTERNS;

import java.util.*;

// https://leetcode.com/problems/pascals-triangle/description/
// leetcode 118

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRowList = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    currentRowList.add(1);
                }
                else {
                    List<Integer> previousRow = result.get(i - 1);
                    currentRowList.add(previousRow.get(j) + previousRow.get(j - 1));
                }
            }
            result.add(currentRowList);
        }
        return result;
    }
}
