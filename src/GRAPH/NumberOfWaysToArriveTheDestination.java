package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class NumberOfWaysToArriveTheDestination {
    class Pair {
        int first;
        int second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static int countPath(int n, List<List<Integer>> roads){

        // create the graph
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(new ArrayList<>());

        int m = roads.size();
        for (int i = 0; i < m; i++) {
            list.get(roads.get(i).get(0)).add(new Pair(roads.get(i).get(1), roads.get(i).get(2)));
            list.get(roads.get(i).get(1)).add(new Pair(roads.get(i).get(0), roads.get(i).get(2)));
        }

    }
}
