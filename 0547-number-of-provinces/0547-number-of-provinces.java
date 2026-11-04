import java.util.*;

class Solution {
    int provcnt;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        provcnt = 0;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provcnt++;
                solveit(i, adj, visited);
            }
        }

        return provcnt;
    }

    public void solveit(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                solveit(neighbor, adj, visited);
            }
        }
    }
}