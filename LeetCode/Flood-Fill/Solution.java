class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int orgColor = image[sr][sc];
        if (orgColor != color) {
            dfs(image, sr, sc, orgColor, color);
        }
        return image;
    }

    private void dfs(int[][] image, int row, int col, int orgColor, int newColor) {

        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != orgColor) {
            return;
        }

        image[row][col] = newColor;

        dfs(image, row + 1, col, orgColor, newColor); 
        dfs(image, row - 1, col, orgColor, newColor); 
        dfs(image, row, col + 1, orgColor, newColor); 
        dfs(image, row, col - 1, orgColor, newColor); 
    }
}