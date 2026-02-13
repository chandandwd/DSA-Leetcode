class Solution {
    public void setZeroes(int[][] mat) {
        int [][] mat1 = new int[mat.length][mat[0].length];


        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                    mat1[i][j] = mat[i][j];
            }
        }


        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 0){
                    for(int k = 0; k<mat[0].length; k++)
                        mat1[i][k] = 0;
                    for(int l = 0; l<mat.length; l++)
                        mat1[l][j] = 0;
                }
            }

        }

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                    mat[i][j] = mat1[i][j];
            }
        
        }
    }
}