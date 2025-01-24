class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        int n = graph.length;
        int[] state = new int[n];
        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (isSafeNode(i, graph, state)) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }

    private boolean isSafeNode(int node, int[][] graph, int[] state) {
        
        if (state[node] > 0) {
            return state[node] == 2;
        }

        state[node] = 1;

        for (int neighbor : graph[node]) {
            if (!isSafeNode(neighbor, graph, state)) {
                return false;
            }
        }

        state[node] = 2;
        return true;
    }
}
