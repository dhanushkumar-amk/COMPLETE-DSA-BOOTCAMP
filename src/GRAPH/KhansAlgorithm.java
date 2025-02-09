package GRAPH;

import java.util.*;

public class KhansAlgorithm {

    public static int[] khansAlgoForTopologicalSortInBFS(int v, ArrayList<ArrayList<Integer>> list) {

        int[] inDegree = new int[v];

        // calculate inDegree of each element
        for (int i = 0; i < v; i++) {
            for (int it : list.get(i))
                inDegree[it]++;
        }

        // add elements into queue which kas indegree 0 intially
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (inDegree[i] == 0)
                queue.add(i);
        }

        int[] answer = new int[0];
        int i = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            answer[i] = node;
            i++;

            // if node was taken then reduce the indegree value
            for (int it : list.get(i)) {
                inDegree[it]--;
                if (inDegree[it] == 0)
                    queue.add(it);
            }
        }
        return answer;
    }

    
}
