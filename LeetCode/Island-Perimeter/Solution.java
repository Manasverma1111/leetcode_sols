1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        
4        int rows = grid.length;
5        int cols = grid[0].length;
6        int perim = 0;
7
8        for (int i = 0; i < rows; i++){
9            for (int j = 0; j < cols; j++){
10                
11                if (grid[i][j] == 1){
12                    perim += 4;
13
14                    if (i > 0 && grid[i - 1][j] == 1){
15                        perim--;
16                    }
17                    if (i < rows - 1 && grid[i + 1][j] == 1){
18                        perim--;
19                    }
20                    if (j > 0 && grid[i][j - 1] == 1){
21                        perim--;
22                    }
23                    if (j < cols - 1 && grid[i][j + 1] == 1){
24                        perim--;
25                    }
26                }
27            }
28        }
29
30        return perim;
31    }
32}