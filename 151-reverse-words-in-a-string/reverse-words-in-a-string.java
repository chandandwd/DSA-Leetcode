import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] list = s.split("\\s+"); 
        
        StringBuilder sb = new StringBuilder();
        for(int i=list.length-1; i>= 0; i--){
            sb.append(list[i] + " ");
        }
        String r = sb.toString();
        r = r.trim();
        return r;
    }
}