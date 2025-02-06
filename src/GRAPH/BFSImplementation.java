package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSImplementation {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        for (int i = 0; i < 5 ; i++) {
            list.add(new ArrayList<>());
        }

        list.get(0).add(1);
        list.get(1).add(0);
        list.get(0).add(4);
        list.get(4).add(0);
        list.get(1).add(2);
        list.get(2).add(1);
        list.get(1).add(3);
        list.get(3).add(1);


        ArrayList<Integer> answer = bfsOfGraph(5, list);
        int n = answer.size();

        for (int i = 0; i <n; i++) {
            System.out.print(answer.get(i) + " ");
        }

    }

    public static ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> list){

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[v];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()){
            Integer node = queue.poll();
            bfs.add(node);

            for (Integer i : list.get(node)){
                if (!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return bfs;
    }
}
