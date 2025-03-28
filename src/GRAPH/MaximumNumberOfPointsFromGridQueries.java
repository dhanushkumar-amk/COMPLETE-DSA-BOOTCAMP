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

        int m = grid.length;
        int n = grid[0].length;

        // create the visited array
        boolean[][] visited  = new boolean[m][n];

        // added the first values of an grid to an minheap
        // [2, 0, 0]
        minHeap.add(new Triple(grid[0][0], new Pair(0,0)));

        visited[0][0] = true;

        int[] directions  = {-1, 0, 1, 0, -1};
        int count = 0;

        // travel the query and do bfs for every query
        for(int query : sortedQueries){
            while (!minHeap.isEmpty()){

                // take the top element in an minHeap (smallest element)
                Triple currentElement = minHeap.poll();

                // take the x and y of current element  heap = [ value, [x, y]] value = first [x, y] second
                int value = currentElement.first;
                int x = currentElement.second.first;
                int y = currentElement.second.second;

                // value is greater than query add it to heap back and break the loop
                if (value >= query){
                    minHeap.add(currentElement);
                    break;
                }
            
                // if the value is less then the query increase the count;
                count++;
            
                // travel the four directions 
                for (int i = 0; i < 4; i) {
                    
                }
                

            }
        }
    }

}
