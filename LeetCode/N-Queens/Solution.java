import java.util.*;

class Solution {
    private boolean isSafePlace(int n, char[][] nQueens, int row, int col) {
        for (int i = 0; i < n; i++) {
            if (nQueens[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private void solveNQueens(int n, List<List<String>> res, char[][] nQueens, int row) {
        if (row == n) {
            List<String> sol = new ArrayList<>();
            for (char[] rowArray : nQueens) {
                sol.add(new String(rowArray));
            }
            res.add(sol);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafePlace(n, nQueens, row, col)) {
                nQueens[row][col] = 'Q';
                solveNQueens(n, res, nQueens, row + 1);
                nQueens[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>(); 
        char[][] nQueens = new char[n][n]; 

        for (int i = 0; i < n; i++) {
            Arrays.fill(nQueens[i], '.');
        }

        solveNQueens(n, res, nQueens, 0); 
        return res;
    }
}
