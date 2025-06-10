class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        dfs(0, rooms, visited);

        for (boolean vst : visited) {
            if (!vst) {
                return false;
            }
        }

        return true;
    }

    private void dfs(int currRoom, List<List<Integer>> rooms, boolean[] visited) {

        visited[currRoom] = true;

        for (int key : rooms.get(currRoom)) {
            if (!visited[key]) {
                dfs(key, rooms, visited);
            }
        }

    }

}