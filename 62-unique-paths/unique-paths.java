class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        return solve(0, 0, m, n, dp);
    }

    int solve(int i, int j, int m, int n, int[][] dp) {

        // Destination reached
        if (i == m - 1 && j == n - 1)
            return 1;

        // Out of grid
        if (i >= m || j >= n)
            return 0;

        // Already calculated
        if (dp[i][j] != 0)
            return dp[i][j];

        // Down + Right
        dp[i][j] = solve(i + 1, j, m, n, dp)
                 + solve(i, j + 1, m, n, dp);

        return dp[i][j];
    }
}