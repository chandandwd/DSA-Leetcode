class Solution {
    public int climbStairs(int n) {
        int a1 = 0; int a2 = 1;
        while(n>0){
            int temp = a1 + a2;
            a1 = a2;
            a2 = temp;
            n--;
        }
        return a2;
    }
}