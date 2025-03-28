package GRAPH;

// leetcode : 2503
// https://leetcode.com/problems/maximum-number-of-points-from-grid-queries/description/?envType=daily-question&envId=2025-03-28

import java.util.*;

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

        // step 1 create the treeset and add the queries it removes the duplicates and gives the sorted form
        Set<Integer> sortedQueries = new TreeSet<>();
        for(int query : queries)
            sortedQueries.add(query);

        Map<Integer, Integer> queryCount = new HashMap<>();

        // create the minheap that compares the values in an grid
        PriorityQueue<Triple> minHeap = new PriorityQueue<>((a, b) -> a.first - b.first);

        
    }

}
