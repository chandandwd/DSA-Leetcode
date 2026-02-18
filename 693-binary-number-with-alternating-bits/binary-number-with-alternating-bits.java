class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        int next = 0;
        while(n>0){
            next = n%2;
            n = n/2;
            if(next == prev)
                return false;
            prev = next;

        }
        return true;
        
    }
}