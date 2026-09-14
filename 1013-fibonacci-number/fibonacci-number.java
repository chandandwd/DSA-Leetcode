class Solution {
    public int fib(int n) {
        
        int[] dp = new int[n];
        //dp[0] = 0; dp[1] = 1;
        for(int i = 0; i<n; i++) dp[i] = -1;
        int ans = solve(n, dp);
        return ans;
    }
    public int solve(int n, int[] dp){
        if(n<2) return n;
        if(dp[n-1] != -1) return dp[n-1];
        int a = solve(n-2,dp);
        int b = solve(n-1, dp);
        dp[n-1] = a+b;

        return dp[n-1];  
    }
}