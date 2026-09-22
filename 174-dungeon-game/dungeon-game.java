class Solution {
    public int calculateMinimumHP(int[][] d) {

        int[][] dp = new int[d.length][d[0].length];
        for(int i = 0;i<d.length;i++){
            for(int j = 0; j<d[0].length; j++){
                dp[i][j] = -1;
            }
        }
        int res = solve(0,0,d,dp);
        return Integer.MAX_VALUE == res ? 1 : res;
        
    }
    int solve(int i, int j, int[][]grid, int[][] dp){
        if(i>=grid.length || j>=grid[0].length){
        return Integer.MAX_VALUE;
        }
        if(i== grid.length-1 && j == grid[0].length-1){
        return Math.max(1,1-grid[i][j]);
        }

        if(dp[i][j] != -1) return dp[i][j];
        int d = solve(i+1, j, grid,dp);
        int r = solve(i, j+1, grid,dp);
        int x = Math.min(d,r);
        x = x-grid[i][j];
        return dp[i][j] = Math.max(1,x);
    }
}