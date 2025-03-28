package GRAPH;

// leetcode : 2503
// https://leetcode.com/problems/maximum-number-of-points-from-grid-queries/description/?envType=daily-question&envId=2025-03-28

public class MaximumNumberOfPointsFromGridQueries {

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

    }

    static class Triple {

        int first;
        Pair second;

        Triple(int first, Pair second) {
            this.first = first;
            this.second = second;
        }
    }

    public int[] maxPoints(int[][] grid, int[] queries) {



    }

}
