class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] b = new char[n][n];

        for (char[] r : b) Arrays.fill(r, '.');

        solve(0, b, ans);
        return ans;
    }

    void solve(int r, char[][] b, List<List<String>> ans) {
        if (r == b.length) {
            List<String> x = new ArrayList<>();
            for (char[] row : b) x.add(new String(row));
            ans.add(x);
            return;
        }

        for (int c = 0; c < b.length; c++) {
            if (safe(r, c, b)) {
                b[r][c] = 'Q';
                solve(r + 1, b, ans);
                b[r][c] = '.';
            }
        }
    }

    boolean safe(int r, int c, char[][] b) {
        for (int i = 0; i < r; i++)
            if (b[i][c] == 'Q') return false;

        for (int i=r-1,j=c-1; i>=0&&j>=0; i--,j--)
            if (b[i][j] == 'Q') return false;

        for (int i=r-1,j=c+1; i>=0&&j<b.length; i--,j++)
            if (b[i][j] == 'Q') return false;

        return true;
    }
}