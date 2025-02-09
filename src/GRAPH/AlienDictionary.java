package GRAPH;

import java.util.*;

public class AlienDictionary {


    private List<Integer> topoSort(int V, List<List<Integer>> adj) {
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            topo.add(node);
            // node is in your topo sort
            // so please remove it from the indegree

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) q.add(it);
            }
        }

        return topo;
    }

    public String findDictionary(String[] dictionary, int n, int k){

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            String string1 = dictionary[i];
            String string2 = dictionary[i + 1];

            int length = Math.min(string1.length(), string2.length());

            for (int pointer = 0; pointer < length; pointer++) {
                if (string1.charAt(pointer) != string2.charAt(pointer)){
                    list.get(string1.charAt(pointer) - 'a').add(string2.charAt(pointer) - 'a');
                    break;
                }
            }
        }

        List<Integer> topo = topoSort(k, list);
        String answer  = "";

        for(int it : topo){
            answer = answer + (char)(it + (int)('a'));
        }
        return answer;
    }

    public static void main(String[] args) {
        int N = 5, K = 4;
        String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
        AlienDictionary obj = new AlienDictionary();
        String ans = obj.findDictionary(dict, N, K);

        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i) + " ");
        }
        System.out.println("");
    }
}
