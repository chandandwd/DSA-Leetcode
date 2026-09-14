class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n];
        for(int i = 0; i<n; i++) dp[i] = -1;
        return solve(n, dp);
    }
    public int solve(int n, int[] dp){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(dp[n-1] != -1) return dp[n-1];
        int a = solve(n-1, dp);
        int b = solve(n-2, dp);
        int c = solve(n-3, dp);
        dp[n-1] = a+b+c;
        return dp[n-1];
    }
}