package GRAPH;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    public int[] topologicalSort(int v, ArrayList<ArrayList<Integer>> list){

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
            answer[i] = stack.peek();
            stack.peek();
            i++;
        }
        return answer;
    }

    private void dfs(int node, ArrayList<ArrayList<Integer>> list, int[] visited, Stack<Integer> stack) {

        visited[node] = 1;

        for(int it : list.get(node)){
            if (visited[it] == 0){
                dfs(it, list, visited, stack);
            }
        }
        // before returning store the element  on the stack
        stack.push(node);
    }
}
