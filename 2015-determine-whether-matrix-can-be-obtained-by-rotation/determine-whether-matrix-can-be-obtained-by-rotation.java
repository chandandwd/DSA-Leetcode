class Solution {
    void rotation(int[][] m){
        for(int i = 0; i<m.length; i++){
            for(int j = i; j<m.length; j++){
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t;
            }
        }
        for(int i =0; i<m.length; i++){
            int l = 0, r = m.length-1;
            while(l<r){
                int t = m[i][l];
                m[i][l] = m[i][r];
                m[i][r] = t;
                l++; r--;
            }
        }
        //return m;
    }

    boolean equal(int[][] m1, int[][] m2){
        for(int i = 0; i<m1.length; i++){
            for(int j  = 0; j<m1.length; j++){
               if(m1[i][j] != m2[i][j]) return false;
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] tar) {
        Solution m = new Solution();
        if(m.equal(mat,tar)) return true;
        for(int i = 1; i<=3; i++){
            m.rotation(mat);
            if(m.equal(mat, tar)) return true;
        }
        return false;
    }
}