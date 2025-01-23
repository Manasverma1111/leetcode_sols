class Solution {
    public int countServers(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[] colCount = new int[n];
        int[] rowCount = new int[m];
        int totalServers = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    colCount[j]++;
                    rowCount[i]++;
                    totalServers++;
                }
            }
        }   

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && colCount[j] == 1 && rowCount[i] == 1) {
                    totalServers--;
                }
            }
        }

        return totalServers;
    }
}
