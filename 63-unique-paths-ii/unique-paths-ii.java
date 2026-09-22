class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(0, 0, grid, dp);
    }

    int solve(int i, int j, int[][] grid, int[][] dp) {
        if (i >= grid.length || j >= grid[0].length)
            return 0;
        if (grid[i][j] == 1)
            return 0;
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return 1;
        if (dp[i][j] != -1)
            return dp[i][j];

        dp[i][j] = solve(i + 1, j, grid, dp)
                  + solve(i, j + 1, grid, dp);

        return dp[i][j];
    }
}