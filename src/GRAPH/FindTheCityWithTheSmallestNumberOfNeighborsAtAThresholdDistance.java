package GRAPH;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            int[][] distance = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = (int)(1e9);
            }
        }

        for (int i = 0; i < n; i++)
            distance[i][i] = 0;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distance[i][k] == (int)(1e9) || distance[k][j] == (int)(1e9))
                        continue;


                }
            }
        }
    }

}
