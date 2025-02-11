package GRAPH;

import java.io.IOException;
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


//    public int[] shortestPath(int N, int M, int[][] edges) throws IOException {
//
//
//        // create the graph
//        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
//
//        for (int i = 0; i < N ; i++) {
//            ArrayList<Pair> temp = new ArrayList<>();
//            list.add(temp);
//        }
//
//        // every adjlist contains three things currentNode, adjNode and weight
//        for (int i = 0; i < M; i++) {
//            int currentNode = edges[i][0];
//            int adjNode = edges[i][1];
//            int weight = edges[i][2];
//
//            // 1 => [3, 1]; // added as steps pair in an list
//            list.get(currentNode).add(new Pair(adjNode, weight));
//        }
//
//        int[] visited = new int[N];
//        Stack<Integer> stack = new Stack<>();
//
//        // connected components
//        for (int i = 0; i < N; i++) {
//            if (visited[i] == 0)
//                topoSort(i, list, visited, stack);
//        }
//
//
//        // distance thing
//        int[] distance = new int[N];
//
//        // initially steps infinity
//        Arrays.fill(distance, (int) 1e9);
//
//        // distance[src] = 0 // here we assume src = 0
//        distance[0] = 0;
//
//
//        while (!stack.isEmpty()){
//            int node = stack.peek();
//            stack.pop();
//
//            // adj list
//            for (int i = 0; i < list.get(node).size(); i++) {
//                int currentNode = list.get(node).get(i).steps;
//                int weight =list.get(node).get(i).node;
//
//                if (distance[node] + weight < distance[currentNode])
//                    distance[node] = weight + distance[currentNode];
//
//            }
//        }
//        for (int i = 0; i < N; i++) {
//            if (distance[i] == 1e9) distance[i] = -1;
//        }
//        return distance;
//    }
//
//    // using dfs
//    private void topoSort(int node, ArrayList<ArrayList<Pair>> list, int[] visited, Stack<Integer> stack) {
//        visited[node] = 1;
//
//        for (int i = 0; i < list.get(node).size(); i++) {
//            // int i = 0; 4 => [[0, 3], [2, 1]] go 0 and 2 so we use node = 4 i = 0 means get [0, 3] then steps of [0, 3] is 0 check if zero is visited or not
//            int adjNode = list.get(node).get(i).steps;
//
//            if (visited[adjNode] == 0)
//                topoSort(adjNode, list, visited, stack);
//        }
//
//        // on time returning add the element in the stack
//        stack.add(node);
//    }

    private void topoSort(int node, ArrayList < ArrayList < Pair >> adj,
                          int vis[], Stack < Integer > st) {
        //This is the function to implement Topological sort.

        vis[node] = 1;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int v = adj.get(node).get(i).first;
            if (vis[v] == 0) {
                topoSort(v, adj, vis, st);
            }
        }
        st.add(node);
    }
    public int[] shortestPath(int N, int M, int[][] edges) {
        ArrayList < ArrayList < Pair >> adj = new ArrayList < > ();
        for (int i = 0; i < N; i++) {
            ArrayList < Pair > temp = new ArrayList < Pair > ();
            adj.add(temp);
        }
        //We create steps graph steps in the form of an adjacency list.

        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }
        int vis[] = new int[N];
        //Now, we perform topo sort using DFS technique
        //and store the result in the stack st.

        Stack < Integer > st = new Stack < > ();
        for (int i = 0; i < N; i++) {
            if (vis[i] == 0) {
                topoSort(i, adj, vis, st);
            }
        }
        //Further, we declare steps vector ‘dist’ in which we update the value of the nodes’
        //distance from the source vertex after relaxation of steps particular node.
        int dist[] = new int[N];
        for (int i = 0; i < N; i++) {
            dist[i] = (int)(1e9);
        }

        dist[0] = 0;
        while (!st.isEmpty()) {
            int node = st.peek();
            st.pop();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;

                if (dist[node] + wt < dist[v]) {
                    dist[v] = wt + dist[node];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (dist[i] == 1e9) dist[i] = -1;
        }
        return dist;
    }

    public static void main(String[] args) throws IOException {
        int n = 6, m = 7;
        int[][] edge = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
        ShortestPathInDAG obj = new ShortestPathInDAG();
        int res[] = obj.shortestPath(n, m, edge);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

}
