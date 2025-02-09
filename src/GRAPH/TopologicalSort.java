package GRAPH;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    public static int[] topologicalSort(int v, ArrayList<ArrayList<Integer>> list){

        int[] visited = new int[v];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (visited[i] == 0){
                dfs(i, list, visited, stack);
            }
        }

        int[] answer = new int[v];
        int i= 0;

        while (!stack.isEmpty()){
            answer[i++] = stack.peek();
            stack.peek();

        }
        return answer;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> list, int[] visited, Stack<Integer> stack) {

        visited[node] = 1;

        for(int it : list.get(node)){
            if (visited[it] == 0){
                dfs(it, list, visited, stack);
            }
        }
        // before returning store the element  on the stack
        stack.push(node);
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int[] ans = TopologicalSort.topologicalSort(V, adj);
        for (int node : ans) {
            System.out.print(node + " ");
        }
        System.out.println("");
    }
}
