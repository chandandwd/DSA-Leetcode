class Solution {
    public void rotate(int[][] mat) {
        int[][] op = new int[mat.length][mat.length];
        int m = 0;
        for(int i = mat.length-1; i>-1; i--){
            int k = 0;
            for(int j =0; j<mat.length; j++){
                op[k++][m] = mat[i][j];
            }
            m++;
        }
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat.length; j++){
                mat[i][j] = op[i][j];
            }
        }
    }
}