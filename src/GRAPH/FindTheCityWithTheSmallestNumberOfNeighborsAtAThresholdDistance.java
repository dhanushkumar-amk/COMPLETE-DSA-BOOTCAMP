package GRAPH;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            int[][] distance = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = (int)(1e9);
            }
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int weight = edges[i][2];

            distance[u][v] = weight;
            distance[v][u] = weight;
        }

        for (int i = 0; i < n; i++)
            distance[i][i] = 0;

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distance[i][k] == (int)(1e9) || distance[k][j] == (int)(1e9))
                        continue;

                    distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                }
            }
        }

        int countCity = n;
        int cityNo = -1;

        for (int city = 0; city < n; city++) {
            int count = 0;
            for (int adjCity = 0; adjCity < n; adjCity++) {
                if (distance[city][adjCity] <= distanceThreshold)
                    count++;
            }

            if (count <= countCity){
                countCity = count;
                cityNo = city;
            }
        }
        return cityNo;
    }

    public static void main(String[] args) {
        int n = 4;
   
        int[][] edges =  {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int distanceThreshold = 4;

        FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance obj = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
        int cityNo = obj.findTheCity(n, edges, distanceThreshold);
        System.out.println("The answer is node: " + cityNo);
    }
}
