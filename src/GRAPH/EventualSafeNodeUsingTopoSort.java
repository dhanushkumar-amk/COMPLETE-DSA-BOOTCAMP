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
           for(int it : list.get(i)){
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

           for(int it : list.get(node)){
               indegree[it]--;

               if (indegree[it] == 0)
                   queue.add(it);
           }
       }
       //sort the collection node
       Collections.sort(safeNodes);
       return safeNodes;
   }
}
