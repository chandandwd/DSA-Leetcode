import java.util.*;
class Solution {
    public String mergeAlternately(String w1, String w2) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int m = 0, n = 0;
        while(m < w1.length() || n < w2.length()){
            if(m < w1.length()){ s.push(w1.charAt(m)); m++;}
            if(n < w2.length()){ s.push(w2.charAt(n)); n++;}
        }
        for(int i = 0; i<s.size(); i++){
            sb.append(s.get(i)+"");
        } 
            
    return sb.toString();
    }
}