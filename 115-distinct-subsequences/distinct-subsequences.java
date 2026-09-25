import java.util.Arrays;
class Solution {
    private int[][] dp;
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(0, 0, s, t);
    }
    private int solve(int i, int j, String s, String t) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = solve(i + 1, j + 1, s, t) + solve(i + 1, j, s, t);
        } else {
            dp[i][j] = solve(i + 1, j, s, t);
        }
        return dp[i][j];
    }
}
