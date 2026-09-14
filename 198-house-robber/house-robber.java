class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(0,nums,dp);
    }

    public int solve(int idx, int[]nums, int[]dp){
        if(idx>=nums.length) return 0;

        if(dp[idx] != -1) return dp[idx];

        int skip = solve(idx+1, nums, dp);
        int rob = solve(idx+2,nums, dp) + nums[idx];

        dp[idx] = Math.max(skip,rob);

        return dp[idx];
    }
}