package GRAPH;

import java.util.*;

public class EventualSafeNodeUsingTopoSort {

   public  List<Integer> eventualSafeNode(int V, List<List<Integer>> list){

       List<List<Integer>> reverseList = new ArrayList<>();

       for (int i = 0; i < V; i++) {
           reverseList.add(new ArrayList<>());
       }

       int[] indegree = new int[V];

       for (int i = 0; i < V; i++) {
           for(int it : reverseList.get(i)){
               indegree[it]++;
           }
       }

       Queue<Integer> queue = new LinkedList<>();
       List<Integer> safeNodes = new ArrayList<>();

       for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                queue.add(i);
       }

       while (!queue.isEmpty()){
           int node = queue.poll();
           safeNodes.add(node);

           for(int it : reverseList.get(node)){
               indegree[it]--;

               if (indegree[it] == 0)
                   queue.add(it);
           }
       }
       //sort the collection second
       Collections.sort(safeNodes);
       return safeNodes;
   }


    public static void main(String[] args) {
        int V = 12;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(6).add(7);
        adj.get(8).add(1);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        adj.get(11).add(9);

        EventualSafeNodeUsingTopoSort obj = new EventualSafeNodeUsingTopoSort();
        List<Integer> safeNodes = obj.eventualSafeNode(V, adj);

        for (int node : safeNodes) {
            System.out.print(node + " ");
        }
        System.out.println("");
    }
}
