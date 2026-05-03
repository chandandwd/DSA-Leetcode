class Solution {
    public boolean rotateString(String s1, String goal) {
        int i = 0;
     while(i != s1.length()){
        s1 = s1.substring(1)+s1.charAt(0);
        if(s1.equals(goal)) return true;
        i++;
     }
     return false;
    }
}