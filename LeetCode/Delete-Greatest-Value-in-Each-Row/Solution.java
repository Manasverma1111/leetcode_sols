class Solution {
    public int deleteGreatestValue(int[][] grid) {
        
         int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        for (int[] row : grid) {
            Arrays.sort(row);
            reverse(row);
        }
        for (int col = 0; col < n; col++) {
            int maxInColumn = 0;
            for (int row = 0; row < m; row++) {
                maxInColumn = Math.max(maxInColumn, grid[row][col]);
            }
            result += maxInColumn;
        }

        return result;
    }

    private void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }            
    }
}
