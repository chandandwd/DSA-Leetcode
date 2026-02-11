import java.util.*;
class Solution {
    public void reverseString(char[] s) {
        int k = s.length-1;
        char[] op = new char[s.length];
        
        for(char x :s){
            op[k--] = x;
        }
        for (int i = 0; i < s.length; i++) 
            s[i] = op[i];
        

    }
}