package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestPathInDAG {

    class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }


    public int[] shortestPath(int N, int M, int[][] edges){


        // create the graph
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();

        for (int i = 0; i < N ; i++) {
            ArrayList<Pair> temp = new ArrayList<>();
            list.add(temp);
        }

        // every adjlist contains three things currentNode, adjNode and weight
        for (int i = 0; i < M; i++) {
            int currentNode = edges[i][0];
            int adjNode = edges[i][1];
            int weight = edges[i][2];

            // 1 => [3, 1]; // added as a pair in an list
            list.get(currentNode).add(new Pair(adjNode, weight));
        }

        int[] visited = new int[N];
        Stack<Integer> stack = new Stack<>();

        // connected components
        for (int i = 0; i < N; i++) {
            if (visited[i] == 0)
                topoSort(i, list, visited, stack);
        }


        // distance thing
        int[] distance = new int[N];

        // initially a infinity
        Arrays.fill(distance, (int) 1e9);

        // distance[src] = 0 // here we assume src = 0
        distance[0] = 0;


        while (!stack.isEmpty()){
            int node = stack.peek();
            stack.pop();

            // adj list
            for (int i = 0; i < list.get(node).size(); i++) {
                int currentNode = list.get(node).get(i).first;
                int weight =list.get(node).get(i).second;

                if (distance[node] + weight < distance[currentNode])
                    distance[node] = weight + distance[currentNode];

            }
        }
        return distance;
    }

    // using dfs
    private void topoSort(int node, ArrayList<ArrayList<Pair>> list, int[] visited, Stack<Integer> stack) {
        visited[node] = 1;

        for (int i = 0; i < list.size(); i++) {
            // int i = 0; 4 => [[0, 3], [2, 1]] go 0 and 2 so we use node = 4 i = 0 means get [0, 3] then first of [0, 3] is 0 check if zero is visited or not
            int adjNode = list.get(node).get(i).first;

            if (visited[adjNode] == 0)
                topoSort(adjNode, list, visited, stack);
        }

        // on time returning add the element in the stack
        stack.add(node);
    }

}
