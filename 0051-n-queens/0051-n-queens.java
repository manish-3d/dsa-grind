class Solution {
    public boolean isitsafe(boolean[][] used, int row, int col, int n) {
        // Same column
        int drow = 0;

        while (drow < row) {
            if (used[drow][col]) {
                return false;
            }
            drow++;
        }

        // Upper-left diagonal
        drow = row - 1;
        int dcol = col - 1;

        while (drow >= 0 && dcol >= 0) {
            if (used[drow][dcol]) {
                return false;
            }

            drow--;
            dcol--;
        }

        // Upper-right diagonal
        drow = row - 1;
        dcol = col + 1;

        while (drow >= 0 && dcol < n) {
            if (used[drow][dcol]) {
                return false;
            }

            drow--;
            dcol++;
        }

        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] used = new boolean[n][n];

        List<List<String>> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(".");
            }

            board.add(row);
        }

        solve(board, used, n, 0, ans);

        return ans;
    }

    public void solve(
        List<List<String>> board,
        boolean[][] used,
        int n,
        int row,
        List<List<String>> ans
    ) {
        // All queens placed
        if (row == n) {
            List<String> current = new ArrayList<>();

            for (List<String> r : board) {
                StringBuilder sb = new StringBuilder();

                for (String cell : r) {
                    sb.append(cell);
                }

                current.add(sb.toString());
            }

            ans.add(current);
            return;
        }

        // Try every column in current row
        for (int col = 0; col < n; col++) {
            if (isitsafe(used, row, col, n)) {
                // PICK
                used[row][col] = true;
                board.get(row).set(col, "Q");

                // RECURSE
                solve(board, used, n, row + 1, ans);

                // UNDO
                used[row][col] = false;
                board.get(row).set(col, ".");
            }
        }
    }
}